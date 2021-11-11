<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:26:58 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AC0010\AC0010020.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AC0010.*" %>
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
<jsp:useBean id="aAC0010020Control" class="com.nec.jp.orteus.metamorBase.AC0010.AC0010020Control" scope="request"/>
<jsp:useBean id="aAC0010020Struct" class="com.nec.jp.orteus.metamorBase.AC0010.AC0010020Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.


所要量アラームリスト出力
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0010/jsp/AC0010020.jsp,v $
$Author: geng-jia $    
$Revision: 1.14 $ $Date: 2017/02/22 02:04:22 $
********************************************************* --%>
<html>
<head>
<title>所要量アラームリスト出力</title>
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
<script class="expj-script-AC0010020_init">
  // AC0010020名前空間
  expj.AC0010020 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AC0010020" data-screen="AC0010020" data-newdata="<%=aAC0010020Control.isNewData() %>">
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
              <script class="expj-script-AC0010020-AC0010020form1">
expj.AC0010020.AC0010020form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AC0010020.AC0010020form1.onLoad0 = function () {
  console.log('AC0010020form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script10="onDecision;0;CHKRQ;A@*71,*72"
expj.AC0010020.AC0010020form1.onDecision0 = function () {
  console.log('AC0010020form1 script10');
if (expj.common.pscript.satisfiedRequiredComponent('AC0010020', 'A')) {
if(expj.common.checkNameSpace(this.child71)){this.child71();}
} else {
if(expj.common.checkNameSpace(this.child72)){this.child72();}
}
};
// script11="onDecision;1;CHK;_AC0010020form1/IN_c_CHECK3[eq]1@*70"
expj.AC0010020.AC0010020form1.onDecision1 = function () {
  console.log('AC0010020form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0010020', 'AC0010020form1', '_AC0010020form1/IN_c_CHECK3'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child70)){this.child70();}
}
};
// script70="child;70;SET;_AC0010020form1/c_CHECK3=true,_AC0010020form1/IN_c_CHECK3=0"
expj.AC0010020.AC0010020form1.child70 = function () {
  console.log('AC0010020form1 script70');
expj.common.pscript.setReferenceComponentValue('AC0010020', 'AC0010020form1', '_AC0010020form1/c_CHECK3', 'true');
expj.common.pscript.setReferenceComponentValue('AC0010020', 'AC0010020form1', '_AC0010020form1/IN_c_CHECK3', '0');
};
// script71="child;71;UNMASK;_AC0010020button0/Print"
expj.AC0010020.AC0010020form1.child71 = function () {
  console.log('AC0010020form1 script71');
expj.common.pscript.setUnMaskToReferenceComponent('AC0010020', 'AC0010020form1', '_AC0010020button0/Print');
};
// script72="child;72;MASK;_AC0010020button0/Print"
expj.AC0010020.AC0010020form1.child72 = function () {
  console.log('AC0010020form1 script72');
expj.common.pscript.setMaskToReferenceComponent('AC0010020', 'AC0010020form1', '_AC0010020button0/Print');
};
expj.AC0010020.AC0010020form1.executeAllOnDecision = function () {
  console.log('execute AC0010020form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0010020.AC0010020form1['onDecision' + i])) {
        expj.AC0010020.AC0010020form1['onDecision' + i]();
      }
    }
  }
};
expj.AC0010020.AC0010020form1.executeOnLoad = function () {
  expj.AC0010020.AC0010020form1.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AC0010020.AC0010020form1['onLoad' + i])) {
      expj.AC0010020.AC0010020form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AC0010020-AC0010020form1" action="AC0010020Servlet" name="AC0010020form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:50px;align:left"></div>
<div class="div-td" style="width:2px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<input type="hidden" id="expj-AC0010020-AC0010020form1-user_PLANT_CD" name="user_PLANT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getuser_PLANT_CD()) %>">
<script class="expj-script-AC0010020-AC0010020form1-user_PLANT_CD">
expj.AC0010020.AC0010020form1.user_PLANT_CD = {};
expj.AC0010020.AC0010020form1.user_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/user_PLANT_CD.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.user_PLANT_CD.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-user_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'user_PLANT_CD', this);
  });
  expj.AC0010020.AC0010020form1.user_PLANT_CD.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.user_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/user_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-user_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0010020-AC0010020form1-OD_NO" name="OD_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getOD_NO()) %>">
