<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:59:27 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KQ0010\KQ0010010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KQ0010.*" %>
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
<jsp:useBean id="aKQ0010010Control" class="com.nec.jp.orteus.metamorBase.KQ0010.KQ0010010Control" scope="request"/>
<jsp:useBean id="aKQ0010010Struct" class="com.nec.jp.orteus.metamorBase.KQ0010.KQ0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

受注登録
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0010/jsp/KQ0010010.jsp,v $
$Author: geng-jia $
$Revision: 1.28 $ $Date: 2017/02/22 02:07:10 $
********************************************************* --%>
<html>
<head>
<title>受注登録</title>
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
<script class="expj-script-KQ0010010_init">
  // KQ0010010名前空間
  expj.KQ0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
	<div id="expj-business-screen-KQ0010010" data-screen="KQ0010010" data-newdata="<%=aKQ0010010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style="width:968px;"></div><!--/td-->

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
              <!-- ここに上段検索条件用のDataGridを配置する。↓ -->
              <script class="expj-script-KQ0010010-KQ0010010view1">
expj.KQ0010010.KQ0010010view1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.KQ0010010.KQ0010010view1.onLoad0 = function () {
  console.log('KQ0010010view1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHKRQ;A@*0,*3"
expj.KQ0010010.KQ0010010view1.onDecision0 = function () {
  console.log('KQ0010010view1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('KQ0010010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script3="onDecision;1;CHKRQ;?KQ0010010view1/?[eq]SINGLE@*4,*8"
expj.KQ0010010.KQ0010010view1.onDecision1 = function () {
  console.log('KQ0010010view1 script3');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '?KQ0010010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script4="onDecision;2;CHK;?KQ0010010view1/*[eq]NORMAL[or]?KQ0010010view1/*[eq]TOO_MANY@*9,*10"
expj.KQ0010010.KQ0010010view1.onDecision2 = function () {
  console.log('KQ0010010view1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '?KQ0010010view1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '?KQ0010010view1/*'), '[eq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script5="child;0;CHK;_KQ0010010form1/c_INPUTODRCD[eq]true@*1,*2"
expj.KQ0010010.KQ0010010view1.child0 = function () {
  console.log('KQ0010010view1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/c_INPUTODRCD'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script6="child;1;CHK;_KQ0010010form1/JOB_ODR_CD[eq]@*3,*2"
expj.KQ0010010.KQ0010010view1.child1 = function () {
  console.log('KQ0010010view1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/JOB_ODR_CD'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script7="child;2;UNMASK;_KQ0010010button2/Addition"
expj.KQ0010010.KQ0010010view1.child2 = function () {
  console.log('KQ0010010view1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010010', 'KQ0010010view1', '_KQ0010010button2/Addition');
};
// script8="child;3;MASK;_KQ0010010button2/Addition"
expj.KQ0010010.KQ0010010view1.child3 = function () {
  console.log('KQ0010010view1 script8');
expj.common.pscript.setMaskToReferenceComponent('KQ0010010', 'KQ0010010view1', '_KQ0010010button2/Addition');
};
// script9="child;4;CHKRQ;A@*5,*6"
expj.KQ0010010.KQ0010010view1.child4 = function () {
  console.log('KQ0010010view1 script9');
if (expj.common.pscript.satisfiedRequiredComponent('KQ0010010', 'A')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script10="child;5;CHK;_KQ0010010form1/c_INPUTODRCD[eq]true@*6,*7"
expj.KQ0010010.KQ0010010view1.child5 = function () {
  console.log('KQ0010010view1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/c_INPUTODRCD'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script11="child;6;CHK;_KQ0010010form1/JOB_ODR_CD[eq]@*8,*7"
expj.KQ0010010.KQ0010010view1.child6 = function () {
  console.log('KQ0010010view1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/JOB_ODR_CD'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script12="child;7;UNMASK;_KQ0010010button2/Modify,_KQ0010010button2/Eliminate"
expj.KQ0010010.KQ0010010view1.child7 = function () {
  console.log('KQ0010010view1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010010', 'KQ0010010view1', '_KQ0010010button2/Modify');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010010', 'KQ0010010view1', '_KQ0010010button2/Eliminate');
};
// script13="child;8;MASK;_KQ0010010button2/Modify,_KQ0010010button2/Eliminate"
expj.KQ0010010.KQ0010010view1.child8 = function () {
  console.log('KQ0010010view1 script13');
expj.common.pscript.setMaskToReferenceComponent('KQ0010010', 'KQ0010010view1', '_KQ0010010button2/Modify');
expj.common.pscript.setMaskToReferenceComponent('KQ0010010', 'KQ0010010view1', '_KQ0010010button2/Eliminate');
};
// script14="child;9;UNMASK;_KQ0010010button0/Insert"
expj.KQ0010010.KQ0010010view1.child9 = function () {
  console.log('KQ0010010view1 script14');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010010', 'KQ0010010view1', '_KQ0010010button0/Insert');
};
// script15="child;10;MASK;_KQ0010010button0/Insert"
expj.KQ0010010.KQ0010010view1.child10 = function () {
  console.log('KQ0010010view1 script15');
expj.common.pscript.setMaskToReferenceComponent('KQ0010010', 'KQ0010010view1', '_KQ0010010button0/Insert');
};
// script16="onClick;0;SET;_KQ0010010form1/NO=_KQ0010010view1/l_NO,_KQ0010010form1/ODR_TYP=_KQ0010010view1/l_ODR_TYP,_KQ0010010form1/CUST_ODR_NO=_KQ0010010view1/l_CUST_ODR_NO,_KQ0010010form1/CUST_CD=_KQ0010010view1/l_CUST_CD,_KQ0010010form1/CUST_ITEM_CD=_KQ0010010view1/l_CUST_ITEM_CD,_KQ0010010form1/DLV_LOC_CD=_KQ0010010view1/l_DLV_LOC_CD,_KQ0010010form1/DESINATED_DLV_DATE=_KQ0010010view1/l_DESINATED_DLV_DATE,_KQ0010010form1/ODR_QTY=_KQ0010010view1/l_ODR_QTY,_KQ0010010form1/SPCL_PRICE_TYP=_KQ0010010view1/l_SPCL_PRICE_TYP,_KQ0010010form1/ODR_UNIT_PRICE=_KQ0010010view1/l_ODR_UNIT_PRICE,_KQ0010010form1/REMARKS=_KQ0010010view1/l_REMARKS,_KQ0010010form1/ODR_ACPT_DATE=_KQ0010010view1/l_ODR_ACPT_DATE,_KQ0010010form1/JOB_ODR_CD=_KQ0010010view1/l_JOB_ODR_CD,_KQ0010010form1/JOB_ODR_QTY=_KQ0010010view1/l_JOB_ODR_QTY,_KQ0010010form1/JOB_ODR_DLV_DATE=_KQ0010010view1/l_JOB_ODR_DLV_DATE,_KQ0010010form1/ALC_GRP_CD=_KQ0010010view1/l_ALC_GRP_CD,_KQ0010010form1/APPR_REMARKS=_KQ0010010view1/l_APPR_REMARKS@*11"
expj.KQ0010010.KQ0010010view1.onClick0 = function () {
  console.log('KQ0010010view1 script16');
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/NO', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010view1/l_NO'));
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/ODR_TYP', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010view1/l_ODR_TYP'));
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/CUST_ODR_NO', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010view1/l_CUST_ODR_NO'));
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/CUST_CD', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010view1/l_CUST_CD'));
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/CUST_ITEM_CD', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010view1/l_CUST_ITEM_CD'));
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/DLV_LOC_CD', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010view1/l_DLV_LOC_CD'));
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/DESINATED_DLV_DATE', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010view1/l_DESINATED_DLV_DATE'));
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/ODR_QTY', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010view1/l_ODR_QTY'));
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/SPCL_PRICE_TYP', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010view1/l_SPCL_PRICE_TYP'));
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/ODR_UNIT_PRICE', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010view1/l_ODR_UNIT_PRICE'));
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/REMARKS', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010view1/l_REMARKS'));
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/ODR_ACPT_DATE', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010view1/l_ODR_ACPT_DATE'));
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/JOB_ODR_CD', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010view1/l_JOB_ODR_CD'));
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/JOB_ODR_QTY', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010view1/l_JOB_ODR_QTY'));
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/JOB_ODR_DLV_DATE', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010view1/l_JOB_ODR_DLV_DATE'));
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/ALC_GRP_CD', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010view1/l_ALC_GRP_CD'));
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/APPR_REMARKS', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010view1/l_APPR_REMARKS'));
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child11)){this.child11();}}
};
// script17="child;11;SET;_KQ0010010form1/c_DOODR=_KQ0010010view1/h_DOODRFLG,_KQ0010010form1/c_INPUTODRCD=_KQ0010010view1/h_INPUTODRCDFLG"
expj.KQ0010010.KQ0010010view1.child11 = function () {
  console.log('KQ0010010view1 script17');
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/c_DOODR', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010view1/h_DOODRFLG'));
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/c_INPUTODRCD', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010view1/h_INPUTODRCDFLG'));
};
// script18="onDecision;3;CHK;_KQ0010010form1/h_APR_ODR[eq]1@*12,*13"
expj.KQ0010010.KQ0010010view1.onDecision3 = function () {
  console.log('KQ0010010view1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/h_APR_ODR'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script19="child;12;UNMASK;_KQ0010010form1/APPR_REMARKS"
expj.KQ0010010.KQ0010010view1.child12 = function () {
  console.log('KQ0010010view1 script19');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/APPR_REMARKS');
};
// script20="child;13;MASK;_KQ0010010form1/APPR_REMARKS"
expj.KQ0010010.KQ0010010view1.child13 = function () {
  console.log('KQ0010010view1 script20');
expj.common.pscript.setMaskToReferenceComponent('KQ0010010', 'KQ0010010view1', '_KQ0010010form1/APPR_REMARKS');
};
expj.KQ0010010.KQ0010010view1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010010.KQ0010010view1['onClick' + i])) {
        expj.KQ0010010.KQ0010010view1['onClick' + i]();
      }
    }
  }
};
expj.KQ0010010.KQ0010010view1.executeAllOnDecision = function () {
  console.log('execute KQ0010010view1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010010.KQ0010010view1['onDecision' + i])) {
        expj.KQ0010010.KQ0010010view1['onDecision' + i]();
      }
    }
  }
};
expj.KQ0010010.KQ0010010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("KQ0010010view1", "expj.KQ0010010.KQ0010010view1.executeAllOnClick");
%>
  expj.KQ0010010.KQ0010010view1.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010view1.executePScriptOnLoad = function () {
  console.log('execute KQ0010010view1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KQ0010010.KQ0010010view1['onLoad' + i])) {
      expj.KQ0010010.KQ0010010view1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-KQ0010010-KQ0010010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%= TypeConverter.sanitizer(aKQ0010010Control.getReadStatusString()) %>"></div>
<!-- VIEW END -->
<%
 String KQ0010010view1_Id = "KQ0010010view1";
 String KQ0010010view1_select = "single";
 String KQ0010010view1_sortable = "true";
 String KQ0010010view1_resize = "true";
 String KQ0010010view1_scroll = "true";
 StringBuffer KQ0010010view1_HB = new StringBuffer();
 StringBuffer KQ0010010view1_DB = new StringBuffer();
%>
<%
 KQ0010010view1_select = "single";
 KQ0010010view1_sortable = "true";
 KQ0010010view1_resize = "true";
 KQ0010010view1_scroll = "true";
%>
<%
 KQ0010010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
%>
     
<%
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'30px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0058",rb))).append("', 'name':'l_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_TYP",rb))).append("', 'name':'l_ODR_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_ODR_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ODR_NO",rb))).append("', 'name':'l_CUST_ODR_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_CD",rb))).append("', 'name':'l_CUST_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_CD",rb))).append("', 'name':'l_CUST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_NAME",rb))).append("', 'name':'l_CUST_ANAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb))).append("', 'name':'l_DESINATED_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_QTY_4",rb))).append("', 'name':'l_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_UNIT_1",rb))).append("', 'name':'l_UNIT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNIT_COST",rb))).append("', 'name':'l_ODR_UNIT_PRICE', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUR_UNIT",rb))).append("', 'name':'l_CUR_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SPCL_PRICE_CO",rb))).append("', 'name':'l_SPCL_PRICE_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DLV_LOC_CD",rb))).append("', 'name':'l_DLV_LOC_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DLV_LOC_NAME",rb))).append("', 'name':'l_DLV_LOC_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_SPCL_PRICE_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DEPO_TYP",rb))).append("', 'name':'l_DEPO_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_DEPO_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_NAME",rb))).append("', 'name':'l_CUST_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_ACPT_DATE",rb))).append("', 'name':'l_ODR_ACPT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'l_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3152",rb))).append("', 'name':'l_JOB_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_DLV_DATE",rb))).append("', 'name':'l_JOB_ODR_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ALC_GRP_CD",rb))).append("', 'name':'l_ALC_GRP_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SHIP_REMARK",rb))).append("', 'name':'l_REMARKS', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3165",rb))).append("', 'name':'l_APPR_REMARKS', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_DOODRFLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_INPUTODRCDFLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_MRP_ODR_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
KQ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_SHIP_PLANT_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KQ0010010view1_sortable).append("}").append(",");
%>
<%
 int aKQ0010010StructLength = aKQ0010010Control.getListsize();
 final KQ0010010Struct structBackup = aKQ0010010Struct;
 aKQ0010010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aKQ0010010StructLength; ++loopCount) {
  if((aKQ0010010Struct = (KQ0010010Struct) aKQ0010010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aKQ0010010Struct", aKQ0010010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 KQ0010010view1_DB.append("[");
 KQ0010010view1_DB.append(loopCount);
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_NO-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_NO\" data-name=\"l_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_NO())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_ODR_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_ODR_TYP_DN\" data-name=\"l_ODR_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_ODR_TYP_DN())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_ODR_TYP-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_ODR_TYP\" data-name=\"l_ODR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_ODR_TYP())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_CUST_ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_CUST_ODR_NO\" data-name=\"l_CUST_ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_CUST_ODR_NO())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_CUST_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_CUST_ITEM_CD\" data-name=\"l_CUST_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_CUST_ITEM_CD())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_ITEM_CD())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_CUST_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_CUST_CD\" data-name=\"l_CUST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_CUST_CD())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_CUST_ANAME-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_CUST_ANAME\" data-name=\"l_CUST_ANAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_CUST_ANAME())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_DESINATED_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_DESINATED_DLV_DATE\" data-name=\"l_DESINATED_DLV_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_DESINATED_DLV_DATE())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_ODR_QTY\" data-name=\"l_ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;CEIL;4\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_ODR_QTY())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_UNIT_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_UNIT_CD\" data-name=\"l_UNIT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_UNIT_CD())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_ODR_UNIT_PRICE-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_ODR_UNIT_PRICE\" data-name=\"l_ODR_UNIT_PRICE\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_ODR_UNIT_PRICE())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_CUR_UNIT-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_CUR_UNIT\" data-name=\"l_CUR_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_CUR_UNIT())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_SPCL_PRICE_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_SPCL_PRICE_TYP_DN\" data-name=\"l_SPCL_PRICE_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_SPCL_PRICE_TYP_DN())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_DLV_LOC_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_DLV_LOC_CD\" data-name=\"l_DLV_LOC_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_DLV_LOC_CD())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_DLV_LOC_NAME-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_DLV_LOC_NAME\" data-name=\"l_DLV_LOC_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_DLV_LOC_NAME())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_SPCL_PRICE_TYP-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_SPCL_PRICE_TYP\" data-name=\"l_SPCL_PRICE_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_SPCL_PRICE_TYP())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_DEPO_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_DEPO_TYP_DN\" data-name=\"l_DEPO_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_DEPO_TYP_DN())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_DEPO_TYP-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_DEPO_TYP\" data-name=\"l_DEPO_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_DEPO_TYP())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_CUST_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_CUST_ITEM_NAME\" data-name=\"l_CUST_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_CUST_ITEM_NAME())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_ITEM_NAME())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_ODR_ACPT_DATE-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_ODR_ACPT_DATE\" data-name=\"l_ODR_ACPT_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_ODR_ACPT_DATE())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_JOB_ODR_CD\" data-name=\"l_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_JOB_ODR_CD())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_JOB_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_JOB_ODR_QTY\" data-name=\"l_JOB_ODR_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_JOB_ODR_QTY())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_JOB_ODR_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_JOB_ODR_DLV_DATE\" data-name=\"l_JOB_ODR_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_JOB_ODR_DLV_DATE())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_ALC_GRP_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_ALC_GRP_CD\" data-name=\"l_ALC_GRP_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_ALC_GRP_CD())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_REMARKS-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_REMARKS\" data-name=\"l_REMARKS\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_REMARKS())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-l_APPR_REMARKS-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-l_APPR_REMARKS\" data-name=\"l_APPR_REMARKS\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.getl_APPR_REMARKS())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-h_DOODRFLG-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-h_DOODRFLG\" data-name=\"h_DOODRFLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.geth_DOODRFLG())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-h_INPUTODRCDFLG-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-h_INPUTODRCDFLG\" data-name=\"h_INPUTODRCDFLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.geth_INPUTODRCDFLG())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-h_MRP_ODR_TYP-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-h_MRP_ODR_TYP\" data-name=\"h_MRP_ODR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.geth_MRP_ODR_TYP())).append("</span>'");
 KQ0010010view1_DB.append(",").append("'<span id=\"expj-KQ0010010-KQ0010010view1-h_SHIP_PLANT_CD-").append(loopCount).append("\" class=\"expj-label expj-KQ0010010-KQ0010010view1-h_SHIP_PLANT_CD\" data-name=\"h_SHIP_PLANT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKQ0010010Struct.geth_SHIP_PLANT_CD())).append("</span>'");
 KQ0010010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aKQ0010010StructLength) {
   KQ0010010view1_DB.append(",");
  }
 }
 aKQ0010010Struct = structBackup;
 viewIdList.add(KQ0010010view1_Id);
 viewSelectList.add(KQ0010010view1_select);
 viewResizeList.add(KQ0010010view1_resize);
 viewScrollList.add(KQ0010010view1_scroll);
 viewHeaderDataList.add(KQ0010010view1_HB);
 viewBodyDataList.add(KQ0010010view1_DB);
%>
<%
}
%>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame18 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame19 button-area" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame20 button-area-right" style="width:60px;"></div><!--/td-->
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
<div class="expj-td frame05" style=""><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KQ0010010-KQ0010010form1">
expj.KQ0010010.KQ0010010form1 = {};
expj.KQ0010010.KQ0010010form1.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1.onDecision');
};
expj.KQ0010010.KQ0010010form1.executeOnLoad = function () {
  expj.KQ0010010.KQ0010010form1.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KQ0010010-KQ0010010form1" action="KQ0010010Servlet" name="KQ0010010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:257px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:257px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_TYP",rb)%></span><!-- 注文区分 --></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-ODR_TYP">
expj.KQ0010010.KQ0010010form1.ODR_TYP = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.KQ0010010.KQ0010010form1.ODR_TYP.onLoad0 = function () {
  console.log('ODR_TYP script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHK;_ODR_TYP[neq]3[or]_h_PRD_REQ_JOB_ODR_TYP_1[eq]0@*2,*0"
expj.KQ0010010.KQ0010010form1.ODR_TYP.onDecision0 = function () {
  console.log('ODR_TYP script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_ODR_TYP'), '[neq]', '3') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_h_PRD_REQ_JOB_ODR_TYP_1'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="child;0;CHK;_ODR_TYP[eq]3[and]_h_PRD_REQ_JOB_ODR_TYP_1[eq]1@*4,*1"
expj.KQ0010010.KQ0010010form1.ODR_TYP.child0 = function () {
  console.log('ODR_TYP script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_ODR_TYP'), '[eq]', '3') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_h_PRD_REQ_JOB_ODR_TYP_1'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="child;1;CHK;_ODR_TYP[eq]3[and]_h_PRD_REQ_JOB_ODR_TYP_1[eq]2@*6"
expj.KQ0010010.KQ0010010form1.ODR_TYP.child1 = function () {
  console.log('ODR_TYP script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_ODR_TYP'), '[eq]', '3') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_h_PRD_REQ_JOB_ODR_TYP_1'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script5="child;2;SET;_c_DOODR,_c_INPUTODRCD,_h_CHECK_STATUS=true,_JOB_ODR_QTY@*3"
expj.KQ0010010.KQ0010010form1.ODR_TYP.child2 = function () {
  console.log('ODR_TYP script5');
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_c_DOODR', '');
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_c_INPUTODRCD', '');
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_h_CHECK_STATUS', 'true');
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_JOB_ODR_QTY', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script6="child;3;MASK;_c_DOODR,_JOB_ODR_QTY,_JOB_ODR_DLV_DATE,_ALC_GRP_CD,_c_INPUTODRCD,_JOB_ODR_CD,_CalendarJOB_ODR_DLV_DATE"
expj.KQ0010010.KQ0010010form1.ODR_TYP.child3 = function () {
  console.log('ODR_TYP script6');
expj.common.pscript.setMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_c_DOODR');
expj.common.pscript.setMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_JOB_ODR_QTY');
expj.common.pscript.setMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_JOB_ODR_DLV_DATE');
expj.common.pscript.setMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_ALC_GRP_CD');
expj.common.pscript.setMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_c_INPUTODRCD');
expj.common.pscript.setMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_CalendarJOB_ODR_DLV_DATE');
};
// script7="child;4;UNMASK;_c_DOODR@*5"
expj.KQ0010010.KQ0010010form1.ODR_TYP.child4 = function () {
  console.log('ODR_TYP script7');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_c_DOODR');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script8="child;5;SET;_h_CHECK_STATUS=true"
expj.KQ0010010.KQ0010010form1.ODR_TYP.child5 = function () {
  console.log('ODR_TYP script8');
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_h_CHECK_STATUS', 'true');
};
// script9="child;6;CHK;_h_CHECK_STATUS[eq]true@*7"
expj.KQ0010010.KQ0010010form1.ODR_TYP.child6 = function () {
  console.log('ODR_TYP script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_h_CHECK_STATUS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script10="child;7;SET;_c_DOODR=true@*8"
expj.KQ0010010.KQ0010010form1.ODR_TYP.child7 = function () {
  console.log('ODR_TYP script10');
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_c_DOODR', 'true');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
// script11="child;8;UNMASK;_c_DOODR"
expj.KQ0010010.KQ0010010form1.ODR_TYP.child8 = function () {
  console.log('ODR_TYP script11');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_c_DOODR');
};
expj.KQ0010010.KQ0010010form1.ODR_TYP.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/ODR_TYP.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010010.KQ0010010form1.ODR_TYP['onDecision' + i])) {
        expj.KQ0010010.KQ0010010form1.ODR_TYP['onDecision' + i]();
      }
    }
  }
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.ODR_TYP.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-ODR_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('KQ0010010', 'KQ0010010form1', 'ODR_TYP', this);
  });
  expj.KQ0010010.KQ0010010form1.ODR_TYP.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KQ0010010.KQ0010010form1.ODR_TYP['onLoad' + i])) {
      expj.KQ0010010.KQ0010010form1.ODR_TYP['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-KQ0010010-KQ0010010form1-ODR_TYP" name='ODR_TYP' class='KQ0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = aKQ0010010Control.getStruct().getList_ODR_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aKQ0010010Control.getStruct().getList_ODR_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aKQ0010010Control.getStruct().getList_ODR_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aKQ0010010Struct.getODR_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-KQ0010010-KQ0010010form1-h_PRD_REQ_JOB_ODR_TYP_1" name="h_PRD_REQ_JOB_ODR_TYP_1" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010010Struct.geth_PRD_REQ_JOB_ODR_TYP_1()) %>">
<script class="expj-script-KQ0010010-KQ0010010form1-h_PRD_REQ_JOB_ODR_TYP_1">
expj.KQ0010010.KQ0010010form1.h_PRD_REQ_JOB_ODR_TYP_1 = {};
expj.KQ0010010.KQ0010010form1.h_PRD_REQ_JOB_ODR_TYP_1.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/h_PRD_REQ_JOB_ODR_TYP_1.onDecision');
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.h_PRD_REQ_JOB_ODR_TYP_1.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-h_PRD_REQ_JOB_ODR_TYP_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010010', 'KQ0010010form1', 'h_PRD_REQ_JOB_ODR_TYP_1', this);
  });
  expj.KQ0010010.KQ0010010form1.h_PRD_REQ_JOB_ODR_TYP_1.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.h_PRD_REQ_JOB_ODR_TYP_1.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/h_PRD_REQ_JOB_ODR_TYP_1.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-h_PRD_REQ_JOB_ODR_TYP_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ODR_ACPT_DATE",rb)%></span><!-- 受注日 --></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-ODR_ACPT_DATE">
expj.KQ0010010.KQ0010010form1.ODR_ACPT_DATE = {};
expj.KQ0010010.KQ0010010form1.ODR_ACPT_DATE.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/ODR_ACPT_DATE.onDecision');
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.ODR_ACPT_DATE.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-ODR_ACPT_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010010', 'KQ0010010form1', 'ODR_ACPT_DATE', this);
  });
  expj.KQ0010010.KQ0010010form1.ODR_ACPT_DATE.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.ODR_ACPT_DATE.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/ODR_ACPT_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-ODR_ACPT_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0010010-KQ0010010form1-ODR_ACPT_DATE" name="ODR_ACPT_DATE" class="KQ0010010-focus-move  required-value expj-KQ0010010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKQ0010010Struct.getODR_ACPT_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-CalendarOdrAcptDate">
