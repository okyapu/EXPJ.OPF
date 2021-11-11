<%-- ***
This file is generated
 GeneratedDate  : Thu Feb 16 20:31:06 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KQ0040\KQ0040010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KQ0040.*" %>
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
<jsp:useBean id="aKQ0040010Control" class="com.nec.jp.orteus.metamorBase.KQ0040.KQ0040010Control" scope="request"/>
<jsp:useBean id="aKQ0040010Struct" class="com.nec.jp.orteus.metamorBase.KQ0040.KQ0040010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

受注明細一覧
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0040/jsp/KQ0040010.jsp,v $
$Author: geng-jia $    
$Revision: 1.11 $ $Date: 2017/02/22 02:07:12 $
********************************************************* --%>
<html>
<head>
<title>受注明細一覧</title>
<%@include file="common/expj_v5.jsp" %>
<%
ScreenMoveUtil su = new ScreenMoveUtil("KQ0010020Servlet", so);
ScreenMoveUtil su2 = new ScreenMoveUtil("KQ0090010Servlet", so);
ScreenMoveUtil su3 = new ScreenMoveUtil("KM0030010Servlet", so);
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
<script class="expj-script-KQ0040010_init">
  // KQ0040010名前空間
  expj.KQ0040010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>


  <div id="expj-business-screen-KQ0040010" data-screen="KQ0040010" data-newdata="<%=aKQ0040010Control.isNewData() %>">
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
              <script class="expj-script-KQ0040010-KQ0040010form1">
