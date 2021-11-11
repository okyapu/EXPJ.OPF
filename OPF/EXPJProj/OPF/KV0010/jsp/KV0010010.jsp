<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 13:03:34 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KV0010\KV0010010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KV0010.*" %>
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
<jsp:useBean id="aKV0010010Control" class="com.nec.jp.orteus.metamorBase.KV0010.KV0010010Control" scope="request"/>
<jsp:useBean id="aKV0010010Struct" class="com.nec.jp.orteus.metamorBase.KV0010.KV0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

バッチ処理実行
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0010/jsp/KV0010010.jsp,v $
$Author: geng-jia $	
$Revision: 1.10 $ $Date: 2017/02/22 02:07:33 $
********************************************************* --%>
<html>
<head>
<title>バッチ処理実行</title>
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
<script class="expj-script-KV0010010_init">
  // KV0010010名前空間
  expj.KV0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-KV0010010" data-screen="KV0010010" data-newdata="<%=aKV0010010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->

  <!--first start -->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style=""></div><!--/td-->

    </div><!--/tr-->

  <!--first end -->

  <!--second start -->
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
              <!--ここにバッチ選択用のDataGridを配置する。↓ -->
              <script class="expj-script-KV0010010-KV0010010form1">
expj.KV0010010.KV0010010form1 = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.KV0010010.KV0010010form1.onLoad0 = function () {
  console.log('KV0010010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHK;_KV0010010form1/rdoPlantTyp4[eq]true@*0,*2"
expj.KV0010010.KV0010010form1.onDecision0 = function () {
  console.log('KV0010010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0010010', 'KV0010010form1', '_KV0010010form1/rdoPlantTyp4'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;0;MASK;_KV0010010form1/g_DIRECT_DLV_FLG"
expj.KV0010010.KV0010010form1.child0 = function () {
  console.log('KV0010010form1 script3');
expj.common.pscript.setMaskToReferenceComponent('KV0010010', 'KV0010010form1', '_KV0010010form1/g_DIRECT_DLV_FLG');
};
// script4="child;1;UNMASK;_KV0010010form1/g_DIRECT_DLV_FLG"
expj.KV0010010.KV0010010form1.child1 = function () {
  console.log('KV0010010form1 script4');
expj.common.pscript.setUnMaskToReferenceComponent('KV0010010', 'KV0010010form1', '_KV0010010form1/g_DIRECT_DLV_FLG');
};
// script5="child;2;CHK;_KV0010010form1/rdoPlantTyp5[eq]true@*0,*3"
expj.KV0010010.KV0010010form1.child2 = function () {
  console.log('KV0010010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0010010', 'KV0010010form1', '_KV0010010form1/rdoPlantTyp5'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;3;CHK;_KV0010010form1/rdoPlantTyp1[eq]true@*0,*4"
expj.KV0010010.KV0010010form1.child3 = function () {
  console.log('KV0010010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0010010', 'KV0010010form1', '_KV0010010form1/rdoPlantTyp1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;4;CHK;_KV0010010form1/rdoPlantTyp2[eq]true@*1,*5"
expj.KV0010010.KV0010010form1.child4 = function () {
  console.log('KV0010010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0010010', 'KV0010010form1', '_KV0010010form1/rdoPlantTyp2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="child;5;CHK;_KV0010010form1/rdoPlantTyp3[eq]true@*0,*6"
expj.KV0010010.KV0010010form1.child5 = function () {
  console.log('KV0010010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0010010', 'KV0010010form1', '_KV0010010form1/rdoPlantTyp3'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script9="child;6;CHK;_KV0010010form1/rdoPlantTyp6[eq]true@*0,*7"
expj.KV0010010.KV0010010form1.child6 = function () {
  console.log('KV0010010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0010010', 'KV0010010form1', '_KV0010010form1/rdoPlantTyp6'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script10="child;7;CHK;_KV0010010form1/rdoPlantTyp7[eq]true@*0,*8"
expj.KV0010010.KV0010010form1.child7 = function () {
  console.log('KV0010010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0010010', 'KV0010010form1', '_KV0010010form1/rdoPlantTyp7'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script11="child;8;CHK;_KV0010010form1/rdoPlantTyp8[eq]true@*0,*9"
expj.KV0010010.KV0010010form1.child8 = function () {
  console.log('KV0010010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0010010', 'KV0010010form1', '_KV0010010form1/rdoPlantTyp8'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script12="child;9;CHK;_KV0010010form1/rdoPlantTyp9[eq]true@*0,*10"
expj.KV0010010.KV0010010form1.child9 = function () {
  console.log('KV0010010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0010010', 'KV0010010form1', '_KV0010010form1/rdoPlantTyp9'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script13="child;10;SET;_KV0010010form1/rdoPlantTyp4=true"
expj.KV0010010.KV0010010form1.child10 = function () {
  console.log('KV0010010form1 script13');
expj.common.pscript.setReferenceComponentValue('KV0010010', 'KV0010010form1', '_KV0010010form1/rdoPlantTyp4', 'true');
};
expj.KV0010010.KV0010010form1.executeAllOnDecision = function () {
  console.log('execute KV0010010form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0010010.KV0010010form1['onDecision' + i])) {
        expj.KV0010010.KV0010010form1['onDecision' + i]();
      }
    }
  }
};
expj.KV0010010.KV0010010form1.executeOnLoad = function () {
  expj.KV0010010.KV0010010form1.executePScriptOnLoad();
};

expj.KV0010010.KV0010010form1.executePScriptOnLoad = function () {
  console.log('execute KV0010010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KV0010010.KV0010010form1['onLoad' + i])) {
      expj.KV0010010.KV0010010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KV0010010-KV0010010form1" action="KV0010010Servlet" name="KV0010010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:center"></div>
<div class="div-td" style="width:150px;align:center"></div>
<div class="div-td" style="width:614px;align:center"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:614px;text-align:center;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:614px;text-align:center;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:center;"></div><!--/td-->
<script class="expj-script-KV0010010-KV0010010form1-rdoPlantTyp4">
expj.KV0010010.KV0010010form1.rdoPlantTyp4 = {};
// script1="onClick;0;SET;_KV0010010form1/g_DIRECT_DLV_FLG=false"
expj.KV0010010.KV0010010form1.rdoPlantTyp4.onClick0 = function () {
  console.log('rdoPlantTyp4 script1');
expj.common.pscript.setReferenceComponentValue('KV0010010', 'KV0010010form1', '_KV0010010form1/g_DIRECT_DLV_FLG', 'false');
};
expj.KV0010010.KV0010010form1.rdoPlantTyp4.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0010010.KV0010010form1.rdoPlantTyp4['onClick' + i])) {
        expj.KV0010010.KV0010010form1.rdoPlantTyp4['onClick' + i]();
      }
    }
  }
};
expj.KV0010010.KV0010010form1.rdoPlantTyp4.executeAllOnDecision = function () {
  console.log('execute KV0010010form1/rdoPlantTyp4.onDecision');
  expj.KV0010010.KV0010010form1.executeAllOnDecision();
  expj.KV0010010.executeAllOnDecision();
};
expj.KV0010010.KV0010010form1.rdoPlantTyp4.executeOnLoad = function () {
  $('#expj-KV0010010-KV0010010form1-rdoPlantTyp4').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KV0010010', 'KV0010010form1', 'rdoPlantTyp4', this, 'RadioButton');
    }
  });
  expj.KV0010010.KV0010010form1.rdoPlantTyp4.executePScriptOnLoad();
};

expj.KV0010010.KV0010010form1.rdoPlantTyp4.executePScriptOnLoad = function () {
  console.log('execute KV0010010form1/rdoPlantTyp4.onLoad');
  var targetComponent = document.getElementById('expj-KV0010010-KV0010010form1-rdoPlantTyp4');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoPlantTyp" data-name="rdoPlantTyp4" value="true" <%= ("true".equals(TypeConverter.convert(aKV0010010Struct.getrdoPlantTyp4())))?"checked=\"checked\"":"" %> class="" id="expj-KV0010010-KV0010010form1-rdoPlantTyp4" ><label for="expj-KV0010010-KV0010010form1-rdoPlantTyp4"><%=CoreTools.getRBString("Expj.Cmt0474",rb)%></label></div><!--/td-->
<div class="div-td" style="width:614px;text-align:center;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:center;"></div><!--/td-->
<script class="expj-script-KV0010010-KV0010010form1-rdoPlantTyp5">
expj.KV0010010.KV0010010form1.rdoPlantTyp5 = {};
// script1="onClick;0;SET;_KV0010010form1/g_DIRECT_DLV_FLG=false"
expj.KV0010010.KV0010010form1.rdoPlantTyp5.onClick0 = function () {
  console.log('rdoPlantTyp5 script1');
expj.common.pscript.setReferenceComponentValue('KV0010010', 'KV0010010form1', '_KV0010010form1/g_DIRECT_DLV_FLG', 'false');
};
expj.KV0010010.KV0010010form1.rdoPlantTyp5.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0010010.KV0010010form1.rdoPlantTyp5['onClick' + i])) {
        expj.KV0010010.KV0010010form1.rdoPlantTyp5['onClick' + i]();
      }
    }
  }
};
expj.KV0010010.KV0010010form1.rdoPlantTyp5.executeAllOnDecision = function () {
  console.log('execute KV0010010form1/rdoPlantTyp5.onDecision');
  expj.KV0010010.KV0010010form1.executeAllOnDecision();
  expj.KV0010010.executeAllOnDecision();
};
expj.KV0010010.KV0010010form1.rdoPlantTyp5.executeOnLoad = function () {
  $('#expj-KV0010010-KV0010010form1-rdoPlantTyp5').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KV0010010', 'KV0010010form1', 'rdoPlantTyp5', this, 'RadioButton');
    }
  });
  expj.KV0010010.KV0010010form1.rdoPlantTyp5.executePScriptOnLoad();
};

expj.KV0010010.KV0010010form1.rdoPlantTyp5.executePScriptOnLoad = function () {
  console.log('execute KV0010010form1/rdoPlantTyp5.onLoad');
  var targetComponent = document.getElementById('expj-KV0010010-KV0010010form1-rdoPlantTyp5');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoPlantTyp" data-name="rdoPlantTyp5" value="true" <%= ("true".equals(TypeConverter.convert(aKV0010010Struct.getrdoPlantTyp5())))?"checked=\"checked\"":"" %> class="" id="expj-KV0010010-KV0010010form1-rdoPlantTyp5" ><label for="expj-KV0010010-KV0010010form1-rdoPlantTyp5"><%=CoreTools.getRBString("Expj.Cmt0475",rb)%></label></div><!--/td-->
<div class="div-td" style="width:614px;text-align:center;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:center;"></div><!--/td-->
<script class="expj-script-KV0010010-KV0010010form1-rdoPlantTyp1">
expj.KV0010010.KV0010010form1.rdoPlantTyp1 = {};
// script1="onClick;0;SET;_KV0010010form1/g_DIRECT_DLV_FLG=false"
expj.KV0010010.KV0010010form1.rdoPlantTyp1.onClick0 = function () {
  console.log('rdoPlantTyp1 script1');
expj.common.pscript.setReferenceComponentValue('KV0010010', 'KV0010010form1', '_KV0010010form1/g_DIRECT_DLV_FLG', 'false');
};
expj.KV0010010.KV0010010form1.rdoPlantTyp1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0010010.KV0010010form1.rdoPlantTyp1['onClick' + i])) {
        expj.KV0010010.KV0010010form1.rdoPlantTyp1['onClick' + i]();
      }
    }
  }
};
expj.KV0010010.KV0010010form1.rdoPlantTyp1.executeAllOnDecision = function () {
  console.log('execute KV0010010form1/rdoPlantTyp1.onDecision');
  expj.KV0010010.KV0010010form1.executeAllOnDecision();
  expj.KV0010010.executeAllOnDecision();
};
expj.KV0010010.KV0010010form1.rdoPlantTyp1.executeOnLoad = function () {
  $('#expj-KV0010010-KV0010010form1-rdoPlantTyp1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KV0010010', 'KV0010010form1', 'rdoPlantTyp1', this, 'RadioButton');
    }
  });
  expj.KV0010010.KV0010010form1.rdoPlantTyp1.executePScriptOnLoad();
};

