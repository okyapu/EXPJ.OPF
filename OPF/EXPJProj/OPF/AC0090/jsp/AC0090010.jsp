<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:28:17 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AC0090\AC0090010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AC0090.*" %>
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
<jsp:useBean id="aAC0090010Control" class="com.nec.jp.orteus.metamorBase.AC0090.AC0090010Control" scope="request"/>
<jsp:useBean id="aAC0090010Struct" class="com.nec.jp.orteus.metamorBase.AC0090.AC0090010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

外部デマンド紐付け
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0090/jsp/AC0090010.jsp,v $
$Author: geng-jia $	
$Revision: 1.12 $ $Date: 2017/02/22 02:04:29 $
********************************************************* --%>
<html>
<head>
<title>外部デマンド紐付け</title>
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
<script class="expj-script-AC0090010_init">
  // AC0090010名前空間
  expj.AC0090010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AC0090010" data-screen="AC0090010" data-newdata="<%=aAC0090010Control.isNewData() %>">
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
              <script class="expj-script-AC0090010-AC0090010form1">
expj.AC0090010.AC0090010form1 = {};
// script1="onLoad;0;CALL;child@0,4"
expj.AC0090010.AC0090010form1.onLoad0 = function () {
  console.log('AC0090010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child4)){this.child4();}
};
// script2="onLoad;1;CALL;onDecision@0,2,3"
expj.AC0090010.AC0090010form1.onLoad1 = function () {
  console.log('AC0090010form1 script2');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script3="child;0;CHK;?AC0090010form1/*[neq]NORMAL@*1"
expj.AC0090010.AC0090010form1.child0 = function () {
  console.log('AC0090010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010form1', '?AC0090010form1/*'), '[neq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="child;1;MASK;_AC0090010button2/modify,_AC0090010button2/update"
expj.AC0090010.AC0090010form1.child1 = function () {
  console.log('AC0090010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AC0090010', 'AC0090010form1', '_AC0090010button2/modify');
expj.common.pscript.setMaskToReferenceComponent('AC0090010', 'AC0090010form1', '_AC0090010button2/update');
};
// script5="onDecision;0;CHKRQ;A@*2,*3"
expj.AC0090010.AC0090010form1.onDecision0 = function () {
  console.log('AC0090010form1 script5');
if (expj.common.pscript.satisfiedRequiredComponent('AC0090010', 'A')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;2;UNMASK;_AC0090010button1/select"
expj.AC0090010.AC0090010form1.child2 = function () {
  console.log('AC0090010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AC0090010', 'AC0090010form1', '_AC0090010button1/select');
};
// script7="child;3;MASK;_AC0090010button1/select"
expj.AC0090010.AC0090010form1.child3 = function () {
  console.log('AC0090010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AC0090010', 'AC0090010form1', '_AC0090010button1/select');
};
// script8="onDecision;1;CHK;1[eq]1@*4"
expj.AC0090010.AC0090010form1.onDecision1 = function () {
  console.log('AC0090010form1 script8');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script9="child;4;CHKRQ;?AC0090010view1/?[eq]SINGLE@*5"
expj.AC0090010.AC0090010form1.child4 = function () {
  console.log('AC0090010form1 script9');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010form1', '?AC0090010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script10="child;5;CHK;?AC0090010form1/*[eq]NORMAL@*6,*11"
expj.AC0090010.AC0090010form1.child5 = function () {
  console.log('AC0090010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010form1', '?AC0090010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script11="child;6;CHK;?AC0090010form1/w_PLANT_CD[eq]SAME@*7,*11"
expj.AC0090010.AC0090010form1.child6 = function () {
  console.log('AC0090010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010form1', '?AC0090010form1/w_PLANT_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script12="child;7;CHK;?AC0090010form1/w_ITEM_CD[eq]SAME@*8,*11"
expj.AC0090010.AC0090010form1.child7 = function () {
  console.log('AC0090010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010form1', '?AC0090010form1/w_ITEM_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script13="child;8;CHK;?AC0090010form1/w_DATE_FROM[eq]SAME@*9,*11"
expj.AC0090010.AC0090010form1.child8 = function () {
  console.log('AC0090010form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010form1', '?AC0090010form1/w_DATE_FROM'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script14="child;9;CHK;?AC0090010form1/w_DATE_TO[eq]SAME@*10,*11"
expj.AC0090010.AC0090010form1.child9 = function () {
  console.log('AC0090010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010form1', '?AC0090010form1/w_DATE_TO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script15="child;10;UNMASK;_AC0090010button2/modify,_AC0090010button2/update"
expj.AC0090010.AC0090010form1.child10 = function () {
  console.log('AC0090010form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('AC0090010', 'AC0090010form1', '_AC0090010button2/modify');
expj.common.pscript.setUnMaskToReferenceComponent('AC0090010', 'AC0090010form1', '_AC0090010button2/update');
};
// script16="child;11;MASK;_AC0090010button2/modify,_AC0090010button2/update"
expj.AC0090010.AC0090010form1.child11 = function () {
  console.log('AC0090010form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AC0090010', 'AC0090010form1', '_AC0090010button2/modify');
expj.common.pscript.setMaskToReferenceComponent('AC0090010', 'AC0090010form1', '_AC0090010button2/update');
};
// script17="onDecision;2;CHKRQ;?AC0090010view1/?[neq]SINGLE@*12"
expj.AC0090010.AC0090010form1.onDecision2 = function () {
  console.log('AC0090010form1 script17');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010form1', '?AC0090010view1/?'), '[neq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script18="child;12;MASK;_AC0090010button2/modify,_AC0090010button2/update"
expj.AC0090010.AC0090010form1.child12 = function () {
  console.log('AC0090010form1 script18');
expj.common.pscript.setMaskToReferenceComponent('AC0090010', 'AC0090010form1', '_AC0090010button2/modify');
expj.common.pscript.setMaskToReferenceComponent('AC0090010', 'AC0090010form1', '_AC0090010button2/update');
};
// script19="onDecision;3;CHK;_AC0090010form1/TIME_CTRL[eq]true@*13,*14"
expj.AC0090010.AC0090010form1.onDecision3 = function () {
  console.log('AC0090010form1 script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010form1', '_AC0090010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script20="child;13;UNMASK;_AC0090010form1/w_TIME_FROM,_AC0090010form1/w_TIME_TO"
expj.AC0090010.AC0090010form1.child13 = function () {
  console.log('AC0090010form1 script20');
expj.common.pscript.setUnMaskToReferenceComponent('AC0090010', 'AC0090010form1', '_AC0090010form1/w_TIME_FROM');
expj.common.pscript.setUnMaskToReferenceComponent('AC0090010', 'AC0090010form1', '_AC0090010form1/w_TIME_TO');
};
// script21="child;14;MASK;_AC0090010form1/w_TIME_FROM,_AC0090010form1/w_TIME_TO"
expj.AC0090010.AC0090010form1.child14 = function () {
  console.log('AC0090010form1 script21');
expj.common.pscript.setMaskToReferenceComponent('AC0090010', 'AC0090010form1', '_AC0090010form1/w_TIME_FROM');
expj.common.pscript.setMaskToReferenceComponent('AC0090010', 'AC0090010form1', '_AC0090010form1/w_TIME_TO');
};
expj.AC0090010.AC0090010form1.executeAllOnDecision = function () {
  console.log('execute AC0090010form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0090010.AC0090010form1['onDecision' + i])) {
        expj.AC0090010.AC0090010form1['onDecision' + i]();
      }
    }
  }
};
expj.AC0090010.AC0090010form1.executeOnLoad = function () {
  expj.AC0090010.AC0090010form1.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AC0090010.AC0090010form1['onLoad' + i])) {
      expj.AC0090010.AC0090010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AC0090010-AC0090010form1" action="AC0090010Servlet" name="AC0090010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAC0090010Control.getReadStatusString()) %>" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:20px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ISSUE_PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AC0090010-AC0090010form1-w_PLANT_CD">
expj.AC0090010.AC0090010form1.w_PLANT_CD = {};
expj.AC0090010.AC0090010form1.w_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AC0090010form1/w_PLANT_CD.onDecision');
  expj.AC0090010.AC0090010form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090010form1.w_PLANT_CD.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-w_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090010form1', 'w_PLANT_CD', this);
  });
  expj.AC0090010.AC0090010form1.w_PLANT_CD.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.w_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/w_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-w_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0090010-AC0090010form1-w_PLANT_CD" name="w_PLANT_CD" class="AC0090010-focus-move  required-value expj-AC0090010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_PLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<input type="hidden" id="expj-AC0090010-AC0090010form1-w_DRAW_CD" name="w_DRAW_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_DRAW_CD()) %>">
<script class="expj-script-AC0090010-AC0090010form1-w_DRAW_CD">
expj.AC0090010.AC0090010form1.w_DRAW_CD = {};
expj.AC0090010.AC0090010form1.w_DRAW_CD.executeAllOnDecision = function () {
  console.log('execute AC0090010form1/w_DRAW_CD.onDecision');
  expj.AC0090010.AC0090010form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090010form1.w_DRAW_CD.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-w_DRAW_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090010form1', 'w_DRAW_CD', this);
  });
  expj.AC0090010.AC0090010form1.w_DRAW_CD.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.w_DRAW_CD.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/w_DRAW_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-w_DRAW_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AC0090010-AC0090010form1-w_SPEC" name="w_SPEC" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_SPEC()) %>">
<script class="expj-script-AC0090010-AC0090010form1-w_SPEC">
expj.AC0090010.AC0090010form1.w_SPEC = {};
expj.AC0090010.AC0090010form1.w_SPEC.executeAllOnDecision = function () {
  console.log('execute AC0090010form1/w_SPEC.onDecision');
  expj.AC0090010.AC0090010form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090010form1.w_SPEC.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-w_SPEC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090010form1', 'w_SPEC', this);
  });
  expj.AC0090010.AC0090010form1.w_SPEC.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.w_SPEC.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/w_SPEC.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-w_SPEC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AC0090010-AC0090010form1-PeekerPlantCd">
expj.AC0090010.AC0090010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AC0090010form1/w_PLANT_CD@<%=contextNo%>"
expj.AC0090010.AC0090010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0090010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010form1', '_AC0090010form1/w_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AC0090010form1/w_PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0090010.AC0090010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0090010.AC0090010form1.PeekerPlantCd['onClick' + i])) {
        expj.AC0090010.AC0090010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AC0090010.AC0090010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AC0090010.AC0090010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0090010', 'AC0090010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AC0090010.AC0090010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0090010-AC0090010form1-PeekerPlantCd" class="AC0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AC0090010-AC0090010form1-w_PLANT_NAME">
expj.AC0090010.AC0090010form1.w_PLANT_NAME = {};
expj.AC0090010.AC0090010form1.w_PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AC0090010form1/w_PLANT_NAME.onDecision');
  expj.AC0090010.AC0090010form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090010form1.w_PLANT_NAME.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-w_PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090010form1', 'w_PLANT_NAME', this);
  });
  expj.AC0090010.AC0090010form1.w_PLANT_NAME.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.w_PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/w_PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-w_PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AC0090010-AC0090010form1-w_PLANT_NAME" name="w_PLANT_NAME" class="AC0090010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_PLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AC0090010-AC0090010form1-w_MRP_ODR_TYP" name="w_MRP_ODR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_MRP_ODR_TYP()) %>">
<script class="expj-script-AC0090010-AC0090010form1-w_MRP_ODR_TYP">
expj.AC0090010.AC0090010form1.w_MRP_ODR_TYP = {};
expj.AC0090010.AC0090010form1.w_MRP_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute AC0090010form1/w_MRP_ODR_TYP.onDecision');
  expj.AC0090010.AC0090010form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090010form1.w_MRP_ODR_TYP.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-w_MRP_ODR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090010form1', 'w_MRP_ODR_TYP', this);
  });
  expj.AC0090010.AC0090010form1.w_MRP_ODR_TYP.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.w_MRP_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/w_MRP_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-w_MRP_ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AC0090010-AC0090010form1-w_OUTSIDE_TYP" name="w_OUTSIDE_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_OUTSIDE_TYP()) %>">
<script class="expj-script-AC0090010-AC0090010form1-w_OUTSIDE_TYP">
expj.AC0090010.AC0090010form1.w_OUTSIDE_TYP = {};
expj.AC0090010.AC0090010form1.w_OUTSIDE_TYP.executeAllOnDecision = function () {
  console.log('execute AC0090010form1/w_OUTSIDE_TYP.onDecision');
  expj.AC0090010.AC0090010form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090010form1.w_OUTSIDE_TYP.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-w_OUTSIDE_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090010form1', 'w_OUTSIDE_TYP', this);
  });
  expj.AC0090010.AC0090010form1.w_OUTSIDE_TYP.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.w_OUTSIDE_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/w_OUTSIDE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-w_OUTSIDE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AC0090010-AC0090010form1-w_ITEM_SPOIL" name="w_ITEM_SPOIL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_ITEM_SPOIL()) %>">
<script class="expj-script-AC0090010-AC0090010form1-w_ITEM_SPOIL">
expj.AC0090010.AC0090010form1.w_ITEM_SPOIL = {};
expj.AC0090010.AC0090010form1.w_ITEM_SPOIL.executeAllOnDecision = function () {
  console.log('execute AC0090010form1/w_ITEM_SPOIL.onDecision');
  expj.AC0090010.AC0090010form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090010form1.w_ITEM_SPOIL.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-w_ITEM_SPOIL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090010form1', 'w_ITEM_SPOIL', this);
  });
  expj.AC0090010.AC0090010form1.w_ITEM_SPOIL.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.w_ITEM_SPOIL.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/w_ITEM_SPOIL.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-w_ITEM_SPOIL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0090010-AC0090010form1-w_UNIT_QTY_TYP" name="w_UNIT_QTY_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_UNIT_QTY_TYP()) %>">
<script class="expj-script-AC0090010-AC0090010form1-w_UNIT_QTY_TYP">
expj.AC0090010.AC0090010form1.w_UNIT_QTY_TYP = {};
expj.AC0090010.AC0090010form1.w_UNIT_QTY_TYP.executeAllOnDecision = function () {
  console.log('execute AC0090010form1/w_UNIT_QTY_TYP.onDecision');
  expj.AC0090010.AC0090010form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090010form1.w_UNIT_QTY_TYP.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-w_UNIT_QTY_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090010form1', 'w_UNIT_QTY_TYP', this);
  });
  expj.AC0090010.AC0090010form1.w_UNIT_QTY_TYP.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.w_UNIT_QTY_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/w_UNIT_QTY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-w_UNIT_QTY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AC0090010-AC0090010form1-w_ITEM_CD">
expj.AC0090010.AC0090010form1.w_ITEM_CD = {};
expj.AC0090010.AC0090010form1.w_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AC0090010form1/w_ITEM_CD.onDecision');
  expj.AC0090010.AC0090010form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090010form1.w_ITEM_CD.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-w_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090010form1', 'w_ITEM_CD', this);
  });
  expj.AC0090010.AC0090010form1.w_ITEM_CD.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.w_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/w_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-w_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0090010-AC0090010form1-w_ITEM_CD" name="w_ITEM_CD" class="AC0090010-focus-move  required-value expj-AC0090010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AC0090010-AC0090010form1-w_LOT_SIZING_TYP" name="w_LOT_SIZING_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_LOT_SIZING_TYP()) %>">
