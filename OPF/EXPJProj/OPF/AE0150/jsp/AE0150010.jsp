<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:36:56 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AE0150\AE0150010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AE0150.*" %>
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
<jsp:useBean id="aAE0150010Control" class="com.nec.jp.orteus.metamorBase.AE0150.AE0150010Control" scope="request"/>
<jsp:useBean id="aAE0150010Struct" class="com.nec.jp.orteus.metamorBase.AE0150.AE0150010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

購買検収承認
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0150/jsp/AE0150010.jsp,v $
$Author: geng-jia $	
$Revision: 1.7 $　$Date: 2017/02/22 02:05:29 $
********************************************************* --%>
<html>
<head>
<title>購買検収承認</title>
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
<script class="expj-script-AE0150010_init">
  // AE0150010名前空間
  expj.AE0150010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-AE0150010" data-screen="AE0150010" data-newdata="<%=aAE0150010Control.isNewData() %>">
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
              <script class="expj-script-AE0150010-AE0150010form1">
expj.AE0150010.AE0150010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.AE0150010.AE0150010form1.onLoad0 = function () {
  console.log('AE0150010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHK;?AE0150010form1/*[eq]NORMAL@*1,*2"
expj.AE0150010.AE0150010form1.onDecision0 = function () {
  console.log('AE0150010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010form1', '?AE0150010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="onDecision;1;CHK;?AE0150010form1/*[eq]NORMAL@*3"
expj.AE0150010.AE0150010form1.onDecision1 = function () {
  console.log('AE0150010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010form1', '?AE0150010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="onDecision;2;CHK;?AE0150010form1/*[eq]ERROR@*11"
expj.AE0150010.AE0150010form1.onDecision2 = function () {
  console.log('AE0150010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010form1', '?AE0150010form1/*'), '[eq]', 'ERROR')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script5="child;0;UNMASK;_AE0150010button2/CheckAll,_AE0150010button2/CheckClear@*4"
expj.AE0150010.AE0150010form1.child0 = function () {
  console.log('AE0150010form1 script5');
expj.common.pscript.setUnMaskToReferenceComponent('AE0150010', 'AE0150010form1', '_AE0150010button2/CheckAll');
expj.common.pscript.setUnMaskToReferenceComponent('AE0150010', 'AE0150010form1', '_AE0150010button2/CheckClear');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script6="child;1;CHK;_AE0150010form1/h_APPR_POWER_TYP[eq]1@*0,*2"
expj.AE0150010.AE0150010form1.child1 = function () {
  console.log('AE0150010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010form1', '_AE0150010form1/h_APPR_POWER_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script7="child;2;MASK;_AE0150010button2/UpdateAssort,_AE0150010button2/CheckAll,_AE0150010button2/CheckClear"
expj.AE0150010.AE0150010form1.child2 = function () {
  console.log('AE0150010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AE0150010', 'AE0150010form1', '_AE0150010button2/UpdateAssort');
expj.common.pscript.setMaskToReferenceComponent('AE0150010', 'AE0150010form1', '_AE0150010button2/CheckAll');
expj.common.pscript.setMaskToReferenceComponent('AE0150010', 'AE0150010form1', '_AE0150010button2/CheckClear');
};
// script8="child;3;CHK;?AE0150010form1/VEND_CD[neq]SAME[or]?AE0150010form1/INSPC_DATE_FROM[neq]SAME[or]?AE0150010form1/INSPC_DATE_TO[neq]SAME[or]?AE0150010form1/r_APPR_1[neq]SAME[or]?AE0150010form1/r_APPR_2[neq]SAME[or]?AE0150010form1/r_APPR_3[neq]SAME[or]?AE0150010form1/r_APPR_4[neq]SAME@*2"
expj.AE0150010.AE0150010form1.child3 = function () {
  console.log('AE0150010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010form1', '?AE0150010form1/VEND_CD'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010form1', '?AE0150010form1/INSPC_DATE_FROM'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010form1', '?AE0150010form1/INSPC_DATE_TO'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010form1', '?AE0150010form1/r_APPR_1'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010form1', '?AE0150010form1/r_APPR_2'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010form1', '?AE0150010form1/r_APPR_3'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010form1', '?AE0150010form1/r_APPR_4'), '[neq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script11="child;4;CHK;?AE0150010form1/VEND_CD[eq]SAME[and]?AE0150010form1/INSPC_DATE_FROM[eq]SAME[and]?AE0150010form1/INSPC_DATE_TO[eq]SAME[and]?AE0150010form1/r_APPR_1[eq]SAME[and]?AE0150010form1/r_APPR_2[eq]SAME[and]?AE0150010form1/r_APPR_3[eq]SAME[and]?AE0150010form1/r_APPR_4[eq]SAME@*5"
expj.AE0150010.AE0150010form1.child4 = function () {
  console.log('AE0150010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010form1', '?AE0150010form1/VEND_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010form1', '?AE0150010form1/INSPC_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010form1', '?AE0150010form1/INSPC_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010form1', '?AE0150010form1/r_APPR_1'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010form1', '?AE0150010form1/r_APPR_2'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010form1', '?AE0150010form1/r_APPR_3'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010form1', '?AE0150010form1/r_APPR_4'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script12="child;5;CHK;?AE0150010view1/?[eq]NOT_SELECTED@*6,*7"
expj.AE0150010.AE0150010form1.child5 = function () {
  console.log('AE0150010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010form1', '?AE0150010view1/?'), '[eq]', 'NOT_SELECTED')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script13="child;6;MASK;_AE0150010button2/UpdateAssort"
expj.AE0150010.AE0150010form1.child6 = function () {
  console.log('AE0150010form1 script13');
expj.common.pscript.setMaskToReferenceComponent('AE0150010', 'AE0150010form1', '_AE0150010button2/UpdateAssort');
};
// script14="child;7;UNMASK;_AE0150010button2/UpdateAssort"
expj.AE0150010.AE0150010form1.child7 = function () {
  console.log('AE0150010form1 script14');
expj.common.pscript.setUnMaskToReferenceComponent('AE0150010', 'AE0150010form1', '_AE0150010button2/UpdateAssort');
};
// script15="onDecision;3;CHK;_AE0150010form1/r_APPR_2[eq]true@*8,*9"
expj.AE0150010.AE0150010form1.onDecision3 = function () {
  console.log('AE0150010form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010form1', '_AE0150010form1/r_APPR_2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script16="child;8;UNMASK;_AE0150010form2/RESERVE_CAUSE"
expj.AE0150010.AE0150010form1.child8 = function () {
  console.log('AE0150010form1 script16');
expj.common.pscript.setUnMaskToReferenceComponent('AE0150010', 'AE0150010form1', '_AE0150010form2/RESERVE_CAUSE');
};
// script17="child;9;MASK;_AE0150010form2/RESERVE_CAUSE@*10"
expj.AE0150010.AE0150010form1.child9 = function () {
  console.log('AE0150010form1 script17');
expj.common.pscript.setMaskToReferenceComponent('AE0150010', 'AE0150010form1', '_AE0150010form2/RESERVE_CAUSE');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child10)){this.child10();}}
};
// script18="child;10;SET;_AE0150010form2/RESERVE_CAUSE="
expj.AE0150010.AE0150010form1.child10 = function () {
  console.log('AE0150010form1 script18');
expj.common.pscript.setReferenceComponentValue('AE0150010', 'AE0150010form1', '_AE0150010form2/RESERVE_CAUSE', '');
};
// script19="child;11;MASK;_AE0150010button1/Select,_AE0150010button2/UpdateAssort,_AE0150010button2/CheckAll,_AE0150010button2/CheckClear,_AE0150010button0/Clear"
expj.AE0150010.AE0150010form1.child11 = function () {
  console.log('AE0150010form1 script19');
expj.common.pscript.setMaskToReferenceComponent('AE0150010', 'AE0150010form1', '_AE0150010button1/Select');
expj.common.pscript.setMaskToReferenceComponent('AE0150010', 'AE0150010form1', '_AE0150010button2/UpdateAssort');
expj.common.pscript.setMaskToReferenceComponent('AE0150010', 'AE0150010form1', '_AE0150010button2/CheckAll');
expj.common.pscript.setMaskToReferenceComponent('AE0150010', 'AE0150010form1', '_AE0150010button2/CheckClear');
expj.common.pscript.setMaskToReferenceComponent('AE0150010', 'AE0150010form1', '_AE0150010button0/Clear');
};
expj.AE0150010.AE0150010form1.executeAllOnDecision = function () {
  console.log('execute AE0150010form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0150010.AE0150010form1['onDecision' + i])) {
        expj.AE0150010.AE0150010form1['onDecision' + i]();
      }
    }
  }
};
expj.AE0150010.AE0150010form1.executeOnLoad = function () {
  expj.AE0150010.AE0150010form1.executePScriptOnLoad();
};

expj.AE0150010.AE0150010form1.executePScriptOnLoad = function () {
  console.log('execute AE0150010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AE0150010.AE0150010form1['onLoad' + i])) {
      expj.AE0150010.AE0150010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0150010-AE0150010form1" action="AE0150010Servlet" name="AE0150010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAE0150010Control.getReadStatusString()) %>" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<script class="expj-script-AE0150010-AE0150010form1-r_APPR_1">
expj.AE0150010.AE0150010form1.r_APPR_1 = {};
expj.AE0150010.AE0150010form1.r_APPR_1.executeAllOnDecision = function () {
  console.log('execute AE0150010form1/r_APPR_1.onDecision');
  expj.AE0150010.AE0150010form1.executeAllOnDecision();
  expj.AE0150010.executeAllOnDecision();
};
expj.AE0150010.AE0150010form1.r_APPR_1.executeOnLoad = function () {
  $('#expj-AE0150010-AE0150010form1-r_APPR_1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0150010', 'AE0150010form1', 'r_APPR_1', this, 'RadioButton');
    }
  });
  expj.AE0150010.AE0150010form1.r_APPR_1.executePScriptOnLoad();
};

expj.AE0150010.AE0150010form1.r_APPR_1.executePScriptOnLoad = function () {
  console.log('execute AE0150010form1/r_APPR_1.onLoad');
  var targetComponent = document.getElementById('expj-AE0150010-AE0150010form1-r_APPR_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="r_APPR" data-name="r_APPR_1" value="true" <%= ("true".equals(TypeConverter.convert(aAE0150010Struct.getr_APPR_1())) || "".equals(TypeConverter.convert(aAE0150010Struct.getr_APPR_1())))?"checked=\"checked\"": "" %> class="" id="expj-AE0150010-AE0150010form1-r_APPR_1" ><label for="expj-AE0150010-AE0150010form1-r_APPR_1"><%=CoreTools.getRBString("Expj.Cmt0664",rb)%></label></div><!--/td-->
<script class="expj-script-AE0150010-AE0150010form1-r_APPR_2">
expj.AE0150010.AE0150010form1.r_APPR_2 = {};
expj.AE0150010.AE0150010form1.r_APPR_2.executeAllOnDecision = function () {
  console.log('execute AE0150010form1/r_APPR_2.onDecision');
  expj.AE0150010.AE0150010form1.executeAllOnDecision();
  expj.AE0150010.executeAllOnDecision();
};
expj.AE0150010.AE0150010form1.r_APPR_2.executeOnLoad = function () {
  $('#expj-AE0150010-AE0150010form1-r_APPR_2').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0150010', 'AE0150010form1', 'r_APPR_2', this, 'RadioButton');
    }
  });
  expj.AE0150010.AE0150010form1.r_APPR_2.executePScriptOnLoad();
};

expj.AE0150010.AE0150010form1.r_APPR_2.executePScriptOnLoad = function () {
  console.log('execute AE0150010form1/r_APPR_2.onLoad');
  var targetComponent = document.getElementById('expj-AE0150010-AE0150010form1-r_APPR_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="radio" name="r_APPR" data-name="r_APPR_2" value="true" <%= ("true".equals(TypeConverter.convert(aAE0150010Struct.getr_APPR_2())))?"checked=\"checked\"":"" %> class="" id="expj-AE0150010-AE0150010form1-r_APPR_2" ><label for="expj-AE0150010-AE0150010form1-r_APPR_2"><%=CoreTools.getRBString("Expj.Cmt3169",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AE0150010-AE0150010form1-r_APPR_3">
expj.AE0150010.AE0150010form1.r_APPR_3 = {};
expj.AE0150010.AE0150010form1.r_APPR_3.executeAllOnDecision = function () {
  console.log('execute AE0150010form1/r_APPR_3.onDecision');
  expj.AE0150010.AE0150010form1.executeAllOnDecision();
  expj.AE0150010.executeAllOnDecision();
};
expj.AE0150010.AE0150010form1.r_APPR_3.executeOnLoad = function () {
  $('#expj-AE0150010-AE0150010form1-r_APPR_3').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0150010', 'AE0150010form1', 'r_APPR_3', this, 'RadioButton');
    }
  });
  expj.AE0150010.AE0150010form1.r_APPR_3.executePScriptOnLoad();
};

expj.AE0150010.AE0150010form1.r_APPR_3.executePScriptOnLoad = function () {
  console.log('execute AE0150010form1/r_APPR_3.onLoad');
  var targetComponent = document.getElementById('expj-AE0150010-AE0150010form1-r_APPR_3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="r_APPR" data-name="r_APPR_3" value="true" <%= ("true".equals(TypeConverter.convert(aAE0150010Struct.getr_APPR_3())))?"checked=\"checked\"":"" %> class="" id="expj-AE0150010-AE0150010form1-r_APPR_3" ><label for="expj-AE0150010-AE0150010form1-r_APPR_3"><%=CoreTools.getRBString("Expj.Cmt5093",rb)%></label></div><!--/td-->
<script class="expj-script-AE0150010-AE0150010form1-r_APPR_4">
expj.AE0150010.AE0150010form1.r_APPR_4 = {};
expj.AE0150010.AE0150010form1.r_APPR_4.executeAllOnDecision = function () {
  console.log('execute AE0150010form1/r_APPR_4.onDecision');
  expj.AE0150010.AE0150010form1.executeAllOnDecision();
  expj.AE0150010.executeAllOnDecision();
};
expj.AE0150010.AE0150010form1.r_APPR_4.executeOnLoad = function () {
  $('#expj-AE0150010-AE0150010form1-r_APPR_4').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0150010', 'AE0150010form1', 'r_APPR_4', this, 'RadioButton');
    }
  });
  expj.AE0150010.AE0150010form1.r_APPR_4.executePScriptOnLoad();
};

expj.AE0150010.AE0150010form1.r_APPR_4.executePScriptOnLoad = function () {
  console.log('execute AE0150010form1/r_APPR_4.onLoad');
  var targetComponent = document.getElementById('expj-AE0150010-AE0150010form1-r_APPR_4');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="radio" name="r_APPR" data-name="r_APPR_4" value="true" <%= ("true".equals(TypeConverter.convert(aAE0150010Struct.getr_APPR_4())))?"checked=\"checked\"":"" %> class="" id="expj-AE0150010-AE0150010form1-r_APPR_4" ><label for="expj-AE0150010-AE0150010form1-r_APPR_4"><%=CoreTools.getRBString("Expj.Cmt5094",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_CD",rb)%></span><!-- 取引先コード --></div><!--/td-->
<script class="expj-script-AE0150010-AE0150010form1-VEND_CD">
expj.AE0150010.AE0150010form1.VEND_CD = {};
expj.AE0150010.AE0150010form1.VEND_CD.executeAllOnDecision = function () {
  console.log('execute AE0150010form1/VEND_CD.onDecision');
  expj.AE0150010.AE0150010form1.executeAllOnDecision();
  expj.AE0150010.executeAllOnDecision();
};
expj.AE0150010.AE0150010form1.VEND_CD.executeOnLoad = function () {
  $('#expj-AE0150010-AE0150010form1-VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0150010', 'AE0150010form1', 'VEND_CD', this);
  });
  expj.AE0150010.AE0150010form1.VEND_CD.executePScriptOnLoad();
};

expj.AE0150010.AE0150010form1.VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AE0150010form1/VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0150010-AE0150010form1-VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0150010-AE0150010form1-VEND_CD" name="VEND_CD" class="AE0150010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0150010Struct.getVEND_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0150010-AE0150010form1-PeekerVendCd">
expj.AE0150010.AE0150010form1.PeekerVendCd = {};
// script1="onClick;0;PEEKER;_AE0150010form1/VEND_CD@<%=contextNo%>"
expj.AE0150010.AE0150010form1.PeekerVendCd.onClick0 = function () {
  console.log('PeekerVendCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0150010';
var parameterValues = 'PeekerVendCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010form1', '_AE0150010form1/VEND_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%VEND_CD_02%&%';
parameterValues += 'TARGET_FIELD%=%_AE0150010form1/VEND_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0150010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0150010.AE0150010form1.PeekerVendCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0150010.AE0150010form1.PeekerVendCd['onClick' + i])) {
        expj.AE0150010.AE0150010form1.PeekerVendCd['onClick' + i]();
      }
    }
  }
};
expj.AE0150010.AE0150010form1.PeekerVendCd.executeAllOnDecision = function () {
};
expj.AE0150010.AE0150010form1.PeekerVendCd.executeOnLoad = function () {
  $('#expj-AE0150010-AE0150010form1-PeekerVendCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0150010', 'AE0150010form1', 'PeekerVendCd', this, 'Button');
    }
  });
  expj.AE0150010.AE0150010form1.PeekerVendCd.executePScriptOnLoad();
};

