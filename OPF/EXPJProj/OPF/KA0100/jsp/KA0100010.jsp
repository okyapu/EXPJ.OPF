<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:57:33 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KA0100\KA0100010.html
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
<jsp:useBean id="aKA0100010Control" class="com.nec.jp.orteus.metamorBase.KA0100.KA0100010Control" scope="request"/>
<jsp:useBean id="aKA0100010Struct" class="com.nec.jp.orteus.metamorBase.KA0100.KA0100010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

得意先メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KA0100/jsp/KA0100010.jsp,v $
$Author: geng-jia $	
$Revision: 1.12 $ $Date: 2017/02/22 02:06:58 $
********************************************************* --%>
<html>
<head>
<title>得意先メンテナンス</title>
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
<script class="expj-script-KA0100010_init">
  // KA0100010名前空間
  expj.KA0100010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-KA0100010" data-screen="KA0100010" data-newdata="<%=aKA0100010Control.isNewData() %>">
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
              <script class="expj-script-KA0100010-KA0100010form1">
expj.KA0100010.KA0100010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5,6"
expj.KA0100010.KA0100010form1.onLoad0 = function () {
  console.log('KA0100010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision6)){this.onDecision6();}
};
// script2="onDecision;0;CHKRQ;A@*1,*0"
expj.KA0100010.KA0100010form1.onDecision0 = function () {
  console.log('KA0100010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('KA0100010', 'A')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="onDecision;1;CHK;?KA0100010form1/CUST_CD[eq]SAME[and]?KA0100010form1/*[eq]NORMAL@*6,*3"
expj.KA0100010.KA0100010form1.onDecision1 = function () {
  console.log('KA0100010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0100010', 'KA0100010form1', '?KA0100010form1/CUST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0100010', 'KA0100010form1', '?KA0100010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="onDecision;2;CHK;?KA0100010form1/CUST_CD[eq]SAME[and]?KA0100010form1/*[eq]NORMAL@*7,*5"
expj.KA0100010.KA0100010form1.onDecision2 = function () {
  console.log('KA0100010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0100010', 'KA0100010form1', '?KA0100010form1/CUST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0100010', 'KA0100010form1', '?KA0100010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script5="onDecision;3;CHK;?KA0100010form1/CUST_CD[eq]SAME@*8,*9"
expj.KA0100010.KA0100010form1.onDecision3 = function () {
  console.log('KA0100010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0100010', 'KA0100010form1', '?KA0100010form1/CUST_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script6="onDecision;4;CHK;_KA0100010form2/UNCONFIRM_ODR_EFF_TERM_FLG[eq]0@*12,*13"
expj.KA0100010.KA0100010form1.onDecision4 = function () {
  console.log('KA0100010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0100010', 'KA0100010form1', '_KA0100010form2/UNCONFIRM_ODR_EFF_TERM_FLG'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script7="child;0;MASK;_KA0100010button1/select"
expj.KA0100010.KA0100010form1.child0 = function () {
  console.log('KA0100010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('KA0100010', 'KA0100010form1', '_KA0100010button1/select');
};
// script8="child;1;UNMASK;_KA0100010button1/select"
expj.KA0100010.KA0100010form1.child1 = function () {
  console.log('KA0100010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('KA0100010', 'KA0100010form1', '_KA0100010button1/select');
};
// script9="child;2;UNMASK;_KA0100010button2/update"
expj.KA0100010.KA0100010form1.child2 = function () {
  console.log('KA0100010form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('KA0100010', 'KA0100010form1', '_KA0100010button2/update');
};
// script10="child;3;MASK;_KA0100010button2/update"
expj.KA0100010.KA0100010form1.child3 = function () {
  console.log('KA0100010form1 script10');
expj.common.pscript.setMaskToReferenceComponent('KA0100010', 'KA0100010form1', '_KA0100010button2/update');
};
// script11="child;4;UNMASK;_KA0100010button2/delete"
expj.KA0100010.KA0100010form1.child4 = function () {
  console.log('KA0100010form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('KA0100010', 'KA0100010form1', '_KA0100010button2/delete');
};
// script12="child;5;MASK;_KA0100010button2/delete"
expj.KA0100010.KA0100010form1.child5 = function () {
  console.log('KA0100010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('KA0100010', 'KA0100010form1', '_KA0100010button2/delete');
};
// script13="child;6;CHKRQ;A,B,C,D,E,F@*2,*3"
expj.KA0100010.KA0100010form1.child6 = function () {
  console.log('KA0100010form1 script13');
if (expj.common.pscript.satisfiedRequiredComponent('KA0100010', 'A') && expj.common.pscript.satisfiedRequiredComponent('KA0100010', 'B') && expj.common.pscript.satisfiedRequiredComponent('KA0100010', 'C') && expj.common.pscript.satisfiedRequiredComponent('KA0100010', 'D') && expj.common.pscript.satisfiedRequiredComponent('KA0100010', 'E') && expj.common.pscript.satisfiedRequiredComponent('KA0100010', 'F')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script14="child;7;CHKRQ;A@*4,*5"
expj.KA0100010.KA0100010form1.child7 = function () {
  console.log('KA0100010form1 script14');
if (expj.common.pscript.satisfiedRequiredComponent('KA0100010', 'A')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script15="child;8;CHK;?KA0100010form1/*[eq]NORMAL@*11,*9"
expj.KA0100010.KA0100010form1.child8 = function () {
  console.log('KA0100010form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0100010', 'KA0100010form1', '?KA0100010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script16="child;9;CHKRQ;A,B,C,D,E,F@*10,*11"
expj.KA0100010.KA0100010form1.child9 = function () {
  console.log('KA0100010form1 script16');
if (expj.common.pscript.satisfiedRequiredComponent('KA0100010', 'A') && expj.common.pscript.satisfiedRequiredComponent('KA0100010', 'B') && expj.common.pscript.satisfiedRequiredComponent('KA0100010', 'C') && expj.common.pscript.satisfiedRequiredComponent('KA0100010', 'D') && expj.common.pscript.satisfiedRequiredComponent('KA0100010', 'E') && expj.common.pscript.satisfiedRequiredComponent('KA0100010', 'F')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script17="child;10;UNMASK;_KA0100010button2/insert"
expj.KA0100010.KA0100010form1.child10 = function () {
  console.log('KA0100010form1 script17');
expj.common.pscript.setUnMaskToReferenceComponent('KA0100010', 'KA0100010form1', '_KA0100010button2/insert');
};
// script18="child;11;MASK;_KA0100010button2/insert"
expj.KA0100010.KA0100010form1.child11 = function () {
  console.log('KA0100010form1 script18');
expj.common.pscript.setMaskToReferenceComponent('KA0100010', 'KA0100010form1', '_KA0100010button2/insert');
};
// script19="child;12;MASK;_KA0100010form2/UNCONFIRM_ODR_EFF_PRIOD"
expj.KA0100010.KA0100010form1.child12 = function () {
  console.log('KA0100010form1 script19');
expj.common.pscript.setMaskToReferenceComponent('KA0100010', 'KA0100010form1', '_KA0100010form2/UNCONFIRM_ODR_EFF_PRIOD');
};
// script20="child;13;UNMASK;_KA0100010form2/UNCONFIRM_ODR_EFF_PRIOD"
expj.KA0100010.KA0100010form1.child13 = function () {
  console.log('KA0100010form1 script20');
expj.common.pscript.setUnMaskToReferenceComponent('KA0100010', 'KA0100010form1', '_KA0100010form2/UNCONFIRM_ODR_EFF_PRIOD');
};
// script21="onDecision;5;CHK;_KA0100010form1/h_SCREENMOVE_TYP[eq]0[or]_KA0100010form1/h_SCREENMOVE_TYP[eq]1@*14"
expj.KA0100010.KA0100010form1.onDecision5 = function () {
  console.log('KA0100010form1 script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0100010', 'KA0100010form1', '_KA0100010form1/h_SCREENMOVE_TYP'), '[eq]', '0') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0100010', 'KA0100010form1', '_KA0100010form1/h_SCREENMOVE_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script22="child;14;MASK;_KA0100010button1/select,_KA0100010button2/insert,_KA0100010button2/update,_KA0100010button2/delete,_KA0100010button0/clear"
expj.KA0100010.KA0100010form1.child14 = function () {
  console.log('KA0100010form1 script22');
expj.common.pscript.setMaskToReferenceComponent('KA0100010', 'KA0100010form1', '_KA0100010button1/select');
expj.common.pscript.setMaskToReferenceComponent('KA0100010', 'KA0100010form1', '_KA0100010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('KA0100010', 'KA0100010form1', '_KA0100010button2/update');
expj.common.pscript.setMaskToReferenceComponent('KA0100010', 'KA0100010form1', '_KA0100010button2/delete');
expj.common.pscript.setMaskToReferenceComponent('KA0100010', 'KA0100010form1', '_KA0100010button0/clear');
};
// script23="onDecision;6;CHK;_KA0100010form1/h_APR_CUST[eq]1@*15,*16"
expj.KA0100010.KA0100010form1.onDecision6 = function () {
  console.log('KA0100010form1 script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0100010', 'KA0100010form1', '_KA0100010form1/h_APR_CUST'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script24="child;15;UNMASK;_KA0100010form2/APPR_REMARKS"
expj.KA0100010.KA0100010form1.child15 = function () {
  console.log('KA0100010form1 script24');
expj.common.pscript.setUnMaskToReferenceComponent('KA0100010', 'KA0100010form1', '_KA0100010form2/APPR_REMARKS');
};
// script25="child;16;MASK;_KA0100010form2/APPR_REMARKS"
expj.KA0100010.KA0100010form1.child16 = function () {
  console.log('KA0100010form1 script25');
expj.common.pscript.setMaskToReferenceComponent('KA0100010', 'KA0100010form1', '_KA0100010form2/APPR_REMARKS');
};
expj.KA0100010.KA0100010form1.executeAllOnDecision = function () {
  console.log('execute KA0100010form1.onDecision');
  for (var i = 0; i <= 6; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0100010.KA0100010form1['onDecision' + i])) {
        expj.KA0100010.KA0100010form1['onDecision' + i]();
      }
    }
  }
};
expj.KA0100010.KA0100010form1.executeOnLoad = function () {
  expj.KA0100010.KA0100010form1.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form1.executePScriptOnLoad = function () {
  console.log('execute KA0100010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KA0100010.KA0100010form1['onLoad' + i])) {
      expj.KA0100010.KA0100010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KA0100010-KA0100010form1" action="KA0100010Servlet" name="KA0100010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKA0100010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010form1-CUST_CD">
expj.KA0100010.KA0100010form1.CUST_CD = {};
expj.KA0100010.KA0100010form1.CUST_CD.executeAllOnDecision = function () {
  console.log('execute KA0100010form1/CUST_CD.onDecision');
  expj.KA0100010.KA0100010form1.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form1.CUST_CD.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form1-CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form1', 'CUST_CD', this);
  });
  expj.KA0100010.KA0100010form1.CUST_CD.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form1.CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KA0100010form1/CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form1-CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0100010-KA0100010form1-CUST_CD" name="CUST_CD" class="KA0100010-focus-move  required-value expj-KA0100010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100010Struct.getCUST_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-KA0100010-KA0100010form1-h_CUST_CD" name="h_CUST_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0100010Struct.geth_CUST_CD()) %>">
<script class="expj-script-KA0100010-KA0100010form1-h_CUST_CD">
expj.KA0100010.KA0100010form1.h_CUST_CD = {};
expj.KA0100010.KA0100010form1.h_CUST_CD.executeAllOnDecision = function () {
  console.log('execute KA0100010form1/h_CUST_CD.onDecision');
  expj.KA0100010.KA0100010form1.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form1.h_CUST_CD.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form1-h_CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form1', 'h_CUST_CD', this);
  });
  expj.KA0100010.KA0100010form1.h_CUST_CD.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form1.h_CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KA0100010form1/h_CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form1-h_CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-KA0100010-KA0100010form1-PeekerICustCd">
expj.KA0100010.KA0100010form1.PeekerICustCd = {};
// script1="onClick;0;PEEKER;_KA0100010form1/CUST_CD@<%=contextNo%>"
expj.KA0100010.KA0100010form1.PeekerICustCd.onClick0 = function () {
  console.log('PeekerICustCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KA0100010';
var parameterValues = 'PeekerICustCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KA0100010', 'KA0100010form1', '_KA0100010form1/CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUST_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KA0100010form1/CUST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KA0100010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KA0100010.KA0100010form1.PeekerICustCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0100010.KA0100010form1.PeekerICustCd['onClick' + i])) {
        expj.KA0100010.KA0100010form1.PeekerICustCd['onClick' + i]();
      }
    }
  }
};
expj.KA0100010.KA0100010form1.PeekerICustCd.executeAllOnDecision = function () {
};
expj.KA0100010.KA0100010form1.PeekerICustCd.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form1-PeekerICustCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0100010', 'KA0100010form1', 'PeekerICustCd', this, 'Button');
    }
  });
  expj.KA0100010.KA0100010form1.PeekerICustCd.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form1.PeekerICustCd.executePScriptOnLoad = function () {
  console.log('execute KA0100010form1/PeekerICustCd.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form1-PeekerICustCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KA0100010-KA0100010form1-PeekerICustCd" class="KA0100010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<input type="hidden" id="expj-KA0100010-KA0100010form1-h_APR_CUST" name="h_APR_CUST" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0100010Struct.geth_APR_CUST()) %>">
<script class="expj-script-KA0100010-KA0100010form1-h_APR_CUST">
expj.KA0100010.KA0100010form1.h_APR_CUST = {};
expj.KA0100010.KA0100010form1.h_APR_CUST.executeAllOnDecision = function () {
  console.log('execute KA0100010form1/h_APR_CUST.onDecision');
  expj.KA0100010.KA0100010form1.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form1.h_APR_CUST.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form1-h_APR_CUST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form1', 'h_APR_CUST', this);
  });
  expj.KA0100010.KA0100010form1.h_APR_CUST.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form1.h_APR_CUST.executePScriptOnLoad = function () {
  console.log('execute KA0100010form1/h_APR_CUST.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form1-h_APR_CUST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KA0100010-KA0100010form1-h_SCREENMOVE_TYP" name="h_SCREENMOVE_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0100010Struct.geth_SCREENMOVE_TYP()) %>">
<script class="expj-script-KA0100010-KA0100010form1-h_SCREENMOVE_TYP">
expj.KA0100010.KA0100010form1.h_SCREENMOVE_TYP = {};
expj.KA0100010.KA0100010form1.h_SCREENMOVE_TYP.executeAllOnDecision = function () {
  console.log('execute KA0100010form1/h_SCREENMOVE_TYP.onDecision');
  expj.KA0100010.KA0100010form1.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form1.h_SCREENMOVE_TYP.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form1-h_SCREENMOVE_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form1', 'h_SCREENMOVE_TYP', this);
  });
  expj.KA0100010.KA0100010form1.h_SCREENMOVE_TYP.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form1.h_SCREENMOVE_TYP.executePScriptOnLoad = function () {
  console.log('execute KA0100010form1/h_SCREENMOVE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form1-h_SCREENMOVE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KA0100010-KA0100010form1-h_APPR_ID" name="h_APPR_ID" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0100010Struct.geth_APPR_ID()) %>">
<script class="expj-script-KA0100010-KA0100010form1-h_APPR_ID">
expj.KA0100010.KA0100010form1.h_APPR_ID = {};
expj.KA0100010.KA0100010form1.h_APPR_ID.executeAllOnDecision = function () {
  console.log('execute KA0100010form1/h_APPR_ID.onDecision');
  expj.KA0100010.KA0100010form1.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form1.h_APPR_ID.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form1-h_APPR_ID').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form1', 'h_APPR_ID', this);
  });
  expj.KA0100010.KA0100010form1.h_APPR_ID.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form1.h_APPR_ID.executePScriptOnLoad = function () {
  console.log('execute KA0100010form1/h_APPR_ID.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form1-h_APPR_ID');
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KA0100010-KA0100010button1">
expj.KA0100010.KA0100010button1 = {};
expj.KA0100010.KA0100010button1.executeAllOnDecision = function () {
  console.log('execute KA0100010button1.onDecision');
};
expj.KA0100010.KA0100010button1.executeOnLoad = function () {
  expj.KA0100010.KA0100010button1.executePScriptOnLoad();
};

expj.KA0100010.KA0100010button1.executePScriptOnLoad = function () {
  console.log('execute KA0100010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KA0100010-KA0100010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KA0100010-KA0100010button1-select">
expj.KA0100010.KA0100010button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KA0100010form1/*@KA0100010Servlet"
expj.KA0100010.KA0100010button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0100010', 'KA0100010button1', '_KA0100010form1/*', 'KA0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0100010', response);
expj.common.updateBusinessScreenTab('KA0100010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KA0100010.KA0100010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0100010.KA0100010button1.select['onClick' + i])) {
        expj.KA0100010.KA0100010button1.select['onClick' + i]();
      }
    }
  }
};
expj.KA0100010.KA0100010button1.select.executeAllOnDecision = function () {
};
expj.KA0100010.KA0100010button1.select.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0100010', 'KA0100010button1', 'select', this, 'Button');
    }
  });
  expj.KA0100010.KA0100010button1.select.executePScriptOnLoad();
};

expj.KA0100010.KA0100010button1.select.executePScriptOnLoad = function () {
  console.log('execute KA0100010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0100010-KA0100010button1-select" name="select" class="KA0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KA0100010-KA0100010form2">
expj.KA0100010.KA0100010form2 = {};
expj.KA0100010.KA0100010form2.executeAllOnDecision = function () {
  console.log('execute KA0100010form2.onDecision');
};
expj.KA0100010.KA0100010form2.executeOnLoad = function () {
  expj.KA0100010.KA0100010form2.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KA0100010-KA0100010form2" action="KA0100010Servlet" name="KA0100010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CUST_NAME",rb)%></span><!-- 得意先名称 --></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010form2-CUST_NAME">
expj.KA0100010.KA0100010form2.CUST_NAME = {};
expj.KA0100010.KA0100010form2.CUST_NAME.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/CUST_NAME.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.CUST_NAME.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-CUST_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form2', 'CUST_NAME', this);
  });
  expj.KA0100010.KA0100010form2.CUST_NAME.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.CUST_NAME.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/CUST_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-CUST_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-KA0100010-KA0100010form2-CUST_NAME" name="CUST_NAME" class="KA0100010-focus-move  required-value expj-KA0100010-required-B" style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100010Struct.getCUST_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CUST_ANAME",rb)%></span><!-- 得意先略称 --></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010form2-CUST_ANAME">
expj.KA0100010.KA0100010form2.CUST_ANAME = {};
expj.KA0100010.KA0100010form2.CUST_ANAME.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/CUST_ANAME.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.CUST_ANAME.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-CUST_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form2', 'CUST_ANAME', this);
  });
  expj.KA0100010.KA0100010form2.CUST_ANAME.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.CUST_ANAME.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/CUST_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-CUST_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-KA0100010-KA0100010form2-CUST_ANAME" name="CUST_ANAME" class="KA0100010-focus-move  required-value expj-KA0100010-required-C" style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100010Struct.getCUST_ANAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_KNAME",rb)%></span><!-- 得意先カナ名称 --></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010form2-CUST_KNAME">
expj.KA0100010.KA0100010form2.CUST_KNAME = {};
expj.KA0100010.KA0100010form2.CUST_KNAME.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/CUST_KNAME.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.CUST_KNAME.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-CUST_KNAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form2', 'CUST_KNAME', this);
  });
  expj.KA0100010.KA0100010form2.CUST_KNAME.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.CUST_KNAME.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/CUST_KNAME.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-CUST_KNAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-KA0100010-KA0100010form2-CUST_KNAME" name="CUST_KNAME" class="KA0100010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100010Struct.getCUST_KNAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OWN_ORG_CD",rb)%></span><!-- 自社担当部門コード --></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010form2-OWN_ORG_CD">
expj.KA0100010.KA0100010form2.OWN_ORG_CD = {};
expj.KA0100010.KA0100010form2.OWN_ORG_CD.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/OWN_ORG_CD.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.OWN_ORG_CD.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-OWN_ORG_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form2', 'OWN_ORG_CD', this);
  });
  expj.KA0100010.KA0100010form2.OWN_ORG_CD.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.OWN_ORG_CD.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/OWN_ORG_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-OWN_ORG_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0100010-KA0100010form2-OWN_ORG_CD" name="OWN_ORG_CD" class="KA0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100010Struct.getOWN_ORG_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010form2-PeekerIOwnOrgCd">
expj.KA0100010.KA0100010form2.PeekerIOwnOrgCd = {};
// script1="onClick;0;PEEKER;_KA0100010form2/OWN_ORG_CD@<%=contextNo%>"
expj.KA0100010.KA0100010form2.PeekerIOwnOrgCd.onClick0 = function () {
  console.log('PeekerIOwnOrgCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KA0100010';
var parameterValues = 'PeekerIOwnOrgCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KA0100010', 'KA0100010form2', '_KA0100010form2/OWN_ORG_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ORG_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KA0100010form2/OWN_ORG_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KA0100010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KA0100010.KA0100010form2.PeekerIOwnOrgCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0100010.KA0100010form2.PeekerIOwnOrgCd['onClick' + i])) {
        expj.KA0100010.KA0100010form2.PeekerIOwnOrgCd['onClick' + i]();
      }
    }
  }
};
expj.KA0100010.KA0100010form2.PeekerIOwnOrgCd.executeAllOnDecision = function () {
};
expj.KA0100010.KA0100010form2.PeekerIOwnOrgCd.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-PeekerIOwnOrgCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0100010', 'KA0100010form2', 'PeekerIOwnOrgCd', this, 'Button');
    }
  });
  expj.KA0100010.KA0100010form2.PeekerIOwnOrgCd.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.PeekerIOwnOrgCd.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/PeekerIOwnOrgCd.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-PeekerIOwnOrgCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KA0100010-KA0100010form2-PeekerIOwnOrgCd" class="KA0100010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010form2-ORG_NAME">
expj.KA0100010.KA0100010form2.ORG_NAME = {};
expj.KA0100010.KA0100010form2.ORG_NAME.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/ORG_NAME.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.ORG_NAME.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-ORG_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form2', 'ORG_NAME', this);
  });
  expj.KA0100010.KA0100010form2.ORG_NAME.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.ORG_NAME.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/ORG_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-ORG_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KA0100010-KA0100010form2-ORG_NAME" name="ORG_NAME" class="KA0100010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100010Struct.getORG_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OWN_PERSON_CD",rb)%></span><!-- 自社担当者コード --></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010form2-OWN_PERSON_CD">
expj.KA0100010.KA0100010form2.OWN_PERSON_CD = {};
expj.KA0100010.KA0100010form2.OWN_PERSON_CD.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/OWN_PERSON_CD.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.OWN_PERSON_CD.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-OWN_PERSON_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form2', 'OWN_PERSON_CD', this);
  });
  expj.KA0100010.KA0100010form2.OWN_PERSON_CD.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.OWN_PERSON_CD.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/OWN_PERSON_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-OWN_PERSON_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0100010-KA0100010form2-OWN_PERSON_CD" name="OWN_PERSON_CD" class="KA0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100010Struct.getOWN_PERSON_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010form2-PeekerIOwnPerCd">
expj.KA0100010.KA0100010form2.PeekerIOwnPerCd = {};
// script1="onClick;0;PEEKER;_KA0100010form2/OWN_PERSON_CD@<%=contextNo%>"
expj.KA0100010.KA0100010form2.PeekerIOwnPerCd.onClick0 = function () {
  console.log('PeekerIOwnPerCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KA0100010';
var parameterValues = 'PeekerIOwnPerCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KA0100010', 'KA0100010form2', '_KA0100010form2/OWN_PERSON_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%USER_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KA0100010form2/OWN_PERSON_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KA0100010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KA0100010.KA0100010form2.PeekerIOwnPerCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0100010.KA0100010form2.PeekerIOwnPerCd['onClick' + i])) {
        expj.KA0100010.KA0100010form2.PeekerIOwnPerCd['onClick' + i]();
      }
    }
  }
};
expj.KA0100010.KA0100010form2.PeekerIOwnPerCd.executeAllOnDecision = function () {
};
expj.KA0100010.KA0100010form2.PeekerIOwnPerCd.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-PeekerIOwnPerCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0100010', 'KA0100010form2', 'PeekerIOwnPerCd', this, 'Button');
    }
  });
  expj.KA0100010.KA0100010form2.PeekerIOwnPerCd.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.PeekerIOwnPerCd.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/PeekerIOwnPerCd.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-PeekerIOwnPerCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KA0100010-KA0100010form2-PeekerIOwnPerCd" class="KA0100010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010form2-USER_NAME">
expj.KA0100010.KA0100010form2.USER_NAME = {};
expj.KA0100010.KA0100010form2.USER_NAME.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/USER_NAME.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.USER_NAME.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-USER_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form2', 'USER_NAME', this);
  });
  expj.KA0100010.KA0100010form2.USER_NAME.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.USER_NAME.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/USER_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-USER_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KA0100010-KA0100010form2-USER_NAME" name="USER_NAME" class="KA0100010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100010Struct.getUSER_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CUR_CD",rb)%></span><!-- 通貨コード --></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010form2-CUR_CD">
expj.KA0100010.KA0100010form2.CUR_CD = {};
expj.KA0100010.KA0100010form2.CUR_CD.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/CUR_CD.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.CUR_CD.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-CUR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form2', 'CUR_CD', this);
  });
  expj.KA0100010.KA0100010form2.CUR_CD.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.CUR_CD.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/CUR_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-CUR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0100010-KA0100010form2-CUR_CD" name="CUR_CD" class="KA0100010-focus-move  required-value expj-KA0100010-required-F" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100010Struct.getCUR_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-KA0100010-KA0100010form2-h_CUR_CD" name="h_CUR_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0100010Struct.geth_CUR_CD()) %>">
<script class="expj-script-KA0100010-KA0100010form2-h_CUR_CD">
expj.KA0100010.KA0100010form2.h_CUR_CD = {};
expj.KA0100010.KA0100010form2.h_CUR_CD.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/h_CUR_CD.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.h_CUR_CD.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-h_CUR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form2', 'h_CUR_CD', this);
  });
  expj.KA0100010.KA0100010form2.h_CUR_CD.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.h_CUR_CD.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/h_CUR_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-h_CUR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-KA0100010-KA0100010form2-PeekerICurCd">
expj.KA0100010.KA0100010form2.PeekerICurCd = {};
// script1="onClick;0;PEEKER;_KA0100010form2/CUR_CD@<%=contextNo%>"
expj.KA0100010.KA0100010form2.PeekerICurCd.onClick0 = function () {
  console.log('PeekerICurCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KA0100010';
var parameterValues = 'PeekerICurCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KA0100010', 'KA0100010form2', '_KA0100010form2/CUR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUR_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KA0100010form2/CUR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KA0100010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KA0100010.KA0100010form2.PeekerICurCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0100010.KA0100010form2.PeekerICurCd['onClick' + i])) {
        expj.KA0100010.KA0100010form2.PeekerICurCd['onClick' + i]();
      }
    }
  }
};
expj.KA0100010.KA0100010form2.PeekerICurCd.executeAllOnDecision = function () {
};
expj.KA0100010.KA0100010form2.PeekerICurCd.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-PeekerICurCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0100010', 'KA0100010form2', 'PeekerICurCd', this, 'Button');
    }
  });
  expj.KA0100010.KA0100010form2.PeekerICurCd.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.PeekerICurCd.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/PeekerICurCd.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-PeekerICurCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KA0100010-KA0100010form2-PeekerICurCd" class="KA0100010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010form2-CUR_NAME">
expj.KA0100010.KA0100010form2.CUR_NAME = {};
expj.KA0100010.KA0100010form2.CUR_NAME.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/CUR_NAME.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.CUR_NAME.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-CUR_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form2', 'CUR_NAME', this);
  });
  expj.KA0100010.KA0100010form2.CUR_NAME.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.CUR_NAME.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/CUR_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-CUR_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KA0100010-KA0100010form2-CUR_NAME" name="CUR_NAME" class="KA0100010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100010Struct.getCUR_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.INSPC_ACPT_TYP",rb)%></span><!-- 検収区分 --></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010form2-INSPC_ACPT_TYP">
expj.KA0100010.KA0100010form2.INSPC_ACPT_TYP = {};
expj.KA0100010.KA0100010form2.INSPC_ACPT_TYP.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/INSPC_ACPT_TYP.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.INSPC_ACPT_TYP.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-INSPC_ACPT_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('KA0100010', 'KA0100010form2', 'INSPC_ACPT_TYP', this);
  });
  expj.KA0100010.KA0100010form2.INSPC_ACPT_TYP.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.INSPC_ACPT_TYP.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/INSPC_ACPT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-INSPC_ACPT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-KA0100010-KA0100010form2-INSPC_ACPT_TYP" name='INSPC_ACPT_TYP' class='KA0100010-focus-move' style='width:260px;'><%  for(int i = 0, size = aKA0100010Control.getStruct().getList_INSPC_ACPT_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aKA0100010Control.getStruct().getList_INSPC_ACPT_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aKA0100010Control.getStruct().getList_INSPC_ACPT_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aKA0100010Struct.getINSPC_ACPT_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-KA0100010-KA0100010form2-h_INSPC_ACPT_TYP" name="h_INSPC_ACPT_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0100010Struct.geth_INSPC_ACPT_TYP()) %>">
<script class="expj-script-KA0100010-KA0100010form2-h_INSPC_ACPT_TYP">
expj.KA0100010.KA0100010form2.h_INSPC_ACPT_TYP = {};
expj.KA0100010.KA0100010form2.h_INSPC_ACPT_TYP.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/h_INSPC_ACPT_TYP.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.h_INSPC_ACPT_TYP.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-h_INSPC_ACPT_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form2', 'h_INSPC_ACPT_TYP', this);
  });
  expj.KA0100010.KA0100010form2.h_INSPC_ACPT_TYP.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.h_INSPC_ACPT_TYP.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/h_INSPC_ACPT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-h_INSPC_ACPT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.EXCH_TYP",rb)%></span><!-- 為替種別 --></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010form2-EXCH_TYP">
expj.KA0100010.KA0100010form2.EXCH_TYP = {};
expj.KA0100010.KA0100010form2.EXCH_TYP.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/EXCH_TYP.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.EXCH_TYP.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-EXCH_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('KA0100010', 'KA0100010form2', 'EXCH_TYP', this);
  });
  expj.KA0100010.KA0100010form2.EXCH_TYP.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.EXCH_TYP.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/EXCH_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-EXCH_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-KA0100010-KA0100010form2-EXCH_TYP" name='EXCH_TYP' class='KA0100010-focus-move' style='width:260px;'><%  for(int i = 0, size = aKA0100010Control.getStruct().getList_EXCH_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aKA0100010Control.getStruct().getList_EXCH_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aKA0100010Control.getStruct().getList_EXCH_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aKA0100010Struct.getEXCH_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.TAX_CD",rb)%></span><!-- 消費税コード --></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010form2-TAX_CD">
expj.KA0100010.KA0100010form2.TAX_CD = {};
expj.KA0100010.KA0100010form2.TAX_CD.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/TAX_CD.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.TAX_CD.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-TAX_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form2', 'TAX_CD', this);
  });
  expj.KA0100010.KA0100010form2.TAX_CD.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.TAX_CD.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/TAX_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-TAX_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0100010-KA0100010form2-TAX_CD" name="TAX_CD" class="KA0100010-focus-move  required-value expj-KA0100010-required-D" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100010Struct.getTAX_CD()) %>" maxlength="3" ></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010form2-PeekerITaxCd">
expj.KA0100010.KA0100010form2.PeekerITaxCd = {};
// script1="onClick;0;PEEKER;_KA0100010form2/TAX_CD@<%=contextNo%>"
expj.KA0100010.KA0100010form2.PeekerITaxCd.onClick0 = function () {
  console.log('PeekerITaxCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KA0100010';
var parameterValues = 'PeekerITaxCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KA0100010', 'KA0100010form2', '_KA0100010form2/TAX_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%TAX_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KA0100010form2/TAX_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KA0100010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KA0100010.KA0100010form2.PeekerITaxCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0100010.KA0100010form2.PeekerITaxCd['onClick' + i])) {
        expj.KA0100010.KA0100010form2.PeekerITaxCd['onClick' + i]();
      }
    }
  }
};
expj.KA0100010.KA0100010form2.PeekerITaxCd.executeAllOnDecision = function () {
};
expj.KA0100010.KA0100010form2.PeekerITaxCd.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-PeekerITaxCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0100010', 'KA0100010form2', 'PeekerITaxCd', this, 'Button');
    }
  });
  expj.KA0100010.KA0100010form2.PeekerITaxCd.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.PeekerITaxCd.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/PeekerITaxCd.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-PeekerITaxCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KA0100010-KA0100010form2-PeekerITaxCd" class="KA0100010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010form2-TAX_NAME">
expj.KA0100010.KA0100010form2.TAX_NAME = {};
expj.KA0100010.KA0100010form2.TAX_NAME.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/TAX_NAME.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.TAX_NAME.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-TAX_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form2', 'TAX_NAME', this);
  });
  expj.KA0100010.KA0100010form2.TAX_NAME.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.TAX_NAME.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/TAX_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-TAX_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KA0100010-KA0100010form2-TAX_NAME" name="TAX_NAME" class="KA0100010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100010Struct.getTAX_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.TAX_CALC_TYP",rb)%></span><!-- 消費税計算区分 --></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010form2-TAX_CALC_TYP">
expj.KA0100010.KA0100010form2.TAX_CALC_TYP = {};
expj.KA0100010.KA0100010form2.TAX_CALC_TYP.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/TAX_CALC_TYP.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.TAX_CALC_TYP.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-TAX_CALC_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('KA0100010', 'KA0100010form2', 'TAX_CALC_TYP', this);
  });
  expj.KA0100010.KA0100010form2.TAX_CALC_TYP.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.TAX_CALC_TYP.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/TAX_CALC_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-TAX_CALC_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-KA0100010-KA0100010form2-TAX_CALC_TYP" name='TAX_CALC_TYP' class='KA0100010-focus-move' style='width:260px;'><%  for(int i = 0, size = aKA0100010Control.getStruct().getList_TAX_CALC_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aKA0100010Control.getStruct().getList_TAX_CALC_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aKA0100010Control.getStruct().getList_TAX_CALC_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aKA0100010Struct.getTAX_CALC_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-KA0100010-KA0100010form2-h_TAX_CALC_TYP" name="h_TAX_CALC_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0100010Struct.geth_TAX_CALC_TYP()) %>">
<script class="expj-script-KA0100010-KA0100010form2-h_TAX_CALC_TYP">
expj.KA0100010.KA0100010form2.h_TAX_CALC_TYP = {};
expj.KA0100010.KA0100010form2.h_TAX_CALC_TYP.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/h_TAX_CALC_TYP.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.h_TAX_CALC_TYP.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-h_TAX_CALC_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form2', 'h_TAX_CALC_TYP', this);
  });
  expj.KA0100010.KA0100010form2.h_TAX_CALC_TYP.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.h_TAX_CALC_TYP.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/h_TAX_CALC_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-h_TAX_CALC_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.TAX_APPLY_TYP",rb)%></span><!-- 消費税適用区分 --></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010form2-TAX_APPLY_TYP">
expj.KA0100010.KA0100010form2.TAX_APPLY_TYP = {};
expj.KA0100010.KA0100010form2.TAX_APPLY_TYP.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/TAX_APPLY_TYP.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.TAX_APPLY_TYP.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-TAX_APPLY_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('KA0100010', 'KA0100010form2', 'TAX_APPLY_TYP', this);
  });
  expj.KA0100010.KA0100010form2.TAX_APPLY_TYP.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.TAX_APPLY_TYP.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/TAX_APPLY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-TAX_APPLY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-KA0100010-KA0100010form2-TAX_APPLY_TYP" name='TAX_APPLY_TYP' class='KA0100010-focus-move' style='width:260px;'><%  for(int i = 0, size = aKA0100010Control.getStruct().getList_TAX_APPLY_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aKA0100010Control.getStruct().getList_TAX_APPLY_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aKA0100010Control.getStruct().getList_TAX_APPLY_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aKA0100010Struct.getTAX_APPLY_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DETAIL_ROUND_TYP",rb)%></span><!-- 明細計算まるめ区分 --></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010form2-DETAIL_ROUND_TYP">
expj.KA0100010.KA0100010form2.DETAIL_ROUND_TYP = {};
expj.KA0100010.KA0100010form2.DETAIL_ROUND_TYP.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/DETAIL_ROUND_TYP.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.DETAIL_ROUND_TYP.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-DETAIL_ROUND_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('KA0100010', 'KA0100010form2', 'DETAIL_ROUND_TYP', this);
  });
  expj.KA0100010.KA0100010form2.DETAIL_ROUND_TYP.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.DETAIL_ROUND_TYP.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/DETAIL_ROUND_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-DETAIL_ROUND_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-KA0100010-KA0100010form2-DETAIL_ROUND_TYP" name='DETAIL_ROUND_TYP' class='KA0100010-focus-move' style='width:260px;'><%  for(int i = 0, size = aKA0100010Control.getStruct().getList_DETAIL_ROUND_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aKA0100010Control.getStruct().getList_DETAIL_ROUND_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aKA0100010Control.getStruct().getList_DETAIL_ROUND_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aKA0100010Struct.getDETAIL_ROUND_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-KA0100010-KA0100010form2-h_PRICE_ROUND_TYP" name="h_PRICE_ROUND_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0100010Struct.geth_PRICE_ROUND_TYP()) %>">
<script class="expj-script-KA0100010-KA0100010form2-h_PRICE_ROUND_TYP">
expj.KA0100010.KA0100010form2.h_PRICE_ROUND_TYP = {};
expj.KA0100010.KA0100010form2.h_PRICE_ROUND_TYP.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/h_PRICE_ROUND_TYP.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.h_PRICE_ROUND_TYP.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-h_PRICE_ROUND_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form2', 'h_PRICE_ROUND_TYP', this);
  });
  expj.KA0100010.KA0100010form2.h_PRICE_ROUND_TYP.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.h_PRICE_ROUND_TYP.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/h_PRICE_ROUND_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-h_PRICE_ROUND_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<input type="hidden" id="expj-KA0100010-KA0100010form2-PRICE_ROUND_TYP" name="PRICE_ROUND_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0100010Struct.getPRICE_ROUND_TYP()) %>">
<script class="expj-script-KA0100010-KA0100010form2-PRICE_ROUND_TYP">
expj.KA0100010.KA0100010form2.PRICE_ROUND_TYP = {};
expj.KA0100010.KA0100010form2.PRICE_ROUND_TYP.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/PRICE_ROUND_TYP.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.PRICE_ROUND_TYP.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-PRICE_ROUND_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form2', 'PRICE_ROUND_TYP', this);
  });
  expj.KA0100010.KA0100010form2.PRICE_ROUND_TYP.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.PRICE_ROUND_TYP.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/PRICE_ROUND_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-PRICE_ROUND_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.EDI_CUST_VEND_CD",rb)%></span><!-- EDI相手取引先コード --></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010form2-EDI_CUST_VEND_CD">
expj.KA0100010.KA0100010form2.EDI_CUST_VEND_CD = {};
expj.KA0100010.KA0100010form2.EDI_CUST_VEND_CD.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/EDI_CUST_VEND_CD.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.EDI_CUST_VEND_CD.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-EDI_CUST_VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form2', 'EDI_CUST_VEND_CD', this);
  });
  expj.KA0100010.KA0100010form2.EDI_CUST_VEND_CD.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.EDI_CUST_VEND_CD.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/EDI_CUST_VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-EDI_CUST_VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0100010-KA0100010form2-EDI_CUST_VEND_CD" name="EDI_CUST_VEND_CD" class="KA0100010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100010Struct.getEDI_CUST_VEND_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PARTIAL_SHIP_INST_FLG",rb)%></span><!-- 分納出荷指示F --></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010form2-PARTIAL_SHIP_INST_FLG">
expj.KA0100010.KA0100010form2.PARTIAL_SHIP_INST_FLG = {};
expj.KA0100010.KA0100010form2.PARTIAL_SHIP_INST_FLG.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/PARTIAL_SHIP_INST_FLG.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.PARTIAL_SHIP_INST_FLG.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-PARTIAL_SHIP_INST_FLG').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('KA0100010', 'KA0100010form2', 'PARTIAL_SHIP_INST_FLG', this);
  });
  expj.KA0100010.KA0100010form2.PARTIAL_SHIP_INST_FLG.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.PARTIAL_SHIP_INST_FLG.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/PARTIAL_SHIP_INST_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-PARTIAL_SHIP_INST_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-KA0100010-KA0100010form2-PARTIAL_SHIP_INST_FLG" name='PARTIAL_SHIP_INST_FLG' class='KA0100010-focus-move' style='width:260px;'><%  for(int i = 0, size = aKA0100010Control.getStruct().getList_PARTIAL_SHIP_INST_FLG_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aKA0100010Control.getStruct().getList_PARTIAL_SHIP_INST_FLG_name().get(i));    String val = TypeConverter.sanitizer((String)aKA0100010Control.getStruct().getList_PARTIAL_SHIP_INST_FLG_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aKA0100010Struct.getPARTIAL_SHIP_INST_FLG()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3165",rb)%></span><!-- 承認備考 --></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010form2-APPR_REMARKS">
expj.KA0100010.KA0100010form2.APPR_REMARKS = {};
expj.KA0100010.KA0100010form2.APPR_REMARKS.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/APPR_REMARKS.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.APPR_REMARKS.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-APPR_REMARKS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form2', 'APPR_REMARKS', this);
  });
  expj.KA0100010.KA0100010form2.APPR_REMARKS.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.APPR_REMARKS.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/APPR_REMARKS.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-APPR_REMARKS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KA0100010-KA0100010form2-APPR_REMARKS" name="APPR_REMARKS" class="KA0100010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0100010Struct.getAPPR_REMARKS()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<input type="hidden" id="expj-KA0100010-KA0100010form2-UNCONFIRM_ODR_EFF_PRIOD" name="UNCONFIRM_ODR_EFF_PRIOD" class="expj-KA0100010-required-E" data-kind="OBT_INTEGER;6" maxlength="6" value="<%= TypeConverter.sanitizer(aKA0100010Struct.getUNCONFIRM_ODR_EFF_PRIOD()) %>">
<script class="expj-script-KA0100010-KA0100010form2-UNCONFIRM_ODR_EFF_PRIOD">
expj.KA0100010.KA0100010form2.UNCONFIRM_ODR_EFF_PRIOD = {};
expj.KA0100010.KA0100010form2.UNCONFIRM_ODR_EFF_PRIOD.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/UNCONFIRM_ODR_EFF_PRIOD.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.UNCONFIRM_ODR_EFF_PRIOD.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-UNCONFIRM_ODR_EFF_PRIOD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form2', 'UNCONFIRM_ODR_EFF_PRIOD', this);
  });
  expj.KA0100010.KA0100010form2.UNCONFIRM_ODR_EFF_PRIOD.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.UNCONFIRM_ODR_EFF_PRIOD.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/UNCONFIRM_ODR_EFF_PRIOD.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-UNCONFIRM_ODR_EFF_PRIOD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<input type="hidden" id="expj-KA0100010-KA0100010form2-UNCONFIRM_ODR_EFF_TERM_FLG" name="UNCONFIRM_ODR_EFF_TERM_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0100010Struct.getUNCONFIRM_ODR_EFF_TERM_FLG()) %>">
<script class="expj-script-KA0100010-KA0100010form2-UNCONFIRM_ODR_EFF_TERM_FLG">
expj.KA0100010.KA0100010form2.UNCONFIRM_ODR_EFF_TERM_FLG = {};
expj.KA0100010.KA0100010form2.UNCONFIRM_ODR_EFF_TERM_FLG.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/UNCONFIRM_ODR_EFF_TERM_FLG.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.UNCONFIRM_ODR_EFF_TERM_FLG.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-UNCONFIRM_ODR_EFF_TERM_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form2', 'UNCONFIRM_ODR_EFF_TERM_FLG', this);
  });
  expj.KA0100010.KA0100010form2.UNCONFIRM_ODR_EFF_TERM_FLG.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.UNCONFIRM_ODR_EFF_TERM_FLG.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/UNCONFIRM_ODR_EFF_TERM_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-UNCONFIRM_ODR_EFF_TERM_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<input type="hidden" id="expj-KA0100010-KA0100010form2-h_MODE" name="h_MODE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0100010Control.getMode()) %>">
<script class="expj-script-KA0100010-KA0100010form2-h_MODE">
expj.KA0100010.KA0100010form2.h_MODE = {};
expj.KA0100010.KA0100010form2.h_MODE.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/h_MODE.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.h_MODE.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-h_MODE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form2', 'h_MODE', this);
  });
  expj.KA0100010.KA0100010form2.h_MODE.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.h_MODE.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/h_MODE.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-h_MODE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KA0100010-KA0100010form2-h_RESULT" name="h_RESULT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0100010Struct.geth_RESULT()) %>">
<script class="expj-script-KA0100010-KA0100010form2-h_RESULT">
expj.KA0100010.KA0100010form2.h_RESULT = {};
expj.KA0100010.KA0100010form2.h_RESULT.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/h_RESULT.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.h_RESULT.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-h_RESULT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form2', 'h_RESULT', this);
  });
  expj.KA0100010.KA0100010form2.h_RESULT.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.h_RESULT.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/h_RESULT.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-h_RESULT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KA0100010-KA0100010form2-k_MODE" name="k_MODE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0100010Struct.getk_MODE()) %>">
<script class="expj-script-KA0100010-KA0100010form2-k_MODE">
expj.KA0100010.KA0100010form2.k_MODE = {};
expj.KA0100010.KA0100010form2.k_MODE.executeAllOnDecision = function () {
  console.log('execute KA0100010form2/k_MODE.onDecision');
  expj.KA0100010.KA0100010form2.executeAllOnDecision();
  expj.KA0100010.executeAllOnDecision();
};
expj.KA0100010.KA0100010form2.k_MODE.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010form2-k_MODE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0100010', 'KA0100010form2', 'k_MODE', this);
  });
  expj.KA0100010.KA0100010form2.k_MODE.executePScriptOnLoad();
};

expj.KA0100010.KA0100010form2.k_MODE.executePScriptOnLoad = function () {
  console.log('execute KA0100010form2/k_MODE.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010form2-k_MODE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-KA0100010-KA0100010button2">
expj.KA0100010.KA0100010button2 = {};
expj.KA0100010.KA0100010button2.executeAllOnDecision = function () {
  console.log('execute KA0100010button2.onDecision');
};
expj.KA0100010.KA0100010button2.executeOnLoad = function () {
  expj.KA0100010.KA0100010button2.executePScriptOnLoad();
};

expj.KA0100010.KA0100010button2.executePScriptOnLoad = function () {
  console.log('execute KA0100010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KA0100010-KA0100010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KA0100010-KA0100010button2-insert">
expj.KA0100010.KA0100010button2.insert = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KA0100010form1/*,_KA0100010form2/*@KA0100010Servlet,,$ZZ07001"
expj.KA0100010.KA0100010button2.insert.onClick0 = function () {
  console.log('insert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0100010', 'KA0100010button2', '_KA0100010form1/*,_KA0100010form2/*', 'KA0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0100010', response);
expj.common.updateBusinessScreenTab('KA0100010', contents);
};
expj.common.pscript.callConfirm('KA0100010', 'KA0100010button2', 'ZZ07001', okEvent);
};
expj.KA0100010.KA0100010button2.insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0100010.KA0100010button2.insert['onClick' + i])) {
        expj.KA0100010.KA0100010button2.insert['onClick' + i]();
      }
    }
  }
};
expj.KA0100010.KA0100010button2.insert.executeAllOnDecision = function () {
};
expj.KA0100010.KA0100010button2.insert.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010button2-insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0100010', 'KA0100010button2', 'insert', this, 'Button');
    }
  });
  expj.KA0100010.KA0100010button2.insert.executePScriptOnLoad();
};

expj.KA0100010.KA0100010button2.insert.executePScriptOnLoad = function () {
  console.log('execute KA0100010button2/insert.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010button2-insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0100010-KA0100010button2-insert" name="insert" class="KA0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010button2-update">
expj.KA0100010.KA0100010button2.update = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KA0100010form1/*,_KA0100010form2/*@KA0100010Servlet,,$ZZ07003"
expj.KA0100010.KA0100010button2.update.onClick0 = function () {
  console.log('update script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0100010', 'KA0100010button2', '_KA0100010form1/*,_KA0100010form2/*', 'KA0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0100010', response);
expj.common.updateBusinessScreenTab('KA0100010', contents);
};
expj.common.pscript.callConfirm('KA0100010', 'KA0100010button2', 'ZZ07003', okEvent);
};
expj.KA0100010.KA0100010button2.update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0100010.KA0100010button2.update['onClick' + i])) {
        expj.KA0100010.KA0100010button2.update['onClick' + i]();
      }
    }
  }
};
expj.KA0100010.KA0100010button2.update.executeAllOnDecision = function () {
};
expj.KA0100010.KA0100010button2.update.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010button2-update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0100010', 'KA0100010button2', 'update', this, 'Button');
    }
  });
  expj.KA0100010.KA0100010button2.update.executePScriptOnLoad();
};

expj.KA0100010.KA0100010button2.update.executePScriptOnLoad = function () {
  console.log('execute KA0100010button2/update.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010button2-update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0100010-KA0100010button2-update" name="update" class="KA0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010button2-delete">
expj.KA0100010.KA0100010button2.delete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KA0100010form1/*,_KA0100010form2/*@KA0100010Servlet,,$ZZ07004"
expj.KA0100010.KA0100010button2.delete.onClick0 = function () {
  console.log('delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0100010', 'KA0100010button2', '_KA0100010form1/*,_KA0100010form2/*', 'KA0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0100010', response);
expj.common.updateBusinessScreenTab('KA0100010', contents);
};
expj.common.pscript.callConfirm('KA0100010', 'KA0100010button2', 'ZZ07004', okEvent);
};
expj.KA0100010.KA0100010button2.delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0100010.KA0100010button2.delete['onClick' + i])) {
        expj.KA0100010.KA0100010button2.delete['onClick' + i]();
      }
    }
  }
};
expj.KA0100010.KA0100010button2.delete.executeAllOnDecision = function () {
};
expj.KA0100010.KA0100010button2.delete.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010button2-delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0100010', 'KA0100010button2', 'delete', this, 'Button');
    }
  });
  expj.KA0100010.KA0100010button2.delete.executePScriptOnLoad();
};

expj.KA0100010.KA0100010button2.delete.executePScriptOnLoad = function () {
  console.log('execute KA0100010button2/delete.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010button2-delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0100010-KA0100010button2-delete" name="delete" class="KA0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
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
<span class="version">KA0100010 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KA0100010-KA0100010button0">
expj.KA0100010.KA0100010button0 = {};
expj.KA0100010.KA0100010button0.executeAllOnDecision = function () {
  console.log('execute KA0100010button0.onDecision');
};
expj.KA0100010.KA0100010button0.executeOnLoad = function () {
  expj.KA0100010.KA0100010button0.executePScriptOnLoad();
};

expj.KA0100010.KA0100010button0.executePScriptOnLoad = function () {
  console.log('execute KA0100010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KA0100010-KA0100010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KA0100010-KA0100010button0-clear">
expj.KA0100010.KA0100010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KA0100010form1/*@KA0100010Servlet,,$ZZ07008"
expj.KA0100010.KA0100010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0100010', 'KA0100010button0', '_KA0100010form1/*', 'KA0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0100010', response);
expj.common.updateBusinessScreenTab('KA0100010', contents);
};
expj.common.pscript.callConfirm('KA0100010', 'KA0100010button0', 'ZZ07008', okEvent);
};
expj.KA0100010.KA0100010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0100010.KA0100010button0.clear['onClick' + i])) {
        expj.KA0100010.KA0100010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.KA0100010.KA0100010button0.clear.executeAllOnDecision = function () {
};
expj.KA0100010.KA0100010button0.clear.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0100010', 'KA0100010button0', 'clear', this, 'Button');
    }
  });
  expj.KA0100010.KA0100010button0.clear.executePScriptOnLoad();
};

expj.KA0100010.KA0100010button0.clear.executePScriptOnLoad = function () {
  console.log('execute KA0100010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0100010-KA0100010button0-clear" name="clear" class="KA0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KA0100010-KA0100010button0-close">
expj.KA0100010.KA0100010button0.close = {};
// script1="onClick;0;CLOSE"
expj.KA0100010.KA0100010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('KA0100010');
};
expj.KA0100010.KA0100010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0100010.KA0100010button0.close['onClick' + i])) {
        expj.KA0100010.KA0100010button0.close['onClick' + i]();
      }
    }
  }
};
expj.KA0100010.KA0100010button0.close.executeAllOnDecision = function () {
};
expj.KA0100010.KA0100010button0.close.executeOnLoad = function () {
  $('#expj-KA0100010-KA0100010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0100010', 'KA0100010button0', 'close', this, 'Button');
    }
  });
  expj.KA0100010.KA0100010button0.close.executePScriptOnLoad();
};

expj.KA0100010.KA0100010button0.close.executePScriptOnLoad = function () {
  console.log('execute KA0100010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-KA0100010-KA0100010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0100010-KA0100010button0-close" name="close" class="KA0100010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
<!--six end --></div><!-- /table1 -->
</div><!-- expj-business-screen-KA0100010 (END)-->
<%
MessageStruct msgStruct = aKA0100010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KA0100010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KA0100010)) {
  expj.common.treeInstanceMap.KA0100010 = {};
}
expj.common.treeInstanceMap.KA0100010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KA0100010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KA0100010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KA0100010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KA0100010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KA0100010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KA0100010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KA0100010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KA0100010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KA0100010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KA0100010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0100010)) {
  expj.common.detailDialogMap.KA0100010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0100010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KA0100010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0100010.<%=detailId %>)) {
  expj.common.detailDialogMap.KA0100010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0100010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KA0100010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0100010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KA0100010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KA0100010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KA0100010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KA0100010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KA0100010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KA0100010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KA0100010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KA0100010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KA0100010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KA0100010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KA0100010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KA0100010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KA0100010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KA0100010)) {
  expj.common.viewInstanceMap.KA0100010 = {};
}
expj.common.viewInstanceMap.KA0100010.<%=viewId %> = {};
expj.common.viewInstanceMap.KA0100010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KA0100010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KA0100010.<%=viewId %>.init = function () {
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
    expj.KA0100010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KA0100010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KA0100010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KA0100010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KA0100010_init">
/**
 * KA0100010用のロード完了時初期化関数
 */
expj.KA0100010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KA0100010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KA0100010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KA0100010');
  expj.common.calendarInstanceMap.KA0100010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KA0100010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KA0100010.<%=detailId %>.init();
  expj.common.detailDialogMap.KA0100010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KA0100010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KA0100010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KA0100010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KA0100010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KA0100010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KA0100010-<%=detailId %>');
<%
 }
%>
  try{expj.KA0100010.KA0100010form1.CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form1.h_CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form1.PeekerICustCd.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form1.h_APR_CUST.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form1.h_SCREENMOVE_TYP.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form1.h_APPR_ID.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010button1.select.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.CUST_NAME.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.CUST_ANAME.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.CUST_KNAME.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.OWN_ORG_CD.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.PeekerIOwnOrgCd.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.ORG_NAME.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.OWN_PERSON_CD.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.PeekerIOwnPerCd.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.USER_NAME.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.CUR_CD.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.h_CUR_CD.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.PeekerICurCd.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.CUR_NAME.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.INSPC_ACPT_TYP.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.h_INSPC_ACPT_TYP.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.EXCH_TYP.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.TAX_CD.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.PeekerITaxCd.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.TAX_NAME.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.TAX_CALC_TYP.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.h_TAX_CALC_TYP.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.TAX_APPLY_TYP.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.DETAIL_ROUND_TYP.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.h_PRICE_ROUND_TYP.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.PRICE_ROUND_TYP.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.EDI_CUST_VEND_CD.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.PARTIAL_SHIP_INST_FLG.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.APPR_REMARKS.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.UNCONFIRM_ODR_EFF_PRIOD.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.UNCONFIRM_ODR_EFF_TERM_FLG.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.h_MODE.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.h_RESULT.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.k_MODE.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010button2.insert.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010button2.update.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010button2.delete.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010button0.clear.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010button0.close.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form1.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010button1.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010form2.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010button2.executeOnLoad();}catch(e){};
  try{expj.KA0100010.KA0100010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KA0100010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KA0100010', 'KA0100010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KA0100010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KA0100010-focus-move');
  // 初期フォーカス当てる処理
  $('.KA0100010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KA0100010', '<%=request.getContextPath() %>');
};

/**
 * KA0100010の全体onDecision処理
 */
expj.KA0100010.executeAllOnDecision = function () {
  expj.KA0100010.KA0100010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KA0100010_console">
expj.KA0100010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>