<script class="expj-script-AC0010020-AC0010020form1-OD_NO">
expj.AC0010020.AC0010020form1.OD_NO = {};
expj.AC0010020.AC0010020form1.OD_NO.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/OD_NO.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.OD_NO.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-OD_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'OD_NO', this);
  });
  expj.AC0010020.AC0010020form1.OD_NO.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.OD_NO.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/OD_NO.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-OD_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0010020-AC0010020form1-ITEM_CD" name="ITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getITEM_CD()) %>">
<script class="expj-script-AC0010020-AC0010020form1-ITEM_CD">
expj.AC0010020.AC0010020form1.ITEM_CD = {};
expj.AC0010020.AC0010020form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/ITEM_CD.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'ITEM_CD', this);
  });
  expj.AC0010020.AC0010020form1.ITEM_CD.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0010020-AC0010020form1-MRP_DATE" name="MRP_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getMRP_DATE()) %>">
<script class="expj-script-AC0010020-AC0010020form1-MRP_DATE">
expj.AC0010020.AC0010020form1.MRP_DATE = {};
expj.AC0010020.AC0010020form1.MRP_DATE.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/MRP_DATE.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.MRP_DATE.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-MRP_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'MRP_DATE', this);
  });
  expj.AC0010020.AC0010020form1.MRP_DATE.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.MRP_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/MRP_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-MRP_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0010020-AC0010020form1-JOB_ODR_DETAIL_NO" name="JOB_ODR_DETAIL_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getJOB_ODR_DETAIL_NO()) %>">
<script class="expj-script-AC0010020-AC0010020form1-JOB_ODR_DETAIL_NO">
expj.AC0010020.AC0010020form1.JOB_ODR_DETAIL_NO = {};
expj.AC0010020.AC0010020form1.JOB_ODR_DETAIL_NO.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/JOB_ODR_DETAIL_NO.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.JOB_ODR_DETAIL_NO.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-JOB_ODR_DETAIL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'JOB_ODR_DETAIL_NO', this);
  });
  expj.AC0010020.AC0010020form1.JOB_ODR_DETAIL_NO.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.JOB_ODR_DETAIL_NO.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/JOB_ODR_DETAIL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-JOB_ODR_DETAIL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0010020-AC0010020form1-JOB_ODR_CANCEL_NO" name="JOB_ODR_CANCEL_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getJOB_ODR_CANCEL_NO()) %>">
<script class="expj-script-AC0010020-AC0010020form1-JOB_ODR_CANCEL_NO">
expj.AC0010020.AC0010020form1.JOB_ODR_CANCEL_NO = {};
expj.AC0010020.AC0010020form1.JOB_ODR_CANCEL_NO.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/JOB_ODR_CANCEL_NO.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.JOB_ODR_CANCEL_NO.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-JOB_ODR_CANCEL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'JOB_ODR_CANCEL_NO', this);
  });
  expj.AC0010020.AC0010020form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/JOB_ODR_CANCEL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-JOB_ODR_CANCEL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0010020-AC0010020form1-DUE_DATE" name="DUE_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getDUE_DATE()) %>">
<script class="expj-script-AC0010020-AC0010020form1-DUE_DATE">
expj.AC0010020.AC0010020form1.DUE_DATE = {};
expj.AC0010020.AC0010020form1.DUE_DATE.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/DUE_DATE.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.DUE_DATE.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-DUE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'DUE_DATE', this);
  });
  expj.AC0010020.AC0010020form1.DUE_DATE.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.DUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/DUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-DUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0010020-AC0010020form1-PRD_DUE_DATE" name="PRD_DUE_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getPRD_DUE_DATE()) %>">
<script class="expj-script-AC0010020-AC0010020form1-PRD_DUE_DATE">
expj.AC0010020.AC0010020form1.PRD_DUE_DATE = {};
expj.AC0010020.AC0010020form1.PRD_DUE_DATE.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/PRD_DUE_DATE.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.PRD_DUE_DATE.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-PRD_DUE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'PRD_DUE_DATE', this);
  });
  expj.AC0010020.AC0010020form1.PRD_DUE_DATE.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.PRD_DUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/PRD_DUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-PRD_DUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0010020-AC0010020form1-DM_QTY" name="DM_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getDM_QTY()) %>">