expj.AE0150010.AE0150010form1.PeekerVendCd.executePScriptOnLoad = function () {
  console.log('execute AE0150010form1/PeekerVendCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0150010-AE0150010form1-PeekerVendCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0150010-AE0150010form1-PeekerVendCd" class="AE0150010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0150010-AE0150010form1-VEND_NAME">
expj.AE0150010.AE0150010form1.VEND_NAME = {};
expj.AE0150010.AE0150010form1.VEND_NAME.executeAllOnDecision = function () {
  console.log('execute AE0150010form1/VEND_NAME.onDecision');
  expj.AE0150010.AE0150010form1.executeAllOnDecision();
  expj.AE0150010.executeAllOnDecision();
};
expj.AE0150010.AE0150010form1.VEND_NAME.executeOnLoad = function () {
  $('#expj-AE0150010-AE0150010form1-VEND_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0150010', 'AE0150010form1', 'VEND_NAME', this);
  });
  expj.AE0150010.AE0150010form1.VEND_NAME.executePScriptOnLoad();
};

expj.AE0150010.AE0150010form1.VEND_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0150010form1/VEND_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0150010-AE0150010form1-VEND_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:410px;text-align:left;"><input type="text" id="expj-AE0150010-AE0150010form1-VEND_NAME" name="VEND_NAME" class="AE0150010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0150010Struct.getVEND_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0150010-AE0150010form1-h_APPR_POWER_TYP" name="h_APPR_POWER_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0150010Struct.geth_APPR_POWER_TYP()) %>">
<script class="expj-script-AE0150010-AE0150010form1-h_APPR_POWER_TYP">
expj.AE0150010.AE0150010form1.h_APPR_POWER_TYP = {};
expj.AE0150010.AE0150010form1.h_APPR_POWER_TYP.executeAllOnDecision = function () {
  console.log('execute AE0150010form1/h_APPR_POWER_TYP.onDecision');
  expj.AE0150010.AE0150010form1.executeAllOnDecision();
  expj.AE0150010.executeAllOnDecision();
};
expj.AE0150010.AE0150010form1.h_APPR_POWER_TYP.executeOnLoad = function () {
  $('#expj-AE0150010-AE0150010form1-h_APPR_POWER_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0150010', 'AE0150010form1', 'h_APPR_POWER_TYP', this);
  });
  expj.AE0150010.AE0150010form1.h_APPR_POWER_TYP.executePScriptOnLoad();
};