expj.KQ0010010.KQ0010010form1.CalendarOdrAcptDate = {};
// script1="onClick;0;CALENDAR;_KQ0010010form1/ODR_ACPT_DATE"
expj.KQ0010010.KQ0010010form1.CalendarOdrAcptDate.onClick0 = function () {
  console.log('CalendarOdrAcptDate script1');
expj.common.pscript.executeCalendar('KQ0010010','KQ0010010form1','_KQ0010010form1/ODR_ACPT_DATE');
};
expj.KQ0010010.KQ0010010form1.CalendarOdrAcptDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010010.KQ0010010form1.CalendarOdrAcptDate['onClick' + i])) {
        expj.KQ0010010.KQ0010010form1.CalendarOdrAcptDate['onClick' + i]();
      }
    }
  }
};
expj.KQ0010010.KQ0010010form1.CalendarOdrAcptDate.executeAllOnDecision = function () {
};
expj.KQ0010010.KQ0010010form1.CalendarOdrAcptDate.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-CalendarOdrAcptDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010010', 'KQ0010010form1', 'CalendarOdrAcptDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KQ0010010','KQ0010010form1','_KQ0010010form1/ODR_ACPT_DATE');
  expj.KQ0010010.KQ0010010form1.CalendarOdrAcptDate.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.CalendarOdrAcptDate.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/CalendarOdrAcptDate.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-CalendarOdrAcptDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0010010-KQ0010010form1-CalendarOdrAcptDate" class="KQ0010010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<input type="hidden" id="expj-KQ0010010-KQ0010010form1-NO" name="NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010010Struct.getNO()) %>">
