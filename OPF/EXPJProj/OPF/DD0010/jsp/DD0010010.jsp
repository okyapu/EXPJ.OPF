<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:51:57 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\DD0010\DD0010010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.DD0010.*" %>
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
<jsp:useBean id="aDD0010010Control" class="com.nec.jp.orteus.metamorBase.DD0010.DD0010010Control" scope="request"/>
<jsp:useBean id="aDD0010010Struct" class="com.nec.jp.orteus.metamorBase.DD0010.DD0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

標準原価参照（ツリー）
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DD0010/jsp/DD0010010.jsp,v $
$Author: geng-jia $
$Revision: 1.9 $ $Date: 2017/02/22 02:06:47 $
********************************************************* --%>
<html>
<head>
<title>標準原価参照（ツリー）</title>
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
<script class="expj-script-DD0010010_init">
  // DD0010010名前空間
  expj.DD0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<% ScreenMoveUtil su = new ScreenMoveUtil("DD0010020Servlet", so); %>

  <div id="expj-business-screen-DD0010010" data-screen="DD0010010" data-newdata="<%=aDD0010010Control.isNewData() %>">
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
              <!-- ここに上段検索条件用のDataGridを配置する。↓ -->
              <script class="expj-script-DD0010010-DD0010010form1">
expj.DD0010010.DD0010010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2"
expj.DD0010010.DD0010010form1.onLoad0 = function () {
  console.log('DD0010010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.DD0010010.DD0010010form1.onDecision0 = function () {
  console.log('DD0010010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('DD0010010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_DD0010010button1/Select"
expj.DD0010010.DD0010010form1.child0 = function () {
  console.log('DD0010010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('DD0010010', 'DD0010010form1', '_DD0010010button1/Select');
};
// script4="child;1;MASK;_DD0010010button1/Select"
expj.DD0010010.DD0010010form1.child1 = function () {
  console.log('DD0010010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('DD0010010', 'DD0010010form1', '_DD0010010button1/Select');
};
// script5="onDecision;1;CHK;?DD0010010form1/*[eq]NORMAL@*2,*4"
expj.DD0010010.DD0010010form1.onDecision1 = function () {
  console.log('DD0010010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0010010', 'DD0010010form1', '?DD0010010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;CHK;?PLANT_CD[eq]SAME[and]?YEAR[eq]SAME[and]?HALF_TERM_TYP[eq]SAME[and]?ROOT_ITEM_CD[eq]SAME@*3,*4"
expj.DD0010010.DD0010010form1.child2 = function () {
  console.log('DD0010010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0010010', 'DD0010010form1', '?PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0010010', 'DD0010010form1', '?YEAR'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0010010', 'DD0010010form1', '?HALF_TERM_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0010010', 'DD0010010form1', '?ROOT_ITEM_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_DD0010010button0/MoveList"
expj.DD0010010.DD0010010form1.child3 = function () {
  console.log('DD0010010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('DD0010010', 'DD0010010form1', '_DD0010010button0/MoveList');
};
// script8="child;4;MASK;_DD0010010button0/MoveList"
expj.DD0010010.DD0010010form1.child4 = function () {
  console.log('DD0010010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('DD0010010', 'DD0010010form1', '_DD0010010button0/MoveList');
};
// script9="onDecision;2;CHK;?DD0010010form1/*[eq]NORMAL[or]?DD0010010form1/*[eq]TOO_MANY@*5,*7"
expj.DD0010010.DD0010010form1.onDecision2 = function () {
  console.log('DD0010010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0010010', 'DD0010010form1', '?DD0010010form1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0010010', 'DD0010010form1', '?DD0010010form1/*'), '[eq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script10="child;5;CHK;?PLANT_CD[eq]SAME[and]?YEAR[eq]SAME[and]?HALF_TERM_TYP[eq]SAME[and]?ROOT_ITEM_CD[eq]SAME@*6,*7"
expj.DD0010010.DD0010010form1.child5 = function () {
  console.log('DD0010010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0010010', 'DD0010010form1', '?PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0010010', 'DD0010010form1', '?YEAR'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0010010', 'DD0010010form1', '?HALF_TERM_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DD0010010', 'DD0010010form1', '?ROOT_ITEM_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script11="child;6;UNMASK;_DD0010010button0/CsvOut"
expj.DD0010010.DD0010010form1.child6 = function () {
  console.log('DD0010010form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('DD0010010', 'DD0010010form1', '_DD0010010button0/CsvOut');
};
// script12="child;7;MASK;_DD0010010button0/CsvOut"
expj.DD0010010.DD0010010form1.child7 = function () {
  console.log('DD0010010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('DD0010010', 'DD0010010form1', '_DD0010010button0/CsvOut');
};
expj.DD0010010.DD0010010form1.executeAllOnDecision = function () {
  console.log('execute DD0010010form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DD0010010.DD0010010form1['onDecision' + i])) {
        expj.DD0010010.DD0010010form1['onDecision' + i]();
      }
    }
  }
};
expj.DD0010010.DD0010010form1.executeOnLoad = function () {
  expj.DD0010010.DD0010010form1.executePScriptOnLoad();
};

expj.DD0010010.DD0010010form1.executePScriptOnLoad = function () {
  console.log('execute DD0010010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.DD0010010.DD0010010form1['onLoad' + i])) {
      expj.DD0010010.DD0010010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-DD0010010-DD0010010form1" action="DD0010010Servlet" name="DD0010010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aDD0010010Control.getReadStatusString()) %>" style="height:96px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-DD0010010-DD0010010form1-PLANT_CD">
expj.DD0010010.DD0010010form1.PLANT_CD = {};
expj.DD0010010.DD0010010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute DD0010010form1/PLANT_CD.onDecision');
  expj.DD0010010.DD0010010form1.executeAllOnDecision();
  expj.DD0010010.executeAllOnDecision();
};
expj.DD0010010.DD0010010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-DD0010010-DD0010010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DD0010010', 'DD0010010form1', 'PLANT_CD', this);
  });
  expj.DD0010010.DD0010010form1.PLANT_CD.executePScriptOnLoad();
};

expj.DD0010010.DD0010010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute DD0010010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-DD0010010-DD0010010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DD0010010-DD0010010form1-PLANT_CD" name="PLANT_CD" class="DD0010010-focus-move  required-value expj-DD0010010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDD0010010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-DD0010010-DD0010010form1-PeekerPlantCd">
expj.DD0010010.DD0010010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_DD0010010form1/PLANT_CD:_DD0010010form1/PLANT_NAME@<%=contextNo%>"
expj.DD0010010.DD0010010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DD0010010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DD0010010', 'DD0010010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DD0010010form1/PLANT_CD:_DD0010010form1/PLANT_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DD0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DD0010010.DD0010010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DD0010010.DD0010010form1.PeekerPlantCd['onClick' + i])) {
        expj.DD0010010.DD0010010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.DD0010010.DD0010010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.DD0010010.DD0010010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-DD0010010-DD0010010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DD0010010', 'DD0010010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.DD0010010.DD0010010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.DD0010010.DD0010010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute DD0010010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-DD0010010-DD0010010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DD0010010-DD0010010form1-PeekerPlantCd" class="DD0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DD0010010-DD0010010form1-PLANT_NAME">
expj.DD0010010.DD0010010form1.PLANT_NAME = {};
expj.DD0010010.DD0010010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute DD0010010form1/PLANT_NAME.onDecision');
  expj.DD0010010.DD0010010form1.executeAllOnDecision();
  expj.DD0010010.executeAllOnDecision();
};
expj.DD0010010.DD0010010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-DD0010010-DD0010010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DD0010010', 'DD0010010form1', 'PLANT_NAME', this);
  });
  expj.DD0010010.DD0010010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.DD0010010.DD0010010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute DD0010010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DD0010010-DD0010010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DD0010010-DD0010010form1-PLANT_NAME" name="PLANT_NAME" class="DD0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDD0010010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.YEAR",rb)%></span><!-- 年度 --></div><!--/td-->
<script class="expj-script-DD0010010-DD0010010form1-YEAR">
expj.DD0010010.DD0010010form1.YEAR = {};
expj.DD0010010.DD0010010form1.YEAR.executeAllOnDecision = function () {
  console.log('execute DD0010010form1/YEAR.onDecision');
  expj.DD0010010.DD0010010form1.executeAllOnDecision();
  expj.DD0010010.executeAllOnDecision();
};
expj.DD0010010.DD0010010form1.YEAR.executeOnLoad = function () {
  $('#expj-DD0010010-DD0010010form1-YEAR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DD0010010', 'DD0010010form1', 'YEAR', this);
  });
  expj.DD0010010.DD0010010form1.YEAR.executePScriptOnLoad();
};

expj.DD0010010.DD0010010form1.YEAR.executePScriptOnLoad = function () {
  console.log('execute DD0010010form1/YEAR.onLoad');
  var targetComponent = document.getElementById('expj-DD0010010-DD0010010form1-YEAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DD0010010-DD0010010form1-YEAR" name="YEAR" class="DD0010010-focus-move expj-align-right required-value expj-DD0010010-required-A" style="width:150px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aDD0010010Struct.getYEAR()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.HALF_TERM_TYP",rb)%></span><!-- 半期区分 --></div><!--/td-->
<script class="expj-script-DD0010010-DD0010010form1-HALF_TERM_TYP">
expj.DD0010010.DD0010010form1.HALF_TERM_TYP = {};
expj.DD0010010.DD0010010form1.HALF_TERM_TYP.executeAllOnDecision = function () {
  console.log('execute DD0010010form1/HALF_TERM_TYP.onDecision');
  expj.DD0010010.DD0010010form1.executeAllOnDecision();
  expj.DD0010010.executeAllOnDecision();
};
expj.DD0010010.DD0010010form1.HALF_TERM_TYP.executeOnLoad = function () {
  $('#expj-DD0010010-DD0010010form1-HALF_TERM_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DD0010010', 'DD0010010form1', 'HALF_TERM_TYP', this);
  });
  expj.DD0010010.DD0010010form1.HALF_TERM_TYP.executePScriptOnLoad();
};

expj.DD0010010.DD0010010form1.HALF_TERM_TYP.executePScriptOnLoad = function () {
  console.log('execute DD0010010form1/HALF_TERM_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DD0010010-DD0010010form1-HALF_TERM_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DD0010010-DD0010010form1-HALF_TERM_TYP" name='HALF_TERM_TYP' class='DD0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDD0010010Control.getStruct().getList_HALF_TERM_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDD0010010Control.getStruct().getList_HALF_TERM_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aDD0010010Control.getStruct().getList_HALF_TERM_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDD0010010Struct.getHALF_TERM_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ROOT_ITEM_CD",rb)%></span><!-- 最上位品目番号 --></div><!--/td-->
<script class="expj-script-DD0010010-DD0010010form1-ROOT_ITEM_CD">
expj.DD0010010.DD0010010form1.ROOT_ITEM_CD = {};
expj.DD0010010.DD0010010form1.ROOT_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute DD0010010form1/ROOT_ITEM_CD.onDecision');
  expj.DD0010010.DD0010010form1.executeAllOnDecision();
  expj.DD0010010.executeAllOnDecision();
};
expj.DD0010010.DD0010010form1.ROOT_ITEM_CD.executeOnLoad = function () {
  $('#expj-DD0010010-DD0010010form1-ROOT_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DD0010010', 'DD0010010form1', 'ROOT_ITEM_CD', this);
  });
  expj.DD0010010.DD0010010form1.ROOT_ITEM_CD.executePScriptOnLoad();
};

expj.DD0010010.DD0010010form1.ROOT_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute DD0010010form1/ROOT_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-DD0010010-DD0010010form1-ROOT_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DD0010010-DD0010010form1-ROOT_ITEM_CD" name="ROOT_ITEM_CD" class="DD0010010-focus-move  required-value expj-DD0010010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDD0010010Struct.getROOT_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-DD0010010-DD0010010form1-PeekerItemCd">
expj.DD0010010.DD0010010form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_DD0010010form1/ROOT_ITEM_CD:_DD0010010form1/ROOT_ITEM_NAME@<%=contextNo%>"
expj.DD0010010.DD0010010form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DD0010010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DD0010010', 'DD0010010form1', '_YEAR') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DD0010010', 'DD0010010form1', '_HALF_TERM_TYP') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_3%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DD0010010', 'DD0010010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_4%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DD0010010', 'DD0010010form1', '_ROOT_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ROOT_ITEM_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DD0010010form1/ROOT_ITEM_CD:_DD0010010form1/ROOT_ITEM_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DD0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DD0010010.DD0010010form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DD0010010.DD0010010form1.PeekerItemCd['onClick' + i])) {
        expj.DD0010010.DD0010010form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.DD0010010.DD0010010form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.DD0010010.DD0010010form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-DD0010010-DD0010010form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DD0010010', 'DD0010010form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.DD0010010.DD0010010form1.PeekerItemCd.executePScriptOnLoad();
};

expj.DD0010010.DD0010010form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute DD0010010form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-DD0010010-DD0010010form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DD0010010-DD0010010form1-PeekerItemCd" class="DD0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DD0010010-DD0010010form1-ROOT_ITEM_NAME">
expj.DD0010010.DD0010010form1.ROOT_ITEM_NAME = {};
expj.DD0010010.DD0010010form1.ROOT_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute DD0010010form1/ROOT_ITEM_NAME.onDecision');
  expj.DD0010010.DD0010010form1.executeAllOnDecision();
  expj.DD0010010.executeAllOnDecision();
};
expj.DD0010010.DD0010010form1.ROOT_ITEM_NAME.executeOnLoad = function () {
  $('#expj-DD0010010-DD0010010form1-ROOT_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DD0010010', 'DD0010010form1', 'ROOT_ITEM_NAME', this);
  });
  expj.DD0010010.DD0010010form1.ROOT_ITEM_NAME.executePScriptOnLoad();
};