expj.AE0150010.AE0150010form1.h_APPR_POWER_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0150010form1/h_APPR_POWER_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0150010-AE0150010form1-h_APPR_POWER_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.INSPC_ACPT_DATE",rb)%></span><!-- 検収日 --></div><!--/td-->
<script class="expj-script-AE0150010-AE0150010form1-INSPC_DATE_FROM">
expj.AE0150010.AE0150010form1.INSPC_DATE_FROM = {};
expj.AE0150010.AE0150010form1.INSPC_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AE0150010form1/INSPC_DATE_FROM.onDecision');
  expj.AE0150010.AE0150010form1.executeAllOnDecision();
  expj.AE0150010.executeAllOnDecision();
};
expj.AE0150010.AE0150010form1.INSPC_DATE_FROM.executeOnLoad = function () {
  $('#expj-AE0150010-AE0150010form1-INSPC_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0150010', 'AE0150010form1', 'INSPC_DATE_FROM', this);
  });
  expj.AE0150010.AE0150010form1.INSPC_DATE_FROM.executePScriptOnLoad();
};

expj.AE0150010.AE0150010form1.INSPC_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AE0150010form1/INSPC_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AE0150010-AE0150010form1-INSPC_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0150010-AE0150010form1-INSPC_DATE_FROM" name="INSPC_DATE_FROM" class="AE0150010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0150010Struct.getINSPC_DATE_FROM()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-AE0150010-AE0150010form1-CalendarInspcDateFrom">
expj.AE0150010.AE0150010form1.CalendarInspcDateFrom = {};
// script1="onClick;0;CALENDAR;_AE0150010form1/INSPC_DATE_FROM"
expj.AE0150010.AE0150010form1.CalendarInspcDateFrom.onClick0 = function () {
  console.log('CalendarInspcDateFrom script1');
expj.common.pscript.executeCalendar('AE0150010','AE0150010form1','_AE0150010form1/INSPC_DATE_FROM');
};
expj.AE0150010.AE0150010form1.CalendarInspcDateFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0150010.AE0150010form1.CalendarInspcDateFrom['onClick' + i])) {
        expj.AE0150010.AE0150010form1.CalendarInspcDateFrom['onClick' + i]();
      }
    }
  }
};
expj.AE0150010.AE0150010form1.CalendarInspcDateFrom.executeAllOnDecision = function () {
};
expj.AE0150010.AE0150010form1.CalendarInspcDateFrom.executeOnLoad = function () {
  $('#expj-AE0150010-AE0150010form1-CalendarInspcDateFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0150010', 'AE0150010form1', 'CalendarInspcDateFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0150010','AE0150010form1','_AE0150010form1/INSPC_DATE_FROM');
  expj.AE0150010.AE0150010form1.CalendarInspcDateFrom.executePScriptOnLoad();
};