<script class="expj-script-KQ0010010-KQ0010010form1-NO">
expj.KQ0010010.KQ0010010form1.NO = {};
expj.KQ0010010.KQ0010010form1.NO.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/NO.onDecision');
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.NO.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010010', 'KQ0010010form1', 'NO', this);
  });
  expj.KQ0010010.KQ0010010form1.NO.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.NO.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/NO.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CUST_ODR_NO",rb)%></span><!-- 得意先注文番号 --></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-CUST_ODR_NO">
expj.KQ0010010.KQ0010010form1.CUST_ODR_NO = {};
expj.KQ0010010.KQ0010010form1.CUST_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/CUST_ODR_NO.onDecision');
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.CUST_ODR_NO.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-CUST_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010010', 'KQ0010010form1', 'CUST_ODR_NO', this);
  });
  expj.KQ0010010.KQ0010010form1.CUST_ODR_NO.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.CUST_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/CUST_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-CUST_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0010010-KQ0010010form1-CUST_ODR_NO" name="CUST_ODR_NO" class="KQ0010010-focus-move  required-value expj-KQ0010010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010010Struct.getCUST_ODR_NO()) %>" maxlength="23" ></div><!--/td-->
<input type="hidden" id="expj-KQ0010010-KQ0010010form1-h_PRD_REQ_JOB_ODR_TYP_2" name="h_PRD_REQ_JOB_ODR_TYP_2" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010010Struct.geth_PRD_REQ_JOB_ODR_TYP_2()) %>">
<script class="expj-script-KQ0010010-KQ0010010form1-h_PRD_REQ_JOB_ODR_TYP_2">
expj.KQ0010010.KQ0010010form1.h_PRD_REQ_JOB_ODR_TYP_2 = {};
expj.KQ0010010.KQ0010010form1.h_PRD_REQ_JOB_ODR_TYP_2.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/h_PRD_REQ_JOB_ODR_TYP_2.onDecision');
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.h_PRD_REQ_JOB_ODR_TYP_2.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-h_PRD_REQ_JOB_ODR_TYP_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010010', 'KQ0010010form1', 'h_PRD_REQ_JOB_ODR_TYP_2', this);
  });
  expj.KQ0010010.KQ0010010form1.h_PRD_REQ_JOB_ODR_TYP_2.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.h_PRD_REQ_JOB_ODR_TYP_2.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/h_PRD_REQ_JOB_ODR_TYP_2.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-h_PRD_REQ_JOB_ODR_TYP_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-c_DOODR">
