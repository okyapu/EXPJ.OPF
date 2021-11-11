<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:26:24 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AB0010\AB0010010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AB0010.*" %>
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
<jsp:useBean id="aAB0010010Control" class="com.nec.jp.orteus.metamorBase.AB0010.AB0010010Control" scope="request"/>
<jsp:useBean id="aAB0010010Struct" class="com.nec.jp.orteus.metamorBase.AB0010.AB0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

生産計画メンテナンス(MRP)
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AB0010/jsp/AB0010010.jsp,v $
$Author: geng-jia $
$Revision: 1.35 $ $Date: 2017/02/22 02:04:18 $
********************************************************* --%>
<html>
<head>
<title>生産計画メンテナンス(MRP)</title>
<%@ page import="com.nec.jp.orteus.metamorBase.common01.StockCalculate.MrpData" %>
<%@ page import="com.nec.jp.orteus.metamorBase.common01.StockCalculate.MrpManager" %>
<%@ page import="com.nec.jp.orteus.expj.util.Calculate" %>
<%@include file="common/expj_v5.jsp" %>
<%
ScreenMoveUtil su = new ScreenMoveUtil("AJ0010010Servlet", so);
ScreenMoveUtil su2 = new ScreenMoveUtil("AG0050010Servlet", so);
%>

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
<script class="expj-script-AB0010010_init">
  // AB0010010名前空間
  expj.AB0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AB0010010" data-screen="AB0010010" data-newdata="<%=aAB0010010Control.isNewData() %>">
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

            <div class="expj-td frame04" style=""></div><!--/td-->

            <div class="expj-td frame05" style="">
              <script class="expj-script-AB0010010-AB0010010form1">
expj.AB0010010.AB0010010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.AB0010010.AB0010010form1.onLoad0 = function () {
  console.log('AB0010010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AB0010010.AB0010010form1.onDecision0 = function () {
  console.log('AB0010010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AB0010010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="onDecision;1;CHKRQ;A@*2,*4"
expj.AB0010010.AB0010010form1.onDecision1 = function () {
  console.log('AB0010010form1 script3');
if (expj.common.pscript.satisfiedRequiredComponent('AB0010010', 'A')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script4="onDecision;2;CHK;?AB0010010view1/?[eq]SINGLE[and]_AB0010010form1/TIME_CTRL[eq]true@*5,*6"
expj.AB0010010.AB0010010form1.onDecision2 = function () {
  console.log('AB0010010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010form1', '?AB0010010view1/?'), '[eq]', 'SINGLE') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010form1', '_AB0010010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script5="child;0;UNMASK;_AB0010010button1/select"
expj.AB0010010.AB0010010form1.child0 = function () {
  console.log('AB0010010form1 script5');
expj.common.pscript.setUnMaskToReferenceComponent('AB0010010', 'AB0010010form1', '_AB0010010button1/select');
};
// script6="child;1;MASK;_AB0010010button1/select"
expj.AB0010010.AB0010010form1.child1 = function () {
  console.log('AB0010010form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AB0010010', 'AB0010010form1', '_AB0010010button1/select');
};
// script7="child;2;CHK;?AB0010010view1/*[eq]INITIAL@*4,*3"
expj.AB0010010.AB0010010form1.child2 = function () {
  console.log('AB0010010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010form1', '?AB0010010view1/*'), '[eq]', 'INITIAL')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script8="child;3;UNMASK;_AB0010010button0/OdrProgLst,_AB0010010button0/SrcmovToTimeInOut"
expj.AB0010010.AB0010010form1.child3 = function () {
  console.log('AB0010010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AB0010010', 'AB0010010form1', '_AB0010010button0/OdrProgLst');
expj.common.pscript.setUnMaskToReferenceComponent('AB0010010', 'AB0010010form1', '_AB0010010button0/SrcmovToTimeInOut');
};
// script9="child;4;MASK;_AB0010010button0/OdrProgLst,_AB0010010button0/SrcmovToTimeInOut"
expj.AB0010010.AB0010010form1.child4 = function () {
  console.log('AB0010010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('AB0010010', 'AB0010010form1', '_AB0010010button0/OdrProgLst');
expj.common.pscript.setMaskToReferenceComponent('AB0010010', 'AB0010010form1', '_AB0010010button0/SrcmovToTimeInOut');
};
// script10="child;5;UNMASK;_AB0010010button2/time"
expj.AB0010010.AB0010010form1.child5 = function () {
  console.log('AB0010010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('AB0010010', 'AB0010010form1', '_AB0010010button2/time');
};
// script11="child;6;MASK;_AB0010010button2/time"
expj.AB0010010.AB0010010form1.child6 = function () {
  console.log('AB0010010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('AB0010010', 'AB0010010form1', '_AB0010010button2/time');
};
// script12="onDecision;3;CHK;?AB0010010form1/*[eq]NORMAL@*7,*9"
expj.AB0010010.AB0010010form1.onDecision3 = function () {
  console.log('AB0010010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010form1', '?AB0010010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script13="child;7;CHK;?AB0010010form1/w_PLANT_CD[eq]SAME[and]?AB0010010form1/w_ITEM_CD[eq]SAME[and]?AB0010010form1/w_date_from[eq]SAME[and]?AB0010010form1/w_date_to[eq]SAME@*8,*9"
expj.AB0010010.AB0010010form1.child7 = function () {
  console.log('AB0010010form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010form1', '?AB0010010form1/w_PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010form1', '?AB0010010form1/w_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010form1', '?AB0010010form1/w_date_from'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010form1', '?AB0010010form1/w_date_to'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script14="child;8;UNMASK;_AB0010010button2/update@*10"
expj.AB0010010.AB0010010form1.child8 = function () {
  console.log('AB0010010form1 script14');
expj.common.pscript.setUnMaskToReferenceComponent('AB0010010', 'AB0010010form1', '_AB0010010button2/update');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child10)){this.child10();}}
};
// script15="child;9;MASK;_AB0010010button2/update,_AB0010010button2/time"
expj.AB0010010.AB0010010form1.child9 = function () {
  console.log('AB0010010form1 script15');
expj.common.pscript.setMaskToReferenceComponent('AB0010010', 'AB0010010form1', '_AB0010010button2/update');
expj.common.pscript.setMaskToReferenceComponent('AB0010010', 'AB0010010form1', '_AB0010010button2/time');
};
// script16="child;10;CHK;?AB0010010view1/?[eq]SINGLE[and]_AB0010010form1/TIME_CTRL[eq]true@*5,*6"
expj.AB0010010.AB0010010form1.child10 = function () {
  console.log('AB0010010form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010form1', '?AB0010010view1/?'), '[eq]', 'SINGLE') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010form1', '_AB0010010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
expj.AB0010010.AB0010010form1.executeAllOnDecision = function () {
  console.log('execute AB0010010form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0010010.AB0010010form1['onDecision' + i])) {
        expj.AB0010010.AB0010010form1['onDecision' + i]();
      }
    }
  }
};
expj.AB0010010.AB0010010form1.executeOnLoad = function () {
  expj.AB0010010.AB0010010form1.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AB0010010.AB0010010form1['onLoad' + i])) {
      expj.AB0010010.AB0010010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AB0010010-AB0010010form1" action="AB0010010Servlet" name="AB0010010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAB0010010Control.getReadStatusString()) %>" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="align:"></div>
<div class="div-td" style="align:"></div>
<div class="div-td" style="align:"></div>
<div class="div-td" style="align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ISSUE_PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AB0010010-AB0010010form1-w_PLANT_CD">
expj.AB0010010.AB0010010form1.w_PLANT_CD = {};
expj.AB0010010.AB0010010form1.w_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/w_PLANT_CD.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.w_PLANT_CD.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-w_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'w_PLANT_CD', this);
  });
  expj.AB0010010.AB0010010form1.w_PLANT_CD.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.w_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/w_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-w_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AB0010010-AB0010010form1-w_PLANT_CD" name="w_PLANT_CD" class="AB0010010-focus-move  required-value expj-AB0010010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getw_PLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AB0010010-AB0010010form1-PeekerWPlantCd">
expj.AB0010010.AB0010010form1.PeekerWPlantCd = {};
// script1="onClick;0;PEEKER;_AB0010010form1/w_PLANT_CD@<%=contextNo%>"
expj.AB0010010.AB0010010form1.PeekerWPlantCd.onClick0 = function () {
  console.log('PeekerWPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AB0010010';
var parameterValues = 'PeekerWPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010form1', '_AB0010010form1/w_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AB0010010form1/w_PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AB0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AB0010010.AB0010010form1.PeekerWPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0010010.AB0010010form1.PeekerWPlantCd['onClick' + i])) {
        expj.AB0010010.AB0010010form1.PeekerWPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AB0010010.AB0010010form1.PeekerWPlantCd.executeAllOnDecision = function () {
};
expj.AB0010010.AB0010010form1.PeekerWPlantCd.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-PeekerWPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0010010', 'AB0010010form1', 'PeekerWPlantCd', this, 'Button');
    }
  });
  expj.AB0010010.AB0010010form1.PeekerWPlantCd.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.PeekerWPlantCd.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/PeekerWPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-PeekerWPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AB0010010-AB0010010form1-PeekerWPlantCd" class="AB0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AB0010010-AB0010010form1-PLANT_NAME">
expj.AB0010010.AB0010010form1.PLANT_NAME = {};
expj.AB0010010.AB0010010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/PLANT_NAME.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'PLANT_NAME', this);
  });
  expj.AB0010010.AB0010010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AB0010010-AB0010010form1-PLANT_NAME" name="PLANT_NAME" class="AB0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AB0010010-AB0010010form1-MUL_ODR_QTY" name="MUL_ODR_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getMUL_ODR_QTY()) %>">
