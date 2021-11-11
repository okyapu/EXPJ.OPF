<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:49:14 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\DA0010\DA0010011.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.DA0010.*" %>
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
<jsp:useBean id="aDA0010010Control" class="com.nec.jp.orteus.metamorBase.DA0010.DA0010010Control" scope="request"/>
<jsp:useBean id="aDA0010010Struct" class="com.nec.jp.orteus.metamorBase.DA0010.DA0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

工程マスタメンテナンスサブ１
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DA0010/jsp/DA0010011.jsp,v $
$Author: geng-jia $
$Revision: 1.7 $ $Date: 2017/02/22 02:06:35 $
********************************************************* --%>
<html>
<head>
<title>工程マスタメンテナンスサブ１</title>
<%@include file="common/expj_v5.jsp" %>
<%
String callButton = aDA0010010Control.getButton();
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
<script class="expj-script-DA0010010_init">
  // DA0010010名前空間
  expj.DA0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<div id="expj-business-screen-DA0010010" data-screen="DA0010011" data-newdata="<%=aDA0010010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
  <div class="expj-tr" style="height:5px">
    <div class="expj-td" style=""></div><!--/td-->

  </div><!--/tr-->

  <div class="expj-tr expjDynamicHeight" style="">
    <div class="expj-td" style="width:5px;"></div><!--/td-->

    <div class="expj-td" style="width:calc(100% - 10px);height:100%;">
      <div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2-->
        <div class="expj-tr" style="width:100%;height:0px;display:none;">

          <div class="expj-td frame01"></div><!--/td-->

          <div class="expj-td frame02"></div><!--/td-->

          <div class="expj-td frame03"></div><!--/td-->

        </div><!--/tr-->

        <div class="expj-tr" style="width:100%;height:calc(100% - 32px);">

          <div class="expj-td frame04" style="width:12px;"></div><!--/td-->

          <div class="expj-td frame05" style="height:100%;">
            <script class="expj-script-DA0010010-DA0010011form1">
