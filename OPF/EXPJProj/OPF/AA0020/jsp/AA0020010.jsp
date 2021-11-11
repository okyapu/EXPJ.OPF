<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:20:50 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0020\AA0020010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0020.*" %>
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
<jsp:useBean id="aAA0020010Control" class="com.nec.jp.orteus.metamorBase.AA0020.AA0020010Control" scope="request"/>
<jsp:useBean id="aAA0020010Struct" class="com.nec.jp.orteus.metamorBase.AA0020.AA0020010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

製品構成メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0020/jsp/AA0020010.jsp,v $
$Author: geng-jia $     
$Revision: 1.11 $ $Date: 2017/02/22 02:03:44 $
********************************************************* --%>
<html>
<head>
<title>製品構成メンテナンス</title>
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
<script class="expj-script-AA0020010_init">
  // AA0020010名前空間
  expj.AA0020010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AA0020010" data-screen="AA0020010" data-newdata="<%=aAA0020010Control.isNewData() %>">
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
              <script class="expj-script-AA0020010-AA0020010form1">
expj.AA0020010.AA0020010form1 = {};
// script1="onLoad;0;CALL;child@0"
expj.AA0020010.AA0020010form1.onLoad0 = function () {
  console.log('AA0020010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;CHK;?AA0020010form1/*[neq]NORMAL@*1,*2"
expj.AA0020010.AA0020010form1.child0 = function () {
  console.log('AA0020010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0020010', 'AA0020010form1', '?AA0020010form1/*'), '[neq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;MASK;_AA0020010button2/insert,_AA0020010button2/update,_AA0020010button2/delete,_AA0020010button2/deleteAll@*2"
expj.AA0020010.AA0020010form1.child1 = function () {
  console.log('AA0020010form1 script3');
expj.common.pscript.setMaskToReferenceComponent('AA0020010', 'AA0020010form1', '_AA0020010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('AA0020010', 'AA0020010form1', '_AA0020010button2/update');
expj.common.pscript.setMaskToReferenceComponent('AA0020010', 'AA0020010form1', '_AA0020010button2/delete');
expj.common.pscript.setMaskToReferenceComponent('AA0020010', 'AA0020010form1', '_AA0020010button2/deleteAll');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script4="child;2;MASK;_AA0020010button2/update,_AA0020010button2/delete"
expj.AA0020010.AA0020010form1.child2 = function () {
  console.log('AA0020010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AA0020010', 'AA0020010form1', '_AA0020010button2/update');
expj.common.pscript.setMaskToReferenceComponent('AA0020010', 'AA0020010form1', '_AA0020010button2/delete');
};
// script5="onLoad;1;CALL;onDecision@0,1"
expj.AA0020010.AA0020010form1.onLoad1 = function () {
  console.log('AA0020010form1 script5');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script6="onDecision;0;CHKRQ;A@*3,*4"
expj.AA0020010.AA0020010form1.onDecision0 = function () {
  console.log('AA0020010form1 script6');
if (expj.common.pscript.satisfiedRequiredComponent('AA0020010', 'A')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_AA0020010button1/select"
expj.AA0020010.AA0020010form1.child3 = function () {
  console.log('AA0020010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AA0020010', 'AA0020010form1', '_AA0020010button1/select');
};
// script8="child;4;MASK;_AA0020010button1/select"
expj.AA0020010.AA0020010form1.child4 = function () {
  console.log('AA0020010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AA0020010', 'AA0020010form1', '_AA0020010button1/select');
};
// script9="onDecision;1;CHKRQ;?AA0020010view1/?[eq]SINGLE@*5,*9"
expj.AA0020010.AA0020010form1.onDecision1 = function () {
  console.log('AA0020010form1 script9');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0020010', 'AA0020010form1', '?AA0020010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script10="child;5;CHK;?AA0020010form1/*[eq]NORMAL@*6"
expj.AA0020010.AA0020010form1.child5 = function () {
  console.log('AA0020010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0020010', 'AA0020010form1', '?AA0020010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script11="child;6;CHK;?AA0020010form1/w_TARGET_ITEM_CD[eq]SAME[and]?AA0020010form1/w_LEVEL[eq]SAME[and]?AA0020010form1/w_TARGET_DATE[eq]SAME[and]?AA0020010form1/s_DEVELOP_TYP[eq]SAME@*7,*8"
expj.AA0020010.AA0020010form1.child6 = function () {
  console.log('AA0020010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0020010', 'AA0020010form1', '?AA0020010form1/w_TARGET_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0020010', 'AA0020010form1', '?AA0020010form1/w_LEVEL'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0020010', 'AA0020010form1', '?AA0020010form1/w_TARGET_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0020010', 'AA0020010form1', '?AA0020010form1/s_DEVELOP_TYP'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script12="child;7;UNMASK;_AA0020010button2/insert,_AA0020010button2/update,_AA0020010button2/delete,_AA0020010button2/deleteAll"
expj.AA0020010.AA0020010form1.child7 = function () {
  console.log('AA0020010form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('AA0020010', 'AA0020010form1', '_AA0020010button2/insert');
expj.common.pscript.setUnMaskToReferenceComponent('AA0020010', 'AA0020010form1', '_AA0020010button2/update');
expj.common.pscript.setUnMaskToReferenceComponent('AA0020010', 'AA0020010form1', '_AA0020010button2/delete');
expj.common.pscript.setUnMaskToReferenceComponent('AA0020010', 'AA0020010form1', '_AA0020010button2/deleteAll');
};
// script13="child;8;MASK;_AA0020010button2/insert,_AA0020010button2/update,_AA0020010button2/delete,_AA0020010button2/deleteAll"
expj.AA0020010.AA0020010form1.child8 = function () {
  console.log('AA0020010form1 script13');
expj.common.pscript.setMaskToReferenceComponent('AA0020010', 'AA0020010form1', '_AA0020010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('AA0020010', 'AA0020010form1', '_AA0020010button2/update');
expj.common.pscript.setMaskToReferenceComponent('AA0020010', 'AA0020010form1', '_AA0020010button2/delete');
expj.common.pscript.setMaskToReferenceComponent('AA0020010', 'AA0020010form1', '_AA0020010button2/deleteAll');
};
// script14="child;9;MASK;_AA0020010button2/insert,_AA0020010button2/update,_AA0020010button2/delete,_AA0020010button2/deleteAll"
expj.AA0020010.AA0020010form1.child9 = function () {
  console.log('AA0020010form1 script14');
expj.common.pscript.setMaskToReferenceComponent('AA0020010', 'AA0020010form1', '_AA0020010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('AA0020010', 'AA0020010form1', '_AA0020010button2/update');
expj.common.pscript.setMaskToReferenceComponent('AA0020010', 'AA0020010form1', '_AA0020010button2/delete');
expj.common.pscript.setMaskToReferenceComponent('AA0020010', 'AA0020010form1', '_AA0020010button2/deleteAll');
};
expj.AA0020010.AA0020010form1.executeAllOnDecision = function () {
  console.log('execute AA0020010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0020010.AA0020010form1['onDecision' + i])) {
        expj.AA0020010.AA0020010form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0020010.AA0020010form1.executeOnLoad = function () {
  expj.AA0020010.AA0020010form1.executePScriptOnLoad();
};

expj.AA0020010.AA0020010form1.executePScriptOnLoad = function () {
  console.log('execute AA0020010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AA0020010.AA0020010form1['onLoad' + i])) {
      expj.AA0020010.AA0020010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0020010-AA0020010form1" action="AA0020010Servlet" name="AA0020010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAA0020010Control.getReadStatusString()) %>" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD_6",rb)%></span><!-- 対象品目番号 --></div><!--/td-->
<script class="expj-script-AA0020010-AA0020010form1-w_TARGET_ITEM_CD">
expj.AA0020010.AA0020010form1.w_TARGET_ITEM_CD = {};
expj.AA0020010.AA0020010form1.w_TARGET_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0020010form1/w_TARGET_ITEM_CD.onDecision');
  expj.AA0020010.AA0020010form1.executeAllOnDecision();
  expj.AA0020010.executeAllOnDecision();
};
expj.AA0020010.AA0020010form1.w_TARGET_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0020010-AA0020010form1-w_TARGET_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0020010', 'AA0020010form1', 'w_TARGET_ITEM_CD', this);
  });
  expj.AA0020010.AA0020010form1.w_TARGET_ITEM_CD.executePScriptOnLoad();
};

expj.AA0020010.AA0020010form1.w_TARGET_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0020010form1/w_TARGET_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0020010-AA0020010form1-w_TARGET_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0020010-AA0020010form1-w_TARGET_ITEM_CD" name="w_TARGET_ITEM_CD" class="AA0020010-focus-move  required-value expj-AA0020010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0020010Struct.getw_TARGET_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0020010-AA0020010form1-PeekerTargetItemCd">
expj.AA0020010.AA0020010form1.PeekerTargetItemCd = {};
// script1="onClick;0;PEEKER;_AA0020010form1/w_TARGET_ITEM_CD@<%=contextNo%>"
expj.AA0020010.AA0020010form1.PeekerTargetItemCd.onClick0 = function () {
  console.log('PeekerTargetItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0020010';
var parameterValues = 'PeekerTargetItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0020010', 'AA0020010form1', '_AA0020010form1/w_TARGET_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0020010form1/w_TARGET_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0020010.AA0020010form1.PeekerTargetItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0020010.AA0020010form1.PeekerTargetItemCd['onClick' + i])) {
        expj.AA0020010.AA0020010form1.PeekerTargetItemCd['onClick' + i]();
      }
    }
  }
};
expj.AA0020010.AA0020010form1.PeekerTargetItemCd.executeAllOnDecision = function () {
};
expj.AA0020010.AA0020010form1.PeekerTargetItemCd.executeOnLoad = function () {
  $('#expj-AA0020010-AA0020010form1-PeekerTargetItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0020010', 'AA0020010form1', 'PeekerTargetItemCd', this, 'Button');
    }
  });
  expj.AA0020010.AA0020010form1.PeekerTargetItemCd.executePScriptOnLoad();
};

expj.AA0020010.AA0020010form1.PeekerTargetItemCd.executePScriptOnLoad = function () {
  console.log('execute AA0020010form1/PeekerTargetItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0020010-AA0020010form1-PeekerTargetItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0020010-AA0020010form1-PeekerTargetItemCd" class="AA0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0017",rb)%></span><!-- 展開区分 --></div><!--/td-->
<script class="expj-script-AA0020010-AA0020010form1-s_DEVELOP_TYP">
expj.AA0020010.AA0020010form1.s_DEVELOP_TYP = {};
expj.AA0020010.AA0020010form1.s_DEVELOP_TYP.executeAllOnDecision = function () {
  console.log('execute AA0020010form1/s_DEVELOP_TYP.onDecision');
  expj.AA0020010.AA0020010form1.executeAllOnDecision();
  expj.AA0020010.executeAllOnDecision();
};
expj.AA0020010.AA0020010form1.s_DEVELOP_TYP.executeOnLoad = function () {
  $('#expj-AA0020010-AA0020010form1-s_DEVELOP_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0020010', 'AA0020010form1', 's_DEVELOP_TYP', this);
  });
  expj.AA0020010.AA0020010form1.s_DEVELOP_TYP.executePScriptOnLoad();
};

expj.AA0020010.AA0020010form1.s_DEVELOP_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0020010form1/s_DEVELOP_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0020010-AA0020010form1-s_DEVELOP_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0020010-AA0020010form1-s_DEVELOP_TYP" name='s_DEVELOP_TYP' class='AA0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0020010Control.getStruct().getList_s_DEVELOP_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0020010Control.getStruct().getList_s_DEVELOP_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0020010Control.getStruct().getList_s_DEVELOP_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0020010Struct.gets_DEVELOP_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE_3",rb)%></span><!-- 対象日付 --></div><!--/td-->
<script class="expj-script-AA0020010-AA0020010form1-w_TARGET_DATE">
expj.AA0020010.AA0020010form1.w_TARGET_DATE = {};
expj.AA0020010.AA0020010form1.w_TARGET_DATE.executeAllOnDecision = function () {
  console.log('execute AA0020010form1/w_TARGET_DATE.onDecision');
  expj.AA0020010.AA0020010form1.executeAllOnDecision();
  expj.AA0020010.executeAllOnDecision();
};
expj.AA0020010.AA0020010form1.w_TARGET_DATE.executeOnLoad = function () {
  $('#expj-AA0020010-AA0020010form1-w_TARGET_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0020010', 'AA0020010form1', 'w_TARGET_DATE', this);
  });
  expj.AA0020010.AA0020010form1.w_TARGET_DATE.executePScriptOnLoad();
};

expj.AA0020010.AA0020010form1.w_TARGET_DATE.executePScriptOnLoad = function () {
  console.log('execute AA0020010form1/w_TARGET_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AA0020010-AA0020010form1-w_TARGET_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0020010-AA0020010form1-w_TARGET_DATE" name="w_TARGET_DATE" class="AA0020010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAA0020010Struct.getw_TARGET_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AA0020010-AA0020010form1-CalendarTargetDate">
expj.AA0020010.AA0020010form1.CalendarTargetDate = {};
// script1="onClick;0;CALENDAR;_AA0020010form1/w_TARGET_DATE"
expj.AA0020010.AA0020010form1.CalendarTargetDate.onClick0 = function () {
  console.log('CalendarTargetDate script1');
expj.common.pscript.executeCalendar('AA0020010','AA0020010form1','_AA0020010form1/w_TARGET_DATE');
};
expj.AA0020010.AA0020010form1.CalendarTargetDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0020010.AA0020010form1.CalendarTargetDate['onClick' + i])) {
        expj.AA0020010.AA0020010form1.CalendarTargetDate['onClick' + i]();
      }
    }
  }
};
expj.AA0020010.AA0020010form1.CalendarTargetDate.executeAllOnDecision = function () {
};
expj.AA0020010.AA0020010form1.CalendarTargetDate.executeOnLoad = function () {
  $('#expj-AA0020010-AA0020010form1-CalendarTargetDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0020010', 'AA0020010form1', 'CalendarTargetDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AA0020010','AA0020010form1','_AA0020010form1/w_TARGET_DATE');
  expj.AA0020010.AA0020010form1.CalendarTargetDate.executePScriptOnLoad();
};

expj.AA0020010.AA0020010form1.CalendarTargetDate.executePScriptOnLoad = function () {
  console.log('execute AA0020010form1/CalendarTargetDate.onLoad');
  var targetComponent = document.getElementById('expj-AA0020010-AA0020010form1-CalendarTargetDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0020010-AA0020010form1-CalendarTargetDate" class="AA0020010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0018",rb)%></span><!-- 初期展開レベル --></div><!--/td-->
<script class="expj-script-AA0020010-AA0020010form1-w_LEVEL">
expj.AA0020010.AA0020010form1.w_LEVEL = {};
expj.AA0020010.AA0020010form1.w_LEVEL.executeAllOnDecision = function () {
  console.log('execute AA0020010form1/w_LEVEL.onDecision');
  expj.AA0020010.AA0020010form1.executeAllOnDecision();
  expj.AA0020010.executeAllOnDecision();
};
expj.AA0020010.AA0020010form1.w_LEVEL.executeOnLoad = function () {
  $('#expj-AA0020010-AA0020010form1-w_LEVEL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0020010', 'AA0020010form1', 'w_LEVEL', this);
  });
  expj.AA0020010.AA0020010form1.w_LEVEL.executePScriptOnLoad();
};

expj.AA0020010.AA0020010form1.w_LEVEL.executePScriptOnLoad = function () {
  console.log('execute AA0020010form1/w_LEVEL.onLoad');
  var targetComponent = document.getElementById('expj-AA0020010-AA0020010form1-w_LEVEL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0020010-AA0020010form1-w_LEVEL" name="w_LEVEL" class="AA0020010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;3" value="<%= TypeConverter.sanitizer(aAA0020010Struct.getw_LEVEL()) %>" maxlength="2147483647" ></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0020010-AA0020010button1">
expj.AA0020010.AA0020010button1 = {};
expj.AA0020010.AA0020010button1.executeAllOnDecision = function () {
  console.log('execute AA0020010button1.onDecision');
};
expj.AA0020010.AA0020010button1.executeOnLoad = function () {
  expj.AA0020010.AA0020010button1.executePScriptOnLoad();
};

expj.AA0020010.AA0020010button1.executePScriptOnLoad = function () {
  console.log('execute AA0020010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0020010-AA0020010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0020010-AA0020010button1-select">
expj.AA0020010.AA0020010button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0020010form1/*@AA0020010Servlet"
expj.AA0020010.AA0020010button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0020010', 'AA0020010button1', '_AA0020010form1/*', 'AA0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0020010', response);
expj.common.updateBusinessScreenTab('AA0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0020010.AA0020010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0020010.AA0020010button1.select['onClick' + i])) {
        expj.AA0020010.AA0020010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AA0020010.AA0020010button1.select.executeAllOnDecision = function () {
};
expj.AA0020010.AA0020010button1.select.executeOnLoad = function () {
  $('#expj-AA0020010-AA0020010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0020010', 'AA0020010button1', 'select', this, 'Button');
    }
  });
  expj.AA0020010.AA0020010button1.select.executePScriptOnLoad();
};

expj.AA0020010.AA0020010button1.select.executePScriptOnLoad = function () {
  console.log('execute AA0020010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AA0020010-AA0020010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0020010-AA0020010button1-select" name="select" class="AA0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AA0020010-AA0020010view1">
expj.AA0020010.AA0020010view1 = {};
expj.AA0020010.AA0020010view1.executeAllOnClick = function () {
};
expj.AA0020010.AA0020010view1.executeAllOnDecision = function () {
  console.log('execute AA0020010view1.onDecision');
};
expj.AA0020010.AA0020010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0020010view1", "expj.AA0020010.AA0020010view1.executeAllOnClick");
%>
  expj.AA0020010.AA0020010view1.executePScriptOnLoad();
};

expj.AA0020010.AA0020010view1.executePScriptOnLoad = function () {
  console.log('execute AA0020010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0020010-AA0020010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AA0020010view1_Id = "AA0020010view1";
 String AA0020010view1_select = "single";
 String AA0020010view1_sortable = "true";
 String AA0020010view1_resize = "true";
 String AA0020010view1_scroll = "true";
 StringBuffer AA0020010view1_HB = new StringBuffer();
 StringBuffer AA0020010view1_DB = new StringBuffer();
%>
<%
 AA0020010view1_select = "single";
 AA0020010view1_sortable = "false";
 AA0020010view1_resize = "true";
 AA0020010view1_scroll = "true";
%>
<%
 AA0020010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
%>
     
<%
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0019",rb))).append("', 'name':'NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'PARENT_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'PARENT_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.COMP_ITEM_CD_1",rb))).append("', 'name':'COMP_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME_1",rb))).append("', 'name':'COMP_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_EDITION",rb))).append("', 'name':'PS_EDITION', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_UNIT_NUMERATOR_2",rb))).append("', 'name':'PS_UNIT_NUMERATOR', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_UNIT_DENOMINATOR_2",rb))).append("', 'name':'PS_UNIT_DENOMINATOR', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_UNIT",rb))).append("', 'name':'STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE_1",rb))).append("', 'name':'EFF_PHASE_IN_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EFF_PHASE_OUT_DATE_1",rb))).append("', 'name':'EFF_PHASE_OUT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_SPOIL",rb))).append("', 'name':'PS_SPOIL', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CONS_TYP",rb))).append("', 'name':'s_CONS_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'s_CONS_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_LT_FLG",rb))).append("', 'name':'PS_LT_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'PS_LT_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_FIXED_LT",rb))).append("', 'name':'PS_FIXED_LT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_PROP_LT",rb))).append("', 'name':'PS_PROP_LT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_PROP_LOT_SIZE",rb))).append("', 'name':'PS_PROP_LOT_SIZE', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_REF_NO_1",rb))).append("', 'name':'PS_REF_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.COST_UP_TYP_2",rb))).append("', 'name':'COST_UP_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'s_COST_UP_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MRP_EXP_TYP_2",rb))).append("', 'name':'MRP_EXP_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'s_MRP_EXP_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MANHOUR_TYP_1",rb))).append("', 'name':'COMP_MANHOUR_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
AA0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'COMP_MANHOUR_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0020010view1_sortable).append("}").append(",");
%>
<%
 int aAA0020010StructLength = aAA0020010Control.getListsize();
 final AA0020010Struct structBackup = aAA0020010Struct;
 aAA0020010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0020010StructLength; ++loopCount) {
  if((aAA0020010Struct = (AA0020010Struct) aAA0020010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0020010Struct", aAA0020010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AA0020010view1_DB.append("[");
 AA0020010view1_DB.append(loopCount);
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-MODIFY_COUNT\" data-name=\"MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0020010Struct.getMODIFY_COUNT())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-NO-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-NO\" data-name=\"NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0020010Struct.getNO())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-PARENT_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-PARENT_ITEM_CD\" data-name=\"PARENT_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0020010Struct.getPARENT_ITEM_CD())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-PARENT_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-PARENT_ITEM_NAME\" data-name=\"PARENT_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0020010Struct.getPARENT_ITEM_NAME())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-COMP_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-COMP_ITEM_CD\" data-name=\"COMP_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0020010Struct.getCOMP_ITEM_CD())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-COMP_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-COMP_ITEM_NAME\" data-name=\"COMP_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0020010Struct.getCOMP_ITEM_NAME())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-PS_EDITION-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-PS_EDITION\" data-name=\"PS_EDITION\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0020010Struct.getPS_EDITION())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-PS_UNIT_NUMERATOR-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-PS_UNIT_NUMERATOR\" data-name=\"PS_UNIT_NUMERATOR\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0020010Struct.getPS_UNIT_NUMERATOR())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-PS_UNIT_DENOMINATOR-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-PS_UNIT_DENOMINATOR\" data-name=\"PS_UNIT_DENOMINATOR\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0020010Struct.getPS_UNIT_DENOMINATOR())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-STOCK_UNIT\" data-name=\"STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0020010Struct.getSTOCK_UNIT())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-EFF_PHASE_IN_DATE-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-EFF_PHASE_IN_DATE\" data-name=\"EFF_PHASE_IN_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAA0020010Struct.getEFF_PHASE_IN_DATE())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-EFF_PHASE_OUT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-EFF_PHASE_OUT_DATE\" data-name=\"EFF_PHASE_OUT_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAA0020010Struct.getEFF_PHASE_OUT_DATE())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-PS_SPOIL-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-PS_SPOIL\" data-name=\"PS_SPOIL\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0020010Struct.getPS_SPOIL())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-s_CONS_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-s_CONS_NAME\" data-name=\"s_CONS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0020010Struct.gets_CONS_NAME())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-s_CONS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-s_CONS_TYP\" data-name=\"s_CONS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0020010Struct.gets_CONS_TYP())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-PS_LT_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-PS_LT_NAME\" data-name=\"PS_LT_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0020010Struct.getPS_LT_NAME())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-PS_LT_FLG-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-PS_LT_FLG\" data-name=\"PS_LT_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0020010Struct.getPS_LT_FLG())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-PS_FIXED_LT-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-PS_FIXED_LT\" data-name=\"PS_FIXED_LT\" data-view=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0020010Struct.getPS_FIXED_LT())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-PS_PROP_LT-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-PS_PROP_LT\" data-name=\"PS_PROP_LT\" data-view=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0020010Struct.getPS_PROP_LT())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-PS_PROP_LOT_SIZE-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-PS_PROP_LOT_SIZE\" data-name=\"PS_PROP_LOT_SIZE\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0020010Struct.getPS_PROP_LOT_SIZE())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-PS_REF_NO-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-PS_REF_NO\" data-name=\"PS_REF_NO\" data-view=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0020010Struct.getPS_REF_NO())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-COST_UP_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-COST_UP_NAME\" data-name=\"COST_UP_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0020010Struct.getCOST_UP_NAME())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-s_COST_UP_TYP-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-s_COST_UP_TYP\" data-name=\"s_COST_UP_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0020010Struct.gets_COST_UP_TYP())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-MRP_EXP_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-MRP_EXP_NAME\" data-name=\"MRP_EXP_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0020010Struct.getMRP_EXP_NAME())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-s_MRP_EXP_TYP-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-s_MRP_EXP_TYP\" data-name=\"s_MRP_EXP_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0020010Struct.gets_MRP_EXP_TYP())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-COMP_MANHOUR_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-COMP_MANHOUR_NAME\" data-name=\"COMP_MANHOUR_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0020010Struct.getCOMP_MANHOUR_NAME())).append("</span>'");
 AA0020010view1_DB.append(",").append("'<span id=\"expj-AA0020010-AA0020010view1-COMP_MANHOUR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AA0020010-AA0020010view1-COMP_MANHOUR_TYP\" data-name=\"COMP_MANHOUR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0020010Struct.getCOMP_MANHOUR_TYP())).append("</span>'");
 AA0020010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAA0020010StructLength) {
   AA0020010view1_DB.append(",");
  }
 }
 aAA0020010Struct = structBackup;
 viewIdList.add(AA0020010view1_Id);
 viewSelectList.add(AA0020010view1_select);
 viewResizeList.add(AA0020010view1_resize);
 viewScrollList.add(AA0020010view1_scroll);
 viewHeaderDataList.add(AA0020010view1_HB);
 viewBodyDataList.add(AA0020010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:420px;"><script class="expj-script-AA0020010-AA0020010button2">
expj.AA0020010.AA0020010button2 = {};
expj.AA0020010.AA0020010button2.executeAllOnDecision = function () {
  console.log('execute AA0020010button2.onDecision');
};
expj.AA0020010.AA0020010button2.executeOnLoad = function () {
  expj.AA0020010.AA0020010button2.executePScriptOnLoad();
};

expj.AA0020010.AA0020010button2.executePScriptOnLoad = function () {
  console.log('execute AA0020010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0020010-AA0020010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0020010-AA0020010button2-insert">
expj.AA0020010.AA0020010button2.insert = {};
// script1="onClick;0;CHK;_AA0020010form1/s_DEVELOP_TYP[eq]1[and]_AA0020010view1/COMP_MANHOUR_TYP[eq]1@!AA00178"
expj.AA0020010.AA0020010button2.insert.onClick0 = function () {
  console.log('insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0020010', 'AA0020010button2', '_AA0020010form1/s_DEVELOP_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0020010', 'AA0020010button2', '_AA0020010view1/COMP_MANHOUR_TYP'), '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('AA0020010', 'AA0020010button2', 'AA00178');
}
};
// script2="onClick;1;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0020010form1/*,_AA0020010view1/+@AA0020010Servlet"
expj.AA0020010.AA0020010button2.insert.onClick1 = function () {
  console.log('insert script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0020010', 'AA0020010button2', '_AA0020010form1/*,_AA0020010view1/+', 'AA0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0020010', response);
expj.common.changeBusinessScreenTab('AA0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0020010.AA0020010button2.insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0020010.AA0020010button2.insert['onClick' + i])) {
        expj.AA0020010.AA0020010button2.insert['onClick' + i]();
      }
    }
  }
};
expj.AA0020010.AA0020010button2.insert.executeAllOnDecision = function () {
};
expj.AA0020010.AA0020010button2.insert.executeOnLoad = function () {
  $('#expj-AA0020010-AA0020010button2-insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0020010', 'AA0020010button2', 'insert', this, 'Button');
    }
  });
  expj.AA0020010.AA0020010button2.insert.executePScriptOnLoad();
};

expj.AA0020010.AA0020010button2.insert.executePScriptOnLoad = function () {
  console.log('execute AA0020010button2/insert.onLoad');
  var targetComponent = document.getElementById('expj-AA0020010-AA0020010button2-insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0020010-AA0020010button2-insert" name="insert" class="AA0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsert",rb)%></button><!-- 行追加ボタン --></div><!--/td-->
<script class="expj-script-AA0020010-AA0020010button2-update">
expj.AA0020010.AA0020010button2.update = {};
// script1="onClick;0;CHK;_AA0020010view1/NO[eq]1@!AA00139"
expj.AA0020010.AA0020010button2.update.onClick0 = function () {
  console.log('update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0020010', 'AA0020010button2', '_AA0020010view1/NO'), '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('AA0020010', 'AA0020010button2', 'AA00139');
}
};
// script2="onClick;1;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0020010form1/*,_AA0020010view1/+@AA0020010Servlet"
expj.AA0020010.AA0020010button2.update.onClick1 = function () {
  console.log('update script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0020010', 'AA0020010button2', '_AA0020010form1/*,_AA0020010view1/+', 'AA0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0020010', response);
expj.common.changeBusinessScreenTab('AA0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0020010.AA0020010button2.update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0020010.AA0020010button2.update['onClick' + i])) {
        expj.AA0020010.AA0020010button2.update['onClick' + i]();
      }
    }
  }
};
expj.AA0020010.AA0020010button2.update.executeAllOnDecision = function () {
};
expj.AA0020010.AA0020010button2.update.executeOnLoad = function () {
  $('#expj-AA0020010-AA0020010button2-update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0020010', 'AA0020010button2', 'update', this, 'Button');
    }
  });
  expj.AA0020010.AA0020010button2.update.executePScriptOnLoad();
};

expj.AA0020010.AA0020010button2.update.executePScriptOnLoad = function () {
  console.log('execute AA0020010button2/update.onLoad');
  var targetComponent = document.getElementById('expj-AA0020010-AA0020010button2-update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0020010-AA0020010button2-update" name="update" class="AA0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
<script class="expj-script-AA0020010-AA0020010button2-delete">
expj.AA0020010.AA0020010button2.delete = {};
// script1="onClick;0;CHK;_AA0020010view1/NO[eq]1@!AA00139"
expj.AA0020010.AA0020010button2.delete.onClick0 = function () {
  console.log('delete script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0020010', 'AA0020010button2', '_AA0020010view1/NO'), '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('AA0020010', 'AA0020010button2', 'AA00139');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0020010form1/*,_AA0020010view1/+@AA0020010Servlet,,$ZZ07004"
expj.AA0020010.AA0020010button2.delete.onClick1 = function () {
  console.log('delete script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0020010', 'AA0020010button2', '_AA0020010form1/*,_AA0020010view1/+', 'AA0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0020010', response);
expj.common.updateBusinessScreenTab('AA0020010', contents);
};
expj.common.pscript.callConfirm('AA0020010', 'AA0020010button2', 'ZZ07004', okEvent);
};
expj.AA0020010.AA0020010button2.delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0020010.AA0020010button2.delete['onClick' + i])) {
        expj.AA0020010.AA0020010button2.delete['onClick' + i]();
      }
    }
  }
};
expj.AA0020010.AA0020010button2.delete.executeAllOnDecision = function () {
};
expj.AA0020010.AA0020010button2.delete.executeOnLoad = function () {
  $('#expj-AA0020010-AA0020010button2-delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0020010', 'AA0020010button2', 'delete', this, 'Button');
    }
  });
  expj.AA0020010.AA0020010button2.delete.executePScriptOnLoad();
};

expj.AA0020010.AA0020010button2.delete.executePScriptOnLoad = function () {
  console.log('execute AA0020010button2/delete.onLoad');
  var targetComponent = document.getElementById('expj-AA0020010-AA0020010button2-delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0020010-AA0020010button2-delete" name="delete" class="AA0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineDelete",rb)%></button><!-- 行削除ボタン --></div><!--/td-->
<script class="expj-script-AA0020010-AA0020010button2-deleteAll">
expj.AA0020010.AA0020010button2.deleteAll = {};
// script1="onClick;0;CHK;_AA0020010view1/NO[eq]1@!AA00139"
expj.AA0020010.AA0020010button2.deleteAll.onClick0 = function () {
  console.log('deleteAll script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0020010', 'AA0020010button2', '_AA0020010view1/NO'), '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('AA0020010', 'AA0020010button2', 'AA00139');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0020010form1/*,_AA0020010view1/+@AA0020010Servlet,,$ZZ07004"
expj.AA0020010.AA0020010button2.deleteAll.onClick1 = function () {
  console.log('deleteAll script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0020010', 'AA0020010button2', '_AA0020010form1/*,_AA0020010view1/+', 'AA0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0020010', response);
expj.common.updateBusinessScreenTab('AA0020010', contents);
};
expj.common.pscript.callConfirm('AA0020010', 'AA0020010button2', 'ZZ07004', okEvent);
};
expj.AA0020010.AA0020010button2.deleteAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0020010.AA0020010button2.deleteAll['onClick' + i])) {
        expj.AA0020010.AA0020010button2.deleteAll['onClick' + i]();
      }
    }
  }
};
expj.AA0020010.AA0020010button2.deleteAll.executeAllOnDecision = function () {
};
expj.AA0020010.AA0020010button2.deleteAll.executeOnLoad = function () {
  $('#expj-AA0020010-AA0020010button2-deleteAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0020010', 'AA0020010button2', 'deleteAll', this, 'Button');
    }
  });
  expj.AA0020010.AA0020010button2.deleteAll.executePScriptOnLoad();
};

expj.AA0020010.AA0020010button2.deleteAll.executePScriptOnLoad = function () {
  console.log('execute AA0020010button2/deleteAll.onLoad');
  var targetComponent = document.getElementById('expj-AA0020010-AA0020010button2-deleteAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0020010-AA0020010button2-deleteAll" name="deleteAll" class="AA0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDeleteAll_1",rb)%></button><!-- 一括削除ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AA0020010 Revision: 1.7  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AA0020010-AA0020010button0">
expj.AA0020010.AA0020010button0 = {};
expj.AA0020010.AA0020010button0.executeAllOnDecision = function () {
  console.log('execute AA0020010button0.onDecision');
};
expj.AA0020010.AA0020010button0.executeOnLoad = function () {
  expj.AA0020010.AA0020010button0.executePScriptOnLoad();
};

expj.AA0020010.AA0020010button0.executePScriptOnLoad = function () {
  console.log('execute AA0020010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0020010-AA0020010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0020010-AA0020010button0-clear">
expj.AA0020010.AA0020010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AA0020010Servlet,,$ZZ07008"
expj.AA0020010.AA0020010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0020010', 'AA0020010button0', '', 'AA0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0020010', response);
expj.common.updateBusinessScreenTab('AA0020010', contents);
};
expj.common.pscript.callConfirm('AA0020010', 'AA0020010button0', 'ZZ07008', okEvent);
};
expj.AA0020010.AA0020010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0020010.AA0020010button0.clear['onClick' + i])) {
        expj.AA0020010.AA0020010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AA0020010.AA0020010button0.clear.executeAllOnDecision = function () {
};
expj.AA0020010.AA0020010button0.clear.executeOnLoad = function () {
  $('#expj-AA0020010-AA0020010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0020010', 'AA0020010button0', 'clear', this, 'Button');
    }
  });
  expj.AA0020010.AA0020010button0.clear.executePScriptOnLoad();
};

expj.AA0020010.AA0020010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AA0020010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AA0020010-AA0020010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0020010-AA0020010button0-clear" name="clear" class="AA0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AA0020010-AA0020010button0-Close">
expj.AA0020010.AA0020010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AA0020010.AA0020010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AA0020010');
};
expj.AA0020010.AA0020010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0020010.AA0020010button0.Close['onClick' + i])) {
        expj.AA0020010.AA0020010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AA0020010.AA0020010button0.Close.executeAllOnDecision = function () {
};
expj.AA0020010.AA0020010button0.Close.executeOnLoad = function () {
  $('#expj-AA0020010-AA0020010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0020010', 'AA0020010button0', 'Close', this, 'Button');
    }
  });
  expj.AA0020010.AA0020010button0.Close.executePScriptOnLoad();
};

expj.AA0020010.AA0020010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AA0020010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AA0020010-AA0020010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0020010-AA0020010button0-Close" name="Close" class="AA0020010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0020010 (END)-->
<%
MessageStruct msgStruct = aAA0020010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0020010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0020010)) {
  expj.common.treeInstanceMap.AA0020010 = {};
}
expj.common.treeInstanceMap.AA0020010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0020010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0020010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0020010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0020010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0020010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0020010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0020010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0020010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0020010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0020010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0020010)) {
  expj.common.detailDialogMap.AA0020010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0020010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0020010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0020010.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0020010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0020010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0020010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0020010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0020010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0020010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0020010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0020010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0020010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0020010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0020010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0020010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0020010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0020010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0020010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0020010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0020010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0020010)) {
  expj.common.viewInstanceMap.AA0020010 = {};
}
expj.common.viewInstanceMap.AA0020010.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0020010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0020010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0020010.<%=viewId %>.init = function () {
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
    expj.AA0020010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0020010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0020010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0020010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0020010_init">
/**
 * AA0020010用のロード完了時初期化関数
 */
expj.AA0020010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0020010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0020010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0020010');
  expj.common.calendarInstanceMap.AA0020010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0020010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0020010.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0020010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0020010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0020010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0020010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0020010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0020010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0020010-<%=detailId %>');
<%
 }
%>
  try{expj.AA0020010.AA0020010form1.w_TARGET_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0020010.AA0020010form1.PeekerTargetItemCd.executeOnLoad();}catch(e){};
  try{expj.AA0020010.AA0020010form1.s_DEVELOP_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0020010.AA0020010form1.w_TARGET_DATE.executeOnLoad();}catch(e){};
  try{expj.AA0020010.AA0020010form1.CalendarTargetDate.executeOnLoad();}catch(e){};
  try{expj.AA0020010.AA0020010form1.w_LEVEL.executeOnLoad();}catch(e){};
  try{expj.AA0020010.AA0020010button1.select.executeOnLoad();}catch(e){};
  try{expj.AA0020010.AA0020010button2.insert.executeOnLoad();}catch(e){};
  try{expj.AA0020010.AA0020010button2.update.executeOnLoad();}catch(e){};
  try{expj.AA0020010.AA0020010button2.delete.executeOnLoad();}catch(e){};
  try{expj.AA0020010.AA0020010button2.deleteAll.executeOnLoad();}catch(e){};
  try{expj.AA0020010.AA0020010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AA0020010.AA0020010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AA0020010.AA0020010form1.executeOnLoad();}catch(e){};
  try{expj.AA0020010.AA0020010button1.executeOnLoad();}catch(e){};
  try{expj.AA0020010.AA0020010view1.executeOnLoad();}catch(e){};
  try{expj.AA0020010.AA0020010button2.executeOnLoad();}catch(e){};
  try{expj.AA0020010.AA0020010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0020010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0020010', 'AA0020010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0020010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0020010-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0020010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0020010', '<%=request.getContextPath() %>');
};

/**
 * AA0020010の全体onDecision処理
 */
expj.AA0020010.executeAllOnDecision = function () {
  expj.AA0020010.AA0020010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0020010_console">
expj.AA0020010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>