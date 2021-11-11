<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:30:15 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AD0020\AD0020011.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AD0020.*" %>
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
<jsp:useBean id="aAD0020011Control" class="com.nec.jp.orteus.metamorBase.AD0020.AD0020011Control" scope="request"/>
<jsp:useBean id="aAD0020011Struct" class="com.nec.jp.orteus.metamorBase.AD0020.AD0020011Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

品目別作業計画メンテナンス（製番）
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0020/jsp/AD0020011.jsp,v $
$Author: geng-jia $	
$Revision: 1.11 $ $Date: 2017/02/22 02:04:41 $
********************************************************* --%>
<html>
<head>
<title>品目別作業計画メンテナンス（製番）</title>
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
<script class="expj-script-AD0020011_init">
  // AD0020011名前空間
  expj.AD0020011 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AD0020011" data-screen="AD0020011" data-newdata="<%=aAD0020011Control.isNewData() %>">
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
              <script class="expj-script-AD0020011-AD0020011form1">
expj.AD0020011.AD0020011form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.AD0020011.AD0020011form1.onLoad0 = function () {
  console.log('AD0020011form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHK;?AD0020011form1/*[eq]NORMAL[or]?AD0020011form1/*[eq]NOT_FOUND[or]?AD0020011form1/*[eq]TOO_MANY@*0,*1"
expj.AD0020011.AD0020011form1.onDecision0 = function () {
  console.log('AD0020011form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020011form1', '?AD0020011form1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020011form1', '?AD0020011form1/*'), '[eq]', 'NOT_FOUND') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020011form1', '?AD0020011form1/*'), '[eq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AD0020011button1/LineInsert"
expj.AD0020011.AD0020011form1.child0 = function () {
  console.log('AD0020011form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineInsert');
};
// script4="child;1;MASK;_AD0020011button1/LineInsert"
expj.AD0020011.AD0020011form1.child1 = function () {
  console.log('AD0020011form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineInsert');
};
// script5="onDecision;1;CHK;?AD0020011form1/*[eq]NORMAL@*2,*4"
expj.AD0020011.AD0020011form1.onDecision1 = function () {
  console.log('AD0020011form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020011form1', '?AD0020011form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;CHKRQ;?AD0020011view1/?[eq]SINGLE@*3,*4"
expj.AD0020011.AD0020011form1.child2 = function () {
  console.log('AD0020011form1 script6');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020011form1', '?AD0020011view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_AD0020011button1/LineUpdate,_AD0020011button1/LineCopy,_AD0020011button1/LineDelete"
expj.AD0020011.AD0020011form1.child3 = function () {
  console.log('AD0020011form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineUpdate');
expj.common.pscript.setUnMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineCopy');
expj.common.pscript.setUnMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineDelete');
};
// script8="child;4;MASK;_AD0020011button1/LineUpdate,_AD0020011button1/LineCopy,_AD0020011button1/LineDelete"
expj.AD0020011.AD0020011form1.child4 = function () {
  console.log('AD0020011form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineUpdate');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineCopy');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineDelete');
};
// script9="onDecision;2;SET;_AD0020011form2/d1_STOCK_UNIT=_AD0020011form2/STOCK_UNIT,_AD0020011form2/d2_STOCK_UNIT=_AD0020011form2/STOCK_UNIT,_AD0020011form2/d3_STOCK_UNIT=_AD0020011form2/STOCK_UNIT,_AD0020011form2/d4_STOCK_UNIT=_AD0020011form2/STOCK_UNIT"
expj.AD0020011.AD0020011form1.onDecision2 = function () {
  console.log('AD0020011form1 script9');
expj.common.pscript.setReferenceComponentValue('AD0020011', 'AD0020011form1', '_AD0020011form2/d1_STOCK_UNIT', expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020011form1', '_AD0020011form2/STOCK_UNIT'));
expj.common.pscript.setReferenceComponentValue('AD0020011', 'AD0020011form1', '_AD0020011form2/d2_STOCK_UNIT', expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020011form1', '_AD0020011form2/STOCK_UNIT'));
expj.common.pscript.setReferenceComponentValue('AD0020011', 'AD0020011form1', '_AD0020011form2/d3_STOCK_UNIT', expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020011form1', '_AD0020011form2/STOCK_UNIT'));
expj.common.pscript.setReferenceComponentValue('AD0020011', 'AD0020011form1', '_AD0020011form2/d4_STOCK_UNIT', expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020011form1', '_AD0020011form2/STOCK_UNIT'));
};
// script10="onDecision;3;CHK;_AD0020011form2/h_MANHOUR_TYP[numeq]0@*5,*9"
expj.AD0020011.AD0020011form1.onDecision3 = function () {
  console.log('AD0020011form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020011form1', '_AD0020011form2/h_MANHOUR_TYP')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script11="child;5;CHK;?AD0020011view1/?[eq]NOT_SELECTED@*6,*8"
expj.AD0020011.AD0020011form1.child5 = function () {
  console.log('AD0020011form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020011form1', '?AD0020011view1/?'), '[eq]', 'NOT_SELECTED')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script12="child;6;UNMASK;_AD0020011button1/LineInsert@7"
expj.AD0020011.AD0020011form1.child6 = function () {
  console.log('AD0020011form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineInsert');
};
// script13="child;7;MASK;_AD0020011button1/LineUpdate,_AD0020011button1/LineCopy,_AD0020011button1/LineDelete"
expj.AD0020011.AD0020011form1.child7 = function () {
  console.log('AD0020011form1 script13');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineUpdate');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineCopy');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineDelete');
};
// script14="child;8;UNMASK;_AD0020011button1/LineInsert,_AD0020011button1/LineUpdate,_AD0020011button1/LineCopy,_AD0020011button1/LineDelete"
expj.AD0020011.AD0020011form1.child8 = function () {
  console.log('AD0020011form1 script14');
expj.common.pscript.setUnMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineInsert');
expj.common.pscript.setUnMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineUpdate');
expj.common.pscript.setUnMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineCopy');
expj.common.pscript.setUnMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineDelete');
};
// script15="child;9;CHK;_AD0020011form2/h_MANHOUR_TYP[numeq]1@*10,*15"
expj.AD0020011.AD0020011form1.child9 = function () {
  console.log('AD0020011form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020011form1', '_AD0020011form2/h_MANHOUR_TYP')), '[numeq]', expj.common.pscript.convertNumber('1'))) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script16="child;10;CHK;?AD0020011view1/?[eq]NOT_SELECTED@*12,*13"
expj.AD0020011.AD0020011form1.child10 = function () {
  console.log('AD0020011form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020011form1', '?AD0020011view1/?'), '[eq]', 'NOT_SELECTED')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script17="child;12;MASK;_AD0020011button1/LineInsert,_AD0020011button1/LineUpdate,_AD0020011button1/LineCopy,_AD0020011button1/LineDelete"
expj.AD0020011.AD0020011form1.child12 = function () {
  console.log('AD0020011form1 script17');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineInsert');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineUpdate');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineCopy');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineDelete');
};
// script18="child;13;MASK;_AD0020011button1/LineInsert,_AD0020011button1/LineCopy,_AD0020011button1/LineDelete@*14"
expj.AD0020011.AD0020011form1.child13 = function () {
  console.log('AD0020011form1 script18');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineInsert');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineCopy');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineDelete');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child14)){this.child14();}}
};
// script19="child;14;UNMASK;_AD0020011button1/LineUpdate"
expj.AD0020011.AD0020011form1.child14 = function () {
  console.log('AD0020011form1 script19');
expj.common.pscript.setUnMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineUpdate');
};
// script20="child;15;MASK;_AD0020011button1/LineInsert,_AD0020011button1/LineUpdate,_AD0020011button1/LineCopy,_AD0020011button1/LineDelete"
expj.AD0020011.AD0020011form1.child15 = function () {
  console.log('AD0020011form1 script20');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineInsert');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineUpdate');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineCopy');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020011form1', '_AD0020011button1/LineDelete');
};
expj.AD0020011.AD0020011form1.executeAllOnDecision = function () {
  console.log('execute AD0020011form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0020011.AD0020011form1['onDecision' + i])) {
        expj.AD0020011.AD0020011form1['onDecision' + i]();
      }
    }
  }
};
expj.AD0020011.AD0020011form1.executeOnLoad = function () {
  expj.AD0020011.AD0020011form1.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form1.executePScriptOnLoad = function () {
  console.log('execute AD0020011form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AD0020011.AD0020011form1['onLoad' + i])) {
      expj.AD0020011.AD0020011form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0020011-AD0020011form1" action="AD0020011Servlet" name="AD0020011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAD0020011Control.getReadStatusString()) %>" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form1-JOB_ODR_CD">
expj.AD0020011.AD0020011form1.JOB_ODR_CD = {};
expj.AD0020011.AD0020011form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AD0020011form1/JOB_ODR_CD.onDecision');
  expj.AD0020011.AD0020011form1.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form1', 'JOB_ODR_CD', this);
  });
  expj.AD0020011.AD0020011form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AD0020011form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AD0020011-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getJOB_ODR_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CANCEL_NO",rb)%></span><!-- 製番取消発生番号 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form1-JOB_ODR_CANCEL_NO">
expj.AD0020011.AD0020011form1.JOB_ODR_CANCEL_NO = {};
expj.AD0020011.AD0020011form1.JOB_ODR_CANCEL_NO.executeAllOnDecision = function () {
  console.log('execute AD0020011form1/JOB_ODR_CANCEL_NO.onDecision');
  expj.AD0020011.AD0020011form1.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form1.JOB_ODR_CANCEL_NO.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form1-JOB_ODR_CANCEL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form1', 'JOB_ODR_CANCEL_NO', this);
  });
  expj.AD0020011.AD0020011form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad = function () {
  console.log('execute AD0020011form1/JOB_ODR_CANCEL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form1-JOB_ODR_CANCEL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form1-JOB_ODR_CANCEL_NO" name="JOB_ODR_CANCEL_NO" class="AD0020011-focus-move expj-align-right " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getJOB_ODR_CANCEL_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0020011-AD0020011form1-h_PARENT_OD_NO" name="h_PARENT_OD_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0020011Struct.geth_PARENT_OD_NO()) %>">
<script class="expj-script-AD0020011-AD0020011form1-h_PARENT_OD_NO">
expj.AD0020011.AD0020011form1.h_PARENT_OD_NO = {};
expj.AD0020011.AD0020011form1.h_PARENT_OD_NO.executeAllOnDecision = function () {
  console.log('execute AD0020011form1/h_PARENT_OD_NO.onDecision');
  expj.AD0020011.AD0020011form1.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form1.h_PARENT_OD_NO.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form1-h_PARENT_OD_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form1', 'h_PARENT_OD_NO', this);
  });
  expj.AD0020011.AD0020011form1.h_PARENT_OD_NO.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form1.h_PARENT_OD_NO.executePScriptOnLoad = function () {
  console.log('execute AD0020011form1/h_PARENT_OD_NO.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form1-h_PARENT_OD_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
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
<div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AD0020011-AD0020011view1">
expj.AD0020011.AD0020011view1 = {};
expj.AD0020011.AD0020011view1.executeAllOnClick = function () {
};
expj.AD0020011.AD0020011view1.executeAllOnDecision = function () {
  console.log('execute AD0020011view1.onDecision');
};
expj.AD0020011.AD0020011view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AD0020011view1", "expj.AD0020011.AD0020011view1.executeAllOnClick");
%>
  expj.AD0020011.AD0020011view1.executePScriptOnLoad();
};

expj.AD0020011.AD0020011view1.executePScriptOnLoad = function () {
  console.log('execute AD0020011view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AD0020011-AD0020011view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AD0020011view1_Id = "AD0020011view1";
 String AD0020011view1_select = "single";
 String AD0020011view1_sortable = "true";
 String AD0020011view1_resize = "true";
 String AD0020011view1_scroll = "true";
 StringBuffer AD0020011view1_HB = new StringBuffer();
 StringBuffer AD0020011view1_DB = new StringBuffer();
%>
<%
 AD0020011view1_select = "single";
 AD0020011view1_sortable = "true";
 AD0020011view1_resize = "true";
 AD0020011view1_scroll = "true";
%>
<%
 AD0020011view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AD0020011view1_sortable).append("}").append(",");
%>
     
<%
AD0020011view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_EXPLOSION_FLG_1",rb))).append("', 'name':'PROC_EXPLOSION_FLG_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0020011view1_sortable).append("}").append(",");
AD0020011view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_PROC_EXPLOSION_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0020011view1_sortable).append("}").append(",");
AD0020011view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_ODR_CD",rb))).append("', 'name':'WORK_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0020011view1_sortable).append("}").append(",");
AD0020011view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_ODR_DLV_DATE_6",rb))).append("', 'name':'WORK_ODR_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0020011view1_sortable).append("}").append(",");
AD0020011view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_START_DATE_6",rb))).append("', 'name':'OPR_INST_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0020011view1_sortable).append("}").append(",");
AD0020011view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_QTY",rb))).append("', 'name':'OPR_INST_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AD0020011view1_sortable).append("}").append(",");
AD0020011view1_HB.append("{'visible':true, 'type':'string', 'width':'250px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_IN_PROC_COMMENT_3",rb))).append("', 'name':'WORK_IN_PROC_COMMENT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0020011view1_sortable).append("}").append(",");
AD0020011view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_ITEM_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0020011view1_sortable).append("}").append(",");
AD0020011view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_UNIT_QTY_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0020011view1_sortable).append("}").append(",");
%>
<%
 int aAD0020011StructLength = aAD0020011Control.getListsize();
 final AD0020011Struct structBackup = aAD0020011Struct;
 aAD0020011Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAD0020011StructLength; ++loopCount) {
  if((aAD0020011Struct = (AD0020011Struct) aAD0020011Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAD0020011Struct", aAD0020011Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AD0020011view1_DB.append("[");
 AD0020011view1_DB.append(loopCount);
 AD0020011view1_DB.append(",").append("'<span id=\"expj-AD0020011-AD0020011view1-PROC_EXPLOSION_FLG_DN-").append(loopCount).append("\" class=\"expj-label expj-AD0020011-AD0020011view1-PROC_EXPLOSION_FLG_DN\" data-name=\"PROC_EXPLOSION_FLG_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0020011Struct.getPROC_EXPLOSION_FLG_DN())).append("</span>'");
 AD0020011view1_DB.append(",").append("'<span id=\"expj-AD0020011-AD0020011view1-h_PROC_EXPLOSION_FLG-").append(loopCount).append("\" class=\"expj-label expj-AD0020011-AD0020011view1-h_PROC_EXPLOSION_FLG\" data-name=\"h_PROC_EXPLOSION_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0020011Struct.geth_PROC_EXPLOSION_FLG())).append("</span>'");
 AD0020011view1_DB.append(",").append("'<span id=\"expj-AD0020011-AD0020011view1-WORK_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0020011-AD0020011view1-WORK_ODR_CD\" data-name=\"WORK_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0020011Struct.getWORK_ODR_CD())).append("</span>'");
 AD0020011view1_DB.append(",").append("'<span id=\"expj-AD0020011-AD0020011view1-WORK_ODR_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-AD0020011-AD0020011view1-WORK_ODR_DLV_DATE\" data-name=\"WORK_ODR_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0020011Struct.getWORK_ODR_DLV_DATE())).append("</span>'");
 AD0020011view1_DB.append(",").append("'<span id=\"expj-AD0020011-AD0020011view1-OPR_INST_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AD0020011-AD0020011view1-OPR_INST_START_DATE\" data-name=\"OPR_INST_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0020011Struct.getOPR_INST_START_DATE())).append("</span>'");
 AD0020011view1_DB.append(",").append("'<span id=\"expj-AD0020011-AD0020011view1-OPR_INST_QTY-").append(loopCount).append("\" class=\"expj-label expj-AD0020011-AD0020011view1-OPR_INST_QTY\" data-name=\"OPR_INST_QTY\" data-view=\"true\" data-kind=\"").append(Kind.convertNumeric(aAD0020011Struct.getl_UNIT_QTY_TYP(), Kind.N, 14, 1, Kind.FLOOR, 4)).append("\">").append(TypeConverter.sanitizer(aAD0020011Struct.getOPR_INST_QTY())).append("</span>'");
 AD0020011view1_DB.append(",").append("'<span id=\"expj-AD0020011-AD0020011view1-WORK_IN_PROC_COMMENT-").append(loopCount).append("\" class=\"expj-label expj-AD0020011-AD0020011view1-WORK_IN_PROC_COMMENT\" data-name=\"WORK_IN_PROC_COMMENT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0020011Struct.getWORK_IN_PROC_COMMENT())).append("</span>'");
 AD0020011view1_DB.append(",").append("'<span id=\"expj-AD0020011-AD0020011view1-h_ITEM_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AD0020011-AD0020011view1-h_ITEM_MODIFY_COUNT\" data-name=\"h_ITEM_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0020011Struct.geth_ITEM_MODIFY_COUNT())).append("</span>'");
 AD0020011view1_DB.append(",").append("'<span id=\"expj-AD0020011-AD0020011view1-l_UNIT_QTY_TYP-").append(loopCount).append("\" class=\"expj-label expj-AD0020011-AD0020011view1-l_UNIT_QTY_TYP\" data-name=\"l_UNIT_QTY_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0020011Struct.getl_UNIT_QTY_TYP())).append("</span>'");
 AD0020011view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAD0020011StructLength) {
   AD0020011view1_DB.append(",");
  }
 }
 aAD0020011Struct = structBackup;
 viewIdList.add(AD0020011view1_Id);
 viewSelectList.add(AD0020011view1_select);
 viewResizeList.add(AD0020011view1_resize);
 viewScrollList.add(AD0020011view1_scroll);
 viewHeaderDataList.add(AD0020011view1_HB);
 viewBodyDataList.add(AD0020011view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:420px;"><script class="expj-script-AD0020011-AD0020011button1">
expj.AD0020011.AD0020011button1 = {};
expj.AD0020011.AD0020011button1.executeAllOnDecision = function () {
  console.log('execute AD0020011button1.onDecision');
};
expj.AD0020011.AD0020011button1.executeOnLoad = function () {
  expj.AD0020011.AD0020011button1.executePScriptOnLoad();
};

expj.AD0020011.AD0020011button1.executePScriptOnLoad = function () {
  console.log('execute AD0020011button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0020011-AD0020011button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0020011-AD0020011button1-LineInsert">
expj.AD0020011.AD0020011button1.LineInsert = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0020011form1/*,_AD0020011view1/*,_AD0020011form2/*@AD0020011Servlet"
expj.AD0020011.AD0020011button1.LineInsert.onClick0 = function () {
  console.log('LineInsert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0020011', 'AD0020011button1', '_AD0020011form1/*,_AD0020011view1/*,_AD0020011form2/*', 'AD0020011Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0020011Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0020011', response);
expj.common.changeBusinessScreenTab('AD0020011', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0020011.AD0020011button1.LineInsert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0020011.AD0020011button1.LineInsert['onClick' + i])) {
        expj.AD0020011.AD0020011button1.LineInsert['onClick' + i]();
      }
    }
  }
};
expj.AD0020011.AD0020011button1.LineInsert.executeAllOnDecision = function () {
};
expj.AD0020011.AD0020011button1.LineInsert.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011button1-LineInsert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0020011', 'AD0020011button1', 'LineInsert', this, 'Button');
    }
  });
  expj.AD0020011.AD0020011button1.LineInsert.executePScriptOnLoad();
};

expj.AD0020011.AD0020011button1.LineInsert.executePScriptOnLoad = function () {
  console.log('execute AD0020011button1/LineInsert.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011button1-LineInsert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0020011-AD0020011button1-LineInsert" name="LineInsert" class="AD0020011-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsert",rb)%></button><!-- 行追加ボタン --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011button1-LineUpdate">
expj.AD0020011.AD0020011button1.LineUpdate = {};
// script1="onClick;0;CHK;_AD0020011view1/h_PROC_EXPLOSION_FLG[neq][and]_AD0020011view1/h_PROC_EXPLOSION_FLG[neq]0@#AD20127"
expj.AD0020011.AD0020011button1.LineUpdate.onClick0 = function () {
  console.log('LineUpdate script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020011button1', '_AD0020011view1/h_PROC_EXPLOSION_FLG'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020011button1', '_AD0020011view1/h_PROC_EXPLOSION_FLG'), '[neq]', '0')) {
expj.common.pscript.addErrorMessage('AD0020011', 'AD0020011button1', 'AD20127');
}
};
// script2="onClick;1;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0020011form1/*,_AD0020011view1/+,_AD0020011form2/*@AD0020011Servlet"
expj.AD0020011.AD0020011button1.LineUpdate.onClick1 = function () {
  console.log('LineUpdate script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0020011', 'AD0020011button1', '_AD0020011form1/*,_AD0020011view1/+,_AD0020011form2/*', 'AD0020011Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0020011Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0020011', response);
expj.common.changeBusinessScreenTab('AD0020011', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0020011.AD0020011button1.LineUpdate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0020011.AD0020011button1.LineUpdate['onClick' + i])) {
        expj.AD0020011.AD0020011button1.LineUpdate['onClick' + i]();
      }
    }
  }
};
expj.AD0020011.AD0020011button1.LineUpdate.executeAllOnDecision = function () {
};
expj.AD0020011.AD0020011button1.LineUpdate.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011button1-LineUpdate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0020011', 'AD0020011button1', 'LineUpdate', this, 'Button');
    }
  });
  expj.AD0020011.AD0020011button1.LineUpdate.executePScriptOnLoad();
};

expj.AD0020011.AD0020011button1.LineUpdate.executePScriptOnLoad = function () {
  console.log('execute AD0020011button1/LineUpdate.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011button1-LineUpdate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0020011-AD0020011button1-LineUpdate" name="LineUpdate" class="AD0020011-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011button1-LineCopy">
expj.AD0020011.AD0020011button1.LineCopy = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0020011form1/*,_AD0020011view1/+,_AD0020011form2/*@AD0020011Servlet"
expj.AD0020011.AD0020011button1.LineCopy.onClick0 = function () {
  console.log('LineCopy script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0020011', 'AD0020011button1', '_AD0020011form1/*,_AD0020011view1/+,_AD0020011form2/*', 'AD0020011Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0020011Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0020011', response);
expj.common.changeBusinessScreenTab('AD0020011', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0020011.AD0020011button1.LineCopy.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0020011.AD0020011button1.LineCopy['onClick' + i])) {
        expj.AD0020011.AD0020011button1.LineCopy['onClick' + i]();
      }
    }
  }
};
expj.AD0020011.AD0020011button1.LineCopy.executeAllOnDecision = function () {
};
expj.AD0020011.AD0020011button1.LineCopy.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011button1-LineCopy').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0020011', 'AD0020011button1', 'LineCopy', this, 'Button');
    }
  });
  expj.AD0020011.AD0020011button1.LineCopy.executePScriptOnLoad();
};

expj.AD0020011.AD0020011button1.LineCopy.executePScriptOnLoad = function () {
  console.log('execute AD0020011button1/LineCopy.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011button1-LineCopy');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0020011-AD0020011button1-LineCopy" name="LineCopy" class="AD0020011-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineCopy",rb)%></button><!-- 行複写ボタン --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011button1-LineDelete">
expj.AD0020011.AD0020011button1.LineDelete = {};
// script1="onClick;0;CHK;_AD0020011view1/h_PROC_EXPLOSION_FLG[neq][and]_AD0020011view1/h_PROC_EXPLOSION_FLG[neq]0@#AD20134"
expj.AD0020011.AD0020011button1.LineDelete.onClick0 = function () {
  console.log('LineDelete script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020011button1', '_AD0020011view1/h_PROC_EXPLOSION_FLG'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020011button1', '_AD0020011view1/h_PROC_EXPLOSION_FLG'), '[neq]', '0')) {
expj.common.pscript.addErrorMessage('AD0020011', 'AD0020011button1', 'AD20134');
}
};
// script2="onClick;1;CHK;_AD0020011form1/h_PARENT_OD_NO[eq]@$AD00084"
expj.AD0020011.AD0020011button1.LineDelete.onClick1 = function () {
  console.log('LineDelete script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020011button1', '_AD0020011form1/h_PARENT_OD_NO'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AD0020011', 'AD0020011button1', 'AD00084');
}
};
// script3="onClick;2;CHK;_AD0020011form1/h_PARENT_OD_NO[neq]@$AD00008"
expj.AD0020011.AD0020011button1.LineDelete.onClick2 = function () {
  console.log('LineDelete script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020011button1', '_AD0020011form1/h_PARENT_OD_NO'), '[neq]', '')) {
expj.common.pscript.addWarningMessage('AD0020011', 'AD0020011button1', 'AD00008');
}
};
// script4="onClick;3;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0020011form1/*,_AD0020011view1/+,_AD0020011form2/*@AD0020011Servlet,,$ZZ07004"
expj.AD0020011.AD0020011button1.LineDelete.onClick3 = function () {
  console.log('LineDelete script4');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0020011', 'AD0020011button1', '_AD0020011form1/*,_AD0020011view1/+,_AD0020011form2/*', 'AD0020011Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0020011Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0020011', response);
expj.common.updateBusinessScreenTab('AD0020011', contents);
};
expj.common.pscript.callConfirm('AD0020011', 'AD0020011button1', 'ZZ07004', okEvent);
};
expj.AD0020011.AD0020011button1.LineDelete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0020011.AD0020011button1.LineDelete['onClick' + i])) {
        expj.AD0020011.AD0020011button1.LineDelete['onClick' + i]();
      }
    }
  }
};
expj.AD0020011.AD0020011button1.LineDelete.executeAllOnDecision = function () {
};
expj.AD0020011.AD0020011button1.LineDelete.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011button1-LineDelete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0020011', 'AD0020011button1', 'LineDelete', this, 'Button');
    }
  });
  expj.AD0020011.AD0020011button1.LineDelete.executePScriptOnLoad();
};

expj.AD0020011.AD0020011button1.LineDelete.executePScriptOnLoad = function () {
  console.log('execute AD0020011button1/LineDelete.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011button1-LineDelete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0020011-AD0020011button1-LineDelete" name="LineDelete" class="AD0020011-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineDelete",rb)%></button><!-- 行削除ボタン --></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AD0020011-AD0020011form2">
expj.AD0020011.AD0020011form2 = {};
expj.AD0020011.AD0020011form2.executeAllOnDecision = function () {
  console.log('execute AD0020011form2.onDecision');
};
expj.AD0020011.AD0020011form2.executeOnLoad = function () {
  expj.AD0020011.AD0020011form2.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0020011-AD0020011form2" action="AD0020011Servlet" name="AD0020011form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:207px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:207px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-ITEM_CD">
expj.AD0020011.AD0020011form2.ITEM_CD = {};
expj.AD0020011.AD0020011form2.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/ITEM_CD.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.ITEM_CD.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'ITEM_CD', this);
  });
  expj.AD0020011.AD0020011form2.ITEM_CD.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-ITEM_CD" name="ITEM_CD" class="AD0020011-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-ITEM_NAME">
expj.AD0020011.AD0020011form2.ITEM_NAME = {};
expj.AD0020011.AD0020011form2.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/ITEM_NAME.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'ITEM_NAME', this);
  });
  expj.AD0020011.AD0020011form2.ITEM_NAME.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-ITEM_NAME" name="ITEM_NAME" class="AD0020011-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AD0020011-AD0020011form2-h_MANHOUR_TYP" name="h_MANHOUR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0020011Struct.geth_MANHOUR_TYP()) %>">
<script class="expj-script-AD0020011-AD0020011form2-h_MANHOUR_TYP">
expj.AD0020011.AD0020011form2.h_MANHOUR_TYP = {};
expj.AD0020011.AD0020011form2.h_MANHOUR_TYP.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/h_MANHOUR_TYP.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.h_MANHOUR_TYP.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-h_MANHOUR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'h_MANHOUR_TYP', this);
  });
  expj.AD0020011.AD0020011form2.h_MANHOUR_TYP.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.h_MANHOUR_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/h_MANHOUR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-h_MANHOUR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DRAW_CD",rb)%></span><!-- 図面番号 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-DRAW_CD">
expj.AD0020011.AD0020011form2.DRAW_CD = {};
expj.AD0020011.AD0020011form2.DRAW_CD.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/DRAW_CD.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.DRAW_CD.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-DRAW_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'DRAW_CD', this);
  });
  expj.AD0020011.AD0020011form2.DRAW_CD.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.DRAW_CD.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/DRAW_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-DRAW_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-DRAW_CD" name="DRAW_CD" class="AD0020011-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getDRAW_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_SPEC",rb)%></span><!-- 規格 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-SPEC">
expj.AD0020011.AD0020011form2.SPEC = {};
expj.AD0020011.AD0020011form2.SPEC.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/SPEC.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.SPEC.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-SPEC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'SPEC', this);
  });
  expj.AD0020011.AD0020011form2.SPEC.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.SPEC.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/SPEC.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-SPEC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-SPEC" name="SPEC" class="AD0020011-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getSPEC()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)%></span><!-- 品目手配区分 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-MRP_ODR_TYP_DN">
expj.AD0020011.AD0020011form2.MRP_ODR_TYP_DN = {};
expj.AD0020011.AD0020011form2.MRP_ODR_TYP_DN.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/MRP_ODR_TYP_DN.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.MRP_ODR_TYP_DN.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-MRP_ODR_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'MRP_ODR_TYP_DN', this);
  });
  expj.AD0020011.AD0020011form2.MRP_ODR_TYP_DN.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.MRP_ODR_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/MRP_ODR_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-MRP_ODR_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-MRP_ODR_TYP_DN" name="MRP_ODR_TYP_DN" class="AD0020011-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getMRP_ODR_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)%></span><!-- 内外作区分 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-OUTSIDE_TYP_DN">
expj.AD0020011.AD0020011form2.OUTSIDE_TYP_DN = {};
expj.AD0020011.AD0020011form2.OUTSIDE_TYP_DN.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/OUTSIDE_TYP_DN.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.OUTSIDE_TYP_DN.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-OUTSIDE_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'OUTSIDE_TYP_DN', this);
  });
  expj.AD0020011.AD0020011form2.OUTSIDE_TYP_DN.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.OUTSIDE_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/OUTSIDE_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-OUTSIDE_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-OUTSIDE_TYP_DN" name="OUTSIDE_TYP_DN" class="AD0020011-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getOUTSIDE_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_DLV_DATE",rb)%></span><!-- 製番納期 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-JOB_ODR_DLV_DATE">
expj.AD0020011.AD0020011form2.JOB_ODR_DLV_DATE = {};
expj.AD0020011.AD0020011form2.JOB_ODR_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/JOB_ODR_DLV_DATE.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.JOB_ODR_DLV_DATE.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-JOB_ODR_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'JOB_ODR_DLV_DATE', this);
  });
  expj.AD0020011.AD0020011form2.JOB_ODR_DLV_DATE.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.JOB_ODR_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/JOB_ODR_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-JOB_ODR_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-JOB_ODR_DLV_DATE" name="JOB_ODR_DLV_DATE" class="AD0020011-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getJOB_ODR_DLV_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-JOB_ODR_DLV_DATE_TIME">
expj.AD0020011.AD0020011form2.JOB_ODR_DLV_DATE_TIME = {};
expj.AD0020011.AD0020011form2.JOB_ODR_DLV_DATE_TIME.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/JOB_ODR_DLV_DATE_TIME.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.JOB_ODR_DLV_DATE_TIME.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-JOB_ODR_DLV_DATE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'JOB_ODR_DLV_DATE_TIME', this);
  });
  expj.AD0020011.AD0020011form2.JOB_ODR_DLV_DATE_TIME.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.JOB_ODR_DLV_DATE_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/JOB_ODR_DLV_DATE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-JOB_ODR_DLV_DATE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-JOB_ODR_DLV_DATE_TIME" name="JOB_ODR_DLV_DATE_TIME" class="AD0020011-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getJOB_ODR_DLV_DATE_TIME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DUE_DATE",rb)%></span><!-- 要求納期 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-DUE_DATE">
expj.AD0020011.AD0020011form2.DUE_DATE = {};
expj.AD0020011.AD0020011form2.DUE_DATE.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/DUE_DATE.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.DUE_DATE.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-DUE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'DUE_DATE', this);
  });
  expj.AD0020011.AD0020011form2.DUE_DATE.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.DUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/DUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-DUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-DUE_DATE" name="DUE_DATE" class="AD0020011-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getDUE_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-DUE_DATE_TIME">
expj.AD0020011.AD0020011form2.DUE_DATE_TIME = {};
expj.AD0020011.AD0020011form2.DUE_DATE_TIME.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/DUE_DATE_TIME.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.DUE_DATE_TIME.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-DUE_DATE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'DUE_DATE_TIME', this);
  });
  expj.AD0020011.AD0020011form2.DUE_DATE_TIME.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.DUE_DATE_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/DUE_DATE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-DUE_DATE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-DUE_DATE_TIME" name="DUE_DATE_TIME" class="AD0020011-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getDUE_DATE_TIME()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DM_QTY",rb)%></span><!-- デマンド数 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-DM_QTY">
expj.AD0020011.AD0020011form2.DM_QTY = {};
expj.AD0020011.AD0020011form2.DM_QTY.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/DM_QTY.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.DM_QTY.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-DM_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'DM_QTY', this);
  });
  expj.AD0020011.AD0020011form2.DM_QTY.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.DM_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/DM_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-DM_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-DM_QTY" name="DM_QTY" class="AD0020011-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAD0020011Struct.geth_UNIT_QTY_TYP(), Kind.N, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getDM_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-STOCK_UNIT">
expj.AD0020011.AD0020011form2.STOCK_UNIT = {};
expj.AD0020011.AD0020011form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/STOCK_UNIT.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'STOCK_UNIT', this);
  });
  expj.AD0020011.AD0020011form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-STOCK_UNIT" name="STOCK_UNIT" class="AD0020011-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ALCD_QTY",rb)%></span><!-- 引当済み数 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-ALCD_QTY">
expj.AD0020011.AD0020011form2.ALCD_QTY = {};
expj.AD0020011.AD0020011form2.ALCD_QTY.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/ALCD_QTY.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.ALCD_QTY.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-ALCD_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'ALCD_QTY', this);
  });
  expj.AD0020011.AD0020011form2.ALCD_QTY.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.ALCD_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/ALCD_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-ALCD_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-ALCD_QTY" name="ALCD_QTY" class="AD0020011-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAD0020011Struct.geth_UNIT_QTY_TYP(), Kind.N, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getALCD_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-d1_STOCK_UNIT">
expj.AD0020011.AD0020011form2.d1_STOCK_UNIT = {};
expj.AD0020011.AD0020011form2.d1_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/d1_STOCK_UNIT.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.d1_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-d1_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'd1_STOCK_UNIT', this);
  });
  expj.AD0020011.AD0020011form2.d1_STOCK_UNIT.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.d1_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/d1_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-d1_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-d1_STOCK_UNIT" name="d1_STOCK_UNIT" class="AD0020011-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PRD_DUE_DATE",rb)%></span><!-- 製造納期 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-PRD_DUE_DATE">
expj.AD0020011.AD0020011form2.PRD_DUE_DATE = {};
expj.AD0020011.AD0020011form2.PRD_DUE_DATE.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/PRD_DUE_DATE.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.PRD_DUE_DATE.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-PRD_DUE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'PRD_DUE_DATE', this);
  });
  expj.AD0020011.AD0020011form2.PRD_DUE_DATE.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.PRD_DUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/PRD_DUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-PRD_DUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-PRD_DUE_DATE" name="PRD_DUE_DATE" class="AD0020011-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getPRD_DUE_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-PRD_DUE_DATE_TIME">
expj.AD0020011.AD0020011form2.PRD_DUE_DATE_TIME = {};
expj.AD0020011.AD0020011form2.PRD_DUE_DATE_TIME.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/PRD_DUE_DATE_TIME.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.PRD_DUE_DATE_TIME.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-PRD_DUE_DATE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'PRD_DUE_DATE_TIME', this);
  });
  expj.AD0020011.AD0020011form2.PRD_DUE_DATE_TIME.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.PRD_DUE_DATE_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/PRD_DUE_DATE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-PRD_DUE_DATE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-PRD_DUE_DATE_TIME" name="PRD_DUE_DATE_TIME" class="AD0020011-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getPRD_DUE_DATE_TIME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PRD_START_DATE",rb)%></span><!-- 製造着手日 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-PRD_START_DATE">
expj.AD0020011.AD0020011form2.PRD_START_DATE = {};
expj.AD0020011.AD0020011form2.PRD_START_DATE.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/PRD_START_DATE.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.PRD_START_DATE.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-PRD_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'PRD_START_DATE', this);
  });
  expj.AD0020011.AD0020011form2.PRD_START_DATE.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.PRD_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/PRD_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-PRD_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-PRD_START_DATE" name="PRD_START_DATE" class="AD0020011-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getPRD_START_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-PRD_START_DATE_TIME">
expj.AD0020011.AD0020011form2.PRD_START_DATE_TIME = {};
expj.AD0020011.AD0020011form2.PRD_START_DATE_TIME.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/PRD_START_DATE_TIME.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.PRD_START_DATE_TIME.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-PRD_START_DATE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'PRD_START_DATE_TIME', this);
  });
  expj.AD0020011.AD0020011form2.PRD_START_DATE_TIME.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.PRD_START_DATE_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/PRD_START_DATE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-PRD_START_DATE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-PRD_START_DATE_TIME" name="PRD_START_DATE_TIME" class="AD0020011-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getPRD_START_DATE_TIME()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_START_DATE",rb)%></span><!-- 手配着手日 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-ODR_START_DATE">
expj.AD0020011.AD0020011form2.ODR_START_DATE = {};
expj.AD0020011.AD0020011form2.ODR_START_DATE.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/ODR_START_DATE.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.ODR_START_DATE.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-ODR_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'ODR_START_DATE', this);
  });
  expj.AD0020011.AD0020011form2.ODR_START_DATE.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.ODR_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/ODR_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-ODR_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-ODR_START_DATE" name="ODR_START_DATE" class="AD0020011-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getODR_START_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-ODR_START_DATE_TIME">
expj.AD0020011.AD0020011form2.ODR_START_DATE_TIME = {};
expj.AD0020011.AD0020011form2.ODR_START_DATE_TIME.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/ODR_START_DATE_TIME.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.ODR_START_DATE_TIME.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-ODR_START_DATE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'ODR_START_DATE_TIME', this);
  });
  expj.AD0020011.AD0020011form2.ODR_START_DATE_TIME.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.ODR_START_DATE_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/ODR_START_DATE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-ODR_START_DATE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-ODR_START_DATE_TIME" name="ODR_START_DATE_TIME" class="AD0020011-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getODR_START_DATE_TIME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_QTY",rb)%></span><!-- オーダ数 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-ODR_QTY">
expj.AD0020011.AD0020011form2.ODR_QTY = {};
expj.AD0020011.AD0020011form2.ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/ODR_QTY.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.ODR_QTY.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'ODR_QTY', this);
  });
  expj.AD0020011.AD0020011form2.ODR_QTY.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-ODR_QTY" name="ODR_QTY" class="AD0020011-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAD0020011Struct.geth_UNIT_QTY_TYP(), Kind.N, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getODR_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-d2_STOCK_UNIT">
expj.AD0020011.AD0020011form2.d2_STOCK_UNIT = {};
expj.AD0020011.AD0020011form2.d2_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/d2_STOCK_UNIT.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.d2_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-d2_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'd2_STOCK_UNIT', this);
  });
  expj.AD0020011.AD0020011form2.d2_STOCK_UNIT.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.d2_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/d2_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-d2_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-d2_STOCK_UNIT" name="d2_STOCK_UNIT" class="AD0020011-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OPR_INST_QTY_1",rb)%></span><!-- 作業計画数 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-OPR_INST_QTY">
expj.AD0020011.AD0020011form2.OPR_INST_QTY = {};
expj.AD0020011.AD0020011form2.OPR_INST_QTY.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/OPR_INST_QTY.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.OPR_INST_QTY.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-OPR_INST_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'OPR_INST_QTY', this);
  });
  expj.AD0020011.AD0020011form2.OPR_INST_QTY.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.OPR_INST_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/OPR_INST_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-OPR_INST_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-OPR_INST_QTY" name="OPR_INST_QTY" class="AD0020011-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAD0020011Struct.geth_UNIT_QTY_TYP(), Kind.N, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getOPR_INST_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-d3_STOCK_UNIT">
expj.AD0020011.AD0020011form2.d3_STOCK_UNIT = {};
expj.AD0020011.AD0020011form2.d3_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/d3_STOCK_UNIT.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.d3_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-d3_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'd3_STOCK_UNIT', this);
  });
  expj.AD0020011.AD0020011form2.d3_STOCK_UNIT.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.d3_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/d3_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-d3_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-d3_STOCK_UNIT" name="d3_STOCK_UNIT" class="AD0020011-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_QTY_2",rb)%></span><!-- 発注計画数 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-PUCH_ODR_QTY">
expj.AD0020011.AD0020011form2.PUCH_ODR_QTY = {};
expj.AD0020011.AD0020011form2.PUCH_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/PUCH_ODR_QTY.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.PUCH_ODR_QTY.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-PUCH_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'PUCH_ODR_QTY', this);
  });
  expj.AD0020011.AD0020011form2.PUCH_ODR_QTY.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.PUCH_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/PUCH_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-PUCH_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-PUCH_ODR_QTY" name="PUCH_ODR_QTY" class="AD0020011-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAD0020011Struct.geth_UNIT_QTY_TYP(), Kind.N, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getPUCH_ODR_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0020011-AD0020011form2-d4_STOCK_UNIT">
expj.AD0020011.AD0020011form2.d4_STOCK_UNIT = {};
expj.AD0020011.AD0020011form2.d4_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/d4_STOCK_UNIT.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.d4_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-d4_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'd4_STOCK_UNIT', this);
  });
  expj.AD0020011.AD0020011form2.d4_STOCK_UNIT.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.d4_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/d4_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-d4_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020011form2-d4_STOCK_UNIT" name="d4_STOCK_UNIT" class="AD0020011-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AD0020011-AD0020011form2-h_UNIT_QTY_TYP" name="h_UNIT_QTY_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0020011Struct.geth_UNIT_QTY_TYP()) %>">
<script class="expj-script-AD0020011-AD0020011form2-h_UNIT_QTY_TYP">
expj.AD0020011.AD0020011form2.h_UNIT_QTY_TYP = {};
expj.AD0020011.AD0020011form2.h_UNIT_QTY_TYP.executeAllOnDecision = function () {
  console.log('execute AD0020011form2/h_UNIT_QTY_TYP.onDecision');
  expj.AD0020011.AD0020011form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020011form2.h_UNIT_QTY_TYP.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011form2-h_UNIT_QTY_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020011form2', 'h_UNIT_QTY_TYP', this);
  });
  expj.AD0020011.AD0020011form2.h_UNIT_QTY_TYP.executePScriptOnLoad();
};

expj.AD0020011.AD0020011form2.h_UNIT_QTY_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0020011form2/h_UNIT_QTY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011form2-h_UNIT_QTY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 95px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AD0020011 Revision: 1.5  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AD0020011-AD0020011button0">
expj.AD0020011.AD0020011button0 = {};
expj.AD0020011.AD0020011button0.executeAllOnDecision = function () {
  console.log('execute AD0020011button0.onDecision');
};
expj.AD0020011.AD0020011button0.executeOnLoad = function () {
  expj.AD0020011.AD0020011button0.executePScriptOnLoad();
};

expj.AD0020011.AD0020011button0.executePScriptOnLoad = function () {
  console.log('execute AD0020011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0020011-AD0020011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0020011-AD0020011button0-Close">
expj.AD0020011.AD0020011button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AD0020011.AD0020011button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AD0020011');
};
expj.AD0020011.AD0020011button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0020011.AD0020011button0.Close['onClick' + i])) {
        expj.AD0020011.AD0020011button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AD0020011.AD0020011button0.Close.executeAllOnDecision = function () {
};
expj.AD0020011.AD0020011button0.Close.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020011button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0020011', 'AD0020011button0', 'Close', this, 'Button');
    }
  });
  expj.AD0020011.AD0020011button0.Close.executePScriptOnLoad();
};

expj.AD0020011.AD0020011button0.Close.executePScriptOnLoad = function () {
  console.log('execute AD0020011button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020011button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0020011-AD0020011button0-Close" name="Close" class="AD0020011-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AD0020011 (END)-->
<%
MessageStruct msgStruct = aAD0020011Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AD0020011-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AD0020011)) {
  expj.common.treeInstanceMap.AD0020011 = {};
}
expj.common.treeInstanceMap.AD0020011.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0020011.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AD0020011.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0020011.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AD0020011.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AD0020011.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AD0020011.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AD0020011.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AD0020011.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AD0020011-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AD0020011-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0020011)) {
  expj.common.detailDialogMap.AD0020011 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0020011._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AD0020011._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0020011.<%=detailId %>)) {
  expj.common.detailDialogMap.AD0020011.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0020011.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AD0020011.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0020011.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AD0020011.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AD0020011.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AD0020011.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AD0020011-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AD0020011.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AD0020011-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AD0020011.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AD0020011-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AD0020011.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AD0020011.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AD0020011.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AD0020011._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AD0020011-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AD0020011)) {
  expj.common.viewInstanceMap.AD0020011 = {};
}
expj.common.viewInstanceMap.AD0020011.<%=viewId %> = {};
expj.common.viewInstanceMap.AD0020011.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AD0020011.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AD0020011.<%=viewId %>.init = function () {
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
    expj.AD0020011.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AD0020011.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AD0020011-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AD0020011-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AD0020011_init">
/**
 * AD0020011用のロード完了時初期化関数
 */
expj.AD0020011.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AD0020011');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AD0020011');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AD0020011');
  expj.common.calendarInstanceMap.AD0020011 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AD0020011.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AD0020011.<%=detailId %>.init();
  expj.common.detailDialogMap.AD0020011.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AD0020011.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AD0020011.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AD0020011');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AD0020011');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AD0020011-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AD0020011-<%=detailId %>');