<script class="expj-script-AC0090010-AC0090010form1-w_LOT_SIZING_TYP">
expj.AC0090010.AC0090010form1.w_LOT_SIZING_TYP = {};
expj.AC0090010.AC0090010form1.w_LOT_SIZING_TYP.executeAllOnDecision = function () {
  console.log('execute AC0090010form1/w_LOT_SIZING_TYP.onDecision');
  expj.AC0090010.AC0090010form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090010form1.w_LOT_SIZING_TYP.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-w_LOT_SIZING_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090010form1', 'w_LOT_SIZING_TYP', this);
  });
  expj.AC0090010.AC0090010form1.w_LOT_SIZING_TYP.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.w_LOT_SIZING_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/w_LOT_SIZING_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-w_LOT_SIZING_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AC0090010-AC0090010form1-w_MAX_PERIOD" name="w_MAX_PERIOD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_MAX_PERIOD()) %>">
<script class="expj-script-AC0090010-AC0090010form1-w_MAX_PERIOD">
expj.AC0090010.AC0090010form1.w_MAX_PERIOD = {};
expj.AC0090010.AC0090010form1.w_MAX_PERIOD.executeAllOnDecision = function () {
  console.log('execute AC0090010form1/w_MAX_PERIOD.onDecision');
  expj.AC0090010.AC0090010form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090010form1.w_MAX_PERIOD.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-w_MAX_PERIOD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090010form1', 'w_MAX_PERIOD', this);
  });
  expj.AC0090010.AC0090010form1.w_MAX_PERIOD.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.w_MAX_PERIOD.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/w_MAX_PERIOD.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-w_MAX_PERIOD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AC0090010-AC0090010form1-PeekerItemCd">
