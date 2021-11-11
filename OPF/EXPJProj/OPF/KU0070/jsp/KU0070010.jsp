<%-- ***
This file is generated
 GeneratedDate  : Fri Feb 17 09:27:23 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KU0070\KU0070010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KU0070.*" %>
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
<jsp:useBean id="aKU0070010Control" class="com.nec.jp.orteus.metamorBase.KU0070.KU0070010Control" scope="request"/>
<jsp:useBean id="aKU0070010Struct" class="com.nec.jp.orteus.metamorBase.KU0070.KU0070010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

出荷指示一覧
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0070/jsp/KU0070010.jsp,v $
$Author: geng-jia $	
$Revision: 1.2 $　$Date: 2017/02/22 02:07:29 $
********************************************************* --%>
<html>
<head>
<title>出荷インボイス出力</title>
<%@include file="common/expj_v5.jsp" %>
<%
ScreenMoveUtil su = new ScreenMoveUtil("KU0080010Servlet", so);
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
<script class="expj-script-KU0070010_init">
  // KU0070010名前空間
  expj.KU0070010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-KU0070010" data-screen="KU0070010" data-newdata="<%=aKU0070010Control.isNewData() %>">
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
              <!-- ここに上段検索条件用のDataGridを配置する。↓ -->
              <script class="expj-script-KU0070010-KU0070010form1">