<script class="expj-script-AC0010020-AC0010020form1-DM_QTY">
expj.AC0010020.AC0010020form1.DM_QTY = {};
expj.AC0010020.AC0010020form1.DM_QTY.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/DM_QTY.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.DM_QTY.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-DM_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'DM_QTY', this);
  });
  expj.AC0010020.AC0010020form1.DM_QTY.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.DM_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/DM_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-DM_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:50px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:2px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<input type="hidden" id="expj-AC0010020-AC0010020form1-MSG" name="MSG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getMSG()) %>">
<script class="expj-script-AC0010020-AC0010020form1-MSG">
expj.AC0010020.AC0010020form1.MSG = {};
expj.AC0010020.AC0010020form1.MSG.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/MSG.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.MSG.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-MSG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'MSG', this);
  });
  expj.AC0010020.AC0010020form1.MSG.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.MSG.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/MSG.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-MSG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0010020-AC0010020form1-PLANT_NAME" name="PLANT_NAME" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getPLANT_NAME()) %>">
<script class="expj-script-AC0010020-AC0010020form1-PLANT_NAME">
expj.AC0010020.AC0010020form1.PLANT_NAME = {};
expj.AC0010020.AC0010020form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/PLANT_NAME.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'PLANT_NAME', this);
  });
  expj.AC0010020.AC0010020form1.PLANT_NAME.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0010020-AC0010020form1-BUSINESS_OPR_DATE" name="BUSINESS_OPR_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getBUSINESS_OPR_DATE()) %>">
<script class="expj-script-AC0010020-AC0010020form1-BUSINESS_OPR_DATE">
expj.AC0010020.AC0010020form1.BUSINESS_OPR_DATE = {};
expj.AC0010020.AC0010020form1.BUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/BUSINESS_OPR_DATE.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.BUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-BUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'BUSINESS_OPR_DATE', this);
  });
  expj.AC0010020.AC0010020form1.BUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.BUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/BUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-BUSINESS_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0010020-AC0010020form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AC0010020-AC0010020form1-DOWNLOAD_FILE">
expj.AC0010020.AC0010020form1.DOWNLOAD_FILE = {};
expj.AC0010020.AC0010020form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/DOWNLOAD_FILE.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'DOWNLOAD_FILE', this);
  });
  expj.AC0010020.AC0010020form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0010020-AC0010020form1-SUBMIT_BUTTON_TYPE" name="SUBMIT_BUTTON_TYPE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getSUBMIT_BUTTON_TYPE()) %>">
<script class="expj-script-AC0010020-AC0010020form1-SUBMIT_BUTTON_TYPE">
expj.AC0010020.AC0010020form1.SUBMIT_BUTTON_TYPE = {};
expj.AC0010020.AC0010020form1.SUBMIT_BUTTON_TYPE.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/SUBMIT_BUTTON_TYPE.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.SUBMIT_BUTTON_TYPE.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-SUBMIT_BUTTON_TYPE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'SUBMIT_BUTTON_TYPE', this);
  });
  expj.AC0010020.AC0010020form1.SUBMIT_BUTTON_TYPE.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.SUBMIT_BUTTON_TYPE.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/SUBMIT_BUTTON_TYPE.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-SUBMIT_BUTTON_TYPE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0010020-AC0010020form1-PRINTER_TYPE" name="PRINTER_TYPE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getPRINTER_TYPE()) %>">
<script class="expj-script-AC0010020-AC0010020form1-PRINTER_TYPE">
expj.AC0010020.AC0010020form1.PRINTER_TYPE = {};
expj.AC0010020.AC0010020form1.PRINTER_TYPE.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/PRINTER_TYPE.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.PRINTER_TYPE.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-PRINTER_TYPE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'PRINTER_TYPE', this);
  });
  expj.AC0010020.AC0010020form1.PRINTER_TYPE.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.PRINTER_TYPE.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/PRINTER_TYPE.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-PRINTER_TYPE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0010020-AC0010020form1-SELECTED_PRINTER" name="SELECTED_PRINTER" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getSELECTED_PRINTER()) %>">