expj.AC0090010.AC0090010form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AC0090010form1/w_ITEM_CD@<%=contextNo%>"
expj.AC0090010.AC0090010form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0090010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010form1', '_AC0090010form1/w_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_06%&%';
parameterValues += 'TARGET_FIELD%=%_AC0090010form1/w_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0090010.AC0090010form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0090010.AC0090010form1.PeekerItemCd['onClick' + i])) {
        expj.AC0090010.AC0090010form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AC0090010.AC0090010form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AC0090010.AC0090010form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0090010', 'AC0090010form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AC0090010.AC0090010form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0090010-AC0090010form1-PeekerItemCd" class="AC0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AC0090010-AC0090010form1-w_ITEM_NAME">
expj.AC0090010.AC0090010form1.w_ITEM_NAME = {};
expj.AC0090010.AC0090010form1.w_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AC0090010form1/w_ITEM_NAME.onDecision');
  expj.AC0090010.AC0090010form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090010form1.w_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-w_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090010form1', 'w_ITEM_NAME', this);
  });
  expj.AC0090010.AC0090010form1.w_ITEM_NAME.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.w_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/w_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-w_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AC0090010-AC0090010form1-w_ITEM_NAME" name="w_ITEM_NAME" class="AC0090010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AC0090010-AC0090010form1-w_MAX_ODR_QTY" name="w_MAX_ODR_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_MAX_ODR_QTY()) %>">
<script class="expj-script-AC0090010-AC0090010form1-w_MAX_ODR_QTY">
expj.AC0090010.AC0090010form1.w_MAX_ODR_QTY = {};
expj.AC0090010.AC0090010form1.w_MAX_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AC0090010form1/w_MAX_ODR_QTY.onDecision');
  expj.AC0090010.AC0090010form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090010form1.w_MAX_ODR_QTY.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-w_MAX_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090010form1', 'w_MAX_ODR_QTY', this);
  });
  expj.AC0090010.AC0090010form1.w_MAX_ODR_QTY.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.w_MAX_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/w_MAX_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-w_MAX_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AC0090010-AC0090010form1-w_MIN_ODR_QTY" name="w_MIN_ODR_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_MIN_ODR_QTY()) %>">
<script class="expj-script-AC0090010-AC0090010form1-w_MIN_ODR_QTY">
expj.AC0090010.AC0090010form1.w_MIN_ODR_QTY = {};
expj.AC0090010.AC0090010form1.w_MIN_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AC0090010form1/w_MIN_ODR_QTY.onDecision');
  expj.AC0090010.AC0090010form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090010form1.w_MIN_ODR_QTY.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-w_MIN_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090010form1', 'w_MIN_ODR_QTY', this);
  });
  expj.AC0090010.AC0090010form1.w_MIN_ODR_QTY.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.w_MIN_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/w_MIN_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-w_MIN_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AC0090010-AC0090010form1-w_MUL_ODR_QTY" name="w_MUL_ODR_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_MUL_ODR_QTY()) %>">
<script class="expj-script-AC0090010-AC0090010form1-w_MUL_ODR_QTY">
expj.AC0090010.AC0090010form1.w_MUL_ODR_QTY = {};
expj.AC0090010.AC0090010form1.w_MUL_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AC0090010form1/w_MUL_ODR_QTY.onDecision');
  expj.AC0090010.AC0090010form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090010form1.w_MUL_ODR_QTY.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-w_MUL_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090010form1', 'w_MUL_ODR_QTY', this);
  });
  expj.AC0090010.AC0090010form1.w_MUL_ODR_QTY.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.w_MUL_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/w_MUL_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-w_MUL_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0090010-AC0090010form1-w_SAFETY_STOCK" name="w_SAFETY_STOCK" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_SAFETY_STOCK()) %>">
<script class="expj-script-AC0090010-AC0090010form1-w_SAFETY_STOCK">
expj.AC0090010.AC0090010form1.w_SAFETY_STOCK = {};
expj.AC0090010.AC0090010form1.w_SAFETY_STOCK.executeAllOnDecision = function () {
  console.log('execute AC0090010form1/w_SAFETY_STOCK.onDecision');
  expj.AC0090010.AC0090010form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090010form1.w_SAFETY_STOCK.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-w_SAFETY_STOCK').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090010form1', 'w_SAFETY_STOCK', this);
  });
  expj.AC0090010.AC0090010form1.w_SAFETY_STOCK.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.w_SAFETY_STOCK.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/w_SAFETY_STOCK.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-w_SAFETY_STOCK');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt0420",rb)%></span><!-- 生産計画期間 --></div><!--/td-->