expj.DA0010010.DA0010011form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.DA0010010.DA0010011form1.onLoad0 = function () {
  console.log('DA0010011form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHKRQ;A@*0,*3"
expj.DA0010010.DA0010011form1.onDecision0 = function () {
  console.log('DA0010011form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('DA0010010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script3="child;0;CHK;?DA0010011form1/*[neq]ERROR@*1,*3"
expj.DA0010010.DA0010011form1.child0 = function () {
  console.log('DA0010011form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010011form1', '?DA0010011form1/*'), '[neq]', 'ERROR')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;1;CHK;<%=callButton%>[eq]LineInsert[or]<%=callButton%>[eq]LineCopy[or]<%=callButton%>[eq]Insert@*2,*3"
expj.DA0010010.DA0010011form1.child1 = function () {
  console.log('DA0010011form1 script4');
if (expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'LineInsert') || expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'LineCopy') || expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'Insert')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="child;2;UNMASK;_DA0010011button2/Insert"
expj.DA0010010.DA0010011form1.child2 = function () {
  console.log('DA0010011form1 script5');
expj.common.pscript.setUnMaskToReferenceComponent('DA0010010', 'DA0010011form1', '_DA0010011button2/Insert');
};
// script6="child;3;MASK;_DA0010011button2/Insert"
expj.DA0010010.DA0010011form1.child3 = function () {
  console.log('DA0010011form1 script6');
expj.common.pscript.setMaskToReferenceComponent('DA0010010', 'DA0010011form1', '_DA0010011button2/Insert');
};
// script7="onDecision;1;CHKRQ;A@*4,*7"
expj.DA0010010.DA0010011form1.onDecision1 = function () {
  console.log('DA0010011form1 script7');
if (expj.common.pscript.satisfiedRequiredComponent('DA0010010', 'A')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script8="child;4;CHK;?DA0010011form1/*[neq]ERROR@*5,*7"
expj.DA0010010.DA0010011form1.child4 = function () {
  console.log('DA0010011form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010011form1', '?DA0010011form1/*'), '[neq]', 'ERROR')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script9="child;5;CHK;<%=callButton%>[eq]LineUpdate[or]<%=callButton%>[eq]Update@*6,*7"
expj.DA0010010.DA0010011form1.child5 = function () {
  console.log('DA0010011form1 script9');
if (expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'LineUpdate') || expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'Update')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script10="child;6;UNMASK;_DA0010011button2/Update"
expj.DA0010010.DA0010011form1.child6 = function () {
  console.log('DA0010011form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('DA0010010', 'DA0010011form1', '_DA0010011button2/Update');
};
// script11="child;7;MASK;_DA0010011button2/Update"
expj.DA0010010.DA0010011form1.child7 = function () {
  console.log('DA0010011form1 script11');
expj.common.pscript.setMaskToReferenceComponent('DA0010010', 'DA0010011form1', '_DA0010011button2/Update');
};
// script12="onDecision;2;CHK;<%=callButton%>[eq]LineInsert[or]<%=callButton%>[eq]LineCopy[or]<%=callButton%>[eq]Insert@*8,*9"
expj.DA0010010.DA0010011form1.onDecision2 = function () {
  console.log('DA0010011form1 script12');
if (expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'LineInsert') || expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'LineCopy') || expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'Insert')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script13="child;8;UNMASK;_DA0010011form2/CS_PROC_CD"
expj.DA0010010.DA0010011form1.child8 = function () {
  console.log('DA0010011form1 script13');
expj.common.pscript.setUnMaskToReferenceComponent('DA0010010', 'DA0010011form1', '_DA0010011form2/CS_PROC_CD');
};
// script14="child;9;MASK;_DA0010011form2/CS_PROC_CD"
expj.DA0010010.DA0010011form1.child9 = function () {
  console.log('DA0010011form1 script14');
expj.common.pscript.setMaskToReferenceComponent('DA0010010', 'DA0010011form1', '_DA0010011form2/CS_PROC_CD');
};
// script15="onDecision;3;CHK;_DA0010011form2/OUTSIDE_TYP[eq]2@*10,*11"
expj.DA0010010.DA0010011form1.onDecision3 = function () {
  console.log('DA0010011form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010011form1', '_DA0010011form2/OUTSIDE_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script16="child;10;UNMASK;_DA0010011form2/VEND_CD,_DA0010011form2/PeekerVendCd"
expj.DA0010010.DA0010011form1.child10 = function () {
  console.log('DA0010011form1 script16');
expj.common.pscript.setUnMaskToReferenceComponent('DA0010010', 'DA0010011form1', '_DA0010011form2/VEND_CD');
expj.common.pscript.setUnMaskToReferenceComponent('DA0010010', 'DA0010011form1', '_DA0010011form2/PeekerVendCd');
};
// script17="child;11;SET;_DA0010011form2/VEND_CD=@*12"
expj.DA0010010.DA0010011form1.child11 = function () {
  console.log('DA0010011form1 script17');
expj.common.pscript.setReferenceComponentValue('DA0010010', 'DA0010011form1', '_DA0010011form2/VEND_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child12)){this.child12();}}
};
// script18="child;12;MASK;_DA0010011form2/VEND_CD,_DA0010011form2/PeekerVendCd"
expj.DA0010010.DA0010011form1.child12 = function () {
  console.log('DA0010011form1 script18');
expj.common.pscript.setMaskToReferenceComponent('DA0010010', 'DA0010011form1', '_DA0010011form2/VEND_CD');
expj.common.pscript.setMaskToReferenceComponent('DA0010010', 'DA0010011form1', '_DA0010011form2/PeekerVendCd');
};
expj.DA0010010.DA0010011form1.executeAllOnDecision = function () {
  console.log('execute DA0010011form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0010010.DA0010011form1['onDecision' + i])) {
        expj.DA0010010.DA0010011form1['onDecision' + i]();
      }
    }
  }
};
expj.DA0010010.DA0010011form1.executeOnLoad = function () {
  expj.DA0010010.DA0010011form1.executePScriptOnLoad();
};

expj.DA0010010.DA0010011form1.executePScriptOnLoad = function () {
  console.log('execute DA0010011form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.DA0010010.DA0010011form1['onLoad' + i])) {
      expj.DA0010010.DA0010011form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-DA0010010-DA0010011form1" action="DA0010010Servlet" name="DA0010011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aDA0010010Control.getReadStatusString()) %>" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-DA0010010-DA0010011form1-PLANT_CD">
expj.DA0010010.DA0010011form1.PLANT_CD = {};
expj.DA0010010.DA0010011form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute DA0010011form1/PLANT_CD.onDecision');
  expj.DA0010010.DA0010011form1.executeAllOnDecision();
  expj.DA0010010.executeAllOnDecision();
};
expj.DA0010010.DA0010011form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010011form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0010010', 'DA0010011form1', 'PLANT_CD', this);
  });
  expj.DA0010010.DA0010011form1.PLANT_CD.executePScriptOnLoad();
};

expj.DA0010010.DA0010011form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute DA0010011form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010011form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0010010-DA0010011form1-PLANT_CD" name="PLANT_CD" class="DA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0010010Struct.getPLANT_CD()) %>" maxlength="2" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0010010-DA0010011form1-PLANT_NAME">
expj.DA0010010.DA0010011form1.PLANT_NAME = {};
expj.DA0010010.DA0010011form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute DA0010011form1/PLANT_NAME.onDecision');
  expj.DA0010010.DA0010011form1.executeAllOnDecision();
  expj.DA0010010.executeAllOnDecision();
};
expj.DA0010010.DA0010011form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010011form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0010010', 'DA0010011form1', 'PLANT_NAME', this);
  });
  expj.DA0010010.DA0010011form1.PLANT_NAME.executePScriptOnLoad();
};