expj.KV0010010.KV0010010form1.rdoPlantTyp1.executePScriptOnLoad = function () {
  console.log('execute KV0010010form1/rdoPlantTyp1.onLoad');
  var targetComponent = document.getElementById('expj-KV0010010-KV0010010form1-rdoPlantTyp1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoPlantTyp" data-name="rdoPlantTyp1" value="true" <%= ("true".equals(TypeConverter.convert(aKV0010010Struct.getrdoPlantTyp1())))?"checked=\"checked\"":"" %> class="" id="expj-KV0010010-KV0010010form1-rdoPlantTyp1" ><label for="expj-KV0010010-KV0010010form1-rdoPlantTyp1"><%=CoreTools.getRBString("Expj.Cmt0459",rb)%></label></div><!--/td-->
<div class="div-td" style="width:614px;text-align:center;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:center;"></div><!--/td-->
<script class="expj-script-KV0010010-KV0010010form1-rdoPlantTyp2">
expj.KV0010010.KV0010010form1.rdoPlantTyp2 = {};
// script1="onClick;0;UNMASK;_KV0010010form1/g_DIRECT_DLV_FLG"
expj.KV0010010.KV0010010form1.rdoPlantTyp2.onClick0 = function () {
  console.log('rdoPlantTyp2 script1');
expj.common.pscript.setUnMaskToReferenceComponent('KV0010010', 'KV0010010form1', '_KV0010010form1/g_DIRECT_DLV_FLG');
};
expj.KV0010010.KV0010010form1.rdoPlantTyp2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0010010.KV0010010form1.rdoPlantTyp2['onClick' + i])) {
        expj.KV0010010.KV0010010form1.rdoPlantTyp2['onClick' + i]();
      }
    }
  }
};
expj.KV0010010.KV0010010form1.rdoPlantTyp2.executeAllOnDecision = function () {
  console.log('execute KV0010010form1/rdoPlantTyp2.onDecision');
  expj.KV0010010.KV0010010form1.executeAllOnDecision();
  expj.KV0010010.executeAllOnDecision();
};
expj.KV0010010.KV0010010form1.rdoPlantTyp2.executeOnLoad = function () {
  $('#expj-KV0010010-KV0010010form1-rdoPlantTyp2').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KV0010010', 'KV0010010form1', 'rdoPlantTyp2', this, 'RadioButton');
    }
  });
  expj.KV0010010.KV0010010form1.rdoPlantTyp2.executePScriptOnLoad();
};