<script class="expj-script-AC0090010-AC0090010form1-w_DATE_FROM">
expj.AC0090010.AC0090010form1.w_DATE_FROM = {};
expj.AC0090010.AC0090010form1.w_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AC0090010form1/w_DATE_FROM.onDecision');
  expj.AC0090010.AC0090010form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090010form1.w_DATE_FROM.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-w_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090010form1', 'w_DATE_FROM', this);
  });
  expj.AC0090010.AC0090010form1.w_DATE_FROM.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.w_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/w_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-w_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0090010-AC0090010form1-w_DATE_FROM" name="w_DATE_FROM" class="AC0090010-focus-move  required-value expj-AC0090010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_DATE_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AC0090010-AC0090010form1-Calendarw_DATE_FROM">
expj.AC0090010.AC0090010form1.Calendarw_DATE_FROM = {};
// script1="onClick;0;CALENDAR;_AC0090010form1/w_DATE_FROM"
expj.AC0090010.AC0090010form1.Calendarw_DATE_FROM.onClick0 = function () {
  console.log('Calendarw_DATE_FROM script1');
expj.common.pscript.executeCalendar('AC0090010','AC0090010form1','_AC0090010form1/w_DATE_FROM');
};
expj.AC0090010.AC0090010form1.Calendarw_DATE_FROM.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0090010.AC0090010form1.Calendarw_DATE_FROM['onClick' + i])) {
        expj.AC0090010.AC0090010form1.Calendarw_DATE_FROM['onClick' + i]();
      }
    }
  }
};
expj.AC0090010.AC0090010form1.Calendarw_DATE_FROM.executeAllOnDecision = function () {
};
expj.AC0090010.AC0090010form1.Calendarw_DATE_FROM.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-Calendarw_DATE_FROM').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0090010', 'AC0090010form1', 'Calendarw_DATE_FROM', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0090010','AC0090010form1','_AC0090010form1/w_DATE_FROM');
  expj.AC0090010.AC0090010form1.Calendarw_DATE_FROM.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.Calendarw_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/Calendarw_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-Calendarw_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0090010-AC0090010form1-Calendarw_DATE_FROM" class="AC0090010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AC0090010-AC0090010form1-w_TIME_FROM">
expj.AC0090010.AC0090010form1.w_TIME_FROM = {};
expj.AC0090010.AC0090010form1.w_TIME_FROM.executeAllOnDecision = function () {
  console.log('execute AC0090010form1/w_TIME_FROM.onDecision');
  expj.AC0090010.AC0090010form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090010form1.w_TIME_FROM.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-w_TIME_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090010form1', 'w_TIME_FROM', this);
  });
  expj.AC0090010.AC0090010form1.w_TIME_FROM.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.w_TIME_FROM.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/w_TIME_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-w_TIME_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AC0090010-AC0090010form1-w_TIME_FROM" name="w_TIME_FROM" class="AC0090010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_TIME_FROM()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<script class="expj-script-AC0090010-AC0090010form1-w_DATE_TO">
expj.AC0090010.AC0090010form1.w_DATE_TO = {};
expj.AC0090010.AC0090010form1.w_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AC0090010form1/w_DATE_TO.onDecision');
  expj.AC0090010.AC0090010form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090010form1.w_DATE_TO.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-w_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090010form1', 'w_DATE_TO', this);
  });
  expj.AC0090010.AC0090010form1.w_DATE_TO.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.w_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/w_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-w_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0090010-AC0090010form1-w_DATE_TO" name="w_DATE_TO" class="AC0090010-focus-move  required-value expj-AC0090010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_DATE_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AC0090010-AC0090010form1-Calendarw_DATE_TO">
expj.AC0090010.AC0090010form1.Calendarw_DATE_TO = {};
// script1="onClick;0;CALENDAR;_AC0090010form1/w_DATE_TO"
expj.AC0090010.AC0090010form1.Calendarw_DATE_TO.onClick0 = function () {
  console.log('Calendarw_DATE_TO script1');
expj.common.pscript.executeCalendar('AC0090010','AC0090010form1','_AC0090010form1/w_DATE_TO');
};
expj.AC0090010.AC0090010form1.Calendarw_DATE_TO.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0090010.AC0090010form1.Calendarw_DATE_TO['onClick' + i])) {
        expj.AC0090010.AC0090010form1.Calendarw_DATE_TO['onClick' + i]();
      }
    }
  }
};
expj.AC0090010.AC0090010form1.Calendarw_DATE_TO.executeAllOnDecision = function () {
};
expj.AC0090010.AC0090010form1.Calendarw_DATE_TO.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-Calendarw_DATE_TO').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0090010', 'AC0090010form1', 'Calendarw_DATE_TO', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0090010','AC0090010form1','_AC0090010form1/w_DATE_TO');
  expj.AC0090010.AC0090010form1.Calendarw_DATE_TO.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.Calendarw_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/Calendarw_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-Calendarw_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-AC0090010-AC0090010form1-Calendarw_DATE_TO" class="AC0090010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AC0090010-AC0090010form1-w_TIME_TO">
expj.AC0090010.AC0090010form1.w_TIME_TO = {};
expj.AC0090010.AC0090010form1.w_TIME_TO.executeAllOnDecision = function () {
  console.log('execute AC0090010form1/w_TIME_TO.onDecision');
  expj.AC0090010.AC0090010form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090010form1.w_TIME_TO.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-w_TIME_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090010form1', 'w_TIME_TO', this);
  });
  expj.AC0090010.AC0090010form1.w_TIME_TO.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.w_TIME_TO.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/w_TIME_TO.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-w_TIME_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td over-inner" style="width:150px;text-align:;"><input type="text" id="expj-AC0090010-AC0090010form1-w_TIME_TO" name="w_TIME_TO" class="AC0090010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_TIME_TO()) %>" maxlength="4" ></div><input type="hidden" id="expj-AC0090010-AC0090010form1-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getTIME_CTRL()) %>">
<script class="expj-script-AC0090010-AC0090010form1-TIME_CTRL">
expj.AC0090010.AC0090010form1.TIME_CTRL = {};
expj.AC0090010.AC0090010form1.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AC0090010form1/TIME_CTRL.onDecision');
  expj.AC0090010.AC0090010form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090010form1.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090010form1', 'TIME_CTRL', this);
  });
  expj.AC0090010.AC0090010form1.TIME_CTRL.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-TIME_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0090010-AC0090010form1-STOCK_UNIT" name="STOCK_UNIT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getSTOCK_UNIT()) %>">
<script class="expj-script-AC0090010-AC0090010form1-STOCK_UNIT">
expj.AC0090010.AC0090010form1.STOCK_UNIT = {};
expj.AC0090010.AC0090010form1.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AC0090010form1/STOCK_UNIT.onDecision');
  expj.AC0090010.AC0090010form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090010form1.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010form1-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090010form1', 'STOCK_UNIT', this);
  });
  expj.AC0090010.AC0090010form1.STOCK_UNIT.executePScriptOnLoad();
};

