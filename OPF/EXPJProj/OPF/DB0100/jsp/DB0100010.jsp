<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:51:09 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\DB0100\DB0100010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.DB0100.*" %>
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
<jsp:useBean id="aDB0100010Control" class="com.nec.jp.orteus.metamorBase.DB0100.DB0100010Control" scope="request"/>
<jsp:useBean id="aDB0100010Struct" class="com.nec.jp.orteus.metamorBase.DB0100.DB0100010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

�ꊇ�o�^�G���[���X�g�o��
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DB0100/jsp/DB0100010.jsp,v $
$Author: geng-jia $
$Revision: 1.10 $ $Date: 2017/02/22 02:06:43 $
********************************************************* --%>
<html>
<head>
<title>�ꊇ�o�^�G���[���X�g�o��</title>
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
<script class="expj-script-DB0100010_init">
  // DB0100010���O���
  expj.DB0100010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<div id="expj-business-screen-DB0100010" data-screen="DB0100010" data-newdata="<%=aDB0100010Control.isNewData() %>">
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
            <script class="expj-script-DB0100010-DB0100010form1">
expj.DB0100010.DB0100010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.DB0100010.DB0100010form1.onLoad0 = function () {
  console.log('DB0100010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.DB0100010.DB0100010form1.onDecision0 = function () {
  console.log('DB0100010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('DB0100010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_DB0100010button1/Select"
expj.DB0100010.DB0100010form1.child0 = function () {
  console.log('DB0100010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('DB0100010', 'DB0100010form1', '_DB0100010button1/Select');
};
// script4="child;1;MASK;_DB0100010button1/Select"
expj.DB0100010.DB0100010form1.child1 = function () {
  console.log('DB0100010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('DB0100010', 'DB0100010form1', '_DB0100010button1/Select');
};
// script5="onDecision;1;CHK;?DB0100010form1/*[eq]NORMAL@*2,*4"
expj.DB0100010.DB0100010form1.onDecision1 = function () {
  console.log('DB0100010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DB0100010', 'DB0100010form1', '?DB0100010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;CHK;?PLANT_CD[eq]SAME[and]?COST_TYP[eq]SAME[and]?CREATED_BY[eq]SAME@*3,*4"
expj.DB0100010.DB0100010form1.child2 = function () {
  console.log('DB0100010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DB0100010', 'DB0100010form1', '?PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DB0100010', 'DB0100010form1', '?COST_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DB0100010', 'DB0100010form1', '?CREATED_BY'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_DB0100010button0/Print,_DB0100010button0/IssDelete"
expj.DB0100010.DB0100010form1.child3 = function () {
  console.log('DB0100010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('DB0100010', 'DB0100010form1', '_DB0100010button0/Print');
expj.common.pscript.setUnMaskToReferenceComponent('DB0100010', 'DB0100010form1', '_DB0100010button0/IssDelete');
};
// script8="child;4;MASK;_DB0100010button0/Print,_DB0100010button0/IssDelete"
expj.DB0100010.DB0100010form1.child4 = function () {
  console.log('DB0100010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('DB0100010', 'DB0100010form1', '_DB0100010button0/Print');
expj.common.pscript.setMaskToReferenceComponent('DB0100010', 'DB0100010form1', '_DB0100010button0/IssDelete');
};
expj.DB0100010.DB0100010form1.executeAllOnDecision = function () {
  console.log('execute DB0100010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DB0100010.DB0100010form1['onDecision' + i])) {
        expj.DB0100010.DB0100010form1['onDecision' + i]();
      }
    }
  }
};
expj.DB0100010.DB0100010form1.executeOnLoad = function () {
  expj.DB0100010.DB0100010form1.executePScriptOnLoad();
};

expj.DB0100010.DB0100010form1.executePScriptOnLoad = function () {
  console.log('execute DB0100010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.DB0100010.DB0100010form1['onLoad' + i])) {
      expj.DB0100010.DB0100010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-DB0100010-DB0100010form1" action="DB0100010Servlet" name="DB0100010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aDB0100010Control.getReadStatusString()) %>" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
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
<script class="expj-script-DB0100010-DB0100010form1-PLANT_CD">
expj.DB0100010.DB0100010form1.PLANT_CD = {};
expj.DB0100010.DB0100010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute DB0100010form1/PLANT_CD.onDecision');
  expj.DB0100010.DB0100010form1.executeAllOnDecision();
  expj.DB0100010.executeAllOnDecision();
};
expj.DB0100010.DB0100010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DB0100010', 'DB0100010form1', 'PLANT_CD', this);
  });
  expj.DB0100010.DB0100010form1.PLANT_CD.executePScriptOnLoad();
};

expj.DB0100010.DB0100010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute DB0100010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DB0100010-DB0100010form1-PLANT_CD" name="PLANT_CD" class="DB0100010-focus-move  required-value expj-DB0100010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDB0100010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-DB0100010-DB0100010form1-PeekerPlantCd">
expj.DB0100010.DB0100010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_DB0100010form1/PLANT_CD:_DB0100010form1/PLANT_NAME@<%=contextNo%>"
expj.DB0100010.DB0100010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DB0100010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DB0100010', 'DB0100010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DB0100010form1/PLANT_CD:_DB0100010form1/PLANT_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DB0100010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DB0100010.DB0100010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DB0100010.DB0100010form1.PeekerPlantCd['onClick' + i])) {
        expj.DB0100010.DB0100010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.DB0100010.DB0100010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.DB0100010.DB0100010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DB0100010', 'DB0100010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.DB0100010.DB0100010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.DB0100010.DB0100010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute DB0100010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DB0100010-DB0100010form1-PeekerPlantCd" class="DB0100010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DB0100010-DB0100010form1-PLANT_NAME">
expj.DB0100010.DB0100010form1.PLANT_NAME = {};
expj.DB0100010.DB0100010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute DB0100010form1/PLANT_NAME.onDecision');
  expj.DB0100010.DB0100010form1.executeAllOnDecision();
  expj.DB0100010.executeAllOnDecision();
};
expj.DB0100010.DB0100010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DB0100010', 'DB0100010form1', 'PLANT_NAME', this);
  });
  expj.DB0100010.DB0100010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.DB0100010.DB0100010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute DB0100010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DB0100010-DB0100010form1-PLANT_NAME" name="PLANT_NAME" class="DB0100010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDB0100010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.COST_TYP",rb)%></span><!-- ������� --></div><!--/td-->
<script class="expj-script-DB0100010-DB0100010form1-COST_TYP">
expj.DB0100010.DB0100010form1.COST_TYP = {};
expj.DB0100010.DB0100010form1.COST_TYP.executeAllOnDecision = function () {
  console.log('execute DB0100010form1/COST_TYP.onDecision');
  expj.DB0100010.DB0100010form1.executeAllOnDecision();
  expj.DB0100010.executeAllOnDecision();
};
expj.DB0100010.DB0100010form1.COST_TYP.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010form1-COST_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DB0100010', 'DB0100010form1', 'COST_TYP', this);
  });
  expj.DB0100010.DB0100010form1.COST_TYP.executePScriptOnLoad();
};

expj.DB0100010.DB0100010form1.COST_TYP.executePScriptOnLoad = function () {
  console.log('execute DB0100010form1/COST_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010form1-COST_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DB0100010-DB0100010form1-COST_TYP" name='COST_TYP' class='DB0100010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDB0100010Control.getStruct().getList_COST_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDB0100010Control.getStruct().getList_COST_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aDB0100010Control.getStruct().getList_COST_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDB0100010Struct.getCOST_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.USER_CD_2",rb)%></span><!-- ���s���[�U�R�[�h --></div><!--/td-->
<script class="expj-script-DB0100010-DB0100010form1-CREATED_BY">
expj.DB0100010.DB0100010form1.CREATED_BY = {};
expj.DB0100010.DB0100010form1.CREATED_BY.executeAllOnDecision = function () {
  console.log('execute DB0100010form1/CREATED_BY.onDecision');
  expj.DB0100010.DB0100010form1.executeAllOnDecision();
  expj.DB0100010.executeAllOnDecision();
};
expj.DB0100010.DB0100010form1.CREATED_BY.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010form1-CREATED_BY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DB0100010', 'DB0100010form1', 'CREATED_BY', this);
  });
  expj.DB0100010.DB0100010form1.CREATED_BY.executePScriptOnLoad();
};

