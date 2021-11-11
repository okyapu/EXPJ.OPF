<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:23:56 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0130\AA0130011.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0130.*" %>
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
<jsp:useBean id="aAA0130010Control" class="com.nec.jp.orteus.metamorBase.AA0130.AA0130010Control" scope="request"/>
<jsp:useBean id="aAA0130010Struct" class="com.nec.jp.orteus.metamorBase.AA0130.AA0130010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

製品構成ツリーメンテナンスサブ１
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0130/jsp/AA0130011.jsp,v $
$Author: geng-jia $    
$Revision: 1.15 $ $Date: 2017/02/22 02:04:02 $
********************************************************* --%>
<html>
<head>
<title>製品構成ツリーメンテナンスサブ１</title>
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
<script class="expj-script-AA0130010_init">
  // AA0130010名前空間
  expj.AA0130010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

<% String CallButton = aAA0130010Control.getButton(); %>
  <div id="expj-business-screen-AA0130010" data-screen="AA0130011" data-newdata="<%=aAA0130010Control.isNewData() %>">
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
              <script class="expj-script-AA0130010-AA0130011form1">
expj.AA0130010.AA0130011form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AA0130010.AA0130011form1.onLoad0 = function () {
  console.log('AA0130011form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;A,B@*0,*2"
expj.AA0130010.AA0130011form1.onDecision0 = function () {
  console.log('AA0130011form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AA0130010', 'A') && expj.common.pscript.satisfiedRequiredComponent('AA0130010', 'B')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;0;CHK;<%=CallButton%>[eq]LineInsert[or]<%=CallButton%>[eq]Sub1Insert@*1,*2"
expj.AA0130010.AA0130011form1.child0 = function () {
  console.log('AA0130011form1 script3');
if (expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'LineInsert') || expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'Sub1Insert')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="child;1;UNMASK;_AA0130011button1/Sub1Insert"
expj.AA0130010.AA0130011form1.child1 = function () {
  console.log('AA0130011form1 script4');
expj.common.pscript.setUnMaskToReferenceComponent('AA0130010', 'AA0130011form1', '_AA0130011button1/Sub1Insert');
};
// script5="child;2;MASK;_AA0130011button1/Sub1Insert"
expj.AA0130010.AA0130011form1.child2 = function () {
  console.log('AA0130011form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AA0130010', 'AA0130011form1', '_AA0130011button1/Sub1Insert');
};
// script6="onDecision;1;CHKRQ;A,B@*3,*6"
expj.AA0130010.AA0130011form1.onDecision1 = function () {
  console.log('AA0130011form1 script6');
if (expj.common.pscript.satisfiedRequiredComponent('AA0130010', 'A') && expj.common.pscript.satisfiedRequiredComponent('AA0130010', 'B')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script7="child;3;CHK;<%=CallButton%>[eq]LineUpdate[or]<%=CallButton%>[eq]Sub1Update@*4,*6"
expj.AA0130010.AA0130011form1.child3 = function () {
  console.log('AA0130011form1 script7');
if (expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'LineUpdate') || expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'Sub1Update')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script8="child;4;CHK;?AA0130011form1/*[eq]NORMAL@*5,*6"
expj.AA0130010.AA0130011form1.child4 = function () {
  console.log('AA0130011form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0130010', 'AA0130011form1', '?AA0130011form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script9="child;5;UNMASK;_AA0130011button1/Sub1Update"
expj.AA0130010.AA0130011form1.child5 = function () {
  console.log('AA0130011form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('AA0130010', 'AA0130011form1', '_AA0130011button1/Sub1Update');
};
// script10="child;6;MASK;_AA0130011button1/Sub1Update"
expj.AA0130010.AA0130011form1.child6 = function () {
  console.log('AA0130011form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AA0130010', 'AA0130011form1', '_AA0130011button1/Sub1Update');
};
expj.AA0130010.AA0130011form1.executeAllOnDecision = function () {
  console.log('execute AA0130011form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0130010.AA0130011form1['onDecision' + i])) {
        expj.AA0130010.AA0130011form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0130010.AA0130011form1.executeOnLoad = function () {
  expj.AA0130010.AA0130011form1.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0130010.AA0130011form1['onLoad' + i])) {
      expj.AA0130010.AA0130011form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0130010-AA0130011form1" action="AA0130010Servlet" name="AA0130011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAA0130010Control.getReadStatusString()) %>" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:20px;align:left"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AA0130010-AA0130011form1-Sub1Parent_ITEM_CD">
expj.AA0130010.AA0130011form1.Sub1Parent_ITEM_CD = {};
expj.AA0130010.AA0130011form1.Sub1Parent_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/Sub1Parent_ITEM_CD.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.Sub1Parent_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-Sub1Parent_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'Sub1Parent_ITEM_CD', this);
  });
  expj.AA0130010.AA0130011form1.Sub1Parent_ITEM_CD.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.Sub1Parent_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/Sub1Parent_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-Sub1Parent_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0130010-AA0130011form1-Sub1Parent_ITEM_CD" name="Sub1Parent_ITEM_CD" class="AA0130010-focus-move  required-value expj-AA0130010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0130010Struct.getSub1Parent_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AA0130010-AA0130011form1-h_Sub1Parent_ITEM_CD" name="h_Sub1Parent_ITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0130010Struct.geth_Sub1Parent_ITEM_CD()) %>">
<script class="expj-script-AA0130010-AA0130011form1-h_Sub1Parent_ITEM_CD">
expj.AA0130010.AA0130011form1.h_Sub1Parent_ITEM_CD = {};
// script1="onLoad;0;CALL;child@0"
expj.AA0130010.AA0130011form1.h_Sub1Parent_ITEM_CD.onLoad0 = function () {
  console.log('h_Sub1Parent_ITEM_CD script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;CHK;_THIS[eq]@*1,*2"
expj.AA0130010.AA0130011form1.h_Sub1Parent_ITEM_CD.child0 = function () {
  console.log('h_Sub1Parent_ITEM_CD script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0130010', 'AA0130011form1', '_THIS'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;UNMASK;_Sub1Parent_ITEM_CD,_PeekerSub1ParentItemCd"
expj.AA0130010.AA0130011form1.h_Sub1Parent_ITEM_CD.child1 = function () {
  console.log('h_Sub1Parent_ITEM_CD script3');
expj.common.pscript.setUnMaskToReferenceComponent('AA0130010', 'AA0130011form1', '_Sub1Parent_ITEM_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AA0130010', 'AA0130011form1', '_PeekerSub1ParentItemCd');
};
// script4="child;2;MASK;_Sub1Parent_ITEM_CD,_PeekerSub1ParentItemCd"
expj.AA0130010.AA0130011form1.h_Sub1Parent_ITEM_CD.child2 = function () {
  console.log('h_Sub1Parent_ITEM_CD script4');
expj.common.pscript.setMaskToReferenceComponent('AA0130010', 'AA0130011form1', '_Sub1Parent_ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('AA0130010', 'AA0130011form1', '_PeekerSub1ParentItemCd');
};
expj.AA0130010.AA0130011form1.h_Sub1Parent_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/h_Sub1Parent_ITEM_CD.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.h_Sub1Parent_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-h_Sub1Parent_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'h_Sub1Parent_ITEM_CD', this);
  });
  expj.AA0130010.AA0130011form1.h_Sub1Parent_ITEM_CD.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.h_Sub1Parent_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/h_Sub1Parent_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-h_Sub1Parent_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0130010.AA0130011form1.h_Sub1Parent_ITEM_CD['onLoad' + i])) {
      expj.AA0130010.AA0130011form1.h_Sub1Parent_ITEM_CD['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AA0130010-AA0130011form1-PeekerSub1ParentItemCd">
expj.AA0130010.AA0130011form1.PeekerSub1ParentItemCd = {};
// script1="onClick;0;PEEKER;_AA0130011form1/Sub1Parent_ITEM_CD@<%=contextNo%>"
expj.AA0130010.AA0130011form1.PeekerSub1ParentItemCd.onClick0 = function () {
  console.log('PeekerSub1ParentItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0130010';
var parameterValues = 'PeekerSub1ParentItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0130010', 'AA0130011form1', '_Sub1Parent_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0130011form1/Sub1Parent_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0130010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0130010.AA0130011form1.PeekerSub1ParentItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0130010.AA0130011form1.PeekerSub1ParentItemCd['onClick' + i])) {
        expj.AA0130010.AA0130011form1.PeekerSub1ParentItemCd['onClick' + i]();
      }
    }
  }
};
expj.AA0130010.AA0130011form1.PeekerSub1ParentItemCd.executeAllOnDecision = function () {
};
expj.AA0130010.AA0130011form1.PeekerSub1ParentItemCd.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-PeekerSub1ParentItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0130010', 'AA0130011form1', 'PeekerSub1ParentItemCd', this, 'Button');
    }
  });
  expj.AA0130010.AA0130011form1.PeekerSub1ParentItemCd.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.PeekerSub1ParentItemCd.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/PeekerSub1ParentItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-PeekerSub1ParentItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0130010-AA0130011form1-PeekerSub1ParentItemCd" class="AA0130010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0130010-AA0130011form1-Sub1Parent_ITEM_NAME">
expj.AA0130010.AA0130011form1.Sub1Parent_ITEM_NAME = {};
expj.AA0130010.AA0130011form1.Sub1Parent_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/Sub1Parent_ITEM_NAME.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.Sub1Parent_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-Sub1Parent_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'Sub1Parent_ITEM_NAME', this);
  });
  expj.AA0130010.AA0130011form1.Sub1Parent_ITEM_NAME.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.Sub1Parent_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/Sub1Parent_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-Sub1Parent_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0130010-AA0130011form1-Sub1Parent_ITEM_NAME" name="Sub1Parent_ITEM_NAME" class="AA0130010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0130010Struct.getSub1Parent_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD_1",rb)%></span><!-- 構成品目番号 --></div><!--/td-->