expj.KQ0040010.KQ0040010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2"
expj.KQ0040010.KQ0040010form1.onLoad0 = function () {
  console.log('KQ0040010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script2="onDecision;0;CHKRQ;?KQ0040010view1/?[eq]NOT_SELECTED@*11"
expj.KQ0040010.KQ0040010form1.onDecision0 = function () {
  console.log('KQ0040010form1 script2');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010form1', '?KQ0040010view1/?'), '[eq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script3="onDecision;1;CHKRQ;?KQ0040010view1/?[eq]SINGLE@*5"
expj.KQ0040010.KQ0040010form1.onDecision1 = function () {
  console.log('KQ0040010form1 script3');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010form1', '?KQ0040010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script4="onDecision;2;CHK;?KQ0040010form1/*[eq]NORMAL@*2,*4"
expj.KQ0040010.KQ0040010form1.onDecision2 = function () {
  console.log('KQ0040010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010form1', '?KQ0040010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script5="child;0;MASK;_KQ0040010button2/GoSub@*8"
expj.KQ0040010.KQ0040010form1.child0 = function () {
  console.log('KQ0040010form1 script5');
expj.common.pscript.setMaskToReferenceComponent('KQ0040010', 'KQ0040010form1', '_KQ0040010button2/GoSub');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
// script6="child;1;UNMASK;_KQ0040010button2/GoSub@*7"
expj.KQ0040010.KQ0040010form1.child1 = function () {
  console.log('KQ0040010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0040010', 'KQ0040010form1', '_KQ0040010button2/GoSub');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child7)){this.child7();}}
};
// script7="child;2;CHK;?KQ0040010form1/IN_CUST_CD[eq]SAME[and]?KQ0040010form1/IN_CUST_ITEM_CD[eq]SAME[and]?KQ0040010form1/IN_CUST_CHRG_PSN_CD[eq]SAME[and]?KQ0040010form1/IN_CUST_ODR_NO[eq]SAME[and]?KQ0040010form1/FROM_DESINATED_DLV_DATE[eq]SAME[and]?KQ0040010form1/TO_DESINATED_DLV_DATE[eq]SAME[and]?KQ0040010form1/FROM_ODR_ACPT_DATE[eq]SAME[and]?KQ0040010form1/TO_ODR_ACPT_DATE[eq]SAME[and]?KQ0040010form1/CHECK_1[eq]SAME[and]?KQ0040010form1/CHECK_2[eq]SAME[and]?KQ0040010form1/CHECK_4[eq]SAME@*3,*4"
expj.KQ0040010.KQ0040010form1.child2 = function () {
  console.log('KQ0040010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010form1', '?KQ0040010form1/IN_CUST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010form1', '?KQ0040010form1/IN_CUST_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010form1', '?KQ0040010form1/IN_CUST_CHRG_PSN_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010form1', '?KQ0040010form1/IN_CUST_ODR_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010form1', '?KQ0040010form1/FROM_DESINATED_DLV_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010form1', '?KQ0040010form1/TO_DESINATED_DLV_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010form1', '?KQ0040010form1/FROM_ODR_ACPT_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010form1', '?KQ0040010form1/TO_ODR_ACPT_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010form1', '?KQ0040010form1/CHECK_1'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010form1', '?KQ0040010form1/CHECK_2'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010form1', '?KQ0040010form1/CHECK_4'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script8="child;3;UNMASK;_KQ0040010button0/CSVOut"
expj.KQ0040010.KQ0040010form1.child3 = function () {
  console.log('KQ0040010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0040010', 'KQ0040010form1', '_KQ0040010button0/CSVOut');
};
// script9="child;4;MASK;_KQ0040010button0/CSVOut"
expj.KQ0040010.KQ0040010form1.child4 = function () {
  console.log('KQ0040010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('KQ0040010', 'KQ0040010form1', '_KQ0040010button0/CSVOut');
};
// script10="child;5;CHK;_KQ0040010view1/PROJECT_CD[eq]@*9,*10"
expj.KQ0040010.KQ0040010form1.child5 = function () {
  console.log('KQ0040010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010form1', '_KQ0040010view1/PROJECT_CD'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script11="child;6;CHK;_KQ0040010view1/PRO_FLG[eq]1@*1,*0"
expj.KQ0040010.KQ0040010form1.child6 = function () {
  console.log('KQ0040010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010form1', '_KQ0040010view1/PRO_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script12="child;7;MASK;_KQ0040010button2/GoSub2"
expj.KQ0040010.KQ0040010form1.child7 = function () {
  console.log('KQ0040010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('KQ0040010', 'KQ0040010form1', '_KQ0040010button2/GoSub2');
};
// script13="child;8;UNMASK;_KQ0040010button2/GoSub2"
expj.KQ0040010.KQ0040010form1.child8 = function () {
  console.log('KQ0040010form1 script13');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0040010', 'KQ0040010form1', '_KQ0040010button2/GoSub2');
};
// script14="child;9;MASK;_KQ0040010button2/GoSub3@*6"
expj.KQ0040010.KQ0040010form1.child9 = function () {
  console.log('KQ0040010form1 script14');
expj.common.pscript.setMaskToReferenceComponent('KQ0040010', 'KQ0040010form1', '_KQ0040010button2/GoSub3');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script15="child;10;UNMASK;_KQ0040010button2/GoSub3@*12"
expj.KQ0040010.KQ0040010form1.child10 = function () {
  console.log('KQ0040010form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0040010', 'KQ0040010form1', '_KQ0040010button2/GoSub3');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child12)){this.child12();}}
};
// script16="child;11;MASK;_KQ0040010button2/GoSub,_KQ0040010button2/GoSub2,_KQ0040010button2/GoSub3"
expj.KQ0040010.KQ0040010form1.child11 = function () {
  console.log('KQ0040010form1 script16');
expj.common.pscript.setMaskToReferenceComponent('KQ0040010', 'KQ0040010form1', '_KQ0040010button2/GoSub');
expj.common.pscript.setMaskToReferenceComponent('KQ0040010', 'KQ0040010form1', '_KQ0040010button2/GoSub2');
expj.common.pscript.setMaskToReferenceComponent('KQ0040010', 'KQ0040010form1', '_KQ0040010button2/GoSub3');
};
// script17="child;12;MASK;_KQ0040010button2/GoSub,_KQ0040010button2/GoSub2"
expj.KQ0040010.KQ0040010form1.child12 = function () {
  console.log('KQ0040010form1 script17');
expj.common.pscript.setMaskToReferenceComponent('KQ0040010', 'KQ0040010form1', '_KQ0040010button2/GoSub');
expj.common.pscript.setMaskToReferenceComponent('KQ0040010', 'KQ0040010form1', '_KQ0040010button2/GoSub2');
};
expj.KQ0040010.KQ0040010form1.executeAllOnDecision = function () {
  console.log('execute KQ0040010form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0040010.KQ0040010form1['onDecision' + i])) {
        expj.KQ0040010.KQ0040010form1['onDecision' + i]();
      }
    }
  }
};
expj.KQ0040010.KQ0040010form1.executeOnLoad = function () {
  expj.KQ0040010.KQ0040010form1.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010form1.executePScriptOnLoad = function () {
  console.log('execute KQ0040010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KQ0040010.KQ0040010form1['onLoad' + i])) {
      expj.KQ0040010.KQ0040010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KQ0040010-KQ0040010form1" action="KQ0040010Servlet" name="KQ0040010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKQ0040010Control.getReadStatusString()) %>" style="height:142px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:142px;">
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
<script class="expj-script-KQ0040010-KQ0040010form1-IN_CUST_CD">
expj.KQ0040010.KQ0040010form1.IN_CUST_CD = {};
expj.KQ0040010.KQ0040010form1.IN_CUST_CD.executeAllOnDecision = function () {
  console.log('execute KQ0040010form1/IN_CUST_CD.onDecision');
  expj.KQ0040010.KQ0040010form1.executeAllOnDecision();
  expj.KQ0040010.executeAllOnDecision();
};
expj.KQ0040010.KQ0040010form1.IN_CUST_CD.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010form1-IN_CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0040010', 'KQ0040010form1', 'IN_CUST_CD', this);
  });
  expj.KQ0040010.KQ0040010form1.IN_CUST_CD.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010form1.IN_CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0040010form1/IN_CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010form1-IN_CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0040010-KQ0040010form1-IN_CUST_CD" name="IN_CUST_CD" class="KQ0040010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aKQ0040010Struct.getIN_CUST_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KQ0040010-KQ0040010form1-PeekerIN_CUST_CD">
expj.KQ0040010.KQ0040010form1.PeekerIN_CUST_CD = {};
// script1="onClick;0;PEEKER;_KQ0040010form1/IN_CUST_CD@<%=contextNo%>"
expj.KQ0040010.KQ0040010form1.PeekerIN_CUST_CD.onClick0 = function () {
  console.log('PeekerIN_CUST_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KQ0040010';
var parameterValues = 'PeekerIN_CUST_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010form1', '_KQ0040010form1/IN_CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUST_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KQ0040010form1/IN_CUST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KQ0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KQ0040010.KQ0040010form1.PeekerIN_CUST_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0040010.KQ0040010form1.PeekerIN_CUST_CD['onClick' + i])) {
        expj.KQ0040010.KQ0040010form1.PeekerIN_CUST_CD['onClick' + i]();
      }
    }
  }
};
expj.KQ0040010.KQ0040010form1.PeekerIN_CUST_CD.executeAllOnDecision = function () {
};
expj.KQ0040010.KQ0040010form1.PeekerIN_CUST_CD.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010form1-PeekerIN_CUST_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0040010', 'KQ0040010form1', 'PeekerIN_CUST_CD', this, 'Button');
    }
  });
  expj.KQ0040010.KQ0040010form1.PeekerIN_CUST_CD.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010form1.PeekerIN_CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0040010form1/PeekerIN_CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010form1-PeekerIN_CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0040010-KQ0040010form1-PeekerIN_CUST_CD" class="KQ0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:68px;"></div><!--/td-->
<script class="expj-script-KQ0040010-KQ0040010form1-CHECK_4">
expj.KQ0040010.KQ0040010form1.CHECK_4 = {};
expj.KQ0040010.KQ0040010form1.CHECK_4.executeAllOnDecision = function () {
  console.log('execute KQ0040010form1/CHECK_4.onDecision');
  expj.KQ0040010.KQ0040010form1.executeAllOnDecision();
  expj.KQ0040010.executeAllOnDecision();
};
expj.KQ0040010.KQ0040010form1.CHECK_4.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010form1-CHECK_4').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0040010', 'KQ0040010form1', 'CHECK_4', this, 'CheckBox');
    }
  });
  expj.KQ0040010.KQ0040010form1.CHECK_4.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010form1.CHECK_4.executePScriptOnLoad = function () {
  console.log('execute KQ0040010form1/CHECK_4.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010form1-CHECK_4');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:80px;text-align:left;"><input type="checkbox" name="CHECK_4" value="true" <%= ("true".equals(TypeConverter.convert(aKQ0040010Struct.getCHECK_4())) || "1".equals(TypeConverter.convert(aKQ0040010Struct.getCHECK_4())))?"checked=\"checked\"":"" %>  class="KQ0040010-focus-move" id="expj-KQ0040010-KQ0040010form1-CHECK_4"><label for="expj-KQ0040010-KQ0040010form1-CHECK_4"><%=CoreTools.getRBString("Expj.FORECAST_ODR",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_ITEM_CD",rb)%></span><!-- 得意先品目番号 --></div><!--/td-->
<script class="expj-script-KQ0040010-KQ0040010form1-IN_CUST_ITEM_CD">
expj.KQ0040010.KQ0040010form1.IN_CUST_ITEM_CD = {};
expj.KQ0040010.KQ0040010form1.IN_CUST_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KQ0040010form1/IN_CUST_ITEM_CD.onDecision');
  expj.KQ0040010.KQ0040010form1.executeAllOnDecision();
  expj.KQ0040010.executeAllOnDecision();
};
expj.KQ0040010.KQ0040010form1.IN_CUST_ITEM_CD.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010form1-IN_CUST_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0040010', 'KQ0040010form1', 'IN_CUST_ITEM_CD', this);
  });
  expj.KQ0040010.KQ0040010form1.IN_CUST_ITEM_CD.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010form1.IN_CUST_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0040010form1/IN_CUST_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010form1-IN_CUST_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0040010-KQ0040010form1-IN_CUST_ITEM_CD" name="IN_CUST_ITEM_CD" class="KQ0040010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aKQ0040010Struct.getIN_CUST_ITEM_CD()) %>" maxlength="35" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:68px;"></div><!--/td-->
