<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:49:43 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\DA0040\DA0040010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.DA0040.*" %>
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
<jsp:useBean id="aDA0040010Control" class="com.nec.jp.orteus.metamorBase.DA0040.DA0040010Control" scope="request"/>
<jsp:useBean id="aDA0040010Struct" class="com.nec.jp.orteus.metamorBase.DA0040.DA0040010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

�i�ڕʉ��H��}�X�^�����e�i���X
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DA0040/jsp/DA0040010.jsp,v $
$Author: geng-jia $
$Revision: 1.11 $ $Date: 2017/02/22 02:06:38 $
********************************************************* --%>
<html>
<head>
<title>�i�ڕʉ��H��}�X�^�����e�i���X</title>
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
<script class="expj-script-DA0040010_init">
  // DA0040010���O���
  expj.DA0040010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<div id="expj-business-screen-DA0040010" data-screen="DA0040010" data-newdata="<%=aDA0040010Control.isNewData() %>">
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
            <script class="expj-script-DA0040010-DA0040010form1">
expj.DA0040010.DA0040010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2"
expj.DA0040010.DA0040010form1.onLoad0 = function () {
  console.log('DA0040010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.DA0040010.DA0040010form1.onDecision0 = function () {
  console.log('DA0040010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('DA0040010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="onDecision;1;CHK;?DA0040010form1/*[neq]INITIAL@*2,*4"
expj.DA0040010.DA0040010form1.onDecision1 = function () {
  console.log('DA0040010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0040010', 'DA0040010form1', '?DA0040010form1/*'), '[neq]', 'INITIAL')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script4="onDecision;2;CHKRQ;?DA0040010view1/?[eq]SINGLE@*5,*7"
expj.DA0040010.DA0040010form1.onDecision2 = function () {
  console.log('DA0040010form1 script4');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0040010', 'DA0040010form1', '?DA0040010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script5="child;0;UNMASK;_DA0040010button1/Select"
expj.DA0040010.DA0040010form1.child0 = function () {
  console.log('DA0040010form1 script5');
expj.common.pscript.setUnMaskToReferenceComponent('DA0040010', 'DA0040010form1', '_DA0040010button1/Select');
};
// script6="child;1;MASK;_DA0040010button1/Select"
expj.DA0040010.DA0040010form1.child1 = function () {
  console.log('DA0040010form1 script6');
expj.common.pscript.setMaskToReferenceComponent('DA0040010', 'DA0040010form1', '_DA0040010button1/Select');
};
// script7="child;2;CHK;?PLANT_CD[eq]SAME[and]?CS_PROC_CD[eq]SAME@*3,*4"
expj.DA0040010.DA0040010form1.child2 = function () {
  console.log('DA0040010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0040010', 'DA0040010form1', '?PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0040010', 'DA0040010form1', '?CS_PROC_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script8="child;3;UNMASK;_DA0040010button2/LineInsert"
expj.DA0040010.DA0040010form1.child3 = function () {
  console.log('DA0040010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('DA0040010', 'DA0040010form1', '_DA0040010button2/LineInsert');
};
// script9="child;4;MASK;_DA0040010button2/LineInsert"
expj.DA0040010.DA0040010form1.child4 = function () {
  console.log('DA0040010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('DA0040010', 'DA0040010form1', '_DA0040010button2/LineInsert');
};
// script10="child;5;CHK;?PLANT_CD[eq]SAME[and]?CS_PROC_CD[eq]SAME@*6,*7"
expj.DA0040010.DA0040010form1.child5 = function () {
  console.log('DA0040010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0040010', 'DA0040010form1', '?PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0040010', 'DA0040010form1', '?CS_PROC_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script11="child;6;UNMASK;_DA0040010button2/LineUpdate,_DA0040010button2/LineCopy,_DA0040010button2/LineDelete"
expj.DA0040010.DA0040010form1.child6 = function () {
  console.log('DA0040010form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('DA0040010', 'DA0040010form1', '_DA0040010button2/LineUpdate');
expj.common.pscript.setUnMaskToReferenceComponent('DA0040010', 'DA0040010form1', '_DA0040010button2/LineCopy');
expj.common.pscript.setUnMaskToReferenceComponent('DA0040010', 'DA0040010form1', '_DA0040010button2/LineDelete');
};
// script12="child;7;MASK;_DA0040010button2/LineUpdate,_DA0040010button2/LineCopy,_DA0040010button2/LineDelete"
expj.DA0040010.DA0040010form1.child7 = function () {
  console.log('DA0040010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('DA0040010', 'DA0040010form1', '_DA0040010button2/LineUpdate');
expj.common.pscript.setMaskToReferenceComponent('DA0040010', 'DA0040010form1', '_DA0040010button2/LineCopy');
expj.common.pscript.setMaskToReferenceComponent('DA0040010', 'DA0040010form1', '_DA0040010button2/LineDelete');
};
expj.DA0040010.DA0040010form1.executeAllOnDecision = function () {
  console.log('execute DA0040010form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0040010.DA0040010form1['onDecision' + i])) {
        expj.DA0040010.DA0040010form1['onDecision' + i]();
      }
    }
  }
};
expj.DA0040010.DA0040010form1.executeOnLoad = function () {
  expj.DA0040010.DA0040010form1.executePScriptOnLoad();
};

expj.DA0040010.DA0040010form1.executePScriptOnLoad = function () {
  console.log('execute DA0040010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.DA0040010.DA0040010form1['onLoad' + i])) {
      expj.DA0040010.DA0040010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-DA0040010-DA0040010form1" action="DA0040010Servlet" name="DA0040010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aDA0040010Control.getReadStatusString()) %>" style="height:119px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:119px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- �H��R�[�h --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040010form1-PLANT_CD">
expj.DA0040010.DA0040010form1.PLANT_CD = {};
expj.DA0040010.DA0040010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute DA0040010form1/PLANT_CD.onDecision');
  expj.DA0040010.DA0040010form1.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040010form1', 'PLANT_CD', this);
  });
  expj.DA0040010.DA0040010form1.PLANT_CD.executePScriptOnLoad();
};

expj.DA0040010.DA0040010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute DA0040010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040010form1-PLANT_CD" name="PLANT_CD" class="DA0040010-focus-move  required-value expj-DA0040010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-DA0040010-DA0040010form1-PeekerPlantCd">
expj.DA0040010.DA0040010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_DA0040010form1/PLANT_CD:_DA0040010form1/PLANT_NAME@<%=contextNo%>"
expj.DA0040010.DA0040010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DA0040010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0040010', 'DA0040010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DA0040010form1/PLANT_CD:_DA0040010form1/PLANT_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DA0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DA0040010.DA0040010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0040010.DA0040010form1.PeekerPlantCd['onClick' + i])) {
        expj.DA0040010.DA0040010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.DA0040010.DA0040010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.DA0040010.DA0040010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0040010', 'DA0040010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.DA0040010.DA0040010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.DA0040010.DA0040010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute DA0040010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DA0040010-DA0040010form1-PeekerPlantCd" class="DA0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DA0040010-DA0040010form1-PLANT_NAME">
expj.DA0040010.DA0040010form1.PLANT_NAME = {};
expj.DA0040010.DA0040010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute DA0040010form1/PLANT_NAME.onDecision');
  expj.DA0040010.DA0040010form1.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040010form1', 'PLANT_NAME', this);
  });
  expj.DA0040010.DA0040010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.DA0040010.DA0040010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0040010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040010form1-PLANT_NAME" name="PLANT_NAME" class="DA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.YEAR",rb)%></span><!-- �N�x --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040010form1-YEAR">
expj.DA0040010.DA0040010form1.YEAR = {};
expj.DA0040010.DA0040010form1.YEAR.executeAllOnDecision = function () {
  console.log('execute DA0040010form1/YEAR.onDecision');
  expj.DA0040010.DA0040010form1.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040010form1.YEAR.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040010form1-YEAR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040010form1', 'YEAR', this);
  });
  expj.DA0040010.DA0040010form1.YEAR.executePScriptOnLoad();
};

expj.DA0040010.DA0040010form1.YEAR.executePScriptOnLoad = function () {
  console.log('execute DA0040010form1/YEAR.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040010form1-YEAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040010form1-YEAR" name="YEAR" class="DA0040010-focus-move expj-align-right required-value expj-DA0040010-required-A" style="width:150px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getYEAR()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.HALF_TERM_TYP",rb)%></span><!-- �����敪 --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040010form1-HALF_TERM_TYP">
expj.DA0040010.DA0040010form1.HALF_TERM_TYP = {};
expj.DA0040010.DA0040010form1.HALF_TERM_TYP.executeAllOnDecision = function () {
  console.log('execute DA0040010form1/HALF_TERM_TYP.onDecision');
  expj.DA0040010.DA0040010form1.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040010form1.HALF_TERM_TYP.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040010form1-HALF_TERM_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DA0040010', 'DA0040010form1', 'HALF_TERM_TYP', this);
  });
  expj.DA0040010.DA0040010form1.HALF_TERM_TYP.executePScriptOnLoad();
};

expj.DA0040010.DA0040010form1.HALF_TERM_TYP.executePScriptOnLoad = function () {
  console.log('execute DA0040010form1/HALF_TERM_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040010form1-HALF_TERM_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DA0040010-DA0040010form1-HALF_TERM_TYP" name='HALF_TERM_TYP' class='DA0040010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDA0040010Control.getStruct().getList_HALF_TERM_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDA0040010Control.getStruct().getList_HALF_TERM_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aDA0040010Control.getStruct().getList_HALF_TERM_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDA0040010Struct.getHALF_TERM_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-DA0040010-DA0040010form1-HALF_TERM_TYP_DN" name="HALF_TERM_TYP_DN" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getHALF_TERM_TYP_DN()) %>">
<script class="expj-script-DA0040010-DA0040010form1-HALF_TERM_TYP_DN">
expj.DA0040010.DA0040010form1.HALF_TERM_TYP_DN = {};
expj.DA0040010.DA0040010form1.HALF_TERM_TYP_DN.executeAllOnDecision = function () {
  console.log('execute DA0040010form1/HALF_TERM_TYP_DN.onDecision');
  expj.DA0040010.DA0040010form1.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040010form1.HALF_TERM_TYP_DN.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040010form1-HALF_TERM_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040010form1', 'HALF_TERM_TYP_DN', this);
  });
  expj.DA0040010.DA0040010form1.HALF_TERM_TYP_DN.executePScriptOnLoad();
};

expj.DA0040010.DA0040010form1.HALF_TERM_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute DA0040010form1/HALF_TERM_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040010form1-HALF_TERM_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.COST_TYP",rb)%></span><!-- ������� --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040010form1-COST_TYP">
expj.DA0040010.DA0040010form1.COST_TYP = {};
expj.DA0040010.DA0040010form1.COST_TYP.executeAllOnDecision = function () {
  console.log('execute DA0040010form1/COST_TYP.onDecision');
  expj.DA0040010.DA0040010form1.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040010form1.COST_TYP.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040010form1-COST_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DA0040010', 'DA0040010form1', 'COST_TYP', this);
  });
  expj.DA0040010.DA0040010form1.COST_TYP.executePScriptOnLoad();
};

expj.DA0040010.DA0040010form1.COST_TYP.executePScriptOnLoad = function () {
  console.log('execute DA0040010form1/COST_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040010form1-COST_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DA0040010-DA0040010form1-COST_TYP" name='COST_TYP' class='DA0040010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDA0040010Control.getStruct().getList_COST_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDA0040010Control.getStruct().getList_COST_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aDA0040010Control.getStruct().getList_COST_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDA0040010Struct.getCOST_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-DA0040010-DA0040010form1-COST_TYP_DN" name="COST_TYP_DN" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getCOST_TYP_DN()) %>">
<script class="expj-script-DA0040010-DA0040010form1-COST_TYP_DN">
expj.DA0040010.DA0040010form1.COST_TYP_DN = {};
expj.DA0040010.DA0040010form1.COST_TYP_DN.executeAllOnDecision = function () {
  console.log('execute DA0040010form1/COST_TYP_DN.onDecision');
  expj.DA0040010.DA0040010form1.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040010form1.COST_TYP_DN.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040010form1-COST_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040010form1', 'COST_TYP_DN', this);
  });
  expj.DA0040010.DA0040010form1.COST_TYP_DN.executePScriptOnLoad();
};

expj.DA0040010.DA0040010form1.COST_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute DA0040010form1/COST_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040010form1-COST_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CS_PROC_CD",rb)%></span><!-- �H���R�[�h --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040010form1-CS_PROC_CD">
expj.DA0040010.DA0040010form1.CS_PROC_CD = {};
expj.DA0040010.DA0040010form1.CS_PROC_CD.executeAllOnDecision = function () {
  console.log('execute DA0040010form1/CS_PROC_CD.onDecision');
  expj.DA0040010.DA0040010form1.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040010form1.CS_PROC_CD.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040010form1-CS_PROC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040010form1', 'CS_PROC_CD', this);
  });
  expj.DA0040010.DA0040010form1.CS_PROC_CD.executePScriptOnLoad();
};