expj.AE0150010.AE0150010form1.CalendarInspcDateFrom.executePScriptOnLoad = function () {
  console.log('execute AE0150010form1/CalendarInspcDateFrom.onLoad');
  var targetComponent = document.getElementById('expj-AE0150010-AE0150010form1-CalendarInspcDateFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0150010-AE0150010form1-CalendarInspcDateFrom" class="AE0150010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AE0150010-AE0150010form1-INSPC_DATE_TO">
expj.AE0150010.AE0150010form1.INSPC_DATE_TO = {};
expj.AE0150010.AE0150010form1.INSPC_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AE0150010form1/INSPC_DATE_TO.onDecision');
  expj.AE0150010.AE0150010form1.executeAllOnDecision();
  expj.AE0150010.executeAllOnDecision();
};
expj.AE0150010.AE0150010form1.INSPC_DATE_TO.executeOnLoad = function () {
  $('#expj-AE0150010-AE0150010form1-INSPC_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0150010', 'AE0150010form1', 'INSPC_DATE_TO', this);
  });
  expj.AE0150010.AE0150010form1.INSPC_DATE_TO.executePScriptOnLoad();
};

expj.AE0150010.AE0150010form1.INSPC_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AE0150010form1/INSPC_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AE0150010-AE0150010form1-INSPC_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0150010-AE0150010form1-INSPC_DATE_TO" name="INSPC_DATE_TO" class="AE0150010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0150010Struct.getINSPC_DATE_TO()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-AE0150010-AE0150010form1-CalendarInspcDateTo">
expj.AE0150010.AE0150010form1.CalendarInspcDateTo = {};
// script1="onClick;0;CALENDAR;_AE0150010form1/INSPC_DATE_TO"
expj.AE0150010.AE0150010form1.CalendarInspcDateTo.onClick0 = function () {
  console.log('CalendarInspcDateTo script1');
expj.common.pscript.executeCalendar('AE0150010','AE0150010form1','_AE0150010form1/INSPC_DATE_TO');
};
expj.AE0150010.AE0150010form1.CalendarInspcDateTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0150010.AE0150010form1.CalendarInspcDateTo['onClick' + i])) {
        expj.AE0150010.AE0150010form1.CalendarInspcDateTo['onClick' + i]();
      }
    }
  }
};
expj.AE0150010.AE0150010form1.CalendarInspcDateTo.executeAllOnDecision = function () {
};
expj.AE0150010.AE0150010form1.CalendarInspcDateTo.executeOnLoad = function () {
  $('#expj-AE0150010-AE0150010form1-CalendarInspcDateTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0150010', 'AE0150010form1', 'CalendarInspcDateTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0150010','AE0150010form1','_AE0150010form1/INSPC_DATE_TO');
  expj.AE0150010.AE0150010form1.CalendarInspcDateTo.executePScriptOnLoad();
};

