<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 13:01:05 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KR0060\KR0060010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KR0060.*" %>
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
<jsp:useBean id="aKR0060010Control" class="com.nec.jp.orteus.metamorBase.KR0060.KR0060010Control" scope="request"/>
<jsp:useBean id="aKR0060010Struct" class="com.nec.jp.orteus.metamorBase.KR0060.KR0060010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

売上実績承認
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0060/jsp/KR0060010.jsp,v $
$Author: geng-jia $	
$Revision: 1.10 $　$Date: 2017/02/22 02:07:20 $
********************************************************* --%>
<html>
<head>
<title>売上実績承認</title>
<%@include file="common/expj_v5.jsp" %>
<% 
ScreenMoveUtil su = new ScreenMoveUtil("KR2050010Servlet",so); 
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
<script class="expj-script-KR0060010_init">
  // KR0060010名前空間
  expj.KR0060010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
	<% 
		  boolean IsExpJf;
		  if("1".equals(aKR0060010Struct.geth_INSTALL_FLG())) {
		  	IsExpJf = true;
		  }else{
		  	IsExpJf = false;
		  }
		  boolean IsExpJ = !IsExpJf;
	%>
  <div id="expj-business-screen-KR0060010" data-screen="KR0060010" data-newdata="<%=aKR0060010Control.isNewData() %>">
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
              <script class="expj-script-KR0060010-KR0060010form1">