expj.DD0010010.DD0010010form1.ROOT_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute DD0010010form1/ROOT_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DD0010010-DD0010010form1-ROOT_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DD0010010-DD0010010form1-ROOT_ITEM_NAME" name="ROOT_ITEM_NAME" class="DD0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDD0010010Struct.getROOT_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0018",rb)%></span><!-- 初期展開レベル --></div><!--/td-->
<script class="expj-script-DD0010010-DD0010010form1-InitLevel">
expj.DD0010010.DD0010010form1.InitLevel = {};
expj.DD0010010.DD0010010form1.InitLevel.executeAllOnDecision = function () {
  console.log('execute DD0010010form1/InitLevel.onDecision');
  expj.DD0010010.DD0010010form1.executeAllOnDecision();
  expj.DD0010010.executeAllOnDecision();
};
expj.DD0010010.DD0010010form1.InitLevel.executeOnLoad = function () {
  $('#expj-DD0010010-DD0010010form1-InitLevel').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DD0010010', 'DD0010010form1', 'InitLevel', this);
  });
  expj.DD0010010.DD0010010form1.InitLevel.executePScriptOnLoad();
};

expj.DD0010010.DD0010010form1.InitLevel.executePScriptOnLoad = function () {
  console.log('execute DD0010010form1/InitLevel.onLoad');
  var targetComponent = document.getElementById('expj-DD0010010-DD0010010form1-InitLevel');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DD0010010-DD0010010form1-InitLevel" name="InitLevel" class="DD0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;8;FLOOR;0" value="<%= TypeConverter.sanitizer(aDD0010010Struct.getInitLevel()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<input type="hidden" id="expj-DD0010010-DD0010010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDD0010010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-DD0010010-DD0010010form1-DOWNLOAD_FILE">
expj.DD0010010.DD0010010form1.DOWNLOAD_FILE = {};
expj.DD0010010.DD0010010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute DD0010010form1/DOWNLOAD_FILE.onDecision');
  expj.DD0010010.DD0010010form1.executeAllOnDecision();
  expj.DD0010010.executeAllOnDecision();
};
expj.DD0010010.DD0010010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-DD0010010-DD0010010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DD0010010', 'DD0010010form1', 'DOWNLOAD_FILE', this);
  });
  expj.DD0010010.DD0010010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.DD0010010.DD0010010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute DD0010010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-DD0010010-DD0010010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-DD0010010-DD0010010form1-h_MaxLevel" name="h_MaxLevel" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDD0010010Struct.geth_MaxLevel()) %>">