<script class="expj-script-AC0010020-AC0010020form1-SELECTED_PRINTER">
expj.AC0010020.AC0010020form1.SELECTED_PRINTER = {};
expj.AC0010020.AC0010020form1.SELECTED_PRINTER.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/SELECTED_PRINTER.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.SELECTED_PRINTER.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-SELECTED_PRINTER').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'SELECTED_PRINTER', this);
  });
  expj.AC0010020.AC0010020form1.SELECTED_PRINTER.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.SELECTED_PRINTER.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/SELECTED_PRINTER.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-SELECTED_PRINTER');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:50px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:2px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span></div><!--/td-->
<script class="expj-script-AC0010020-AC0010020form1-PLANT_CD">
expj.AC0010020.AC0010020form1.PLANT_CD = {};
expj.AC0010020.AC0010020form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/PLANT_CD.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'PLANT_CD', this);
  });
  expj.AC0010020.AC0010020form1.PLANT_CD.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0010020-AC0010020form1-PLANT_CD" name="PLANT_CD" class="AC0010020-focus-move  required-value expj-AC0010020-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AC0010020-AC0010020form1-PLANT_CD_PEEKER">
expj.AC0010020.AC0010020form1.PLANT_CD_PEEKER = {};
// script1="onClick;0;PEEKER;_AC0010020form1/PLANT_CD@<%=contextNo%>"
expj.AC0010020.AC0010020form1.PLANT_CD_PEEKER.onClick0 = function () {
  console.log('PLANT_CD_PEEKER script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0010020';
var parameterValues = 'PLANT_CD_PEEKER%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0010020', 'AC0010020form1', '_AC0010020form1/PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AC0010020form1/PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0010020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0010020.AC0010020form1.PLANT_CD_PEEKER.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0010020.AC0010020form1.PLANT_CD_PEEKER['onClick' + i])) {
        expj.AC0010020.AC0010020form1.PLANT_CD_PEEKER['onClick' + i]();
      }
    }
  }
};
expj.AC0010020.AC0010020form1.PLANT_CD_PEEKER.executeAllOnDecision = function () {
};
expj.AC0010020.AC0010020form1.PLANT_CD_PEEKER.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-PLANT_CD_PEEKER').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0010020', 'AC0010020form1', 'PLANT_CD_PEEKER', this, 'Button');
    }
  });
  expj.AC0010020.AC0010020form1.PLANT_CD_PEEKER.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.PLANT_CD_PEEKER.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/PLANT_CD_PEEKER.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-PLANT_CD_PEEKER');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0010020-AC0010020form1-PLANT_CD_PEEKER" class="AC0010020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:50px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0010020-AC0010020form1-IN_PLANT_CD" name="IN_PLANT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getIN_PLANT_CD()) %>">
<script class="expj-script-AC0010020-AC0010020form1-IN_PLANT_CD">
expj.AC0010020.AC0010020form1.IN_PLANT_CD = {};
expj.AC0010020.AC0010020form1.IN_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/IN_PLANT_CD.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.IN_PLANT_CD.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-IN_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'IN_PLANT_CD', this);
  });
  expj.AC0010020.AC0010020form1.IN_PLANT_CD.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.IN_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/IN_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-IN_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:2px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MRP_DATE",rb)%></span></div><!--/td-->
<script class="expj-script-AC0010020-AC0010020form1-MRP_DATE_FROM">
expj.AC0010020.AC0010020form1.MRP_DATE_FROM = {};
expj.AC0010020.AC0010020form1.MRP_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/MRP_DATE_FROM.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.MRP_DATE_FROM.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-MRP_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'MRP_DATE_FROM', this);
  });
  expj.AC0010020.AC0010020form1.MRP_DATE_FROM.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.MRP_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/MRP_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-MRP_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0010020-AC0010020form1-MRP_DATE_FROM" name="MRP_DATE_FROM" class="AC0010020-focus-move  " style="width:100%;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getMRP_DATE_FROM()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-AC0010020-AC0010020form1-MRP_DATE_FROM_CALENDAR">
