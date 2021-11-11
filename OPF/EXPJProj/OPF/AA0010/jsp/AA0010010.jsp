<%-- ***
This file is generated
 GeneratedDate  : Thu Nov 11 14:31:13 JST 2021
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0010\AA0010010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0010.*" %>
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
<jsp:useBean id="aAA0010010Control" class="com.nec.jp.orteus.metamorBase.AA0010.AA0010010Control" scope="request"/>
<jsp:useBean id="aAA0010010Struct" class="com.nec.jp.orteus.metamorBase.AA0010.AA0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

品目メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0010/AA0010010.html,v $
$Author: geng-jia $  
$Revision: 1.22 $ $Date: 2017/02/13 02:07:51 $
********************************************************* --%>
<html>
<head>
<title>品目メンテナンス</title>
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
 List viewTypeList = new ArrayList();
 Map viewSelectEvent = new HashMap();
 Map treeClickEvent = new HashMap();
%>
<script class="expj-script-AA0010010_init">
  // AA0010010名前空間
  expj.AA0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<%
   String lotCtrlFlg = aAA0010010Struct.getLOTCTRLFLG();
%>
<body>

  <div id="expj-business-screen-AA0010010" data-screen="AA0010010" data-newdata="<%=aAA0010010Control.isNewData() %>">
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
              <script class="expj-script-AA0010010-AA0010010form1">