expj.KQ0010010.KQ0010010form1.c_DOODR = {};
// script1="onLoad;0;CALL;onClick@0"
expj.KQ0010010.KQ0010010form1.c_DOODR.onLoad0 = function () {
  console.log('c_DOODR script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;_c_DOODR[eq]true@*0,*5"
expj.KQ0010010.KQ0010010form1.c_DOODR.onClick0 = function () {
  console.log('c_DOODR script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_c_DOODR'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script3="child;0;UNMASK;_JOB_ODR_QTY,_JOB_ODR_DLV_DATE,_ALC_GRP_CD,_CalendarJOB_ODR_DLV_DATE@*1"
expj.KQ0010010.KQ0010010form1.c_DOODR.child0 = function () {
  console.log('c_DOODR script3');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_JOB_ODR_QTY');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_JOB_ODR_DLV_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_ALC_GRP_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_CalendarJOB_ODR_DLV_DATE');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script4="child;1;CHK;_h_PRD_REQ_JOB_ODR_TYP_2[eq]2@*2,*4"
expj.KQ0010010.KQ0010010form1.c_DOODR.child1 = function () {
  console.log('c_DOODR script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_h_PRD_REQ_JOB_ODR_TYP_2'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script5="child;2;SET;_c_INPUTODRCD=true@*3"
expj.KQ0010010.KQ0010010form1.c_DOODR.child2 = function () {
  console.log('c_DOODR script5');
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_c_INPUTODRCD', 'true');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script6="child;3;MASK;_c_INPUTODRCD"
expj.KQ0010010.KQ0010010form1.c_DOODR.child3 = function () {
  console.log('c_DOODR script6');
expj.common.pscript.setMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_c_INPUTODRCD');
};
// script7="child;4;UNMASK;_c_INPUTODRCD"
expj.KQ0010010.KQ0010010form1.c_DOODR.child4 = function () {
  console.log('c_DOODR script7');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_c_INPUTODRCD');
};
// script8="child;5;SET;_c_INPUTODRCD@*6"
expj.KQ0010010.KQ0010010form1.c_DOODR.child5 = function () {
  console.log('c_DOODR script8');
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_c_INPUTODRCD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script9="child;6;SET;_JOB_ODR_QTY=0,_JOB_ODR_DLV_DATE,_ALC_GRP_CD,_c_INPUTODRCD,_CalendarJOB_ODR_DLV_DATE@*7"
expj.KQ0010010.KQ0010010form1.c_DOODR.child6 = function () {
  console.log('c_DOODR script9');
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_JOB_ODR_QTY', '0');
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_JOB_ODR_DLV_DATE', '');
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_ALC_GRP_CD', '');
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_c_INPUTODRCD', '');
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_CalendarJOB_ODR_DLV_DATE', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child7)){this.child7();}}
};
// script10="child;7;MASK;_JOB_ODR_QTY,_JOB_ODR_DLV_DATE,_ALC_GRP_CD,_c_INPUTODRCD,_CalendarJOB_ODR_DLV_DATE"
expj.KQ0010010.KQ0010010form1.c_DOODR.child7 = function () {
  console.log('c_DOODR script10');
expj.common.pscript.setMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_JOB_ODR_QTY');
expj.common.pscript.setMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_JOB_ODR_DLV_DATE');
expj.common.pscript.setMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_ALC_GRP_CD');
expj.common.pscript.setMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_c_INPUTODRCD');
expj.common.pscript.setMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_CalendarJOB_ODR_DLV_DATE');
};
expj.KQ0010010.KQ0010010form1.c_DOODR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010010.KQ0010010form1.c_DOODR['onClick' + i])) {
        expj.KQ0010010.KQ0010010form1.c_DOODR['onClick' + i]();
      }
    }
  }
};
expj.KQ0010010.KQ0010010form1.c_DOODR.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/c_DOODR.onDecision');
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.c_DOODR.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-c_DOODR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010010', 'KQ0010010form1', 'c_DOODR', this, 'CheckBox');
    }
  });
  expj.KQ0010010.KQ0010010form1.c_DOODR.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.c_DOODR.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/c_DOODR.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-c_DOODR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KQ0010010.KQ0010010form1.c_DOODR['onLoad' + i])) {
      expj.KQ0010010.KQ0010010form1.c_DOODR['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c_DOODR" value="true" <%= ("true".equals(TypeConverter.convert(aKQ0010010Struct.getc_DOODR())) || "1".equals(TypeConverter.convert(aKQ0010010Struct.getc_DOODR())))?"checked=\"checked\"":"" %>  class="KQ0010010-focus-move" id="expj-KQ0010010-KQ0010010form1-c_DOODR"><label for="expj-KQ0010010-KQ0010010form1-c_DOODR"><%=CoreTools.getRBString("Expj.Cmt3153",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-KQ0010010-KQ0010010form1-h_CHECK_STATUS" name="h_CHECK_STATUS" class="" data-kind="OBT_AN;" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010010Struct.geth_CHECK_STATUS()) %>">
<script class="expj-script-KQ0010010-KQ0010010form1-h_CHECK_STATUS">
expj.KQ0010010.KQ0010010form1.h_CHECK_STATUS = {};
expj.KQ0010010.KQ0010010form1.h_CHECK_STATUS.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/h_CHECK_STATUS.onDecision');
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.h_CHECK_STATUS.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-h_CHECK_STATUS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010010', 'KQ0010010form1', 'h_CHECK_STATUS', this);
  });
  expj.KQ0010010.KQ0010010form1.h_CHECK_STATUS.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.h_CHECK_STATUS.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/h_CHECK_STATUS.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-h_CHECK_STATUS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-CUST_CD">
expj.KQ0010010.KQ0010010form1.CUST_CD = {};
expj.KQ0010010.KQ0010010form1.CUST_CD.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/CUST_CD.onDecision');
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.CUST_CD.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010010', 'KQ0010010form1', 'CUST_CD', this);
  });
  expj.KQ0010010.KQ0010010form1.CUST_CD.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0010010-KQ0010010form1-CUST_CD" name="CUST_CD" class="KQ0010010-focus-move  required-value expj-KQ0010010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010010Struct.getCUST_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-PeekerCustCd">
expj.KQ0010010.KQ0010010form1.PeekerCustCd = {};
// script1="onClick;0;PEEKER;_KQ0010010form1/CUST_CD@<%=contextNo%>"
expj.KQ0010010.KQ0010010form1.PeekerCustCd.onClick0 = function () {
  console.log('PeekerCustCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KQ0010010';
var parameterValues = 'PeekerCustCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUST_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KQ0010010form1/CUST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KQ0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KQ0010010.KQ0010010form1.PeekerCustCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010010.KQ0010010form1.PeekerCustCd['onClick' + i])) {
        expj.KQ0010010.KQ0010010form1.PeekerCustCd['onClick' + i]();
      }
    }
  }
};
expj.KQ0010010.KQ0010010form1.PeekerCustCd.executeAllOnDecision = function () {
};
expj.KQ0010010.KQ0010010form1.PeekerCustCd.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-PeekerCustCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010010', 'KQ0010010form1', 'PeekerCustCd', this, 'Button');
    }
  });
  expj.KQ0010010.KQ0010010form1.PeekerCustCd.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.PeekerCustCd.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/PeekerCustCd.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-PeekerCustCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0010010-KQ0010010form1-PeekerCustCd" class="KQ0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3152",rb)%></span><!-- 手配数量 --></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-JOB_ODR_QTY">
expj.KQ0010010.KQ0010010form1.JOB_ODR_QTY = {};
expj.KQ0010010.KQ0010010form1.JOB_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/JOB_ODR_QTY.onDecision');
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.JOB_ODR_QTY.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-JOB_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010010', 'KQ0010010form1', 'JOB_ODR_QTY', this);
  });
  expj.KQ0010010.KQ0010010form1.JOB_ODR_QTY.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.JOB_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/JOB_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-JOB_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0010010-KQ0010010form1-JOB_ODR_QTY" name="JOB_ODR_QTY" class="KQ0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;CEIL;4" value="<%= TypeConverter.sanitizer(aKQ0010010Struct.getJOB_ODR_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CUST_ITEM_CD",rb)%></span><!-- 得意先品目番号 --></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-CUST_ITEM_CD">
expj.KQ0010010.KQ0010010form1.CUST_ITEM_CD = {};
expj.KQ0010010.KQ0010010form1.CUST_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/CUST_ITEM_CD.onDecision');
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.CUST_ITEM_CD.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-CUST_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010010', 'KQ0010010form1', 'CUST_ITEM_CD', this);
  });
  expj.KQ0010010.KQ0010010form1.CUST_ITEM_CD.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.CUST_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/CUST_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-CUST_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0010010-KQ0010010form1-CUST_ITEM_CD" name="CUST_ITEM_CD" class="KQ0010010-focus-move  required-value expj-KQ0010010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010010Struct.getCUST_ITEM_CD()) %>" maxlength="35" ></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-PeekerCustItemCd">
expj.KQ0010010.KQ0010010form1.PeekerCustItemCd = {};
// script1="onClick;0;PEEKER;_KQ0010010form1/CUST_ITEM_CD@<%=contextNo%>"
expj.KQ0010010.KQ0010010form1.PeekerCustItemCd.onClick0 = function () {
  console.log('PeekerCustItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KQ0010010';
var parameterValues = 'PeekerCustItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_3%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_CUST_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUST_ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KQ0010010form1/CUST_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KQ0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KQ0010010.KQ0010010form1.PeekerCustItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010010.KQ0010010form1.PeekerCustItemCd['onClick' + i])) {
        expj.KQ0010010.KQ0010010form1.PeekerCustItemCd['onClick' + i]();
      }
    }
  }
};
expj.KQ0010010.KQ0010010form1.PeekerCustItemCd.executeAllOnDecision = function () {
};
expj.KQ0010010.KQ0010010form1.PeekerCustItemCd.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-PeekerCustItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010010', 'KQ0010010form1', 'PeekerCustItemCd', this, 'Button');
    }
  });
  expj.KQ0010010.KQ0010010form1.PeekerCustItemCd.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.PeekerCustItemCd.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/PeekerCustItemCd.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-PeekerCustItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0010010-KQ0010010form1-PeekerCustItemCd" class="KQ0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_DLV_DATE",rb)%></span><!-- 製番納期 --></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-JOB_ODR_DLV_DATE">