expj.KU0070010.KU0070010form1 = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.KU0070010.KU0070010form1.onLoad0 = function () {
  console.log('KU0070010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHK;?KU0070010form1/*[eq]NORMAL@*0,*2"
expj.KU0070010.KU0070010form1.onDecision0 = function () {
  console.log('KU0070010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0070010', 'KU0070010form1', '?KU0070010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;0;CHKRQ;?KU0070010view1/?[eq]NOT_SELECTED@*2,*1"
expj.KU0070010.KU0070010form1.child0 = function () {
  console.log('KU0070010form1 script3');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0070010', 'KU0070010form1', '?KU0070010view1/?'), '[eq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="child;1;CHK;?KU0070010form1/IN_CUST_CD[eq]SAME[and]?KU0070010form1/IN_DLV_LOC_CD[eq]SAME[and]?KU0070010form1/IN_CHRG_PSN_CD[eq]SAME[and]?KU0070010form1/FROM_SCDL_SHIP_DATE[eq]SAME[and]?KU0070010form1/TO_SCDL_SHIP_DATE[eq]SAME@*3,*2"
expj.KU0070010.KU0070010form1.child1 = function () {
  console.log('KU0070010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0070010', 'KU0070010form1', '?KU0070010form1/IN_CUST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0070010', 'KU0070010form1', '?KU0070010form1/IN_DLV_LOC_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0070010', 'KU0070010form1', '?KU0070010form1/IN_CHRG_PSN_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0070010', 'KU0070010form1', '?KU0070010form1/FROM_SCDL_SHIP_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0070010', 'KU0070010form1', '?KU0070010form1/TO_SCDL_SHIP_DATE'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script5="child;2;MASK;_KU0070010button2/GoSub"
expj.KU0070010.KU0070010form1.child2 = function () {
  console.log('KU0070010form1 script5');
expj.common.pscript.setMaskToReferenceComponent('KU0070010', 'KU0070010form1', '_KU0070010button2/GoSub');
};
// script6="child;3;UNMASK;_KU0070010button2/GoSub"
expj.KU0070010.KU0070010form1.child3 = function () {
  console.log('KU0070010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('KU0070010', 'KU0070010form1', '_KU0070010button2/GoSub');
};
expj.KU0070010.KU0070010form1.executeAllOnDecision = function () {
  console.log('execute KU0070010form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0070010.KU0070010form1['onDecision' + i])) {
        expj.KU0070010.KU0070010form1['onDecision' + i]();
      }
    }
  }
};
expj.KU0070010.KU0070010form1.executeOnLoad = function () {
  expj.KU0070010.KU0070010form1.executePScriptOnLoad();
};

expj.KU0070010.KU0070010form1.executePScriptOnLoad = function () {
  console.log('execute KU0070010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KU0070010.KU0070010form1['onLoad' + i])) {
      expj.KU0070010.KU0070010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KU0070010-KU0070010form1" action="KU0070010Servlet" name="KU0070010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKU0070010Control.getReadStatusString()) %>" style="height:96px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:96px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:34px;align:"></div>
<div class="div-td" style="width:20px;align:"></div>
<div class="div-td" style="width:34px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:68px;align:"></div>
<div class="div-td" style="width:80px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KU0070010-KU0070010form1-IN_CUST_CD">
expj.KU0070010.KU0070010form1.IN_CUST_CD = {};
expj.KU0070010.KU0070010form1.IN_CUST_CD.executeAllOnDecision = function () {
  console.log('execute KU0070010form1/IN_CUST_CD.onDecision');
  expj.KU0070010.KU0070010form1.executeAllOnDecision();
  expj.KU0070010.executeAllOnDecision();
};
expj.KU0070010.KU0070010form1.IN_CUST_CD.executeOnLoad = function () {
  $('#expj-KU0070010-KU0070010form1-IN_CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0070010', 'KU0070010form1', 'IN_CUST_CD', this);
  });
  expj.KU0070010.KU0070010form1.IN_CUST_CD.executePScriptOnLoad();
};

expj.KU0070010.KU0070010form1.IN_CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KU0070010form1/IN_CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0070010-KU0070010form1-IN_CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0070010-KU0070010form1-IN_CUST_CD" name="IN_CUST_CD" class="KU0070010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aKU0070010Struct.getIN_CUST_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KU0070010-KU0070010form1-PeekerIN_CUST_CD">
expj.KU0070010.KU0070010form1.PeekerIN_CUST_CD = {};
// script1="onClick;0;PEEKER;_KU0070010form1/IN_CUST_CD@<%=contextNo%>"
expj.KU0070010.KU0070010form1.PeekerIN_CUST_CD.onClick0 = function () {
  console.log('PeekerIN_CUST_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KU0070010';
var parameterValues = 'PeekerIN_CUST_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0070010', 'KU0070010form1', '_KU0070010form1/IN_CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUST_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KU0070010form1/IN_CUST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KU0070010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KU0070010.KU0070010form1.PeekerIN_CUST_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0070010.KU0070010form1.PeekerIN_CUST_CD['onClick' + i])) {
        expj.KU0070010.KU0070010form1.PeekerIN_CUST_CD['onClick' + i]();
      }
    }
  }
};
expj.KU0070010.KU0070010form1.PeekerIN_CUST_CD.executeAllOnDecision = function () {
};
expj.KU0070010.KU0070010form1.PeekerIN_CUST_CD.executeOnLoad = function () {
  $('#expj-KU0070010-KU0070010form1-PeekerIN_CUST_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0070010', 'KU0070010form1', 'PeekerIN_CUST_CD', this, 'Button');
    }
  });
  expj.KU0070010.KU0070010form1.PeekerIN_CUST_CD.executePScriptOnLoad();
};

expj.KU0070010.KU0070010form1.PeekerIN_CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KU0070010form1/PeekerIN_CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0070010-KU0070010form1-PeekerIN_CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0070010-KU0070010form1-PeekerIN_CUST_CD" class="KU0070010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- (ワイルドカード指定可) --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:68px;"></div><!--/td-->
<div class="div-td" style="width:80px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DLV_LOC_CD",rb)%></span><!-- 納品場所コード --></div><!--/td-->
<script class="expj-script-KU0070010-KU0070010form1-IN_DLV_LOC_CD">
expj.KU0070010.KU0070010form1.IN_DLV_LOC_CD = {};
expj.KU0070010.KU0070010form1.IN_DLV_LOC_CD.executeAllOnDecision = function () {
  console.log('execute KU0070010form1/IN_DLV_LOC_CD.onDecision');
  expj.KU0070010.KU0070010form1.executeAllOnDecision();
  expj.KU0070010.executeAllOnDecision();
};
expj.KU0070010.KU0070010form1.IN_DLV_LOC_CD.executeOnLoad = function () {
  $('#expj-KU0070010-KU0070010form1-IN_DLV_LOC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0070010', 'KU0070010form1', 'IN_DLV_LOC_CD', this);
  });
  expj.KU0070010.KU0070010form1.IN_DLV_LOC_CD.executePScriptOnLoad();
};

expj.KU0070010.KU0070010form1.IN_DLV_LOC_CD.executePScriptOnLoad = function () {
  console.log('execute KU0070010form1/IN_DLV_LOC_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0070010-KU0070010form1-IN_DLV_LOC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0070010-KU0070010form1-IN_DLV_LOC_CD" name="IN_DLV_LOC_CD" class="KU0070010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aKU0070010Struct.getIN_DLV_LOC_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- (ワイルドカード指定可) --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:68px;"></div><!--/td-->
<div class="div-td" style="width:80px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CHRG_PSN_CD",rb)%></span><!-- 担当者コード --></div><!--/td-->
<script class="expj-script-KU0070010-KU0070010form1-IN_CHRG_PSN_CD">
expj.KU0070010.KU0070010form1.IN_CHRG_PSN_CD = {};
expj.KU0070010.KU0070010form1.IN_CHRG_PSN_CD.executeAllOnDecision = function () {
  console.log('execute KU0070010form1/IN_CHRG_PSN_CD.onDecision');
  expj.KU0070010.KU0070010form1.executeAllOnDecision();
  expj.KU0070010.executeAllOnDecision();
};
expj.KU0070010.KU0070010form1.IN_CHRG_PSN_CD.executeOnLoad = function () {
  $('#expj-KU0070010-KU0070010form1-IN_CHRG_PSN_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0070010', 'KU0070010form1', 'IN_CHRG_PSN_CD', this);
  });
  expj.KU0070010.KU0070010form1.IN_CHRG_PSN_CD.executePScriptOnLoad();
};