expj.DA0010010.DA0010011form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0010011form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010011form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0010010-DA0010011form1-PLANT_NAME" name="PLANT_NAME" class="DA0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0010010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
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
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><script class="expj-script-DA0010010-DA0010011form2">
expj.DA0010010.DA0010011form2 = {};
expj.DA0010010.DA0010011form2.executeAllOnDecision = function () {
  console.log('execute DA0010011form2.onDecision');
};
expj.DA0010010.DA0010011form2.executeOnLoad = function () {
  expj.DA0010010.DA0010011form2.executePScriptOnLoad();
};

expj.DA0010010.DA0010011form2.executePScriptOnLoad = function () {
  console.log('execute DA0010011form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-DA0010010-DA0010011form2" action="DA0010010Servlet" name="DA0010011form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aDA0010010Control.getReadStatus()) %>" style="height:438px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:438px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CS_PROC_CD",rb)%></span><!-- 工程コード --></div><!--/td-->
<script class="expj-script-DA0010010-DA0010011form2-CS_PROC_CD">
expj.DA0010010.DA0010011form2.CS_PROC_CD = {};
expj.DA0010010.DA0010011form2.CS_PROC_CD.executeAllOnDecision = function () {
  console.log('execute DA0010011form2/CS_PROC_CD.onDecision');
  expj.DA0010010.DA0010011form2.executeAllOnDecision();
  expj.DA0010010.executeAllOnDecision();
};
expj.DA0010010.DA0010011form2.CS_PROC_CD.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010011form2-CS_PROC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0010010', 'DA0010011form2', 'CS_PROC_CD', this);
  });
  expj.DA0010010.DA0010011form2.CS_PROC_CD.executePScriptOnLoad();
};

expj.DA0010010.DA0010011form2.CS_PROC_CD.executePScriptOnLoad = function () {
  console.log('execute DA0010011form2/CS_PROC_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010011form2-CS_PROC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0010010-DA0010011form2-CS_PROC_CD" name="CS_PROC_CD" class="DA0010010-focus-move  required-value expj-DA0010010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0010010Struct.getCS_PROC_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-DA0010010-DA0010011form2-w_CS_PROC_CD" name="w_CS_PROC_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDA0010010Struct.getw_CS_PROC_CD()) %>">
<script class="expj-script-DA0010010-DA0010011form2-w_CS_PROC_CD">
expj.DA0010010.DA0010011form2.w_CS_PROC_CD = {};
expj.DA0010010.DA0010011form2.w_CS_PROC_CD.executeAllOnDecision = function () {
  console.log('execute DA0010011form2/w_CS_PROC_CD.onDecision');
  expj.DA0010010.DA0010011form2.executeAllOnDecision();
  expj.DA0010010.executeAllOnDecision();
};
expj.DA0010010.DA0010011form2.w_CS_PROC_CD.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010011form2-w_CS_PROC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0010010', 'DA0010011form2', 'w_CS_PROC_CD', this);
  });
  expj.DA0010010.DA0010011form2.w_CS_PROC_CD.executePScriptOnLoad();
};

expj.DA0010010.DA0010011form2.w_CS_PROC_CD.executePScriptOnLoad = function () {
  console.log('execute DA0010011form2/w_CS_PROC_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010011form2-w_CS_PROC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CS_PROC_NAME",rb)%></span><!-- 工程名 --></div><!--/td-->
<script class="expj-script-DA0010010-DA0010011form2-CS_PROC_NAME">
expj.DA0010010.DA0010011form2.CS_PROC_NAME = {};
expj.DA0010010.DA0010011form2.CS_PROC_NAME.executeAllOnDecision = function () {
  console.log('execute DA0010011form2/CS_PROC_NAME.onDecision');
  expj.DA0010010.DA0010011form2.executeAllOnDecision();
  expj.DA0010010.executeAllOnDecision();
};
expj.DA0010010.DA0010011form2.CS_PROC_NAME.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010011form2-CS_PROC_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0010010', 'DA0010011form2', 'CS_PROC_NAME', this);
  });
  expj.DA0010010.DA0010011form2.CS_PROC_NAME.executePScriptOnLoad();
};

expj.DA0010010.DA0010011form2.CS_PROC_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0010011form2/CS_PROC_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010011form2-CS_PROC_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-DA0010010-DA0010011form2-CS_PROC_NAME" name="CS_PROC_NAME" class="DA0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0010010Struct.getCS_PROC_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WS_CD",rb)%></span><!-- 作業区コード --></div><!--/td-->
<script class="expj-script-DA0010010-DA0010011form2-WS_CD">
expj.DA0010010.DA0010011form2.WS_CD = {};
expj.DA0010010.DA0010011form2.WS_CD.executeAllOnDecision = function () {
  console.log('execute DA0010011form2/WS_CD.onDecision');
  expj.DA0010010.DA0010011form2.executeAllOnDecision();
  expj.DA0010010.executeAllOnDecision();
};
expj.DA0010010.DA0010011form2.WS_CD.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010011form2-WS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0010010', 'DA0010011form2', 'WS_CD', this);
  });
  expj.DA0010010.DA0010011form2.WS_CD.executePScriptOnLoad();
};