expj.AC0010020.AC0010020form1.MRP_DATE_FROM_CALENDAR = {};
// script1="onClick;0;CALENDAR;_AC0010020form1/MRP_DATE_FROM"
expj.AC0010020.AC0010020form1.MRP_DATE_FROM_CALENDAR.onClick0 = function () {
  console.log('MRP_DATE_FROM_CALENDAR script1');
expj.common.pscript.executeCalendar('AC0010020','AC0010020form1','_AC0010020form1/MRP_DATE_FROM');
};
expj.AC0010020.AC0010020form1.MRP_DATE_FROM_CALENDAR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0010020.AC0010020form1.MRP_DATE_FROM_CALENDAR['onClick' + i])) {
        expj.AC0010020.AC0010020form1.MRP_DATE_FROM_CALENDAR['onClick' + i]();
      }
    }
  }
};
expj.AC0010020.AC0010020form1.MRP_DATE_FROM_CALENDAR.executeAllOnDecision = function () {
};
expj.AC0010020.AC0010020form1.MRP_DATE_FROM_CALENDAR.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-MRP_DATE_FROM_CALENDAR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0010020', 'AC0010020form1', 'MRP_DATE_FROM_CALENDAR', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0010020','AC0010020form1','_AC0010020form1/MRP_DATE_FROM');
  expj.AC0010020.AC0010020form1.MRP_DATE_FROM_CALENDAR.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.MRP_DATE_FROM_CALENDAR.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/MRP_DATE_FROM_CALENDAR.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-MRP_DATE_FROM_CALENDAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0010020-AC0010020form1-MRP_DATE_FROM_CALENDAR" class="AC0010020-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AC0010020-AC0010020form1-MRP_DATE_TO">
expj.AC0010020.AC0010020form1.MRP_DATE_TO = {};
expj.AC0010020.AC0010020form1.MRP_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/MRP_DATE_TO.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.MRP_DATE_TO.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-MRP_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'MRP_DATE_TO', this);
  });
  expj.AC0010020.AC0010020form1.MRP_DATE_TO.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.MRP_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/MRP_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-MRP_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0010020-AC0010020form1-MRP_DATE_TO" name="MRP_DATE_TO" class="AC0010020-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getMRP_DATE_TO()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-AC0010020-AC0010020form1-MRP_DATE_TO_CALENDAR">
expj.AC0010020.AC0010020form1.MRP_DATE_TO_CALENDAR = {};
// script1="onClick;0;CALENDAR;_AC0010020form1/MRP_DATE_TO"
expj.AC0010020.AC0010020form1.MRP_DATE_TO_CALENDAR.onClick0 = function () {
  console.log('MRP_DATE_TO_CALENDAR script1');
expj.common.pscript.executeCalendar('AC0010020','AC0010020form1','_AC0010020form1/MRP_DATE_TO');
};
expj.AC0010020.AC0010020form1.MRP_DATE_TO_CALENDAR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0010020.AC0010020form1.MRP_DATE_TO_CALENDAR['onClick' + i])) {
        expj.AC0010020.AC0010020form1.MRP_DATE_TO_CALENDAR['onClick' + i]();
      }
    }
  }
};
expj.AC0010020.AC0010020form1.MRP_DATE_TO_CALENDAR.executeAllOnDecision = function () {
};
expj.AC0010020.AC0010020form1.MRP_DATE_TO_CALENDAR.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-MRP_DATE_TO_CALENDAR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0010020', 'AC0010020form1', 'MRP_DATE_TO_CALENDAR', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0010020','AC0010020form1','_AC0010020form1/MRP_DATE_TO');
  expj.AC0010020.AC0010020form1.MRP_DATE_TO_CALENDAR.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.MRP_DATE_TO_CALENDAR.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/MRP_DATE_TO_CALENDAR.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-MRP_DATE_TO_CALENDAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0010020-AC0010020form1-MRP_DATE_TO_CALENDAR" class="AC0010020-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0010020-AC0010020form1-IN_MRP_DATE_FROM" name="IN_MRP_DATE_FROM" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getIN_MRP_DATE_FROM()) %>">
<script class="expj-script-AC0010020-AC0010020form1-IN_MRP_DATE_FROM">
expj.AC0010020.AC0010020form1.IN_MRP_DATE_FROM = {};
expj.AC0010020.AC0010020form1.IN_MRP_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/IN_MRP_DATE_FROM.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.IN_MRP_DATE_FROM.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-IN_MRP_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'IN_MRP_DATE_FROM', this);
  });
  expj.AC0010020.AC0010020form1.IN_MRP_DATE_FROM.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.IN_MRP_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/IN_MRP_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-IN_MRP_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:50px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0010020-AC0010020form1-IN_MRP_DATE_TO" name="IN_MRP_DATE_TO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getIN_MRP_DATE_TO()) %>">