<script class="expj-script-DD0010010-DD0010010form1-h_MaxLevel">
expj.DD0010010.DD0010010form1.h_MaxLevel = {};
expj.DD0010010.DD0010010form1.h_MaxLevel.executeAllOnDecision = function () {
  console.log('execute DD0010010form1/h_MaxLevel.onDecision');
  expj.DD0010010.DD0010010form1.executeAllOnDecision();
  expj.DD0010010.executeAllOnDecision();
};
expj.DD0010010.DD0010010form1.h_MaxLevel.executeOnLoad = function () {
  $('#expj-DD0010010-DD0010010form1-h_MaxLevel').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DD0010010', 'DD0010010form1', 'h_MaxLevel', this);
  });
  expj.DD0010010.DD0010010form1.h_MaxLevel.executePScriptOnLoad();
};

expj.DD0010010.DD0010010form1.h_MaxLevel.executePScriptOnLoad = function () {
  console.log('execute DD0010010form1/h_MaxLevel.onLoad');
  var targetComponent = document.getElementById('expj-DD0010010-DD0010010form1-h_MaxLevel');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-DD0010010-DD0010010form1-h_ProcTyp" name="h_ProcTyp" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDD0010010Struct.geth_ProcTyp()) %>">
<script class="expj-script-DD0010010-DD0010010form1-h_ProcTyp">
expj.DD0010010.DD0010010form1.h_ProcTyp = {};
expj.DD0010010.DD0010010form1.h_ProcTyp.executeAllOnDecision = function () {
  console.log('execute DD0010010form1/h_ProcTyp.onDecision');
  expj.DD0010010.DD0010010form1.executeAllOnDecision();
  expj.DD0010010.executeAllOnDecision();
};
expj.DD0010010.DD0010010form1.h_ProcTyp.executeOnLoad = function () {
  $('#expj-DD0010010-DD0010010form1-h_ProcTyp').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DD0010010', 'DD0010010form1', 'h_ProcTyp', this);
  });
  expj.DD0010010.DD0010010form1.h_ProcTyp.executePScriptOnLoad();
};

