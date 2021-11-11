<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:58:44 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KP0010\KP0010010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KP0010.*" %>
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
<jsp:useBean id="aKP0010010Control" class="com.nec.jp.orteus.metamorBase.KP0010.KP0010010Control" scope="request"/>
<jsp:useBean id="aKP0010010Struct" class="com.nec.jp.orteus.metamorBase.KP0010.KP0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

販売所要計画登録
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0010/jsp/KP0010010.jsp,v $
$Author: geng-jia $	
$Revision: 1.17 $　$Date: 2017/02/22 02:07:06 $
********************************************************* --%>
<html>
<head>
<title>販売所要計画登録</title>
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
<script class="expj-script-KP0010010_init">
  // KP0010010名前空間
  expj.KP0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-KP0010010" data-screen="KP0010010" data-newdata="<%=aKP0010010Control.isNewData() %>">
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
              <script class="expj-script-KP0010010-KP0010010view1">
expj.KP0010010.KP0010010view1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.KP0010010.KP0010010view1.onLoad0 = function () {
  console.log('KP0010010view1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHK;?KP0010010view1/?[eq]SINGLE@*10,*11"
expj.KP0010010.KP0010010view1.onDecision0 = function () {
  console.log('KP0010010view1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KP0010010', 'KP0010010view1', '?KP0010010view1/?'), '[eq]', 'SINGLE')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script3="onDecision;1;CHK;_KP0010010form1/IN_PLN_TERM_TYP[neq]2@*5"
expj.KP0010010.KP0010010view1.onDecision1 = function () {
  console.log('KP0010010view1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KP0010010', 'KP0010010view1', '_KP0010010form1/IN_PLN_TERM_TYP'), '[neq]', '2')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script4="onDecision;2;CHK;_KP0010010form1/IN_PLN_TERM_TYP[eq]2@*6,*7"
expj.KP0010010.KP0010010view1.onDecision2 = function () {
  console.log('KP0010010view1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KP0010010', 'KP0010010view1', '_KP0010010form1/IN_PLN_TERM_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script5="onDecision;3;CHK;?KP0010010view1/?[eq]NOT_SELECTED@*12"
expj.KP0010010.KP0010010view1.onDecision3 = function () {
  console.log('KP0010010view1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KP0010010', 'KP0010010view1', '?KP0010010view1/?'), '[eq]', 'NOT_SELECTED')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script6="onClick;0;SET;_KP0010010form1/h_NO=_KP0010010view1/NO,_KP0010010form1/chkADD_TO_OD=_KP0010010view1/TEMP_ADD_TO_OD_FLG,_KP0010010form1/IN_PLN_TERM_TYP=_KP0010010view1/PLN_TERM_TYP,_KP0010010form1/IN_PLN_STR_DATE=_KP0010010view1/PLN_STR_DATE,_KP0010010form1/IN_PLN_QTY=_KP0010010view1/PLN_QTY,_KP0010010form1/IN_PLN_END_DATE=_KP0010010view1/PLN_END_DATE,_KP0010010form1/IN_CUST_CD=_KP0010010view1/CUST_CD,_KP0010010form1/IN_CUST_ITEM_CD=_KP0010010view1/CUST_ITEM_CD,_KP0010010form1/IN_DLV_LOC_CD=_KP0010010view1/DLV_LOC_CD"
expj.KP0010010.KP0010010view1.onClick0 = function () {
  console.log('KP0010010view1 script6');
expj.common.pscript.setReferenceComponentValue('KP0010010', 'KP0010010view1', '_KP0010010form1/h_NO', expj.common.pscript.getReferenceComponentValue('KP0010010', 'KP0010010view1', '_KP0010010view1/NO'));
expj.common.pscript.setReferenceComponentValue('KP0010010', 'KP0010010view1', '_KP0010010form1/chkADD_TO_OD', expj.common.pscript.getReferenceComponentValue('KP0010010', 'KP0010010view1', '_KP0010010view1/TEMP_ADD_TO_OD_FLG'));
expj.common.pscript.setReferenceComponentValue('KP0010010', 'KP0010010view1', '_KP0010010form1/IN_PLN_TERM_TYP', expj.common.pscript.getReferenceComponentValue('KP0010010', 'KP0010010view1', '_KP0010010view1/PLN_TERM_TYP'));
expj.common.pscript.setReferenceComponentValue('KP0010010', 'KP0010010view1', '_KP0010010form1/IN_PLN_STR_DATE', expj.common.pscript.getReferenceComponentValue('KP0010010', 'KP0010010view1', '_KP0010010view1/PLN_STR_DATE'));
expj.common.pscript.setReferenceComponentValue('KP0010010', 'KP0010010view1', '_KP0010010form1/IN_PLN_QTY', expj.common.pscript.getReferenceComponentValue('KP0010010', 'KP0010010view1', '_KP0010010view1/PLN_QTY'));
expj.common.pscript.setReferenceComponentValue('KP0010010', 'KP0010010view1', '_KP0010010form1/IN_PLN_END_DATE', expj.common.pscript.getReferenceComponentValue('KP0010010', 'KP0010010view1', '_KP0010010view1/PLN_END_DATE'));
expj.common.pscript.setReferenceComponentValue('KP0010010', 'KP0010010view1', '_KP0010010form1/IN_CUST_CD', expj.common.pscript.getReferenceComponentValue('KP0010010', 'KP0010010view1', '_KP0010010view1/CUST_CD'));
expj.common.pscript.setReferenceComponentValue('KP0010010', 'KP0010010view1', '_KP0010010form1/IN_CUST_ITEM_CD', expj.common.pscript.getReferenceComponentValue('KP0010010', 'KP0010010view1', '_KP0010010view1/CUST_ITEM_CD'));
expj.common.pscript.setReferenceComponentValue('KP0010010', 'KP0010010view1', '_KP0010010form1/IN_DLV_LOC_CD', expj.common.pscript.getReferenceComponentValue('KP0010010', 'KP0010010view1', '_KP0010010view1/DLV_LOC_CD'));
};
// script7="child;0;UNMASK;_KP0010010button1/Addition"
expj.KP0010010.KP0010010view1.child0 = function () {
  console.log('KP0010010view1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('KP0010010', 'KP0010010view1', '_KP0010010button1/Addition');
};
// script8="child;1;MASK;_KP0010010button1/Addition,_KP0010010button1/Modify,_KP0010010button1/Eliminate"
expj.KP0010010.KP0010010view1.child1 = function () {
  console.log('KP0010010view1 script8');
expj.common.pscript.setMaskToReferenceComponent('KP0010010', 'KP0010010view1', '_KP0010010button1/Addition');
expj.common.pscript.setMaskToReferenceComponent('KP0010010', 'KP0010010view1', '_KP0010010button1/Modify');
expj.common.pscript.setMaskToReferenceComponent('KP0010010', 'KP0010010view1', '_KP0010010button1/Eliminate');
};
// script9="child;2;CHKRQ;A@*4,*1"
expj.KP0010010.KP0010010view1.child2 = function () {
  console.log('KP0010010view1 script9');
if (expj.common.pscript.satisfiedRequiredComponent('KP0010010', 'A')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script10="child;3;CHKRQ;A@*0,*1"
expj.KP0010010.KP0010010view1.child3 = function () {
  console.log('KP0010010view1 script10');
if (expj.common.pscript.satisfiedRequiredComponent('KP0010010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script11="child;4;UNMASK;_KP0010010button1/Addition,_KP0010010button1/Modify,_KP0010010button1/Eliminate"
expj.KP0010010.KP0010010view1.child4 = function () {
  console.log('KP0010010view1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('KP0010010', 'KP0010010view1', '_KP0010010button1/Addition');
expj.common.pscript.setUnMaskToReferenceComponent('KP0010010', 'KP0010010view1', '_KP0010010button1/Modify');
expj.common.pscript.setUnMaskToReferenceComponent('KP0010010', 'KP0010010view1', '_KP0010010button1/Eliminate');
};
// script12="child;5;SET;_KP0010010form1/IN_PLN_END_DATE="
expj.KP0010010.KP0010010view1.child5 = function () {
  console.log('KP0010010view1 script12');
expj.common.pscript.setReferenceComponentValue('KP0010010', 'KP0010010view1', '_KP0010010form1/IN_PLN_END_DATE', '');
};
// script13="child;6;UNMASK;_KP0010010form1/IN_PLN_END_DATE,_KP0010010form1/CalendarIN_PLN_END_DATE"
expj.KP0010010.KP0010010view1.child6 = function () {
  console.log('KP0010010view1 script13');
expj.common.pscript.setUnMaskToReferenceComponent('KP0010010', 'KP0010010view1', '_KP0010010form1/IN_PLN_END_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('KP0010010', 'KP0010010view1', '_KP0010010form1/CalendarIN_PLN_END_DATE');
};
// script14="child;7;MASK;_KP0010010form1/IN_PLN_END_DATE,_KP0010010form1/CalendarIN_PLN_END_DATE"
expj.KP0010010.KP0010010view1.child7 = function () {
  console.log('KP0010010view1 script14');
expj.common.pscript.setMaskToReferenceComponent('KP0010010', 'KP0010010view1', '_KP0010010form1/IN_PLN_END_DATE');
expj.common.pscript.setMaskToReferenceComponent('KP0010010', 'KP0010010view1', '_KP0010010form1/CalendarIN_PLN_END_DATE');
};
// script15="child;8;CHKRQ;B@*2,*1"
expj.KP0010010.KP0010010view1.child8 = function () {
  console.log('KP0010010view1 script15');
if (expj.common.pscript.satisfiedRequiredComponent('KP0010010', 'B')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script16="child;9;CHKRQ;B@*3,*1"
expj.KP0010010.KP0010010view1.child9 = function () {
  console.log('KP0010010view1 script16');
if (expj.common.pscript.satisfiedRequiredComponent('KP0010010', 'B')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script17="child;10;CHK;_KP0010010form1/IN_PLN_TERM_TYP[eq]2@*8,*2"
expj.KP0010010.KP0010010view1.child10 = function () {
  console.log('KP0010010view1 script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KP0010010', 'KP0010010view1', '_KP0010010form1/IN_PLN_TERM_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script18="child;11;CHK;_KP0010010form1/IN_PLN_TERM_TYP[eq]2@*9,*3"
expj.KP0010010.KP0010010view1.child11 = function () {
  console.log('KP0010010view1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KP0010010', 'KP0010010view1', '_KP0010010form1/IN_PLN_TERM_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script19="child;12;MASK;_KP0010010button1/Modify,_KP0010010button1/Eliminate"
expj.KP0010010.KP0010010view1.child12 = function () {
  console.log('KP0010010view1 script19');
expj.common.pscript.setMaskToReferenceComponent('KP0010010', 'KP0010010view1', '_KP0010010button1/Modify');
expj.common.pscript.setMaskToReferenceComponent('KP0010010', 'KP0010010view1', '_KP0010010button1/Eliminate');
};
expj.KP0010010.KP0010010view1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0010010.KP0010010view1['onClick' + i])) {
        expj.KP0010010.KP0010010view1['onClick' + i]();
      }
    }
  }
};
expj.KP0010010.KP0010010view1.executeAllOnDecision = function () {
  console.log('execute KP0010010view1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0010010.KP0010010view1['onDecision' + i])) {
        expj.KP0010010.KP0010010view1['onDecision' + i]();
      }
    }
  }
};
expj.KP0010010.KP0010010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("KP0010010view1", "expj.KP0010010.KP0010010view1.executeAllOnClick");
%>
  expj.KP0010010.KP0010010view1.executePScriptOnLoad();
};

expj.KP0010010.KP0010010view1.executePScriptOnLoad = function () {
  console.log('execute KP0010010view1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KP0010010.KP0010010view1['onLoad' + i])) {
      expj.KP0010010.KP0010010view1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-KP0010010-KP0010010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%= TypeConverter.sanitizer(aKP0010010Control.getReadStatusString()) %>"></div>
<!-- VIEW END -->
<%
 String KP0010010view1_Id = "KP0010010view1";
 String KP0010010view1_select = "single";
 String KP0010010view1_sortable = "true";
 String KP0010010view1_resize = "true";
 String KP0010010view1_scroll = "true";
 StringBuffer KP0010010view1_HB = new StringBuffer();
 StringBuffer KP0010010view1_DB = new StringBuffer();
%>
<%
 KP0010010view1_select = "single";
 KP0010010view1_sortable = "true";
 KP0010010view1_resize = "true";
 KP0010010view1_scroll = "true";
%>
<%
 KP0010010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(KP0010010view1_sortable).append("}").append(",");
%>
     
<%
KP0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'30px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0058",rb))).append("', 'name':'NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KP0010010view1_sortable).append("}").append(",");
KP0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_CD",rb))).append("', 'name':'CUST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0010010view1_sortable).append("}").append(",");
KP0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_NAME",rb))).append("', 'name':'CUST_ANAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0010010view1_sortable).append("}").append(",");
KP0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DLV_LOC_CD",rb))).append("', 'name':'DLV_LOC_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0010010view1_sortable).append("}").append(",");
KP0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DLV_LOC_NAME",rb))).append("', 'name':'DLV_LOC_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0010010view1_sortable).append("}").append(",");
KP0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_CD",rb))).append("', 'name':'CUST_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0010010view1_sortable).append("}").append(",");
KP0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_NAME",rb))).append("', 'name':'CUST_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0010010view1_sortable).append("}").append(",");
KP0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLN_STR_DATE",rb))).append("', 'name':'PLN_STR_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0010010view1_sortable).append("}").append(",");
KP0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLN_END_DATE",rb))).append("', 'name':'PLN_END_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0010010view1_sortable).append("}").append(",");
KP0010010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLN_QTY",rb))).append("', 'name':'PLN_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KP0010010view1_sortable).append("}").append(",");
KP0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_UNIT",rb))).append("', 'name':'STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0010010view1_sortable).append("}").append(",");
KP0010010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TERM_DAYS",rb))).append("', 'name':'TERM_DAYS', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KP0010010view1_sortable).append("}").append(",");
KP0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLN_TERM_TYP",rb))).append("', 'name':'PLN_TERM_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0010010view1_sortable).append("}").append(",");
KP0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'PLN_TERM_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KP0010010view1_sortable).append("}").append(",");
KP0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLANT_CD",rb))).append("', 'name':'PLANT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0010010view1_sortable).append("}").append(",");
KP0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0010010view1_sortable).append("}").append(",");
KP0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0010010view1_sortable).append("}").append(",");
KP0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb))).append("', 'name':'MRP_ODR_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0010010view1_sortable).append("}").append(",");
KP0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'MRP_ODR_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KP0010010view1_sortable).append("}").append(",");
KP0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ADD_TO_OD_FLG",rb))).append("', 'name':'ADD_TO_OD_FLG_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KP0010010view1_sortable).append("}").append(",");
KP0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ADD_TO_OD_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KP0010010view1_sortable).append("}").append(",");
KP0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'TEMP_ADD_TO_OD_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KP0010010view1_sortable).append("}").append(",");
%>
<%
 int aKP0010010StructLength = aKP0010010Control.getListsize();
 final KP0010010Struct structBackup = aKP0010010Struct;
 aKP0010010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aKP0010010StructLength; ++loopCount) {
  if((aKP0010010Struct = (KP0010010Struct) aKP0010010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aKP0010010Struct", aKP0010010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 KP0010010view1_DB.append("[");
 KP0010010view1_DB.append(loopCount);
 KP0010010view1_DB.append(",").append("'<span id=\"expj-KP0010010-KP0010010view1-NO-").append(loopCount).append("\" class=\"expj-label expj-KP0010010-KP0010010view1-NO\" data-name=\"NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0010010Struct.getNO())).append("</span>'");
 KP0010010view1_DB.append(",").append("'<span id=\"expj-KP0010010-KP0010010view1-CUST_CD-").append(loopCount).append("\" class=\"expj-label expj-KP0010010-KP0010010view1-CUST_CD\" data-name=\"CUST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0010010Struct.getCUST_CD())).append("</span>'");
 KP0010010view1_DB.append(",").append("'<span id=\"expj-KP0010010-KP0010010view1-CUST_ANAME-").append(loopCount).append("\" class=\"expj-label expj-KP0010010-KP0010010view1-CUST_ANAME\" data-name=\"CUST_ANAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0010010Struct.getCUST_ANAME())).append("</span>'");
 KP0010010view1_DB.append(",").append("'<span id=\"expj-KP0010010-KP0010010view1-DLV_LOC_CD-").append(loopCount).append("\" class=\"expj-label expj-KP0010010-KP0010010view1-DLV_LOC_CD\" data-name=\"DLV_LOC_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0010010Struct.getDLV_LOC_CD())).append("</span>'");
 KP0010010view1_DB.append(",").append("'<span id=\"expj-KP0010010-KP0010010view1-DLV_LOC_NAME-").append(loopCount).append("\" class=\"expj-label expj-KP0010010-KP0010010view1-DLV_LOC_NAME\" data-name=\"DLV_LOC_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0010010Struct.getDLV_LOC_NAME())).append("</span>'");
 KP0010010view1_DB.append(",").append("'<span id=\"expj-KP0010010-KP0010010view1-CUST_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KP0010010-KP0010010view1-CUST_ITEM_CD\" data-name=\"CUST_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0010010Struct.getCUST_ITEM_CD())).append("</span>'");
 KP0010010view1_DB.append(",").append("'<span id=\"expj-KP0010010-KP0010010view1-CUST_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KP0010010-KP0010010view1-CUST_ITEM_NAME\" data-name=\"CUST_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0010010Struct.getCUST_ITEM_NAME())).append("</span>'");
 KP0010010view1_DB.append(",").append("'<span id=\"expj-KP0010010-KP0010010view1-PLN_STR_DATE-").append(loopCount).append("\" class=\"expj-label expj-KP0010010-KP0010010view1-PLN_STR_DATE\" data-name=\"PLN_STR_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0010010Struct.getPLN_STR_DATE())).append("</span>'");
 KP0010010view1_DB.append(",").append("'<span id=\"expj-KP0010010-KP0010010view1-PLN_END_DATE-").append(loopCount).append("\" class=\"expj-label expj-KP0010010-KP0010010view1-PLN_END_DATE\" data-name=\"PLN_END_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0010010Struct.getPLN_END_DATE())).append("</span>'");
 KP0010010view1_DB.append(",").append("'<span id=\"expj-KP0010010-KP0010010view1-PLN_QTY-").append(loopCount).append("\" class=\"expj-label expj-KP0010010-KP0010010view1-PLN_QTY\" data-name=\"PLN_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0010010Struct.getPLN_QTY())).append("</span>'");
 KP0010010view1_DB.append(",").append("'<span id=\"expj-KP0010010-KP0010010view1-STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-KP0010010-KP0010010view1-STOCK_UNIT\" data-name=\"STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0010010Struct.getSTOCK_UNIT())).append("</span>'");
 KP0010010view1_DB.append(",").append("'<span id=\"expj-KP0010010-KP0010010view1-TERM_DAYS-").append(loopCount).append("\" class=\"expj-label expj-KP0010010-KP0010010view1-TERM_DAYS\" data-name=\"TERM_DAYS\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0010010Struct.getTERM_DAYS())).append("</span>'");
 KP0010010view1_DB.append(",").append("'<span id=\"expj-KP0010010-KP0010010view1-PLN_TERM_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-KP0010010-KP0010010view1-PLN_TERM_TYP_DN\" data-name=\"PLN_TERM_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0010010Struct.getPLN_TERM_TYP_DN())).append("</span>'");
 KP0010010view1_DB.append(",").append("'<span id=\"expj-KP0010010-KP0010010view1-PLN_TERM_TYP-").append(loopCount).append("\" class=\"expj-label expj-KP0010010-KP0010010view1-PLN_TERM_TYP\" data-name=\"PLN_TERM_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0010010Struct.getPLN_TERM_TYP())).append("</span>'");
 KP0010010view1_DB.append(",").append("'<span id=\"expj-KP0010010-KP0010010view1-PLANT_CD-").append(loopCount).append("\" class=\"expj-label expj-KP0010010-KP0010010view1-PLANT_CD\" data-name=\"PLANT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0010010Struct.getPLANT_CD())).append("</span>'");
 KP0010010view1_DB.append(",").append("'<span id=\"expj-KP0010010-KP0010010view1-ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KP0010010-KP0010010view1-ITEM_CD\" data-name=\"ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0010010Struct.getITEM_CD())).append("</span>'");
 KP0010010view1_DB.append(",").append("'<span id=\"expj-KP0010010-KP0010010view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KP0010010-KP0010010view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0010010Struct.getITEM_NAME())).append("</span>'");
 KP0010010view1_DB.append(",").append("'<span id=\"expj-KP0010010-KP0010010view1-MRP_ODR_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-KP0010010-KP0010010view1-MRP_ODR_TYP_DN\" data-name=\"MRP_ODR_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0010010Struct.getMRP_ODR_TYP_DN())).append("</span>'");
 KP0010010view1_DB.append(",").append("'<span id=\"expj-KP0010010-KP0010010view1-MRP_ODR_TYP-").append(loopCount).append("\" class=\"expj-label expj-KP0010010-KP0010010view1-MRP_ODR_TYP\" data-name=\"MRP_ODR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0010010Struct.getMRP_ODR_TYP())).append("</span>'");
 KP0010010view1_DB.append(",").append("'<span id=\"expj-KP0010010-KP0010010view1-ADD_TO_OD_FLG_DN-").append(loopCount).append("\" class=\"expj-label expj-KP0010010-KP0010010view1-ADD_TO_OD_FLG_DN\" data-name=\"ADD_TO_OD_FLG_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0010010Struct.getADD_TO_OD_FLG_DN())).append("</span>'");
 KP0010010view1_DB.append(",").append("'<span id=\"expj-KP0010010-KP0010010view1-ADD_TO_OD_FLG-").append(loopCount).append("\" class=\"expj-label expj-KP0010010-KP0010010view1-ADD_TO_OD_FLG\" data-name=\"ADD_TO_OD_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0010010Struct.getADD_TO_OD_FLG())).append("</span>'");
 KP0010010view1_DB.append(",").append("'<span id=\"expj-KP0010010-KP0010010view1-TEMP_ADD_TO_OD_FLG-").append(loopCount).append("\" class=\"expj-label expj-KP0010010-KP0010010view1-TEMP_ADD_TO_OD_FLG\" data-name=\"TEMP_ADD_TO_OD_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aKP0010010Struct.getTEMP_ADD_TO_OD_FLG())).append("</span>'");
 KP0010010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aKP0010010StructLength) {
   KP0010010view1_DB.append(",");
  }
 }
 aKP0010010Struct = structBackup;
 viewIdList.add(KP0010010view1_Id);
 viewSelectList.add(KP0010010view1_select);
 viewResizeList.add(KP0010010view1_resize);
 viewScrollList.add(KP0010010view1_scroll);
 viewHeaderDataList.add(KP0010010view1_HB);
 viewBodyDataList.add(KP0010010view1_DB);
%>
<%
}
%>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame01 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame02 button-area" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame03 button-area-right" style="width:60px;"></div><!--/td-->
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
<div class="expj-td frame05" style=""><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KP0010010-KP0010010form1">
expj.KP0010010.KP0010010form1 = {};
expj.KP0010010.KP0010010form1.executeAllOnDecision = function () {
  console.log('execute KP0010010form1.onDecision');
};
expj.KP0010010.KP0010010form1.executeOnLoad = function () {
  expj.KP0010010.KP0010010form1.executePScriptOnLoad();
};

expj.KP0010010.KP0010010form1.executePScriptOnLoad = function () {
  console.log('execute KP0010010form1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KP0010010-KP0010010form1" action="KP0010010Servlet" name="KP0010010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:165px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:165px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:center"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:170px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KP0010010-KP0010010form1-chkADD_TO_OD">
expj.KP0010010.KP0010010form1.chkADD_TO_OD = {};
expj.KP0010010.KP0010010form1.chkADD_TO_OD.executeAllOnDecision = function () {
  console.log('execute KP0010010form1/chkADD_TO_OD.onDecision');
  expj.KP0010010.KP0010010form1.executeAllOnDecision();
  expj.KP0010010.executeAllOnDecision();
};
expj.KP0010010.KP0010010form1.chkADD_TO_OD.executeOnLoad = function () {
  $('#expj-KP0010010-KP0010010form1-chkADD_TO_OD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0010010', 'KP0010010form1', 'chkADD_TO_OD', this, 'CheckBox');
    }
  });
  expj.KP0010010.KP0010010form1.chkADD_TO_OD.executePScriptOnLoad();
};

expj.KP0010010.KP0010010form1.chkADD_TO_OD.executePScriptOnLoad = function () {
  console.log('execute KP0010010form1/chkADD_TO_OD.onLoad');
  var targetComponent = document.getElementById('expj-KP0010010-KP0010010form1-chkADD_TO_OD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="chkADD_TO_OD" value="true" <%= ("true".equals(TypeConverter.convert(aKP0010010Struct.getchkADD_TO_OD())) || "1".equals(TypeConverter.convert(aKP0010010Struct.getchkADD_TO_OD())))?"checked=\"checked\"":"" %>  class="KP0010010-focus-move" id="expj-KP0010010-KP0010010form1-chkADD_TO_OD"><label for="expj-KP0010010-KP0010010form1-chkADD_TO_OD"><%=CoreTools.getRBString("Expj.Cmt0272",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KP0010010-KP0010010form1-IN_CUST_CD">
expj.KP0010010.KP0010010form1.IN_CUST_CD = {};
expj.KP0010010.KP0010010form1.IN_CUST_CD.executeAllOnDecision = function () {
  console.log('execute KP0010010form1/IN_CUST_CD.onDecision');
  expj.KP0010010.KP0010010form1.executeAllOnDecision();
  expj.KP0010010.executeAllOnDecision();
};
expj.KP0010010.KP0010010form1.IN_CUST_CD.executeOnLoad = function () {
  $('#expj-KP0010010-KP0010010form1-IN_CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0010010', 'KP0010010form1', 'IN_CUST_CD', this);
  });
  expj.KP0010010.KP0010010form1.IN_CUST_CD.executePScriptOnLoad();
};

expj.KP0010010.KP0010010form1.IN_CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KP0010010form1/IN_CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KP0010010-KP0010010form1-IN_CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KP0010010-KP0010010form1-IN_CUST_CD" name="IN_CUST_CD" class="KP0010010-focus-move  required-value expj-KP0010010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKP0010010Struct.getIN_CUST_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KP0010010-KP0010010form1-PeekerCustCd">
expj.KP0010010.KP0010010form1.PeekerCustCd = {};
// script1="onClick;0;PEEKER;_KP0010010form1/IN_CUST_CD@<%=contextNo%>"
expj.KP0010010.KP0010010form1.PeekerCustCd.onClick0 = function () {
  console.log('PeekerCustCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KP0010010';
var parameterValues = 'PeekerCustCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KP0010010', 'KP0010010form1', '_IN_CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUST_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KP0010010form1/IN_CUST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KP0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KP0010010.KP0010010form1.PeekerCustCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0010010.KP0010010form1.PeekerCustCd['onClick' + i])) {
        expj.KP0010010.KP0010010form1.PeekerCustCd['onClick' + i]();
      }
    }
  }
};
expj.KP0010010.KP0010010form1.PeekerCustCd.executeAllOnDecision = function () {
};
expj.KP0010010.KP0010010form1.PeekerCustCd.executeOnLoad = function () {
  $('#expj-KP0010010-KP0010010form1-PeekerCustCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0010010', 'KP0010010form1', 'PeekerCustCd', this, 'Button');
    }
  });
  expj.KP0010010.KP0010010form1.PeekerCustCd.executePScriptOnLoad();
};

expj.KP0010010.KP0010010form1.PeekerCustCd.executePScriptOnLoad = function () {
  console.log('execute KP0010010form1/PeekerCustCd.onLoad');
  var targetComponent = document.getElementById('expj-KP0010010-KP0010010form1-PeekerCustCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KP0010010-KP0010010form1-PeekerCustCd" class="KP0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KP0010010-KP0010010form1-h_NO" name="h_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKP0010010Struct.geth_NO()) %>">
<script class="expj-script-KP0010010-KP0010010form1-h_NO">
expj.KP0010010.KP0010010form1.h_NO = {};
expj.KP0010010.KP0010010form1.h_NO.executeAllOnDecision = function () {
  console.log('execute KP0010010form1/h_NO.onDecision');
  expj.KP0010010.KP0010010form1.executeAllOnDecision();
  expj.KP0010010.executeAllOnDecision();
};
expj.KP0010010.KP0010010form1.h_NO.executeOnLoad = function () {
  $('#expj-KP0010010-KP0010010form1-h_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0010010', 'KP0010010form1', 'h_NO', this);
  });
  expj.KP0010010.KP0010010form1.h_NO.executePScriptOnLoad();
};

expj.KP0010010.KP0010010form1.h_NO.executePScriptOnLoad = function () {
  console.log('execute KP0010010form1/h_NO.onLoad');
  var targetComponent = document.getElementById('expj-KP0010010-KP0010010form1-h_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CUST_ITEM_CD",rb)%></span><!-- 得意先品目番号 --></div><!--/td-->
<script class="expj-script-KP0010010-KP0010010form1-IN_CUST_ITEM_CD">
expj.KP0010010.KP0010010form1.IN_CUST_ITEM_CD = {};
expj.KP0010010.KP0010010form1.IN_CUST_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KP0010010form1/IN_CUST_ITEM_CD.onDecision');
  expj.KP0010010.KP0010010form1.executeAllOnDecision();
  expj.KP0010010.executeAllOnDecision();
};
expj.KP0010010.KP0010010form1.IN_CUST_ITEM_CD.executeOnLoad = function () {
  $('#expj-KP0010010-KP0010010form1-IN_CUST_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0010010', 'KP0010010form1', 'IN_CUST_ITEM_CD', this);
  });
  expj.KP0010010.KP0010010form1.IN_CUST_ITEM_CD.executePScriptOnLoad();
};

expj.KP0010010.KP0010010form1.IN_CUST_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KP0010010form1/IN_CUST_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KP0010010-KP0010010form1-IN_CUST_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KP0010010-KP0010010form1-IN_CUST_ITEM_CD" name="IN_CUST_ITEM_CD" class="KP0010010-focus-move  required-value expj-KP0010010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKP0010010Struct.getIN_CUST_ITEM_CD()) %>" maxlength="35" ></div><!--/td-->
<script class="expj-script-KP0010010-KP0010010form1-PeekerCustItemCd">
expj.KP0010010.KP0010010form1.PeekerCustItemCd = {};
// script1="onClick;0;PEEKER;_KP0010010form1/IN_CUST_ITEM_CD@<%=contextNo%>"
expj.KP0010010.KP0010010form1.PeekerCustItemCd.onClick0 = function () {
  console.log('PeekerCustItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KP0010010';
var parameterValues = 'PeekerCustItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KP0010010', 'KP0010010form1', '_IN_CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_3%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KP0010010', 'KP0010010form1', '_IN_CUST_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUST_ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KP0010010form1/IN_CUST_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KP0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KP0010010.KP0010010form1.PeekerCustItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0010010.KP0010010form1.PeekerCustItemCd['onClick' + i])) {
        expj.KP0010010.KP0010010form1.PeekerCustItemCd['onClick' + i]();
      }
    }
  }
};
expj.KP0010010.KP0010010form1.PeekerCustItemCd.executeAllOnDecision = function () {
};
expj.KP0010010.KP0010010form1.PeekerCustItemCd.executeOnLoad = function () {
  $('#expj-KP0010010-KP0010010form1-PeekerCustItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0010010', 'KP0010010form1', 'PeekerCustItemCd', this, 'Button');
    }
  });
  expj.KP0010010.KP0010010form1.PeekerCustItemCd.executePScriptOnLoad();
};

expj.KP0010010.KP0010010form1.PeekerCustItemCd.executePScriptOnLoad = function () {
  console.log('execute KP0010010form1/PeekerCustItemCd.onLoad');
  var targetComponent = document.getElementById('expj-KP0010010-KP0010010form1-PeekerCustItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KP0010010-KP0010010form1-PeekerCustItemCd" class="KP0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DLV_LOC_CD",rb)%></span><!-- 納品場所コード --></div><!--/td-->
<script class="expj-script-KP0010010-KP0010010form1-IN_DLV_LOC_CD">
expj.KP0010010.KP0010010form1.IN_DLV_LOC_CD = {};
expj.KP0010010.KP0010010form1.IN_DLV_LOC_CD.executeAllOnDecision = function () {
  console.log('execute KP0010010form1/IN_DLV_LOC_CD.onDecision');
  expj.KP0010010.KP0010010form1.executeAllOnDecision();
  expj.KP0010010.executeAllOnDecision();
};
expj.KP0010010.KP0010010form1.IN_DLV_LOC_CD.executeOnLoad = function () {
  $('#expj-KP0010010-KP0010010form1-IN_DLV_LOC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0010010', 'KP0010010form1', 'IN_DLV_LOC_CD', this);
  });
  expj.KP0010010.KP0010010form1.IN_DLV_LOC_CD.executePScriptOnLoad();
};

expj.KP0010010.KP0010010form1.IN_DLV_LOC_CD.executePScriptOnLoad = function () {
  console.log('execute KP0010010form1/IN_DLV_LOC_CD.onLoad');
  var targetComponent = document.getElementById('expj-KP0010010-KP0010010form1-IN_DLV_LOC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KP0010010-KP0010010form1-IN_DLV_LOC_CD" name="IN_DLV_LOC_CD" class="KP0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKP0010010Struct.getIN_DLV_LOC_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KP0010010-KP0010010form1-PeekerDlvLocCd">
expj.KP0010010.KP0010010form1.PeekerDlvLocCd = {};
// script1="onClick;0;PEEKER;_KP0010010form1/IN_DLV_LOC_CD@<%=contextNo%>"
expj.KP0010010.KP0010010form1.PeekerDlvLocCd.onClick0 = function () {
  console.log('PeekerDlvLocCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KP0010010';
var parameterValues = 'PeekerDlvLocCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KP0010010', 'KP0010010form1', '_IN_CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_3%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KP0010010', 'KP0010010form1', '_IN_DLV_LOC_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%DLV_LOC_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KP0010010form1/IN_DLV_LOC_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KP0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KP0010010.KP0010010form1.PeekerDlvLocCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0010010.KP0010010form1.PeekerDlvLocCd['onClick' + i])) {
        expj.KP0010010.KP0010010form1.PeekerDlvLocCd['onClick' + i]();
      }
    }
  }
};
expj.KP0010010.KP0010010form1.PeekerDlvLocCd.executeAllOnDecision = function () {
};
expj.KP0010010.KP0010010form1.PeekerDlvLocCd.executeOnLoad = function () {
  $('#expj-KP0010010-KP0010010form1-PeekerDlvLocCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0010010', 'KP0010010form1', 'PeekerDlvLocCd', this, 'Button');
    }
  });
  expj.KP0010010.KP0010010form1.PeekerDlvLocCd.executePScriptOnLoad();
};

expj.KP0010010.KP0010010form1.PeekerDlvLocCd.executePScriptOnLoad = function () {
  console.log('execute KP0010010form1/PeekerDlvLocCd.onLoad');
  var targetComponent = document.getElementById('expj-KP0010010-KP0010010form1-PeekerDlvLocCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KP0010010-KP0010010form1-PeekerDlvLocCd" class="KP0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PLN_TERM_TYP",rb)%></span><!-- 計画期間タイプ --></div><!--/td-->
<script class="expj-script-KP0010010-KP0010010form1-IN_PLN_TERM_TYP">
expj.KP0010010.KP0010010form1.IN_PLN_TERM_TYP = {};
expj.KP0010010.KP0010010form1.IN_PLN_TERM_TYP.executeAllOnDecision = function () {
  console.log('execute KP0010010form1/IN_PLN_TERM_TYP.onDecision');
  expj.KP0010010.KP0010010form1.executeAllOnDecision();
  expj.KP0010010.executeAllOnDecision();
};
expj.KP0010010.KP0010010form1.IN_PLN_TERM_TYP.executeOnLoad = function () {
  $('#expj-KP0010010-KP0010010form1-IN_PLN_TERM_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('KP0010010', 'KP0010010form1', 'IN_PLN_TERM_TYP', this);
  });
  expj.KP0010010.KP0010010form1.IN_PLN_TERM_TYP.executePScriptOnLoad();
};

expj.KP0010010.KP0010010form1.IN_PLN_TERM_TYP.executePScriptOnLoad = function () {
  console.log('execute KP0010010form1/IN_PLN_TERM_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KP0010010-KP0010010form1-IN_PLN_TERM_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-KP0010010-KP0010010form1-IN_PLN_TERM_TYP" name='IN_PLN_TERM_TYP' class='KP0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = aKP0010010Control.getStruct().getList_IN_PLN_TERM_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aKP0010010Control.getStruct().getList_IN_PLN_TERM_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aKP0010010Control.getStruct().getList_IN_PLN_TERM_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aKP0010010Struct.getIN_PLN_TERM_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt0746",rb)%></span><!-- 計画期間 --></div><!--/td-->
<script class="expj-script-KP0010010-KP0010010form1-IN_PLN_STR_DATE">
expj.KP0010010.KP0010010form1.IN_PLN_STR_DATE = {};
expj.KP0010010.KP0010010form1.IN_PLN_STR_DATE.executeAllOnDecision = function () {
  console.log('execute KP0010010form1/IN_PLN_STR_DATE.onDecision');
  expj.KP0010010.KP0010010form1.executeAllOnDecision();
  expj.KP0010010.executeAllOnDecision();
};
expj.KP0010010.KP0010010form1.IN_PLN_STR_DATE.executeOnLoad = function () {
  $('#expj-KP0010010-KP0010010form1-IN_PLN_STR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0010010', 'KP0010010form1', 'IN_PLN_STR_DATE', this);
  });
  expj.KP0010010.KP0010010form1.IN_PLN_STR_DATE.executePScriptOnLoad();
};

expj.KP0010010.KP0010010form1.IN_PLN_STR_DATE.executePScriptOnLoad = function () {
  console.log('execute KP0010010form1/IN_PLN_STR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KP0010010-KP0010010form1-IN_PLN_STR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KP0010010-KP0010010form1-IN_PLN_STR_DATE" name="IN_PLN_STR_DATE" class="KP0010010-focus-move  required-value expj-KP0010010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKP0010010Struct.getIN_PLN_STR_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KP0010010-KP0010010form1-CalendarIN_PLN_STR_DATE">
expj.KP0010010.KP0010010form1.CalendarIN_PLN_STR_DATE = {};
// script1="onClick;0;CALENDAR;_KP0010010form1/IN_PLN_STR_DATE"
expj.KP0010010.KP0010010form1.CalendarIN_PLN_STR_DATE.onClick0 = function () {
  console.log('CalendarIN_PLN_STR_DATE script1');
expj.common.pscript.executeCalendar('KP0010010','KP0010010form1','_KP0010010form1/IN_PLN_STR_DATE');
};
expj.KP0010010.KP0010010form1.CalendarIN_PLN_STR_DATE.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0010010.KP0010010form1.CalendarIN_PLN_STR_DATE['onClick' + i])) {
        expj.KP0010010.KP0010010form1.CalendarIN_PLN_STR_DATE['onClick' + i]();
      }
    }
  }
};
expj.KP0010010.KP0010010form1.CalendarIN_PLN_STR_DATE.executeAllOnDecision = function () {
};
expj.KP0010010.KP0010010form1.CalendarIN_PLN_STR_DATE.executeOnLoad = function () {
  $('#expj-KP0010010-KP0010010form1-CalendarIN_PLN_STR_DATE').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0010010', 'KP0010010form1', 'CalendarIN_PLN_STR_DATE', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KP0010010','KP0010010form1','_KP0010010form1/IN_PLN_STR_DATE');
  expj.KP0010010.KP0010010form1.CalendarIN_PLN_STR_DATE.executePScriptOnLoad();
};

expj.KP0010010.KP0010010form1.CalendarIN_PLN_STR_DATE.executePScriptOnLoad = function () {
  console.log('execute KP0010010form1/CalendarIN_PLN_STR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KP0010010-KP0010010form1-CalendarIN_PLN_STR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KP0010010-KP0010010form1-CalendarIN_PLN_STR_DATE" class="KP0010010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KP0010010-KP0010010form1-IN_PLN_END_DATE">
expj.KP0010010.KP0010010form1.IN_PLN_END_DATE = {};
expj.KP0010010.KP0010010form1.IN_PLN_END_DATE.executeAllOnDecision = function () {
  console.log('execute KP0010010form1/IN_PLN_END_DATE.onDecision');
  expj.KP0010010.KP0010010form1.executeAllOnDecision();
  expj.KP0010010.executeAllOnDecision();
};
expj.KP0010010.KP0010010form1.IN_PLN_END_DATE.executeOnLoad = function () {
  $('#expj-KP0010010-KP0010010form1-IN_PLN_END_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0010010', 'KP0010010form1', 'IN_PLN_END_DATE', this);
  });
  expj.KP0010010.KP0010010form1.IN_PLN_END_DATE.executePScriptOnLoad();
};

expj.KP0010010.KP0010010form1.IN_PLN_END_DATE.executePScriptOnLoad = function () {
  console.log('execute KP0010010form1/IN_PLN_END_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KP0010010-KP0010010form1-IN_PLN_END_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KP0010010-KP0010010form1-IN_PLN_END_DATE" name="IN_PLN_END_DATE" class="KP0010010-focus-move  required-value expj-KP0010010-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKP0010010Struct.getIN_PLN_END_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KP0010010-KP0010010form1-CalendarIN_PLN_END_DATE">
expj.KP0010010.KP0010010form1.CalendarIN_PLN_END_DATE = {};
// script1="onClick;0;CALENDAR;_KP0010010form1/IN_PLN_END_DATE"
expj.KP0010010.KP0010010form1.CalendarIN_PLN_END_DATE.onClick0 = function () {
  console.log('CalendarIN_PLN_END_DATE script1');
expj.common.pscript.executeCalendar('KP0010010','KP0010010form1','_KP0010010form1/IN_PLN_END_DATE');
};
expj.KP0010010.KP0010010form1.CalendarIN_PLN_END_DATE.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0010010.KP0010010form1.CalendarIN_PLN_END_DATE['onClick' + i])) {
        expj.KP0010010.KP0010010form1.CalendarIN_PLN_END_DATE['onClick' + i]();
      }
    }
  }
};
expj.KP0010010.KP0010010form1.CalendarIN_PLN_END_DATE.executeAllOnDecision = function () {
};
expj.KP0010010.KP0010010form1.CalendarIN_PLN_END_DATE.executeOnLoad = function () {
  $('#expj-KP0010010-KP0010010form1-CalendarIN_PLN_END_DATE').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0010010', 'KP0010010form1', 'CalendarIN_PLN_END_DATE', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KP0010010','KP0010010form1','_KP0010010form1/IN_PLN_END_DATE');
  expj.KP0010010.KP0010010form1.CalendarIN_PLN_END_DATE.executePScriptOnLoad();
};

