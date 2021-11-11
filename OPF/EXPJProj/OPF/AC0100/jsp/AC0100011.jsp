<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:28:34 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AC0100\AC0100011.html
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

製番引当メンテナンスサブ１
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0100/jsp/AC0100011.jsp,v $
$Author: geng-jia $	
$Revision: 1.20 $ $Date: 2017/02/22 02:04:31 $
********************************************************* --%>
<html>
<head>
<title>製番引当メンテナンスサブ１</title>
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
<script class="expj-script-AC0100010_init">
  // AC0100010名前空間
  expj.AC0100010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
 <% String callButton = aAC0100010Control.getButton(); %>
 <%
 	String kind1 = "OBT_NUMBER_P;14.1;FLOOR;4";
 	String kind2 = "OBT_NUMBER_P;14.1;FLOOR;4";
	if ("1".equals(aAC0100010Struct.getALC_TYP_2())) {
		kind2 = "";
	}
	if ("AlcInsert".equals(aAC0100010Control.getMode())) {
		kind1 = "";
	}
 %>
 <div id="expj-business-screen-AC0100010" data-screen="AC0100011" data-newdata="<%=aAC0100010Control.isNewData() %>">
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
              <script class="expj-script-AC0100010-AC0100011form1">
expj.AC0100010.AC0100011form1 = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.AC0100010.AC0100011form1.onLoad0 = function () {
  console.log('AC0100011form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHK;_AC0100011form3/ALC_TYP_2[eq]3@*0,*1"
expj.AC0100010.AC0100011form1.onDecision0 = function () {
  console.log('AC0100011form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0100010', 'AC0100011form1', '_AC0100011form3/ALC_TYP_2'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;MASK;_AC0100011form3/ALCD_QTY,_AC0100011form3/ODR_QTY,_AC0100011button1/Insert,_AC0100011button1/Update"
expj.AC0100010.AC0100011form1.child0 = function () {
  console.log('AC0100011form1 script3');
expj.common.pscript.setMaskToReferenceComponent('AC0100010', 'AC0100011form1', '_AC0100011form3/ALCD_QTY');
expj.common.pscript.setMaskToReferenceComponent('AC0100010', 'AC0100011form1', '_AC0100011form3/ODR_QTY');
expj.common.pscript.setMaskToReferenceComponent('AC0100010', 'AC0100011form1', '_AC0100011button1/Insert');
expj.common.pscript.setMaskToReferenceComponent('AC0100010', 'AC0100011form1', '_AC0100011button1/Update');
};
// script4="child;1;CHK;<%=TypeConverter.sanitizer(callButton)%>[eq]AlcInsert[or]<%=TypeConverter.sanitizer(callButton)%>[eq]Insert@*2,*4"
expj.AC0100010.AC0100011form1.child1 = function () {
  console.log('AC0100011form1 script4');
if (expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(callButton)%>', '[eq]', 'AlcInsert') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(callButton)%>', '[eq]', 'Insert')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script5="child;2;UNMASK;_AC0100011button1/Insert,_AC0100011form3/ALCD_QTY@*3"
expj.AC0100010.AC0100011form1.child2 = function () {
  console.log('AC0100011form1 script5');
expj.common.pscript.setUnMaskToReferenceComponent('AC0100010', 'AC0100011form1', '_AC0100011button1/Insert');
expj.common.pscript.setUnMaskToReferenceComponent('AC0100010', 'AC0100011form1', '_AC0100011form3/ALCD_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script6="child;3;MASK;_AC0100011button1/Update,_AC0100011form3/ODR_QTY"
expj.AC0100010.AC0100011form1.child3 = function () {
  console.log('AC0100011form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AC0100010', 'AC0100011form1', '_AC0100011button1/Update');
expj.common.pscript.setMaskToReferenceComponent('AC0100010', 'AC0100011form1', '_AC0100011form3/ODR_QTY');
};
// script7="child;4;UNMASK;_AC0100011button1/Update,_AC0100011form3/ALCD_QTY@*5"
expj.AC0100010.AC0100011form1.child4 = function () {
  console.log('AC0100011form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AC0100010', 'AC0100011form1', '_AC0100011button1/Update');
expj.common.pscript.setUnMaskToReferenceComponent('AC0100010', 'AC0100011form1', '_AC0100011form3/ALCD_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script8="child;5;MASK;_AC0100011button1/Insert,_AC0100011form3/ODR_QTY"
expj.AC0100010.AC0100011form1.child5 = function () {
  console.log('AC0100011form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AC0100010', 'AC0100011form1', '_AC0100011button1/Insert');
expj.common.pscript.setMaskToReferenceComponent('AC0100010', 'AC0100011form1', '_AC0100011form3/ODR_QTY');
};
expj.AC0100010.AC0100011form1.executeAllOnDecision = function () {
  console.log('execute AC0100011form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0100010.AC0100011form1['onDecision' + i])) {
        expj.AC0100010.AC0100011form1['onDecision' + i]();
      }
    }
  }
};
expj.AC0100010.AC0100011form1.executeOnLoad = function () {
  expj.AC0100010.AC0100011form1.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form1.executePScriptOnLoad = function () {
  console.log('execute AC0100011form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AC0100010.AC0100011form1['onLoad' + i])) {
      expj.AC0100010.AC0100011form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AC0100010-AC0100011form1" action="AC0100010Servlet" name="AC0100011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD_2",rb)%></span><!-- 引当元製番 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form1-JOB_ODR_CD">
expj.AC0100010.AC0100011form1.JOB_ODR_CD = {};
expj.AC0100010.AC0100011form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AC0100011form1/JOB_ODR_CD.onDecision');
  expj.AC0100010.AC0100011form1.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form1', 'JOB_ODR_CD', this);
  });
  expj.AC0100010.AC0100011form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AC0100011form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AC0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getJOB_ODR_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CANCEL_NO",rb)%></span><!-- 製番取消発生番号 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form1-JOB_ODR_CANCEL_NO">
expj.AC0100010.AC0100011form1.JOB_ODR_CANCEL_NO = {};
expj.AC0100010.AC0100011form1.JOB_ODR_CANCEL_NO.executeAllOnDecision = function () {
  console.log('execute AC0100011form1/JOB_ODR_CANCEL_NO.onDecision');
  expj.AC0100010.AC0100011form1.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form1.JOB_ODR_CANCEL_NO.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form1-JOB_ODR_CANCEL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form1', 'JOB_ODR_CANCEL_NO', this);
  });
  expj.AC0100010.AC0100011form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad = function () {
  console.log('execute AC0100011form1/JOB_ODR_CANCEL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form1-JOB_ODR_CANCEL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form1-JOB_ODR_CANCEL_NO" name="JOB_ODR_CANCEL_NO" class="AC0100010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getJOB_ODR_CANCEL_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form1-ITEM_CD">
expj.AC0100010.AC0100011form1.ITEM_CD = {};
expj.AC0100010.AC0100011form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AC0100011form1/ITEM_CD.onDecision');
  expj.AC0100010.AC0100011form1.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form1', 'ITEM_CD', this);
  });
  expj.AC0100010.AC0100011form1.ITEM_CD.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AC0100011form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form1-ITEM_CD" name="ITEM_CD" class="AC0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form1-ITEM_NAME">
expj.AC0100010.AC0100011form1.ITEM_NAME = {};
expj.AC0100010.AC0100011form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AC0100011form1/ITEM_NAME.onDecision');
  expj.AC0100010.AC0100011form1.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form1', 'ITEM_NAME', this);
  });
  expj.AC0100010.AC0100011form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AC0100011form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form1-ITEM_NAME" name="ITEM_NAME" class="AC0100010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OD_NO",rb)%></span><!-- オーダデマンド番号 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form1-OD_NO">
expj.AC0100010.AC0100011form1.OD_NO = {};
expj.AC0100010.AC0100011form1.OD_NO.executeAllOnDecision = function () {
  console.log('execute AC0100011form1/OD_NO.onDecision');
  expj.AC0100010.AC0100011form1.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form1.OD_NO.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form1-OD_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form1', 'OD_NO', this);
  });
  expj.AC0100010.AC0100011form1.OD_NO.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form1.OD_NO.executePScriptOnLoad = function () {
  console.log('execute AC0100011form1/OD_NO.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form1-OD_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form1-OD_NO" name="OD_NO" class="AC0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getOD_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0100010-AC0100011form1-h_OD_NO" name="h_OD_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0100010Struct.geth_OD_NO()) %>">
<script class="expj-script-AC0100010-AC0100011form1-h_OD_NO">
expj.AC0100010.AC0100011form1.h_OD_NO = {};
expj.AC0100010.AC0100011form1.h_OD_NO.executeAllOnDecision = function () {
  console.log('execute AC0100011form1/h_OD_NO.onDecision');
  expj.AC0100010.AC0100011form1.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form1.h_OD_NO.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form1-h_OD_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form1', 'h_OD_NO', this);
  });
  expj.AC0100010.AC0100011form1.h_OD_NO.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form1.h_OD_NO.executePScriptOnLoad = function () {
  console.log('execute AC0100011form1/h_OD_NO.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form1-h_OD_NO');
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
<div class="expj-tr" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><!-- ここに上段検索条件用のDataGridを配置する。↓ --><script class="expj-script-AC0100010-AC0100011form2">
expj.AC0100010.AC0100011form2 = {};
expj.AC0100010.AC0100011form2.executeAllOnDecision = function () {
  console.log('execute AC0100011form2.onDecision');
};
expj.AC0100010.AC0100011form2.executeOnLoad = function () {
  expj.AC0100010.AC0100011form2.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form2.executePScriptOnLoad = function () {
  console.log('execute AC0100011form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AC0100010-AC0100011form2" action="AC0100010Servlet" name="AC0100011form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:119px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:119px;">
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
<script class="expj-script-AC0100010-AC0100011form2-DM_QTY">
expj.AC0100010.AC0100011form2.DM_QTY = {};
expj.AC0100010.AC0100011form2.DM_QTY.executeAllOnDecision = function () {
  console.log('execute AC0100011form2/DM_QTY.onDecision');
  expj.AC0100010.AC0100011form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form2.DM_QTY.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form2-DM_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form2', 'DM_QTY', this);
  });
  expj.AC0100010.AC0100011form2.DM_QTY.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form2.DM_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0100011form2/DM_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form2-DM_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form2-DM_QTY" name="DM_QTY" class="AC0100010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getDM_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form2-STOCK_UNIT">
expj.AC0100010.AC0100011form2.STOCK_UNIT = {};
expj.AC0100010.AC0100011form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AC0100011form2/STOCK_UNIT.onDecision');
  expj.AC0100010.AC0100011form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form2', 'STOCK_UNIT', this);
  });
  expj.AC0100010.AC0100011form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AC0100011form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form2-STOCK_UNIT" name="STOCK_UNIT" class="AC0100010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0352",rb)%></span><!-- 引当可能数合計 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form2-SUM_OF_ALLOCATABLE_QTY">
expj.AC0100010.AC0100011form2.SUM_OF_ALLOCATABLE_QTY = {};
expj.AC0100010.AC0100011form2.SUM_OF_ALLOCATABLE_QTY.executeAllOnDecision = function () {
  console.log('execute AC0100011form2/SUM_OF_ALLOCATABLE_QTY.onDecision');
  expj.AC0100010.AC0100011form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form2.SUM_OF_ALLOCATABLE_QTY.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form2-SUM_OF_ALLOCATABLE_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form2', 'SUM_OF_ALLOCATABLE_QTY', this);
  });
  expj.AC0100010.AC0100011form2.SUM_OF_ALLOCATABLE_QTY.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form2.SUM_OF_ALLOCATABLE_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0100011form2/SUM_OF_ALLOCATABLE_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form2-SUM_OF_ALLOCATABLE_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form2-SUM_OF_ALLOCATABLE_QTY" name="SUM_OF_ALLOCATABLE_QTY" class="AC0100010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getSUM_OF_ALLOCATABLE_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form2-STOCK_UNIT_4">
expj.AC0100010.AC0100011form2.STOCK_UNIT_4 = {};
expj.AC0100010.AC0100011form2.STOCK_UNIT_4.executeAllOnDecision = function () {
  console.log('execute AC0100011form2/STOCK_UNIT_4.onDecision');
  expj.AC0100010.AC0100011form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form2.STOCK_UNIT_4.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form2-STOCK_UNIT_4').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form2', 'STOCK_UNIT_4', this);
  });
  expj.AC0100010.AC0100011form2.STOCK_UNIT_4.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form2.STOCK_UNIT_4.executePScriptOnLoad = function () {
  console.log('execute AC0100011form2/STOCK_UNIT_4.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form2-STOCK_UNIT_4');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form2-STOCK_UNIT_4" name="STOCK_UNIT_4" class="AC0100010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getSTOCK_UNIT_4()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0353",rb)%></span><!-- 引当済み数合計 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form2-SUM_OF_ALCD_QTY">
expj.AC0100010.AC0100011form2.SUM_OF_ALCD_QTY = {};
expj.AC0100010.AC0100011form2.SUM_OF_ALCD_QTY.executeAllOnDecision = function () {
  console.log('execute AC0100011form2/SUM_OF_ALCD_QTY.onDecision');
  expj.AC0100010.AC0100011form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form2.SUM_OF_ALCD_QTY.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form2-SUM_OF_ALCD_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form2', 'SUM_OF_ALCD_QTY', this);
  });
  expj.AC0100010.AC0100011form2.SUM_OF_ALCD_QTY.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form2.SUM_OF_ALCD_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0100011form2/SUM_OF_ALCD_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form2-SUM_OF_ALCD_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form2-SUM_OF_ALCD_QTY" name="SUM_OF_ALCD_QTY" class="AC0100010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getSUM_OF_ALCD_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form2-STOCK_UNIT_1">
expj.AC0100010.AC0100011form2.STOCK_UNIT_1 = {};
expj.AC0100010.AC0100011form2.STOCK_UNIT_1.executeAllOnDecision = function () {
  console.log('execute AC0100011form2/STOCK_UNIT_1.onDecision');
  expj.AC0100010.AC0100011form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form2.STOCK_UNIT_1.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form2-STOCK_UNIT_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form2', 'STOCK_UNIT_1', this);
  });
  expj.AC0100010.AC0100011form2.STOCK_UNIT_1.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form2.STOCK_UNIT_1.executePScriptOnLoad = function () {
  console.log('execute AC0100011form2/STOCK_UNIT_1.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form2-STOCK_UNIT_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form2-STOCK_UNIT_1" name="STOCK_UNIT_1" class="AC0100010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getSTOCK_UNIT_1()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DM_STS_TYP",rb)%></span><!-- デマンド状態区分 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form2-DM_STS_TYP_DN">
expj.AC0100010.AC0100011form2.DM_STS_TYP_DN = {};
expj.AC0100010.AC0100011form2.DM_STS_TYP_DN.executeAllOnDecision = function () {
  console.log('execute AC0100011form2/DM_STS_TYP_DN.onDecision');
  expj.AC0100010.AC0100011form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form2.DM_STS_TYP_DN.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form2-DM_STS_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form2', 'DM_STS_TYP_DN', this);
  });
  expj.AC0100010.AC0100011form2.DM_STS_TYP_DN.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form2.DM_STS_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute AC0100011form2/DM_STS_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form2-DM_STS_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form2-DM_STS_TYP_DN" name="DM_STS_TYP_DN" class="AC0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getDM_STS_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AC0100010-AC0100011form2-DM_STS_TYP" name="DM_STS_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getDM_STS_TYP()) %>">
<script class="expj-script-AC0100010-AC0100011form2-DM_STS_TYP">
expj.AC0100010.AC0100011form2.DM_STS_TYP = {};
expj.AC0100010.AC0100011form2.DM_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AC0100011form2/DM_STS_TYP.onDecision');
  expj.AC0100010.AC0100011form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form2.DM_STS_TYP.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form2-DM_STS_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form2', 'DM_STS_TYP', this);
  });
  expj.AC0100010.AC0100011form2.DM_STS_TYP.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form2.DM_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0100011form2/DM_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form2-DM_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0354",rb)%></span><!-- 引当残数合計 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form2-SUM_OF_ALC_REMAIN_QTY">
