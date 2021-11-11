<%-- ***
This file is generated
 GeneratedDate  : Mon Feb 20 10:02:34 JST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF.V320\EXPJProj\OPF\AE0020\AE0020020.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AE0020.*" %>
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
<jsp:useBean id="aAE0020020Control" class="com.nec.jp.orteus.metamorBase.AE0020.AE0020020Control" scope="request"/>
<jsp:useBean id="aAE0020020Struct" class="com.nec.jp.orteus.metamorBase.AE0020.AE0020020Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

発注計画メンテナンス（製番）
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0020/jsp/AE0020020.jsp,v $
$Author: geng-jia $  
$Revision: 1.22 $ $Date: 2017/02/22 02:05:05 $
********************************************************* --%>
<html>
<head>
<title>発注計画メンテナンス（製番）</title>
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
<script class="expj-script-AE0020020_init">
  // AE0020020名前空間
  expj.AE0020020 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AE0020020" data-screen="AE0020020" data-newdata="<%=aAE0020020Control.isNewData() %>">
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
              <script class="expj-script-AE0020020-AE0020020form1">
expj.AE0020020.AE0020020form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AE0020020.AE0020020form1.onLoad0 = function () {
  console.log('AE0020020form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHK;?AE0020020form1/*[eq]NORMAL[or]?AE0020020form1/*[eq]NOT_FOUND@*0,*1"
expj.AE0020020.AE0020020form1.onDecision0 = function () {
  console.log('AE0020020form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020020form1', '?AE0020020form1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020020form1', '?AE0020020form1/*'), '[eq]', 'NOT_FOUND')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AE0020020button2/LineInsert"
expj.AE0020020.AE0020020form1.child0 = function () {
  console.log('AE0020020form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020020form1', '_AE0020020button2/LineInsert');
};
// script4="child;1;MASK;_AE0020020button2/LineInsert"
expj.AE0020020.AE0020020form1.child1 = function () {
  console.log('AE0020020form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020020form1', '_AE0020020button2/LineInsert');
};
// script5="onDecision;1;CHKRQ;?AE0020020view1/?[eq]SINGLE@*2,*4"
expj.AE0020020.AE0020020form1.onDecision1 = function () {
  console.log('AE0020020form1 script5');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020020form1', '?AE0020020view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;CHK;?AE0020020form1/*[eq]NORMAL@*5,*4"
expj.AE0020020.AE0020020form1.child2 = function () {
  console.log('AE0020020form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020020form1', '?AE0020020form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_AE0020020button2/LineUpdate,_AE0020020button2/LineCopy,_AE0020020button2/LineDelete"
expj.AE0020020.AE0020020form1.child3 = function () {
  console.log('AE0020020form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020020form1', '_AE0020020button2/LineUpdate');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020020form1', '_AE0020020button2/LineCopy');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020020form1', '_AE0020020button2/LineDelete');
};
// script8="child;4;MASK;_AE0020020button2/LineUpdate,_AE0020020button2/LineCopy,_AE0020020button2/LineDelete"
expj.AE0020020.AE0020020form1.child4 = function () {
  console.log('AE0020020form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020020form1', '_AE0020020button2/LineUpdate');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020020form1', '_AE0020020button2/LineCopy');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020020form1', '_AE0020020button2/LineDelete');
};
// script9="child;5;CHK;_AE0020020view1/l_PUCH_ODR_STS_TYP[eq]2@*6,*3"
expj.AE0020020.AE0020020form1.child5 = function () {
  console.log('AE0020020form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020020form1', '_AE0020020view1/l_PUCH_ODR_STS_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script10="child;6;UNMASK;_AE0020020button2/LineUpdate@*7"
expj.AE0020020.AE0020020form1.child6 = function () {
  console.log('AE0020020form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020020form1', '_AE0020020button2/LineUpdate');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child7)){this.child7();}}
};
// script11="child;7;MASK;_AE0020020button2/LineCopy@*8"
expj.AE0020020.AE0020020form1.child7 = function () {
  console.log('AE0020020form1 script11');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020020form1', '_AE0020020button2/LineCopy');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
// script12="child;8;MASK;_AE0020020button2/LineDelete"
expj.AE0020020.AE0020020form1.child8 = function () {
  console.log('AE0020020form1 script12');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020020form1', '_AE0020020button2/LineDelete');
};
expj.AE0020020.AE0020020form1.executeAllOnDecision = function () {
  console.log('execute AE0020020form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020020form1['onDecision' + i])) {
        expj.AE0020020.AE0020020form1['onDecision' + i]();
      }
    }
  }
};
expj.AE0020020.AE0020020form1.executeOnLoad = function () {
  expj.AE0020020.AE0020020form1.executePScriptOnLoad();
};

expj.AE0020020.AE0020020form1.executePScriptOnLoad = function () {
  console.log('execute AE0020020form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AE0020020.AE0020020form1['onLoad' + i])) {
      expj.AE0020020.AE0020020form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0020020-AE0020020form1" action="AE0020020Servlet" name="AE0020020form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAE0020020Control.getReadStatusString()) %>" style="height:96px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:96px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020020form1-PLANT_CD">
expj.AE0020020.AE0020020form1.PLANT_CD = {};
expj.AE0020020.AE0020020form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AE0020020form1/PLANT_CD.onDecision');
  expj.AE0020020.AE0020020form1.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020020form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020020form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020020form1', 'PLANT_CD', this);
  });
  expj.AE0020020.AE0020020form1.PLANT_CD.executePScriptOnLoad();
};

expj.AE0020020.AE0020020form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AE0020020form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020020form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020020form1-PLANT_CD" name="PLANT_CD" class="AE0020020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getPLANT_CD()) %>" maxlength="2" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0020020-AE0020020form1-PLANT_NAME">
expj.AE0020020.AE0020020form1.PLANT_NAME = {};
expj.AE0020020.AE0020020form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AE0020020form1/PLANT_NAME.onDecision');
  expj.AE0020020.AE0020020form1.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020020form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020020form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020020form1', 'PLANT_NAME', this);
  });
  expj.AE0020020.AE0020020form1.PLANT_NAME.executePScriptOnLoad();
};

expj.AE0020020.AE0020020form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0020020form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020020form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020020form1-PLANT_NAME" name="PLANT_NAME" class="AE0020020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020020form1-JOB_ODR_CD">
expj.AE0020020.AE0020020form1.JOB_ODR_CD = {};
expj.AE0020020.AE0020020form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0020020form1/JOB_ODR_CD.onDecision');
  expj.AE0020020.AE0020020form1.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020020form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020020form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020020form1', 'JOB_ODR_CD', this);
  });
  expj.AE0020020.AE0020020form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AE0020020.AE0020020form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0020020form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020020form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020020form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AE0020020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getJOB_ODR_CD()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CANCEL_NO",rb)%></span><!-- 製番取消発生番号 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020020form1-JOB_ODR_CANCEL_NO">
expj.AE0020020.AE0020020form1.JOB_ODR_CANCEL_NO = {};
expj.AE0020020.AE0020020form1.JOB_ODR_CANCEL_NO.executeAllOnDecision = function () {
  console.log('execute AE0020020form1/JOB_ODR_CANCEL_NO.onDecision');
  expj.AE0020020.AE0020020form1.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020020form1.JOB_ODR_CANCEL_NO.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020020form1-JOB_ODR_CANCEL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020020form1', 'JOB_ODR_CANCEL_NO', this);
  });
  expj.AE0020020.AE0020020form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad();
};

expj.AE0020020.AE0020020form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad = function () {
  console.log('execute AE0020020form1/JOB_ODR_CANCEL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020020form1-JOB_ODR_CANCEL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020020form1-JOB_ODR_CANCEL_NO" name="JOB_ODR_CANCEL_NO" class="AE0020020-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getJOB_ODR_CANCEL_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020020form1-ITEM_CD">
expj.AE0020020.AE0020020form1.ITEM_CD = {};
expj.AE0020020.AE0020020form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AE0020020form1/ITEM_CD.onDecision');
  expj.AE0020020.AE0020020form1.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020020form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020020form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020020form1', 'ITEM_CD', this);
  });
  expj.AE0020020.AE0020020form1.ITEM_CD.executePScriptOnLoad();
};

expj.AE0020020.AE0020020form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AE0020020form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020020form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020020form1-ITEM_CD" name="ITEM_CD" class="AE0020020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getITEM_CD()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0020020-AE0020020form1-ITEM_NAME">
expj.AE0020020.AE0020020form1.ITEM_NAME = {};
expj.AE0020020.AE0020020form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AE0020020form1/ITEM_NAME.onDecision');
  expj.AE0020020.AE0020020form1.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020020form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020020form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020020form1', 'ITEM_NAME', this);
  });
  expj.AE0020020.AE0020020form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AE0020020.AE0020020form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0020020form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020020form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020020form1-ITEM_NAME" name="ITEM_NAME" class="AE0020020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AE0020020-AE0020020button1">
expj.AE0020020.AE0020020button1 = {};
expj.AE0020020.AE0020020button1.executeAllOnDecision = function () {
  console.log('execute AE0020020button1.onDecision');
};
expj.AE0020020.AE0020020button1.executeOnLoad = function () {
  expj.AE0020020.AE0020020button1.executePScriptOnLoad();
};

expj.AE0020020.AE0020020button1.executePScriptOnLoad = function () {
  console.log('execute AE0020020button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0020020-AE0020020button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0020020-AE0020020button1-Detail">
expj.AE0020020.AE0020020button1.Detail = {};
// script1="onClick;0;FSHOW;AE0020020float1"
expj.AE0020020.AE0020020button1.Detail.onClick0 = function () {
  console.log('Detail script1');
expj.common.pscript.showDetailWindow('AE0020020', 'AE0020020float1', '');
};
expj.AE0020020.AE0020020button1.Detail.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020020button1.Detail['onClick' + i])) {
        expj.AE0020020.AE0020020button1.Detail['onClick' + i]();
      }
    }
  }
};
expj.AE0020020.AE0020020button1.Detail.executeAllOnDecision = function () {
};
expj.AE0020020.AE0020020button1.Detail.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020020button1-Detail').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0020020', 'AE0020020button1', 'Detail', this, 'Button');
    }
  });
  expj.AE0020020.AE0020020button1.Detail.executePScriptOnLoad();
};

expj.AE0020020.AE0020020button1.Detail.executePScriptOnLoad = function () {
  console.log('execute AE0020020button1/Detail.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020020button1-Detail');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0020020-AE0020020button1-Detail" name="Detail" class="AE0020020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDetail",rb)%></button><!-- 詳細ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AE0020020-AE0020020view1">
expj.AE0020020.AE0020020view1 = {};
expj.AE0020020.AE0020020view1.executeAllOnClick = function () {
};
expj.AE0020020.AE0020020view1.executeAllOnDecision = function () {
  console.log('execute AE0020020view1.onDecision');
};
expj.AE0020020.AE0020020view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AE0020020view1", "expj.AE0020020.AE0020020view1.executeAllOnClick");
%>
  expj.AE0020020.AE0020020view1.executePScriptOnLoad();
};

expj.AE0020020.AE0020020view1.executePScriptOnLoad = function () {
  console.log('execute AE0020020view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AE0020020-AE0020020view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AE0020020view1_Id = "AE0020020view1";
 String AE0020020view1_select = "single";
 String AE0020020view1_sortable = "true";
 String AE0020020view1_resize = "true";
 String AE0020020view1_scroll = "true";
 StringBuffer AE0020020view1_HB = new StringBuffer();
 StringBuffer AE0020020view1_DB = new StringBuffer();
%>
<%
 AE0020020view1_select = "single";
 AE0020020view1_sortable = "true";
 AE0020020view1_resize = "true";
 AE0020020view1_scroll = "true";
%>
<%
 AE0020020view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AE0020020view1_sortable).append("}").append(",");
%>
     
<%
AE0020020view1_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_START_DATE_1",rb))).append("', 'name':'l_PUCH_ODR_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0020020view1_sortable).append("}").append(",");
AE0020020view1_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_DLV_DATE",rb))).append("', 'name':'l_PUCH_ODR_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0020020view1_sortable).append("}").append(",");
AE0020020view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_QTY",rb))).append("', 'name':'l_PUCH_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0020020view1_sortable).append("}").append(",");
AE0020020view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_UNIT",rb))).append("', 'name':'l_STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0020020view1_sortable).append("}").append(",");
AE0020020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNIT_COST",rb))).append("', 'name':'l_UNIT_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0020020view1_sortable).append("}").append(",");
AE0020020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNIT_COST_TYP",rb))).append("', 'name':'l_UNIT_COST_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0020020view1_sortable).append("}").append(",");
AE0020020view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_2",rb))).append("', 'name':'l_PUCH_ODR_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0020020view1_sortable).append("}").append(",");
AE0020020view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUR_UNIT",rb))).append("', 'name':'l_CUR_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0020020view1_sortable).append("}").append(",");
AE0020020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'l_VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0020020view1_sortable).append("}").append(",");
AE0020020view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_NAME",rb))).append("', 'name':'l_VEND_ANAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0020020view1_sortable).append("}").append(",");
AE0020020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_CD_2",rb))).append("', 'name':'l_WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0020020view1_sortable).append("}").append(",");
AE0020020view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_NAME_1",rb))).append("', 'name':'l_WH_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0020020view1_sortable).append("}").append(",");
AE0020020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_CD",rb))).append("', 'name':'l_PUCH_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0020020view1_sortable).append("}").append(",");
AE0020020view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AE0020020view1_sortable).append("}").append(",");
AE0020020view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_PUCH_ODR_STS_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AE0020020view1_sortable).append("}").append(",");
%>
<%
 int aAE0020020StructLength = aAE0020020Control.getListsize();
 final AE0020020Struct structBackup = aAE0020020Struct;
 aAE0020020Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAE0020020StructLength; ++loopCount) {
  if((aAE0020020Struct = (AE0020020Struct) aAE0020020Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAE0020020Struct", aAE0020020Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AE0020020view1_DB.append("[");
 AE0020020view1_DB.append(loopCount);
 AE0020020view1_DB.append(",").append("'<span id=\"expj-AE0020020-AE0020020view1-l_PUCH_ODR_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0020020-AE0020020view1-l_PUCH_ODR_START_DATE\" data-name=\"l_PUCH_ODR_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getl_PUCH_ODR_START_DATE())).append("</span>'");
 AE0020020view1_DB.append(",").append("'<span id=\"expj-AE0020020-AE0020020view1-l_PUCH_ODR_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0020020-AE0020020view1-l_PUCH_ODR_DLV_DATE\" data-name=\"l_PUCH_ODR_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getl_PUCH_ODR_DLV_DATE())).append("</span>'");
 AE0020020view1_DB.append(",").append("'<span id=\"expj-AE0020020-AE0020020view1-l_PUCH_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AE0020020-AE0020020view1-l_PUCH_ODR_QTY\" data-name=\"l_PUCH_ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0020020Struct.getl_PUCH_ODR_QTY())).append("</span>'");
 AE0020020view1_DB.append(",").append("'<span id=\"expj-AE0020020-AE0020020view1-l_STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AE0020020-AE0020020view1-l_STOCK_UNIT\" data-name=\"l_STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getl_STOCK_UNIT())).append("</span>'");
 AE0020020view1_DB.append(",").append("'<span id=\"expj-AE0020020-AE0020020view1-l_UNIT_COST-").append(loopCount).append("\" class=\"expj-label expj-AE0020020-AE0020020view1-l_UNIT_COST\" data-name=\"l_UNIT_COST\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0020020Struct.getl_UNIT_COST())).append("</span>'");
 AE0020020view1_DB.append(",").append("'<span id=\"expj-AE0020020-AE0020020view1-l_UNIT_COST_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AE0020020-AE0020020view1-l_UNIT_COST_TYP_DN\" data-name=\"l_UNIT_COST_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getl_UNIT_COST_TYP_DN())).append("</span>'");
 AE0020020view1_DB.append(",").append("'<span id=\"expj-AE0020020-AE0020020view1-l_PUCH_ODR_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-AE0020020-AE0020020view1-l_PUCH_ODR_AMOUNT\" data-name=\"l_PUCH_ODR_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0020020Struct.getl_PUCH_ODR_AMOUNT())).append("</span>'");
 AE0020020view1_DB.append(",").append("'<span id=\"expj-AE0020020-AE0020020view1-l_CUR_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AE0020020-AE0020020view1-l_CUR_UNIT\" data-name=\"l_CUR_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getl_CUR_UNIT())).append("</span>'");
 AE0020020view1_DB.append(",").append("'<span id=\"expj-AE0020020-AE0020020view1-l_VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0020020-AE0020020view1-l_VEND_CD\" data-name=\"l_VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getl_VEND_CD())).append("</span>'");
 AE0020020view1_DB.append(",").append("'<span id=\"expj-AE0020020-AE0020020view1-l_VEND_ANAME-").append(loopCount).append("\" class=\"expj-label expj-AE0020020-AE0020020view1-l_VEND_ANAME\" data-name=\"l_VEND_ANAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getl_VEND_ANAME())).append("</span>'");
 AE0020020view1_DB.append(",").append("'<span id=\"expj-AE0020020-AE0020020view1-l_WH_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0020020-AE0020020view1-l_WH_CD\" data-name=\"l_WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getl_WH_CD())).append("</span>'");
 AE0020020view1_DB.append(",").append("'<span id=\"expj-AE0020020-AE0020020view1-l_WH_NAME-").append(loopCount).append("\" class=\"expj-label expj-AE0020020-AE0020020view1-l_WH_NAME\" data-name=\"l_WH_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getl_WH_NAME())).append("</span>'");
 AE0020020view1_DB.append(",").append("'<span id=\"expj-AE0020020-AE0020020view1-l_PUCH_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0020020-AE0020020view1-l_PUCH_ODR_CD\" data-name=\"l_PUCH_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getl_PUCH_ODR_CD())).append("</span>'");
 AE0020020view1_DB.append(",").append("'<span id=\"expj-AE0020020-AE0020020view1-l_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AE0020020-AE0020020view1-l_MODIFY_COUNT\" data-name=\"l_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getl_MODIFY_COUNT())).append("</span>'");
 AE0020020view1_DB.append(",").append("'<span id=\"expj-AE0020020-AE0020020view1-l_PUCH_ODR_STS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AE0020020-AE0020020view1-l_PUCH_ODR_STS_TYP\" data-name=\"l_PUCH_ODR_STS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getl_PUCH_ODR_STS_TYP())).append("</span>'");
 AE0020020view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAE0020020StructLength) {
   AE0020020view1_DB.append(",");
  }
 }
 aAE0020020Struct = structBackup;
 viewIdList.add(AE0020020view1_Id);
 viewSelectList.add(AE0020020view1_select);
 viewResizeList.add(AE0020020view1_resize);
 viewScrollList.add(AE0020020view1_scroll);
 viewHeaderDataList.add(AE0020020view1_HB);
 viewBodyDataList.add(AE0020020view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:420px;"><script class="expj-script-AE0020020-AE0020020button2">
expj.AE0020020.AE0020020button2 = {};
expj.AE0020020.AE0020020button2.executeAllOnDecision = function () {
  console.log('execute AE0020020button2.onDecision');
};
expj.AE0020020.AE0020020button2.executeOnLoad = function () {
  expj.AE0020020.AE0020020button2.executePScriptOnLoad();
};

expj.AE0020020.AE0020020button2.executePScriptOnLoad = function () {
  console.log('execute AE0020020button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0020020-AE0020020button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0020020-AE0020020button2-LineInsert">
expj.AE0020020.AE0020020button2.LineInsert = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AE0020020form1/*@AE0020020Servlet"
expj.AE0020020.AE0020020button2.LineInsert.onClick0 = function () {
  console.log('LineInsert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0020020', 'AE0020020button2', '_AE0020020form1/*', 'AE0020020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0020020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0020020', response);
expj.common.changeBusinessScreenTab('AE0020020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0020020.AE0020020button2.LineInsert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020020button2.LineInsert['onClick' + i])) {
        expj.AE0020020.AE0020020button2.LineInsert['onClick' + i]();
      }
    }
  }
};
expj.AE0020020.AE0020020button2.LineInsert.executeAllOnDecision = function () {
};
expj.AE0020020.AE0020020button2.LineInsert.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020020button2-LineInsert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0020020', 'AE0020020button2', 'LineInsert', this, 'Button');
    }
  });
  expj.AE0020020.AE0020020button2.LineInsert.executePScriptOnLoad();
};

expj.AE0020020.AE0020020button2.LineInsert.executePScriptOnLoad = function () {
  console.log('execute AE0020020button2/LineInsert.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020020button2-LineInsert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0020020-AE0020020button2-LineInsert" name="LineInsert" class="AE0020020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsert",rb)%></button><!-- 行追加ボタン --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020020button2-LineUpdate">
expj.AE0020020.AE0020020button2.LineUpdate = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AE0020020form1/*,_AE0020020view1/+@AE0020020Servlet"
expj.AE0020020.AE0020020button2.LineUpdate.onClick0 = function () {
  console.log('LineUpdate script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0020020', 'AE0020020button2', '_AE0020020form1/*,_AE0020020view1/+', 'AE0020020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0020020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0020020', response);
expj.common.changeBusinessScreenTab('AE0020020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0020020.AE0020020button2.LineUpdate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020020button2.LineUpdate['onClick' + i])) {
        expj.AE0020020.AE0020020button2.LineUpdate['onClick' + i]();
      }
    }
  }
};
expj.AE0020020.AE0020020button2.LineUpdate.executeAllOnDecision = function () {
};
expj.AE0020020.AE0020020button2.LineUpdate.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020020button2-LineUpdate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0020020', 'AE0020020button2', 'LineUpdate', this, 'Button');
    }
  });
  expj.AE0020020.AE0020020button2.LineUpdate.executePScriptOnLoad();
};

expj.AE0020020.AE0020020button2.LineUpdate.executePScriptOnLoad = function () {
  console.log('execute AE0020020button2/LineUpdate.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020020button2-LineUpdate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0020020-AE0020020button2-LineUpdate" name="LineUpdate" class="AE0020020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020020button2-LineCopy">
expj.AE0020020.AE0020020button2.LineCopy = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AE0020020form1/*,_AE0020020view1/+@AE0020020Servlet"
expj.AE0020020.AE0020020button2.LineCopy.onClick0 = function () {
  console.log('LineCopy script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0020020', 'AE0020020button2', '_AE0020020form1/*,_AE0020020view1/+', 'AE0020020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0020020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0020020', response);
expj.common.changeBusinessScreenTab('AE0020020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0020020.AE0020020button2.LineCopy.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020020button2.LineCopy['onClick' + i])) {
        expj.AE0020020.AE0020020button2.LineCopy['onClick' + i]();
      }
    }
  }
};
expj.AE0020020.AE0020020button2.LineCopy.executeAllOnDecision = function () {
};
expj.AE0020020.AE0020020button2.LineCopy.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020020button2-LineCopy').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0020020', 'AE0020020button2', 'LineCopy', this, 'Button');
    }
  });
  expj.AE0020020.AE0020020button2.LineCopy.executePScriptOnLoad();
};

expj.AE0020020.AE0020020button2.LineCopy.executePScriptOnLoad = function () {
  console.log('execute AE0020020button2/LineCopy.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020020button2-LineCopy');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0020020-AE0020020button2-LineCopy" name="LineCopy" class="AE0020020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineCopy",rb)%></button><!-- 行複写ボタン --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020020button2-LineDelete">
expj.AE0020020.AE0020020button2.LineDelete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0020020form1/*,_AE0020020view1/+@AE0020020Servlet,,$ZZ07004"
expj.AE0020020.AE0020020button2.LineDelete.onClick0 = function () {
  console.log('LineDelete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0020020', 'AE0020020button2', '_AE0020020form1/*,_AE0020020view1/+', 'AE0020020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0020020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0020020', response);
expj.common.updateBusinessScreenTab('AE0020020', contents);
};
expj.common.pscript.callConfirm('AE0020020', 'AE0020020button2', 'ZZ07004', okEvent);
};
expj.AE0020020.AE0020020button2.LineDelete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020020button2.LineDelete['onClick' + i])) {
        expj.AE0020020.AE0020020button2.LineDelete['onClick' + i]();
      }
    }
  }
};
expj.AE0020020.AE0020020button2.LineDelete.executeAllOnDecision = function () {
};
expj.AE0020020.AE0020020button2.LineDelete.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020020button2-LineDelete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0020020', 'AE0020020button2', 'LineDelete', this, 'Button');
    }
  });
  expj.AE0020020.AE0020020button2.LineDelete.executePScriptOnLoad();
};

expj.AE0020020.AE0020020button2.LineDelete.executePScriptOnLoad = function () {
  console.log('execute AE0020020button2/LineDelete.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020020button2-LineDelete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0020020-AE0020020button2-LineDelete" name="LineDelete" class="AE0020020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineDelete",rb)%></button><!-- 行削除ボタン --></div><!--/td-->
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
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 95px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AE0020020 Revision: 1.6  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AE0020020-AE0020020button0">
expj.AE0020020.AE0020020button0 = {};
expj.AE0020020.AE0020020button0.executeAllOnDecision = function () {
  console.log('execute AE0020020button0.onDecision');
};
expj.AE0020020.AE0020020button0.executeOnLoad = function () {
  expj.AE0020020.AE0020020button0.executePScriptOnLoad();
};

expj.AE0020020.AE0020020button0.executePScriptOnLoad = function () {
  console.log('execute AE0020020button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0020020-AE0020020button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0020020-AE0020020button0-Close">
expj.AE0020020.AE0020020button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AE0020020.AE0020020button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AE0020020');
};
expj.AE0020020.AE0020020button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020020button0.Close['onClick' + i])) {
        expj.AE0020020.AE0020020button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AE0020020.AE0020020button0.Close.executeAllOnDecision = function () {
};
expj.AE0020020.AE0020020button0.Close.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020020button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0020020', 'AE0020020button0', 'Close', this, 'Button');
    }
  });
  expj.AE0020020.AE0020020button0.Close.executePScriptOnLoad();
};

expj.AE0020020.AE0020020button0.Close.executePScriptOnLoad = function () {
  console.log('execute AE0020020button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020020button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0020020-AE0020020button0-Close" name="Close" class="AE0020020-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AE0020020 (END)-->
<script class="expj-script-AE0020020-AE0020020detail1">
expj.AE0020020.AE0020020detail1 = {};
expj.AE0020020.AE0020020detail1.executeAllOnDecision = function () {
  console.log('execute AE0020020detail1.onDecision');
};
expj.AE0020020.AE0020020detail1.executeOnLoad = function () {
  expj.AE0020020.AE0020020detail1.executePScriptOnLoad();
};

expj.AE0020020.AE0020020detail1.executePScriptOnLoad = function () {
  console.log('execute AE0020020detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAE0020020Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AE0020020-AE0020020detail1" class="expj-datagird-detail" data-float="AE0020020float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AE0020020detail1";
 detailFloat = "AE0020020float1";
 detailWidth = 358;
 detailHeight = 200 + 47;
 String AE0020020detail1_Id = "AE0020020detail1";
 String AE0020020detail1_select = "single";
 String AE0020020detail1_sortable = "true";
 String AE0020020detail1_resize = "true";
 String AE0020020detail1_scroll = "true";
 StringBuffer AE0020020detail1_HB = new StringBuffer();
 StringBuffer AE0020020detail1_DB = new StringBuffer();
%>
<%
 AE0020020detail1_sortable = "false";
 AE0020020detail1_select = "none";
%>
<% AE0020020detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AE0020020detail1_sortable).append("}").append(","); %>
<%  AE0020020detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AE0020020detail1_sortable).append("}").append(",");
AE0020020detail1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AE0020020detail1_sortable).append("}").append(",");
AE0020020detail1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AE0020020detail1_sortable).append("}").append(",");
 %>
  <% AE0020020detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.JOB_ODR_TYP",rb)).append("','").append("<span id=\"expj-AE0020020-AE0020020detail1-JOB_ODR_TYP_DN\" class=\"expj-label\" data-name=\"JOB_ODR_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getJOB_ODR_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020020detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.ALC_GRP_CD",rb)).append("','").append("<span id=\"expj-AE0020020-AE0020020detail1-ALC_GRP_CD\" class=\"expj-label\" data-name=\"ALC_GRP_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getALC_GRP_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020020detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.DRAW_CD",rb)).append("','").append("<span id=\"expj-AE0020020-AE0020020detail1-DRAW_CD\" class=\"expj-label\" data-name=\"DRAW_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getDRAW_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020020detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.SPEC",rb)).append("','").append("<span id=\"expj-AE0020020-AE0020020detail1-SPEC\" class=\"expj-label\" data-name=\"SPEC\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getSPEC())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020020detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)).append("','").append("<span id=\"expj-AE0020020-AE0020020detail1-OUTSIDE_TYP_DN\" class=\"expj-label\" data-name=\"OUTSIDE_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getOUTSIDE_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020020detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)).append("','").append("<span id=\"expj-AE0020020-AE0020020detail1-MRP_ODR_TYP_DN\" class=\"expj-label\" data-name=\"MRP_ODR_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getMRP_ODR_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020020detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.ITEM_SPOIL",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0020020-AE0020020detail1-ITEM_SPOIL\" class=\"expj-label\" data-name=\"ITEM_SPOIL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;9.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0020020Struct.getITEM_SPOIL())).append("</span>").append("</div>','").append(CoreTools.getRBString("Expj.Cmt0051",rb)).append("']").append(",");%>
 <% AE0020020detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.UNIT_QTY_TYP",rb)).append("','").append("<span id=\"expj-AE0020020-AE0020020detail1-UNIT_QTY_TYP_DN\" class=\"expj-label\" data-name=\"UNIT_QTY_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getUNIT_QTY_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020020detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.JOB_ODR_DLV_DATE",rb)).append("','").append("<span id=\"expj-AE0020020-AE0020020detail1-JOB_ODR_DLV_DATE\" class=\"expj-label\" data-name=\"JOB_ODR_DLV_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getJOB_ODR_DLV_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020020detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.DUE_DATE",rb)).append("','").append("<span id=\"expj-AE0020020-AE0020020detail1-DUE_DATE\" class=\"expj-label\" data-name=\"DUE_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getDUE_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020020detail1_DB.append("['11','").append(CoreTools.getRBString("Expj.PRD_DUE_DATE",rb)).append("','").append("<span id=\"expj-AE0020020-AE0020020detail1-PRD_DUE_DATE\" class=\"expj-label\" data-name=\"PRD_DUE_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getPRD_DUE_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020020detail1_DB.append("['12','").append(CoreTools.getRBString("Expj.PRD_START_DATE",rb)).append("','").append("<span id=\"expj-AE0020020-AE0020020detail1-PRD_START_DATE\" class=\"expj-label\" data-name=\"PRD_START_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getPRD_START_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020020detail1_DB.append("['13','").append(CoreTools.getRBString("Expj.ODR_START_DATE",rb)).append("','").append("<span id=\"expj-AE0020020-AE0020020detail1-ODR_START_DATE\" class=\"expj-label\" data-name=\"ODR_START_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getODR_START_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <script class="expj-script-AE0020020-AE0020020detail1-STOCK_UNIT">
expj.AE0020020.AE0020020detail1.STOCK_UNIT = {};
expj.AE0020020.AE0020020detail1.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0020020detail1/STOCK_UNIT.onDecision');
  expj.AE0020020.AE0020020detail1.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020020detail1.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020020detail1-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020020detail1', 'STOCK_UNIT', this);
  });
  expj.AE0020020.AE0020020detail1.STOCK_UNIT.executePScriptOnLoad();
};

expj.AE0020020.AE0020020detail1.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0020020detail1/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020020detail1-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<% AE0020020detail1_DB.append("['14','").append(CoreTools.getRBString("Expj.PUCH_ODR_QTY_2",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0020020-AE0020020detail1-SUM_PUCH_ODR_QTY\" class=\"expj-label\" data-name=\"SUM_PUCH_ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0020020Struct.getSUM_PUCH_ODR_QTY())).append("</span>").append("</div>','").append("<input type=\"text\" id=\"expj-AE0020020-AE0020020detail1-STOCK_UNIT\" data-detailItem=\"true\" name=\"STOCK_UNIT\" class=\" \" style=\"width:100%;\" data-kind=\"\" value=\"").append(TypeConverter.sanitizer(aAE0020020Struct.getSTOCK_UNIT())).append("\"").append(" maxlength=\"2147483647\" >").append("']").append(",");%>
 <script class="expj-script-AE0020020-AE0020020detail1-d1_STOCK_UNIT">
expj.AE0020020.AE0020020detail1.d1_STOCK_UNIT = {};
expj.AE0020020.AE0020020detail1.d1_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0020020detail1/d1_STOCK_UNIT.onDecision');
  expj.AE0020020.AE0020020detail1.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020020detail1.d1_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020020detail1-d1_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020020detail1', 'd1_STOCK_UNIT', this);
  });
  expj.AE0020020.AE0020020detail1.d1_STOCK_UNIT.executePScriptOnLoad();
};

expj.AE0020020.AE0020020detail1.d1_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0020020detail1/d1_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020020detail1-d1_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<% AE0020020detail1_DB.append("['15','").append(CoreTools.getRBString("Expj.OPR_INST_QTY_1",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0020020-AE0020020detail1-SUM_OPR_INST_QTY\" class=\"expj-label\" data-name=\"SUM_OPR_INST_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0020020Struct.getSUM_OPR_INST_QTY())).append("</span>").append("</div>','").append("<input type=\"text\" id=\"expj-AE0020020-AE0020020detail1-d1_STOCK_UNIT\" data-detailItem=\"true\" name=\"d1_STOCK_UNIT\" class=\" \" style=\"width:100%;\" data-kind=\"\" value=\"").append(TypeConverter.sanitizer(aAE0020020Struct.getSTOCK_UNIT())).append("\"").append(" maxlength=\"2147483647\" >").append("']").append(",");%>
 <script class="expj-script-AE0020020-AE0020020detail1-d2_STOCK_UNIT">
expj.AE0020020.AE0020020detail1.d2_STOCK_UNIT = {};
expj.AE0020020.AE0020020detail1.d2_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0020020detail1/d2_STOCK_UNIT.onDecision');
  expj.AE0020020.AE0020020detail1.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020020detail1.d2_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020020detail1-d2_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020020detail1', 'd2_STOCK_UNIT', this);
  });
  expj.AE0020020.AE0020020detail1.d2_STOCK_UNIT.executePScriptOnLoad();
};

expj.AE0020020.AE0020020detail1.d2_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0020020detail1/d2_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020020detail1-d2_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<% AE0020020detail1_DB.append("['16','").append(CoreTools.getRBString("Expj.ODR_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0020020-AE0020020detail1-ODR_QTY\" class=\"expj-label\" data-name=\"ODR_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0020020Struct.getODR_QTY())).append("</span>").append("</div>','").append("<input type=\"text\" id=\"expj-AE0020020-AE0020020detail1-d2_STOCK_UNIT\" data-detailItem=\"true\" name=\"d2_STOCK_UNIT\" class=\" \" style=\"width:100%;\" data-kind=\"\" value=\"").append(TypeConverter.sanitizer(aAE0020020Struct.getSTOCK_UNIT())).append("\"").append(" maxlength=\"2147483647\" >").append("']").append(",");%>
 <script class="expj-script-AE0020020-AE0020020detail1-d3_STOCK_UNIT">
expj.AE0020020.AE0020020detail1.d3_STOCK_UNIT = {};
expj.AE0020020.AE0020020detail1.d3_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0020020detail1/d3_STOCK_UNIT.onDecision');
  expj.AE0020020.AE0020020detail1.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020020detail1.d3_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020020detail1-d3_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020020detail1', 'd3_STOCK_UNIT', this);
  });
  expj.AE0020020.AE0020020detail1.d3_STOCK_UNIT.executePScriptOnLoad();
};

expj.AE0020020.AE0020020detail1.d3_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0020020detail1/d3_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020020detail1-d3_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<% AE0020020detail1_DB.append("['17','").append(CoreTools.getRBString("Expj.DM_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0020020-AE0020020detail1-DM_QTY\" class=\"expj-label\" data-name=\"DM_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0020020Struct.getDM_QTY())).append("</span>").append("</div>','").append("<input type=\"text\" id=\"expj-AE0020020-AE0020020detail1-d3_STOCK_UNIT\" data-detailItem=\"true\" name=\"d3_STOCK_UNIT\" class=\" \" style=\"width:100%;\" data-kind=\"\" value=\"").append(TypeConverter.sanitizer(aAE0020020Struct.getSTOCK_UNIT())).append("\"").append(" maxlength=\"2147483647\" >").append("']").append(",");%>
 <script class="expj-script-AE0020020-AE0020020detail1-d4_STOCK_UNIT">
expj.AE0020020.AE0020020detail1.d4_STOCK_UNIT = {};
expj.AE0020020.AE0020020detail1.d4_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0020020detail1/d4_STOCK_UNIT.onDecision');
  expj.AE0020020.AE0020020detail1.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020020detail1.d4_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020020detail1-d4_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020020detail1', 'd4_STOCK_UNIT', this);
  });
  expj.AE0020020.AE0020020detail1.d4_STOCK_UNIT.executePScriptOnLoad();
};

expj.AE0020020.AE0020020detail1.d4_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0020020detail1/d4_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020020detail1-d4_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<% AE0020020detail1_DB.append("['18','").append(CoreTools.getRBString("Expj.ALCD_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0020020-AE0020020detail1-SUM_ALCD_QTY\" class=\"expj-label\" data-name=\"SUM_ALCD_QTY\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0020020Struct.getSUM_ALCD_QTY())).append("</span>").append("</div>','").append("<input type=\"text\" id=\"expj-AE0020020-AE0020020detail1-d4_STOCK_UNIT\" data-detailItem=\"true\" name=\"d4_STOCK_UNIT\" class=\" \" style=\"width:100%;\" data-kind=\"\" value=\"").append(TypeConverter.sanitizer(aAE0020020Struct.getSTOCK_UNIT())).append("\"").append(" maxlength=\"2147483647\" >").append("']").append(",");%>
 <% AE0020020detail1_DB.append("['19','").append(CoreTools.getRBString("Expj.ODR_STS_TYP",rb)).append("','").append("<span id=\"expj-AE0020020-AE0020020detail1-ODR_STS_TYP_DN\" class=\"expj-label\" data-name=\"ODR_STS_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getODR_STS_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0020020detail1_DB.append("['20','").append(CoreTools.getRBString("Expj.DM_STS_TYP",rb)).append("','").append("<span id=\"expj-AE0020020-AE0020020detail1-DM_STS_TYP_DN\" class=\"expj-label\" data-name=\"DM_STS_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0020020Struct.getDM_STS_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
<%
 detailViewId = AE0020020detail1_Id;
 detailViewSelect = AE0020020detail1_select;
 detailViewResize = AE0020020detail1_resize;
 detailViewScroll = AE0020020detail1_scroll;
 detailViewHeaderData = AE0020020detail1_HB;
 detailViewBodyData = AE0020020detail1_DB;
%>
<%
}
%>
<%
MessageStruct msgStruct = aAE0020020Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AE0020020-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AE0020020)) {
  expj.common.treeInstanceMap.AE0020020 = {};
}
expj.common.treeInstanceMap.AE0020020.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0020020.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AE0020020.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0020020.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AE0020020.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AE0020020.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AE0020020.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AE0020020.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AE0020020.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AE0020020-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AE0020020-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0020020)) {
  expj.common.detailDialogMap.AE0020020 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0020020._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AE0020020._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0020020.<%=detailId %>)) {
  expj.common.detailDialogMap.AE0020020.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0020020.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AE0020020.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0020020.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AE0020020.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AE0020020.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AE0020020.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AE0020020-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AE0020020.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AE0020020-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AE0020020.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AE0020020-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AE0020020.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AE0020020.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AE0020020.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AE0020020._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AE0020020-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AE0020020)) {
  expj.common.viewInstanceMap.AE0020020 = {};
}
expj.common.viewInstanceMap.AE0020020.<%=viewId %> = {};
expj.common.viewInstanceMap.AE0020020.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AE0020020.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AE0020020.<%=viewId %>.init = function () {
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
    expj.AE0020020.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AE0020020.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AE0020020-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AE0020020-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AE0020020_init">
/**
 * AE0020020用のロード完了時初期化関数
 */
expj.AE0020020.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AE0020020');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AE0020020');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AE0020020');
  expj.common.calendarInstanceMap.AE0020020 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AE0020020.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AE0020020.<%=detailId %>.init();
  expj.common.detailDialogMap.AE0020020.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AE0020020.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AE0020020.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AE0020020');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AE0020020');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AE0020020-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AE0020020-<%=detailId %>');
<%
 }
%>
  try{expj.AE0020020.AE0020020form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020020form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020020form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020020form1.JOB_ODR_CANCEL_NO.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020020form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020020form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020020button1.Detail.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020020button2.LineInsert.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020020button2.LineUpdate.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020020button2.LineCopy.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020020button2.LineDelete.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020020button0.Close.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020020detail1.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020020detail1.d1_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020020detail1.d2_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020020detail1.d3_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020020detail1.d4_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020020form1.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020020button1.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020020view1.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020020button2.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020020button0.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020020detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AE0020020.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AE0020020', 'AE0020020');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AE0020020');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AE0020020-focus-move');
  // 初期フォーカス当てる処理
  $('.AE0020020-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AE0020020', '<%=request.getContextPath() %>');
};

/**
 * AE0020020の全体onDecision処理
 */
expj.AE0020020.executeAllOnDecision = function () {
  expj.AE0020020.AE0020020form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AE0020020_console">
expj.AE0020020.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>