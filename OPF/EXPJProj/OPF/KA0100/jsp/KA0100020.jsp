<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:57:38 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KA0100\KA0100020.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KA0100.*" %>
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
<jsp:useBean id="aKA0100020Control" class="com.nec.jp.orteus.metamorBase.KA0100.KA0100020Control" scope="request"/>
<jsp:useBean id="aKA0100020Struct" class="com.nec.jp.orteus.metamorBase.KA0100.KA0100020Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

得意先納品場所メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KA0100/jsp/KA0100020.jsp,v $
$Author: geng-jia $	
$Revision: 1.14 $ $Date: 2017/02/22 02:06:58 $
********************************************************* --%>
<html>
<head>
<title>得意先納品場所メンテナンス</title>
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
<script class="expj-script-KA0100020_init">
  // KA0100020名前空間
  expj.KA0100020 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-KA0100020" data-screen="KA0100020" data-newdata="<%=aKA0100020Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
<!--one start -->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style="width:968px;"></div><!--/td-->

    </div><!--/tr-->

<!--one end -->

<!--two start -->
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
              <script class="expj-script-KA0100020-KA0100020form1">
expj.KA0100020.KA0100020form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5"
expj.KA0100020.KA0100020form1.onLoad0 = function () {
  console.log('KA0100020form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
};
// script2="onDecision;0;CHKRQ;A,B@*1,*0"
expj.KA0100020.KA0100020form1.onDecision0 = function () {
  console.log('KA0100020form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('KA0100020', 'A') && expj.common.pscript.satisfiedRequiredComponent('KA0100020', 'B')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="onDecision;1;CHK;?KA0100020form1/CUST_CD[eq]SAME[and]?KA0100020form1/DLV_LOC_CD[eq]SAME[and]?KA0100020form1/*[eq]NORMAL@*6,*3"
expj.KA0100020.KA0100020form1.onDecision1 = function () {
  console.log('KA0100020form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0100020', 'KA0100020form1', '?KA0100020form1/CUST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0100020', 'KA0100020form1', '?KA0100020form1/DLV_LOC_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0100020', 'KA0100020form1', '?KA0100020form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="onDecision;2;CHK;?KA0100020form1/CUST_CD[eq]SAME[and]?KA0100020form1/DLV_LOC_CD[eq]SAME[and]?KA0100020form1/*[eq]NORMAL@*7,*5"
expj.KA0100020.KA0100020form1.onDecision2 = function () {
  console.log('KA0100020form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0100020', 'KA0100020form1', '?KA0100020form1/CUST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0100020', 'KA0100020form1', '?KA0100020form1/DLV_LOC_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0100020', 'KA0100020form1', '?KA0100020form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script5="onDecision;3;CHK;?KA0100020form1/CUST_CD[eq]SAME[and]?KA0100020form1/DLV_LOC_CD[eq]SAME@*8,*9"
expj.KA0100020.KA0100020form1.onDecision3 = function () {
  console.log('KA0100020form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0100020', 'KA0100020form1', '?KA0100020form1/CUST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0100020', 'KA0100020form1', '?KA0100020form1/DLV_LOC_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script6="child;0;MASK;_KA0100020button1/select"
expj.KA0100020.KA0100020form1.child0 = function () {
  console.log('KA0100020form1 script6');
expj.common.pscript.setMaskToReferenceComponent('KA0100020', 'KA0100020form1', '_KA0100020button1/select');
};
// script7="child;1;UNMASK;_KA0100020button1/select"
expj.KA0100020.KA0100020form1.child1 = function () {
  console.log('KA0100020form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('KA0100020', 'KA0100020form1', '_KA0100020button1/select');
};
// script8="child;2;UNMASK;_KA0100020button2/update"
expj.KA0100020.KA0100020form1.child2 = function () {
  console.log('KA0100020form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('KA0100020', 'KA0100020form1', '_KA0100020button2/update');
};
// script9="child;3;MASK;_KA0100020button2/update"
expj.KA0100020.KA0100020form1.child3 = function () {
  console.log('KA0100020form1 script9');
expj.common.pscript.setMaskToReferenceComponent('KA0100020', 'KA0100020form1', '_KA0100020button2/update');
};
// script10="child;4;UNMASK;_KA0100020button2/delete"
expj.KA0100020.KA0100020form1.child4 = function () {
  console.log('KA0100020form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('KA0100020', 'KA0100020form1', '_KA0100020button2/delete');
};
// script11="child;5;MASK;_KA0100020button2/delete"
expj.KA0100020.KA0100020form1.child5 = function () {
  console.log('KA0100020form1 script11');
expj.common.pscript.setMaskToReferenceComponent('KA0100020', 'KA0100020form1', '_KA0100020button2/delete');
};
// script12="child;6;CHKRQ;A,B,C,D@*2,*3"
expj.KA0100020.KA0100020form1.child6 = function () {
  console.log('KA0100020form1 script12');
if (expj.common.pscript.satisfiedRequiredComponent('KA0100020', 'A') && expj.common.pscript.satisfiedRequiredComponent('KA0100020', 'B') && expj.common.pscript.satisfiedRequiredComponent('KA0100020', 'C') && expj.common.pscript.satisfiedRequiredComponent('KA0100020', 'D')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script13="child;7;CHKRQ;A,B@*4,*5"
expj.KA0100020.KA0100020form1.child7 = function () {
  console.log('KA0100020form1 script13');
if (expj.common.pscript.satisfiedRequiredComponent('KA0100020', 'A') && expj.common.pscript.satisfiedRequiredComponent('KA0100020', 'B')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script14="child;8;CHK;?KA0100020form1/*[eq]NORMAL@*11,*9"
expj.KA0100020.KA0100020form1.child8 = function () {
  console.log('KA0100020form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0100020', 'KA0100020form1', '?KA0100020form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script15="child;9;CHKRQ;A,B,C,D@*10,*11"
expj.KA0100020.KA0100020form1.child9 = function () {
  console.log('KA0100020form1 script15');
if (expj.common.pscript.satisfiedRequiredComponent('KA0100020', 'A') && expj.common.pscript.satisfiedRequiredComponent('KA0100020', 'B') && expj.common.pscript.satisfiedRequiredComponent('KA0100020', 'C') && expj.common.pscript.satisfiedRequiredComponent('KA0100020', 'D')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script16="child;10;UNMASK;_KA0100020button2/insert"
expj.KA0100020.KA0100020form1.child10 = function () {
  console.log('KA0100020form1 script16');
expj.common.pscript.setUnMaskToReferenceComponent('KA0100020', 'KA0100020form1', '_KA0100020button2/insert');
};
// script17="child;11;MASK;_KA0100020button2/insert"
expj.KA0100020.KA0100020form1.child11 = function () {
  console.log('KA0100020form1 script17');
expj.common.pscript.setMaskToReferenceComponent('KA0100020', 'KA0100020form1', '_KA0100020button2/insert');
};
// script18="onDecision;4;CHK;_KA0100020form1/h_SCREENMOVE_TYP[eq]0[or]_KA0100020form1/h_SCREENMOVE_TYP[eq]1@*12"
expj.KA0100020.KA0100020form1.onDecision4 = function () {
  console.log('KA0100020form1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0100020', 'KA0100020form1', '_KA0100020form1/h_SCREENMOVE_TYP'), '[eq]', '0') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0100020', 'KA0100020form1', '_KA0100020form1/h_SCREENMOVE_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script19="child;12;MASK;_KA0100020button1/select,_KA0100020button2/insert,_KA0100020button2/update,_KA0100020button2/delete,_KA0100010button2/delete,_KA0100020button0/clear"
expj.KA0100020.KA0100020form1.child12 = function () {
  console.log('KA0100020form1 script19');
expj.common.pscript.setMaskToReferenceComponent('KA0100020', 'KA0100020form1', '_KA0100020button1/select');
expj.common.pscript.setMaskToReferenceComponent('KA0100020', 'KA0100020form1', '_KA0100020button2/insert');
expj.common.pscript.setMaskToReferenceComponent('KA0100020', 'KA0100020form1', '_KA0100020button2/update');
expj.common.pscript.setMaskToReferenceComponent('KA0100020', 'KA0100020form1', '_KA0100020button2/delete');
expj.common.pscript.setMaskToReferenceComponent('KA0100020', 'KA0100020form1', '_KA0100010button2/delete');
expj.common.pscript.setMaskToReferenceComponent('KA0100020', 'KA0100020form1', '_KA0100020button0/clear');
};
// script20="onDecision;5;CHK;_KA0100020form1/h_APR_CUST_DLV_LOC[eq]1@*13,*14"
expj.KA0100020.KA0100020form1.onDecision5 = function () {
  console.log('KA0100020form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0100020', 'KA0100020form1', '_KA0100020form1/h_APR_CUST_DLV_LOC'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script21="child;13;UNMASK;_KA0100020form2/APPR_REMARKS"
expj.KA0100020.KA0100020form1.child13 = function () {
  console.log('KA0100020form1 script21');
expj.common.pscript.setUnMaskToReferenceComponent('KA0100020', 'KA0100020form1', '_KA0100020form2/APPR_REMARKS');
};
// script22="child;14;MASK;_KA0100020form2/APPR_REMARKS"
expj.KA0100020.KA0100020form1.child14 = function () {
  console.log('KA0100020form1 script22');
expj.common.pscript.setMaskToReferenceComponent('KA0100020', 'KA0100020form1', '_KA0100020form2/APPR_REMARKS');
};
expj.KA0100020.KA0100020form1.executeAllOnDecision = function () {
  console.log('execute KA0100020form1.onDecision');
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0100020.KA0100020form1['onDecision' + i])) {
        expj.KA0100020.KA0100020form1['onDecision' + i]();
      }
    }
  }
};
expj.KA0100020.KA0100020form1.executeOnLoad = function () {
  expj.KA0100020.KA0100020form1.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form1.executePScriptOnLoad = function () {
  console.log('execute KA0100020form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KA0100020.KA0100020form1['onLoad' + i])) {
      expj.KA0100020.KA0100020form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KA0100020-KA0100020form1" action="KA0100020Servlet" name="KA0100020form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKA0100020Control.getReadStatusString()) %>" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020form1-CUST_CD">
expj.KA0100020.KA0100020form1.CUST_CD = {};
expj.KA0100020.KA0100020form1.CUST_CD.executeAllOnDecision = function () {
  console.log('execute KA0100020form1/CUST_CD.onDecision');
  expj.KA0100020.KA0100020form1.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form1.CUST_CD.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form1-CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form1', 'CUST_CD', this);
  });
  expj.KA0100020.KA0100020form1.CUST_CD.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form1.CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KA0100020form1/CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form1-CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0100020-KA0100020form1-CUST_CD" name="CUST_CD" class="KA0100020-focus-move  required-value expj-KA0100020-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100020Struct.getCUST_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-KA0100020-KA0100020form1-h_CUST_CD" name="h_CUST_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0100020Struct.geth_CUST_CD()) %>">
<script class="expj-script-KA0100020-KA0100020form1-h_CUST_CD">
expj.KA0100020.KA0100020form1.h_CUST_CD = {};
expj.KA0100020.KA0100020form1.h_CUST_CD.executeAllOnDecision = function () {
  console.log('execute KA0100020form1/h_CUST_CD.onDecision');
  expj.KA0100020.KA0100020form1.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form1.h_CUST_CD.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form1-h_CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form1', 'h_CUST_CD', this);
  });
  expj.KA0100020.KA0100020form1.h_CUST_CD.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form1.h_CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KA0100020form1/h_CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form1-h_CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-KA0100020-KA0100020form1-PeekerICustCd">
expj.KA0100020.KA0100020form1.PeekerICustCd = {};
// script1="onClick;0;PEEKER;_KA0100020form1/CUST_CD@<%=contextNo%>"
expj.KA0100020.KA0100020form1.PeekerICustCd.onClick0 = function () {
  console.log('PeekerICustCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KA0100020';
var parameterValues = 'PeekerICustCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KA0100020', 'KA0100020form1', '_KA0100020form1/CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUST_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KA0100020form1/CUST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KA0100020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KA0100020.KA0100020form1.PeekerICustCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0100020.KA0100020form1.PeekerICustCd['onClick' + i])) {
        expj.KA0100020.KA0100020form1.PeekerICustCd['onClick' + i]();
      }
    }
  }
};
expj.KA0100020.KA0100020form1.PeekerICustCd.executeAllOnDecision = function () {
};
expj.KA0100020.KA0100020form1.PeekerICustCd.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form1-PeekerICustCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0100020', 'KA0100020form1', 'PeekerICustCd', this, 'Button');
    }
  });
  expj.KA0100020.KA0100020form1.PeekerICustCd.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form1.PeekerICustCd.executePScriptOnLoad = function () {
  console.log('execute KA0100020form1/PeekerICustCd.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form1-PeekerICustCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KA0100020-KA0100020form1-PeekerICustCd" class="KA0100020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020form1-CUST_NAME">
expj.KA0100020.KA0100020form1.CUST_NAME = {};
expj.KA0100020.KA0100020form1.CUST_NAME.executeAllOnDecision = function () {
  console.log('execute KA0100020form1/CUST_NAME.onDecision');
  expj.KA0100020.KA0100020form1.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form1.CUST_NAME.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form1-CUST_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form1', 'CUST_NAME', this);
  });
  expj.KA0100020.KA0100020form1.CUST_NAME.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form1.CUST_NAME.executePScriptOnLoad = function () {
  console.log('execute KA0100020form1/CUST_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form1-CUST_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KA0100020-KA0100020form1-CUST_NAME" name="CUST_NAME" class="KA0100020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100020Struct.getCUST_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.DLV_LOC_CD",rb)%></span><!-- 納品場所コード --></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020form1-DLV_LOC_CD">
expj.KA0100020.KA0100020form1.DLV_LOC_CD = {};
expj.KA0100020.KA0100020form1.DLV_LOC_CD.executeAllOnDecision = function () {
  console.log('execute KA0100020form1/DLV_LOC_CD.onDecision');
  expj.KA0100020.KA0100020form1.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form1.DLV_LOC_CD.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form1-DLV_LOC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form1', 'DLV_LOC_CD', this);
  });
  expj.KA0100020.KA0100020form1.DLV_LOC_CD.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form1.DLV_LOC_CD.executePScriptOnLoad = function () {
  console.log('execute KA0100020form1/DLV_LOC_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form1-DLV_LOC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0100020-KA0100020form1-DLV_LOC_CD" name="DLV_LOC_CD" class="KA0100020-focus-move  required-value expj-KA0100020-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100020Struct.getDLV_LOC_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-KA0100020-KA0100020form1-h_DLV_LOC_CD" name="h_DLV_LOC_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0100020Struct.geth_DLV_LOC_CD()) %>">
<script class="expj-script-KA0100020-KA0100020form1-h_DLV_LOC_CD">
expj.KA0100020.KA0100020form1.h_DLV_LOC_CD = {};
expj.KA0100020.KA0100020form1.h_DLV_LOC_CD.executeAllOnDecision = function () {
  console.log('execute KA0100020form1/h_DLV_LOC_CD.onDecision');
  expj.KA0100020.KA0100020form1.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form1.h_DLV_LOC_CD.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form1-h_DLV_LOC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form1', 'h_DLV_LOC_CD', this);
  });
  expj.KA0100020.KA0100020form1.h_DLV_LOC_CD.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form1.h_DLV_LOC_CD.executePScriptOnLoad = function () {
  console.log('execute KA0100020form1/h_DLV_LOC_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form1-h_DLV_LOC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-KA0100020-KA0100020form1-PeekerIDlvLocCd">
expj.KA0100020.KA0100020form1.PeekerIDlvLocCd = {};
// script1="onClick;0;PEEKER;_KA0100020form1/DLV_LOC_CD@<%=contextNo%>"
expj.KA0100020.KA0100020form1.PeekerIDlvLocCd.onClick0 = function () {
  console.log('PeekerIDlvLocCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KA0100020';
var parameterValues = 'PeekerIDlvLocCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KA0100020', 'KA0100020form1', '_KA0100020form1/CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_3%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KA0100020', 'KA0100020form1', '_KA0100020form1/DLV_LOC_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%DLV_LOC_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KA0100020form1/DLV_LOC_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KA0100020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KA0100020.KA0100020form1.PeekerIDlvLocCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0100020.KA0100020form1.PeekerIDlvLocCd['onClick' + i])) {
        expj.KA0100020.KA0100020form1.PeekerIDlvLocCd['onClick' + i]();
      }
    }
  }
};
expj.KA0100020.KA0100020form1.PeekerIDlvLocCd.executeAllOnDecision = function () {
};
expj.KA0100020.KA0100020form1.PeekerIDlvLocCd.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form1-PeekerIDlvLocCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0100020', 'KA0100020form1', 'PeekerIDlvLocCd', this, 'Button');
    }
  });
  expj.KA0100020.KA0100020form1.PeekerIDlvLocCd.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form1.PeekerIDlvLocCd.executePScriptOnLoad = function () {
  console.log('execute KA0100020form1/PeekerIDlvLocCd.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form1-PeekerIDlvLocCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KA0100020-KA0100020form1-PeekerIDlvLocCd" class="KA0100020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<input type="hidden" id="expj-KA0100020-KA0100020form1-h_APR_CUST_DLV_LOC" name="h_APR_CUST_DLV_LOC" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0100020Struct.geth_APR_CUST_DLV_LOC()) %>">
<script class="expj-script-KA0100020-KA0100020form1-h_APR_CUST_DLV_LOC">
expj.KA0100020.KA0100020form1.h_APR_CUST_DLV_LOC = {};
expj.KA0100020.KA0100020form1.h_APR_CUST_DLV_LOC.executeAllOnDecision = function () {
  console.log('execute KA0100020form1/h_APR_CUST_DLV_LOC.onDecision');
  expj.KA0100020.KA0100020form1.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form1.h_APR_CUST_DLV_LOC.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form1-h_APR_CUST_DLV_LOC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form1', 'h_APR_CUST_DLV_LOC', this);
  });
  expj.KA0100020.KA0100020form1.h_APR_CUST_DLV_LOC.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form1.h_APR_CUST_DLV_LOC.executePScriptOnLoad = function () {
  console.log('execute KA0100020form1/h_APR_CUST_DLV_LOC.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form1-h_APR_CUST_DLV_LOC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KA0100020-KA0100020form1-h_SCREENMOVE_TYP" name="h_SCREENMOVE_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0100020Struct.geth_SCREENMOVE_TYP()) %>">
<script class="expj-script-KA0100020-KA0100020form1-h_SCREENMOVE_TYP">
expj.KA0100020.KA0100020form1.h_SCREENMOVE_TYP = {};
expj.KA0100020.KA0100020form1.h_SCREENMOVE_TYP.executeAllOnDecision = function () {
  console.log('execute KA0100020form1/h_SCREENMOVE_TYP.onDecision');
  expj.KA0100020.KA0100020form1.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form1.h_SCREENMOVE_TYP.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form1-h_SCREENMOVE_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form1', 'h_SCREENMOVE_TYP', this);
  });
  expj.KA0100020.KA0100020form1.h_SCREENMOVE_TYP.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form1.h_SCREENMOVE_TYP.executePScriptOnLoad = function () {
  console.log('execute KA0100020form1/h_SCREENMOVE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form1-h_SCREENMOVE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KA0100020-KA0100020form1-h_APPR_ID" name="h_APPR_ID" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0100020Struct.geth_APPR_ID()) %>">
<script class="expj-script-KA0100020-KA0100020form1-h_APPR_ID">
expj.KA0100020.KA0100020form1.h_APPR_ID = {};
expj.KA0100020.KA0100020form1.h_APPR_ID.executeAllOnDecision = function () {
  console.log('execute KA0100020form1/h_APPR_ID.onDecision');
  expj.KA0100020.KA0100020form1.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form1.h_APPR_ID.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form1-h_APPR_ID').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form1', 'h_APPR_ID', this);
  });
  expj.KA0100020.KA0100020form1.h_APPR_ID.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form1.h_APPR_ID.executePScriptOnLoad = function () {
  console.log('execute KA0100020form1/h_APPR_ID.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form1-h_APPR_ID');
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
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KA0100020-KA0100020button1">
expj.KA0100020.KA0100020button1 = {};
expj.KA0100020.KA0100020button1.executeAllOnDecision = function () {
  console.log('execute KA0100020button1.onDecision');
};
expj.KA0100020.KA0100020button1.executeOnLoad = function () {
  expj.KA0100020.KA0100020button1.executePScriptOnLoad();
};

expj.KA0100020.KA0100020button1.executePScriptOnLoad = function () {
  console.log('execute KA0100020button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KA0100020-KA0100020button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KA0100020-KA0100020button1-select">
expj.KA0100020.KA0100020button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KA0100020form1/*@KA0100020Servlet"
expj.KA0100020.KA0100020button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0100020', 'KA0100020button1', '_KA0100020form1/*', 'KA0100020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0100020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0100020', response);
expj.common.updateBusinessScreenTab('KA0100020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KA0100020.KA0100020button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0100020.KA0100020button1.select['onClick' + i])) {
        expj.KA0100020.KA0100020button1.select['onClick' + i]();
      }
    }
  }
};
expj.KA0100020.KA0100020button1.select.executeAllOnDecision = function () {
};
expj.KA0100020.KA0100020button1.select.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0100020', 'KA0100020button1', 'select', this, 'Button');
    }
  });
  expj.KA0100020.KA0100020button1.select.executePScriptOnLoad();
};

expj.KA0100020.KA0100020button1.select.executePScriptOnLoad = function () {
  console.log('execute KA0100020button1/select.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0100020-KA0100020button1-select" name="select" class="KA0100020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<!--two end --><!--three start --><div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<!--three end --><!--four start --><div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KA0100020-KA0100020form2">
expj.KA0100020.KA0100020form2 = {};
expj.KA0100020.KA0100020form2.executeAllOnDecision = function () {
  console.log('execute KA0100020form2.onDecision');
};
expj.KA0100020.KA0100020form2.executeOnLoad = function () {
  expj.KA0100020.KA0100020form2.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KA0100020-KA0100020form2" action="KA0100020Servlet" name="KA0100020form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DLV_LOC_NAME",rb)%></span><!-- 納品場所名 --></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020form2-DLV_LOC_NAME">
expj.KA0100020.KA0100020form2.DLV_LOC_NAME = {};
expj.KA0100020.KA0100020form2.DLV_LOC_NAME.executeAllOnDecision = function () {
  console.log('execute KA0100020form2/DLV_LOC_NAME.onDecision');
  expj.KA0100020.KA0100020form2.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form2.DLV_LOC_NAME.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form2-DLV_LOC_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form2', 'DLV_LOC_NAME', this);
  });
  expj.KA0100020.KA0100020form2.DLV_LOC_NAME.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.DLV_LOC_NAME.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2/DLV_LOC_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form2-DLV_LOC_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KA0100020-KA0100020form2-DLV_LOC_NAME" name="DLV_LOC_NAME" class="KA0100020-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100020Struct.getDLV_LOC_NAME()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DLV_LOC_KNAME",rb)%></span><!-- 納品場所名（カナ） --></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020form2-DLV_LOC_KNAME">
expj.KA0100020.KA0100020form2.DLV_LOC_KNAME = {};
expj.KA0100020.KA0100020form2.DLV_LOC_KNAME.executeAllOnDecision = function () {
  console.log('execute KA0100020form2/DLV_LOC_KNAME.onDecision');
  expj.KA0100020.KA0100020form2.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form2.DLV_LOC_KNAME.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form2-DLV_LOC_KNAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form2', 'DLV_LOC_KNAME', this);
  });
  expj.KA0100020.KA0100020form2.DLV_LOC_KNAME.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.DLV_LOC_KNAME.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2/DLV_LOC_KNAME.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form2-DLV_LOC_KNAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-KA0100020-KA0100020form2-DLV_LOC_KNAME" name="DLV_LOC_KNAME" class="KA0100020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100020Struct.getDLV_LOC_KNAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DLV_LOC_ENAME",rb)%></span><!-- 納品場所名（英名） --></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020form2-DLV_LOC_ENAME">
expj.KA0100020.KA0100020form2.DLV_LOC_ENAME = {};
expj.KA0100020.KA0100020form2.DLV_LOC_ENAME.executeAllOnDecision = function () {
  console.log('execute KA0100020form2/DLV_LOC_ENAME.onDecision');
  expj.KA0100020.KA0100020form2.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form2.DLV_LOC_ENAME.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form2-DLV_LOC_ENAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form2', 'DLV_LOC_ENAME', this);
  });
  expj.KA0100020.KA0100020form2.DLV_LOC_ENAME.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.DLV_LOC_ENAME.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2/DLV_LOC_ENAME.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form2-DLV_LOC_ENAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-KA0100020-KA0100020form2-DLV_LOC_ENAME" name="DLV_LOC_ENAME" class="KA0100020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100020Struct.getDLV_LOC_ENAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ZIP_CD",rb)%></span><!-- 郵便番号 --></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020form2-ZIP_CD">
expj.KA0100020.KA0100020form2.ZIP_CD = {};
expj.KA0100020.KA0100020form2.ZIP_CD.executeAllOnDecision = function () {
  console.log('execute KA0100020form2/ZIP_CD.onDecision');
  expj.KA0100020.KA0100020form2.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form2.ZIP_CD.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form2-ZIP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form2', 'ZIP_CD', this);
  });
  expj.KA0100020.KA0100020form2.ZIP_CD.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.ZIP_CD.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2/ZIP_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form2-ZIP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0100020-KA0100020form2-ZIP_CD" name="ZIP_CD" class="KA0100020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100020Struct.getZIP_CD()) %>" maxlength="8" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ADDRESS_1",rb)%></span><!-- 住所1 --></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020form2-ADDRESS_1">
expj.KA0100020.KA0100020form2.ADDRESS_1 = {};
expj.KA0100020.KA0100020form2.ADDRESS_1.executeAllOnDecision = function () {
  console.log('execute KA0100020form2/ADDRESS_1.onDecision');
  expj.KA0100020.KA0100020form2.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form2.ADDRESS_1.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form2-ADDRESS_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form2', 'ADDRESS_1', this);
  });
  expj.KA0100020.KA0100020form2.ADDRESS_1.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.ADDRESS_1.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2/ADDRESS_1.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form2-ADDRESS_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KA0100020-KA0100020form2-ADDRESS_1" name="ADDRESS_1" class="KA0100020-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100020Struct.getADDRESS_1()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ADDRESS_2",rb)%></span><!-- 住所2 --></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020form2-ADDRESS_2">
expj.KA0100020.KA0100020form2.ADDRESS_2 = {};
expj.KA0100020.KA0100020form2.ADDRESS_2.executeAllOnDecision = function () {
  console.log('execute KA0100020form2/ADDRESS_2.onDecision');
  expj.KA0100020.KA0100020form2.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form2.ADDRESS_2.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form2-ADDRESS_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form2', 'ADDRESS_2', this);
  });
  expj.KA0100020.KA0100020form2.ADDRESS_2.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.ADDRESS_2.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2/ADDRESS_2.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form2-ADDRESS_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KA0100020-KA0100020form2-ADDRESS_2" name="ADDRESS_2" class="KA0100020-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100020Struct.getADDRESS_2()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ADDRESS_K_1",rb)%></span><!-- 住所(カナ)1 --></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020form2-ADDRESS_K_1">
expj.KA0100020.KA0100020form2.ADDRESS_K_1 = {};
expj.KA0100020.KA0100020form2.ADDRESS_K_1.executeAllOnDecision = function () {
  console.log('execute KA0100020form2/ADDRESS_K_1.onDecision');
  expj.KA0100020.KA0100020form2.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form2.ADDRESS_K_1.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form2-ADDRESS_K_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form2', 'ADDRESS_K_1', this);
  });
  expj.KA0100020.KA0100020form2.ADDRESS_K_1.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.ADDRESS_K_1.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2/ADDRESS_K_1.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form2-ADDRESS_K_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KA0100020-KA0100020form2-ADDRESS_K_1" name="ADDRESS_K_1" class="KA0100020-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100020Struct.getADDRESS_K_1()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ADDRESS_K_2",rb)%></span><!-- 住所(カナ)2 --></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020form2-ADDRESS_K_2">
expj.KA0100020.KA0100020form2.ADDRESS_K_2 = {};
expj.KA0100020.KA0100020form2.ADDRESS_K_2.executeAllOnDecision = function () {
  console.log('execute KA0100020form2/ADDRESS_K_2.onDecision');
  expj.KA0100020.KA0100020form2.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form2.ADDRESS_K_2.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form2-ADDRESS_K_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form2', 'ADDRESS_K_2', this);
  });
  expj.KA0100020.KA0100020form2.ADDRESS_K_2.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.ADDRESS_K_2.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2/ADDRESS_K_2.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form2-ADDRESS_K_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KA0100020-KA0100020form2-ADDRESS_K_2" name="ADDRESS_K_2" class="KA0100020-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100020Struct.getADDRESS_K_2()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.TEL",rb)%></span><!-- 電話番号 --></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020form2-TEL">
expj.KA0100020.KA0100020form2.TEL = {};
expj.KA0100020.KA0100020form2.TEL.executeAllOnDecision = function () {
  console.log('execute KA0100020form2/TEL.onDecision');
  expj.KA0100020.KA0100020form2.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form2.TEL.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form2-TEL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form2', 'TEL', this);
  });
  expj.KA0100020.KA0100020form2.TEL.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.TEL.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2/TEL.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form2-TEL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0100020-KA0100020form2-TEL" name="TEL" class="KA0100020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100020Struct.getTEL()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.FAX",rb)%></span><!-- FAX番号 --></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020form2-FAX">
expj.KA0100020.KA0100020form2.FAX = {};
expj.KA0100020.KA0100020form2.FAX.executeAllOnDecision = function () {
  console.log('execute KA0100020form2/FAX.onDecision');
  expj.KA0100020.KA0100020form2.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form2.FAX.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form2-FAX').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form2', 'FAX', this);
  });
  expj.KA0100020.KA0100020form2.FAX.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.FAX.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2/FAX.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form2-FAX');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0100020-KA0100020form2-FAX" name="FAX" class="KA0100020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100020Struct.getFAX()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.TRANSPORT_CD",rb)%></span><!-- 運送便コード --></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020form2-TRANSPORT_CD">
expj.KA0100020.KA0100020form2.TRANSPORT_CD = {};
expj.KA0100020.KA0100020form2.TRANSPORT_CD.executeAllOnDecision = function () {
  console.log('execute KA0100020form2/TRANSPORT_CD.onDecision');
  expj.KA0100020.KA0100020form2.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form2.TRANSPORT_CD.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form2-TRANSPORT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form2', 'TRANSPORT_CD', this);
  });
  expj.KA0100020.KA0100020form2.TRANSPORT_CD.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.TRANSPORT_CD.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2/TRANSPORT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form2-TRANSPORT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0100020-KA0100020form2-TRANSPORT_CD" name="TRANSPORT_CD" class="KA0100020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100020Struct.getTRANSPORT_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DEPO_WH_CD",rb)%></span><!-- 払出預託保管区 --></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020form2-DEPO_WH_CD">
expj.KA0100020.KA0100020form2.DEPO_WH_CD = {};
expj.KA0100020.KA0100020form2.DEPO_WH_CD.executeAllOnDecision = function () {
  console.log('execute KA0100020form2/DEPO_WH_CD.onDecision');
  expj.KA0100020.KA0100020form2.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form2.DEPO_WH_CD.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form2-DEPO_WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form2', 'DEPO_WH_CD', this);
  });
  expj.KA0100020.KA0100020form2.DEPO_WH_CD.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.DEPO_WH_CD.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2/DEPO_WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form2-DEPO_WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0100020-KA0100020form2-DEPO_WH_CD" name="DEPO_WH_CD" class="KA0100020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100020Struct.getDEPO_WH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020form2-PeekerIDepoCd">
expj.KA0100020.KA0100020form2.PeekerIDepoCd = {};
// script1="onClick;0;PEEKER;_KA0100020form2/DEPO_WH_CD@<%=contextNo%>"
expj.KA0100020.KA0100020form2.PeekerIDepoCd.onClick0 = function () {
  console.log('PeekerIDepoCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KA0100020';
var parameterValues = 'PeekerIDepoCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KA0100020', 'KA0100020form2', '_KA0100020form2/DEPO_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_06%&%';
parameterValues += 'TARGET_FIELD%=%_KA0100020form2/DEPO_WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KA0100020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KA0100020.KA0100020form2.PeekerIDepoCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0100020.KA0100020form2.PeekerIDepoCd['onClick' + i])) {
        expj.KA0100020.KA0100020form2.PeekerIDepoCd['onClick' + i]();
      }
    }
  }
};
expj.KA0100020.KA0100020form2.PeekerIDepoCd.executeAllOnDecision = function () {
};
expj.KA0100020.KA0100020form2.PeekerIDepoCd.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form2-PeekerIDepoCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0100020', 'KA0100020form2', 'PeekerIDepoCd', this, 'Button');
    }
  });
  expj.KA0100020.KA0100020form2.PeekerIDepoCd.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.PeekerIDepoCd.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2/PeekerIDepoCd.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form2-PeekerIDepoCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KA0100020-KA0100020form2-PeekerIDepoCd" class="KA0100020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020form2-DEPO_WH_NAME">
expj.KA0100020.KA0100020form2.DEPO_WH_NAME = {};
expj.KA0100020.KA0100020form2.DEPO_WH_NAME.executeAllOnDecision = function () {
  console.log('execute KA0100020form2/DEPO_WH_NAME.onDecision');
  expj.KA0100020.KA0100020form2.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form2.DEPO_WH_NAME.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form2-DEPO_WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form2', 'DEPO_WH_NAME', this);
  });
  expj.KA0100020.KA0100020form2.DEPO_WH_NAME.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.DEPO_WH_NAME.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2/DEPO_WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form2-DEPO_WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KA0100020-KA0100020form2-DEPO_WH_NAME" name="DEPO_WH_NAME" class="KA0100020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100020Struct.getDEPO_WH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KA0100020-KA0100020form2-h_MODE" name="h_MODE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0100020Control.getMode()) %>">
<script class="expj-script-KA0100020-KA0100020form2-h_MODE">
expj.KA0100020.KA0100020form2.h_MODE = {};
expj.KA0100020.KA0100020form2.h_MODE.executeAllOnDecision = function () {
  console.log('execute KA0100020form2/h_MODE.onDecision');
  expj.KA0100020.KA0100020form2.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form2.h_MODE.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form2-h_MODE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form2', 'h_MODE', this);
  });
  expj.KA0100020.KA0100020form2.h_MODE.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.h_MODE.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2/h_MODE.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form2-h_MODE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.SHIP_WH_CD",rb)%></span><!-- 出荷倉庫コード --></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020form2-SHIP_WH_CD">
expj.KA0100020.KA0100020form2.SHIP_WH_CD = {};
expj.KA0100020.KA0100020form2.SHIP_WH_CD.executeAllOnDecision = function () {
  console.log('execute KA0100020form2/SHIP_WH_CD.onDecision');
  expj.KA0100020.KA0100020form2.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form2.SHIP_WH_CD.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form2-SHIP_WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form2', 'SHIP_WH_CD', this);
  });
  expj.KA0100020.KA0100020form2.SHIP_WH_CD.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.SHIP_WH_CD.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2/SHIP_WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form2-SHIP_WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0100020-KA0100020form2-SHIP_WH_CD" name="SHIP_WH_CD" class="KA0100020-focus-move  required-value expj-KA0100020-required-D" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100020Struct.getSHIP_WH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020form2-PeekerIShipCd">
expj.KA0100020.KA0100020form2.PeekerIShipCd = {};
// script1="onClick;0;PEEKER;_KA0100020form2/SHIP_WH_CD@<%=contextNo%>"
expj.KA0100020.KA0100020form2.PeekerIShipCd.onClick0 = function () {
  console.log('PeekerIShipCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KA0100020';
var parameterValues = 'PeekerIShipCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KA0100020', 'KA0100020form2', '_KA0100020form2/SHIP_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_05%&%';
parameterValues += 'TARGET_FIELD%=%_KA0100020form2/SHIP_WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KA0100020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KA0100020.KA0100020form2.PeekerIShipCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0100020.KA0100020form2.PeekerIShipCd['onClick' + i])) {
        expj.KA0100020.KA0100020form2.PeekerIShipCd['onClick' + i]();
      }
    }
  }
};
expj.KA0100020.KA0100020form2.PeekerIShipCd.executeAllOnDecision = function () {
};
expj.KA0100020.KA0100020form2.PeekerIShipCd.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form2-PeekerIShipCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0100020', 'KA0100020form2', 'PeekerIShipCd', this, 'Button');
    }
  });
  expj.KA0100020.KA0100020form2.PeekerIShipCd.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.PeekerIShipCd.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2/PeekerIShipCd.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form2-PeekerIShipCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KA0100020-KA0100020form2-PeekerIShipCd" class="KA0100020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020form2-SHIP_WH_NAME">
expj.KA0100020.KA0100020form2.SHIP_WH_NAME = {};
expj.KA0100020.KA0100020form2.SHIP_WH_NAME.executeAllOnDecision = function () {
  console.log('execute KA0100020form2/SHIP_WH_NAME.onDecision');
  expj.KA0100020.KA0100020form2.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form2.SHIP_WH_NAME.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form2-SHIP_WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form2', 'SHIP_WH_NAME', this);
  });
  expj.KA0100020.KA0100020form2.SHIP_WH_NAME.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.SHIP_WH_NAME.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2/SHIP_WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form2-SHIP_WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KA0100020-KA0100020form2-SHIP_WH_NAME" name="SHIP_WH_NAME" class="KA0100020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100020Struct.getSHIP_WH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KA0100020-KA0100020form2-h_RESULT" name="h_RESULT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0100020Struct.geth_RESULT()) %>">
<script class="expj-script-KA0100020-KA0100020form2-h_RESULT">
expj.KA0100020.KA0100020form2.h_RESULT = {};
expj.KA0100020.KA0100020form2.h_RESULT.executeAllOnDecision = function () {
  console.log('execute KA0100020form2/h_RESULT.onDecision');
  expj.KA0100020.KA0100020form2.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form2.h_RESULT.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form2-h_RESULT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form2', 'h_RESULT', this);
  });
  expj.KA0100020.KA0100020form2.h_RESULT.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.h_RESULT.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2/h_RESULT.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form2-h_RESULT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.TRANSPORT_LT",rb)%></span><!-- 運送日数 --></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020form2-TRANSPORT_LT">
expj.KA0100020.KA0100020form2.TRANSPORT_LT = {};
expj.KA0100020.KA0100020form2.TRANSPORT_LT.executeAllOnDecision = function () {
  console.log('execute KA0100020form2/TRANSPORT_LT.onDecision');
  expj.KA0100020.KA0100020form2.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form2.TRANSPORT_LT.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form2-TRANSPORT_LT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form2', 'TRANSPORT_LT', this);
  });
  expj.KA0100020.KA0100020form2.TRANSPORT_LT.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.TRANSPORT_LT.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2/TRANSPORT_LT.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form2-TRANSPORT_LT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KA0100020-KA0100020form2-TRANSPORT_LT" name="TRANSPORT_LT" class="KA0100020-focus-move expj-align-right required-value expj-KA0100020-required-C" style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aKA0100020Struct.getTRANSPORT_LT()) %>" maxlength="3" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KA0100020-KA0100020form2-k_MODE" name="k_MODE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0100020Struct.getk_MODE()) %>">
<script class="expj-script-KA0100020-KA0100020form2-k_MODE">
expj.KA0100020.KA0100020form2.k_MODE = {};
expj.KA0100020.KA0100020form2.k_MODE.executeAllOnDecision = function () {
  console.log('execute KA0100020form2/k_MODE.onDecision');
  expj.KA0100020.KA0100020form2.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form2.k_MODE.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form2-k_MODE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form2', 'k_MODE', this);
  });
  expj.KA0100020.KA0100020form2.k_MODE.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.k_MODE.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2/k_MODE.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form2-k_MODE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3165",rb)%></span><!-- 承認備考 --></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020form2-APPR_REMARKS">
expj.KA0100020.KA0100020form2.APPR_REMARKS = {};
expj.KA0100020.KA0100020form2.APPR_REMARKS.executeAllOnDecision = function () {
  console.log('execute KA0100020form2/APPR_REMARKS.onDecision');
  expj.KA0100020.KA0100020form2.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form2.APPR_REMARKS.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form2-APPR_REMARKS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form2', 'APPR_REMARKS', this);
  });
  expj.KA0100020.KA0100020form2.APPR_REMARKS.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.APPR_REMARKS.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2/APPR_REMARKS.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form2-APPR_REMARKS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KA0100020-KA0100020form2-APPR_REMARKS" name="APPR_REMARKS" class="KA0100020-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100020Struct.getAPPR_REMARKS()) %>" maxlength="80" ></div><!--/td-->
<input type="hidden" id="expj-KA0100020-KA0100020form2-h_MODIFY_COUNT" name="h_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0100020Struct.geth_MODIFY_COUNT()) %>">
<script class="expj-script-KA0100020-KA0100020form2-h_MODIFY_COUNT">
expj.KA0100020.KA0100020form2.h_MODIFY_COUNT = {};
expj.KA0100020.KA0100020form2.h_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute KA0100020form2/h_MODIFY_COUNT.onDecision');
  expj.KA0100020.KA0100020form2.executeAllOnDecision();
  expj.KA0100020.executeAllOnDecision();
};
expj.KA0100020.KA0100020form2.h_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020form2-h_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100020', 'KA0100020form2', 'h_MODIFY_COUNT', this);
  });
  expj.KA0100020.KA0100020form2.h_MODIFY_COUNT.executePScriptOnLoad();
};

expj.KA0100020.KA0100020form2.h_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute KA0100020form2/h_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020form2-h_MODIFY_COUNT');
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
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 399px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-KA0100020-KA0100020button2">
expj.KA0100020.KA0100020button2 = {};
expj.KA0100020.KA0100020button2.executeAllOnDecision = function () {
  console.log('execute KA0100020button2.onDecision');
};
expj.KA0100020.KA0100020button2.executeOnLoad = function () {
  expj.KA0100020.KA0100020button2.executePScriptOnLoad();
};

expj.KA0100020.KA0100020button2.executePScriptOnLoad = function () {
  console.log('execute KA0100020button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KA0100020-KA0100020button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KA0100020-KA0100020button2-insert">
expj.KA0100020.KA0100020button2.insert = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KA0100020form1/*,_KA0100020form2/*@KA0100020Servlet,,$ZZ07001"
expj.KA0100020.KA0100020button2.insert.onClick0 = function () {
  console.log('insert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0100020', 'KA0100020button2', '_KA0100020form1/*,_KA0100020form2/*', 'KA0100020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0100020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0100020', response);
expj.common.updateBusinessScreenTab('KA0100020', contents);
};
expj.common.pscript.callConfirm('KA0100020', 'KA0100020button2', 'ZZ07001', okEvent);
};
expj.KA0100020.KA0100020button2.insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0100020.KA0100020button2.insert['onClick' + i])) {
        expj.KA0100020.KA0100020button2.insert['onClick' + i]();
      }
    }
  }
};
expj.KA0100020.KA0100020button2.insert.executeAllOnDecision = function () {
};
expj.KA0100020.KA0100020button2.insert.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020button2-insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0100020', 'KA0100020button2', 'insert', this, 'Button');
    }
  });
  expj.KA0100020.KA0100020button2.insert.executePScriptOnLoad();
};

expj.KA0100020.KA0100020button2.insert.executePScriptOnLoad = function () {
  console.log('execute KA0100020button2/insert.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020button2-insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0100020-KA0100020button2-insert" name="insert" class="KA0100020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020button2-update">
expj.KA0100020.KA0100020button2.update = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KA0100020form1/*,_KA0100020form2/*@KA0100020Servlet,,$ZZ07003"
expj.KA0100020.KA0100020button2.update.onClick0 = function () {
  console.log('update script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0100020', 'KA0100020button2', '_KA0100020form1/*,_KA0100020form2/*', 'KA0100020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0100020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0100020', response);
expj.common.updateBusinessScreenTab('KA0100020', contents);
};
expj.common.pscript.callConfirm('KA0100020', 'KA0100020button2', 'ZZ07003', okEvent);
};
expj.KA0100020.KA0100020button2.update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0100020.KA0100020button2.update['onClick' + i])) {
        expj.KA0100020.KA0100020button2.update['onClick' + i]();
      }
    }
  }
};
expj.KA0100020.KA0100020button2.update.executeAllOnDecision = function () {
};
expj.KA0100020.KA0100020button2.update.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020button2-update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0100020', 'KA0100020button2', 'update', this, 'Button');
    }
  });
  expj.KA0100020.KA0100020button2.update.executePScriptOnLoad();
};

expj.KA0100020.KA0100020button2.update.executePScriptOnLoad = function () {
  console.log('execute KA0100020button2/update.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020button2-update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0100020-KA0100020button2-update" name="update" class="KA0100020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020button2-delete">
expj.KA0100020.KA0100020button2.delete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KA0100020form1/*,_KA0100020form2/*@KA0100020Servlet,,$ZZ07004"
expj.KA0100020.KA0100020button2.delete.onClick0 = function () {
  console.log('delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0100020', 'KA0100020button2', '_KA0100020form1/*,_KA0100020form2/*', 'KA0100020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0100020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0100020', response);
expj.common.updateBusinessScreenTab('KA0100020', contents);
};
expj.common.pscript.callConfirm('KA0100020', 'KA0100020button2', 'ZZ07004', okEvent);
};
expj.KA0100020.KA0100020button2.delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0100020.KA0100020button2.delete['onClick' + i])) {
        expj.KA0100020.KA0100020button2.delete['onClick' + i]();
      }
    }
  }
};
expj.KA0100020.KA0100020button2.delete.executeAllOnDecision = function () {
};
expj.KA0100020.KA0100020button2.delete.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020button2-delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0100020', 'KA0100020button2', 'delete', this, 'Button');
    }
  });
  expj.KA0100020.KA0100020button2.delete.executePScriptOnLoad();
};

expj.KA0100020.KA0100020button2.delete.executePScriptOnLoad = function () {
  console.log('execute KA0100020button2/delete.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020button2-delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0100020-KA0100020button2-delete" name="delete" class="KA0100020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<!--four end --><!--five start --><div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<!--five end --><!--six start --><div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">KA0100020 Revision: 1.5  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KA0100020-KA0100020button0">
expj.KA0100020.KA0100020button0 = {};
expj.KA0100020.KA0100020button0.executeAllOnDecision = function () {
  console.log('execute KA0100020button0.onDecision');
};
expj.KA0100020.KA0100020button0.executeOnLoad = function () {
  expj.KA0100020.KA0100020button0.executePScriptOnLoad();
};

expj.KA0100020.KA0100020button0.executePScriptOnLoad = function () {
  console.log('execute KA0100020button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KA0100020-KA0100020button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KA0100020-KA0100020button0-clear">
expj.KA0100020.KA0100020button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KA0100020form1/*@KA0100020Servlet,,$ZZ07008"
expj.KA0100020.KA0100020button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0100020', 'KA0100020button0', '_KA0100020form1/*', 'KA0100020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0100020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0100020', response);
expj.common.updateBusinessScreenTab('KA0100020', contents);
};
expj.common.pscript.callConfirm('KA0100020', 'KA0100020button0', 'ZZ07008', okEvent);
};
expj.KA0100020.KA0100020button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0100020.KA0100020button0.clear['onClick' + i])) {
        expj.KA0100020.KA0100020button0.clear['onClick' + i]();
      }
    }
  }
};
expj.KA0100020.KA0100020button0.clear.executeAllOnDecision = function () {
};
expj.KA0100020.KA0100020button0.clear.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0100020', 'KA0100020button0', 'clear', this, 'Button');
    }
  });
  expj.KA0100020.KA0100020button0.clear.executePScriptOnLoad();
};

expj.KA0100020.KA0100020button0.clear.executePScriptOnLoad = function () {
  console.log('execute KA0100020button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0100020-KA0100020button0-clear" name="clear" class="KA0100020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KA0100020-KA0100020button0-close">
expj.KA0100020.KA0100020button0.close = {};
// script1="onClick;0;CLOSE"
expj.KA0100020.KA0100020button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('KA0100020');
};
expj.KA0100020.KA0100020button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0100020.KA0100020button0.close['onClick' + i])) {
        expj.KA0100020.KA0100020button0.close['onClick' + i]();
      }
    }
  }
};
expj.KA0100020.KA0100020button0.close.executeAllOnDecision = function () {
};
expj.KA0100020.KA0100020button0.close.executeOnLoad = function () {
  $('#expj-KA0100020-KA0100020button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0100020', 'KA0100020button0', 'close', this, 'Button');
    }
  });
  expj.KA0100020.KA0100020button0.close.executePScriptOnLoad();
};

expj.KA0100020.KA0100020button0.close.executePScriptOnLoad = function () {
  console.log('execute KA0100020button0/close.onLoad');
  var targetComponent = document.getElementById('expj-KA0100020-KA0100020button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0100020-KA0100020button0-close" name="close" class="KA0100020-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
<!--six end --></div><!-- /table1 -->
</div><!-- expj-business-screen-KA0100020 (END)-->
<%
MessageStruct msgStruct = aKA0100020Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KA0100020-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KA0100020)) {
  expj.common.treeInstanceMap.KA0100020 = {};
}
expj.common.treeInstanceMap.KA0100020.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KA0100020.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KA0100020.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KA0100020.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KA0100020.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KA0100020.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KA0100020.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KA0100020.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KA0100020.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KA0100020-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KA0100020-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0100020)) {
  expj.common.detailDialogMap.KA0100020 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0100020._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KA0100020._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0100020.<%=detailId %>)) {
  expj.common.detailDialogMap.KA0100020.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0100020.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KA0100020.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0100020.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KA0100020.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KA0100020.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KA0100020.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KA0100020-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KA0100020.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KA0100020-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KA0100020.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KA0100020-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KA0100020.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KA0100020.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KA0100020.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KA0100020._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KA0100020-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KA0100020)) {
  expj.common.viewInstanceMap.KA0100020 = {};
}
expj.common.viewInstanceMap.KA0100020.<%=viewId %> = {};
expj.common.viewInstanceMap.KA0100020.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KA0100020.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KA0100020.<%=viewId %>.init = function () {
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
    expj.KA0100020.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KA0100020.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KA0100020-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KA0100020-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KA0100020_init">
/**
 * KA0100020用のロード完了時初期化関数
 */
expj.KA0100020.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KA0100020');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KA0100020');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KA0100020');
  expj.common.calendarInstanceMap.KA0100020 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KA0100020.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KA0100020.<%=detailId %>.init();
  expj.common.detailDialogMap.KA0100020.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KA0100020.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KA0100020.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KA0100020');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KA0100020');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KA0100020-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KA0100020-<%=detailId %>');
<%
 }
%>
  try{expj.KA0100020.KA0100020form1.CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form1.h_CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form1.PeekerICustCd.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form1.CUST_NAME.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form1.DLV_LOC_CD.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form1.h_DLV_LOC_CD.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form1.PeekerIDlvLocCd.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form1.h_APR_CUST_DLV_LOC.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form1.h_SCREENMOVE_TYP.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form1.h_APPR_ID.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020button1.select.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.DLV_LOC_NAME.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.DLV_LOC_KNAME.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.DLV_LOC_ENAME.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.ZIP_CD.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.ADDRESS_1.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.ADDRESS_2.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.ADDRESS_K_1.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.ADDRESS_K_2.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.TEL.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.FAX.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.TRANSPORT_CD.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.DEPO_WH_CD.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.PeekerIDepoCd.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.DEPO_WH_NAME.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.h_MODE.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.SHIP_WH_CD.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.PeekerIShipCd.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.SHIP_WH_NAME.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.h_RESULT.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.TRANSPORT_LT.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.k_MODE.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.APPR_REMARKS.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.h_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020button2.insert.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020button2.update.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020button2.delete.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020button0.clear.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020button0.close.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form1.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020button1.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020form2.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020button2.executeOnLoad();}catch(e){};
  try{expj.KA0100020.KA0100020button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KA0100020.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KA0100020', 'KA0100020');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KA0100020');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KA0100020-focus-move');
  // 初期フォーカス当てる処理
  $('.KA0100020-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KA0100020', '<%=request.getContextPath() %>');
};

/**
 * KA0100020の全体onDecision処理
 */
expj.KA0100020.executeAllOnDecision = function () {
  expj.KA0100020.KA0100020form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KA0100020_console">
expj.KA0100020.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>