<script class="expj-script-AA0130010-AA0130011form1-Sub1Comp_ITEM_CD">
expj.AA0130010.AA0130011form1.Sub1Comp_ITEM_CD = {};
expj.AA0130010.AA0130011form1.Sub1Comp_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/Sub1Comp_ITEM_CD.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.Sub1Comp_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-Sub1Comp_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'Sub1Comp_ITEM_CD', this);
  });
  expj.AA0130010.AA0130011form1.Sub1Comp_ITEM_CD.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.Sub1Comp_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/Sub1Comp_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-Sub1Comp_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0130010-AA0130011form1-Sub1Comp_ITEM_CD" name="Sub1Comp_ITEM_CD" class="AA0130010-focus-move  required-value expj-AA0130010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0130010Struct.getSub1Comp_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AA0130010-AA0130011form1-h_Sub1Comp_ITEM_CD" name="h_Sub1Comp_ITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0130010Struct.geth_Sub1Comp_ITEM_CD()) %>">
<script class="expj-script-AA0130010-AA0130011form1-h_Sub1Comp_ITEM_CD">
expj.AA0130010.AA0130011form1.h_Sub1Comp_ITEM_CD = {};
// script1="onLoad;0;CALL;child@0"
expj.AA0130010.AA0130011form1.h_Sub1Comp_ITEM_CD.onLoad0 = function () {
  console.log('h_Sub1Comp_ITEM_CD script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;CHK;_THIS[eq]@*1,*2"
expj.AA0130010.AA0130011form1.h_Sub1Comp_ITEM_CD.child0 = function () {
  console.log('h_Sub1Comp_ITEM_CD script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0130010', 'AA0130011form1', '_THIS'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;UNMASK;_Sub1Comp_ITEM_CD,_PeekerSub1CompItemCd"
expj.AA0130010.AA0130011form1.h_Sub1Comp_ITEM_CD.child1 = function () {
  console.log('h_Sub1Comp_ITEM_CD script3');
expj.common.pscript.setUnMaskToReferenceComponent('AA0130010', 'AA0130011form1', '_Sub1Comp_ITEM_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AA0130010', 'AA0130011form1', '_PeekerSub1CompItemCd');
};
// script4="child;2;MASK;_Sub1Comp_ITEM_CD,_PeekerSub1CompItemCd"
expj.AA0130010.AA0130011form1.h_Sub1Comp_ITEM_CD.child2 = function () {
  console.log('h_Sub1Comp_ITEM_CD script4');
expj.common.pscript.setMaskToReferenceComponent('AA0130010', 'AA0130011form1', '_Sub1Comp_ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('AA0130010', 'AA0130011form1', '_PeekerSub1CompItemCd');
};
expj.AA0130010.AA0130011form1.h_Sub1Comp_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/h_Sub1Comp_ITEM_CD.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.h_Sub1Comp_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-h_Sub1Comp_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'h_Sub1Comp_ITEM_CD', this);
  });
  expj.AA0130010.AA0130011form1.h_Sub1Comp_ITEM_CD.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.h_Sub1Comp_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/h_Sub1Comp_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-h_Sub1Comp_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0130010.AA0130011form1.h_Sub1Comp_ITEM_CD['onLoad' + i])) {
      expj.AA0130010.AA0130011form1.h_Sub1Comp_ITEM_CD['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AA0130010-AA0130011form1-PeekerSub1CompItemCd">
expj.AA0130010.AA0130011form1.PeekerSub1CompItemCd = {};
// script1="onClick;0;PEEKER;_AA0130011form1/Sub1Comp_ITEM_CD@<%=contextNo%>"
expj.AA0130010.AA0130011form1.PeekerSub1CompItemCd.onClick0 = function () {
  console.log('PeekerSub1CompItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0130010';
var parameterValues = 'PeekerSub1CompItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0130010', 'AA0130011form1', '_Sub1Comp_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0130011form1/Sub1Comp_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0130010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0130010.AA0130011form1.PeekerSub1CompItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0130010.AA0130011form1.PeekerSub1CompItemCd['onClick' + i])) {
        expj.AA0130010.AA0130011form1.PeekerSub1CompItemCd['onClick' + i]();
      }
    }
  }
};
expj.AA0130010.AA0130011form1.PeekerSub1CompItemCd.executeAllOnDecision = function () {
};
expj.AA0130010.AA0130011form1.PeekerSub1CompItemCd.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-PeekerSub1CompItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0130010', 'AA0130011form1', 'PeekerSub1CompItemCd', this, 'Button');
    }
  });
  expj.AA0130010.AA0130011form1.PeekerSub1CompItemCd.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.PeekerSub1CompItemCd.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/PeekerSub1CompItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-PeekerSub1CompItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0130010-AA0130011form1-PeekerSub1CompItemCd" class="AA0130010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0130010-AA0130011form1-Sub1Comp_ITEM_NAME">