expj.KQ0010010.KQ0010010form1.JOB_ODR_DLV_DATE = {};
expj.KQ0010010.KQ0010010form1.JOB_ODR_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/JOB_ODR_DLV_DATE.onDecision');
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.JOB_ODR_DLV_DATE.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-JOB_ODR_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010010', 'KQ0010010form1', 'JOB_ODR_DLV_DATE', this);
  });
  expj.KQ0010010.KQ0010010form1.JOB_ODR_DLV_DATE.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.JOB_ODR_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/JOB_ODR_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-JOB_ODR_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0010010-KQ0010010form1-JOB_ODR_DLV_DATE" name="JOB_ODR_DLV_DATE" class="KQ0010010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKQ0010010Struct.getJOB_ODR_DLV_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-CalendarJOB_ODR_DLV_DATE">
expj.KQ0010010.KQ0010010form1.CalendarJOB_ODR_DLV_DATE = {};
// script1="onClick;0;CALENDAR;_KQ0010010form1/JOB_ODR_DLV_DATE"
expj.KQ0010010.KQ0010010form1.CalendarJOB_ODR_DLV_DATE.onClick0 = function () {
  console.log('CalendarJOB_ODR_DLV_DATE script1');
expj.common.pscript.executeCalendar('KQ0010010','KQ0010010form1','_KQ0010010form1/JOB_ODR_DLV_DATE');
};
expj.KQ0010010.KQ0010010form1.CalendarJOB_ODR_DLV_DATE.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010010.KQ0010010form1.CalendarJOB_ODR_DLV_DATE['onClick' + i])) {
        expj.KQ0010010.KQ0010010form1.CalendarJOB_ODR_DLV_DATE['onClick' + i]();
      }
    }
  }
};
expj.KQ0010010.KQ0010010form1.CalendarJOB_ODR_DLV_DATE.executeAllOnDecision = function () {
};
expj.KQ0010010.KQ0010010form1.CalendarJOB_ODR_DLV_DATE.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-CalendarJOB_ODR_DLV_DATE').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010010', 'KQ0010010form1', 'CalendarJOB_ODR_DLV_DATE', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KQ0010010','KQ0010010form1','_KQ0010010form1/JOB_ODR_DLV_DATE');
  expj.KQ0010010.KQ0010010form1.CalendarJOB_ODR_DLV_DATE.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.CalendarJOB_ODR_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/CalendarJOB_ODR_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-CalendarJOB_ODR_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0010010-KQ0010010form1-CalendarJOB_ODR_DLV_DATE" class="KQ0010010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DLV_LOC_CD",rb)%></span><!-- 納品場所コード --></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-DLV_LOC_CD">
expj.KQ0010010.KQ0010010form1.DLV_LOC_CD = {};
expj.KQ0010010.KQ0010010form1.DLV_LOC_CD.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/DLV_LOC_CD.onDecision');
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.DLV_LOC_CD.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-DLV_LOC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010010', 'KQ0010010form1', 'DLV_LOC_CD', this);
  });
  expj.KQ0010010.KQ0010010form1.DLV_LOC_CD.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.DLV_LOC_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/DLV_LOC_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-DLV_LOC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0010010-KQ0010010form1-DLV_LOC_CD" name="DLV_LOC_CD" class="KQ0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010010Struct.getDLV_LOC_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-PeekerDlvLocCd">
expj.KQ0010010.KQ0010010form1.PeekerDlvLocCd = {};
// script1="onClick;0;PEEKER;_KQ0010010form1/DLV_LOC_CD@<%=contextNo%>"
expj.KQ0010010.KQ0010010form1.PeekerDlvLocCd.onClick0 = function () {
  console.log('PeekerDlvLocCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KQ0010010';
var parameterValues = 'PeekerDlvLocCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_3%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_DLV_LOC_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%DLV_LOC_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KQ0010010form1/DLV_LOC_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KQ0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KQ0010010.KQ0010010form1.PeekerDlvLocCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010010.KQ0010010form1.PeekerDlvLocCd['onClick' + i])) {
        expj.KQ0010010.KQ0010010form1.PeekerDlvLocCd['onClick' + i]();
      }
    }
  }
};
expj.KQ0010010.KQ0010010form1.PeekerDlvLocCd.executeAllOnDecision = function () {
};
expj.KQ0010010.KQ0010010form1.PeekerDlvLocCd.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-PeekerDlvLocCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010010', 'KQ0010010form1', 'PeekerDlvLocCd', this, 'Button');
    }
  });
  expj.KQ0010010.KQ0010010form1.PeekerDlvLocCd.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.PeekerDlvLocCd.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/PeekerDlvLocCd.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-PeekerDlvLocCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0010010-KQ0010010form1-PeekerDlvLocCd" class="KQ0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ALC_GRP_CD",rb)%></span><!-- 引当グループコード --></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-ALC_GRP_CD">
expj.KQ0010010.KQ0010010form1.ALC_GRP_CD = {};
expj.KQ0010010.KQ0010010form1.ALC_GRP_CD.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/ALC_GRP_CD.onDecision');
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.ALC_GRP_CD.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-ALC_GRP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010010', 'KQ0010010form1', 'ALC_GRP_CD', this);
  });
  expj.KQ0010010.KQ0010010form1.ALC_GRP_CD.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.ALC_GRP_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/ALC_GRP_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-ALC_GRP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0010010-KQ0010010form1-ALC_GRP_CD" name="ALC_GRP_CD" class="KQ0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010010Struct.getALC_GRP_CD()) %>" maxlength="25" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb)%></span><!-- 指定納期 --></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-DESINATED_DLV_DATE">
expj.KQ0010010.KQ0010010form1.DESINATED_DLV_DATE = {};
expj.KQ0010010.KQ0010010form1.DESINATED_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/DESINATED_DLV_DATE.onDecision');
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.DESINATED_DLV_DATE.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-DESINATED_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010010', 'KQ0010010form1', 'DESINATED_DLV_DATE', this);
  });
  expj.KQ0010010.KQ0010010form1.DESINATED_DLV_DATE.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.DESINATED_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/DESINATED_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-DESINATED_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0010010-KQ0010010form1-DESINATED_DLV_DATE" name="DESINATED_DLV_DATE" class="KQ0010010-focus-move  required-value expj-KQ0010010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKQ0010010Struct.getDESINATED_DLV_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-CalendarDesinatedDlvDate">
expj.KQ0010010.KQ0010010form1.CalendarDesinatedDlvDate = {};
// script1="onClick;0;CALENDAR;_KQ0010010form1/DESINATED_DLV_DATE"
expj.KQ0010010.KQ0010010form1.CalendarDesinatedDlvDate.onClick0 = function () {
  console.log('CalendarDesinatedDlvDate script1');
expj.common.pscript.executeCalendar('KQ0010010','KQ0010010form1','_KQ0010010form1/DESINATED_DLV_DATE');
};
expj.KQ0010010.KQ0010010form1.CalendarDesinatedDlvDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010010.KQ0010010form1.CalendarDesinatedDlvDate['onClick' + i])) {
        expj.KQ0010010.KQ0010010form1.CalendarDesinatedDlvDate['onClick' + i]();
      }
    }
  }
};
expj.KQ0010010.KQ0010010form1.CalendarDesinatedDlvDate.executeAllOnDecision = function () {
};
expj.KQ0010010.KQ0010010form1.CalendarDesinatedDlvDate.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-CalendarDesinatedDlvDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010010', 'KQ0010010form1', 'CalendarDesinatedDlvDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KQ0010010','KQ0010010form1','_KQ0010010form1/DESINATED_DLV_DATE');
  expj.KQ0010010.KQ0010010form1.CalendarDesinatedDlvDate.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.CalendarDesinatedDlvDate.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/CalendarDesinatedDlvDate.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-CalendarDesinatedDlvDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0010010-KQ0010010form1-CalendarDesinatedDlvDate" class="KQ0010010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-c_INPUTODRCD">
