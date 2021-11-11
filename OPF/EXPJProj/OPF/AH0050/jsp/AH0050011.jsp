<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:42:47 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AH0050\AH0050011.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AH0050.*" %>
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
<jsp:useBean id="aAH0050010Control" class="com.nec.jp.orteus.metamorBase.AH0050.AH0050010Control" scope="request"/>
<jsp:useBean id="aAH0050010Struct" class="com.nec.jp.orteus.metamorBase.AH0050.AH0050010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

実棚入力サブ1
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0050/jsp/AH0050011.jsp,v $
$Author: geng-jia $    
$Revision: 1.13 $ $Date: 2017/02/22 02:06:07 $
********************************************************* --%>
<html>
<head>
<title>実棚入力サブ1</title>
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
<script class="expj-script-AH0050010_init">
  // AH0050010名前空間
  expj.AH0050010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AH0050010" data-screen="AH0050011" data-newdata="<%=aAH0050010Control.isNewData() %>">
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
              <script class="expj-script-AH0050010-AH0050011form1">
expj.AH0050010.AH0050011form1 = {};
// script1="onLoad;0;CALL;child@0,3"
expj.AH0050010.AH0050011form1.onLoad0 = function () {
  console.log('AH0050011form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child3)){this.child3();}
};
// script2="child;0;CHK;_AH0050011form1/h_JOB_ODR_CD_STOCK_flg[eq]1@*1,*2"
expj.AH0050010.AH0050011form1.child0 = function () {
  console.log('AH0050011form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050011form1', '_AH0050011form1/h_JOB_ODR_CD_STOCK_flg'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;SET;_AH0050011form1/c_JOB_ODR_CD_STOCK_flg=true"
expj.AH0050010.AH0050011form1.child1 = function () {
  console.log('AH0050011form1 script3');
expj.common.pscript.setReferenceComponentValue('AH0050010', 'AH0050011form1', '_AH0050011form1/c_JOB_ODR_CD_STOCK_flg', 'true');
};
// script4="child;2;SET;_AH0050011form1/c_JOB_ODR_CD_STOCK_flg=false"
expj.AH0050010.AH0050011form1.child2 = function () {
  console.log('AH0050011form1 script4');
expj.common.pscript.setReferenceComponentValue('AH0050010', 'AH0050011form1', '_AH0050011form1/c_JOB_ODR_CD_STOCK_flg', 'false');
};
// script5="child;3;CHK;_AH0050011form1/h_JOB_ODR_CD_STOCK_flg[eq]1@*4,*5"
expj.AH0050010.AH0050011form1.child3 = function () {
  console.log('AH0050011form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050011form1', '_AH0050011form1/h_JOB_ODR_CD_STOCK_flg'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;4;UNMASK;_AH0050011form1/JOB_ODR_CD,_AH0050011form1/PeekerJOB_ODR_CD"
expj.AH0050010.AH0050011form1.child4 = function () {
  console.log('AH0050011form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AH0050010', 'AH0050011form1', '_AH0050011form1/JOB_ODR_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AH0050010', 'AH0050011form1', '_AH0050011form1/PeekerJOB_ODR_CD');
};
// script7="child;5;MASK;_AH0050011form1/JOB_ODR_CD,_AH0050011form1/PeekerJOB_ODR_CD"
expj.AH0050010.AH0050011form1.child5 = function () {
  console.log('AH0050011form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050011form1', '_AH0050011form1/JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050011form1', '_AH0050011form1/PeekerJOB_ODR_CD');
};
// script8="onLoad;1;CALL;onDecision@0,1"
expj.AH0050010.AH0050011form1.onLoad1 = function () {
  console.log('AH0050011form1 script8');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script9="onDecision;0;CHKRQ;A@*6,*9"
expj.AH0050010.AH0050011form1.onDecision0 = function () {
  console.log('AH0050011form1 script9');
if (expj.common.pscript.satisfiedRequiredComponent('AH0050010', 'A')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script10="child;6;CHK;_AH0050011form1/c_JOB_ODR_CD_STOCK_flg[eq]true@*7,*8"
expj.AH0050010.AH0050011form1.child6 = function () {
  console.log('AH0050011form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050011form1', '_AH0050011form1/c_JOB_ODR_CD_STOCK_flg'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script11="child;7;CHKRQ;B@*8,*9"
expj.AH0050010.AH0050011form1.child7 = function () {
  console.log('AH0050011form1 script11');
if (expj.common.pscript.satisfiedRequiredComponent('AH0050010', 'B')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script12="child;8;UNMASK;_AH0050011button1/insert_sub1"
expj.AH0050010.AH0050011form1.child8 = function () {
  console.log('AH0050011form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('AH0050010', 'AH0050011form1', '_AH0050011button1/insert_sub1');
};
// script13="child;9;MASK;_AH0050011button1/insert_sub1"
expj.AH0050010.AH0050011form1.child9 = function () {
  console.log('AH0050011form1 script13');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050011form1', '_AH0050011button1/insert_sub1');
};
// script14="onDecision;1;CHK;_AH0050011form1/h_lotCtrl[eq]true@*10,*11"
expj.AH0050010.AH0050011form1.onDecision1 = function () {
  console.log('AH0050011form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050011form1', '_AH0050011form1/h_lotCtrl'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script15="child;10;UNMASK;_AH0050011form2/LOT_NO,_AH0050011form2/PeekerLOT_NO"
expj.AH0050010.AH0050011form1.child10 = function () {
  console.log('AH0050011form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('AH0050010', 'AH0050011form1', '_AH0050011form2/LOT_NO');
expj.common.pscript.setUnMaskToReferenceComponent('AH0050010', 'AH0050011form1', '_AH0050011form2/PeekerLOT_NO');
};
// script16="child;11;MASK;_AH0050011form2/LOT_NO,_AH0050011form2/PeekerLOT_NO"
expj.AH0050010.AH0050011form1.child11 = function () {
  console.log('AH0050011form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050011form1', '_AH0050011form2/LOT_NO');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050011form1', '_AH0050011form2/PeekerLOT_NO');
};
expj.AH0050010.AH0050011form1.executeAllOnDecision = function () {
  console.log('execute AH0050011form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0050010.AH0050011form1['onDecision' + i])) {
        expj.AH0050010.AH0050011form1['onDecision' + i]();
      }
    }
  }
};
expj.AH0050010.AH0050011form1.executeOnLoad = function () {
  expj.AH0050010.AH0050011form1.executePScriptOnLoad();
};

expj.AH0050010.AH0050011form1.executePScriptOnLoad = function () {
  console.log('execute AH0050011form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AH0050010.AH0050011form1['onLoad' + i])) {
      expj.AH0050010.AH0050011form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AH0050010-AH0050011form1" action="AH0050010Servlet" name="AH0050011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:96px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:96px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.INV_DATE",rb)%></span><!-- 棚卸日 --></div><!--/td-->
<script class="expj-script-AH0050010-AH0050011form1-INV_DATE">
expj.AH0050010.AH0050011form1.INV_DATE = {};
expj.AH0050010.AH0050011form1.INV_DATE.executeAllOnDecision = function () {
  console.log('execute AH0050011form1/INV_DATE.onDecision');
  expj.AH0050010.AH0050011form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050011form1.INV_DATE.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050011form1-INV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050011form1', 'INV_DATE', this);
  });
  expj.AH0050010.AH0050011form1.INV_DATE.executePScriptOnLoad();
};

expj.AH0050010.AH0050011form1.INV_DATE.executePScriptOnLoad = function () {
  console.log('execute AH0050011form1/INV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050011form1-INV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AH0050010-AH0050011form1-INV_DATE" name="INV_DATE" class="AH0050010-focus-move  " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0050010Struct.getINV_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AH0050010-AH0050011form1-w_INV_status">
expj.AH0050010.AH0050011form1.w_INV_status = {};
expj.AH0050010.AH0050011form1.w_INV_status.executeAllOnDecision = function () {
  console.log('execute AH0050011form1/w_INV_status.onDecision');
  expj.AH0050010.AH0050011form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050011form1.w_INV_status.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050011form1-w_INV_status').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050011form1', 'w_INV_status', this);
  });
  expj.AH0050010.AH0050011form1.w_INV_status.executePScriptOnLoad();
};

expj.AH0050010.AH0050011form1.w_INV_status.executePScriptOnLoad = function () {
  console.log('execute AH0050011form1/w_INV_status.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050011form1-w_INV_status');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:430px;text-align:left;"><input type="text" id="expj-AH0050010-AH0050011form1-w_INV_status" name="w_INV_status" class="AH0050010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0050010Struct.getw_INV_status()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AH0050010-AH0050011form1-h_JOB_ODR_CD_STOCK_flg" name="h_JOB_ODR_CD_STOCK_flg" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0050010Struct.geth_JOB_ODR_CD_STOCK_flg()) %>">
<script class="expj-script-AH0050010-AH0050011form1-h_JOB_ODR_CD_STOCK_flg">
expj.AH0050010.AH0050011form1.h_JOB_ODR_CD_STOCK_flg = {};
expj.AH0050010.AH0050011form1.h_JOB_ODR_CD_STOCK_flg.executeAllOnDecision = function () {
  console.log('execute AH0050011form1/h_JOB_ODR_CD_STOCK_flg.onDecision');
  expj.AH0050010.AH0050011form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050011form1.h_JOB_ODR_CD_STOCK_flg.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050011form1-h_JOB_ODR_CD_STOCK_flg').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050011form1', 'h_JOB_ODR_CD_STOCK_flg', this);
  });
  expj.AH0050010.AH0050011form1.h_JOB_ODR_CD_STOCK_flg.executePScriptOnLoad();
};

expj.AH0050010.AH0050011form1.h_JOB_ODR_CD_STOCK_flg.executePScriptOnLoad = function () {
  console.log('execute AH0050011form1/h_JOB_ODR_CD_STOCK_flg.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050011form1-h_JOB_ODR_CD_STOCK_flg');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AH0050010-AH0050011form1-h_lotCtrl" name="h_lotCtrl" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0050010Struct.geth_lotCtrl()) %>">
<script class="expj-script-AH0050010-AH0050011form1-h_lotCtrl">
expj.AH0050010.AH0050011form1.h_lotCtrl = {};
expj.AH0050010.AH0050011form1.h_lotCtrl.executeAllOnDecision = function () {
  console.log('execute AH0050011form1/h_lotCtrl.onDecision');
  expj.AH0050010.AH0050011form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050011form1.h_lotCtrl.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050011form1-h_lotCtrl').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050011form1', 'h_lotCtrl', this);
  });
  expj.AH0050010.AH0050011form1.h_lotCtrl.executePScriptOnLoad();
};

expj.AH0050010.AH0050011form1.h_lotCtrl.executePScriptOnLoad = function () {
  console.log('execute AH0050011form1/h_lotCtrl.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050011form1-h_lotCtrl');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WH_CD",rb)%></span><!-- 保管区コード --></div><!--/td-->
<script class="expj-script-AH0050010-AH0050011form1-WH_CD">
expj.AH0050010.AH0050011form1.WH_CD = {};
expj.AH0050010.AH0050011form1.WH_CD.executeAllOnDecision = function () {
  console.log('execute AH0050011form1/WH_CD.onDecision');
  expj.AH0050010.AH0050011form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050011form1.WH_CD.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050011form1-WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050011form1', 'WH_CD', this);
  });
  expj.AH0050010.AH0050011form1.WH_CD.executePScriptOnLoad();
};

expj.AH0050010.AH0050011form1.WH_CD.executePScriptOnLoad = function () {
  console.log('execute AH0050011form1/WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050011form1-WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AH0050010-AH0050011form1-WH_CD" name="WH_CD" class="AH0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0050010Struct.getWH_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AH0050010-AH0050011form1-WH_NAME">
expj.AH0050010.AH0050011form1.WH_NAME = {};
expj.AH0050010.AH0050011form1.WH_NAME.executeAllOnDecision = function () {
  console.log('execute AH0050011form1/WH_NAME.onDecision');
  expj.AH0050010.AH0050011form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050011form1.WH_NAME.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050011form1-WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050011form1', 'WH_NAME', this);
  });
  expj.AH0050010.AH0050011form1.WH_NAME.executePScriptOnLoad();
};

expj.AH0050010.AH0050011form1.WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AH0050011form1/WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050011form1-WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AH0050010-AH0050011form1-WH_NAME" name="WH_NAME" class="AH0050010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0050010Struct.getWH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AH0050010-AH0050011form1-ITEM_CD">
expj.AH0050010.AH0050011form1.ITEM_CD = {};
expj.AH0050010.AH0050011form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AH0050011form1/ITEM_CD.onDecision');
  expj.AH0050010.AH0050011form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050011form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050011form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050011form1', 'ITEM_CD', this);
  });
  expj.AH0050010.AH0050011form1.ITEM_CD.executePScriptOnLoad();
};

expj.AH0050010.AH0050011form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AH0050011form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050011form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AH0050010-AH0050011form1-ITEM_CD" name="ITEM_CD" class="AH0050010-focus-move  required-value expj-AH0050010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0050010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AH0050010-AH0050011form1-PeekerITEM_CD">
expj.AH0050010.AH0050011form1.PeekerITEM_CD = {};
// script1="onClick;0;PEEKER;_AH0050011form1/ITEM_CD@<%=contextNo%>"
expj.AH0050010.AH0050011form1.PeekerITEM_CD.onClick0 = function () {
  console.log('PeekerITEM_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AH0050010';
var parameterValues = 'PeekerITEM_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050011form1', '_AH0050011form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AH0050011form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AH0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AH0050010.AH0050011form1.PeekerITEM_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0050010.AH0050011form1.PeekerITEM_CD['onClick' + i])) {
        expj.AH0050010.AH0050011form1.PeekerITEM_CD['onClick' + i]();
      }
    }
  }
};
expj.AH0050010.AH0050011form1.PeekerITEM_CD.executeAllOnDecision = function () {
};
expj.AH0050010.AH0050011form1.PeekerITEM_CD.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050011form1-PeekerITEM_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0050010', 'AH0050011form1', 'PeekerITEM_CD', this, 'Button');
    }
  });
  expj.AH0050010.AH0050011form1.PeekerITEM_CD.executePScriptOnLoad();
};