<script class="expj-script-AB0010010-AB0010010form1-MUL_ODR_QTY">
expj.AB0010010.AB0010010form1.MUL_ODR_QTY = {};
expj.AB0010010.AB0010010form1.MUL_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/MUL_ODR_QTY.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.MUL_ODR_QTY.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-MUL_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'MUL_ODR_QTY', this);
  });
  expj.AB0010010.AB0010010form1.MUL_ODR_QTY.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.MUL_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/MUL_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-MUL_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AB0010010-AB0010010form1-MRP_ODR_TYP" name="MRP_ODR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getMRP_ODR_TYP()) %>">
<script class="expj-script-AB0010010-AB0010010form1-MRP_ODR_TYP">
expj.AB0010010.AB0010010form1.MRP_ODR_TYP = {};
expj.AB0010010.AB0010010form1.MRP_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/MRP_ODR_TYP.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.MRP_ODR_TYP.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-MRP_ODR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'MRP_ODR_TYP', this);
  });
  expj.AB0010010.AB0010010form1.MRP_ODR_TYP.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.MRP_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/MRP_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-MRP_ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AB0010010-AB0010010form1-UNIT_QTY_TYP" name="UNIT_QTY_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getUNIT_QTY_TYP()) %>">
<script class="expj-script-AB0010010-AB0010010form1-UNIT_QTY_TYP">
expj.AB0010010.AB0010010form1.UNIT_QTY_TYP = {};
expj.AB0010010.AB0010010form1.UNIT_QTY_TYP.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/UNIT_QTY_TYP.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.UNIT_QTY_TYP.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-UNIT_QTY_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'UNIT_QTY_TYP', this);
  });
  expj.AB0010010.AB0010010form1.UNIT_QTY_TYP.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.UNIT_QTY_TYP.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/UNIT_QTY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-UNIT_QTY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AB0010010-AB0010010form1-UNIT_QTY_NAME" name="UNIT_QTY_NAME" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getUNIT_QTY_NAME()) %>">
<script class="expj-script-AB0010010-AB0010010form1-UNIT_QTY_NAME">
expj.AB0010010.AB0010010form1.UNIT_QTY_NAME = {};
expj.AB0010010.AB0010010form1.UNIT_QTY_NAME.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/UNIT_QTY_NAME.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.UNIT_QTY_NAME.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-UNIT_QTY_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'UNIT_QTY_NAME', this);
  });
  expj.AB0010010.AB0010010form1.UNIT_QTY_NAME.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.UNIT_QTY_NAME.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/UNIT_QTY_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-UNIT_QTY_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AB0010010-AB0010010form1-OUTSIDE_TYP" name="OUTSIDE_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getOUTSIDE_TYP()) %>">
<script class="expj-script-AB0010010-AB0010010form1-OUTSIDE_TYP">
expj.AB0010010.AB0010010form1.OUTSIDE_TYP = {};
expj.AB0010010.AB0010010form1.OUTSIDE_TYP.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/OUTSIDE_TYP.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.OUTSIDE_TYP.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-OUTSIDE_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'OUTSIDE_TYP', this);
  });
  expj.AB0010010.AB0010010form1.OUTSIDE_TYP.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.OUTSIDE_TYP.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/OUTSIDE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-OUTSIDE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AB0010010-AB0010010form1-OUTSIDE_NAME" name="OUTSIDE_NAME" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getOUTSIDE_NAME()) %>">
<script class="expj-script-AB0010010-AB0010010form1-OUTSIDE_NAME">
expj.AB0010010.AB0010010form1.OUTSIDE_NAME = {};
expj.AB0010010.AB0010010form1.OUTSIDE_NAME.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/OUTSIDE_NAME.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.OUTSIDE_NAME.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-OUTSIDE_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'OUTSIDE_NAME', this);
  });
  expj.AB0010010.AB0010010form1.OUTSIDE_NAME.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.OUTSIDE_NAME.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/OUTSIDE_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-OUTSIDE_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AB0010010-AB0010010form1-w_ITEM_CD">
expj.AB0010010.AB0010010form1.w_ITEM_CD = {};
expj.AB0010010.AB0010010form1.w_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/w_ITEM_CD.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.w_ITEM_CD.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-w_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'w_ITEM_CD', this);
  });
  expj.AB0010010.AB0010010form1.w_ITEM_CD.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.w_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/w_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-w_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AB0010010-AB0010010form1-w_ITEM_CD" name="w_ITEM_CD" class="AB0010010-focus-move  required-value expj-AB0010010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getw_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AB0010010-AB0010010form1-PeekerWItemCd">
expj.AB0010010.AB0010010form1.PeekerWItemCd = {};
// script1="onClick;0;PEEKER;_AB0010010form1/w_ITEM_CD@<%=contextNo%>"
expj.AB0010010.AB0010010form1.PeekerWItemCd.onClick0 = function () {
  console.log('PeekerWItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AB0010010';
var parameterValues = 'PeekerWItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010form1', '_AB0010010form1/w_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_04%&%';
parameterValues += 'TARGET_FIELD%=%_AB0010010form1/w_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AB0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AB0010010.AB0010010form1.PeekerWItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0010010.AB0010010form1.PeekerWItemCd['onClick' + i])) {
        expj.AB0010010.AB0010010form1.PeekerWItemCd['onClick' + i]();
      }
    }
  }
};
expj.AB0010010.AB0010010form1.PeekerWItemCd.executeAllOnDecision = function () {
};
expj.AB0010010.AB0010010form1.PeekerWItemCd.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-PeekerWItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0010010', 'AB0010010form1', 'PeekerWItemCd', this, 'Button');
    }
  });
  expj.AB0010010.AB0010010form1.PeekerWItemCd.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.PeekerWItemCd.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/PeekerWItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-PeekerWItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AB0010010-AB0010010form1-PeekerWItemCd" class="AB0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AB0010010-AB0010010form1-ITEM_NAME">
expj.AB0010010.AB0010010form1.ITEM_NAME = {};
expj.AB0010010.AB0010010form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/ITEM_NAME.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'ITEM_NAME', this);
  });
  expj.AB0010010.AB0010010form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AB0010010-AB0010010form1-ITEM_NAME" name="ITEM_NAME" class="AB0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AB0010010-AB0010010form1-SPEC" name="SPEC" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getSPEC()) %>">
<script class="expj-script-AB0010010-AB0010010form1-SPEC">
expj.AB0010010.AB0010010form1.SPEC = {};
expj.AB0010010.AB0010010form1.SPEC.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/SPEC.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.SPEC.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-SPEC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'SPEC', this);
  });
  expj.AB0010010.AB0010010form1.SPEC.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.SPEC.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/SPEC.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-SPEC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AB0010010-AB0010010form1-LOT_SIZING_TYP" name="LOT_SIZING_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getLOT_SIZING_TYP()) %>">
<script class="expj-script-AB0010010-AB0010010form1-LOT_SIZING_TYP">
expj.AB0010010.AB0010010form1.LOT_SIZING_TYP = {};
expj.AB0010010.AB0010010form1.LOT_SIZING_TYP.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/LOT_SIZING_TYP.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.LOT_SIZING_TYP.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-LOT_SIZING_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'LOT_SIZING_TYP', this);
  });
  expj.AB0010010.AB0010010form1.LOT_SIZING_TYP.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.LOT_SIZING_TYP.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/LOT_SIZING_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-LOT_SIZING_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AB0010010-AB0010010form1-LOT_SIZING_NAME" name="LOT_SIZING_NAME" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getLOT_SIZING_NAME()) %>">