expj.KV0010010.KV0010010form1.rdoPlantTyp2.executePScriptOnLoad = function () {
  console.log('execute KV0010010form1/rdoPlantTyp2.onLoad');
  var targetComponent = document.getElementById('expj-KV0010010-KV0010010form1-rdoPlantTyp2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoPlantTyp" data-name="rdoPlantTyp2" value="true" <%= ("true".equals(TypeConverter.convert(aKV0010010Struct.getrdoPlantTyp2())))?"checked=\"checked\"":"" %> class="" id="expj-KV0010010-KV0010010form1-rdoPlantTyp2" ><label for="expj-KV0010010-KV0010010form1-rdoPlantTyp2"><%=CoreTools.getRBString("Expj.Cmt0454",rb)%></label></div><!--/td-->
<script class="expj-script-KV0010010-KV0010010form1-g_DIRECT_DLV_FLG">
expj.KV0010010.KV0010010form1.g_DIRECT_DLV_FLG = {};
expj.KV0010010.KV0010010form1.g_DIRECT_DLV_FLG.executeAllOnDecision = function () {
  console.log('execute KV0010010form1/g_DIRECT_DLV_FLG.onDecision');
  expj.KV0010010.KV0010010form1.executeAllOnDecision();
  expj.KV0010010.executeAllOnDecision();
};
expj.KV0010010.KV0010010form1.g_DIRECT_DLV_FLG.executeOnLoad = function () {
  $('#expj-KV0010010-KV0010010form1-g_DIRECT_DLV_FLG').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KV0010010', 'KV0010010form1', 'g_DIRECT_DLV_FLG', this, 'CheckBox');
    }
  });
  expj.KV0010010.KV0010010form1.g_DIRECT_DLV_FLG.executePScriptOnLoad();
};

