<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:22:31 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0080\AA0080020.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0080.*" %>
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
<jsp:useBean id="aAA0080020Control" class="com.nec.jp.orteus.metamorBase.AA0080.AA0080020Control" scope="request"/>
<jsp:useBean id="aAA0080020Struct" class="com.nec.jp.orteus.metamorBase.AA0080.AA0080020Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

カレンダメンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0080/jsp/AA0080020.jsp,v $
$Author: geng-jia $    
$Revision: 1.10 $ $Date: 2017/02/22 02:03:55 $
********************************************************* --%>
<html>
<head>
<title>カレンダメンテナンス</title>
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
<script class="expj-script-AA0080020_init">
  // AA0080020名前空間
  expj.AA0080020 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AA0080020" data-screen="AA0080020" data-newdata="<%=aAA0080020Control.isNewData() %>">
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
              <script class="expj-script-AA0080020-AA0080020form1">
expj.AA0080020.AA0080020form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AA0080020.AA0080020form1.onLoad0 = function () {
  console.log('AA0080020form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHK;?AA0080020form1/*[eq]NORMAL[or]?AA0080020form1/*[eq]NOT_FOUND@*0,*6"
expj.AA0080020.AA0080020form1.onDecision0 = function () {
  console.log('AA0080020form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0080020', 'AA0080020form1', '?AA0080020form1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0080020', 'AA0080020form1', '?AA0080020form1/*'), '[eq]', 'NOT_FOUND')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script3="child;0;CHKRQ;A@*1,*6"
expj.AA0080020.AA0080020form1.child0 = function () {
  console.log('AA0080020form1 script3');
if (expj.common.pscript.satisfiedRequiredComponent('AA0080020', 'A')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script4="child;1;CHK;?AA0080020form1/CAL_NO[eq]SAME@*2,*6"
expj.AA0080020.AA0080020form1.child1 = function () {
  console.log('AA0080020form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0080020', 'AA0080020form1', '?AA0080020form1/CAL_NO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script5="child;2;CHK;?AA0080020form1/*[eq]NORMAL@*3,*4"
expj.AA0080020.AA0080020form1.child2 = function () {
  console.log('AA0080020form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0080020', 'AA0080020form1', '?AA0080020form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;3;UNMASK;_AA0080020button2/update@*5"
expj.AA0080020.AA0080020form1.child3 = function () {
  console.log('AA0080020form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AA0080020', 'AA0080020form1', '_AA0080020button2/update');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script7="child;4;MASK;_AA0080020button2/update@*5"
expj.AA0080020.AA0080020form1.child4 = function () {
  console.log('AA0080020form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AA0080020', 'AA0080020form1', '_AA0080020button2/update');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script8="child;5;UNMASK;_AA0080020button2/before,_AA0080020button2/next,_AA0080020button0/insert,_AA0080020button0/change"
expj.AA0080020.AA0080020form1.child5 = function () {
  console.log('AA0080020form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AA0080020', 'AA0080020form1', '_AA0080020button2/before');
expj.common.pscript.setUnMaskToReferenceComponent('AA0080020', 'AA0080020form1', '_AA0080020button2/next');
expj.common.pscript.setUnMaskToReferenceComponent('AA0080020', 'AA0080020form1', '_AA0080020button0/insert');
expj.common.pscript.setUnMaskToReferenceComponent('AA0080020', 'AA0080020form1', '_AA0080020button0/change');
};
// script9="child;6;MASK;_AA0080020button2/update,_AA0080020button2/before,_AA0080020button2/next,_AA0080020button0/insert,_AA0080020button0/change"
expj.AA0080020.AA0080020form1.child6 = function () {
  console.log('AA0080020form1 script9');
expj.common.pscript.setMaskToReferenceComponent('AA0080020', 'AA0080020form1', '_AA0080020button2/update');
expj.common.pscript.setMaskToReferenceComponent('AA0080020', 'AA0080020form1', '_AA0080020button2/before');
expj.common.pscript.setMaskToReferenceComponent('AA0080020', 'AA0080020form1', '_AA0080020button2/next');
expj.common.pscript.setMaskToReferenceComponent('AA0080020', 'AA0080020form1', '_AA0080020button0/insert');
expj.common.pscript.setMaskToReferenceComponent('AA0080020', 'AA0080020form1', '_AA0080020button0/change');
};
// script10="onDecision;1;CHKRQ;A@*7,*8"
expj.AA0080020.AA0080020form1.onDecision1 = function () {
  console.log('AA0080020form1 script10');
if (expj.common.pscript.satisfiedRequiredComponent('AA0080020', 'A')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script11="child;7;UNMASK;_AA0080020button1/select"
expj.AA0080020.AA0080020form1.child7 = function () {
  console.log('AA0080020form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('AA0080020', 'AA0080020form1', '_AA0080020button1/select');
};
// script12="child;8;MASK;_AA0080020button1/select"
expj.AA0080020.AA0080020form1.child8 = function () {
  console.log('AA0080020form1 script12');
expj.common.pscript.setMaskToReferenceComponent('AA0080020', 'AA0080020form1', '_AA0080020button1/select');
};
expj.AA0080020.AA0080020form1.executeAllOnDecision = function () {
  console.log('execute AA0080020form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0080020.AA0080020form1['onDecision' + i])) {
        expj.AA0080020.AA0080020form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0080020.AA0080020form1.executeOnLoad = function () {
  expj.AA0080020.AA0080020form1.executePScriptOnLoad();
};

expj.AA0080020.AA0080020form1.executePScriptOnLoad = function () {
  console.log('execute AA0080020form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0080020.AA0080020form1['onLoad' + i])) {
      expj.AA0080020.AA0080020form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0080020-AA0080020form1" action="AA0080020Servlet" name="AA0080020form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAA0080020Control.getReadStatusString()) %>" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CAL_NO",rb)%></span><!-- カレンダ番号 --></div><!--/td-->
<script class="expj-script-AA0080020-AA0080020form1-CAL_NO">
expj.AA0080020.AA0080020form1.CAL_NO = {};
expj.AA0080020.AA0080020form1.CAL_NO.executeAllOnDecision = function () {
  console.log('execute AA0080020form1/CAL_NO.onDecision');
  expj.AA0080020.AA0080020form1.executeAllOnDecision();
  expj.AA0080020.executeAllOnDecision();
};
expj.AA0080020.AA0080020form1.CAL_NO.executeOnLoad = function () {
  $('#expj-AA0080020-AA0080020form1-CAL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0080020', 'AA0080020form1', 'CAL_NO', this);
  });
  expj.AA0080020.AA0080020form1.CAL_NO.executePScriptOnLoad();
};

expj.AA0080020.AA0080020form1.CAL_NO.executePScriptOnLoad = function () {
  console.log('execute AA0080020form1/CAL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AA0080020-AA0080020form1-CAL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0080020-AA0080020form1-CAL_NO" name="CAL_NO" class="AA0080020-focus-move expj-align-right required-value expj-AA0080020-required-A" style="width:150px;" data-kind="OBT_N" value="<%= TypeConverter.sanitizer(aAA0080020Struct.getCAL_NO()) %>" maxlength="6" ></div><!--/td-->
<script class="expj-script-AA0080020-AA0080020form1-PeekerCalNo">
expj.AA0080020.AA0080020form1.PeekerCalNo = {};
// script1="onClick;0;PEEKER;_AA0080020form1/CAL_NO@<%=contextNo%>"
expj.AA0080020.AA0080020form1.PeekerCalNo.onClick0 = function () {
  console.log('PeekerCalNo script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0080020';
var parameterValues = 'PeekerCalNo%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0080020', 'AA0080020form1', '_AA0080020form1/CAL_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CAL_NO_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0080020form1/CAL_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0080020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0080020.AA0080020form1.PeekerCalNo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0080020.AA0080020form1.PeekerCalNo['onClick' + i])) {
        expj.AA0080020.AA0080020form1.PeekerCalNo['onClick' + i]();
      }
    }
  }
};
expj.AA0080020.AA0080020form1.PeekerCalNo.executeAllOnDecision = function () {
};
expj.AA0080020.AA0080020form1.PeekerCalNo.executeOnLoad = function () {
  $('#expj-AA0080020-AA0080020form1-PeekerCalNo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0080020', 'AA0080020form1', 'PeekerCalNo', this, 'Button');
    }
  });
  expj.AA0080020.AA0080020form1.PeekerCalNo.executePScriptOnLoad();
};

expj.AA0080020.AA0080020form1.PeekerCalNo.executePScriptOnLoad = function () {
  console.log('execute AA0080020form1/PeekerCalNo.onLoad');
  var targetComponent = document.getElementById('expj-AA0080020-AA0080020form1-PeekerCalNo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0080020-AA0080020form1-PeekerCalNo" class="AA0080020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0080020-AA0080020form1-CAL_NAME">
expj.AA0080020.AA0080020form1.CAL_NAME = {};
expj.AA0080020.AA0080020form1.CAL_NAME.executeAllOnDecision = function () {
  console.log('execute AA0080020form1/CAL_NAME.onDecision');
  expj.AA0080020.AA0080020form1.executeAllOnDecision();
  expj.AA0080020.executeAllOnDecision();
};
expj.AA0080020.AA0080020form1.CAL_NAME.executeOnLoad = function () {
  $('#expj-AA0080020-AA0080020form1-CAL_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0080020', 'AA0080020form1', 'CAL_NAME', this);
  });
  expj.AA0080020.AA0080020form1.CAL_NAME.executePScriptOnLoad();
};

expj.AA0080020.AA0080020form1.CAL_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0080020form1/CAL_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0080020-AA0080020form1-CAL_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:430px;text-align:left;"><input type="text" id="expj-AA0080020-AA0080020form1-CAL_NAME" name="CAL_NAME" class="AA0080020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0080020Struct.getCAL_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AA0080020-AA0080020form1-HEAD_DATE" name="HEAD_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0080020Struct.getHEAD_DATE()) %>">
<script class="expj-script-AA0080020-AA0080020form1-HEAD_DATE">
expj.AA0080020.AA0080020form1.HEAD_DATE = {};
expj.AA0080020.AA0080020form1.HEAD_DATE.executeAllOnDecision = function () {
  console.log('execute AA0080020form1/HEAD_DATE.onDecision');
  expj.AA0080020.AA0080020form1.executeAllOnDecision();
  expj.AA0080020.executeAllOnDecision();
};
expj.AA0080020.AA0080020form1.HEAD_DATE.executeOnLoad = function () {
  $('#expj-AA0080020-AA0080020form1-HEAD_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0080020', 'AA0080020form1', 'HEAD_DATE', this);
  });
  expj.AA0080020.AA0080020form1.HEAD_DATE.executePScriptOnLoad();
};

expj.AA0080020.AA0080020form1.HEAD_DATE.executePScriptOnLoad = function () {
  console.log('execute AA0080020form1/HEAD_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AA0080020-AA0080020form1-HEAD_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AA0080020-AA0080020form1-h_TIME_CTRL" name="h_TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0080020Struct.geth_TIME_CTRL()) %>">
<script class="expj-script-AA0080020-AA0080020form1-h_TIME_CTRL">
expj.AA0080020.AA0080020form1.h_TIME_CTRL = {};
expj.AA0080020.AA0080020form1.h_TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AA0080020form1/h_TIME_CTRL.onDecision');
  expj.AA0080020.AA0080020form1.executeAllOnDecision();
  expj.AA0080020.executeAllOnDecision();
};
expj.AA0080020.AA0080020form1.h_TIME_CTRL.executeOnLoad = function () {
  $('#expj-AA0080020-AA0080020form1-h_TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0080020', 'AA0080020form1', 'h_TIME_CTRL', this);
  });
  expj.AA0080020.AA0080020form1.h_TIME_CTRL.executePScriptOnLoad();
};

expj.AA0080020.AA0080020form1.h_TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AA0080020form1/h_TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AA0080020-AA0080020form1-h_TIME_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0117",rb)%></span><!-- 作成済期間 --></div><!--/td-->
<script class="expj-script-AA0080020-AA0080020form1-DATE_FROM">
expj.AA0080020.AA0080020form1.DATE_FROM = {};
expj.AA0080020.AA0080020form1.DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AA0080020form1/DATE_FROM.onDecision');
  expj.AA0080020.AA0080020form1.executeAllOnDecision();
  expj.AA0080020.executeAllOnDecision();
};
expj.AA0080020.AA0080020form1.DATE_FROM.executeOnLoad = function () {
  $('#expj-AA0080020-AA0080020form1-DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0080020', 'AA0080020form1', 'DATE_FROM', this);
  });
  expj.AA0080020.AA0080020form1.DATE_FROM.executePScriptOnLoad();
};

expj.AA0080020.AA0080020form1.DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AA0080020form1/DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AA0080020-AA0080020form1-DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0080020-AA0080020form1-DATE_FROM" name="DATE_FROM" class="AA0080020-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAA0080020Struct.getDATE_FROM()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AA0080020-AA0080020form1-DATE_TO">
expj.AA0080020.AA0080020form1.DATE_TO = {};
expj.AA0080020.AA0080020form1.DATE_TO.executeAllOnDecision = function () {
  console.log('execute AA0080020form1/DATE_TO.onDecision');
  expj.AA0080020.AA0080020form1.executeAllOnDecision();
  expj.AA0080020.executeAllOnDecision();
};
expj.AA0080020.AA0080020form1.DATE_TO.executeOnLoad = function () {
  $('#expj-AA0080020-AA0080020form1-DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0080020', 'AA0080020form1', 'DATE_TO', this);
  });
  expj.AA0080020.AA0080020form1.DATE_TO.executePScriptOnLoad();
};

expj.AA0080020.AA0080020form1.DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AA0080020form1/DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AA0080020-AA0080020form1-DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="text" id="expj-AA0080020-AA0080020form1-DATE_TO" name="DATE_TO" class="AA0080020-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAA0080020Struct.getDATE_TO()) %>" maxlength="2147483647" disabled></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0080020-AA0080020button1">
expj.AA0080020.AA0080020button1 = {};
expj.AA0080020.AA0080020button1.executeAllOnDecision = function () {
  console.log('execute AA0080020button1.onDecision');
};
expj.AA0080020.AA0080020button1.executeOnLoad = function () {
  expj.AA0080020.AA0080020button1.executePScriptOnLoad();
};

expj.AA0080020.AA0080020button1.executePScriptOnLoad = function () {
  console.log('execute AA0080020button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0080020-AA0080020button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0080020-AA0080020button1-select">
expj.AA0080020.AA0080020button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0080020form1/*,_AA0080020view1/*@AA0080020Servlet"
expj.AA0080020.AA0080020button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0080020', 'AA0080020button1', '_AA0080020form1/*,_AA0080020view1/*', 'AA0080020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0080020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0080020', response);
expj.common.updateBusinessScreenTab('AA0080020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0080020.AA0080020button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0080020.AA0080020button1.select['onClick' + i])) {
        expj.AA0080020.AA0080020button1.select['onClick' + i]();
      }
    }
  }
};
expj.AA0080020.AA0080020button1.select.executeAllOnDecision = function () {
};
expj.AA0080020.AA0080020button1.select.executeOnLoad = function () {
  $('#expj-AA0080020-AA0080020button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0080020', 'AA0080020button1', 'select', this, 'Button');
    }
  });
  expj.AA0080020.AA0080020button1.select.executePScriptOnLoad();
};

expj.AA0080020.AA0080020button1.select.executePScriptOnLoad = function () {
  console.log('execute AA0080020button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AA0080020-AA0080020button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0080020-AA0080020button1-select" name="select" class="AA0080020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AA0080020-AA0080020view1">
expj.AA0080020.AA0080020view1 = {};
expj.AA0080020.AA0080020view1.executeAllOnClick = function () {
};
expj.AA0080020.AA0080020view1.executeAllOnDecision = function () {
  console.log('execute AA0080020view1.onDecision');
};
expj.AA0080020.AA0080020view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0080020view1", "expj.AA0080020.AA0080020view1.executeAllOnClick");
%>
  expj.AA0080020.AA0080020view1.executePScriptOnLoad();
};

expj.AA0080020.AA0080020view1.executePScriptOnLoad = function () {
  console.log('execute AA0080020view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0080020-AA0080020view1" class="expj-datagrid-view expj-view-noselect" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%= TypeConverter.sanitizer(aAA0080020Control.getReadStatusString()) %>"></div>
<!-- VIEW END -->
<%
 String AA0080020view1_Id = "AA0080020view1";
 String AA0080020view1_select = "single";
 String AA0080020view1_sortable = "true";
 String AA0080020view1_resize = "true";
 String AA0080020view1_scroll = "true";
 StringBuffer AA0080020view1_HB = new StringBuffer();
 StringBuffer AA0080020view1_DB = new StringBuffer();
%>
<%
 AA0080020view1_select = "none";
 AA0080020view1_sortable = "false";
 AA0080020view1_resize = "true";
 AA0080020view1_scroll = "true";
%>
<%
 AA0080020view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0080020view1_sortable).append("}").append(",");
%>
     <script class="expj-script-AA0080020-AA0080020view1-HOLIDAY_FLG">
expj.AA0080020.AA0080020view1.HOLIDAY_FLG = {};
expj.AA0080020.AA0080020view1.HOLIDAY_FLG.executeAllOnClick = function () {
};
expj.AA0080020.AA0080020view1.HOLIDAY_FLG.executeAllOnDecision = function () {
  console.log('execute AA0080020view1/HOLIDAY_FLG.onDecision');
  expj.AA0080020.AA0080020view1.executeAllOnDecision();
  expj.AA0080020.executeAllOnDecision();
};
expj.AA0080020.AA0080020view1.HOLIDAY_FLG.executeOnLoad = function () {
  $('.expj-AA0080020-AA0080020view1-HOLIDAY_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0080020', 'AA0080020view1', 'HOLIDAY_FLG', this);
  });
  expj.AA0080020.AA0080020view1.HOLIDAY_FLG.executePScriptOnLoad();
};

expj.AA0080020.AA0080020view1.HOLIDAY_FLG.executePScriptOnLoad = function () {
  console.log('execute AA0080020view1/HOLIDAY_FLG.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AA0080020-AA0080020view1-CAL_COMMENT">
expj.AA0080020.AA0080020view1.CAL_COMMENT = {};
expj.AA0080020.AA0080020view1.CAL_COMMENT.executeAllOnClick = function () {
};
expj.AA0080020.AA0080020view1.CAL_COMMENT.executeAllOnDecision = function () {
  console.log('execute AA0080020view1/CAL_COMMENT.onDecision');
  expj.AA0080020.AA0080020view1.executeAllOnDecision();
  expj.AA0080020.executeAllOnDecision();
};
expj.AA0080020.AA0080020view1.CAL_COMMENT.executeOnLoad = function () {
  $('.expj-AA0080020-AA0080020view1-CAL_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0080020', 'AA0080020view1', 'CAL_COMMENT', this);
  });
  expj.AA0080020.AA0080020view1.CAL_COMMENT.executePScriptOnLoad();
};

expj.AA0080020.AA0080020view1.CAL_COMMENT.executePScriptOnLoad = function () {
  console.log('execute AA0080020view1/CAL_COMMENT.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AA0080020-AA0080020view1-c_HOLIDAY_FLG">
expj.AA0080020.AA0080020view1.c_HOLIDAY_FLG = {};
expj.AA0080020.AA0080020view1.c_HOLIDAY_FLG.executeAllOnClick = function () {
};
expj.AA0080020.AA0080020view1.c_HOLIDAY_FLG.executeAllOnDecision = function () {
  console.log('execute AA0080020view1/c_HOLIDAY_FLG.onDecision');
  expj.AA0080020.AA0080020view1.executeAllOnDecision();
  expj.AA0080020.executeAllOnDecision();
};
expj.AA0080020.AA0080020view1.c_HOLIDAY_FLG.executeOnLoad = function () {
  $('.expj-AA0080020-AA0080020view1-c_HOLIDAY_FLG').click(function () {
    var component = this;
    if (!component.hasAttribute('disabled')) {
      setTimeout(function () {
        expj.common.pscript.executeOnClickEvent('AA0080020', 'AA0080020view1', 'c_HOLIDAY_FLG', component, 'CheckBox');
      }, 0);
    }
  });
  expj.AA0080020.AA0080020view1.c_HOLIDAY_FLG.executePScriptOnLoad();
};

expj.AA0080020.AA0080020view1.c_HOLIDAY_FLG.executePScriptOnLoad = function () {
  console.log('execute AA0080020view1/c_HOLIDAY_FLG.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>

<script class="expj-script-AA0080020-AA0080020view1-ASP_SHIFT_CD">
expj.AA0080020.AA0080020view1.ASP_SHIFT_CD = {};
expj.AA0080020.AA0080020view1.ASP_SHIFT_CD.executeAllOnClick = function () {
};
expj.AA0080020.AA0080020view1.ASP_SHIFT_CD.executeAllOnDecision = function () {
  console.log('execute AA0080020view1/ASP_SHIFT_CD.onDecision');
  expj.AA0080020.AA0080020view1.executeAllOnDecision();
  expj.AA0080020.executeAllOnDecision();
};
expj.AA0080020.AA0080020view1.ASP_SHIFT_CD.executeOnLoad = function () {
  $('.expj-AA0080020-AA0080020view1-ASP_SHIFT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0080020', 'AA0080020view1', 'ASP_SHIFT_CD', this);
  });
  expj.AA0080020.AA0080020view1.ASP_SHIFT_CD.executePScriptOnLoad();
};

expj.AA0080020.AA0080020view1.ASP_SHIFT_CD.executePScriptOnLoad = function () {
  console.log('execute AA0080020view1/ASP_SHIFT_CD.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 
<%
AA0080020view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0080020view1_sortable).append("}").append(",");
AA0080020view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'HOLIDAY_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0080020view1_sortable).append("}").append(",");
AA0080020view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0080020view1_sortable).append("}").append(",");
AA0080020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CAL_DATE",rb))).append("', 'name':'CAL_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0080020view1_sortable).append("}").append(",");
AA0080020view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0101",rb))).append("', 'name':'CAL_DATE_WEEK', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0080020view1_sortable).append("}").append(",");
AA0080020view1_HB.append("{'visible':true, 'type':'string', 'width':'300px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CAL_COMMENT",rb))).append("', 'name':'CAL_COMMENT', 'class':'expj-tooltip expj-view-cell-textinput', 'sortable':").append(AA0080020view1_sortable).append("}").append(",");
AA0080020view1_HB.append("{'visible':true, 'type':'string', 'width':'40px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0100",rb))).append("', 'name':'c_HOLIDAY_FLG', 'class':'expj-tooltip expj-view-cell-checkbox', 'sortable':").append(AA0080020view1_sortable).append("}").append(",");
AA0080020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ASP_SHIFT_CD",rb))).append("', 'name':'ASP_SHIFT_CD', 'class':'expj-tooltip expj-view-cell-textinput', 'sortable':").append(AA0080020view1_sortable).append("}").append(",");
%>
<%
 int aAA0080020StructLength = aAA0080020Control.getListsize();
 final AA0080020Struct structBackup = aAA0080020Struct;
 aAA0080020Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0080020StructLength; ++loopCount) {
  if((aAA0080020Struct = (AA0080020Struct) aAA0080020Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0080020Struct", aAA0080020Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AA0080020view1_DB.append("[");
 AA0080020view1_DB.append(loopCount);
%> <%
    String canSelect = "true";
    int sts_val = 0;
    if(aAA0080020Struct.geth_TIME_CTRL() != null) {
    	sts_val =  Integer.parseInt(aAA0080020Struct.geth_TIME_CTRL());
		
    }
	    
    if(sts_val == 0){
        canSelect = "false";
    }else{
		canSelect = "true";
	}
%> <%
 AA0080020view1_DB.append(",''");
 AA0080020view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AA0080020-AA0080020view1-HOLIDAY_FLG-").append(loopCount).append("\" class=\"expj-AA0080020-AA0080020view1-HOLIDAY_FLG AA0080020-focus-move\" data-name=\"HOLIDAY_FLG\" data-view=\"true\" maxlength=\"2147483647\" data-kind=\"").append("").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAA0080020Struct.getHOLIDAY_FLG())).append("\">'");
 AA0080020view1_DB.append(",").append("'<span id=\"expj-AA0080020-AA0080020view1-MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AA0080020-AA0080020view1-MODIFY_COUNT\" data-name=\"MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0080020Struct.getMODIFY_COUNT())).append("</span>'");
 AA0080020view1_DB.append(",").append("'<span id=\"expj-AA0080020-AA0080020view1-CAL_DATE-").append(loopCount).append("\" class=\"expj-label expj-AA0080020-AA0080020view1-CAL_DATE\" data-name=\"CAL_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAA0080020Struct.getCAL_DATE())).append("</span>'");
 AA0080020view1_DB.append(",").append("'<span id=\"expj-AA0080020-AA0080020view1-CAL_DATE_WEEK-").append(loopCount).append("\" class=\"expj-label expj-AA0080020-AA0080020view1-CAL_DATE_WEEK\" data-name=\"CAL_DATE_WEEK\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0080020Struct.getCAL_DATE_WEEK())).append("</span>'");
 AA0080020view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AA0080020-AA0080020view1-CAL_COMMENT-").append(loopCount).append("\" class=\"expj-AA0080020-AA0080020view1-CAL_COMMENT AA0080020-focus-move\" data-name=\"CAL_COMMENT\" data-view=\"true\" maxlength=\"80\" data-kind=\"").append("").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAA0080020Struct.getCAL_COMMENT())).append("\">'");
 AA0080020view1_DB.append(",").append("'<input type=\"checkbox\" id=\"expj-AA0080020-AA0080020view1-c_HOLIDAY_FLG-").append(loopCount).append("\" class=\"expj-AA0080020-AA0080020view1-c_HOLIDAY_FLG AA0080020-focus-move\" data-name=\"c_HOLIDAY_FLG\" data-view=\"true\"").append("true".equals(TypeConverter.convert(aAA0080020Struct.getc_HOLIDAY_FLG())) ? " checked=\"checked\"" : "").append("").append(">'");
 AA0080020view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AA0080020-AA0080020view1-ASP_SHIFT_CD-").append(loopCount).append("\" class=\"expj-AA0080020-AA0080020view1-ASP_SHIFT_CD AA0080020-focus-move\" data-name=\"ASP_SHIFT_CD\" data-view=\"true\" maxlength=\"100\" data-kind=\"").append("").append("\"").append("false".equals( canSelect ) ? " disabled=\"disabled\"" : "").append(" value=\"").append(TypeConverter.sanitizer(aAA0080020Struct.getASP_SHIFT_CD())).append("\">'");
 AA0080020view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAA0080020StructLength) {
   AA0080020view1_DB.append(",");
  }
 }
 aAA0080020Struct = structBackup;
 viewIdList.add(AA0080020view1_Id);
 viewSelectList.add(AA0080020view1_select);
 viewResizeList.add(AA0080020view1_resize);
 viewScrollList.add(AA0080020view1_scroll);
 viewHeaderDataList.add(AA0080020view1_HB);
 viewBodyDataList.add(AA0080020view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-AA0080020-AA0080020button2">
expj.AA0080020.AA0080020button2 = {};
expj.AA0080020.AA0080020button2.executeAllOnDecision = function () {
  console.log('execute AA0080020button2.onDecision');
};
expj.AA0080020.AA0080020button2.executeOnLoad = function () {
  expj.AA0080020.AA0080020button2.executePScriptOnLoad();
};

expj.AA0080020.AA0080020button2.executePScriptOnLoad = function () {
  console.log('execute AA0080020button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0080020-AA0080020button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0080020-AA0080020button2-update">
expj.AA0080020.AA0080020button2.update = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0080020form1/*,_AA0080020view1/*@AA0080020Servlet,,$ZZ07003"
expj.AA0080020.AA0080020button2.update.onClick0 = function () {
  console.log('update script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0080020', 'AA0080020button2', '_AA0080020form1/*,_AA0080020view1/*', 'AA0080020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0080020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0080020', response);
expj.common.updateBusinessScreenTab('AA0080020', contents);
};
expj.common.pscript.callConfirm('AA0080020', 'AA0080020button2', 'ZZ07003', okEvent);
};
expj.AA0080020.AA0080020button2.update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0080020.AA0080020button2.update['onClick' + i])) {
        expj.AA0080020.AA0080020button2.update['onClick' + i]();
      }
    }
  }
};
expj.AA0080020.AA0080020button2.update.executeAllOnDecision = function () {
};
expj.AA0080020.AA0080020button2.update.executeOnLoad = function () {
  $('#expj-AA0080020-AA0080020button2-update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0080020', 'AA0080020button2', 'update', this, 'Button');
    }
  });
  expj.AA0080020.AA0080020button2.update.executePScriptOnLoad();
};

expj.AA0080020.AA0080020button2.update.executePScriptOnLoad = function () {
  console.log('execute AA0080020button2/update.onLoad');
  var targetComponent = document.getElementById('expj-AA0080020-AA0080020button2-update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0080020-AA0080020button2-update" name="update" class="AA0080020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-AA0080020-AA0080020button2-before">
expj.AA0080020.AA0080020button2.before = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0080020form1/*,_AA0080020view1/*@AA0080020Servlet"
expj.AA0080020.AA0080020button2.before.onClick0 = function () {
  console.log('before script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0080020', 'AA0080020button2', '_AA0080020form1/*,_AA0080020view1/*', 'AA0080020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0080020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0080020', response);
expj.common.updateBusinessScreenTab('AA0080020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0080020.AA0080020button2.before.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0080020.AA0080020button2.before['onClick' + i])) {
        expj.AA0080020.AA0080020button2.before['onClick' + i]();
      }
    }
  }
};
expj.AA0080020.AA0080020button2.before.executeAllOnDecision = function () {
};
expj.AA0080020.AA0080020button2.before.executeOnLoad = function () {
  $('#expj-AA0080020-AA0080020button2-before').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0080020', 'AA0080020button2', 'before', this, 'Button');
    }
  });
  expj.AA0080020.AA0080020button2.before.executePScriptOnLoad();
};

expj.AA0080020.AA0080020button2.before.executePScriptOnLoad = function () {
  console.log('execute AA0080020button2/before.onLoad');
  var targetComponent = document.getElementById('expj-AA0080020-AA0080020button2-before');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0080020-AA0080020button2-before" name="before" class="AA0080020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnBeforeMonth",rb)%></button><!-- 前月ボタン --></div><!--/td-->
<script class="expj-script-AA0080020-AA0080020button2-next">
expj.AA0080020.AA0080020button2.next = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0080020form1/*,_AA0080020view1/*@AA0080020Servlet"
expj.AA0080020.AA0080020button2.next.onClick0 = function () {
  console.log('next script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0080020', 'AA0080020button2', '_AA0080020form1/*,_AA0080020view1/*', 'AA0080020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0080020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0080020', response);
expj.common.updateBusinessScreenTab('AA0080020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0080020.AA0080020button2.next.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0080020.AA0080020button2.next['onClick' + i])) {
        expj.AA0080020.AA0080020button2.next['onClick' + i]();
      }
    }
  }
};
expj.AA0080020.AA0080020button2.next.executeAllOnDecision = function () {
};
expj.AA0080020.AA0080020button2.next.executeOnLoad = function () {
  $('#expj-AA0080020-AA0080020button2-next').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0080020', 'AA0080020button2', 'next', this, 'Button');
    }
  });
  expj.AA0080020.AA0080020button2.next.executePScriptOnLoad();
};

expj.AA0080020.AA0080020button2.next.executePScriptOnLoad = function () {
  console.log('execute AA0080020button2/next.onLoad');
  var targetComponent = document.getElementById('expj-AA0080020-AA0080020button2-next');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0080020-AA0080020button2-next" name="next" class="AA0080020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnNextMonth",rb)%></button><!-- 翌月ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 399px);"></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 410px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AA0080020 Revision: 1.4  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:420px;">
<script class="expj-script-AA0080020-AA0080020button0">
expj.AA0080020.AA0080020button0 = {};
expj.AA0080020.AA0080020button0.executeAllOnDecision = function () {
  console.log('execute AA0080020button0.onDecision');
};
expj.AA0080020.AA0080020button0.executeOnLoad = function () {
  expj.AA0080020.AA0080020button0.executePScriptOnLoad();
};

expj.AA0080020.AA0080020button0.executePScriptOnLoad = function () {
  console.log('execute AA0080020button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0080020-AA0080020button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0080020-AA0080020button0-insert">
expj.AA0080020.AA0080020button0.insert = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0080020form1/*,_AA0080020view1/*@AA0080020Servlet"
expj.AA0080020.AA0080020button0.insert.onClick0 = function () {
  console.log('insert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0080020', 'AA0080020button0', '_AA0080020form1/*,_AA0080020view1/*', 'AA0080020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0080020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0080020', response);
expj.common.changeBusinessScreenTab('AA0080020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0080020.AA0080020button0.insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0080020.AA0080020button0.insert['onClick' + i])) {
        expj.AA0080020.AA0080020button0.insert['onClick' + i]();
      }
    }
  }
};
expj.AA0080020.AA0080020button0.insert.executeAllOnDecision = function () {
};
expj.AA0080020.AA0080020button0.insert.executeOnLoad = function () {
  $('#expj-AA0080020-AA0080020button0-insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0080020', 'AA0080020button0', 'insert', this, 'Button');
    }
  });
  expj.AA0080020.AA0080020button0.insert.executePScriptOnLoad();
};

expj.AA0080020.AA0080020button0.insert.executePScriptOnLoad = function () {
  console.log('execute AA0080020button0/insert.onLoad');
  var targetComponent = document.getElementById('expj-AA0080020-AA0080020button0-insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0080020-AA0080020button0-insert" name="insert" class="AA0080020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsertCurender",rb)%></button><!-- カレンダ作成ボタン --></div><!--/td-->
<script class="expj-script-AA0080020-AA0080020button0-change">
expj.AA0080020.AA0080020button0.change = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0080020form1/*,_AA0080020view1/*@AA0080020Servlet"
expj.AA0080020.AA0080020button0.change.onClick0 = function () {
  console.log('change script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0080020', 'AA0080020button0', '_AA0080020form1/*,_AA0080020view1/*', 'AA0080020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0080020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0080020', response);
expj.common.changeBusinessScreenTab('AA0080020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0080020.AA0080020button0.change.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0080020.AA0080020button0.change['onClick' + i])) {
        expj.AA0080020.AA0080020button0.change['onClick' + i]();
      }
    }
  }
};
expj.AA0080020.AA0080020button0.change.executeAllOnDecision = function () {
};
expj.AA0080020.AA0080020button0.change.executeOnLoad = function () {
  $('#expj-AA0080020-AA0080020button0-change').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0080020', 'AA0080020button0', 'change', this, 'Button');
    }
  });
  expj.AA0080020.AA0080020button0.change.executePScriptOnLoad();
};

expj.AA0080020.AA0080020button0.change.executePScriptOnLoad = function () {
  console.log('execute AA0080020button0/change.onLoad');
  var targetComponent = document.getElementById('expj-AA0080020-AA0080020button0-change');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0080020-AA0080020button0-change" name="change" class="AA0080020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnResetHoliday",rb)%></button><!-- 休日再設定ボタン --></div><!--/td-->
<script class="expj-script-AA0080020-AA0080020button0-clear">
expj.AA0080020.AA0080020button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0080020form1/*,_AA0080020view1/*@AA0080020Servlet,,$ZZ07008"
expj.AA0080020.AA0080020button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0080020', 'AA0080020button0', '_AA0080020form1/*,_AA0080020view1/*', 'AA0080020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0080020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0080020', response);
expj.common.updateBusinessScreenTab('AA0080020', contents);
};
expj.common.pscript.callConfirm('AA0080020', 'AA0080020button0', 'ZZ07008', okEvent);
};
expj.AA0080020.AA0080020button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0080020.AA0080020button0.clear['onClick' + i])) {
        expj.AA0080020.AA0080020button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AA0080020.AA0080020button0.clear.executeAllOnDecision = function () {
};
expj.AA0080020.AA0080020button0.clear.executeOnLoad = function () {
  $('#expj-AA0080020-AA0080020button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0080020', 'AA0080020button0', 'clear', this, 'Button');
    }
  });
  expj.AA0080020.AA0080020button0.clear.executePScriptOnLoad();
};

expj.AA0080020.AA0080020button0.clear.executePScriptOnLoad = function () {
  console.log('execute AA0080020button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AA0080020-AA0080020button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0080020-AA0080020button0-clear" name="clear" class="AA0080020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AA0080020-AA0080020button0-close">
expj.AA0080020.AA0080020button0.close = {};
// script1="onClick;0;CLOSE"
expj.AA0080020.AA0080020button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AA0080020');
};
expj.AA0080020.AA0080020button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0080020.AA0080020button0.close['onClick' + i])) {
        expj.AA0080020.AA0080020button0.close['onClick' + i]();
      }
    }
  }
};
expj.AA0080020.AA0080020button0.close.executeAllOnDecision = function () {
};
expj.AA0080020.AA0080020button0.close.executeOnLoad = function () {
  $('#expj-AA0080020-AA0080020button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0080020', 'AA0080020button0', 'close', this, 'Button');
    }
  });
  expj.AA0080020.AA0080020button0.close.executePScriptOnLoad();
};

expj.AA0080020.AA0080020button0.close.executePScriptOnLoad = function () {
  console.log('execute AA0080020button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AA0080020-AA0080020button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0080020-AA0080020button0-close" name="close" class="AA0080020-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0080020 (END)-->
<%
MessageStruct msgStruct = aAA0080020Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0080020-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0080020)) {
  expj.common.treeInstanceMap.AA0080020 = {};
}
expj.common.treeInstanceMap.AA0080020.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0080020.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0080020.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0080020.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0080020.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0080020.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0080020.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0080020.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0080020.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0080020-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0080020-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0080020)) {
  expj.common.detailDialogMap.AA0080020 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0080020._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0080020._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0080020.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0080020.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0080020.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0080020.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0080020.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0080020.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0080020.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0080020.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0080020-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0080020.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0080020-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0080020.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0080020-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0080020.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0080020.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0080020.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0080020._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0080020-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0080020)) {
  expj.common.viewInstanceMap.AA0080020 = {};
}
expj.common.viewInstanceMap.AA0080020.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0080020.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0080020.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0080020.<%=viewId %>.init = function () {
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
    expj.AA0080020.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0080020.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0080020-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0080020-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0080020_init">
/**
 * AA0080020用のロード完了時初期化関数
 */
expj.AA0080020.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0080020');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0080020');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0080020');
  expj.common.calendarInstanceMap.AA0080020 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0080020.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0080020.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0080020.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0080020.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0080020.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0080020');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0080020');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0080020-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0080020-<%=detailId %>');
<%
 }
