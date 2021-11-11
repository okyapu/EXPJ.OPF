<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 13:03:56 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KV0040\KV0040010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KV0040.*" %>
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
<jsp:useBean id="aKV0040010Control" class="com.nec.jp.orteus.metamorBase.KV0040.KV0040010Control" scope="request"/>
<jsp:useBean id="aKV0040010Struct" class="com.nec.jp.orteus.metamorBase.KV0040.KV0040010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

販売トランザクションデータ削除実行
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0040/jsp/KV0040010.jsp,v $
$Author: geng-jia $	
$Revision: 1.12 $　$Date: 2017/02/22 02:07:34 $
********************************************************* --%>
<html>
<head>
<title>販売トランザクションデータ削除実行</title>
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
<script class="expj-script-KV0040010_init">
  // KV0040010名前空間
  expj.KV0040010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-KV0040010" data-screen="KV0040010form" data-newdata="<%=aKV0040010Control.isNewData() %>">
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
              <!-- ここに下段メンテナンス用のDataGridを配置する。↓ -->
              <script class="expj-script-KV0040010-KV0040010form1">
expj.KV0040010.KV0040010form1 = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.KV0040010.KV0040010form1.onLoad0 = function () {
  console.log('KV0040010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.KV0040010.KV0040010form1.onDecision0 = function () {
  console.log('KV0040010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('KV0040010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_KV0040010button1/do"
expj.KV0040010.KV0040010form1.child0 = function () {
  console.log('KV0040010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('KV0040010', 'KV0040010form1', '_KV0040010button1/do');
};
// script4="child;1;MASK;_KV0040010button1/do"
expj.KV0040010.KV0040010form1.child1 = function () {
  console.log('KV0040010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('KV0040010', 'KV0040010form1', '_KV0040010button1/do');
};
expj.KV0040010.KV0040010form1.executeAllOnDecision = function () {
  console.log('execute KV0040010form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0040010.KV0040010form1['onDecision' + i])) {
        expj.KV0040010.KV0040010form1['onDecision' + i]();
      }
    }
  }
};
expj.KV0040010.KV0040010form1.executeOnLoad = function () {
  expj.KV0040010.KV0040010form1.executePScriptOnLoad();
};

expj.KV0040010.KV0040010form1.executePScriptOnLoad = function () {
  console.log('execute KV0040010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KV0040010.KV0040010form1['onLoad' + i])) {
      expj.KV0040010.KV0040010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KV0040010-KV0040010form1" action="KV0040010Servlet" name="KV0040010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.FINAL_MONTHLY_PROC_EXEC_DATE_2",rb)%></span><!-- 削除処理基準年月 --></div><!--/td-->
<script class="expj-script-KV0040010-KV0040010form1-DELETE_RECKON_YM">
expj.KV0040010.KV0040010form1.DELETE_RECKON_YM = {};
expj.KV0040010.KV0040010form1.DELETE_RECKON_YM.executeAllOnDecision = function () {
  console.log('execute KV0040010form1/DELETE_RECKON_YM.onDecision');
  expj.KV0040010.KV0040010form1.executeAllOnDecision();
  expj.KV0040010.executeAllOnDecision();
};
expj.KV0040010.KV0040010form1.DELETE_RECKON_YM.executeOnLoad = function () {
  $('#expj-KV0040010-KV0040010form1-DELETE_RECKON_YM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KV0040010', 'KV0040010form1', 'DELETE_RECKON_YM', this);
  });
  expj.KV0040010.KV0040010form1.DELETE_RECKON_YM.executePScriptOnLoad();
};

expj.KV0040010.KV0040010form1.DELETE_RECKON_YM.executePScriptOnLoad = function () {
  console.log('execute KV0040010form1/DELETE_RECKON_YM.onLoad');
  var targetComponent = document.getElementById('expj-KV0040010-KV0040010form1-DELETE_RECKON_YM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KV0040010-KV0040010form1-DELETE_RECKON_YM" name="DELETE_RECKON_YM" class="KV0040010-focus-move  required-value expj-KV0040010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YM" value="<%= TypeConverter.sanitizer(aKV0040010Struct.getDELETE_RECKON_YM()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KV0040010-KV0040010form1-COMPANY_CD" name="COMPANY_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKV0040010Struct.getCOMPANY_CD()) %>">
<script class="expj-script-KV0040010-KV0040010form1-COMPANY_CD">
expj.KV0040010.KV0040010form1.COMPANY_CD = {};
expj.KV0040010.KV0040010form1.COMPANY_CD.executeAllOnDecision = function () {
  console.log('execute KV0040010form1/COMPANY_CD.onDecision');
  expj.KV0040010.KV0040010form1.executeAllOnDecision();
  expj.KV0040010.executeAllOnDecision();
};
expj.KV0040010.KV0040010form1.COMPANY_CD.executeOnLoad = function () {
  $('#expj-KV0040010-KV0040010form1-COMPANY_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KV0040010', 'KV0040010form1', 'COMPANY_CD', this);
  });
  expj.KV0040010.KV0040010form1.COMPANY_CD.executePScriptOnLoad();
};

expj.KV0040010.KV0040010form1.COMPANY_CD.executePScriptOnLoad = function () {
  console.log('execute KV0040010form1/COMPANY_CD.onLoad');
  var targetComponent = document.getElementById('expj-KV0040010-KV0040010form1-COMPANY_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0066",rb)%></span><!-- 項目 --></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3130",rb)%></span><!-- 保存月数 --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:280px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3142",rb)%></span><!-- 削除対象年月(～まで) --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3131",rb)%></span></div><!--/td-->
<script class="expj-script-KV0040010-KV0040010form1-SALES_PLAN_TERM">
expj.KV0040010.KV0040010form1.SALES_PLAN_TERM = {};
expj.KV0040010.KV0040010form1.SALES_PLAN_TERM.executeAllOnDecision = function () {
  console.log('execute KV0040010form1/SALES_PLAN_TERM.onDecision');
  expj.KV0040010.KV0040010form1.executeAllOnDecision();
  expj.KV0040010.executeAllOnDecision();
};
expj.KV0040010.KV0040010form1.SALES_PLAN_TERM.executeOnLoad = function () {
  $('#expj-KV0040010-KV0040010form1-SALES_PLAN_TERM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KV0040010', 'KV0040010form1', 'SALES_PLAN_TERM', this);
  });
  expj.KV0040010.KV0040010form1.SALES_PLAN_TERM.executePScriptOnLoad();
};

expj.KV0040010.KV0040010form1.SALES_PLAN_TERM.executePScriptOnLoad = function () {
  console.log('execute KV0040010form1/SALES_PLAN_TERM.onLoad');
  var targetComponent = document.getElementById('expj-KV0040010-KV0040010form1-SALES_PLAN_TERM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KV0040010-KV0040010form1-SALES_PLAN_TERM" name="SALES_PLAN_TERM" class="KV0040010-focus-move expj-align-right " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aKV0040010Struct.getSALES_PLAN_TERM()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KV0040010-KV0040010form1-SALES_PLAN_TERM_LAST_YM">
expj.KV0040010.KV0040010form1.SALES_PLAN_TERM_LAST_YM = {};
expj.KV0040010.KV0040010form1.SALES_PLAN_TERM_LAST_YM.executeAllOnDecision = function () {
  console.log('execute KV0040010form1/SALES_PLAN_TERM_LAST_YM.onDecision');
  expj.KV0040010.KV0040010form1.executeAllOnDecision();
  expj.KV0040010.executeAllOnDecision();
};
expj.KV0040010.KV0040010form1.SALES_PLAN_TERM_LAST_YM.executeOnLoad = function () {
  $('#expj-KV0040010-KV0040010form1-SALES_PLAN_TERM_LAST_YM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KV0040010', 'KV0040010form1', 'SALES_PLAN_TERM_LAST_YM', this);
  });
  expj.KV0040010.KV0040010form1.SALES_PLAN_TERM_LAST_YM.executePScriptOnLoad();
};

expj.KV0040010.KV0040010form1.SALES_PLAN_TERM_LAST_YM.executePScriptOnLoad = function () {
  console.log('execute KV0040010form1/SALES_PLAN_TERM_LAST_YM.onLoad');
  var targetComponent = document.getElementById('expj-KV0040010-KV0040010form1-SALES_PLAN_TERM_LAST_YM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:280px;text-align:left;"><input type="text" id="expj-KV0040010-KV0040010form1-SALES_PLAN_TERM_LAST_YM" name="SALES_PLAN_TERM_LAST_YM" class="KV0040010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YM" value="<%= TypeConverter.sanitizer(aKV0040010Struct.getSALES_PLAN_TERM_LAST_YM()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt6710",rb)%></span></div><!--/td-->
<script class="expj-script-KV0040010-KV0040010form1-ODR_SHIP_TERM">
expj.KV0040010.KV0040010form1.ODR_SHIP_TERM = {};
expj.KV0040010.KV0040010form1.ODR_SHIP_TERM.executeAllOnDecision = function () {
  console.log('execute KV0040010form1/ODR_SHIP_TERM.onDecision');
  expj.KV0040010.KV0040010form1.executeAllOnDecision();
  expj.KV0040010.executeAllOnDecision();
};
expj.KV0040010.KV0040010form1.ODR_SHIP_TERM.executeOnLoad = function () {
  $('#expj-KV0040010-KV0040010form1-ODR_SHIP_TERM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KV0040010', 'KV0040010form1', 'ODR_SHIP_TERM', this);
  });
  expj.KV0040010.KV0040010form1.ODR_SHIP_TERM.executePScriptOnLoad();
};

expj.KV0040010.KV0040010form1.ODR_SHIP_TERM.executePScriptOnLoad = function () {
  console.log('execute KV0040010form1/ODR_SHIP_TERM.onLoad');
  var targetComponent = document.getElementById('expj-KV0040010-KV0040010form1-ODR_SHIP_TERM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KV0040010-KV0040010form1-ODR_SHIP_TERM" name="ODR_SHIP_TERM" class="KV0040010-focus-move expj-align-right " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aKV0040010Struct.getODR_SHIP_TERM()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KV0040010-KV0040010form1-ODR_SHIP_TERM_LAST_YM">
expj.KV0040010.KV0040010form1.ODR_SHIP_TERM_LAST_YM = {};
expj.KV0040010.KV0040010form1.ODR_SHIP_TERM_LAST_YM.executeAllOnDecision = function () {
  console.log('execute KV0040010form1/ODR_SHIP_TERM_LAST_YM.onDecision');
  expj.KV0040010.KV0040010form1.executeAllOnDecision();
  expj.KV0040010.executeAllOnDecision();
};
expj.KV0040010.KV0040010form1.ODR_SHIP_TERM_LAST_YM.executeOnLoad = function () {
  $('#expj-KV0040010-KV0040010form1-ODR_SHIP_TERM_LAST_YM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KV0040010', 'KV0040010form1', 'ODR_SHIP_TERM_LAST_YM', this);
  });
  expj.KV0040010.KV0040010form1.ODR_SHIP_TERM_LAST_YM.executePScriptOnLoad();
};

expj.KV0040010.KV0040010form1.ODR_SHIP_TERM_LAST_YM.executePScriptOnLoad = function () {
  console.log('execute KV0040010form1/ODR_SHIP_TERM_LAST_YM.onLoad');
  var targetComponent = document.getElementById('expj-KV0040010-KV0040010form1-ODR_SHIP_TERM_LAST_YM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:280px;text-align:left;"><input type="text" id="expj-KV0040010-KV0040010form1-ODR_SHIP_TERM_LAST_YM" name="ODR_SHIP_TERM_LAST_YM" class="KV0040010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YM" value="<%= TypeConverter.sanitizer(aKV0040010Struct.getODR_SHIP_TERM_LAST_YM()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3133",rb)%></span><!-- その他売上実績情報 --></div><!--/td-->
<script class="expj-script-KV0040010-KV0040010form1-SALES_TERM">
expj.KV0040010.KV0040010form1.SALES_TERM = {};
expj.KV0040010.KV0040010form1.SALES_TERM.executeAllOnDecision = function () {
  console.log('execute KV0040010form1/SALES_TERM.onDecision');
  expj.KV0040010.KV0040010form1.executeAllOnDecision();
  expj.KV0040010.executeAllOnDecision();
};
expj.KV0040010.KV0040010form1.SALES_TERM.executeOnLoad = function () {
  $('#expj-KV0040010-KV0040010form1-SALES_TERM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KV0040010', 'KV0040010form1', 'SALES_TERM', this);
  });
  expj.KV0040010.KV0040010form1.SALES_TERM.executePScriptOnLoad();
};

expj.KV0040010.KV0040010form1.SALES_TERM.executePScriptOnLoad = function () {
  console.log('execute KV0040010form1/SALES_TERM.onLoad');
  var targetComponent = document.getElementById('expj-KV0040010-KV0040010form1-SALES_TERM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KV0040010-KV0040010form1-SALES_TERM" name="SALES_TERM" class="KV0040010-focus-move expj-align-right " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aKV0040010Struct.getSALES_TERM()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KV0040010-KV0040010form1-SALES_TERM_LAST_YM">
expj.KV0040010.KV0040010form1.SALES_TERM_LAST_YM = {};
expj.KV0040010.KV0040010form1.SALES_TERM_LAST_YM.executeAllOnDecision = function () {
  console.log('execute KV0040010form1/SALES_TERM_LAST_YM.onDecision');
  expj.KV0040010.KV0040010form1.executeAllOnDecision();
  expj.KV0040010.executeAllOnDecision();
};
expj.KV0040010.KV0040010form1.SALES_TERM_LAST_YM.executeOnLoad = function () {
  $('#expj-KV0040010-KV0040010form1-SALES_TERM_LAST_YM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KV0040010', 'KV0040010form1', 'SALES_TERM_LAST_YM', this);
  });
  expj.KV0040010.KV0040010form1.SALES_TERM_LAST_YM.executePScriptOnLoad();
};

expj.KV0040010.KV0040010form1.SALES_TERM_LAST_YM.executePScriptOnLoad = function () {
  console.log('execute KV0040010form1/SALES_TERM_LAST_YM.onLoad');
  var targetComponent = document.getElementById('expj-KV0040010-KV0040010form1-SALES_TERM_LAST_YM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:280px;text-align:left;"><input type="text" id="expj-KV0040010-KV0040010form1-SALES_TERM_LAST_YM" name="SALES_TERM_LAST_YM" class="KV0040010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YM" value="<%= TypeConverter.sanitizer(aKV0040010Struct.getSALES_TERM_LAST_YM()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3134",rb)%></span></div><!--/td-->
<script class="expj-script-KV0040010-KV0040010form1-EDI_TERM">
expj.KV0040010.KV0040010form1.EDI_TERM = {};
expj.KV0040010.KV0040010form1.EDI_TERM.executeAllOnDecision = function () {
  console.log('execute KV0040010form1/EDI_TERM.onDecision');
  expj.KV0040010.KV0040010form1.executeAllOnDecision();
  expj.KV0040010.executeAllOnDecision();
};
expj.KV0040010.KV0040010form1.EDI_TERM.executeOnLoad = function () {
  $('#expj-KV0040010-KV0040010form1-EDI_TERM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KV0040010', 'KV0040010form1', 'EDI_TERM', this);
  });
  expj.KV0040010.KV0040010form1.EDI_TERM.executePScriptOnLoad();
};

expj.KV0040010.KV0040010form1.EDI_TERM.executePScriptOnLoad = function () {
  console.log('execute KV0040010form1/EDI_TERM.onLoad');
  var targetComponent = document.getElementById('expj-KV0040010-KV0040010form1-EDI_TERM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KV0040010-KV0040010form1-EDI_TERM" name="EDI_TERM" class="KV0040010-focus-move expj-align-right " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aKV0040010Struct.getEDI_TERM()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KV0040010-KV0040010form1-EDI_TERM_LAST_YM">
expj.KV0040010.KV0040010form1.EDI_TERM_LAST_YM = {};
expj.KV0040010.KV0040010form1.EDI_TERM_LAST_YM.executeAllOnDecision = function () {
  console.log('execute KV0040010form1/EDI_TERM_LAST_YM.onDecision');
  expj.KV0040010.KV0040010form1.executeAllOnDecision();
  expj.KV0040010.executeAllOnDecision();
};
expj.KV0040010.KV0040010form1.EDI_TERM_LAST_YM.executeOnLoad = function () {
  $('#expj-KV0040010-KV0040010form1-EDI_TERM_LAST_YM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KV0040010', 'KV0040010form1', 'EDI_TERM_LAST_YM', this);
  });
  expj.KV0040010.KV0040010form1.EDI_TERM_LAST_YM.executePScriptOnLoad();
};

expj.KV0040010.KV0040010form1.EDI_TERM_LAST_YM.executePScriptOnLoad = function () {
  console.log('execute KV0040010form1/EDI_TERM_LAST_YM.onLoad');
  var targetComponent = document.getElementById('expj-KV0040010-KV0040010form1-EDI_TERM_LAST_YM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:280px;text-align:left;"><input type="text" id="expj-KV0040010-KV0040010form1-EDI_TERM_LAST_YM" name="EDI_TERM_LAST_YM" class="KV0040010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YM" value="<%= TypeConverter.sanitizer(aKV0040010Struct.getEDI_TERM_LAST_YM()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KV0040010-KV0040010button1">
expj.KV0040010.KV0040010button1 = {};
expj.KV0040010.KV0040010button1.executeAllOnDecision = function () {
  console.log('execute KV0040010button1.onDecision');
};
expj.KV0040010.KV0040010button1.executeOnLoad = function () {
  expj.KV0040010.KV0040010button1.executePScriptOnLoad();
};

expj.KV0040010.KV0040010button1.executePScriptOnLoad = function () {
  console.log('execute KV0040010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KV0040010-KV0040010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KV0040010-KV0040010button1-do">
expj.KV0040010.KV0040010button1.do = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KV0040010form1/*@KV0040010Servlet,,$ZZ07010"
expj.KV0040010.KV0040010button1.do.onClick0 = function () {
  console.log('do script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KV0040010', 'KV0040010button1', '_KV0040010form1/*', 'KV0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KV0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KV0040010', response);
expj.common.updateBusinessScreenTab('KV0040010', contents);
};
expj.common.pscript.callConfirm('KV0040010', 'KV0040010button1', 'ZZ07010', okEvent);
};
expj.KV0040010.KV0040010button1.do.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0040010.KV0040010button1.do['onClick' + i])) {
        expj.KV0040010.KV0040010button1.do['onClick' + i]();
      }
    }
  }
};
expj.KV0040010.KV0040010button1.do.executeAllOnDecision = function () {
};
expj.KV0040010.KV0040010button1.do.executeOnLoad = function () {
  $('#expj-KV0040010-KV0040010button1-do').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KV0040010', 'KV0040010button1', 'do', this, 'Button');
    }
  });
  expj.KV0040010.KV0040010button1.do.executePScriptOnLoad();
};

expj.KV0040010.KV0040010button1.do.executePScriptOnLoad = function () {
  console.log('execute KV0040010button1/do.onLoad');
  var targetComponent = document.getElementById('expj-KV0040010-KV0040010button1-do');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KV0040010-KV0040010button1-do" name="do" class="KV0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnExecute",rb)%></button><!-- 実行ボタン --></div><!--/td-->
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
<span class="version">KV0040010 Revision: 1.6  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KV0040010-KV0040010button0">
expj.KV0040010.KV0040010button0 = {};
expj.KV0040010.KV0040010button0.executeAllOnDecision = function () {
  console.log('execute KV0040010button0.onDecision');
};
expj.KV0040010.KV0040010button0.executeOnLoad = function () {
  expj.KV0040010.KV0040010button0.executePScriptOnLoad();
};

expj.KV0040010.KV0040010button0.executePScriptOnLoad = function () {
  console.log('execute KV0040010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KV0040010-KV0040010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KV0040010-KV0040010button0-clear">
expj.KV0040010.KV0040010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KV0040010Servlet,,$ZZ07008"
expj.KV0040010.KV0040010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KV0040010', 'KV0040010button0', '', 'KV0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KV0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KV0040010', response);
expj.common.updateBusinessScreenTab('KV0040010', contents);
};
expj.common.pscript.callConfirm('KV0040010', 'KV0040010button0', 'ZZ07008', okEvent);
};
expj.KV0040010.KV0040010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0040010.KV0040010button0.clear['onClick' + i])) {
        expj.KV0040010.KV0040010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.KV0040010.KV0040010button0.clear.executeAllOnDecision = function () {
};
expj.KV0040010.KV0040010button0.clear.executeOnLoad = function () {
  $('#expj-KV0040010-KV0040010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KV0040010', 'KV0040010button0', 'clear', this, 'Button');
    }
  });
  expj.KV0040010.KV0040010button0.clear.executePScriptOnLoad();
};

expj.KV0040010.KV0040010button0.clear.executePScriptOnLoad = function () {
  console.log('execute KV0040010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-KV0040010-KV0040010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KV0040010-KV0040010button0-clear" name="clear" class="KV0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KV0040010-KV0040010button0-close">
expj.KV0040010.KV0040010button0.close = {};
// script1="onClick;0;CLOSE"
expj.KV0040010.KV0040010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('KV0040010');
};
expj.KV0040010.KV0040010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0040010.KV0040010button0.close['onClick' + i])) {
        expj.KV0040010.KV0040010button0.close['onClick' + i]();
      }
    }
  }
};
expj.KV0040010.KV0040010button0.close.executeAllOnDecision = function () {
};
expj.KV0040010.KV0040010button0.close.executeOnLoad = function () {
  $('#expj-KV0040010-KV0040010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KV0040010', 'KV0040010button0', 'close', this, 'Button');
    }
  });
  expj.KV0040010.KV0040010button0.close.executePScriptOnLoad();
};

expj.KV0040010.KV0040010button0.close.executePScriptOnLoad = function () {
  console.log('execute KV0040010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-KV0040010-KV0040010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KV0040010-KV0040010button0-close" name="close" class="KV0040010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KV0040010 (END)-->
<%
MessageStruct msgStruct = aKV0040010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KV0040010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KV0040010)) {
  expj.common.treeInstanceMap.KV0040010 = {};
}
expj.common.treeInstanceMap.KV0040010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KV0040010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KV0040010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KV0040010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KV0040010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KV0040010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KV0040010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KV0040010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KV0040010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KV0040010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KV0040010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KV0040010)) {
  expj.common.detailDialogMap.KV0040010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KV0040010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KV0040010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KV0040010.<%=detailId %>)) {
  expj.common.detailDialogMap.KV0040010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KV0040010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KV0040010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KV0040010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KV0040010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KV0040010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KV0040010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KV0040010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KV0040010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KV0040010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KV0040010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KV0040010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KV0040010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KV0040010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KV0040010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KV0040010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KV0040010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KV0040010)) {
  expj.common.viewInstanceMap.KV0040010 = {};
}
expj.common.viewInstanceMap.KV0040010.<%=viewId %> = {};
expj.common.viewInstanceMap.KV0040010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KV0040010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KV0040010.<%=viewId %>.init = function () {
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
    expj.KV0040010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KV0040010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KV0040010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KV0040010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KV0040010_init">
/**
 * KV0040010用のロード完了時初期化関数
 */
expj.KV0040010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KV0040010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KV0040010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KV0040010');
  expj.common.calendarInstanceMap.KV0040010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KV0040010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KV0040010.<%=detailId %>.init();
  expj.common.detailDialogMap.KV0040010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KV0040010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KV0040010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KV0040010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KV0040010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KV0040010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KV0040010-<%=detailId %>');
<%
 }
%>
  try{expj.KV0040010.KV0040010form1.DELETE_RECKON_YM.executeOnLoad();}catch(e){};
  try{expj.KV0040010.KV0040010form1.COMPANY_CD.executeOnLoad();}catch(e){};
  try{expj.KV0040010.KV0040010form1.SALES_PLAN_TERM.executeOnLoad();}catch(e){};
  try{expj.KV0040010.KV0040010form1.SALES_PLAN_TERM_LAST_YM.executeOnLoad();}catch(e){};
  try{expj.KV0040010.KV0040010form1.ODR_SHIP_TERM.executeOnLoad();}catch(e){};
  try{expj.KV0040010.KV0040010form1.ODR_SHIP_TERM_LAST_YM.executeOnLoad();}catch(e){};
  try{expj.KV0040010.KV0040010form1.SALES_TERM.executeOnLoad();}catch(e){};
  try{expj.KV0040010.KV0040010form1.SALES_TERM_LAST_YM.executeOnLoad();}catch(e){};
  try{expj.KV0040010.KV0040010form1.EDI_TERM.executeOnLoad();}catch(e){};
  try{expj.KV0040010.KV0040010form1.EDI_TERM_LAST_YM.executeOnLoad();}catch(e){};
  try{expj.KV0040010.KV0040010button1.do.executeOnLoad();}catch(e){};
  try{expj.KV0040010.KV0040010button0.clear.executeOnLoad();}catch(e){};
  try{expj.KV0040010.KV0040010button0.close.executeOnLoad();}catch(e){};
  try{expj.KV0040010.KV0040010form1.executeOnLoad();}catch(e){};
  try{expj.KV0040010.KV0040010button1.executeOnLoad();}catch(e){};
  try{expj.KV0040010.KV0040010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KV0040010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KV0040010', 'KV0040010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KV0040010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KV0040010-focus-move');
  // 初期フォーカス当てる処理
  $('.KV0040010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KV0040010', '<%=request.getContextPath() %>');
};

/**
 * KV0040010の全体onDecision処理
 */
expj.KV0040010.executeAllOnDecision = function () {
  expj.KV0040010.KV0040010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KV0040010_console">
expj.KV0040010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>