expj.DA0010010.DA0010011form2.WS_CD.executePScriptOnLoad = function () {
  console.log('execute DA0010011form2/WS_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010011form2-WS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0010010-DA0010011form2-WS_CD" name="WS_CD" class="DA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0010010Struct.getWS_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-DA0010010-DA0010011form2-w_WS_CD" name="w_WS_CD" class="" data-kind="OBT_WILD;" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDA0010010Struct.getw_WS_CD()) %>">
<script class="expj-script-DA0010010-DA0010011form2-w_WS_CD">
expj.DA0010010.DA0010011form2.w_WS_CD = {};
expj.DA0010010.DA0010011form2.w_WS_CD.executeAllOnDecision = function () {
  console.log('execute DA0010011form2/w_WS_CD.onDecision');
  expj.DA0010010.DA0010011form2.executeAllOnDecision();
  expj.DA0010010.executeAllOnDecision();
};
expj.DA0010010.DA0010011form2.w_WS_CD.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010011form2-w_WS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0010010', 'DA0010011form2', 'w_WS_CD', this);
  });
  expj.DA0010010.DA0010011form2.w_WS_CD.executePScriptOnLoad();
};

expj.DA0010010.DA0010011form2.w_WS_CD.executePScriptOnLoad = function () {
  console.log('execute DA0010011form2/w_WS_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010011form2-w_WS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-DA0010010-DA0010011form2-PeekerWsCd">
expj.DA0010010.DA0010011form2.PeekerWsCd = {};
// script1="onClick;0;PEEKER;_DA0010011form2/WS_CD:_DA0010011form2/WS_NAME@<%=contextNo%>"
expj.DA0010010.DA0010011form2.PeekerWsCd.onClick0 = function () {
  console.log('PeekerWsCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DA0010010';
var parameterValues = 'PeekerWsCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010011form2', '_WS_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WS_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DA0010011form2/WS_CD:_DA0010011form2/WS_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DA0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DA0010010.DA0010011form2.PeekerWsCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0010010.DA0010011form2.PeekerWsCd['onClick' + i])) {
        expj.DA0010010.DA0010011form2.PeekerWsCd['onClick' + i]();
      }
    }
  }
};
expj.DA0010010.DA0010011form2.PeekerWsCd.executeAllOnDecision = function () {
};
expj.DA0010010.DA0010011form2.PeekerWsCd.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010011form2-PeekerWsCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0010010', 'DA0010011form2', 'PeekerWsCd', this, 'Button');
    }
  });
  expj.DA0010010.DA0010011form2.PeekerWsCd.executePScriptOnLoad();
};

expj.DA0010010.DA0010011form2.PeekerWsCd.executePScriptOnLoad = function () {
  console.log('execute DA0010011form2/PeekerWsCd.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010011form2-PeekerWsCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DA0010010-DA0010011form2-PeekerWsCd" class="DA0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DA0010010-DA0010011form2-WS_NAME">
expj.DA0010010.DA0010011form2.WS_NAME = {};
expj.DA0010010.DA0010011form2.WS_NAME.executeAllOnDecision = function () {
  console.log('execute DA0010011form2/WS_NAME.onDecision');
  expj.DA0010010.DA0010011form2.executeAllOnDecision();
  expj.DA0010010.executeAllOnDecision();
};
expj.DA0010010.DA0010011form2.WS_NAME.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010011form2-WS_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0010010', 'DA0010011form2', 'WS_NAME', this);
  });
  expj.DA0010010.DA0010011form2.WS_NAME.executePScriptOnLoad();
};

expj.DA0010010.DA0010011form2.WS_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0010011form2/WS_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010011form2-WS_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0010010-DA0010011form2-WS_NAME" name="WS_NAME" class="DA0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0010010Struct.getWS_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OUTSIDE_TYP_6",rb)%></span><!-- 工程内外作区分 --></div><!--/td-->
<script class="expj-script-DA0010010-DA0010011form2-OUTSIDE_TYP">
expj.DA0010010.DA0010011form2.OUTSIDE_TYP = {};
expj.DA0010010.DA0010011form2.OUTSIDE_TYP.executeAllOnDecision = function () {
  console.log('execute DA0010011form2/OUTSIDE_TYP.onDecision');
  expj.DA0010010.DA0010011form2.executeAllOnDecision();
  expj.DA0010010.executeAllOnDecision();
};
expj.DA0010010.DA0010011form2.OUTSIDE_TYP.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010011form2-OUTSIDE_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DA0010010', 'DA0010011form2', 'OUTSIDE_TYP', this);
  });
  expj.DA0010010.DA0010011form2.OUTSIDE_TYP.executePScriptOnLoad();
};