expj.KR0060010.KR0060010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.KR0060010.KR0060010form1.onLoad0 = function () {
  console.log('KR0060010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHK;?KR0060010form1/*[eq]NORMAL@*1,*2"
expj.KR0060010.KR0060010form1.onDecision0 = function () {
  console.log('KR0060010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010form1', '?KR0060010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="onDecision;1;CHK;?KR0060010form1/*[eq]NORMAL@*3"
expj.KR0060010.KR0060010form1.onDecision1 = function () {
  console.log('KR0060010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010form1', '?KR0060010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="onDecision;2;CHK;?KR0060010form1/*[eq]ERROR@*11"
expj.KR0060010.KR0060010form1.onDecision2 = function () {
  console.log('KR0060010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010form1', '?KR0060010form1/*'), '[eq]', 'ERROR')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script5="child;0;UNMASK;_KR0060010button2/CheckAll,_KR0060010button2/CheckClear@*4"
expj.KR0060010.KR0060010form1.child0 = function () {
  console.log('KR0060010form1 script5');
expj.common.pscript.setUnMaskToReferenceComponent('KR0060010', 'KR0060010form1', '_KR0060010button2/CheckAll');
expj.common.pscript.setUnMaskToReferenceComponent('KR0060010', 'KR0060010form1', '_KR0060010button2/CheckClear');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script6="child;1;CHK;_KR0060010form1/h_APPR_POWER_TYP[eq]1@*0,*2"
expj.KR0060010.KR0060010form1.child1 = function () {
  console.log('KR0060010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010form1', '_KR0060010form1/h_APPR_POWER_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script7="child;2;MASK;_KR0060010button2/UpdateAssort,_KR0060010button2/CheckAll,_KR0060010button2/CheckClear"
expj.KR0060010.KR0060010form1.child2 = function () {
  console.log('KR0060010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('KR0060010', 'KR0060010form1', '_KR0060010button2/UpdateAssort');
expj.common.pscript.setMaskToReferenceComponent('KR0060010', 'KR0060010form1', '_KR0060010button2/CheckAll');
expj.common.pscript.setMaskToReferenceComponent('KR0060010', 'KR0060010form1', '_KR0060010button2/CheckClear');
};
// script8="child;3;CHK;?KR0060010form1/CUST_CD[neq]SAME[or]?KR0060010form1/SALES_DATE_FROM[neq]SAME[or]?KR0060010form1/SALES_DATE_TO[neq]SAME[or]?KR0060010form1/r_APPR_1[neq]SAME[or]?KR0060010form1/r_APPR_2[neq]SAME[or]?KR0060010form1/r_APPR_3[neq]SAME[or]?KR0060010form1/r_APPR_4[neq]SAME@*2"
expj.KR0060010.KR0060010form1.child3 = function () {
  console.log('KR0060010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010form1', '?KR0060010form1/CUST_CD'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010form1', '?KR0060010form1/SALES_DATE_FROM'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010form1', '?KR0060010form1/SALES_DATE_TO'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010form1', '?KR0060010form1/r_APPR_1'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010form1', '?KR0060010form1/r_APPR_2'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010form1', '?KR0060010form1/r_APPR_3'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010form1', '?KR0060010form1/r_APPR_4'), '[neq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script11="child;4;CHK;?KR0060010form1/CUST_CD[eq]SAME[and]?KR0060010form1/SALES_DATE_FROM[eq]SAME[and]?KR0060010form1/SALES_DATE_TO[eq]SAME[and]?KR0060010form1/r_APPR_1[eq]SAME[and]?KR0060010form1/r_APPR_2[eq]SAME[and]?KR0060010form1/r_APPR_3[eq]SAME[and]?KR0060010form1/r_APPR_4[eq]SAME@*5"
expj.KR0060010.KR0060010form1.child4 = function () {
  console.log('KR0060010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010form1', '?KR0060010form1/CUST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010form1', '?KR0060010form1/SALES_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010form1', '?KR0060010form1/SALES_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010form1', '?KR0060010form1/r_APPR_1'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010form1', '?KR0060010form1/r_APPR_2'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010form1', '?KR0060010form1/r_APPR_3'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010form1', '?KR0060010form1/r_APPR_4'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script12="child;5;CHK;?KR0060010view1/?[eq]NOT_SELECTED@*6,*7"
expj.KR0060010.KR0060010form1.child5 = function () {
  console.log('KR0060010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010form1', '?KR0060010view1/?'), '[eq]', 'NOT_SELECTED')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script13="child;6;MASK;_KR0060010button2/UpdateAssort"
expj.KR0060010.KR0060010form1.child6 = function () {
  console.log('KR0060010form1 script13');
expj.common.pscript.setMaskToReferenceComponent('KR0060010', 'KR0060010form1', '_KR0060010button2/UpdateAssort');
};
// script14="child;7;UNMASK;_KR0060010button2/UpdateAssort"
expj.KR0060010.KR0060010form1.child7 = function () {
  console.log('KR0060010form1 script14');
expj.common.pscript.setUnMaskToReferenceComponent('KR0060010', 'KR0060010form1', '_KR0060010button2/UpdateAssort');
};
// script15="onDecision;3;CHK;_KR0060010form1/r_APPR_2[eq]true@*8,*9"
expj.KR0060010.KR0060010form1.onDecision3 = function () {
  console.log('KR0060010form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010form1', '_KR0060010form1/r_APPR_2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script16="child;8;UNMASK;_KR0060010form2/RESERVE_CAUSE"
expj.KR0060010.KR0060010form1.child8 = function () {
  console.log('KR0060010form1 script16');
expj.common.pscript.setUnMaskToReferenceComponent('KR0060010', 'KR0060010form1', '_KR0060010form2/RESERVE_CAUSE');
};
// script17="child;9;MASK;_KR0060010form2/RESERVE_CAUSE@*10"
expj.KR0060010.KR0060010form1.child9 = function () {
  console.log('KR0060010form1 script17');
expj.common.pscript.setMaskToReferenceComponent('KR0060010', 'KR0060010form1', '_KR0060010form2/RESERVE_CAUSE');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child10)){this.child10();}}
};
// script18="child;10;SET;_KR0060010form2/RESERVE_CAUSE="
expj.KR0060010.KR0060010form1.child10 = function () {
  console.log('KR0060010form1 script18');
expj.common.pscript.setReferenceComponentValue('KR0060010', 'KR0060010form1', '_KR0060010form2/RESERVE_CAUSE', '');
};
// script19="child;11;MASK;_KR0060010button1/Select,_KR0060010button2/UpdateAssort,_KR0060010button2/CheckAll,_KR0060010button2/CheckClear,_KR0060010button0/Clear"
expj.KR0060010.KR0060010form1.child11 = function () {
  console.log('KR0060010form1 script19');
expj.common.pscript.setMaskToReferenceComponent('KR0060010', 'KR0060010form1', '_KR0060010button1/Select');
expj.common.pscript.setMaskToReferenceComponent('KR0060010', 'KR0060010form1', '_KR0060010button2/UpdateAssort');
expj.common.pscript.setMaskToReferenceComponent('KR0060010', 'KR0060010form1', '_KR0060010button2/CheckAll');
expj.common.pscript.setMaskToReferenceComponent('KR0060010', 'KR0060010form1', '_KR0060010button2/CheckClear');
expj.common.pscript.setMaskToReferenceComponent('KR0060010', 'KR0060010form1', '_KR0060010button0/Clear');
};
expj.KR0060010.KR0060010form1.executeAllOnDecision = function () {
  console.log('execute KR0060010form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0060010.KR0060010form1['onDecision' + i])) {
        expj.KR0060010.KR0060010form1['onDecision' + i]();
      }
    }
  }
};
expj.KR0060010.KR0060010form1.executeOnLoad = function () {
  expj.KR0060010.KR0060010form1.executePScriptOnLoad();
};

expj.KR0060010.KR0060010form1.executePScriptOnLoad = function () {
  console.log('execute KR0060010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KR0060010.KR0060010form1['onLoad' + i])) {
      expj.KR0060010.KR0060010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KR0060010-KR0060010form1" action="KR0060010Servlet" name="KR0060010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKR0060010Control.getReadStatusString()) %>" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KR0060010-KR0060010form1-r_APPR_1">
expj.KR0060010.KR0060010form1.r_APPR_1 = {};
expj.KR0060010.KR0060010form1.r_APPR_1.executeAllOnDecision = function () {
  console.log('execute KR0060010form1/r_APPR_1.onDecision');
  expj.KR0060010.KR0060010form1.executeAllOnDecision();
  expj.KR0060010.executeAllOnDecision();
};
expj.KR0060010.KR0060010form1.r_APPR_1.executeOnLoad = function () {
  $('#expj-KR0060010-KR0060010form1-r_APPR_1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0060010', 'KR0060010form1', 'r_APPR_1', this, 'RadioButton');
    }
  });
  expj.KR0060010.KR0060010form1.r_APPR_1.executePScriptOnLoad();
};

expj.KR0060010.KR0060010form1.r_APPR_1.executePScriptOnLoad = function () {
  console.log('execute KR0060010form1/r_APPR_1.onLoad');
  var targetComponent = document.getElementById('expj-KR0060010-KR0060010form1-r_APPR_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="r_APPR" data-name="r_APPR_1" value="true" <%= ("true".equals(TypeConverter.convert(aKR0060010Struct.getr_APPR_1())) || "".equals(TypeConverter.convert(aKR0060010Struct.getr_APPR_1())))?"checked=\"checked\"": "" %> class="" id="expj-KR0060010-KR0060010form1-r_APPR_1" ><label for="expj-KR0060010-KR0060010form1-r_APPR_1"><%=CoreTools.getRBString("Expj.Cmt0664",rb)%></label></div><!--/td-->
<script class="expj-script-KR0060010-KR0060010form1-r_APPR_2">
expj.KR0060010.KR0060010form1.r_APPR_2 = {};
expj.KR0060010.KR0060010form1.r_APPR_2.executeAllOnDecision = function () {
  console.log('execute KR0060010form1/r_APPR_2.onDecision');
  expj.KR0060010.KR0060010form1.executeAllOnDecision();
  expj.KR0060010.executeAllOnDecision();
};
expj.KR0060010.KR0060010form1.r_APPR_2.executeOnLoad = function () {
  $('#expj-KR0060010-KR0060010form1-r_APPR_2').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0060010', 'KR0060010form1', 'r_APPR_2', this, 'RadioButton');
    }
  });
  expj.KR0060010.KR0060010form1.r_APPR_2.executePScriptOnLoad();
};

expj.KR0060010.KR0060010form1.r_APPR_2.executePScriptOnLoad = function () {
  console.log('execute KR0060010form1/r_APPR_2.onLoad');
  var targetComponent = document.getElementById('expj-KR0060010-KR0060010form1-r_APPR_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="radio" name="r_APPR" data-name="r_APPR_2" value="true" <%= ("true".equals(TypeConverter.convert(aKR0060010Struct.getr_APPR_2())))?"checked=\"checked\"":"" %> class="" id="expj-KR0060010-KR0060010form1-r_APPR_2" ><label for="expj-KR0060010-KR0060010form1-r_APPR_2"><%=CoreTools.getRBString("Expj.Cmt3169",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KR0060010-KR0060010form1-r_APPR_3">
expj.KR0060010.KR0060010form1.r_APPR_3 = {};
expj.KR0060010.KR0060010form1.r_APPR_3.executeAllOnDecision = function () {
  console.log('execute KR0060010form1/r_APPR_3.onDecision');
  expj.KR0060010.KR0060010form1.executeAllOnDecision();
  expj.KR0060010.executeAllOnDecision();
};
expj.KR0060010.KR0060010form1.r_APPR_3.executeOnLoad = function () {
  $('#expj-KR0060010-KR0060010form1-r_APPR_3').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0060010', 'KR0060010form1', 'r_APPR_3', this, 'RadioButton');
    }
  });
  expj.KR0060010.KR0060010form1.r_APPR_3.executePScriptOnLoad();
};

expj.KR0060010.KR0060010form1.r_APPR_3.executePScriptOnLoad = function () {
  console.log('execute KR0060010form1/r_APPR_3.onLoad');
  var targetComponent = document.getElementById('expj-KR0060010-KR0060010form1-r_APPR_3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="r_APPR" data-name="r_APPR_3" value="true" <%= ("true".equals(TypeConverter.convert(aKR0060010Struct.getr_APPR_3())))?"checked=\"checked\"":"" %> class="" id="expj-KR0060010-KR0060010form1-r_APPR_3" ><label for="expj-KR0060010-KR0060010form1-r_APPR_3"><%=CoreTools.getRBString("Expj.Cmt5093",rb)%></label></div><!--/td-->
<script class="expj-script-KR0060010-KR0060010form1-r_APPR_4">
expj.KR0060010.KR0060010form1.r_APPR_4 = {};
expj.KR0060010.KR0060010form1.r_APPR_4.executeAllOnDecision = function () {
  console.log('execute KR0060010form1/r_APPR_4.onDecision');
  expj.KR0060010.KR0060010form1.executeAllOnDecision();
  expj.KR0060010.executeAllOnDecision();
};
expj.KR0060010.KR0060010form1.r_APPR_4.executeOnLoad = function () {
  $('#expj-KR0060010-KR0060010form1-r_APPR_4').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0060010', 'KR0060010form1', 'r_APPR_4', this, 'RadioButton');
    }
  });
  expj.KR0060010.KR0060010form1.r_APPR_4.executePScriptOnLoad();
};

expj.KR0060010.KR0060010form1.r_APPR_4.executePScriptOnLoad = function () {
  console.log('execute KR0060010form1/r_APPR_4.onLoad');
  var targetComponent = document.getElementById('expj-KR0060010-KR0060010form1-r_APPR_4');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="radio" name="r_APPR" data-name="r_APPR_4" value="true" <%= ("true".equals(TypeConverter.convert(aKR0060010Struct.getr_APPR_4())))?"checked=\"checked\"":"" %> class="" id="expj-KR0060010-KR0060010form1-r_APPR_4" ><label for="expj-KR0060010-KR0060010form1-r_APPR_4"><%=CoreTools.getRBString("Expj.Cmt5094",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KR0060010-KR0060010form1-CUST_CD">
expj.KR0060010.KR0060010form1.CUST_CD = {};
expj.KR0060010.KR0060010form1.CUST_CD.executeAllOnDecision = function () {
  console.log('execute KR0060010form1/CUST_CD.onDecision');
  expj.KR0060010.KR0060010form1.executeAllOnDecision();
  expj.KR0060010.executeAllOnDecision();
};
expj.KR0060010.KR0060010form1.CUST_CD.executeOnLoad = function () {
  $('#expj-KR0060010-KR0060010form1-CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0060010', 'KR0060010form1', 'CUST_CD', this);
  });
  expj.KR0060010.KR0060010form1.CUST_CD.executePScriptOnLoad();
};

expj.KR0060010.KR0060010form1.CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KR0060010form1/CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0060010-KR0060010form1-CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0060010-KR0060010form1-CUST_CD" name="CUST_CD" class="KR0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0060010Struct.getCUST_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KR0060010-KR0060010form1-PeekerVendCd">
expj.KR0060010.KR0060010form1.PeekerVendCd = {};
// script1="onClick;0;PEEKER;_KR0060010form1/CUST_CD@<%=contextNo%>"
expj.KR0060010.KR0060010form1.PeekerVendCd.onClick0 = function () {
  console.log('PeekerVendCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KR0060010';
var parameterValues = 'PeekerVendCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010form1', '_KR0060010form1/CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUST_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KR0060010form1/CUST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KR0060010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KR0060010.KR0060010form1.PeekerVendCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0060010.KR0060010form1.PeekerVendCd['onClick' + i])) {
        expj.KR0060010.KR0060010form1.PeekerVendCd['onClick' + i]();
      }
    }
  }
};
expj.KR0060010.KR0060010form1.PeekerVendCd.executeAllOnDecision = function () {
};
expj.KR0060010.KR0060010form1.PeekerVendCd.executeOnLoad = function () {
  $('#expj-KR0060010-KR0060010form1-PeekerVendCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0060010', 'KR0060010form1', 'PeekerVendCd', this, 'Button');
    }
  });
  expj.KR0060010.KR0060010form1.PeekerVendCd.executePScriptOnLoad();
};