%>
  try{expj.AA0080020.AA0080020form1.CAL_NO.executeOnLoad();}catch(e){};
  try{expj.AA0080020.AA0080020form1.PeekerCalNo.executeOnLoad();}catch(e){};
  try{expj.AA0080020.AA0080020form1.CAL_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0080020.AA0080020form1.HEAD_DATE.executeOnLoad();}catch(e){};
  try{expj.AA0080020.AA0080020form1.h_TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AA0080020.AA0080020form1.DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AA0080020.AA0080020form1.DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AA0080020.AA0080020button1.select.executeOnLoad();}catch(e){};
  try{expj.AA0080020.AA0080020view1.HOLIDAY_FLG.executeOnLoad();}catch(e){};
  try{expj.AA0080020.AA0080020view1.CAL_COMMENT.executeOnLoad();}catch(e){};
  try{expj.AA0080020.AA0080020view1.c_HOLIDAY_FLG.executeOnLoad();}catch(e){};
  try{expj.AA0080020.AA0080020view1.ASP_SHIFT_CD.executeOnLoad();}catch(e){};
  try{expj.AA0080020.AA0080020button2.update.executeOnLoad();}catch(e){};
  try{expj.AA0080020.AA0080020button2.before.executeOnLoad();}catch(e){};
  try{expj.AA0080020.AA0080020button2.next.executeOnLoad();}catch(e){};
  try{expj.AA0080020.AA0080020button0.insert.executeOnLoad();}catch(e){};
  try{expj.AA0080020.AA0080020button0.change.executeOnLoad();}catch(e){};
  try{expj.AA0080020.AA0080020button0.clear.executeOnLoad();}catch(e){};
  try{expj.AA0080020.AA0080020button0.close.executeOnLoad();}catch(e){};
  try{expj.AA0080020.AA0080020form1.executeOnLoad();}catch(e){};
  try{expj.AA0080020.AA0080020button1.executeOnLoad();}catch(e){};
  try{expj.AA0080020.AA0080020view1.executeOnLoad();}catch(e){};
  try{expj.AA0080020.AA0080020button2.executeOnLoad();}catch(e){};
  try{expj.AA0080020.AA0080020button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0080020.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0080020', 'AA0080020');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0080020');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0080020-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0080020-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0080020', '<%=request.getContextPath() %>');
};

/**
 * AA0080020の全体onDecision処理
 */
expj.AA0080020.executeAllOnDecision = function () {
  expj.AA0080020.AA0080020form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0080020_console">
expj.AA0080020.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>