<script class="expj-script-KQ0040010-KQ0040010form1-CHECK_1">
expj.KQ0040010.KQ0040010form1.CHECK_1 = {};
expj.KQ0040010.KQ0040010form1.CHECK_1.executeAllOnDecision = function () {
  console.log('execute KQ0040010form1/CHECK_1.onDecision');
  expj.KQ0040010.KQ0040010form1.executeAllOnDecision();
  expj.KQ0040010.executeAllOnDecision();
};
expj.KQ0040010.KQ0040010form1.CHECK_1.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010form1-CHECK_1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0040010', 'KQ0040010form1', 'CHECK_1', this, 'CheckBox');
    }
  });
  expj.KQ0040010.KQ0040010form1.CHECK_1.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010form1.CHECK_1.executePScriptOnLoad = function () {
  console.log('execute KQ0040010form1/CHECK_1.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010form1-CHECK_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:80px;text-align:left;"><input type="checkbox" name="CHECK_1" value="true" <%= ("true".equals(TypeConverter.convert(aKQ0040010Struct.getCHECK_1())) || "".equals(TypeConverter.convert(aKQ0040010Struct.getCHECK_1())))?"checked=\"checked\"": "" %> class="KQ0040010-focus-move" id="expj-KQ0040010-KQ0040010form1-CHECK_1"><label for="expj-KQ0040010-KQ0040010form1-CHECK_1"><%=CoreTools.getRBString("Expj.UNCONFIRM_ODR",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OWN_PERSON_CD_2",rb)%></span><!-- 発注/営業担当者 --></div><!--/td-->
<script class="expj-script-KQ0040010-KQ0040010form1-IN_CUST_CHRG_PSN_CD">
expj.KQ0040010.KQ0040010form1.IN_CUST_CHRG_PSN_CD = {};
expj.KQ0040010.KQ0040010form1.IN_CUST_CHRG_PSN_CD.executeAllOnDecision = function () {
  console.log('execute KQ0040010form1/IN_CUST_CHRG_PSN_CD.onDecision');
  expj.KQ0040010.KQ0040010form1.executeAllOnDecision();
  expj.KQ0040010.executeAllOnDecision();
};
expj.KQ0040010.KQ0040010form1.IN_CUST_CHRG_PSN_CD.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010form1-IN_CUST_CHRG_PSN_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0040010', 'KQ0040010form1', 'IN_CUST_CHRG_PSN_CD', this);
  });
  expj.KQ0040010.KQ0040010form1.IN_CUST_CHRG_PSN_CD.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010form1.IN_CUST_CHRG_PSN_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0040010form1/IN_CUST_CHRG_PSN_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010form1-IN_CUST_CHRG_PSN_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0040010-KQ0040010form1-IN_CUST_CHRG_PSN_CD" name="IN_CUST_CHRG_PSN_CD" class="KQ0040010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aKQ0040010Struct.getIN_CUST_CHRG_PSN_CD()) %>" maxlength="10" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:68px;"></div><!--/td-->
<script class="expj-script-KQ0040010-KQ0040010form1-CHECK_2">
expj.KQ0040010.KQ0040010form1.CHECK_2 = {};
expj.KQ0040010.KQ0040010form1.CHECK_2.executeAllOnDecision = function () {
  console.log('execute KQ0040010form1/CHECK_2.onDecision');
  expj.KQ0040010.KQ0040010form1.executeAllOnDecision();
  expj.KQ0040010.executeAllOnDecision();
};
expj.KQ0040010.KQ0040010form1.CHECK_2.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010form1-CHECK_2').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0040010', 'KQ0040010form1', 'CHECK_2', this, 'CheckBox');
    }
  });
  expj.KQ0040010.KQ0040010form1.CHECK_2.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010form1.CHECK_2.executePScriptOnLoad = function () {
  console.log('execute KQ0040010form1/CHECK_2.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010form1-CHECK_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:80px;text-align:left;"><input type="checkbox" name="CHECK_2" value="true" <%= ("true".equals(TypeConverter.convert(aKQ0040010Struct.getCHECK_2())) || "".equals(TypeConverter.convert(aKQ0040010Struct.getCHECK_2())))?"checked=\"checked\"": "" %> class="KQ0040010-focus-move" id="expj-KQ0040010-KQ0040010form1-CHECK_2"><label for="expj-KQ0040010-KQ0040010form1-CHECK_2"><%=CoreTools.getRBString("Expj.FIXED_ODR",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_ODR_NO",rb)%></span><!-- 得意先注文番号 --></div><!--/td-->
<script class="expj-script-KQ0040010-KQ0040010form1-IN_CUST_ODR_NO">
expj.KQ0040010.KQ0040010form1.IN_CUST_ODR_NO = {};
expj.KQ0040010.KQ0040010form1.IN_CUST_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KQ0040010form1/IN_CUST_ODR_NO.onDecision');
  expj.KQ0040010.KQ0040010form1.executeAllOnDecision();
  expj.KQ0040010.executeAllOnDecision();
};
expj.KQ0040010.KQ0040010form1.IN_CUST_ODR_NO.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010form1-IN_CUST_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0040010', 'KQ0040010form1', 'IN_CUST_ODR_NO', this);
  });
  expj.KQ0040010.KQ0040010form1.IN_CUST_ODR_NO.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010form1.IN_CUST_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KQ0040010form1/IN_CUST_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010form1-IN_CUST_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0040010-KQ0040010form1-IN_CUST_ODR_NO" name="IN_CUST_ODR_NO" class="KQ0040010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aKQ0040010Struct.getIN_CUST_ODR_NO()) %>" maxlength="23" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:68px;"></div><!--/td-->
<div class="div-td" style="width:80px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KQ0040010-KQ0040010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0040010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-KQ0040010-KQ0040010form1-DOWNLOAD_FILE">
expj.KQ0040010.KQ0040010form1.DOWNLOAD_FILE = {};
expj.KQ0040010.KQ0040010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute KQ0040010form1/DOWNLOAD_FILE.onDecision');
  expj.KQ0040010.KQ0040010form1.executeAllOnDecision();
  expj.KQ0040010.executeAllOnDecision();
};
expj.KQ0040010.KQ0040010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0040010', 'KQ0040010form1', 'DOWNLOAD_FILE', this);
  });
  expj.KQ0040010.KQ0040010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute KQ0040010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb)%></span><!-- 指定納期 --></div><!--/td-->
<script class="expj-script-KQ0040010-KQ0040010form1-FROM_DESINATED_DLV_DATE">
expj.KQ0040010.KQ0040010form1.FROM_DESINATED_DLV_DATE = {};
expj.KQ0040010.KQ0040010form1.FROM_DESINATED_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute KQ0040010form1/FROM_DESINATED_DLV_DATE.onDecision');
  expj.KQ0040010.KQ0040010form1.executeAllOnDecision();
  expj.KQ0040010.executeAllOnDecision();
};
expj.KQ0040010.KQ0040010form1.FROM_DESINATED_DLV_DATE.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010form1-FROM_DESINATED_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0040010', 'KQ0040010form1', 'FROM_DESINATED_DLV_DATE', this);
  });
  expj.KQ0040010.KQ0040010form1.FROM_DESINATED_DLV_DATE.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010form1.FROM_DESINATED_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute KQ0040010form1/FROM_DESINATED_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010form1-FROM_DESINATED_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0040010-KQ0040010form1-FROM_DESINATED_DLV_DATE" name="FROM_DESINATED_DLV_DATE" class="KQ0040010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKQ0040010Struct.getFROM_DESINATED_DLV_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KQ0040010-KQ0040010form1-FROM_DESINATED_DLV_DATE_CALENDAR">