<script class="expj-script-AC0010020-AC0010020form1-IN_MRP_DATE_TO">
expj.AC0010020.AC0010020form1.IN_MRP_DATE_TO = {};
expj.AC0010020.AC0010020form1.IN_MRP_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/IN_MRP_DATE_TO.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.IN_MRP_DATE_TO.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-IN_MRP_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'IN_MRP_DATE_TO', this);
  });
  expj.AC0010020.AC0010020form1.IN_MRP_DATE_TO.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.IN_MRP_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/IN_MRP_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-IN_MRP_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:2px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span></div><!--/td-->
<script class="expj-script-AC0010020-AC0010020form1-JOB_ODR_CD">
expj.AC0010020.AC0010020form1.JOB_ODR_CD = {};
expj.AC0010020.AC0010020form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/JOB_ODR_CD.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'JOB_ODR_CD', this);
  });
  expj.AC0010020.AC0010020form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0010020-AC0010020form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AC0010020-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:50px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0010020-AC0010020form1-IN_JOB_ODR_CD" name="IN_JOB_ODR_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getIN_JOB_ODR_CD()) %>">
<script class="expj-script-AC0010020-AC0010020form1-IN_JOB_ODR_CD">
expj.AC0010020.AC0010020form1.IN_JOB_ODR_CD = {};
expj.AC0010020.AC0010020form1.IN_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/IN_JOB_ODR_CD.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.IN_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-IN_JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'IN_JOB_ODR_CD', this);
  });
  expj.AC0010020.AC0010020form1.IN_JOB_ODR_CD.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.IN_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/IN_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-IN_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:2px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AC0010020-AC0010020form1-c_CHECK3">
expj.AC0010020.AC0010020form1.c_CHECK3 = {};
expj.AC0010020.AC0010020form1.c_CHECK3.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/c_CHECK3.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.c_CHECK3.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-c_CHECK3').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0010020', 'AC0010020form1', 'c_CHECK3', this, 'CheckBox');
    }
  });
  expj.AC0010020.AC0010020form1.c_CHECK3.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.c_CHECK3.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/c_CHECK3.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-c_CHECK3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c_CHECK3" value="1" <%= ("true".equals(TypeConverter.convert(aAC0010020Struct.getc_CHECK3())) || "1".equals(TypeConverter.convert(aAC0010020Struct.getc_CHECK3())))?"checked=\"checked\"":"" %>  class="AC0010020-focus-move" id="expj-AC0010020-AC0010020form1-c_CHECK3"><label for="expj-AC0010020-AC0010020form1-c_CHECK3"><%=CoreTools.getRBString("Expj.Cmt0246",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:50px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0010020-AC0010020form1-IN_c_CHECK3" name="IN_c_CHECK3" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0010020Struct.getIN_c_CHECK3()) %>">
<script class="expj-script-AC0010020-AC0010020form1-IN_c_CHECK3">
expj.AC0010020.AC0010020form1.IN_c_CHECK3 = {};
expj.AC0010020.AC0010020form1.IN_c_CHECK3.executeAllOnDecision = function () {
  console.log('execute AC0010020form1/IN_c_CHECK3.onDecision');
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
  expj.AC0010020.executeAllOnDecision();
};
expj.AC0010020.AC0010020form1.IN_c_CHECK3.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020form1-IN_c_CHECK3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0010020', 'AC0010020form1', 'IN_c_CHECK3', this);
  });
  expj.AC0010020.AC0010020form1.IN_c_CHECK3.executePScriptOnLoad();
};