expj.AC0100010.AC0100011form2.SUM_OF_ALC_REMAIN_QTY = {};
expj.AC0100010.AC0100011form2.SUM_OF_ALC_REMAIN_QTY.executeAllOnDecision = function () {
  console.log('execute AC0100011form2/SUM_OF_ALC_REMAIN_QTY.onDecision');
  expj.AC0100010.AC0100011form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form2.SUM_OF_ALC_REMAIN_QTY.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form2-SUM_OF_ALC_REMAIN_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form2', 'SUM_OF_ALC_REMAIN_QTY', this);
  });
  expj.AC0100010.AC0100011form2.SUM_OF_ALC_REMAIN_QTY.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form2.SUM_OF_ALC_REMAIN_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0100011form2/SUM_OF_ALC_REMAIN_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form2-SUM_OF_ALC_REMAIN_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form2-SUM_OF_ALC_REMAIN_QTY" name="SUM_OF_ALC_REMAIN_QTY" class="AC0100010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getSUM_OF_ALC_REMAIN_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form2-STOCK_UNIT_2">
expj.AC0100010.AC0100011form2.STOCK_UNIT_2 = {};
expj.AC0100010.AC0100011form2.STOCK_UNIT_2.executeAllOnDecision = function () {
  console.log('execute AC0100011form2/STOCK_UNIT_2.onDecision');
  expj.AC0100010.AC0100011form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form2.STOCK_UNIT_2.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form2-STOCK_UNIT_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form2', 'STOCK_UNIT_2', this);
  });
  expj.AC0100010.AC0100011form2.STOCK_UNIT_2.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form2.STOCK_UNIT_2.executePScriptOnLoad = function () {
  console.log('execute AC0100011form2/STOCK_UNIT_2.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form2-STOCK_UNIT_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form2-STOCK_UNIT_2" name="STOCK_UNIT_2" class="AC0100010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getSTOCK_UNIT_2()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_STS_TYP",rb)%></span><!-- 製番状態区分 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form2-JOB_ODR_STS_TYP_DN">
expj.AC0100010.AC0100011form2.JOB_ODR_STS_TYP_DN = {};
expj.AC0100010.AC0100011form2.JOB_ODR_STS_TYP_DN.executeAllOnDecision = function () {
  console.log('execute AC0100011form2/JOB_ODR_STS_TYP_DN.onDecision');
  expj.AC0100010.AC0100011form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form2.JOB_ODR_STS_TYP_DN.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form2-JOB_ODR_STS_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form2', 'JOB_ODR_STS_TYP_DN', this);
  });
  expj.AC0100010.AC0100011form2.JOB_ODR_STS_TYP_DN.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form2.JOB_ODR_STS_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute AC0100011form2/JOB_ODR_STS_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form2-JOB_ODR_STS_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form2-JOB_ODR_STS_TYP_DN" name="JOB_ODR_STS_TYP_DN" class="AC0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getJOB_ODR_STS_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AC0100010-AC0100011form2-JOB_ODR_STS_TYP" name="JOB_ODR_STS_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getJOB_ODR_STS_TYP()) %>">