expj.DB0100010.DB0100010form1.CREATED_BY.executePScriptOnLoad = function () {
  console.log('execute DB0100010form1/CREATED_BY.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010form1-CREATED_BY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DB0100010-DB0100010form1-CREATED_BY" name="CREATED_BY" class="DB0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDB0100010Struct.getCREATED_BY()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-DB0100010-DB0100010form1-PeekerUserCd">
expj.DB0100010.DB0100010form1.PeekerUserCd = {};
// script1="onClick;0;PEEKER;_DB0100010form1/CREATED_BY:_DB0100010form1/USER_NAME@<%=contextNo%>"
expj.DB0100010.DB0100010form1.PeekerUserCd.onClick0 = function () {
  console.log('PeekerUserCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DB0100010';
var parameterValues = 'PeekerUserCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DB0100010', 'DB0100010form1', '_CREATED_BY') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%USER_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DB0100010form1/CREATED_BY:_DB0100010form1/USER_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DB0100010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DB0100010.DB0100010form1.PeekerUserCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DB0100010.DB0100010form1.PeekerUserCd['onClick' + i])) {
        expj.DB0100010.DB0100010form1.PeekerUserCd['onClick' + i]();
      }
    }
  }
};
expj.DB0100010.DB0100010form1.PeekerUserCd.executeAllOnDecision = function () {
};
expj.DB0100010.DB0100010form1.PeekerUserCd.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010form1-PeekerUserCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DB0100010', 'DB0100010form1', 'PeekerUserCd', this, 'Button');
    }
  });
  expj.DB0100010.DB0100010form1.PeekerUserCd.executePScriptOnLoad();
};

expj.DB0100010.DB0100010form1.PeekerUserCd.executePScriptOnLoad = function () {
  console.log('execute DB0100010form1/PeekerUserCd.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010form1-PeekerUserCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DB0100010-DB0100010form1-PeekerUserCd" class="DB0100010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DB0100010-DB0100010form1-USER_NAME">
expj.DB0100010.DB0100010form1.USER_NAME = {};
expj.DB0100010.DB0100010form1.USER_NAME.executeAllOnDecision = function () {
  console.log('execute DB0100010form1/USER_NAME.onDecision');
  expj.DB0100010.DB0100010form1.executeAllOnDecision();
  expj.DB0100010.executeAllOnDecision();
};
expj.DB0100010.DB0100010form1.USER_NAME.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010form1-USER_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DB0100010', 'DB0100010form1', 'USER_NAME', this);
  });
  expj.DB0100010.DB0100010form1.USER_NAME.executePScriptOnLoad();
};