expj.KV0010010.KV0010010form1.g_DIRECT_DLV_FLG.executePScriptOnLoad = function () {
  console.log('execute KV0010010form1/g_DIRECT_DLV_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KV0010010-KV0010010form1-g_DIRECT_DLV_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:614px;text-align:left;"><input type="checkbox" name="g_DIRECT_DLV_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aKV0010010Struct.getg_DIRECT_DLV_FLG())) || "1".equals(TypeConverter.convert(aKV0010010Struct.getg_DIRECT_DLV_FLG())))?"checked=\"checked\"":"" %>  class="KV0010010-focus-move" id="expj-KV0010010-KV0010010form1-g_DIRECT_DLV_FLG"><label for="expj-KV0010010-KV0010010form1-g_DIRECT_DLV_FLG"><%=CoreTools.getRBString("Expj.DIRECT_DLV_FLG",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:center;"></div><!--/td-->
<script class="expj-script-KV0010010-KV0010010form1-rdoPlantTyp3">
expj.KV0010010.KV0010010form1.rdoPlantTyp3 = {};
// script1="onClick;0;SET;_KV0010010form1/g_DIRECT_DLV_FLG=false"
expj.KV0010010.KV0010010form1.rdoPlantTyp3.onClick0 = function () {
  console.log('rdoPlantTyp3 script1');
expj.common.pscript.setReferenceComponentValue('KV0010010', 'KV0010010form1', '_KV0010010form1/g_DIRECT_DLV_FLG', 'false');
};
expj.KV0010010.KV0010010form1.rdoPlantTyp3.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0010010.KV0010010form1.rdoPlantTyp3['onClick' + i])) {
        expj.KV0010010.KV0010010form1.rdoPlantTyp3['onClick' + i]();
      }
    }
  }
};
expj.KV0010010.KV0010010form1.rdoPlantTyp3.executeAllOnDecision = function () {
  console.log('execute KV0010010form1/rdoPlantTyp3.onDecision');
  expj.KV0010010.KV0010010form1.executeAllOnDecision();
  expj.KV0010010.executeAllOnDecision();
};
expj.KV0010010.KV0010010form1.rdoPlantTyp3.executeOnLoad = function () {
  $('#expj-KV0010010-KV0010010form1-rdoPlantTyp3').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KV0010010', 'KV0010010form1', 'rdoPlantTyp3', this, 'RadioButton');
    }
  });
  expj.KV0010010.KV0010010form1.rdoPlantTyp3.executePScriptOnLoad();
};

expj.KV0010010.KV0010010form1.rdoPlantTyp3.executePScriptOnLoad = function () {
  console.log('execute KV0010010form1/rdoPlantTyp3.onLoad');
  var targetComponent = document.getElementById('expj-KV0010010-KV0010010form1-rdoPlantTyp3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoPlantTyp" data-name="rdoPlantTyp3" value="true" <%= ("true".equals(TypeConverter.convert(aKV0010010Struct.getrdoPlantTyp3())))?"checked=\"checked\"":"" %> class="" id="expj-KV0010010-KV0010010form1-rdoPlantTyp3" ><label for="expj-KV0010010-KV0010010form1-rdoPlantTyp3"><%=CoreTools.getRBString("Expj.Cmt0460",rb)%></label></div><!--/td-->
<div class="div-td" style="width:614px;text-align:center;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:614px;text-align:center;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:center;"></div><!--/td-->
<script class="expj-script-KV0010010-KV0010010form1-rdoPlantTyp6">
expj.KV0010010.KV0010010form1.rdoPlantTyp6 = {};
// script1="onClick;0;SET;_KV0010010form1/g_DIRECT_DLV_FLG=false"
expj.KV0010010.KV0010010form1.rdoPlantTyp6.onClick0 = function () {
  console.log('rdoPlantTyp6 script1');
expj.common.pscript.setReferenceComponentValue('KV0010010', 'KV0010010form1', '_KV0010010form1/g_DIRECT_DLV_FLG', 'false');
};
expj.KV0010010.KV0010010form1.rdoPlantTyp6.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0010010.KV0010010form1.rdoPlantTyp6['onClick' + i])) {
        expj.KV0010010.KV0010010form1.rdoPlantTyp6['onClick' + i]();
      }
    }
  }
};
expj.KV0010010.KV0010010form1.rdoPlantTyp6.executeAllOnDecision = function () {
  console.log('execute KV0010010form1/rdoPlantTyp6.onDecision');
  expj.KV0010010.KV0010010form1.executeAllOnDecision();
  expj.KV0010010.executeAllOnDecision();
};
expj.KV0010010.KV0010010form1.rdoPlantTyp6.executeOnLoad = function () {
  $('#expj-KV0010010-KV0010010form1-rdoPlantTyp6').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KV0010010', 'KV0010010form1', 'rdoPlantTyp6', this, 'RadioButton');
    }
  });
  expj.KV0010010.KV0010010form1.rdoPlantTyp6.executePScriptOnLoad();
};