<script class="expj-script-AC0100010-AC0100011form2-JOB_ODR_STS_TYP">
expj.AC0100010.AC0100011form2.JOB_ODR_STS_TYP = {};
expj.AC0100010.AC0100011form2.JOB_ODR_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AC0100011form2/JOB_ODR_STS_TYP.onDecision');
  expj.AC0100010.AC0100011form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form2.JOB_ODR_STS_TYP.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form2-JOB_ODR_STS_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form2', 'JOB_ODR_STS_TYP', this);
  });
  expj.AC0100010.AC0100011form2.JOB_ODR_STS_TYP.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form2.JOB_ODR_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0100011form2/JOB_ODR_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form2-JOB_ODR_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.TOTAL_ISSUE_QTY",rb)%></span><!-- 出庫累計数 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form2-TOTAL_ISSUE_QTY">
expj.AC0100010.AC0100011form2.TOTAL_ISSUE_QTY = {};
expj.AC0100010.AC0100011form2.TOTAL_ISSUE_QTY.executeAllOnDecision = function () {
  console.log('execute AC0100011form2/TOTAL_ISSUE_QTY.onDecision');
  expj.AC0100010.AC0100011form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form2.TOTAL_ISSUE_QTY.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form2-TOTAL_ISSUE_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form2', 'TOTAL_ISSUE_QTY', this);
  });
  expj.AC0100010.AC0100011form2.TOTAL_ISSUE_QTY.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form2.TOTAL_ISSUE_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0100011form2/TOTAL_ISSUE_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form2-TOTAL_ISSUE_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form2-TOTAL_ISSUE_QTY" name="TOTAL_ISSUE_QTY" class="AC0100010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getTOTAL_ISSUE_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form2-STOCK_UNIT_3">
