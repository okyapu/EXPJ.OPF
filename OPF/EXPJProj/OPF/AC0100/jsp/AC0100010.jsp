<%-- ***
This file is generated
 GeneratedDate  : Tue Apr 25 14:29:25 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj_WK\OPF\AC0100\AC0100010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AC0100.*" %>
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
<jsp:useBean id="aAC0100010Control" class="com.nec.jp.orteus.metamorBase.AC0100.AC0100010Control" scope="request"/>
<jsp:useBean id="aAC0100010Struct" class="com.nec.jp.orteus.metamorBase.AC0100.AC0100010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

製番引当メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0100/jsp/AC0100010.jsp,v $
$Author: xu-jing $	
$Revision: 1.21 $ $Date: 2017/04/27 08:36:49 $
********************************************************* --%>
<html>
<head>
<title>製番引当メンテナンス</title>
<%@include file="common/expj_v5.jsp" %>
<%
ScreenMoveUtil su = new ScreenMoveUtil("AC0100010Servlet", so);
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
<script class="expj-script-AC0100010_init">
  // AC0100010名前空間
  expj.AC0100010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AC0100010" data-screen="AC0100010" data-newdata="<%=aAC0100010Control.isNewData() %>">
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
              <script class="expj-script-AC0100010-AC0100010form1">