expj.KR0060010.KR0060010form1.PeekerVendCd.executePScriptOnLoad = function () {
  console.log('execute KR0060010form1/PeekerVendCd.onLoad');
  var targetComponent = document.getElementById('expj-KR0060010-KR0060010form1-PeekerVendCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KR0060010-KR0060010form1-PeekerVendCd" class="KR0060010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KR0060010-KR0060010form1-CUST_NAME">
expj.KR0060010.KR0060010form1.CUST_NAME = {};
expj.KR0060010.KR0060010form1.CUST_NAME.executeAllOnDecision = function () {
  console.log('execute KR0060010form1/CUST_NAME.onDecision');
  expj.KR0060010.KR0060010form1.executeAllOnDecision();
  expj.KR0060010.executeAllOnDecision();
};
expj.KR0060010.KR0060010form1.CUST_NAME.executeOnLoad = function () {
  $('#expj-KR0060010-KR0060010form1-CUST_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0060010', 'KR0060010form1', 'CUST_NAME', this);
  });
  expj.KR0060010.KR0060010form1.CUST_NAME.executePScriptOnLoad();
};

expj.KR0060010.KR0060010form1.CUST_NAME.executePScriptOnLoad = function () {
  console.log('execute KR0060010form1/CUST_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KR0060010-KR0060010form1-CUST_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:410px;text-align:left;"><input type="text" id="expj-KR0060010-KR0060010form1-CUST_NAME" name="CUST_NAME" class="KR0060010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0060010Struct.getCUST_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KR0060010-KR0060010form1-h_APPR_POWER_TYP" name="h_APPR_POWER_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0060010Struct.geth_APPR_POWER_TYP()) %>">
<script class="expj-script-KR0060010-KR0060010form1-h_APPR_POWER_TYP">
expj.KR0060010.KR0060010form1.h_APPR_POWER_TYP = {};
expj.KR0060010.KR0060010form1.h_APPR_POWER_TYP.executeAllOnDecision = function () {
  console.log('execute KR0060010form1/h_APPR_POWER_TYP.onDecision');
  expj.KR0060010.KR0060010form1.executeAllOnDecision();
  expj.KR0060010.executeAllOnDecision();
};
expj.KR0060010.KR0060010form1.h_APPR_POWER_TYP.executeOnLoad = function () {
  $('#expj-KR0060010-KR0060010form1-h_APPR_POWER_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0060010', 'KR0060010form1', 'h_APPR_POWER_TYP', this);
  });
  expj.KR0060010.KR0060010form1.h_APPR_POWER_TYP.executePScriptOnLoad();
};

expj.KR0060010.KR0060010form1.h_APPR_POWER_TYP.executePScriptOnLoad = function () {
  console.log('execute KR0060010form1/h_APPR_POWER_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KR0060010-KR0060010form1-h_APPR_POWER_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-KR0060010-KR0060010form1-h_INSTALL_FLG" name="h_INSTALL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0060010Struct.geth_INSTALL_FLG()) %>">
<script class="expj-script-KR0060010-KR0060010form1-h_INSTALL_FLG">
expj.KR0060010.KR0060010form1.h_INSTALL_FLG = {};
expj.KR0060010.KR0060010form1.h_INSTALL_FLG.executeAllOnDecision = function () {
  console.log('execute KR0060010form1/h_INSTALL_FLG.onDecision');
  expj.KR0060010.KR0060010form1.executeAllOnDecision();
  expj.KR0060010.executeAllOnDecision();
};
expj.KR0060010.KR0060010form1.h_INSTALL_FLG.executeOnLoad = function () {
  $('#expj-KR0060010-KR0060010form1-h_INSTALL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0060010', 'KR0060010form1', 'h_INSTALL_FLG', this);
  });
  expj.KR0060010.KR0060010form1.h_INSTALL_FLG.executePScriptOnLoad();
};

expj.KR0060010.KR0060010form1.h_INSTALL_FLG.executePScriptOnLoad = function () {
  console.log('execute KR0060010form1/h_INSTALL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KR0060010-KR0060010form1-h_INSTALL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SALES_DATE",rb)%></span><!-- 売上計上日 --></div><!--/td-->
<script class="expj-script-KR0060010-KR0060010form1-SALES_DATE_FROM">
expj.KR0060010.KR0060010form1.SALES_DATE_FROM = {};
expj.KR0060010.KR0060010form1.SALES_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute KR0060010form1/SALES_DATE_FROM.onDecision');
  expj.KR0060010.KR0060010form1.executeAllOnDecision();
  expj.KR0060010.executeAllOnDecision();
};
expj.KR0060010.KR0060010form1.SALES_DATE_FROM.executeOnLoad = function () {
  $('#expj-KR0060010-KR0060010form1-SALES_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0060010', 'KR0060010form1', 'SALES_DATE_FROM', this);
  });
  expj.KR0060010.KR0060010form1.SALES_DATE_FROM.executePScriptOnLoad();
};

expj.KR0060010.KR0060010form1.SALES_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute KR0060010form1/SALES_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-KR0060010-KR0060010form1-SALES_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0060010-KR0060010form1-SALES_DATE_FROM" name="SALES_DATE_FROM" class="KR0060010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKR0060010Struct.getSALES_DATE_FROM()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KR0060010-KR0060010form1-CalendarInspcDateFrom">
expj.KR0060010.KR0060010form1.CalendarInspcDateFrom = {};
// script1="onClick;0;CALENDAR;_KR0060010form1/SALES_DATE_FROM"
expj.KR0060010.KR0060010form1.CalendarInspcDateFrom.onClick0 = function () {
  console.log('CalendarInspcDateFrom script1');
expj.common.pscript.executeCalendar('KR0060010','KR0060010form1','_KR0060010form1/SALES_DATE_FROM');
};
expj.KR0060010.KR0060010form1.CalendarInspcDateFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0060010.KR0060010form1.CalendarInspcDateFrom['onClick' + i])) {
        expj.KR0060010.KR0060010form1.CalendarInspcDateFrom['onClick' + i]();
      }
    }
  }
};
expj.KR0060010.KR0060010form1.CalendarInspcDateFrom.executeAllOnDecision = function () {
};
expj.KR0060010.KR0060010form1.CalendarInspcDateFrom.executeOnLoad = function () {
  $('#expj-KR0060010-KR0060010form1-CalendarInspcDateFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0060010', 'KR0060010form1', 'CalendarInspcDateFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KR0060010','KR0060010form1','_KR0060010form1/SALES_DATE_FROM');
  expj.KR0060010.KR0060010form1.CalendarInspcDateFrom.executePScriptOnLoad();
};