expj.AC0100010.AC0100011form2.STOCK_UNIT_3 = {};
expj.AC0100010.AC0100011form2.STOCK_UNIT_3.executeAllOnDecision = function () {
  console.log('execute AC0100011form2/STOCK_UNIT_3.onDecision');
  expj.AC0100010.AC0100011form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form2.STOCK_UNIT_3.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form2-STOCK_UNIT_3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form2', 'STOCK_UNIT_3', this);
  });
  expj.AC0100010.AC0100011form2.STOCK_UNIT_3.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form2.STOCK_UNIT_3.executePScriptOnLoad = function () {
  console.log('execute AC0100011form2/STOCK_UNIT_3.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form2-STOCK_UNIT_3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form2-STOCK_UNIT_3" name="STOCK_UNIT_3" class="AC0100010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getSTOCK_UNIT_3()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ALC_GRP_CD",rb)%></span><!-- 引当グループコード --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form2-ALC_GRP_CD">
expj.AC0100010.AC0100011form2.ALC_GRP_CD = {};
expj.AC0100010.AC0100011form2.ALC_GRP_CD.executeAllOnDecision = function () {
  console.log('execute AC0100011form2/ALC_GRP_CD.onDecision');
  expj.AC0100010.AC0100011form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form2.ALC_GRP_CD.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form2-ALC_GRP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form2', 'ALC_GRP_CD', this);
  });
  expj.AC0100010.AC0100011form2.ALC_GRP_CD.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form2.ALC_GRP_CD.executePScriptOnLoad = function () {
  console.log('execute AC0100011form2/ALC_GRP_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form2-ALC_GRP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form2-ALC_GRP_CD" name="ALC_GRP_CD" class="AC0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getALC_GRP_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DUE_DATE",rb)%></span><!-- 要求納期 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form2-DUE_DATE">
expj.AC0100010.AC0100011form2.DUE_DATE = {};
expj.AC0100010.AC0100011form2.DUE_DATE.executeAllOnDecision = function () {
  console.log('execute AC0100011form2/DUE_DATE.onDecision');
  expj.AC0100010.AC0100011form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form2.DUE_DATE.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form2-DUE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form2', 'DUE_DATE', this);
  });
  expj.AC0100010.AC0100011form2.DUE_DATE.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form2.DUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0100011form2/DUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form2-DUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form2-DUE_DATE" name="DUE_DATE" class="AC0100010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getDUE_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form2-DUE_TIME">
expj.AC0100010.AC0100011form2.DUE_TIME = {};
expj.AC0100010.AC0100011form2.DUE_TIME.executeAllOnDecision = function () {
  console.log('execute AC0100011form2/DUE_TIME.onDecision');
  expj.AC0100010.AC0100011form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form2.DUE_TIME.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form2-DUE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form2', 'DUE_TIME', this);
  });
  expj.AC0100010.AC0100011form2.DUE_TIME.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form2.DUE_TIME.executePScriptOnLoad = function () {
  console.log('execute AC0100011form2/DUE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form2-DUE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form2-DUE_TIME" name="DUE_TIME" class="AC0100010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getDUE_TIME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.UNIT_QTY_TYP",rb)%></span><!-- 在庫数単位区分 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form2-UNIT_QTY_TYP_DN">
expj.AC0100010.AC0100011form2.UNIT_QTY_TYP_DN = {};
expj.AC0100010.AC0100011form2.UNIT_QTY_TYP_DN.executeAllOnDecision = function () {
  console.log('execute AC0100011form2/UNIT_QTY_TYP_DN.onDecision');
  expj.AC0100010.AC0100011form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form2.UNIT_QTY_TYP_DN.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form2-UNIT_QTY_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form2', 'UNIT_QTY_TYP_DN', this);
  });
  expj.AC0100010.AC0100011form2.UNIT_QTY_TYP_DN.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form2.UNIT_QTY_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute AC0100011form2/UNIT_QTY_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form2-UNIT_QTY_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form2-UNIT_QTY_TYP_DN" name="UNIT_QTY_TYP_DN" class="AC0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getUNIT_QTY_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AC0100010-AC0100011form2-UNIT_QTY_TYP" name="UNIT_QTY_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getUNIT_QTY_TYP()) %>">
<script class="expj-script-AC0100010-AC0100011form2-UNIT_QTY_TYP">
expj.AC0100010.AC0100011form2.UNIT_QTY_TYP = {};
expj.AC0100010.AC0100011form2.UNIT_QTY_TYP.executeAllOnDecision = function () {
  console.log('execute AC0100011form2/UNIT_QTY_TYP.onDecision');
  expj.AC0100010.AC0100011form2.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form2.UNIT_QTY_TYP.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form2-UNIT_QTY_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form2', 'UNIT_QTY_TYP', this);
  });
  expj.AC0100010.AC0100011form2.UNIT_QTY_TYP.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form2.UNIT_QTY_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0100011form2/UNIT_QTY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form2-UNIT_QTY_TYP');
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
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AC0100010-AC0100011form3">
expj.AC0100010.AC0100011form3 = {};
expj.AC0100010.AC0100011form3.executeAllOnDecision = function () {
  console.log('execute AC0100011form3.onDecision');
};
expj.AC0100010.AC0100011form3.executeOnLoad = function () {
  expj.AC0100010.AC0100011form3.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AC0100010-AC0100011form3" action="AC0100010Servlet" name="AC0100011form3" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0702",rb)%></span><!-- 引当区分 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-ALC_TYP_2_DN">
expj.AC0100010.AC0100011form3.ALC_TYP_2_DN = {};
expj.AC0100010.AC0100011form3.ALC_TYP_2_DN.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/ALC_TYP_2_DN.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.ALC_TYP_2_DN.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-ALC_TYP_2_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'ALC_TYP_2_DN', this);
  });
  expj.AC0100010.AC0100011form3.ALC_TYP_2_DN.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.ALC_TYP_2_DN.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/ALC_TYP_2_DN.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-ALC_TYP_2_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-ALC_TYP_2_DN" name="ALC_TYP_2_DN" class="AC0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getALC_TYP_2_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AC0100010-AC0100011form3-ALC_TYP_2" name="ALC_TYP_2" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getALC_TYP_2()) %>">
<script class="expj-script-AC0100010-AC0100011form3-ALC_TYP_2">
expj.AC0100010.AC0100011form3.ALC_TYP_2 = {};
expj.AC0100010.AC0100011form3.ALC_TYP_2.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/ALC_TYP_2.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.ALC_TYP_2.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-ALC_TYP_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'ALC_TYP_2', this);
  });
  expj.AC0100010.AC0100011form3.ALC_TYP_2.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.ALC_TYP_2.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/ALC_TYP_2.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-ALC_TYP_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD_3",rb)%></span><!-- 引当先製番 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-JOB_ODR_CD_2">