expj.DA0010010.DA0010011form2.OUTSIDE_TYP.executePScriptOnLoad = function () {
  console.log('execute DA0010011form2/OUTSIDE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010011form2-OUTSIDE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DA0010010-DA0010011form2-OUTSIDE_TYP" name='OUTSIDE_TYP' class='DA0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDA0010010Control.getStruct().getList_OUTSIDE_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDA0010010Control.getStruct().getList_OUTSIDE_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aDA0010010Control.getStruct().getList_OUTSIDE_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDA0010010Struct.getOUTSIDE_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_CD",rb)%></span><!-- 取引先コード --></div><!--/td-->
<script class="expj-script-DA0010010-DA0010011form2-VEND_CD">
expj.DA0010010.DA0010011form2.VEND_CD = {};
expj.DA0010010.DA0010011form2.VEND_CD.executeAllOnDecision = function () {
  console.log('execute DA0010011form2/VEND_CD.onDecision');
  expj.DA0010010.DA0010011form2.executeAllOnDecision();
  expj.DA0010010.executeAllOnDecision();
};
expj.DA0010010.DA0010011form2.VEND_CD.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010011form2-VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0010010', 'DA0010011form2', 'VEND_CD', this);
  });
  expj.DA0010010.DA0010011form2.VEND_CD.executePScriptOnLoad();
};

expj.DA0010010.DA0010011form2.VEND_CD.executePScriptOnLoad = function () {
  console.log('execute DA0010011form2/VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010011form2-VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0010010-DA0010011form2-VEND_CD" name="VEND_CD" class="DA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0010010Struct.getVEND_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-DA0010010-DA0010011form2-PeekerVendCd">
expj.DA0010010.DA0010011form2.PeekerVendCd = {};
// script1="onClick;0;PEEKER;_DA0010011form2/VEND_CD:_DA0010011form2/VEND_NAME@<%=contextNo%>"
expj.DA0010010.DA0010011form2.PeekerVendCd.onClick0 = function () {
  console.log('PeekerVendCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DA0010010';
var parameterValues = 'PeekerVendCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010011form2', '_VEND_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%VEND_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DA0010011form2/VEND_CD:_DA0010011form2/VEND_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DA0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DA0010010.DA0010011form2.PeekerVendCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0010010.DA0010011form2.PeekerVendCd['onClick' + i])) {
        expj.DA0010010.DA0010011form2.PeekerVendCd['onClick' + i]();
      }
    }
  }
};
expj.DA0010010.DA0010011form2.PeekerVendCd.executeAllOnDecision = function () {
};
expj.DA0010010.DA0010011form2.PeekerVendCd.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010011form2-PeekerVendCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0010010', 'DA0010011form2', 'PeekerVendCd', this, 'Button');
    }
  });
  expj.DA0010010.DA0010011form2.PeekerVendCd.executePScriptOnLoad();
};

expj.DA0010010.DA0010011form2.PeekerVendCd.executePScriptOnLoad = function () {
  console.log('execute DA0010011form2/PeekerVendCd.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010011form2-PeekerVendCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DA0010010-DA0010011form2-PeekerVendCd" class="DA0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DA0010010-DA0010011form2-VEND_NAME">
expj.DA0010010.DA0010011form2.VEND_NAME = {};
expj.DA0010010.DA0010011form2.VEND_NAME.executeAllOnDecision = function () {
  console.log('execute DA0010011form2/VEND_NAME.onDecision');
  expj.DA0010010.DA0010011form2.executeAllOnDecision();
  expj.DA0010010.executeAllOnDecision();
};
expj.DA0010010.DA0010011form2.VEND_NAME.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010011form2-VEND_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0010010', 'DA0010011form2', 'VEND_NAME', this);
  });
  expj.DA0010010.DA0010011form2.VEND_NAME.executePScriptOnLoad();
};

expj.DA0010010.DA0010011form2.VEND_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0010011form2/VEND_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010011form2-VEND_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0010010-DA0010011form2-VEND_NAME" name="VEND_NAME" class="DA0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0010010Struct.getVEND_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ORG_CD",rb)%></span><!-- 部門コード --></div><!--/td-->
<script class="expj-script-DA0010010-DA0010011form2-ORG_CD">
expj.DA0010010.DA0010011form2.ORG_CD = {};
expj.DA0010010.DA0010011form2.ORG_CD.executeAllOnDecision = function () {
  console.log('execute DA0010011form2/ORG_CD.onDecision');
  expj.DA0010010.DA0010011form2.executeAllOnDecision();
  expj.DA0010010.executeAllOnDecision();
};
expj.DA0010010.DA0010011form2.ORG_CD.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010011form2-ORG_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0010010', 'DA0010011form2', 'ORG_CD', this);
  });
  expj.DA0010010.DA0010011form2.ORG_CD.executePScriptOnLoad();
};