expj.KR0060010.KR0060010form1.CalendarInspcDateFrom.executePScriptOnLoad = function () {
  console.log('execute KR0060010form1/CalendarInspcDateFrom.onLoad');
  var targetComponent = document.getElementById('expj-KR0060010-KR0060010form1-CalendarInspcDateFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KR0060010-KR0060010form1-CalendarInspcDateFrom" class="KR0060010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KR0060010-KR0060010form1-SALES_DATE_TO">
expj.KR0060010.KR0060010form1.SALES_DATE_TO = {};
expj.KR0060010.KR0060010form1.SALES_DATE_TO.executeAllOnDecision = function () {
  console.log('execute KR0060010form1/SALES_DATE_TO.onDecision');
  expj.KR0060010.KR0060010form1.executeAllOnDecision();
  expj.KR0060010.executeAllOnDecision();
};
expj.KR0060010.KR0060010form1.SALES_DATE_TO.executeOnLoad = function () {
  $('#expj-KR0060010-KR0060010form1-SALES_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0060010', 'KR0060010form1', 'SALES_DATE_TO', this);
  });
  expj.KR0060010.KR0060010form1.SALES_DATE_TO.executePScriptOnLoad();
};

expj.KR0060010.KR0060010form1.SALES_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute KR0060010form1/SALES_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-KR0060010-KR0060010form1-SALES_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0060010-KR0060010form1-SALES_DATE_TO" name="SALES_DATE_TO" class="KR0060010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKR0060010Struct.getSALES_DATE_TO()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KR0060010-KR0060010form1-CalendarInspcDateTo">
expj.KR0060010.KR0060010form1.CalendarInspcDateTo = {};
// script1="onClick;0;CALENDAR;_KR0060010form1/SALES_DATE_TO"
expj.KR0060010.KR0060010form1.CalendarInspcDateTo.onClick0 = function () {
  console.log('CalendarInspcDateTo script1');
expj.common.pscript.executeCalendar('KR0060010','KR0060010form1','_KR0060010form1/SALES_DATE_TO');
};
expj.KR0060010.KR0060010form1.CalendarInspcDateTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0060010.KR0060010form1.CalendarInspcDateTo['onClick' + i])) {
        expj.KR0060010.KR0060010form1.CalendarInspcDateTo['onClick' + i]();
      }
    }
  }
};
expj.KR0060010.KR0060010form1.CalendarInspcDateTo.executeAllOnDecision = function () {
};
expj.KR0060010.KR0060010form1.CalendarInspcDateTo.executeOnLoad = function () {
  $('#expj-KR0060010-KR0060010form1-CalendarInspcDateTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0060010', 'KR0060010form1', 'CalendarInspcDateTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KR0060010','KR0060010form1','_KR0060010form1/SALES_DATE_TO');
  expj.KR0060010.KR0060010form1.CalendarInspcDateTo.executePScriptOnLoad();
};