expj.AC0100010.AC0100011form3.JOB_ODR_CD_2 = {};
expj.AC0100010.AC0100011form3.JOB_ODR_CD_2.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/JOB_ODR_CD_2.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.JOB_ODR_CD_2.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-JOB_ODR_CD_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'JOB_ODR_CD_2', this);
  });
  expj.AC0100010.AC0100011form3.JOB_ODR_CD_2.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.JOB_ODR_CD_2.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/JOB_ODR_CD_2.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-JOB_ODR_CD_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-JOB_ODR_CD_2" name="JOB_ODR_CD_2" class="AC0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getJOB_ODR_CD_2()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AC0100010-AC0100011form3-JOB_ODR_DETAIL_NO_2" name="JOB_ODR_DETAIL_NO_2" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getJOB_ODR_DETAIL_NO_2()) %>">
<script class="expj-script-AC0100010-AC0100011form3-JOB_ODR_DETAIL_NO_2">
expj.AC0100010.AC0100011form3.JOB_ODR_DETAIL_NO_2 = {};
expj.AC0100010.AC0100011form3.JOB_ODR_DETAIL_NO_2.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/JOB_ODR_DETAIL_NO_2.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.JOB_ODR_DETAIL_NO_2.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-JOB_ODR_DETAIL_NO_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'JOB_ODR_DETAIL_NO_2', this);
  });
  expj.AC0100010.AC0100011form3.JOB_ODR_DETAIL_NO_2.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.JOB_ODR_DETAIL_NO_2.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/JOB_ODR_DETAIL_NO_2.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-JOB_ODR_DETAIL_NO_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AC0100010-AC0100011form3-JOB_ODR_CANCEL_NO_2" name="JOB_ODR_CANCEL_NO_2" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getJOB_ODR_CANCEL_NO_2()) %>">
<script class="expj-script-AC0100010-AC0100011form3-JOB_ODR_CANCEL_NO_2">
expj.AC0100010.AC0100011form3.JOB_ODR_CANCEL_NO_2 = {};
expj.AC0100010.AC0100011form3.JOB_ODR_CANCEL_NO_2.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/JOB_ODR_CANCEL_NO_2.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.JOB_ODR_CANCEL_NO_2.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-JOB_ODR_CANCEL_NO_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'JOB_ODR_CANCEL_NO_2', this);
  });
  expj.AC0100010.AC0100011form3.JOB_ODR_CANCEL_NO_2.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.JOB_ODR_CANCEL_NO_2.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/JOB_ODR_CANCEL_NO_2.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-JOB_ODR_CANCEL_NO_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ALCD_QTY",rb)%></span><!-- 引当済み数 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-ALCD_QTY">
expj.AC0100010.AC0100011form3.ALCD_QTY = {};
expj.AC0100010.AC0100011form3.ALCD_QTY.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/ALCD_QTY.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.ALCD_QTY.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-ALCD_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'ALCD_QTY', this);
  });
  expj.AC0100010.AC0100011form3.ALCD_QTY.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.ALCD_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/ALCD_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-ALCD_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-ALCD_QTY" name="ALCD_QTY" class="AC0100010-focus-move  required-value expj-AC0100010-required-A" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getALCD_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-STOCK_UNIT_5">
expj.AC0100010.AC0100011form3.STOCK_UNIT_5 = {};
expj.AC0100010.AC0100011form3.STOCK_UNIT_5.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/STOCK_UNIT_5.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.STOCK_UNIT_5.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-STOCK_UNIT_5').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'STOCK_UNIT_5', this);
  });
  expj.AC0100010.AC0100011form3.STOCK_UNIT_5.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.STOCK_UNIT_5.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/STOCK_UNIT_5.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-STOCK_UNIT_5');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-STOCK_UNIT_5" name="STOCK_UNIT_5" class="AC0100010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getSTOCK_UNIT_5()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_STS_TYP",rb)%></span><!-- オーダ状態区分 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-ODR_STS_TYP_DN">
expj.AC0100010.AC0100011form3.ODR_STS_TYP_DN = {};
expj.AC0100010.AC0100011form3.ODR_STS_TYP_DN.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/ODR_STS_TYP_DN.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.ODR_STS_TYP_DN.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-ODR_STS_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'ODR_STS_TYP_DN', this);
  });
  expj.AC0100010.AC0100011form3.ODR_STS_TYP_DN.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.ODR_STS_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/ODR_STS_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-ODR_STS_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-ODR_STS_TYP_DN" name="ODR_STS_TYP_DN" class="AC0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getODR_STS_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AC0100010-AC0100011form3-ODR_STS_TYP" name="ODR_STS_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getODR_STS_TYP()) %>">
<script class="expj-script-AC0100010-AC0100011form3-ODR_STS_TYP">
expj.AC0100010.AC0100011form3.ODR_STS_TYP = {};
expj.AC0100010.AC0100011form3.ODR_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/ODR_STS_TYP.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.ODR_STS_TYP.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-ODR_STS_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'ODR_STS_TYP', this);
  });
  expj.AC0100010.AC0100011form3.ODR_STS_TYP.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.ODR_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/ODR_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-ODR_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ISSUEED_QTY_1",rb)%></span><!-- 引当出庫済数 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-ISSUEED_QTY">
expj.AC0100010.AC0100011form3.ISSUEED_QTY = {};
expj.AC0100010.AC0100011form3.ISSUEED_QTY.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/ISSUEED_QTY.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.ISSUEED_QTY.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-ISSUEED_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'ISSUEED_QTY', this);
  });
  expj.AC0100010.AC0100011form3.ISSUEED_QTY.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.ISSUEED_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/ISSUEED_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-ISSUEED_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-ISSUEED_QTY" name="ISSUEED_QTY" class="AC0100010-focus-move  " style="width:150px;" data-kind="<%=kind1%>" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getISSUEED_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-STOCK_UNIT_6">
expj.AC0100010.AC0100011form3.STOCK_UNIT_6 = {};
expj.AC0100010.AC0100011form3.STOCK_UNIT_6.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/STOCK_UNIT_6.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.STOCK_UNIT_6.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-STOCK_UNIT_6').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'STOCK_UNIT_6', this);
  });
  expj.AC0100010.AC0100011form3.STOCK_UNIT_6.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.STOCK_UNIT_6.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/STOCK_UNIT_6.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-STOCK_UNIT_6');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-STOCK_UNIT_6" name="STOCK_UNIT_6" class="AC0100010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getSTOCK_UNIT_6()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ALC_GRP_CD",rb)%></span><!-- 引当グループコード --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-ALC_GRP_CD_2">
expj.AC0100010.AC0100011form3.ALC_GRP_CD_2 = {};
expj.AC0100010.AC0100011form3.ALC_GRP_CD_2.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/ALC_GRP_CD_2.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.ALC_GRP_CD_2.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-ALC_GRP_CD_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'ALC_GRP_CD_2', this);
  });
  expj.AC0100010.AC0100011form3.ALC_GRP_CD_2.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.ALC_GRP_CD_2.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/ALC_GRP_CD_2.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-ALC_GRP_CD_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-ALC_GRP_CD_2" name="ALC_GRP_CD_2" class="AC0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getALC_GRP_CD_2()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0355",rb)%></span><!-- 引当出庫残数 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-ISSUE_REMAIN_QTY">