expj.KQ0010010.KQ0010010form1.c_INPUTODRCD = {};
// script1="onLoad;0;CALL;onClick@0"
expj.KQ0010010.KQ0010010form1.c_INPUTODRCD.onLoad0 = function () {
  console.log('c_INPUTODRCD script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;_c_INPUTODRCD[eq]true@*0,*1"
expj.KQ0010010.KQ0010010form1.c_INPUTODRCD.onClick0 = function () {
  console.log('c_INPUTODRCD script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_c_INPUTODRCD'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_JOB_ODR_CD"
expj.KQ0010010.KQ0010010form1.c_INPUTODRCD.child0 = function () {
  console.log('c_INPUTODRCD script3');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_JOB_ODR_CD');
};
// script4="child;1;SET;_JOB_ODR_CD@*2"
expj.KQ0010010.KQ0010010form1.c_INPUTODRCD.child1 = function () {
  console.log('c_INPUTODRCD script4');
expj.common.pscript.setReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_JOB_ODR_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script5="child;2;MASK;_JOB_ODR_CD"
expj.KQ0010010.KQ0010010form1.c_INPUTODRCD.child2 = function () {
  console.log('c_INPUTODRCD script5');
expj.common.pscript.setMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_JOB_ODR_CD');
};
expj.KQ0010010.KQ0010010form1.c_INPUTODRCD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010010.KQ0010010form1.c_INPUTODRCD['onClick' + i])) {
        expj.KQ0010010.KQ0010010form1.c_INPUTODRCD['onClick' + i]();
      }
    }
  }
};
expj.KQ0010010.KQ0010010form1.c_INPUTODRCD.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/c_INPUTODRCD.onDecision');
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.c_INPUTODRCD.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-c_INPUTODRCD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010010', 'KQ0010010form1', 'c_INPUTODRCD', this, 'CheckBox');
    }
  });
  expj.KQ0010010.KQ0010010form1.c_INPUTODRCD.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.c_INPUTODRCD.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/c_INPUTODRCD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-c_INPUTODRCD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KQ0010010.KQ0010010form1.c_INPUTODRCD['onLoad' + i])) {
      expj.KQ0010010.KQ0010010form1.c_INPUTODRCD['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c_INPUTODRCD" value="true" <%= ("true".equals(TypeConverter.convert(aKQ0010010Struct.getc_INPUTODRCD())) || "1".equals(TypeConverter.convert(aKQ0010010Struct.getc_INPUTODRCD())))?"checked=\"checked\"":"" %>  class="KQ0010010-focus-move" id="expj-KQ0010010-KQ0010010form1-c_INPUTODRCD"><label for="expj-KQ0010010-KQ0010010form1-c_INPUTODRCD"><%=CoreTools.getRBString("Expj.Cmt3154",rb)%></label></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SPCL_PRICE_CO",rb)%></span><!-- 特値区分 --></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-SPCL_PRICE_TYP">
expj.KQ0010010.KQ0010010form1.SPCL_PRICE_TYP = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.KQ0010010.KQ0010010form1.SPCL_PRICE_TYP.onLoad0 = function () {
  console.log('SPCL_PRICE_TYP script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHK;_SPCL_PRICE_TYP[neq]0@*0,*1"
expj.KQ0010010.KQ0010010form1.SPCL_PRICE_TYP.onDecision0 = function () {
  console.log('SPCL_PRICE_TYP script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010form1', '_SPCL_PRICE_TYP'), '[neq]', '0')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_ODR_UNIT_PRICE"
expj.KQ0010010.KQ0010010form1.SPCL_PRICE_TYP.child0 = function () {
  console.log('SPCL_PRICE_TYP script3');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_ODR_UNIT_PRICE');
};
// script4="child;1;MASK;_ODR_UNIT_PRICE"
expj.KQ0010010.KQ0010010form1.SPCL_PRICE_TYP.child1 = function () {
  console.log('SPCL_PRICE_TYP script4');
expj.common.pscript.setMaskToReferenceComponent('KQ0010010', 'KQ0010010form1', '_ODR_UNIT_PRICE');
};
expj.KQ0010010.KQ0010010form1.SPCL_PRICE_TYP.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/SPCL_PRICE_TYP.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010010.KQ0010010form1.SPCL_PRICE_TYP['onDecision' + i])) {
        expj.KQ0010010.KQ0010010form1.SPCL_PRICE_TYP['onDecision' + i]();
      }
    }
  }
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.SPCL_PRICE_TYP.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-SPCL_PRICE_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('KQ0010010', 'KQ0010010form1', 'SPCL_PRICE_TYP', this);
  });
  expj.KQ0010010.KQ0010010form1.SPCL_PRICE_TYP.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.SPCL_PRICE_TYP.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/SPCL_PRICE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-SPCL_PRICE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KQ0010010.KQ0010010form1.SPCL_PRICE_TYP['onLoad' + i])) {
      expj.KQ0010010.KQ0010010form1.SPCL_PRICE_TYP['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-KQ0010010-KQ0010010form1-SPCL_PRICE_TYP" name='SPCL_PRICE_TYP' class='KQ0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = aKQ0010010Control.getStruct().getList_SPCL_PRICE_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aKQ0010010Control.getStruct().getList_SPCL_PRICE_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aKQ0010010Control.getStruct().getList_SPCL_PRICE_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aKQ0010010Struct.getSPCL_PRICE_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0695",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-JOB_ODR_CD">
expj.KQ0010010.KQ0010010form1.JOB_ODR_CD = {};
expj.KQ0010010.KQ0010010form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/JOB_ODR_CD.onDecision');
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010010', 'KQ0010010form1', 'JOB_ODR_CD', this);
  });
  expj.KQ0010010.KQ0010010form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0010010-KQ0010010form1-JOB_ODR_CD" name="JOB_ODR_CD" class="KQ0010010-focus-move  required-value expj-KQ0010010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010010Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.UNIT_COST",rb)%></span><!-- 単価 --></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-ODR_UNIT_PRICE">
expj.KQ0010010.KQ0010010form1.ODR_UNIT_PRICE = {};
expj.KQ0010010.KQ0010010form1.ODR_UNIT_PRICE.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/ODR_UNIT_PRICE.onDecision');
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.ODR_UNIT_PRICE.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-ODR_UNIT_PRICE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010010', 'KQ0010010form1', 'ODR_UNIT_PRICE', this);
  });
  expj.KQ0010010.KQ0010010form1.ODR_UNIT_PRICE.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.ODR_UNIT_PRICE.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/ODR_UNIT_PRICE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-ODR_UNIT_PRICE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0010010-KQ0010010form1-ODR_UNIT_PRICE" name="ODR_UNIT_PRICE" class="KQ0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKQ0010010Struct.getODR_UNIT_PRICE()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ODR_QTY_4",rb)%></span><!-- 受注数量 --></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-ODR_QTY">
expj.KQ0010010.KQ0010010form1.ODR_QTY = {};
expj.KQ0010010.KQ0010010form1.ODR_QTY.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/ODR_QTY.onDecision');
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.ODR_QTY.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010010', 'KQ0010010form1', 'ODR_QTY', this);
  });
  expj.KQ0010010.KQ0010010form1.ODR_QTY.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0010010-KQ0010010form1-ODR_QTY" name="ODR_QTY" class="KQ0010010-focus-move  required-value expj-KQ0010010-required-A" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;CEIL;4" value="<%= TypeConverter.sanitizer(aKQ0010010Struct.getODR_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SHIP_REMARK",rb)%></span><!-- 備考 --></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-REMARKS">
expj.KQ0010010.KQ0010010form1.REMARKS = {};
expj.KQ0010010.KQ0010010form1.REMARKS.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/REMARKS.onDecision');
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.REMARKS.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-REMARKS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010010', 'KQ0010010form1', 'REMARKS', this);
  });
  expj.KQ0010010.KQ0010010form1.REMARKS.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.REMARKS.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/REMARKS.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-REMARKS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KQ0010010-KQ0010010form1-REMARKS" name="REMARKS" class="KQ0010010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010010Struct.getREMARKS()) %>" maxlength="100" ></div><!--/td-->
<input type="hidden" id="expj-KQ0010010-KQ0010010form1-h_BUSINESS_OPR_DATE" name="h_BUSINESS_OPR_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010010Struct.geth_BUSINESS_OPR_DATE()) %>">
<script class="expj-script-KQ0010010-KQ0010010form1-h_BUSINESS_OPR_DATE">
expj.KQ0010010.KQ0010010form1.h_BUSINESS_OPR_DATE = {};
expj.KQ0010010.KQ0010010form1.h_BUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/h_BUSINESS_OPR_DATE.onDecision');
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.h_BUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-h_BUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010010', 'KQ0010010form1', 'h_BUSINESS_OPR_DATE', this);
  });
  expj.KQ0010010.KQ0010010form1.h_BUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.h_BUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/h_BUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-h_BUSINESS_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-KQ0010010-KQ0010010form1-h_APR_ODR" name="h_APR_ODR" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0010010Struct.geth_APR_ODR()) %>">
<script class="expj-script-KQ0010010-KQ0010010form1-h_APR_ODR">
expj.KQ0010010.KQ0010010form1.h_APR_ODR = {};
expj.KQ0010010.KQ0010010form1.h_APR_ODR.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/h_APR_ODR.onDecision');
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.h_APR_ODR.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-h_APR_ODR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010010', 'KQ0010010form1', 'h_APR_ODR', this);
  });
  expj.KQ0010010.KQ0010010form1.h_APR_ODR.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.h_APR_ODR.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/h_APR_ODR.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-h_APR_ODR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3165",rb)%></span><!-- 承認備考 --></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010form1-APPR_REMARKS">