<script class="expj-script-AB0010010-AB0010010form1-LOT_SIZING_NAME">
expj.AB0010010.AB0010010form1.LOT_SIZING_NAME = {};
expj.AB0010010.AB0010010form1.LOT_SIZING_NAME.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/LOT_SIZING_NAME.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.LOT_SIZING_NAME.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-LOT_SIZING_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'LOT_SIZING_NAME', this);
  });
  expj.AB0010010.AB0010010form1.LOT_SIZING_NAME.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.LOT_SIZING_NAME.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/LOT_SIZING_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-LOT_SIZING_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AB0010010-AB0010010form1-MAX_PERIOD" name="MAX_PERIOD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getMAX_PERIOD()) %>">
<script class="expj-script-AB0010010-AB0010010form1-MAX_PERIOD">
expj.AB0010010.AB0010010form1.MAX_PERIOD = {};
expj.AB0010010.AB0010010form1.MAX_PERIOD.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/MAX_PERIOD.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.MAX_PERIOD.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-MAX_PERIOD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'MAX_PERIOD', this);
  });
  expj.AB0010010.AB0010010form1.MAX_PERIOD.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.MAX_PERIOD.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/MAX_PERIOD.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-MAX_PERIOD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AB0010010-AB0010010form1-DRAW_CD" name="DRAW_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getDRAW_CD()) %>">
<script class="expj-script-AB0010010-AB0010010form1-DRAW_CD">
expj.AB0010010.AB0010010form1.DRAW_CD = {};
expj.AB0010010.AB0010010form1.DRAW_CD.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/DRAW_CD.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.DRAW_CD.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-DRAW_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'DRAW_CD', this);
  });
  expj.AB0010010.AB0010010form1.DRAW_CD.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.DRAW_CD.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/DRAW_CD.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-DRAW_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AB0010010-AB0010010form1-MRP_ODR_NAME" name="MRP_ODR_NAME" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getMRP_ODR_NAME()) %>">
<script class="expj-script-AB0010010-AB0010010form1-MRP_ODR_NAME">
expj.AB0010010.AB0010010form1.MRP_ODR_NAME = {};
expj.AB0010010.AB0010010form1.MRP_ODR_NAME.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/MRP_ODR_NAME.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.MRP_ODR_NAME.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-MRP_ODR_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'MRP_ODR_NAME', this);
  });
  expj.AB0010010.AB0010010form1.MRP_ODR_NAME.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.MRP_ODR_NAME.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/MRP_ODR_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-MRP_ODR_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AB0010010-AB0010010form1-MAX_ODR_QTY" name="MAX_ODR_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getMAX_ODR_QTY()) %>">
<script class="expj-script-AB0010010-AB0010010form1-MAX_ODR_QTY">
expj.AB0010010.AB0010010form1.MAX_ODR_QTY = {};
expj.AB0010010.AB0010010form1.MAX_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/MAX_ODR_QTY.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.MAX_ODR_QTY.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-MAX_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'MAX_ODR_QTY', this);
  });
  expj.AB0010010.AB0010010form1.MAX_ODR_QTY.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.MAX_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/MAX_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-MAX_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AB0010010-AB0010010form1-MIN_ODR_QTY" name="MIN_ODR_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getMIN_ODR_QTY()) %>">
<script class="expj-script-AB0010010-AB0010010form1-MIN_ODR_QTY">
expj.AB0010010.AB0010010form1.MIN_ODR_QTY = {};
expj.AB0010010.AB0010010form1.MIN_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/MIN_ODR_QTY.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.MIN_ODR_QTY.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-MIN_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'MIN_ODR_QTY', this);
  });
  expj.AB0010010.AB0010010form1.MIN_ODR_QTY.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.MIN_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/MIN_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-MIN_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt0420",rb)%></span><!-- 生産計画期間 --></div><!--/td-->
<script class="expj-script-AB0010010-AB0010010form1-w_date_from">
expj.AB0010010.AB0010010form1.w_date_from = {};
expj.AB0010010.AB0010010form1.w_date_from.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/w_date_from.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.w_date_from.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-w_date_from').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'w_date_from', this);
  });
  expj.AB0010010.AB0010010form1.w_date_from.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.w_date_from.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/w_date_from.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-w_date_from');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AB0010010-AB0010010form1-w_date_from" name="w_date_from" class="AB0010010-focus-move  required-value expj-AB0010010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getw_date_from()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AB0010010-AB0010010form1-CalendarFromDate">
expj.AB0010010.AB0010010form1.CalendarFromDate = {};
// script1="onClick;0;CALENDAR;_AB0010010form1/w_date_from"
expj.AB0010010.AB0010010form1.CalendarFromDate.onClick0 = function () {
  console.log('CalendarFromDate script1');
expj.common.pscript.executeCalendar('AB0010010','AB0010010form1','_AB0010010form1/w_date_from');
};
expj.AB0010010.AB0010010form1.CalendarFromDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0010010.AB0010010form1.CalendarFromDate['onClick' + i])) {
        expj.AB0010010.AB0010010form1.CalendarFromDate['onClick' + i]();
      }
    }
  }
};
expj.AB0010010.AB0010010form1.CalendarFromDate.executeAllOnDecision = function () {
};
expj.AB0010010.AB0010010form1.CalendarFromDate.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-CalendarFromDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0010010', 'AB0010010form1', 'CalendarFromDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AB0010010','AB0010010form1','_AB0010010form1/w_date_from');
  expj.AB0010010.AB0010010form1.CalendarFromDate.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.CalendarFromDate.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/CalendarFromDate.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-CalendarFromDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AB0010010-AB0010010form1-CalendarFromDate" class="AB0010010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AB0010010-AB0010010form1-w_date_to">
expj.AB0010010.AB0010010form1.w_date_to = {};
expj.AB0010010.AB0010010form1.w_date_to.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/w_date_to.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.w_date_to.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-w_date_to').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'w_date_to', this);
  });
  expj.AB0010010.AB0010010form1.w_date_to.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.w_date_to.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/w_date_to.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-w_date_to');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AB0010010-AB0010010form1-w_date_to" name="w_date_to" class="AB0010010-focus-move  required-value expj-AB0010010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getw_date_to()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AB0010010-AB0010010form1-CalendarToDate">
expj.AB0010010.AB0010010form1.CalendarToDate = {};
// script1="onClick;0;CALENDAR;_AB0010010form1/w_date_to"
expj.AB0010010.AB0010010form1.CalendarToDate.onClick0 = function () {
  console.log('CalendarToDate script1');
expj.common.pscript.executeCalendar('AB0010010','AB0010010form1','_AB0010010form1/w_date_to');
};
expj.AB0010010.AB0010010form1.CalendarToDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0010010.AB0010010form1.CalendarToDate['onClick' + i])) {
        expj.AB0010010.AB0010010form1.CalendarToDate['onClick' + i]();
      }
    }
  }
};
expj.AB0010010.AB0010010form1.CalendarToDate.executeAllOnDecision = function () {
};
expj.AB0010010.AB0010010form1.CalendarToDate.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-CalendarToDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0010010', 'AB0010010form1', 'CalendarToDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AB0010010','AB0010010form1','_AB0010010form1/w_date_to');
  expj.AB0010010.AB0010010form1.CalendarToDate.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.CalendarToDate.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/CalendarToDate.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-CalendarToDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-AB0010010-AB0010010form1-CalendarToDate" class="AB0010010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<input type="hidden" id="expj-AB0010010-AB0010010form1-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getTIME_CTRL()) %>">
<script class="expj-script-AB0010010-AB0010010form1-TIME_CTRL">
expj.AB0010010.AB0010010form1.TIME_CTRL = {};
expj.AB0010010.AB0010010form1.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/TIME_CTRL.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'TIME_CTRL', this);
  });
  expj.AB0010010.AB0010010form1.TIME_CTRL.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-TIME_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AB0010010-AB0010010form1-ITEM_SPOIL" name="ITEM_SPOIL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getITEM_SPOIL()) %>">
<script class="expj-script-AB0010010-AB0010010form1-ITEM_SPOIL">
expj.AB0010010.AB0010010form1.ITEM_SPOIL = {};
expj.AB0010010.AB0010010form1.ITEM_SPOIL.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/ITEM_SPOIL.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.ITEM_SPOIL.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-ITEM_SPOIL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'ITEM_SPOIL', this);
  });
  expj.AB0010010.AB0010010form1.ITEM_SPOIL.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.ITEM_SPOIL.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/ITEM_SPOIL.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-ITEM_SPOIL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
  <%
                    String failRate = "0";
                    String spoil = aAB0010010Struct.getITEM_SPOIL();
                    if(spoil != null){
                      failRate = Calculate.divide(TypeConverter.convert(spoil),"100",4,Calculate.ROUND);
                    }
                    failRate = Calculate.add(failRate,"1");
                  %><input type="hidden" id="expj-AB0010010-AB0010010form1-FailRate" name="FailRate" class="" data-kind="" maxlength="2147483647" value="<%= failRate %>">