expj.AH0050010.AH0050011form1.PeekerITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AH0050011form1/PeekerITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050011form1-PeekerITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AH0050010-AH0050011form1-PeekerITEM_CD" class="AH0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AH0050010-AH0050011form1-ITEM_NAME">
expj.AH0050010.AH0050011form1.ITEM_NAME = {};
expj.AH0050010.AH0050011form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AH0050011form1/ITEM_NAME.onDecision');
  expj.AH0050010.AH0050011form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050011form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050011form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050011form1', 'ITEM_NAME', this);
  });
  expj.AH0050010.AH0050011form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AH0050010.AH0050011form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AH0050011form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050011form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AH0050010-AH0050011form1-ITEM_NAME" name="ITEM_NAME" class="AH0050010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0050010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AH0050010-AH0050011form1-JOB_ODR_CD">
expj.AH0050010.AH0050011form1.JOB_ODR_CD = {};
expj.AH0050010.AH0050011form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AH0050011form1/JOB_ODR_CD.onDecision');
  expj.AH0050010.AH0050011form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050011form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050011form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050011form1', 'JOB_ODR_CD', this);
  });
  expj.AH0050010.AH0050011form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AH0050010.AH0050011form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AH0050011form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050011form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AH0050010-AH0050011form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AH0050010-focus-move  required-value expj-AH0050010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0050010Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AH0050010-AH0050011form1-PeekerJOB_ODR_CD">