expj.KU0070010.KU0070010form1.IN_CHRG_PSN_CD.executePScriptOnLoad = function () {
  console.log('execute KU0070010form1/IN_CHRG_PSN_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0070010-KU0070010form1-IN_CHRG_PSN_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0070010-KU0070010form1-IN_CHRG_PSN_CD" name="IN_CHRG_PSN_CD" class="KU0070010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aKU0070010Struct.getIN_CHRG_PSN_CD()) %>" maxlength="10" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- (ワイルドカード指定可) --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:68px;"></div><!--/td-->
<div class="div-td" style="width:80px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SCDL_SHIP_DATE",rb)%></span><!-- 出荷予定日 --></div><!--/td-->
<script class="expj-script-KU0070010-KU0070010form1-FROM_SCDL_SHIP_DATE">
expj.KU0070010.KU0070010form1.FROM_SCDL_SHIP_DATE = {};
expj.KU0070010.KU0070010form1.FROM_SCDL_SHIP_DATE.executeAllOnDecision = function () {
  console.log('execute KU0070010form1/FROM_SCDL_SHIP_DATE.onDecision');
  expj.KU0070010.KU0070010form1.executeAllOnDecision();
  expj.KU0070010.executeAllOnDecision();
};
expj.KU0070010.KU0070010form1.FROM_SCDL_SHIP_DATE.executeOnLoad = function () {
  $('#expj-KU0070010-KU0070010form1-FROM_SCDL_SHIP_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0070010', 'KU0070010form1', 'FROM_SCDL_SHIP_DATE', this);
  });
  expj.KU0070010.KU0070010form1.FROM_SCDL_SHIP_DATE.executePScriptOnLoad();
};

expj.KU0070010.KU0070010form1.FROM_SCDL_SHIP_DATE.executePScriptOnLoad = function () {
  console.log('execute KU0070010form1/FROM_SCDL_SHIP_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KU0070010-KU0070010form1-FROM_SCDL_SHIP_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0070010-KU0070010form1-FROM_SCDL_SHIP_DATE" name="FROM_SCDL_SHIP_DATE" class="KU0070010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKU0070010Struct.getFROM_SCDL_SHIP_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KU0070010-KU0070010form1-CalendarSearchFrom">
expj.KU0070010.KU0070010form1.CalendarSearchFrom = {};
// script1="onClick;0;CALENDAR;_KU0070010form1/FROM_SCDL_SHIP_DATE"
expj.KU0070010.KU0070010form1.CalendarSearchFrom.onClick0 = function () {
  console.log('CalendarSearchFrom script1');
expj.common.pscript.executeCalendar('KU0070010','KU0070010form1','_KU0070010form1/FROM_SCDL_SHIP_DATE');
};
expj.KU0070010.KU0070010form1.CalendarSearchFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0070010.KU0070010form1.CalendarSearchFrom['onClick' + i])) {
        expj.KU0070010.KU0070010form1.CalendarSearchFrom['onClick' + i]();
      }
    }
  }
};
expj.KU0070010.KU0070010form1.CalendarSearchFrom.executeAllOnDecision = function () {
};
expj.KU0070010.KU0070010form1.CalendarSearchFrom.executeOnLoad = function () {
  $('#expj-KU0070010-KU0070010form1-CalendarSearchFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0070010', 'KU0070010form1', 'CalendarSearchFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KU0070010','KU0070010form1','_KU0070010form1/FROM_SCDL_SHIP_DATE');
  expj.KU0070010.KU0070010form1.CalendarSearchFrom.executePScriptOnLoad();
};