expj.DA0040010.DA0040010form1.CS_PROC_CD.executePScriptOnLoad = function () {
  console.log('execute DA0040010form1/CS_PROC_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040010form1-CS_PROC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040010form1-CS_PROC_CD" name="CS_PROC_CD" class="DA0040010-focus-move  required-value expj-DA0040010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getCS_PROC_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-DA0040010-DA0040010form1-PeekerCsProcCd">
expj.DA0040010.DA0040010form1.PeekerCsProcCd = {};
// script1="onClick;0;PEEKER;_DA0040010form1/CS_PROC_CD:_DA0040010form1/CS_PROC_NAME@<%=contextNo%>"
expj.DA0040010.DA0040010form1.PeekerCsProcCd.onClick0 = function () {
  console.log('PeekerCsProcCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DA0040010';
var parameterValues = 'PeekerCsProcCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0040010', 'DA0040010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0040010', 'DA0040010form1', '_CS_PROC_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CS_PROC_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DA0040010form1/CS_PROC_CD:_DA0040010form1/CS_PROC_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DA0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DA0040010.DA0040010form1.PeekerCsProcCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0040010.DA0040010form1.PeekerCsProcCd['onClick' + i])) {
        expj.DA0040010.DA0040010form1.PeekerCsProcCd['onClick' + i]();
      }
    }
  }
};
expj.DA0040010.DA0040010form1.PeekerCsProcCd.executeAllOnDecision = function () {
};
expj.DA0040010.DA0040010form1.PeekerCsProcCd.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040010form1-PeekerCsProcCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0040010', 'DA0040010form1', 'PeekerCsProcCd', this, 'Button');
    }
  });
  expj.DA0040010.DA0040010form1.PeekerCsProcCd.executePScriptOnLoad();
};