expj.AA0130010.AA0130011form1.Sub1Comp_ITEM_NAME = {};
expj.AA0130010.AA0130011form1.Sub1Comp_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/Sub1Comp_ITEM_NAME.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.Sub1Comp_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-Sub1Comp_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'Sub1Comp_ITEM_NAME', this);
  });
  expj.AA0130010.AA0130011form1.Sub1Comp_ITEM_NAME.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.Sub1Comp_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/Sub1Comp_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-Sub1Comp_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0130010-AA0130011form1-Sub1Comp_ITEM_NAME" name="Sub1Comp_ITEM_NAME" class="AA0130010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0130010Struct.getSub1Comp_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AA0130010-AA0130011form1-h_TargetDate" name="h_TargetDate" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0130010Struct.geth_TargetDate()) %>">
<script class="expj-script-AA0130010-AA0130011form1-h_TargetDate">
expj.AA0130010.AA0130011form1.h_TargetDate = {};
expj.AA0130010.AA0130011form1.h_TargetDate.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/h_TargetDate.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.h_TargetDate.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-h_TargetDate').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'h_TargetDate', this);
  });
  expj.AA0130010.AA0130011form1.h_TargetDate.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.h_TargetDate.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/h_TargetDate.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-h_TargetDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0130010-AA0130011form1-h_DEVELOP_TYP" name="h_DEVELOP_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0130010Struct.geth_DEVELOP_TYP()) %>">
<script class="expj-script-AA0130010-AA0130011form1-h_DEVELOP_TYP">
expj.AA0130010.AA0130011form1.h_DEVELOP_TYP = {};
expj.AA0130010.AA0130011form1.h_DEVELOP_TYP.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/h_DEVELOP_TYP.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.h_DEVELOP_TYP.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-h_DEVELOP_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'h_DEVELOP_TYP', this);
  });
  expj.AA0130010.AA0130011form1.h_DEVELOP_TYP.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.h_DEVELOP_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/h_DEVELOP_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-h_DEVELOP_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PS_EDITION",rb)%></span><!-- 製品構成版数 --></div><!--/td-->
<script class="expj-script-AA0130010-AA0130011form1-Sub1_PS_EDITION">
expj.AA0130010.AA0130011form1.Sub1_PS_EDITION = {};
expj.AA0130010.AA0130011form1.Sub1_PS_EDITION.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/Sub1_PS_EDITION.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.Sub1_PS_EDITION.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-Sub1_PS_EDITION').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'Sub1_PS_EDITION', this);
  });
  expj.AA0130010.AA0130011form1.Sub1_PS_EDITION.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.Sub1_PS_EDITION.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/Sub1_PS_EDITION.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-Sub1_PS_EDITION');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0130010-AA0130011form1-Sub1_PS_EDITION" name="Sub1_PS_EDITION" class="AA0130010-focus-move  required-value expj-AA0130010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0130010Struct.getSub1_PS_EDITION()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AA0130010-AA0130011form1-h_Sub1_PS_EDITION" name="h_Sub1_PS_EDITION" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0130010Struct.geth_Sub1_PS_EDITION()) %>">
<script class="expj-script-AA0130010-AA0130011form1-h_Sub1_PS_EDITION">
expj.AA0130010.AA0130011form1.h_Sub1_PS_EDITION = {};
// script1="onLoad;0;CALL;child@0"
expj.AA0130010.AA0130011form1.h_Sub1_PS_EDITION.onLoad0 = function () {
  console.log('h_Sub1_PS_EDITION script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;CHK;_THIS[eq]@*1,*2"
expj.AA0130010.AA0130011form1.h_Sub1_PS_EDITION.child0 = function () {
  console.log('h_Sub1_PS_EDITION script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0130010', 'AA0130011form1', '_THIS'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;UNMASK;_Sub1_PS_EDITION"
expj.AA0130010.AA0130011form1.h_Sub1_PS_EDITION.child1 = function () {
  console.log('h_Sub1_PS_EDITION script3');
expj.common.pscript.setUnMaskToReferenceComponent('AA0130010', 'AA0130011form1', '_Sub1_PS_EDITION');
};
// script4="child;2;MASK;_Sub1_PS_EDITION"
expj.AA0130010.AA0130011form1.h_Sub1_PS_EDITION.child2 = function () {
  console.log('h_Sub1_PS_EDITION script4');
expj.common.pscript.setMaskToReferenceComponent('AA0130010', 'AA0130011form1', '_Sub1_PS_EDITION');
};
expj.AA0130010.AA0130011form1.h_Sub1_PS_EDITION.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/h_Sub1_PS_EDITION.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.h_Sub1_PS_EDITION.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-h_Sub1_PS_EDITION').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'h_Sub1_PS_EDITION', this);
  });
  expj.AA0130010.AA0130011form1.h_Sub1_PS_EDITION.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.h_Sub1_PS_EDITION.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/h_Sub1_PS_EDITION.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-h_Sub1_PS_EDITION');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0130010.AA0130011form1.h_Sub1_PS_EDITION['onLoad' + i])) {
      expj.AA0130010.AA0130011form1.h_Sub1_PS_EDITION['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AA0130010-AA0130011form1-h_Sub1_MODIFY_COUNT" name="h_Sub1_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0130010Struct.geth_Sub1_MODIFY_COUNT()) %>">
<script class="expj-script-AA0130010-AA0130011form1-h_Sub1_MODIFY_COUNT">
expj.AA0130010.AA0130011form1.h_Sub1_MODIFY_COUNT = {};
expj.AA0130010.AA0130011form1.h_Sub1_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/h_Sub1_MODIFY_COUNT.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.h_Sub1_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-h_Sub1_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'h_Sub1_MODIFY_COUNT', this);
  });
  expj.AA0130010.AA0130011form1.h_Sub1_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.h_Sub1_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/h_Sub1_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-h_Sub1_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0130010-AA0130011form1-h_Target_ITEM_CD" name="h_Target_ITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0130010Struct.geth_Target_ITEM_CD()) %>">