<script class="expj-script-AB0010010-AB0010010form1-FailRate">
expj.AB0010010.AB0010010form1.FailRate = {};
expj.AB0010010.AB0010010form1.FailRate.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/FailRate.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.FailRate.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-FailRate').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'FailRate', this);
  });
  expj.AB0010010.AB0010010form1.FailRate.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.FailRate.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/FailRate.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-FailRate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AB0010010-AB0010010form1-SAFETY_STOCK" name="SAFETY_STOCK" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getSAFETY_STOCK()) %>">
<script class="expj-script-AB0010010-AB0010010form1-SAFETY_STOCK">
expj.AB0010010.AB0010010form1.SAFETY_STOCK = {};
expj.AB0010010.AB0010010form1.SAFETY_STOCK.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/SAFETY_STOCK.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.SAFETY_STOCK.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-SAFETY_STOCK').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'SAFETY_STOCK', this);
  });
  expj.AB0010010.AB0010010form1.SAFETY_STOCK.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.SAFETY_STOCK.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/SAFETY_STOCK.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-SAFETY_STOCK');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AB0010010-AB0010010form1-STOCK_ON_HAND_QTY" name="STOCK_ON_HAND_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.getSTOCK_ON_HAND_QTY()) %>">
<script class="expj-script-AB0010010-AB0010010form1-STOCK_ON_HAND_QTY">
expj.AB0010010.AB0010010form1.STOCK_ON_HAND_QTY = {};
expj.AB0010010.AB0010010form1.STOCK_ON_HAND_QTY.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/STOCK_ON_HAND_QTY.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.STOCK_ON_HAND_QTY.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-STOCK_ON_HAND_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'STOCK_ON_HAND_QTY', this);
  });
  expj.AB0010010.AB0010010form1.STOCK_ON_HAND_QTY.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.STOCK_ON_HAND_QTY.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/STOCK_ON_HAND_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-STOCK_ON_HAND_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AB0010010-AB0010010form1-h_saveNewPlanOrder2" name="h_saveNewPlanOrder2" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.geth_saveNewPlanOrder2()) %>">
<script class="expj-script-AB0010010-AB0010010form1-h_saveNewPlanOrder2">
expj.AB0010010.AB0010010form1.h_saveNewPlanOrder2 = {};
expj.AB0010010.AB0010010form1.h_saveNewPlanOrder2.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/h_saveNewPlanOrder2.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.h_saveNewPlanOrder2.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-h_saveNewPlanOrder2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'h_saveNewPlanOrder2', this);
  });
  expj.AB0010010.AB0010010form1.h_saveNewPlanOrder2.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.h_saveNewPlanOrder2.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/h_saveNewPlanOrder2.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-h_saveNewPlanOrder2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AB0010010-AB0010010form1-h_saveMUL_ODR_QTY" name="h_saveMUL_ODR_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0010010Struct.geth_saveMUL_ODR_QTY()) %>">
<script class="expj-script-AB0010010-AB0010010form1-h_saveMUL_ODR_QTY">
expj.AB0010010.AB0010010form1.h_saveMUL_ODR_QTY = {};
expj.AB0010010.AB0010010form1.h_saveMUL_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AB0010010form1/h_saveMUL_ODR_QTY.onDecision');
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010form1.h_saveMUL_ODR_QTY.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010form1-h_saveMUL_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010form1', 'h_saveMUL_ODR_QTY', this);
  });
  expj.AB0010010.AB0010010form1.h_saveMUL_ODR_QTY.executePScriptOnLoad();
};

expj.AB0010010.AB0010010form1.h_saveMUL_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AB0010010form1/h_saveMUL_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010form1-h_saveMUL_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style=""></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AB0010010-AB0010010button1">
expj.AB0010010.AB0010010button1 = {};
expj.AB0010010.AB0010010button1.executeAllOnDecision = function () {
  console.log('execute AB0010010button1.onDecision');
};
expj.AB0010010.AB0010010button1.executeOnLoad = function () {
  expj.AB0010010.AB0010010button1.executePScriptOnLoad();
};

expj.AB0010010.AB0010010button1.executePScriptOnLoad = function () {
  console.log('execute AB0010010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AB0010010-AB0010010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AB0010010-AB0010010button1-Detail">
expj.AB0010010.AB0010010button1.Detail = {};
// script1="onClick;0;FSHOW;AB0010010float1"
expj.AB0010010.AB0010010button1.Detail.onClick0 = function () {
  console.log('Detail script1');
expj.common.pscript.showDetailWindow('AB0010010', 'AB0010010float1', '');
};
expj.AB0010010.AB0010010button1.Detail.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0010010.AB0010010button1.Detail['onClick' + i])) {
        expj.AB0010010.AB0010010button1.Detail['onClick' + i]();
      }
    }
  }
};
expj.AB0010010.AB0010010button1.Detail.executeAllOnDecision = function () {
};
expj.AB0010010.AB0010010button1.Detail.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010button1-Detail').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0010010', 'AB0010010button1', 'Detail', this, 'Button');
    }
  });
  expj.AB0010010.AB0010010button1.Detail.executePScriptOnLoad();
};