expj.DA0040010.DA0040010form1.PeekerCsProcCd.executePScriptOnLoad = function () {
  console.log('execute DA0040010form1/PeekerCsProcCd.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040010form1-PeekerCsProcCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DA0040010-DA0040010form1-PeekerCsProcCd" class="DA0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DA0040010-DA0040010form1-CS_PROC_NAME">
expj.DA0040010.DA0040010form1.CS_PROC_NAME = {};
expj.DA0040010.DA0040010form1.CS_PROC_NAME.executeAllOnDecision = function () {
  console.log('execute DA0040010form1/CS_PROC_NAME.onDecision');
  expj.DA0040010.DA0040010form1.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040010form1.CS_PROC_NAME.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040010form1-CS_PROC_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040010form1', 'CS_PROC_NAME', this);
  });
  expj.DA0040010.DA0040010form1.CS_PROC_NAME.executePScriptOnLoad();
};

expj.DA0040010.DA0040010form1.CS_PROC_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0040010form1/CS_PROC_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040010form1-CS_PROC_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040010form1-CS_PROC_NAME" name="CS_PROC_NAME" class="DA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getCS_PROC_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- �i�ڔԍ� --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040010form1-IN_ITEM_CD">
expj.DA0040010.DA0040010form1.IN_ITEM_CD = {};
expj.DA0040010.DA0040010form1.IN_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute DA0040010form1/IN_ITEM_CD.onDecision');
  expj.DA0040010.DA0040010form1.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040010form1.IN_ITEM_CD.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040010form1-IN_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040010form1', 'IN_ITEM_CD', this);
  });
  expj.DA0040010.DA0040010form1.IN_ITEM_CD.executePScriptOnLoad();
};