expj.KQ0040010.KQ0040010form1.FROM_DESINATED_DLV_DATE_CALENDAR = {};
// script1="onClick;0;CALENDAR;_KQ0040010form1/FROM_DESINATED_DLV_DATE"
expj.KQ0040010.KQ0040010form1.FROM_DESINATED_DLV_DATE_CALENDAR.onClick0 = function () {
  console.log('FROM_DESINATED_DLV_DATE_CALENDAR script1');
expj.common.pscript.executeCalendar('KQ0040010','KQ0040010form1','_KQ0040010form1/FROM_DESINATED_DLV_DATE');
};
expj.KQ0040010.KQ0040010form1.FROM_DESINATED_DLV_DATE_CALENDAR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0040010.KQ0040010form1.FROM_DESINATED_DLV_DATE_CALENDAR['onClick' + i])) {
        expj.KQ0040010.KQ0040010form1.FROM_DESINATED_DLV_DATE_CALENDAR['onClick' + i]();
      }
    }
  }
};
expj.KQ0040010.KQ0040010form1.FROM_DESINATED_DLV_DATE_CALENDAR.executeAllOnDecision = function () {
};
expj.KQ0040010.KQ0040010form1.FROM_DESINATED_DLV_DATE_CALENDAR.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010form1-FROM_DESINATED_DLV_DATE_CALENDAR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0040010', 'KQ0040010form1', 'FROM_DESINATED_DLV_DATE_CALENDAR', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KQ0040010','KQ0040010form1','_KQ0040010form1/FROM_DESINATED_DLV_DATE');
  expj.KQ0040010.KQ0040010form1.FROM_DESINATED_DLV_DATE_CALENDAR.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010form1.FROM_DESINATED_DLV_DATE_CALENDAR.executePScriptOnLoad = function () {
  console.log('execute KQ0040010form1/FROM_DESINATED_DLV_DATE_CALENDAR.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010form1-FROM_DESINATED_DLV_DATE_CALENDAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0040010-KQ0040010form1-FROM_DESINATED_DLV_DATE_CALENDAR" class="KQ0040010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:34px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:34px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KQ0040010-KQ0040010form1-TO_DESINATED_DLV_DATE">
expj.KQ0040010.KQ0040010form1.TO_DESINATED_DLV_DATE = {};
expj.KQ0040010.KQ0040010form1.TO_DESINATED_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute KQ0040010form1/TO_DESINATED_DLV_DATE.onDecision');
  expj.KQ0040010.KQ0040010form1.executeAllOnDecision();
  expj.KQ0040010.executeAllOnDecision();
};
expj.KQ0040010.KQ0040010form1.TO_DESINATED_DLV_DATE.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010form1-TO_DESINATED_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0040010', 'KQ0040010form1', 'TO_DESINATED_DLV_DATE', this);
  });
  expj.KQ0040010.KQ0040010form1.TO_DESINATED_DLV_DATE.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010form1.TO_DESINATED_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute KQ0040010form1/TO_DESINATED_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010form1-TO_DESINATED_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0040010-KQ0040010form1-TO_DESINATED_DLV_DATE" name="TO_DESINATED_DLV_DATE" class="KQ0040010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKQ0040010Struct.getTO_DESINATED_DLV_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KQ0040010-KQ0040010form1-TO_DESINATED_DLV_DATE_CALENDAR">
