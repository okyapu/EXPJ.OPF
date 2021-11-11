<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:32:52 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AD0130\AD0130010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AD0130.*" %>
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
<jsp:useBean id="aAD0130010Control" class="com.nec.jp.orteus.metamorBase.AD0130.AD0130010Control" scope="request"/>
<jsp:useBean id="aAD0130010Struct" class="com.nec.jp.orteus.metamorBase.AD0130.AD0130010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

作業日報・人日報メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0130/jsp/AD0130010.jsp,v $
$Author: geng-jia $	
$Revision: 1.9 $　$Date: 2017/02/22 02:05:00 $
********************************************************* --%>
<html>
<head>
<title>作業日報・人日報メンテナンス</title>
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
<script class="expj-script-AD0130010_init">
  // AD0130010名前空間
  expj.AD0130010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-AD0130010" data-screen="AD0130010" data-newdata="<%=aAD0130010Control.isNewData() %>">
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
			  <script class="expj-script-AD0130010-AD0130010form1">
expj.AD0130010.AD0130010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AD0130010.AD0130010form1.onLoad0 = function () {
  console.log('AD0130010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHK;?AD0130010form1/*[eq]NORMAL@*0,*3"
expj.AD0130010.AD0130010form1.onDecision0 = function () {
  console.log('AD0130010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130010form1', '?AD0130010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script3="child;0;CHK;?AD0130010form1/DAILY_WORK_REPORT_TYP[eq]SAME[and]?AD0130010form1/PLANT_CD[eq]SAME[and]?AD0130010form1/OPR_DATE_FROM[eq]SAME[and]?AD0130010form1/OPR_DATE_TO[eq]SAME[and]?AD0130010form1/USER_CD[eq]SAME[and]?AD0130010form1/WS_CD[eq]SAME@*1,*3"
expj.AD0130010.AD0130010form1.child0 = function () {
  console.log('AD0130010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130010form1', '?AD0130010form1/DAILY_WORK_REPORT_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130010form1', '?AD0130010form1/PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130010form1', '?AD0130010form1/OPR_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130010form1', '?AD0130010form1/OPR_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130010form1', '?AD0130010form1/USER_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130010form1', '?AD0130010form1/WS_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;1;CHKRQ;?AD0130010view1/?[neq]NOT_SELECTED@*2,*4"
expj.AD0130010.AD0130010form1.child1 = function () {
  console.log('AD0130010form1 script4');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130010form1', '?AD0130010view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script5="child;2;CHKRQ;?AD0130010view1/?[eq]SINGLE@*6,*7"
expj.AD0130010.AD0130010form1.child2 = function () {
  console.log('AD0130010form1 script5');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130010form1', '?AD0130010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script6="child;3;MASK;_AD0130010button2/LineInsert,_AD0130010button2/LineUpdate,_AD0130010button2/LineDelete"
expj.AD0130010.AD0130010form1.child3 = function () {
  console.log('AD0130010form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AD0130010', 'AD0130010form1', '_AD0130010button2/LineInsert');
expj.common.pscript.setMaskToReferenceComponent('AD0130010', 'AD0130010form1', '_AD0130010button2/LineUpdate');
expj.common.pscript.setMaskToReferenceComponent('AD0130010', 'AD0130010form1', '_AD0130010button2/LineDelete');
};
// script7="child;4;MASK;_AD0130010button2/LineUpdate,_AD0130010button2/LineDelete@*5"
expj.AD0130010.AD0130010form1.child4 = function () {
  console.log('AD0130010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AD0130010', 'AD0130010form1', '_AD0130010button2/LineUpdate');
expj.common.pscript.setMaskToReferenceComponent('AD0130010', 'AD0130010form1', '_AD0130010button2/LineDelete');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script8="child;5;UNMASK;_AD0130010button2/LineInsert"
expj.AD0130010.AD0130010form1.child5 = function () {
  console.log('AD0130010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AD0130010', 'AD0130010form1', '_AD0130010button2/LineInsert');
};
// script9="child;6;UNMASK;_AD0130010button2/LineUpdate,_AD0130010button2/LineDelete@*5"
expj.AD0130010.AD0130010form1.child6 = function () {
  console.log('AD0130010form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('AD0130010', 'AD0130010form1', '_AD0130010button2/LineUpdate');
expj.common.pscript.setUnMaskToReferenceComponent('AD0130010', 'AD0130010form1', '_AD0130010button2/LineDelete');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script10="child;7;UNMASK;_AD0130010button2/LineDelete@*8"
expj.AD0130010.AD0130010form1.child7 = function () {
  console.log('AD0130010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('AD0130010', 'AD0130010form1', '_AD0130010button2/LineDelete');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
// script11="child;8;MASK;_AD0130010button2/LineUpdate@*5"
expj.AD0130010.AD0130010form1.child8 = function () {
  console.log('AD0130010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('AD0130010', 'AD0130010form1', '_AD0130010button2/LineUpdate');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
expj.AD0130010.AD0130010form1.executeAllOnDecision = function () {
  console.log('execute AD0130010form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0130010.AD0130010form1['onDecision' + i])) {
        expj.AD0130010.AD0130010form1['onDecision' + i]();
      }
    }
  }
};
expj.AD0130010.AD0130010form1.executeOnLoad = function () {
  expj.AD0130010.AD0130010form1.executePScriptOnLoad();
};

expj.AD0130010.AD0130010form1.executePScriptOnLoad = function () {
  console.log('execute AD0130010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AD0130010.AD0130010form1['onLoad' + i])) {
      expj.AD0130010.AD0130010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0130010-AD0130010form1" action="AD0130010Servlet" name="AD0130010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAD0130010Control.getReadStatusString()) %>" style="height:127px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:127px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DAILY_WORK_REPORT_TYP",rb)%></span><!-- 日報区分 --></div><!--/td-->
<script class="expj-script-AD0130010-AD0130010form1-DAILY_WORK_REPORT_TYP">
expj.AD0130010.AD0130010form1.DAILY_WORK_REPORT_TYP = {};
expj.AD0130010.AD0130010form1.DAILY_WORK_REPORT_TYP.executeAllOnDecision = function () {
  console.log('execute AD0130010form1/DAILY_WORK_REPORT_TYP.onDecision');
  expj.AD0130010.AD0130010form1.executeAllOnDecision();
  expj.AD0130010.executeAllOnDecision();
};
expj.AD0130010.AD0130010form1.DAILY_WORK_REPORT_TYP.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130010form1-DAILY_WORK_REPORT_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AD0130010', 'AD0130010form1', 'DAILY_WORK_REPORT_TYP', this);
  });
  expj.AD0130010.AD0130010form1.DAILY_WORK_REPORT_TYP.executePScriptOnLoad();
};

expj.AD0130010.AD0130010form1.DAILY_WORK_REPORT_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0130010form1/DAILY_WORK_REPORT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130010form1-DAILY_WORK_REPORT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AD0130010-AD0130010form1-DAILY_WORK_REPORT_TYP" name='DAILY_WORK_REPORT_TYP' class='AD0130010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAD0130010Control.getStruct().getList_DAILY_WORK_REPORT_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAD0130010Control.getStruct().getList_DAILY_WORK_REPORT_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAD0130010Control.getStruct().getList_DAILY_WORK_REPORT_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAD0130010Struct.getDAILY_WORK_REPORT_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AD0130010-AD0130010form1-PLANT_CD">
expj.AD0130010.AD0130010form1.PLANT_CD = {};
expj.AD0130010.AD0130010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AD0130010form1/PLANT_CD.onDecision');
  expj.AD0130010.AD0130010form1.executeAllOnDecision();
  expj.AD0130010.executeAllOnDecision();
};
expj.AD0130010.AD0130010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0130010', 'AD0130010form1', 'PLANT_CD', this);
  });
  expj.AD0130010.AD0130010form1.PLANT_CD.executePScriptOnLoad();
};

expj.AD0130010.AD0130010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AD0130010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0130010-AD0130010form1-PLANT_CD" name="PLANT_CD" class="AD0130010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0130010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AD0130010-AD0130010form1-PeekerPlantCd">
expj.AD0130010.AD0130010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AD0130010form1/PLANT_CD@<%=contextNo%>"
expj.AD0130010.AD0130010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0130010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AD0130010', 'PeekerPlantCd', 'SQLPARAM_1', '<%=aAD0130010Control.getPlantCd()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AD0130010form1/PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0130010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0130010.AD0130010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0130010.AD0130010form1.PeekerPlantCd['onClick' + i])) {
        expj.AD0130010.AD0130010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AD0130010.AD0130010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AD0130010.AD0130010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0130010', 'AD0130010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AD0130010.AD0130010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.AD0130010.AD0130010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AD0130010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0130010-AD0130010form1-PeekerPlantCd" class="AD0130010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0130010-AD0130010form1-PLANT_NAME">
expj.AD0130010.AD0130010form1.PLANT_NAME = {};
expj.AD0130010.AD0130010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AD0130010form1/PLANT_NAME.onDecision');
  expj.AD0130010.AD0130010form1.executeAllOnDecision();
  expj.AD0130010.executeAllOnDecision();
};
expj.AD0130010.AD0130010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0130010', 'AD0130010form1', 'PLANT_NAME', this);
  });
  expj.AD0130010.AD0130010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.AD0130010.AD0130010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0130010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:342px;text-align:left;"><input type="text" id="expj-AD0130010-AD0130010form1-PLANT_NAME" name="PLANT_NAME" class="AD0130010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0130010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt5833",rb)%></span><!-- 作業日 --></div><!--/td-->
<script class="expj-script-AD0130010-AD0130010form1-OPR_DATE_FROM">
expj.AD0130010.AD0130010form1.OPR_DATE_FROM = {};
expj.AD0130010.AD0130010form1.OPR_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AD0130010form1/OPR_DATE_FROM.onDecision');
  expj.AD0130010.AD0130010form1.executeAllOnDecision();
  expj.AD0130010.executeAllOnDecision();
};
expj.AD0130010.AD0130010form1.OPR_DATE_FROM.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130010form1-OPR_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0130010', 'AD0130010form1', 'OPR_DATE_FROM', this);
  });
  expj.AD0130010.AD0130010form1.OPR_DATE_FROM.executePScriptOnLoad();
};