<script class="expj-script-AA0130010-AA0130011form1-h_Target_ITEM_CD">
expj.AA0130010.AA0130011form1.h_Target_ITEM_CD = {};
expj.AA0130010.AA0130011form1.h_Target_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/h_Target_ITEM_CD.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.h_Target_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-h_Target_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'h_Target_ITEM_CD', this);
  });
  expj.AA0130010.AA0130011form1.h_Target_ITEM_CD.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.h_Target_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/h_Target_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-h_Target_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0130010-AA0130011form1-h_InitLevel" name="h_InitLevel" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0130010Struct.geth_InitLevel()) %>">
<script class="expj-script-AA0130010-AA0130011form1-h_InitLevel">
expj.AA0130010.AA0130011form1.h_InitLevel = {};
expj.AA0130010.AA0130011form1.h_InitLevel.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/h_InitLevel.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.h_InitLevel.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-h_InitLevel').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'h_InitLevel', this);
  });
  expj.AA0130010.AA0130011form1.h_InitLevel.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.h_InitLevel.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/h_InitLevel.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-h_InitLevel');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0130010-AA0130011form1-h_MaxLevel" name="h_MaxLevel" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0130010Struct.geth_MaxLevel()) %>">
<script class="expj-script-AA0130010-AA0130011form1-h_MaxLevel">
expj.AA0130010.AA0130011form1.h_MaxLevel = {};
expj.AA0130010.AA0130011form1.h_MaxLevel.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/h_MaxLevel.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.h_MaxLevel.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-h_MaxLevel').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'h_MaxLevel', this);
  });
  expj.AA0130010.AA0130011form1.h_MaxLevel.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.h_MaxLevel.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/h_MaxLevel.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-h_MaxLevel');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PS_UNIT_QTY",rb)%></span><!-- 製品構成単位数 --></div><!--/td-->
<script class="expj-script-AA0130010-AA0130011form1-Sub1_PS_UNIT_NUMERATOR">
expj.AA0130010.AA0130011form1.Sub1_PS_UNIT_NUMERATOR = {};
expj.AA0130010.AA0130011form1.Sub1_PS_UNIT_NUMERATOR.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/Sub1_PS_UNIT_NUMERATOR.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.Sub1_PS_UNIT_NUMERATOR.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-Sub1_PS_UNIT_NUMERATOR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'Sub1_PS_UNIT_NUMERATOR', this);
  });
  expj.AA0130010.AA0130011form1.Sub1_PS_UNIT_NUMERATOR.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.Sub1_PS_UNIT_NUMERATOR.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/Sub1_PS_UNIT_NUMERATOR.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-Sub1_PS_UNIT_NUMERATOR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0130010-AA0130011form1-Sub1_PS_UNIT_NUMERATOR" name="Sub1_PS_UNIT_NUMERATOR" class="AA0130010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0130010Struct.getSub1_PS_UNIT_NUMERATOR()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0005",rb)%></span><!-- ／ --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AA0130010-AA0130011form1-Sub1_PS_UNIT_DENOMINATOR">
expj.AA0130010.AA0130011form1.Sub1_PS_UNIT_DENOMINATOR = {};
expj.AA0130010.AA0130011form1.Sub1_PS_UNIT_DENOMINATOR.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/Sub1_PS_UNIT_DENOMINATOR.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.Sub1_PS_UNIT_DENOMINATOR.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-Sub1_PS_UNIT_DENOMINATOR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'Sub1_PS_UNIT_DENOMINATOR', this);
  });
  expj.AA0130010.AA0130011form1.Sub1_PS_UNIT_DENOMINATOR.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.Sub1_PS_UNIT_DENOMINATOR.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/Sub1_PS_UNIT_DENOMINATOR.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-Sub1_PS_UNIT_DENOMINATOR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0130010-AA0130011form1-Sub1_PS_UNIT_DENOMINATOR" name="Sub1_PS_UNIT_DENOMINATOR" class="AA0130010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0130010Struct.getSub1_PS_UNIT_DENOMINATOR()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AA0130010-AA0130011form1-Sub1_STOCK_UNIT">
expj.AA0130010.AA0130011form1.Sub1_STOCK_UNIT = {};
expj.AA0130010.AA0130011form1.Sub1_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/Sub1_STOCK_UNIT.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.Sub1_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-Sub1_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'Sub1_STOCK_UNIT', this);
  });
  expj.AA0130010.AA0130011form1.Sub1_STOCK_UNIT.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.Sub1_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/Sub1_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-Sub1_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="text" id="expj-AA0130010-AA0130011form1-Sub1_STOCK_UNIT" name="Sub1_STOCK_UNIT" class="AA0130010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0130010Struct.getSub1_STOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.EFF_PHASE_OUT_DATE_2",rb)%></span><!-- 構成有効日 --></div><!--/td-->
<script class="expj-script-AA0130010-AA0130011form1-Sub1_EFF_PHASE_IN_DATE">
expj.AA0130010.AA0130011form1.Sub1_EFF_PHASE_IN_DATE = {};
expj.AA0130010.AA0130011form1.Sub1_EFF_PHASE_IN_DATE.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/Sub1_EFF_PHASE_IN_DATE.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.Sub1_EFF_PHASE_IN_DATE.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-Sub1_EFF_PHASE_IN_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'Sub1_EFF_PHASE_IN_DATE', this);
  });
  expj.AA0130010.AA0130011form1.Sub1_EFF_PHASE_IN_DATE.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.Sub1_EFF_PHASE_IN_DATE.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/Sub1_EFF_PHASE_IN_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-Sub1_EFF_PHASE_IN_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0130010-AA0130011form1-Sub1_EFF_PHASE_IN_DATE" name="Sub1_EFF_PHASE_IN_DATE" class="AA0130010-focus-move  required-value expj-AA0130010-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAA0130010Struct.getSub1_EFF_PHASE_IN_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AA0130010-AA0130011form1-CalendarSub1EffPhaseInDate">
expj.AA0130010.AA0130011form1.CalendarSub1EffPhaseInDate = {};
// script1="onClick;0;CALENDAR;_AA0130011form1/Sub1_EFF_PHASE_IN_DATE"
expj.AA0130010.AA0130011form1.CalendarSub1EffPhaseInDate.onClick0 = function () {
  console.log('CalendarSub1EffPhaseInDate script1');
expj.common.pscript.executeCalendar('AA0130010','AA0130011form1','_AA0130011form1/Sub1_EFF_PHASE_IN_DATE');
};
expj.AA0130010.AA0130011form1.CalendarSub1EffPhaseInDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0130010.AA0130011form1.CalendarSub1EffPhaseInDate['onClick' + i])) {
        expj.AA0130010.AA0130011form1.CalendarSub1EffPhaseInDate['onClick' + i]();
      }
    }
  }
};
expj.AA0130010.AA0130011form1.CalendarSub1EffPhaseInDate.executeAllOnDecision = function () {
};
expj.AA0130010.AA0130011form1.CalendarSub1EffPhaseInDate.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-CalendarSub1EffPhaseInDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0130010', 'AA0130011form1', 'CalendarSub1EffPhaseInDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AA0130010','AA0130011form1','_AA0130011form1/Sub1_EFF_PHASE_IN_DATE');
  expj.AA0130010.AA0130011form1.CalendarSub1EffPhaseInDate.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.CalendarSub1EffPhaseInDate.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/CalendarSub1EffPhaseInDate.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-CalendarSub1EffPhaseInDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0130010-AA0130011form1-CalendarSub1EffPhaseInDate" class="AA0130010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AA0130010-AA0130011form1-Sub1_EFF_PHASE_OUT_DATE">