expj.KP0010010.KP0010010form1.CalendarIN_PLN_END_DATE.executePScriptOnLoad = function () {
  console.log('execute KP0010010form1/CalendarIN_PLN_END_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KP0010010-KP0010010form1-CalendarIN_PLN_END_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KP0010010-KP0010010form1-CalendarIN_PLN_END_DATE" class="KP0010010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PLN_QTY",rb)%></span><!-- 計画数 --></div><!--/td-->
<script class="expj-script-KP0010010-KP0010010form1-IN_PLN_QTY">
expj.KP0010010.KP0010010form1.IN_PLN_QTY = {};
expj.KP0010010.KP0010010form1.IN_PLN_QTY.executeAllOnDecision = function () {
  console.log('execute KP0010010form1/IN_PLN_QTY.onDecision');
  expj.KP0010010.KP0010010form1.executeAllOnDecision();
  expj.KP0010010.executeAllOnDecision();
};
expj.KP0010010.KP0010010form1.IN_PLN_QTY.executeOnLoad = function () {
  $('#expj-KP0010010-KP0010010form1-IN_PLN_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0010010', 'KP0010010form1', 'IN_PLN_QTY', this);
  });
  expj.KP0010010.KP0010010form1.IN_PLN_QTY.executePScriptOnLoad();
};