expj.AC0100010.AC0100010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.AC0100010.AC0100010form1.onLoad0 = function () {
  console.log('AC0100010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHKRQ;?AC0100010view1/?[neq]NOT_SELECTED@*0,*2"
expj.AC0100010.AC0100010form1.onDecision0 = function () {
  console.log('AC0100010form1 script2');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '?AC0100010view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;0;CHK;?AC0100010form1/JOB_ODR_CD[eq]SAME[and]?AC0100010form1/JOB_ODR_CANCEL_NO[eq]SAME[and]?AC0100010form1/ITEM_CD[eq]SAME[and]?AC0100010form1/OD_NO[eq]SAME[and]?AC0100010form1/*[eq]NORMAL@*1,*2"
expj.AC0100010.AC0100010form1.child0 = function () {
  console.log('AC0100010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '?AC0100010form1/JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '?AC0100010form1/JOB_ODR_CANCEL_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '?AC0100010form1/ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '?AC0100010form1/OD_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '?AC0100010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="child;1;UNMASK;_AC0100010button2/AlcUpdate"
expj.AC0100010.AC0100010form1.child1 = function () {
  console.log('AC0100010form1 script4');
expj.common.pscript.setUnMaskToReferenceComponent('AC0100010', 'AC0100010form1', '_AC0100010button2/AlcUpdate');
};
// script5="child;2;MASK;_AC0100010button2/AlcUpdate"
expj.AC0100010.AC0100010form1.child2 = function () {
  console.log('AC0100010form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AC0100010', 'AC0100010form1', '_AC0100010button2/AlcUpdate');
};
// script6="onDecision;1;CHKRQ;?AC0100010view1/?[neq]NOT_SELECTED@*3,*6"
expj.AC0100010.AC0100010form1.onDecision1 = function () {
  console.log('AC0100010form1 script6');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '?AC0100010view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script7="child;3;CHK;?AC0100010form1/JOB_ODR_CD[eq]SAME[and]?AC0100010form1/JOB_ODR_CANCEL_NO[eq]SAME[and]?AC0100010form1/ITEM_CD[eq]SAME[and]?AC0100010form1/OD_NO[eq]SAME[and]?AC0100010form1/*[eq]NORMAL@*4,*6"
expj.AC0100010.AC0100010form1.child3 = function () {
  console.log('AC0100010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '?AC0100010form1/JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '?AC0100010form1/JOB_ODR_CANCEL_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '?AC0100010form1/ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '?AC0100010form1/OD_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '?AC0100010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script8="child;4;CHK;_AC0100010view1/l_ALC_TYP_2[neq]3@*5,*6"
expj.AC0100010.AC0100010form1.child4 = function () {
  console.log('AC0100010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '_AC0100010view1/l_ALC_TYP_2'), '[neq]', '3')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script9="child;5;UNMASK;_AC0100010button2/AlcUpdate,_AC0100010button2/AlcDelete"
expj.AC0100010.AC0100010form1.child5 = function () {
  console.log('AC0100010form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('AC0100010', 'AC0100010form1', '_AC0100010button2/AlcUpdate');
expj.common.pscript.setUnMaskToReferenceComponent('AC0100010', 'AC0100010form1', '_AC0100010button2/AlcDelete');
};
// script10="child;6;MASK;_AC0100010button2/AlcUpdate,_AC0100010button2/AlcDelete"
expj.AC0100010.AC0100010form1.child6 = function () {
  console.log('AC0100010form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AC0100010', 'AC0100010form1', '_AC0100010button2/AlcUpdate');
expj.common.pscript.setMaskToReferenceComponent('AC0100010', 'AC0100010form1', '_AC0100010button2/AlcDelete');
};
// script11="onDecision;2;CHKRQ;?AC0100010view2/?[neq]NOT_SELECTED@*7,*9"
expj.AC0100010.AC0100010form1.onDecision2 = function () {
  console.log('AC0100010form1 script11');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '?AC0100010view2/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script12="child;7;CHK;?AC0100010form1/JOB_ODR_CD[eq]SAME[and]?AC0100010form1/JOB_ODR_CANCEL_NO[eq]SAME[and]?AC0100010form1/ITEM_CD[eq]SAME[and]?AC0100010form1/OD_NO[eq]SAME[and]?AC0100010form1/*[eq]NORMAL@*8,*9"
expj.AC0100010.AC0100010form1.child7 = function () {
  console.log('AC0100010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '?AC0100010form1/JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '?AC0100010form1/JOB_ODR_CANCEL_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '?AC0100010form1/ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '?AC0100010form1/OD_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '?AC0100010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script13="child;8;UNMASK;_AC0100010button3/AlcInsert"
expj.AC0100010.AC0100010form1.child8 = function () {
  console.log('AC0100010form1 script13');
expj.common.pscript.setUnMaskToReferenceComponent('AC0100010', 'AC0100010form1', '_AC0100010button3/AlcInsert');
};
// script14="child;9;MASK;_AC0100010button3/AlcInsert"
expj.AC0100010.AC0100010form1.child9 = function () {
  console.log('AC0100010form1 script14');
expj.common.pscript.setMaskToReferenceComponent('AC0100010', 'AC0100010form1', '_AC0100010button3/AlcInsert');
};
// script15="onDecision;3;CHKRQ;A@*10,*11"
expj.AC0100010.AC0100010form1.onDecision3 = function () {
  console.log('AC0100010form1 script15');
if (expj.common.pscript.satisfiedRequiredComponent('AC0100010', 'A')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script16="child;10;UNMASK;_AC0100010button1/Select"
expj.AC0100010.AC0100010form1.child10 = function () {
  console.log('AC0100010form1 script16');
expj.common.pscript.setUnMaskToReferenceComponent('AC0100010', 'AC0100010form1', '_AC0100010button1/Select');
};
// script17="child;11;MASK;_AC0100010button1/Select"
expj.AC0100010.AC0100010form1.child11 = function () {
  console.log('AC0100010form1 script17');
expj.common.pscript.setMaskToReferenceComponent('AC0100010', 'AC0100010form1', '_AC0100010button1/Select');
};
expj.AC0100010.AC0100010form1.executeAllOnDecision = function () {
  console.log('execute AC0100010form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0100010.AC0100010form1['onDecision' + i])) {
        expj.AC0100010.AC0100010form1['onDecision' + i]();
      }
    }
  }
};
expj.AC0100010.AC0100010form1.executeOnLoad = function () {
  expj.AC0100010.AC0100010form1.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form1.executePScriptOnLoad = function () {
  console.log('execute AC0100010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AC0100010.AC0100010form1['onLoad' + i])) {
      expj.AC0100010.AC0100010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AC0100010-AC0100010form1" action="AC0100010Servlet" name="AC0100010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAC0100010Control.getReadStatusString()) %>" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.JOB_ODR_CD_2",rb)%></span><!-- 引当元製番 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100010form1-JOB_ODR_CD">
expj.AC0100010.AC0100010form1.JOB_ODR_CD = {};
expj.AC0100010.AC0100010form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AC0100010form1/JOB_ODR_CD.onDecision');
  expj.AC0100010.AC0100010form1.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form1', 'JOB_ODR_CD', this);
  });
  expj.AC0100010.AC0100010form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AC0100010form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100010form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AC0100010-focus-move  required-value expj-AC0100010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AC0100010-AC0100010form1-PeekerJobOdrCd">
expj.AC0100010.AC0100010form1.PeekerJobOdrCd = {};
// script1="onClick;0;PEEKER;_AC0100010form1/JOB_ODR_CD@<%=contextNo%>"
expj.AC0100010.AC0100010form1.PeekerJobOdrCd.onClick0 = function () {
  console.log('PeekerJobOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0100010';
var parameterValues = 'PeekerJobOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AC0100010', 'PeekerJobOdrCd', 'SQLPARAM_1', '<%=aAC0100010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '_AC0100010form1/JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_04%&%';
parameterValues += 'TARGET_FIELD%=%_AC0100010form1/JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0100010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0100010.AC0100010form1.PeekerJobOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0100010.AC0100010form1.PeekerJobOdrCd['onClick' + i])) {
        expj.AC0100010.AC0100010form1.PeekerJobOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AC0100010.AC0100010form1.PeekerJobOdrCd.executeAllOnDecision = function () {
};
expj.AC0100010.AC0100010form1.PeekerJobOdrCd.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form1-PeekerJobOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0100010', 'AC0100010form1', 'PeekerJobOdrCd', this, 'Button');
    }
  });
  expj.AC0100010.AC0100010form1.PeekerJobOdrCd.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form1.PeekerJobOdrCd.executePScriptOnLoad = function () {
  console.log('execute AC0100010form1/PeekerJobOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form1-PeekerJobOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0100010-AC0100010form1-PeekerJobOdrCd" class="AC0100010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CANCEL_NO",rb)%></span><!-- 製番取消発生番号 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100010form1-JOB_ODR_CANCEL_NO">
expj.AC0100010.AC0100010form1.JOB_ODR_CANCEL_NO = {};
expj.AC0100010.AC0100010form1.JOB_ODR_CANCEL_NO.executeAllOnDecision = function () {
  console.log('execute AC0100010form1/JOB_ODR_CANCEL_NO.onDecision');
  expj.AC0100010.AC0100010form1.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form1.JOB_ODR_CANCEL_NO.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form1-JOB_ODR_CANCEL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form1', 'JOB_ODR_CANCEL_NO', this);
  });
  expj.AC0100010.AC0100010form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad = function () {
  console.log('execute AC0100010form1/JOB_ODR_CANCEL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form1-JOB_ODR_CANCEL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100010form1-JOB_ODR_CANCEL_NO" name="JOB_ODR_CANCEL_NO" class="AC0100010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getJOB_ODR_CANCEL_NO()) %>" maxlength="6" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100010form1-ITEM_CD">
expj.AC0100010.AC0100010form1.ITEM_CD = {};
expj.AC0100010.AC0100010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AC0100010form1/ITEM_CD.onDecision');
  expj.AC0100010.AC0100010form1.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form1', 'ITEM_CD', this);
  });
  expj.AC0100010.AC0100010form1.ITEM_CD.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AC0100010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100010form1-ITEM_CD" name="ITEM_CD" class="AC0100010-focus-move  required-value expj-AC0100010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AC0100010-AC0100010form1-PeekerItemCd">
expj.AC0100010.AC0100010form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AC0100010form1/ITEM_CD@<%=contextNo%>"
expj.AC0100010.AC0100010form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0100010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '_AC0100010form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_05%&%';
parameterValues += 'TARGET_FIELD%=%_AC0100010form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0100010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0100010.AC0100010form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0100010.AC0100010form1.PeekerItemCd['onClick' + i])) {
        expj.AC0100010.AC0100010form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AC0100010.AC0100010form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AC0100010.AC0100010form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0100010', 'AC0100010form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AC0100010.AC0100010form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AC0100010form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0100010-AC0100010form1-PeekerItemCd" class="AC0100010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AC0100010-AC0100010form1-ITEM_NAME">
expj.AC0100010.AC0100010form1.ITEM_NAME = {};
expj.AC0100010.AC0100010form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AC0100010form1/ITEM_NAME.onDecision');
  expj.AC0100010.AC0100010form1.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form1', 'ITEM_NAME', this);
  });
  expj.AC0100010.AC0100010form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AC0100010form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100010form1-ITEM_NAME" name="ITEM_NAME" class="AC0100010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OD_NO",rb)%></span><!-- オーダデマンド番号 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100010form1-OD_NO">
expj.AC0100010.AC0100010form1.OD_NO = {};
expj.AC0100010.AC0100010form1.OD_NO.executeAllOnDecision = function () {
  console.log('execute AC0100010form1/OD_NO.onDecision');
  expj.AC0100010.AC0100010form1.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form1.OD_NO.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form1-OD_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form1', 'OD_NO', this);
  });
  expj.AC0100010.AC0100010form1.OD_NO.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form1.OD_NO.executePScriptOnLoad = function () {
  console.log('execute AC0100010form1/OD_NO.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form1-OD_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100010form1-OD_NO" name="OD_NO" class="AC0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getOD_NO()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AC0100010-AC0100010form1-PeekerOdNo">
expj.AC0100010.AC0100010form1.PeekerOdNo = {};
// script1="onClick;0;PEEKER;_AC0100010form1/OD_NO@<%=contextNo%>"
expj.AC0100010.AC0100010form1.PeekerOdNo.onClick0 = function () {
  console.log('PeekerOdNo script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0100010';
var parameterValues = 'PeekerOdNo%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AC0100010', 'PeekerOdNo', 'SQLPARAM_1', '<%=aAC0100010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '_AC0100010form1/OD_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_3%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '_AC0100010form1/JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_4%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '_AC0100010form1/JOB_ODR_CANCEL_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_5%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100010form1', '_AC0100010form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%OD_NO_01%&%';
parameterValues += 'TARGET_FIELD%=%_AC0100010form1/OD_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0100010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0100010.AC0100010form1.PeekerOdNo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0100010.AC0100010form1.PeekerOdNo['onClick' + i])) {
        expj.AC0100010.AC0100010form1.PeekerOdNo['onClick' + i]();
      }
    }
  }
};
expj.AC0100010.AC0100010form1.PeekerOdNo.executeAllOnDecision = function () {
};
expj.AC0100010.AC0100010form1.PeekerOdNo.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form1-PeekerOdNo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0100010', 'AC0100010form1', 'PeekerOdNo', this, 'Button');
    }
  });
  expj.AC0100010.AC0100010form1.PeekerOdNo.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form1.PeekerOdNo.executePScriptOnLoad = function () {
  console.log('execute AC0100010form1/PeekerOdNo.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form1-PeekerOdNo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0100010-AC0100010form1-PeekerOdNo" class="AC0100010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<input type="hidden" id="expj-AC0100010-AC0100010form1-h_OD_NO" name="h_OD_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0100010Struct.geth_OD_NO()) %>">
<script class="expj-script-AC0100010-AC0100010form1-h_OD_NO">
expj.AC0100010.AC0100010form1.h_OD_NO = {};
expj.AC0100010.AC0100010form1.h_OD_NO.executeAllOnDecision = function () {
  console.log('execute AC0100010form1/h_OD_NO.onDecision');
  expj.AC0100010.AC0100010form1.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form1.h_OD_NO.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form1-h_OD_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form1', 'h_OD_NO', this);
  });
  expj.AC0100010.AC0100010form1.h_OD_NO.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form1.h_OD_NO.executePScriptOnLoad = function () {
  console.log('execute AC0100010form1/h_OD_NO.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form1-h_OD_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AC0100010-AC0100010button1">
expj.AC0100010.AC0100010button1 = {};
expj.AC0100010.AC0100010button1.executeAllOnDecision = function () {
  console.log('execute AC0100010button1.onDecision');
};
expj.AC0100010.AC0100010button1.executeOnLoad = function () {
  expj.AC0100010.AC0100010button1.executePScriptOnLoad();
};

expj.AC0100010.AC0100010button1.executePScriptOnLoad = function () {
  console.log('execute AC0100010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0100010-AC0100010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0100010-AC0100010button1-Select">
expj.AC0100010.AC0100010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0100010form1/*@AC0100010Servlet"
expj.AC0100010.AC0100010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0100010', 'AC0100010button1', '_AC0100010form1/*', 'AC0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0100010', response);
expj.common.updateBusinessScreenTab('AC0100010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AC0100010.AC0100010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0100010.AC0100010button1.Select['onClick' + i])) {
        expj.AC0100010.AC0100010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AC0100010.AC0100010button1.Select.executeAllOnDecision = function () {
};
expj.AC0100010.AC0100010button1.Select.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0100010', 'AC0100010button1', 'Select', this, 'Button');
    }
  });
  expj.AC0100010.AC0100010button1.Select.executePScriptOnLoad();
};

expj.AC0100010.AC0100010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AC0100010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0100010-AC0100010button1-Select" name="Select" class="AC0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><!-- ここに上段検索条件用のDataGridを配置する。↓ --><script class="expj-script-AC0100010-AC0100010form2">
expj.AC0100010.AC0100010form2 = {};
expj.AC0100010.AC0100010form2.executeAllOnDecision = function () {
  console.log('execute AC0100010form2.onDecision');
};
expj.AC0100010.AC0100010form2.executeOnLoad = function () {
  expj.AC0100010.AC0100010form2.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form2.executePScriptOnLoad = function () {
  console.log('execute AC0100010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AC0100010-AC0100010form2" action="AC0100010Servlet" name="AC0100010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:96px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:96px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DM_QTY_1",rb)%></span><!-- 要求数 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100010form2-DM_QTY">
expj.AC0100010.AC0100010form2.DM_QTY = {};
expj.AC0100010.AC0100010form2.DM_QTY.executeAllOnDecision = function () {
  console.log('execute AC0100010form2/DM_QTY.onDecision');
  expj.AC0100010.AC0100010form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form2.DM_QTY.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form2-DM_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form2', 'DM_QTY', this);
  });
  expj.AC0100010.AC0100010form2.DM_QTY.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form2.DM_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0100010form2/DM_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form2-DM_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100010form2-DM_QTY" name="DM_QTY" class="AC0100010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getDM_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0100010-AC0100010form2-STOCK_UNIT">
expj.AC0100010.AC0100010form2.STOCK_UNIT = {};
expj.AC0100010.AC0100010form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AC0100010form2/STOCK_UNIT.onDecision');
  expj.AC0100010.AC0100010form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form2', 'STOCK_UNIT', this);
  });
  expj.AC0100010.AC0100010form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AC0100010form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100010form2-STOCK_UNIT" name="STOCK_UNIT" class="AC0100010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0352",rb)%></span><!-- 引当可能数合計 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100010form2-SUM_OF_ALLOCATABLE_QTY">
expj.AC0100010.AC0100010form2.SUM_OF_ALLOCATABLE_QTY = {};
expj.AC0100010.AC0100010form2.SUM_OF_ALLOCATABLE_QTY.executeAllOnDecision = function () {
  console.log('execute AC0100010form2/SUM_OF_ALLOCATABLE_QTY.onDecision');
  expj.AC0100010.AC0100010form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form2.SUM_OF_ALLOCATABLE_QTY.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form2-SUM_OF_ALLOCATABLE_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form2', 'SUM_OF_ALLOCATABLE_QTY', this);
  });
  expj.AC0100010.AC0100010form2.SUM_OF_ALLOCATABLE_QTY.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form2.SUM_OF_ALLOCATABLE_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0100010form2/SUM_OF_ALLOCATABLE_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form2-SUM_OF_ALLOCATABLE_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100010form2-SUM_OF_ALLOCATABLE_QTY" name="SUM_OF_ALLOCATABLE_QTY" class="AC0100010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getSUM_OF_ALLOCATABLE_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0100010-AC0100010form2-STOCK_UNIT_3">
expj.AC0100010.AC0100010form2.STOCK_UNIT_3 = {};
expj.AC0100010.AC0100010form2.STOCK_UNIT_3.executeAllOnDecision = function () {
  console.log('execute AC0100010form2/STOCK_UNIT_3.onDecision');
  expj.AC0100010.AC0100010form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form2.STOCK_UNIT_3.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form2-STOCK_UNIT_3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form2', 'STOCK_UNIT_3', this);
  });
  expj.AC0100010.AC0100010form2.STOCK_UNIT_3.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form2.STOCK_UNIT_3.executePScriptOnLoad = function () {
  console.log('execute AC0100010form2/STOCK_UNIT_3.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form2-STOCK_UNIT_3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100010form2-STOCK_UNIT_3" name="STOCK_UNIT_3" class="AC0100010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getSTOCK_UNIT_3()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AC0100010-AC0100010form2-JOB_ODR_EXP_TYP" name="JOB_ODR_EXP_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getJOB_ODR_EXP_TYP()) %>">
<script class="expj-script-AC0100010-AC0100010form2-JOB_ODR_EXP_TYP">
expj.AC0100010.AC0100010form2.JOB_ODR_EXP_TYP = {};
expj.AC0100010.AC0100010form2.JOB_ODR_EXP_TYP.executeAllOnDecision = function () {
  console.log('execute AC0100010form2/JOB_ODR_EXP_TYP.onDecision');
  expj.AC0100010.AC0100010form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form2.JOB_ODR_EXP_TYP.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form2-JOB_ODR_EXP_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form2', 'JOB_ODR_EXP_TYP', this);
  });
  expj.AC0100010.AC0100010form2.JOB_ODR_EXP_TYP.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form2.JOB_ODR_EXP_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0100010form2/JOB_ODR_EXP_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form2-JOB_ODR_EXP_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0353",rb)%></span><!-- 引当済み数合計 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100010form2-SUM_OF_ALCD_QTY">
expj.AC0100010.AC0100010form2.SUM_OF_ALCD_QTY = {};
expj.AC0100010.AC0100010form2.SUM_OF_ALCD_QTY.executeAllOnDecision = function () {
  console.log('execute AC0100010form2/SUM_OF_ALCD_QTY.onDecision');
  expj.AC0100010.AC0100010form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form2.SUM_OF_ALCD_QTY.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form2-SUM_OF_ALCD_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form2', 'SUM_OF_ALCD_QTY', this);
  });
  expj.AC0100010.AC0100010form2.SUM_OF_ALCD_QTY.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form2.SUM_OF_ALCD_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0100010form2/SUM_OF_ALCD_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form2-SUM_OF_ALCD_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100010form2-SUM_OF_ALCD_QTY" name="SUM_OF_ALCD_QTY" class="AC0100010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getSUM_OF_ALCD_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0100010-AC0100010form2-STOCK_UNIT_1">
expj.AC0100010.AC0100010form2.STOCK_UNIT_1 = {};
expj.AC0100010.AC0100010form2.STOCK_UNIT_1.executeAllOnDecision = function () {
  console.log('execute AC0100010form2/STOCK_UNIT_1.onDecision');
  expj.AC0100010.AC0100010form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form2.STOCK_UNIT_1.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form2-STOCK_UNIT_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form2', 'STOCK_UNIT_1', this);
  });
  expj.AC0100010.AC0100010form2.STOCK_UNIT_1.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form2.STOCK_UNIT_1.executePScriptOnLoad = function () {
  console.log('execute AC0100010form2/STOCK_UNIT_1.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form2-STOCK_UNIT_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100010form2-STOCK_UNIT_1" name="STOCK_UNIT_1" class="AC0100010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getSTOCK_UNIT_1()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DM_STS_TYP",rb)%></span><!-- デマンド状態区分 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100010form2-DM_STS_TYP_DN">
expj.AC0100010.AC0100010form2.DM_STS_TYP_DN = {};
expj.AC0100010.AC0100010form2.DM_STS_TYP_DN.executeAllOnDecision = function () {
  console.log('execute AC0100010form2/DM_STS_TYP_DN.onDecision');
  expj.AC0100010.AC0100010form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form2.DM_STS_TYP_DN.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form2-DM_STS_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form2', 'DM_STS_TYP_DN', this);
  });
  expj.AC0100010.AC0100010form2.DM_STS_TYP_DN.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form2.DM_STS_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute AC0100010form2/DM_STS_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form2-DM_STS_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100010form2-DM_STS_TYP_DN" name="DM_STS_TYP_DN" class="AC0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getDM_STS_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AC0100010-AC0100010form2-DM_STS_TYP" name="DM_STS_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getDM_STS_TYP()) %>">
<script class="expj-script-AC0100010-AC0100010form2-DM_STS_TYP">
expj.AC0100010.AC0100010form2.DM_STS_TYP = {};
expj.AC0100010.AC0100010form2.DM_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AC0100010form2/DM_STS_TYP.onDecision');
  expj.AC0100010.AC0100010form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form2.DM_STS_TYP.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form2-DM_STS_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form2', 'DM_STS_TYP', this);
  });
  expj.AC0100010.AC0100010form2.DM_STS_TYP.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form2.DM_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0100010form2/DM_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form2-DM_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AC0100010-AC0100010form2-OD_CALC_FLG" name="OD_CALC_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getOD_CALC_FLG()) %>">
<script class="expj-script-AC0100010-AC0100010form2-OD_CALC_FLG">
expj.AC0100010.AC0100010form2.OD_CALC_FLG = {};
expj.AC0100010.AC0100010form2.OD_CALC_FLG.executeAllOnDecision = function () {
  console.log('execute AC0100010form2/OD_CALC_FLG.onDecision');
  expj.AC0100010.AC0100010form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form2.OD_CALC_FLG.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form2-OD_CALC_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form2', 'OD_CALC_FLG', this);
  });
  expj.AC0100010.AC0100010form2.OD_CALC_FLG.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form2.OD_CALC_FLG.executePScriptOnLoad = function () {
  console.log('execute AC0100010form2/OD_CALC_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form2-OD_CALC_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.TOTAL_ISSUE_QTY",rb)%></span><!-- 出庫累計数 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100010form2-TOTAL_ISSUE_QTY">
expj.AC0100010.AC0100010form2.TOTAL_ISSUE_QTY = {};
expj.AC0100010.AC0100010form2.TOTAL_ISSUE_QTY.executeAllOnDecision = function () {
  console.log('execute AC0100010form2/TOTAL_ISSUE_QTY.onDecision');
  expj.AC0100010.AC0100010form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form2.TOTAL_ISSUE_QTY.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form2-TOTAL_ISSUE_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form2', 'TOTAL_ISSUE_QTY', this);
  });
  expj.AC0100010.AC0100010form2.TOTAL_ISSUE_QTY.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form2.TOTAL_ISSUE_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0100010form2/TOTAL_ISSUE_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form2-TOTAL_ISSUE_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100010form2-TOTAL_ISSUE_QTY" name="TOTAL_ISSUE_QTY" class="AC0100010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getTOTAL_ISSUE_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0100010-AC0100010form2-STOCK_UNIT_2">
expj.AC0100010.AC0100010form2.STOCK_UNIT_2 = {};
expj.AC0100010.AC0100010form2.STOCK_UNIT_2.executeAllOnDecision = function () {
  console.log('execute AC0100010form2/STOCK_UNIT_2.onDecision');
  expj.AC0100010.AC0100010form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form2.STOCK_UNIT_2.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form2-STOCK_UNIT_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form2', 'STOCK_UNIT_2', this);
  });
  expj.AC0100010.AC0100010form2.STOCK_UNIT_2.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form2.STOCK_UNIT_2.executePScriptOnLoad = function () {
  console.log('execute AC0100010form2/STOCK_UNIT_2.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form2-STOCK_UNIT_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100010form2-STOCK_UNIT_2" name="STOCK_UNIT_2" class="AC0100010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getSTOCK_UNIT_2()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_STS_TYP",rb)%></span><!-- 製番状態区分 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100010form2-JOB_ODR_STS_TYP_DN">
expj.AC0100010.AC0100010form2.JOB_ODR_STS_TYP_DN = {};
expj.AC0100010.AC0100010form2.JOB_ODR_STS_TYP_DN.executeAllOnDecision = function () {
  console.log('execute AC0100010form2/JOB_ODR_STS_TYP_DN.onDecision');
  expj.AC0100010.AC0100010form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form2.JOB_ODR_STS_TYP_DN.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form2-JOB_ODR_STS_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form2', 'JOB_ODR_STS_TYP_DN', this);
  });
  expj.AC0100010.AC0100010form2.JOB_ODR_STS_TYP_DN.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form2.JOB_ODR_STS_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute AC0100010form2/JOB_ODR_STS_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form2-JOB_ODR_STS_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100010form2-JOB_ODR_STS_TYP_DN" name="JOB_ODR_STS_TYP_DN" class="AC0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getJOB_ODR_STS_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AC0100010-AC0100010form2-JOB_ODR_STS_TYP" name="JOB_ODR_STS_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getJOB_ODR_STS_TYP()) %>">
<script class="expj-script-AC0100010-AC0100010form2-JOB_ODR_STS_TYP">
expj.AC0100010.AC0100010form2.JOB_ODR_STS_TYP = {};
expj.AC0100010.AC0100010form2.JOB_ODR_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AC0100010form2/JOB_ODR_STS_TYP.onDecision');
  expj.AC0100010.AC0100010form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form2.JOB_ODR_STS_TYP.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form2-JOB_ODR_STS_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form2', 'JOB_ODR_STS_TYP', this);
  });
  expj.AC0100010.AC0100010form2.JOB_ODR_STS_TYP.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form2.JOB_ODR_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0100010form2/JOB_ODR_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form2-JOB_ODR_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AC0100010-AC0100010form2-UNIT_QTY_TYP" name="UNIT_QTY_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getUNIT_QTY_TYP()) %>">
<script class="expj-script-AC0100010-AC0100010form2-UNIT_QTY_TYP">
expj.AC0100010.AC0100010form2.UNIT_QTY_TYP = {};
expj.AC0100010.AC0100010form2.UNIT_QTY_TYP.executeAllOnDecision = function () {
  console.log('execute AC0100010form2/UNIT_QTY_TYP.onDecision');
  expj.AC0100010.AC0100010form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form2.UNIT_QTY_TYP.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form2-UNIT_QTY_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form2', 'UNIT_QTY_TYP', this);
  });
  expj.AC0100010.AC0100010form2.UNIT_QTY_TYP.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form2.UNIT_QTY_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0100010form2/UNIT_QTY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form2-UNIT_QTY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DUE_DATE",rb)%></span><!-- 要求納期 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100010form2-DUE_DATE">
expj.AC0100010.AC0100010form2.DUE_DATE = {};
expj.AC0100010.AC0100010form2.DUE_DATE.executeAllOnDecision = function () {
  console.log('execute AC0100010form2/DUE_DATE.onDecision');
  expj.AC0100010.AC0100010form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form2.DUE_DATE.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form2-DUE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form2', 'DUE_DATE', this);
  });
  expj.AC0100010.AC0100010form2.DUE_DATE.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form2.DUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0100010form2/DUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form2-DUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100010form2-DUE_DATE" name="DUE_DATE" class="AC0100010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getDUE_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0100010-AC0100010form2-DUE_TIME">
expj.AC0100010.AC0100010form2.DUE_TIME = {};
expj.AC0100010.AC0100010form2.DUE_TIME.executeAllOnDecision = function () {
  console.log('execute AC0100010form2/DUE_TIME.onDecision');
  expj.AC0100010.AC0100010form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form2.DUE_TIME.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form2-DUE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form2', 'DUE_TIME', this);
  });
  expj.AC0100010.AC0100010form2.DUE_TIME.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form2.DUE_TIME.executePScriptOnLoad = function () {
  console.log('execute AC0100010form2/DUE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form2-DUE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100010form2-DUE_TIME" name="DUE_TIME" class="AC0100010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getDUE_TIME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ALC_GRP_CD",rb)%></span><!-- 引当グループコード --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100010form2-ALC_GRP_CD">
expj.AC0100010.AC0100010form2.ALC_GRP_CD = {};
expj.AC0100010.AC0100010form2.ALC_GRP_CD.executeAllOnDecision = function () {
  console.log('execute AC0100010form2/ALC_GRP_CD.onDecision');
  expj.AC0100010.AC0100010form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form2.ALC_GRP_CD.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form2-ALC_GRP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form2', 'ALC_GRP_CD', this);
  });
  expj.AC0100010.AC0100010form2.ALC_GRP_CD.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form2.ALC_GRP_CD.executePScriptOnLoad = function () {
  console.log('execute AC0100010form2/ALC_GRP_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form2-ALC_GRP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100010form2-ALC_GRP_CD" name="ALC_GRP_CD" class="AC0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getALC_GRP_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AC0100010-AC0100010form2-SUM_OF_ALC_REMAIN_QTY" name="SUM_OF_ALC_REMAIN_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getSUM_OF_ALC_REMAIN_QTY()) %>">
<script class="expj-script-AC0100010-AC0100010form2-SUM_OF_ALC_REMAIN_QTY">
expj.AC0100010.AC0100010form2.SUM_OF_ALC_REMAIN_QTY = {};
expj.AC0100010.AC0100010form2.SUM_OF_ALC_REMAIN_QTY.executeAllOnDecision = function () {
  console.log('execute AC0100010form2/SUM_OF_ALC_REMAIN_QTY.onDecision');
  expj.AC0100010.AC0100010form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100010form2.SUM_OF_ALC_REMAIN_QTY.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010form2-SUM_OF_ALC_REMAIN_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100010form2', 'SUM_OF_ALC_REMAIN_QTY', this);
  });
  expj.AC0100010.AC0100010form2.SUM_OF_ALC_REMAIN_QTY.executePScriptOnLoad();
};

expj.AC0100010.AC0100010form2.SUM_OF_ALC_REMAIN_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0100010form2/SUM_OF_ALC_REMAIN_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010form2-SUM_OF_ALC_REMAIN_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
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
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
<div class="expj-td "></div><!--/td-->
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;">
<div class="expj-td frame04" style="width:12px;float:left;"></div><!--/td-->
<div class="expj-td frame05" style="width:calc(50% - 8px);float:left;"><script class="expj-script-AC0100010-AA0130020view1">
expj.AC0100010.AA0130020view1 = {};
expj.AC0100010.AA0130020view1.executeAllOnClick = function () {
};
expj.AC0100010.AA0130020view1.executeAllOnDecision = function () {
  console.log('execute AA0130020view1.onDecision');
};
expj.AC0100010.AA0130020view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0130020view1", "expj.AC0100010.AA0130020view1.executeAllOnClick");
%>
  expj.AC0100010.AA0130020view1.executePScriptOnLoad();
};

expj.AC0100010.AA0130020view1.executePScriptOnLoad = function () {
  console.log('execute AA0130020view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AC0100010-AA0130020view1" class="expj-datagrid-view expj-view-noselect expj-view-headeronly" style="width:100%;height:23px;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AA0130020view1_Id = "AA0130020view1";
 String AA0130020view1_select = "single";
 String AA0130020view1_sortable = "true";
 String AA0130020view1_resize = "true";
 String AA0130020view1_scroll = "true";
 StringBuffer AA0130020view1_HB = new StringBuffer();
 StringBuffer AA0130020view1_DB = new StringBuffer();
%>
<%
 AA0130020view1_select = "none";
 AA0130020view1_sortable = "false";
 AA0130020view1_resize = "false";
 AA0130020view1_scroll = "false";
%>
<%
 AA0130020view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0130020view1_sortable).append("}").append(",");
%>
 
<%
AA0130020view1_HB.append("{'visible':true, 'type':'string', 'width':'453px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0700",rb))).append("', 'name':'', 'class':'expj-tooltip text-align: right;', 'sortable':").append(AA0130020view1_sortable).append("}").append(",");
%>
<%
 int aAC0100010StructLength = aAC0100010Control.getListsize();
 final AC0100010Struct structBackup = aAC0100010Struct;
 aAC0100010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAC0100010StructLength; ++loopCount) {
  if((aAC0100010Struct = (AC0100010Struct) aAC0100010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAC0100010Struct", aAC0100010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
if (loopCount + 1 < aAC0100010StructLength) {
  }
 }
 aAC0100010Struct = structBackup;
 viewIdList.add(AA0130020view1_Id);
 viewSelectList.add(AA0130020view1_select);
 viewResizeList.add(AA0130020view1_resize);
 viewScrollList.add(AA0130020view1_scroll);
 viewHeaderDataList.add(AA0130020view1_HB);
 viewBodyDataList.add(AA0130020view1_DB);
%>
 
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;float:left;"></div><!--/td-->
<div class="expj-td widthLinePartition" style="height:23px;float:left;"></div><!--/td-->
<div class="expj-td frame04" style="width:12px;float:left;"></div><!--/td-->
<div class="expj-td frame05" style="width:calc(50% - 8px);float:left;"><script class="expj-script-AC0100010-AA0130020view2">
expj.AC0100010.AA0130020view2 = {};
expj.AC0100010.AA0130020view2.executeAllOnClick = function () {
};
expj.AC0100010.AA0130020view2.executeAllOnDecision = function () {
  console.log('execute AA0130020view2.onDecision');
};
expj.AC0100010.AA0130020view2.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0130020view2", "expj.AC0100010.AA0130020view2.executeAllOnClick");
%>
  expj.AC0100010.AA0130020view2.executePScriptOnLoad();
};

expj.AC0100010.AA0130020view2.executePScriptOnLoad = function () {
  console.log('execute AA0130020view2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AC0100010-AA0130020view2" class="expj-datagrid-view expj-view-noselect expj-view-headeronly" style="width:100%;height:23px;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AA0130020view2_Id = "AA0130020view2";
 String AA0130020view2_select = "single";
 String AA0130020view2_sortable = "true";
 String AA0130020view2_resize = "true";
 String AA0130020view2_scroll = "true";
 StringBuffer AA0130020view2_HB = new StringBuffer();
 StringBuffer AA0130020view2_DB = new StringBuffer();
%>
<%
 AA0130020view2_select = "none";
 AA0130020view2_sortable = "false";
 AA0130020view2_resize = "false";
 AA0130020view2_scroll = "false";
%>
<%
 AA0130020view2_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0130020view2_sortable).append("}").append(",");
%>
 
<%
AA0130020view2_HB.append("{'visible':true, 'type':'string', 'width':'453px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0701",rb))).append("', 'name':'', 'class':'expj-tooltip text-align: right;', 'sortable':").append(AA0130020view2_sortable).append("}").append(",");
%>
<%
 int aAC0100010StructLength = aAC0100010Control.getListsize();
 final AC0100010Struct structBackup = aAC0100010Struct;
 aAC0100010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAC0100010StructLength; ++loopCount) {
  if((aAC0100010Struct = (AC0100010Struct) aAC0100010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAC0100010Struct", aAC0100010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
if (loopCount + 1 < aAC0100010StructLength) {
  }
 }
 aAC0100010Struct = structBackup;
 viewIdList.add(AA0130020view2_Id);
 viewSelectList.add(AA0130020view2_select);
 viewResizeList.add(AA0130020view2_resize);
 viewScrollList.add(AA0130020view2_scroll);
 viewHeaderDataList.add(AA0130020view2_HB);
 viewBodyDataList.add(AA0130020view2_DB);
%>
 
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;float:left;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="float:left;"></div><!--/td-->
<div class="expj-td frame05" style="width:calc(50% - 8px);height:calc(100% - 23px);float:left;"><script class="expj-script-AC0100010-AC0100010view1">
expj.AC0100010.AC0100010view1 = {};
expj.AC0100010.AC0100010view1.executeAllOnClick = function () {
};
expj.AC0100010.AC0100010view1.executeAllOnDecision = function () {
  console.log('execute AC0100010view1.onDecision');
};
expj.AC0100010.AC0100010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AC0100010view1", "expj.AC0100010.AC0100010view1.executeAllOnClick");
%>
  expj.AC0100010.AC0100010view1.executePScriptOnLoad();
};

expj.AC0100010.AC0100010view1.executePScriptOnLoad = function () {
  console.log('execute AC0100010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AC0100010-AC0100010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AC0100010view1_Id = "AC0100010view1";
 String AC0100010view1_select = "single";
 String AC0100010view1_sortable = "true";
 String AC0100010view1_resize = "true";
 String AC0100010view1_scroll = "true";
 StringBuffer AC0100010view1_HB = new StringBuffer();
 StringBuffer AC0100010view1_DB = new StringBuffer();
%>
<%
 AC0100010view1_select = "single";
 AC0100010view1_sortable = "true";
 AC0100010view1_resize = "true";
 AC0100010view1_scroll = "true";
%>
<%
 AC0100010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
%>
 
   
<%
AC0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
AC0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_ALC_TYP_2', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
AC0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0702",rb))).append("', 'name':'l_ALC_TYP_2_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
AC0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_OD_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
AC0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD_3",rb))).append("', 'name':'l_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
AC0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_JOB_ODR_DETAIL_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
AC0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_JOB_ODR_CANCEL_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
AC0100010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ALCD_QTY",rb))).append("', 'name':'l_ALCD_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
AC0100010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUEED_QTY_1",rb))).append("', 'name':'l_ISSUEED_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
AC0100010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0300",rb))).append("', 'name':'l_ALLOCATABLE_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
AC0100010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0355",rb))).append("', 'name':'l_ISSUE_REMAIN_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
AC0100010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_ON_HAND_QTY",rb))).append("', 'name':'l_STOCK_ON_HAND_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
AC0100010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_QTY",rb))).append("', 'name':'l_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
AC0100010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RCV_QTY_1",rb))).append("', 'name':'l_TOTAL_RCV_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
AC0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_ODR_STS_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
AC0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_STS_TYP",rb))).append("', 'name':'l_ODR_STS_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
AC0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ALC_GRP_CD",rb))).append("', 'name':'l_ALC_GRP_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
AC0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_JOB_ODR_STS_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
AC0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_STS_TYP",rb))).append("', 'name':'l_JOB_ODR_STS_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
AC0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRD_DUE_DATE",rb))).append("', 'name':'l_PRD_DUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
AC0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRD_START_DATE",rb))).append("', 'name':'l_PRD_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
AC0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_START_DATE",rb))).append("', 'name':'l_ODR_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
AC0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_JOB_ODR_EXP_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
AC0100010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_MRP_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0100010view1_sortable).append("}").append(",");
%>
<%
 int aAC0100010StructLength = aAC0100010Control.getListsize();
 final AC0100010Struct structBackup = aAC0100010Struct;
 aAC0100010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAC0100010StructLength; ++loopCount) {
  if((aAC0100010Struct = (AC0100010Struct) aAC0100010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAC0100010Struct", aAC0100010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AC0100010view1_DB.append("[");
 AC0100010view1_DB.append(loopCount);
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_MODIFY_COUNT\" data-name=\"l_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_MODIFY_COUNT())).append("</span>'");
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_ALC_TYP_2-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_ALC_TYP_2\" data-name=\"l_ALC_TYP_2\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_ALC_TYP_2())).append("</span>'");
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_ALC_TYP_2_DN-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_ALC_TYP_2_DN\" data-name=\"l_ALC_TYP_2_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_ALC_TYP_2_DN())).append("</span>'");
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_OD_NO-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_OD_NO\" data-name=\"l_OD_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_OD_NO())).append("</span>'");
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_JOB_ODR_CD\" data-name=\"l_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_JOB_ODR_CD())).append("</span>'");
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_JOB_ODR_DETAIL_NO-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_JOB_ODR_DETAIL_NO\" data-name=\"l_JOB_ODR_DETAIL_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_JOB_ODR_DETAIL_NO())).append("</span>'");
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_JOB_ODR_CANCEL_NO-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_JOB_ODR_CANCEL_NO\" data-name=\"l_JOB_ODR_CANCEL_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_JOB_ODR_CANCEL_NO())).append("</span>'");
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_ALCD_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_ALCD_QTY\" data-name=\"l_ALCD_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_ALCD_QTY())).append("</span>'");
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_ISSUEED_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_ISSUEED_QTY\" data-name=\"l_ISSUEED_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_ISSUEED_QTY())).append("</span>'");
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_ALLOCATABLE_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_ALLOCATABLE_QTY\" data-name=\"l_ALLOCATABLE_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_ALLOCATABLE_QTY())).append("</span>'");
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_ISSUE_REMAIN_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_ISSUE_REMAIN_QTY\" data-name=\"l_ISSUE_REMAIN_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_ISSUE_REMAIN_QTY())).append("</span>'");
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_STOCK_ON_HAND_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_STOCK_ON_HAND_QTY\" data-name=\"l_STOCK_ON_HAND_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_STOCK_ON_HAND_QTY())).append("</span>'");
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_ODR_QTY\" data-name=\"l_ODR_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_ODR_QTY())).append("</span>'");
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_TOTAL_RCV_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_TOTAL_RCV_QTY\" data-name=\"l_TOTAL_RCV_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_TOTAL_RCV_QTY())).append("</span>'");
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_ODR_STS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_ODR_STS_TYP\" data-name=\"l_ODR_STS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_ODR_STS_TYP())).append("</span>'");
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_ODR_STS_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_ODR_STS_TYP_DN\" data-name=\"l_ODR_STS_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_ODR_STS_TYP_DN())).append("</span>'");
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_ALC_GRP_CD-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_ALC_GRP_CD\" data-name=\"l_ALC_GRP_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_ALC_GRP_CD())).append("</span>'");
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_JOB_ODR_STS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_JOB_ODR_STS_TYP\" data-name=\"l_JOB_ODR_STS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_JOB_ODR_STS_TYP())).append("</span>'");
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_JOB_ODR_STS_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_JOB_ODR_STS_TYP_DN\" data-name=\"l_JOB_ODR_STS_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_JOB_ODR_STS_TYP_DN())).append("</span>'");
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_PRD_DUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_PRD_DUE_DATE\" data-name=\"l_PRD_DUE_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_PRD_DUE_DATE())).append("</span>'");
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_PRD_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_PRD_START_DATE\" data-name=\"l_PRD_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_PRD_START_DATE())).append("</span>'");
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_ODR_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_ODR_START_DATE\" data-name=\"l_ODR_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_ODR_START_DATE())).append("</span>'");
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_JOB_ODR_EXP_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_JOB_ODR_EXP_TYP\" data-name=\"l_JOB_ODR_EXP_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_JOB_ODR_EXP_TYP())).append("</span>'");
 AC0100010view1_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view1-l_MRP_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view1-l_MRP_TYP\" data-name=\"l_MRP_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_MRP_TYP())).append("</span>'");
 AC0100010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAC0100010StructLength) {
   AC0100010view1_DB.append(",");
  }
 }
 aAC0100010Struct = structBackup;
 viewIdList.add(AC0100010view1_Id);
 viewSelectList.add(AC0100010view1_select);
 viewResizeList.add(AC0100010view1_resize);
 viewScrollList.add(AC0100010view1_scroll);
 viewHeaderDataList.add(AC0100010view1_HB);
 viewBodyDataList.add(AC0100010view1_DB);
%>
 
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="float:left;"></div><!--/td-->
<div class="expj-td widthLinePartition" style="height:calc(100% - 23px);float:left;"></div><!--/td-->
<div class="expj-td frame04" style="float:left;"></div><!--/td-->
<%
			List listBackup = aAC0100010Control.getJobOdrAlcdList();
			aAC0100010Control.setList(aAC0100010Control.getAllocatableList());
		  %><div class="expj-td frame05" style="width:calc(50% - 8px);height:calc(100% - 23px);float:left;"><script class="expj-script-AC0100010-AC0100010view2">
expj.AC0100010.AC0100010view2 = {};
expj.AC0100010.AC0100010view2.executeAllOnClick = function () {
};
expj.AC0100010.AC0100010view2.executeAllOnDecision = function () {
  console.log('execute AC0100010view2.onDecision');
};
expj.AC0100010.AC0100010view2.executeOnLoad = function () {
<%
    viewSelectEvent.put("AC0100010view2", "expj.AC0100010.AC0100010view2.executeAllOnClick");
%>
  expj.AC0100010.AC0100010view2.executePScriptOnLoad();
};

expj.AC0100010.AC0100010view2.executePScriptOnLoad = function () {
  console.log('execute AC0100010view2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AC0100010-AC0100010view2" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AC0100010view2_Id = "AC0100010view2";
 String AC0100010view2_select = "single";
 String AC0100010view2_sortable = "true";
 String AC0100010view2_resize = "true";
 String AC0100010view2_scroll = "true";
 StringBuffer AC0100010view2_HB = new StringBuffer();
 StringBuffer AC0100010view2_DB = new StringBuffer();
%>
<%
 AC0100010view2_select = "single";
 AC0100010view2_sortable = "true";
 AC0100010view2_resize = "true";
 AC0100010view2_scroll = "true";
%>
<%
 AC0100010view2_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AC0100010view2_sortable).append("}").append(",");
%>
 
   
<%
AC0100010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_ALC_TYP_2', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0100010view2_sortable).append("}").append(",");
AC0100010view2_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0702",rb))).append("', 'name':'l_ALC_TYP_2_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0100010view2_sortable).append("}").append(",");
AC0100010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_OD_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0100010view2_sortable).append("}").append(",");
AC0100010view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD_3",rb))).append("', 'name':'l_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0100010view2_sortable).append("}").append(",");
AC0100010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_JOB_ODR_DETAIL_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0100010view2_sortable).append("}").append(",");
AC0100010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_JOB_ODR_CANCEL_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0100010view2_sortable).append("}").append(",");
AC0100010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0300",rb))).append("', 'name':'l_ALLOCATABLE_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0100010view2_sortable).append("}").append(",");
AC0100010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0355",rb))).append("', 'name':'l_ALCD_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0100010view2_sortable).append("}").append(",");
AC0100010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_ON_HAND_QTY",rb))).append("', 'name':'l_STOCK_ON_HAND_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0100010view2_sortable).append("}").append(",");
AC0100010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_QTY",rb))).append("', 'name':'l_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0100010view2_sortable).append("}").append(",");
AC0100010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RCV_QTY_1",rb))).append("', 'name':'l_TOTAL_RCV_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0100010view2_sortable).append("}").append(",");
AC0100010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_ODR_STS_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0100010view2_sortable).append("}").append(",");
AC0100010view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_STS_TYP",rb))).append("', 'name':'l_ODR_STS_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0100010view2_sortable).append("}").append(",");
AC0100010view2_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ALC_GRP_CD",rb))).append("', 'name':'l_ALC_GRP_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0100010view2_sortable).append("}").append(",");
AC0100010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_JOB_ODR_STS_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0100010view2_sortable).append("}").append(",");
AC0100010view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_STS_TYP",rb))).append("', 'name':'l_JOB_ODR_STS_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0100010view2_sortable).append("}").append(",");
AC0100010view2_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRD_DUE_DATE",rb))).append("', 'name':'l_PRD_DUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0100010view2_sortable).append("}").append(",");
AC0100010view2_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRD_START_DATE",rb))).append("', 'name':'l_PRD_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0100010view2_sortable).append("}").append(",");
AC0100010view2_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_START_DATE",rb))).append("', 'name':'l_ODR_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0100010view2_sortable).append("}").append(",");
AC0100010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_JOB_ODR_EXP_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0100010view2_sortable).append("}").append(",");
AC0100010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_MRP_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0100010view2_sortable).append("}").append(",");
%>
<%
 int aAC0100010StructLength = aAC0100010Control.getListsize();
 final AC0100010Struct structBackup = aAC0100010Struct;
 aAC0100010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAC0100010StructLength; ++loopCount) {
  if((aAC0100010Struct = (AC0100010Struct) aAC0100010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAC0100010Struct", aAC0100010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AC0100010view2_DB.append("[");
 AC0100010view2_DB.append(loopCount);
 AC0100010view2_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view2-l_ALC_TYP_2-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view2-l_ALC_TYP_2\" data-name=\"l_ALC_TYP_2\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_ALC_TYP_2())).append("</span>'");
 AC0100010view2_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view2-l_ALC_TYP_2_DN-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view2-l_ALC_TYP_2_DN\" data-name=\"l_ALC_TYP_2_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_ALC_TYP_2_DN())).append("</span>'");
 AC0100010view2_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view2-l_OD_NO-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view2-l_OD_NO\" data-name=\"l_OD_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_OD_NO())).append("</span>'");
 AC0100010view2_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view2-l_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view2-l_JOB_ODR_CD\" data-name=\"l_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_JOB_ODR_CD())).append("</span>'");
 AC0100010view2_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view2-l_JOB_ODR_DETAIL_NO-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view2-l_JOB_ODR_DETAIL_NO\" data-name=\"l_JOB_ODR_DETAIL_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_JOB_ODR_DETAIL_NO())).append("</span>'");
 AC0100010view2_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view2-l_JOB_ODR_CANCEL_NO-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view2-l_JOB_ODR_CANCEL_NO\" data-name=\"l_JOB_ODR_CANCEL_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_JOB_ODR_CANCEL_NO())).append("</span>'");
 AC0100010view2_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view2-l_ALLOCATABLE_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view2-l_ALLOCATABLE_QTY\" data-name=\"l_ALLOCATABLE_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_ALLOCATABLE_QTY())).append("</span>'");
 AC0100010view2_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view2-l_ALCD_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view2-l_ALCD_QTY\" data-name=\"l_ALCD_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_ALCD_QTY())).append("</span>'");
 AC0100010view2_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view2-l_STOCK_ON_HAND_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view2-l_STOCK_ON_HAND_QTY\" data-name=\"l_STOCK_ON_HAND_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_STOCK_ON_HAND_QTY())).append("</span>'");
 AC0100010view2_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view2-l_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view2-l_ODR_QTY\" data-name=\"l_ODR_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_ODR_QTY())).append("</span>'");
 AC0100010view2_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view2-l_TOTAL_RCV_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view2-l_TOTAL_RCV_QTY\" data-name=\"l_TOTAL_RCV_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_TOTAL_RCV_QTY())).append("</span>'");
 AC0100010view2_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view2-l_ODR_STS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view2-l_ODR_STS_TYP\" data-name=\"l_ODR_STS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_ODR_STS_TYP())).append("</span>'");
 AC0100010view2_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view2-l_ODR_STS_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view2-l_ODR_STS_TYP_DN\" data-name=\"l_ODR_STS_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_ODR_STS_TYP_DN())).append("</span>'");
 AC0100010view2_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view2-l_ALC_GRP_CD-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view2-l_ALC_GRP_CD\" data-name=\"l_ALC_GRP_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_ALC_GRP_CD())).append("</span>'");
 AC0100010view2_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view2-l_JOB_ODR_STS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view2-l_JOB_ODR_STS_TYP\" data-name=\"l_JOB_ODR_STS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_JOB_ODR_STS_TYP())).append("</span>'");
 AC0100010view2_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view2-l_JOB_ODR_STS_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view2-l_JOB_ODR_STS_TYP_DN\" data-name=\"l_JOB_ODR_STS_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_JOB_ODR_STS_TYP_DN())).append("</span>'");
 AC0100010view2_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view2-l_PRD_DUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view2-l_PRD_DUE_DATE\" data-name=\"l_PRD_DUE_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_PRD_DUE_DATE())).append("</span>'");
 AC0100010view2_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view2-l_PRD_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view2-l_PRD_START_DATE\" data-name=\"l_PRD_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_PRD_START_DATE())).append("</span>'");
 AC0100010view2_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view2-l_ODR_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view2-l_ODR_START_DATE\" data-name=\"l_ODR_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_ODR_START_DATE())).append("</span>'");
 AC0100010view2_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view2-l_JOB_ODR_EXP_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view2-l_JOB_ODR_EXP_TYP\" data-name=\"l_JOB_ODR_EXP_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_JOB_ODR_EXP_TYP())).append("</span>'");
 AC0100010view2_DB.append(",").append("'<span id=\"expj-AC0100010-AC0100010view2-l_MRP_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0100010-AC0100010view2-l_MRP_TYP\" data-name=\"l_MRP_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0100010Struct.getl_MRP_TYP())).append("</span>'");
 AC0100010view2_DB.append("]");
%>
<%
if (loopCount + 1 < aAC0100010StructLength) {
   AC0100010view2_DB.append(",");
  }
 }
 aAC0100010Struct = structBackup;
 viewIdList.add(AC0100010view2_Id);
 viewSelectList.add(AC0100010view2_select);
 viewResizeList.add(AC0100010view2_resize);
 viewScrollList.add(AC0100010view2_scroll);
 viewHeaderDataList.add(AC0100010view2_HB);
 viewBodyDataList.add(AC0100010view2_DB);
%>
 
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="float:left;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field two-view-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area for-two-button" style="width:210px;height:32px;"><script class="expj-script-AC0100010-AC0100010button2">
expj.AC0100010.AC0100010button2 = {};
expj.AC0100010.AC0100010button2.executeAllOnDecision = function () {
  console.log('execute AC0100010button2.onDecision');
};
expj.AC0100010.AC0100010button2.executeOnLoad = function () {
  expj.AC0100010.AC0100010button2.executePScriptOnLoad();
};

expj.AC0100010.AC0100010button2.executePScriptOnLoad = function () {
  console.log('execute AC0100010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0100010-AC0100010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0100010-AC0100010button2-AlcUpdate">
expj.AC0100010.AC0100010button2.AlcUpdate = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AC0100010form1/*,_AC0100010form2/*,_AC0100010view1/+@AC0100010Servlet"
expj.AC0100010.AC0100010button2.AlcUpdate.onClick0 = function () {
  console.log('AlcUpdate script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0100010', 'AC0100010button2', '_AC0100010form1/*,_AC0100010form2/*,_AC0100010view1/+', 'AC0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0100010', response);
expj.common.changeBusinessScreenTab('AC0100010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AC0100010.AC0100010button2.AlcUpdate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0100010.AC0100010button2.AlcUpdate['onClick' + i])) {
        expj.AC0100010.AC0100010button2.AlcUpdate['onClick' + i]();
      }
    }
  }
};
expj.AC0100010.AC0100010button2.AlcUpdate.executeAllOnDecision = function () {
};
expj.AC0100010.AC0100010button2.AlcUpdate.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010button2-AlcUpdate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0100010', 'AC0100010button2', 'AlcUpdate', this, 'Button');
    }
  });
  expj.AC0100010.AC0100010button2.AlcUpdate.executePScriptOnLoad();
};

expj.AC0100010.AC0100010button2.AlcUpdate.executePScriptOnLoad = function () {
  console.log('execute AC0100010button2/AlcUpdate.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010button2-AlcUpdate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0100010-AC0100010button2-AlcUpdate" name="AlcUpdate" class="AC0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReserveFundModify",rb)%></button><!-- 引当修正ボタン --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100010button2-AlcDelete">
expj.AC0100010.AC0100010button2.AlcDelete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0100010form1/*,_AC0100010view1/+@AC0100010Servlet,,$ZZ07004"
expj.AC0100010.AC0100010button2.AlcDelete.onClick0 = function () {
  console.log('AlcDelete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0100010', 'AC0100010button2', '_AC0100010form1/*,_AC0100010view1/+', 'AC0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0100010', response);
expj.common.updateBusinessScreenTab('AC0100010', contents);
};
expj.common.pscript.callConfirm('AC0100010', 'AC0100010button2', 'ZZ07004', okEvent);
};
expj.AC0100010.AC0100010button2.AlcDelete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0100010.AC0100010button2.AlcDelete['onClick' + i])) {
        expj.AC0100010.AC0100010button2.AlcDelete['onClick' + i]();
      }
    }
  }
};
expj.AC0100010.AC0100010button2.AlcDelete.executeAllOnDecision = function () {
};
expj.AC0100010.AC0100010button2.AlcDelete.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010button2-AlcDelete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0100010', 'AC0100010button2', 'AlcDelete', this, 'Button');
    }
  });
  expj.AC0100010.AC0100010button2.AlcDelete.executePScriptOnLoad();
};

expj.AC0100010.AC0100010button2.AlcDelete.executePScriptOnLoad = function () {
  console.log('execute AC0100010button2/AlcDelete.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010button2-AlcDelete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0100010-AC0100010button2-AlcDelete" name="AlcDelete" class="AC0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReserveFundDelete",rb)%></button><!-- 引当削除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(50vw - 103px - 210px);height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame17" style="width:12px;height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell widthLinePartition widthResizeLinePartition" style="height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area for-two-button" style="width:105px;height:32px;"><script class="expj-script-AC0100010-AC0100010button3">
expj.AC0100010.AC0100010button3 = {};
expj.AC0100010.AC0100010button3.executeAllOnDecision = function () {
  console.log('execute AC0100010button3.onDecision');
};
expj.AC0100010.AC0100010button3.executeOnLoad = function () {
  expj.AC0100010.AC0100010button3.executePScriptOnLoad();
};

expj.AC0100010.AC0100010button3.executePScriptOnLoad = function () {
  console.log('execute AC0100010button3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0100010-AC0100010button3" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0100010-AC0100010button3-AlcInsert">
expj.AC0100010.AC0100010button3.AlcInsert = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AC0100010form1/*,_AC0100010form2/*,_AC0100010view2/+@AC0100010Servlet"
expj.AC0100010.AC0100010button3.AlcInsert.onClick0 = function () {
  console.log('AlcInsert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0100010', 'AC0100010button3', '_AC0100010form1/*,_AC0100010form2/*,_AC0100010view2/+', 'AC0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0100010', response);
expj.common.changeBusinessScreenTab('AC0100010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AC0100010.AC0100010button3.AlcInsert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0100010.AC0100010button3.AlcInsert['onClick' + i])) {
        expj.AC0100010.AC0100010button3.AlcInsert['onClick' + i]();
      }
    }
  }
};
expj.AC0100010.AC0100010button3.AlcInsert.executeAllOnDecision = function () {
};
expj.AC0100010.AC0100010button3.AlcInsert.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010button3-AlcInsert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0100010', 'AC0100010button3', 'AlcInsert', this, 'Button');
    }
  });
  expj.AC0100010.AC0100010button3.AlcInsert.executePScriptOnLoad();
};

expj.AC0100010.AC0100010button3.AlcInsert.executePScriptOnLoad = function () {
  console.log('execute AC0100010button3/AlcInsert.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010button3-AlcInsert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0100010-AC0100010button3-AlcInsert" name="AlcInsert" class="AC0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReserveFundAdd",rb)%></button><!-- 引当追加ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(50vw - 103px - 105px);height:32px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame17" style="width:12px;height:32px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<%
	aAC0100010Control.setList(listBackup);
  %><div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AC0100010 Revision: 1.8  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AC0100010-AC0100010button0">
expj.AC0100010.AC0100010button0 = {};
expj.AC0100010.AC0100010button0.executeAllOnDecision = function () {
  console.log('execute AC0100010button0.onDecision');
};
expj.AC0100010.AC0100010button0.executeOnLoad = function () {
  expj.AC0100010.AC0100010button0.executePScriptOnLoad();
};

expj.AC0100010.AC0100010button0.executePScriptOnLoad = function () {
  console.log('execute AC0100010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0100010-AC0100010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0100010-AC0100010button0-Clear">
expj.AC0100010.AC0100010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0100010form1/*@AC0100010Servlet,,$ZZ07008"
expj.AC0100010.AC0100010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0100010', 'AC0100010button0', '_AC0100010form1/*', 'AC0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0100010', response);
expj.common.updateBusinessScreenTab('AC0100010', contents);
};
expj.common.pscript.callConfirm('AC0100010', 'AC0100010button0', 'ZZ07008', okEvent);
};
expj.AC0100010.AC0100010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0100010.AC0100010button0.Clear['onClick' + i])) {
        expj.AC0100010.AC0100010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AC0100010.AC0100010button0.Clear.executeAllOnDecision = function () {
};
expj.AC0100010.AC0100010button0.Clear.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0100010', 'AC0100010button0', 'Clear', this, 'Button');
    }
  });
  expj.AC0100010.AC0100010button0.Clear.executePScriptOnLoad();
};

expj.AC0100010.AC0100010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AC0100010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0100010-AC0100010button0-Clear" name="Clear" class="AC0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100010button0-Close">
expj.AC0100010.AC0100010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AC0100010.AC0100010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AC0100010');
};
expj.AC0100010.AC0100010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0100010.AC0100010button0.Close['onClick' + i])) {
        expj.AC0100010.AC0100010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AC0100010.AC0100010button0.Close.executeAllOnDecision = function () {
};
expj.AC0100010.AC0100010button0.Close.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0100010', 'AC0100010button0', 'Close', this, 'Button');
    }
  });
  expj.AC0100010.AC0100010button0.Close.executePScriptOnLoad();
};

expj.AC0100010.AC0100010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AC0100010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0100010-AC0100010button0-Close" name="Close" class="AC0100010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AC0100010 (END)-->
<%
MessageStruct msgStruct = aAC0100010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AC0100010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AC0100010)) {
  expj.common.treeInstanceMap.AC0100010 = {};
}
expj.common.treeInstanceMap.AC0100010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0100010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AC0100010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0100010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AC0100010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AC0100010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AC0100010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AC0100010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AC0100010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AC0100010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AC0100010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0100010)) {
  expj.common.detailDialogMap.AC0100010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0100010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AC0100010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0100010.<%=detailId %>)) {
  expj.common.detailDialogMap.AC0100010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0100010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AC0100010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0100010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AC0100010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AC0100010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AC0100010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AC0100010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AC0100010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AC0100010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AC0100010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AC0100010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AC0100010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AC0100010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AC0100010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AC0100010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AC0100010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AC0100010)) {
  expj.common.viewInstanceMap.AC0100010 = {};
}
expj.common.viewInstanceMap.AC0100010.<%=viewId %> = {};
expj.common.viewInstanceMap.AC0100010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AC0100010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AC0100010.<%=viewId %>.init = function () {
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
    expj.AC0100010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AC0100010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AC0100010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AC0100010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AC0100010_init">
/**
 * AC0100010用のロード完了時初期化関数
 */
expj.AC0100010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AC0100010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AC0100010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AC0100010');
  expj.common.calendarInstanceMap.AC0100010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AC0100010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AC0100010.<%=detailId %>.init();
  expj.common.detailDialogMap.AC0100010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AC0100010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AC0100010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AC0100010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AC0100010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AC0100010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AC0100010-<%=detailId %>');
<%
 }
%>
  try{expj.AC0100010.AC0100010form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form1.PeekerJobOdrCd.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form1.JOB_ODR_CANCEL_NO.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form1.OD_NO.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form1.PeekerOdNo.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form1.h_OD_NO.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form2.DM_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form2.SUM_OF_ALLOCATABLE_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form2.STOCK_UNIT_3.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form2.JOB_ODR_EXP_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form2.SUM_OF_ALCD_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form2.STOCK_UNIT_1.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form2.DM_STS_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form2.DM_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form2.OD_CALC_FLG.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form2.TOTAL_ISSUE_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form2.STOCK_UNIT_2.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form2.JOB_ODR_STS_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form2.JOB_ODR_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form2.UNIT_QTY_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form2.DUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form2.DUE_TIME.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form2.ALC_GRP_CD.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form2.SUM_OF_ALC_REMAIN_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010button2.AlcUpdate.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010button2.AlcDelete.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010button3.AlcInsert.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form1.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010button1.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010form2.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AA0130020view1.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AA0130020view2.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010view1.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010view2.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010button2.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010button3.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AC0100010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AC0100010', 'AC0100010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AC0100010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AC0100010-focus-move');
  // 初期フォーカス当てる処理
  $('.AC0100010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AC0100010', '<%=request.getContextPath() %>');
};

/**
 * AC0100010の全体onDecision処理
 */
expj.AC0100010.executeAllOnDecision = function () {
  expj.AC0100010.AC0100010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AC0100010_console">
expj.AC0100010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>