expj.AA0130010.AA0130011form1.Sub1_EFF_PHASE_OUT_DATE = {};
expj.AA0130010.AA0130011form1.Sub1_EFF_PHASE_OUT_DATE.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/Sub1_EFF_PHASE_OUT_DATE.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.Sub1_EFF_PHASE_OUT_DATE.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-Sub1_EFF_PHASE_OUT_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'Sub1_EFF_PHASE_OUT_DATE', this);
  });
  expj.AA0130010.AA0130011form1.Sub1_EFF_PHASE_OUT_DATE.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.Sub1_EFF_PHASE_OUT_DATE.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/Sub1_EFF_PHASE_OUT_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-Sub1_EFF_PHASE_OUT_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0130010-AA0130011form1-Sub1_EFF_PHASE_OUT_DATE" name="Sub1_EFF_PHASE_OUT_DATE" class="AA0130010-focus-move  required-value expj-AA0130010-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAA0130010Struct.getSub1_EFF_PHASE_OUT_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AA0130010-AA0130011form1-CalendarSub1EffPhaseOutDate">
expj.AA0130010.AA0130011form1.CalendarSub1EffPhaseOutDate = {};
// script1="onClick;0;CALENDAR;_AA0130011form1/Sub1_EFF_PHASE_OUT_DATE"
expj.AA0130010.AA0130011form1.CalendarSub1EffPhaseOutDate.onClick0 = function () {
  console.log('CalendarSub1EffPhaseOutDate script1');
expj.common.pscript.executeCalendar('AA0130010','AA0130011form1','_AA0130011form1/Sub1_EFF_PHASE_OUT_DATE');
};
expj.AA0130010.AA0130011form1.CalendarSub1EffPhaseOutDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0130010.AA0130011form1.CalendarSub1EffPhaseOutDate['onClick' + i])) {
        expj.AA0130010.AA0130011form1.CalendarSub1EffPhaseOutDate['onClick' + i]();
      }
    }
  }
};
expj.AA0130010.AA0130011form1.CalendarSub1EffPhaseOutDate.executeAllOnDecision = function () {
};
expj.AA0130010.AA0130011form1.CalendarSub1EffPhaseOutDate.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-CalendarSub1EffPhaseOutDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0130010', 'AA0130011form1', 'CalendarSub1EffPhaseOutDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AA0130010','AA0130011form1','_AA0130011form1/Sub1_EFF_PHASE_OUT_DATE');
  expj.AA0130010.AA0130011form1.CalendarSub1EffPhaseOutDate.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.CalendarSub1EffPhaseOutDate.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/CalendarSub1EffPhaseOutDate.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-CalendarSub1EffPhaseOutDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-AA0130010-AA0130011form1-CalendarSub1EffPhaseOutDate" class="AA0130010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PS_SPOIL",rb)%></span><!-- 構成仕損率 --></div><!--/td-->
<script class="expj-script-AA0130010-AA0130011form1-Sub1_PS_SPOIL">
expj.AA0130010.AA0130011form1.Sub1_PS_SPOIL = {};
expj.AA0130010.AA0130011form1.Sub1_PS_SPOIL.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/Sub1_PS_SPOIL.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.Sub1_PS_SPOIL.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-Sub1_PS_SPOIL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'Sub1_PS_SPOIL', this);
  });
  expj.AA0130010.AA0130011form1.Sub1_PS_SPOIL.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.Sub1_PS_SPOIL.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/Sub1_PS_SPOIL.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-Sub1_PS_SPOIL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0130010-AA0130011form1-Sub1_PS_SPOIL" name="Sub1_PS_SPOIL" class="AA0130010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;5.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0130010Struct.getSub1_PS_SPOIL()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0051",rb)%></span><!-- ％ --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CONS_TYP",rb)%></span><!-- 支給区分 --></div><!--/td-->
<script class="expj-script-AA0130010-AA0130011form1-Sub1_CONS_TYP">
expj.AA0130010.AA0130011form1.Sub1_CONS_TYP = {};
expj.AA0130010.AA0130011form1.Sub1_CONS_TYP.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/Sub1_CONS_TYP.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.Sub1_CONS_TYP.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-Sub1_CONS_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0130010', 'AA0130011form1', 'Sub1_CONS_TYP', this);
  });
  expj.AA0130010.AA0130011form1.Sub1_CONS_TYP.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.Sub1_CONS_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/Sub1_CONS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-Sub1_CONS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0130010-AA0130011form1-Sub1_CONS_TYP" name='Sub1_CONS_TYP' class='AA0130010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0130010Control.getStruct().getList_Sub1_CONS_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0130010Control.getStruct().getList_Sub1_CONS_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0130010Control.getStruct().getList_Sub1_CONS_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0130010Struct.getSub1_CONS_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PS_REF_NO_1",rb)%></span><!-- 照会順序 --></div><!--/td-->
<script class="expj-script-AA0130010-AA0130011form1-Sub1_PS_REF_NO">
expj.AA0130010.AA0130011form1.Sub1_PS_REF_NO = {};
expj.AA0130010.AA0130011form1.Sub1_PS_REF_NO.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/Sub1_PS_REF_NO.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.Sub1_PS_REF_NO.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-Sub1_PS_REF_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'Sub1_PS_REF_NO', this);
  });
  expj.AA0130010.AA0130011form1.Sub1_PS_REF_NO.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.Sub1_PS_REF_NO.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/Sub1_PS_REF_NO.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-Sub1_PS_REF_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0130010-AA0130011form1-Sub1_PS_REF_NO" name="Sub1_PS_REF_NO" class="AA0130010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAA0130010Struct.getSub1_PS_REF_NO()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PS_FIXED_LT",rb)%></span><!-- 製品構成固定分リードタイム --></div><!--/td-->