expj.KQ0040010.KQ0040010form1.TO_DESINATED_DLV_DATE_CALENDAR = {};
// script1="onClick;0;CALENDAR;_KQ0040010form1/TO_DESINATED_DLV_DATE"
expj.KQ0040010.KQ0040010form1.TO_DESINATED_DLV_DATE_CALENDAR.onClick0 = function () {
  console.log('TO_DESINATED_DLV_DATE_CALENDAR script1');
expj.common.pscript.executeCalendar('KQ0040010','KQ0040010form1','_KQ0040010form1/TO_DESINATED_DLV_DATE');
};
expj.KQ0040010.KQ0040010form1.TO_DESINATED_DLV_DATE_CALENDAR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0040010.KQ0040010form1.TO_DESINATED_DLV_DATE_CALENDAR['onClick' + i])) {
        expj.KQ0040010.KQ0040010form1.TO_DESINATED_DLV_DATE_CALENDAR['onClick' + i]();
      }
    }
  }
};
expj.KQ0040010.KQ0040010form1.TO_DESINATED_DLV_DATE_CALENDAR.executeAllOnDecision = function () {
};
expj.KQ0040010.KQ0040010form1.TO_DESINATED_DLV_DATE_CALENDAR.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010form1-TO_DESINATED_DLV_DATE_CALENDAR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0040010', 'KQ0040010form1', 'TO_DESINATED_DLV_DATE_CALENDAR', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KQ0040010','KQ0040010form1','_KQ0040010form1/TO_DESINATED_DLV_DATE');
  expj.KQ0040010.KQ0040010form1.TO_DESINATED_DLV_DATE_CALENDAR.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010form1.TO_DESINATED_DLV_DATE_CALENDAR.executePScriptOnLoad = function () {
  console.log('execute KQ0040010form1/TO_DESINATED_DLV_DATE_CALENDAR.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010form1-TO_DESINATED_DLV_DATE_CALENDAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0040010-KQ0040010form1-TO_DESINATED_DLV_DATE_CALENDAR" class="KQ0040010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:68px;"></div><!--/td-->
<script class="expj-script-KQ0040010-KQ0040010form1-CHECK_PRO_ODR">
expj.KQ0040010.KQ0040010form1.CHECK_PRO_ODR = {};
expj.KQ0040010.KQ0040010form1.CHECK_PRO_ODR.executeAllOnDecision = function () {
  console.log('execute KQ0040010form1/CHECK_PRO_ODR.onDecision');
  expj.KQ0040010.KQ0040010form1.executeAllOnDecision();
  expj.KQ0040010.executeAllOnDecision();
};
expj.KQ0040010.KQ0040010form1.CHECK_PRO_ODR.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010form1-CHECK_PRO_ODR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0040010', 'KQ0040010form1', 'CHECK_PRO_ODR', this, 'CheckBox');
    }
  });
  expj.KQ0040010.KQ0040010form1.CHECK_PRO_ODR.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010form1.CHECK_PRO_ODR.executePScriptOnLoad = function () {
  console.log('execute KQ0040010form1/CHECK_PRO_ODR.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010form1-CHECK_PRO_ODR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:80px;text-align:left;"><input type="checkbox" name="CHECK_PRO_ODR" value="true" <%= ("true".equals(TypeConverter.convert(aKQ0040010Struct.getCHECK_PRO_ODR())) || "1".equals(TypeConverter.convert(aKQ0040010Struct.getCHECK_PRO_ODR())))?"checked=\"checked\"":"" %>  class="KQ0040010-focus-move" id="expj-KQ0040010-KQ0040010form1-CHECK_PRO_ODR"><label for="expj-KQ0040010-KQ0040010form1-CHECK_PRO_ODR"><%=CoreTools.getRBString("Expj.PRO_ODR",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_ACPT_DATE",rb)%></span><!-- 受注日 --></div><!--/td-->
<script class="expj-script-KQ0040010-KQ0040010form1-FROM_ODR_ACPT_DATE">
expj.KQ0040010.KQ0040010form1.FROM_ODR_ACPT_DATE = {};
expj.KQ0040010.KQ0040010form1.FROM_ODR_ACPT_DATE.executeAllOnDecision = function () {
  console.log('execute KQ0040010form1/FROM_ODR_ACPT_DATE.onDecision');
  expj.KQ0040010.KQ0040010form1.executeAllOnDecision();
  expj.KQ0040010.executeAllOnDecision();
};
expj.KQ0040010.KQ0040010form1.FROM_ODR_ACPT_DATE.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010form1-FROM_ODR_ACPT_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0040010', 'KQ0040010form1', 'FROM_ODR_ACPT_DATE', this);
  });
  expj.KQ0040010.KQ0040010form1.FROM_ODR_ACPT_DATE.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010form1.FROM_ODR_ACPT_DATE.executePScriptOnLoad = function () {
  console.log('execute KQ0040010form1/FROM_ODR_ACPT_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010form1-FROM_ODR_ACPT_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0040010-KQ0040010form1-FROM_ODR_ACPT_DATE" name="FROM_ODR_ACPT_DATE" class="KQ0040010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKQ0040010Struct.getFROM_ODR_ACPT_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KQ0040010-KQ0040010form1-FROM_ODR_ACPT_DATE_CALENDAR">
expj.KQ0040010.KQ0040010form1.FROM_ODR_ACPT_DATE_CALENDAR = {};
// script1="onClick;0;CALENDAR;_KQ0040010form1/FROM_ODR_ACPT_DATE"
expj.KQ0040010.KQ0040010form1.FROM_ODR_ACPT_DATE_CALENDAR.onClick0 = function () {
  console.log('FROM_ODR_ACPT_DATE_CALENDAR script1');
expj.common.pscript.executeCalendar('KQ0040010','KQ0040010form1','_KQ0040010form1/FROM_ODR_ACPT_DATE');
};
expj.KQ0040010.KQ0040010form1.FROM_ODR_ACPT_DATE_CALENDAR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0040010.KQ0040010form1.FROM_ODR_ACPT_DATE_CALENDAR['onClick' + i])) {
        expj.KQ0040010.KQ0040010form1.FROM_ODR_ACPT_DATE_CALENDAR['onClick' + i]();
      }
    }
  }
};
expj.KQ0040010.KQ0040010form1.FROM_ODR_ACPT_DATE_CALENDAR.executeAllOnDecision = function () {
};
expj.KQ0040010.KQ0040010form1.FROM_ODR_ACPT_DATE_CALENDAR.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010form1-FROM_ODR_ACPT_DATE_CALENDAR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0040010', 'KQ0040010form1', 'FROM_ODR_ACPT_DATE_CALENDAR', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KQ0040010','KQ0040010form1','_KQ0040010form1/FROM_ODR_ACPT_DATE');
  expj.KQ0040010.KQ0040010form1.FROM_ODR_ACPT_DATE_CALENDAR.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010form1.FROM_ODR_ACPT_DATE_CALENDAR.executePScriptOnLoad = function () {
  console.log('execute KQ0040010form1/FROM_ODR_ACPT_DATE_CALENDAR.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010form1-FROM_ODR_ACPT_DATE_CALENDAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0040010-KQ0040010form1-FROM_ODR_ACPT_DATE_CALENDAR" class="KQ0040010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:34px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:34px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KQ0040010-KQ0040010form1-TO_ODR_ACPT_DATE">
expj.KQ0040010.KQ0040010form1.TO_ODR_ACPT_DATE = {};
expj.KQ0040010.KQ0040010form1.TO_ODR_ACPT_DATE.executeAllOnDecision = function () {
  console.log('execute KQ0040010form1/TO_ODR_ACPT_DATE.onDecision');
  expj.KQ0040010.KQ0040010form1.executeAllOnDecision();
  expj.KQ0040010.executeAllOnDecision();
};
expj.KQ0040010.KQ0040010form1.TO_ODR_ACPT_DATE.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010form1-TO_ODR_ACPT_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0040010', 'KQ0040010form1', 'TO_ODR_ACPT_DATE', this);
  });
  expj.KQ0040010.KQ0040010form1.TO_ODR_ACPT_DATE.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010form1.TO_ODR_ACPT_DATE.executePScriptOnLoad = function () {
  console.log('execute KQ0040010form1/TO_ODR_ACPT_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010form1-TO_ODR_ACPT_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0040010-KQ0040010form1-TO_ODR_ACPT_DATE" name="TO_ODR_ACPT_DATE" class="KQ0040010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKQ0040010Struct.getTO_ODR_ACPT_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KQ0040010-KQ0040010form1-TO_ODR_ACPT_DATE_CALENDAR">
expj.KQ0040010.KQ0040010form1.TO_ODR_ACPT_DATE_CALENDAR = {};
// script1="onClick;0;CALENDAR;_KQ0040010form1/TO_ODR_ACPT_DATE"
expj.KQ0040010.KQ0040010form1.TO_ODR_ACPT_DATE_CALENDAR.onClick0 = function () {
  console.log('TO_ODR_ACPT_DATE_CALENDAR script1');
expj.common.pscript.executeCalendar('KQ0040010','KQ0040010form1','_KQ0040010form1/TO_ODR_ACPT_DATE');
};
expj.KQ0040010.KQ0040010form1.TO_ODR_ACPT_DATE_CALENDAR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0040010.KQ0040010form1.TO_ODR_ACPT_DATE_CALENDAR['onClick' + i])) {
        expj.KQ0040010.KQ0040010form1.TO_ODR_ACPT_DATE_CALENDAR['onClick' + i]();
      }
    }
  }
};
expj.KQ0040010.KQ0040010form1.TO_ODR_ACPT_DATE_CALENDAR.executeAllOnDecision = function () {
};
expj.KQ0040010.KQ0040010form1.TO_ODR_ACPT_DATE_CALENDAR.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010form1-TO_ODR_ACPT_DATE_CALENDAR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0040010', 'KQ0040010form1', 'TO_ODR_ACPT_DATE_CALENDAR', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KQ0040010','KQ0040010form1','_KQ0040010form1/TO_ODR_ACPT_DATE');
  expj.KQ0040010.KQ0040010form1.TO_ODR_ACPT_DATE_CALENDAR.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010form1.TO_ODR_ACPT_DATE_CALENDAR.executePScriptOnLoad = function () {
  console.log('execute KQ0040010form1/TO_ODR_ACPT_DATE_CALENDAR.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010form1-TO_ODR_ACPT_DATE_CALENDAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0040010-KQ0040010form1-TO_ODR_ACPT_DATE_CALENDAR" class="KQ0040010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KQ0040010-KQ0040010button1">
expj.KQ0040010.KQ0040010button1 = {};
expj.KQ0040010.KQ0040010button1.executeAllOnDecision = function () {
  console.log('execute KQ0040010button1.onDecision');
};
expj.KQ0040010.KQ0040010button1.executeOnLoad = function () {
  expj.KQ0040010.KQ0040010button1.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010button1.executePScriptOnLoad = function () {
  console.log('execute KQ0040010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KQ0040010-KQ0040010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KQ0040010-KQ0040010button1-Select">
expj.KQ0040010.KQ0040010button1.Select = {};
// script1="onClick;0;CHK;_KQ0040010form1/FROM_DESINATED_DLV_DATE[neq][and]_KQ0040010form1/TO_DESINATED_DLV_DATE[neq][and]_KQ0040010form1/TO_DESINATED_DLV_DATE[lt]_KQ0040010form1/FROM_DESINATED_DLV_DATE@!KQ10317"
expj.KQ0040010.KQ0040010button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010button1', '_KQ0040010form1/FROM_DESINATED_DLV_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010button1', '_KQ0040010form1/TO_DESINATED_DLV_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010button1', '_KQ0040010form1/TO_DESINATED_DLV_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010button1', '_KQ0040010form1/FROM_DESINATED_DLV_DATE')))) {
expj.common.pscript.viewErrorMessage('KQ0040010', 'KQ0040010button1', 'KQ10317');
}
};
// script2="onClick;1;CHK;_KQ0040010form1/FROM_ODR_ACPT_DATE[neq][and]_KQ0040010form1/TO_ODR_ACPT_DATE[neq][and]_KQ0040010form1/TO_ODR_ACPT_DATE[lt]_KQ0040010form1/FROM_ODR_ACPT_DATE@!KQ10318"
expj.KQ0040010.KQ0040010button1.Select.onClick1 = function () {
  console.log('Select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010button1', '_KQ0040010form1/FROM_ODR_ACPT_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010button1', '_KQ0040010form1/TO_ODR_ACPT_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010button1', '_KQ0040010form1/TO_ODR_ACPT_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0040010', 'KQ0040010button1', '_KQ0040010form1/FROM_ODR_ACPT_DATE')))) {
expj.common.pscript.viewErrorMessage('KQ0040010', 'KQ0040010button1', 'KQ10318');
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0040010form1/*@KQ0040010Servlet"
expj.KQ0040010.KQ0040010button1.Select.onClick2 = function () {
  console.log('Select script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0040010', 'KQ0040010button1', '_KQ0040010form1/*', 'KQ0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0040010', response);
expj.common.updateBusinessScreenTab('KQ0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KQ0040010.KQ0040010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0040010.KQ0040010button1.Select['onClick' + i])) {
        expj.KQ0040010.KQ0040010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.KQ0040010.KQ0040010button1.Select.executeAllOnDecision = function () {
};
expj.KQ0040010.KQ0040010button1.Select.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0040010', 'KQ0040010button1', 'Select', this, 'Button');
    }
  });
  expj.KQ0040010.KQ0040010button1.Select.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010button1.Select.executePScriptOnLoad = function () {
  console.log('execute KQ0040010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0040010-KQ0040010button1-Select" name="Select" class="KQ0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KQ0040010-KQ0040010view1">
expj.KQ0040010.KQ0040010view1 = {};
expj.KQ0040010.KQ0040010view1.executeAllOnClick = function () {
};
expj.KQ0040010.KQ0040010view1.executeAllOnDecision = function () {
  console.log('execute KQ0040010view1.onDecision');
};
expj.KQ0040010.KQ0040010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("KQ0040010view1", "expj.KQ0040010.KQ0040010view1.executeAllOnClick");
%>
  expj.KQ0040010.KQ0040010view1.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010view1.executePScriptOnLoad = function () {
  console.log('execute KQ0040010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-KQ0040010-KQ0040010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%=TypeConverter.sanitizer(aKQ0040010Control.getReadStatus())%>"></div>
<!-- VIEW END -->
<%
 String KQ0040010view1_Id = "KQ0040010view1";
 String KQ0040010view1_select = "single";
 String KQ0040010view1_sortable = "true";
 String KQ0040010view1_resize = "true";
 String KQ0040010view1_scroll = "true";
 StringBuffer KQ0040010view1_HB = new StringBuffer();
 StringBuffer KQ0040010view1_DB = new StringBuffer();
%>
<%
 KQ0040010view1_select = "single";
 KQ0040010view1_sortable = "true";
 KQ0040010view1_resize = "true";
 KQ0040010view1_scroll = "true";
%>
<%
 KQ0040010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
%>
     
<%
KQ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_TYP",rb))).append("', 'name':'ODR_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ODR_NO",rb))).append("', 'name':'CUST_ODR_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_CD",rb))).append("', 'name':'CUST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_NAME",rb))).append("', 'name':'CUST_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_CD",rb))).append("', 'name':'CUST_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_NAME",rb))).append("', 'name':'CUST_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0468",rb))).append("', 'name':'CUST_CHRG_PSN_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_ACPT_PSN",rb))).append("', 'name':'ODR_ACPT_PSN_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb))).append("', 'name':'DESINATED_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_ACPT_DATE",rb))).append("', 'name':'ODR_ACPT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_QTY_4",rb))).append("', 'name':'ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_UNIT",rb))).append("', 'name':'UNIT_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNIT_COST",rb))).append("', 'name':'ODR_UNIT_PRICE', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_AMOUNT",rb))).append("', 'name':'ODR_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUR_UNIT",rb))).append("', 'name':'CUR_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.REMAIN_UNCONFIRM_ODR_QTY",rb))).append("', 'name':'REMAIN_UNCONFIRM_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNCONFIRM_ODR_BALANCE",rb))).append("', 'name':'UNCONFIRM_ODR_BALANCE', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNCONFIRM_ODR_AMOUNT",rb))).append("', 'name':'UNCONFIRM_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0469",rb))).append("', 'name':'UNCONFIRM_ODR_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DEPO_TYP",rb))).append("', 'name':'DEPO_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_ODR_CD",rb))).append("', 'name':'ODR_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROJECT_CD",rb))).append("', 'name':'PROJECT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ESTIMATES_CD",rb))).append("', 'name':'ESTIMATE_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DETAIL_NO",rb))).append("', 'name':'DETAL_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
KQ0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'PRO_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0040010view1_sortable).append("}").append(",");
%>
<%
 int aKQ0040010StructLength = aKQ0040010Control.getListsize();
 final KQ0040010Struct structBackup = aKQ0040010Struct;
 aKQ0040010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aKQ0040010StructLength; ++loopCount) {
  if((aKQ0040010Struct = (KQ0040010Struct) aKQ0040010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aKQ0040010Struct", aKQ0040010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 KQ0040010view1_DB.append("[");
 KQ0040010view1_DB.append(loopCount);
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-ODR_TYP-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-ODR_TYP\" data-name=\"ODR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getODR_TYP())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-CUST_ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-CUST_ODR_NO\" data-name=\"CUST_ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getCUST_ODR_NO())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-CUST_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-CUST_CD\" data-name=\"CUST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getCUST_CD())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-CUST_NAME-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-CUST_NAME\" data-name=\"CUST_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getCUST_NAME())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-CUST_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-CUST_ITEM_CD\" data-name=\"CUST_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getCUST_ITEM_CD())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-CUST_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-CUST_ITEM_NAME\" data-name=\"CUST_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getCUST_ITEM_NAME())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-CUST_CHRG_PSN_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-CUST_CHRG_PSN_CD\" data-name=\"CUST_CHRG_PSN_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getCUST_CHRG_PSN_CD())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-ODR_ACPT_PSN_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-ODR_ACPT_PSN_CD\" data-name=\"ODR_ACPT_PSN_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getODR_ACPT_PSN_CD())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-DESINATED_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-DESINATED_DLV_DATE\" data-name=\"DESINATED_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getDESINATED_DLV_DATE())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-ODR_ACPT_DATE-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-ODR_ACPT_DATE\" data-name=\"ODR_ACPT_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getODR_ACPT_DATE())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-ITEM_CD\" data-name=\"ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getITEM_CD())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getITEM_NAME())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-ODR_QTY\" data-name=\"ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;CEIL;4\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getODR_QTY())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-UNIT_NAME-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-UNIT_NAME\" data-name=\"UNIT_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getUNIT_NAME())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-ODR_UNIT_PRICE-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-ODR_UNIT_PRICE\" data-name=\"ODR_UNIT_PRICE\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getODR_UNIT_PRICE())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-ODR_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-ODR_AMOUNT\" data-name=\"ODR_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getODR_AMOUNT())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-CUR_UNIT-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-CUR_UNIT\" data-name=\"CUR_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getCUR_UNIT())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-REMAIN_UNCONFIRM_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-REMAIN_UNCONFIRM_ODR_QTY\" data-name=\"REMAIN_UNCONFIRM_ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;CEIL;4\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getREMAIN_UNCONFIRM_ODR_QTY())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-UNCONFIRM_ODR_BALANCE-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-UNCONFIRM_ODR_BALANCE\" data-name=\"UNCONFIRM_ODR_BALANCE\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getUNCONFIRM_ODR_BALANCE())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-UNCONFIRM_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-UNCONFIRM_ODR_QTY\" data-name=\"UNCONFIRM_ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;CEIL;4\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getUNCONFIRM_ODR_QTY())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-UNCONFIRM_ODR_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-UNCONFIRM_ODR_AMOUNT\" data-name=\"UNCONFIRM_ODR_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getUNCONFIRM_ODR_AMOUNT())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-DEPO_TYP-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-DEPO_TYP\" data-name=\"DEPO_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getDEPO_TYP())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-ODR_NO\" data-name=\"ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getODR_NO())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-JOB_ODR_CD\" data-name=\"JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getJOB_ODR_CD())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-PROJECT_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-PROJECT_CD\" data-name=\"PROJECT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getPROJECT_CD())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-ESTIMATE_NO-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-ESTIMATE_NO\" data-name=\"ESTIMATE_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getESTIMATE_NO())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-DETAL_NO-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-DETAL_NO\" data-name=\"DETAL_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getDETAL_NO())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-MODIFY_COUNT\" data-name=\"MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getMODIFY_COUNT())).append("</span>'");
 KQ0040010view1_DB.append(",").append("'<span id=\"expj-KQ0040010-KQ0040010view1-PRO_FLG-").append(loopCount).append("\" class=\"expj-label expj-KQ0040010-KQ0040010view1-PRO_FLG\" data-name=\"PRO_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0040010Struct.getPRO_FLG())).append("</span>'");
 KQ0040010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aKQ0040010StructLength) {
   KQ0040010view1_DB.append(",");
  }
 }
 aKQ0040010Struct = structBackup;
 viewIdList.add(KQ0040010view1_Id);
 viewSelectList.add(KQ0040010view1_select);
 viewResizeList.add(KQ0040010view1_resize);
 viewScrollList.add(KQ0040010view1_scroll);
 viewHeaderDataList.add(KQ0040010view1_HB);
 viewBodyDataList.add(KQ0040010view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:405px;"><script class="expj-script-KQ0040010-KQ0040010button2">
expj.KQ0040010.KQ0040010button2 = {};
expj.KQ0040010.KQ0040010button2.executeAllOnDecision = function () {
  console.log('execute KQ0040010button2.onDecision');
};
expj.KQ0040010.KQ0040010button2.executeOnLoad = function () {
  expj.KQ0040010.KQ0040010button2.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010button2.executePScriptOnLoad = function () {
  console.log('execute KQ0040010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KQ0040010-KQ0040010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:405px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KQ0040010-KQ0040010button2-GoSub">
expj.KQ0040010.KQ0040010button2.GoSub = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_KQ0040010view1/+@KQ0010020Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.KQ0040010.KQ0040010button2.GoSub.onClick0 = function () {
  console.log('GoSub script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0040010', 'KQ0040010button2', '_KQ0040010view1/+', 'KQ0010020Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('KQ0010020Servlet');
var response = expj.common.accessBusinessScreen('POST', 'KQ0010020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'KQ0040010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KQ0040010.KQ0040010button2.GoSub.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0040010.KQ0040010button2.GoSub['onClick' + i])) {
        expj.KQ0040010.KQ0040010button2.GoSub['onClick' + i]();
      }
    }
  }
};
expj.KQ0040010.KQ0040010button2.GoSub.executeAllOnDecision = function () {
};
expj.KQ0040010.KQ0040010button2.GoSub.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010button2-GoSub').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0040010', 'KQ0040010button2', 'GoSub', this, 'Button');
    }
  });
  expj.KQ0040010.KQ0040010button2.GoSub.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010button2.GoSub.executePScriptOnLoad = function () {
  console.log('execute KQ0040010button2/GoSub.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010button2-GoSub');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(130px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0040010-KQ0040010button2-GoSub" name="GoSub" class="KQ0040010-focus-move" style="width:130px;"><%=CoreTools.getRBString("Expj.BtnSalesOdrMaintenance",rb)%></button><!-- 受注情報修正ボタン --></div><!--/td-->
<script class="expj-script-KQ0040010-KQ0040010button2-GoSub2">
expj.KQ0040010.KQ0040010button2.GoSub2 = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_KQ0040010view1/+@KQ0090010Servlet,<%=contextNo%>,<%=su2.getScreenName()%>,<%=su2.getScreenID()%>"
expj.KQ0040010.KQ0040010button2.GoSub2.onClick0 = function () {
  console.log('GoSub2 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0040010', 'KQ0040010button2', '_KQ0040010view1/+', 'KQ0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su2.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('KQ0090010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'KQ0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su2.getScreenName()%>', contents, 'KQ0040010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KQ0040010.KQ0040010button2.GoSub2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0040010.KQ0040010button2.GoSub2['onClick' + i])) {
        expj.KQ0040010.KQ0040010button2.GoSub2['onClick' + i]();
      }
    }
  }
};
expj.KQ0040010.KQ0040010button2.GoSub2.executeAllOnDecision = function () {
};
expj.KQ0040010.KQ0040010button2.GoSub2.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010button2-GoSub2').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0040010', 'KQ0040010button2', 'GoSub2', this, 'Button');
    }
  });
  expj.KQ0040010.KQ0040010button2.GoSub2.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010button2.GoSub2.executePScriptOnLoad = function () {
  console.log('execute KQ0040010button2/GoSub2.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010button2-GoSub2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(130px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0040010-KQ0040010button2-GoSub2" name="GoSub2" class="KQ0040010-focus-move" style="width:130px;"><%=CoreTools.getRBString("Expj.BtnPROJECT_ORDER_EDIT_UNSTOCK_SALES",rb)%></button><!-- 受注修正(非在庫品)ボタン --></div><!--/td-->
<script class="expj-script-KQ0040010-KQ0040010button2-GoSub3">
expj.KQ0040010.KQ0040010button2.GoSub3 = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_KQ0040010view1/+@KM0030010Servlet,<%=contextNo%>,<%=su3.getScreenName()%>,<%=su3.getScreenID()%>"
expj.KQ0040010.KQ0040010button2.GoSub3.onClick0 = function () {
  console.log('GoSub3 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0040010', 'KQ0040010button2', '_KQ0040010view1/+', 'KM0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su3.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('KM0030010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'KM0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su3.getScreenName()%>', contents, 'KQ0040010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KQ0040010.KQ0040010button2.GoSub3.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0040010.KQ0040010button2.GoSub3['onClick' + i])) {
        expj.KQ0040010.KQ0040010button2.GoSub3['onClick' + i]();
      }
    }
  }
};
expj.KQ0040010.KQ0040010button2.GoSub3.executeAllOnDecision = function () {
};
expj.KQ0040010.KQ0040010button2.GoSub3.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010button2-GoSub3').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0040010', 'KQ0040010button2', 'GoSub3', this, 'Button');
    }
  });
  expj.KQ0040010.KQ0040010button2.GoSub3.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010button2.GoSub3.executePScriptOnLoad = function () {
  console.log('execute KQ0040010button2/GoSub3.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010button2-GoSub3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(130px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0040010-KQ0040010button2-GoSub3" name="GoSub3" class="KQ0040010-focus-move" style="width:130px;"><%=CoreTools.getRBString("Expj.BtnPROJECT_ORDER_EDIT",rb)%></button><!-- 案件受注修正ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 489px);"></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">KQ0040010 Revision: 1.6  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-KQ0040010-KQ0040010button0">
expj.KQ0040010.KQ0040010button0 = {};
expj.KQ0040010.KQ0040010button0.executeAllOnDecision = function () {
  console.log('execute KQ0040010button0.onDecision');
};
expj.KQ0040010.KQ0040010button0.executeOnLoad = function () {
  expj.KQ0040010.KQ0040010button0.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010button0.executePScriptOnLoad = function () {
  console.log('execute KQ0040010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KQ0040010-KQ0040010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KQ0040010-KQ0040010button0-CSVOut">
expj.KQ0040010.KQ0040010button0.CSVOut = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0040010form1/*@KQ0040010Servlet,,$ZZ07011"
expj.KQ0040010.KQ0040010button0.CSVOut.onClick0 = function () {
  console.log('CSVOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0040010', 'KQ0040010button0', '_KQ0040010form1/*', 'KQ0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0040010', response);
expj.common.updateBusinessScreenTab('KQ0040010', contents);
};
expj.common.pscript.callConfirm('KQ0040010', 'KQ0040010button0', 'ZZ07011', okEvent);
};
expj.KQ0040010.KQ0040010button0.CSVOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0040010.KQ0040010button0.CSVOut['onClick' + i])) {
        expj.KQ0040010.KQ0040010button0.CSVOut['onClick' + i]();
      }
    }
  }
};
expj.KQ0040010.KQ0040010button0.CSVOut.executeAllOnDecision = function () {
};
expj.KQ0040010.KQ0040010button0.CSVOut.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010button0-CSVOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0040010', 'KQ0040010button0', 'CSVOut', this, 'Button');
    }
  });
  expj.KQ0040010.KQ0040010button0.CSVOut.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010button0.CSVOut.executePScriptOnLoad = function () {
  console.log('execute KQ0040010button0/CSVOut.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010button0-CSVOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0040010-KQ0040010button0-CSVOut" name="CSVOut" class="KQ0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-KQ0040010-KQ0040010button0-Clear">
expj.KQ0040010.KQ0040010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KQ0040010Servlet,,$ZZ07008"
expj.KQ0040010.KQ0040010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0040010', 'KQ0040010button0', '', 'KQ0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0040010', response);
expj.common.updateBusinessScreenTab('KQ0040010', contents);
};
expj.common.pscript.callConfirm('KQ0040010', 'KQ0040010button0', 'ZZ07008', okEvent);
};
expj.KQ0040010.KQ0040010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0040010.KQ0040010button0.Clear['onClick' + i])) {
        expj.KQ0040010.KQ0040010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KQ0040010.KQ0040010button0.Clear.executeAllOnDecision = function () {
};
expj.KQ0040010.KQ0040010button0.Clear.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0040010', 'KQ0040010button0', 'Clear', this, 'Button');
    }
  });
  expj.KQ0040010.KQ0040010button0.Clear.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KQ0040010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0040010-KQ0040010button0-Clear" name="Clear" class="KQ0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KQ0040010-KQ0040010button0-Close">
expj.KQ0040010.KQ0040010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KQ0040010.KQ0040010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KQ0040010');
};
expj.KQ0040010.KQ0040010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0040010.KQ0040010button0.Close['onClick' + i])) {
        expj.KQ0040010.KQ0040010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KQ0040010.KQ0040010button0.Close.executeAllOnDecision = function () {
};
expj.KQ0040010.KQ0040010button0.Close.executeOnLoad = function () {
  $('#expj-KQ0040010-KQ0040010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0040010', 'KQ0040010button0', 'Close', this, 'Button');
    }
  });
  expj.KQ0040010.KQ0040010button0.Close.executePScriptOnLoad();
};

expj.KQ0040010.KQ0040010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KQ0040010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KQ0040010-KQ0040010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0040010-KQ0040010button0-Close" name="Close" class="KQ0040010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KQ0040010 (END)-->
<%
MessageStruct msgStruct = aKQ0040010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KQ0040010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KQ0040010)) {
  expj.common.treeInstanceMap.KQ0040010 = {};
}
expj.common.treeInstanceMap.KQ0040010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KQ0040010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KQ0040010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KQ0040010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KQ0040010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KQ0040010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KQ0040010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KQ0040010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KQ0040010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KQ0040010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KQ0040010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0040010)) {
  expj.common.detailDialogMap.KQ0040010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0040010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KQ0040010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0040010.<%=detailId %>)) {
  expj.common.detailDialogMap.KQ0040010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0040010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KQ0040010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0040010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KQ0040010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KQ0040010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KQ0040010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KQ0040010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KQ0040010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KQ0040010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KQ0040010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KQ0040010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KQ0040010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KQ0040010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KQ0040010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KQ0040010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KQ0040010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KQ0040010)) {
  expj.common.viewInstanceMap.KQ0040010 = {};
}
expj.common.viewInstanceMap.KQ0040010.<%=viewId %> = {};
expj.common.viewInstanceMap.KQ0040010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KQ0040010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KQ0040010.<%=viewId %>.init = function () {
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
    expj.KQ0040010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KQ0040010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KQ0040010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KQ0040010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KQ0040010_init">
/**
 * KQ0040010用のロード完了時初期化関数
 */
expj.KQ0040010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KQ0040010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KQ0040010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KQ0040010');
  expj.common.calendarInstanceMap.KQ0040010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KQ0040010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KQ0040010.<%=detailId %>.init();
  expj.common.detailDialogMap.KQ0040010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KQ0040010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KQ0040010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KQ0040010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KQ0040010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KQ0040010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KQ0040010-<%=detailId %>');
<%
 }
%>
  try{expj.KQ0040010.KQ0040010form1.IN_CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010form1.PeekerIN_CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010form1.CHECK_4.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010form1.IN_CUST_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010form1.CHECK_1.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010form1.IN_CUST_CHRG_PSN_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010form1.CHECK_2.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010form1.IN_CUST_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010form1.FROM_DESINATED_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010form1.FROM_DESINATED_DLV_DATE_CALENDAR.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010form1.TO_DESINATED_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010form1.TO_DESINATED_DLV_DATE_CALENDAR.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010form1.CHECK_PRO_ODR.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010form1.FROM_ODR_ACPT_DATE.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010form1.FROM_ODR_ACPT_DATE_CALENDAR.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010form1.TO_ODR_ACPT_DATE.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010form1.TO_ODR_ACPT_DATE_CALENDAR.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010button1.Select.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010button2.GoSub.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010button2.GoSub2.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010button2.GoSub3.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010button0.CSVOut.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010form1.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010button1.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010view1.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010button2.executeOnLoad();}catch(e){};
  try{expj.KQ0040010.KQ0040010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KQ0040010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KQ0040010', 'KQ0040010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KQ0040010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KQ0040010-focus-move');
  // 初期フォーカス当てる処理
  $('.KQ0040010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KQ0040010', '<%=request.getContextPath() %>');
};

/**
 * KQ0040010の全体onDecision処理
 */
expj.KQ0040010.executeAllOnDecision = function () {
  expj.KQ0040010.KQ0040010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KQ0040010_console">
expj.KQ0040010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>