expj.DB0100010.DB0100010form1.USER_NAME.executePScriptOnLoad = function () {
  console.log('execute DB0100010form1/USER_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010form1-USER_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DB0100010-DB0100010form1-USER_NAME" name="USER_NAME" class="DB0100010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDB0100010Struct.getUSER_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-DB0100010-DB0100010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDB0100010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-DB0100010-DB0100010form1-DOWNLOAD_FILE">
expj.DB0100010.DB0100010form1.DOWNLOAD_FILE = {};
expj.DB0100010.DB0100010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute DB0100010form1/DOWNLOAD_FILE.onDecision');
  expj.DB0100010.DB0100010form1.executeAllOnDecision();
  expj.DB0100010.executeAllOnDecision();
};
expj.DB0100010.DB0100010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DB0100010', 'DB0100010form1', 'DOWNLOAD_FILE', this);
  });
  expj.DB0100010.DB0100010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.DB0100010.DB0100010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute DB0100010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-DB0100010-DB0100010button1">
expj.DB0100010.DB0100010button1 = {};
expj.DB0100010.DB0100010button1.executeAllOnDecision = function () {
  console.log('execute DB0100010button1.onDecision');
};
expj.DB0100010.DB0100010button1.executeOnLoad = function () {
  expj.DB0100010.DB0100010button1.executePScriptOnLoad();
};