expj.AD0130010.AD0130010form1.OPR_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AD0130010form1/OPR_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130010form1-OPR_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0130010-AD0130010form1-OPR_DATE_FROM" name="OPR_DATE_FROM" class="AD0130010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD;" value="<%= TypeConverter.sanitizer(aAD0130010Struct.getOPR_DATE_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0130010-AD0130010form1-CalendarOPR_DATE_FROM">
expj.AD0130010.AD0130010form1.CalendarOPR_DATE_FROM = {};
// script1="onClick;0;CALENDAR;_AD0130010form1/OPR_DATE_FROM@<%=contextNo%>"
expj.AD0130010.AD0130010form1.CalendarOPR_DATE_FROM.onClick0 = function () {
  console.log('CalendarOPR_DATE_FROM script1');
expj.common.pscript.executeCalendar('AD0130010','AD0130010form1','_AD0130010form1/OPR_DATE_FROM');
};
expj.AD0130010.AD0130010form1.CalendarOPR_DATE_FROM.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0130010.AD0130010form1.CalendarOPR_DATE_FROM['onClick' + i])) {
        expj.AD0130010.AD0130010form1.CalendarOPR_DATE_FROM['onClick' + i]();
      }
    }
  }
};
expj.AD0130010.AD0130010form1.CalendarOPR_DATE_FROM.executeAllOnDecision = function () {
};
expj.AD0130010.AD0130010form1.CalendarOPR_DATE_FROM.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130010form1-CalendarOPR_DATE_FROM').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0130010', 'AD0130010form1', 'CalendarOPR_DATE_FROM', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0130010','AD0130010form1','_AD0130010form1/OPR_DATE_FROM');
  expj.AD0130010.AD0130010form1.CalendarOPR_DATE_FROM.executePScriptOnLoad();
};