expj.AC0010020.AC0010020form1.IN_c_CHECK3.executePScriptOnLoad = function () {
  console.log('execute AC0010020form1/IN_c_CHECK3.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020form1-IN_c_CHECK3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:2px;text-align:left;"></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 305px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AC0010020 Revision: 1.8  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-AC0010020-AC0010020button0">
expj.AC0010020.AC0010020button0 = {};
expj.AC0010020.AC0010020button0.executeAllOnDecision = function () {
  console.log('execute AC0010020button0.onDecision');
};
expj.AC0010020.AC0010020button0.executeOnLoad = function () {
  expj.AC0010020.AC0010020button0.executePScriptOnLoad();
};

expj.AC0010020.AC0010020button0.executePScriptOnLoad = function () {
  console.log('execute AC0010020button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0010020-AC0010020button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0010020-AC0010020button0-Print">
expj.AC0010020.AC0010020button0.Print = {};
// script1="onClick;0;CHK;_AC0010020form1/MRP_DATE_FROM[neq][and]_AC0010020form1/MRP_DATE_FROM[gt]_AC0010020form1/BUSINESS_OPR_DATE@!AC30773"
expj.AC0010020.AC0010020button0.Print.onClick0 = function () {
  console.log('Print script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0010020', 'AC0010020button0', '_AC0010020form1/MRP_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0010020', 'AC0010020button0', '_AC0010020form1/MRP_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0010020', 'AC0010020button0', '_AC0010020form1/BUSINESS_OPR_DATE')))) {
expj.common.pscript.viewErrorMessage('AC0010020', 'AC0010020button0', 'AC30773');
}
};
// script2="onClick;1;CHK;_AC0010020form1/MRP_DATE_TO[neq][and]_AC0010020form1/MRP_DATE_TO[gt]_AC0010020form1/BUSINESS_OPR_DATE@!AC30773"
expj.AC0010020.AC0010020button0.Print.onClick1 = function () {
  console.log('Print script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0010020', 'AC0010020button0', '_AC0010020form1/MRP_DATE_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0010020', 'AC0010020button0', '_AC0010020form1/MRP_DATE_TO')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0010020', 'AC0010020button0', '_AC0010020form1/BUSINESS_OPR_DATE')))) {
expj.common.pscript.viewErrorMessage('AC0010020', 'AC0010020button0', 'AC30773');
}
};
// script3="onClick;2;CHK;_AC0010020form1/MRP_DATE_FROM[neq][and]_AC0010020form1/MRP_DATE_TO[neq][and]_AC0010020form1/MRP_DATE_FROM[gt]_AC0010020form1/MRP_DATE_TO@!AC30772"
expj.AC0010020.AC0010020button0.Print.onClick2 = function () {
  console.log('Print script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0010020', 'AC0010020button0', '_AC0010020form1/MRP_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0010020', 'AC0010020button0', '_AC0010020form1/MRP_DATE_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0010020', 'AC0010020button0', '_AC0010020form1/MRP_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0010020', 'AC0010020button0', '_AC0010020form1/MRP_DATE_TO')))) {
expj.common.pscript.viewErrorMessage('AC0010020', 'AC0010020button0', 'AC30772');
}
};
// script4="onClick;3;PRINTER;ORTEUS_HASHED=<%=hashed%>,_AC0010020form1/*@AC0010020Servlet:H,H,H"
expj.AC0010020.AC0010020button0.Print.onClick3 = function () {
  console.log('Print script4');
expj.common.pscript.viewPrinterDialog('AC0010020', 'AC0010020button0', '_AC0010020form1/*', 'AC0010020Servlet', 'H,H,H');
};
expj.AC0010020.AC0010020button0.Print.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0010020.AC0010020button0.Print['onClick' + i])) {
        expj.AC0010020.AC0010020button0.Print['onClick' + i]();
      }
    }
  }
};
expj.AC0010020.AC0010020button0.Print.executeAllOnDecision = function () {
};
expj.AC0010020.AC0010020button0.Print.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020button0-Print').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0010020', 'AC0010020button0', 'Print', this, 'Button');
    }
  });
  expj.AC0010020.AC0010020button0.Print.executePScriptOnLoad();
};

expj.AC0010020.AC0010020button0.Print.executePScriptOnLoad = function () {
  console.log('execute AC0010020button0/Print.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020button0-Print');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0010020-AC0010020button0-Print" name="Print" class="AC0010020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnPrint",rb)%></button><!-- 印刷ボタン --></div><!--/td-->
<script class="expj-script-AC0010020-AC0010020button0-Clear">
expj.AC0010020.AC0010020button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AC0010020Servlet,,$ZZ07008"
expj.AC0010020.AC0010020button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0010020', 'AC0010020button0', '', 'AC0010020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0010020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0010020', response);
expj.common.updateBusinessScreenTab('AC0010020', contents);
};
expj.common.pscript.callConfirm('AC0010020', 'AC0010020button0', 'ZZ07008', okEvent);
};
expj.AC0010020.AC0010020button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0010020.AC0010020button0.Clear['onClick' + i])) {
        expj.AC0010020.AC0010020button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AC0010020.AC0010020button0.Clear.executeAllOnDecision = function () {
};
expj.AC0010020.AC0010020button0.Clear.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0010020', 'AC0010020button0', 'Clear', this, 'Button');
    }
  });
  expj.AC0010020.AC0010020button0.Clear.executePScriptOnLoad();
};