expj.DB0100010.DB0100010button1.executePScriptOnLoad = function () {
  console.log('execute DB0100010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DB0100010-DB0100010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DB0100010-DB0100010button1-Select">
expj.DB0100010.DB0100010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DB0100010form1/*@DB0100010Servlet"
expj.DB0100010.DB0100010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DB0100010', 'DB0100010button1', '_DB0100010form1/*', 'DB0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DB0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DB0100010', response);
expj.common.updateBusinessScreenTab('DB0100010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.DB0100010.DB0100010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DB0100010.DB0100010button1.Select['onClick' + i])) {
        expj.DB0100010.DB0100010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.DB0100010.DB0100010button1.Select.executeAllOnDecision = function () {
};
expj.DB0100010.DB0100010button1.Select.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DB0100010', 'DB0100010button1', 'Select', this, 'Button');
    }
  });
  expj.DB0100010.DB0100010button1.Select.executePScriptOnLoad();
};

expj.DB0100010.DB0100010button1.Select.executePScriptOnLoad = function () {
  console.log('execute DB0100010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DB0100010-DB0100010button1-Select" name="Select" class="DB0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- �Ǎ��{�^�� --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-DB0100010-DB0100010form2">
expj.DB0100010.DB0100010form2 = {};
expj.DB0100010.DB0100010form2.executeAllOnDecision = function () {
  console.log('execute DB0100010form2.onDecision');
};
expj.DB0100010.DB0100010form2.executeOnLoad = function () {
  expj.DB0100010.DB0100010form2.executePScriptOnLoad();
};

expj.DB0100010.DB0100010form2.executePScriptOnLoad = function () {
  console.log('execute DB0100010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-DB0100010-DB0100010form2" action="DB0100010Servlet" name="DB0100010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="align:"></div>
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
<div class="div-td" style="width:0px;"></div><!--/td-->
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
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0487",rb)%></span><!-- �y�����Ώہz --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0488",rb)%></span><!-- �y���o�͌����z --></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0489",rb)%></span><!-- �y�o�͍ό����z --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-DB0100010-DB0100010form2-c_DB0010B001">
expj.DB0100010.DB0100010form2.c_DB0010B001 = {};
expj.DB0100010.DB0100010form2.c_DB0010B001.executeAllOnDecision = function () {
  console.log('execute DB0100010form2/c_DB0010B001.onDecision');
  expj.DB0100010.DB0100010form2.executeAllOnDecision();
  expj.DB0100010.executeAllOnDecision();
};
expj.DB0100010.DB0100010form2.c_DB0010B001.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010form2-c_DB0010B001').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DB0100010', 'DB0100010form2', 'c_DB0010B001', this, 'CheckBox');
    }
  });
  expj.DB0100010.DB0100010form2.c_DB0010B001.executePScriptOnLoad();
};

expj.DB0100010.DB0100010form2.c_DB0010B001.executePScriptOnLoad = function () {
  console.log('execute DB0100010form2/c_DB0010B001.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010form2-c_DB0010B001');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_DB0010B001" value="true" <%= ("true".equals(TypeConverter.convert(aDB0100010Struct.getc_DB0010B001())) || "1".equals(TypeConverter.convert(aDB0100010Struct.getc_DB0010B001())))?"checked=\"checked\"":"" %>  class="DB0100010-focus-move" id="expj-DB0100010-DB0100010form2-c_DB0010B001"><label for="expj-DB0100010-DB0100010form2-c_DB0010B001"><%=CoreTools.getRBString("Expj.Cmt0257",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DB0100010-DB0100010form2-DB0010B001_0_COUNT">
expj.DB0100010.DB0100010form2.DB0010B001_0_COUNT = {};
expj.DB0100010.DB0100010form2.DB0010B001_0_COUNT.executeAllOnDecision = function () {
  console.log('execute DB0100010form2/DB0010B001_0_COUNT.onDecision');
  expj.DB0100010.DB0100010form2.executeAllOnDecision();
  expj.DB0100010.executeAllOnDecision();
};
expj.DB0100010.DB0100010form2.DB0010B001_0_COUNT.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010form2-DB0010B001_0_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DB0100010', 'DB0100010form2', 'DB0010B001_0_COUNT', this);
  });
  expj.DB0100010.DB0100010form2.DB0010B001_0_COUNT.executePScriptOnLoad();
};

expj.DB0100010.DB0100010form2.DB0010B001_0_COUNT.executePScriptOnLoad = function () {
  console.log('execute DB0100010form2/DB0010B001_0_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010form2-DB0010B001_0_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="text" id="expj-DB0100010-DB0100010form2-DB0010B001_0_COUNT" name="DB0010B001_0_COUNT" class="DB0100010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;14;FLOOR;" value="<%= TypeConverter.sanitizer(aDB0100010Struct.getDB0010B001_0_COUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-DB0100010-DB0100010form2-DB0010B001_1_COUNT">
expj.DB0100010.DB0100010form2.DB0010B001_1_COUNT = {};
expj.DB0100010.DB0100010form2.DB0010B001_1_COUNT.executeAllOnDecision = function () {
  console.log('execute DB0100010form2/DB0010B001_1_COUNT.onDecision');
  expj.DB0100010.DB0100010form2.executeAllOnDecision();
  expj.DB0100010.executeAllOnDecision();
};
expj.DB0100010.DB0100010form2.DB0010B001_1_COUNT.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010form2-DB0010B001_1_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DB0100010', 'DB0100010form2', 'DB0010B001_1_COUNT', this);
  });
  expj.DB0100010.DB0100010form2.DB0010B001_1_COUNT.executePScriptOnLoad();
};

expj.DB0100010.DB0100010form2.DB0010B001_1_COUNT.executePScriptOnLoad = function () {
  console.log('execute DB0100010form2/DB0010B001_1_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010form2-DB0010B001_1_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DB0100010-DB0100010form2-DB0010B001_1_COUNT" name="DB0010B001_1_COUNT" class="DB0100010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;14;FLOOR;" value="<%= TypeConverter.sanitizer(aDB0100010Struct.getDB0010B001_1_COUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-DB0100010-DB0100010form2-c_DB0040B001">
expj.DB0100010.DB0100010form2.c_DB0040B001 = {};
expj.DB0100010.DB0100010form2.c_DB0040B001.executeAllOnDecision = function () {
  console.log('execute DB0100010form2/c_DB0040B001.onDecision');
  expj.DB0100010.DB0100010form2.executeAllOnDecision();
  expj.DB0100010.executeAllOnDecision();
};
expj.DB0100010.DB0100010form2.c_DB0040B001.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010form2-c_DB0040B001').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DB0100010', 'DB0100010form2', 'c_DB0040B001', this, 'CheckBox');
    }
  });
  expj.DB0100010.DB0100010form2.c_DB0040B001.executePScriptOnLoad();
};

expj.DB0100010.DB0100010form2.c_DB0040B001.executePScriptOnLoad = function () {
  console.log('execute DB0100010form2/c_DB0040B001.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010form2-c_DB0040B001');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_DB0040B001" value="true" <%= ("true".equals(TypeConverter.convert(aDB0100010Struct.getc_DB0040B001())) || "1".equals(TypeConverter.convert(aDB0100010Struct.getc_DB0040B001())))?"checked=\"checked\"":"" %>  class="DB0100010-focus-move" id="expj-DB0100010-DB0100010form2-c_DB0040B001"><label for="expj-DB0100010-DB0100010form2-c_DB0040B001"><%=CoreTools.getRBString("Expj.Cmt0263",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DB0100010-DB0100010form2-DB0040B001_0_COUNT">
expj.DB0100010.DB0100010form2.DB0040B001_0_COUNT = {};
expj.DB0100010.DB0100010form2.DB0040B001_0_COUNT.executeAllOnDecision = function () {
  console.log('execute DB0100010form2/DB0040B001_0_COUNT.onDecision');
  expj.DB0100010.DB0100010form2.executeAllOnDecision();
  expj.DB0100010.executeAllOnDecision();
};
expj.DB0100010.DB0100010form2.DB0040B001_0_COUNT.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010form2-DB0040B001_0_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DB0100010', 'DB0100010form2', 'DB0040B001_0_COUNT', this);
  });
  expj.DB0100010.DB0100010form2.DB0040B001_0_COUNT.executePScriptOnLoad();
};

expj.DB0100010.DB0100010form2.DB0040B001_0_COUNT.executePScriptOnLoad = function () {
  console.log('execute DB0100010form2/DB0040B001_0_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010form2-DB0040B001_0_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="text" id="expj-DB0100010-DB0100010form2-DB0040B001_0_COUNT" name="DB0040B001_0_COUNT" class="DB0100010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;14;FLOOR;" value="<%= TypeConverter.sanitizer(aDB0100010Struct.getDB0040B001_0_COUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-DB0100010-DB0100010form2-DB0040B001_1_COUNT">
expj.DB0100010.DB0100010form2.DB0040B001_1_COUNT = {};
expj.DB0100010.DB0100010form2.DB0040B001_1_COUNT.executeAllOnDecision = function () {
  console.log('execute DB0100010form2/DB0040B001_1_COUNT.onDecision');
  expj.DB0100010.DB0100010form2.executeAllOnDecision();
  expj.DB0100010.executeAllOnDecision();
};
expj.DB0100010.DB0100010form2.DB0040B001_1_COUNT.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010form2-DB0040B001_1_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DB0100010', 'DB0100010form2', 'DB0040B001_1_COUNT', this);
  });
  expj.DB0100010.DB0100010form2.DB0040B001_1_COUNT.executePScriptOnLoad();
};

expj.DB0100010.DB0100010form2.DB0040B001_1_COUNT.executePScriptOnLoad = function () {
  console.log('execute DB0100010form2/DB0040B001_1_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010form2-DB0040B001_1_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DB0100010-DB0100010form2-DB0040B001_1_COUNT" name="DB0040B001_1_COUNT" class="DB0100010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;14;FLOOR;" value="<%= TypeConverter.sanitizer(aDB0100010Struct.getDB0040B001_1_COUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-DB0100010-DB0100010form2-c_DB0020B001">
expj.DB0100010.DB0100010form2.c_DB0020B001 = {};
expj.DB0100010.DB0100010form2.c_DB0020B001.executeAllOnDecision = function () {
  console.log('execute DB0100010form2/c_DB0020B001.onDecision');
  expj.DB0100010.DB0100010form2.executeAllOnDecision();
  expj.DB0100010.executeAllOnDecision();
};
expj.DB0100010.DB0100010form2.c_DB0020B001.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010form2-c_DB0020B001').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DB0100010', 'DB0100010form2', 'c_DB0020B001', this, 'CheckBox');
    }
  });
  expj.DB0100010.DB0100010form2.c_DB0020B001.executePScriptOnLoad();
};

expj.DB0100010.DB0100010form2.c_DB0020B001.executePScriptOnLoad = function () {
  console.log('execute DB0100010form2/c_DB0020B001.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010form2-c_DB0020B001');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_DB0020B001" value="true" <%= ("true".equals(TypeConverter.convert(aDB0100010Struct.getc_DB0020B001())) || "1".equals(TypeConverter.convert(aDB0100010Struct.getc_DB0020B001())))?"checked=\"checked\"":"" %>  class="DB0100010-focus-move" id="expj-DB0100010-DB0100010form2-c_DB0020B001"><label for="expj-DB0100010-DB0100010form2-c_DB0020B001"><%=CoreTools.getRBString("Expj.Cmt0259",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DB0100010-DB0100010form2-DB0020B001_0_COUNT">
expj.DB0100010.DB0100010form2.DB0020B001_0_COUNT = {};
expj.DB0100010.DB0100010form2.DB0020B001_0_COUNT.executeAllOnDecision = function () {
  console.log('execute DB0100010form2/DB0020B001_0_COUNT.onDecision');
  expj.DB0100010.DB0100010form2.executeAllOnDecision();
  expj.DB0100010.executeAllOnDecision();
};
expj.DB0100010.DB0100010form2.DB0020B001_0_COUNT.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010form2-DB0020B001_0_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DB0100010', 'DB0100010form2', 'DB0020B001_0_COUNT', this);
  });
  expj.DB0100010.DB0100010form2.DB0020B001_0_COUNT.executePScriptOnLoad();
};

expj.DB0100010.DB0100010form2.DB0020B001_0_COUNT.executePScriptOnLoad = function () {
  console.log('execute DB0100010form2/DB0020B001_0_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010form2-DB0020B001_0_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="text" id="expj-DB0100010-DB0100010form2-DB0020B001_0_COUNT" name="DB0020B001_0_COUNT" class="DB0100010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;14;FLOOR;" value="<%= TypeConverter.sanitizer(aDB0100010Struct.getDB0020B001_0_COUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-DB0100010-DB0100010form2-DB0020B001_1_COUNT">
expj.DB0100010.DB0100010form2.DB0020B001_1_COUNT = {};
expj.DB0100010.DB0100010form2.DB0020B001_1_COUNT.executeAllOnDecision = function () {
  console.log('execute DB0100010form2/DB0020B001_1_COUNT.onDecision');
  expj.DB0100010.DB0100010form2.executeAllOnDecision();
  expj.DB0100010.executeAllOnDecision();
};
expj.DB0100010.DB0100010form2.DB0020B001_1_COUNT.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010form2-DB0020B001_1_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DB0100010', 'DB0100010form2', 'DB0020B001_1_COUNT', this);
  });
  expj.DB0100010.DB0100010form2.DB0020B001_1_COUNT.executePScriptOnLoad();
};

expj.DB0100010.DB0100010form2.DB0020B001_1_COUNT.executePScriptOnLoad = function () {
  console.log('execute DB0100010form2/DB0020B001_1_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010form2-DB0020B001_1_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DB0100010-DB0100010form2-DB0020B001_1_COUNT" name="DB0020B001_1_COUNT" class="DB0100010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;14;FLOOR;" value="<%= TypeConverter.sanitizer(aDB0100010Struct.getDB0020B001_1_COUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-DB0100010-DB0100010form2-c_DB0030B001">
expj.DB0100010.DB0100010form2.c_DB0030B001 = {};
expj.DB0100010.DB0100010form2.c_DB0030B001.executeAllOnDecision = function () {
  console.log('execute DB0100010form2/c_DB0030B001.onDecision');
  expj.DB0100010.DB0100010form2.executeAllOnDecision();
  expj.DB0100010.executeAllOnDecision();
};
expj.DB0100010.DB0100010form2.c_DB0030B001.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010form2-c_DB0030B001').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DB0100010', 'DB0100010form2', 'c_DB0030B001', this, 'CheckBox');
    }
  });
  expj.DB0100010.DB0100010form2.c_DB0030B001.executePScriptOnLoad();
};

expj.DB0100010.DB0100010form2.c_DB0030B001.executePScriptOnLoad = function () {
  console.log('execute DB0100010form2/c_DB0030B001.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010form2-c_DB0030B001');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_DB0030B001" value="true" <%= ("true".equals(TypeConverter.convert(aDB0100010Struct.getc_DB0030B001())) || "1".equals(TypeConverter.convert(aDB0100010Struct.getc_DB0030B001())))?"checked=\"checked\"":"" %>  class="DB0100010-focus-move" id="expj-DB0100010-DB0100010form2-c_DB0030B001"><label for="expj-DB0100010-DB0100010form2-c_DB0030B001"><%=CoreTools.getRBString("Expj.Cmt0261",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DB0100010-DB0100010form2-DB0030B001_0_COUNT">
expj.DB0100010.DB0100010form2.DB0030B001_0_COUNT = {};
expj.DB0100010.DB0100010form2.DB0030B001_0_COUNT.executeAllOnDecision = function () {
  console.log('execute DB0100010form2/DB0030B001_0_COUNT.onDecision');
  expj.DB0100010.DB0100010form2.executeAllOnDecision();
  expj.DB0100010.executeAllOnDecision();
};
expj.DB0100010.DB0100010form2.DB0030B001_0_COUNT.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010form2-DB0030B001_0_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DB0100010', 'DB0100010form2', 'DB0030B001_0_COUNT', this);
  });
  expj.DB0100010.DB0100010form2.DB0030B001_0_COUNT.executePScriptOnLoad();
};

expj.DB0100010.DB0100010form2.DB0030B001_0_COUNT.executePScriptOnLoad = function () {
  console.log('execute DB0100010form2/DB0030B001_0_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010form2-DB0030B001_0_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="text" id="expj-DB0100010-DB0100010form2-DB0030B001_0_COUNT" name="DB0030B001_0_COUNT" class="DB0100010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;14;FLOOR;" value="<%= TypeConverter.sanitizer(aDB0100010Struct.getDB0030B001_0_COUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-DB0100010-DB0100010form2-DB0030B001_1_COUNT">
expj.DB0100010.DB0100010form2.DB0030B001_1_COUNT = {};
expj.DB0100010.DB0100010form2.DB0030B001_1_COUNT.executeAllOnDecision = function () {
  console.log('execute DB0100010form2/DB0030B001_1_COUNT.onDecision');
  expj.DB0100010.DB0100010form2.executeAllOnDecision();
  expj.DB0100010.executeAllOnDecision();
};
expj.DB0100010.DB0100010form2.DB0030B001_1_COUNT.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010form2-DB0030B001_1_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DB0100010', 'DB0100010form2', 'DB0030B001_1_COUNT', this);
  });
  expj.DB0100010.DB0100010form2.DB0030B001_1_COUNT.executePScriptOnLoad();
};

expj.DB0100010.DB0100010form2.DB0030B001_1_COUNT.executePScriptOnLoad = function () {
  console.log('execute DB0100010form2/DB0030B001_1_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010form2-DB0030B001_1_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DB0100010-DB0100010form2-DB0030B001_1_COUNT" name="DB0030B001_1_COUNT" class="DB0100010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;14;FLOOR;" value="<%= TypeConverter.sanitizer(aDB0100010Struct.getDB0030B001_1_COUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
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
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span>�@</span></div><!--/td-->
<script class="expj-script-DB0100010-DB0100010form2-c_ReOut">
expj.DB0100010.DB0100010form2.c_ReOut = {};
expj.DB0100010.DB0100010form2.c_ReOut.executeAllOnDecision = function () {
  console.log('execute DB0100010form2/c_ReOut.onDecision');
  expj.DB0100010.DB0100010form2.executeAllOnDecision();
  expj.DB0100010.executeAllOnDecision();
};
expj.DB0100010.DB0100010form2.c_ReOut.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010form2-c_ReOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DB0100010', 'DB0100010form2', 'c_ReOut', this, 'CheckBox');
    }
  });
  expj.DB0100010.DB0100010form2.c_ReOut.executePScriptOnLoad();
};

expj.DB0100010.DB0100010form2.c_ReOut.executePScriptOnLoad = function () {
  console.log('execute DB0100010form2/c_ReOut.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010form2-c_ReOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_ReOut" value="true" <%= ("true".equals(TypeConverter.convert(aDB0100010Struct.getc_ReOut())) || "1".equals(TypeConverter.convert(aDB0100010Struct.getc_ReOut())))?"checked=\"checked\"":"" %>  class="DB0100010-focus-move" id="expj-DB0100010-DB0100010form2-c_ReOut"><label for="expj-DB0100010-DB0100010form2-c_ReOut"><%=CoreTools.getRBString("Expj.Cmt0264",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 410px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">DB0100010 Revision: 1.4  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:420px;">
<script class="expj-script-DB0100010-DB0100010button0">
expj.DB0100010.DB0100010button0 = {};
expj.DB0100010.DB0100010button0.executeAllOnDecision = function () {
  console.log('execute DB0100010button0.onDecision');
};
expj.DB0100010.DB0100010button0.executeOnLoad = function () {
  expj.DB0100010.DB0100010button0.executePScriptOnLoad();
};

expj.DB0100010.DB0100010button0.executePScriptOnLoad = function () {
  console.log('execute DB0100010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DB0100010-DB0100010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DB0100010-DB0100010button0-Print">
expj.DB0100010.DB0100010button0.Print = {};
// script1="onClick;0;CHK;_DB0100010form2/c_DB0010B001[neq]true[and]_DB0100010form2/c_DB0020B001[neq]true[and]_DB0100010form2/c_DB0030B001[neq]true[and]_DB0100010form2/c_DB0040B001[neq]true@#DB10101"
expj.DB0100010.DB0100010button0.Print.onClick0 = function () {
  console.log('Print script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DB0100010', 'DB0100010button0', '_DB0100010form2/c_DB0010B001'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DB0100010', 'DB0100010button0', '_DB0100010form2/c_DB0020B001'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DB0100010', 'DB0100010button0', '_DB0100010form2/c_DB0030B001'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DB0100010', 'DB0100010button0', '_DB0100010form2/c_DB0040B001'), '[neq]', 'true')) {
expj.common.pscript.addErrorMessage('DB0100010', 'DB0100010button0', 'DB10101');
}
};
// script2="onClick;1;PRINTER;ORTEUS_HASHED=<%=hashed%>,_DB0100010form1/*,_DB0100010form2/*@DB0100010Servlet:H,H,H"
expj.DB0100010.DB0100010button0.Print.onClick1 = function () {
  console.log('Print script2');
expj.common.pscript.viewPrinterDialog('DB0100010', 'DB0100010button0', '_DB0100010form1/*,_DB0100010form2/*', 'DB0100010Servlet', 'H,H,H');
};
expj.DB0100010.DB0100010button0.Print.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DB0100010.DB0100010button0.Print['onClick' + i])) {
        expj.DB0100010.DB0100010button0.Print['onClick' + i]();
      }
    }
  }
};
expj.DB0100010.DB0100010button0.Print.executeAllOnDecision = function () {
};
expj.DB0100010.DB0100010button0.Print.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010button0-Print').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DB0100010', 'DB0100010button0', 'Print', this, 'Button');
    }
  });
  expj.DB0100010.DB0100010button0.Print.executePScriptOnLoad();
};

expj.DB0100010.DB0100010button0.Print.executePScriptOnLoad = function () {
  console.log('execute DB0100010button0/Print.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010button0-Print');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DB0100010-DB0100010button0-Print" name="Print" class="DB0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnPrint",rb)%></button><!-- ���[�o�̓{�^�� --></div><!--/td-->
<script class="expj-script-DB0100010-DB0100010button0-IssDelete">
expj.DB0100010.DB0100010button0.IssDelete = {};
// script1="onClick;0;CHK;_DB0100010form2/c_DB0010B001[neq]true[and]_DB0100010form2/c_DB0020B001[neq]true[and]_DB0100010form2/c_DB0030B001[neq]true[and]_DB0100010form2/c_DB0040B001[neq]true@#DB10101"
expj.DB0100010.DB0100010button0.IssDelete.onClick0 = function () {
  console.log('IssDelete script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DB0100010', 'DB0100010button0', '_DB0100010form2/c_DB0010B001'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DB0100010', 'DB0100010button0', '_DB0100010form2/c_DB0020B001'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DB0100010', 'DB0100010button0', '_DB0100010form2/c_DB0030B001'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DB0100010', 'DB0100010button0', '_DB0100010form2/c_DB0040B001'), '[neq]', 'true')) {
expj.common.pscript.addErrorMessage('DB0100010', 'DB0100010button0', 'DB10101');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_DB0100010form1/*,_DB0100010form2/*@DB0100010Servlet,,$DB10102"
expj.DB0100010.DB0100010button0.IssDelete.onClick1 = function () {
  console.log('IssDelete script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DB0100010', 'DB0100010button0', '_DB0100010form1/*,_DB0100010form2/*', 'DB0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DB0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DB0100010', response);
expj.common.updateBusinessScreenTab('DB0100010', contents);
};
expj.common.pscript.callConfirm('DB0100010', 'DB0100010button0', 'DB10102', okEvent);
};
expj.DB0100010.DB0100010button0.IssDelete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DB0100010.DB0100010button0.IssDelete['onClick' + i])) {
        expj.DB0100010.DB0100010button0.IssDelete['onClick' + i]();
      }
    }
  }
};
expj.DB0100010.DB0100010button0.IssDelete.executeAllOnDecision = function () {
};
expj.DB0100010.DB0100010button0.IssDelete.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010button0-IssDelete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DB0100010', 'DB0100010button0', 'IssDelete', this, 'Button');
    }
  });
  expj.DB0100010.DB0100010button0.IssDelete.executePScriptOnLoad();
};

expj.DB0100010.DB0100010button0.IssDelete.executePScriptOnLoad = function () {
  console.log('execute DB0100010button0/IssDelete.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010button0-IssDelete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DB0100010-DB0100010button0-IssDelete" name="IssDelete" class="DB0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnIssDelete",rb)%></button><!-- �o�͍ύ폜�{�^�� --></div><!--/td-->
<script class="expj-script-DB0100010-DB0100010button0-Clear">
expj.DB0100010.DB0100010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@DB0100010Servlet,,$ZZ07008"
expj.DB0100010.DB0100010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DB0100010', 'DB0100010button0', '', 'DB0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DB0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DB0100010', response);
expj.common.updateBusinessScreenTab('DB0100010', contents);
};
expj.common.pscript.callConfirm('DB0100010', 'DB0100010button0', 'ZZ07008', okEvent);
};
expj.DB0100010.DB0100010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DB0100010.DB0100010button0.Clear['onClick' + i])) {
        expj.DB0100010.DB0100010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.DB0100010.DB0100010button0.Clear.executeAllOnDecision = function () {
};
expj.DB0100010.DB0100010button0.Clear.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DB0100010', 'DB0100010button0', 'Clear', this, 'Button');
    }
  });
  expj.DB0100010.DB0100010button0.Clear.executePScriptOnLoad();
};

expj.DB0100010.DB0100010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute DB0100010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DB0100010-DB0100010button0-Clear" name="Clear" class="DB0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- �N���A�{�^�� --></div><!--/td-->
<script class="expj-script-DB0100010-DB0100010button0-Close">
expj.DB0100010.DB0100010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.DB0100010.DB0100010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('DB0100010');
};
expj.DB0100010.DB0100010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DB0100010.DB0100010button0.Close['onClick' + i])) {
        expj.DB0100010.DB0100010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.DB0100010.DB0100010button0.Close.executeAllOnDecision = function () {
};
expj.DB0100010.DB0100010button0.Close.executeOnLoad = function () {
  $('#expj-DB0100010-DB0100010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DB0100010', 'DB0100010button0', 'Close', this, 'Button');
    }
  });
  expj.DB0100010.DB0100010button0.Close.executePScriptOnLoad();
};

expj.DB0100010.DB0100010button0.Close.executePScriptOnLoad = function () {
  console.log('execute DB0100010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-DB0100010-DB0100010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DB0100010-DB0100010button0-Close" name="Close" class="DB0100010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- ����{�^�� --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-DB0100010 (END)-->
<%
MessageStruct msgStruct = aDB0100010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS�錾
 if (treeId != null) {
%>
<script class="expj-script-DB0100010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.DB0100010)) {
  expj.common.treeInstanceMap.DB0100010 = {};
}
expj.common.treeInstanceMap.DB0100010.<%=treeId %> = {};
// TREE�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.DB0100010.<%=treeId %>.treeInstance = null;
// �I�𒆂�Node��ۑ�����ϐ�
expj.common.treeInstanceMap.DB0100010.<%=treeId %>.gPrevSelectedNode = null;
// �R���e�L�X�g���j���[�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.DB0100010.<%=treeId %>.contextData = null;
// �c���[�̃m�[�h���I�����ꂽ���ɏ��������֐�
expj.common.treeInstanceMap.DB0100010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.DB0100010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.DB0100010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.DB0100010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.DB0100010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-DB0100010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js�錾
 if (detailId != null) {
%>
<script class="expj-script-DB0100010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DB0100010)) {
  expj.common.detailDialogMap.DB0100010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DB0100010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.DB0100010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DB0100010.<%=detailId %>)) {
  expj.common.detailDialogMap.DB0100010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DB0100010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.DB0100010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DB0100010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.DB0100010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.DB0100010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.DB0100010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)��VIEW�{�f�B�f�[�^
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)��VIEW�w�b�_�[�f�[�^
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-DB0100010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)��VIEW����
  expj.common.detailDialogMap.DB0100010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-DB0100010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // �ڍ׃E�B���h�E�̏�����
  expj.common.detailDialogMap.DB0100010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-DB0100010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.DB0100010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.DB0100010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.DB0100010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.DB0100010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-DB0100010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.DB0100010)) {
  expj.common.viewInstanceMap.DB0100010 = {};
}
expj.common.viewInstanceMap.DB0100010.<%=viewId %> = {};
expj.common.viewInstanceMap.DB0100010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.DB0100010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.DB0100010.<%=viewId %>.init = function () {
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
    expj.DB0100010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.DB0100010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-DB0100010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-DB0100010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-DB0100010_init">
/**
 * DB0100010�p�̃��[�h�������������֐�
 */
expj.DB0100010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-DB0100010');
  //�{�^���Ȃ��{�^���s�G���A�폜����
  expj.common.arrangeDatagridButtonArea('DB0100010');
  //��DataGridTable�ɓ��I�����ݒ�
  expj.common.setExpjDynamicHeight('DB0100010');
  expj.common.calendarInstanceMap.DB0100010 = {};
<%
 if (treeId != null) {
%>
  // TREE�̏�����
  expj.common.treeInstanceMap.DB0100010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)�p�̏�����
  expj.common.detailDialogMap.DB0100010.<%=detailId %>.init();
  expj.common.detailDialogMap.DB0100010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.DB0100010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)�̏�����
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.DB0100010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-DB0100010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-DB0100010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-DB0100010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-DB0100010-<%=detailId %>');
<%
 }