<script class="expj-script-AA0130010-AA0130011form1-Sub1_PS_FIXED_LT">
expj.AA0130010.AA0130011form1.Sub1_PS_FIXED_LT = {};
expj.AA0130010.AA0130011form1.Sub1_PS_FIXED_LT.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/Sub1_PS_FIXED_LT.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.Sub1_PS_FIXED_LT.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-Sub1_PS_FIXED_LT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'Sub1_PS_FIXED_LT', this);
  });
  expj.AA0130010.AA0130011form1.Sub1_PS_FIXED_LT.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.Sub1_PS_FIXED_LT.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/Sub1_PS_FIXED_LT.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-Sub1_PS_FIXED_LT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0130010-AA0130011form1-Sub1_PS_FIXED_LT" name="Sub1_PS_FIXED_LT" class="AA0130010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAA0130010Struct.getSub1_PS_FIXED_LT()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AA0130010-AA0130011form1-c_Sub1_PS_LT_FLG">
expj.AA0130010.AA0130011form1.c_Sub1_PS_LT_FLG = {};
// script1="onLoad;0;CALL;onClick@0"
expj.AA0130010.AA0130011form1.c_Sub1_PS_LT_FLG.onLoad0 = function () {
  console.log('c_Sub1_PS_LT_FLG script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;_THIS[eq]true@*0,*1"
expj.AA0130010.AA0130011form1.c_Sub1_PS_LT_FLG.onClick0 = function () {
  console.log('c_Sub1_PS_LT_FLG script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0130010', 'AA0130011form1', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_Sub1_PS_FIXED_LT,_Sub1_PS_PROP_LT,_Sub1_PS_PROP_LOT_SIZE"
expj.AA0130010.AA0130011form1.c_Sub1_PS_LT_FLG.child0 = function () {
  console.log('c_Sub1_PS_LT_FLG script3');
expj.common.pscript.setUnMaskToReferenceComponent('AA0130010', 'AA0130011form1', '_Sub1_PS_FIXED_LT');
expj.common.pscript.setUnMaskToReferenceComponent('AA0130010', 'AA0130011form1', '_Sub1_PS_PROP_LT');
expj.common.pscript.setUnMaskToReferenceComponent('AA0130010', 'AA0130011form1', '_Sub1_PS_PROP_LOT_SIZE');
};
// script4="child;1;MASK;_Sub1_PS_FIXED_LT,_Sub1_PS_PROP_LT,_Sub1_PS_PROP_LOT_SIZE"
expj.AA0130010.AA0130011form1.c_Sub1_PS_LT_FLG.child1 = function () {
  console.log('c_Sub1_PS_LT_FLG script4');
expj.common.pscript.setMaskToReferenceComponent('AA0130010', 'AA0130011form1', '_Sub1_PS_FIXED_LT');
expj.common.pscript.setMaskToReferenceComponent('AA0130010', 'AA0130011form1', '_Sub1_PS_PROP_LT');
expj.common.pscript.setMaskToReferenceComponent('AA0130010', 'AA0130011form1', '_Sub1_PS_PROP_LOT_SIZE');
};
expj.AA0130010.AA0130011form1.c_Sub1_PS_LT_FLG.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0130010.AA0130011form1.c_Sub1_PS_LT_FLG['onClick' + i])) {
        expj.AA0130010.AA0130011form1.c_Sub1_PS_LT_FLG['onClick' + i]();
      }
    }
  }
};
expj.AA0130010.AA0130011form1.c_Sub1_PS_LT_FLG.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/c_Sub1_PS_LT_FLG.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.c_Sub1_PS_LT_FLG.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-c_Sub1_PS_LT_FLG').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0130010', 'AA0130011form1', 'c_Sub1_PS_LT_FLG', this, 'CheckBox');
    }
  });
  expj.AA0130010.AA0130011form1.c_Sub1_PS_LT_FLG.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.c_Sub1_PS_LT_FLG.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/c_Sub1_PS_LT_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-c_Sub1_PS_LT_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0130010.AA0130011form1.c_Sub1_PS_LT_FLG['onLoad' + i])) {
      expj.AA0130010.AA0130011form1.c_Sub1_PS_LT_FLG['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_Sub1_PS_LT_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aAA0130010Struct.getc_Sub1_PS_LT_FLG())) || "1".equals(TypeConverter.convert(aAA0130010Struct.getc_Sub1_PS_LT_FLG())))?"checked=\"checked\"":"" %>  class="AA0130010-focus-move" id="expj-AA0130010-AA0130011form1-c_Sub1_PS_LT_FLG"><label for="expj-AA0130010-AA0130011form1-c_Sub1_PS_LT_FLG"><%=CoreTools.getRBString("Expj.Cmt0205",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-AA0130010-AA0130011form1-h_Sub1_PS_LT_FLG" name="h_Sub1_PS_LT_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0130010Struct.geth_Sub1_PS_LT_FLG()) %>">
<script class="expj-script-AA0130010-AA0130011form1-h_Sub1_PS_LT_FLG">
expj.AA0130010.AA0130011form1.h_Sub1_PS_LT_FLG = {};
expj.AA0130010.AA0130011form1.h_Sub1_PS_LT_FLG.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/h_Sub1_PS_LT_FLG.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.h_Sub1_PS_LT_FLG.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-h_Sub1_PS_LT_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'h_Sub1_PS_LT_FLG', this);
  });
  expj.AA0130010.AA0130011form1.h_Sub1_PS_LT_FLG.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.h_Sub1_PS_LT_FLG.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/h_Sub1_PS_LT_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-h_Sub1_PS_LT_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:20px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PS_PROP_LT",rb)%></span><!-- 製品構成比例分リードタイム --></div><!--/td-->
<script class="expj-script-AA0130010-AA0130011form1-Sub1_PS_PROP_LT">
expj.AA0130010.AA0130011form1.Sub1_PS_PROP_LT = {};
expj.AA0130010.AA0130011form1.Sub1_PS_PROP_LT.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/Sub1_PS_PROP_LT.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.Sub1_PS_PROP_LT.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-Sub1_PS_PROP_LT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'Sub1_PS_PROP_LT', this);
  });
  expj.AA0130010.AA0130011form1.Sub1_PS_PROP_LT.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.Sub1_PS_PROP_LT.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/Sub1_PS_PROP_LT.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-Sub1_PS_PROP_LT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0130010-AA0130011form1-Sub1_PS_PROP_LT" name="Sub1_PS_PROP_LT" class="AA0130010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAA0130010Struct.getSub1_PS_PROP_LT()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PS_PROP_LOT_SIZE",rb)%></span><!-- 製品構成比例分ロットサイズ --></div><!--/td-->
<script class="expj-script-AA0130010-AA0130011form1-Sub1_PS_PROP_LOT_SIZE">
expj.AA0130010.AA0130011form1.Sub1_PS_PROP_LOT_SIZE = {};
expj.AA0130010.AA0130011form1.Sub1_PS_PROP_LOT_SIZE.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/Sub1_PS_PROP_LOT_SIZE.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.Sub1_PS_PROP_LOT_SIZE.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-Sub1_PS_PROP_LOT_SIZE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0130010', 'AA0130011form1', 'Sub1_PS_PROP_LOT_SIZE', this);
  });
  expj.AA0130010.AA0130011form1.Sub1_PS_PROP_LOT_SIZE.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.Sub1_PS_PROP_LOT_SIZE.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/Sub1_PS_PROP_LOT_SIZE.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-Sub1_PS_PROP_LOT_SIZE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0130010-AA0130011form1-Sub1_PS_PROP_LOT_SIZE" name="Sub1_PS_PROP_LOT_SIZE" class="AA0130010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0130010Struct.getSub1_PS_PROP_LOT_SIZE()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.COST_UP_TYP_2",rb)%></span><!-- 原価積上有無 --></div><!--/td-->