expj.AC0090010.AC0090010form1.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AC0090010form1/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010form1-STOCK_UNIT');
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AC0090010-AC0090010button1">
expj.AC0090010.AC0090010button1 = {};
expj.AC0090010.AC0090010button1.executeAllOnDecision = function () {
  console.log('execute AC0090010button1.onDecision');
};
expj.AC0090010.AC0090010button1.executeOnLoad = function () {
  expj.AC0090010.AC0090010button1.executePScriptOnLoad();
};

expj.AC0090010.AC0090010button1.executePScriptOnLoad = function () {
  console.log('execute AC0090010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0090010-AC0090010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0090010-AC0090010button1-Detail">
expj.AC0090010.AC0090010button1.Detail = {};
// script1="onClick;0;FSHOW;AC0090010float1"
expj.AC0090010.AC0090010button1.Detail.onClick0 = function () {
  console.log('Detail script1');
expj.common.pscript.showDetailWindow('AC0090010', 'AC0090010float1', '');
};
expj.AC0090010.AC0090010button1.Detail.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0090010.AC0090010button1.Detail['onClick' + i])) {
        expj.AC0090010.AC0090010button1.Detail['onClick' + i]();
      }
    }
  }
};
expj.AC0090010.AC0090010button1.Detail.executeAllOnDecision = function () {
};
expj.AC0090010.AC0090010button1.Detail.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010button1-Detail').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0090010', 'AC0090010button1', 'Detail', this, 'Button');
    }
  });
  expj.AC0090010.AC0090010button1.Detail.executePScriptOnLoad();
};