expj.AC0010020.AC0010020button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AC0010020button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0010020-AC0010020button0-Clear" name="Clear" class="AC0010020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AC0010020-AC0010020button0-Close">
expj.AC0010020.AC0010020button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AC0010020.AC0010020button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AC0010020');
};
expj.AC0010020.AC0010020button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0010020.AC0010020button0.Close['onClick' + i])) {
        expj.AC0010020.AC0010020button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AC0010020.AC0010020button0.Close.executeAllOnDecision = function () {
};
expj.AC0010020.AC0010020button0.Close.executeOnLoad = function () {
  $('#expj-AC0010020-AC0010020button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0010020', 'AC0010020button0', 'Close', this, 'Button');
    }
  });
  expj.AC0010020.AC0010020button0.Close.executePScriptOnLoad();
};

expj.AC0010020.AC0010020button0.Close.executePScriptOnLoad = function () {
  console.log('execute AC0010020button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AC0010020-AC0010020button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0010020-AC0010020button0-Close" name="Close" class="AC0010020-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AC0010020 (END)-->
<%
MessageStruct msgStruct = aAC0010020Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AC0010020-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AC0010020)) {
  expj.common.treeInstanceMap.AC0010020 = {};
}
expj.common.treeInstanceMap.AC0010020.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0010020.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AC0010020.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0010020.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AC0010020.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AC0010020.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AC0010020.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AC0010020.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AC0010020.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AC0010020-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AC0010020-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0010020)) {
  expj.common.detailDialogMap.AC0010020 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0010020._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AC0010020._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0010020.<%=detailId %>)) {
  expj.common.detailDialogMap.AC0010020.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0010020.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AC0010020.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0010020.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AC0010020.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AC0010020.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AC0010020.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AC0010020-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AC0010020.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AC0010020-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AC0010020.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AC0010020-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AC0010020.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AC0010020.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AC0010020.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AC0010020._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AC0010020-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AC0010020)) {
  expj.common.viewInstanceMap.AC0010020 = {};
}
expj.common.viewInstanceMap.AC0010020.<%=viewId %> = {};
expj.common.viewInstanceMap.AC0010020.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AC0010020.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AC0010020.<%=viewId %>.init = function () {
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
    expj.AC0010020.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AC0010020.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AC0010020-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AC0010020-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AC0010020_init">
/**
 * AC0010020用のロード完了時初期化関数
 */
expj.AC0010020.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AC0010020');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AC0010020');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AC0010020');
  expj.common.calendarInstanceMap.AC0010020 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AC0010020.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AC0010020.<%=detailId %>.init();
  expj.common.detailDialogMap.AC0010020.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AC0010020.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AC0010020.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AC0010020');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AC0010020');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AC0010020-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AC0010020-<%=detailId %>');
<%
 }
%>
  try{expj.AC0010020.AC0010020form1.user_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.OD_NO.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.MRP_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.JOB_ODR_DETAIL_NO.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.JOB_ODR_CANCEL_NO.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.DUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.PRD_DUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.DM_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.MSG.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.BUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.SUBMIT_BUTTON_TYPE.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.PRINTER_TYPE.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.SELECTED_PRINTER.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.PLANT_CD_PEEKER.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.IN_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.MRP_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.MRP_DATE_FROM_CALENDAR.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.MRP_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.MRP_DATE_TO_CALENDAR.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.IN_MRP_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.IN_MRP_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.IN_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.c_CHECK3.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.IN_c_CHECK3.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020button0.Print.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020button0.Close.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020form1.executeOnLoad();}catch(e){};
  try{expj.AC0010020.AC0010020button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AC0010020.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AC0010020', 'AC0010020');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AC0010020');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AC0010020-focus-move');
  // 初期フォーカス当てる処理
  $('.AC0010020-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AC0010020', '<%=request.getContextPath() %>');
};

/**
 * AC0010020の全体onDecision処理
 */
expj.AC0010020.executeAllOnDecision = function () {
  expj.AC0010020.AC0010020form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AC0010020_console">
expj.AC0010020.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>