expj.KR0060010.KR0060010form1.CalendarInspcDateTo.executePScriptOnLoad = function () {
  console.log('execute KR0060010form1/CalendarInspcDateTo.onLoad');
  var targetComponent = document.getElementById('expj-KR0060010-KR0060010form1-CalendarInspcDateTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KR0060010-KR0060010form1-CalendarInspcDateTo" class="KR0060010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KR0060010-KR0060010button1">
expj.KR0060010.KR0060010button1 = {};
expj.KR0060010.KR0060010button1.executeAllOnDecision = function () {
  console.log('execute KR0060010button1.onDecision');
};
expj.KR0060010.KR0060010button1.executeOnLoad = function () {
  expj.KR0060010.KR0060010button1.executePScriptOnLoad();
};

expj.KR0060010.KR0060010button1.executePScriptOnLoad = function () {
  console.log('execute KR0060010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KR0060010-KR0060010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KR0060010-KR0060010button1-Select">
expj.KR0060010.KR0060010button1.Select = {};
// script1="onClick;0;CHK;_KR0060010form1/SALES_DATE_FROM[neq][and]_KR0060010form1/SALES_DATE_TO[neq][and]_KR0060010form1/SALES_DATE_FROM[gt]_KR0060010form1/SALES_DATE_TO@!KR10019"
expj.KR0060010.KR0060010button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010button1', '_KR0060010form1/SALES_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010button1', '_KR0060010form1/SALES_DATE_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010button1', '_KR0060010form1/SALES_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010button1', '_KR0060010form1/SALES_DATE_TO')))) {
expj.common.pscript.viewErrorMessage('KR0060010', 'KR0060010button1', 'KR10019');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KR0060010form1/*@KR0060010Servlet,,"
expj.KR0060010.KR0060010button1.Select.onClick1 = function () {
  console.log('Select script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KR0060010', 'KR0060010button1', '_KR0060010form1/*', 'KR0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KR0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KR0060010', response);
expj.common.updateBusinessScreenTab('KR0060010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KR0060010.KR0060010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0060010.KR0060010button1.Select['onClick' + i])) {
        expj.KR0060010.KR0060010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.KR0060010.KR0060010button1.Select.executeAllOnDecision = function () {
};
expj.KR0060010.KR0060010button1.Select.executeOnLoad = function () {
  $('#expj-KR0060010-KR0060010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0060010', 'KR0060010button1', 'Select', this, 'Button');
    }
  });
  expj.KR0060010.KR0060010button1.Select.executePScriptOnLoad();
};

expj.KR0060010.KR0060010button1.Select.executePScriptOnLoad = function () {
  console.log('execute KR0060010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-KR0060010-KR0060010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0060010-KR0060010button1-Select" name="Select" class="KR0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style=""><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KR0060010-KR0060010form2">
expj.KR0060010.KR0060010form2 = {};
expj.KR0060010.KR0060010form2.executeAllOnDecision = function () {
  console.log('execute KR0060010form2.onDecision');
};
expj.KR0060010.KR0060010form2.executeOnLoad = function () {
  expj.KR0060010.KR0060010form2.executePScriptOnLoad();
};

expj.KR0060010.KR0060010form2.executePScriptOnLoad = function () {
  console.log('execute KR0060010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KR0060010-KR0060010form2" action="KR0060010Servlet" name="KR0060010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3163",rb)%></span><!-- 保留理由 --></div><!--/td-->
<script class="expj-script-KR0060010-KR0060010form2-RESERVE_CAUSE">
expj.KR0060010.KR0060010form2.RESERVE_CAUSE = {};
expj.KR0060010.KR0060010form2.RESERVE_CAUSE.executeAllOnDecision = function () {
  console.log('execute KR0060010form2/RESERVE_CAUSE.onDecision');
  expj.KR0060010.KR0060010form2.executeAllOnDecision();
  expj.KR0060010.executeAllOnDecision();
};
expj.KR0060010.KR0060010form2.RESERVE_CAUSE.executeOnLoad = function () {
  $('#expj-KR0060010-KR0060010form2-RESERVE_CAUSE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0060010', 'KR0060010form2', 'RESERVE_CAUSE', this);
  });
  expj.KR0060010.KR0060010form2.RESERVE_CAUSE.executePScriptOnLoad();
};

expj.KR0060010.KR0060010form2.RESERVE_CAUSE.executePScriptOnLoad = function () {
  console.log('execute KR0060010form2/RESERVE_CAUSE.onLoad');
  var targetComponent = document.getElementById('expj-KR0060010-KR0060010form2-RESERVE_CAUSE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KR0060010-KR0060010form2-RESERVE_CAUSE" name="RESERVE_CAUSE" class="KR0060010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0060010Struct.getRESERVE_CAUSE()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame01" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame02" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame03 button-area-left" style="width:60px;"></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KR0060010-KR0060010view1">
expj.KR0060010.KR0060010view1 = {};
// script1="onLoad;0;CALL;onClick@0"
expj.KR0060010.KR0060010view1.onLoad0 = function () {
  console.log('KR0060010view1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;?KR0060010form1/*[eq]NORMAL[and]_KR0060010form1/h_APPR_POWER_TYP[eq]1@*0"
expj.KR0060010.KR0060010view1.onClick0 = function () {
  console.log('KR0060010view1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010view1', '?KR0060010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010view1', '_KR0060010form1/h_APPR_POWER_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="child;0;CHK;?KR0060010form1/CUST_CD[eq]SAME[and]?KR0060010form1/SALES_DATE_FROM[eq]SAME[and]?KR0060010form1/SALES_DATE_TO[eq]SAME[and]?KR0060010form1/r_APPR_1[eq]SAME[and]?KR0060010form1/r_APPR_2[eq]SAME[and]?KR0060010form1/r_APPR_3[eq]SAME[and]?KR0060010form1/r_APPR_4[eq]SAME@*1"
expj.KR0060010.KR0060010view1.child0 = function () {
  console.log('KR0060010view1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010view1', '?KR0060010form1/CUST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010view1', '?KR0060010form1/SALES_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010view1', '?KR0060010form1/SALES_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010view1', '?KR0060010form1/r_APPR_1'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010view1', '?KR0060010form1/r_APPR_2'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010view1', '?KR0060010form1/r_APPR_3'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010view1', '?KR0060010form1/r_APPR_4'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="child;1;CHK;?KR0060010view1/?[eq]NOT_SELECTED@*2,*3"
expj.KR0060010.KR0060010view1.child1 = function () {
  console.log('KR0060010view1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010view1', '?KR0060010view1/?'), '[eq]', 'NOT_SELECTED')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="child;2;MASK;_KR0060010button2/UpdateAssort"
expj.KR0060010.KR0060010view1.child2 = function () {
  console.log('KR0060010view1 script5');
expj.common.pscript.setMaskToReferenceComponent('KR0060010', 'KR0060010view1', '_KR0060010button2/UpdateAssort');
};
// script6="child;3;UNMASK;_KR0060010button2/UpdateAssort"
expj.KR0060010.KR0060010view1.child3 = function () {
  console.log('KR0060010view1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('KR0060010', 'KR0060010view1', '_KR0060010button2/UpdateAssort');
};
// script7="onClick;1;CHK;?KR0060010view1/?[eq]SINGLE@*4,*6"
expj.KR0060010.KR0060010view1.onClick1 = function () {
  console.log('KR0060010view1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010view1', '?KR0060010view1/?'), '[eq]', 'SINGLE')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script8="child;4;CHK;_KR0060010view1/l_APPR_HISTORY_FLG[eq]1@*5,*5"
expj.KR0060010.KR0060010view1.child4 = function () {
  console.log('KR0060010view1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0060010', 'KR0060010view1', '_KR0060010view1/l_APPR_HISTORY_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script9="child;5;UNMASK;_KR0060010button2/Appr_Hty_Rep"
expj.KR0060010.KR0060010view1.child5 = function () {
  console.log('KR0060010view1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('KR0060010', 'KR0060010view1', '_KR0060010button2/Appr_Hty_Rep');
};
// script10="child;6;MASK;_KR0060010button2/Appr_Hty_Rep"
expj.KR0060010.KR0060010view1.child6 = function () {
  console.log('KR0060010view1 script10');
expj.common.pscript.setMaskToReferenceComponent('KR0060010', 'KR0060010view1', '_KR0060010button2/Appr_Hty_Rep');
};
// script11="onLoad;1;CALL;child@7"
expj.KR0060010.KR0060010view1.onLoad1 = function () {
  console.log('KR0060010view1 script11');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child7)){this.child7();}
};
// script12="child;7;MASK;_KR0060010button2/Appr_Hty_Rep"
expj.KR0060010.KR0060010view1.child7 = function () {
  console.log('KR0060010view1 script12');
expj.common.pscript.setMaskToReferenceComponent('KR0060010', 'KR0060010view1', '_KR0060010button2/Appr_Hty_Rep');
};
expj.KR0060010.KR0060010view1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0060010.KR0060010view1['onClick' + i])) {
        expj.KR0060010.KR0060010view1['onClick' + i]();
      }
    }
  }
};
expj.KR0060010.KR0060010view1.executeAllOnDecision = function () {
  console.log('execute KR0060010view1.onDecision');
};
expj.KR0060010.KR0060010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("KR0060010view1", "expj.KR0060010.KR0060010view1.executeAllOnClick");
%>
  expj.KR0060010.KR0060010view1.executePScriptOnLoad();
};

expj.KR0060010.KR0060010view1.executePScriptOnLoad = function () {
  console.log('execute KR0060010view1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.KR0060010.KR0060010view1['onLoad' + i])) {
      expj.KR0060010.KR0060010view1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-KR0060010-KR0060010view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%= TypeConverter.sanitizer(aKR0060010Control.getReadStatusString()) %>"></div>
<!-- VIEW END -->
<%
 String KR0060010view1_Id = "KR0060010view1";
 String KR0060010view1_select = "single";
 String KR0060010view1_sortable = "true";
 String KR0060010view1_resize = "true";
 String KR0060010view1_scroll = "true";
 StringBuffer KR0060010view1_HB = new StringBuffer();
 StringBuffer KR0060010view1_DB = new StringBuffer();
%>
<%
 KR0060010view1_select = "multi";
 KR0060010view1_sortable = "true";
 KR0060010view1_resize = "true";
 KR0060010view1_scroll = "true";
%>
<%
 KR0060010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
%>
     
<%
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.APPR_HISTORY",rb))).append("', 'name':'l_APPR_HISTORY', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3164",rb))).append("', 'name':'l_APPR_ID', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.APPR_DATE",rb))).append("', 'name':'l_APPR_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3163",rb))).append("', 'name':'l_RESERVE_CAUSE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SHIP_ODR_NO",rb))).append("', 'name':'l_SHIP_ODR_NO', 'class':'expj-tooltip expj-view-cell-label").append("true".equals(TypeConverter.convert(IsExpJf)) ? " expj-view-cell-hidden " : " ").append("'").append(",'hidden':'").append(TypeConverter.convert(IsExpJf)).append("', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SLIP_CD",rb))).append("', 'name':'l_SLIP_CD', 'class':'expj-tooltip expj-view-cell-label").append("true".equals(TypeConverter.convert(IsExpJf)) ? " expj-view-cell-hidden " : " ").append("'").append(",'hidden':'").append(TypeConverter.convert(IsExpJf)).append("', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_SALES_SEQ_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SALES_H_NO",rb))).append("', 'name':'l_SALES_H_NO', 'class':'expj-tooltip expj-view-cell-label").append("true".equals(TypeConverter.convert(IsExpJ)) ? " expj-view-cell-hidden " : " ").append("'").append(",'hidden':'").append(TypeConverter.convert(IsExpJ)).append("', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SHIP_DLV_H_NO_1",rb))).append("', 'name':'l_SHIP_DLV_H_NO', 'class':'expj-tooltip expj-view-cell-label").append("true".equals(TypeConverter.convert(IsExpJ)) ? " expj-view-cell-hidden " : " ").append("'").append(",'hidden':'").append(TypeConverter.convert(IsExpJ)).append("', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SHIP_DLV_D_NO_1",rb))).append("', 'name':'l_SHIP_DLV_D_NO', 'class':'expj-tooltip expj-view-cell-label").append("true".equals(TypeConverter.convert(IsExpJ)) ? " expj-view-cell-hidden " : " ").append("'").append(",'hidden':'").append(TypeConverter.convert(IsExpJ)).append("', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ORG_SHIP_DLV_H_NO",rb))).append("', 'name':'l_ORGNAL_SHIP_DLV_H_NO', 'class':'expj-tooltip expj-view-cell-label").append("true".equals(TypeConverter.convert(IsExpJ)) ? " expj-view-cell-hidden " : " ").append("'").append(",'hidden':'").append(TypeConverter.convert(IsExpJ)).append("', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ORG_SHIP_DLV_D_NO",rb))).append("', 'name':'l_ORGNAL_SHIP_DLV_D_NO', 'class':'expj-tooltip expj-view-cell-label").append("true".equals(TypeConverter.convert(IsExpJ)) ? " expj-view-cell-hidden " : " ").append("'").append(",'hidden':'").append(TypeConverter.convert(IsExpJ)).append("', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SALES_TYP",rb))).append("', 'name':'l_SALES_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_CD",rb))).append("', 'name':'l_CUST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_NAME",rb))).append("', 'name':'l_CUST_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SALES_DEPT_CD",rb))).append("', 'name':'l_SALES_DEPT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ORG_NAME",rb))).append("', 'name':'l_ORG_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ODR_NO",rb))).append("', 'name':'l_CUST_ODR_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SALES_DATE",rb))).append("', 'name':'l_SALES_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_CHRG_PSN_CD",rb))).append("', 'name':'l_CUST_CHRG_PSN_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt5097",rb))).append("', 'name':'l_CUST_CHRG_PSN_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_ACPT_PSN_CD",rb))).append("', 'name':'l_ODR_ACPT_PSN_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt5098",rb))).append("', 'name':'l_ODR_ACPT_PSN_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SALES_QTY",rb))).append("', 'name':'l_SALES_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SALES_UNIT",rb))).append("', 'name':'l_UNIT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_SALES_QTY",rb))).append("', 'name':'l_CUST_SALES_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right").append("true".equals(TypeConverter.convert(IsExpJ)) ? " expj-view-cell-hidden " : " ").append("'").append(",'hidden':'").append(TypeConverter.convert(IsExpJ)).append("', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_UNIT_CD",rb))).append("', 'name':'l_CUST_UNIT_CD', 'class':'expj-tooltip expj-view-cell-label").append("true".equals(TypeConverter.convert(IsExpJ)) ? " expj-view-cell-hidden " : " ").append("'").append(",'hidden':'").append(TypeConverter.convert(IsExpJ)).append("', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SALES_UNIT_PRICE",rb))).append("', 'name':'l_UNIT_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SALES_AMOUNT_1",rb))).append("', 'name':'l_SALES_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SALES_AMOUNT_EXCH_RATES",rb))).append("', 'name':'l_SALES_AMOUNT_EXCH_RATES', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.INSPC_ACPT_DATE_1",rb))).append("', 'name':'l_INSPC_ACPT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.INSPC_ACPT_QTY_1",rb))).append("', 'name':'l_INSPC_ACPT_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_INSPC_ACPT_QTY",rb))).append("', 'name':'l_CUST_INSPC_ACPT_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right").append("true".equals(TypeConverter.convert(IsExpJ)) ? " expj-view-cell-hidden " : " ").append("'").append(",'hidden':'").append(TypeConverter.convert(IsExpJ)).append("', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EXTERNAL_TAX_SALES_AMOUNT",rb))).append("', 'name':'l_EXTERNAL_TAX_SALES_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.INTERNAL_TAX_SALES_AMOUNT",rb))).append("', 'name':'l_INTERNAL_TAX_SALES_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TAXFREE_SALES_AMOUNT",rb))).append("', 'name':'l_TAXFREE_SALES_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TAX_CREDIT_SALES_AMOUNT",rb))).append("', 'name':'l_TAX_CREDIT_SALES_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EXTERNAL_TAX_AMOUNT",rb))).append("', 'name':'l_EXTERNAL_TAX_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.INTERNAL_TAX_AMOUNT",rb))).append("', 'name':'l_INTERNAL_TAX_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt1074",rb))).append("', 'name':'l_TAX_AMOUNT_1', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt1075",rb))).append("', 'name':'l_TAX_AMOUNT_2', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt1076",rb))).append("', 'name':'l_TAX_AMOUNT_3', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OWN_CUR_TAXCREDIT_SALES_AMOUNT",rb))).append("', 'name':'l_OWN_CUR_TAXCREDIT_SALES_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ORGN_SLIP_CD",rb))).append("', 'name':'l_ORGN_SLIP_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUR_CD",rb))).append("', 'name':'l_CUR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SPCL_PRICE_CO",rb))).append("', 'name':'l_PCL_PRICE_CO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.REMARKS",rb))).append("', 'name':'l_REMARKS', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.INSPC_ACPT_TYP",rb))).append("', 'name':'l_INSPC_ACPT_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TRANS_TYP",rb))).append("', 'name':'l_TRANS_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_ROWNO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_AI_AR_IF_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
KR0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_APPR_HISTORY_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KR0060010view1_sortable).append("}").append(",");
%>
<%
 int aKR0060010StructLength = aKR0060010Control.getListsize();
 final KR0060010Struct structBackup = aKR0060010Struct;
 aKR0060010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aKR0060010StructLength; ++loopCount) {
  if((aKR0060010Struct = (KR0060010Struct) aKR0060010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aKR0060010Struct", aKR0060010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 KR0060010view1_DB.append("[");
 KR0060010view1_DB.append(loopCount);
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_APPR_HISTORY-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_APPR_HISTORY\" data-name=\"l_APPR_HISTORY\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_APPR_HISTORY())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_APPR_ID-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_APPR_ID\" data-name=\"l_APPR_ID\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_APPR_ID())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_APPR_DATE-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_APPR_DATE\" data-name=\"l_APPR_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_APPR_DATE())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_RESERVE_CAUSE-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_RESERVE_CAUSE\" data-name=\"l_RESERVE_CAUSE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_RESERVE_CAUSE())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_SHIP_ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_SHIP_ODR_NO\" data-name=\"l_SHIP_ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_SHIP_ODR_NO())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_SLIP_CD-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_SLIP_CD\" data-name=\"l_SLIP_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_SLIP_CD())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_SALES_SEQ_NO-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_SALES_SEQ_NO\" data-name=\"l_SALES_SEQ_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_SALES_SEQ_NO())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_SALES_H_NO-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_SALES_H_NO\" data-name=\"l_SALES_H_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_SALES_H_NO())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_SHIP_DLV_H_NO-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_SHIP_DLV_H_NO\" data-name=\"l_SHIP_DLV_H_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_SHIP_DLV_H_NO())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_SHIP_DLV_D_NO-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_SHIP_DLV_D_NO\" data-name=\"l_SHIP_DLV_D_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_SHIP_DLV_D_NO())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_ORGNAL_SHIP_DLV_H_NO-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_ORGNAL_SHIP_DLV_H_NO\" data-name=\"l_ORGNAL_SHIP_DLV_H_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_ORGNAL_SHIP_DLV_H_NO())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_ORGNAL_SHIP_DLV_D_NO-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_ORGNAL_SHIP_DLV_D_NO\" data-name=\"l_ORGNAL_SHIP_DLV_D_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_ORGNAL_SHIP_DLV_D_NO())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_SALES_TYP-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_SALES_TYP\" data-name=\"l_SALES_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_SALES_TYP())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_CUST_CD-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_CUST_CD\" data-name=\"l_CUST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_CUST_CD())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_CUST_NAME-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_CUST_NAME\" data-name=\"l_CUST_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_CUST_NAME())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_SALES_DEPT_CD-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_SALES_DEPT_CD\" data-name=\"l_SALES_DEPT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_SALES_DEPT_CD())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_ORG_NAME-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_ORG_NAME\" data-name=\"l_ORG_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_ORG_NAME())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_ITEM_CD())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_ITEM_NAME())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_CUST_ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_CUST_ODR_NO\" data-name=\"l_CUST_ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_CUST_ODR_NO())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_SALES_DATE-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_SALES_DATE\" data-name=\"l_SALES_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_SALES_DATE())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_CUST_CHRG_PSN_CD-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_CUST_CHRG_PSN_CD\" data-name=\"l_CUST_CHRG_PSN_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_CUST_CHRG_PSN_CD())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_CUST_CHRG_PSN_NAME-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_CUST_CHRG_PSN_NAME\" data-name=\"l_CUST_CHRG_PSN_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_CUST_CHRG_PSN_NAME())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_ODR_ACPT_PSN_CD-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_ODR_ACPT_PSN_CD\" data-name=\"l_ODR_ACPT_PSN_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_ODR_ACPT_PSN_CD())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_ODR_ACPT_PSN_NAME-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_ODR_ACPT_PSN_NAME\" data-name=\"l_ODR_ACPT_PSN_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_ODR_ACPT_PSN_NAME())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_SALES_QTY-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_SALES_QTY\" data-name=\"l_SALES_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_SALES_QTY())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_UNIT_CD-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_UNIT_CD\" data-name=\"l_UNIT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_UNIT_CD())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_CUST_SALES_QTY-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_CUST_SALES_QTY\" data-name=\"l_CUST_SALES_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_CUST_SALES_QTY())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_CUST_UNIT_CD-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_CUST_UNIT_CD\" data-name=\"l_CUST_UNIT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_CUST_UNIT_CD())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_UNIT_COST-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_UNIT_COST\" data-name=\"l_UNIT_COST\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_UNIT_COST())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_SALES_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_SALES_AMOUNT\" data-name=\"l_SALES_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_SALES_AMOUNT())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_SALES_AMOUNT_EXCH_RATES-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_SALES_AMOUNT_EXCH_RATES\" data-name=\"l_SALES_AMOUNT_EXCH_RATES\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_SALES_AMOUNT_EXCH_RATES())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_INSPC_ACPT_DATE-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_INSPC_ACPT_DATE\" data-name=\"l_INSPC_ACPT_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_INSPC_ACPT_DATE())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_INSPC_ACPT_QTY-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_INSPC_ACPT_QTY\" data-name=\"l_INSPC_ACPT_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_INSPC_ACPT_QTY())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_CUST_INSPC_ACPT_QTY-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_CUST_INSPC_ACPT_QTY\" data-name=\"l_CUST_INSPC_ACPT_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_CUST_INSPC_ACPT_QTY())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_EXTERNAL_TAX_SALES_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_EXTERNAL_TAX_SALES_AMOUNT\" data-name=\"l_EXTERNAL_TAX_SALES_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_EXTERNAL_TAX_SALES_AMOUNT())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_INTERNAL_TAX_SALES_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_INTERNAL_TAX_SALES_AMOUNT\" data-name=\"l_INTERNAL_TAX_SALES_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_INTERNAL_TAX_SALES_AMOUNT())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_TAXFREE_SALES_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_TAXFREE_SALES_AMOUNT\" data-name=\"l_TAXFREE_SALES_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_TAXFREE_SALES_AMOUNT())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_TAX_CREDIT_SALES_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_TAX_CREDIT_SALES_AMOUNT\" data-name=\"l_TAX_CREDIT_SALES_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_TAX_CREDIT_SALES_AMOUNT())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_EXTERNAL_TAX_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_EXTERNAL_TAX_AMOUNT\" data-name=\"l_EXTERNAL_TAX_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_EXTERNAL_TAX_AMOUNT())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_INTERNAL_TAX_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_INTERNAL_TAX_AMOUNT\" data-name=\"l_INTERNAL_TAX_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_INTERNAL_TAX_AMOUNT())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_TAX_AMOUNT_1-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_TAX_AMOUNT_1\" data-name=\"l_TAX_AMOUNT_1\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_TAX_AMOUNT_1())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_TAX_AMOUNT_2-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_TAX_AMOUNT_2\" data-name=\"l_TAX_AMOUNT_2\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_TAX_AMOUNT_2())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_TAX_AMOUNT_3-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_TAX_AMOUNT_3\" data-name=\"l_TAX_AMOUNT_3\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_TAX_AMOUNT_3())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_OWN_CUR_TAXCREDIT_SALES_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_OWN_CUR_TAXCREDIT_SALES_AMOUNT\" data-name=\"l_OWN_CUR_TAXCREDIT_SALES_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_OWN_CUR_TAXCREDIT_SALES_AMOUNT())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_ORGN_SLIP_CD-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_ORGN_SLIP_CD\" data-name=\"l_ORGN_SLIP_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_ORGN_SLIP_CD())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_CUR_CD-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_CUR_CD\" data-name=\"l_CUR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_CUR_CD())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_PCL_PRICE_CO-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_PCL_PRICE_CO\" data-name=\"l_PCL_PRICE_CO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_PCL_PRICE_CO())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_REMARKS-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_REMARKS\" data-name=\"l_REMARKS\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_REMARKS())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_INSPC_ACPT_TYP-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_INSPC_ACPT_TYP\" data-name=\"l_INSPC_ACPT_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_INSPC_ACPT_TYP())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_TRANS_TYP-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_TRANS_TYP\" data-name=\"l_TRANS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_TRANS_TYP())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_MODIFY_COUNT\" data-name=\"l_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_MODIFY_COUNT())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_ROWNO-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_ROWNO\" data-name=\"l_ROWNO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_ROWNO())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_AI_AR_IF_FLG-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_AI_AR_IF_FLG\" data-name=\"l_AI_AR_IF_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_AI_AR_IF_FLG())).append("</span>'");
 KR0060010view1_DB.append(",").append("'<span id=\"expj-KR0060010-KR0060010view1-l_APPR_HISTORY_FLG-").append(loopCount).append("\" class=\"expj-label expj-KR0060010-KR0060010view1-l_APPR_HISTORY_FLG\" data-name=\"l_APPR_HISTORY_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aKR0060010Struct.getl_APPR_HISTORY_FLG())).append("</span>'");
 KR0060010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aKR0060010StructLength) {
   KR0060010view1_DB.append(",");
  }
 }
 aKR0060010Struct = structBackup;
 viewIdList.add(KR0060010view1_Id);
 viewSelectList.add(KR0060010view1_select);
 viewResizeList.add(KR0060010view1_resize);
 viewScrollList.add(KR0060010view1_scroll);
 viewHeaderDataList.add(KR0060010view1_HB);
 viewBodyDataList.add(KR0060010view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 button-area" style="width:454px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10" style="width:calc(100% - 538px);"><script class="expj-script-KR0060010-KR0060010button2">
expj.KR0060010.KR0060010button2 = {};
expj.KR0060010.KR0060010button2.executeAllOnDecision = function () {
  console.log('execute KR0060010button2.onDecision');
};
expj.KR0060010.KR0060010button2.executeOnLoad = function () {
  expj.KR0060010.KR0060010button2.executePScriptOnLoad();
};

expj.KR0060010.KR0060010button2.executePScriptOnLoad = function () {
  console.log('execute KR0060010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KR0060010-KR0060010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KR0060010-KR0060010button2-UpdateAssort">
expj.KR0060010.KR0060010button2.UpdateAssort = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KR0060010form1/*,_KR0060010form2/*,_KR0060010view1/+@KR0060010Servlet,,$ZZ07003"
expj.KR0060010.KR0060010button2.UpdateAssort.onClick0 = function () {
  console.log('UpdateAssort script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KR0060010', 'KR0060010button2', '_KR0060010form1/*,_KR0060010form2/*,_KR0060010view1/+', 'KR0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KR0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KR0060010', response);
expj.common.updateBusinessScreenTab('KR0060010', contents);
};
expj.common.pscript.callConfirm('KR0060010', 'KR0060010button2', 'ZZ07003', okEvent);
};
expj.KR0060010.KR0060010button2.UpdateAssort.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0060010.KR0060010button2.UpdateAssort['onClick' + i])) {
        expj.KR0060010.KR0060010button2.UpdateAssort['onClick' + i]();
      }
    }
  }
};
expj.KR0060010.KR0060010button2.UpdateAssort.executeAllOnDecision = function () {
};
expj.KR0060010.KR0060010button2.UpdateAssort.executeOnLoad = function () {
  $('#expj-KR0060010-KR0060010button2-UpdateAssort').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0060010', 'KR0060010button2', 'UpdateAssort', this, 'Button');
    }
  });
  expj.KR0060010.KR0060010button2.UpdateAssort.executePScriptOnLoad();
};

expj.KR0060010.KR0060010button2.UpdateAssort.executePScriptOnLoad = function () {
  console.log('execute KR0060010button2/UpdateAssort.onLoad');
  var targetComponent = document.getElementById('expj-KR0060010-KR0060010button2-UpdateAssort');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0060010-KR0060010button2-UpdateAssort" name="UpdateAssort" class="KR0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdateAssort",rb)%></button><!-- 選択更新ボタン --></div><!--/td-->
<script class="expj-script-KR0060010-KR0060010button2-CheckAll">
expj.KR0060010.KR0060010button2.CheckAll = {};
// script1="onClick;0;DGSALL;KR0060010view1"
expj.KR0060010.KR0060010button2.CheckAll.onClick0 = function () {
  console.log('CheckAll script1');
expj.common.pscript.selectVIEWAllRow('KR0060010', 'KR0060010view1');
};
expj.KR0060010.KR0060010button2.CheckAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0060010.KR0060010button2.CheckAll['onClick' + i])) {
        expj.KR0060010.KR0060010button2.CheckAll['onClick' + i]();
      }
    }
  }
};
expj.KR0060010.KR0060010button2.CheckAll.executeAllOnDecision = function () {
};
expj.KR0060010.KR0060010button2.CheckAll.executeOnLoad = function () {
  $('#expj-KR0060010-KR0060010button2-CheckAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0060010', 'KR0060010button2', 'CheckAll', this, 'Button');
    }
  });
  expj.KR0060010.KR0060010button2.CheckAll.executePScriptOnLoad();
};

expj.KR0060010.KR0060010button2.CheckAll.executePScriptOnLoad = function () {
  console.log('execute KR0060010button2/CheckAll.onLoad');
  var targetComponent = document.getElementById('expj-KR0060010-KR0060010button2-CheckAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0060010-KR0060010button2-CheckAll" name="CheckAll" class="KR0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckAll",rb)%></button><!-- 全選択ボタン --></div><!--/td-->
<script class="expj-script-KR0060010-KR0060010button2-CheckClear">
expj.KR0060010.KR0060010button2.CheckClear = {};
// script1="onClick;0;DGSCANCEL;KR0060010view1"
expj.KR0060010.KR0060010button2.CheckClear.onClick0 = function () {
  console.log('CheckClear script1');
expj.common.pscript.unselectVIEWAllRow('KR0060010', 'KR0060010view1');
};
expj.KR0060010.KR0060010button2.CheckClear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0060010.KR0060010button2.CheckClear['onClick' + i])) {
        expj.KR0060010.KR0060010button2.CheckClear['onClick' + i]();
      }
    }
  }
};
expj.KR0060010.KR0060010button2.CheckClear.executeAllOnDecision = function () {
};
expj.KR0060010.KR0060010button2.CheckClear.executeOnLoad = function () {
  $('#expj-KR0060010-KR0060010button2-CheckClear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0060010', 'KR0060010button2', 'CheckClear', this, 'Button');
    }
  });
  expj.KR0060010.KR0060010button2.CheckClear.executePScriptOnLoad();
};

expj.KR0060010.KR0060010button2.CheckClear.executePScriptOnLoad = function () {
  console.log('execute KR0060010button2/CheckClear.onLoad');
  var targetComponent = document.getElementById('expj-KR0060010-KR0060010button2-CheckClear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0060010-KR0060010button2-CheckClear" name="CheckClear" class="KR0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckClear",rb)%></button><!-- 全解除ボタン --></div><!--/td-->
<script class="expj-script-KR0060010-KR0060010button2-Appr_Hty_Rep">
expj.KR0060010.KR0060010button2.Appr_Hty_Rep = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_KR0060010form1/*,_KR0060010view1/+@KR2050010Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.KR0060010.KR0060010button2.Appr_Hty_Rep.onClick0 = function () {
  console.log('Appr_Hty_Rep script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KR0060010', 'KR0060010button2', '_KR0060010form1/*,_KR0060010view1/+', 'KR2050010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('KR2050010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'KR2050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'KR0060010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KR0060010.KR0060010button2.Appr_Hty_Rep.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0060010.KR0060010button2.Appr_Hty_Rep['onClick' + i])) {
        expj.KR0060010.KR0060010button2.Appr_Hty_Rep['onClick' + i]();
      }
    }
  }
};
expj.KR0060010.KR0060010button2.Appr_Hty_Rep.executeAllOnDecision = function () {
};
expj.KR0060010.KR0060010button2.Appr_Hty_Rep.executeOnLoad = function () {
  $('#expj-KR0060010-KR0060010button2-Appr_Hty_Rep').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0060010', 'KR0060010button2', 'Appr_Hty_Rep', this, 'Button');
    }
  });
  expj.KR0060010.KR0060010button2.Appr_Hty_Rep.executePScriptOnLoad();
};

expj.KR0060010.KR0060010button2.Appr_Hty_Rep.executePScriptOnLoad = function () {
  console.log('execute KR0060010button2/Appr_Hty_Rep.onLoad');
  var targetComponent = document.getElementById('expj-KR0060010-KR0060010button2-Appr_Hty_Rep');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0060010-KR0060010button2-Appr_Hty_Rep" name="Appr_Hty_Rep" class="KR0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnAPPR_HISTORY_REF",rb)%></button><!-- 売上実績参照ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11" style="width:12px;"></div><!--/td-->
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
<span class="version">KR0060010 Revision: 1.4  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KR0060010-KR0060010button0">
expj.KR0060010.KR0060010button0 = {};
expj.KR0060010.KR0060010button0.executeAllOnDecision = function () {
  console.log('execute KR0060010button0.onDecision');
};
expj.KR0060010.KR0060010button0.executeOnLoad = function () {
  expj.KR0060010.KR0060010button0.executePScriptOnLoad();
};

expj.KR0060010.KR0060010button0.executePScriptOnLoad = function () {
  console.log('execute KR0060010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KR0060010-KR0060010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KR0060010-KR0060010button0-Clear">
expj.KR0060010.KR0060010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KR0060010Servlet,,$ZZ07008"
expj.KR0060010.KR0060010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KR0060010', 'KR0060010button0', '', 'KR0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KR0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KR0060010', response);
expj.common.updateBusinessScreenTab('KR0060010', contents);
};
expj.common.pscript.callConfirm('KR0060010', 'KR0060010button0', 'ZZ07008', okEvent);
};
expj.KR0060010.KR0060010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0060010.KR0060010button0.Clear['onClick' + i])) {
        expj.KR0060010.KR0060010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KR0060010.KR0060010button0.Clear.executeAllOnDecision = function () {
};
expj.KR0060010.KR0060010button0.Clear.executeOnLoad = function () {
  $('#expj-KR0060010-KR0060010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0060010', 'KR0060010button0', 'Clear', this, 'Button');
    }
  });
  expj.KR0060010.KR0060010button0.Clear.executePScriptOnLoad();
};

expj.KR0060010.KR0060010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KR0060010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KR0060010-KR0060010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0060010-KR0060010button0-Clear" name="Clear" class="KR0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KR0060010-KR0060010button0-Close">
expj.KR0060010.KR0060010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KR0060010.KR0060010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KR0060010');
};
expj.KR0060010.KR0060010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0060010.KR0060010button0.Close['onClick' + i])) {
        expj.KR0060010.KR0060010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KR0060010.KR0060010button0.Close.executeAllOnDecision = function () {
};
expj.KR0060010.KR0060010button0.Close.executeOnLoad = function () {
  $('#expj-KR0060010-KR0060010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0060010', 'KR0060010button0', 'Close', this, 'Button');
    }
  });
  expj.KR0060010.KR0060010button0.Close.executePScriptOnLoad();
};

expj.KR0060010.KR0060010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KR0060010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KR0060010-KR0060010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0060010-KR0060010button0-Close" name="Close" class="KR0060010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KR0060010 (END)-->
<%
MessageStruct msgStruct = aKR0060010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KR0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KR0060010)) {
  expj.common.treeInstanceMap.KR0060010 = {};
}
expj.common.treeInstanceMap.KR0060010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KR0060010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KR0060010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KR0060010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KR0060010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KR0060010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KR0060010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KR0060010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KR0060010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KR0060010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KR0060010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KR0060010)) {
  expj.common.detailDialogMap.KR0060010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KR0060010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KR0060010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KR0060010.<%=detailId %>)) {
  expj.common.detailDialogMap.KR0060010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KR0060010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KR0060010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KR0060010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KR0060010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KR0060010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KR0060010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KR0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KR0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KR0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KR0060010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KR0060010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KR0060010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KR0060010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KR0060010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KR0060010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KR0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KR0060010)) {
  expj.common.viewInstanceMap.KR0060010 = {};
}
expj.common.viewInstanceMap.KR0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.KR0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KR0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KR0060010.<%=viewId %>.init = function () {
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
    expj.KR0060010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KR0060010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KR0060010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KR0060010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KR0060010_init">
/**
 * KR0060010用のロード完了時初期化関数
 */
expj.KR0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KR0060010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KR0060010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KR0060010');
  expj.common.calendarInstanceMap.KR0060010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KR0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KR0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.KR0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KR0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KR0060010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KR0060010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KR0060010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KR0060010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KR0060010-<%=detailId %>');
<%
 }
%>
  try{expj.KR0060010.KR0060010form1.r_APPR_1.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010form1.r_APPR_2.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010form1.r_APPR_3.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010form1.r_APPR_4.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010form1.CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010form1.PeekerVendCd.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010form1.CUST_NAME.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010form1.h_APPR_POWER_TYP.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010form1.h_INSTALL_FLG.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010form1.SALES_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010form1.CalendarInspcDateFrom.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010form1.SALES_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010form1.CalendarInspcDateTo.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010button1.Select.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010form2.RESERVE_CAUSE.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010button2.UpdateAssort.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010button2.CheckAll.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010button2.CheckClear.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010button2.Appr_Hty_Rep.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010form1.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010button1.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010form2.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010view1.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010button2.executeOnLoad();}catch(e){};
  try{expj.KR0060010.KR0060010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KR0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KR0060010', 'KR0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KR0060010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KR0060010-focus-move');
  // 初期フォーカス当てる処理
  $('.KR0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KR0060010', '<%=request.getContextPath() %>');
};

/**
 * KR0060010の全体onDecision処理
 */
expj.KR0060010.executeAllOnDecision = function () {
  expj.KR0060010.KR0060010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KR0060010_console">
expj.KR0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>