expj.KV0010010.KV0010010form1.rdoPlantTyp6.executePScriptOnLoad = function () {
  console.log('execute KV0010010form1/rdoPlantTyp6.onLoad');
  var targetComponent = document.getElementById('expj-KV0010010-KV0010010form1-rdoPlantTyp6');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoPlantTyp" data-name="rdoPlantTyp6" value="true" <%= ("true".equals(TypeConverter.convert(aKV0010010Struct.getrdoPlantTyp6())))?"checked=\"checked\"":"" %> class="" id="expj-KV0010010-KV0010010form1-rdoPlantTyp6" ><label for="expj-KV0010010-KV0010010form1-rdoPlantTyp6"><%=CoreTools.getRBString("Expj.Cmt0496",rb)%></label></div><!--/td-->
<div class="div-td" style="width:614px;text-align:center;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:center;"></div><!--/td-->
<script class="expj-script-KV0010010-KV0010010form1-rdoPlantTyp7">
expj.KV0010010.KV0010010form1.rdoPlantTyp7 = {};
// script1="onClick;0;SET;_KV0010010form1/g_DIRECT_DLV_FLG=false"
expj.KV0010010.KV0010010form1.rdoPlantTyp7.onClick0 = function () {
  console.log('rdoPlantTyp7 script1');
expj.common.pscript.setReferenceComponentValue('KV0010010', 'KV0010010form1', '_KV0010010form1/g_DIRECT_DLV_FLG', 'false');
};
expj.KV0010010.KV0010010form1.rdoPlantTyp7.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0010010.KV0010010form1.rdoPlantTyp7['onClick' + i])) {
        expj.KV0010010.KV0010010form1.rdoPlantTyp7['onClick' + i]();
      }
    }
  }
};
expj.KV0010010.KV0010010form1.rdoPlantTyp7.executeAllOnDecision = function () {
  console.log('execute KV0010010form1/rdoPlantTyp7.onDecision');
  expj.KV0010010.KV0010010form1.executeAllOnDecision();
  expj.KV0010010.executeAllOnDecision();
};
expj.KV0010010.KV0010010form1.rdoPlantTyp7.executeOnLoad = function () {
  $('#expj-KV0010010-KV0010010form1-rdoPlantTyp7').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KV0010010', 'KV0010010form1', 'rdoPlantTyp7', this, 'RadioButton');
    }
  });
  expj.KV0010010.KV0010010form1.rdoPlantTyp7.executePScriptOnLoad();
};

expj.KV0010010.KV0010010form1.rdoPlantTyp7.executePScriptOnLoad = function () {
  console.log('execute KV0010010form1/rdoPlantTyp7.onLoad');
  var targetComponent = document.getElementById('expj-KV0010010-KV0010010form1-rdoPlantTyp7');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoPlantTyp" data-name="rdoPlantTyp7" value="true" <%= ("true".equals(TypeConverter.convert(aKV0010010Struct.getrdoPlantTyp7())))?"checked=\"checked\"":"" %> class="" id="expj-KV0010010-KV0010010form1-rdoPlantTyp7" ><label for="expj-KV0010010-KV0010010form1-rdoPlantTyp7"><%=CoreTools.getRBString("Expj.Cmt0497",rb)%></label></div><!--/td-->
<div class="div-td" style="width:614px;text-align:center;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:center;"></div><!--/td-->
<script class="expj-script-KV0010010-KV0010010form1-rdoPlantTyp8">
expj.KV0010010.KV0010010form1.rdoPlantTyp8 = {};
// script1="onClick;0;SET;_KV0010010form1/g_DIRECT_DLV_FLG=false"
expj.KV0010010.KV0010010form1.rdoPlantTyp8.onClick0 = function () {
  console.log('rdoPlantTyp8 script1');
expj.common.pscript.setReferenceComponentValue('KV0010010', 'KV0010010form1', '_KV0010010form1/g_DIRECT_DLV_FLG', 'false');
};
expj.KV0010010.KV0010010form1.rdoPlantTyp8.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0010010.KV0010010form1.rdoPlantTyp8['onClick' + i])) {
        expj.KV0010010.KV0010010form1.rdoPlantTyp8['onClick' + i]();
      }
    }
  }
};
expj.KV0010010.KV0010010form1.rdoPlantTyp8.executeAllOnDecision = function () {
  console.log('execute KV0010010form1/rdoPlantTyp8.onDecision');
  expj.KV0010010.KV0010010form1.executeAllOnDecision();
  expj.KV0010010.executeAllOnDecision();
};
expj.KV0010010.KV0010010form1.rdoPlantTyp8.executeOnLoad = function () {
  $('#expj-KV0010010-KV0010010form1-rdoPlantTyp8').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KV0010010', 'KV0010010form1', 'rdoPlantTyp8', this, 'RadioButton');
    }
  });
  expj.KV0010010.KV0010010form1.rdoPlantTyp8.executePScriptOnLoad();
};

expj.KV0010010.KV0010010form1.rdoPlantTyp8.executePScriptOnLoad = function () {
  console.log('execute KV0010010form1/rdoPlantTyp8.onLoad');
  var targetComponent = document.getElementById('expj-KV0010010-KV0010010form1-rdoPlantTyp8');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoPlantTyp" data-name="rdoPlantTyp8" value="true" <%= ("true".equals(TypeConverter.convert(aKV0010010Struct.getrdoPlantTyp8())))?"checked=\"checked\"":"" %> class="" id="expj-KV0010010-KV0010010form1-rdoPlantTyp8" ><label for="expj-KV0010010-KV0010010form1-rdoPlantTyp8"><%=CoreTools.getRBString("Expj.Cmt0498",rb)%></label></div><!--/td-->
<div class="div-td" style="width:614px;text-align:center;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:614px;text-align:center;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:center;"></div><!--/td-->
<script class="expj-script-KV0010010-KV0010010form1-rdoPlantTyp9">
expj.KV0010010.KV0010010form1.rdoPlantTyp9 = {};
// script1="onClick;0;SET;_KV0010010form1/g_DIRECT_DLV_FLG=false"
expj.KV0010010.KV0010010form1.rdoPlantTyp9.onClick0 = function () {
  console.log('rdoPlantTyp9 script1');
expj.common.pscript.setReferenceComponentValue('KV0010010', 'KV0010010form1', '_KV0010010form1/g_DIRECT_DLV_FLG', 'false');
};
expj.KV0010010.KV0010010form1.rdoPlantTyp9.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0010010.KV0010010form1.rdoPlantTyp9['onClick' + i])) {
        expj.KV0010010.KV0010010form1.rdoPlantTyp9['onClick' + i]();
      }
    }
  }
};
expj.KV0010010.KV0010010form1.rdoPlantTyp9.executeAllOnDecision = function () {
  console.log('execute KV0010010form1/rdoPlantTyp9.onDecision');
  expj.KV0010010.KV0010010form1.executeAllOnDecision();
  expj.KV0010010.executeAllOnDecision();
};
expj.KV0010010.KV0010010form1.rdoPlantTyp9.executeOnLoad = function () {
  $('#expj-KV0010010-KV0010010form1-rdoPlantTyp9').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KV0010010', 'KV0010010form1', 'rdoPlantTyp9', this, 'RadioButton');
    }
  });
  expj.KV0010010.KV0010010form1.rdoPlantTyp9.executePScriptOnLoad();
};