expj.DA0010010.DA0010011form2.ORG_CD.executePScriptOnLoad = function () {
  console.log('execute DA0010011form2/ORG_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010011form2-ORG_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0010010-DA0010011form2-ORG_CD" name="ORG_CD" class="DA0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0010010Struct.getORG_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-DA0010010-DA0010011form2-PeekerOrgCd">
expj.DA0010010.DA0010011form2.PeekerOrgCd = {};
// script1="onClick;0;PEEKER;_DA0010011form2/ORG_CD:_DA0010011form2/ORG_NAME@<%=contextNo%>"
expj.DA0010010.DA0010011form2.PeekerOrgCd.onClick0 = function () {
  console.log('PeekerOrgCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DA0010010';
var parameterValues = 'PeekerOrgCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0010010', 'DA0010011form2', '_ORG_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ORG_CD_D01%&%';
parameterValues += 'TARGET_FIELD%=%_DA0010011form2/ORG_CD:_DA0010011form2/ORG_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DA0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DA0010010.DA0010011form2.PeekerOrgCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0010010.DA0010011form2.PeekerOrgCd['onClick' + i])) {
        expj.DA0010010.DA0010011form2.PeekerOrgCd['onClick' + i]();
      }
    }
  }
};
expj.DA0010010.DA0010011form2.PeekerOrgCd.executeAllOnDecision = function () {
};
expj.DA0010010.DA0010011form2.PeekerOrgCd.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010011form2-PeekerOrgCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0010010', 'DA0010011form2', 'PeekerOrgCd', this, 'Button');
    }
  });
  expj.DA0010010.DA0010011form2.PeekerOrgCd.executePScriptOnLoad();
};

expj.DA0010010.DA0010011form2.PeekerOrgCd.executePScriptOnLoad = function () {
  console.log('execute DA0010011form2/PeekerOrgCd.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010011form2-PeekerOrgCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DA0010010-DA0010011form2-PeekerOrgCd" class="DA0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DA0010010-DA0010011form2-ORG_NAME">
expj.DA0010010.DA0010011form2.ORG_NAME = {};
expj.DA0010010.DA0010011form2.ORG_NAME.executeAllOnDecision = function () {
  console.log('execute DA0010011form2/ORG_NAME.onDecision');
  expj.DA0010010.DA0010011form2.executeAllOnDecision();
  expj.DA0010010.executeAllOnDecision();
};
expj.DA0010010.DA0010011form2.ORG_NAME.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010011form2-ORG_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0010010', 'DA0010011form2', 'ORG_NAME', this);
  });
  expj.DA0010010.DA0010011form2.ORG_NAME.executePScriptOnLoad();
};

expj.DA0010010.DA0010011form2.ORG_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0010011form2/ORG_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010011form2-ORG_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0010010-DA0010011form2-ORG_NAME" name="ORG_NAME" class="DA0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0010010Struct.getORG_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STD_COST_OF_MONTH",rb)%></span><!-- 月間標準工数 --></div><!--/td-->
<script class="expj-script-DA0010010-DA0010011form2-STD_COST_OF_MONTH">
expj.DA0010010.DA0010011form2.STD_COST_OF_MONTH = {};
expj.DA0010010.DA0010011form2.STD_COST_OF_MONTH.executeAllOnDecision = function () {
  console.log('execute DA0010011form2/STD_COST_OF_MONTH.onDecision');
  expj.DA0010010.DA0010011form2.executeAllOnDecision();
  expj.DA0010010.executeAllOnDecision();
};
expj.DA0010010.DA0010011form2.STD_COST_OF_MONTH.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010011form2-STD_COST_OF_MONTH').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0010010', 'DA0010011form2', 'STD_COST_OF_MONTH', this);
  });
  expj.DA0010010.DA0010011form2.STD_COST_OF_MONTH.executePScriptOnLoad();
};

expj.DA0010010.DA0010011form2.STD_COST_OF_MONTH.executePScriptOnLoad = function () {
  console.log('execute DA0010011form2/STD_COST_OF_MONTH.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010011form2-STD_COST_OF_MONTH');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0010010-DA0010011form2-STD_COST_OF_MONTH" name="STD_COST_OF_MONTH" class="DA0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0010010Struct.getSTD_COST_OF_MONTH()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STD_COST_UNIT_TYP",rb)%></span><!-- 標準工数単位区分 --></div><!--/td-->
<script class="expj-script-DA0010010-DA0010011form2-STD_COST_UNIT_TYP">
expj.DA0010010.DA0010011form2.STD_COST_UNIT_TYP = {};
expj.DA0010010.DA0010011form2.STD_COST_UNIT_TYP.executeAllOnDecision = function () {
  console.log('execute DA0010011form2/STD_COST_UNIT_TYP.onDecision');
  expj.DA0010010.DA0010011form2.executeAllOnDecision();
  expj.DA0010010.executeAllOnDecision();
};
expj.DA0010010.DA0010011form2.STD_COST_UNIT_TYP.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010011form2-STD_COST_UNIT_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DA0010010', 'DA0010011form2', 'STD_COST_UNIT_TYP', this);
  });
  expj.DA0010010.DA0010011form2.STD_COST_UNIT_TYP.executePScriptOnLoad();
};