expj.AC0090010.AC0090010button1.Detail.executePScriptOnLoad = function () {
  console.log('execute AC0090010button1/Detail.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010button1-Detail');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0090010-AC0090010button1-Detail" name="Detail" class="AC0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDetail",rb)%></button><!-- 詳細ボタン --></div><!--/td-->
<script class="expj-script-AC0090010-AC0090010button1-select">
expj.AC0090010.AC0090010button1.select = {};
// script1="onClick;0;CHK;_AC0090010form1/w_DATE_FROM[gt]_AC0090010form1/w_DATE_TO@#AC10007"
expj.AC0090010.AC0090010button1.select.onClick0 = function () {
  console.log('select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010button1', '_AC0090010form1/w_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010button1', '_AC0090010form1/w_DATE_TO')))) {
expj.common.pscript.addErrorMessage('AC0090010', 'AC0090010button1', 'AC10007');
}
};
// script2="onClick;1;CHK;_AC0090010form1/w_DATE_FROM[eq]_AC0090010form1/w_DATE_TO[and]_AC0090010form1/w_TIME_FROM[neq][and]_AC0090010form1/w_TIME_TO[neq][and]_AC0090010form1/w_TIME_FROM[gt]_AC0090010form1/w_TIME_TO@#AC10007"
expj.AC0090010.AC0090010button1.select.onClick1 = function () {
  console.log('select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010button1', '_AC0090010form1/w_DATE_FROM'), '[eq]', expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010button1', '_AC0090010form1/w_DATE_TO')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_TO')))) {
expj.common.pscript.addErrorMessage('AC0090010', 'AC0090010button1', 'AC10007');
}
};
// script3="onClick;2;CHK;~LEN(_AC0090010form1/w_TIME_FROM)[eq]1[or]~LEN(_AC0090010form1/w_TIME_FROM)[eq]2@#AS00123"
expj.AC0090010.AC0090010button1.select.onClick2 = function () {
  console.log('select script3');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_FROM'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_FROM'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AC0090010', 'AC0090010button1', 'AS00123');
}
};
// script4="onClick;3;CHK;~LEN(_AC0090010form1/w_TIME_TO)[eq]1[or]~LEN(_AC0090010form1/w_TIME_TO)[eq]2@#AS00120"
expj.AC0090010.AC0090010button1.select.onClick3 = function () {
  console.log('select script4');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_TO'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_TO'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AC0090010', 'AC0090010button1', 'AS00120');
}
};
// script5="onClick;4;CHK;_AC0090010form1/TIME_CTRL[eq]true[and]~LEN(_AC0090010form1/w_TIME_FROM)[eq]3@*0"
expj.AC0090010.AC0090010button1.select.onClick4 = function () {
  console.log('select script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010button1', '_AC0090010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_FROM'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script6="onClick;5;CHK;_AC0090010form1/TIME_CTRL[eq]true[and]~LEN(_AC0090010form1/w_TIME_TO)[eq]3@*1"
expj.AC0090010.AC0090010button1.select.onClick5 = function () {
  console.log('select script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010button1', '_AC0090010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_TO'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script7="onClick;6;CHK;_AC0090010form1/TIME_CTRL[eq]true[and]~LEN(_AC0090010form1/w_TIME_FROM)[eq]4@*2"
expj.AC0090010.AC0090010button1.select.onClick6 = function () {
  console.log('select script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010button1', '_AC0090010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_FROM'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script8="onClick;7;CHK;_AC0090010form1/TIME_CTRL[eq]true[and]~LEN(_AC0090010form1/w_TIME_TO)[eq]4@*5"
expj.AC0090010.AC0090010button1.select.onClick7 = function () {
  console.log('select script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010button1', '_AC0090010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_TO'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script9="onClick;8;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0090010form1/*@AC0090010Servlet"
expj.AC0090010.AC0090010button1.select.onClick8 = function () {
  console.log('select script9');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0090010', 'AC0090010button1', '_AC0090010form1/*', 'AC0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0090010', response);
expj.common.updateBusinessScreenTab('AC0090010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script10="child;0;CHK;[{~CHARAT(_AC0090010form1/w_TIME_FROM:1)}*10+{~CHARAT(_AC0090010form1/w_TIME_FROM:2)}][gte]60@#AS00121"
expj.AC0090010.AC0090010button1.select.child0 = function () {
  console.log('select script10');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_FROM', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_FROM', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AC0090010', 'AC0090010button1', 'AS00121');
}
};
// script11="child;1;CHK;[{~CHARAT(_AC0090010form1/w_TIME_TO:1)}*10+{~CHARAT(_AC0090010form1/w_TIME_TO:2)}][gte]60@#AS00122"
expj.AC0090010.AC0090010button1.select.child1 = function () {
  console.log('select script11');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_TO', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_TO', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AC0090010', 'AC0090010button1', 'AS00122');
}
};
// script12="child;2;CHK;[{~CHARAT(_AC0090010form1/w_TIME_FROM:0)}*10+{~CHARAT(_AC0090010form1/w_TIME_FROM:1)}][gte]24@#AS00121,*3"
expj.AC0090010.AC0090010button1.select.child2 = function () {
  console.log('select script12');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_FROM', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_FROM', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24'))) {
expj.common.pscript.addErrorMessage('AC0090010', 'AC0090010button1', 'AS00121');
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script13="child;3;CHK;_AC0090010form1/TIME_CTRL[eq]true[and]~LEN(_AC0090010form1/w_TIME_FROM)[eq]4@*4"
expj.AC0090010.AC0090010button1.select.child3 = function () {
  console.log('select script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010button1', '_AC0090010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_FROM'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script14="child;4;CHK;[{~CHARAT(_AC0090010form1/w_TIME_FROM:2)}*10+{~CHARAT(_AC0090010form1/w_TIME_FROM:3)}][gte]60@#AS00121"
expj.AC0090010.AC0090010button1.select.child4 = function () {
  console.log('select script14');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_FROM', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_FROM', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AC0090010', 'AC0090010button1', 'AS00121');
}
};
// script15="child;5;CHK;[{~CHARAT(_AC0090010form1/w_TIME_TO:0)}*10+{~CHARAT(_AC0090010form1/w_TIME_TO:1)}][gte]24@#AS00122,*6"
expj.AC0090010.AC0090010button1.select.child5 = function () {
  console.log('select script15');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_TO', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_TO', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24'))) {
expj.common.pscript.addErrorMessage('AC0090010', 'AC0090010button1', 'AS00122');
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script16="child;6;CHK;_AC0090010form1/TIME_CTRL[eq]true[and]~LEN(_AC0090010form1/w_TIME_TO)[eq]4@*7"
expj.AC0090010.AC0090010button1.select.child6 = function () {
  console.log('select script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010button1', '_AC0090010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_TO'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script17="child;7;CHK;[{~CHARAT(_AC0090010form1/w_TIME_TO:2)}*10+{~CHARAT(_AC0090010form1/w_TIME_TO:3)}][gte]60@#AS00122"
expj.AC0090010.AC0090010button1.select.child7 = function () {
  console.log('select script17');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_TO', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090010button1', '_AC0090010form1/w_TIME_TO', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AC0090010', 'AC0090010button1', 'AS00122');
}
};
expj.AC0090010.AC0090010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 8; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0090010.AC0090010button1.select['onClick' + i])) {
        expj.AC0090010.AC0090010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AC0090010.AC0090010button1.select.executeAllOnDecision = function () {
};
expj.AC0090010.AC0090010button1.select.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0090010', 'AC0090010button1', 'select', this, 'Button');
    }
  });
  expj.AC0090010.AC0090010button1.select.executePScriptOnLoad();
};

expj.AC0090010.AC0090010button1.select.executePScriptOnLoad = function () {
  console.log('execute AC0090010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0090010-AC0090010button1-select" name="select" class="AC0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AC0090010-AC0090010view1">
expj.AC0090010.AC0090010view1 = {};
expj.AC0090010.AC0090010view1.executeAllOnClick = function () {
};
expj.AC0090010.AC0090010view1.executeAllOnDecision = function () {
  console.log('execute AC0090010view1.onDecision');
};
expj.AC0090010.AC0090010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AC0090010view1", "expj.AC0090010.AC0090010view1.executeAllOnClick");
%>
  expj.AC0090010.AC0090010view1.executePScriptOnLoad();
};

expj.AC0090010.AC0090010view1.executePScriptOnLoad = function () {
  console.log('execute AC0090010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AC0090010-AC0090010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AC0090010view1_Id = "AC0090010view1";
 String AC0090010view1_select = "single";
 String AC0090010view1_sortable = "true";
 String AC0090010view1_resize = "true";
 String AC0090010view1_scroll = "true";
 StringBuffer AC0090010view1_HB = new StringBuffer();
 StringBuffer AC0090010view1_DB = new StringBuffer();
%>
<%
 AC0090010view1_select = "single";
 AC0090010view1_sortable = "true";
 AC0090010view1_resize = "true";
 AC0090010view1_scroll = "true";
%>
<%
 AC0090010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AC0090010view1_sortable).append("}").append(",");
%>
     
<%
AC0090010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0090010view1_sortable).append("}").append(",");
AC0090010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0434",rb))).append("', 'name':'EXTERNAL_PLAN_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0090010view1_sortable).append("}").append(",");
AC0090010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.LIMIT",rb))).append("', 'name':'DUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0090010view1_sortable).append("}").append(",");
AC0090010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0447",rb))).append("', 'name':'DM_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AC0090010view1_sortable).append("}").append(",");
AC0090010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'OD_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0090010view1_sortable).append("}").append(",");
AC0090010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0448",rb))).append("', 'name':'ODR_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0090010view1_sortable).append("}").append(",");
%>
<%
 int aAC0090010StructLength = aAC0090010Control.getListsize();
 final AC0090010Struct structBackup = aAC0090010Struct;
 aAC0090010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAC0090010StructLength; ++loopCount) {
  if((aAC0090010Struct = (AC0090010Struct) aAC0090010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAC0090010Struct", aAC0090010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AC0090010view1_DB.append("[");
 AC0090010view1_DB.append(loopCount);
 AC0090010view1_DB.append(",").append("'<span id=\"expj-AC0090010-AC0090010view1-MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AC0090010-AC0090010view1-MODIFY_COUNT\" data-name=\"MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getMODIFY_COUNT())).append("</span>'");
 AC0090010view1_DB.append(",").append("'<span id=\"expj-AC0090010-AC0090010view1-EXTERNAL_PLAN_CD-").append(loopCount).append("\" class=\"expj-label expj-AC0090010-AC0090010view1-EXTERNAL_PLAN_CD\" data-name=\"EXTERNAL_PLAN_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getEXTERNAL_PLAN_CD())).append("</span>'");
 AC0090010view1_DB.append(",").append("'<span id=\"expj-AC0090010-AC0090010view1-DUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0090010-AC0090010view1-DUE_DATE\" data-name=\"DUE_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getDUE_DATE())).append("</span>'");
 AC0090010view1_DB.append(",").append("'<span id=\"expj-AC0090010-AC0090010view1-DM_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0090010-AC0090010view1-DM_QTY\" data-name=\"DM_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0090010Struct.getDM_QTY())).append("</span>'");
 AC0090010view1_DB.append(",").append("'<span id=\"expj-AC0090010-AC0090010view1-OD_NO-").append(loopCount).append("\" class=\"expj-label expj-AC0090010-AC0090010view1-OD_NO\" data-name=\"OD_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getOD_NO())).append("</span>'");
 AC0090010view1_DB.append(",").append("'<span id=\"expj-AC0090010-AC0090010view1-ODR_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0090010-AC0090010view1-ODR_START_DATE\" data-name=\"ODR_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getODR_START_DATE())).append("</span>'");
 AC0090010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAC0090010StructLength) {
   AC0090010view1_DB.append(",");
  }
 }
 aAC0090010Struct = structBackup;
 viewIdList.add(AC0090010view1_Id);
 viewSelectList.add(AC0090010view1_select);
 viewResizeList.add(AC0090010view1_resize);
 viewScrollList.add(AC0090010view1_scroll);
 viewHeaderDataList.add(AC0090010view1_HB);
 viewBodyDataList.add(AC0090010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AC0090010-AC0090010button2">
expj.AC0090010.AC0090010button2 = {};
expj.AC0090010.AC0090010button2.executeAllOnDecision = function () {
  console.log('execute AC0090010button2.onDecision');
};
expj.AC0090010.AC0090010button2.executeOnLoad = function () {
  expj.AC0090010.AC0090010button2.executePScriptOnLoad();
};

expj.AC0090010.AC0090010button2.executePScriptOnLoad = function () {
  console.log('execute AC0090010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0090010-AC0090010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0090010-AC0090010button2-modify">
expj.AC0090010.AC0090010button2.modify = {};
// script1="onClick;0;CHK;_AC0090010view1/ODR_START_DATE[eq]@*0,!AC10032"
expj.AC0090010.AC0090010button2.modify.onClick0 = function () {
  console.log('modify script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010button2', '_AC0090010view1/ODR_START_DATE'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
expj.common.pscript.viewErrorMessage('AC0090010', 'AC0090010button2', 'AC10032');
}
};
// script2="child;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AC0090010form1/*,_AC0090010view1/+@AC0090010Servlet"
expj.AC0090010.AC0090010button2.modify.child0 = function () {
  console.log('modify script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0090010', 'AC0090010button2', '_AC0090010form1/*,_AC0090010view1/+', 'AC0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0090010', response);
expj.common.changeBusinessScreenTab('AC0090010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AC0090010.AC0090010button2.modify.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0090010.AC0090010button2.modify['onClick' + i])) {
        expj.AC0090010.AC0090010button2.modify['onClick' + i]();
      }
    }
  }
};
expj.AC0090010.AC0090010button2.modify.executeAllOnDecision = function () {
};
expj.AC0090010.AC0090010button2.modify.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010button2-modify').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0090010', 'AC0090010button2', 'modify', this, 'Button');
    }
  });
  expj.AC0090010.AC0090010button2.modify.executePScriptOnLoad();
};

expj.AC0090010.AC0090010button2.modify.executePScriptOnLoad = function () {
  console.log('execute AC0090010button2/modify.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010button2-modify');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0090010-AC0090010button2-modify" name="modify" class="AC0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
<script class="expj-script-AC0090010-AC0090010button2-update">
expj.AC0090010.AC0090010button2.update = {};
// script1="onClick;0;CHK;_AC0090010view1/ODR_START_DATE[eq]@!AC10031,*0"
expj.AC0090010.AC0090010button2.update.onClick0 = function () {
  console.log('update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090010button2', '_AC0090010view1/ODR_START_DATE'), '[eq]', '')) {
expj.common.pscript.viewErrorMessage('AC0090010', 'AC0090010button2', 'AC10031');
} else {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0090010form1/*,_AC0090010view1/+@AC0090010Servlet,,$AC90010"
expj.AC0090010.AC0090010button2.update.child0 = function () {
  console.log('update script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0090010', 'AC0090010button2', '_AC0090010form1/*,_AC0090010view1/+', 'AC0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0090010', response);
expj.common.updateBusinessScreenTab('AC0090010', contents);
};
expj.common.pscript.callConfirm('AC0090010', 'AC0090010button2', 'AC90010', okEvent);
};
expj.AC0090010.AC0090010button2.update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0090010.AC0090010button2.update['onClick' + i])) {
        expj.AC0090010.AC0090010button2.update['onClick' + i]();
      }
    }
  }
};
expj.AC0090010.AC0090010button2.update.executeAllOnDecision = function () {
};
expj.AC0090010.AC0090010button2.update.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010button2-update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0090010', 'AC0090010button2', 'update', this, 'Button');
    }
  });
  expj.AC0090010.AC0090010button2.update.executePScriptOnLoad();
};

expj.AC0090010.AC0090010button2.update.executePScriptOnLoad = function () {
  console.log('execute AC0090010button2/update.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010button2-update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0090010-AC0090010button2-update" name="update" class="AC0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.Cmt0449",rb)%></button><!-- 紐付け解除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame17" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 200px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AC0090010 Revision: 1.4  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AC0090010-AC0090010button0">
expj.AC0090010.AC0090010button0 = {};
expj.AC0090010.AC0090010button0.executeAllOnDecision = function () {
  console.log('execute AC0090010button0.onDecision');
};
expj.AC0090010.AC0090010button0.executeOnLoad = function () {
  expj.AC0090010.AC0090010button0.executePScriptOnLoad();
};

expj.AC0090010.AC0090010button0.executePScriptOnLoad = function () {
  console.log('execute AC0090010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0090010-AC0090010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0090010-AC0090010button0-clear">
expj.AC0090010.AC0090010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AC0090010Servlet,,$ZZ07008"
expj.AC0090010.AC0090010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0090010', 'AC0090010button0', '', 'AC0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0090010', response);
expj.common.updateBusinessScreenTab('AC0090010', contents);
};
expj.common.pscript.callConfirm('AC0090010', 'AC0090010button0', 'ZZ07008', okEvent);
};
expj.AC0090010.AC0090010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0090010.AC0090010button0.clear['onClick' + i])) {
        expj.AC0090010.AC0090010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AC0090010.AC0090010button0.clear.executeAllOnDecision = function () {
};
expj.AC0090010.AC0090010button0.clear.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0090010', 'AC0090010button0', 'clear', this, 'Button');
    }
  });
  expj.AC0090010.AC0090010button0.clear.executePScriptOnLoad();
};

expj.AC0090010.AC0090010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AC0090010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0090010-AC0090010button0-clear" name="clear" class="AC0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AC0090010-AC0090010button0-close">
expj.AC0090010.AC0090010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AC0090010.AC0090010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AC0090010');
};
expj.AC0090010.AC0090010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0090010.AC0090010button0.close['onClick' + i])) {
        expj.AC0090010.AC0090010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AC0090010.AC0090010button0.close.executeAllOnDecision = function () {
};
expj.AC0090010.AC0090010button0.close.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0090010', 'AC0090010button0', 'close', this, 'Button');
    }
  });
  expj.AC0090010.AC0090010button0.close.executePScriptOnLoad();
};

expj.AC0090010.AC0090010button0.close.executePScriptOnLoad = function () {
  console.log('execute AC0090010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0090010-AC0090010button0-close" name="close" class="AC0090010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AC0090010 (END)-->
<script class="expj-script-AC0090010-AC0090010detail1">
expj.AC0090010.AC0090010detail1 = {};
expj.AC0090010.AC0090010detail1.executeAllOnDecision = function () {
  console.log('execute AC0090010detail1.onDecision');
};
expj.AC0090010.AC0090010detail1.executeOnLoad = function () {
  expj.AC0090010.AC0090010detail1.executePScriptOnLoad();
};

expj.AC0090010.AC0090010detail1.executePScriptOnLoad = function () {
  console.log('execute AC0090010detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAC0090010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AC0090010-AC0090010detail1" class="expj-datagird-detail" data-float="AC0090010float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AC0090010detail1";
 detailFloat = "AC0090010float1";
 detailWidth = 358;
 detailHeight = 196 + 47;
 String AC0090010detail1_Id = "AC0090010detail1";
 String AC0090010detail1_select = "single";
 String AC0090010detail1_sortable = "true";
 String AC0090010detail1_resize = "true";
 String AC0090010detail1_scroll = "true";
 StringBuffer AC0090010detail1_HB = new StringBuffer();
 StringBuffer AC0090010detail1_DB = new StringBuffer();
%>
<%
 AC0090010detail1_sortable = "false";
 AC0090010detail1_select = "none";
%>
<% AC0090010detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AC0090010detail1_sortable).append("}").append(","); %>
<%  AC0090010detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AC0090010detail1_sortable).append("}").append(",");
AC0090010detail1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AC0090010detail1_sortable).append("}").append(",");
AC0090010detail1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AC0090010detail1_sortable).append("}").append(",");
 %>
  <% AC0090010detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.DRAW_CD",rb)).append("','").append("<span id=\"expj-AC0090010-AC0090010detail1-w_DRAW_CD\" class=\"expj-label\" data-name=\"w_DRAW_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getw_DRAW_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0090010detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.ITEM_SPEC",rb)).append("','").append("<span id=\"expj-AC0090010-AC0090010detail1-w_SPEC\" class=\"expj-label\" data-name=\"w_SPEC\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getw_SPEC())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0090010detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)).append("','").append("<span id=\"expj-AC0090010-AC0090010detail1-w_MRP_ODR_TYP\" class=\"expj-label\" data-name=\"w_MRP_ODR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getw_MRP_ODR_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0090010detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)).append("','").append("<span id=\"expj-AC0090010-AC0090010detail1-w_OUTSIDE_TYP\" class=\"expj-label\" data-name=\"w_OUTSIDE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getw_OUTSIDE_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0090010detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.ITEM_SPOIL",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0090010-AC0090010detail1-w_ITEM_SPOIL\" class=\"expj-label\" data-name=\"w_ITEM_SPOIL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;5.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0090010Struct.getw_ITEM_SPOIL())).append("</span>").append("</div>','").append(CoreTools.getRBString("Expj.Cmt0051",rb)).append("']").append(",");%>
 <% AC0090010detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.UNIT_QTY_TYP",rb)).append("','").append("<span id=\"expj-AC0090010-AC0090010detail1-w_UNIT_QTY_TYP\" class=\"expj-label\" data-name=\"w_UNIT_QTY_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getw_UNIT_QTY_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0090010detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.LOT_SIZING_TYP",rb)).append("','").append("<span id=\"expj-AC0090010-AC0090010detail1-w_LOT_SIZING_TYP\" class=\"expj-label\" data-name=\"w_LOT_SIZING_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getw_LOT_SIZING_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AC0090010detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.MAX_PERIOD",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0090010-AC0090010detail1-w_MAX_PERIOD\" class=\"expj-label\" data-name=\"w_MAX_PERIOD\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAC0090010Struct.getw_MAX_PERIOD())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AC0090010detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.MUL_ODR_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0090010-AC0090010detail1-w_MUL_ODR_QTY\" class=\"expj-label\" data-name=\"w_MUL_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0090010Struct.getw_MUL_ODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AC0090010-AC0090010detail1-STOCK_UNIT_1\" class=\"expj-label\" data-name=\"STOCK_UNIT_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AC0090010detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.MAX_ODR_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0090010-AC0090010detail1-w_MAX_ODR_QTY\" class=\"expj-label\" data-name=\"w_MAX_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0090010Struct.getw_MAX_ODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AC0090010-AC0090010detail1-STOCK_UNIT_2\" class=\"expj-label\" data-name=\"STOCK_UNIT_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AC0090010detail1_DB.append("['11','").append(CoreTools.getRBString("Expj.MIN_ODR_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0090010-AC0090010detail1-w_MIN_ODR_QTY\" class=\"expj-label\" data-name=\"w_MIN_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0090010Struct.getw_MIN_ODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AC0090010-AC0090010detail1-STOCK_UNIT_3\" class=\"expj-label\" data-name=\"STOCK_UNIT_3\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AC0090010detail1_DB.append("['12','").append(CoreTools.getRBString("Expj.SAFETY_STOCK",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AC0090010-AC0090010detail1-w_SAFETY_STOCK\" class=\"expj-label\" data-name=\"w_SAFETY_STOCK\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0090010Struct.getw_SAFETY_STOCK())).append("</span>").append("</div>','").append("<span id=\"expj-AC0090010-AC0090010detail1-STOCK_UNIT_4\" class=\"expj-label\" data-name=\"STOCK_UNIT_4\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
<%
 detailViewId = AC0090010detail1_Id;
 detailViewSelect = AC0090010detail1_select;
 detailViewResize = AC0090010detail1_resize;
 detailViewScroll = AC0090010detail1_scroll;
 detailViewHeaderData = AC0090010detail1_HB;
 detailViewBodyData = AC0090010detail1_DB;
%>
<%
}
%>
<%
MessageStruct msgStruct = aAC0090010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AC0090010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AC0090010)) {
  expj.common.treeInstanceMap.AC0090010 = {};
}
expj.common.treeInstanceMap.AC0090010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0090010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AC0090010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0090010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AC0090010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AC0090010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AC0090010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AC0090010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AC0090010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AC0090010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AC0090010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0090010)) {
  expj.common.detailDialogMap.AC0090010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0090010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AC0090010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0090010.<%=detailId %>)) {
  expj.common.detailDialogMap.AC0090010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0090010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AC0090010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0090010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AC0090010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AC0090010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AC0090010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AC0090010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AC0090010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AC0090010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AC0090010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AC0090010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AC0090010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AC0090010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AC0090010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AC0090010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AC0090010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AC0090010)) {
  expj.common.viewInstanceMap.AC0090010 = {};
}
expj.common.viewInstanceMap.AC0090010.<%=viewId %> = {};
expj.common.viewInstanceMap.AC0090010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AC0090010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AC0090010.<%=viewId %>.init = function () {
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
    expj.AC0090010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AC0090010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AC0090010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AC0090010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AC0090010_init">
/**
 * AC0090010用のロード完了時初期化関数
 */
expj.AC0090010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AC0090010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AC0090010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AC0090010');
  expj.common.calendarInstanceMap.AC0090010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AC0090010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AC0090010.<%=detailId %>.init();
  expj.common.detailDialogMap.AC0090010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AC0090010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AC0090010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AC0090010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AC0090010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AC0090010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AC0090010-<%=detailId %>');
<%
 }
%>
  try{expj.AC0090010.AC0090010form1.w_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.w_DRAW_CD.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.w_SPEC.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.w_PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.w_MRP_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.w_OUTSIDE_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.w_ITEM_SPOIL.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.w_UNIT_QTY_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.w_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.w_LOT_SIZING_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.w_MAX_PERIOD.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.w_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.w_MAX_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.w_MIN_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.w_MUL_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.w_SAFETY_STOCK.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.w_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.Calendarw_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.w_TIME_FROM.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.w_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.Calendarw_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.w_TIME_TO.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010button1.Detail.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010button1.select.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010button2.modify.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010button2.update.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010button0.close.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010form1.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010button1.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010view1.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010button2.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010button0.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090010detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AC0090010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AC0090010', 'AC0090010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AC0090010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AC0090010-focus-move');
  // 初期フォーカス当てる処理
  $('.AC0090010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AC0090010', '<%=request.getContextPath() %>');
};

/**
 * AC0090010の全体onDecision処理
 */
expj.AC0090010.executeAllOnDecision = function () {
  expj.AC0090010.AC0090010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AC0090010_console">
expj.AC0090010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>