expj.AC0100010.AC0100011form3.ISSUE_REMAIN_QTY = {};
expj.AC0100010.AC0100011form3.ISSUE_REMAIN_QTY.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/ISSUE_REMAIN_QTY.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.ISSUE_REMAIN_QTY.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-ISSUE_REMAIN_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'ISSUE_REMAIN_QTY', this);
  });
  expj.AC0100010.AC0100011form3.ISSUE_REMAIN_QTY.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.ISSUE_REMAIN_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/ISSUE_REMAIN_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-ISSUE_REMAIN_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-ISSUE_REMAIN_QTY" name="ISSUE_REMAIN_QTY" class="AC0100010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getISSUE_REMAIN_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-STOCK_UNIT_7">
expj.AC0100010.AC0100011form3.STOCK_UNIT_7 = {};
expj.AC0100010.AC0100011form3.STOCK_UNIT_7.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/STOCK_UNIT_7.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.STOCK_UNIT_7.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-STOCK_UNIT_7').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'STOCK_UNIT_7', this);
  });
  expj.AC0100010.AC0100011form3.STOCK_UNIT_7.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.STOCK_UNIT_7.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/STOCK_UNIT_7.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-STOCK_UNIT_7');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-STOCK_UNIT_7" name="STOCK_UNIT_7" class="AC0100010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getSTOCK_UNIT_7()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_STS_TYP",rb)%></span><!-- 製番状態区分 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-JOB_ODR_STS_TYP_DN_2">
expj.AC0100010.AC0100011form3.JOB_ODR_STS_TYP_DN_2 = {};
expj.AC0100010.AC0100011form3.JOB_ODR_STS_TYP_DN_2.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/JOB_ODR_STS_TYP_DN_2.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.JOB_ODR_STS_TYP_DN_2.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-JOB_ODR_STS_TYP_DN_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'JOB_ODR_STS_TYP_DN_2', this);
  });
  expj.AC0100010.AC0100011form3.JOB_ODR_STS_TYP_DN_2.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.JOB_ODR_STS_TYP_DN_2.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/JOB_ODR_STS_TYP_DN_2.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-JOB_ODR_STS_TYP_DN_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-JOB_ODR_STS_TYP_DN_2" name="JOB_ODR_STS_TYP_DN_2" class="AC0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getJOB_ODR_STS_TYP_DN_2()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AC0100010-AC0100011form3-JOB_ODR_STS_TYP_2" name="JOB_ODR_STS_TYP_2" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getJOB_ODR_STS_TYP_2()) %>">
<script class="expj-script-AC0100010-AC0100011form3-JOB_ODR_STS_TYP_2">
expj.AC0100010.AC0100011form3.JOB_ODR_STS_TYP_2 = {};
expj.AC0100010.AC0100011form3.JOB_ODR_STS_TYP_2.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/JOB_ODR_STS_TYP_2.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.JOB_ODR_STS_TYP_2.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-JOB_ODR_STS_TYP_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'JOB_ODR_STS_TYP_2', this);
  });
  expj.AC0100010.AC0100011form3.JOB_ODR_STS_TYP_2.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.JOB_ODR_STS_TYP_2.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/JOB_ODR_STS_TYP_2.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-JOB_ODR_STS_TYP_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0300",rb)%></span><!-- 引当可能数 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-ALLOCATABLE_QTY">
expj.AC0100010.AC0100011form3.ALLOCATABLE_QTY = {};
expj.AC0100010.AC0100011form3.ALLOCATABLE_QTY.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/ALLOCATABLE_QTY.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.ALLOCATABLE_QTY.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-ALLOCATABLE_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'ALLOCATABLE_QTY', this);
  });
  expj.AC0100010.AC0100011form3.ALLOCATABLE_QTY.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.ALLOCATABLE_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/ALLOCATABLE_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-ALLOCATABLE_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-ALLOCATABLE_QTY" name="ALLOCATABLE_QTY" class="AC0100010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getALLOCATABLE_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-STOCK_UNIT_8">
expj.AC0100010.AC0100011form3.STOCK_UNIT_8 = {};
expj.AC0100010.AC0100011form3.STOCK_UNIT_8.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/STOCK_UNIT_8.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.STOCK_UNIT_8.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-STOCK_UNIT_8').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'STOCK_UNIT_8', this);
  });
  expj.AC0100010.AC0100011form3.STOCK_UNIT_8.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.STOCK_UNIT_8.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/STOCK_UNIT_8.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-STOCK_UNIT_8');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-STOCK_UNIT_8" name="STOCK_UNIT_8" class="AC0100010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getSTOCK_UNIT_8()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PRD_DUE_DATE",rb)%></span><!-- 製造納期 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-PRD_DUE_DATE">
expj.AC0100010.AC0100011form3.PRD_DUE_DATE = {};
expj.AC0100010.AC0100011form3.PRD_DUE_DATE.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/PRD_DUE_DATE.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.PRD_DUE_DATE.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-PRD_DUE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'PRD_DUE_DATE', this);
  });
  expj.AC0100010.AC0100011form3.PRD_DUE_DATE.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.PRD_DUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/PRD_DUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-PRD_DUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-PRD_DUE_DATE" name="PRD_DUE_DATE" class="AC0100010-focus-move  " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getPRD_DUE_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-PRD_DUE_TIME">
expj.AC0100010.AC0100011form3.PRD_DUE_TIME = {};
expj.AC0100010.AC0100011form3.PRD_DUE_TIME.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/PRD_DUE_TIME.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.PRD_DUE_TIME.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-PRD_DUE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'PRD_DUE_TIME', this);
  });
  expj.AC0100010.AC0100011form3.PRD_DUE_TIME.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.PRD_DUE_TIME.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/PRD_DUE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-PRD_DUE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-PRD_DUE_TIME" name="PRD_DUE_TIME" class="AC0100010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getPRD_DUE_TIME()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_ON_HAND_QTY",rb)%></span><!-- 手持在庫数 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-STOCK_ON_HAND_QTY">
expj.AC0100010.AC0100011form3.STOCK_ON_HAND_QTY = {};
expj.AC0100010.AC0100011form3.STOCK_ON_HAND_QTY.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/STOCK_ON_HAND_QTY.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.STOCK_ON_HAND_QTY.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-STOCK_ON_HAND_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'STOCK_ON_HAND_QTY', this);
  });
  expj.AC0100010.AC0100011form3.STOCK_ON_HAND_QTY.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.STOCK_ON_HAND_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/STOCK_ON_HAND_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-STOCK_ON_HAND_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-STOCK_ON_HAND_QTY" name="STOCK_ON_HAND_QTY" class="AC0100010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getSTOCK_ON_HAND_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-STOCK_UNIT_9">