expj.DA0010010.DA0010011form2.STD_COST_UNIT_TYP.executePScriptOnLoad = function () {
  console.log('execute DA0010011form2/STD_COST_UNIT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010011form2-STD_COST_UNIT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DA0010010-DA0010011form2-STD_COST_UNIT_TYP" name='STD_COST_UNIT_TYP' class='DA0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDA0010010Control.getStruct().getList_STD_COST_UNIT_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDA0010010Control.getStruct().getList_STD_COST_UNIT_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aDA0010010Control.getStruct().getList_STD_COST_UNIT_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDA0010010Struct.getSTD_COST_UNIT_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-DA0010010-DA0010011form2-MODIFY_COUNT" name="MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDA0010010Struct.getMODIFY_COUNT()) %>">
<script class="expj-script-DA0010010-DA0010011form2-MODIFY_COUNT">
expj.DA0010010.DA0010011form2.MODIFY_COUNT = {};
expj.DA0010010.DA0010011form2.MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute DA0010011form2/MODIFY_COUNT.onDecision');
  expj.DA0010010.DA0010011form2.executeAllOnDecision();
  expj.DA0010010.executeAllOnDecision();
};
expj.DA0010010.DA0010011form2.MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010011form2-MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0010010', 'DA0010011form2', 'MODIFY_COUNT', this);
  });
  expj.DA0010010.DA0010011form2.MODIFY_COUNT.executePScriptOnLoad();
};

expj.DA0010010.DA0010011form2.MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute DA0010011form2/MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010011form2-MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-DA0010010-DA0010011button2">
expj.DA0010010.DA0010011button2 = {};
expj.DA0010010.DA0010011button2.executeAllOnDecision = function () {
  console.log('execute DA0010011button2.onDecision');
};
expj.DA0010010.DA0010011button2.executeOnLoad = function () {
  expj.DA0010010.DA0010011button2.executePScriptOnLoad();
};