expj.AD0130010.AD0130010form1.CalendarOPR_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AD0130010form1/CalendarOPR_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130010form1-CalendarOPR_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0130010-AD0130010form1-CalendarOPR_DATE_FROM" class="AD0130010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AD0130010-AD0130010form1-OPR_DATE_TO">
expj.AD0130010.AD0130010form1.OPR_DATE_TO = {};
expj.AD0130010.AD0130010form1.OPR_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AD0130010form1/OPR_DATE_TO.onDecision');
  expj.AD0130010.AD0130010form1.executeAllOnDecision();
  expj.AD0130010.executeAllOnDecision();
};
expj.AD0130010.AD0130010form1.OPR_DATE_TO.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130010form1-OPR_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0130010', 'AD0130010form1', 'OPR_DATE_TO', this);
  });
  expj.AD0130010.AD0130010form1.OPR_DATE_TO.executePScriptOnLoad();
};

expj.AD0130010.AD0130010form1.OPR_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AD0130010form1/OPR_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130010form1-OPR_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0130010-AD0130010form1-OPR_DATE_TO" name="OPR_DATE_TO" class="AD0130010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD;" value="<%= TypeConverter.sanitizer(aAD0130010Struct.getOPR_DATE_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0130010-AD0130010form1-CalendarOPR_DATE_TO">
expj.AD0130010.AD0130010form1.CalendarOPR_DATE_TO = {};
// script1="onClick;0;CALENDAR;_AD0130010form1/OPR_DATE_TO@<%=contextNo%>"
expj.AD0130010.AD0130010form1.CalendarOPR_DATE_TO.onClick0 = function () {
  console.log('CalendarOPR_DATE_TO script1');
expj.common.pscript.executeCalendar('AD0130010','AD0130010form1','_AD0130010form1/OPR_DATE_TO');
};
expj.AD0130010.AD0130010form1.CalendarOPR_DATE_TO.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0130010.AD0130010form1.CalendarOPR_DATE_TO['onClick' + i])) {
        expj.AD0130010.AD0130010form1.CalendarOPR_DATE_TO['onClick' + i]();
      }
    }
  }
};
expj.AD0130010.AD0130010form1.CalendarOPR_DATE_TO.executeAllOnDecision = function () {
};
expj.AD0130010.AD0130010form1.CalendarOPR_DATE_TO.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130010form1-CalendarOPR_DATE_TO').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0130010', 'AD0130010form1', 'CalendarOPR_DATE_TO', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0130010','AD0130010form1','_AD0130010form1/OPR_DATE_TO');
  expj.AD0130010.AD0130010form1.CalendarOPR_DATE_TO.executePScriptOnLoad();
};

expj.AD0130010.AD0130010form1.CalendarOPR_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AD0130010form1/CalendarOPR_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130010form1-CalendarOPR_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0130010-AD0130010form1-CalendarOPR_DATE_TO" class="AD0130010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.USER_CD",rb)%></span><!-- ユーザコード --></div><!--/td-->
<script class="expj-script-AD0130010-AD0130010form1-USER_CD">
expj.AD0130010.AD0130010form1.USER_CD = {};
expj.AD0130010.AD0130010form1.USER_CD.executeAllOnDecision = function () {
  console.log('execute AD0130010form1/USER_CD.onDecision');
  expj.AD0130010.AD0130010form1.executeAllOnDecision();
  expj.AD0130010.executeAllOnDecision();
};
expj.AD0130010.AD0130010form1.USER_CD.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130010form1-USER_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0130010', 'AD0130010form1', 'USER_CD', this);
  });
  expj.AD0130010.AD0130010form1.USER_CD.executePScriptOnLoad();
};

expj.AD0130010.AD0130010form1.USER_CD.executePScriptOnLoad = function () {
  console.log('execute AD0130010form1/USER_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130010form1-USER_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0130010-AD0130010form1-USER_CD" name="USER_CD" class="AD0130010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0130010Struct.getUSER_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0130010-AD0130010form1-PeekerUserCd">
expj.AD0130010.AD0130010form1.PeekerUserCd = {};
// script1="onClick;0;PEEKER;_AD0130010form1/USER_CD@<%=contextNo%>"
expj.AD0130010.AD0130010form1.PeekerUserCd.onClick0 = function () {
  console.log('PeekerUserCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0130010';
var parameterValues = 'PeekerUserCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AD0130010', 'PeekerUserCd', 'SQLPARAM_1', '<%=aAD0130010Control.getPlantCd()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130010form1', '_AD0130010form1/USER_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%USER_CD_07%&%';
parameterValues += 'TARGET_FIELD%=%_AD0130010form1/USER_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0130010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0130010.AD0130010form1.PeekerUserCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0130010.AD0130010form1.PeekerUserCd['onClick' + i])) {
        expj.AD0130010.AD0130010form1.PeekerUserCd['onClick' + i]();
      }
    }
  }
};
expj.AD0130010.AD0130010form1.PeekerUserCd.executeAllOnDecision = function () {
};
expj.AD0130010.AD0130010form1.PeekerUserCd.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130010form1-PeekerUserCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0130010', 'AD0130010form1', 'PeekerUserCd', this, 'Button');
    }
  });
  expj.AD0130010.AD0130010form1.PeekerUserCd.executePScriptOnLoad();
};