expj.AH0050010.AH0050011form1.PeekerJOB_ODR_CD = {};
// script1="onClick;0;PEEKER;_AH0050011form1/JOB_ODR_CD@<%=contextNo%>"
expj.AH0050010.AH0050011form1.PeekerJOB_ODR_CD.onClick0 = function () {
  console.log('PeekerJOB_ODR_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AH0050010';
var parameterValues = 'PeekerJOB_ODR_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AH0050010', 'PeekerJOB_ODR_CD', 'SQLPARAM_1', '<%=aAH0050010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050011form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050011form1', '_AH0050010form1/JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_04%&%';
parameterValues += 'TARGET_FIELD%=%_AH0050011form1/JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AH0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AH0050010.AH0050011form1.PeekerJOB_ODR_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0050010.AH0050011form1.PeekerJOB_ODR_CD['onClick' + i])) {
        expj.AH0050010.AH0050011form1.PeekerJOB_ODR_CD['onClick' + i]();
      }
    }
  }
};
expj.AH0050010.AH0050011form1.PeekerJOB_ODR_CD.executeAllOnDecision = function () {
};
expj.AH0050010.AH0050011form1.PeekerJOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050011form1-PeekerJOB_ODR_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0050010', 'AH0050011form1', 'PeekerJOB_ODR_CD', this, 'Button');
    }
  });
  expj.AH0050010.AH0050011form1.PeekerJOB_ODR_CD.executePScriptOnLoad();
};

