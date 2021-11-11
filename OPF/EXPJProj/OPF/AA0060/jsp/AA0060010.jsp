<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:22:08 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0060\AA0060010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0060.*" %>
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
<jsp:useBean id="aAA0060010Control" class="com.nec.jp.orteus.metamorBase.AA0060.AA0060010Control" scope="request"/>
<jsp:useBean id="aAA0060010Struct" class="com.nec.jp.orteus.metamorBase.AA0060.AA0060010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

作業区メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0060/jsp/AA0060010.jsp,v $
$Author: geng-jia $    
$Revision: 1.7 $ $Date: 2017/02/22 02:03:53 $
********************************************************* --%>
<html>
<head>
<title>作業区メンテナンス</title>
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
<script class="expj-script-AA0060010_init">
  // AA0060010名前空間
  expj.AA0060010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AA0060010" data-screen="AA0060010" data-newdata="<%=aAA0060010Control.isNewData() %>">
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
              <script class="expj-script-AA0060010-AA0060010form1">
expj.AA0060010.AA0060010form1 = {};
// script1="onLoad;0;CALL;child@0,3,14,18"
expj.AA0060010.AA0060010form1.onLoad0 = function () {
  console.log('AA0060010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child3)){this.child3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child14)){this.child14();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child18)){this.child18();}
};
// script2="child;0;CHK;?AA0060010form1/*[eq]NORMAL@*1,*2"
expj.AA0060010.AA0060010form1.child0 = function () {
  console.log('AA0060010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0060010', 'AA0060010form1', '?AA0060010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;MASK;_AA0060010button2/insert"
expj.AA0060010.AA0060010form1.child1 = function () {
  console.log('AA0060010form1 script3');
expj.common.pscript.setMaskToReferenceComponent('AA0060010', 'AA0060010form1', '_AA0060010button2/insert');
};
// script4="child;2;MASK;_AA0060010button2/update,_AA0060010button2/delete"
expj.AA0060010.AA0060010form1.child2 = function () {
  console.log('AA0060010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AA0060010', 'AA0060010form1', '_AA0060010button2/update');
expj.common.pscript.setMaskToReferenceComponent('AA0060010', 'AA0060010form1', '_AA0060010button2/delete');
};
// script5="onDecision;0;CHK;1[eq]1@*3"
expj.AA0060010.AA0060010form1.onDecision0 = function () {
  console.log('AA0060010form1 script5');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;3;CHKRQ;A@*4,*5"
expj.AA0060010.AA0060010form1.child3 = function () {
  console.log('AA0060010form1 script6');
if (expj.common.pscript.satisfiedRequiredComponent('AA0060010', 'A')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="child;4;UNMASK;_AA0060010button1/select@*6"
expj.AA0060010.AA0060010form1.child4 = function () {
  console.log('AA0060010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AA0060010', 'AA0060010form1', '_AA0060010button1/select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script8="child;5;MASK;_AA0060010button1/select@*7"
expj.AA0060010.AA0060010form1.child5 = function () {
  console.log('AA0060010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AA0060010', 'AA0060010form1', '_AA0060010button1/select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child7)){this.child7();}}
};
// script9="child;6;CHK;?AA0060010form1/*[eq]INITIAL@*8,*9"
expj.AA0060010.AA0060010form1.child6 = function () {
  console.log('AA0060010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0060010', 'AA0060010form1', '?AA0060010form1/*'), '[eq]', 'INITIAL')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script10="child;7;MASK;_AA0060010button2/insert,_AA0060010button2/update"
expj.AA0060010.AA0060010form1.child7 = function () {
  console.log('AA0060010form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AA0060010', 'AA0060010form1', '_AA0060010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('AA0060010', 'AA0060010form1', '_AA0060010button2/update');
};
// script11="child;8;UNMASK;_AA0060010button2/insert"
expj.AA0060010.AA0060010form1.child8 = function () {
  console.log('AA0060010form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('AA0060010', 'AA0060010form1', '_AA0060010button2/insert');
};
// script12="child;9;CHK;_AA0060010form1/WS_CD[eq]_AA0060010form1/h_WS_CD@*10,*12"
expj.AA0060010.AA0060010form1.child9 = function () {
  console.log('AA0060010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0060010', 'AA0060010form1', '_AA0060010form1/WS_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0060010', 'AA0060010form1', '_AA0060010form1/h_WS_CD'))) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script13="child;10;MASK;_AA0060010button2/insert@*11"
expj.AA0060010.AA0060010form1.child10 = function () {
  console.log('AA0060010form1 script13');
expj.common.pscript.setMaskToReferenceComponent('AA0060010', 'AA0060010form1', '_AA0060010button2/insert');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child11)){this.child11();}}
};
// script14="child;11;UNMASK;_AA0060010button2/update"
expj.AA0060010.AA0060010form1.child11 = function () {
  console.log('AA0060010form1 script14');
expj.common.pscript.setUnMaskToReferenceComponent('AA0060010', 'AA0060010form1', '_AA0060010button2/update');
};
// script15="child;12;MASK;_AA0060010button2/update@*13"
expj.AA0060010.AA0060010form1.child12 = function () {
  console.log('AA0060010form1 script15');
expj.common.pscript.setMaskToReferenceComponent('AA0060010', 'AA0060010form1', '_AA0060010button2/update');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child13)){this.child13();}}
};
// script16="child;13;UNMASK;_AA0060010button2/insert"
expj.AA0060010.AA0060010form1.child13 = function () {
  console.log('AA0060010form1 script16');
expj.common.pscript.setUnMaskToReferenceComponent('AA0060010', 'AA0060010form1', '_AA0060010button2/insert');
};
// script17="onDecision;1;CHK;1[eq]1@*14"
expj.AA0060010.AA0060010form1.onDecision1 = function () {
  console.log('AA0060010form1 script17');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script18="child;14;CHK;?AA0060010form1/*[eq]NORMAL@*15,*17"
expj.AA0060010.AA0060010form1.child14 = function () {
  console.log('AA0060010form1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0060010', 'AA0060010form1', '?AA0060010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script19="child;15;CHK;_AA0060010form1/WS_CD[eq]_AA0060010form1/h_WS_CD@*16,*17"
expj.AA0060010.AA0060010form1.child15 = function () {
  console.log('AA0060010form1 script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0060010', 'AA0060010form1', '_AA0060010form1/WS_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0060010', 'AA0060010form1', '_AA0060010form1/h_WS_CD'))) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
} else {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script20="child;16;UNMASK;_AA0060010button2/delete"
expj.AA0060010.AA0060010form1.child16 = function () {
  console.log('AA0060010form1 script20');
expj.common.pscript.setUnMaskToReferenceComponent('AA0060010', 'AA0060010form1', '_AA0060010button2/delete');
};
// script21="child;17;MASK;_AA0060010button2/delete"
expj.AA0060010.AA0060010form1.child17 = function () {
  console.log('AA0060010form1 script21');
expj.common.pscript.setMaskToReferenceComponent('AA0060010', 'AA0060010form1', '_AA0060010button2/delete');
};
// script22="onDecision;2;CHK;1[eq]1@*18"
expj.AA0060010.AA0060010form1.onDecision2 = function () {
  console.log('AA0060010form1 script22');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script23="child;18;CHK;_AA0060010form2/CLASS_NAME_FLAG[eq]0@*19,*20"
expj.AA0060010.AA0060010form1.child18 = function () {
  console.log('AA0060010form1 script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0060010', 'AA0060010form1', '_AA0060010form2/CLASS_NAME_FLAG'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
} else {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
// script24="child;19;MASK;_AA0060010form2/WS_CLASS_01_CD,_AA0060010form2/PeekerWSClassCD01"
expj.AA0060010.AA0060010form1.child19 = function () {
  console.log('AA0060010form1 script24');
expj.common.pscript.setMaskToReferenceComponent('AA0060010', 'AA0060010form1', '_AA0060010form2/WS_CLASS_01_CD');
expj.common.pscript.setMaskToReferenceComponent('AA0060010', 'AA0060010form1', '_AA0060010form2/PeekerWSClassCD01');
};
// script25="child;20;UNMASK;_AA0060010form2/WS_CLASS_01_CD,_AA0060010form2/PeekerWSClassCD01"
expj.AA0060010.AA0060010form1.child20 = function () {
  console.log('AA0060010form1 script25');
expj.common.pscript.setUnMaskToReferenceComponent('AA0060010', 'AA0060010form1', '_AA0060010form2/WS_CLASS_01_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AA0060010', 'AA0060010form1', '_AA0060010form2/PeekerWSClassCD01');
};
expj.AA0060010.AA0060010form1.executeAllOnDecision = function () {
  console.log('execute AA0060010form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0060010.AA0060010form1['onDecision' + i])) {
        expj.AA0060010.AA0060010form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0060010.AA0060010form1.executeOnLoad = function () {
  expj.AA0060010.AA0060010form1.executePScriptOnLoad();
};

expj.AA0060010.AA0060010form1.executePScriptOnLoad = function () {
  console.log('execute AA0060010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0060010.AA0060010form1['onLoad' + i])) {
      expj.AA0060010.AA0060010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0060010-AA0060010form1" action="AA0060010Servlet" name="AA0060010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAA0060010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WS_CD",rb)%></span><!-- 作業区コード --></div><!--/td-->
<script class="expj-script-AA0060010-AA0060010form1-WS_CD">
expj.AA0060010.AA0060010form1.WS_CD = {};
expj.AA0060010.AA0060010form1.WS_CD.executeAllOnDecision = function () {
  console.log('execute AA0060010form1/WS_CD.onDecision');
  expj.AA0060010.AA0060010form1.executeAllOnDecision();
  expj.AA0060010.executeAllOnDecision();
};
expj.AA0060010.AA0060010form1.WS_CD.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010form1-WS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0060010', 'AA0060010form1', 'WS_CD', this);
  });
  expj.AA0060010.AA0060010form1.WS_CD.executePScriptOnLoad();
};

expj.AA0060010.AA0060010form1.WS_CD.executePScriptOnLoad = function () {
  console.log('execute AA0060010form1/WS_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010form1-WS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0060010-AA0060010form1-WS_CD" name="WS_CD" class="AA0060010-focus-move  required-value expj-AA0060010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0060010Struct.getWS_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0060010-AA0060010form1-PeekerWsCd">
expj.AA0060010.AA0060010form1.PeekerWsCd = {};
// script1="onClick;0;PEEKER;_AA0060010form1/WS_CD@<%=contextNo%>"
expj.AA0060010.AA0060010form1.PeekerWsCd.onClick0 = function () {
  console.log('PeekerWsCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0060010';
var parameterValues = 'PeekerWsCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AA0060010', 'PeekerWsCd', 'SQLPARAM_1', '<%=aAA0060010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0060010', 'AA0060010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0060010', 'AA0060010form1', '_AA0060010form1/WS_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WS_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0060010form1/WS_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0060010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0060010.AA0060010form1.PeekerWsCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0060010.AA0060010form1.PeekerWsCd['onClick' + i])) {
        expj.AA0060010.AA0060010form1.PeekerWsCd['onClick' + i]();
      }
    }
  }
};
expj.AA0060010.AA0060010form1.PeekerWsCd.executeAllOnDecision = function () {
};
expj.AA0060010.AA0060010form1.PeekerWsCd.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010form1-PeekerWsCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0060010', 'AA0060010form1', 'PeekerWsCd', this, 'Button');
    }
  });
  expj.AA0060010.AA0060010form1.PeekerWsCd.executePScriptOnLoad();
};

expj.AA0060010.AA0060010form1.PeekerWsCd.executePScriptOnLoad = function () {
  console.log('execute AA0060010form1/PeekerWsCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010form1-PeekerWsCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0060010-AA0060010form1-PeekerWsCd" class="AA0060010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<input type="hidden" id="expj-AA0060010-AA0060010form1-h_WS_CD" name="h_WS_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0060010Struct.geth_WS_CD()) %>">
<script class="expj-script-AA0060010-AA0060010form1-h_WS_CD">
expj.AA0060010.AA0060010form1.h_WS_CD = {};
expj.AA0060010.AA0060010form1.h_WS_CD.executeAllOnDecision = function () {
  console.log('execute AA0060010form1/h_WS_CD.onDecision');
  expj.AA0060010.AA0060010form1.executeAllOnDecision();
  expj.AA0060010.executeAllOnDecision();
};
expj.AA0060010.AA0060010form1.h_WS_CD.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010form1-h_WS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0060010', 'AA0060010form1', 'h_WS_CD', this);
  });
  expj.AA0060010.AA0060010form1.h_WS_CD.executePScriptOnLoad();
};

expj.AA0060010.AA0060010form1.h_WS_CD.executePScriptOnLoad = function () {
  console.log('execute AA0060010form1/h_WS_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010form1-h_WS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0060010-AA0060010form1-MODIFY_COUNT" name="MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0060010Struct.getMODIFY_COUNT()) %>">
<script class="expj-script-AA0060010-AA0060010form1-MODIFY_COUNT">
expj.AA0060010.AA0060010form1.MODIFY_COUNT = {};
expj.AA0060010.AA0060010form1.MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AA0060010form1/MODIFY_COUNT.onDecision');
  expj.AA0060010.AA0060010form1.executeAllOnDecision();
  expj.AA0060010.executeAllOnDecision();
};
expj.AA0060010.AA0060010form1.MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010form1-MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0060010', 'AA0060010form1', 'MODIFY_COUNT', this);
  });
  expj.AA0060010.AA0060010form1.MODIFY_COUNT.executePScriptOnLoad();
};

expj.AA0060010.AA0060010form1.MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AA0060010form1/MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010form1-MODIFY_COUNT');
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0060010-AA0060010button1">
expj.AA0060010.AA0060010button1 = {};
expj.AA0060010.AA0060010button1.executeAllOnDecision = function () {
  console.log('execute AA0060010button1.onDecision');
};
expj.AA0060010.AA0060010button1.executeOnLoad = function () {
  expj.AA0060010.AA0060010button1.executePScriptOnLoad();
};

expj.AA0060010.AA0060010button1.executePScriptOnLoad = function () {
  console.log('execute AA0060010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0060010-AA0060010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0060010-AA0060010button1-select">
expj.AA0060010.AA0060010button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0060010form1/*,_AA0060010form2/CLASS_NAME,_AA0060010form2/CLASS_NAME_FLAG@AA0060010Servlet"
expj.AA0060010.AA0060010button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0060010', 'AA0060010button1', '_AA0060010form1/*,_AA0060010form2/CLASS_NAME,_AA0060010form2/CLASS_NAME_FLAG', 'AA0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0060010', response);
expj.common.updateBusinessScreenTab('AA0060010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0060010.AA0060010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0060010.AA0060010button1.select['onClick' + i])) {
        expj.AA0060010.AA0060010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AA0060010.AA0060010button1.select.executeAllOnDecision = function () {
};
expj.AA0060010.AA0060010button1.select.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0060010', 'AA0060010button1', 'select', this, 'Button');
    }
  });
  expj.AA0060010.AA0060010button1.select.executePScriptOnLoad();
};

expj.AA0060010.AA0060010button1.select.executePScriptOnLoad = function () {
  console.log('execute AA0060010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0060010-AA0060010button1-select" name="select" class="AA0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AA0060010-AA0060010form2">
expj.AA0060010.AA0060010form2 = {};
expj.AA0060010.AA0060010form2.executeAllOnDecision = function () {
  console.log('execute AA0060010form2.onDecision');
};
expj.AA0060010.AA0060010form2.executeOnLoad = function () {
  expj.AA0060010.AA0060010form2.executePScriptOnLoad();
};

expj.AA0060010.AA0060010form2.executePScriptOnLoad = function () {
  console.log('execute AA0060010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0060010-AA0060010form2" action="AA0060010Servlet" name="AA0060010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:left"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WS_NAME",rb)%></span><!-- 作業区名 --></div><!--/td-->
<script class="expj-script-AA0060010-AA0060010form2-WS_NAME">
expj.AA0060010.AA0060010form2.WS_NAME = {};
expj.AA0060010.AA0060010form2.WS_NAME.executeAllOnDecision = function () {
  console.log('execute AA0060010form2/WS_NAME.onDecision');
  expj.AA0060010.AA0060010form2.executeAllOnDecision();
  expj.AA0060010.executeAllOnDecision();
};
expj.AA0060010.AA0060010form2.WS_NAME.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010form2-WS_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0060010', 'AA0060010form2', 'WS_NAME', this);
  });
  expj.AA0060010.AA0060010form2.WS_NAME.executePScriptOnLoad();
};

expj.AA0060010.AA0060010form2.WS_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0060010form2/WS_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010form2-WS_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-AA0060010-AA0060010form2-WS_NAME" name="WS_NAME" class="AA0060010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0060010Struct.getWS_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WS_TEL",rb)%></span></div><!--/td-->
<script class="expj-script-AA0060010-AA0060010form2-WS_TEL">
expj.AA0060010.AA0060010form2.WS_TEL = {};
expj.AA0060010.AA0060010form2.WS_TEL.executeAllOnDecision = function () {
  console.log('execute AA0060010form2/WS_TEL.onDecision');
  expj.AA0060010.AA0060010form2.executeAllOnDecision();
  expj.AA0060010.executeAllOnDecision();
};
expj.AA0060010.AA0060010form2.WS_TEL.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010form2-WS_TEL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0060010', 'AA0060010form2', 'WS_TEL', this);
  });
  expj.AA0060010.AA0060010form2.WS_TEL.executePScriptOnLoad();
};

expj.AA0060010.AA0060010form2.WS_TEL.executePScriptOnLoad = function () {
  console.log('execute AA0060010form2/WS_TEL.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010form2-WS_TEL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0060010-AA0060010form2-WS_TEL" name="WS_TEL" class="AA0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0060010Struct.getWS_TEL()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WS_PERSON_1",rb)%></span></div><!--/td-->
<script class="expj-script-AA0060010-AA0060010form2-WS_PERSON">
expj.AA0060010.AA0060010form2.WS_PERSON = {};
expj.AA0060010.AA0060010form2.WS_PERSON.executeAllOnDecision = function () {
  console.log('execute AA0060010form2/WS_PERSON.onDecision');
  expj.AA0060010.AA0060010form2.executeAllOnDecision();
  expj.AA0060010.executeAllOnDecision();
};
expj.AA0060010.AA0060010form2.WS_PERSON.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010form2-WS_PERSON').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0060010', 'AA0060010form2', 'WS_PERSON', this);
  });
  expj.AA0060010.AA0060010form2.WS_PERSON.executePScriptOnLoad();
};

expj.AA0060010.AA0060010form2.WS_PERSON.executePScriptOnLoad = function () {
  console.log('execute AA0060010form2/WS_PERSON.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010form2-WS_PERSON');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-AA0060010-AA0060010form2-WS_PERSON" name="WS_PERSON" class="AA0060010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0060010Struct.getWS_PERSON()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WH_CD",rb)%></span><!-- 保管区コード --></div><!--/td-->
<script class="expj-script-AA0060010-AA0060010form2-WH_CD">
expj.AA0060010.AA0060010form2.WH_CD = {};
expj.AA0060010.AA0060010form2.WH_CD.executeAllOnDecision = function () {
  console.log('execute AA0060010form2/WH_CD.onDecision');
  expj.AA0060010.AA0060010form2.executeAllOnDecision();
  expj.AA0060010.executeAllOnDecision();
};
expj.AA0060010.AA0060010form2.WH_CD.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010form2-WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0060010', 'AA0060010form2', 'WH_CD', this);
  });
  expj.AA0060010.AA0060010form2.WH_CD.executePScriptOnLoad();
};

expj.AA0060010.AA0060010form2.WH_CD.executePScriptOnLoad = function () {
  console.log('execute AA0060010form2/WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010form2-WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0060010-AA0060010form2-WH_CD" name="WH_CD" class="AA0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0060010Struct.getWH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0060010-AA0060010form2-PeekerWhCd">
expj.AA0060010.AA0060010form2.PeekerWhCd = {};
// script1="onClick;0;PEEKER;_AA0060010form2/WH_CD@<%=contextNo%>"
expj.AA0060010.AA0060010form2.PeekerWhCd.onClick0 = function () {
  console.log('PeekerWhCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0060010';
var parameterValues = 'PeekerWhCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AA0060010', 'PeekerWhCd', 'SQLPARAM_1', '<%=aAA0060010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0060010', 'AA0060010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0060010', 'AA0060010form2', '_AA0060010form2/WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0060010form2/WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0060010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0060010.AA0060010form2.PeekerWhCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0060010.AA0060010form2.PeekerWhCd['onClick' + i])) {
        expj.AA0060010.AA0060010form2.PeekerWhCd['onClick' + i]();
      }
    }
  }
};
expj.AA0060010.AA0060010form2.PeekerWhCd.executeAllOnDecision = function () {
};
expj.AA0060010.AA0060010form2.PeekerWhCd.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010form2-PeekerWhCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0060010', 'AA0060010form2', 'PeekerWhCd', this, 'Button');
    }
  });
  expj.AA0060010.AA0060010form2.PeekerWhCd.executePScriptOnLoad();
};

expj.AA0060010.AA0060010form2.PeekerWhCd.executePScriptOnLoad = function () {
  console.log('execute AA0060010form2/PeekerWhCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010form2-PeekerWhCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0060010-AA0060010form2-PeekerWhCd" class="AA0060010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0060010-AA0060010form2-WH_NAME">
expj.AA0060010.AA0060010form2.WH_NAME = {};
expj.AA0060010.AA0060010form2.WH_NAME.executeAllOnDecision = function () {
  console.log('execute AA0060010form2/WH_NAME.onDecision');
  expj.AA0060010.AA0060010form2.executeAllOnDecision();
  expj.AA0060010.executeAllOnDecision();
};
expj.AA0060010.AA0060010form2.WH_NAME.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010form2-WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0060010', 'AA0060010form2', 'WH_NAME', this);
  });
  expj.AA0060010.AA0060010form2.WH_NAME.executePScriptOnLoad();
};

expj.AA0060010.AA0060010form2.WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0060010form2/WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010form2-WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0060010-AA0060010form2-WH_NAME" name="WH_NAME" class="AA0060010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0060010Struct.getWH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SUB_WS_CD",rb)%></span><!-- 代替作業区コード --></div><!--/td-->
<script class="expj-script-AA0060010-AA0060010form2-SUB_WS_CD">
expj.AA0060010.AA0060010form2.SUB_WS_CD = {};
expj.AA0060010.AA0060010form2.SUB_WS_CD.executeAllOnDecision = function () {
  console.log('execute AA0060010form2/SUB_WS_CD.onDecision');
  expj.AA0060010.AA0060010form2.executeAllOnDecision();
  expj.AA0060010.executeAllOnDecision();
};
expj.AA0060010.AA0060010form2.SUB_WS_CD.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010form2-SUB_WS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0060010', 'AA0060010form2', 'SUB_WS_CD', this);
  });
  expj.AA0060010.AA0060010form2.SUB_WS_CD.executePScriptOnLoad();
};

expj.AA0060010.AA0060010form2.SUB_WS_CD.executePScriptOnLoad = function () {
  console.log('execute AA0060010form2/SUB_WS_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010form2-SUB_WS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0060010-AA0060010form2-SUB_WS_CD" name="SUB_WS_CD" class="AA0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0060010Struct.getSUB_WS_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0060010-AA0060010form2-PeekerSubWsCd">
expj.AA0060010.AA0060010form2.PeekerSubWsCd = {};
// script1="onClick;0;PEEKER;_AA0060010form2/SUB_WS_CD@<%=contextNo%>"
expj.AA0060010.AA0060010form2.PeekerSubWsCd.onClick0 = function () {
  console.log('PeekerSubWsCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0060010';
var parameterValues = 'PeekerSubWsCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AA0060010', 'PeekerSubWsCd', 'SQLPARAM_1', '<%=aAA0060010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0060010', 'AA0060010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0060010', 'AA0060010form2', '_AA0060010form2/SUB_WS_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WS_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0060010form2/SUB_WS_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0060010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0060010.AA0060010form2.PeekerSubWsCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0060010.AA0060010form2.PeekerSubWsCd['onClick' + i])) {
        expj.AA0060010.AA0060010form2.PeekerSubWsCd['onClick' + i]();
      }
    }
  }
};
expj.AA0060010.AA0060010form2.PeekerSubWsCd.executeAllOnDecision = function () {
};
expj.AA0060010.AA0060010form2.PeekerSubWsCd.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010form2-PeekerSubWsCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0060010', 'AA0060010form2', 'PeekerSubWsCd', this, 'Button');
    }
  });
  expj.AA0060010.AA0060010form2.PeekerSubWsCd.executePScriptOnLoad();
};

expj.AA0060010.AA0060010form2.PeekerSubWsCd.executePScriptOnLoad = function () {
  console.log('execute AA0060010form2/PeekerSubWsCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010form2-PeekerSubWsCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0060010-AA0060010form2-PeekerSubWsCd" class="AA0060010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0060010-AA0060010form2-SUB_WS_NAME">
expj.AA0060010.AA0060010form2.SUB_WS_NAME = {};
expj.AA0060010.AA0060010form2.SUB_WS_NAME.executeAllOnDecision = function () {
  console.log('execute AA0060010form2/SUB_WS_NAME.onDecision');
  expj.AA0060010.AA0060010form2.executeAllOnDecision();
  expj.AA0060010.executeAllOnDecision();
};
expj.AA0060010.AA0060010form2.SUB_WS_NAME.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010form2-SUB_WS_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0060010', 'AA0060010form2', 'SUB_WS_NAME', this);
  });
  expj.AA0060010.AA0060010form2.SUB_WS_NAME.executePScriptOnLoad();
};

expj.AA0060010.AA0060010form2.SUB_WS_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0060010form2/SUB_WS_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010form2-SUB_WS_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0060010-AA0060010form2-SUB_WS_NAME" name="SUB_WS_NAME" class="AA0060010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0060010Struct.getSUB_WS_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CLASS_NAME_01",rb)%></span><!-- 作業区分類01 --></div><!--/td-->
<script class="expj-script-AA0060010-AA0060010form2-CLASS_NAME">
expj.AA0060010.AA0060010form2.CLASS_NAME = {};
expj.AA0060010.AA0060010form2.CLASS_NAME.executeAllOnDecision = function () {
  console.log('execute AA0060010form2/CLASS_NAME.onDecision');
  expj.AA0060010.AA0060010form2.executeAllOnDecision();
  expj.AA0060010.executeAllOnDecision();
};
expj.AA0060010.AA0060010form2.CLASS_NAME.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010form2-CLASS_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0060010', 'AA0060010form2', 'CLASS_NAME', this);
  });
  expj.AA0060010.AA0060010form2.CLASS_NAME.executePScriptOnLoad();
};

expj.AA0060010.AA0060010form2.CLASS_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0060010form2/CLASS_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010form2-CLASS_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0060010-AA0060010form2-CLASS_NAME" name="CLASS_NAME" class="AA0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0060010Struct.getCLASS_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AA0060010-AA0060010form2-CLASS_NAME_FLAG" name="CLASS_NAME_FLAG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0060010Struct.getCLASS_NAME_FLAG()) %>">
<script class="expj-script-AA0060010-AA0060010form2-CLASS_NAME_FLAG">
expj.AA0060010.AA0060010form2.CLASS_NAME_FLAG = {};
expj.AA0060010.AA0060010form2.CLASS_NAME_FLAG.executeAllOnDecision = function () {
  console.log('execute AA0060010form2/CLASS_NAME_FLAG.onDecision');
  expj.AA0060010.AA0060010form2.executeAllOnDecision();
  expj.AA0060010.executeAllOnDecision();
};
expj.AA0060010.AA0060010form2.CLASS_NAME_FLAG.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010form2-CLASS_NAME_FLAG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0060010', 'AA0060010form2', 'CLASS_NAME_FLAG', this);
  });
  expj.AA0060010.AA0060010form2.CLASS_NAME_FLAG.executePScriptOnLoad();
};

expj.AA0060010.AA0060010form2.CLASS_NAME_FLAG.executePScriptOnLoad = function () {
  console.log('execute AA0060010form2/CLASS_NAME_FLAG.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010form2-CLASS_NAME_FLAG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AA0060010-AA0060010form2-WS_CLASS_01_CD">
expj.AA0060010.AA0060010form2.WS_CLASS_01_CD = {};
expj.AA0060010.AA0060010form2.WS_CLASS_01_CD.executeAllOnDecision = function () {
  console.log('execute AA0060010form2/WS_CLASS_01_CD.onDecision');
  expj.AA0060010.AA0060010form2.executeAllOnDecision();
  expj.AA0060010.executeAllOnDecision();
};
expj.AA0060010.AA0060010form2.WS_CLASS_01_CD.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010form2-WS_CLASS_01_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0060010', 'AA0060010form2', 'WS_CLASS_01_CD', this);
  });
  expj.AA0060010.AA0060010form2.WS_CLASS_01_CD.executePScriptOnLoad();
};

expj.AA0060010.AA0060010form2.WS_CLASS_01_CD.executePScriptOnLoad = function () {
  console.log('execute AA0060010form2/WS_CLASS_01_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010form2-WS_CLASS_01_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0060010-AA0060010form2-WS_CLASS_01_CD" name="WS_CLASS_01_CD" class="AA0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0060010Struct.getWS_CLASS_01_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0060010-AA0060010form2-PeekerWSClassCD01">
expj.AA0060010.AA0060010form2.PeekerWSClassCD01 = {};
// script1="onClick;0;PEEKER;_AA0060010form2/WS_CLASS_01_CD:_AA0060010form2/WS_CLASS_01_NAME@<%=contextNo%>"
expj.AA0060010.AA0060010form2.PeekerWSClassCD01.onClick0 = function () {
  console.log('PeekerWSClassCD01 script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0060010';
var parameterValues = 'PeekerWSClassCD01%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0060010', 'AA0060010form2', '_AA0060010form2/WS_CLASS_01_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WS_CLASS_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0060010form2/WS_CLASS_01_CD:_AA0060010form2/WS_CLASS_01_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0060010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0060010.AA0060010form2.PeekerWSClassCD01.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0060010.AA0060010form2.PeekerWSClassCD01['onClick' + i])) {
        expj.AA0060010.AA0060010form2.PeekerWSClassCD01['onClick' + i]();
      }
    }
  }
};
expj.AA0060010.AA0060010form2.PeekerWSClassCD01.executeAllOnDecision = function () {
};
expj.AA0060010.AA0060010form2.PeekerWSClassCD01.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010form2-PeekerWSClassCD01').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0060010', 'AA0060010form2', 'PeekerWSClassCD01', this, 'Button');
    }
  });
  expj.AA0060010.AA0060010form2.PeekerWSClassCD01.executePScriptOnLoad();
};

expj.AA0060010.AA0060010form2.PeekerWSClassCD01.executePScriptOnLoad = function () {
  console.log('execute AA0060010form2/PeekerWSClassCD01.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010form2-PeekerWSClassCD01');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0060010-AA0060010form2-PeekerWSClassCD01" class="AA0060010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0060010-AA0060010form2-WS_CLASS_01_NAME">
expj.AA0060010.AA0060010form2.WS_CLASS_01_NAME = {};
expj.AA0060010.AA0060010form2.WS_CLASS_01_NAME.executeAllOnDecision = function () {
  console.log('execute AA0060010form2/WS_CLASS_01_NAME.onDecision');
  expj.AA0060010.AA0060010form2.executeAllOnDecision();
  expj.AA0060010.executeAllOnDecision();
};
expj.AA0060010.AA0060010form2.WS_CLASS_01_NAME.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010form2-WS_CLASS_01_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0060010', 'AA0060010form2', 'WS_CLASS_01_NAME', this);
  });
  expj.AA0060010.AA0060010form2.WS_CLASS_01_NAME.executePScriptOnLoad();
};

expj.AA0060010.AA0060010form2.WS_CLASS_01_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0060010form2/WS_CLASS_01_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010form2-WS_CLASS_01_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0060010-AA0060010form2-WS_CLASS_01_NAME" name="WS_CLASS_01_NAME" class="AA0060010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0060010Struct.getWS_CLASS_01_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<input type="hidden" id="expj-AA0060010-AA0060010form2-h_WS_CLASS_01_CD" name="h_WS_CLASS_01_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0060010Struct.geth_WS_CLASS_01_CD()) %>">
<script class="expj-script-AA0060010-AA0060010form2-h_WS_CLASS_01_CD">
expj.AA0060010.AA0060010form2.h_WS_CLASS_01_CD = {};
expj.AA0060010.AA0060010form2.h_WS_CLASS_01_CD.executeAllOnDecision = function () {
  console.log('execute AA0060010form2/h_WS_CLASS_01_CD.onDecision');
  expj.AA0060010.AA0060010form2.executeAllOnDecision();
  expj.AA0060010.executeAllOnDecision();
};
expj.AA0060010.AA0060010form2.h_WS_CLASS_01_CD.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010form2-h_WS_CLASS_01_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0060010', 'AA0060010form2', 'h_WS_CLASS_01_CD', this);
  });
  expj.AA0060010.AA0060010form2.h_WS_CLASS_01_CD.executePScriptOnLoad();
};

expj.AA0060010.AA0060010form2.h_WS_CLASS_01_CD.executePScriptOnLoad = function () {
  console.log('execute AA0060010form2/h_WS_CLASS_01_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010form2-h_WS_CLASS_01_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AA0060010-AA0060010form2-h_MODIFY_COUNT" name="h_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0060010Struct.geth_MODIFY_COUNT()) %>">
<script class="expj-script-AA0060010-AA0060010form2-h_MODIFY_COUNT">
expj.AA0060010.AA0060010form2.h_MODIFY_COUNT = {};
expj.AA0060010.AA0060010form2.h_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AA0060010form2/h_MODIFY_COUNT.onDecision');
  expj.AA0060010.AA0060010form2.executeAllOnDecision();
  expj.AA0060010.executeAllOnDecision();
};
expj.AA0060010.AA0060010form2.h_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010form2-h_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0060010', 'AA0060010form2', 'h_MODIFY_COUNT', this);
  });
  expj.AA0060010.AA0060010form2.h_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AA0060010.AA0060010form2.h_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AA0060010form2/h_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010form2-h_MODIFY_COUNT');
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 399px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-AA0060010-AA0060010button2">
expj.AA0060010.AA0060010button2 = {};
expj.AA0060010.AA0060010button2.executeAllOnDecision = function () {
  console.log('execute AA0060010button2.onDecision');
};
expj.AA0060010.AA0060010button2.executeOnLoad = function () {
  expj.AA0060010.AA0060010button2.executePScriptOnLoad();
};

expj.AA0060010.AA0060010button2.executePScriptOnLoad = function () {
  console.log('execute AA0060010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0060010-AA0060010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0060010-AA0060010button2-insert">
expj.AA0060010.AA0060010button2.insert = {};
// script1="onClick;0;CHK;_AA0060010form1/WS_CD[eq]_AA0060010form2/SUB_WS_CD@!AA00081,*0"
expj.AA0060010.AA0060010button2.insert.onClick0 = function () {
  console.log('insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0060010', 'AA0060010button2', '_AA0060010form1/WS_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0060010', 'AA0060010button2', '_AA0060010form2/SUB_WS_CD'))) {
expj.common.pscript.viewErrorMessage('AA0060010', 'AA0060010button2', 'AA00081');
} else {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0060010form1/*,_AA0060010form2/*@AA0060010Servlet,,$ZZ07001"
expj.AA0060010.AA0060010button2.insert.child0 = function () {
  console.log('insert script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0060010', 'AA0060010button2', '_AA0060010form1/*,_AA0060010form2/*', 'AA0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0060010', response);
expj.common.updateBusinessScreenTab('AA0060010', contents);
};
expj.common.pscript.callConfirm('AA0060010', 'AA0060010button2', 'ZZ07001', okEvent);
};
expj.AA0060010.AA0060010button2.insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0060010.AA0060010button2.insert['onClick' + i])) {
        expj.AA0060010.AA0060010button2.insert['onClick' + i]();
      }
    }
  }
};
expj.AA0060010.AA0060010button2.insert.executeAllOnDecision = function () {
};
expj.AA0060010.AA0060010button2.insert.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010button2-insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0060010', 'AA0060010button2', 'insert', this, 'Button');
    }
  });
  expj.AA0060010.AA0060010button2.insert.executePScriptOnLoad();
};

expj.AA0060010.AA0060010button2.insert.executePScriptOnLoad = function () {
  console.log('execute AA0060010button2/insert.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010button2-insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0060010-AA0060010button2-insert" name="insert" class="AA0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AA0060010-AA0060010button2-update">
expj.AA0060010.AA0060010button2.update = {};
// script1="onClick;0;CHK;_AA0060010form1/WS_CD[eq]_AA0060010form2/SUB_WS_CD@!AA00081,*0"
expj.AA0060010.AA0060010button2.update.onClick0 = function () {
  console.log('update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0060010', 'AA0060010button2', '_AA0060010form1/WS_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0060010', 'AA0060010button2', '_AA0060010form2/SUB_WS_CD'))) {
expj.common.pscript.viewErrorMessage('AA0060010', 'AA0060010button2', 'AA00081');
} else {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0060010form1/*,_AA0060010form2/*@AA0060010Servlet,,$ZZ07003"
expj.AA0060010.AA0060010button2.update.child0 = function () {
  console.log('update script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0060010', 'AA0060010button2', '_AA0060010form1/*,_AA0060010form2/*', 'AA0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0060010', response);
expj.common.updateBusinessScreenTab('AA0060010', contents);
};
expj.common.pscript.callConfirm('AA0060010', 'AA0060010button2', 'ZZ07003', okEvent);
};
expj.AA0060010.AA0060010button2.update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0060010.AA0060010button2.update['onClick' + i])) {
        expj.AA0060010.AA0060010button2.update['onClick' + i]();
      }
    }
  }
};
expj.AA0060010.AA0060010button2.update.executeAllOnDecision = function () {
};
expj.AA0060010.AA0060010button2.update.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010button2-update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0060010', 'AA0060010button2', 'update', this, 'Button');
    }
  });
  expj.AA0060010.AA0060010button2.update.executePScriptOnLoad();
};

expj.AA0060010.AA0060010button2.update.executePScriptOnLoad = function () {
  console.log('execute AA0060010button2/update.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010button2-update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0060010-AA0060010button2-update" name="update" class="AA0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-AA0060010-AA0060010button2-delete">
expj.AA0060010.AA0060010button2.delete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0060010form1/*,_AA0060010form2/*@AA0060010Servlet,,$ZZ07004"
expj.AA0060010.AA0060010button2.delete.onClick0 = function () {
  console.log('delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0060010', 'AA0060010button2', '_AA0060010form1/*,_AA0060010form2/*', 'AA0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0060010', response);
expj.common.updateBusinessScreenTab('AA0060010', contents);
};
expj.common.pscript.callConfirm('AA0060010', 'AA0060010button2', 'ZZ07004', okEvent);
};
expj.AA0060010.AA0060010button2.delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0060010.AA0060010button2.delete['onClick' + i])) {
        expj.AA0060010.AA0060010button2.delete['onClick' + i]();
      }
    }
  }
};
expj.AA0060010.AA0060010button2.delete.executeAllOnDecision = function () {
};
expj.AA0060010.AA0060010button2.delete.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010button2-delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0060010', 'AA0060010button2', 'delete', this, 'Button');
    }
  });
  expj.AA0060010.AA0060010button2.delete.executePScriptOnLoad();
};

expj.AA0060010.AA0060010button2.delete.executePScriptOnLoad = function () {
  console.log('execute AA0060010button2/delete.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010button2-delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0060010-AA0060010button2-delete" name="delete" class="AA0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 200px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AA0060010 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AA0060010-AA0060010button0">
expj.AA0060010.AA0060010button0 = {};
expj.AA0060010.AA0060010button0.executeAllOnDecision = function () {
  console.log('execute AA0060010button0.onDecision');
};
expj.AA0060010.AA0060010button0.executeOnLoad = function () {
  expj.AA0060010.AA0060010button0.executePScriptOnLoad();
};

expj.AA0060010.AA0060010button0.executePScriptOnLoad = function () {
  console.log('execute AA0060010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0060010-AA0060010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0060010-AA0060010button0-clear">
expj.AA0060010.AA0060010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AA0060010Servlet,,$ZZ07008"
expj.AA0060010.AA0060010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0060010', 'AA0060010button0', '', 'AA0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0060010', response);
expj.common.updateBusinessScreenTab('AA0060010', contents);
};
expj.common.pscript.callConfirm('AA0060010', 'AA0060010button0', 'ZZ07008', okEvent);
};
expj.AA0060010.AA0060010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0060010.AA0060010button0.clear['onClick' + i])) {
        expj.AA0060010.AA0060010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AA0060010.AA0060010button0.clear.executeAllOnDecision = function () {
};
expj.AA0060010.AA0060010button0.clear.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0060010', 'AA0060010button0', 'clear', this, 'Button');
    }
  });
  expj.AA0060010.AA0060010button0.clear.executePScriptOnLoad();
};

expj.AA0060010.AA0060010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AA0060010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0060010-AA0060010button0-clear" name="clear" class="AA0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AA0060010-AA0060010button0-close">
expj.AA0060010.AA0060010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AA0060010.AA0060010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AA0060010');
};
expj.AA0060010.AA0060010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0060010.AA0060010button0.close['onClick' + i])) {
        expj.AA0060010.AA0060010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AA0060010.AA0060010button0.close.executeAllOnDecision = function () {
};
expj.AA0060010.AA0060010button0.close.executeOnLoad = function () {
  $('#expj-AA0060010-AA0060010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0060010', 'AA0060010button0', 'close', this, 'Button');
    }
  });
  expj.AA0060010.AA0060010button0.close.executePScriptOnLoad();
};

expj.AA0060010.AA0060010button0.close.executePScriptOnLoad = function () {
  console.log('execute AA0060010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AA0060010-AA0060010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0060010-AA0060010button0-close" name="close" class="AA0060010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0060010 (END)-->
<%
MessageStruct msgStruct = aAA0060010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0060010)) {
  expj.common.treeInstanceMap.AA0060010 = {};
}
expj.common.treeInstanceMap.AA0060010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0060010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0060010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0060010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0060010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0060010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0060010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0060010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0060010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0060010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0060010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0060010)) {
  expj.common.detailDialogMap.AA0060010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0060010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0060010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0060010.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0060010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0060010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0060010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0060010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0060010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0060010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0060010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0060010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0060010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0060010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0060010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0060010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0060010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0060010)) {
  expj.common.viewInstanceMap.AA0060010 = {};
}
expj.common.viewInstanceMap.AA0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0060010.<%=viewId %>.init = function () {
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
    expj.AA0060010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0060010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0060010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0060010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0060010_init">
/**
 * AA0060010用のロード完了時初期化関数
 */
expj.AA0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0060010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0060010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0060010');
  expj.common.calendarInstanceMap.AA0060010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0060010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0060010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0060010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0060010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0060010-<%=detailId %>');
<%
 }
%>
  try{expj.AA0060010.AA0060010form1.WS_CD.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010form1.PeekerWsCd.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010form1.h_WS_CD.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010form1.MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010button1.select.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010form2.WS_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010form2.WS_TEL.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010form2.WS_PERSON.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010form2.WH_CD.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010form2.PeekerWhCd.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010form2.WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010form2.SUB_WS_CD.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010form2.PeekerSubWsCd.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010form2.SUB_WS_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010form2.CLASS_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010form2.CLASS_NAME_FLAG.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010form2.WS_CLASS_01_CD.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010form2.PeekerWSClassCD01.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010form2.WS_CLASS_01_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010form2.h_WS_CLASS_01_CD.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010form2.h_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010button2.insert.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010button2.update.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010button2.delete.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010button0.close.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010form1.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010button1.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010form2.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010button2.executeOnLoad();}catch(e){};
  try{expj.AA0060010.AA0060010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0060010', 'AA0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0060010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0060010-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0060010', '<%=request.getContextPath() %>');
};

/**
 * AA0060010の全体onDecision処理
 */
expj.AA0060010.executeAllOnDecision = function () {
  expj.AA0060010.AA0060010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0060010_console">
expj.AA0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>