expj.KP0010010.KP0010010form1.IN_PLN_QTY.executePScriptOnLoad = function () {
  console.log('execute KP0010010form1/IN_PLN_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KP0010010-KP0010010form1-IN_PLN_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KP0010010-KP0010010form1-IN_PLN_QTY" name="IN_PLN_QTY" class="KP0010010-focus-move  required-value expj-KP0010010-required-A" style="width:100%;text-align: right;" data-kind="OBT_NUMBER_Z;14.0;CEIL;4" value="<%= TypeConverter.sanitizer(aKP0010010Struct.getIN_PLN_QTY()) %>" maxlength="19" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-KP0010010-KP0010010button1">
expj.KP0010010.KP0010010button1 = {};
expj.KP0010010.KP0010010button1.executeAllOnDecision = function () {
  console.log('execute KP0010010button1.onDecision');
};
expj.KP0010010.KP0010010button1.executeOnLoad = function () {
  expj.KP0010010.KP0010010button1.executePScriptOnLoad();
};

expj.KP0010010.KP0010010button1.executePScriptOnLoad = function () {
  console.log('execute KP0010010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KP0010010-KP0010010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KP0010010-KP0010010button1-Addition">
expj.KP0010010.KP0010010button1.Addition = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KP0010010view1/*,_KP0010010form1/*@KP0010010Servlet"
expj.KP0010010.KP0010010button1.Addition.onClick0 = function () {
  console.log('Addition script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KP0010010', 'KP0010010button1', '_KP0010010view1/*,_KP0010010form1/*', 'KP0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KP0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KP0010010', response);
expj.common.updateBusinessScreenTab('KP0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KP0010010.KP0010010button1.Addition.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0010010.KP0010010button1.Addition['onClick' + i])) {
        expj.KP0010010.KP0010010button1.Addition['onClick' + i]();
      }
    }
  }
};
expj.KP0010010.KP0010010button1.Addition.executeAllOnDecision = function () {
};
expj.KP0010010.KP0010010button1.Addition.executeOnLoad = function () {
  $('#expj-KP0010010-KP0010010button1-Addition').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0010010', 'KP0010010button1', 'Addition', this, 'Button');
    }
  });
  expj.KP0010010.KP0010010button1.Addition.executePScriptOnLoad();
};

expj.KP0010010.KP0010010button1.Addition.executePScriptOnLoad = function () {
  console.log('execute KP0010010button1/Addition.onLoad');
  var targetComponent = document.getElementById('expj-KP0010010-KP0010010button1-Addition');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KP0010010-KP0010010button1-Addition" name="Addition" class="KP0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnAddition",rb)%></button><!-- 追加ボタン --></div><!--/td-->
<script class="expj-script-KP0010010-KP0010010button1-Modify">
expj.KP0010010.KP0010010button1.Modify = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KP0010010view1/*,_KP0010010form1/*@KP0010010Servlet"
expj.KP0010010.KP0010010button1.Modify.onClick0 = function () {
  console.log('Modify script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KP0010010', 'KP0010010button1', '_KP0010010view1/*,_KP0010010form1/*', 'KP0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KP0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KP0010010', response);
expj.common.updateBusinessScreenTab('KP0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KP0010010.KP0010010button1.Modify.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0010010.KP0010010button1.Modify['onClick' + i])) {
        expj.KP0010010.KP0010010button1.Modify['onClick' + i]();
      }
    }
  }
};
expj.KP0010010.KP0010010button1.Modify.executeAllOnDecision = function () {
};
expj.KP0010010.KP0010010button1.Modify.executeOnLoad = function () {
  $('#expj-KP0010010-KP0010010button1-Modify').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0010010', 'KP0010010button1', 'Modify', this, 'Button');
    }
  });
  expj.KP0010010.KP0010010button1.Modify.executePScriptOnLoad();
};

expj.KP0010010.KP0010010button1.Modify.executePScriptOnLoad = function () {
  console.log('execute KP0010010button1/Modify.onLoad');
  var targetComponent = document.getElementById('expj-KP0010010-KP0010010button1-Modify');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KP0010010-KP0010010button1-Modify" name="Modify" class="KP0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnModify",rb)%></button><!-- 修正ボタン --></div><!--/td-->
<script class="expj-script-KP0010010-KP0010010button1-Eliminate">
expj.KP0010010.KP0010010button1.Eliminate = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KP0010010view1/*,_KP0010010form1/*@KP0010010Servlet"
expj.KP0010010.KP0010010button1.Eliminate.onClick0 = function () {
  console.log('Eliminate script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KP0010010', 'KP0010010button1', '_KP0010010view1/*,_KP0010010form1/*', 'KP0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KP0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KP0010010', response);
expj.common.updateBusinessScreenTab('KP0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KP0010010.KP0010010button1.Eliminate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0010010.KP0010010button1.Eliminate['onClick' + i])) {
        expj.KP0010010.KP0010010button1.Eliminate['onClick' + i]();
      }
    }
  }
};
expj.KP0010010.KP0010010button1.Eliminate.executeAllOnDecision = function () {
};
expj.KP0010010.KP0010010button1.Eliminate.executeOnLoad = function () {
  $('#expj-KP0010010-KP0010010button1-Eliminate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0010010', 'KP0010010button1', 'Eliminate', this, 'Button');
    }
  });
  expj.KP0010010.KP0010010button1.Eliminate.executePScriptOnLoad();
};

expj.KP0010010.KP0010010button1.Eliminate.executePScriptOnLoad = function () {
  console.log('execute KP0010010button1/Eliminate.onLoad');
  var targetComponent = document.getElementById('expj-KP0010010-KP0010010button1-Eliminate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KP0010010-KP0010010button1-Eliminate" name="Eliminate" class="KP0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnEliminate",rb)%></button><!-- 消去ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">KP0010010 Revision: 1.11  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KP0010010-KP0010010button0">
expj.KP0010010.KP0010010button0 = {};
expj.KP0010010.KP0010010button0.executeAllOnDecision = function () {
  console.log('execute KP0010010button0.onDecision');
};
expj.KP0010010.KP0010010button0.executeOnLoad = function () {
  expj.KP0010010.KP0010010button0.executePScriptOnLoad();
};

expj.KP0010010.KP0010010button0.executePScriptOnLoad = function () {
  console.log('execute KP0010010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KP0010010-KP0010010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KP0010010-KP0010010button0-Insert">
expj.KP0010010.KP0010010button0.Insert = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KP0010010view1/*,_KP0010010form1/*@KP0010010Servlet,,$ZZ07001"
expj.KP0010010.KP0010010button0.Insert.onClick0 = function () {
  console.log('Insert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KP0010010', 'KP0010010button0', '_KP0010010view1/*,_KP0010010form1/*', 'KP0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KP0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KP0010010', response);
expj.common.updateBusinessScreenTab('KP0010010', contents);
};
expj.common.pscript.callConfirm('KP0010010', 'KP0010010button0', 'ZZ07001', okEvent);
};
expj.KP0010010.KP0010010button0.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0010010.KP0010010button0.Insert['onClick' + i])) {
        expj.KP0010010.KP0010010button0.Insert['onClick' + i]();
      }
    }
  }
};
expj.KP0010010.KP0010010button0.Insert.executeAllOnDecision = function () {
};
expj.KP0010010.KP0010010button0.Insert.executeOnLoad = function () {
  $('#expj-KP0010010-KP0010010button0-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0010010', 'KP0010010button0', 'Insert', this, 'Button');
    }
  });
  expj.KP0010010.KP0010010button0.Insert.executePScriptOnLoad();
};

expj.KP0010010.KP0010010button0.Insert.executePScriptOnLoad = function () {
  console.log('execute KP0010010button0/Insert.onLoad');
  var targetComponent = document.getElementById('expj-KP0010010-KP0010010button0-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KP0010010-KP0010010button0-Insert" name="Insert" class="KP0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-KP0010010-KP0010010button0-Clear">
expj.KP0010010.KP0010010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KP0010010Servlet,,$ZZ07008"
expj.KP0010010.KP0010010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KP0010010', 'KP0010010button0', '', 'KP0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KP0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KP0010010', response);
expj.common.updateBusinessScreenTab('KP0010010', contents);
};
expj.common.pscript.callConfirm('KP0010010', 'KP0010010button0', 'ZZ07008', okEvent);
};
expj.KP0010010.KP0010010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0010010.KP0010010button0.Clear['onClick' + i])) {
        expj.KP0010010.KP0010010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KP0010010.KP0010010button0.Clear.executeAllOnDecision = function () {
};
expj.KP0010010.KP0010010button0.Clear.executeOnLoad = function () {
  $('#expj-KP0010010-KP0010010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0010010', 'KP0010010button0', 'Clear', this, 'Button');
    }
  });
  expj.KP0010010.KP0010010button0.Clear.executePScriptOnLoad();
};

expj.KP0010010.KP0010010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KP0010010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KP0010010-KP0010010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KP0010010-KP0010010button0-Clear" name="Clear" class="KP0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KP0010010-KP0010010button0-Close">
expj.KP0010010.KP0010010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KP0010010.KP0010010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KP0010010');
};
expj.KP0010010.KP0010010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0010010.KP0010010button0.Close['onClick' + i])) {
        expj.KP0010010.KP0010010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KP0010010.KP0010010button0.Close.executeAllOnDecision = function () {
};
expj.KP0010010.KP0010010button0.Close.executeOnLoad = function () {
  $('#expj-KP0010010-KP0010010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0010010', 'KP0010010button0', 'Close', this, 'Button');
    }
  });
  expj.KP0010010.KP0010010button0.Close.executePScriptOnLoad();
};

expj.KP0010010.KP0010010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KP0010010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KP0010010-KP0010010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KP0010010-KP0010010button0-Close" name="Close" class="KP0010010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KP0010010 (END)-->
<%
MessageStruct msgStruct = aKP0010010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KP0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KP0010010)) {
  expj.common.treeInstanceMap.KP0010010 = {};
}
expj.common.treeInstanceMap.KP0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KP0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KP0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KP0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KP0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KP0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KP0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KP0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KP0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KP0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KP0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KP0010010)) {
  expj.common.detailDialogMap.KP0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KP0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KP0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KP0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.KP0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KP0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KP0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KP0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KP0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KP0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KP0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KP0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KP0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KP0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KP0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KP0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KP0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KP0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KP0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KP0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KP0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KP0010010)) {
  expj.common.viewInstanceMap.KP0010010 = {};
}
expj.common.viewInstanceMap.KP0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.KP0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KP0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KP0010010.<%=viewId %>.init = function () {
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
    expj.KP0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KP0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KP0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KP0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KP0010010_init">
/**
 * KP0010010用のロード完了時初期化関数
 */
expj.KP0010010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KP0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KP0010010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KP0010010');
  expj.common.calendarInstanceMap.KP0010010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KP0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KP0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.KP0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KP0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KP0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KP0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KP0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KP0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KP0010010-<%=detailId %>');
<%
 }
%>
  try{expj.KP0010010.KP0010010form1.chkADD_TO_OD.executeOnLoad();}catch(e){};
  try{expj.KP0010010.KP0010010form1.IN_CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KP0010010.KP0010010form1.PeekerCustCd.executeOnLoad();}catch(e){};
  try{expj.KP0010010.KP0010010form1.h_NO.executeOnLoad();}catch(e){};
  try{expj.KP0010010.KP0010010form1.IN_CUST_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KP0010010.KP0010010form1.PeekerCustItemCd.executeOnLoad();}catch(e){};
  try{expj.KP0010010.KP0010010form1.IN_DLV_LOC_CD.executeOnLoad();}catch(e){};
  try{expj.KP0010010.KP0010010form1.PeekerDlvLocCd.executeOnLoad();}catch(e){};
  try{expj.KP0010010.KP0010010form1.IN_PLN_TERM_TYP.executeOnLoad();}catch(e){};
  try{expj.KP0010010.KP0010010form1.IN_PLN_STR_DATE.executeOnLoad();}catch(e){};
  try{expj.KP0010010.KP0010010form1.CalendarIN_PLN_STR_DATE.executeOnLoad();}catch(e){};
  try{expj.KP0010010.KP0010010form1.IN_PLN_END_DATE.executeOnLoad();}catch(e){};
  try{expj.KP0010010.KP0010010form1.CalendarIN_PLN_END_DATE.executeOnLoad();}catch(e){};
  try{expj.KP0010010.KP0010010form1.IN_PLN_QTY.executeOnLoad();}catch(e){};
  try{expj.KP0010010.KP0010010button1.Addition.executeOnLoad();}catch(e){};
  try{expj.KP0010010.KP0010010button1.Modify.executeOnLoad();}catch(e){};
  try{expj.KP0010010.KP0010010button1.Eliminate.executeOnLoad();}catch(e){};
  try{expj.KP0010010.KP0010010button0.Insert.executeOnLoad();}catch(e){};
  try{expj.KP0010010.KP0010010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KP0010010.KP0010010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KP0010010.KP0010010view1.executeOnLoad();}catch(e){};
  try{expj.KP0010010.KP0010010form1.executeOnLoad();}catch(e){};
  try{expj.KP0010010.KP0010010button1.executeOnLoad();}catch(e){};
  try{expj.KP0010010.KP0010010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KP0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KP0010010', 'KP0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KP0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KP0010010-focus-move');
  // 初期フォーカス当てる処理
  $('.KP0010010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KP0010010', '<%=request.getContextPath() %>');
};

/**
 * KP0010010の全体onDecision処理
 */
expj.KP0010010.executeAllOnDecision = function () {
  expj.KP0010010.KP0010010view1.executeAllOnDecision();
};
</script>
<script class="expj-script-KP0010010_console">
expj.KP0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>