%>
  try{expj.DB0100010.DB0100010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010form1.COST_TYP.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010form1.CREATED_BY.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010form1.PeekerUserCd.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010form1.USER_NAME.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010button1.Select.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010form2.c_DB0010B001.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010form2.DB0010B001_0_COUNT.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010form2.DB0010B001_1_COUNT.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010form2.c_DB0040B001.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010form2.DB0040B001_0_COUNT.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010form2.DB0040B001_1_COUNT.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010form2.c_DB0020B001.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010form2.DB0020B001_0_COUNT.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010form2.DB0020B001_1_COUNT.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010form2.c_DB0030B001.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010form2.DB0030B001_0_COUNT.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010form2.DB0030B001_1_COUNT.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010form2.c_ReOut.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010button0.Print.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010button0.IssDelete.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010button0.Close.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010form1.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010button1.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010form2.executeOnLoad();}catch(e){};
  try{expj.DB0100010.DB0100010button0.executeOnLoad();}catch(e){};
  // �R���\�[���o��
  expj.DB0100010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-DB0100010', 'DB0100010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-DB0100010');  
  // �L�[�ɂ��t�H�[�J�X�ړ��ݒ�
  expj.common.ui.setupFocusMove('.DB0100010-focus-move');
  // �����t�H�[�J�X���Ă鏈��
  $('.DB0100010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // �t�@�C���_�E�����[�h����
  expj.common.executeFileDownLoad('DB0100010', '<%=request.getContextPath() %>');
};

/**
 * DB0100010�̑S��onDecision����
 */
expj.DB0100010.executeAllOnDecision = function () {
  expj.DB0100010.DB0100010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-DB0100010_console">
expj.DB0100010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // �R���\�[���o��
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>