expj.KU0070010.KU0070010form1.CalendarSearchFrom.executePScriptOnLoad = function () {
  console.log('execute KU0070010form1/CalendarSearchFrom.onLoad');
  var targetComponent = document.getElementById('expj-KU0070010-KU0070010form1-CalendarSearchFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0070010-KU0070010form1-CalendarSearchFrom" class="KU0070010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:34px;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<div class="div-td" style="width:34px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KU0070010-KU0070010form1-TO_SCDL_SHIP_DATE">
expj.KU0070010.KU0070010form1.TO_SCDL_SHIP_DATE = {};
expj.KU0070010.KU0070010form1.TO_SCDL_SHIP_DATE.executeAllOnDecision = function () {
  console.log('execute KU0070010form1/TO_SCDL_SHIP_DATE.onDecision');
  expj.KU0070010.KU0070010form1.executeAllOnDecision();
  expj.KU0070010.executeAllOnDecision();
};
expj.KU0070010.KU0070010form1.TO_SCDL_SHIP_DATE.executeOnLoad = function () {
  $('#expj-KU0070010-KU0070010form1-TO_SCDL_SHIP_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0070010', 'KU0070010form1', 'TO_SCDL_SHIP_DATE', this);
  });
  expj.KU0070010.KU0070010form1.TO_SCDL_SHIP_DATE.executePScriptOnLoad();
};

expj.KU0070010.KU0070010form1.TO_SCDL_SHIP_DATE.executePScriptOnLoad = function () {
  console.log('execute KU0070010form1/TO_SCDL_SHIP_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KU0070010-KU0070010form1-TO_SCDL_SHIP_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0070010-KU0070010form1-TO_SCDL_SHIP_DATE" name="TO_SCDL_SHIP_DATE" class="KU0070010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKU0070010Struct.getTO_SCDL_SHIP_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KU0070010-KU0070010form1-CalendarSearchTo">
expj.KU0070010.KU0070010form1.CalendarSearchTo = {};
// script1="onClick;0;CALENDAR;_KU0070010form1/TO_SCDL_SHIP_DATE"
expj.KU0070010.KU0070010form1.CalendarSearchTo.onClick0 = function () {
  console.log('CalendarSearchTo script1');
expj.common.pscript.executeCalendar('KU0070010','KU0070010form1','_KU0070010form1/TO_SCDL_SHIP_DATE');
};
expj.KU0070010.KU0070010form1.CalendarSearchTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0070010.KU0070010form1.CalendarSearchTo['onClick' + i])) {
        expj.KU0070010.KU0070010form1.CalendarSearchTo['onClick' + i]();
      }
    }
  }
};
expj.KU0070010.KU0070010form1.CalendarSearchTo.executeAllOnDecision = function () {
};
expj.KU0070010.KU0070010form1.CalendarSearchTo.executeOnLoad = function () {
  $('#expj-KU0070010-KU0070010form1-CalendarSearchTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0070010', 'KU0070010form1', 'CalendarSearchTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KU0070010','KU0070010form1','_KU0070010form1/TO_SCDL_SHIP_DATE');
  expj.KU0070010.KU0070010form1.CalendarSearchTo.executePScriptOnLoad();
};