expj.AE0150010.AE0150010form1.CalendarInspcDateTo.executePScriptOnLoad = function () {
  console.log('execute AE0150010form1/CalendarInspcDateTo.onLoad');
  var targetComponent = document.getElementById('expj-AE0150010-AE0150010form1-CalendarInspcDateTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0150010-AE0150010form1-CalendarInspcDateTo" class="AE0150010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AE0150010-AE0150010button1">
expj.AE0150010.AE0150010button1 = {};
expj.AE0150010.AE0150010button1.executeAllOnDecision = function () {
  console.log('execute AE0150010button1.onDecision');
};
expj.AE0150010.AE0150010button1.executeOnLoad = function () {
  expj.AE0150010.AE0150010button1.executePScriptOnLoad();
};

expj.AE0150010.AE0150010button1.executePScriptOnLoad = function () {
  console.log('execute AE0150010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0150010-AE0150010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0150010-AE0150010button1-Select">
expj.AE0150010.AE0150010button1.Select = {};
// script1="onClick;0;CHK;_AE0150010form1/INSPC_DATE_FROM[neq][and]_AE0150010form1/INSPC_DATE_TO[neq][and]_AE0150010form1/INSPC_DATE_FROM[gt]_AE0150010form1/INSPC_DATE_TO@!ZZ05101"
expj.AE0150010.AE0150010button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010button1', '_AE0150010form1/INSPC_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010button1', '_AE0150010form1/INSPC_DATE_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010button1', '_AE0150010form1/INSPC_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010button1', '_AE0150010form1/INSPC_DATE_TO')))) {
expj.common.pscript.viewErrorMessage('AE0150010', 'AE0150010button1', 'ZZ05101');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0150010form1/*@AE0150010Servlet,,"
expj.AE0150010.AE0150010button1.Select.onClick1 = function () {
  console.log('Select script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0150010', 'AE0150010button1', '_AE0150010form1/*', 'AE0150010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0150010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0150010', response);
expj.common.updateBusinessScreenTab('AE0150010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0150010.AE0150010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0150010.AE0150010button1.Select['onClick' + i])) {
        expj.AE0150010.AE0150010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AE0150010.AE0150010button1.Select.executeAllOnDecision = function () {
};
expj.AE0150010.AE0150010button1.Select.executeOnLoad = function () {
  $('#expj-AE0150010-AE0150010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0150010', 'AE0150010button1', 'Select', this, 'Button');
    }
  });
  expj.AE0150010.AE0150010button1.Select.executePScriptOnLoad();
};

expj.AE0150010.AE0150010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AE0150010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AE0150010-AE0150010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:105px;float:none;height:30px;"><button type="button" id="expj-AE0150010-AE0150010button1-Select" name="Select" class="AE0150010-focus-move" style="width:px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style=""><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AE0150010-AE0150010form2">
expj.AE0150010.AE0150010form2 = {};
expj.AE0150010.AE0150010form2.executeAllOnDecision = function () {
  console.log('execute AE0150010form2.onDecision');
};
expj.AE0150010.AE0150010form2.executeOnLoad = function () {
  expj.AE0150010.AE0150010form2.executePScriptOnLoad();
};

expj.AE0150010.AE0150010form2.executePScriptOnLoad = function () {
  console.log('execute AE0150010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0150010-AE0150010form2" action="AE0150010Servlet" name="AE0150010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<script class="expj-script-AE0150010-AE0150010form2-RESERVE_CAUSE">
expj.AE0150010.AE0150010form2.RESERVE_CAUSE = {};
expj.AE0150010.AE0150010form2.RESERVE_CAUSE.executeAllOnDecision = function () {
  console.log('execute AE0150010form2/RESERVE_CAUSE.onDecision');
  expj.AE0150010.AE0150010form2.executeAllOnDecision();
  expj.AE0150010.executeAllOnDecision();
};
expj.AE0150010.AE0150010form2.RESERVE_CAUSE.executeOnLoad = function () {
  $('#expj-AE0150010-AE0150010form2-RESERVE_CAUSE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0150010', 'AE0150010form2', 'RESERVE_CAUSE', this);
  });
  expj.AE0150010.AE0150010form2.RESERVE_CAUSE.executePScriptOnLoad();
};

expj.AE0150010.AE0150010form2.RESERVE_CAUSE.executePScriptOnLoad = function () {
  console.log('execute AE0150010form2/RESERVE_CAUSE.onLoad');
  var targetComponent = document.getElementById('expj-AE0150010-AE0150010form2-RESERVE_CAUSE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AE0150010-AE0150010form2-RESERVE_CAUSE" name="RESERVE_CAUSE" class="AE0150010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0150010Struct.getRESERVE_CAUSE()) %>" maxlength="80" ></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AE0150010-AE0150010view1">
expj.AE0150010.AE0150010view1 = {};
// script1="onLoad;0;CALL;onClick@0"
expj.AE0150010.AE0150010view1.onLoad0 = function () {
  console.log('AE0150010view1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;?AE0150010form1/*[eq]NORMAL[and]_AE0150010form1/h_APPR_POWER_TYP[eq]1@*0"
expj.AE0150010.AE0150010view1.onClick0 = function () {
  console.log('AE0150010view1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010view1', '?AE0150010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010view1', '_AE0150010form1/h_APPR_POWER_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="child;0;CHK;?AE0150010form1/VEND_CD[eq]SAME[and]?AE0150010form1/INSPC_DATE_FROM[eq]SAME[and]?AE0150010form1/INSPC_DATE_TO[eq]SAME[and]?AE0150010form1/r_APPR_1[eq]SAME[and]?AE0150010form1/r_APPR_2[eq]SAME[and]?AE0150010form1/r_APPR_3[eq]SAME[and]?AE0150010form1/r_APPR_4[eq]SAME@*1"
expj.AE0150010.AE0150010view1.child0 = function () {
  console.log('AE0150010view1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010view1', '?AE0150010form1/VEND_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010view1', '?AE0150010form1/INSPC_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010view1', '?AE0150010form1/INSPC_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010view1', '?AE0150010form1/r_APPR_1'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010view1', '?AE0150010form1/r_APPR_2'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010view1', '?AE0150010form1/r_APPR_3'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010view1', '?AE0150010form1/r_APPR_4'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="child;1;CHK;?AE0150010view1/?[eq]NOT_SELECTED@*2,*3"
expj.AE0150010.AE0150010view1.child1 = function () {
  console.log('AE0150010view1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0150010', 'AE0150010view1', '?AE0150010view1/?'), '[eq]', 'NOT_SELECTED')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="child;2;MASK;_AE0150010button2/UpdateAssort"
expj.AE0150010.AE0150010view1.child2 = function () {
  console.log('AE0150010view1 script5');
expj.common.pscript.setMaskToReferenceComponent('AE0150010', 'AE0150010view1', '_AE0150010button2/UpdateAssort');
};
// script6="child;3;UNMASK;_AE0150010button2/UpdateAssort"
expj.AE0150010.AE0150010view1.child3 = function () {
  console.log('AE0150010view1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AE0150010', 'AE0150010view1', '_AE0150010button2/UpdateAssort');
};
expj.AE0150010.AE0150010view1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0150010.AE0150010view1['onClick' + i])) {
        expj.AE0150010.AE0150010view1['onClick' + i]();
      }
    }
  }
};
expj.AE0150010.AE0150010view1.executeAllOnDecision = function () {
  console.log('execute AE0150010view1.onDecision');
};
expj.AE0150010.AE0150010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AE0150010view1", "expj.AE0150010.AE0150010view1.executeAllOnClick");
%>
  expj.AE0150010.AE0150010view1.executePScriptOnLoad();
};

expj.AE0150010.AE0150010view1.executePScriptOnLoad = function () {
  console.log('execute AE0150010view1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AE0150010.AE0150010view1['onLoad' + i])) {
      expj.AE0150010.AE0150010view1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AE0150010-AE0150010view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%= TypeConverter.sanitizer(aAE0150010Control.getReadStatusString()) %>"></div>
<!-- VIEW END -->
<%
 String AE0150010view1_Id = "AE0150010view1";
 String AE0150010view1_select = "single";
 String AE0150010view1_sortable = "true";
 String AE0150010view1_resize = "true";
 String AE0150010view1_scroll = "true";
 StringBuffer AE0150010view1_HB = new StringBuffer();
 StringBuffer AE0150010view1_DB = new StringBuffer();
%>
<%
 AE0150010view1_select = "multi";
 AE0150010view1_sortable = "true";
 AE0150010view1_resize = "true";
 AE0150010view1_scroll = "true";
%>
<%
 AE0150010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
%>
     
<%
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3164",rb))).append("', 'name':'l_APPR_ID', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.APPR_DATE",rb))).append("', 'name':'l_APPR_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3163",rb))).append("', 'name':'l_RESERVE_CAUSE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_CD",rb))).append("', 'name':'l_PUCH_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_NO",rb))).append("', 'name':'l_ACPT_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.INSPC_ACPT_NO",rb))).append("', 'name':'l_INSPC_ACPT_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CRCT_TYP",rb))).append("', 'name':'l_CRCT_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.INSPC_ACPT_DATE",rb))).append("', 'name':'l_INSPC_ACPT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_DATE",rb))).append("', 'name':'l_ACPT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'l_VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_NAME",rb))).append("', 'name':'l_VEND_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLANT_CD",rb))).append("', 'name':'l_PLANT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLANT_NAME",rb))).append("', 'name':'l_PLANT_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.GNR_ORG_CD",rb))).append("', 'name':'l_GNR_ORG_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt5095",rb))).append("', 'name':'l_GNR_ORG_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DLV_CD",rb))).append("', 'name':'l_DLV_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRODUCT_TYP",rb))).append("', 'name':'l_PRODUCT_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_IN_PROC_CD",rb))).append("', 'name':'l_WORK_IN_PROC_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNIT_COST",rb))).append("', 'name':'l_UNIT_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNIT_COST_TYP",rb))).append("', 'name':'l_UNIT_COST_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROCESSING_COST",rb))).append("', 'name':'l_PROCESSING_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MATERIAL_COST",rb))).append("', 'name':'l_MATERIAL_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OTHER_OVERHEADS",rb))).append("', 'name':'l_OTHER_OVERHEADS', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_QTY_2",rb))).append("', 'name':'l_ACPT_QTY_2', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.INSPC_ACPT_QTY",rb))).append("', 'name':'l_INSPC_ACPT_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_UNIT",rb))).append("', 'name':'l_STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.INSPC_ACPT_AMOUNT",rb))).append("', 'name':'l_INSPC_ACPT_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DISC_AMOUNT",rb))).append("', 'name':'l_DISC_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'l_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_DETAIL_NO",rb))).append("', 'name':'l_JOB_ODR_DETAIL_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MANAGEMENT_CD",rb))).append("', 'name':'l_MANAGEMENT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SBCNT_PUCH_TYP",rb))).append("', 'name':'l_SBCNT_PUCH_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.INV_CTRL_FLG",rb))).append("', 'name':'l_INV_CTRL_FLG', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SLIP_TYP",rb))).append("', 'name':'l_SLIP_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_RTN_FLG",rb))).append("', 'name':'l_PUCH_RTN_FLG', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_ROWNO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
AE0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_AI_AP_IF_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AE0150010view1_sortable).append("}").append(",");
%>
<%
 int aAE0150010StructLength = aAE0150010Control.getListsize();
 final AE0150010Struct structBackup = aAE0150010Struct;
 aAE0150010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAE0150010StructLength; ++loopCount) {
  if((aAE0150010Struct = (AE0150010Struct) aAE0150010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAE0150010Struct", aAE0150010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AE0150010view1_DB.append("[");
 AE0150010view1_DB.append(loopCount);
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_APPR_ID-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_APPR_ID\" data-name=\"l_APPR_ID\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_APPR_ID())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_APPR_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_APPR_DATE\" data-name=\"l_APPR_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_APPR_DATE())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_RESERVE_CAUSE-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_RESERVE_CAUSE\" data-name=\"l_RESERVE_CAUSE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_RESERVE_CAUSE())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_PUCH_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_PUCH_ODR_CD\" data-name=\"l_PUCH_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_PUCH_ODR_CD())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_ACPT_NO-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_ACPT_NO\" data-name=\"l_ACPT_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_ACPT_NO())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_INSPC_ACPT_NO-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_INSPC_ACPT_NO\" data-name=\"l_INSPC_ACPT_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_INSPC_ACPT_NO())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_CRCT_TYP-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_CRCT_TYP\" data-name=\"l_CRCT_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_CRCT_TYP())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_INSPC_ACPT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_INSPC_ACPT_DATE\" data-name=\"l_INSPC_ACPT_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_INSPC_ACPT_DATE())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_ACPT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_ACPT_DATE\" data-name=\"l_ACPT_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_ACPT_DATE())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_VEND_CD\" data-name=\"l_VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_VEND_CD())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_VEND_NAME-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_VEND_NAME\" data-name=\"l_VEND_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_VEND_NAME())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_PLANT_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_PLANT_CD\" data-name=\"l_PLANT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_PLANT_CD())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_PLANT_NAME-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_PLANT_NAME\" data-name=\"l_PLANT_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_PLANT_NAME())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_GNR_ORG_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_GNR_ORG_CD\" data-name=\"l_GNR_ORG_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_GNR_ORG_CD())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_GNR_ORG_NAME-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_GNR_ORG_NAME\" data-name=\"l_GNR_ORG_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_GNR_ORG_NAME())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_DLV_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_DLV_CD\" data-name=\"l_DLV_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_DLV_CD())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_ITEM_CD())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_ITEM_NAME())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_PRODUCT_TYP-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_PRODUCT_TYP\" data-name=\"l_PRODUCT_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_PRODUCT_TYP())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_WORK_IN_PROC_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_WORK_IN_PROC_CD\" data-name=\"l_WORK_IN_PROC_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_WORK_IN_PROC_CD())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_UNIT_COST-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_UNIT_COST\" data-name=\"l_UNIT_COST\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_UNIT_COST())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_UNIT_COST_TYP-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_UNIT_COST_TYP\" data-name=\"l_UNIT_COST_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_UNIT_COST_TYP())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_PROCESSING_COST-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_PROCESSING_COST\" data-name=\"l_PROCESSING_COST\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_PROCESSING_COST())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_MATERIAL_COST-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_MATERIAL_COST\" data-name=\"l_MATERIAL_COST\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_MATERIAL_COST())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_OTHER_OVERHEADS-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_OTHER_OVERHEADS\" data-name=\"l_OTHER_OVERHEADS\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_OTHER_OVERHEADS())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_ACPT_QTY_2-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_ACPT_QTY_2\" data-name=\"l_ACPT_QTY_2\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_ACPT_QTY_2())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_INSPC_ACPT_QTY-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_INSPC_ACPT_QTY\" data-name=\"l_INSPC_ACPT_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_INSPC_ACPT_QTY())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_STOCK_UNIT\" data-name=\"l_STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_STOCK_UNIT())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_INSPC_ACPT_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_INSPC_ACPT_AMOUNT\" data-name=\"l_INSPC_ACPT_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_INSPC_ACPT_AMOUNT())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_DISC_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_DISC_AMOUNT\" data-name=\"l_DISC_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_DISC_AMOUNT())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_JOB_ODR_CD\" data-name=\"l_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_JOB_ODR_CD())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_JOB_ODR_DETAIL_NO-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_JOB_ODR_DETAIL_NO\" data-name=\"l_JOB_ODR_DETAIL_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_JOB_ODR_DETAIL_NO())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_MANAGEMENT_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_MANAGEMENT_CD\" data-name=\"l_MANAGEMENT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_MANAGEMENT_CD())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_SBCNT_PUCH_TYP-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_SBCNT_PUCH_TYP\" data-name=\"l_SBCNT_PUCH_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_SBCNT_PUCH_TYP())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_INV_CTRL_FLG-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_INV_CTRL_FLG\" data-name=\"l_INV_CTRL_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_INV_CTRL_FLG())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_SLIP_TYP-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_SLIP_TYP\" data-name=\"l_SLIP_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_SLIP_TYP())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_PUCH_RTN_FLG-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_PUCH_RTN_FLG\" data-name=\"l_PUCH_RTN_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_PUCH_RTN_FLG())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_MODIFY_COUNT\" data-name=\"l_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_MODIFY_COUNT())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_ROWNO-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_ROWNO\" data-name=\"l_ROWNO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_ROWNO())).append("</span>'");
 AE0150010view1_DB.append(",").append("'<span id=\"expj-AE0150010-AE0150010view1-l_AI_AP_IF_FLG-").append(loopCount).append("\" class=\"expj-label expj-AE0150010-AE0150010view1-l_AI_AP_IF_FLG\" data-name=\"l_AI_AP_IF_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0150010Struct.getl_AI_AP_IF_FLG())).append("</span>'");
 AE0150010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAE0150010StructLength) {
   AE0150010view1_DB.append(",");
  }
 }
 aAE0150010Struct = structBackup;
 viewIdList.add(AE0150010view1_Id);
 viewSelectList.add(AE0150010view1_select);
 viewResizeList.add(AE0150010view1_resize);
 viewScrollList.add(AE0150010view1_scroll);
 viewHeaderDataList.add(AE0150010view1_HB);
 viewBodyDataList.add(AE0150010view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 button-area" style="width:559px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10" style="width:calc(100% - 643px);"><script class="expj-script-AE0150010-AE0150010button2">
expj.AE0150010.AE0150010button2 = {};
expj.AE0150010.AE0150010button2.executeAllOnDecision = function () {
  console.log('execute AE0150010button2.onDecision');
};
expj.AE0150010.AE0150010button2.executeOnLoad = function () {
  expj.AE0150010.AE0150010button2.executePScriptOnLoad();
};

expj.AE0150010.AE0150010button2.executePScriptOnLoad = function () {
  console.log('execute AE0150010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0150010-AE0150010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0150010-AE0150010button2-UpdateAssort">
expj.AE0150010.AE0150010button2.UpdateAssort = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0150010form1/*,_AE0150010form2/*,_AE0150010view1/+@AE0150010Servlet,,$ZZ07003"
expj.AE0150010.AE0150010button2.UpdateAssort.onClick0 = function () {
  console.log('UpdateAssort script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0150010', 'AE0150010button2', '_AE0150010form1/*,_AE0150010form2/*,_AE0150010view1/+', 'AE0150010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0150010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0150010', response);
expj.common.updateBusinessScreenTab('AE0150010', contents);
};
expj.common.pscript.callConfirm('AE0150010', 'AE0150010button2', 'ZZ07003', okEvent);
};
expj.AE0150010.AE0150010button2.UpdateAssort.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0150010.AE0150010button2.UpdateAssort['onClick' + i])) {
        expj.AE0150010.AE0150010button2.UpdateAssort['onClick' + i]();
      }
    }
  }
};
expj.AE0150010.AE0150010button2.UpdateAssort.executeAllOnDecision = function () {
};
expj.AE0150010.AE0150010button2.UpdateAssort.executeOnLoad = function () {
  $('#expj-AE0150010-AE0150010button2-UpdateAssort').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0150010', 'AE0150010button2', 'UpdateAssort', this, 'Button');
    }
  });
  expj.AE0150010.AE0150010button2.UpdateAssort.executePScriptOnLoad();
};

expj.AE0150010.AE0150010button2.UpdateAssort.executePScriptOnLoad = function () {
  console.log('execute AE0150010button2/UpdateAssort.onLoad');
  var targetComponent = document.getElementById('expj-AE0150010-AE0150010button2-UpdateAssort');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0150010-AE0150010button2-UpdateAssort" name="UpdateAssort" class="AE0150010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdateAssort",rb)%></button><!-- 選択更新ボタン --></div><!--/td-->
<script class="expj-script-AE0150010-AE0150010button2-CheckAll">
expj.AE0150010.AE0150010button2.CheckAll = {};
// script1="onClick;0;DGSALL;AE0150010view1"
expj.AE0150010.AE0150010button2.CheckAll.onClick0 = function () {
  console.log('CheckAll script1');
expj.common.pscript.selectVIEWAllRow('AE0150010', 'AE0150010view1');
};
expj.AE0150010.AE0150010button2.CheckAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0150010.AE0150010button2.CheckAll['onClick' + i])) {
        expj.AE0150010.AE0150010button2.CheckAll['onClick' + i]();
      }
    }
  }
};
expj.AE0150010.AE0150010button2.CheckAll.executeAllOnDecision = function () {
};
expj.AE0150010.AE0150010button2.CheckAll.executeOnLoad = function () {
  $('#expj-AE0150010-AE0150010button2-CheckAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0150010', 'AE0150010button2', 'CheckAll', this, 'Button');
    }
  });
  expj.AE0150010.AE0150010button2.CheckAll.executePScriptOnLoad();
};

expj.AE0150010.AE0150010button2.CheckAll.executePScriptOnLoad = function () {
  console.log('execute AE0150010button2/CheckAll.onLoad');
  var targetComponent = document.getElementById('expj-AE0150010-AE0150010button2-CheckAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0150010-AE0150010button2-CheckAll" name="CheckAll" class="AE0150010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckAll",rb)%></button><!-- 全選択ボタン --></div><!--/td-->
<script class="expj-script-AE0150010-AE0150010button2-CheckClear">
expj.AE0150010.AE0150010button2.CheckClear = {};
// script1="onClick;0;DGSCANCEL;AE0150010view1"
expj.AE0150010.AE0150010button2.CheckClear.onClick0 = function () {
  console.log('CheckClear script1');
expj.common.pscript.unselectVIEWAllRow('AE0150010', 'AE0150010view1');
};
expj.AE0150010.AE0150010button2.CheckClear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0150010.AE0150010button2.CheckClear['onClick' + i])) {
        expj.AE0150010.AE0150010button2.CheckClear['onClick' + i]();
      }
    }
  }
};
expj.AE0150010.AE0150010button2.CheckClear.executeAllOnDecision = function () {
};
expj.AE0150010.AE0150010button2.CheckClear.executeOnLoad = function () {
  $('#expj-AE0150010-AE0150010button2-CheckClear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0150010', 'AE0150010button2', 'CheckClear', this, 'Button');
    }
  });
  expj.AE0150010.AE0150010button2.CheckClear.executePScriptOnLoad();
};

expj.AE0150010.AE0150010button2.CheckClear.executePScriptOnLoad = function () {
  console.log('execute AE0150010button2/CheckClear.onLoad');
  var targetComponent = document.getElementById('expj-AE0150010-AE0150010button2-CheckClear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0150010-AE0150010button2-CheckClear" name="CheckClear" class="AE0150010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckClear",rb)%></button><!-- 全解除ボタン --></div><!--/td-->
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
<span class="version">AE0150010 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AE0150010-AE0150010button0">
expj.AE0150010.AE0150010button0 = {};
expj.AE0150010.AE0150010button0.executeAllOnDecision = function () {
  console.log('execute AE0150010button0.onDecision');
};
expj.AE0150010.AE0150010button0.executeOnLoad = function () {
  expj.AE0150010.AE0150010button0.executePScriptOnLoad();
};

expj.AE0150010.AE0150010button0.executePScriptOnLoad = function () {
  console.log('execute AE0150010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0150010-AE0150010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0150010-AE0150010button0-Clear">
expj.AE0150010.AE0150010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AE0150010Servlet,,$ZZ07008"
expj.AE0150010.AE0150010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0150010', 'AE0150010button0', '', 'AE0150010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0150010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0150010', response);
expj.common.updateBusinessScreenTab('AE0150010', contents);
};
expj.common.pscript.callConfirm('AE0150010', 'AE0150010button0', 'ZZ07008', okEvent);
};
expj.AE0150010.AE0150010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0150010.AE0150010button0.Clear['onClick' + i])) {
        expj.AE0150010.AE0150010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AE0150010.AE0150010button0.Clear.executeAllOnDecision = function () {
};
expj.AE0150010.AE0150010button0.Clear.executeOnLoad = function () {
  $('#expj-AE0150010-AE0150010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0150010', 'AE0150010button0', 'Clear', this, 'Button');
    }
  });
  expj.AE0150010.AE0150010button0.Clear.executePScriptOnLoad();
};

expj.AE0150010.AE0150010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AE0150010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AE0150010-AE0150010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0150010-AE0150010button0-Clear" name="Clear" class="AE0150010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AE0150010-AE0150010button0-Close">
expj.AE0150010.AE0150010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AE0150010.AE0150010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AE0150010');
};
expj.AE0150010.AE0150010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0150010.AE0150010button0.Close['onClick' + i])) {
        expj.AE0150010.AE0150010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AE0150010.AE0150010button0.Close.executeAllOnDecision = function () {
};
expj.AE0150010.AE0150010button0.Close.executeOnLoad = function () {
  $('#expj-AE0150010-AE0150010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0150010', 'AE0150010button0', 'Close', this, 'Button');
    }
  });
  expj.AE0150010.AE0150010button0.Close.executePScriptOnLoad();
};

expj.AE0150010.AE0150010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AE0150010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AE0150010-AE0150010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0150010-AE0150010button0-Close" name="Close" class="AE0150010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AE0150010 (END)-->
<%
MessageStruct msgStruct = aAE0150010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AE0150010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AE0150010)) {
  expj.common.treeInstanceMap.AE0150010 = {};
}
expj.common.treeInstanceMap.AE0150010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0150010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AE0150010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0150010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AE0150010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AE0150010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AE0150010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AE0150010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AE0150010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AE0150010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AE0150010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0150010)) {
  expj.common.detailDialogMap.AE0150010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0150010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AE0150010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0150010.<%=detailId %>)) {
  expj.common.detailDialogMap.AE0150010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0150010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AE0150010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0150010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AE0150010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AE0150010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AE0150010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AE0150010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AE0150010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AE0150010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AE0150010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AE0150010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AE0150010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AE0150010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AE0150010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AE0150010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AE0150010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AE0150010)) {
  expj.common.viewInstanceMap.AE0150010 = {};
}
expj.common.viewInstanceMap.AE0150010.<%=viewId %> = {};
expj.common.viewInstanceMap.AE0150010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AE0150010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AE0150010.<%=viewId %>.init = function () {
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
    expj.AE0150010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AE0150010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AE0150010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AE0150010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AE0150010_init">
/**
 * AE0150010用のロード完了時初期化関数
 */
expj.AE0150010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AE0150010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AE0150010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AE0150010');
  expj.common.calendarInstanceMap.AE0150010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AE0150010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AE0150010.<%=detailId %>.init();
  expj.common.detailDialogMap.AE0150010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AE0150010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AE0150010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AE0150010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AE0150010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AE0150010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AE0150010-<%=detailId %>');
<%
 }
%>
  try{expj.AE0150010.AE0150010form1.r_APPR_1.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010form1.r_APPR_2.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010form1.r_APPR_3.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010form1.r_APPR_4.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010form1.VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010form1.PeekerVendCd.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010form1.VEND_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010form1.h_APPR_POWER_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010form1.INSPC_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010form1.CalendarInspcDateFrom.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010form1.INSPC_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010form1.CalendarInspcDateTo.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010form2.RESERVE_CAUSE.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010button2.UpdateAssort.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010button2.CheckAll.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010button2.CheckClear.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010form1.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010button1.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010form2.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010view1.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010button2.executeOnLoad();}catch(e){};
  try{expj.AE0150010.AE0150010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AE0150010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AE0150010', 'AE0150010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AE0150010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AE0150010-focus-move');
  // 初期フォーカス当てる処理
  $('.AE0150010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AE0150010', '<%=request.getContextPath() %>');
};

/**
 * AE0150010の全体onDecision処理
 */
expj.AE0150010.executeAllOnDecision = function () {
  expj.AE0150010.AE0150010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AE0150010_console">
expj.AE0150010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>