expj.AH0050010.AH0050011form1.PeekerJOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AH0050011form1/PeekerJOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050011form1-PeekerJOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AH0050010-AH0050011form1-PeekerJOB_ODR_CD" class="AH0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AH0050010-AH0050011form1-c_JOB_ODR_CD_STOCK_flg">
expj.AH0050010.AH0050011form1.c_JOB_ODR_CD_STOCK_flg = {};
// script1="onClick;0;CHK;_THIS[eq]true@*0,*1"
expj.AH0050010.AH0050011form1.c_JOB_ODR_CD_STOCK_flg.onClick0 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050011form1', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;UNMASK;_AH0050011form1/JOB_ODR_CD"
expj.AH0050010.AH0050011form1.c_JOB_ODR_CD_STOCK_flg.child0 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script2');
expj.common.pscript.setUnMaskToReferenceComponent('AH0050010', 'AH0050011form1', '_AH0050011form1/JOB_ODR_CD');
};
// script3="child;1;SET;_AH0050011form1/JOB_ODR_CD=@*2"
expj.AH0050010.AH0050011form1.c_JOB_ODR_CD_STOCK_flg.child1 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script3');
expj.common.pscript.setReferenceComponentValue('AH0050010', 'AH0050011form1', '_AH0050011form1/JOB_ODR_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script4="child;2;MASK;_AH0050011form1/JOB_ODR_CD"
expj.AH0050010.AH0050011form1.c_JOB_ODR_CD_STOCK_flg.child2 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script4');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050011form1', '_AH0050011form1/JOB_ODR_CD');
};
expj.AH0050010.AH0050011form1.c_JOB_ODR_CD_STOCK_flg.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0050010.AH0050011form1.c_JOB_ODR_CD_STOCK_flg['onClick' + i])) {
        expj.AH0050010.AH0050011form1.c_JOB_ODR_CD_STOCK_flg['onClick' + i]();
      }
    }
  }
};
expj.AH0050010.AH0050011form1.c_JOB_ODR_CD_STOCK_flg.executeAllOnDecision = function () {
  console.log('execute AH0050011form1/c_JOB_ODR_CD_STOCK_flg.onDecision');
  expj.AH0050010.AH0050011form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050011form1.c_JOB_ODR_CD_STOCK_flg.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050011form1-c_JOB_ODR_CD_STOCK_flg').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0050010', 'AH0050011form1', 'c_JOB_ODR_CD_STOCK_flg', this, 'CheckBox');
    }
  });
  expj.AH0050010.AH0050011form1.c_JOB_ODR_CD_STOCK_flg.executePScriptOnLoad();
};