<%
 }
%>
  try{expj.AD0020011.AD0020011form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form1.JOB_ODR_CANCEL_NO.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form1.h_PARENT_OD_NO.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011button1.LineInsert.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011button1.LineUpdate.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011button1.LineCopy.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011button1.LineDelete.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.h_MANHOUR_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.DRAW_CD.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.SPEC.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.MRP_ODR_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.OUTSIDE_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.JOB_ODR_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.JOB_ODR_DLV_DATE_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.DUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.DUE_DATE_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.DM_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.ALCD_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.d1_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.PRD_DUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.PRD_DUE_DATE_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.PRD_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.PRD_START_DATE_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.ODR_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.ODR_START_DATE_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.d2_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.OPR_INST_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.d3_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.PUCH_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.d4_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.h_UNIT_QTY_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011button0.Close.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form1.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011view1.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011button1.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011form2.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020011button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AD0020011.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AD0020011', 'AD0020011');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AD0020011');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AD0020011-focus-move');
  // 初期フォーカス当てる処理
  $('.AD0020011-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AD0020011', '<%=request.getContextPath() %>');
};

/**
 * AD0020011の全体onDecision処理
 */
expj.AD0020011.executeAllOnDecision = function () {
  expj.AD0020011.AD0020011form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AD0020011_console">
expj.AD0020011.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>