expj.DA0040010.DA0040010form1.IN_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute DA0040010form1/IN_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040010form1-IN_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040010form1-IN_ITEM_CD" name="IN_ITEM_CD" class="DA0040010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getIN_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-DA0040010-DA0040010form1-PeekerIN_ITEM_CD">
expj.DA0040010.DA0040010form1.PeekerIN_ITEM_CD = {};
// script1="onClick;0;PEEKER;_DA0040010form1/IN_ITEM_CD@<%=contextNo%>"
expj.DA0040010.DA0040010form1.PeekerIN_ITEM_CD.onClick0 = function () {
  console.log('PeekerIN_ITEM_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DA0040010';
var parameterValues = 'PeekerIN_ITEM_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0040010', 'DA0040010form1', '_DA0040010form1/IN_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_DA0040010form1/IN_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DA0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DA0040010.DA0040010form1.PeekerIN_ITEM_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0040010.DA0040010form1.PeekerIN_ITEM_CD['onClick' + i])) {
        expj.DA0040010.DA0040010form1.PeekerIN_ITEM_CD['onClick' + i]();
      }
    }
  }
};
expj.DA0040010.DA0040010form1.PeekerIN_ITEM_CD.executeAllOnDecision = function () {
};
expj.DA0040010.DA0040010form1.PeekerIN_ITEM_CD.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040010form1-PeekerIN_ITEM_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0040010', 'DA0040010form1', 'PeekerIN_ITEM_CD', this, 'Button');
    }
  });
  expj.DA0040010.DA0040010form1.PeekerIN_ITEM_CD.executePScriptOnLoad();
};