expj.KV0010010.KV0010010form1.rdoPlantTyp9.executePScriptOnLoad = function () {
  console.log('execute KV0010010form1/rdoPlantTyp9.onLoad');
  var targetComponent = document.getElementById('expj-KV0010010-KV0010010form1-rdoPlantTyp9');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoPlantTyp" data-name="rdoPlantTyp9" value="true" <%= ("true".equals(TypeConverter.convert(aKV0010010Struct.getrdoPlantTyp9())))?"checked=\"checked\"":"" %> class="" id="expj-KV0010010-KV0010010form1-rdoPlantTyp9" ><label for="expj-KV0010010-KV0010010form1-rdoPlantTyp9"><%=CoreTools.getRBString("Expj.Cmt6709",rb)%></label></div><!--/td-->
<div class="div-td" style="width:614px;text-align:center;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!--ここにバッチ選択用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KV0010010-KV0010010button1">
expj.KV0010010.KV0010010button1 = {};
expj.KV0010010.KV0010010button1.executeAllOnDecision = function () {
  console.log('execute KV0010010button1.onDecision');
};
expj.KV0010010.KV0010010button1.executeOnLoad = function () {
  expj.KV0010010.KV0010010button1.executePScriptOnLoad();
};

expj.KV0010010.KV0010010button1.executePScriptOnLoad = function () {
  console.log('execute KV0010010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KV0010010-KV0010010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KV0010010-KV0010010button1-execute">
expj.KV0010010.KV0010010button1.execute = {};
// script1="onClick;0;CHK;_KV0010010form1/rdoPlantTyp1[eq]true@*3,*1"
expj.KV0010010.KV0010010button1.execute.onClick0 = function () {
  console.log('execute script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0010010', 'KV0010010button1', '_KV0010010form1/rdoPlantTyp1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;1;CHK;_KV0010010form1/rdoPlantTyp2[eq]true@*4,*2"
expj.KV0010010.KV0010010button1.execute.child1 = function () {
  console.log('execute script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0010010', 'KV0010010button1', '_KV0010010form1/rdoPlantTyp2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;2;CHK;_KV0010010form1/rdoPlantTyp3[eq]true@*5,*6"
expj.KV0010010.KV0010010button1.execute.child2 = function () {
  console.log('execute script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0010010', 'KV0010010button1', '_KV0010010form1/rdoPlantTyp3'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script4="child;3;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KV0010010form1/*@KV0010010Servlet,,$KV09017"
expj.KV0010010.KV0010010button1.execute.child3 = function () {
  console.log('execute script4');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KV0010010', 'KV0010010button1', '_KV0010010form1/*', 'KV0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KV0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KV0010010', response);
expj.common.updateBusinessScreenTab('KV0010010', contents);
};
expj.common.pscript.callConfirm('KV0010010', 'KV0010010button1', 'KV09017', okEvent);
};
// script5="child;4;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KV0010010form1/*@KV0010010Servlet,,$KV09018"
expj.KV0010010.KV0010010button1.execute.child4 = function () {
  console.log('execute script5');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KV0010010', 'KV0010010button1', '_KV0010010form1/*', 'KV0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KV0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KV0010010', response);
expj.common.updateBusinessScreenTab('KV0010010', contents);
};
expj.common.pscript.callConfirm('KV0010010', 'KV0010010button1', 'KV09018', okEvent);
};
// script6="child;5;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KV0010010form1/*@KV0010010Servlet,,$KV09019"
expj.KV0010010.KV0010010button1.execute.child5 = function () {
  console.log('execute script6');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KV0010010', 'KV0010010button1', '_KV0010010form1/*', 'KV0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KV0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KV0010010', response);
expj.common.updateBusinessScreenTab('KV0010010', contents);
};
expj.common.pscript.callConfirm('KV0010010', 'KV0010010button1', 'KV09019', okEvent);
};
// script7="child;6;CHK;_KV0010010form1/rdoPlantTyp4[eq]true@*8,*7"
expj.KV0010010.KV0010010button1.execute.child6 = function () {
  console.log('execute script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0010010', 'KV0010010button1', '_KV0010010form1/rdoPlantTyp4'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script8="child;7;CHK;_KV0010010form1/rdoPlantTyp5[eq]true@*9,*10"
expj.KV0010010.KV0010010button1.execute.child7 = function () {
  console.log('execute script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0010010', 'KV0010010button1', '_KV0010010form1/rdoPlantTyp5'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script9="child;8;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KV0010010form1/*@KV0010010Servlet,,$KV09020"
expj.KV0010010.KV0010010button1.execute.child8 = function () {
  console.log('execute script9');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KV0010010', 'KV0010010button1', '_KV0010010form1/*', 'KV0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KV0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KV0010010', response);
expj.common.updateBusinessScreenTab('KV0010010', contents);
};
expj.common.pscript.callConfirm('KV0010010', 'KV0010010button1', 'KV09020', okEvent);
};
// script10="child;9;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KV0010010form1/*@KV0010010Servlet,,$KV09021"
expj.KV0010010.KV0010010button1.execute.child9 = function () {
  console.log('execute script10');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KV0010010', 'KV0010010button1', '_KV0010010form1/*', 'KV0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KV0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KV0010010', response);
expj.common.updateBusinessScreenTab('KV0010010', contents);
};
expj.common.pscript.callConfirm('KV0010010', 'KV0010010button1', 'KV09021', okEvent);
};
// script11="child;10;CHK;_KV0010010form1/rdoPlantTyp6[eq]true@*11,*12"
expj.KV0010010.KV0010010button1.execute.child10 = function () {
  console.log('execute script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0010010', 'KV0010010button1', '_KV0010010form1/rdoPlantTyp6'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script12="child;11;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KV0010010form1/*@KV0010010Servlet,,$KV09022"
expj.KV0010010.KV0010010button1.execute.child11 = function () {
  console.log('execute script12');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KV0010010', 'KV0010010button1', '_KV0010010form1/*', 'KV0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KV0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KV0010010', response);
expj.common.updateBusinessScreenTab('KV0010010', contents);
};
expj.common.pscript.callConfirm('KV0010010', 'KV0010010button1', 'KV09022', okEvent);
};
// script13="child;12;CHK;_KV0010010form1/rdoPlantTyp7[eq]true@*13,*14"
expj.KV0010010.KV0010010button1.execute.child12 = function () {
  console.log('execute script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0010010', 'KV0010010button1', '_KV0010010form1/rdoPlantTyp7'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script14="child;13;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KV0010010form1/*@KV0010010Servlet,,$KV09023"
expj.KV0010010.KV0010010button1.execute.child13 = function () {
  console.log('execute script14');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KV0010010', 'KV0010010button1', '_KV0010010form1/*', 'KV0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KV0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KV0010010', response);
expj.common.updateBusinessScreenTab('KV0010010', contents);
};
expj.common.pscript.callConfirm('KV0010010', 'KV0010010button1', 'KV09023', okEvent);
};
// script15="child;14;CHK;_KV0010010form1/rdoPlantTyp8[eq]true@*15,*16"
expj.KV0010010.KV0010010button1.execute.child14 = function () {
  console.log('execute script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0010010', 'KV0010010button1', '_KV0010010form1/rdoPlantTyp8'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script16="child;15;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KV0010010form1/*@KV0010010Servlet,,$KV09024"
expj.KV0010010.KV0010010button1.execute.child15 = function () {
  console.log('execute script16');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KV0010010', 'KV0010010button1', '_KV0010010form1/*', 'KV0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KV0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KV0010010', response);
expj.common.updateBusinessScreenTab('KV0010010', contents);
};
expj.common.pscript.callConfirm('KV0010010', 'KV0010010button1', 'KV09024', okEvent);
};
// script17="child;16;CHK;_KV0010010form1/rdoPlantTyp9[eq]true@*17,!AZ00006"
expj.KV0010010.KV0010010button1.execute.child16 = function () {
  console.log('execute script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0010010', 'KV0010010button1', '_KV0010010form1/rdoPlantTyp9'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
} else {
expj.common.pscript.viewErrorMessage('KV0010010', 'KV0010010button1', 'AZ00006');
}
};
// script18="child;17;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KV0010010form1/*@KV0010010Servlet,,$KV09028"
expj.KV0010010.KV0010010button1.execute.child17 = function () {
  console.log('execute script18');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KV0010010', 'KV0010010button1', '_KV0010010form1/*', 'KV0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KV0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KV0010010', response);
expj.common.updateBusinessScreenTab('KV0010010', contents);
};
expj.common.pscript.callConfirm('KV0010010', 'KV0010010button1', 'KV09028', okEvent);
};
expj.KV0010010.KV0010010button1.execute.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0010010.KV0010010button1.execute['onClick' + i])) {
        expj.KV0010010.KV0010010button1.execute['onClick' + i]();
      }
    }
  }
};
expj.KV0010010.KV0010010button1.execute.executeAllOnDecision = function () {
};
expj.KV0010010.KV0010010button1.execute.executeOnLoad = function () {
  $('#expj-KV0010010-KV0010010button1-execute').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KV0010010', 'KV0010010button1', 'execute', this, 'Button');
    }
  });
  expj.KV0010010.KV0010010button1.execute.executePScriptOnLoad();
};

expj.KV0010010.KV0010010button1.execute.executePScriptOnLoad = function () {
  console.log('execute KV0010010button1/execute.onLoad');
  var targetComponent = document.getElementById('expj-KV0010010-KV0010010button1-execute');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:105px;float:none;height:30px;"><button type="button" id="expj-KV0010010-KV0010010button1-execute" name="execute" class="KV0010010-focus-move" style="width:px;"><%=CoreTools.getRBString("Expj.BtnExecute",rb)%></button><!-- 実行ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:92px;"></div><!--/td-->
</div><!--/tr-->
<!--second end --><!--third start --><div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<!--third end --><!--four start --><div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - -10px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">KV0010010 Revision: 1.5  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KV0010010-KV0010010button0">
expj.KV0010010.KV0010010button0 = {};
expj.KV0010010.KV0010010button0.executeAllOnDecision = function () {
  console.log('execute KV0010010button0.onDecision');
};
expj.KV0010010.KV0010010button0.executeOnLoad = function () {
  expj.KV0010010.KV0010010button0.executePScriptOnLoad();
};

expj.KV0010010.KV0010010button0.executePScriptOnLoad = function () {
  console.log('execute KV0010010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KV0010010-KV0010010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KV0010010-KV0010010button0-clear">
expj.KV0010010.KV0010010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KV0010010Servlet,,$ZZ07008"
expj.KV0010010.KV0010010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KV0010010', 'KV0010010button0', '', 'KV0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KV0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KV0010010', response);
expj.common.updateBusinessScreenTab('KV0010010', contents);
};
expj.common.pscript.callConfirm('KV0010010', 'KV0010010button0', 'ZZ07008', okEvent);
};
expj.KV0010010.KV0010010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0010010.KV0010010button0.clear['onClick' + i])) {
        expj.KV0010010.KV0010010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.KV0010010.KV0010010button0.clear.executeAllOnDecision = function () {
};
expj.KV0010010.KV0010010button0.clear.executeOnLoad = function () {
  $('#expj-KV0010010-KV0010010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KV0010010', 'KV0010010button0', 'clear', this, 'Button');
    }
  });
  expj.KV0010010.KV0010010button0.clear.executePScriptOnLoad();
};

expj.KV0010010.KV0010010button0.clear.executePScriptOnLoad = function () {
  console.log('execute KV0010010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-KV0010010-KV0010010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KV0010010-KV0010010button0-clear" name="clear" class="KV0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KV0010010-KV0010010button0-close">
expj.KV0010010.KV0010010button0.close = {};
// script1="onClick;0;CLOSE"
expj.KV0010010.KV0010010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('KV0010010');
};
expj.KV0010010.KV0010010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0010010.KV0010010button0.close['onClick' + i])) {
        expj.KV0010010.KV0010010button0.close['onClick' + i]();
      }
    }
  }
};
expj.KV0010010.KV0010010button0.close.executeAllOnDecision = function () {
};
expj.KV0010010.KV0010010button0.close.executeOnLoad = function () {
  $('#expj-KV0010010-KV0010010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KV0010010', 'KV0010010button0', 'close', this, 'Button');
    }
  });
  expj.KV0010010.KV0010010button0.close.executePScriptOnLoad();
};

expj.KV0010010.KV0010010button0.close.executePScriptOnLoad = function () {
  console.log('execute KV0010010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-KV0010010-KV0010010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KV0010010-KV0010010button0-close" name="close" class="KV0010010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
<!--four end --></div><!-- /table1 -->
</div><!-- expj-business-screen-KV0010010 (END)-->
<%
MessageStruct msgStruct = aKV0010010Control.getMsgStruct();
%><%@ include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KV0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KV0010010)) {
  expj.common.treeInstanceMap.KV0010010 = {};
}
expj.common.treeInstanceMap.KV0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KV0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KV0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KV0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KV0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KV0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KV0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KV0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KV0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KV0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KV0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KV0010010)) {
  expj.common.detailDialogMap.KV0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KV0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KV0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KV0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.KV0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KV0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KV0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KV0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KV0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KV0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KV0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KV0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KV0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KV0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KV0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KV0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KV0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KV0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KV0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KV0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KV0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KV0010010)) {
  expj.common.viewInstanceMap.KV0010010 = {};
}
expj.common.viewInstanceMap.KV0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.KV0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KV0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KV0010010.<%=viewId %>.init = function () {
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
    expj.KV0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KV0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KV0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KV0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KV0010010_init">
/**
 * KV0010010用のロード完了時初期化関数
 */
expj.KV0010010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KV0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KV0010010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KV0010010');
  expj.common.calendarInstanceMap.KV0010010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KV0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KV0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.KV0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KV0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KV0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KV0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KV0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KV0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KV0010010-<%=detailId %>');
<%
 }
%>
  try{expj.KV0010010.KV0010010form1.rdoPlantTyp4.executeOnLoad();}catch(e){};
  try{expj.KV0010010.KV0010010form1.rdoPlantTyp5.executeOnLoad();}catch(e){};
  try{expj.KV0010010.KV0010010form1.rdoPlantTyp1.executeOnLoad();}catch(e){};
  try{expj.KV0010010.KV0010010form1.rdoPlantTyp2.executeOnLoad();}catch(e){};
  try{expj.KV0010010.KV0010010form1.g_DIRECT_DLV_FLG.executeOnLoad();}catch(e){};
  try{expj.KV0010010.KV0010010form1.rdoPlantTyp3.executeOnLoad();}catch(e){};
  try{expj.KV0010010.KV0010010form1.rdoPlantTyp6.executeOnLoad();}catch(e){};
  try{expj.KV0010010.KV0010010form1.rdoPlantTyp7.executeOnLoad();}catch(e){};
  try{expj.KV0010010.KV0010010form1.rdoPlantTyp8.executeOnLoad();}catch(e){};
  try{expj.KV0010010.KV0010010form1.rdoPlantTyp9.executeOnLoad();}catch(e){};
  try{expj.KV0010010.KV0010010button1.execute.executeOnLoad();}catch(e){};
  try{expj.KV0010010.KV0010010button0.clear.executeOnLoad();}catch(e){};
  try{expj.KV0010010.KV0010010button0.close.executeOnLoad();}catch(e){};
  try{expj.KV0010010.KV0010010form1.executeOnLoad();}catch(e){};
  try{expj.KV0010010.KV0010010button1.executeOnLoad();}catch(e){};
  try{expj.KV0010010.KV0010010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KV0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KV0010010', 'KV0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KV0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KV0010010-focus-move');
  // 初期フォーカス当てる処理
  $('.KV0010010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KV0010010', '<%=request.getContextPath() %>');
};

/**
 * KV0010010の全体onDecision処理
 */
expj.KV0010010.executeAllOnDecision = function () {
  expj.KV0010010.KV0010010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KV0010010_console">
expj.KV0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>