expj.AB0010010.AB0010010button1.Detail.executePScriptOnLoad = function () {
  console.log('execute AB0010010button1/Detail.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010button1-Detail');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AB0010010-AB0010010button1-Detail" name="Detail" class="AB0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDetail",rb)%></button><!-- 詳細ボタン --></div><!--/td-->
<script class="expj-script-AB0010010-AB0010010button1-select">
expj.AB0010010.AB0010010button1.select = {};
// script1="onClick;0;CHK;_AB0010010form1/w_date_from[gt]_AB0010010form1/w_date_to@!AB00005,*0"
expj.AB0010010.AB0010010button1.select.onClick0 = function () {
  console.log('select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010button1', '_AB0010010form1/w_date_from')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010button1', '_AB0010010form1/w_date_to')))) {
expj.common.pscript.viewErrorMessage('AB0010010', 'AB0010010button1', 'AB00005');
} else {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AB0010010form1/*@AB0010010Servlet"
expj.AB0010010.AB0010010button1.select.child0 = function () {
  console.log('select script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AB0010010', 'AB0010010button1', '_AB0010010form1/*', 'AB0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AB0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AB0010010', response);
expj.common.updateBusinessScreenTab('AB0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AB0010010.AB0010010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0010010.AB0010010button1.select['onClick' + i])) {
        expj.AB0010010.AB0010010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AB0010010.AB0010010button1.select.executeAllOnDecision = function () {
};
expj.AB0010010.AB0010010button1.select.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0010010', 'AB0010010button1', 'select', this, 'Button');
    }
  });
  expj.AB0010010.AB0010010button1.select.executePScriptOnLoad();
};

expj.AB0010010.AB0010010button1.select.executePScriptOnLoad = function () {
  console.log('execute AB0010010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AB0010010-AB0010010button1-select" name="select" class="AB0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame04" style=""></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AB0010010-AB0010010view1">
expj.AB0010010.AB0010010view1 = {};
// script1="onDecision;0;DGCOLSET;_ValidStock=SUM(_Difference)"
expj.AB0010010.AB0010010view1.onDecision0 = function () {
  console.log('AB0010010view1 script1');
expj.common.pscript.setDGCOLSET('AB0010010', 'AB0010010view1', '_ValidStock', expj.common.pscript.func.SUM('AB0010010', 'AB0010010view1', '_Difference'));
};
expj.AB0010010.AB0010010view1.executeAllOnClick = function () {
};
expj.AB0010010.AB0010010view1.executeAllOnDecision = function () {
  console.log('execute AB0010010view1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0010010.AB0010010view1['onDecision' + i])) {
        expj.AB0010010.AB0010010view1['onDecision' + i]();
      }
    }
  }
};
expj.AB0010010.AB0010010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AB0010010view1", "expj.AB0010010.AB0010010view1.executeAllOnClick");
%>
  expj.AB0010010.AB0010010view1.executePScriptOnLoad();
};

expj.AB0010010.AB0010010view1.executePScriptOnLoad = function () {
  console.log('execute AB0010010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AB0010010-AB0010010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AB0010010view1_Id = "AB0010010view1";
 String AB0010010view1_select = "single";
 String AB0010010view1_sortable = "true";
 String AB0010010view1_resize = "true";
 String AB0010010view1_scroll = "true";
 StringBuffer AB0010010view1_HB = new StringBuffer();
 StringBuffer AB0010010view1_DB = new StringBuffer();
%>
<%
 AB0010010view1_select = "single";
 AB0010010view1_sortable = "false";
 AB0010010view1_resize = "true";
 AB0010010view1_scroll = "true";
%>
<%
 AB0010010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AB0010010view1_sortable).append("}").append(",");
%>
     <script class="expj-script-AB0010010-AB0010010view1-NewPlanOrder">
expj.AB0010010.AB0010010view1.NewPlanOrder = {};
// script1="onDecision;0;CHK;_AB0010010form1/UNIT_QTY_TYP[eq]1@*0,*4"
expj.AB0010010.AB0010010view1.NewPlanOrder.onDecision0 = function () {
  console.log('NewPlanOrder script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010form1/UNIT_QTY_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script2="child;0;CHK;[({_AB0010010view1/NewPlanOrder}*10000)%10000][gt]0@*1,*4"
expj.AB0010010.AB0010010view1.NewPlanOrder.child0 = function () {
  console.log('NewPlanOrder script2');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('(' + expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010view1/NewPlanOrder') + '*10000)%10000'), '[gt]', expj.common.pscript.convertNumber('0'))) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script3="child;1;CFMPUT;_AB0010010view1/NewPlanOrder=YES:3,2@AB90001"
expj.AB0010010.AB0010010view1.NewPlanOrder.child1 = function () {
  console.log('NewPlanOrder script3');
var yesFunc = function () {
expj.AB0010010.AB0010010view1.NewPlanOrder.child3();
};
var noFunc = function () {
expj.AB0010010.AB0010010view1.NewPlanOrder.child2();
};
expj.common.pscript.executeConfirmPut('AB0010010', 'AB0010010view1', '_AB0010010view1/NewPlanOrder', 'AB90001', yesFunc, noFunc);
};
// script4="child;2;SET;_AB0010010view1/NewPlanOrder=_AB0010010view1/h_saveNewPlanOrder"
expj.AB0010010.AB0010010view1.NewPlanOrder.child2 = function () {
  console.log('NewPlanOrder script4');
expj.common.pscript.setReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010view1/NewPlanOrder', expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010view1/h_saveNewPlanOrder'));
};
// script5="child;3;SET;_AB0010010view1/NewPlanOrder=[({_AB0010010view1/NewPlanOrder}-((({_AB0010010view1/NewPlanOrder}*10000)%10000)/10000))+1]@*4"
expj.AB0010010.AB0010010view1.NewPlanOrder.child3 = function () {
  console.log('NewPlanOrder script5');
expj.common.pscript.setReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010view1/NewPlanOrder', expj.common.pscript.eval('(' + expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010view1/NewPlanOrder') + '-(((' + expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010view1/NewPlanOrder') + '*10000)%10000)/10000))+1'));
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script6="child;4;CHK;_AB0010010form1/MRP_ODR_TYP[eq]<%= AB0010Const.C_ODR_LOT %>@*5,*8"
expj.AB0010010.AB0010010view1.NewPlanOrder.child4 = function () {
  console.log('NewPlanOrder script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010form1/MRP_ODR_TYP'), '[eq]', '<%= AB0010Const.C_ODR_LOT %>')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script7="child;5;SET;_AB0010010form1/h_saveNewPlanOrder2=[{_AB0010010view1/NewPlanOrder}*10000]@*10"
expj.AB0010010.AB0010010view1.NewPlanOrder.child5 = function () {
  console.log('NewPlanOrder script7');
expj.common.pscript.setReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010form1/h_saveNewPlanOrder2', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010view1/NewPlanOrder') + '*10000'));
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child10)){this.child10();}}
};
// script8="child;6;CFMPUT;_AB0010010view1/NewPlanOrder=YES:8,7@AB90002"
expj.AB0010010.AB0010010view1.NewPlanOrder.child6 = function () {
  console.log('NewPlanOrder script8');
var yesFunc = function () {
expj.AB0010010.AB0010010view1.NewPlanOrder.child8();
};
var noFunc = function () {
expj.AB0010010.AB0010010view1.NewPlanOrder.child7();
};
expj.common.pscript.executeConfirmPut('AB0010010', 'AB0010010view1', '_AB0010010view1/NewPlanOrder', 'AB90002', yesFunc, noFunc);
};
// script9="child;7;SET;_AB0010010view1/NewPlanOrder=_AB0010010view1/h_saveNewPlanOrder"
expj.AB0010010.AB0010010view1.NewPlanOrder.child7 = function () {
  console.log('NewPlanOrder script9');
expj.common.pscript.setReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010view1/NewPlanOrder', expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010view1/h_saveNewPlanOrder'));
};
// script10="child;8;SET;_AB0010010view1/h_saveNewPlanOrder=_AB0010010view1/NewPlanOrder@*9"
expj.AB0010010.AB0010010view1.NewPlanOrder.child8 = function () {
  console.log('NewPlanOrder script10');
expj.common.pscript.setReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010view1/h_saveNewPlanOrder', expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010view1/NewPlanOrder'));
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script11="child;9;SET;_AB0010010view1/Difference=[({_AB0010010view1/FixOrder}/{_AB0010010form1/FailRate}+{_AB0010010view1/NewPlanOrder}/{_AB0010010form1/FailRate})-({_AB0010010view1/FixDemand}+{_AB0010010view1/PlanDemand})]"
expj.AB0010010.AB0010010view1.NewPlanOrder.child9 = function () {
  console.log('NewPlanOrder script11');
expj.common.pscript.setReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010view1/Difference', expj.common.pscript.eval('(' + expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010view1/FixOrder') + '/' + expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010form1/FailRate') + '+' + expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010view1/NewPlanOrder') + '/' + expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010form1/FailRate') + ')-(' + expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010view1/FixDemand') + '+' + expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010view1/PlanDemand') + ')'));
};
// script12="child;10;SET;_AB0010010form1/h_saveMUL_ODR_QTY=[{_AB0010010form1/MUL_ODR_QTY}*10000]@*11"
expj.AB0010010.AB0010010view1.NewPlanOrder.child10 = function () {
  console.log('NewPlanOrder script12');
expj.common.pscript.setReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010form1/h_saveMUL_ODR_QTY', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010form1/MUL_ODR_QTY') + '*10000'));
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child11)){this.child11();}}
};
// script13="child;11;CHK;[{_AB0010010form1/h_saveNewPlanOrder2}%{_AB0010010form1/h_saveMUL_ODR_QTY}][gt]0@*12,*8"
expj.AB0010010.AB0010010view1.NewPlanOrder.child11 = function () {
  console.log('NewPlanOrder script13');
if (expj.common.pscript.evaluate(expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010form1/h_saveNewPlanOrder2') + '%' + expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010form1/h_saveMUL_ODR_QTY')), '[gt]', expj.common.pscript.convertNumber('0'))) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script14="child;12;CHK;_AB0010010view1/NewPlanOrder[eq]99999999999999.0@*8,*6"
expj.AB0010010.AB0010010view1.NewPlanOrder.child12 = function () {
  console.log('NewPlanOrder script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0010010', 'AB0010010view1', '_AB0010010view1/NewPlanOrder'), '[eq]', '99999999999999.0')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
expj.AB0010010.AB0010010view1.NewPlanOrder.executeAllOnClick = function () {
};
expj.AB0010010.AB0010010view1.NewPlanOrder.executeAllOnDecision = function () {
  console.log('execute AB0010010view1/NewPlanOrder.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0010010.AB0010010view1.NewPlanOrder['onDecision' + i])) {
        expj.AB0010010.AB0010010view1.NewPlanOrder['onDecision' + i]();
      }
    }
  }
  expj.AB0010010.AB0010010view1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010view1.NewPlanOrder.executeOnLoad = function () {
  $('.expj-AB0010010-AB0010010view1-NewPlanOrder').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010view1', 'NewPlanOrder', this);
  });
  expj.AB0010010.AB0010010view1.NewPlanOrder.executePScriptOnLoad();
};

expj.AB0010010.AB0010010view1.NewPlanOrder.executePScriptOnLoad = function () {
  console.log('execute AB0010010view1/NewPlanOrder.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AB0010010-AB0010010view1-h_saveNewPlanOrder">
expj.AB0010010.AB0010010view1.h_saveNewPlanOrder = {};
expj.AB0010010.AB0010010view1.h_saveNewPlanOrder.executeAllOnClick = function () {
};
expj.AB0010010.AB0010010view1.h_saveNewPlanOrder.executeAllOnDecision = function () {
  console.log('execute AB0010010view1/h_saveNewPlanOrder.onDecision');
  expj.AB0010010.AB0010010view1.executeAllOnDecision();
  expj.AB0010010.executeAllOnDecision();
};
expj.AB0010010.AB0010010view1.h_saveNewPlanOrder.executeOnLoad = function () {
  $('.expj-AB0010010-AB0010010view1-h_saveNewPlanOrder').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0010010', 'AB0010010view1', 'h_saveNewPlanOrder', this);
  });
  expj.AB0010010.AB0010010view1.h_saveNewPlanOrder.executePScriptOnLoad();
};

expj.AB0010010.AB0010010view1.h_saveNewPlanOrder.executePScriptOnLoad = function () {
  console.log('execute AB0010010view1/h_saveNewPlanOrder.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 
<%
AB0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0057",rb))).append("', 'name':'PlanDate', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AB0010010view1_sortable).append("}").append(",");
AB0010010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0405",rb))).append("', 'name':'FixDemand', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AB0010010view1_sortable).append("}").append(",");
AB0010010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0403",rb))).append("', 'name':'PlanDemand', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AB0010010view1_sortable).append("}").append(",");
AB0010010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0404",rb))).append("', 'name':'FixOrder', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AB0010010view1_sortable).append("}").append(",");
AB0010010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0401",rb))).append("', 'name':'OldPlanOrder', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AB0010010view1_sortable).append("}").append(",");
AB0010010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0402",rb))).append("', 'name':'NewPlanOrder', 'class':'expj-tooltip expj-view-cell-textinput expj-align-right', 'sortable':").append(AB0010010view1_sortable).append("}").append(",");
AB0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_saveNewPlanOrder', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AB0010010view1_sortable).append("}").append(",");
AB0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'Difference', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AB0010010view1_sortable).append("}").append(",");
AB0010010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0432",rb))).append("', 'name':'ValidStock', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AB0010010view1_sortable).append("}").append(",");
%>
<%
 int aAB0010010StructLength = aAB0010010Control.getListsize();
 final AB0010010Struct structBackup = aAB0010010Struct;
 aAB0010010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAB0010010StructLength; ++loopCount) {
  if((aAB0010010Struct = (AB0010010Struct) aAB0010010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAB0010010Struct", aAB0010010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AB0010010view1_DB.append("[");
 AB0010010view1_DB.append(loopCount);
%> <%
    String canEdit = "true";
    String selColor = "000000";

    if(aAB0010010Struct.isHoliday()){
        selColor = "FF0033";
    }
    String canSelect = "true";
	if(aAB0010010Struct.isMany()){
        canEdit = "false";
    }
    if(loopCount == 0 || aAB0010010Struct.isHoliday()){
        canSelect = "false";
        canEdit = "false";
    }
    String dateColKind = "OBT_DATE;TYPE_YMD";
    String numberColKind = "OBT_NUMBER;14.1;FLOOR;4";
	String numberDifKind = "OBT_NUMBER;14.1;FLOOR;4";
	if ("1".equals(aAB0010010Control.getScreenUnitQtyTyp())) {
	    numberDifKind = "OBT_NUMBER;14.1;FLOOR;0";
	}
    String numberInputColKind = "OBT_NUMBER_Z;14.1;FLOOR;4";
    if(loopCount == 0){
        dateColKind = "";
        numberColKind = "";
        numberInputColKind = "";
    }
%> <%
 AB0010010view1_DB.append(",").append("'<span id=\"expj-AB0010010-AB0010010view1-PlanDate-").append(loopCount).append("\" class=\"expj-label expj-AB0010010-AB0010010view1-PlanDate\" data-name=\"PlanDate\" data-view=\"true\" data-kind=\"").append( dateColKind ).append("\" data-rowselectable=\"").append( canSelect ).append("\" style=\"color:#").append(selColor).append(";\">").append(TypeConverter.sanitizer(aAB0010010Struct.getPlanDate())).append("</span>'");
 AB0010010view1_DB.append(",").append("'<span id=\"expj-AB0010010-AB0010010view1-FixDemand-").append(loopCount).append("\" class=\"expj-label expj-AB0010010-AB0010010view1-FixDemand\" data-name=\"FixDemand\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aAB0010010Struct.getFixDemand())).append("</span>'");
 AB0010010view1_DB.append(",").append("'<span id=\"expj-AB0010010-AB0010010view1-PlanDemand-").append(loopCount).append("\" class=\"expj-label expj-AB0010010-AB0010010view1-PlanDemand\" data-name=\"PlanDemand\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aAB0010010Struct.getPlanDemand())).append("</span>'");
 AB0010010view1_DB.append(",").append("'<span id=\"expj-AB0010010-AB0010010view1-FixOrder-").append(loopCount).append("\" class=\"expj-label expj-AB0010010-AB0010010view1-FixOrder\" data-name=\"FixOrder\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aAB0010010Struct.getFixOrder())).append("</span>'");
 AB0010010view1_DB.append(",").append("'<span id=\"expj-AB0010010-AB0010010view1-OldPlanOrder-").append(loopCount).append("\" class=\"expj-label expj-AB0010010-AB0010010view1-OldPlanOrder\" data-name=\"OldPlanOrder\" data-view=\"true\" data-kind=\"").append( numberColKind ).append("\">").append(TypeConverter.sanitizer(aAB0010010Struct.getOldPlanOrder())).append("</span>'");
 AB0010010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AB0010010-AB0010010view1-NewPlanOrder-").append(loopCount).append("\" class=\"expj-AB0010010-AB0010010view1-NewPlanOrder AB0010010-focus-move\" data-name=\"NewPlanOrder\" data-view=\"true\" maxlength=\"2147483647\" data-kind=\"").append( numberInputColKind ).append("\"").append("false".equals( canEdit ) ? " disabled=\"disabled\"" : "").append(" value=\"").append(TypeConverter.sanitizer(aAB0010010Struct.getNewPlanOrder())).append("\">'");
 AB0010010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AB0010010-AB0010010view1-h_saveNewPlanOrder-").append(loopCount).append("\" class=\"expj-AB0010010-AB0010010view1-h_saveNewPlanOrder AB0010010-focus-move\" data-name=\"h_saveNewPlanOrder\" data-view=\"true\" maxlength=\"2147483647\" data-kind=\"").append( numberColKind ).append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAB0010010Struct.geth_saveNewPlanOrder())).append("\">'");
 AB0010010view1_DB.append(",").append("'<span id=\"expj-AB0010010-AB0010010view1-Difference-").append(loopCount).append("\" class=\"expj-label expj-AB0010010-AB0010010view1-Difference\" data-name=\"Difference\" data-view=\"true\" data-kind=\"").append( numberDifKind ).append("\">").append(TypeConverter.sanitizer(aAB0010010Struct.getDifference())).append("</span>'");
 AB0010010view1_DB.append(",").append("'<span id=\"expj-AB0010010-AB0010010view1-ValidStock-").append(loopCount).append("\" class=\"expj-label expj-AB0010010-AB0010010view1-ValidStock\" data-name=\"ValidStock\" data-view=\"true\" data-kind=\"").append( numberDifKind ).append("\">").append(TypeConverter.sanitizer(aAB0010010Struct.getValidStock())).append("</span>'");
 AB0010010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAB0010010StructLength) {
   AB0010010view1_DB.append(",");
  }
 }
 aAB0010010Struct = structBackup;
 viewIdList.add(AB0010010view1_Id);
 viewSelectList.add(AB0010010view1_select);
 viewResizeList.add(AB0010010view1_resize);
 viewScrollList.add(AB0010010view1_scroll);
 viewHeaderDataList.add(AB0010010view1_HB);
 viewBodyDataList.add(AB0010010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 button-area" style="width:664px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10" style="width:calc(100% - 748px);"><script class="expj-script-AB0010010-AB0010010button2">
expj.AB0010010.AB0010010button2 = {};
expj.AB0010010.AB0010010button2.executeAllOnDecision = function () {
  console.log('execute AB0010010button2.onDecision');
};
expj.AB0010010.AB0010010button2.executeOnLoad = function () {
  expj.AB0010010.AB0010010button2.executePScriptOnLoad();
};

expj.AB0010010.AB0010010button2.executePScriptOnLoad = function () {
  console.log('execute AB0010010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AB0010010-AB0010010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AB0010010-AB0010010button2-update">
expj.AB0010010.AB0010010button2.update = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AB0010010form1/*,_AB0010010view1/*@AB0010010Servlet,,$ZZ07003"
expj.AB0010010.AB0010010button2.update.onClick0 = function () {
  console.log('update script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AB0010010', 'AB0010010button2', '_AB0010010form1/*,_AB0010010view1/*', 'AB0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AB0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AB0010010', response);
expj.common.updateBusinessScreenTab('AB0010010', contents);
};
expj.common.pscript.callConfirm('AB0010010', 'AB0010010button2', 'ZZ07003', okEvent);
};
expj.AB0010010.AB0010010button2.update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0010010.AB0010010button2.update['onClick' + i])) {
        expj.AB0010010.AB0010010button2.update['onClick' + i]();
      }
    }
  }
};
expj.AB0010010.AB0010010button2.update.executeAllOnDecision = function () {
};
expj.AB0010010.AB0010010button2.update.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010button2-update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0010010', 'AB0010010button2', 'update', this, 'Button');
    }
  });
  expj.AB0010010.AB0010010button2.update.executePScriptOnLoad();
};

expj.AB0010010.AB0010010button2.update.executePScriptOnLoad = function () {
  console.log('execute AB0010010button2/update.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010button2-update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AB0010010-AB0010010button2-update" name="update" class="AB0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-AB0010010-AB0010010button2-time">
expj.AB0010010.AB0010010button2.time = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AB0010010form1/*,_AB0010010view1/+@AB0010010Servlet"
expj.AB0010010.AB0010010button2.time.onClick0 = function () {
  console.log('time script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AB0010010', 'AB0010010button2', '_AB0010010form1/*,_AB0010010view1/+', 'AB0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AB0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AB0010010', response);
expj.common.changeBusinessScreenTab('AB0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AB0010010.AB0010010button2.time.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0010010.AB0010010button2.time['onClick' + i])) {
        expj.AB0010010.AB0010010button2.time['onClick' + i]();
      }
    }
  }
};
expj.AB0010010.AB0010010button2.time.executeAllOnDecision = function () {
};
expj.AB0010010.AB0010010button2.time.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010button2-time').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0010010', 'AB0010010button2', 'time', this, 'Button');
    }
  });
  expj.AB0010010.AB0010010button2.time.executePScriptOnLoad();
};

expj.AB0010010.AB0010010button2.time.executePScriptOnLoad = function () {
  console.log('execute AB0010010button2/time.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010button2-time');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AB0010010-AB0010010button2-time" name="time" class="AB0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnTimeSeparate",rb)%></button><!-- 時刻別ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11" style="width:12px;"></div><!--/td-->
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
<span class="version">AB0010010 Revision: 1.18  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:420px;">
<script class="expj-script-AB0010010-AB0010010button0">
expj.AB0010010.AB0010010button0 = {};
expj.AB0010010.AB0010010button0.executeAllOnDecision = function () {
  console.log('execute AB0010010button0.onDecision');
};
expj.AB0010010.AB0010010button0.executeOnLoad = function () {
  expj.AB0010010.AB0010010button0.executePScriptOnLoad();
};

expj.AB0010010.AB0010010button0.executePScriptOnLoad = function () {
  console.log('execute AB0010010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AB0010010-AB0010010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AB0010010-AB0010010button0-SrcmovToTimeInOut">
expj.AB0010010.AB0010010button0.SrcmovToTimeInOut = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AB0010010form1/w_PLANT_CD,_AB0010010form1/w_ITEM_CD@AG0050010Servlet,<%=contextNo%>,<%=su2.getScreenName()%>,<%=su2.getScreenID()%>"
expj.AB0010010.AB0010010button0.SrcmovToTimeInOut.onClick0 = function () {
  console.log('SrcmovToTimeInOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AB0010010', 'AB0010010button0', '_AB0010010form1/w_PLANT_CD,_AB0010010form1/w_ITEM_CD', 'AG0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su2.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AG0050010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AG0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su2.getScreenName()%>', contents, 'AB0010010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AB0010010.AB0010010button0.SrcmovToTimeInOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0010010.AB0010010button0.SrcmovToTimeInOut['onClick' + i])) {
        expj.AB0010010.AB0010010button0.SrcmovToTimeInOut['onClick' + i]();
      }
    }
  }
};
expj.AB0010010.AB0010010button0.SrcmovToTimeInOut.executeAllOnDecision = function () {
};
expj.AB0010010.AB0010010button0.SrcmovToTimeInOut.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010button0-SrcmovToTimeInOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0010010', 'AB0010010button0', 'SrcmovToTimeInOut', this, 'Button');
    }
  });
  expj.AB0010010.AB0010010button0.SrcmovToTimeInOut.executePScriptOnLoad();
};

expj.AB0010010.AB0010010button0.SrcmovToTimeInOut.executePScriptOnLoad = function () {
  console.log('execute AB0010010button0/SrcmovToTimeInOut.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010button0-SrcmovToTimeInOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AB0010010-AB0010010button0-SrcmovToTimeInOut" name="SrcmovToTimeInOut" class="AB0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnTimeInOut",rb)%></button><!-- 時系列入出庫予定一覧ボタン --></div><!--/td-->
<script class="expj-script-AB0010010-AB0010010button0-OdrProgLst">
expj.AB0010010.AB0010010button0.OdrProgLst = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AB0010010form1/*@AJ0010010Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.AB0010010.AB0010010button0.OdrProgLst.onClick0 = function () {
  console.log('OdrProgLst script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AB0010010', 'AB0010010button0', '_AB0010010form1/*', 'AJ0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AJ0010010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AJ0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'AB0010010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AB0010010.AB0010010button0.OdrProgLst.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0010010.AB0010010button0.OdrProgLst['onClick' + i])) {
        expj.AB0010010.AB0010010button0.OdrProgLst['onClick' + i]();
      }
    }
  }
};
expj.AB0010010.AB0010010button0.OdrProgLst.executeAllOnDecision = function () {
};
expj.AB0010010.AB0010010button0.OdrProgLst.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010button0-OdrProgLst').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0010010', 'AB0010010button0', 'OdrProgLst', this, 'Button');
    }
  });
  expj.AB0010010.AB0010010button0.OdrProgLst.executePScriptOnLoad();
};

expj.AB0010010.AB0010010button0.OdrProgLst.executePScriptOnLoad = function () {
  console.log('execute AB0010010button0/OdrProgLst.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010button0-OdrProgLst');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AB0010010-AB0010010button0-OdrProgLst" name="OdrProgLst" class="AB0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnOdrProgress",rb)%></button><!-- オーダ別進捗ボタン --></div><!--/td-->
<script class="expj-script-AB0010010-AB0010010button0-clear">
expj.AB0010010.AB0010010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AB0010010Servlet,,$ZZ07008"
expj.AB0010010.AB0010010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AB0010010', 'AB0010010button0', '', 'AB0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AB0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AB0010010', response);
expj.common.updateBusinessScreenTab('AB0010010', contents);
};
expj.common.pscript.callConfirm('AB0010010', 'AB0010010button0', 'ZZ07008', okEvent);
};
expj.AB0010010.AB0010010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0010010.AB0010010button0.clear['onClick' + i])) {
        expj.AB0010010.AB0010010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AB0010010.AB0010010button0.clear.executeAllOnDecision = function () {
};
expj.AB0010010.AB0010010button0.clear.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0010010', 'AB0010010button0', 'clear', this, 'Button');
    }
  });
  expj.AB0010010.AB0010010button0.clear.executePScriptOnLoad();
};

expj.AB0010010.AB0010010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AB0010010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AB0010010-AB0010010button0-clear" name="clear" class="AB0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AB0010010-AB0010010button0-close">
expj.AB0010010.AB0010010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AB0010010.AB0010010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AB0010010');
};
expj.AB0010010.AB0010010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0010010.AB0010010button0.close['onClick' + i])) {
        expj.AB0010010.AB0010010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AB0010010.AB0010010button0.close.executeAllOnDecision = function () {
};
expj.AB0010010.AB0010010button0.close.executeOnLoad = function () {
  $('#expj-AB0010010-AB0010010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0010010', 'AB0010010button0', 'close', this, 'Button');
    }
  });
  expj.AB0010010.AB0010010button0.close.executePScriptOnLoad();
};

expj.AB0010010.AB0010010button0.close.executePScriptOnLoad = function () {
  console.log('execute AB0010010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AB0010010-AB0010010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AB0010010-AB0010010button0-close" name="close" class="AB0010010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AB0010010 (END)-->
<script class="expj-script-AB0010010-AB0010010detail1">
expj.AB0010010.AB0010010detail1 = {};
expj.AB0010010.AB0010010detail1.executeAllOnDecision = function () {
  console.log('execute AB0010010detail1.onDecision');
};
expj.AB0010010.AB0010010detail1.executeOnLoad = function () {
  expj.AB0010010.AB0010010detail1.executePScriptOnLoad();
};

expj.AB0010010.AB0010010detail1.executePScriptOnLoad = function () {
  console.log('execute AB0010010detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAB0010010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AB0010010-AB0010010detail1" class="expj-datagird-detail" data-float="AB0010010float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AB0010010detail1";
 detailFloat = "AB0010010float1";
 detailWidth = 358;
 detailHeight = 200 + 47;
 String AB0010010detail1_Id = "AB0010010detail1";
 String AB0010010detail1_select = "single";
 String AB0010010detail1_sortable = "true";
 String AB0010010detail1_resize = "true";
 String AB0010010detail1_scroll = "true";
 StringBuffer AB0010010detail1_HB = new StringBuffer();
 StringBuffer AB0010010detail1_DB = new StringBuffer();
%>
<%
 AB0010010detail1_sortable = "false";
 AB0010010detail1_select = "none";
%>
<% AB0010010detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AB0010010detail1_sortable).append("}").append(","); %>
<%  AB0010010detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AB0010010detail1_sortable).append("}").append(",");
AB0010010detail1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AB0010010detail1_sortable).append("}").append(",");
AB0010010detail1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AB0010010detail1_sortable).append("}").append(",");
 %>
  <% AB0010010detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.DRAW_CD",rb)).append("','").append("<span id=\"expj-AB0010010-AB0010010detail1-DRAW_CD\" class=\"expj-label\" data-name=\"DRAW_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAB0010010Struct.getDRAW_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AB0010010detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.ITEM_SPEC",rb)).append("','").append("<span id=\"expj-AB0010010-AB0010010detail1-SPEC\" class=\"expj-label\" data-name=\"SPEC\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAB0010010Struct.getSPEC())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AB0010010detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)).append("','").append("<span id=\"expj-AB0010010-AB0010010detail1-MRP_ODR_NAME\" class=\"expj-label\" data-name=\"MRP_ODR_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAB0010010Struct.getMRP_ODR_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AB0010010detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)).append("','").append("<span id=\"expj-AB0010010-AB0010010detail1-OUTSIDE_NAME\" class=\"expj-label\" data-name=\"OUTSIDE_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAB0010010Struct.getOUTSIDE_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AB0010010detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.ITEM_SPOIL",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AB0010010-AB0010010detail1-ITEM_SPOIL\" class=\"expj-label\" data-name=\"ITEM_SPOIL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;5.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAB0010010Struct.getITEM_SPOIL())).append("</span>").append("</div>','").append(CoreTools.getRBString("Expj.Cmt0051",rb)).append("']").append(",");%>
 <% AB0010010detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.UNIT_QTY_TYP",rb)).append("','").append("<span id=\"expj-AB0010010-AB0010010detail1-UNIT_QTY_NAME\" class=\"expj-label\" data-name=\"UNIT_QTY_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAB0010010Struct.getUNIT_QTY_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AB0010010detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.LOT_SIZING_TYP",rb)).append("','").append("<span id=\"expj-AB0010010-AB0010010detail1-LOT_SIZING_NAME\" class=\"expj-label\" data-name=\"LOT_SIZING_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAB0010010Struct.getLOT_SIZING_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AB0010010detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.MAX_PERIOD",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AB0010010-AB0010010detail1-MAX_PERIOD\" class=\"expj-label\" data-name=\"MAX_PERIOD\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAB0010010Struct.getMAX_PERIOD())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AB0010010detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.MUL_ODR_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AB0010010-AB0010010detail1-MUL_ODR_QTY\" class=\"expj-label\" data-name=\"MUL_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAB0010010Struct.getMUL_ODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AB0010010-AB0010010detail1-STOCK_UNIT\" class=\"expj-label\" data-name=\"STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAB0010010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AB0010010detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.MAX_ODR_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AB0010010-AB0010010detail1-MAX_ODR_QTY\" class=\"expj-label\" data-name=\"MAX_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAB0010010Struct.getMAX_ODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AB0010010-AB0010010detail1-STOCK_UNIT_1\" class=\"expj-label\" data-name=\"STOCK_UNIT_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAB0010010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AB0010010detail1_DB.append("['11','").append(CoreTools.getRBString("Expj.MIN_ODR_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AB0010010-AB0010010detail1-MIN_ODR_QTY\" class=\"expj-label\" data-name=\"MIN_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAB0010010Struct.getMIN_ODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AB0010010-AB0010010detail1-STOCK_UNIT_2\" class=\"expj-label\" data-name=\"STOCK_UNIT_2\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAB0010010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AB0010010detail1_DB.append("['12','").append(CoreTools.getRBString("Expj.SAFETY_STOCK",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AB0010010-AB0010010detail1-SAFETY_STOCK\" class=\"expj-label\" data-name=\"SAFETY_STOCK\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAB0010010Struct.getSAFETY_STOCK())).append("</span>").append("</div>','").append("<span id=\"expj-AB0010010-AB0010010detail1-STOCK_UNIT_3\" class=\"expj-label\" data-name=\"STOCK_UNIT_3\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAB0010010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AB0010010detail1_DB.append("['13','").append(CoreTools.getRBString("Expj.STOCK_ON_HAND_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AB0010010-AB0010010detail1-STOCK_ON_HAND_QTY\" class=\"expj-label\" data-name=\"STOCK_ON_HAND_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAB0010010Struct.getSTOCK_ON_HAND_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AB0010010-AB0010010detail1-STOCK_UNIT_4\" class=\"expj-label\" data-name=\"STOCK_UNIT_4\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAB0010010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
<%
 detailViewId = AB0010010detail1_Id;
 detailViewSelect = AB0010010detail1_select;
 detailViewResize = AB0010010detail1_resize;
 detailViewScroll = AB0010010detail1_scroll;
 detailViewHeaderData = AB0010010detail1_HB;
 detailViewBodyData = AB0010010detail1_DB;
%>
<%
}
%>
<%
MessageStruct msgStruct = aAB0010010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AB0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AB0010010)) {
  expj.common.treeInstanceMap.AB0010010 = {};
}
expj.common.treeInstanceMap.AB0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AB0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AB0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AB0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AB0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AB0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AB0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AB0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AB0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AB0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AB0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AB0010010)) {
  expj.common.detailDialogMap.AB0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AB0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AB0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AB0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.AB0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AB0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AB0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AB0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AB0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AB0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AB0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AB0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AB0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AB0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AB0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AB0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AB0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AB0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AB0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AB0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AB0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AB0010010)) {
  expj.common.viewInstanceMap.AB0010010 = {};
}
expj.common.viewInstanceMap.AB0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.AB0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AB0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AB0010010.<%=viewId %>.init = function () {
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
    expj.AB0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AB0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AB0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AB0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AB0010010_init">
/**
 * AB0010010用のロード完了時初期化関数
 */
expj.AB0010010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AB0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AB0010010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AB0010010');
  expj.common.calendarInstanceMap.AB0010010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AB0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AB0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.AB0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AB0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AB0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AB0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AB0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AB0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AB0010010-<%=detailId %>');
<%
 }
%>
  try{expj.AB0010010.AB0010010form1.w_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.PeekerWPlantCd.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.MUL_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.MRP_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.UNIT_QTY_TYP.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.UNIT_QTY_NAME.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.OUTSIDE_TYP.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.OUTSIDE_NAME.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.w_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.PeekerWItemCd.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.SPEC.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.LOT_SIZING_TYP.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.LOT_SIZING_NAME.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.MAX_PERIOD.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.DRAW_CD.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.MRP_ODR_NAME.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.MAX_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.MIN_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.w_date_from.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.CalendarFromDate.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.w_date_to.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.CalendarToDate.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.ITEM_SPOIL.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.FailRate.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.SAFETY_STOCK.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.STOCK_ON_HAND_QTY.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.h_saveNewPlanOrder2.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.h_saveMUL_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010button1.Detail.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010button1.select.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010view1.NewPlanOrder.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010view1.h_saveNewPlanOrder.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010button2.update.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010button2.time.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010button0.SrcmovToTimeInOut.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010button0.OdrProgLst.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010button0.close.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010form1.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010button1.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010view1.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010button2.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010button0.executeOnLoad();}catch(e){};
  try{expj.AB0010010.AB0010010detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AB0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AB0010010', 'AB0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AB0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AB0010010-focus-move');
  // 初期フォーカス当てる処理
  $('.AB0010010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AB0010010', '<%=request.getContextPath() %>');
};

/**
 * AB0010010の全体onDecision処理
 */
expj.AB0010010.executeAllOnDecision = function () {
  expj.AB0010010.AB0010010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AB0010010_console">
expj.AB0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>