expj.DA0010010.DA0010011button2.executePScriptOnLoad = function () {
  console.log('execute DA0010011button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DA0010010-DA0010011button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DA0010010-DA0010011button2-Insert">
expj.DA0010010.DA0010011button2.Insert = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_DA0010011form1/*,_DA0010011form2/*@DA0010010Servlet,,$ZZ07001"
expj.DA0010010.DA0010011button2.Insert.onClick0 = function () {
  console.log('Insert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0010010', 'DA0010011button2', '_DA0010011form1/*,_DA0010011form2/*', 'DA0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0010010', response);
expj.common.changeBusinessScreenTab('DA0010010', contents);
};
expj.common.pscript.callConfirm('DA0010010', 'DA0010011button2', 'ZZ07001', okEvent);
};
expj.DA0010010.DA0010011button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0010010.DA0010011button2.Insert['onClick' + i])) {
        expj.DA0010010.DA0010011button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.DA0010010.DA0010011button2.Insert.executeAllOnDecision = function () {
};
expj.DA0010010.DA0010011button2.Insert.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010011button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0010010', 'DA0010011button2', 'Insert', this, 'Button');
    }
  });
  expj.DA0010010.DA0010011button2.Insert.executePScriptOnLoad();
};

expj.DA0010010.DA0010011button2.Insert.executePScriptOnLoad = function () {
  console.log('execute DA0010011button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010011button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0010010-DA0010011button2-Insert" name="Insert" class="DA0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-DA0010010-DA0010011button2-Update">
expj.DA0010010.DA0010011button2.Update = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_DA0010011form1/*,_DA0010011form2/*@DA0010010Servlet,,$ZZ07003"
expj.DA0010010.DA0010011button2.Update.onClick0 = function () {
  console.log('Update script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0010010', 'DA0010011button2', '_DA0010011form1/*,_DA0010011form2/*', 'DA0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0010010', response);
expj.common.changeBusinessScreenTab('DA0010010', contents);
};
expj.common.pscript.callConfirm('DA0010010', 'DA0010011button2', 'ZZ07003', okEvent);
};
expj.DA0010010.DA0010011button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0010010.DA0010011button2.Update['onClick' + i])) {
        expj.DA0010010.DA0010011button2.Update['onClick' + i]();
      }
    }
  }
};
expj.DA0010010.DA0010011button2.Update.executeAllOnDecision = function () {
};
expj.DA0010010.DA0010011button2.Update.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010011button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0010010', 'DA0010011button2', 'Update', this, 'Button');
    }
  });
  expj.DA0010010.DA0010011button2.Update.executePScriptOnLoad();
};

expj.DA0010010.DA0010011button2.Update.executePScriptOnLoad = function () {
  console.log('execute DA0010011button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010011button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0010010-DA0010011button2-Update" name="Update" class="DA0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 95px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">DA0010011 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-DA0010010-DA0010011button0">
expj.DA0010010.DA0010011button0 = {};
expj.DA0010010.DA0010011button0.executeAllOnDecision = function () {
  console.log('execute DA0010011button0.onDecision');
};
expj.DA0010010.DA0010011button0.executeOnLoad = function () {
  expj.DA0010010.DA0010011button0.executePScriptOnLoad();
};

expj.DA0010010.DA0010011button0.executePScriptOnLoad = function () {
  console.log('execute DA0010011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DA0010010-DA0010011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DA0010010-DA0010011button0-Return">
expj.DA0010010.DA0010011button0.Return = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_DA0010011form1/*,_DA0010011form2/*@DA0010010Servlet,,$ZZ07013"
expj.DA0010010.DA0010011button0.Return.onClick0 = function () {
  console.log('Return script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0010010', 'DA0010011button0', '_DA0010011form1/*,_DA0010011form2/*', 'DA0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0010010', response);
expj.common.changeBusinessScreenTab('DA0010010', contents);
};
expj.common.pscript.callConfirm('DA0010010', 'DA0010011button0', 'ZZ07013', okEvent);
};
expj.DA0010010.DA0010011button0.Return.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0010010.DA0010011button0.Return['onClick' + i])) {
        expj.DA0010010.DA0010011button0.Return['onClick' + i]();
      }
    }
  }
};
expj.DA0010010.DA0010011button0.Return.executeAllOnDecision = function () {
};
expj.DA0010010.DA0010011button0.Return.executeOnLoad = function () {
  $('#expj-DA0010010-DA0010011button0-Return').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0010010', 'DA0010011button0', 'Return', this, 'Button');
    }
  });
  expj.DA0010010.DA0010011button0.Return.executePScriptOnLoad();
};

expj.DA0010010.DA0010011button0.Return.executePScriptOnLoad = function () {
  console.log('execute DA0010011button0/Return.onLoad');
  var targetComponent = document.getElementById('expj-DA0010010-DA0010011button0-Return');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0010010-DA0010011button0-Return" name="Return" class="DA0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-DA0010010 (END)-->
<%
MessageStruct msgStruct = aDA0010010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-DA0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.DA0010010)) {
  expj.common.treeInstanceMap.DA0010010 = {};
}
expj.common.treeInstanceMap.DA0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.DA0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.DA0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.DA0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.DA0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.DA0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.DA0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.DA0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.DA0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-DA0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-DA0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0010010)) {
  expj.common.detailDialogMap.DA0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.DA0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.DA0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.DA0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.DA0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.DA0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.DA0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-DA0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.DA0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-DA0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.DA0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-DA0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.DA0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.DA0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.DA0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.DA0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-DA0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.DA0010010)) {
  expj.common.viewInstanceMap.DA0010010 = {};
}
expj.common.viewInstanceMap.DA0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.DA0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.DA0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.DA0010010.<%=viewId %>.init = function () {
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
    expj.DA0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.DA0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-DA0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-DA0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-DA0010010_init">
/**
 * DA0010010用のロード完了時初期化関数
 */
expj.DA0010010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-DA0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('DA0010010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('DA0010010');
  expj.common.calendarInstanceMap.DA0010010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.DA0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.DA0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.DA0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.DA0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.DA0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-DA0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-DA0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-DA0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-DA0010010-<%=detailId %>');
<%
 }
%>
  try{expj.DA0010010.DA0010011form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011form2.CS_PROC_CD.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011form2.w_CS_PROC_CD.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011form2.CS_PROC_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011form2.WS_CD.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011form2.w_WS_CD.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011form2.PeekerWsCd.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011form2.WS_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011form2.OUTSIDE_TYP.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011form2.VEND_CD.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011form2.PeekerVendCd.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011form2.VEND_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011form2.ORG_CD.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011form2.PeekerOrgCd.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011form2.ORG_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011form2.STD_COST_OF_MONTH.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011form2.STD_COST_UNIT_TYP.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011form2.MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011button2.Insert.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011button2.Update.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011button0.Return.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011form1.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011form2.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011button2.executeOnLoad();}catch(e){};
  try{expj.DA0010010.DA0010011button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.DA0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-DA0010010', 'DA0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-DA0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.DA0010010-focus-move');
  // 初期フォーカス当てる処理
  $('.DA0010010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('DA0010010', '<%=request.getContextPath() %>');
};

/**
 * DA0010010の全体onDecision処理
 */
expj.DA0010010.executeAllOnDecision = function () {
  expj.DA0010010.DA0010011form1.executeAllOnDecision();
};
</script>
<script class="expj-script-DA0010010_console">
expj.DA0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>