expj.AA0010010.AA0010010form1 = {};
expj.AA0010010.AA0010010form1.onLoad0 = function () {
  console.log('AA0010010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child2)){this.child2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child5)){this.child5();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child13)){this.child13();}
};
expj.AA0010010.AA0010010form1.onLoad1 = function () {
  console.log('AA0010010form1 script2');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
};
expj.AA0010010.AA0010010form1.onDecision0 = function () {
  console.log('AA0010010form1 script3');
if (expj.common.pscript.satisfiedRequiredComponent('AA0010010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
expj.AA0010010.AA0010010form1.child0 = function () {
  console.log('AA0010010form1 script4');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form1', '_AA0010010button1/select');
};
expj.AA0010010.AA0010010form1.child1 = function () {
  console.log('AA0010010form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form1', '_AA0010010button1/select');
};
expj.AA0010010.AA0010010form1.child2 = function () {
  console.log('AA0010010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form1', '?AA0010010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
expj.AA0010010.AA0010010form1.child3 = function () {
  console.log('AA0010010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form1', '_AA0010010button2/insert');
};
expj.AA0010010.AA0010010form1.child4 = function () {
  console.log('AA0010010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form1', '_AA0010010button2/update');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form1', '_AA0010010button2/delete');
};
expj.AA0010010.AA0010010form1.onDecision1 = function () {
  console.log('AA0010010form1 script9');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
expj.AA0010010.AA0010010form1.child5 = function () {
  console.log('AA0010010form1 script10');
if (expj.common.pscript.satisfiedRequiredComponent('AA0010010', 'A')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
expj.AA0010010.AA0010010form1.child6 = function () {
  console.log('AA0010010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form1', '?AA0010010form1/*'), '[eq]', 'INITIAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form1', '?AA0010010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
expj.AA0010010.AA0010010form1.child7 = function () {
  console.log('AA0010010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form1', '_AA0010010form1/ITEM_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form1', '_AA0010010form1/h_ITEM_CD'))) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
expj.AA0010010.AA0010010form1.child8 = function () {
  console.log('AA0010010form1 script13');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form1', '_AA0010010button2/update');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
expj.AA0010010.AA0010010form1.child9 = function () {
  console.log('AA0010010form1 script14');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form1', '_AA0010010button2/insert');
};
expj.AA0010010.AA0010010form1.child10 = function () {
  console.log('AA0010010form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form1', '_AA0010010button2/insert');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child11)){this.child11();}}
};
expj.AA0010010.AA0010010form1.child11 = function () {
  console.log('AA0010010form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form1', '_AA0010010button2/update');
};
expj.AA0010010.AA0010010form1.child12 = function () {
  console.log('AA0010010form1 script17');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form1', '_AA0010010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form1', '_AA0010010button2/update');
};
expj.AA0010010.AA0010010form1.onDecision2 = function () {
  console.log('AA0010010form1 script18');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
expj.AA0010010.AA0010010form1.child13 = function () {
  console.log('AA0010010form1 script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form1', '?AA0010010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
expj.AA0010010.AA0010010form1.child14 = function () {
  console.log('AA0010010form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form1', '_AA0010010form1/ITEM_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form1', '_AA0010010form1/h_ITEM_CD'))) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
expj.AA0010010.AA0010010form1.child15 = function () {
  console.log('AA0010010form1 script21');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form1', '_AA0010010button2/delete');
};
expj.AA0010010.AA0010010form1.child16 = function () {
  console.log('AA0010010form1 script22');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form1', '_AA0010010button2/delete');
};
expj.AA0010010.AA0010010form1.onDecision3 = function () {
  console.log('AA0010010form1 script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form1', '_AA0010010form1/h_APR_ITEM'), '[neq]', '1')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
expj.AA0010010.AA0010010form1.child17 = function () {
  console.log('AA0010010form1 script24');
expj.common.pscript.setReferenceComponentValue('AA0010010', 'AA0010010form1', '_AA0010010form2/APPR_REMARKS', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child18)){this.child18();}}
};
expj.AA0010010.AA0010010form1.child18 = function () {
  console.log('AA0010010form1 script25');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form1', '_AA0010010form2/APPR_REMARKS');
};
expj.AA0010010.AA0010010form1.child19 = function () {
  console.log('AA0010010form1 script26');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form1', '_AA0010010form2/APPR_REMARKS');
};
expj.AA0010010.AA0010010form1.onDecision4 = function () {
  console.log('AA0010010form1 script27');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form1', '_AA0010010form1/h_SCREENMOVE_TYP'), '[eq]', '0') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form1', '_AA0010010form1/h_SCREENMOVE_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
expj.AA0010010.AA0010010form1.child20 = function () {
  console.log('AA0010010form1 script28');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form1', '_AA0010010button1/select');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form1', '_AA0010010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form1', '_AA0010010button2/update');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form1', '_AA0010010button2/delete');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form1', '_AA0010010button0/clear');
};
expj.AA0010010.AA0010010form1.executeAllOnDecision = function () {
  console.log('execute AA0010010form1.onDecision');
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form1['onDecision' + i])) {
        expj.AA0010010.AA0010010form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010form1.executeOnLoad = function () {
  expj.AA0010010.AA0010010form1.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form1.executePScriptOnLoad = function () {
  console.log('execute AA0010010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form1['onLoad' + i])) {
      expj.AA0010010.AA0010010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0010010-AA0010010form1" action="AA0010010Servlet" name="AA0010010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAA0010010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form1-ITEM_CD">
expj.AA0010010.AA0010010form1.ITEM_CD = {};
expj.AA0010010.AA0010010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0010010form1/ITEM_CD.onDecision');
  expj.AA0010010.AA0010010form1.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form1', 'ITEM_CD', this);
  });
  expj.AA0010010.AA0010010form1.ITEM_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form1-ITEM_CD" name="ITEM_CD" class="AA0010010-focus-move  required-value expj-AA0010010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AA0010010-AA0010010form1-h_ITEM_CD" name="h_ITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0010010Struct.geth_ITEM_CD()) %>">
<script class="expj-script-AA0010010-AA0010010form1-h_ITEM_CD">
expj.AA0010010.AA0010010form1.h_ITEM_CD = {};
expj.AA0010010.AA0010010form1.h_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0010010form1/h_ITEM_CD.onDecision');
  expj.AA0010010.AA0010010form1.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form1.h_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form1-h_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form1', 'h_ITEM_CD', this);
  });
  expj.AA0010010.AA0010010form1.h_ITEM_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form1.h_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form1/h_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form1-h_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AA0010010-AA0010010form1-PeekerItemCd">
expj.AA0010010.AA0010010form1.PeekerItemCd = {};
expj.AA0010010.AA0010010form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0010010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form1', '_AA0010010form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0010010form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0010010.AA0010010form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form1.PeekerItemCd['onClick' + i])) {
        expj.AA0010010.AA0010010form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AA0010010.AA0010010form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0010010', 'AA0010010form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AA0010010.AA0010010form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AA0010010form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0010010-AA0010010form1-PeekerItemCd" name="PeekerItemCd" class="AA0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<input type="hidden" id="expj-AA0010010-AA0010010form1-h_APR_ITEM" name="h_APR_ITEM" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0010010Struct.geth_APR_ITEM()) %>">
<script class="expj-script-AA0010010-AA0010010form1-h_APR_ITEM">
expj.AA0010010.AA0010010form1.h_APR_ITEM = {};
expj.AA0010010.AA0010010form1.h_APR_ITEM.executeAllOnDecision = function () {
  console.log('execute AA0010010form1/h_APR_ITEM.onDecision');
  expj.AA0010010.AA0010010form1.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form1.h_APR_ITEM.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form1-h_APR_ITEM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form1', 'h_APR_ITEM', this);
  });
  expj.AA0010010.AA0010010form1.h_APR_ITEM.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form1.h_APR_ITEM.executePScriptOnLoad = function () {
  console.log('execute AA0010010form1/h_APR_ITEM.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form1-h_APR_ITEM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0010010-AA0010010form1-h_SCREENMOVE_TYP" name="h_SCREENMOVE_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0010010Struct.geth_SCREENMOVE_TYP()) %>">
<script class="expj-script-AA0010010-AA0010010form1-h_SCREENMOVE_TYP">
expj.AA0010010.AA0010010form1.h_SCREENMOVE_TYP = {};
expj.AA0010010.AA0010010form1.h_SCREENMOVE_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form1/h_SCREENMOVE_TYP.onDecision');
  expj.AA0010010.AA0010010form1.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form1.h_SCREENMOVE_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form1-h_SCREENMOVE_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form1', 'h_SCREENMOVE_TYP', this);
  });
  expj.AA0010010.AA0010010form1.h_SCREENMOVE_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form1.h_SCREENMOVE_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form1/h_SCREENMOVE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form1-h_SCREENMOVE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0010010-AA0010010form1-h_APPR_ID" name="h_APPR_ID" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0010010Struct.geth_APPR_ID()) %>">
<script class="expj-script-AA0010010-AA0010010form1-h_APPR_ID">
expj.AA0010010.AA0010010form1.h_APPR_ID = {};
expj.AA0010010.AA0010010form1.h_APPR_ID.executeAllOnDecision = function () {
  console.log('execute AA0010010form1/h_APPR_ID.onDecision');
  expj.AA0010010.AA0010010form1.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form1.h_APPR_ID.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form1-h_APPR_ID').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form1', 'h_APPR_ID', this);
  });
  expj.AA0010010.AA0010010form1.h_APPR_ID.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form1.h_APPR_ID.executePScriptOnLoad = function () {
  console.log('execute AA0010010form1/h_APPR_ID.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form1-h_APPR_ID');
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0010010-AA0010010button1">
expj.AA0010010.AA0010010button1 = {};
expj.AA0010010.AA0010010button1.executeAllOnDecision = function () {
  console.log('execute AA0010010button1.onDecision');
};
expj.AA0010010.AA0010010button1.executeOnLoad = function () {
  expj.AA0010010.AA0010010button1.executePScriptOnLoad();
};

expj.AA0010010.AA0010010button1.executePScriptOnLoad = function () {
  console.log('execute AA0010010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0010010-AA0010010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0010010-AA0010010button1-select">
expj.AA0010010.AA0010010button1.select = {};
expj.AA0010010.AA0010010button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0010010', 'AA0010010button1', '_AA0010010form1/*', 'AA0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0010010', response);
expj.common.updateBusinessScreenTab('AA0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0010010.AA0010010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010button1.select['onClick' + i])) {
        expj.AA0010010.AA0010010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010button1.select.executeAllOnDecision = function () {
};
expj.AA0010010.AA0010010button1.select.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0010010', 'AA0010010button1', 'select', this, 'Button');
    }
  });
  expj.AA0010010.AA0010010button1.select.executePScriptOnLoad();
};

expj.AA0010010.AA0010010button1.select.executePScriptOnLoad = function () {
  console.log('execute AA0010010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0010010-AA0010010button1-select" name="select" class="AA0010010-focus-move" data-lock="0" style="width:100px;" <%= request.getAttribute("ORTEUS_REVOKE_PRIV_SELECT")!=null?"data-revokectrl=\"disabled\"":"data-revokectrl=\"none\"" %>><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div id="expj-AA0010010-AA0010010tabs" class="tabs"  style="width:100%;height:100%;padding:0px;border:0px;"><!--画面内tab-->
  <ul id="expj-AA0010010-AA0010010tabs-tabIndex" style="width:100%;padding:0px;border:0px;margin-left:5px;"></ul>
<div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 32px);"><!--table2-->
<div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AA0010010-AA0010010form2">
expj.AA0010010.AA0010010form2 = {};
expj.AA0010010.AA0010010form2.executeAllOnDecision = function () {
  console.log('execute AA0010010form2.onDecision');
};
expj.AA0010010.AA0010010form2.executeOnLoad = function () {
  expj.AA0010010.AA0010010form2.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0010010-AA0010010form2" action="AA0010010Servlet" name="AA0010010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_NAME",rb)%></span><!-- 品目名 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-ITEM_NAME">
expj.AA0010010.AA0010010form2.ITEM_NAME = {};
expj.AA0010010.AA0010010form2.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/ITEM_NAME.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'ITEM_NAME', this);
  });
  expj.AA0010010.AA0010010form2.ITEM_NAME.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-ITEM_NAME" name="ITEM_NAME" class="AA0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DRAW_CD",rb)%></span><!-- 図面番号 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-DRAW_CD">
expj.AA0010010.AA0010010form2.DRAW_CD = {};
expj.AA0010010.AA0010010form2.DRAW_CD.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/DRAW_CD.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.DRAW_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-DRAW_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'DRAW_CD', this);
  });
  expj.AA0010010.AA0010010form2.DRAW_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.DRAW_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/DRAW_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-DRAW_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-DRAW_CD" name="DRAW_CD" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getDRAW_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.HIGH_LEVEL_NO",rb)%></span><!-- レベル番号 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-HIGH_LEVEL_NO">
expj.AA0010010.AA0010010form2.HIGH_LEVEL_NO = {};
expj.AA0010010.AA0010010form2.HIGH_LEVEL_NO.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/HIGH_LEVEL_NO.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.HIGH_LEVEL_NO.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-HIGH_LEVEL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'HIGH_LEVEL_NO', this);
  });
  expj.AA0010010.AA0010010form2.HIGH_LEVEL_NO.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.HIGH_LEVEL_NO.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/HIGH_LEVEL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-HIGH_LEVEL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-HIGH_LEVEL_NO" name="HIGH_LEVEL_NO" class="AA0010010-focus-move expj-align-right " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getHIGH_LEVEL_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SPEC",rb)%></span><!-- 規格 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-SPEC">
expj.AA0010010.AA0010010form2.SPEC = {};
expj.AA0010010.AA0010010form2.SPEC.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/SPEC.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.SPEC.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-SPEC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'SPEC', this);
  });
  expj.AA0010010.AA0010010form2.SPEC.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.SPEC.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/SPEC.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-SPEC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-SPEC" name="SPEC" class="AA0010010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getSPEC()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ISSUE_TYP",rb)%></span><!-- 出庫区分 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-ISSUE_TYP">
expj.AA0010010.AA0010010form2.ISSUE_TYP = {};
expj.AA0010010.AA0010010form2.ISSUE_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/ISSUE_TYP.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.ISSUE_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-ISSUE_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0010010', 'AA0010010form2', 'ISSUE_TYP', this);
  });
  expj.AA0010010.AA0010010form2.ISSUE_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.ISSUE_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/ISSUE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-ISSUE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0010010-AA0010010form2-ISSUE_TYP" name='ISSUE_TYP' class='AA0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = (aAA0010010Control.getStruct().getList_ISSUE_TYP_name()==null ? 0:aAA0010010Control.getStruct().getList_ISSUE_TYP_name().size()); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_ISSUE_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_ISSUE_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0010010Struct.getISSUE_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.UNIT_QTY_TYP",rb)%></span><!-- 在庫数単位区分 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-UNIT_QTY_TYP">
expj.AA0010010.AA0010010form2.UNIT_QTY_TYP = {};
expj.AA0010010.AA0010010form2.UNIT_QTY_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/UNIT_QTY_TYP.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.UNIT_QTY_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-UNIT_QTY_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0010010', 'AA0010010form2', 'UNIT_QTY_TYP', this);
  });
  expj.AA0010010.AA0010010form2.UNIT_QTY_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.UNIT_QTY_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/UNIT_QTY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-UNIT_QTY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><select id="expj-AA0010010-AA0010010form2-UNIT_QTY_TYP" name='UNIT_QTY_TYP' class='AA0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = (aAA0010010Control.getStruct().getList_UNIT_QTY_TYP_name()==null ? 0:aAA0010010Control.getStruct().getList_UNIT_QTY_TYP_name().size()); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_UNIT_QTY_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_UNIT_QTY_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0010010Struct.getUNIT_QTY_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)%></span><!-- 内外作区分 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-OUTSIDE_TYP">
expj.AA0010010.AA0010010form2.OUTSIDE_TYP = {};
expj.AA0010010.AA0010010form2.OUTSIDE_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/OUTSIDE_TYP.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.OUTSIDE_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-OUTSIDE_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0010010', 'AA0010010form2', 'OUTSIDE_TYP', this);
  });
  expj.AA0010010.AA0010010form2.OUTSIDE_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.OUTSIDE_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/OUTSIDE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-OUTSIDE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0010010-AA0010010form2-OUTSIDE_TYP" name='OUTSIDE_TYP' class='AA0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = (aAA0010010Control.getStruct().getList_OUTSIDE_TYP_name()==null ? 0:aAA0010010Control.getStruct().getList_OUTSIDE_TYP_name().size()); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_OUTSIDE_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_OUTSIDE_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0010010Struct.getOUTSIDE_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ACPT_INSPC_TYP",rb)%></span><!-- 受入検査区分 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-ACPT_INSPC_TYP">
expj.AA0010010.AA0010010form2.ACPT_INSPC_TYP = {};
expj.AA0010010.AA0010010form2.ACPT_INSPC_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/ACPT_INSPC_TYP.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.ACPT_INSPC_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-ACPT_INSPC_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0010010', 'AA0010010form2', 'ACPT_INSPC_TYP', this);
  });
  expj.AA0010010.AA0010010form2.ACPT_INSPC_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.ACPT_INSPC_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/ACPT_INSPC_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-ACPT_INSPC_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><select id="expj-AA0010010-AA0010010form2-ACPT_INSPC_TYP" name='ACPT_INSPC_TYP' class='AA0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = (aAA0010010Control.getStruct().getList_ACPT_INSPC_TYP_name()==null ? 0:aAA0010010Control.getStruct().getList_ACPT_INSPC_TYP_name().size()); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_ACPT_INSPC_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_ACPT_INSPC_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0010010Struct.getACPT_INSPC_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_UNIT_FLG",rb)%></span><!-- 荷姿管理フラグ --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-STOCK_UNIT_FLG">
expj.AA0010010.AA0010010form2.STOCK_UNIT_FLG = {};
expj.AA0010010.AA0010010form2.STOCK_UNIT_FLG.onLoad0 = function () {
  console.log('STOCK_UNIT_FLG script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
expj.AA0010010.AA0010010form2.STOCK_UNIT_FLG.onDecision0 = function () {
  console.log('STOCK_UNIT_FLG script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form2', '_AA0010010form2/STOCK_UNIT_FLG'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
expj.AA0010010.AA0010010form2.STOCK_UNIT_FLG.child0 = function () {
  console.log('STOCK_UNIT_FLG script3');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/PKG_UNIT');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
expj.AA0010010.AA0010010form2.STOCK_UNIT_FLG.child1 = function () {
  console.log('STOCK_UNIT_FLG script4');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/PKG_UNIT_QTY');
};
expj.AA0010010.AA0010010form2.STOCK_UNIT_FLG.child2 = function () {
  console.log('STOCK_UNIT_FLG script5');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/PKG_UNIT');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
expj.AA0010010.AA0010010form2.STOCK_UNIT_FLG.child3 = function () {
  console.log('STOCK_UNIT_FLG script6');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/PKG_UNIT_QTY');
};
expj.AA0010010.AA0010010form2.STOCK_UNIT_FLG.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/STOCK_UNIT_FLG.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form2.STOCK_UNIT_FLG['onDecision' + i])) {
        expj.AA0010010.AA0010010form2.STOCK_UNIT_FLG['onDecision' + i]();
      }
    }
  }
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.STOCK_UNIT_FLG.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-STOCK_UNIT_FLG').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0010010', 'AA0010010form2', 'STOCK_UNIT_FLG', this);
  });
  expj.AA0010010.AA0010010form2.STOCK_UNIT_FLG.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.STOCK_UNIT_FLG.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/STOCK_UNIT_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-STOCK_UNIT_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form2.STOCK_UNIT_FLG['onLoad' + i])) {
      expj.AA0010010.AA0010010form2.STOCK_UNIT_FLG['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0010010-AA0010010form2-STOCK_UNIT_FLG" name='STOCK_UNIT_FLG' class='AA0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = (aAA0010010Control.getStruct().getList_STOCK_UNIT_FLG_name()==null ? 0:aAA0010010Control.getStruct().getList_STOCK_UNIT_FLG_name().size()); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_STOCK_UNIT_FLG_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_STOCK_UNIT_FLG_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0010010Struct.getSTOCK_UNIT_FLG()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PRODUCT_TYP",rb)%></span><!-- 製品区分 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-PRODUCT_TYP">
expj.AA0010010.AA0010010form2.PRODUCT_TYP = {};
expj.AA0010010.AA0010010form2.PRODUCT_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/PRODUCT_TYP.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.PRODUCT_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-PRODUCT_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0010010', 'AA0010010form2', 'PRODUCT_TYP', this);
  });
  expj.AA0010010.AA0010010form2.PRODUCT_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.PRODUCT_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/PRODUCT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-PRODUCT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><select id="expj-AA0010010-AA0010010form2-PRODUCT_TYP" name='PRODUCT_TYP' class='AA0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = (aAA0010010Control.getStruct().getList_PRODUCT_TYP_name()==null ? 0:aAA0010010Control.getStruct().getList_PRODUCT_TYP_name().size()); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_PRODUCT_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_PRODUCT_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0010010Struct.getPRODUCT_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_UNIT",rb)%></span><!-- 計量単位 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-STOCK_UNIT">
expj.AA0010010.AA0010010form2.STOCK_UNIT = {};
expj.AA0010010.AA0010010form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/STOCK_UNIT.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-STOCK_UNIT').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0010010', 'AA0010010form2', 'STOCK_UNIT', this);
  });
  expj.AA0010010.AA0010010form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0010010-AA0010010form2-STOCK_UNIT" name='STOCK_UNIT' class='AA0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = (aAA0010010Control.getStruct().getList_STOCK_UNIT_name()==null ? 0:aAA0010010Control.getStruct().getList_STOCK_UNIT_name().size()); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_STOCK_UNIT_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_STOCK_UNIT_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0010010Struct.getSTOCK_UNIT()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ABC_TYP",rb)%></span><!-- 棚卸区分 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-ABC_TYP">
expj.AA0010010.AA0010010form2.ABC_TYP = {};
expj.AA0010010.AA0010010form2.ABC_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/ABC_TYP.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.ABC_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-ABC_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0010010', 'AA0010010form2', 'ABC_TYP', this);
  });
  expj.AA0010010.AA0010010form2.ABC_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.ABC_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/ABC_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-ABC_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><select id="expj-AA0010010-AA0010010form2-ABC_TYP" name='ABC_TYP' class='AA0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = (aAA0010010Control.getStruct().getList_ABC_TYP_name()==null ? 0:aAA0010010Control.getStruct().getList_ABC_TYP_name().size()); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_ABC_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_ABC_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0010010Struct.getABC_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PKG_UNIT",rb)%></span><!-- 荷姿計量単位 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-PKG_UNIT">
expj.AA0010010.AA0010010form2.PKG_UNIT = {};
expj.AA0010010.AA0010010form2.PKG_UNIT.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/PKG_UNIT.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.PKG_UNIT.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-PKG_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'PKG_UNIT', this);
  });
  expj.AA0010010.AA0010010form2.PKG_UNIT.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.PKG_UNIT.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/PKG_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-PKG_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-PKG_UNIT" name="PKG_UNIT" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getPKG_UNIT()) %>" maxlength="12" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OPR_RSLT_TYP",rb)%></span><!-- 作業実績区分 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-OPR_RSLT_TYP">
expj.AA0010010.AA0010010form2.OPR_RSLT_TYP = {};
expj.AA0010010.AA0010010form2.OPR_RSLT_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/OPR_RSLT_TYP.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.OPR_RSLT_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-OPR_RSLT_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0010010', 'AA0010010form2', 'OPR_RSLT_TYP', this);
  });
  expj.AA0010010.AA0010010form2.OPR_RSLT_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.OPR_RSLT_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/OPR_RSLT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-OPR_RSLT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><select id="expj-AA0010010-AA0010010form2-OPR_RSLT_TYP" name='OPR_RSLT_TYP' class='AA0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = (aAA0010010Control.getStruct().getList_OPR_RSLT_TYP_name()==null ? 0:aAA0010010Control.getStruct().getList_OPR_RSLT_TYP_name().size()); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_OPR_RSLT_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_OPR_RSLT_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0010010Struct.getOPR_RSLT_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PKG_UNIT_QTY",rb)%></span><!-- 荷姿単位数 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-PKG_UNIT_QTY">
expj.AA0010010.AA0010010form2.PKG_UNIT_QTY = {};
expj.AA0010010.AA0010010form2.PKG_UNIT_QTY.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/PKG_UNIT_QTY.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.PKG_UNIT_QTY.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-PKG_UNIT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'PKG_UNIT_QTY', this);
  });
  expj.AA0010010.AA0010010form2.PKG_UNIT_QTY.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.PKG_UNIT_QTY.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/PKG_UNIT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-PKG_UNIT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-PKG_UNIT_QTY" name="PKG_UNIT_QTY" class="AA0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getPKG_UNIT_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SPL_ITEM_TYP",rb)%></span><!-- 受給品区分 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-SPL_ITEM_TYP">
expj.AA0010010.AA0010010form2.SPL_ITEM_TYP = {};
expj.AA0010010.AA0010010form2.SPL_ITEM_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/SPL_ITEM_TYP.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.SPL_ITEM_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-SPL_ITEM_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0010010', 'AA0010010form2', 'SPL_ITEM_TYP', this);
  });
  expj.AA0010010.AA0010010form2.SPL_ITEM_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.SPL_ITEM_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/SPL_ITEM_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-SPL_ITEM_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><select id="expj-AA0010010-AA0010010form2-SPL_ITEM_TYP" name='SPL_ITEM_TYP' class='AA0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = (aAA0010010Control.getStruct().getList_SPL_ITEM_TYP_name()==null ? 0:aAA0010010Control.getStruct().getList_SPL_ITEM_TYP_name().size()); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_SPL_ITEM_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_SPL_ITEM_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0010010Struct.getSPL_ITEM_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-AA0010010-AA0010010form2-MODIFY_COUNT" name="MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getMODIFY_COUNT()) %>">
<script class="expj-script-AA0010010-AA0010010form2-MODIFY_COUNT">
expj.AA0010010.AA0010010form2.MODIFY_COUNT = {};
expj.AA0010010.AA0010010form2.MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/MODIFY_COUNT.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'MODIFY_COUNT', this);
  });
  expj.AA0010010.AA0010010form2.MODIFY_COUNT.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_LT",rb)%></span><!-- 手配リードタイム --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-ODR_LT">
expj.AA0010010.AA0010010form2.ODR_LT = {};
expj.AA0010010.AA0010010form2.ODR_LT.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/ODR_LT.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.ODR_LT.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-ODR_LT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'ODR_LT', this);
  });
  expj.AA0010010.AA0010010form2.ODR_LT.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.ODR_LT.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/ODR_LT.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-ODR_LT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-ODR_LT" name="ODR_LT" class="AA0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getODR_LT()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ISSUE_LT",rb)%></span><!-- 払出リードタイム --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-ISSUE_LT">
expj.AA0010010.AA0010010form2.ISSUE_LT = {};
expj.AA0010010.AA0010010form2.ISSUE_LT.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/ISSUE_LT.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.ISSUE_LT.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-ISSUE_LT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'ISSUE_LT', this);
  });
  expj.AA0010010.AA0010010form2.ISSUE_LT.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.ISSUE_LT.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/ISSUE_LT.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-ISSUE_LT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-ISSUE_LT" name="ISSUE_LT" class="AA0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getISSUE_LT()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.FIXED_LT",rb)%></span><!-- 固定分リードタイム --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-FIXED_LT">
expj.AA0010010.AA0010010form2.FIXED_LT = {};
expj.AA0010010.AA0010010form2.FIXED_LT.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/FIXED_LT.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.FIXED_LT.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-FIXED_LT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'FIXED_LT', this);
  });
  expj.AA0010010.AA0010010form2.FIXED_LT.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.FIXED_LT.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/FIXED_LT.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-FIXED_LT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-FIXED_LT" name="FIXED_LT" class="AA0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getFIXED_LT()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROP_LOT_SIZE",rb)%></span><!-- 比例分ロットサイズ --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-PROP_LOT_SIZE">
expj.AA0010010.AA0010010form2.PROP_LOT_SIZE = {};
expj.AA0010010.AA0010010form2.PROP_LOT_SIZE.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/PROP_LOT_SIZE.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.PROP_LOT_SIZE.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-PROP_LOT_SIZE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'PROP_LOT_SIZE', this);
  });
  expj.AA0010010.AA0010010form2.PROP_LOT_SIZE.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.PROP_LOT_SIZE.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/PROP_LOT_SIZE.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-PROP_LOT_SIZE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-PROP_LOT_SIZE" name="PROP_LOT_SIZE" class="AA0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getPROP_LOT_SIZE()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROP_LT",rb)%></span><!-- 品目比例分リードタイム --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-PROP_LT">
expj.AA0010010.AA0010010form2.PROP_LT = {};
expj.AA0010010.AA0010010form2.PROP_LT.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/PROP_LT.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.PROP_LT.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-PROP_LT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'PROP_LT', this);
  });
  expj.AA0010010.AA0010010form2.PROP_LT.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.PROP_LT.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/PROP_LT.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-PROP_LT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-PROP_LT" name="PROP_LT" class="AA0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getPROP_LT()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_SPOIL",rb)%></span><!-- 品目仕損率 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-ITEM_SPOIL">
expj.AA0010010.AA0010010form2.ITEM_SPOIL = {};
expj.AA0010010.AA0010010form2.ITEM_SPOIL.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/ITEM_SPOIL.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.ITEM_SPOIL.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-ITEM_SPOIL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'ITEM_SPOIL', this);
  });
  expj.AA0010010.AA0010010form2.ITEM_SPOIL.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.ITEM_SPOIL.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/ITEM_SPOIL.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-ITEM_SPOIL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-ITEM_SPOIL" name="ITEM_SPOIL" class="AA0010010-focus-move  " style="width:100%;text-align: right;" data-kind="OBT_NUMBER_Z;5.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_SPOIL()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0051",rb)%></span><!-- ％ --></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SAFETY_LT",rb)%></span><!-- 安全日数 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-SAFETY_LT">
expj.AA0010010.AA0010010form2.SAFETY_LT = {};
expj.AA0010010.AA0010010form2.SAFETY_LT.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/SAFETY_LT.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.SAFETY_LT.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-SAFETY_LT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'SAFETY_LT', this);
  });
  expj.AA0010010.AA0010010form2.SAFETY_LT.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.SAFETY_LT.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/SAFETY_LT.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-SAFETY_LT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-SAFETY_LT" name="SAFETY_LT" class="AA0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getSAFETY_LT()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SAFETY_STOCK",rb)%></span><!-- 安全在庫量 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-SAFETY_STOCK">
expj.AA0010010.AA0010010form2.SAFETY_STOCK = {};
expj.AA0010010.AA0010010form2.SAFETY_STOCK.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/SAFETY_STOCK.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.SAFETY_STOCK.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-SAFETY_STOCK').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'SAFETY_STOCK', this);
  });
  expj.AA0010010.AA0010010form2.SAFETY_STOCK.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.SAFETY_STOCK.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/SAFETY_STOCK.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-SAFETY_STOCK');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-SAFETY_STOCK" name="SAFETY_STOCK" class="AA0010010-focus-move  " style="width:100%;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getSAFETY_STOCK()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)%></span><!-- 品目手配区分 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-MRP_ODR_TYP">
expj.AA0010010.AA0010010form2.MRP_ODR_TYP = {};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.onLoad0 = function () {
  console.log('MRP_ODR_TYP script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.onDecision0 = function () {
  console.log('MRP_ODR_TYP script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form2', '_AA0010010form2/MRP_ODR_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child0 = function () {
  console.log('MRP_ODR_TYP script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form2', '_AA0010010form2/MRP_ODR_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child1 = function () {
  console.log('MRP_ODR_TYP script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form2', '_AA0010010form2/MRP_ODR_TYP'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child2 = function () {
  console.log('MRP_ODR_TYP script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form2', '_AA0010010form2/MRP_ODR_TYP'), '[eq]', '5')) {
if(expj.common.checkNameSpace(this.child36)){this.child36();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child3 = function () {
  console.log('MRP_ODR_TYP script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form2', '_AA0010010form2/MRP_ODR_TYP'), '[eq]', '6')) {
if(expj.common.checkNameSpace(this.child46)){this.child46();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child4 = function () {
  console.log('MRP_ODR_TYP script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form2', '_AA0010010form2/MRP_ODR_TYP'), '[eq]', '7')) {
if(expj.common.checkNameSpace(this.child56)){this.child56();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child5 = function () {
  console.log('MRP_ODR_TYP script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form2', '_AA0010010form2/MRP_ODR_TYP'), '[eq]', '8')) {
if(expj.common.checkNameSpace(this.child66)){this.child66();}
}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child6 = function () {
  console.log('MRP_ODR_TYP script9');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MPS_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child7)){this.child7();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child7 = function () {
  console.log('MRP_ODR_TYP script10');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/SAFETY_STOCK');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child8 = function () {
  console.log('MRP_ODR_TYP script11');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/LOT_SIZING_TYP');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child9 = function () {
  console.log('MRP_ODR_TYP script12');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MAX_PERIOD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child10)){this.child10();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child10 = function () {
  console.log('MRP_ODR_TYP script13');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MAX_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child11)){this.child11();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child11 = function () {
  console.log('MRP_ODR_TYP script14');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/ODR_POINT');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child12)){this.child12();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child12 = function () {
  console.log('MRP_ODR_TYP script15');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/FIXED_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child13)){this.child13();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child13 = function () {
  console.log('MRP_ODR_TYP script16');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MIN_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child14)){this.child14();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child14 = function () {
  console.log('MRP_ODR_TYP script17');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MUL_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child15)){this.child15();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child15 = function () {
  console.log('MRP_ODR_TYP script18');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/ITEM_SPOIL');
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child16 = function () {
  console.log('MRP_ODR_TYP script19');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MPS_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child17)){this.child17();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child17 = function () {
  console.log('MRP_ODR_TYP script20');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/SAFETY_STOCK');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child18)){this.child18();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child18 = function () {
  console.log('MRP_ODR_TYP script21');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/LOT_SIZING_TYP');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child19)){this.child19();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child19 = function () {
  console.log('MRP_ODR_TYP script22');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MAX_PERIOD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child20)){this.child20();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child20 = function () {
  console.log('MRP_ODR_TYP script23');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MAX_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child21)){this.child21();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child21 = function () {
  console.log('MRP_ODR_TYP script24');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/ODR_POINT');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child22)){this.child22();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child22 = function () {
  console.log('MRP_ODR_TYP script25');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/FIXED_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child23)){this.child23();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child23 = function () {
  console.log('MRP_ODR_TYP script26');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MIN_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child24)){this.child24();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child24 = function () {
  console.log('MRP_ODR_TYP script27');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MUL_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child25)){this.child25();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child25 = function () {
  console.log('MRP_ODR_TYP script28');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/ITEM_SPOIL');
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child26 = function () {
  console.log('MRP_ODR_TYP script29');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MPS_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child27)){this.child27();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child27 = function () {
  console.log('MRP_ODR_TYP script30');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/SAFETY_STOCK');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child28)){this.child28();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child28 = function () {
  console.log('MRP_ODR_TYP script31');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/LOT_SIZING_TYP');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child29)){this.child29();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child29 = function () {
  console.log('MRP_ODR_TYP script32');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MAX_PERIOD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child30)){this.child30();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child30 = function () {
  console.log('MRP_ODR_TYP script33');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MAX_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child31)){this.child31();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child31 = function () {
  console.log('MRP_ODR_TYP script34');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/ODR_POINT');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child32)){this.child32();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child32 = function () {
  console.log('MRP_ODR_TYP script35');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/FIXED_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child33)){this.child33();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child33 = function () {
  console.log('MRP_ODR_TYP script36');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MIN_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child34)){this.child34();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child34 = function () {
  console.log('MRP_ODR_TYP script37');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MUL_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child35)){this.child35();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child35 = function () {
  console.log('MRP_ODR_TYP script38');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/ITEM_SPOIL');
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child36 = function () {
  console.log('MRP_ODR_TYP script39');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MPS_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child37)){this.child37();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child37 = function () {
  console.log('MRP_ODR_TYP script40');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/SAFETY_STOCK');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child38)){this.child38();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child38 = function () {
  console.log('MRP_ODR_TYP script41');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/LOT_SIZING_TYP');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child39)){this.child39();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child39 = function () {
  console.log('MRP_ODR_TYP script42');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MAX_PERIOD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child40)){this.child40();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child40 = function () {
  console.log('MRP_ODR_TYP script43');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MAX_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child41)){this.child41();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child41 = function () {
  console.log('MRP_ODR_TYP script44');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/ODR_POINT');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child42)){this.child42();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child42 = function () {
  console.log('MRP_ODR_TYP script45');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/FIXED_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child43)){this.child43();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child43 = function () {
  console.log('MRP_ODR_TYP script46');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MIN_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child44)){this.child44();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child44 = function () {
  console.log('MRP_ODR_TYP script47');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MUL_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child45)){this.child45();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child45 = function () {
  console.log('MRP_ODR_TYP script48');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/ITEM_SPOIL');
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child46 = function () {
  console.log('MRP_ODR_TYP script49');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MPS_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child47)){this.child47();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child47 = function () {
  console.log('MRP_ODR_TYP script50');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/SAFETY_STOCK');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child48)){this.child48();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child48 = function () {
  console.log('MRP_ODR_TYP script51');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/LOT_SIZING_TYP');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child49)){this.child49();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child49 = function () {
  console.log('MRP_ODR_TYP script52');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MAX_PERIOD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child50)){this.child50();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child50 = function () {
  console.log('MRP_ODR_TYP script53');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MAX_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child51)){this.child51();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child51 = function () {
  console.log('MRP_ODR_TYP script54');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/ODR_POINT');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child52)){this.child52();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child52 = function () {
  console.log('MRP_ODR_TYP script55');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/FIXED_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child53)){this.child53();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child53 = function () {
  console.log('MRP_ODR_TYP script56');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MIN_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child54)){this.child54();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child54 = function () {
  console.log('MRP_ODR_TYP script57');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MUL_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child55)){this.child55();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child55 = function () {
  console.log('MRP_ODR_TYP script58');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/ITEM_SPOIL');
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child56 = function () {
  console.log('MRP_ODR_TYP script59');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MPS_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child57)){this.child57();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child57 = function () {
  console.log('MRP_ODR_TYP script60');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/SAFETY_STOCK');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child58)){this.child58();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child58 = function () {
  console.log('MRP_ODR_TYP script61');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/LOT_SIZING_TYP');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child59)){this.child59();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child59 = function () {
  console.log('MRP_ODR_TYP script62');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MAX_PERIOD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child60)){this.child60();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child60 = function () {
  console.log('MRP_ODR_TYP script63');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MAX_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child61)){this.child61();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child61 = function () {
  console.log('MRP_ODR_TYP script64');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/ODR_POINT');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child62)){this.child62();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child62 = function () {
  console.log('MRP_ODR_TYP script65');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/FIXED_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child63)){this.child63();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child63 = function () {
  console.log('MRP_ODR_TYP script66');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MIN_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child64)){this.child64();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child64 = function () {
  console.log('MRP_ODR_TYP script67');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MUL_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child65)){this.child65();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child65 = function () {
  console.log('MRP_ODR_TYP script68');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/ITEM_SPOIL');
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child66 = function () {
  console.log('MRP_ODR_TYP script69');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MPS_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child67)){this.child67();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child67 = function () {
  console.log('MRP_ODR_TYP script70');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/SAFETY_STOCK');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child68)){this.child68();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child68 = function () {
  console.log('MRP_ODR_TYP script71');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/LOT_SIZING_TYP');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child69)){this.child69();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child69 = function () {
  console.log('MRP_ODR_TYP script72');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MAX_PERIOD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child70)){this.child70();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child70 = function () {
  console.log('MRP_ODR_TYP script73');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MAX_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child71)){this.child71();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child71 = function () {
  console.log('MRP_ODR_TYP script74');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/ODR_POINT');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child72)){this.child72();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child72 = function () {
  console.log('MRP_ODR_TYP script75');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/FIXED_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child73)){this.child73();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child73 = function () {
  console.log('MRP_ODR_TYP script76');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MIN_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child74)){this.child74();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child74 = function () {
  console.log('MRP_ODR_TYP script77');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MUL_ODR_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child75)){this.child75();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child75 = function () {
  console.log('MRP_ODR_TYP script78');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/ITEM_SPOIL');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child76)){this.child76();}}
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.child76 = function () {
  console.log('MRP_ODR_TYP script79');
expj.common.pscript.setReferenceComponentValue('AA0010010', 'AA0010010form2', '_AA0010010form2/ITEM_SPOIL', '0');
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/MRP_ODR_TYP.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form2.MRP_ODR_TYP['onDecision' + i])) {
        expj.AA0010010.AA0010010form2.MRP_ODR_TYP['onDecision' + i]();
      }
    }
  }
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.MRP_ODR_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-MRP_ODR_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0010010', 'AA0010010form2', 'MRP_ODR_TYP', this);
  });
  expj.AA0010010.AA0010010form2.MRP_ODR_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.MRP_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/MRP_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-MRP_ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form2.MRP_ODR_TYP['onLoad' + i])) {
      expj.AA0010010.AA0010010form2.MRP_ODR_TYP['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0010010-AA0010010form2-MRP_ODR_TYP" name='MRP_ODR_TYP' class='AA0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = (aAA0010010Control.getStruct().getList_MRP_ODR_TYP_name()==null ? 0:aAA0010010Control.getStruct().getList_MRP_ODR_TYP_name().size()); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_MRP_ODR_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_MRP_ODR_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0010010Struct.getMRP_ODR_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MANHOUR_TYP",rb)%></span><!-- 工数管理品目区分 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-MANHOUR_TYP">
expj.AA0010010.AA0010010form2.MANHOUR_TYP = {};
expj.AA0010010.AA0010010form2.MANHOUR_TYP.onLoad0 = function () {
  console.log('MANHOUR_TYP script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child14)){this.child14();}
};
expj.AA0010010.AA0010010form2.MANHOUR_TYP.onDecision0 = function () {
  console.log('MANHOUR_TYP script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form2', '_AA0010010form2/MANHOUR_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
expj.AA0010010.AA0010010form2.MANHOUR_TYP.child0 = function () {
  console.log('MANHOUR_TYP script3');
var yesFunc = function () {
expj.AA0010010.AA0010010form2.MANHOUR_TYP.child1();
};
var noFunc = function () {
expj.AA0010010.AA0010010form2.MANHOUR_TYP.child9();
};
expj.common.pscript.executeConfirmPut('AA0010010', 'AA0010010form2', '_AA0010010form2/MANHOUR_TYP', 'AA00179', yesFunc, noFunc);
};
expj.AA0010010.AA0010010form2.MANHOUR_TYP.child1 = function () {
  console.log('MANHOUR_TYP script4');
expj.common.pscript.setReferenceComponentValue('AA0010010', 'AA0010010form2', '_AA0010010form2/MRP_ODR_TYP', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
expj.AA0010010.AA0010010form2.MANHOUR_TYP.child2 = function () {
  console.log('MANHOUR_TYP script5');
expj.common.pscript.setReferenceComponentValue('AA0010010', 'AA0010010form2', '_AA0010010form2/OUTSIDE_TYP', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
expj.AA0010010.AA0010010form2.MANHOUR_TYP.child3 = function () {
  console.log('MANHOUR_TYP script6');
expj.common.pscript.setReferenceComponentValue('AA0010010', 'AA0010010form2', '_AA0010010form2/ABC_TYP', '9');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
expj.AA0010010.AA0010010form2.MANHOUR_TYP.child4 = function () {
  console.log('MANHOUR_TYP script7');
expj.common.pscript.setReferenceComponentValue('AA0010010', 'AA0010010form2', '_AA0010010form2/ITEM_SPOIL', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
expj.AA0010010.AA0010010form2.MANHOUR_TYP.child5 = function () {
  console.log('MANHOUR_TYP script8');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MRP_ODR_TYP');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
expj.AA0010010.AA0010010form2.MANHOUR_TYP.child6 = function () {
  console.log('MANHOUR_TYP script9');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/OUTSIDE_TYP');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child7)){this.child7();}}
};
expj.AA0010010.AA0010010form2.MANHOUR_TYP.child7 = function () {
  console.log('MANHOUR_TYP script10');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/ABC_TYP');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
expj.AA0010010.AA0010010form2.MANHOUR_TYP.child8 = function () {
  console.log('MANHOUR_TYP script11');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/ITEM_SPOIL');
};
expj.AA0010010.AA0010010form2.MANHOUR_TYP.child9 = function () {
  console.log('MANHOUR_TYP script12');
expj.common.pscript.setReferenceComponentValue('AA0010010', 'AA0010010form2', '_AA0010010form2/MANHOUR_TYP', '0');
};
expj.AA0010010.AA0010010form2.MANHOUR_TYP.child10 = function () {
  console.log('MANHOUR_TYP script13');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/MRP_ODR_TYP');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child11)){this.child11();}}
};
expj.AA0010010.AA0010010form2.MANHOUR_TYP.child11 = function () {
  console.log('MANHOUR_TYP script14');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/OUTSIDE_TYP');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child12)){this.child12();}}
};
expj.AA0010010.AA0010010form2.MANHOUR_TYP.child12 = function () {
  console.log('MANHOUR_TYP script15');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/ABC_TYP');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child15)){this.child15();}}
};
expj.AA0010010.AA0010010form2.MANHOUR_TYP.child13 = function () {
  console.log('MANHOUR_TYP script16');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/ITEM_SPOIL');
};
expj.AA0010010.AA0010010form2.MANHOUR_TYP.child14 = function () {
  console.log('MANHOUR_TYP script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form2', '_AA0010010form2/MANHOUR_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
expj.AA0010010.AA0010010form2.MANHOUR_TYP.child15 = function () {
  console.log('MANHOUR_TYP script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form2', '_AA0010010form2/MRP_ODR_TYP'), '[eq]', '8')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
expj.AA0010010.AA0010010form2.MANHOUR_TYP.child16 = function () {
  console.log('MANHOUR_TYP script19');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/ITEM_SPOIL');
};
expj.AA0010010.AA0010010form2.MANHOUR_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/MANHOUR_TYP.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form2.MANHOUR_TYP['onDecision' + i])) {
        expj.AA0010010.AA0010010form2.MANHOUR_TYP['onDecision' + i]();
      }
    }
  }
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.MANHOUR_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-MANHOUR_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0010010', 'AA0010010form2', 'MANHOUR_TYP', this);
  });
  expj.AA0010010.AA0010010form2.MANHOUR_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.MANHOUR_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/MANHOUR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-MANHOUR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form2.MANHOUR_TYP['onLoad' + i])) {
      expj.AA0010010.AA0010010form2.MANHOUR_TYP['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><select id="expj-AA0010010-AA0010010form2-MANHOUR_TYP" name='MANHOUR_TYP' class='AA0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = (aAA0010010Control.getStruct().getList_MANHOUR_TYP_name()==null ? 0:aAA0010010Control.getStruct().getList_MANHOUR_TYP_name().size()); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_MANHOUR_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_MANHOUR_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0010010Struct.getMANHOUR_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.LOT_SIZING_TYP",rb)%></span><!-- ロットまとめ区分 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-LOT_SIZING_TYP">
expj.AA0010010.AA0010010form2.LOT_SIZING_TYP = {};
expj.AA0010010.AA0010010form2.LOT_SIZING_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/LOT_SIZING_TYP.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.LOT_SIZING_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-LOT_SIZING_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0010010', 'AA0010010form2', 'LOT_SIZING_TYP', this);
  });
  expj.AA0010010.AA0010010form2.LOT_SIZING_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.LOT_SIZING_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/LOT_SIZING_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-LOT_SIZING_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0010010-AA0010010form2-LOT_SIZING_TYP" name='LOT_SIZING_TYP' class='AA0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = (aAA0010010Control.getStruct().getList_LOT_SIZING_TYP_name()==null ? 0:aAA0010010Control.getStruct().getList_LOT_SIZING_TYP_name().size()); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_LOT_SIZING_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_LOT_SIZING_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0010010Struct.getLOT_SIZING_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MPS_FLG",rb)%></span><!-- MPS品目フラグ --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-MPS_FLG">
expj.AA0010010.AA0010010form2.MPS_FLG = {};
expj.AA0010010.AA0010010form2.MPS_FLG.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/MPS_FLG.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.MPS_FLG.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-MPS_FLG').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0010010', 'AA0010010form2', 'MPS_FLG', this);
  });
  expj.AA0010010.AA0010010form2.MPS_FLG.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.MPS_FLG.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/MPS_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-MPS_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><select id="expj-AA0010010-AA0010010form2-MPS_FLG" name='MPS_FLG' class='AA0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = (aAA0010010Control.getStruct().getList_MPS_FLG_name()==null ? 0:aAA0010010Control.getStruct().getList_MPS_FLG_name().size()); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_MPS_FLG_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_MPS_FLG_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0010010Struct.getMPS_FLG()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MAX_PERIOD",rb)%></span><!-- 最大まとめ期間 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-MAX_PERIOD">
expj.AA0010010.AA0010010form2.MAX_PERIOD = {};
expj.AA0010010.AA0010010form2.MAX_PERIOD.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/MAX_PERIOD.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.MAX_PERIOD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-MAX_PERIOD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'MAX_PERIOD', this);
  });
  expj.AA0010010.AA0010010form2.MAX_PERIOD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.MAX_PERIOD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/MAX_PERIOD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-MAX_PERIOD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-MAX_PERIOD" name="MAX_PERIOD" class="AA0010010-focus-move  " style="width:100%;text-align: right;" data-kind="OBT_INTEGER_P;6" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getMAX_PERIOD()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.FIXED_ODR_QTY",rb)%></span><!-- 定量発注数 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-FIXED_ODR_QTY">
expj.AA0010010.AA0010010form2.FIXED_ODR_QTY = {};
expj.AA0010010.AA0010010form2.FIXED_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/FIXED_ODR_QTY.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.FIXED_ODR_QTY.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-FIXED_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'FIXED_ODR_QTY', this);
  });
  expj.AA0010010.AA0010010form2.FIXED_ODR_QTY.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.FIXED_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/FIXED_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-FIXED_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-FIXED_ODR_QTY" name="FIXED_ODR_QTY" class="AA0010010-focus-move  " style="width:100%;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getFIXED_ODR_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MAX_ODR_QTY",rb)%></span><!-- 最大手配数 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-MAX_ODR_QTY">
expj.AA0010010.AA0010010form2.MAX_ODR_QTY = {};
expj.AA0010010.AA0010010form2.MAX_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/MAX_ODR_QTY.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.MAX_ODR_QTY.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-MAX_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'MAX_ODR_QTY', this);
  });
  expj.AA0010010.AA0010010form2.MAX_ODR_QTY.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.MAX_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/MAX_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-MAX_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-MAX_ODR_QTY" name="MAX_ODR_QTY" class="AA0010010-focus-move  " style="width:100%;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getMAX_ODR_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MIN_ODR_QTY",rb)%></span><!-- 最小手配数 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-MIN_ODR_QTY">
expj.AA0010010.AA0010010form2.MIN_ODR_QTY = {};
expj.AA0010010.AA0010010form2.MIN_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/MIN_ODR_QTY.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.MIN_ODR_QTY.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-MIN_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'MIN_ODR_QTY', this);
  });
  expj.AA0010010.AA0010010form2.MIN_ODR_QTY.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.MIN_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/MIN_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-MIN_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-MIN_ODR_QTY" name="MIN_ODR_QTY" class="AA0010010-focus-move  " style="width:100%;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getMIN_ODR_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_POINT",rb)%></span><!-- 発注点在庫数 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-ODR_POINT">
expj.AA0010010.AA0010010form2.ODR_POINT = {};
expj.AA0010010.AA0010010form2.ODR_POINT.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/ODR_POINT.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.ODR_POINT.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-ODR_POINT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'ODR_POINT', this);
  });
  expj.AA0010010.AA0010010form2.ODR_POINT.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.ODR_POINT.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/ODR_POINT.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-ODR_POINT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-ODR_POINT" name="ODR_POINT" class="AA0010010-focus-move  " style="width:100%;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getODR_POINT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MUL_ODR_QTY",rb)%></span><!-- まるめ単位 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-MUL_ODR_QTY">
expj.AA0010010.AA0010010form2.MUL_ODR_QTY = {};
expj.AA0010010.AA0010010form2.MUL_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/MUL_ODR_QTY.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.MUL_ODR_QTY.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-MUL_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'MUL_ODR_QTY', this);
  });
  expj.AA0010010.AA0010010form2.MUL_ODR_QTY.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.MUL_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/MUL_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-MUL_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-MUL_ODR_QTY" name="MUL_ODR_QTY" class="AA0010010-focus-move  " style="width:100%;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getMUL_ODR_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CLASIFICATION_CD",rb)%></span><!-- 管理コード --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-CLASIFICATION_CD">
expj.AA0010010.AA0010010form2.CLASIFICATION_CD = {};
expj.AA0010010.AA0010010form2.CLASIFICATION_CD.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/CLASIFICATION_CD.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.CLASIFICATION_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-CLASIFICATION_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'CLASIFICATION_CD', this);
  });
  expj.AA0010010.AA0010010form2.CLASIFICATION_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.CLASIFICATION_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/CLASIFICATION_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-CLASIFICATION_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-CLASIFICATION_CD" name="CLASIFICATION_CD" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getCLASIFICATION_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.UNIT_WEIGHT",rb)%></span><!-- 単位重量 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-UNIT_WEIGHT">
expj.AA0010010.AA0010010form2.UNIT_WEIGHT = {};
expj.AA0010010.AA0010010form2.UNIT_WEIGHT.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/UNIT_WEIGHT.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.UNIT_WEIGHT.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-UNIT_WEIGHT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'UNIT_WEIGHT', this);
  });
  expj.AA0010010.AA0010010form2.UNIT_WEIGHT.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.UNIT_WEIGHT.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/UNIT_WEIGHT.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-UNIT_WEIGHT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-UNIT_WEIGHT" name="UNIT_WEIGHT" class="AA0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getUNIT_WEIGHT()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.TAX_CD_1",rb)%></span><!-- 消費税コード --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-TAX_CD">
expj.AA0010010.AA0010010form2.TAX_CD = {};
expj.AA0010010.AA0010010form2.TAX_CD.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/TAX_CD.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.TAX_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-TAX_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'TAX_CD', this);
  });
  expj.AA0010010.AA0010010form2.TAX_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.TAX_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/TAX_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-TAX_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-TAX_CD" name="TAX_CD" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getTAX_CD()) %>" maxlength="3" ></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-PeekerTaxCd">
expj.AA0010010.AA0010010form2.PeekerTaxCd = {};
expj.AA0010010.AA0010010form2.PeekerTaxCd.onClick0 = function () {
  console.log('PeekerTaxCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0010010';
var parameterValues = 'PeekerTaxCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form2', '_AA0010010form2/TAX_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%TAX_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0010010form2/TAX_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0010010.AA0010010form2.PeekerTaxCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form2.PeekerTaxCd['onClick' + i])) {
        expj.AA0010010.AA0010010form2.PeekerTaxCd['onClick' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010form2.PeekerTaxCd.executeAllOnDecision = function () {
};
expj.AA0010010.AA0010010form2.PeekerTaxCd.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-PeekerTaxCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0010010', 'AA0010010form2', 'PeekerTaxCd', this, 'Button');
    }
  });
  expj.AA0010010.AA0010010form2.PeekerTaxCd.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.PeekerTaxCd.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/PeekerTaxCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-PeekerTaxCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0010010-AA0010010form2-PeekerTaxCd" name="PeekerTaxCd" class="AA0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-TAX_NAME">
expj.AA0010010.AA0010010form2.TAX_NAME = {};
expj.AA0010010.AA0010010form2.TAX_NAME.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/TAX_NAME.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.TAX_NAME.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-TAX_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'TAX_NAME', this);
  });
  expj.AA0010010.AA0010010form2.TAX_NAME.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.TAX_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/TAX_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-TAX_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-TAX_NAME" name="TAX_NAME" class="AA0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getTAX_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CAL_NO",rb)%></span><!-- カレンダ番号 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-CAL_NO">
expj.AA0010010.AA0010010form2.CAL_NO = {};
expj.AA0010010.AA0010010form2.CAL_NO.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/CAL_NO.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.CAL_NO.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-CAL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'CAL_NO', this);
  });
  expj.AA0010010.AA0010010form2.CAL_NO.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.CAL_NO.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/CAL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-CAL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-CAL_NO" name="CAL_NO" class="AA0010010-focus-move expj-align-right " style="width:260px;" data-kind="OBT_N" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getCAL_NO()) %>" maxlength="6" ></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-PeekerCalNo">
expj.AA0010010.AA0010010form2.PeekerCalNo = {};
expj.AA0010010.AA0010010form2.PeekerCalNo.onClick0 = function () {
  console.log('PeekerCalNo script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0010010';
var parameterValues = 'PeekerCalNo%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form2', '_AA0010010form2/CAL_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CAL_NO_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0010010form2/CAL_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0010010.AA0010010form2.PeekerCalNo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form2.PeekerCalNo['onClick' + i])) {
        expj.AA0010010.AA0010010form2.PeekerCalNo['onClick' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010form2.PeekerCalNo.executeAllOnDecision = function () {
};
expj.AA0010010.AA0010010form2.PeekerCalNo.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-PeekerCalNo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0010010', 'AA0010010form2', 'PeekerCalNo', this, 'Button');
    }
  });
  expj.AA0010010.AA0010010form2.PeekerCalNo.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.PeekerCalNo.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/PeekerCalNo.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-PeekerCalNo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0010010-AA0010010form2-PeekerCalNo" name="PeekerCalNo" class="AA0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-CAL_NAME">
expj.AA0010010.AA0010010form2.CAL_NAME = {};
expj.AA0010010.AA0010010form2.CAL_NAME.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/CAL_NAME.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.CAL_NAME.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-CAL_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'CAL_NAME', this);
  });
  expj.AA0010010.AA0010010form2.CAL_NAME.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.CAL_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/CAL_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-CAL_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-CAL_NAME" name="CAL_NAME" class="AA0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getCAL_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt4091",rb)%></span><!-- 保管区分 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-DEPO_TYP">
expj.AA0010010.AA0010010form2.DEPO_TYP = {};
expj.AA0010010.AA0010010form2.DEPO_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/DEPO_TYP.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.DEPO_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-DEPO_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0010010', 'AA0010010form2', 'DEPO_TYP', this);
  });
  expj.AA0010010.AA0010010form2.DEPO_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.DEPO_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/DEPO_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-DEPO_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0010010-AA0010010form2-DEPO_TYP" name='DEPO_TYP' class='AA0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = (aAA0010010Control.getStruct().getList_DEPO_TYP_name()==null ? 0:aAA0010010Control.getStruct().getList_DEPO_TYP_name().size()); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_DEPO_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_DEPO_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0010010Struct.getDEPO_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt5070",rb)%></span><!-- 品質期限年数 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-BEST_BEFORE_YEAR">
expj.AA0010010.AA0010010form2.BEST_BEFORE_YEAR = {};
expj.AA0010010.AA0010010form2.BEST_BEFORE_YEAR.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/BEST_BEFORE_YEAR.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.BEST_BEFORE_YEAR.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-BEST_BEFORE_YEAR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'BEST_BEFORE_YEAR', this);
  });
  expj.AA0010010.AA0010010form2.BEST_BEFORE_YEAR.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.BEST_BEFORE_YEAR.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/BEST_BEFORE_YEAR.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-BEST_BEFORE_YEAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-BEST_BEFORE_YEAR" name="BEST_BEFORE_YEAR" class="AA0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;4;FLOOR;" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getBEST_BEFORE_YEAR()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.LOT_CTRL_FLG",rb)%></span><!-- ロット管理フラグ --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-LOT_CTRL_FLG">
expj.AA0010010.AA0010010form2.LOT_CTRL_FLG = {};
expj.AA0010010.AA0010010form2.LOT_CTRL_FLG.onLoad0 = function () {
  console.log('LOT_CTRL_FLG script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
expj.AA0010010.AA0010010form2.LOT_CTRL_FLG.onDecision0 = function () {
  console.log('LOT_CTRL_FLG script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form2', '_AA0010010form2/LOT_CTRL_FLG'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
} else {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
expj.AA0010010.AA0010010form2.LOT_CTRL_FLG.child19 = function () {
  console.log('LOT_CTRL_FLG script3');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/LOT_NUMBERING_TYP');
};
expj.AA0010010.AA0010010form2.LOT_CTRL_FLG.child20 = function () {
  console.log('LOT_CTRL_FLG script4');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form2', '_AA0010010form2/LOT_NUMBERING_TYP');
};
expj.AA0010010.AA0010010form2.LOT_CTRL_FLG.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/LOT_CTRL_FLG.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form2.LOT_CTRL_FLG['onDecision' + i])) {
        expj.AA0010010.AA0010010form2.LOT_CTRL_FLG['onDecision' + i]();
      }
    }
  }
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.LOT_CTRL_FLG.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-LOT_CTRL_FLG').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0010010', 'AA0010010form2', 'LOT_CTRL_FLG', this);
  });
  expj.AA0010010.AA0010010form2.LOT_CTRL_FLG.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.LOT_CTRL_FLG.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/LOT_CTRL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-LOT_CTRL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form2.LOT_CTRL_FLG['onLoad' + i])) {
      expj.AA0010010.AA0010010form2.LOT_CTRL_FLG['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0010010-AA0010010form2-LOT_CTRL_FLG" name='LOT_CTRL_FLG' class='AA0010010-focus-move' style='width:260px;' <%= ("false".equals(lotCtrlFlg)) ? " disabled=\"disabled\"" : "" %>><%  for(int i = 0, size = (aAA0010010Control.getStruct().getList_LOT_CTRL_FLG_name()==null ? 0:aAA0010010Control.getStruct().getList_LOT_CTRL_FLG_name().size()); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_LOT_CTRL_FLG_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_LOT_CTRL_FLG_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0010010Struct.getLOT_CTRL_FLG()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt5071",rb)%></span><!-- 品質期限月数 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-BEST_BEFORE_MONTH">
expj.AA0010010.AA0010010form2.BEST_BEFORE_MONTH = {};
expj.AA0010010.AA0010010form2.BEST_BEFORE_MONTH.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/BEST_BEFORE_MONTH.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.BEST_BEFORE_MONTH.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-BEST_BEFORE_MONTH').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'BEST_BEFORE_MONTH', this);
  });
  expj.AA0010010.AA0010010form2.BEST_BEFORE_MONTH.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.BEST_BEFORE_MONTH.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/BEST_BEFORE_MONTH.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-BEST_BEFORE_MONTH');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-BEST_BEFORE_MONTH" name="BEST_BEFORE_MONTH" class="AA0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;4;FLOOR;" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getBEST_BEFORE_MONTH()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt4092",rb)%></span><!-- ロット採番区分 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-LOT_NUMBERING_TYP">
expj.AA0010010.AA0010010form2.LOT_NUMBERING_TYP = {};
expj.AA0010010.AA0010010form2.LOT_NUMBERING_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/LOT_NUMBERING_TYP.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.LOT_NUMBERING_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-LOT_NUMBERING_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0010010', 'AA0010010form2', 'LOT_NUMBERING_TYP', this);
  });
  expj.AA0010010.AA0010010form2.LOT_NUMBERING_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.LOT_NUMBERING_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/LOT_NUMBERING_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-LOT_NUMBERING_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0010010-AA0010010form2-LOT_NUMBERING_TYP" name='LOT_NUMBERING_TYP' class='AA0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = (aAA0010010Control.getStruct().getList_LOT_NUMBERING_TYP_name()==null ? 0:aAA0010010Control.getStruct().getList_LOT_NUMBERING_TYP_name().size()); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_LOT_NUMBERING_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_LOT_NUMBERING_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0010010Struct.getLOT_NUMBERING_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt5072",rb)%></span><!-- 品質期限日数 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-BEST_BEFORE_DAY">
expj.AA0010010.AA0010010form2.BEST_BEFORE_DAY = {};
expj.AA0010010.AA0010010form2.BEST_BEFORE_DAY.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/BEST_BEFORE_DAY.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.BEST_BEFORE_DAY.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-BEST_BEFORE_DAY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'BEST_BEFORE_DAY', this);
  });
  expj.AA0010010.AA0010010form2.BEST_BEFORE_DAY.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.BEST_BEFORE_DAY.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/BEST_BEFORE_DAY.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-BEST_BEFORE_DAY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-BEST_BEFORE_DAY" name="BEST_BEFORE_DAY" class="AA0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;4;FLOOR;" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getBEST_BEFORE_DAY()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DEPT_CD",rb)%></span><!-- 負担部門コード --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-DEPT_CD">
expj.AA0010010.AA0010010form2.DEPT_CD = {};
expj.AA0010010.AA0010010form2.DEPT_CD.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/DEPT_CD.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.DEPT_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-DEPT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'DEPT_CD', this);
  });
  expj.AA0010010.AA0010010form2.DEPT_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.DEPT_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/DEPT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-DEPT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-DEPT_CD" name="DEPT_CD" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getDEPT_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-PeekerDeptCd">
expj.AA0010010.AA0010010form2.PeekerDeptCd = {};
expj.AA0010010.AA0010010form2.PeekerDeptCd.onClick0 = function () {
  console.log('PeekerDeptCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0010010';
var parameterValues = 'PeekerDeptCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AA0010010', 'PeekerDeptCd', 'SQLPARAM_1', '<%=aAA0010010Control.getsysCOMPANY_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form2', '_AA0010010form2/DEPT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%DEPT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0010010form2/DEPT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0010010.AA0010010form2.PeekerDeptCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form2.PeekerDeptCd['onClick' + i])) {
        expj.AA0010010.AA0010010form2.PeekerDeptCd['onClick' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010form2.PeekerDeptCd.executeAllOnDecision = function () {
};
expj.AA0010010.AA0010010form2.PeekerDeptCd.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-PeekerDeptCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0010010', 'AA0010010form2', 'PeekerDeptCd', this, 'Button');
    }
  });
  expj.AA0010010.AA0010010form2.PeekerDeptCd.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.PeekerDeptCd.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/PeekerDeptCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-PeekerDeptCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0010010-AA0010010form2-PeekerDeptCd" name="PeekerDeptCd" class="AA0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-DEPT_NAME">
expj.AA0010010.AA0010010form2.DEPT_NAME = {};
expj.AA0010010.AA0010010form2.DEPT_NAME.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/DEPT_NAME.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.DEPT_NAME.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-DEPT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'DEPT_NAME', this);
  });
  expj.AA0010010.AA0010010form2.DEPT_NAME.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.DEPT_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/DEPT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-DEPT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-DEPT_NAME" name="DEPT_NAME" class="AA0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getDEPT_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PJ_CD",rb)%></span><!-- プロジェクトコード --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-PJ_CD">
expj.AA0010010.AA0010010form2.PJ_CD = {};
expj.AA0010010.AA0010010form2.PJ_CD.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/PJ_CD.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.PJ_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-PJ_CD').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0010010', 'AA0010010form2', 'PJ_CD', this);
  });
  expj.AA0010010.AA0010010form2.PJ_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.PJ_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/PJ_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-PJ_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0010010-AA0010010form2-PJ_CD" name='PJ_CD' class='AA0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = (aAA0010010Control.getStruct().getList_PJ_CD_name()==null ? 0:aAA0010010Control.getStruct().getList_PJ_CD_name().size()); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_PJ_CD_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_PJ_CD_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0010010Struct.getPJ_CD()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SEG_CONTENTS1",rb)%></span><!-- セグメント1 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-SEG_CONTENTS1">
expj.AA0010010.AA0010010form2.SEG_CONTENTS1 = {};
expj.AA0010010.AA0010010form2.SEG_CONTENTS1.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/SEG_CONTENTS1.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.SEG_CONTENTS1.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-SEG_CONTENTS1').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0010010', 'AA0010010form2', 'SEG_CONTENTS1', this);
  });
  expj.AA0010010.AA0010010form2.SEG_CONTENTS1.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.SEG_CONTENTS1.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/SEG_CONTENTS1.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-SEG_CONTENTS1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0010010-AA0010010form2-SEG_CONTENTS1" name='SEG_CONTENTS1' class='AA0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = (aAA0010010Control.getStruct().getList_SEG_CONTENTS1_name()==null ? 0:aAA0010010Control.getStruct().getList_SEG_CONTENTS1_name().size()); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_SEG_CONTENTS1_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_SEG_CONTENTS1_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0010010Struct.getSEG_CONTENTS1()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SEG_CONTENTS2",rb)%></span><!-- セグメント2 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-SEG_CONTENTS2">
expj.AA0010010.AA0010010form2.SEG_CONTENTS2 = {};
expj.AA0010010.AA0010010form2.SEG_CONTENTS2.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/SEG_CONTENTS2.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.SEG_CONTENTS2.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-SEG_CONTENTS2').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0010010', 'AA0010010form2', 'SEG_CONTENTS2', this);
  });
  expj.AA0010010.AA0010010form2.SEG_CONTENTS2.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.SEG_CONTENTS2.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/SEG_CONTENTS2.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-SEG_CONTENTS2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><select id="expj-AA0010010-AA0010010form2-SEG_CONTENTS2" name='SEG_CONTENTS2' class='AA0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = (aAA0010010Control.getStruct().getList_SEG_CONTENTS2_name()==null ? 0:aAA0010010Control.getStruct().getList_SEG_CONTENTS2_name().size()); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_SEG_CONTENTS2_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_SEG_CONTENTS2_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0010010Struct.getSEG_CONTENTS2()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SEG_CONTENTS3",rb)%></span><!-- セグメント3 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-SEG_CONTENTS3">
expj.AA0010010.AA0010010form2.SEG_CONTENTS3 = {};
expj.AA0010010.AA0010010form2.SEG_CONTENTS3.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/SEG_CONTENTS3.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.SEG_CONTENTS3.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-SEG_CONTENTS3').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0010010', 'AA0010010form2', 'SEG_CONTENTS3', this);
  });
  expj.AA0010010.AA0010010form2.SEG_CONTENTS3.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.SEG_CONTENTS3.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/SEG_CONTENTS3.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-SEG_CONTENTS3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0010010-AA0010010form2-SEG_CONTENTS3" name='SEG_CONTENTS3' class='AA0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = (aAA0010010Control.getStruct().getList_SEG_CONTENTS3_name()==null ? 0:aAA0010010Control.getStruct().getList_SEG_CONTENTS3_name().size()); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_SEG_CONTENTS3_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_SEG_CONTENTS3_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0010010Struct.getSEG_CONTENTS3()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SEG_CONTENTS4",rb)%></span><!-- セグメント4 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-SEG_CONTENTS4">
expj.AA0010010.AA0010010form2.SEG_CONTENTS4 = {};
expj.AA0010010.AA0010010form2.SEG_CONTENTS4.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/SEG_CONTENTS4.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.SEG_CONTENTS4.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-SEG_CONTENTS4').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0010010', 'AA0010010form2', 'SEG_CONTENTS4', this);
  });
  expj.AA0010010.AA0010010form2.SEG_CONTENTS4.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.SEG_CONTENTS4.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/SEG_CONTENTS4.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-SEG_CONTENTS4');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><select id="expj-AA0010010-AA0010010form2-SEG_CONTENTS4" name='SEG_CONTENTS4' class='AA0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = (aAA0010010Control.getStruct().getList_SEG_CONTENTS4_name()==null ? 0:aAA0010010Control.getStruct().getList_SEG_CONTENTS4_name().size()); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_SEG_CONTENTS4_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0010010Control.getStruct().getList_SEG_CONTENTS4_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0010010Struct.getSEG_CONTENTS4()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.REMARKS_1",rb)%></span><!-- 備考１ --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-REMARK1">
expj.AA0010010.AA0010010form2.REMARK1 = {};
expj.AA0010010.AA0010010form2.REMARK1.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/REMARK1.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.REMARK1.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-REMARK1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'REMARK1', this);
  });
  expj.AA0010010.AA0010010form2.REMARK1.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.REMARK1.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/REMARK1.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-REMARK1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-REMARK1" name="REMARK1" class="AA0010010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getREMARK1()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.REMARKS_2",rb)%></span><!-- 備考２ --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-REMARK2">
expj.AA0010010.AA0010010form2.REMARK2 = {};
expj.AA0010010.AA0010010form2.REMARK2.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/REMARK2.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.REMARK2.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-REMARK2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'REMARK2', this);
  });
  expj.AA0010010.AA0010010form2.REMARK2.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.REMARK2.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/REMARK2.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-REMARK2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-REMARK2" name="REMARK2" class="AA0010010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getREMARK2()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3165",rb)%></span><!-- 承認備考 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form2-APPR_REMARKS">
expj.AA0010010.AA0010010form2.APPR_REMARKS = {};
expj.AA0010010.AA0010010form2.APPR_REMARKS.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/APPR_REMARKS.onDecision');
  expj.AA0010010.AA0010010form2.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form2.APPR_REMARKS.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form2-APPR_REMARKS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form2', 'APPR_REMARKS', this);
  });
  expj.AA0010010.AA0010010form2.APPR_REMARKS.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form2.APPR_REMARKS.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/APPR_REMARKS.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form2-APPR_REMARKS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form2-APPR_REMARKS" name="APPR_REMARKS" class="AA0010010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getAPPR_REMARKS()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="datagrid-button-field-cell frame01" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame02"></div><!--/td-->
<div class="datagrid-button-field-cell frame03" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AA0010010-AA0010010form3">
expj.AA0010010.AA0010010form3 = {};
expj.AA0010010.AA0010010form3.onLoad0 = function () {
  console.log('AA0010010form3 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision6)){this.onDecision6();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision7)){this.onDecision7();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision8)){this.onDecision8();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision9)){this.onDecision9();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision10)){this.onDecision10();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision11)){this.onDecision11();}
};
expj.AA0010010.AA0010010form3.onDecision0 = function () {
  console.log('AA0010010form3 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_01_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
expj.AA0010010.AA0010010form3.onDecision1 = function () {
  console.log('AA0010010form3 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_02_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
expj.AA0010010.AA0010010form3.onDecision2 = function () {
  console.log('AA0010010form3 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_03_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
expj.AA0010010.AA0010010form3.onDecision3 = function () {
  console.log('AA0010010form3 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_04_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
expj.AA0010010.AA0010010form3.onDecision4 = function () {
  console.log('AA0010010form3 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_05_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
expj.AA0010010.AA0010010form3.onDecision5 = function () {
  console.log('AA0010010form3 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_06_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
expj.AA0010010.AA0010010form3.onDecision6 = function () {
  console.log('AA0010010form3 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_07_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
expj.AA0010010.AA0010010form3.onDecision7 = function () {
  console.log('AA0010010form3 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_08_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
expj.AA0010010.AA0010010form3.onDecision8 = function () {
  console.log('AA0010010form3 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_09_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
expj.AA0010010.AA0010010form3.onDecision9 = function () {
  console.log('AA0010010form3 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_10_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
} else {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
expj.AA0010010.AA0010010form3.onDecision10 = function () {
  console.log('AA0010010form3 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_11_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
} else {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
expj.AA0010010.AA0010010form3.onDecision11 = function () {
  console.log('AA0010010form3 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_12_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
} else {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
expj.AA0010010.AA0010010form3.child0 = function () {
  console.log('AA0010010form3 script14');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_01_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_01_CD');
};
expj.AA0010010.AA0010010form3.child1 = function () {
  console.log('AA0010010form3 script15');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_01_CD');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_01_CD');
};
expj.AA0010010.AA0010010form3.child2 = function () {
  console.log('AA0010010form3 script16');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_02_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_02_CD');
};
expj.AA0010010.AA0010010form3.child3 = function () {
  console.log('AA0010010form3 script17');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_02_CD');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_02_CD');
};
expj.AA0010010.AA0010010form3.child4 = function () {
  console.log('AA0010010form3 script18');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_03_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_03_CD');
};
expj.AA0010010.AA0010010form3.child5 = function () {
  console.log('AA0010010form3 script19');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_03_CD');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_03_CD');
};
expj.AA0010010.AA0010010form3.child6 = function () {
  console.log('AA0010010form3 script20');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_04_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_04_CD');
};
expj.AA0010010.AA0010010form3.child7 = function () {
  console.log('AA0010010form3 script21');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_04_CD');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_04_CD');
};
expj.AA0010010.AA0010010form3.child8 = function () {
  console.log('AA0010010form3 script22');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_05_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_05_CD');
};
expj.AA0010010.AA0010010form3.child9 = function () {
  console.log('AA0010010form3 script23');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_05_CD');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_05_CD');
};
expj.AA0010010.AA0010010form3.child10 = function () {
  console.log('AA0010010form3 script24');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_06_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_06_CD');
};
expj.AA0010010.AA0010010form3.child11 = function () {
  console.log('AA0010010form3 script25');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_06_CD');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_06_CD');
};
expj.AA0010010.AA0010010form3.child12 = function () {
  console.log('AA0010010form3 script26');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_07_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_07_CD');
};
expj.AA0010010.AA0010010form3.child13 = function () {
  console.log('AA0010010form3 script27');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_07_CD');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_07_CD');
};
expj.AA0010010.AA0010010form3.child14 = function () {
  console.log('AA0010010form3 script28');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_08_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_08_CD');
};
expj.AA0010010.AA0010010form3.child15 = function () {
  console.log('AA0010010form3 script29');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_08_CD');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_08_CD');
};
expj.AA0010010.AA0010010form3.child16 = function () {
  console.log('AA0010010form3 script30');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_09_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_09_CD');
};
expj.AA0010010.AA0010010form3.child17 = function () {
  console.log('AA0010010form3 script31');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_09_CD');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_09_CD');
};
expj.AA0010010.AA0010010form3.child18 = function () {
  console.log('AA0010010form3 script32');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_10_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_10_CD');
};
expj.AA0010010.AA0010010form3.child19 = function () {
  console.log('AA0010010form3 script33');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_10_CD');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_10_CD');
};
expj.AA0010010.AA0010010form3.child20 = function () {
  console.log('AA0010010form3 script34');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_11_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_11_CD');
};
expj.AA0010010.AA0010010form3.child21 = function () {
  console.log('AA0010010form3 script35');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_11_CD');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_11_CD');
};
expj.AA0010010.AA0010010form3.child22 = function () {
  console.log('AA0010010form3 script36');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_12_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_12_CD');
};
expj.AA0010010.AA0010010form3.child23 = function () {
  console.log('AA0010010form3 script37');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_12_CD');
expj.common.pscript.setMaskToReferenceComponent('AA0010010', 'AA0010010form3', '_AA0010010form3/PeekerITEM_CLASS_12_CD');
};
expj.AA0010010.AA0010010form3.executeAllOnDecision = function () {
  console.log('execute AA0010010form3.onDecision');
  for (var i = 0; i <= 11; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form3['onDecision' + i])) {
        expj.AA0010010.AA0010010form3['onDecision' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010form3.executeOnLoad = function () {
  expj.AA0010010.AA0010010form3.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form3['onLoad' + i])) {
      expj.AA0010010.AA0010010form3['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0010010-AA0010010form3" action="AA0010010Servlet" name="AA0010010form3" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt4099",rb)%></span><!-- 品目分類01 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_01_TYP">
expj.AA0010010.AA0010010form3.ITEM_CLASS_01_TYP = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_01_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_01_TYP.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_01_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_01_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_01_TYP', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_01_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_01_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_01_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_01_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_01_TYP" name="ITEM_CLASS_01_TYP" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_01_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_01_CD">
expj.AA0010010.AA0010010form3.ITEM_CLASS_01_CD = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_01_CD.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_01_CD.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_01_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_01_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_01_CD', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_01_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_01_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_01_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_01_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_01_CD" name="ITEM_CLASS_01_CD" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_01_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-PeekerITEM_CLASS_01_CD">
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_01_CD = {};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_01_CD.onClick0 = function () {
  console.log('PeekerITEM_CLASS_01_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0010010';
var parameterValues = 'PeekerITEM_CLASS_01_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_01_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CLASS_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0010010form3/ITEM_CLASS_01_CD:_AA0010010form3/ITEM_CLASS_01_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_01_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_01_CD['onClick' + i])) {
        expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_01_CD['onClick' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_01_CD.executeAllOnDecision = function () {
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_01_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_01_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0010010', 'AA0010010form3', 'PeekerITEM_CLASS_01_CD', this, 'Button');
    }
  });
  expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_01_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_01_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/PeekerITEM_CLASS_01_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_01_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_01_CD" name="PeekerITEM_CLASS_01_CD" class="AA0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_01_NAME">
expj.AA0010010.AA0010010form3.ITEM_CLASS_01_NAME = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_01_NAME.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_01_NAME.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_01_NAME.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_01_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_01_NAME', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_01_NAME.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_01_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_01_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_01_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_01_NAME" name="ITEM_CLASS_01_NAME" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_01_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt4100",rb)%></span><!-- 品目分類02 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_02_TYP">
expj.AA0010010.AA0010010form3.ITEM_CLASS_02_TYP = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_02_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_02_TYP.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_02_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_02_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_02_TYP', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_02_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_02_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_02_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_02_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_02_TYP" name="ITEM_CLASS_02_TYP" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_02_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_02_CD">
expj.AA0010010.AA0010010form3.ITEM_CLASS_02_CD = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_02_CD.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_02_CD.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_02_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_02_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_02_CD', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_02_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_02_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_02_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_02_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_02_CD" name="ITEM_CLASS_02_CD" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_02_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-PeekerITEM_CLASS_02_CD">
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_02_CD = {};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_02_CD.onClick0 = function () {
  console.log('PeekerITEM_CLASS_02_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0010010';
var parameterValues = 'PeekerITEM_CLASS_02_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_02_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CLASS_02%&%';
parameterValues += 'TARGET_FIELD%=%_AA0010010form3/ITEM_CLASS_02_CD:_AA0010010form3/ITEM_CLASS_02_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_02_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_02_CD['onClick' + i])) {
        expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_02_CD['onClick' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_02_CD.executeAllOnDecision = function () {
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_02_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_02_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0010010', 'AA0010010form3', 'PeekerITEM_CLASS_02_CD', this, 'Button');
    }
  });
  expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_02_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_02_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/PeekerITEM_CLASS_02_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_02_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_02_CD" name="PeekerITEM_CLASS_02_CD" class="AA0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_02_NAME">
expj.AA0010010.AA0010010form3.ITEM_CLASS_02_NAME = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_02_NAME.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_02_NAME.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_02_NAME.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_02_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_02_NAME', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_02_NAME.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_02_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_02_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_02_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_02_NAME" name="ITEM_CLASS_02_NAME" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_02_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt4101",rb)%></span><!-- 品目分類03 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_03_TYP">
expj.AA0010010.AA0010010form3.ITEM_CLASS_03_TYP = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_03_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_03_TYP.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_03_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_03_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_03_TYP', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_03_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_03_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_03_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_03_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_03_TYP" name="ITEM_CLASS_03_TYP" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_03_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_03_CD">
expj.AA0010010.AA0010010form3.ITEM_CLASS_03_CD = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_03_CD.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_03_CD.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_03_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_03_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_03_CD', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_03_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_03_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_03_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_03_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_03_CD" name="ITEM_CLASS_03_CD" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_03_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-PeekerITEM_CLASS_03_CD">
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_03_CD = {};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_03_CD.onClick0 = function () {
  console.log('PeekerITEM_CLASS_03_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0010010';
var parameterValues = 'PeekerITEM_CLASS_03_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_03_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CLASS_03%&%';
parameterValues += 'TARGET_FIELD%=%_AA0010010form3/ITEM_CLASS_03_CD:_AA0010010form3/ITEM_CLASS_03_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_03_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_03_CD['onClick' + i])) {
        expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_03_CD['onClick' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_03_CD.executeAllOnDecision = function () {
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_03_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_03_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0010010', 'AA0010010form3', 'PeekerITEM_CLASS_03_CD', this, 'Button');
    }
  });
  expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_03_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_03_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/PeekerITEM_CLASS_03_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_03_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_03_CD" name="PeekerITEM_CLASS_03_CD" class="AA0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_03_NAME">
expj.AA0010010.AA0010010form3.ITEM_CLASS_03_NAME = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_03_NAME.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_03_NAME.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_03_NAME.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_03_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_03_NAME', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_03_NAME.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_03_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_03_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_03_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_03_NAME" name="ITEM_CLASS_03_NAME" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_03_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt4102",rb)%></span><!-- 品目分類04 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_04_TYP">
expj.AA0010010.AA0010010form3.ITEM_CLASS_04_TYP = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_04_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_04_TYP.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_04_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_04_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_04_TYP', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_04_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_04_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_04_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_04_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_04_TYP" name="ITEM_CLASS_04_TYP" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_04_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_04_CD">
expj.AA0010010.AA0010010form3.ITEM_CLASS_04_CD = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_04_CD.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_04_CD.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_04_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_04_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_04_CD', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_04_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_04_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_04_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_04_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_04_CD" name="ITEM_CLASS_04_CD" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_04_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-PeekerITEM_CLASS_04_CD">
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_04_CD = {};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_04_CD.onClick0 = function () {
  console.log('PeekerITEM_CLASS_04_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0010010';
var parameterValues = 'PeekerITEM_CLASS_04_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_04_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CLASS_04%&%';
parameterValues += 'TARGET_FIELD%=%_AA0010010form3/ITEM_CLASS_04_CD:_AA0010010form3/ITEM_CLASS_04_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_04_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_04_CD['onClick' + i])) {
        expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_04_CD['onClick' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_04_CD.executeAllOnDecision = function () {
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_04_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_04_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0010010', 'AA0010010form3', 'PeekerITEM_CLASS_04_CD', this, 'Button');
    }
  });
  expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_04_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_04_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/PeekerITEM_CLASS_04_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_04_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_04_CD" name="PeekerITEM_CLASS_04_CD" class="AA0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_04_NAME">
expj.AA0010010.AA0010010form3.ITEM_CLASS_04_NAME = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_04_NAME.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_04_NAME.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_04_NAME.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_04_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_04_NAME', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_04_NAME.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_04_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_04_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_04_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_04_NAME" name="ITEM_CLASS_04_NAME" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_04_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt4103",rb)%></span><!-- 品目分類05 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_05_TYP">
expj.AA0010010.AA0010010form3.ITEM_CLASS_05_TYP = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_05_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_05_TYP.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_05_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_05_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_05_TYP', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_05_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_05_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_05_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_05_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_05_TYP" name="ITEM_CLASS_05_TYP" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_05_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_05_CD">
expj.AA0010010.AA0010010form3.ITEM_CLASS_05_CD = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_05_CD.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_05_CD.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_05_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_05_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_05_CD', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_05_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_05_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_05_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_05_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_05_CD" name="ITEM_CLASS_05_CD" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_05_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-PeekerITEM_CLASS_05_CD">
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_05_CD = {};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_05_CD.onClick0 = function () {
  console.log('PeekerITEM_CLASS_05_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0010010';
var parameterValues = 'PeekerITEM_CLASS_05_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_05_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CLASS_05%&%';
parameterValues += 'TARGET_FIELD%=%_AA0010010form3/ITEM_CLASS_05_CD:_AA0010010form3/ITEM_CLASS_05_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_05_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_05_CD['onClick' + i])) {
        expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_05_CD['onClick' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_05_CD.executeAllOnDecision = function () {
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_05_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_05_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0010010', 'AA0010010form3', 'PeekerITEM_CLASS_05_CD', this, 'Button');
    }
  });
  expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_05_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_05_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/PeekerITEM_CLASS_05_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_05_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_05_CD" name="PeekerITEM_CLASS_05_CD" class="AA0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_05_NAME">
expj.AA0010010.AA0010010form3.ITEM_CLASS_05_NAME = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_05_NAME.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_05_NAME.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_05_NAME.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_05_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_05_NAME', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_05_NAME.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_05_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_05_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_05_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_05_NAME" name="ITEM_CLASS_05_NAME" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_05_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt4104",rb)%></span><!-- 品目分類06 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_06_TYP">
expj.AA0010010.AA0010010form3.ITEM_CLASS_06_TYP = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_06_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_06_TYP.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_06_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_06_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_06_TYP', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_06_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_06_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_06_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_06_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_06_TYP" name="ITEM_CLASS_06_TYP" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_06_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_06_CD">
expj.AA0010010.AA0010010form3.ITEM_CLASS_06_CD = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_06_CD.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_06_CD.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_06_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_06_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_06_CD', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_06_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_06_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_06_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_06_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_06_CD" name="ITEM_CLASS_06_CD" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_06_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-PeekerITEM_CLASS_06_CD">
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_06_CD = {};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_06_CD.onClick0 = function () {
  console.log('PeekerITEM_CLASS_06_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0010010';
var parameterValues = 'PeekerITEM_CLASS_06_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_06_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CLASS_06%&%';
parameterValues += 'TARGET_FIELD%=%_AA0010010form3/ITEM_CLASS_06_CD:_AA0010010form3/ITEM_CLASS_06_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_06_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_06_CD['onClick' + i])) {
        expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_06_CD['onClick' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_06_CD.executeAllOnDecision = function () {
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_06_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_06_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0010010', 'AA0010010form3', 'PeekerITEM_CLASS_06_CD', this, 'Button');
    }
  });
  expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_06_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_06_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/PeekerITEM_CLASS_06_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_06_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_06_CD" name="PeekerITEM_CLASS_06_CD" class="AA0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_06_NAME">
expj.AA0010010.AA0010010form3.ITEM_CLASS_06_NAME = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_06_NAME.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_06_NAME.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_06_NAME.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_06_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_06_NAME', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_06_NAME.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_06_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_06_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_06_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_06_NAME" name="ITEM_CLASS_06_NAME" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_06_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt4105",rb)%></span><!-- 品目分類07 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_07_TYP">
expj.AA0010010.AA0010010form3.ITEM_CLASS_07_TYP = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_07_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_07_TYP.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_07_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_07_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_07_TYP', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_07_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_07_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_07_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_07_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_07_TYP" name="ITEM_CLASS_07_TYP" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_07_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_07_CD">
expj.AA0010010.AA0010010form3.ITEM_CLASS_07_CD = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_07_CD.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_07_CD.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_07_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_07_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_07_CD', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_07_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_07_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_07_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_07_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_07_CD" name="ITEM_CLASS_07_CD" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_07_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-PeekerITEM_CLASS_07_CD">
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_07_CD = {};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_07_CD.onClick0 = function () {
  console.log('PeekerITEM_CLASS_07_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0010010';
var parameterValues = 'PeekerITEM_CLASS_07_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_07_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CLASS_07%&%';
parameterValues += 'TARGET_FIELD%=%_AA0010010form3/ITEM_CLASS_07_CD:_AA0010010form3/ITEM_CLASS_07_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_07_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_07_CD['onClick' + i])) {
        expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_07_CD['onClick' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_07_CD.executeAllOnDecision = function () {
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_07_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_07_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0010010', 'AA0010010form3', 'PeekerITEM_CLASS_07_CD', this, 'Button');
    }
  });
  expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_07_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_07_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/PeekerITEM_CLASS_07_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_07_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_07_CD" name="PeekerITEM_CLASS_07_CD" class="AA0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_07_NAME">
expj.AA0010010.AA0010010form3.ITEM_CLASS_07_NAME = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_07_NAME.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_07_NAME.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_07_NAME.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_07_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_07_NAME', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_07_NAME.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_07_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_07_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_07_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_07_NAME" name="ITEM_CLASS_07_NAME" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_07_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt4106",rb)%></span><!-- 品目分類08 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_08_TYP">
expj.AA0010010.AA0010010form3.ITEM_CLASS_08_TYP = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_08_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_08_TYP.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_08_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_08_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_08_TYP', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_08_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_08_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_08_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_08_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_08_TYP" name="ITEM_CLASS_08_TYP" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_08_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_08_CD">
expj.AA0010010.AA0010010form3.ITEM_CLASS_08_CD = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_08_CD.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_08_CD.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_08_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_08_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_08_CD', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_08_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_08_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_08_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_08_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_08_CD" name="ITEM_CLASS_08_CD" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_08_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-PeekerITEM_CLASS_08_CD">
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_08_CD = {};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_08_CD.onClick0 = function () {
  console.log('PeekerITEM_CLASS_08_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0010010';
var parameterValues = 'PeekerITEM_CLASS_08_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_08_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CLASS_08%&%';
parameterValues += 'TARGET_FIELD%=%_AA0010010form3/ITEM_CLASS_08_CD:_AA0010010form3/ITEM_CLASS_08_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_08_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_08_CD['onClick' + i])) {
        expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_08_CD['onClick' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_08_CD.executeAllOnDecision = function () {
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_08_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_08_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0010010', 'AA0010010form3', 'PeekerITEM_CLASS_08_CD', this, 'Button');
    }
  });
  expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_08_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_08_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/PeekerITEM_CLASS_08_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_08_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_08_CD" name="PeekerITEM_CLASS_08_CD" class="AA0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_08_NAME">
expj.AA0010010.AA0010010form3.ITEM_CLASS_08_NAME = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_08_NAME.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_08_NAME.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_08_NAME.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_08_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_08_NAME', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_08_NAME.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_08_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_08_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_08_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_08_NAME" name="ITEM_CLASS_08_NAME" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_08_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt4107",rb)%></span><!-- 品目分類09 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_09_TYP">
expj.AA0010010.AA0010010form3.ITEM_CLASS_09_TYP = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_09_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_09_TYP.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_09_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_09_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_09_TYP', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_09_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_09_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_09_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_09_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_09_TYP" name="ITEM_CLASS_09_TYP" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_09_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_09_CD">
expj.AA0010010.AA0010010form3.ITEM_CLASS_09_CD = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_09_CD.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_09_CD.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_09_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_09_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_09_CD', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_09_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_09_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_09_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_09_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_09_CD" name="ITEM_CLASS_09_CD" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_09_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-PeekerITEM_CLASS_09_CD">
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_09_CD = {};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_09_CD.onClick0 = function () {
  console.log('PeekerITEM_CLASS_09_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0010010';
var parameterValues = 'PeekerITEM_CLASS_09_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_09_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CLASS_09%&%';
parameterValues += 'TARGET_FIELD%=%_AA0010010form3/ITEM_CLASS_09_CD:_AA0010010form3/ITEM_CLASS_09_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_09_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_09_CD['onClick' + i])) {
        expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_09_CD['onClick' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_09_CD.executeAllOnDecision = function () {
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_09_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_09_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0010010', 'AA0010010form3', 'PeekerITEM_CLASS_09_CD', this, 'Button');
    }
  });
  expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_09_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_09_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/PeekerITEM_CLASS_09_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_09_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_09_CD" name="PeekerITEM_CLASS_09_CD" class="AA0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_09_NAME">
expj.AA0010010.AA0010010form3.ITEM_CLASS_09_NAME = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_09_NAME.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_09_NAME.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_09_NAME.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_09_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_09_NAME', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_09_NAME.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_09_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_09_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_09_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_09_NAME" name="ITEM_CLASS_09_NAME" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_09_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt4108",rb)%></span><!-- 品目分類10 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_10_TYP">
expj.AA0010010.AA0010010form3.ITEM_CLASS_10_TYP = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_10_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_10_TYP.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_10_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_10_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_10_TYP', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_10_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_10_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_10_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_10_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_10_TYP" name="ITEM_CLASS_10_TYP" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_10_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_10_CD">
expj.AA0010010.AA0010010form3.ITEM_CLASS_10_CD = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_10_CD.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_10_CD.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_10_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_10_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_10_CD', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_10_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_10_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_10_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_10_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_10_CD" name="ITEM_CLASS_10_CD" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_10_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-PeekerITEM_CLASS_10_CD">
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_10_CD = {};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_10_CD.onClick0 = function () {
  console.log('PeekerITEM_CLASS_10_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0010010';
var parameterValues = 'PeekerITEM_CLASS_10_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_10_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CLASS_10%&%';
parameterValues += 'TARGET_FIELD%=%_AA0010010form3/ITEM_CLASS_10_CD:_AA0010010form3/ITEM_CLASS_10_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_10_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_10_CD['onClick' + i])) {
        expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_10_CD['onClick' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_10_CD.executeAllOnDecision = function () {
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_10_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_10_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0010010', 'AA0010010form3', 'PeekerITEM_CLASS_10_CD', this, 'Button');
    }
  });
  expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_10_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_10_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/PeekerITEM_CLASS_10_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_10_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_10_CD" name="PeekerITEM_CLASS_10_CD" class="AA0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_10_NAME">
expj.AA0010010.AA0010010form3.ITEM_CLASS_10_NAME = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_10_NAME.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_10_NAME.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_10_NAME.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_10_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_10_NAME', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_10_NAME.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_10_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_10_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_10_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_10_NAME" name="ITEM_CLASS_10_NAME" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_10_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt4109",rb)%></span><!-- 品目分類11 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_11_TYP">
expj.AA0010010.AA0010010form3.ITEM_CLASS_11_TYP = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_11_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_11_TYP.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_11_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_11_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_11_TYP', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_11_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_11_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_11_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_11_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_11_TYP" name="ITEM_CLASS_11_TYP" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_11_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_11_CD">
expj.AA0010010.AA0010010form3.ITEM_CLASS_11_CD = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_11_CD.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_11_CD.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_11_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_11_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_11_CD', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_11_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_11_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_11_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_11_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_11_CD" name="ITEM_CLASS_11_CD" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_11_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-PeekerITEM_CLASS_11_CD">
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_11_CD = {};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_11_CD.onClick0 = function () {
  console.log('PeekerITEM_CLASS_11_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0010010';
var parameterValues = 'PeekerITEM_CLASS_11_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_11_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CLASS_11%&%';
parameterValues += 'TARGET_FIELD%=%_AA0010010form3/ITEM_CLASS_11_CD:_AA0010010form3/ITEM_CLASS_11_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_11_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_11_CD['onClick' + i])) {
        expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_11_CD['onClick' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_11_CD.executeAllOnDecision = function () {
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_11_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_11_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0010010', 'AA0010010form3', 'PeekerITEM_CLASS_11_CD', this, 'Button');
    }
  });
  expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_11_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_11_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/PeekerITEM_CLASS_11_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_11_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_11_CD" name="PeekerITEM_CLASS_11_CD" class="AA0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_11_NAME">
expj.AA0010010.AA0010010form3.ITEM_CLASS_11_NAME = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_11_NAME.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_11_NAME.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_11_NAME.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_11_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_11_NAME', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_11_NAME.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_11_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_11_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_11_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_11_NAME" name="ITEM_CLASS_11_NAME" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_11_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt4110",rb)%></span><!-- 品目分類12 --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_12_TYP">
expj.AA0010010.AA0010010form3.ITEM_CLASS_12_TYP = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_12_TYP.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_12_TYP.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_12_TYP.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_12_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_12_TYP', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_12_TYP.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_12_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_12_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_12_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_12_TYP" name="ITEM_CLASS_12_TYP" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_12_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_12_CD">
expj.AA0010010.AA0010010form3.ITEM_CLASS_12_CD = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_12_CD.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_12_CD.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_12_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_12_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_12_CD', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_12_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_12_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_12_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_12_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_12_CD" name="ITEM_CLASS_12_CD" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_12_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-PeekerITEM_CLASS_12_CD">
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_12_CD = {};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_12_CD.onClick0 = function () {
  console.log('PeekerITEM_CLASS_12_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0010010';
var parameterValues = 'PeekerITEM_CLASS_12_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010form3', '_AA0010010form3/ITEM_CLASS_12_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CLASS_12%&%';
parameterValues += 'TARGET_FIELD%=%_AA0010010form3/ITEM_CLASS_12_CD:_AA0010010form3/ITEM_CLASS_12_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_12_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_12_CD['onClick' + i])) {
        expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_12_CD['onClick' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_12_CD.executeAllOnDecision = function () {
};
expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_12_CD.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_12_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0010010', 'AA0010010form3', 'PeekerITEM_CLASS_12_CD', this, 'Button');
    }
  });
  expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_12_CD.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_12_CD.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/PeekerITEM_CLASS_12_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_12_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0010010-AA0010010form3-PeekerITEM_CLASS_12_CD" name="PeekerITEM_CLASS_12_CD" class="AA0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010form3-ITEM_CLASS_12_NAME">
expj.AA0010010.AA0010010form3.ITEM_CLASS_12_NAME = {};
expj.AA0010010.AA0010010form3.ITEM_CLASS_12_NAME.executeAllOnDecision = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_12_NAME.onDecision');
  expj.AA0010010.AA0010010form3.executeAllOnDecision();
  expj.AA0010010.executeAllOnDecision();
};
expj.AA0010010.AA0010010form3.ITEM_CLASS_12_NAME.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010form3-ITEM_CLASS_12_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0010010', 'AA0010010form3', 'ITEM_CLASS_12_NAME', this);
  });
  expj.AA0010010.AA0010010form3.ITEM_CLASS_12_NAME.executePScriptOnLoad();
};

expj.AA0010010.AA0010010form3.ITEM_CLASS_12_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0010010form3/ITEM_CLASS_12_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010form3-ITEM_CLASS_12_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0010010-AA0010010form3-ITEM_CLASS_12_NAME" name="ITEM_CLASS_12_NAME" class="AA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0010010Struct.getITEM_CLASS_12_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07 " style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 " style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0010010-AA0010010button2">
expj.AA0010010.AA0010010button2 = {};
expj.AA0010010.AA0010010button2.executeAllOnDecision = function () {
  console.log('execute AA0010010button2.onDecision');
};
expj.AA0010010.AA0010010button2.executeOnLoad = function () {
  expj.AA0010010.AA0010010button2.executePScriptOnLoad();
};

expj.AA0010010.AA0010010button2.executePScriptOnLoad = function () {
  console.log('execute AA0010010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0010010-AA0010010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0010010-AA0010010button2-insert">
expj.AA0010010.AA0010010button2.insert = {};
expj.AA0010010.AA0010010button2.insert.onClick0 = function () {
  console.log('insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/OPR_RSLT_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MRP_ODR_TYP'), '[neq]', '4')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
expj.AA0010010.AA0010010button2.insert.onClick1 = function () {
  console.log('insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MRP_ODR_TYP'), '[eq]', '6') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MRP_ODR_TYP'), '[eq]', '7')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
expj.AA0010010.AA0010010button2.insert.onClick2 = function () {
  console.log('insert script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MRP_ODR_TYP'), '[eq]', '5')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
expj.AA0010010.AA0010010button2.insert.onClick3 = function () {
  console.log('insert script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MRP_ODR_TYP'), '[eq]', '5')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
expj.AA0010010.AA0010010button2.insert.onClick4 = function () {
  console.log('insert script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MRP_ODR_TYP'), '[eq]', '6') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MRP_ODR_TYP'), '[eq]', '7')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
expj.AA0010010.AA0010010button2.insert.onClick5 = function () {
  console.log('insert script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/OUTSIDE_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/SPL_ITEM_TYP'), '[eq]', '2')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00216');
}
};
expj.AA0010010.AA0010010button2.insert.onClick6 = function () {
  console.log('insert script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_01_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_01_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:01');
}
};
expj.AA0010010.AA0010010button2.insert.onClick7 = function () {
  console.log('insert script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_02_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_02_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:02');
}
};
expj.AA0010010.AA0010010button2.insert.onClick8 = function () {
  console.log('insert script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_03_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_03_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:03');
}
};
expj.AA0010010.AA0010010button2.insert.onClick9 = function () {
  console.log('insert script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_04_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_04_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:04');
}
};
expj.AA0010010.AA0010010button2.insert.onClick10 = function () {
  console.log('insert script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_05_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_05_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:05');
}
};
expj.AA0010010.AA0010010button2.insert.onClick11 = function () {
  console.log('insert script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_06_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_06_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:06');
}
};
expj.AA0010010.AA0010010button2.insert.onClick12 = function () {
  console.log('insert script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_07_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_07_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:07');
}
};
expj.AA0010010.AA0010010button2.insert.onClick13 = function () {
  console.log('insert script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_08_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_08_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:08');
}
};
expj.AA0010010.AA0010010button2.insert.onClick14 = function () {
  console.log('insert script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_09_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_09_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:09');
}
};
expj.AA0010010.AA0010010button2.insert.onClick15 = function () {
  console.log('insert script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_10_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_10_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:10');
}
};
expj.AA0010010.AA0010010button2.insert.onClick16 = function () {
  console.log('insert script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_11_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_11_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:11');
}
};
expj.AA0010010.AA0010010button2.insert.onClick17 = function () {
  console.log('insert script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_12_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_12_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:12');
}
};
expj.AA0010010.AA0010010button2.insert.onClick18 = function () {
  console.log('insert script19');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0010010', 'AA0010010button2', '_AA0010010form1/*,_AA0010010form2/*,_AA0010010form3/*', 'AA0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0010010', response);
expj.common.updateBusinessScreenTab('AA0010010', contents);
};
expj.common.pscript.callConfirm('AA0010010', 'AA0010010button2', 'ZZ07001', okEvent);
};
expj.AA0010010.AA0010010button2.insert.child0 = function () {
  console.log('insert script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/OPR_RSLT_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MRP_ODR_TYP'), '[neq]', '5')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
expj.AA0010010.AA0010010button2.insert.child1 = function () {
  console.log('insert script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/OPR_RSLT_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MRP_ODR_TYP'), '[neq]', '6')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
expj.AA0010010.AA0010010button2.insert.child2 = function () {
  console.log('insert script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/OPR_RSLT_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MRP_ODR_TYP'), '[neq]', '7')) {
expj.common.pscript.addErrorMessage('AA0010010', 'AA0010010button2', 'AA00138');
}
};
expj.AA0010010.AA0010010button2.insert.child3 = function () {
  console.log('insert script23');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/ODR_POINT')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AA0010010', 'AA0010010button2', 'AA00003');
}
};
expj.AA0010010.AA0010010button2.insert.child4 = function () {
  console.log('insert script24');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MAX_ODR_QTY')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MIN_ODR_QTY')))) {
expj.common.pscript.addErrorMessage('AA0010010', 'AA0010010button2', 'AA00147');
}
};
expj.AA0010010.AA0010010button2.insert.child5 = function () {
  console.log('insert script25');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MAX_ODR_QTY')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MUL_ODR_QTY')))) {
expj.common.pscript.addErrorMessage('AA0010010', 'AA0010010button2', 'AA00148');
}
};
expj.AA0010010.AA0010010button2.insert.child6 = function () {
  console.log('insert script26');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/FIXED_ODR_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AA0010010', 'AA0010010button2', 'AA00200');
}
};
expj.AA0010010.AA0010010button2.insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 18; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010button2.insert['onClick' + i])) {
        expj.AA0010010.AA0010010button2.insert['onClick' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010button2.insert.executeAllOnDecision = function () {
};
expj.AA0010010.AA0010010button2.insert.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010button2-insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0010010', 'AA0010010button2', 'insert', this, 'Button');
    }
  });
  expj.AA0010010.AA0010010button2.insert.executePScriptOnLoad();
};

expj.AA0010010.AA0010010button2.insert.executePScriptOnLoad = function () {
  console.log('execute AA0010010button2/insert.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010button2-insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0010010-AA0010010button2-insert" name="insert" class="AA0010010-focus-move" data-lock="1" style="width:100px;" <%= request.getAttribute("ORTEUS_REVOKE_PRIV_INSERT")!=null?"data-revokectrl=\"disabled\"":"data-revokectrl=\"none\"" %>><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010button2-update">
expj.AA0010010.AA0010010button2.update = {};
expj.AA0010010.AA0010010button2.update.onClick0 = function () {
  console.log('update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/OPR_RSLT_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MRP_ODR_TYP'), '[neq]', '4')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
expj.AA0010010.AA0010010button2.update.onClick1 = function () {
  console.log('update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MRP_ODR_TYP'), '[eq]', '6') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MRP_ODR_TYP'), '[eq]', '7')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
expj.AA0010010.AA0010010button2.update.onClick2 = function () {
  console.log('update script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MRP_ODR_TYP'), '[eq]', '5')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
expj.AA0010010.AA0010010button2.update.onClick3 = function () {
  console.log('update script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MRP_ODR_TYP'), '[eq]', '5')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
expj.AA0010010.AA0010010button2.update.onClick4 = function () {
  console.log('update script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MRP_ODR_TYP'), '[eq]', '6') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MRP_ODR_TYP'), '[eq]', '7')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
expj.AA0010010.AA0010010button2.update.onClick5 = function () {
  console.log('update script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/OUTSIDE_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/SPL_ITEM_TYP'), '[eq]', '2')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00216');
}
};
expj.AA0010010.AA0010010button2.update.onClick6 = function () {
  console.log('update script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_01_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_01_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:01');
}
};
expj.AA0010010.AA0010010button2.update.onClick7 = function () {
  console.log('update script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_02_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_02_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:02');
}
};
expj.AA0010010.AA0010010button2.update.onClick8 = function () {
  console.log('update script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_03_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_03_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:03');
}
};
expj.AA0010010.AA0010010button2.update.onClick9 = function () {
  console.log('update script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_04_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_04_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:04');
}
};
expj.AA0010010.AA0010010button2.update.onClick10 = function () {
  console.log('update script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_05_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_05_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:05');
}
};
expj.AA0010010.AA0010010button2.update.onClick11 = function () {
  console.log('update script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_06_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_06_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:06');
}
};
expj.AA0010010.AA0010010button2.update.onClick12 = function () {
  console.log('update script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_07_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_07_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:07');
}
};
expj.AA0010010.AA0010010button2.update.onClick13 = function () {
  console.log('update script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_08_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_08_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:08');
}
};
expj.AA0010010.AA0010010button2.update.onClick14 = function () {
  console.log('update script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_09_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_09_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:09');
}
};
expj.AA0010010.AA0010010button2.update.onClick15 = function () {
  console.log('update script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_10_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_10_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:10');
}
};
expj.AA0010010.AA0010010button2.update.onClick16 = function () {
  console.log('update script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_11_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_11_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:11');
}
};
expj.AA0010010.AA0010010button2.update.onClick17 = function () {
  console.log('update script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_12_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form3/ITEM_CLASS_12_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0010010', 'AA0010010button2', 'AA00177:12');
}
};
expj.AA0010010.AA0010010button2.update.onClick18 = function () {
  console.log('update script19');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0010010', 'AA0010010button2', '_AA0010010form1/*,_AA0010010form2/*,_AA0010010form3/*', 'AA0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0010010', response);
expj.common.updateBusinessScreenTab('AA0010010', contents);
};
expj.common.pscript.callConfirm('AA0010010', 'AA0010010button2', 'ZZ07003', okEvent);
};
expj.AA0010010.AA0010010button2.update.child0 = function () {
  console.log('update script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/OPR_RSLT_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MRP_ODR_TYP'), '[neq]', '5')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
expj.AA0010010.AA0010010button2.update.child1 = function () {
  console.log('update script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/OPR_RSLT_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MRP_ODR_TYP'), '[neq]', '6')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
expj.AA0010010.AA0010010button2.update.child2 = function () {
  console.log('update script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/OPR_RSLT_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MRP_ODR_TYP'), '[neq]', '7')) {
expj.common.pscript.addErrorMessage('AA0010010', 'AA0010010button2', 'AA00138');
}
};
expj.AA0010010.AA0010010button2.update.child3 = function () {
  console.log('update script23');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/ODR_POINT')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AA0010010', 'AA0010010button2', 'AA00003');
}
};
expj.AA0010010.AA0010010button2.update.child4 = function () {
  console.log('update script24');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MAX_ODR_QTY')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MIN_ODR_QTY')))) {
expj.common.pscript.addErrorMessage('AA0010010', 'AA0010010button2', 'AA00147');
}
};
expj.AA0010010.AA0010010button2.update.child5 = function () {
  console.log('update script25');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MAX_ODR_QTY')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/MUL_ODR_QTY')))) {
expj.common.pscript.addErrorMessage('AA0010010', 'AA0010010button2', 'AA00148');
}
};
expj.AA0010010.AA0010010button2.update.child6 = function () {
  console.log('update script26');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0010010', 'AA0010010button2', '_AA0010010form2/FIXED_ODR_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AA0010010', 'AA0010010button2', 'AA00200');
}
};
expj.AA0010010.AA0010010button2.update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 18; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010button2.update['onClick' + i])) {
        expj.AA0010010.AA0010010button2.update['onClick' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010button2.update.executeAllOnDecision = function () {
};
expj.AA0010010.AA0010010button2.update.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010button2-update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0010010', 'AA0010010button2', 'update', this, 'Button');
    }
  });
  expj.AA0010010.AA0010010button2.update.executePScriptOnLoad();
};

expj.AA0010010.AA0010010button2.update.executePScriptOnLoad = function () {
  console.log('execute AA0010010button2/update.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010button2-update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0010010-AA0010010button2-update" name="update" class="AA0010010-focus-move" data-lock="1" style="width:100px;" <%= request.getAttribute("ORTEUS_REVOKE_PRIV_UPDATE")!=null?"data-revokectrl=\"disabled\"":"data-revokectrl=\"none\"" %>><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010button2-delete">
expj.AA0010010.AA0010010button2.delete = {};
expj.AA0010010.AA0010010button2.delete.onClick0 = function () {
  console.log('delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0010010', 'AA0010010button2', '_AA0010010form1/*,_AA0010010form2/*,_AA0010010form3/*', 'AA0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0010010', response);
expj.common.updateBusinessScreenTab('AA0010010', contents);
};
expj.common.pscript.callConfirm('AA0010010', 'AA0010010button2', 'ZZ07004', okEvent);
};
expj.AA0010010.AA0010010button2.delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010button2.delete['onClick' + i])) {
        expj.AA0010010.AA0010010button2.delete['onClick' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010button2.delete.executeAllOnDecision = function () {
};
expj.AA0010010.AA0010010button2.delete.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010button2-delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0010010', 'AA0010010button2', 'delete', this, 'Button');
    }
  });
  expj.AA0010010.AA0010010button2.delete.executePScriptOnLoad();
};

expj.AA0010010.AA0010010button2.delete.executePScriptOnLoad = function () {
  console.log('execute AA0010010button2/delete.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010button2-delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0010010-AA0010010button2-delete" name="delete" class="AA0010010-focus-move" data-lock="1" style="width:100px;" <%= request.getAttribute("ORTEUS_REVOKE_PRIV_DELETE")!=null?"data-revokectrl=\"disabled\"":"data-revokectrl=\"none\"" %>><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/tab END-->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:15px; position:fixed;">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AA0010010 Revision: 1.22  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AA0010010-AA0010010button0">
expj.AA0010010.AA0010010button0 = {};
expj.AA0010010.AA0010010button0.executeAllOnDecision = function () {
  console.log('execute AA0010010button0.onDecision');
};
expj.AA0010010.AA0010010button0.executeOnLoad = function () {
  expj.AA0010010.AA0010010button0.executePScriptOnLoad();
};

expj.AA0010010.AA0010010button0.executePScriptOnLoad = function () {
  console.log('execute AA0010010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0010010-AA0010010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0010010-AA0010010button0-clear">
expj.AA0010010.AA0010010button0.clear = {};
expj.AA0010010.AA0010010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0010010', 'AA0010010button0', '', 'AA0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0010010', response);
expj.common.updateBusinessScreenTab('AA0010010', contents);
};
expj.common.pscript.callConfirm('AA0010010', 'AA0010010button0', 'ZZ07008', okEvent);
};
expj.AA0010010.AA0010010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010button0.clear['onClick' + i])) {
        expj.AA0010010.AA0010010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010button0.clear.executeAllOnDecision = function () {
};
expj.AA0010010.AA0010010button0.clear.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0010010', 'AA0010010button0', 'clear', this, 'Button');
    }
  });
  expj.AA0010010.AA0010010button0.clear.executePScriptOnLoad();
};

expj.AA0010010.AA0010010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AA0010010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0010010-AA0010010button0-clear" name="clear" class="AA0010010-focus-move" data-lock="0" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AA0010010-AA0010010button0-close">
expj.AA0010010.AA0010010button0.close = {};
expj.AA0010010.AA0010010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AA0010010');
};
expj.AA0010010.AA0010010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0010010.AA0010010button0.close['onClick' + i])) {
        expj.AA0010010.AA0010010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AA0010010.AA0010010button0.close.executeAllOnDecision = function () {
};
expj.AA0010010.AA0010010button0.close.executeOnLoad = function () {
  $('#expj-AA0010010-AA0010010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0010010', 'AA0010010button0', 'close', this, 'Button');
    }
  });
  expj.AA0010010.AA0010010button0.close.executePScriptOnLoad();
};

expj.AA0010010.AA0010010button0.close.executePScriptOnLoad = function () {
  console.log('execute AA0010010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AA0010010-AA0010010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0010010-AA0010010button0-close" name="close" class="AA0010010-focus-move expj-business-screen-close-button" data-lock="" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0010010 (END)-->
<%
MessageStruct msgStruct = aAA0010010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0010010)) {
  expj.common.treeInstanceMap.AA0010010 = {};
}
expj.common.treeInstanceMap.AA0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0010010)) {
  expj.common.detailDialogMap.AA0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
 String viewType = (String) viewTypeList.get(i);
 StringBuffer viewHeaderBuffer = (StringBuffer) viewHeaderDataList.get(i);
 StringBuffer viewDataBuffer = (StringBuffer) viewBodyDataList.get(i);
%>
<script class="expj-script-AA0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0010010)) {
  expj.common.viewInstanceMap.AA0010010 = {};
}
expj.common.viewInstanceMap.AA0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0010010.<%=viewId %>.init = function () {
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
    expj.AA0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent, '<%=viewType %>');
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0010010_init">
/**
 * AA0010010用のロード完了時初期化関数
 */
expj.AA0010010.executeScreenLoad = function () {
  expj.common.revokeControl('#expj-business-screen-tabs-body-AA0010010');
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0010010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0010010');
  expj.common.calendarInstanceMap.AA0010010 = {};
  $('#expj-AA0010010-AA0010010tabs-tabIndex').append('<li><a href="#expj-AA0010010-AA0010010form2" draggable="false"><span>** 1 **</span></a></li>');
  $('#expj-AA0010010-AA0010010tabs-tabIndex').append('<li><a href="#expj-AA0010010-AA0010010form3" draggable="false"><span>** 2 **</span></a></li>');
  if (!expj.common.checkNameSpace(expj.common.innerTabMap.AA0010010)) {
    expj.common.innerTabMap.AA0010010 = null;
  }
  $(window).ready(function(){
    $('#expj-AA0010010-AA0010010tabs').tabs({
      'beforeActivate': function (event, ui) {
        expj.common.manageChangeInnerTabPage(ui);
        expj.common.innerTabMap.AA0010010 = ui.newTab.attr('aria-controls');
      },
      'activate' : function (event, ui) {
        expj.common.manageChangeInnerTabPageAfter(ui);
      }
    });
    var innerTabPanelList = $('#expj-AA0010010-AA0010010tabs').find('.ui-tabs-panel');
    for (var i = 1; i < innerTabPanelList.length; i++) {
      var target = $(innerTabPanelList[i]);
      target.parent().parent().css('display', 'none');
    }
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0010010');
    if (expj.common.innerTabMap.AA0010010 !== null) {
      $('#expj-business-screen-tabs-body-AA0010010').find('li[aria-controls="' + expj.common.innerTabMap.AA0010010 + '"] a').click();
    }
  });
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0010010-<%=detailId %>');
<%
 }
%>
  try{expj.AA0010010.AA0010010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form1.h_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form1.h_APR_ITEM.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form1.h_SCREENMOVE_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form1.h_APPR_ID.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010button1.select.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.DRAW_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.HIGH_LEVEL_NO.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.SPEC.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.ISSUE_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.UNIT_QTY_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.OUTSIDE_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.ACPT_INSPC_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.STOCK_UNIT_FLG.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.PRODUCT_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.ABC_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.PKG_UNIT.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.OPR_RSLT_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.PKG_UNIT_QTY.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.SPL_ITEM_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.ODR_LT.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.ISSUE_LT.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.FIXED_LT.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.PROP_LOT_SIZE.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.PROP_LT.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.ITEM_SPOIL.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.SAFETY_LT.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.SAFETY_STOCK.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.MRP_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.MANHOUR_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.LOT_SIZING_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.MPS_FLG.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.MAX_PERIOD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.FIXED_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.MAX_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.MIN_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.ODR_POINT.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.MUL_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.CLASIFICATION_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.UNIT_WEIGHT.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.TAX_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.PeekerTaxCd.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.TAX_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.CAL_NO.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.PeekerCalNo.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.CAL_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.DEPO_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.BEST_BEFORE_YEAR.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.LOT_CTRL_FLG.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.BEST_BEFORE_MONTH.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.LOT_NUMBERING_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.BEST_BEFORE_DAY.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.DEPT_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.PeekerDeptCd.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.DEPT_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.PJ_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.SEG_CONTENTS1.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.SEG_CONTENTS2.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.SEG_CONTENTS3.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.SEG_CONTENTS4.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.REMARK1.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.REMARK2.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.APPR_REMARKS.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_01_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_01_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_01_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_01_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_02_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_02_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_02_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_02_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_03_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_03_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_03_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_03_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_04_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_04_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_04_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_04_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_05_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_05_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_05_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_05_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_06_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_06_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_06_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_06_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_07_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_07_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_07_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_07_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_08_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_08_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_08_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_08_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_09_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_09_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_09_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_09_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_10_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_10_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_10_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_10_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_11_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_11_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_11_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_11_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_12_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_12_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.PeekerITEM_CLASS_12_CD.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.ITEM_CLASS_12_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010button2.insert.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010button2.update.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010button2.delete.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010button0.close.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form1.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010button1.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form2.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010form3.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010button2.executeOnLoad();}catch(e){};
  try{expj.AA0010010.AA0010010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0010010', 'AA0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0010010-focus-move');
  // 初期フォーカス処理
  setTimeout(function () {
    $('.AA0010010-focus-move').each(function(){
      if(!$(this).is(':disabled') && this.type !== 'image'){
        $(this).focus();
        return false;
      }
    });
  }, expj.common.screenFrameLoadingTime);
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0010010', '<%=request.getContextPath() %>');
};

/**
 * AA0010010の全体onDecision処理
 */
expj.AA0010010.executeAllOnDecision = function () {
  expj.AA0010010.AA0010010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0010010_console">
expj.AA0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>