expj.KU0070010.KU0070010form1.CalendarSearchTo.executePScriptOnLoad = function () {
  console.log('execute KU0070010form1/CalendarSearchTo.onLoad');
  var targetComponent = document.getElementById('expj-KU0070010-KU0070010form1-CalendarSearchTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0070010-KU0070010form1-CalendarSearchTo" class="KU0070010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:68px;"></div><!--/td-->
<div class="div-td" style="width:80px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KU0070010-KU0070010button1">
expj.KU0070010.KU0070010button1 = {};
expj.KU0070010.KU0070010button1.executeAllOnDecision = function () {
  console.log('execute KU0070010button1.onDecision');
};
expj.KU0070010.KU0070010button1.executeOnLoad = function () {
  expj.KU0070010.KU0070010button1.executePScriptOnLoad();
};

expj.KU0070010.KU0070010button1.executePScriptOnLoad = function () {
  console.log('execute KU0070010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0070010-KU0070010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0070010-KU0070010button1-Select">
expj.KU0070010.KU0070010button1.Select = {};
// script1="onClick;0;CHK;_KU0070010form1/FROM_SCDL_SHIP_DATE[neq][and]_KU0070010form1/TO_SCDL_SHIP_DATE[neq][and]_KU0070010form1/TO_SCDL_SHIP_DATE[lt]_KU0070010form1/FROM_SCDL_SHIP_DATE@!KU10017"
expj.KU0070010.KU0070010button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0070010', 'KU0070010button1', '_KU0070010form1/FROM_SCDL_SHIP_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0070010', 'KU0070010button1', '_KU0070010form1/TO_SCDL_SHIP_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0070010', 'KU0070010button1', '_KU0070010form1/TO_SCDL_SHIP_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0070010', 'KU0070010button1', '_KU0070010form1/FROM_SCDL_SHIP_DATE')))) {
expj.common.pscript.viewErrorMessage('KU0070010', 'KU0070010button1', 'KU10017');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KU0070010form1/*@KU0070010Servlet"
expj.KU0070010.KU0070010button1.Select.onClick1 = function () {
  console.log('Select script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0070010', 'KU0070010button1', '_KU0070010form1/*', 'KU0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0070010', response);
expj.common.updateBusinessScreenTab('KU0070010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KU0070010.KU0070010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0070010.KU0070010button1.Select['onClick' + i])) {
        expj.KU0070010.KU0070010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.KU0070010.KU0070010button1.Select.executeAllOnDecision = function () {
};
expj.KU0070010.KU0070010button1.Select.executeOnLoad = function () {
  $('#expj-KU0070010-KU0070010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0070010', 'KU0070010button1', 'Select', this, 'Button');
    }
  });
  expj.KU0070010.KU0070010button1.Select.executePScriptOnLoad();
};

expj.KU0070010.KU0070010button1.Select.executePScriptOnLoad = function () {
  console.log('execute KU0070010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-KU0070010-KU0070010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0070010-KU0070010button1-Select" name="Select" class="KU0070010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段一覧用のDataGridを配置する。↓ --><script class="expj-script-KU0070010-KU0070010view1">
expj.KU0070010.KU0070010view1 = {};
expj.KU0070010.KU0070010view1.executeAllOnClick = function () {
};
expj.KU0070010.KU0070010view1.executeAllOnDecision = function () {
  console.log('execute KU0070010view1.onDecision');
};
expj.KU0070010.KU0070010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("KU0070010view1", "expj.KU0070010.KU0070010view1.executeAllOnClick");
%>
  expj.KU0070010.KU0070010view1.executePScriptOnLoad();
};

expj.KU0070010.KU0070010view1.executePScriptOnLoad = function () {
  console.log('execute KU0070010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-KU0070010-KU0070010view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%=TypeConverter.sanitizer(aKU0070010Control.getReadStatus())%>"></div>
<!-- VIEW END -->
<%
 String KU0070010view1_Id = "KU0070010view1";
 String KU0070010view1_select = "single";
 String KU0070010view1_sortable = "true";
 String KU0070010view1_resize = "true";
 String KU0070010view1_scroll = "true";
 StringBuffer KU0070010view1_HB = new StringBuffer();
 StringBuffer KU0070010view1_DB = new StringBuffer();
%>
<%
 KU0070010view1_select = "multi";
 KU0070010view1_sortable = "true";
 KU0070010view1_resize = "true";
 KU0070010view1_scroll = "true";
%>
<%
 KU0070010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
%>
     
<%
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_CD",rb))).append("', 'name':'CUST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_NAME",rb))).append("', 'name':'CUST_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DLV_LOC_CD",rb))).append("', 'name':'DLV_LOC_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DESINATED_SHIP_DATE",rb))).append("', 'name':'SHIP_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_CD",rb))).append("', 'name':'CUST_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_NAME",rb))).append("', 'name':'CUST_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ODR_NO",rb))).append("', 'name':'CUST_ODR_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SLIP_CD",rb))).append("', 'name':'SLIP_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SHIP_ODR_NO",rb))).append("', 'name':'SHIP_ODR_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUS_DLV_KEY_CD",rb))).append("', 'name':'DLV_KEY_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.QTY",rb))).append("', 'name':'SHIP_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_UNIT",rb))).append("', 'name':'UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACTUAL_UNIT_PRICE",rb))).append("', 'name':'ACTUAL_UNIT_PRICE', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SHIP_ODR_AMOUNT",rb))).append("', 'name':'SHIP_ODR_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_CD",rb))).append("', 'name':'ALLCT_WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_NAME",rb))).append("', 'name':'WH_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SHIP_ORD_CD",rb))).append("', 'name':'ODR_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PART_DLV_SEQ_NO",rb))).append("', 'name':'PART_DLV_SEQ_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DEPO_TYP",rb))).append("', 'name':'DEPO_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'170px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.REFERENCE",rb))).append("', 'name':'REMARKS', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
KU0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'SELECT_MARK', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KU0070010view1_sortable).append("}").append(",");
%>
<%
 int aKU0070010StructLength = aKU0070010Control.getListsize();
 final KU0070010Struct structBackup = aKU0070010Struct;
 aKU0070010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aKU0070010StructLength; ++loopCount) {
  if((aKU0070010Struct = (KU0070010Struct) aKU0070010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aKU0070010Struct", aKU0070010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 KU0070010view1_DB.append("[");
 KU0070010view1_DB.append(loopCount);
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-CUST_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-CUST_CD\" data-name=\"CUST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0070010Struct.getCUST_CD())).append("</span>'");
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-CUST_NAME-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-CUST_NAME\" data-name=\"CUST_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0070010Struct.getCUST_NAME())).append("</span>'");
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-DLV_LOC_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-DLV_LOC_CD\" data-name=\"DLV_LOC_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0070010Struct.getDLV_LOC_CD())).append("</span>'");
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-SHIP_DATE-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-SHIP_DATE\" data-name=\"SHIP_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0070010Struct.getSHIP_DATE())).append("</span>'");
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-ITEM_CD\" data-name=\"ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0070010Struct.getITEM_CD())).append("</span>'");
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0070010Struct.getITEM_NAME())).append("</span>'");
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-JOB_ODR_CD\" data-name=\"JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0070010Struct.getJOB_ODR_CD())).append("</span>'");
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-CUST_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-CUST_ITEM_CD\" data-name=\"CUST_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0070010Struct.getCUST_ITEM_CD())).append("</span>'");
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-CUST_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-CUST_ITEM_NAME\" data-name=\"CUST_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0070010Struct.getCUST_ITEM_NAME())).append("</span>'");
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-CUST_ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-CUST_ODR_NO\" data-name=\"CUST_ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0070010Struct.getCUST_ODR_NO())).append("</span>'");
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-SLIP_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-SLIP_CD\" data-name=\"SLIP_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0070010Struct.getSLIP_CD())).append("</span>'");
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-SHIP_ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-SHIP_ODR_NO\" data-name=\"SHIP_ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0070010Struct.getSHIP_ODR_NO())).append("</span>'");
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-DLV_KEY_NO-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-DLV_KEY_NO\" data-name=\"DLV_KEY_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0070010Struct.getDLV_KEY_NO())).append("</span>'");
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-SHIP_QTY-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-SHIP_QTY\" data-name=\"SHIP_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;CEIL;4\">").append(TypeConverter.sanitizer(aKU0070010Struct.getSHIP_QTY())).append("</span>'");
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-UNIT-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-UNIT\" data-name=\"UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0070010Struct.getUNIT())).append("</span>'");
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-ACTUAL_UNIT_PRICE-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-ACTUAL_UNIT_PRICE\" data-name=\"ACTUAL_UNIT_PRICE\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKU0070010Struct.getACTUAL_UNIT_PRICE())).append("</span>'");
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-SHIP_ODR_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-SHIP_ODR_AMOUNT\" data-name=\"SHIP_ODR_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKU0070010Struct.getSHIP_ODR_AMOUNT())).append("</span>'");
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-ALLCT_WH_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-ALLCT_WH_CD\" data-name=\"ALLCT_WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0070010Struct.getALLCT_WH_CD())).append("</span>'");
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-WH_NAME-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-WH_NAME\" data-name=\"WH_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0070010Struct.getWH_NAME())).append("</span>'");
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-ODR_NO\" data-name=\"ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0070010Struct.getODR_NO())).append("</span>'");
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-PART_DLV_SEQ_NO-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-PART_DLV_SEQ_NO\" data-name=\"PART_DLV_SEQ_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0070010Struct.getPART_DLV_SEQ_NO())).append("</span>'");
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-DEPO_TYP-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-DEPO_TYP\" data-name=\"DEPO_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0070010Struct.getDEPO_TYP())).append("</span>'");
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-REMARKS-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-REMARKS\" data-name=\"REMARKS\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0070010Struct.getREMARKS())).append("</span>'");
 KU0070010view1_DB.append(",").append("'<span id=\"expj-KU0070010-KU0070010view1-SELECT_MARK-").append(loopCount).append("\" class=\"expj-label expj-KU0070010-KU0070010view1-SELECT_MARK\" data-name=\"SELECT_MARK\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0070010Struct.getSELECT_MARK())).append("</span>'");
 KU0070010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aKU0070010StructLength) {
   KU0070010view1_DB.append(",");
  }
 }
 aKU0070010Struct = structBackup;
 viewIdList.add(KU0070010view1_Id);
 viewSelectList.add(KU0070010view1_select);
 viewResizeList.add(KU0070010view1_resize);
 viewScrollList.add(KU0070010view1_scroll);
 viewHeaderDataList.add(KU0070010view1_HB);
 viewBodyDataList.add(KU0070010view1_DB);
%>
<%
}
%>
<!-- ここに下段一覧用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 button-area" style="width:105px;"><script class="expj-script-KU0070010-KU0070010button2">
expj.KU0070010.KU0070010button2 = {};
expj.KU0070010.KU0070010button2.executeAllOnDecision = function () {
  console.log('execute KU0070010button2.onDecision');
};
expj.KU0070010.KU0070010button2.executeOnLoad = function () {
  expj.KU0070010.KU0070010button2.executePScriptOnLoad();
};

expj.KU0070010.KU0070010button2.executePScriptOnLoad = function () {
  console.log('execute KU0070010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0070010-KU0070010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0070010-KU0070010button2-GoSub">
expj.KU0070010.KU0070010button2.GoSub = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KU0070010view1/+,_KU0070010form1/*@KU0070010Servlet;;"
expj.KU0070010.KU0070010button2.GoSub.onClick0 = function () {
  console.log('GoSub script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0070010', 'KU0070010button2', '_KU0070010view1/+,_KU0070010form1/*', 'KU0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0070010', response);
expj.common.updateBusinessScreenTab('KU0070010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script2="onLoad;0;CALL;child@1"
expj.KU0070010.KU0070010button2.GoSub.onLoad0 = function () {
  console.log('GoSub script2');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child1)){this.child1();}
};
// script3="child;1;CHK;<%= aKU0070010Struct.getw_Flag()%>[eq]1@*2"
expj.KU0070010.KU0070010button2.GoSub.child1 = function () {
  console.log('GoSub script3');
if (expj.common.pscript.evaluate('<%= aKU0070010Struct.getw_Flag()%>', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="child;2;SCRMV;ORTEUS_HASHED=<%=hashed%>,_KU0070010view1/*@KU0080010Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.KU0070010.KU0070010button2.GoSub.child2 = function () {
  console.log('GoSub script4');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0070010', 'KU0070010button2', '_KU0070010view1/*', 'KU0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('KU0080010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'KU0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'KU0070010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KU0070010.KU0070010button2.GoSub.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0070010.KU0070010button2.GoSub['onClick' + i])) {
        expj.KU0070010.KU0070010button2.GoSub['onClick' + i]();
      }
    }
  }
};
expj.KU0070010.KU0070010button2.GoSub.executeAllOnDecision = function () {
};
expj.KU0070010.KU0070010button2.GoSub.executeOnLoad = function () {
  $('#expj-KU0070010-KU0070010button2-GoSub').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0070010', 'KU0070010button2', 'GoSub', this, 'Button');
    }
  });
  expj.KU0070010.KU0070010button2.GoSub.executePScriptOnLoad();
};

expj.KU0070010.KU0070010button2.GoSub.executePScriptOnLoad = function () {
  console.log('execute KU0070010button2/GoSub.onLoad');
  var targetComponent = document.getElementById('expj-KU0070010-KU0070010button2-GoSub');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KU0070010.KU0070010button2.GoSub['onLoad' + i])) {
      expj.KU0070010.KU0070010button2.GoSub['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:105px;float:none;height:30px;"><button type="button" id="expj-KU0070010-KU0070010button2-GoSub" name="GoSub" class="KU0070010-focus-move" style="width:px;"><%=CoreTools.getRBString("Expj.BtnSelectionInfoRegist",rb)%></button><!-- 選択情報登録ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame11" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">KU0070010 Revision: 1.1  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KU0070010-KU0070010button0">
expj.KU0070010.KU0070010button0 = {};
expj.KU0070010.KU0070010button0.executeAllOnDecision = function () {
  console.log('execute KU0070010button0.onDecision');
};
expj.KU0070010.KU0070010button0.executeOnLoad = function () {
  expj.KU0070010.KU0070010button0.executePScriptOnLoad();
};

expj.KU0070010.KU0070010button0.executePScriptOnLoad = function () {
  console.log('execute KU0070010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0070010-KU0070010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0070010-KU0070010button0-Clear">
expj.KU0070010.KU0070010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KU0070010Servlet,,$ZZ07008"
expj.KU0070010.KU0070010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0070010', 'KU0070010button0', '', 'KU0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0070010', response);
expj.common.updateBusinessScreenTab('KU0070010', contents);
};
expj.common.pscript.callConfirm('KU0070010', 'KU0070010button0', 'ZZ07008', okEvent);
};
expj.KU0070010.KU0070010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0070010.KU0070010button0.Clear['onClick' + i])) {
        expj.KU0070010.KU0070010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KU0070010.KU0070010button0.Clear.executeAllOnDecision = function () {
};
expj.KU0070010.KU0070010button0.Clear.executeOnLoad = function () {
  $('#expj-KU0070010-KU0070010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0070010', 'KU0070010button0', 'Clear', this, 'Button');
    }
  });
  expj.KU0070010.KU0070010button0.Clear.executePScriptOnLoad();
};

expj.KU0070010.KU0070010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KU0070010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KU0070010-KU0070010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0070010-KU0070010button0-Clear" name="Clear" class="KU0070010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KU0070010-KU0070010button0-Close">
expj.KU0070010.KU0070010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KU0070010.KU0070010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KU0070010');
};
expj.KU0070010.KU0070010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0070010.KU0070010button0.Close['onClick' + i])) {
        expj.KU0070010.KU0070010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KU0070010.KU0070010button0.Close.executeAllOnDecision = function () {
};
expj.KU0070010.KU0070010button0.Close.executeOnLoad = function () {
  $('#expj-KU0070010-KU0070010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0070010', 'KU0070010button0', 'Close', this, 'Button');
    }
  });
  expj.KU0070010.KU0070010button0.Close.executePScriptOnLoad();
};

expj.KU0070010.KU0070010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KU0070010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KU0070010-KU0070010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0070010-KU0070010button0-Close" name="Close" class="KU0070010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KU0070010 (END)-->
<%
MessageStruct msgStruct = aKU0070010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KU0070010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KU0070010)) {
  expj.common.treeInstanceMap.KU0070010 = {};
}
expj.common.treeInstanceMap.KU0070010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KU0070010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KU0070010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KU0070010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KU0070010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KU0070010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KU0070010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KU0070010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KU0070010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KU0070010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KU0070010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0070010)) {
  expj.common.detailDialogMap.KU0070010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0070010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KU0070010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0070010.<%=detailId %>)) {
  expj.common.detailDialogMap.KU0070010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0070010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KU0070010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0070010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KU0070010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KU0070010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KU0070010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KU0070010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KU0070010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KU0070010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KU0070010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KU0070010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KU0070010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KU0070010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KU0070010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KU0070010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KU0070010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KU0070010)) {
  expj.common.viewInstanceMap.KU0070010 = {};
}
expj.common.viewInstanceMap.KU0070010.<%=viewId %> = {};
expj.common.viewInstanceMap.KU0070010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KU0070010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KU0070010.<%=viewId %>.init = function () {
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
    expj.KU0070010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KU0070010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KU0070010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KU0070010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KU0070010_init">
/**
 * KU0070010用のロード完了時初期化関数
 */
expj.KU0070010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KU0070010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KU0070010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KU0070010');
  expj.common.calendarInstanceMap.KU0070010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KU0070010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KU0070010.<%=detailId %>.init();
  expj.common.detailDialogMap.KU0070010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KU0070010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KU0070010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KU0070010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KU0070010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KU0070010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KU0070010-<%=detailId %>');
<%
 }
%>
  try{expj.KU0070010.KU0070010form1.IN_CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KU0070010.KU0070010form1.PeekerIN_CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KU0070010.KU0070010form1.IN_DLV_LOC_CD.executeOnLoad();}catch(e){};
  try{expj.KU0070010.KU0070010form1.IN_CHRG_PSN_CD.executeOnLoad();}catch(e){};
  try{expj.KU0070010.KU0070010form1.FROM_SCDL_SHIP_DATE.executeOnLoad();}catch(e){};
  try{expj.KU0070010.KU0070010form1.CalendarSearchFrom.executeOnLoad();}catch(e){};
  try{expj.KU0070010.KU0070010form1.TO_SCDL_SHIP_DATE.executeOnLoad();}catch(e){};
  try{expj.KU0070010.KU0070010form1.CalendarSearchTo.executeOnLoad();}catch(e){};
  try{expj.KU0070010.KU0070010button1.Select.executeOnLoad();}catch(e){};
  try{expj.KU0070010.KU0070010button2.GoSub.executeOnLoad();}catch(e){};
  try{expj.KU0070010.KU0070010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KU0070010.KU0070010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KU0070010.KU0070010form1.executeOnLoad();}catch(e){};
  try{expj.KU0070010.KU0070010button1.executeOnLoad();}catch(e){};
  try{expj.KU0070010.KU0070010view1.executeOnLoad();}catch(e){};
  try{expj.KU0070010.KU0070010button2.executeOnLoad();}catch(e){};
  try{expj.KU0070010.KU0070010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KU0070010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KU0070010', 'KU0070010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KU0070010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KU0070010-focus-move');
  // 初期フォーカス当てる処理
  $('.KU0070010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KU0070010', '<%=request.getContextPath() %>');
};

/**
 * KU0070010の全体onDecision処理
 */
expj.KU0070010.executeAllOnDecision = function () {
  expj.KU0070010.KU0070010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KU0070010_console">
expj.KU0070010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>