expj.AC0100010.AC0100011form3.STOCK_UNIT_9 = {};
expj.AC0100010.AC0100011form3.STOCK_UNIT_9.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/STOCK_UNIT_9.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.STOCK_UNIT_9.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-STOCK_UNIT_9').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'STOCK_UNIT_9', this);
  });
  expj.AC0100010.AC0100011form3.STOCK_UNIT_9.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.STOCK_UNIT_9.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/STOCK_UNIT_9.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-STOCK_UNIT_9');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-STOCK_UNIT_9" name="STOCK_UNIT_9" class="AC0100010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getSTOCK_UNIT_9()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_START_DATE",rb)%></span><!-- 手配着手日 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-ODR_START_DATE">
expj.AC0100010.AC0100011form3.ODR_START_DATE = {};
expj.AC0100010.AC0100011form3.ODR_START_DATE.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/ODR_START_DATE.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.ODR_START_DATE.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-ODR_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'ODR_START_DATE', this);
  });
  expj.AC0100010.AC0100011form3.ODR_START_DATE.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.ODR_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/ODR_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-ODR_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-ODR_START_DATE" name="ODR_START_DATE" class="AC0100010-focus-move  " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getODR_START_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-ODR_START_TIME">
expj.AC0100010.AC0100011form3.ODR_START_TIME = {};
expj.AC0100010.AC0100011form3.ODR_START_TIME.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/ODR_START_TIME.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.ODR_START_TIME.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-ODR_START_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'ODR_START_TIME', this);
  });
  expj.AC0100010.AC0100011form3.ODR_START_TIME.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.ODR_START_TIME.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/ODR_START_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-ODR_START_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-ODR_START_TIME" name="ODR_START_TIME" class="AC0100010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getODR_START_TIME()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_QTY",rb)%></span><!-- オーダ数 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-ODR_QTY">
expj.AC0100010.AC0100011form3.ODR_QTY = {};
expj.AC0100010.AC0100011form3.ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/ODR_QTY.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.ODR_QTY.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'ODR_QTY', this);
  });
  expj.AC0100010.AC0100011form3.ODR_QTY.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-ODR_QTY" name="ODR_QTY" class="AC0100010-focus-move  " style="width:150px;" data-kind="<%=kind2%>" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getODR_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-STOCK_UNIT_10">
expj.AC0100010.AC0100011form3.STOCK_UNIT_10 = {};
expj.AC0100010.AC0100011form3.STOCK_UNIT_10.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/STOCK_UNIT_10.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.STOCK_UNIT_10.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-STOCK_UNIT_10').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'STOCK_UNIT_10', this);
  });
  expj.AC0100010.AC0100011form3.STOCK_UNIT_10.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.STOCK_UNIT_10.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/STOCK_UNIT_10.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-STOCK_UNIT_10');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-STOCK_UNIT_10" name="STOCK_UNIT_10" class="AC0100010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getSTOCK_UNIT_10()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PRD_START_DATE",rb)%></span><!-- 製造着手日 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-PRD_START_DATE">
expj.AC0100010.AC0100011form3.PRD_START_DATE = {};
expj.AC0100010.AC0100011form3.PRD_START_DATE.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/PRD_START_DATE.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.PRD_START_DATE.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-PRD_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'PRD_START_DATE', this);
  });
  expj.AC0100010.AC0100011form3.PRD_START_DATE.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.PRD_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/PRD_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-PRD_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-PRD_START_DATE" name="PRD_START_DATE" class="AC0100010-focus-move  " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getPRD_START_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-PRD_START_TIME">
expj.AC0100010.AC0100011form3.PRD_START_TIME = {};
expj.AC0100010.AC0100011form3.PRD_START_TIME.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/PRD_START_TIME.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.PRD_START_TIME.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-PRD_START_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'PRD_START_TIME', this);
  });
  expj.AC0100010.AC0100011form3.PRD_START_TIME.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.PRD_START_TIME.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/PRD_START_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-PRD_START_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-PRD_START_TIME" name="PRD_START_TIME" class="AC0100010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getPRD_START_TIME()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.RCV_QTY_1",rb)%></span><!-- 入庫累計数 --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-TOTAL_RCV_QTY">
expj.AC0100010.AC0100011form3.TOTAL_RCV_QTY = {};
expj.AC0100010.AC0100011form3.TOTAL_RCV_QTY.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/TOTAL_RCV_QTY.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.TOTAL_RCV_QTY.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-TOTAL_RCV_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'TOTAL_RCV_QTY', this);
  });
  expj.AC0100010.AC0100011form3.TOTAL_RCV_QTY.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.TOTAL_RCV_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/TOTAL_RCV_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-TOTAL_RCV_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-TOTAL_RCV_QTY" name="TOTAL_RCV_QTY" class="AC0100010-focus-move  " style="width:150px;" data-kind="<%=kind2%>" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getTOTAL_RCV_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011form3-STOCK_UNIT_11">
expj.AC0100010.AC0100011form3.STOCK_UNIT_11 = {};
expj.AC0100010.AC0100011form3.STOCK_UNIT_11.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/STOCK_UNIT_11.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.STOCK_UNIT_11.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-STOCK_UNIT_11').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'STOCK_UNIT_11', this);
  });
  expj.AC0100010.AC0100011form3.STOCK_UNIT_11.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.STOCK_UNIT_11.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/STOCK_UNIT_11.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-STOCK_UNIT_11');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AC0100010-AC0100011form3-STOCK_UNIT_11" name="STOCK_UNIT_11" class="AC0100010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getSTOCK_UNIT_11()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<input type="hidden" id="expj-AC0100010-AC0100011form3-MODIFY_COUNT" name="MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0100010Struct.getMODIFY_COUNT()) %>">
<script class="expj-script-AC0100010-AC0100011form3-MODIFY_COUNT">
expj.AC0100010.AC0100011form3.MODIFY_COUNT = {};
expj.AC0100010.AC0100011form3.MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AC0100011form3/MODIFY_COUNT.onDecision');
  expj.AC0100010.AC0100011form3.executeAllOnDecision();
  expj.AC0100010.executeAllOnDecision();
};
expj.AC0100010.AC0100011form3.MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011form3-MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0100010', 'AC0100011form3', 'MODIFY_COUNT', this);
  });
  expj.AC0100010.AC0100011form3.MODIFY_COUNT.executePScriptOnLoad();
};

expj.AC0100010.AC0100011form3.MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AC0100011form3/MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011form3-MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AC0100010-AC0100011button1">
expj.AC0100010.AC0100011button1 = {};
expj.AC0100010.AC0100011button1.executeAllOnDecision = function () {
  console.log('execute AC0100011button1.onDecision');
};
expj.AC0100010.AC0100011button1.executeOnLoad = function () {
  expj.AC0100010.AC0100011button1.executePScriptOnLoad();
};