<script class="expj-script-AA0130010-AA0130011form1-Sub1_COST_UP_TYP">
expj.AA0130010.AA0130011form1.Sub1_COST_UP_TYP = {};
expj.AA0130010.AA0130011form1.Sub1_COST_UP_TYP.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/Sub1_COST_UP_TYP.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.Sub1_COST_UP_TYP.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-Sub1_COST_UP_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0130010', 'AA0130011form1', 'Sub1_COST_UP_TYP', this);
  });
  expj.AA0130010.AA0130011form1.Sub1_COST_UP_TYP.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.Sub1_COST_UP_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/Sub1_COST_UP_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-Sub1_COST_UP_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0130010-AA0130011form1-Sub1_COST_UP_TYP" name='Sub1_COST_UP_TYP' class='AA0130010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0130010Control.getStruct().getList_Sub1_COST_UP_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0130010Control.getStruct().getList_Sub1_COST_UP_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0130010Control.getStruct().getList_Sub1_COST_UP_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0130010Struct.getSub1_COST_UP_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MRP_EXP_TYP_2",rb)%></span><!-- MRP展開有無 --></div><!--/td-->
<script class="expj-script-AA0130010-AA0130011form1-Sub1_MRP_EXP_TYP">
expj.AA0130010.AA0130011form1.Sub1_MRP_EXP_TYP = {};
expj.AA0130010.AA0130011form1.Sub1_MRP_EXP_TYP.executeAllOnDecision = function () {
  console.log('execute AA0130011form1/Sub1_MRP_EXP_TYP.onDecision');
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
  expj.AA0130010.executeAllOnDecision();
};
expj.AA0130010.AA0130011form1.Sub1_MRP_EXP_TYP.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011form1-Sub1_MRP_EXP_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0130010', 'AA0130011form1', 'Sub1_MRP_EXP_TYP', this);
  });
  expj.AA0130010.AA0130011form1.Sub1_MRP_EXP_TYP.executePScriptOnLoad();
};

expj.AA0130010.AA0130011form1.Sub1_MRP_EXP_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0130011form1/Sub1_MRP_EXP_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011form1-Sub1_MRP_EXP_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0130010-AA0130011form1-Sub1_MRP_EXP_TYP" name='Sub1_MRP_EXP_TYP' class='AA0130010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0130010Control.getStruct().getList_Sub1_MRP_EXP_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0130010Control.getStruct().getList_Sub1_MRP_EXP_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0130010Control.getStruct().getList_Sub1_MRP_EXP_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0130010Struct.getSub1_MRP_EXP_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AA0130010-AA0130011button1">
expj.AA0130010.AA0130011button1 = {};
expj.AA0130010.AA0130011button1.executeAllOnDecision = function () {
  console.log('execute AA0130011button1.onDecision');
};
expj.AA0130010.AA0130011button1.executeOnLoad = function () {
  expj.AA0130010.AA0130011button1.executePScriptOnLoad();
};

expj.AA0130010.AA0130011button1.executePScriptOnLoad = function () {
  console.log('execute AA0130011button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0130010-AA0130011button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0130010-AA0130011button1-Sub1Insert">
expj.AA0130010.AA0130011button1.Sub1Insert = {};
// script1="onClick;0;CHK;_AA0130011form1/Sub1Parent_ITEM_CD[eq]_AA0130011form1/Sub1Comp_ITEM_CD@#AA00051"
expj.AA0130010.AA0130011button1.Sub1Insert.onClick0 = function () {
  console.log('Sub1Insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0130010', 'AA0130011button1', '_AA0130011form1/Sub1Parent_ITEM_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0130010', 'AA0130011button1', '_AA0130011form1/Sub1Comp_ITEM_CD'))) {
expj.common.pscript.addErrorMessage('AA0130010', 'AA0130011button1', 'AA00051');
}
};
// script2="onClick;1;CHK;_AA0130011form1/Sub1_EFF_PHASE_IN_DATE[gt]_AA0130011form1/Sub1_EFF_PHASE_OUT_DATE@#AA00048"
expj.AA0130010.AA0130011button1.Sub1Insert.onClick1 = function () {
  console.log('Sub1Insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0130010', 'AA0130011button1', '_AA0130011form1/Sub1_EFF_PHASE_IN_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0130010', 'AA0130011button1', '_AA0130011form1/Sub1_EFF_PHASE_OUT_DATE')))) {
expj.common.pscript.addErrorMessage('AA0130010', 'AA0130011button1', 'AA00048');
}
};
// script3="onClick;2;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0130011form1/*@AA0130010Servlet,,$ZZ07001"
expj.AA0130010.AA0130011button1.Sub1Insert.onClick2 = function () {
  console.log('Sub1Insert script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0130010', 'AA0130011button1', '_AA0130011form1/*', 'AA0130010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0130010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0130010', response);
expj.common.changeBusinessScreenTab('AA0130010', contents);
};
expj.common.pscript.callConfirm('AA0130010', 'AA0130011button1', 'ZZ07001', okEvent);
};
expj.AA0130010.AA0130011button1.Sub1Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0130010.AA0130011button1.Sub1Insert['onClick' + i])) {
        expj.AA0130010.AA0130011button1.Sub1Insert['onClick' + i]();
      }
    }
  }
};
expj.AA0130010.AA0130011button1.Sub1Insert.executeAllOnDecision = function () {
};
expj.AA0130010.AA0130011button1.Sub1Insert.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011button1-Sub1Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0130010', 'AA0130011button1', 'Sub1Insert', this, 'Button');
    }
  });
  expj.AA0130010.AA0130011button1.Sub1Insert.executePScriptOnLoad();
};