expj.KQ0010010.KQ0010010form1.APPR_REMARKS = {};
expj.KQ0010010.KQ0010010form1.APPR_REMARKS.executeAllOnDecision = function () {
  console.log('execute KQ0010010form1/APPR_REMARKS.onDecision');
  expj.KQ0010010.KQ0010010form1.executeAllOnDecision();
  expj.KQ0010010.executeAllOnDecision();
};
expj.KQ0010010.KQ0010010form1.APPR_REMARKS.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010form1-APPR_REMARKS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0010010', 'KQ0010010form1', 'APPR_REMARKS', this);
  });
  expj.KQ0010010.KQ0010010form1.APPR_REMARKS.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010form1.APPR_REMARKS.executePScriptOnLoad = function () {
  console.log('execute KQ0010010form1/APPR_REMARKS.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010form1-APPR_REMARKS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KQ0010010-KQ0010010form1-APPR_REMARKS" name="APPR_REMARKS" class="KQ0010010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0010010Struct.getAPPR_REMARKS()) %>" maxlength="80" ></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-KQ0010010-KQ0010010button2">
expj.KQ0010010.KQ0010010button2 = {};
expj.KQ0010010.KQ0010010button2.executeAllOnDecision = function () {
  console.log('execute KQ0010010button2.onDecision');
};
expj.KQ0010010.KQ0010010button2.executeOnLoad = function () {
  expj.KQ0010010.KQ0010010button2.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010button2.executePScriptOnLoad = function () {
  console.log('execute KQ0010010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KQ0010010-KQ0010010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KQ0010010-KQ0010010button2-Addition">
expj.KQ0010010.KQ0010010button2.Addition = {};
// script1="onClick;0;CHK;_KQ0010010form1/ODR_QTY[lte]0@#KQ00022"
expj.KQ0010010.KQ0010010button2.Addition.onClick0 = function () {
  console.log('Addition script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/ODR_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('KQ0010010', 'KQ0010010button2', 'KQ00022');
}
};
// script2="onClick;1;CHK;_KQ0010010form1/h_BUSINESS_OPR_DATE[gt]_KQ0010010form1/DESINATED_DLV_DATE@#KQ00006"
expj.KQ0010010.KQ0010010button2.Addition.onClick1 = function () {
  console.log('Addition script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/h_BUSINESS_OPR_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/DESINATED_DLV_DATE')))) {
expj.common.pscript.addErrorMessage('KQ0010010', 'KQ0010010button2', 'KQ00006');
}
};
// script3="onClick;2;CHK;_KQ0010010form1/ODR_ACPT_DATE[gt]_KQ0010010form1/h_BUSINESS_OPR_DATE@#KQ00317"
expj.KQ0010010.KQ0010010button2.Addition.onClick2 = function () {
  console.log('Addition script3');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/ODR_ACPT_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addErrorMessage('KQ0010010', 'KQ0010010button2', 'KQ00317');
}
};
// script4="onClick;3;CHK;_KQ0010010form1/ODR_ACPT_DATE[lt]_KQ0010010form1/h_BUSINESS_OPR_DATE@$KQ00318"
expj.KQ0010010.KQ0010010button2.Addition.onClick3 = function () {
  console.log('Addition script4');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/ODR_ACPT_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('KQ0010010', 'KQ0010010button2', 'KQ00318');
}
};
// script5="onClick;4;CHK;_KQ0010010form1/c_DOODR[eq]true[and]_KQ0010010form1/JOB_ODR_DLV_DATE[neq][and]_KQ0010010form1/JOB_ODR_DLV_DATE[gt]_KQ0010010form1/DESINATED_DLV_DATE@#KQ00321"
expj.KQ0010010.KQ0010010button2.Addition.onClick4 = function () {
  console.log('Addition script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/c_DOODR'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/JOB_ODR_DLV_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/JOB_ODR_DLV_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/DESINATED_DLV_DATE')))) {
expj.common.pscript.addErrorMessage('KQ0010010', 'KQ0010010button2', 'KQ00321');
}
};
// script6="onClick;5;CHK;_KQ0010010form1/c_DOODR[eq]true[and]_KQ0010010form1/JOB_ODR_DLV_DATE[neq][and]_KQ0010010form1/JOB_ODR_DLV_DATE[lt]_KQ0010010form1/h_BUSINESS_OPR_DATE@#KQ00337"
expj.KQ0010010.KQ0010010button2.Addition.onClick5 = function () {
  console.log('Addition script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/c_DOODR'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/JOB_ODR_DLV_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/JOB_ODR_DLV_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addErrorMessage('KQ0010010', 'KQ0010010button2', 'KQ00337');
}
};
// script7="onClick;6;CHK;_KQ0010010form1/c_DOODR[eq]true[and]_KQ0010010form1/JOB_ODR_QTY[neq]0.0[and]_KQ0010010form1/ODR_QTY[neq]_KQ0010010form1/JOB_ODR_QTY@$KQ00323"
expj.KQ0010010.KQ0010010button2.Addition.onClick6 = function () {
  console.log('Addition script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/c_DOODR'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/JOB_ODR_QTY'), '[neq]', '0.0') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/ODR_QTY'), '[neq]', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/JOB_ODR_QTY'))) {
expj.common.pscript.addWarningMessage('KQ0010010', 'KQ0010010button2', 'KQ00323');
}
};
// script8="onClick;7;CHK;_KQ0010010form1/c_INPUTODRCD[eq]true@*0"
expj.KQ0010010.KQ0010010button2.Addition.onClick7 = function () {
  console.log('Addition script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/c_INPUTODRCD'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script9="onClick;8;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0010010view1/*,_KQ0010010form1/*@KQ0010010Servlet"
expj.KQ0010010.KQ0010010button2.Addition.onClick8 = function () {
  console.log('Addition script9');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0010010', 'KQ0010010button2', '_KQ0010010view1/*,_KQ0010010form1/*', 'KQ0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0010010', response);
expj.common.updateBusinessScreenTab('KQ0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script10="child;0;COLCHK;KQ0010010view1:_l_JOB_ODR_CD[neq]_KQ0010010form1/JOB_ODR_CD@,#KQ00322"
expj.KQ0010010.KQ0010010button2.Addition.child0 = function () {
  console.log('Addition script10');
var selectCells = expj.common.pscript.getPreviewVIEWCells('KQ0010010', 'KQ0010010view1');
var checkFlg = true;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (!(expj.common.pscript.evaluate(cell.l_JOB_ODR_CD, '[neq]', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/JOB_ODR_CD')))) {
checkFlg = false;
break;
}
}
if (checkFlg) {

} else {
expj.common.pscript.addErrorMessage('KQ0010010', 'KQ0010010button2', 'KQ00322');
}
};
expj.KQ0010010.KQ0010010button2.Addition.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 8; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010010.KQ0010010button2.Addition['onClick' + i])) {
        expj.KQ0010010.KQ0010010button2.Addition['onClick' + i]();
      }
    }
  }
};
expj.KQ0010010.KQ0010010button2.Addition.executeAllOnDecision = function () {
};
expj.KQ0010010.KQ0010010button2.Addition.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010button2-Addition').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010010', 'KQ0010010button2', 'Addition', this, 'Button');
    }
  });
  expj.KQ0010010.KQ0010010button2.Addition.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010button2.Addition.executePScriptOnLoad = function () {
  console.log('execute KQ0010010button2/Addition.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010button2-Addition');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0010010-KQ0010010button2-Addition" name="Addition" class="KQ0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnAddition",rb)%></button><!-- 追加ボタン --></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010button2-Modify">
expj.KQ0010010.KQ0010010button2.Modify = {};
// script1="onClick;0;CHK;_KQ0010010form1/ODR_QTY[lte]0@#KQ00022"
expj.KQ0010010.KQ0010010button2.Modify.onClick0 = function () {
  console.log('Modify script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/ODR_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('KQ0010010', 'KQ0010010button2', 'KQ00022');
}
};
// script2="onClick;1;CHK;_KQ0010010form1/h_BUSINESS_OPR_DATE[gt]_KQ0010010form1/DESINATED_DLV_DATE@#KQ00006"
expj.KQ0010010.KQ0010010button2.Modify.onClick1 = function () {
  console.log('Modify script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/h_BUSINESS_OPR_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/DESINATED_DLV_DATE')))) {
expj.common.pscript.addErrorMessage('KQ0010010', 'KQ0010010button2', 'KQ00006');
}
};
// script3="onClick;2;CHK;_KQ0010010form1/ODR_ACPT_DATE[gt]_KQ0010010form1/h_BUSINESS_OPR_DATE@#KQ00317"
expj.KQ0010010.KQ0010010button2.Modify.onClick2 = function () {
  console.log('Modify script3');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/ODR_ACPT_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addErrorMessage('KQ0010010', 'KQ0010010button2', 'KQ00317');
}
};
// script4="onClick;3;CHK;_KQ0010010form1/ODR_ACPT_DATE[lt]_KQ0010010form1/h_BUSINESS_OPR_DATE@$KQ00318"
expj.KQ0010010.KQ0010010button2.Modify.onClick3 = function () {
  console.log('Modify script4');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/ODR_ACPT_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('KQ0010010', 'KQ0010010button2', 'KQ00318');
}
};
// script5="onClick;4;CHK;_KQ0010010form1/c_DOODR[eq]true[and]_KQ0010010form1/JOB_ODR_DLV_DATE[neq][and]_KQ0010010form1/JOB_ODR_DLV_DATE[gt]_KQ0010010form1/DESINATED_DLV_DATE@#KQ00321"
expj.KQ0010010.KQ0010010button2.Modify.onClick4 = function () {
  console.log('Modify script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/c_DOODR'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/JOB_ODR_DLV_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/JOB_ODR_DLV_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/DESINATED_DLV_DATE')))) {
expj.common.pscript.addErrorMessage('KQ0010010', 'KQ0010010button2', 'KQ00321');
}
};
// script6="onClick;5;CHK;_KQ0010010form1/c_DOODR[eq]true[and]_KQ0010010form1/JOB_ODR_DLV_DATE[neq][and]_KQ0010010form1/JOB_ODR_DLV_DATE[lt]_KQ0010010form1/h_BUSINESS_OPR_DATE@#KQ00337"
expj.KQ0010010.KQ0010010button2.Modify.onClick5 = function () {
  console.log('Modify script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/c_DOODR'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/JOB_ODR_DLV_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/JOB_ODR_DLV_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addErrorMessage('KQ0010010', 'KQ0010010button2', 'KQ00337');
}
};
// script7="onClick;6;CHK;_KQ0010010form1/c_DOODR[eq]true[and]_KQ0010010form1/JOB_ODR_QTY[neq]0.0[and]_KQ0010010form1/ODR_QTY[neq]_KQ0010010form1/JOB_ODR_QTY@$KQ00323"
expj.KQ0010010.KQ0010010button2.Modify.onClick6 = function () {
  console.log('Modify script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/c_DOODR'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/JOB_ODR_QTY'), '[neq]', '0.0') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/ODR_QTY'), '[neq]', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/JOB_ODR_QTY'))) {
expj.common.pscript.addWarningMessage('KQ0010010', 'KQ0010010button2', 'KQ00323');
}
};
// script8="onClick;7;CHK;_KQ0010010form1/c_INPUTODRCD[eq]true@*0"
expj.KQ0010010.KQ0010010button2.Modify.onClick7 = function () {
  console.log('Modify script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/c_INPUTODRCD'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script9="onClick;8;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0010010view1/*,_KQ0010010form1/*@KQ0010010Servlet"
expj.KQ0010010.KQ0010010button2.Modify.onClick8 = function () {
  console.log('Modify script9');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0010010', 'KQ0010010button2', '_KQ0010010view1/*,_KQ0010010form1/*', 'KQ0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0010010', response);
expj.common.updateBusinessScreenTab('KQ0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script10="child;0;SELCHK;KQ0010010view1:_l_JOB_ODR_CD[neq]_KQ0010010form1/JOB_ODR_CD@*1"
expj.KQ0010010.KQ0010010button2.Modify.child0 = function () {
  console.log('Modify script10');
var selectCells = expj.common.pscript.getSelectedVIEWCells('KQ0010010', 'KQ0010010view1');
var checkFlg = true;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (!(expj.common.pscript.evaluate(cell.l_JOB_ODR_CD, '[neq]', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/JOB_ODR_CD')))) {
checkFlg = false;
break;
}
}
if (checkFlg) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script11="child;1;COLCHK;KQ0010010view1:_l_JOB_ODR_CD[neq]_KQ0010010form1/JOB_ODR_CD@,#KQ00322"
expj.KQ0010010.KQ0010010button2.Modify.child1 = function () {
  console.log('Modify script11');
var selectCells = expj.common.pscript.getPreviewVIEWCells('KQ0010010', 'KQ0010010view1');
var checkFlg = true;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (!(expj.common.pscript.evaluate(cell.l_JOB_ODR_CD, '[neq]', expj.common.pscript.getReferenceComponentValue('KQ0010010', 'KQ0010010button2', '_KQ0010010form1/JOB_ODR_CD')))) {
checkFlg = false;
break;
}
}
if (checkFlg) {

} else {
expj.common.pscript.addErrorMessage('KQ0010010', 'KQ0010010button2', 'KQ00322');
}
};
expj.KQ0010010.KQ0010010button2.Modify.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 8; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010010.KQ0010010button2.Modify['onClick' + i])) {
        expj.KQ0010010.KQ0010010button2.Modify['onClick' + i]();
      }
    }
  }
};
expj.KQ0010010.KQ0010010button2.Modify.executeAllOnDecision = function () {
};
expj.KQ0010010.KQ0010010button2.Modify.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010button2-Modify').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010010', 'KQ0010010button2', 'Modify', this, 'Button');
    }
  });
  expj.KQ0010010.KQ0010010button2.Modify.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010button2.Modify.executePScriptOnLoad = function () {
  console.log('execute KQ0010010button2/Modify.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010button2-Modify');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0010010-KQ0010010button2-Modify" name="Modify" class="KQ0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnModify",rb)%></button><!-- 修正ボタン --></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010button2-Eliminate">
expj.KQ0010010.KQ0010010button2.Eliminate = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0010010view1/*,_KQ0010010form1/*@KQ0010010Servlet"
expj.KQ0010010.KQ0010010button2.Eliminate.onClick0 = function () {
  console.log('Eliminate script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0010010', 'KQ0010010button2', '_KQ0010010view1/*,_KQ0010010form1/*', 'KQ0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0010010', response);
expj.common.updateBusinessScreenTab('KQ0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KQ0010010.KQ0010010button2.Eliminate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010010.KQ0010010button2.Eliminate['onClick' + i])) {
        expj.KQ0010010.KQ0010010button2.Eliminate['onClick' + i]();
      }
    }
  }
};
expj.KQ0010010.KQ0010010button2.Eliminate.executeAllOnDecision = function () {
};
expj.KQ0010010.KQ0010010button2.Eliminate.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010button2-Eliminate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010010', 'KQ0010010button2', 'Eliminate', this, 'Button');
    }
  });
  expj.KQ0010010.KQ0010010button2.Eliminate.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010button2.Eliminate.executePScriptOnLoad = function () {
  console.log('execute KQ0010010button2/Eliminate.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010button2-Eliminate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0010010-KQ0010010button2-Eliminate" name="Eliminate" class="KQ0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnEliminate",rb)%></button><!-- 消去ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 305px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">KQ0010010 Revision: 1.10  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-KQ0010010-KQ0010010button0">
expj.KQ0010010.KQ0010010button0 = {};
expj.KQ0010010.KQ0010010button0.executeAllOnDecision = function () {
  console.log('execute KQ0010010button0.onDecision');
};
expj.KQ0010010.KQ0010010button0.executeOnLoad = function () {
  expj.KQ0010010.KQ0010010button0.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010button0.executePScriptOnLoad = function () {
  console.log('execute KQ0010010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KQ0010010-KQ0010010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KQ0010010-KQ0010010button0-Insert">
expj.KQ0010010.KQ0010010button0.Insert = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0010010view1/*,_KQ0010010form1/*@KQ0010010Servlet,,$ZZ07001"
expj.KQ0010010.KQ0010010button0.Insert.onClick0 = function () {
  console.log('Insert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0010010', 'KQ0010010button0', '_KQ0010010view1/*,_KQ0010010form1/*', 'KQ0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0010010', response);
expj.common.updateBusinessScreenTab('KQ0010010', contents);
};
expj.common.pscript.callConfirm('KQ0010010', 'KQ0010010button0', 'ZZ07001', okEvent);
};
expj.KQ0010010.KQ0010010button0.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010010.KQ0010010button0.Insert['onClick' + i])) {
        expj.KQ0010010.KQ0010010button0.Insert['onClick' + i]();
      }
    }
  }
};
expj.KQ0010010.KQ0010010button0.Insert.executeAllOnDecision = function () {
};
expj.KQ0010010.KQ0010010button0.Insert.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010button0-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010010', 'KQ0010010button0', 'Insert', this, 'Button');
    }
  });
  expj.KQ0010010.KQ0010010button0.Insert.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010button0.Insert.executePScriptOnLoad = function () {
  console.log('execute KQ0010010button0/Insert.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010button0-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0010010-KQ0010010button0-Insert" name="Insert" class="KQ0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010button0-Clear">
expj.KQ0010010.KQ0010010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KQ0010010Servlet,,$ZZ07008"
expj.KQ0010010.KQ0010010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0010010', 'KQ0010010button0', '', 'KQ0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0010010', response);
expj.common.updateBusinessScreenTab('KQ0010010', contents);
};
expj.common.pscript.callConfirm('KQ0010010', 'KQ0010010button0', 'ZZ07008', okEvent);
};
expj.KQ0010010.KQ0010010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010010.KQ0010010button0.Clear['onClick' + i])) {
        expj.KQ0010010.KQ0010010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KQ0010010.KQ0010010button0.Clear.executeAllOnDecision = function () {
};
expj.KQ0010010.KQ0010010button0.Clear.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010010', 'KQ0010010button0', 'Clear', this, 'Button');
    }
  });
  expj.KQ0010010.KQ0010010button0.Clear.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KQ0010010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0010010-KQ0010010button0-Clear" name="Clear" class="KQ0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KQ0010010-KQ0010010button0-Close">
expj.KQ0010010.KQ0010010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KQ0010010.KQ0010010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KQ0010010');
};
expj.KQ0010010.KQ0010010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0010010.KQ0010010button0.Close['onClick' + i])) {
        expj.KQ0010010.KQ0010010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KQ0010010.KQ0010010button0.Close.executeAllOnDecision = function () {
};
expj.KQ0010010.KQ0010010button0.Close.executeOnLoad = function () {
  $('#expj-KQ0010010-KQ0010010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0010010', 'KQ0010010button0', 'Close', this, 'Button');
    }
  });
  expj.KQ0010010.KQ0010010button0.Close.executePScriptOnLoad();
};

expj.KQ0010010.KQ0010010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KQ0010010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KQ0010010-KQ0010010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0010010-KQ0010010button0-Close" name="Close" class="KQ0010010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KQ0010010 (END)-->
<%
MessageStruct msgStruct = aKQ0010010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KQ0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KQ0010010)) {
  expj.common.treeInstanceMap.KQ0010010 = {};
}
expj.common.treeInstanceMap.KQ0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KQ0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KQ0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KQ0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KQ0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KQ0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KQ0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KQ0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KQ0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KQ0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KQ0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0010010)) {
  expj.common.detailDialogMap.KQ0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KQ0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.KQ0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KQ0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KQ0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KQ0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KQ0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KQ0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KQ0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KQ0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KQ0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KQ0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KQ0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KQ0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KQ0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KQ0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KQ0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KQ0010010)) {
  expj.common.viewInstanceMap.KQ0010010 = {};
}
expj.common.viewInstanceMap.KQ0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.KQ0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KQ0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KQ0010010.<%=viewId %>.init = function () {
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
    expj.KQ0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KQ0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KQ0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KQ0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KQ0010010_init">
/**
 * KQ0010010用のロード完了時初期化関数
 */
expj.KQ0010010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KQ0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KQ0010010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KQ0010010');
  expj.common.calendarInstanceMap.KQ0010010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KQ0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KQ0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.KQ0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KQ0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KQ0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KQ0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KQ0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KQ0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KQ0010010-<%=detailId %>');
<%
 }
%>
  try{expj.KQ0010010.KQ0010010form1.ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.h_PRD_REQ_JOB_ODR_TYP_1.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.ODR_ACPT_DATE.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.CalendarOdrAcptDate.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.NO.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.CUST_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.h_PRD_REQ_JOB_ODR_TYP_2.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.c_DOODR.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.h_CHECK_STATUS.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.PeekerCustCd.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.JOB_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.CUST_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.PeekerCustItemCd.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.JOB_ODR_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.CalendarJOB_ODR_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.DLV_LOC_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.PeekerDlvLocCd.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.ALC_GRP_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.DESINATED_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.CalendarDesinatedDlvDate.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.c_INPUTODRCD.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.SPCL_PRICE_TYP.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.ODR_UNIT_PRICE.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.REMARKS.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.h_BUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.h_APR_ODR.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.APPR_REMARKS.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010button2.Addition.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010button2.Modify.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010button2.Eliminate.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010button0.Insert.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010view1.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010form1.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010button2.executeOnLoad();}catch(e){};
  try{expj.KQ0010010.KQ0010010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KQ0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KQ0010010', 'KQ0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KQ0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KQ0010010-focus-move');
  // 初期フォーカス当てる処理
  $('.KQ0010010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KQ0010010', '<%=request.getContextPath() %>');
};

/**
 * KQ0010010の全体onDecision処理
 */
expj.KQ0010010.executeAllOnDecision = function () {
  expj.KQ0010010.KQ0010010view1.executeAllOnDecision();
};
</script>
<script class="expj-script-KQ0010010_console">
expj.KQ0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>