expj.AD0130010.AD0130010form1.PeekerUserCd.executePScriptOnLoad = function () {
  console.log('execute AD0130010form1/PeekerUserCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130010form1-PeekerUserCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0130010-AD0130010form1-PeekerUserCd" class="AD0130010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0130010-AD0130010form1-USER_NAME">
expj.AD0130010.AD0130010form1.USER_NAME = {};
expj.AD0130010.AD0130010form1.USER_NAME.executeAllOnDecision = function () {
  console.log('execute AD0130010form1/USER_NAME.onDecision');
  expj.AD0130010.AD0130010form1.executeAllOnDecision();
  expj.AD0130010.executeAllOnDecision();
};
expj.AD0130010.AD0130010form1.USER_NAME.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130010form1-USER_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0130010', 'AD0130010form1', 'USER_NAME', this);
  });
  expj.AD0130010.AD0130010form1.USER_NAME.executePScriptOnLoad();
};

expj.AD0130010.AD0130010form1.USER_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0130010form1/USER_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130010form1-USER_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:342px;text-align:left;"><input type="text" id="expj-AD0130010-AD0130010form1-USER_NAME" name="USER_NAME" class="AD0130010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0130010Struct.getUSER_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.NC_WS_CD",rb)%></span><!-- 作業区コード --></div><!--/td-->
<script class="expj-script-AD0130010-AD0130010form1-WS_CD">
expj.AD0130010.AD0130010form1.WS_CD = {};
expj.AD0130010.AD0130010form1.WS_CD.executeAllOnDecision = function () {
  console.log('execute AD0130010form1/WS_CD.onDecision');
  expj.AD0130010.AD0130010form1.executeAllOnDecision();
  expj.AD0130010.executeAllOnDecision();
};
expj.AD0130010.AD0130010form1.WS_CD.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130010form1-WS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0130010', 'AD0130010form1', 'WS_CD', this);
  });
  expj.AD0130010.AD0130010form1.WS_CD.executePScriptOnLoad();
};

expj.AD0130010.AD0130010form1.WS_CD.executePScriptOnLoad = function () {
  console.log('execute AD0130010form1/WS_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130010form1-WS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0130010-AD0130010form1-WS_CD" name="WS_CD" class="AD0130010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0130010Struct.getWS_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0130010-AD0130010form1-PeekerWsCd">
expj.AD0130010.AD0130010form1.PeekerWsCd = {};
// script1="onClick;0;PEEKER;_AD0130010form1/WS_CD@<%=contextNo%>"
expj.AD0130010.AD0130010form1.PeekerWsCd.onClick0 = function () {
  console.log('PeekerWsCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0130010';
var parameterValues = 'PeekerWsCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130010form1', '_AD0130010form1/PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130010form1', '_AD0130010form1/WS_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WS_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AD0130010form1/WS_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0130010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0130010.AD0130010form1.PeekerWsCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0130010.AD0130010form1.PeekerWsCd['onClick' + i])) {
        expj.AD0130010.AD0130010form1.PeekerWsCd['onClick' + i]();
      }
    }
  }
};
expj.AD0130010.AD0130010form1.PeekerWsCd.executeAllOnDecision = function () {
};
expj.AD0130010.AD0130010form1.PeekerWsCd.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130010form1-PeekerWsCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0130010', 'AD0130010form1', 'PeekerWsCd', this, 'Button');
    }
  });
  expj.AD0130010.AD0130010form1.PeekerWsCd.executePScriptOnLoad();
};

expj.AD0130010.AD0130010form1.PeekerWsCd.executePScriptOnLoad = function () {
  console.log('execute AD0130010form1/PeekerWsCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130010form1-PeekerWsCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0130010-AD0130010form1-PeekerWsCd" class="AD0130010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0130010-AD0130010form1-WS_NAME">
expj.AD0130010.AD0130010form1.WS_NAME = {};
expj.AD0130010.AD0130010form1.WS_NAME.executeAllOnDecision = function () {
  console.log('execute AD0130010form1/WS_NAME.onDecision');
  expj.AD0130010.AD0130010form1.executeAllOnDecision();
  expj.AD0130010.executeAllOnDecision();
};
expj.AD0130010.AD0130010form1.WS_NAME.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130010form1-WS_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0130010', 'AD0130010form1', 'WS_NAME', this);
  });
  expj.AD0130010.AD0130010form1.WS_NAME.executePScriptOnLoad();
};

expj.AD0130010.AD0130010form1.WS_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0130010form1/WS_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130010form1-WS_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:342px;text-align:left;"><input type="text" id="expj-AD0130010-AD0130010form1-WS_NAME" name="WS_NAME" class="AD0130010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0130010Struct.getWS_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AD0130010-AD0130010button1">
expj.AD0130010.AD0130010button1 = {};
expj.AD0130010.AD0130010button1.executeAllOnDecision = function () {
  console.log('execute AD0130010button1.onDecision');
};
expj.AD0130010.AD0130010button1.executeOnLoad = function () {
  expj.AD0130010.AD0130010button1.executePScriptOnLoad();
};