expj.AC0100010.AC0100011button1.executePScriptOnLoad = function () {
  console.log('execute AC0100011button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0100010-AC0100011button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0100010-AC0100011button1-Insert">
expj.AC0100010.AC0100011button1.Insert = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AC0100011form1/*,_AC0100011form2/*,_AC0100011form3/*@AC0100010Servlet,,$ZZ07001"
expj.AC0100010.AC0100011button1.Insert.onClick0 = function () {
  console.log('Insert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0100010', 'AC0100011button1', '_AC0100011form1/*,_AC0100011form2/*,_AC0100011form3/*', 'AC0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0100010', response);
expj.common.changeBusinessScreenTab('AC0100010', contents);
};
expj.common.pscript.callConfirm('AC0100010', 'AC0100011button1', 'ZZ07001', okEvent);
};
expj.AC0100010.AC0100011button1.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0100010.AC0100011button1.Insert['onClick' + i])) {
        expj.AC0100010.AC0100011button1.Insert['onClick' + i]();
      }
    }
  }
};
expj.AC0100010.AC0100011button1.Insert.executeAllOnDecision = function () {
};
expj.AC0100010.AC0100011button1.Insert.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011button1-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0100010', 'AC0100011button1', 'Insert', this, 'Button');
    }
  });
  expj.AC0100010.AC0100011button1.Insert.executePScriptOnLoad();
};

expj.AC0100010.AC0100011button1.Insert.executePScriptOnLoad = function () {
  console.log('execute AC0100011button1/Insert.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011button1-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0100010-AC0100011button1-Insert" name="Insert" class="AC0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AC0100010-AC0100011button1-Update">
expj.AC0100010.AC0100011button1.Update = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AC0100011form1/*,_AC0100011form2/*,_AC0100011form3/*@AC0100010Servlet,,$ZZ07003"
expj.AC0100010.AC0100011button1.Update.onClick0 = function () {
  console.log('Update script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0100010', 'AC0100011button1', '_AC0100011form1/*,_AC0100011form2/*,_AC0100011form3/*', 'AC0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0100010', response);
expj.common.changeBusinessScreenTab('AC0100010', contents);
};
expj.common.pscript.callConfirm('AC0100010', 'AC0100011button1', 'ZZ07003', okEvent);
};
expj.AC0100010.AC0100011button1.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0100010.AC0100011button1.Update['onClick' + i])) {
        expj.AC0100010.AC0100011button1.Update['onClick' + i]();
      }
    }
  }
};
expj.AC0100010.AC0100011button1.Update.executeAllOnDecision = function () {
};
expj.AC0100010.AC0100011button1.Update.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011button1-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0100010', 'AC0100011button1', 'Update', this, 'Button');
    }
  });
  expj.AC0100010.AC0100011button1.Update.executePScriptOnLoad();
};

expj.AC0100010.AC0100011button1.Update.executePScriptOnLoad = function () {
  console.log('execute AC0100011button1/Update.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011button1-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0100010-AC0100011button1-Update" name="Update" class="AC0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<span class="version">AC0100011 Revision: 1.6  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AC0100010-AC0100011button0">
expj.AC0100010.AC0100011button0 = {};
expj.AC0100010.AC0100011button0.executeAllOnDecision = function () {
  console.log('execute AC0100011button0.onDecision');
};
expj.AC0100010.AC0100011button0.executeOnLoad = function () {
  expj.AC0100010.AC0100011button0.executePScriptOnLoad();
};

expj.AC0100010.AC0100011button0.executePScriptOnLoad = function () {
  console.log('execute AC0100011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0100010-AC0100011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0100010-AC0100011button0-Return">
expj.AC0100010.AC0100011button0.Return = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AC0100011form1/*,_AC0100011form3/*@AC0100010Servlet,,$ZZ07013"
expj.AC0100010.AC0100011button0.Return.onClick0 = function () {
  console.log('Return script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0100010', 'AC0100011button0', '_AC0100011form1/*,_AC0100011form3/*', 'AC0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0100010', response);
expj.common.changeBusinessScreenTab('AC0100010', contents);
};
expj.common.pscript.callConfirm('AC0100010', 'AC0100011button0', 'ZZ07013', okEvent);
};
expj.AC0100010.AC0100011button0.Return.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0100010.AC0100011button0.Return['onClick' + i])) {
        expj.AC0100010.AC0100011button0.Return['onClick' + i]();
      }
    }
  }
};
expj.AC0100010.AC0100011button0.Return.executeAllOnDecision = function () {
};
expj.AC0100010.AC0100011button0.Return.executeOnLoad = function () {
  $('#expj-AC0100010-AC0100011button0-Return').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0100010', 'AC0100011button0', 'Return', this, 'Button');
    }
  });
  expj.AC0100010.AC0100011button0.Return.executePScriptOnLoad();
};

expj.AC0100010.AC0100011button0.Return.executePScriptOnLoad = function () {
  console.log('execute AC0100011button0/Return.onLoad');
  var targetComponent = document.getElementById('expj-AC0100010-AC0100011button0-Return');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0100010-AC0100011button0-Return" name="Return" class="AC0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
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
  try{expj.AC0100010.AC0100011form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form1.JOB_ODR_CANCEL_NO.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form1.OD_NO.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form1.h_OD_NO.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form2.DM_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form2.SUM_OF_ALLOCATABLE_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form2.STOCK_UNIT_4.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form2.SUM_OF_ALCD_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form2.STOCK_UNIT_1.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form2.DM_STS_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form2.DM_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form2.SUM_OF_ALC_REMAIN_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form2.STOCK_UNIT_2.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form2.JOB_ODR_STS_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form2.JOB_ODR_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form2.TOTAL_ISSUE_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form2.STOCK_UNIT_3.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form2.ALC_GRP_CD.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form2.DUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form2.DUE_TIME.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form2.UNIT_QTY_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form2.UNIT_QTY_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.ALC_TYP_2_DN.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.ALC_TYP_2.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.JOB_ODR_CD_2.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.JOB_ODR_DETAIL_NO_2.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.JOB_ODR_CANCEL_NO_2.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.ALCD_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.STOCK_UNIT_5.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.ODR_STS_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.ODR_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.ISSUEED_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.STOCK_UNIT_6.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.ALC_GRP_CD_2.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.ISSUE_REMAIN_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.STOCK_UNIT_7.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.JOB_ODR_STS_TYP_DN_2.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.JOB_ODR_STS_TYP_2.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.ALLOCATABLE_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.STOCK_UNIT_8.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.PRD_DUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.PRD_DUE_TIME.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.STOCK_ON_HAND_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.STOCK_UNIT_9.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.ODR_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.ODR_START_TIME.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.STOCK_UNIT_10.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.PRD_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.PRD_START_TIME.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.TOTAL_RCV_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.STOCK_UNIT_11.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011button1.Insert.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011button1.Update.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011button0.Return.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form1.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form2.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011form3.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011button1.executeOnLoad();}catch(e){};
  try{expj.AC0100010.AC0100011button0.executeOnLoad();}catch(e){};
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
  expj.AC0100010.AC0100011form1.executeAllOnDecision();
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