expj.DA0040010.DA0040010form1.PeekerIN_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute DA0040010form1/PeekerIN_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040010form1-PeekerIN_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DA0040010-DA0040010form1-PeekerIN_ITEM_CD" class="DA0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- �i���C���h�J�[�h�w��j --></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-DA0040010-DA0040010button1">
expj.DA0040010.DA0040010button1 = {};
expj.DA0040010.DA0040010button1.executeAllOnDecision = function () {
  console.log('execute DA0040010button1.onDecision');
};
expj.DA0040010.DA0040010button1.executeOnLoad = function () {
  expj.DA0040010.DA0040010button1.executePScriptOnLoad();
};

expj.DA0040010.DA0040010button1.executePScriptOnLoad = function () {
  console.log('execute DA0040010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DA0040010-DA0040010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DA0040010-DA0040010button1-Select">
expj.DA0040010.DA0040010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DA0040010form1/*@DA0040010Servlet"
expj.DA0040010.DA0040010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0040010', 'DA0040010button1', '_DA0040010form1/*', 'DA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0040010', response);
expj.common.updateBusinessScreenTab('DA0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.DA0040010.DA0040010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0040010.DA0040010button1.Select['onClick' + i])) {
        expj.DA0040010.DA0040010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.DA0040010.DA0040010button1.Select.executeAllOnDecision = function () {
};
expj.DA0040010.DA0040010button1.Select.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0040010', 'DA0040010button1', 'Select', this, 'Button');
    }
  });
  expj.DA0040010.DA0040010button1.Select.executePScriptOnLoad();
};

expj.DA0040010.DA0040010button1.Select.executePScriptOnLoad = function () {
  console.log('execute DA0040010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0040010-DA0040010button1-Select" name="Select" class="DA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- �Ǎ��{�^�� --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-DA0040010-DA0040010view1">
expj.DA0040010.DA0040010view1 = {};
expj.DA0040010.DA0040010view1.executeAllOnClick = function () {
};
expj.DA0040010.DA0040010view1.executeAllOnDecision = function () {
  console.log('execute DA0040010view1.onDecision');
};
expj.DA0040010.DA0040010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("DA0040010view1", "expj.DA0040010.DA0040010view1.executeAllOnClick");
%>
  expj.DA0040010.DA0040010view1.executePScriptOnLoad();
};

expj.DA0040010.DA0040010view1.executePScriptOnLoad = function () {
  console.log('execute DA0040010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-DA0040010-DA0040010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String DA0040010view1_Id = "DA0040010view1";
 String DA0040010view1_select = "single";
 String DA0040010view1_sortable = "true";
 String DA0040010view1_resize = "true";
 String DA0040010view1_scroll = "true";
 StringBuffer DA0040010view1_HB = new StringBuffer();
 StringBuffer DA0040010view1_DB = new StringBuffer();
%>
<%
 DA0040010view1_select = "single";
 DA0040010view1_sortable = "true";
 DA0040010view1_resize = "true";
 DA0040010view1_scroll = "true";
%>
<%
 DA0040010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(DA0040010view1_sortable).append("}").append(",");
%>
     
<%
DA0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(DA0040010view1_sortable).append("}").append(",");
DA0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(DA0040010view1_sortable).append("}").append(",");
DA0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_COST_CLS_CD",rb))).append("', 'name':'l_PROC_COST_CLS_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(DA0040010view1_sortable).append("}").append(",");
DA0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_COST_CLS_NAME",rb))).append("', 'name':'l_PROC_COST_CLS_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(DA0040010view1_sortable).append("}").append(",");
DA0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CLASIFICATION_CD_1",rb))).append("', 'name':'l_CLASIFICATION_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(DA0040010view1_sortable).append("}").append(",");
DA0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ONEROUS_CONS_FLG",rb))).append("', 'name':'l_ONEROUS_CONS_FLG_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(DA0040010view1_sortable).append("}").append(",");
DA0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_COST_SUM",rb))).append("', 'name':'l_PROC_COST_SUM', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(DA0040010view1_sortable).append("}").append(",");
DA0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUR_UNIT",rb))).append("', 'name':'l_HOME_CUR_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(DA0040010view1_sortable).append("}").append(",");
DA0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_COST_01",rb))).append("', 'name':'l_PROC_COST_01', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(DA0040010view1_sortable).append("}").append(",");
DA0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_COST_02",rb))).append("', 'name':'l_PROC_COST_02', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(DA0040010view1_sortable).append("}").append(",");
DA0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_COST_03",rb))).append("', 'name':'l_PROC_COST_03', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(DA0040010view1_sortable).append("}").append(",");
DA0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_COST_04",rb))).append("', 'name':'l_PROC_COST_04', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(DA0040010view1_sortable).append("}").append(",");
DA0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_COST_05",rb))).append("', 'name':'l_PROC_COST_05', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(DA0040010view1_sortable).append("}").append(",");
DA0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_COST_06",rb))).append("', 'name':'l_PROC_COST_06', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(DA0040010view1_sortable).append("}").append(",");
DA0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_COST_07",rb))).append("', 'name':'l_PROC_COST_07', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(DA0040010view1_sortable).append("}").append(",");
DA0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_COST_08",rb))).append("', 'name':'l_PROC_COST_08', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(DA0040010view1_sortable).append("}").append(",");
DA0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_COST_09",rb))).append("', 'name':'l_PROC_COST_09', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(DA0040010view1_sortable).append("}").append(",");
DA0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_COST_10",rb))).append("', 'name':'l_PROC_COST_10', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(DA0040010view1_sortable).append("}").append(",");
DA0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_COST_11",rb))).append("', 'name':'l_PROC_COST_11', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(DA0040010view1_sortable).append("}").append(",");
DA0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_COST_12",rb))).append("', 'name':'l_PROC_COST_12', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(DA0040010view1_sortable).append("}").append(",");
DA0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(DA0040010view1_sortable).append("}").append(",");
%>
<%
 int aDA0040010StructLength = aDA0040010Control.getListsize();
 final DA0040010Struct structBackup = aDA0040010Struct;
 aDA0040010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aDA0040010StructLength; ++loopCount) {
  if((aDA0040010Struct = (DA0040010Struct) aDA0040010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aDA0040010Struct", aDA0040010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 DA0040010view1_DB.append("[");
 DA0040010view1_DB.append(loopCount);
 DA0040010view1_DB.append(",").append("'<span id=\"expj-DA0040010-DA0040010view1-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-DA0040010-DA0040010view1-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aDA0040010Struct.getl_ITEM_CD())).append("</span>'");
 DA0040010view1_DB.append(",").append("'<span id=\"expj-DA0040010-DA0040010view1-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-DA0040010-DA0040010view1-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aDA0040010Struct.getl_ITEM_NAME())).append("</span>'");
 DA0040010view1_DB.append(",").append("'<span id=\"expj-DA0040010-DA0040010view1-l_PROC_COST_CLS_CD-").append(loopCount).append("\" class=\"expj-label expj-DA0040010-DA0040010view1-l_PROC_COST_CLS_CD\" data-name=\"l_PROC_COST_CLS_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aDA0040010Struct.getl_PROC_COST_CLS_CD())).append("</span>'");
 DA0040010view1_DB.append(",").append("'<span id=\"expj-DA0040010-DA0040010view1-l_PROC_COST_CLS_NAME-").append(loopCount).append("\" class=\"expj-label expj-DA0040010-DA0040010view1-l_PROC_COST_CLS_NAME\" data-name=\"l_PROC_COST_CLS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aDA0040010Struct.getl_PROC_COST_CLS_NAME())).append("</span>'");
 DA0040010view1_DB.append(",").append("'<span id=\"expj-DA0040010-DA0040010view1-l_CLASIFICATION_CD-").append(loopCount).append("\" class=\"expj-label expj-DA0040010-DA0040010view1-l_CLASIFICATION_CD\" data-name=\"l_CLASIFICATION_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aDA0040010Struct.getl_CLASIFICATION_CD())).append("</span>'");
 DA0040010view1_DB.append(",").append("'<span id=\"expj-DA0040010-DA0040010view1-l_ONEROUS_CONS_FLG_DN-").append(loopCount).append("\" class=\"expj-label expj-DA0040010-DA0040010view1-l_ONEROUS_CONS_FLG_DN\" data-name=\"l_ONEROUS_CONS_FLG_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aDA0040010Struct.getl_ONEROUS_CONS_FLG_DN())).append("</span>'");
 DA0040010view1_DB.append(",").append("'<span id=\"expj-DA0040010-DA0040010view1-l_PROC_COST_SUM-").append(loopCount).append("\" class=\"expj-label expj-DA0040010-DA0040010view1-l_PROC_COST_SUM\" data-name=\"l_PROC_COST_SUM\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDA0040010Struct.getl_PROC_COST_SUM())).append("</span>'");
 DA0040010view1_DB.append(",").append("'<span id=\"expj-DA0040010-DA0040010view1-l_HOME_CUR_UNIT-").append(loopCount).append("\" class=\"expj-label expj-DA0040010-DA0040010view1-l_HOME_CUR_UNIT\" data-name=\"l_HOME_CUR_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aDA0040010Struct.getl_HOME_CUR_UNIT())).append("</span>'");
 DA0040010view1_DB.append(",").append("'<span id=\"expj-DA0040010-DA0040010view1-l_PROC_COST_01-").append(loopCount).append("\" class=\"expj-label expj-DA0040010-DA0040010view1-l_PROC_COST_01\" data-name=\"l_PROC_COST_01\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDA0040010Struct.getl_PROC_COST_01())).append("</span>'");
 DA0040010view1_DB.append(",").append("'<span id=\"expj-DA0040010-DA0040010view1-l_PROC_COST_02-").append(loopCount).append("\" class=\"expj-label expj-DA0040010-DA0040010view1-l_PROC_COST_02\" data-name=\"l_PROC_COST_02\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDA0040010Struct.getl_PROC_COST_02())).append("</span>'");
 DA0040010view1_DB.append(",").append("'<span id=\"expj-DA0040010-DA0040010view1-l_PROC_COST_03-").append(loopCount).append("\" class=\"expj-label expj-DA0040010-DA0040010view1-l_PROC_COST_03\" data-name=\"l_PROC_COST_03\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDA0040010Struct.getl_PROC_COST_03())).append("</span>'");
 DA0040010view1_DB.append(",").append("'<span id=\"expj-DA0040010-DA0040010view1-l_PROC_COST_04-").append(loopCount).append("\" class=\"expj-label expj-DA0040010-DA0040010view1-l_PROC_COST_04\" data-name=\"l_PROC_COST_04\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDA0040010Struct.getl_PROC_COST_04())).append("</span>'");
 DA0040010view1_DB.append(",").append("'<span id=\"expj-DA0040010-DA0040010view1-l_PROC_COST_05-").append(loopCount).append("\" class=\"expj-label expj-DA0040010-DA0040010view1-l_PROC_COST_05\" data-name=\"l_PROC_COST_05\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDA0040010Struct.getl_PROC_COST_05())).append("</span>'");
 DA0040010view1_DB.append(",").append("'<span id=\"expj-DA0040010-DA0040010view1-l_PROC_COST_06-").append(loopCount).append("\" class=\"expj-label expj-DA0040010-DA0040010view1-l_PROC_COST_06\" data-name=\"l_PROC_COST_06\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDA0040010Struct.getl_PROC_COST_06())).append("</span>'");
 DA0040010view1_DB.append(",").append("'<span id=\"expj-DA0040010-DA0040010view1-l_PROC_COST_07-").append(loopCount).append("\" class=\"expj-label expj-DA0040010-DA0040010view1-l_PROC_COST_07\" data-name=\"l_PROC_COST_07\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDA0040010Struct.getl_PROC_COST_07())).append("</span>'");
 DA0040010view1_DB.append(",").append("'<span id=\"expj-DA0040010-DA0040010view1-l_PROC_COST_08-").append(loopCount).append("\" class=\"expj-label expj-DA0040010-DA0040010view1-l_PROC_COST_08\" data-name=\"l_PROC_COST_08\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDA0040010Struct.getl_PROC_COST_08())).append("</span>'");
 DA0040010view1_DB.append(",").append("'<span id=\"expj-DA0040010-DA0040010view1-l_PROC_COST_09-").append(loopCount).append("\" class=\"expj-label expj-DA0040010-DA0040010view1-l_PROC_COST_09\" data-name=\"l_PROC_COST_09\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDA0040010Struct.getl_PROC_COST_09())).append("</span>'");
 DA0040010view1_DB.append(",").append("'<span id=\"expj-DA0040010-DA0040010view1-l_PROC_COST_10-").append(loopCount).append("\" class=\"expj-label expj-DA0040010-DA0040010view1-l_PROC_COST_10\" data-name=\"l_PROC_COST_10\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDA0040010Struct.getl_PROC_COST_10())).append("</span>'");
 DA0040010view1_DB.append(",").append("'<span id=\"expj-DA0040010-DA0040010view1-l_PROC_COST_11-").append(loopCount).append("\" class=\"expj-label expj-DA0040010-DA0040010view1-l_PROC_COST_11\" data-name=\"l_PROC_COST_11\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDA0040010Struct.getl_PROC_COST_11())).append("</span>'");
 DA0040010view1_DB.append(",").append("'<span id=\"expj-DA0040010-DA0040010view1-l_PROC_COST_12-").append(loopCount).append("\" class=\"expj-label expj-DA0040010-DA0040010view1-l_PROC_COST_12\" data-name=\"l_PROC_COST_12\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aDA0040010Struct.getl_PROC_COST_12())).append("</span>'");
 DA0040010view1_DB.append(",").append("'<span id=\"expj-DA0040010-DA0040010view1-l_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-DA0040010-DA0040010view1-l_MODIFY_COUNT\" data-name=\"l_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aDA0040010Struct.getl_MODIFY_COUNT())).append("</span>'");
 DA0040010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aDA0040010StructLength) {
   DA0040010view1_DB.append(",");
  }
 }
 aDA0040010Struct = structBackup;
 viewIdList.add(DA0040010view1_Id);
 viewSelectList.add(DA0040010view1_select);
 viewResizeList.add(DA0040010view1_resize);
 viewScrollList.add(DA0040010view1_scroll);
 viewHeaderDataList.add(DA0040010view1_HB);
 viewBodyDataList.add(DA0040010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:420px;"><script class="expj-script-DA0040010-DA0040010button2">
expj.DA0040010.DA0040010button2 = {};
expj.DA0040010.DA0040010button2.executeAllOnDecision = function () {
  console.log('execute DA0040010button2.onDecision');
};
expj.DA0040010.DA0040010button2.executeOnLoad = function () {
  expj.DA0040010.DA0040010button2.executePScriptOnLoad();
};

expj.DA0040010.DA0040010button2.executePScriptOnLoad = function () {
  console.log('execute DA0040010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DA0040010-DA0040010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DA0040010-DA0040010button2-LineInsert">
expj.DA0040010.DA0040010button2.LineInsert = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_DA0040010form1/*@DA0040010Servlet"
expj.DA0040010.DA0040010button2.LineInsert.onClick0 = function () {
  console.log('LineInsert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0040010', 'DA0040010button2', '_DA0040010form1/*', 'DA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0040010', response);
expj.common.changeBusinessScreenTab('DA0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.DA0040010.DA0040010button2.LineInsert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0040010.DA0040010button2.LineInsert['onClick' + i])) {
        expj.DA0040010.DA0040010button2.LineInsert['onClick' + i]();
      }
    }
  }
};
expj.DA0040010.DA0040010button2.LineInsert.executeAllOnDecision = function () {
};
expj.DA0040010.DA0040010button2.LineInsert.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040010button2-LineInsert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0040010', 'DA0040010button2', 'LineInsert', this, 'Button');
    }
  });
  expj.DA0040010.DA0040010button2.LineInsert.executePScriptOnLoad();
};

expj.DA0040010.DA0040010button2.LineInsert.executePScriptOnLoad = function () {
  console.log('execute DA0040010button2/LineInsert.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040010button2-LineInsert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0040010-DA0040010button2-LineInsert" name="LineInsert" class="DA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsert",rb)%></button><!-- �s�ǉ��{�^�� --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040010button2-LineUpdate">
expj.DA0040010.DA0040010button2.LineUpdate = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_DA0040010form1/*,_DA0040010view1/+@DA0040010Servlet"
expj.DA0040010.DA0040010button2.LineUpdate.onClick0 = function () {
  console.log('LineUpdate script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0040010', 'DA0040010button2', '_DA0040010form1/*,_DA0040010view1/+', 'DA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0040010', response);
expj.common.changeBusinessScreenTab('DA0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.DA0040010.DA0040010button2.LineUpdate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0040010.DA0040010button2.LineUpdate['onClick' + i])) {
        expj.DA0040010.DA0040010button2.LineUpdate['onClick' + i]();
      }
    }
  }
};
expj.DA0040010.DA0040010button2.LineUpdate.executeAllOnDecision = function () {
};
expj.DA0040010.DA0040010button2.LineUpdate.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040010button2-LineUpdate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0040010', 'DA0040010button2', 'LineUpdate', this, 'Button');
    }
  });
  expj.DA0040010.DA0040010button2.LineUpdate.executePScriptOnLoad();
};

expj.DA0040010.DA0040010button2.LineUpdate.executePScriptOnLoad = function () {
  console.log('execute DA0040010button2/LineUpdate.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040010button2-LineUpdate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0040010-DA0040010button2-LineUpdate" name="LineUpdate" class="DA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- �s�C���{�^�� --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040010button2-LineCopy">
expj.DA0040010.DA0040010button2.LineCopy = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_DA0040010form1/*,_DA0040010view1/+@DA0040010Servlet"
expj.DA0040010.DA0040010button2.LineCopy.onClick0 = function () {
  console.log('LineCopy script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0040010', 'DA0040010button2', '_DA0040010form1/*,_DA0040010view1/+', 'DA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0040010', response);
expj.common.changeBusinessScreenTab('DA0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.DA0040010.DA0040010button2.LineCopy.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0040010.DA0040010button2.LineCopy['onClick' + i])) {
        expj.DA0040010.DA0040010button2.LineCopy['onClick' + i]();
      }
    }
  }
};
expj.DA0040010.DA0040010button2.LineCopy.executeAllOnDecision = function () {
};
expj.DA0040010.DA0040010button2.LineCopy.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040010button2-LineCopy').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0040010', 'DA0040010button2', 'LineCopy', this, 'Button');
    }
  });
  expj.DA0040010.DA0040010button2.LineCopy.executePScriptOnLoad();
};

expj.DA0040010.DA0040010button2.LineCopy.executePScriptOnLoad = function () {
  console.log('execute DA0040010button2/LineCopy.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040010button2-LineCopy');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0040010-DA0040010button2-LineCopy" name="LineCopy" class="DA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineCopy",rb)%></button><!-- �s���ʃ{�^�� --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040010button2-LineDelete">
expj.DA0040010.DA0040010button2.LineDelete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DA0040010form1/*,_DA0040010view1/+@DA0040010Servlet,,$ZZ07004"
expj.DA0040010.DA0040010button2.LineDelete.onClick0 = function () {
  console.log('LineDelete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0040010', 'DA0040010button2', '_DA0040010form1/*,_DA0040010view1/+', 'DA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0040010', response);
expj.common.updateBusinessScreenTab('DA0040010', contents);
};
expj.common.pscript.callConfirm('DA0040010', 'DA0040010button2', 'ZZ07004', okEvent);
};
expj.DA0040010.DA0040010button2.LineDelete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0040010.DA0040010button2.LineDelete['onClick' + i])) {
        expj.DA0040010.DA0040010button2.LineDelete['onClick' + i]();
      }
    }
  }
};
expj.DA0040010.DA0040010button2.LineDelete.executeAllOnDecision = function () {
};
expj.DA0040010.DA0040010button2.LineDelete.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040010button2-LineDelete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0040010', 'DA0040010button2', 'LineDelete', this, 'Button');
    }
  });
  expj.DA0040010.DA0040010button2.LineDelete.executePScriptOnLoad();
};

expj.DA0040010.DA0040010button2.LineDelete.executePScriptOnLoad = function () {
  console.log('execute DA0040010button2/LineDelete.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040010button2-LineDelete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0040010-DA0040010button2-LineDelete" name="LineDelete" class="DA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineDelete",rb)%></button><!-- �s�폜�{�^�� --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 504px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame17" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 200px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">DA0040010 Revision: 1.6  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-DA0040010-DA0040010button0">
expj.DA0040010.DA0040010button0 = {};
expj.DA0040010.DA0040010button0.executeAllOnDecision = function () {
  console.log('execute DA0040010button0.onDecision');
};
expj.DA0040010.DA0040010button0.executeOnLoad = function () {
  expj.DA0040010.DA0040010button0.executePScriptOnLoad();
};

expj.DA0040010.DA0040010button0.executePScriptOnLoad = function () {
  console.log('execute DA0040010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DA0040010-DA0040010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DA0040010-DA0040010button0-Clear">
expj.DA0040010.DA0040010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@DA0040010Servlet,,$ZZ07008"
expj.DA0040010.DA0040010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0040010', 'DA0040010button0', '', 'DA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0040010', response);
expj.common.updateBusinessScreenTab('DA0040010', contents);
};
expj.common.pscript.callConfirm('DA0040010', 'DA0040010button0', 'ZZ07008', okEvent);
};
expj.DA0040010.DA0040010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0040010.DA0040010button0.Clear['onClick' + i])) {
        expj.DA0040010.DA0040010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.DA0040010.DA0040010button0.Clear.executeAllOnDecision = function () {
};
expj.DA0040010.DA0040010button0.Clear.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0040010', 'DA0040010button0', 'Clear', this, 'Button');
    }
  });
  expj.DA0040010.DA0040010button0.Clear.executePScriptOnLoad();
};

expj.DA0040010.DA0040010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute DA0040010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0040010-DA0040010button0-Clear" name="Clear" class="DA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- �N���A�{�^�� --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040010button0-Close">
expj.DA0040010.DA0040010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.DA0040010.DA0040010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('DA0040010');
};
expj.DA0040010.DA0040010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0040010.DA0040010button0.Close['onClick' + i])) {
        expj.DA0040010.DA0040010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.DA0040010.DA0040010button0.Close.executeAllOnDecision = function () {
};
expj.DA0040010.DA0040010button0.Close.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0040010', 'DA0040010button0', 'Close', this, 'Button');
    }
  });
  expj.DA0040010.DA0040010button0.Close.executePScriptOnLoad();
};

expj.DA0040010.DA0040010button0.Close.executePScriptOnLoad = function () {
  console.log('execute DA0040010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0040010-DA0040010button0-Close" name="Close" class="DA0040010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- ����{�^�� --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-DA0040010 (END)-->
<%
MessageStruct msgStruct = aDA0040010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS�錾
 if (treeId != null) {
%>
<script class="expj-script-DA0040010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.DA0040010)) {
  expj.common.treeInstanceMap.DA0040010 = {};
}
expj.common.treeInstanceMap.DA0040010.<%=treeId %> = {};
// TREE�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.DA0040010.<%=treeId %>.treeInstance = null;
// �I�𒆂�Node��ۑ�����ϐ�
expj.common.treeInstanceMap.DA0040010.<%=treeId %>.gPrevSelectedNode = null;
// �R���e�L�X�g���j���[�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.DA0040010.<%=treeId %>.contextData = null;
// �c���[�̃m�[�h���I�����ꂽ���ɏ��������֐�
expj.common.treeInstanceMap.DA0040010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.DA0040010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.DA0040010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.DA0040010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.DA0040010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-DA0040010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js�錾
 if (detailId != null) {
%>
<script class="expj-script-DA0040010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0040010)) {
  expj.common.detailDialogMap.DA0040010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0040010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.DA0040010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0040010.<%=detailId %>)) {
  expj.common.detailDialogMap.DA0040010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0040010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.DA0040010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0040010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.DA0040010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.DA0040010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.DA0040010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)��VIEW�{�f�B�f�[�^
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)��VIEW�w�b�_�[�f�[�^
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-DA0040010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)��VIEW����
  expj.common.detailDialogMap.DA0040010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-DA0040010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // �ڍ׃E�B���h�E�̏�����
  expj.common.detailDialogMap.DA0040010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-DA0040010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.DA0040010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.DA0040010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.DA0040010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.DA0040010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
<%
}
%>
};
</script>
<%
 }
//DETAIL JS�錾(END)

//VIEW JS�錾
for (int i = 0; i < viewIdList.size(); i++) {
 String viewId = (String) viewIdList.get(i);
 String viewResize = (String) viewResizeList.get(i);
 String viewSelect = (String) viewSelectList.get(i);
 String viewScroll = (String) viewScrollList.get(i);
 StringBuffer viewHeaderBuffer = (StringBuffer) viewHeaderDataList.get(i);
 StringBuffer viewDataBuffer = (StringBuffer) viewBodyDataList.get(i);
%>
<script class="expj-script-DA0040010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.DA0040010)) {
  expj.common.viewInstanceMap.DA0040010 = {};
}
expj.common.viewInstanceMap.DA0040010.<%=viewId %> = {};
expj.common.viewInstanceMap.DA0040010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.DA0040010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.DA0040010.<%=viewId %>.init = function () {
  // DataGrid(VIEW)�̃{�f�B�f�[�^
  var body_data = [<%=viewDataBuffer.toString() %>];
  // DataGrid(VIEW)�̃w�b�_�[�f�[�^
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
    expj.DA0040010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.DA0040010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-DA0040010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-DA0040010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-DA0040010_init">
/**
 * DA0040010�p�̃��[�h�������������֐�
 */
expj.DA0040010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-DA0040010');
  //�{�^���Ȃ��{�^���s�G���A�폜����
  expj.common.arrangeDatagridButtonArea('DA0040010');
  //��DataGridTable�ɓ��I�����ݒ�
  expj.common.setExpjDynamicHeight('DA0040010');
  expj.common.calendarInstanceMap.DA0040010 = {};
<%
 if (treeId != null) {
%>
  // TREE�̏�����
  expj.common.treeInstanceMap.DA0040010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)�p�̏�����
  expj.common.detailDialogMap.DA0040010.<%=detailId %>.init();
  expj.common.detailDialogMap.DA0040010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.DA0040010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)�̏�����
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.DA0040010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-DA0040010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-DA0040010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-DA0040010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-DA0040010-<%=detailId %>');
<%
 }
%>
  try{expj.DA0040010.DA0040010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010form1.YEAR.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010form1.HALF_TERM_TYP.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010form1.HALF_TERM_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010form1.COST_TYP.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010form1.COST_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010form1.CS_PROC_CD.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010form1.PeekerCsProcCd.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010form1.CS_PROC_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010form1.IN_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010form1.PeekerIN_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010button1.Select.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010button2.LineInsert.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010button2.LineUpdate.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010button2.LineCopy.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010button2.LineDelete.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010button0.Close.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010form1.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010button1.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010view1.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010button2.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040010button0.executeOnLoad();}catch(e){};
  // �R���\�[���o��
  expj.DA0040010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-DA0040010', 'DA0040010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-DA0040010');  
  // �L�[�ɂ��t�H�[�J�X�ړ��ݒ�
  expj.common.ui.setupFocusMove('.DA0040010-focus-move');
  // �����t�H�[�J�X���Ă鏈��
  $('.DA0040010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // �t�@�C���_�E�����[�h����
  expj.common.executeFileDownLoad('DA0040010', '<%=request.getContextPath() %>');
};

/**
 * DA0040010�̑S��onDecision����
 */
expj.DA0040010.executeAllOnDecision = function () {
  expj.DA0040010.DA0040010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-DA0040010_console">
expj.DA0040010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // �R���\�[���o��
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>