expj.AD0130010.AD0130010button1.executePScriptOnLoad = function () {
  console.log('execute AD0130010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0130010-AD0130010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:100px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0130010-AD0130010button1-Select">
expj.AD0130010.AD0130010button1.Select = {};
// script1="onClick;0;CHK;_AD0130010form1/OPR_DATE_FROM[neq][and]_AD0130010form1/OPR_DATE_TO[neq][and]_AD0130010form1/OPR_DATE_FROM[gt]_AD0130010form1/OPR_DATE_TO@!ZZ05101"
expj.AD0130010.AD0130010button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130010button1', '_AD0130010form1/OPR_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130010button1', '_AD0130010form1/OPR_DATE_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130010button1', '_AD0130010form1/OPR_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130010button1', '_AD0130010form1/OPR_DATE_TO')))) {
expj.common.pscript.viewErrorMessage('AD0130010', 'AD0130010button1', 'ZZ05101');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0130010form1/*@AD0130010Servlet,,"
expj.AD0130010.AD0130010button1.Select.onClick1 = function () {
  console.log('Select script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0130010', 'AD0130010button1', '_AD0130010form1/*', 'AD0130010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0130010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0130010', response);
expj.common.updateBusinessScreenTab('AD0130010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0130010.AD0130010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0130010.AD0130010button1.Select['onClick' + i])) {
        expj.AD0130010.AD0130010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AD0130010.AD0130010button1.Select.executeAllOnDecision = function () {
};
expj.AD0130010.AD0130010button1.Select.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0130010', 'AD0130010button1', 'Select', this, 'Button');
    }
  });
  expj.AD0130010.AD0130010button1.Select.executePScriptOnLoad();
};

expj.AD0130010.AD0130010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AD0130010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0130010-AD0130010button1-Select" name="Select" class="AD0130010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AD0130010-AD0130010view1">
expj.AD0130010.AD0130010view1 = {};
expj.AD0130010.AD0130010view1.executeAllOnClick = function () {
};
expj.AD0130010.AD0130010view1.executeAllOnDecision = function () {
  console.log('execute AD0130010view1.onDecision');
};
expj.AD0130010.AD0130010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AD0130010view1", "expj.AD0130010.AD0130010view1.executeAllOnClick");
%>
  expj.AD0130010.AD0130010view1.executePScriptOnLoad();
};

expj.AD0130010.AD0130010view1.executePScriptOnLoad = function () {
  console.log('execute AD0130010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AD0130010-AD0130010view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AD0130010view1_Id = "AD0130010view1";
 String AD0130010view1_select = "single";
 String AD0130010view1_sortable = "true";
 String AD0130010view1_resize = "true";
 String AD0130010view1_scroll = "true";
 StringBuffer AD0130010view1_HB = new StringBuffer();
 StringBuffer AD0130010view1_DB = new StringBuffer();
%>
<%
 AD0130010view1_select = "multi";
 AD0130010view1_sortable = "true";
 AD0130010view1_resize = "true";
 AD0130010view1_scroll = "true";
%>
<%
 AD0130010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AD0130010view1_sortable).append("}").append(",");
%>
     
<%
AD0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'33px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLANT_CD",rb))).append("', 'name':'l_PLANT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0130010view1_sortable).append("}").append(",");
AD0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DAILY_WORK_REPORT_TYP",rb))).append("', 'name':'l_DAILY_WORK_REPORT_TYP_SHOW', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0130010view1_sortable).append("}").append(",");
AD0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'78px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.USER_CD",rb))).append("', 'name':'l_USER_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0130010view1_sortable).append("}").append(",");
AD0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'75px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_DATE_3",rb))).append("', 'name':'l_OPR_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0130010view1_sortable).append("}").append(",");
AD0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'68px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt6746",rb))).append("', 'name':'l_WORK_SHIFT_CODE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0130010view1_sortable).append("}").append(",");
AD0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'56px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.START_TIME_1",rb))).append("', 'name':'l_START_TIME', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AD0130010view1_sortable).append("}").append(",");
AD0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'56px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.END_TIME",rb))).append("', 'name':'l_END_TIME', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AD0130010view1_sortable).append("}").append(",");
AD0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'35px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_TIME_MINUTE",rb))).append("', 'name':'l_OPR_TIME', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AD0130010view1_sortable).append("}").append(",");
AD0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'73px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.NC_WS_CD",rb))).append("', 'name':'l_WS_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0130010view1_sortable).append("}").append(",");
AD0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_PROC_TYP",rb))).append("', 'name':'l_OPR_TYP_SHOW', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0130010view1_sortable).append("}").append(",");
AD0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'160px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UN_OPR_CAUSE",rb))).append("', 'name':'l_UN_OPR_CAUSE_TYP_SHOW', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0130010view1_sortable).append("}").append(",");
AD0130010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UN_OPR_TIME",rb))).append("', 'name':'l_UN_OPR_TIME', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AD0130010view1_sortable).append("}").append(",");
AD0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'130px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DAILY_WORK_REPORT_CTL_NO",rb))).append("', 'name':'l_DAILY_WORK_REPORT_CTL_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0130010view1_sortable).append("}").append(",");
AD0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_l_SEQ_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0130010view1_sortable).append("}").append(",");
AD0130010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_l_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0130010view1_sortable).append("}").append(",");
%>
<%
 int aAD0130010StructLength = aAD0130010Control.getListsize();
 final AD0130010Struct structBackup = aAD0130010Struct;
 aAD0130010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAD0130010StructLength; ++loopCount) {
  if((aAD0130010Struct = (AD0130010Struct) aAD0130010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAD0130010Struct", aAD0130010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AD0130010view1_DB.append("[");
 AD0130010view1_DB.append(loopCount);
 AD0130010view1_DB.append(",").append("'<span id=\"expj-AD0130010-AD0130010view1-l_PLANT_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0130010-AD0130010view1-l_PLANT_CD\" data-name=\"l_PLANT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0130010Struct.getl_PLANT_CD())).append("</span>'");
 AD0130010view1_DB.append(",").append("'<span id=\"expj-AD0130010-AD0130010view1-l_DAILY_WORK_REPORT_TYP_SHOW-").append(loopCount).append("\" class=\"expj-label expj-AD0130010-AD0130010view1-l_DAILY_WORK_REPORT_TYP_SHOW\" data-name=\"l_DAILY_WORK_REPORT_TYP_SHOW\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0130010Struct.getl_DAILY_WORK_REPORT_TYP_SHOW())).append("</span>'");
 AD0130010view1_DB.append(",").append("'<span id=\"expj-AD0130010-AD0130010view1-l_USER_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0130010-AD0130010view1-l_USER_CD\" data-name=\"l_USER_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0130010Struct.getl_USER_CD())).append("</span>'");
 AD0130010view1_DB.append(",").append("'<span id=\"expj-AD0130010-AD0130010view1-l_OPR_DATE-").append(loopCount).append("\" class=\"expj-label expj-AD0130010-AD0130010view1-l_OPR_DATE\" data-name=\"l_OPR_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD;\">").append(TypeConverter.sanitizer(aAD0130010Struct.getl_OPR_DATE())).append("</span>'");
 AD0130010view1_DB.append(",").append("'<span id=\"expj-AD0130010-AD0130010view1-l_WORK_SHIFT_CODE-").append(loopCount).append("\" class=\"expj-label expj-AD0130010-AD0130010view1-l_WORK_SHIFT_CODE\" data-name=\"l_WORK_SHIFT_CODE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0130010Struct.getl_WORK_SHIFT_CODE())).append("</span>'");
 AD0130010view1_DB.append(",").append("'<span id=\"expj-AD0130010-AD0130010view1-l_START_TIME-").append(loopCount).append("\" class=\"expj-label expj-AD0130010-AD0130010view1-l_START_TIME\" data-name=\"l_START_TIME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0130010Struct.getl_START_TIME())).append("</span>'");
 AD0130010view1_DB.append(",").append("'<span id=\"expj-AD0130010-AD0130010view1-l_END_TIME-").append(loopCount).append("\" class=\"expj-label expj-AD0130010-AD0130010view1-l_END_TIME\" data-name=\"l_END_TIME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0130010Struct.getl_END_TIME())).append("</span>'");
 AD0130010view1_DB.append(",").append("'<span id=\"expj-AD0130010-AD0130010view1-l_OPR_TIME-").append(loopCount).append("\" class=\"expj-label expj-AD0130010-AD0130010view1-l_OPR_TIME\" data-name=\"l_OPR_TIME\" data-view=\"true\" data-kind=\"OBT_INTEGER_Z;4;;\">").append(TypeConverter.sanitizer(aAD0130010Struct.getl_OPR_TIME())).append("</span>'");
 AD0130010view1_DB.append(",").append("'<span id=\"expj-AD0130010-AD0130010view1-l_WS_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0130010-AD0130010view1-l_WS_CD\" data-name=\"l_WS_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0130010Struct.getl_WS_CD())).append("</span>'");
 AD0130010view1_DB.append(",").append("'<span id=\"expj-AD0130010-AD0130010view1-l_OPR_TYP_SHOW-").append(loopCount).append("\" class=\"expj-label expj-AD0130010-AD0130010view1-l_OPR_TYP_SHOW\" data-name=\"l_OPR_TYP_SHOW\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0130010Struct.getl_OPR_TYP_SHOW())).append("</span>'");
 AD0130010view1_DB.append(",").append("'<span id=\"expj-AD0130010-AD0130010view1-l_UN_OPR_CAUSE_TYP_SHOW-").append(loopCount).append("\" class=\"expj-label expj-AD0130010-AD0130010view1-l_UN_OPR_CAUSE_TYP_SHOW\" data-name=\"l_UN_OPR_CAUSE_TYP_SHOW\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0130010Struct.getl_UN_OPR_CAUSE_TYP_SHOW())).append("</span>'");
 AD0130010view1_DB.append(",").append("'<span id=\"expj-AD0130010-AD0130010view1-l_UN_OPR_TIME-").append(loopCount).append("\" class=\"expj-label expj-AD0130010-AD0130010view1-l_UN_OPR_TIME\" data-name=\"l_UN_OPR_TIME\" data-view=\"true\" data-kind=\"").append(aAD0130010Control.getUnOprTimeFormat()).append("\">").append(TypeConverter.sanitizer(aAD0130010Struct.getl_UN_OPR_TIME())).append("</span>'");
 AD0130010view1_DB.append(",").append("'<span id=\"expj-AD0130010-AD0130010view1-l_DAILY_WORK_REPORT_CTL_NO-").append(loopCount).append("\" class=\"expj-label expj-AD0130010-AD0130010view1-l_DAILY_WORK_REPORT_CTL_NO\" data-name=\"l_DAILY_WORK_REPORT_CTL_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0130010Struct.getl_DAILY_WORK_REPORT_CTL_NO())).append("</span>'");
 AD0130010view1_DB.append(",").append("'<span id=\"expj-AD0130010-AD0130010view1-h_l_SEQ_NO-").append(loopCount).append("\" class=\"expj-label expj-AD0130010-AD0130010view1-h_l_SEQ_NO\" data-name=\"h_l_SEQ_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0130010Struct.geth_l_SEQ_NO())).append("</span>'");
 AD0130010view1_DB.append(",").append("'<span id=\"expj-AD0130010-AD0130010view1-h_l_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AD0130010-AD0130010view1-h_l_MODIFY_COUNT\" data-name=\"h_l_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0130010Struct.geth_l_MODIFY_COUNT())).append("</span>'");
 AD0130010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAD0130010StructLength) {
   AD0130010view1_DB.append(",");
  }
 }
 aAD0130010Struct = structBackup;
 viewIdList.add(AD0130010view1_Id);
 viewSelectList.add(AD0130010view1_select);
 viewResizeList.add(AD0130010view1_resize);
 viewScrollList.add(AD0130010view1_scroll);
 viewHeaderDataList.add(AD0130010view1_HB);
 viewBodyDataList.add(AD0130010view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 button-area" style="width:315px;"><script class="expj-script-AD0130010-AD0130010button2">
expj.AD0130010.AD0130010button2 = {};
expj.AD0130010.AD0130010button2.executeAllOnDecision = function () {
  console.log('execute AD0130010button2.onDecision');
};
expj.AD0130010.AD0130010button2.executeOnLoad = function () {
  expj.AD0130010.AD0130010button2.executePScriptOnLoad();
};

expj.AD0130010.AD0130010button2.executePScriptOnLoad = function () {
  console.log('execute AD0130010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0130010-AD0130010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0130010-AD0130010button2-LineInsert">
expj.AD0130010.AD0130010button2.LineInsert = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0130010form1/*@AD0130010Servlet,,"
expj.AD0130010.AD0130010button2.LineInsert.onClick0 = function () {
  console.log('LineInsert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0130010', 'AD0130010button2', '_AD0130010form1/*', 'AD0130010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0130010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0130010', response);
expj.common.changeBusinessScreenTab('AD0130010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0130010.AD0130010button2.LineInsert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0130010.AD0130010button2.LineInsert['onClick' + i])) {
        expj.AD0130010.AD0130010button2.LineInsert['onClick' + i]();
      }
    }
  }
};
expj.AD0130010.AD0130010button2.LineInsert.executeAllOnDecision = function () {
};
expj.AD0130010.AD0130010button2.LineInsert.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130010button2-LineInsert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0130010', 'AD0130010button2', 'LineInsert', this, 'Button');
    }
  });
  expj.AD0130010.AD0130010button2.LineInsert.executePScriptOnLoad();
};

expj.AD0130010.AD0130010button2.LineInsert.executePScriptOnLoad = function () {
  console.log('execute AD0130010button2/LineInsert.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130010button2-LineInsert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0130010-AD0130010button2-LineInsert" name="LineInsert" class="AD0130010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsert",rb)%></button><!-- 行追加ボタン --></div><!--/td-->
<script class="expj-script-AD0130010-AD0130010button2-LineUpdate">
expj.AD0130010.AD0130010button2.LineUpdate = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0130010form1/*,_AD0130010view1/+@AD0130010Servlet,,"
expj.AD0130010.AD0130010button2.LineUpdate.onClick0 = function () {
  console.log('LineUpdate script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0130010', 'AD0130010button2', '_AD0130010form1/*,_AD0130010view1/+', 'AD0130010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0130010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0130010', response);
expj.common.changeBusinessScreenTab('AD0130010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0130010.AD0130010button2.LineUpdate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0130010.AD0130010button2.LineUpdate['onClick' + i])) {
        expj.AD0130010.AD0130010button2.LineUpdate['onClick' + i]();
      }
    }
  }
};
expj.AD0130010.AD0130010button2.LineUpdate.executeAllOnDecision = function () {
};
expj.AD0130010.AD0130010button2.LineUpdate.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130010button2-LineUpdate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0130010', 'AD0130010button2', 'LineUpdate', this, 'Button');
    }
  });
  expj.AD0130010.AD0130010button2.LineUpdate.executePScriptOnLoad();
};

expj.AD0130010.AD0130010button2.LineUpdate.executePScriptOnLoad = function () {
  console.log('execute AD0130010button2/LineUpdate.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130010button2-LineUpdate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0130010-AD0130010button2-LineUpdate" name="LineUpdate" class="AD0130010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
<script class="expj-script-AD0130010-AD0130010button2-LineDelete">
expj.AD0130010.AD0130010button2.LineDelete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0130010form1/*,_AD0130010view1/+@AD0130010Servlet,,$ZZ07004"
expj.AD0130010.AD0130010button2.LineDelete.onClick0 = function () {
  console.log('LineDelete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0130010', 'AD0130010button2', '_AD0130010form1/*,_AD0130010view1/+', 'AD0130010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0130010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0130010', response);
expj.common.updateBusinessScreenTab('AD0130010', contents);
};
expj.common.pscript.callConfirm('AD0130010', 'AD0130010button2', 'ZZ07004', okEvent);
};
expj.AD0130010.AD0130010button2.LineDelete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0130010.AD0130010button2.LineDelete['onClick' + i])) {
        expj.AD0130010.AD0130010button2.LineDelete['onClick' + i]();
      }
    }
  }
};
expj.AD0130010.AD0130010button2.LineDelete.executeAllOnDecision = function () {
};
expj.AD0130010.AD0130010button2.LineDelete.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130010button2-LineDelete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0130010', 'AD0130010button2', 'LineDelete', this, 'Button');
    }
  });
  expj.AD0130010.AD0130010button2.LineDelete.executePScriptOnLoad();
};

expj.AD0130010.AD0130010button2.LineDelete.executePScriptOnLoad = function () {
  console.log('execute AD0130010button2/LineDelete.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130010button2-LineDelete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0130010-AD0130010button2-LineDelete" name="LineDelete" class="AD0130010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineDelete",rb)%></button><!-- 行削除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10" style="width:calc(100% - 643px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame11" style="width:256px;"></div><!--/td-->
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
<span class="version">AD0130010 Revision: 1.7  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AD0130010-AD0130010button0">
expj.AD0130010.AD0130010button0 = {};
expj.AD0130010.AD0130010button0.executeAllOnDecision = function () {
  console.log('execute AD0130010button0.onDecision');
};
expj.AD0130010.AD0130010button0.executeOnLoad = function () {
  expj.AD0130010.AD0130010button0.executePScriptOnLoad();
};

expj.AD0130010.AD0130010button0.executePScriptOnLoad = function () {
  console.log('execute AD0130010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0130010-AD0130010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0130010-AD0130010button0-Clear">
expj.AD0130010.AD0130010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AD0130010Servlet,,$ZZ07008"
expj.AD0130010.AD0130010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0130010', 'AD0130010button0', '', 'AD0130010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0130010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0130010', response);
expj.common.updateBusinessScreenTab('AD0130010', contents);
};
expj.common.pscript.callConfirm('AD0130010', 'AD0130010button0', 'ZZ07008', okEvent);
};
expj.AD0130010.AD0130010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0130010.AD0130010button0.Clear['onClick' + i])) {
        expj.AD0130010.AD0130010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AD0130010.AD0130010button0.Clear.executeAllOnDecision = function () {
};
expj.AD0130010.AD0130010button0.Clear.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0130010', 'AD0130010button0', 'Clear', this, 'Button');
    }
  });
  expj.AD0130010.AD0130010button0.Clear.executePScriptOnLoad();
};

expj.AD0130010.AD0130010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AD0130010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0130010-AD0130010button0-Clear" name="Clear" class="AD0130010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AD0130010-AD0130010button0-Close">
expj.AD0130010.AD0130010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AD0130010.AD0130010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AD0130010');
};
expj.AD0130010.AD0130010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0130010.AD0130010button0.Close['onClick' + i])) {
        expj.AD0130010.AD0130010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AD0130010.AD0130010button0.Close.executeAllOnDecision = function () {
};
expj.AD0130010.AD0130010button0.Close.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0130010', 'AD0130010button0', 'Close', this, 'Button');
    }
  });
  expj.AD0130010.AD0130010button0.Close.executePScriptOnLoad();
};

expj.AD0130010.AD0130010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AD0130010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0130010-AD0130010button0-Close" name="Close" class="AD0130010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AD0130010 (END)-->
<%
MessageStruct msgStruct = aAD0130010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AD0130010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AD0130010)) {
  expj.common.treeInstanceMap.AD0130010 = {};
}
expj.common.treeInstanceMap.AD0130010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0130010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AD0130010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0130010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AD0130010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AD0130010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AD0130010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AD0130010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AD0130010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AD0130010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AD0130010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0130010)) {
  expj.common.detailDialogMap.AD0130010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0130010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AD0130010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0130010.<%=detailId %>)) {
  expj.common.detailDialogMap.AD0130010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0130010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AD0130010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0130010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AD0130010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AD0130010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AD0130010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AD0130010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AD0130010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AD0130010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AD0130010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AD0130010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AD0130010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AD0130010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AD0130010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AD0130010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AD0130010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AD0130010)) {
  expj.common.viewInstanceMap.AD0130010 = {};
}
expj.common.viewInstanceMap.AD0130010.<%=viewId %> = {};
expj.common.viewInstanceMap.AD0130010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AD0130010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AD0130010.<%=viewId %>.init = function () {
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
    expj.AD0130010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AD0130010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AD0130010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AD0130010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AD0130010_init">
/**
 * AD0130010用のロード完了時初期化関数
 */
expj.AD0130010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AD0130010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AD0130010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AD0130010');
  expj.common.calendarInstanceMap.AD0130010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AD0130010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AD0130010.<%=detailId %>.init();
  expj.common.detailDialogMap.AD0130010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AD0130010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AD0130010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AD0130010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AD0130010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AD0130010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AD0130010-<%=detailId %>');
<%
 }
%>
  try{expj.AD0130010.AD0130010form1.DAILY_WORK_REPORT_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010form1.OPR_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010form1.CalendarOPR_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010form1.OPR_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010form1.CalendarOPR_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010form1.USER_CD.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010form1.PeekerUserCd.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010form1.USER_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010form1.WS_CD.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010form1.PeekerWsCd.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010form1.WS_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010button2.LineInsert.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010button2.LineUpdate.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010button2.LineDelete.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010form1.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010button1.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010view1.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010button2.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AD0130010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AD0130010', 'AD0130010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AD0130010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AD0130010-focus-move');
  // 初期フォーカス当てる処理
  $('.AD0130010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AD0130010', '<%=request.getContextPath() %>');
};

/**
 * AD0130010の全体onDecision処理
 */
expj.AD0130010.executeAllOnDecision = function () {
  expj.AD0130010.AD0130010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AD0130010_console">
expj.AD0130010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>