expj.AH0050010.AH0050011form1.c_JOB_ODR_CD_STOCK_flg.executePScriptOnLoad = function () {
  console.log('execute AH0050011form1/c_JOB_ODR_CD_STOCK_flg.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050011form1-c_JOB_ODR_CD_STOCK_flg');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c_JOB_ODR_CD_STOCK_flg" value="true" <%= ("true".equals(TypeConverter.convert(aAH0050010Struct.getc_JOB_ODR_CD_STOCK_flg())) || "1".equals(TypeConverter.convert(aAH0050010Struct.getc_JOB_ODR_CD_STOCK_flg())))?"checked=\"checked\"":"" %>  class="AH0050010-focus-move" id="expj-AH0050010-AH0050011form1-c_JOB_ODR_CD_STOCK_flg" disabled><label for="expj-AH0050010-AH0050011form1-c_JOB_ODR_CD_STOCK_flg"><%=CoreTools.getRBString("Expj.Cmt0208",rb)%></label></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AH0050010-AH0050011form2">
expj.AH0050010.AH0050011form2 = {};
expj.AH0050010.AH0050011form2.executeAllOnDecision = function () {
  console.log('execute AH0050011form2.onDecision');
};
expj.AH0050010.AH0050011form2.executeOnLoad = function () {
  expj.AH0050010.AH0050011form2.executePScriptOnLoad();
};

expj.AH0050010.AH0050011form2.executePScriptOnLoad = function () {
  console.log('execute AH0050011form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AH0050010-AH0050011form2" action="AH0050010Servlet" name="AH0050011form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ACTUAL_STOCK_QTY",rb)%></span><!-- 実棚数 --></div><!--/td-->
<script class="expj-script-AH0050010-AH0050011form2-ACTUAL_STOCK_QTY">
expj.AH0050010.AH0050011form2.ACTUAL_STOCK_QTY = {};
expj.AH0050010.AH0050011form2.ACTUAL_STOCK_QTY.executeAllOnDecision = function () {
  console.log('execute AH0050011form2/ACTUAL_STOCK_QTY.onDecision');
  expj.AH0050010.AH0050011form2.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050011form2.ACTUAL_STOCK_QTY.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050011form2-ACTUAL_STOCK_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050011form2', 'ACTUAL_STOCK_QTY', this);
  });
  expj.AH0050010.AH0050011form2.ACTUAL_STOCK_QTY.executePScriptOnLoad();
};

expj.AH0050010.AH0050011form2.ACTUAL_STOCK_QTY.executePScriptOnLoad = function () {
  console.log('execute AH0050011form2/ACTUAL_STOCK_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050011form2-ACTUAL_STOCK_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AH0050010-AH0050011form2-ACTUAL_STOCK_QTY" name="ACTUAL_STOCK_QTY" class="AH0050010-focus-move expj-align-right required-value expj-AH0050010-required-Z" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAH0050010Struct.getACTUAL_STOCK_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_LOT_CD",rb)%></span><!-- 在庫ロット番号 --></div><!--/td-->
<script class="expj-script-AH0050010-AH0050011form2-LOT_NO">
expj.AH0050010.AH0050011form2.LOT_NO = {};
expj.AH0050010.AH0050011form2.LOT_NO.executeAllOnDecision = function () {
  console.log('execute AH0050011form2/LOT_NO.onDecision');
  expj.AH0050010.AH0050011form2.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050011form2.LOT_NO.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050011form2-LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050011form2', 'LOT_NO', this);
  });
  expj.AH0050010.AH0050011form2.LOT_NO.executePScriptOnLoad();
};

expj.AH0050010.AH0050011form2.LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AH0050011form2/LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050011form2-LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AH0050010-AH0050011form2-LOT_NO" name="LOT_NO" class="AH0050010-focus-move expj-align-right " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0050010Struct.getLOT_NO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AH0050010-AH0050011form2-PeekerLOT_NO">
expj.AH0050010.AH0050011form2.PeekerLOT_NO = {};
// script1="onClick;0;PEEKER;_AH0050011form2/LOT_NO@<%=contextNo%>"
expj.AH0050010.AH0050011form2.PeekerLOT_NO.onClick0 = function () {
  console.log('PeekerLOT_NO script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AH0050010';
var parameterValues = 'PeekerLOT_NO%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050011form2', '_AH0050011form2/LOT_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050011form2', '_AH0050011form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%LOT_NO_10%&%';
parameterValues += 'TARGET_FIELD%=%_AH0050011form2/LOT_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AH0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AH0050010.AH0050011form2.PeekerLOT_NO.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0050010.AH0050011form2.PeekerLOT_NO['onClick' + i])) {
        expj.AH0050010.AH0050011form2.PeekerLOT_NO['onClick' + i]();
      }
    }
  }
};
expj.AH0050010.AH0050011form2.PeekerLOT_NO.executeAllOnDecision = function () {
};
expj.AH0050010.AH0050011form2.PeekerLOT_NO.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050011form2-PeekerLOT_NO').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0050010', 'AH0050011form2', 'PeekerLOT_NO', this, 'Button');
    }
  });
  expj.AH0050010.AH0050011form2.PeekerLOT_NO.executePScriptOnLoad();
};