expj.AA0130010.AA0130011button1.Sub1Insert.executePScriptOnLoad = function () {
  console.log('execute AA0130011button1/Sub1Insert.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011button1-Sub1Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0130010-AA0130011button1-Sub1Insert" name="Sub1Insert" class="AA0130010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AA0130010-AA0130011button1-Sub1Update">
expj.AA0130010.AA0130011button1.Sub1Update = {};
// script1="onClick;0;CHK;_AA0130011form1/Sub1_EFF_PHASE_IN_DATE[gt]_AA0130011form1/Sub1_EFF_PHASE_OUT_DATE@#AA00048"
expj.AA0130010.AA0130011button1.Sub1Update.onClick0 = function () {
  console.log('Sub1Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0130010', 'AA0130011button1', '_AA0130011form1/Sub1_EFF_PHASE_IN_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0130010', 'AA0130011button1', '_AA0130011form1/Sub1_EFF_PHASE_OUT_DATE')))) {
expj.common.pscript.addErrorMessage('AA0130010', 'AA0130011button1', 'AA00048');
}
};
// script2="onClick;1;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0130011form1/*@AA0130010Servlet,,$ZZ07003"
expj.AA0130010.AA0130011button1.Sub1Update.onClick1 = function () {
  console.log('Sub1Update script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0130010', 'AA0130011button1', '_AA0130011form1/*', 'AA0130010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0130010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0130010', response);
expj.common.changeBusinessScreenTab('AA0130010', contents);
};
expj.common.pscript.callConfirm('AA0130010', 'AA0130011button1', 'ZZ07003', okEvent);
};
expj.AA0130010.AA0130011button1.Sub1Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0130010.AA0130011button1.Sub1Update['onClick' + i])) {
        expj.AA0130010.AA0130011button1.Sub1Update['onClick' + i]();
      }
    }
  }
};
expj.AA0130010.AA0130011button1.Sub1Update.executeAllOnDecision = function () {
};
expj.AA0130010.AA0130011button1.Sub1Update.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011button1-Sub1Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0130010', 'AA0130011button1', 'Sub1Update', this, 'Button');
    }
  });
  expj.AA0130010.AA0130011button1.Sub1Update.executePScriptOnLoad();
};

expj.AA0130010.AA0130011button1.Sub1Update.executePScriptOnLoad = function () {
  console.log('execute AA0130011button1/Sub1Update.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011button1-Sub1Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0130010-AA0130011button1-Sub1Update" name="Sub1Update" class="AA0130010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 95px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AA0130011 Revision: 1.4  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AA0130010-AA0130011button0">
expj.AA0130010.AA0130011button0 = {};
expj.AA0130010.AA0130011button0.executeAllOnDecision = function () {
  console.log('execute AA0130011button0.onDecision');
};
expj.AA0130010.AA0130011button0.executeOnLoad = function () {
  expj.AA0130010.AA0130011button0.executePScriptOnLoad();
};

expj.AA0130010.AA0130011button0.executePScriptOnLoad = function () {
  console.log('execute AA0130011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0130010-AA0130011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0130010-AA0130011button0-Sub1Return">
expj.AA0130010.AA0130011button0.Sub1Return = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0130011form1/*@AA0130010Servlet,,$ZZ07013"
expj.AA0130010.AA0130011button0.Sub1Return.onClick0 = function () {
  console.log('Sub1Return script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0130010', 'AA0130011button0', '_AA0130011form1/*', 'AA0130010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0130010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0130010', response);
expj.common.changeBusinessScreenTab('AA0130010', contents);
};
expj.common.pscript.callConfirm('AA0130010', 'AA0130011button0', 'ZZ07013', okEvent);
};
expj.AA0130010.AA0130011button0.Sub1Return.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0130010.AA0130011button0.Sub1Return['onClick' + i])) {
        expj.AA0130010.AA0130011button0.Sub1Return['onClick' + i]();
      }
    }
  }
};
expj.AA0130010.AA0130011button0.Sub1Return.executeAllOnDecision = function () {
};
expj.AA0130010.AA0130011button0.Sub1Return.executeOnLoad = function () {
  $('#expj-AA0130010-AA0130011button0-Sub1Return').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0130010', 'AA0130011button0', 'Sub1Return', this, 'Button');
    }
  });
  expj.AA0130010.AA0130011button0.Sub1Return.executePScriptOnLoad();
};

expj.AA0130010.AA0130011button0.Sub1Return.executePScriptOnLoad = function () {
  console.log('execute AA0130011button0/Sub1Return.onLoad');
  var targetComponent = document.getElementById('expj-AA0130010-AA0130011button0-Sub1Return');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0130010-AA0130011button0-Sub1Return" name="Sub1Return" class="AA0130010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0130010 (END)-->
<%
  MessageStruct msgStruct = aAA0130010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0130010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0130010)) {
  expj.common.treeInstanceMap.AA0130010 = {};
}
expj.common.treeInstanceMap.AA0130010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0130010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0130010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0130010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0130010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0130010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0130010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0130010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0130010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0130010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0130010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0130010)) {
  expj.common.detailDialogMap.AA0130010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0130010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0130010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0130010.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0130010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0130010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0130010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0130010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0130010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0130010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0130010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0130010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0130010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0130010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0130010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0130010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0130010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0130010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0130010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0130010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0130010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0130010)) {
  expj.common.viewInstanceMap.AA0130010 = {};
}
expj.common.viewInstanceMap.AA0130010.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0130010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0130010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0130010.<%=viewId %>.init = function () {
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
    expj.AA0130010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0130010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0130010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0130010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0130010_init">
/**
 * AA0130010用のロード完了時初期化関数
 */
expj.AA0130010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0130010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0130010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0130010');
  expj.common.calendarInstanceMap.AA0130010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0130010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0130010.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0130010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0130010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0130010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0130010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0130010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0130010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0130010-<%=detailId %>');
<%
 }
%>
  try{expj.AA0130010.AA0130011form1.Sub1Parent_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.h_Sub1Parent_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.PeekerSub1ParentItemCd.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.Sub1Parent_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.Sub1Comp_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.h_Sub1Comp_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.PeekerSub1CompItemCd.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.Sub1Comp_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.h_TargetDate.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.h_DEVELOP_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.Sub1_PS_EDITION.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.h_Sub1_PS_EDITION.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.h_Sub1_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.h_Target_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.h_InitLevel.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.h_MaxLevel.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.Sub1_PS_UNIT_NUMERATOR.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.Sub1_PS_UNIT_DENOMINATOR.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.Sub1_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.Sub1_EFF_PHASE_IN_DATE.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.CalendarSub1EffPhaseInDate.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.Sub1_EFF_PHASE_OUT_DATE.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.CalendarSub1EffPhaseOutDate.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.Sub1_PS_SPOIL.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.Sub1_CONS_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.Sub1_PS_REF_NO.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.Sub1_PS_FIXED_LT.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.c_Sub1_PS_LT_FLG.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.h_Sub1_PS_LT_FLG.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.Sub1_PS_PROP_LT.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.Sub1_PS_PROP_LOT_SIZE.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.Sub1_COST_UP_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.Sub1_MRP_EXP_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011button1.Sub1Insert.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011button1.Sub1Update.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011button0.Sub1Return.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011form1.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011button1.executeOnLoad();}catch(e){};
  try{expj.AA0130010.AA0130011button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0130010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0130010', 'AA0130010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0130010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0130010-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0130010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0130010', '<%=request.getContextPath() %>');
};

/**
 * AA0130010の全体onDecision処理
 */
expj.AA0130010.executeAllOnDecision = function () {
  expj.AA0130010.AA0130011form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0130010_console">
expj.AA0130010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>