expj.DD0010010.DD0010010form1.h_ProcTyp.executePScriptOnLoad = function () {
  console.log('execute DD0010010form1/h_ProcTyp.onLoad');
  var targetComponent = document.getElementById('expj-DD0010010-DD0010010form1-h_ProcTyp');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-DD0010010-DD0010010button1">
expj.DD0010010.DD0010010button1 = {};
expj.DD0010010.DD0010010button1.executeAllOnDecision = function () {
  console.log('execute DD0010010button1.onDecision');
};
expj.DD0010010.DD0010010button1.executeOnLoad = function () {
  expj.DD0010010.DD0010010button1.executePScriptOnLoad();
};

expj.DD0010010.DD0010010button1.executePScriptOnLoad = function () {
  console.log('execute DD0010010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DD0010010-DD0010010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DD0010010-DD0010010button1-Select">
expj.DD0010010.DD0010010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DD0010010form1/*@DD0010010Servlet"
expj.DD0010010.DD0010010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DD0010010', 'DD0010010button1', '_DD0010010form1/*', 'DD0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DD0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DD0010010', response);
expj.common.updateBusinessScreenTab('DD0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.DD0010010.DD0010010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DD0010010.DD0010010button1.Select['onClick' + i])) {
        expj.DD0010010.DD0010010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.DD0010010.DD0010010button1.Select.executeAllOnDecision = function () {
};
expj.DD0010010.DD0010010button1.Select.executeOnLoad = function () {
  $('#expj-DD0010010-DD0010010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DD0010010', 'DD0010010button1', 'Select', this, 'Button');
    }
  });
  expj.DD0010010.DD0010010button1.Select.executePScriptOnLoad();
};

expj.DD0010010.DD0010010button1.Select.executePScriptOnLoad = function () {
  console.log('execute DD0010010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-DD0010010-DD0010010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DD0010010-DD0010010button1-Select" name="Select" class="DD0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-DD0010010-DD0010010tree1">
expj.DD0010010.DD0010010tree1 = {};
// script1="onClick;0;FSHOW;DD0010010float1@161"
expj.DD0010010.DD0010010tree1.onClick0 = function () {
  console.log('DD0010010tree1 script1');
expj.common.pscript.showDetailWindow('DD0010010', 'DD0010010float1', '161');
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,ShowDetail=ACT,SUBMIT_BUTTON_TYPE=0,_DD0010010form1/*,_DD0010010tree1/+@DD0010010Servlet"
expj.DD0010010.DD0010010tree1.onClick1 = function () {
  console.log('DD0010010tree1 script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DD0010010', 'DD0010010tree1', 'ShowDetail=ACT,SUBMIT_BUTTON_TYPE=0,_DD0010010form1/*,_DD0010010tree1/+', 'DD0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DD0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DD0010010', response);
expj.common.updateBusinessScreenTab('DD0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script3="onDmyOpen;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,AddTree=ACT,_DD0010010tree1/+@DD0010010Servlet"
expj.DD0010010.DD0010010tree1.onDmyOpen0 = function () {
  console.log('DD0010010tree1 script3');
var params = expj.common.pscript.createParameter('DD0010010', 'DD0010010tree1', 'AddTree=ACT,_DD0010010tree1/+', 'DD0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
return params;
};
expj.DD0010010.DD0010010tree1.setContextAll = function () {
  var controlData = [
  ];
  var contextData = [
  ];
  var beforeFunc = function (event, ui) {
    expj.common.changeStateTreeContext(expj.common.treeInstanceMap.DD0010010.DD0010010tree1.gPrevSelectedNode, ui);
  };
  expj.common.createTreeContextInstance('#expj-DD0010010-DD0010010tree1-wrapper', '#expj-DD0010010-DD0010010tree1', contextData, controlData, beforeFunc);
};
expj.DD0010010.DD0010010tree1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DD0010010.DD0010010tree1['onClick' + i])) {
        expj.DD0010010.DD0010010tree1['onClick' + i]();
      }
    }
  }
};
expj.DD0010010.DD0010010tree1.executeAllOnDecision = function () {
  console.log('execute DD0010010tree1.onDecision');
};
expj.DD0010010.DD0010010tree1.executeOnLoad = function () {
<%
    treeClickEvent.put("DD0010010tree1", "expj.DD0010010.DD0010010tree1.executeAllOnClick");
%>
  expj.DD0010010.DD0010010tree1.setContextAll();
  expj.DD0010010.DD0010010tree1.executePScriptOnLoad();
};

expj.DD0010010.DD0010010tree1.executePScriptOnLoad = function () {
  console.log('execute DD0010010tree1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
if(aDD0010010Control.isNewData() == true){
%>
<div id="expj-DD0010010-DD0010010tree1-wrapper" class="expj-datagrid-tree" style="width:100%; height:100%; overflow:auto;background-color:#FFFFFF;">
<div id="expj-DD0010010-DD0010010tree1" data-orftype="Tree" data-mode="TREE" class="hasmenu" style="background-color:#FFFFFF;">
</div><!--Tree-->
</div>
<%
 treeId = "DD0010010tree1";
 treeXmlData = aDD0010010Control.getFlashTreeXML();
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame18 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame19 button-area" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame20 button-area-right" style="width:60px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 420px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">DD0010010 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:420px;">
<script class="expj-script-DD0010010-DD0010010button0">
expj.DD0010010.DD0010010button0 = {};
expj.DD0010010.DD0010010button0.executeAllOnDecision = function () {
  console.log('execute DD0010010button0.onDecision');
};
expj.DD0010010.DD0010010button0.executeOnLoad = function () {
  expj.DD0010010.DD0010010button0.executePScriptOnLoad();
};

expj.DD0010010.DD0010010button0.executePScriptOnLoad = function () {
  console.log('execute DD0010010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DD0010010-DD0010010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DD0010010-DD0010010button0-CsvOut">
expj.DD0010010.DD0010010button0.CsvOut = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DD0010010form1/*,_DD0010010detail1/*@DD0010010Servlet,,$ZZ07011"
expj.DD0010010.DD0010010button0.CsvOut.onClick0 = function () {
  console.log('CsvOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DD0010010', 'DD0010010button0', '_DD0010010form1/*,_DD0010010detail1/*', 'DD0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DD0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DD0010010', response);
expj.common.updateBusinessScreenTab('DD0010010', contents);
};
expj.common.pscript.callConfirm('DD0010010', 'DD0010010button0', 'ZZ07011', okEvent);
};
expj.DD0010010.DD0010010button0.CsvOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DD0010010.DD0010010button0.CsvOut['onClick' + i])) {
        expj.DD0010010.DD0010010button0.CsvOut['onClick' + i]();
      }
    }
  }
};
expj.DD0010010.DD0010010button0.CsvOut.executeAllOnDecision = function () {
};
expj.DD0010010.DD0010010button0.CsvOut.executeOnLoad = function () {
  $('#expj-DD0010010-DD0010010button0-CsvOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DD0010010', 'DD0010010button0', 'CsvOut', this, 'Button');
    }
  });
  expj.DD0010010.DD0010010button0.CsvOut.executePScriptOnLoad();
};

expj.DD0010010.DD0010010button0.CsvOut.executePScriptOnLoad = function () {
  console.log('execute DD0010010button0/CsvOut.onLoad');
  var targetComponent = document.getElementById('expj-DD0010010-DD0010010button0-CsvOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DD0010010-DD0010010button0-CsvOut" name="CsvOut" class="DD0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-DD0010010-DD0010010button0-MoveList">
expj.DD0010010.DD0010010button0.MoveList = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_DD0010010form1/*@DD0010020Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.DD0010010.DD0010010button0.MoveList.onClick0 = function () {
  console.log('MoveList script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DD0010010', 'DD0010010button0', '_DD0010010form1/*', 'DD0010020Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('DD0010020Servlet');
var response = expj.common.accessBusinessScreen('POST', 'DD0010020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'DD0010010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.DD0010010.DD0010010button0.MoveList.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DD0010010.DD0010010button0.MoveList['onClick' + i])) {
        expj.DD0010010.DD0010010button0.MoveList['onClick' + i]();
      }
    }
  }
};
expj.DD0010010.DD0010010button0.MoveList.executeAllOnDecision = function () {
};
expj.DD0010010.DD0010010button0.MoveList.executeOnLoad = function () {
  $('#expj-DD0010010-DD0010010button0-MoveList').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DD0010010', 'DD0010010button0', 'MoveList', this, 'Button');
    }
  });
  expj.DD0010010.DD0010010button0.MoveList.executePScriptOnLoad();
};

expj.DD0010010.DD0010010button0.MoveList.executePScriptOnLoad = function () {
  console.log('execute DD0010010button0/MoveList.onLoad');
  var targetComponent = document.getElementById('expj-DD0010010-DD0010010button0-MoveList');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DD0010010-DD0010010button0-MoveList" name="MoveList" class="DD0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnMoveList",rb)%></button><!-- 一覧表示ボタン --></div><!--/td-->
<script class="expj-script-DD0010010-DD0010010button0-Clear">
expj.DD0010010.DD0010010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@DD0010010Servlet,,$ZZ07008"
expj.DD0010010.DD0010010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DD0010010', 'DD0010010button0', '', 'DD0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DD0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DD0010010', response);
expj.common.updateBusinessScreenTab('DD0010010', contents);
};
expj.common.pscript.callConfirm('DD0010010', 'DD0010010button0', 'ZZ07008', okEvent);
};
expj.DD0010010.DD0010010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DD0010010.DD0010010button0.Clear['onClick' + i])) {
        expj.DD0010010.DD0010010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.DD0010010.DD0010010button0.Clear.executeAllOnDecision = function () {
};
expj.DD0010010.DD0010010button0.Clear.executeOnLoad = function () {
  $('#expj-DD0010010-DD0010010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DD0010010', 'DD0010010button0', 'Clear', this, 'Button');
    }
  });
  expj.DD0010010.DD0010010button0.Clear.executePScriptOnLoad();
};

expj.DD0010010.DD0010010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute DD0010010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-DD0010010-DD0010010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DD0010010-DD0010010button0-Clear" name="Clear" class="DD0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-DD0010010-DD0010010button0-Close">
expj.DD0010010.DD0010010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.DD0010010.DD0010010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('DD0010010');
};
expj.DD0010010.DD0010010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DD0010010.DD0010010button0.Close['onClick' + i])) {
        expj.DD0010010.DD0010010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.DD0010010.DD0010010button0.Close.executeAllOnDecision = function () {
};
expj.DD0010010.DD0010010button0.Close.executeOnLoad = function () {
  $('#expj-DD0010010-DD0010010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DD0010010', 'DD0010010button0', 'Close', this, 'Button');
    }
  });
  expj.DD0010010.DD0010010button0.Close.executePScriptOnLoad();
};

expj.DD0010010.DD0010010button0.Close.executePScriptOnLoad = function () {
  console.log('execute DD0010010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-DD0010010-DD0010010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DD0010010-DD0010010button0-Close" name="Close" class="DD0010010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-DD0010010 (END)-->
<script class="expj-script-DD0010010-DD0010010detail1">
expj.DD0010010.DD0010010detail1 = {};
expj.DD0010010.DD0010010detail1.executeAllOnDecision = function () {
  console.log('execute DD0010010detail1.onDecision');
};
expj.DD0010010.DD0010010detail1.executeOnLoad = function () {
  expj.DD0010010.DD0010010detail1.executePScriptOnLoad();
};

expj.DD0010010.DD0010010detail1.executePScriptOnLoad = function () {
  console.log('execute DD0010010detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aDD0010010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-DD0010010-DD0010010detail1" class="expj-datagird-detail" data-float="DD0010010float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "DD0010010detail1";
 detailFloat = "DD0010010float1";
 detailWidth = 358;
 detailHeight = 323 + 47;
 String DD0010010detail1_Id = "DD0010010detail1";
 String DD0010010detail1_select = "single";
 String DD0010010detail1_sortable = "true";
 String DD0010010detail1_resize = "true";
 String DD0010010detail1_scroll = "true";
 StringBuffer DD0010010detail1_HB = new StringBuffer();
 StringBuffer DD0010010detail1_DB = new StringBuffer();
%>
<%
 DD0010010detail1_sortable = "false";
 DD0010010detail1_select = "none";
%>
<% DD0010010detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(DD0010010detail1_sortable).append("}").append(","); %>
<%  DD0010010detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(DD0010010detail1_sortable).append("}").append(",");
DD0010010detail1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-','sortable':").append(DD0010010detail1_sortable).append("}").append(",");
DD0010010detail1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-','sortable':").append(DD0010010detail1_sortable).append("}").append(",");
 %>
  <% DD0010010detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_ITEM_CD\" class=\"expj-label\" data-name=\"d_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_ITEM_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.ITEM_NAME",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_ITEM_NAME\" class=\"expj-label\" data-name=\"d_ITEM_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_ITEM_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.PS_UNIT_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-DD0010010-DD0010010detail1-d_PS_UNIT_QTY\" class=\"expj-label\" data-name=\"d_PS_UNIT_QTY\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_PS_UNIT_QTY())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.NECESSARY_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-DD0010010-DD0010010detail1-d_NECESSARY_QTY\" class=\"expj-label\" data-name=\"d_NECESSARY_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_NECESSARY_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_STOCK_UNIT\" class=\"expj-label\" data-name=\"d_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_STOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.PS_INPUT_RATIO",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-DD0010010-DD0010010detail1-d_PS_INPUT_RATIO\" class=\"expj-label\" data-name=\"d_PS_INPUT_RATIO\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_PS_INPUT_RATIO())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.ITEM_INPUT_RATIO",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-DD0010010-DD0010010detail1-d_ITEM_INPUT_RATIO\" class=\"expj-label\" data-name=\"d_ITEM_INPUT_RATIO\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_ITEM_INPUT_RATIO())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.TOTAL_COST",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-DD0010010-DD0010010detail1-d_TOTAL_COST\" class=\"expj-label\" data-name=\"d_TOTAL_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_TOTAL_COST())).append("</span>").append("</div>','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_HOME_CUR_UNIT\" class=\"expj-label\" data-name=\"d_HOME_CUR_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_HOME_CUR_UNIT())).append("</span>").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.OWN_MATR_COST",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-DD0010010-DD0010010detail1-d_OWN_MATR_COST\" class=\"expj-label\" data-name=\"d_OWN_MATR_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_OWN_MATR_COST())).append("</span>").append("</div>','").append("<span id=\"expj-DD0010010-DD0010010detail1-d1_HOME_CUR_UNIT\" class=\"expj-label\" data-name=\"d1_HOME_CUR_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_HOME_CUR_UNIT())).append("</span>").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.TOTAL_MATR_COST",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-DD0010010-DD0010010detail1-d_TOTAL_MATR_COST\" class=\"expj-label\" data-name=\"d_TOTAL_MATR_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_TOTAL_MATR_COST())).append("</span>").append("</div>','").append("<span id=\"expj-DD0010010-DD0010010detail1-d2_HOME_CUR_UNIT\" class=\"expj-label\" data-name=\"d2_HOME_CUR_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_HOME_CUR_UNIT())).append("</span>").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.OWN_SBCNT_MATR_COST",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-DD0010010-DD0010010detail1-d_OWN_SBCNT_MATR_COST\" class=\"expj-label\" data-name=\"d_OWN_SBCNT_MATR_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_OWN_SBCNT_MATR_COST())).append("</span>").append("</div>','").append("<span id=\"expj-DD0010010-DD0010010detail1-d3_HOME_CUR_UNIT\" class=\"expj-label\" data-name=\"d3_HOME_CUR_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_HOME_CUR_UNIT())).append("</span>").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['11','").append(CoreTools.getRBString("Expj.TOTAL_SBCNT_MATR_COST",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-DD0010010-DD0010010detail1-d_TOTAL_SBCNT_MATR_COST\" class=\"expj-label\" data-name=\"d_TOTAL_SBCNT_MATR_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_TOTAL_SBCNT_MATR_COST())).append("</span>").append("</div>','").append("<span id=\"expj-DD0010010-DD0010010detail1-d4_HOME_CUR_UNIT\" class=\"expj-label\" data-name=\"d4_HOME_CUR_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_HOME_CUR_UNIT())).append("</span>").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['12','").append(CoreTools.getRBString("Expj.OWN_PROC_COST_SUM_ALL",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-DD0010010-DD0010010detail1-d_OWN_PROC_COST_SUM_ALL\" class=\"expj-label\" data-name=\"d_OWN_PROC_COST_SUM_ALL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_OWN_PROC_COST_SUM_ALL())).append("</span>").append("</div>','").append("<span id=\"expj-DD0010010-DD0010010detail1-d5_HOME_CUR_UNIT\" class=\"expj-label\" data-name=\"d5_HOME_CUR_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_HOME_CUR_UNIT())).append("</span>").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['13','").append(CoreTools.getRBString("Expj.TOTAL_PROC_COST_SUM_ALL",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-DD0010010-DD0010010detail1-d_TOTAL_PROC_COST_SUM_ALL\" class=\"expj-label\" data-name=\"d_TOTAL_PROC_COST_SUM_ALL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_TOTAL_PROC_COST_SUM_ALL())).append("</span>").append("</div>','").append("<span id=\"expj-DD0010010-DD0010010detail1-d6_HOME_CUR_UNIT\" class=\"expj-label\" data-name=\"d6_HOME_CUR_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_HOME_CUR_UNIT())).append("</span>").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['14','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_MRP_ODR_TYP_DN\" class=\"expj-label\" data-name=\"d_MRP_ODR_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_MRP_ODR_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['15','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP_4",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_OUTSIDE_TYP_DN\" class=\"expj-label\" data-name=\"d_OUTSIDE_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_OUTSIDE_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['16','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP_6",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_PROC_OUTSIDE_TYP_DN\" class=\"expj-label\" data-name=\"d_PROC_OUTSIDE_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_PROC_OUTSIDE_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['17','").append(CoreTools.getRBString("Expj.CLASIFICATION_CD_1",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_CLASIFICATION_CD\" class=\"expj-label\" data-name=\"d_CLASIFICATION_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_CLASIFICATION_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['18','").append(CoreTools.getRBString("Expj.CS_PROC_CD",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_CS_PROC_CD\" class=\"expj-label\" data-name=\"d_CS_PROC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_CS_PROC_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['19','").append(CoreTools.getRBString("Expj.CS_PROC_NAME",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_CS_PROC_NAME\" class=\"expj-label\" data-name=\"d_CS_PROC_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_CS_PROC_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['20','").append(CoreTools.getRBString("Expj.COST_UP_TYP",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_COST_UP_TYP_DN\" class=\"expj-label\" data-name=\"d_COST_UP_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_COST_UP_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['21','").append(CoreTools.getRBString("Expj.VOLUNT_SPL_FLG",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_VOLUNT_SPL_FLG_DN\" class=\"expj-label\" data-name=\"d_VOLUNT_SPL_FLG_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_VOLUNT_SPL_FLG_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['22','").append(CoreTools.getRBString("Expj.ONEROUS_CONS_FLG",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_ONEROUS_CONS_FLG_DN\" class=\"expj-label\" data-name=\"d_ONEROUS_CONS_FLG_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_ONEROUS_CONS_FLG_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['23','").append(CoreTools.getRBString("Expj.PARENT_ITEM_CD",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_PARENT_ITEM_CD\" class=\"expj-label\" data-name=\"d_PARENT_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_PARENT_ITEM_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% DD0010010detail1_DB.append("['24','").append(CoreTools.getRBString("Expj.PARENT_ITEM_NAME",rb)).append("','").append("<span id=\"expj-DD0010010-DD0010010detail1-d_PARENT_ITEM_NAME\" class=\"expj-label\" data-name=\"d_PARENT_ITEM_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aDD0010010Struct.getd_PARENT_ITEM_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
<%
 detailViewId = DD0010010detail1_Id;
 detailViewSelect = DD0010010detail1_select;
 detailViewResize = DD0010010detail1_resize;
 detailViewScroll = DD0010010detail1_scroll;
 detailViewHeaderData = DD0010010detail1_HB;
 detailViewBodyData = DD0010010detail1_DB;
%>
<%
}
%>
<% MessageStruct msgStruct = aDD0010010Control.getMsgStruct(); %><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-DD0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.DD0010010)) {
  expj.common.treeInstanceMap.DD0010010 = {};
}
expj.common.treeInstanceMap.DD0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.DD0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.DD0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.DD0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.DD0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.DD0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.DD0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.DD0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.DD0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = expj.DD0010010.DD0010010tree1.onDmyOpen0;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-DD0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-DD0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DD0010010)) {
  expj.common.detailDialogMap.DD0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DD0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.DD0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DD0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.DD0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DD0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.DD0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DD0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.DD0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.DD0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.DD0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-DD0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.DD0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-DD0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.DD0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-DD0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.DD0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.DD0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.DD0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.DD0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-DD0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.DD0010010)) {
  expj.common.viewInstanceMap.DD0010010 = {};
}
expj.common.viewInstanceMap.DD0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.DD0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.DD0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.DD0010010.<%=viewId %>.init = function () {
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
    expj.DD0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.DD0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-DD0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-DD0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-DD0010010_init">
/**
 * DD0010010用のロード完了時初期化関数
 */
expj.DD0010010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-DD0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('DD0010010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('DD0010010');
  expj.common.calendarInstanceMap.DD0010010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.DD0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.DD0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.DD0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.DD0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.DD0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-DD0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-DD0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-DD0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-DD0010010-<%=detailId %>');
<%
 }
%>
  try{expj.DD0010010.DD0010010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.DD0010010.DD0010010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.DD0010010.DD0010010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.DD0010010.DD0010010form1.YEAR.executeOnLoad();}catch(e){};
  try{expj.DD0010010.DD0010010form1.HALF_TERM_TYP.executeOnLoad();}catch(e){};
  try{expj.DD0010010.DD0010010form1.ROOT_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.DD0010010.DD0010010form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.DD0010010.DD0010010form1.ROOT_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.DD0010010.DD0010010form1.InitLevel.executeOnLoad();}catch(e){};
  try{expj.DD0010010.DD0010010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.DD0010010.DD0010010form1.h_MaxLevel.executeOnLoad();}catch(e){};
  try{expj.DD0010010.DD0010010form1.h_ProcTyp.executeOnLoad();}catch(e){};
  try{expj.DD0010010.DD0010010button1.Select.executeOnLoad();}catch(e){};
  try{expj.DD0010010.DD0010010button0.CsvOut.executeOnLoad();}catch(e){};
  try{expj.DD0010010.DD0010010button0.MoveList.executeOnLoad();}catch(e){};
  try{expj.DD0010010.DD0010010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.DD0010010.DD0010010button0.Close.executeOnLoad();}catch(e){};
  try{expj.DD0010010.DD0010010form1.executeOnLoad();}catch(e){};
  try{expj.DD0010010.DD0010010button1.executeOnLoad();}catch(e){};
  try{expj.DD0010010.DD0010010tree1.executeOnLoad();}catch(e){};
  try{expj.DD0010010.DD0010010button0.executeOnLoad();}catch(e){};
  try{expj.DD0010010.DD0010010detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.DD0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-DD0010010', 'DD0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-DD0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.DD0010010-focus-move');
  // 初期フォーカス当てる処理
  $('.DD0010010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('DD0010010', '<%=request.getContextPath() %>');
};

/**
 * DD0010010の全体onDecision処理
 */
expj.DD0010010.executeAllOnDecision = function () {
  expj.DD0010010.DD0010010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-DD0010010_console">
expj.DD0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>