expj.AH0050010.AH0050011form2.PeekerLOT_NO.executePScriptOnLoad = function () {
  console.log('execute AH0050011form2/PeekerLOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050011form2-PeekerLOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AH0050010-AH0050011form2-PeekerLOT_NO" class="AH0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AH0050010-AH0050011button1">
expj.AH0050010.AH0050011button1 = {};
expj.AH0050010.AH0050011button1.executeAllOnDecision = function () {
  console.log('execute AH0050011button1.onDecision');
};
expj.AH0050010.AH0050011button1.executeOnLoad = function () {
  expj.AH0050010.AH0050011button1.executePScriptOnLoad();
};

expj.AH0050010.AH0050011button1.executePScriptOnLoad = function () {
  console.log('execute AH0050011button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AH0050010-AH0050011button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AH0050010-AH0050011button1-insert_sub1">
expj.AH0050010.AH0050011button1.insert_sub1 = {};
// script1="onClick;0;CHK;1[eq]1@*0"
expj.AH0050010.AH0050011button1.insert_sub1.onClick0 = function () {
  console.log('insert_sub1 script1');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_AH0050011form1/c_JOB_ODR_CD_STOCK_flg[eq]true@*1,*2"
expj.AH0050010.AH0050011button1.insert_sub1.child0 = function () {
  console.log('insert_sub1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050011button1', '_AH0050011form1/c_JOB_ODR_CD_STOCK_flg'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;SET;_AH0050011form1/h_JOB_ODR_CD_STOCK_flg=1"
expj.AH0050010.AH0050011button1.insert_sub1.child1 = function () {
  console.log('insert_sub1 script3');
expj.common.pscript.setReferenceComponentValue('AH0050010', 'AH0050011button1', '_AH0050011form1/h_JOB_ODR_CD_STOCK_flg', '1');
};
// script4="child;2;SET;_AH0050011form1/h_JOB_ODR_CD_STOCK_flg=0"
expj.AH0050010.AH0050011button1.insert_sub1.child2 = function () {
  console.log('insert_sub1 script4');
expj.common.pscript.setReferenceComponentValue('AH0050010', 'AH0050011button1', '_AH0050011form1/h_JOB_ODR_CD_STOCK_flg', '0');
};
// script5="onClick;1;CHK;_AH0050011form1/h_lotCtrl[eq]true[and]~LEN(_AH0050011form2/LOT_NO)[eq]0@$AH60012"
expj.AH0050010.AH0050011button1.insert_sub1.onClick1 = function () {
  console.log('insert_sub1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050011button1', '_AH0050011form1/h_lotCtrl'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AH0050010', 'AH0050011button1', '_AH0050011form2/LOT_NO'), '[eq]', '0')) {
expj.common.pscript.addWarningMessage('AH0050010', 'AH0050011button1', 'AH60012');
}
};
// script6="onClick;2;CHK;~LEN(_AH0050011form2/LOT_NO)[neq]0@$AH60014"
expj.AH0050010.AH0050011button1.insert_sub1.onClick2 = function () {
  console.log('insert_sub1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AH0050010', 'AH0050011button1', '_AH0050011form2/LOT_NO'), '[neq]', '0')) {
expj.common.pscript.addWarningMessage('AH0050010', 'AH0050011button1', 'AH60014');
}
};
// script7="onClick;3;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AH0050011form1/*,_AH0050011form2/*@AH0050010Servlet,,$ZZ07001"
expj.AH0050010.AH0050011button1.insert_sub1.onClick3 = function () {
  console.log('insert_sub1 script7');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0050010', 'AH0050011button1', '_AH0050011form1/*,_AH0050011form2/*', 'AH0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0050010', response);
expj.common.changeBusinessScreenTab('AH0050010', contents);
};
expj.common.pscript.callConfirm('AH0050010', 'AH0050011button1', 'ZZ07001', okEvent);
};
expj.AH0050010.AH0050011button1.insert_sub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0050010.AH0050011button1.insert_sub1['onClick' + i])) {
        expj.AH0050010.AH0050011button1.insert_sub1['onClick' + i]();
      }
    }
  }
};
expj.AH0050010.AH0050011button1.insert_sub1.executeAllOnDecision = function () {
};
expj.AH0050010.AH0050011button1.insert_sub1.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050011button1-insert_sub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0050010', 'AH0050011button1', 'insert_sub1', this, 'Button');
    }
  });
  expj.AH0050010.AH0050011button1.insert_sub1.executePScriptOnLoad();
};

expj.AH0050010.AH0050011button1.insert_sub1.executePScriptOnLoad = function () {
  console.log('execute AH0050011button1/insert_sub1.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050011button1-insert_sub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0050010-AH0050011button1-insert_sub1" name="insert_sub1" class="AH0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
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
<span class="version">AH0050011 Revision: 1.5  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AH0050010-AH0050011button0">
expj.AH0050010.AH0050011button0 = {};
expj.AH0050010.AH0050011button0.executeAllOnDecision = function () {
  console.log('execute AH0050011button0.onDecision');
};
expj.AH0050010.AH0050011button0.executeOnLoad = function () {
  expj.AH0050010.AH0050011button0.executePScriptOnLoad();
};

expj.AH0050010.AH0050011button0.executePScriptOnLoad = function () {
  console.log('execute AH0050011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AH0050010-AH0050011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AH0050010-AH0050011button0-return_sub1">
expj.AH0050010.AH0050011button0.return_sub1 = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AH0050011form1/*,_AH0050011form2/*@AH0050010Servlet,,$ZZ07013"
expj.AH0050010.AH0050011button0.return_sub1.onClick0 = function () {
  console.log('return_sub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0050010', 'AH0050011button0', '_AH0050011form1/*,_AH0050011form2/*', 'AH0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0050010', response);
expj.common.changeBusinessScreenTab('AH0050010', contents);
};
expj.common.pscript.callConfirm('AH0050010', 'AH0050011button0', 'ZZ07013', okEvent);
};
expj.AH0050010.AH0050011button0.return_sub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0050010.AH0050011button0.return_sub1['onClick' + i])) {
        expj.AH0050010.AH0050011button0.return_sub1['onClick' + i]();
      }
    }
  }
};
expj.AH0050010.AH0050011button0.return_sub1.executeAllOnDecision = function () {
};
expj.AH0050010.AH0050011button0.return_sub1.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050011button0-return_sub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0050010', 'AH0050011button0', 'return_sub1', this, 'Button');
    }
  });
  expj.AH0050010.AH0050011button0.return_sub1.executePScriptOnLoad();
};

expj.AH0050010.AH0050011button0.return_sub1.executePScriptOnLoad = function () {
  console.log('execute AH0050011button0/return_sub1.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050011button0-return_sub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0050010-AH0050011button0-return_sub1" name="return_sub1" class="AH0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AH0050010 (END)-->
<%
MessageStruct msgStruct = aAH0050010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AH0050010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AH0050010)) {
  expj.common.treeInstanceMap.AH0050010 = {};
}
expj.common.treeInstanceMap.AH0050010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AH0050010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AH0050010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AH0050010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AH0050010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AH0050010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AH0050010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AH0050010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AH0050010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AH0050010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AH0050010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0050010)) {
  expj.common.detailDialogMap.AH0050010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0050010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AH0050010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0050010.<%=detailId %>)) {
  expj.common.detailDialogMap.AH0050010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0050010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AH0050010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0050010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AH0050010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AH0050010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AH0050010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AH0050010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AH0050010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AH0050010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AH0050010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AH0050010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AH0050010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AH0050010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AH0050010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AH0050010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AH0050010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AH0050010)) {
  expj.common.viewInstanceMap.AH0050010 = {};
}
expj.common.viewInstanceMap.AH0050010.<%=viewId %> = {};
expj.common.viewInstanceMap.AH0050010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AH0050010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AH0050010.<%=viewId %>.init = function () {
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
    expj.AH0050010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AH0050010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AH0050010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AH0050010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AH0050010_init">
/**
 * AH0050010用のロード完了時初期化関数
 */
expj.AH0050010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AH0050010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AH0050010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AH0050010');
  expj.common.calendarInstanceMap.AH0050010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AH0050010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AH0050010.<%=detailId %>.init();
  expj.common.detailDialogMap.AH0050010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AH0050010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AH0050010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AH0050010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AH0050010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AH0050010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AH0050010-<%=detailId %>');
<%
 }
%>
  try{expj.AH0050010.AH0050011form1.INV_DATE.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050011form1.w_INV_status.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050011form1.h_JOB_ODR_CD_STOCK_flg.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050011form1.h_lotCtrl.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050011form1.WH_CD.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050011form1.WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050011form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050011form1.PeekerITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050011form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050011form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050011form1.PeekerJOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050011form1.c_JOB_ODR_CD_STOCK_flg.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050011form2.ACTUAL_STOCK_QTY.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050011form2.LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050011form2.PeekerLOT_NO.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050011button1.insert_sub1.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050011button0.return_sub1.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050011form1.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050011form2.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050011button1.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050011button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AH0050010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AH0050010', 'AH0050010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AH0050010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AH0050010-focus-move');
  // 初期フォーカス当てる処理
  $('.AH0050010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AH0050010', '<%=request.getContextPath() %>');
};

/**
 * AH0050010の全体onDecision処理
 */
expj.AH0050010.executeAllOnDecision = function () {
  expj.AH0050010.AH0050011form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AH0050010_console">
expj.AH0050010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>