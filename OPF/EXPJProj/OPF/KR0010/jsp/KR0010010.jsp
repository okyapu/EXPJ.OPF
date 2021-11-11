<%-- ***
This file is generated
 GeneratedDate  : Thu Feb 16 21:12:24 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KR0010\KR0010010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KR0010.*" %>
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
<jsp:useBean id="aKR0010010Control" class="com.nec.jp.orteus.metamorBase.KR0010.KR0010010Control" scope="request"/>
<jsp:useBean id="aKR0010010Struct" class="com.nec.jp.orteus.metamorBase.KR0010.KR0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

受領・売上登録
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0010/jsp/KR0010010.jsp,v $
$Author: geng-jia $ 
$Revision: 1.13 $ $Date: 2017/02/22 02:07:18 $
********************************************************* --%>
<html>
<head>
<title>受領・売上登録</title>
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
<script class="expj-script-KR0010010_init">
  // KR0010010名前空間
  expj.KR0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<%
String roundTyp = Kind.FLOOR;
String decimalFig = "4";
if (aKR0010010Struct.getROUND_TYP() != null) {
    roundTyp = aKR0010010Struct.getROUND_TYP();
}
if (aKR0010010Struct.getDECIMAL_FIG() != null) {
    decimalFig = aKR0010010Struct.getDECIMAL_FIG();
}
%>
<body>

  <div id="expj-business-screen-KR0010010" data-screen="KR0010010" data-newdata="<%=aKR0010010Control.isNewData() %>">
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
              <script class="expj-script-KR0010010-KR0010010form1">
expj.KR0010010.KR0010010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5"
expj.KR0010010.KR0010010form1.onLoad0 = function () {
  console.log('KR0010010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.KR0010010.KR0010010form1.onDecision0 = function () {
  console.log('KR0010010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('KR0010010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_KR0010010button1/Select"
expj.KR0010010.KR0010010form1.child0 = function () {
  console.log('KR0010010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010button1/Select');
};
// script4="child;1;MASK;_KR0010010button1/Select"
expj.KR0010010.KR0010010form1.child1 = function () {
  console.log('KR0010010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010button1/Select');
};
// script5="onDecision;1;CHK;?KR0010010form1/*[eq]NORMAL@*2,*5"
expj.KR0010010.KR0010010form1.onDecision1 = function () {
  console.log('KR0010010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form1', '?KR0010010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;2;CHKRQ;A,B@*3,*5"
expj.KR0010010.KR0010010form1.child2 = function () {
  console.log('KR0010010form1 script6');
if (expj.common.pscript.satisfiedRequiredComponent('KR0010010', 'A') && expj.common.pscript.satisfiedRequiredComponent('KR0010010', 'B')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="child;3;CHK;_SLIP_CD[eq]_h_SLIP_CD[and]_KR0010010form2/STATUS[eq]10@*4,*5"
expj.KR0010010.KR0010010form1.child3 = function () {
  console.log('KR0010010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form1', '_SLIP_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form1', '_h_SLIP_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form1', '_KR0010010form2/STATUS'), '[eq]', '10')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="child;4;UNMASK;_KR0010010button2/Insert"
expj.KR0010010.KR0010010form1.child4 = function () {
  console.log('KR0010010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010button2/Insert');
};
// script9="child;5;MASK;_KR0010010button2/Insert"
expj.KR0010010.KR0010010form1.child5 = function () {
  console.log('KR0010010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010button2/Insert');
};
// script10="onDecision;2;CHK;?KR0010010form1/*[eq]NORMAL@*6,*8"
expj.KR0010010.KR0010010form1.onDecision2 = function () {
  console.log('KR0010010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form1', '?KR0010010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script11="child;6;CHK;_SLIP_CD[eq]_h_SLIP_CD[and]_KR0010010form2/STATUS[eq]20@*7,*8"
expj.KR0010010.KR0010010form1.child6 = function () {
  console.log('KR0010010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form1', '_SLIP_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form1', '_h_SLIP_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form1', '_KR0010010form2/STATUS'), '[eq]', '20')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script12="child;7;UNMASK;_KR0010010button2/Delete"
expj.KR0010010.KR0010010form1.child7 = function () {
  console.log('KR0010010form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010button2/Delete');
};
// script13="child;8;MASK;_KR0010010button2/Delete"
expj.KR0010010.KR0010010form1.child8 = function () {
  console.log('KR0010010form1 script13');
expj.common.pscript.setMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010button2/Delete');
};
// script14="onDecision;3;CHK;_KR0010010form2/STATUS[eq]20[or]_KR0010010form2/INSPC_ACPT_TYP[eq]2@*10,*9"
expj.KR0010010.KR0010010form1.onDecision3 = function () {
  console.log('KR0010010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form1', '_KR0010010form2/STATUS'), '[eq]', '20') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form1', '_KR0010010form2/INSPC_ACPT_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script15="child;9;UNMASK;_KR0010010form2/SALES_DEPT_CD,_KR0010010form2/PeekerSalesDeptCd,_KR0010010form2/CUST_CHRG_PSN_CD,_KR0010010form2/PeekerCustChrgPsnCd,_KR0010010form2/ITEM_NAME"
expj.KR0010010.KR0010010form1.child9 = function () {
  console.log('KR0010010form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010form2/SALES_DEPT_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010form2/PeekerSalesDeptCd');
expj.common.pscript.setUnMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010form2/CUST_CHRG_PSN_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010form2/PeekerCustChrgPsnCd');
expj.common.pscript.setUnMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010form2/ITEM_NAME');
};
// script16="child;10;MASK;_KR0010010form2/SALES_DEPT_CD,_KR0010010form2/PeekerSalesDeptCd,_KR0010010form2/CUST_CHRG_PSN_CD,_KR0010010form2/PeekerCustChrgPsnCd,_KR0010010form2/ITEM_NAME"
expj.KR0010010.KR0010010form1.child10 = function () {
  console.log('KR0010010form1 script16');
expj.common.pscript.setMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010form2/SALES_DEPT_CD');
expj.common.pscript.setMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010form2/PeekerSalesDeptCd');
expj.common.pscript.setMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010form2/CUST_CHRG_PSN_CD');
expj.common.pscript.setMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010form2/PeekerCustChrgPsnCd');
expj.common.pscript.setMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010form2/ITEM_NAME');
};
// script17="onDecision;4;CHK;_KR0010010form2/STATUS[eq]20@*12,*11"
expj.KR0010010.KR0010010form1.onDecision4 = function () {
  console.log('KR0010010form1 script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form1', '_KR0010010form2/STATUS'), '[eq]', '20')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script18="child;11;UNMASK;_KR0010010form2/SALES_DATE,_KR0010010form2/CalendarSalesDate,_KR0010010form2/SALES_QTY,_KR0010010form2/SALES_UNIT_PRICE,_KR0010010form2/REMARKS"
expj.KR0010010.KR0010010form1.child11 = function () {
  console.log('KR0010010form1 script18');
expj.common.pscript.setUnMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010form2/SALES_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010form2/CalendarSalesDate');
expj.common.pscript.setUnMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010form2/SALES_QTY');
expj.common.pscript.setUnMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010form2/SALES_UNIT_PRICE');
expj.common.pscript.setUnMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010form2/REMARKS');
};
// script19="child;12;MASK;_KR0010010form2/SALES_DATE,_KR0010010form2/CalendarSalesDate,_KR0010010form2/SALES_QTY,_KR0010010form2/SALES_UNIT_PRICE,_KR0010010form2/REMARKS"
expj.KR0010010.KR0010010form1.child12 = function () {
  console.log('KR0010010form1 script19');
expj.common.pscript.setMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010form2/SALES_DATE');
expj.common.pscript.setMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010form2/CalendarSalesDate');
expj.common.pscript.setMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010form2/SALES_QTY');
expj.common.pscript.setMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010form2/SALES_UNIT_PRICE');
expj.common.pscript.setMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010form2/REMARKS');
};
// script20="onDecision;5;CHK;?KR0010010form1/*[eq]NORMAL@*13,*18"
expj.KR0010010.KR0010010form1.onDecision5 = function () {
  console.log('KR0010010form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form1', '?KR0010010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script21="child;13;CHK;_SLIP_CD[eq]_h_SLIP_CD[and]_KR0010010form2/STATUS[eq]20@*18,*14"
expj.KR0010010.KR0010010form1.child13 = function () {
  console.log('KR0010010form1 script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form1', '_SLIP_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form1', '_h_SLIP_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form1', '_KR0010010form2/STATUS'), '[eq]', '20')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script22="child;14;CHK;_KR0010010form2/CUST_CD[eq]@*18,*15"
expj.KR0010010.KR0010010form1.child14 = function () {
  console.log('KR0010010form1 script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form1', '_KR0010010form2/CUST_CD'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
} else {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script23="child;15;CHK;_KR0010010form2/ITEM_CD[eq]@*18,*16"
expj.KR0010010.KR0010010form1.child15 = function () {
  console.log('KR0010010form1 script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form1', '_KR0010010form2/ITEM_CD'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script24="child;16;CHK;_KR0010010form2/SALES_DATE[eq]@*18,*17"
expj.KR0010010.KR0010010form1.child16 = function () {
  console.log('KR0010010form1 script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form1', '_KR0010010form2/SALES_DATE'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
} else {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script25="child;17;UNMASK;_KR0010010form2/SelectUnitCost"
expj.KR0010010.KR0010010form1.child17 = function () {
  console.log('KR0010010form1 script25');
expj.common.pscript.setUnMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010form2/SelectUnitCost');
};
// script26="child;18;MASK;_KR0010010form2/SelectUnitCost"
expj.KR0010010.KR0010010form1.child18 = function () {
  console.log('KR0010010form1 script26');
expj.common.pscript.setMaskToReferenceComponent('KR0010010', 'KR0010010form1', '_KR0010010form2/SelectUnitCost');
};
expj.KR0010010.KR0010010form1.executeAllOnDecision = function () {
  console.log('execute KR0010010form1.onDecision');
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0010010.KR0010010form1['onDecision' + i])) {
        expj.KR0010010.KR0010010form1['onDecision' + i]();
      }
    }
  }
};
expj.KR0010010.KR0010010form1.executeOnLoad = function () {
  expj.KR0010010.KR0010010form1.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form1.executePScriptOnLoad = function () {
  console.log('execute KR0010010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KR0010010.KR0010010form1['onLoad' + i])) {
      expj.KR0010010.KR0010010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KR0010010-KR0010010form1" action="KR0010010Servlet" name="KR0010010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKR0010010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:left"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.SLIP_CD",rb)%></span><!-- 伝票番号 --></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form1-SLIP_CD">
expj.KR0010010.KR0010010form1.SLIP_CD = {};
expj.KR0010010.KR0010010form1.SLIP_CD.executeAllOnDecision = function () {
  console.log('execute KR0010010form1/SLIP_CD.onDecision');
  expj.KR0010010.KR0010010form1.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form1.SLIP_CD.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form1-SLIP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form1', 'SLIP_CD', this);
  });
  expj.KR0010010.KR0010010form1.SLIP_CD.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form1.SLIP_CD.executePScriptOnLoad = function () {
  console.log('execute KR0010010form1/SLIP_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form1-SLIP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form1-SLIP_CD" name="SLIP_CD" class="KR0010010-focus-move  required-value expj-KR0010010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getSLIP_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-KR0010010-KR0010010form1-h_SLIP_CD" name="h_SLIP_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0010010Struct.geth_SLIP_CD()) %>">
<script class="expj-script-KR0010010-KR0010010form1-h_SLIP_CD">
expj.KR0010010.KR0010010form1.h_SLIP_CD = {};
expj.KR0010010.KR0010010form1.h_SLIP_CD.executeAllOnDecision = function () {
  console.log('execute KR0010010form1/h_SLIP_CD.onDecision');
  expj.KR0010010.KR0010010form1.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form1.h_SLIP_CD.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form1-h_SLIP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form1', 'h_SLIP_CD', this);
  });
  expj.KR0010010.KR0010010form1.h_SLIP_CD.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form1.h_SLIP_CD.executePScriptOnLoad = function () {
  console.log('execute KR0010010form1/h_SLIP_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form1-h_SLIP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-KR0010010-KR0010010form1-PeekerSlipCd">
expj.KR0010010.KR0010010form1.PeekerSlipCd = {};
// script1="onClick;0;PEEKER;_KR0010010form1/SLIP_CD@<%=contextNo%>"
expj.KR0010010.KR0010010form1.PeekerSlipCd.onClick0 = function () {
  console.log('PeekerSlipCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KR0010010';
var parameterValues = 'PeekerSlipCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form1', '_SLIP_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%SLIP_CD_03%&%';
parameterValues += 'TARGET_FIELD%=%_KR0010010form1/SLIP_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KR0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KR0010010.KR0010010form1.PeekerSlipCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0010010.KR0010010form1.PeekerSlipCd['onClick' + i])) {
        expj.KR0010010.KR0010010form1.PeekerSlipCd['onClick' + i]();
      }
    }
  }
};
expj.KR0010010.KR0010010form1.PeekerSlipCd.executeAllOnDecision = function () {
};
expj.KR0010010.KR0010010form1.PeekerSlipCd.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form1-PeekerSlipCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0010010', 'KR0010010form1', 'PeekerSlipCd', this, 'Button');
    }
  });
  expj.KR0010010.KR0010010form1.PeekerSlipCd.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form1.PeekerSlipCd.executePScriptOnLoad = function () {
  console.log('execute KR0010010form1/PeekerSlipCd.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form1-PeekerSlipCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KR0010010-KR0010010form1-PeekerSlipCd" class="KR0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<input type="hidden" id="expj-KR0010010-KR0010010form1-AI_AR_IF_FLG" name="AI_AR_IF_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getAI_AR_IF_FLG()) %>">
<script class="expj-script-KR0010010-KR0010010form1-AI_AR_IF_FLG">
expj.KR0010010.KR0010010form1.AI_AR_IF_FLG = {};
expj.KR0010010.KR0010010form1.AI_AR_IF_FLG.executeAllOnDecision = function () {
  console.log('execute KR0010010form1/AI_AR_IF_FLG.onDecision');
  expj.KR0010010.KR0010010form1.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form1.AI_AR_IF_FLG.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form1-AI_AR_IF_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form1', 'AI_AR_IF_FLG', this);
  });
  expj.KR0010010.KR0010010form1.AI_AR_IF_FLG.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form1.AI_AR_IF_FLG.executePScriptOnLoad = function () {
  console.log('execute KR0010010form1/AI_AR_IF_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form1-AI_AR_IF_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KR0010010-KR0010010form1-h_INSTALL_FLG" name="h_INSTALL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0010010Struct.geth_INSTALL_FLG()) %>">
<script class="expj-script-KR0010010-KR0010010form1-h_INSTALL_FLG">
expj.KR0010010.KR0010010form1.h_INSTALL_FLG = {};
expj.KR0010010.KR0010010form1.h_INSTALL_FLG.executeAllOnDecision = function () {
  console.log('execute KR0010010form1/h_INSTALL_FLG.onDecision');
  expj.KR0010010.KR0010010form1.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form1.h_INSTALL_FLG.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form1-h_INSTALL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form1', 'h_INSTALL_FLG', this);
  });
  expj.KR0010010.KR0010010form1.h_INSTALL_FLG.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form1.h_INSTALL_FLG.executePScriptOnLoad = function () {
  console.log('execute KR0010010form1/h_INSTALL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form1-h_INSTALL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KR0010010-KR0010010form1-MODIFY_COUNT" name="MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getMODIFY_COUNT()) %>">
<script class="expj-script-KR0010010-KR0010010form1-MODIFY_COUNT">
expj.KR0010010.KR0010010form1.MODIFY_COUNT = {};
expj.KR0010010.KR0010010form1.MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute KR0010010form1/MODIFY_COUNT.onDecision');
  expj.KR0010010.KR0010010form1.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form1.MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form1-MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form1', 'MODIFY_COUNT', this);
  });
  expj.KR0010010.KR0010010form1.MODIFY_COUNT.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form1.MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute KR0010010form1/MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form1-MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KR0010010-KR0010010button1">
expj.KR0010010.KR0010010button1 = {};
expj.KR0010010.KR0010010button1.executeAllOnDecision = function () {
  console.log('execute KR0010010button1.onDecision');
};
expj.KR0010010.KR0010010button1.executeOnLoad = function () {
  expj.KR0010010.KR0010010button1.executePScriptOnLoad();
};

expj.KR0010010.KR0010010button1.executePScriptOnLoad = function () {
  console.log('execute KR0010010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KR0010010-KR0010010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KR0010010-KR0010010button1-Select">
expj.KR0010010.KR0010010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KR0010010form1/*@KR0010010Servlet"
expj.KR0010010.KR0010010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KR0010010', 'KR0010010button1', '_KR0010010form1/*', 'KR0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KR0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KR0010010', response);
expj.common.updateBusinessScreenTab('KR0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KR0010010.KR0010010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0010010.KR0010010button1.Select['onClick' + i])) {
        expj.KR0010010.KR0010010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.KR0010010.KR0010010button1.Select.executeAllOnDecision = function () {
};
expj.KR0010010.KR0010010button1.Select.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0010010', 'KR0010010button1', 'Select', this, 'Button');
    }
  });
  expj.KR0010010.KR0010010button1.Select.executePScriptOnLoad();
};

expj.KR0010010.KR0010010button1.Select.executePScriptOnLoad = function () {
  console.log('execute KR0010010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0010010-KR0010010button1-Select" name="Select" class="KR0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-KR0010010-KR0010010form2">
expj.KR0010010.KR0010010form2 = {};
expj.KR0010010.KR0010010form2.executeAllOnDecision = function () {
  console.log('execute KR0010010form2.onDecision');
};
expj.KR0010010.KR0010010form2.executeOnLoad = function () {
  expj.KR0010010.KR0010010form2.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KR0010010-KR0010010form2" action="KR0010010Servlet" name="KR0010010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-CUST_CD">
expj.KR0010010.KR0010010form2.CUST_CD = {};
expj.KR0010010.KR0010010form2.CUST_CD.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/CUST_CD.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.CUST_CD.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'CUST_CD', this);
  });
  expj.KR0010010.KR0010010form2.CUST_CD.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-CUST_CD" name="CUST_CD" class="KR0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getCUST_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-CUST_ANAME">
expj.KR0010010.KR0010010form2.CUST_ANAME = {};
expj.KR0010010.KR0010010form2.CUST_ANAME.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/CUST_ANAME.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.CUST_ANAME.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-CUST_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'CUST_ANAME', this);
  });
  expj.KR0010010.KR0010010form2.CUST_ANAME.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.CUST_ANAME.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/CUST_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-CUST_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-CUST_ANAME" name="CUST_ANAME" class="KR0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getCUST_ANAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KR0010010-KR0010010form2-STATUS" name="STATUS" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getSTATUS()) %>">
<script class="expj-script-KR0010010-KR0010010form2-STATUS">
expj.KR0010010.KR0010010form2.STATUS = {};
expj.KR0010010.KR0010010form2.STATUS.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/STATUS.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.STATUS.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-STATUS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'STATUS', this);
  });
  expj.KR0010010.KR0010010form2.STATUS.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.STATUS.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/STATUS.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-STATUS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.INSPC_ACPT_TYP",rb)%></span><!-- 検収区分 --></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-INSPC_ACPT_TYP_DN">
expj.KR0010010.KR0010010form2.INSPC_ACPT_TYP_DN = {};
expj.KR0010010.KR0010010form2.INSPC_ACPT_TYP_DN.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/INSPC_ACPT_TYP_DN.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.INSPC_ACPT_TYP_DN.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-INSPC_ACPT_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'INSPC_ACPT_TYP_DN', this);
  });
  expj.KR0010010.KR0010010form2.INSPC_ACPT_TYP_DN.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.INSPC_ACPT_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/INSPC_ACPT_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-INSPC_ACPT_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-INSPC_ACPT_TYP_DN" name="INSPC_ACPT_TYP_DN" class="KR0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getINSPC_ACPT_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KR0010010-KR0010010form2-INSPC_ACPT_TYP" name="INSPC_ACPT_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getINSPC_ACPT_TYP()) %>">
<script class="expj-script-KR0010010-KR0010010form2-INSPC_ACPT_TYP">
expj.KR0010010.KR0010010form2.INSPC_ACPT_TYP = {};
expj.KR0010010.KR0010010form2.INSPC_ACPT_TYP.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/INSPC_ACPT_TYP.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.INSPC_ACPT_TYP.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-INSPC_ACPT_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'INSPC_ACPT_TYP', this);
  });
  expj.KR0010010.KR0010010form2.INSPC_ACPT_TYP.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.INSPC_ACPT_TYP.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/INSPC_ACPT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-INSPC_ACPT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_ODR_NO",rb)%></span><!-- 得意先注文番号 --></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-CUST_ODR_NO">
expj.KR0010010.KR0010010form2.CUST_ODR_NO = {};
expj.KR0010010.KR0010010form2.CUST_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/CUST_ODR_NO.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.CUST_ODR_NO.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-CUST_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'CUST_ODR_NO', this);
  });
  expj.KR0010010.KR0010010form2.CUST_ODR_NO.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.CUST_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/CUST_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-CUST_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-CUST_ODR_NO" name="CUST_ODR_NO" class="KR0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getCUST_ODR_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.SALES_DATE",rb)%></span><!-- 売上計上日 --></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-SALES_DATE">
expj.KR0010010.KR0010010form2.SALES_DATE = {};
expj.KR0010010.KR0010010form2.SALES_DATE.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/SALES_DATE.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.SALES_DATE.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-SALES_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'SALES_DATE', this);
  });
  expj.KR0010010.KR0010010form2.SALES_DATE.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.SALES_DATE.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/SALES_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-SALES_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-SALES_DATE" name="SALES_DATE" class="KR0010010-focus-move  required-value expj-KR0010010-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getSALES_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-CalendarSalesDate">
expj.KR0010010.KR0010010form2.CalendarSalesDate = {};
// script1="onClick;0;CALENDAR;_KR0010010form2/SALES_DATE"
expj.KR0010010.KR0010010form2.CalendarSalesDate.onClick0 = function () {
  console.log('CalendarSalesDate script1');
expj.common.pscript.executeCalendar('KR0010010','KR0010010form2','_KR0010010form2/SALES_DATE');
};
expj.KR0010010.KR0010010form2.CalendarSalesDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0010010.KR0010010form2.CalendarSalesDate['onClick' + i])) {
        expj.KR0010010.KR0010010form2.CalendarSalesDate['onClick' + i]();
      }
    }
  }
};
expj.KR0010010.KR0010010form2.CalendarSalesDate.executeAllOnDecision = function () {
};
expj.KR0010010.KR0010010form2.CalendarSalesDate.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-CalendarSalesDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0010010', 'KR0010010form2', 'CalendarSalesDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KR0010010','KR0010010form2','_KR0010010form2/SALES_DATE');
  expj.KR0010010.KR0010010form2.CalendarSalesDate.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.CalendarSalesDate.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/CalendarSalesDate.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-CalendarSalesDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KR0010010-KR0010010form2-CalendarSalesDate" class="KR0010010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<input type="hidden" id="expj-KR0010010-KR0010010form2-SALES_DATE2" name="SALES_DATE2" class="" data-kind="OBT_DATE;TYPE_YMD" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getSALES_DATE2()) %>">
<script class="expj-script-KR0010010-KR0010010form2-SALES_DATE2">
expj.KR0010010.KR0010010form2.SALES_DATE2 = {};
expj.KR0010010.KR0010010form2.SALES_DATE2.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/SALES_DATE2.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.SALES_DATE2.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-SALES_DATE2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'SALES_DATE2', this);
  });
  expj.KR0010010.KR0010010form2.SALES_DATE2.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.SALES_DATE2.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/SALES_DATE2.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-SALES_DATE2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KR0010010-KR0010010form2-BUSINESS_OPR_DATE" name="BUSINESS_OPR_DATE" class="" data-kind="OBT_DATE;TYPE_YMD" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getBUSINESS_OPR_DATE()) %>">
<script class="expj-script-KR0010010-KR0010010form2-BUSINESS_OPR_DATE">
expj.KR0010010.KR0010010form2.BUSINESS_OPR_DATE = {};
expj.KR0010010.KR0010010form2.BUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/BUSINESS_OPR_DATE.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.BUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-BUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'BUSINESS_OPR_DATE', this);
  });
  expj.KR0010010.KR0010010form2.BUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.BUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/BUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-BUSINESS_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SHIP_DATE",rb)%></span><!-- 出荷実績日 --></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-SHIP_DATE">
expj.KR0010010.KR0010010form2.SHIP_DATE = {};
expj.KR0010010.KR0010010form2.SHIP_DATE.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/SHIP_DATE.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.SHIP_DATE.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-SHIP_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'SHIP_DATE', this);
  });
  expj.KR0010010.KR0010010form2.SHIP_DATE.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.SHIP_DATE.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/SHIP_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-SHIP_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-SHIP_DATE" name="SHIP_DATE" class="KR0010010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getSHIP_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.SALES_DEPT_CD",rb)%></span><!-- 売上計上部門 --></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-SALES_DEPT_CD">
expj.KR0010010.KR0010010form2.SALES_DEPT_CD = {};
expj.KR0010010.KR0010010form2.SALES_DEPT_CD.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/SALES_DEPT_CD.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.SALES_DEPT_CD.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-SALES_DEPT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'SALES_DEPT_CD', this);
  });
  expj.KR0010010.KR0010010form2.SALES_DEPT_CD.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.SALES_DEPT_CD.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/SALES_DEPT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-SALES_DEPT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-SALES_DEPT_CD" name="SALES_DEPT_CD" class="KR0010010-focus-move  required-value expj-KR0010010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getSALES_DEPT_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-PeekerSalesDeptCd">
expj.KR0010010.KR0010010form2.PeekerSalesDeptCd = {};
// script1="onClick;0;PEEKER;_KR0010010form2/SALES_DEPT_CD@<%=contextNo%>"
expj.KR0010010.KR0010010form2.PeekerSalesDeptCd.onClick0 = function () {
  console.log('PeekerSalesDeptCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KR0010010';
var parameterValues = 'PeekerSalesDeptCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form2', '_SALES_DEPT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ORG_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KR0010010form2/SALES_DEPT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KR0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KR0010010.KR0010010form2.PeekerSalesDeptCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0010010.KR0010010form2.PeekerSalesDeptCd['onClick' + i])) {
        expj.KR0010010.KR0010010form2.PeekerSalesDeptCd['onClick' + i]();
      }
    }
  }
};
expj.KR0010010.KR0010010form2.PeekerSalesDeptCd.executeAllOnDecision = function () {
};
expj.KR0010010.KR0010010form2.PeekerSalesDeptCd.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-PeekerSalesDeptCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0010010', 'KR0010010form2', 'PeekerSalesDeptCd', this, 'Button');
    }
  });
  expj.KR0010010.KR0010010form2.PeekerSalesDeptCd.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.PeekerSalesDeptCd.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/PeekerSalesDeptCd.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-PeekerSalesDeptCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KR0010010-KR0010010form2-PeekerSalesDeptCd" class="KR0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-ORG_NAME">
expj.KR0010010.KR0010010form2.ORG_NAME = {};
expj.KR0010010.KR0010010form2.ORG_NAME.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/ORG_NAME.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.ORG_NAME.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-ORG_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'ORG_NAME', this);
  });
  expj.KR0010010.KR0010010form2.ORG_NAME.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.ORG_NAME.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/ORG_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-ORG_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-ORG_NAME" name="ORG_NAME" class="KR0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getORG_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CHRG_PSN_CD",rb)%></span><!-- 営業担当者コード --></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-CUST_CHRG_PSN_CD">
expj.KR0010010.KR0010010form2.CUST_CHRG_PSN_CD = {};
expj.KR0010010.KR0010010form2.CUST_CHRG_PSN_CD.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/CUST_CHRG_PSN_CD.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.CUST_CHRG_PSN_CD.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-CUST_CHRG_PSN_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'CUST_CHRG_PSN_CD', this);
  });
  expj.KR0010010.KR0010010form2.CUST_CHRG_PSN_CD.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.CUST_CHRG_PSN_CD.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/CUST_CHRG_PSN_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-CUST_CHRG_PSN_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-CUST_CHRG_PSN_CD" name="CUST_CHRG_PSN_CD" class="KR0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getCUST_CHRG_PSN_CD()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-PeekerCustChrgPsnCd">
expj.KR0010010.KR0010010form2.PeekerCustChrgPsnCd = {};
// script1="onClick;0;PEEKER;_KR0010010form2/CUST_CHRG_PSN_CD@<%=contextNo%>"
expj.KR0010010.KR0010010form2.PeekerCustChrgPsnCd.onClick0 = function () {
  console.log('PeekerCustChrgPsnCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KR0010010';
var parameterValues = 'PeekerCustChrgPsnCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form2', '_CUST_CHRG_PSN_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%USER_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KR0010010form2/CUST_CHRG_PSN_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KR0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KR0010010.KR0010010form2.PeekerCustChrgPsnCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0010010.KR0010010form2.PeekerCustChrgPsnCd['onClick' + i])) {
        expj.KR0010010.KR0010010form2.PeekerCustChrgPsnCd['onClick' + i]();
      }
    }
  }
};
expj.KR0010010.KR0010010form2.PeekerCustChrgPsnCd.executeAllOnDecision = function () {
};
expj.KR0010010.KR0010010form2.PeekerCustChrgPsnCd.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-PeekerCustChrgPsnCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0010010', 'KR0010010form2', 'PeekerCustChrgPsnCd', this, 'Button');
    }
  });
  expj.KR0010010.KR0010010form2.PeekerCustChrgPsnCd.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.PeekerCustChrgPsnCd.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/PeekerCustChrgPsnCd.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-PeekerCustChrgPsnCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KR0010010-KR0010010form2-PeekerCustChrgPsnCd" class="KR0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-USER_NAME">
expj.KR0010010.KR0010010form2.USER_NAME = {};
expj.KR0010010.KR0010010form2.USER_NAME.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/USER_NAME.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.USER_NAME.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-USER_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'USER_NAME', this);
  });
  expj.KR0010010.KR0010010form2.USER_NAME.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.USER_NAME.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/USER_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-USER_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-USER_NAME" name="USER_NAME" class="KR0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getUSER_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-ITEM_CD">
expj.KR0010010.KR0010010form2.ITEM_CD = {};
expj.KR0010010.KR0010010form2.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/ITEM_CD.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.ITEM_CD.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'ITEM_CD', this);
  });
  expj.KR0010010.KR0010010form2.ITEM_CD.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-ITEM_CD" name="ITEM_CD" class="KR0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-ITEM_NAME">
expj.KR0010010.KR0010010form2.ITEM_NAME = {};
expj.KR0010010.KR0010010form2.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/ITEM_NAME.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.ITEM_NAME.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'ITEM_NAME', this);
  });
  expj.KR0010010.KR0010010form2.ITEM_NAME.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-ITEM_NAME" name="ITEM_NAME" class="KR0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getITEM_NAME()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_ITEM_CD",rb)%></span><!-- 得意先品目番号 --></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-CUST_ITEM_CD">
expj.KR0010010.KR0010010form2.CUST_ITEM_CD = {};
expj.KR0010010.KR0010010form2.CUST_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/CUST_ITEM_CD.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.CUST_ITEM_CD.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-CUST_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'CUST_ITEM_CD', this);
  });
  expj.KR0010010.KR0010010form2.CUST_ITEM_CD.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.CUST_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/CUST_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-CUST_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-CUST_ITEM_CD" name="CUST_ITEM_CD" class="KR0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getCUST_ITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-CUST_ITEM_NAME">
expj.KR0010010.KR0010010form2.CUST_ITEM_NAME = {};
expj.KR0010010.KR0010010form2.CUST_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/CUST_ITEM_NAME.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.CUST_ITEM_NAME.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-CUST_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'CUST_ITEM_NAME', this);
  });
  expj.KR0010010.KR0010010form2.CUST_ITEM_NAME.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.CUST_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/CUST_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-CUST_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-CUST_ITEM_NAME" name="CUST_ITEM_NAME" class="KR0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getCUST_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SALES_QTY",rb)%></span><!-- 売上実績数量 --></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-SALES_QTY">
expj.KR0010010.KR0010010form2.SALES_QTY = {};
// script1="onDecision;0;SET;_SALES_AMOUNT=[{_SALES_UNIT_PRICE}*{_SALES_QTY}]"
expj.KR0010010.KR0010010form2.SALES_QTY.onDecision0 = function () {
  console.log('SALES_QTY script1');
expj.common.pscript.setReferenceComponentValue('KR0010010', 'KR0010010form2', '_SALES_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form2', '_SALES_UNIT_PRICE') + '*' + expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form2', '_SALES_QTY')));
};
expj.KR0010010.KR0010010form2.SALES_QTY.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/SALES_QTY.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0010010.KR0010010form2.SALES_QTY['onDecision' + i])) {
        expj.KR0010010.KR0010010form2.SALES_QTY['onDecision' + i]();
      }
    }
  }
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.SALES_QTY.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-SALES_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'SALES_QTY', this);
  });
  expj.KR0010010.KR0010010form2.SALES_QTY.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.SALES_QTY.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/SALES_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-SALES_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-SALES_QTY" name="SALES_QTY" class="KR0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getSALES_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-PKG_UNIT">
expj.KR0010010.KR0010010form2.PKG_UNIT = {};
expj.KR0010010.KR0010010form2.PKG_UNIT.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/PKG_UNIT.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.PKG_UNIT.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-PKG_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'PKG_UNIT', this);
  });
  expj.KR0010010.KR0010010form2.PKG_UNIT.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.PKG_UNIT.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/PKG_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-PKG_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-PKG_UNIT" name="PKG_UNIT" class="KR0010010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getPKG_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SHIP_QTY",rb)%></span><!-- 出荷実績数量 --></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-SHIP_QTY">
expj.KR0010010.KR0010010form2.SHIP_QTY = {};
expj.KR0010010.KR0010010form2.SHIP_QTY.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/SHIP_QTY.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.SHIP_QTY.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-SHIP_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'SHIP_QTY', this);
  });
  expj.KR0010010.KR0010010form2.SHIP_QTY.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.SHIP_QTY.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/SHIP_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-SHIP_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-SHIP_QTY" name="SHIP_QTY" class="KR0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getSHIP_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-PKG_UNIT2">
expj.KR0010010.KR0010010form2.PKG_UNIT2 = {};
expj.KR0010010.KR0010010form2.PKG_UNIT2.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/PKG_UNIT2.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.PKG_UNIT2.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-PKG_UNIT2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'PKG_UNIT2', this);
  });
  expj.KR0010010.KR0010010form2.PKG_UNIT2.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.PKG_UNIT2.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/PKG_UNIT2.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-PKG_UNIT2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-PKG_UNIT2" name="PKG_UNIT2" class="KR0010010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getPKG_UNIT2()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SALES_UNIT_PRICE",rb)%></span><!-- 売上単価 --></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-SALES_UNIT_PRICE">
expj.KR0010010.KR0010010form2.SALES_UNIT_PRICE = {};
// script1="onDecision;0;SET;_SALES_AMOUNT=[{_SALES_UNIT_PRICE}*{_SALES_QTY}]"
expj.KR0010010.KR0010010form2.SALES_UNIT_PRICE.onDecision0 = function () {
  console.log('SALES_UNIT_PRICE script1');
expj.common.pscript.setReferenceComponentValue('KR0010010', 'KR0010010form2', '_SALES_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form2', '_SALES_UNIT_PRICE') + '*' + expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010form2', '_SALES_QTY')));
};
expj.KR0010010.KR0010010form2.SALES_UNIT_PRICE.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/SALES_UNIT_PRICE.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0010010.KR0010010form2.SALES_UNIT_PRICE['onDecision' + i])) {
        expj.KR0010010.KR0010010form2.SALES_UNIT_PRICE['onDecision' + i]();
      }
    }
  }
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.SALES_UNIT_PRICE.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-SALES_UNIT_PRICE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'SALES_UNIT_PRICE', this);
  });
  expj.KR0010010.KR0010010form2.SALES_UNIT_PRICE.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.SALES_UNIT_PRICE.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/SALES_UNIT_PRICE.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-SALES_UNIT_PRICE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-SALES_UNIT_PRICE" name="SALES_UNIT_PRICE" class="KR0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getSALES_UNIT_PRICE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-CUR_UNIT">
expj.KR0010010.KR0010010form2.CUR_UNIT = {};
expj.KR0010010.KR0010010form2.CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/CUR_UNIT.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.CUR_UNIT.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'CUR_UNIT', this);
  });
  expj.KR0010010.KR0010010form2.CUR_UNIT.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-CUR_UNIT" name="CUR_UNIT" class="KR0010010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getCUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-SelectUnitCost">
expj.KR0010010.KR0010010form2.SelectUnitCost = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KR0010010form1/*,_KR0010010form2/*@KR0010010Servlet"
expj.KR0010010.KR0010010form2.SelectUnitCost.onClick0 = function () {
  console.log('SelectUnitCost script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KR0010010', 'KR0010010form2', '_KR0010010form1/*,_KR0010010form2/*', 'KR0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KR0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KR0010010', response);
expj.common.updateBusinessScreenTab('KR0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KR0010010.KR0010010form2.SelectUnitCost.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0010010.KR0010010form2.SelectUnitCost['onClick' + i])) {
        expj.KR0010010.KR0010010form2.SelectUnitCost['onClick' + i]();
      }
    }
  }
};
expj.KR0010010.KR0010010form2.SelectUnitCost.executeAllOnDecision = function () {
};
expj.KR0010010.KR0010010form2.SelectUnitCost.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-SelectUnitCost').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0010010', 'KR0010010form2', 'SelectUnitCost', this, 'Button');
    }
  });
  expj.KR0010010.KR0010010form2.SelectUnitCost.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.SelectUnitCost.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/SelectUnitCost.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-SelectUnitCost');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-KR0010010-KR0010010form2-SelectUnitCost" name="SelectUnitCost" class="KR0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelectUnitCost",rb)%></button><!-- 単価読込ボタン --></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SALES_AMOUNT",rb)%></span><!-- 売上金額 --></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-SALES_AMOUNT">
expj.KR0010010.KR0010010form2.SALES_AMOUNT = {};
expj.KR0010010.KR0010010form2.SALES_AMOUNT.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/SALES_AMOUNT.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.SALES_AMOUNT.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-SALES_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'SALES_AMOUNT', this);
  });
  expj.KR0010010.KR0010010form2.SALES_AMOUNT.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.SALES_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/SALES_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-SALES_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-SALES_AMOUNT" name="SALES_AMOUNT" class="KR0010010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, roundTyp, decimalFig)%>" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getSALES_AMOUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-CUR_UNIT2">
expj.KR0010010.KR0010010form2.CUR_UNIT2 = {};
expj.KR0010010.KR0010010form2.CUR_UNIT2.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/CUR_UNIT2.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.CUR_UNIT2.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-CUR_UNIT2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'CUR_UNIT2', this);
  });
  expj.KR0010010.KR0010010form2.CUR_UNIT2.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.CUR_UNIT2.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/CUR_UNIT2.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-CUR_UNIT2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-CUR_UNIT2" name="CUR_UNIT2" class="KR0010010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getCUR_UNIT2()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.REMARKS",rb)%></span><!-- 備考 --></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-REMARKS">
expj.KR0010010.KR0010010form2.REMARKS = {};
expj.KR0010010.KR0010010form2.REMARKS.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/REMARKS.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.REMARKS.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-REMARKS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'REMARKS', this);
  });
  expj.KR0010010.KR0010010form2.REMARKS.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.REMARKS.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/REMARKS.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-REMARKS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-REMARKS" name="REMARKS" class="KR0010010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getREMARKS()) %>" maxlength="100" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SHIP_ORD_CD",rb)%></span><!-- 受注番号 --></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-ODR_NO">
expj.KR0010010.KR0010010form2.ODR_NO = {};
expj.KR0010010.KR0010010form2.ODR_NO.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/ODR_NO.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.ODR_NO.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'ODR_NO', this);
  });
  expj.KR0010010.KR0010010form2.ODR_NO.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-ODR_NO" name="ODR_NO" class="KR0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getODR_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SHIP_PARTIAL_ITEM",rb)%></span><!-- 分納項番 --></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-PART_DLV_SEQ_NO">
expj.KR0010010.KR0010010form2.PART_DLV_SEQ_NO = {};
expj.KR0010010.KR0010010form2.PART_DLV_SEQ_NO.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/PART_DLV_SEQ_NO.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.PART_DLV_SEQ_NO.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-PART_DLV_SEQ_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'PART_DLV_SEQ_NO', this);
  });
  expj.KR0010010.KR0010010form2.PART_DLV_SEQ_NO.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.PART_DLV_SEQ_NO.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/PART_DLV_SEQ_NO.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-PART_DLV_SEQ_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-PART_DLV_SEQ_NO" name="PART_DLV_SEQ_NO" class="KR0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getPART_DLV_SEQ_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb)%></span><!-- 指定納期 --></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-DESINATED_DLV_DATE">
expj.KR0010010.KR0010010form2.DESINATED_DLV_DATE = {};
expj.KR0010010.KR0010010form2.DESINATED_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/DESINATED_DLV_DATE.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.DESINATED_DLV_DATE.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-DESINATED_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'DESINATED_DLV_DATE', this);
  });
  expj.KR0010010.KR0010010form2.DESINATED_DLV_DATE.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.DESINATED_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/DESINATED_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-DESINATED_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-DESINATED_DLV_DATE" name="DESINATED_DLV_DATE" class="KR0010010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getDESINATED_DLV_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_ACPT_DATE",rb)%></span><!-- 受注日 --></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-ODR_ACPT_DATE">
expj.KR0010010.KR0010010form2.ODR_ACPT_DATE = {};
expj.KR0010010.KR0010010form2.ODR_ACPT_DATE.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/ODR_ACPT_DATE.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.ODR_ACPT_DATE.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-ODR_ACPT_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'ODR_ACPT_DATE', this);
  });
  expj.KR0010010.KR0010010form2.ODR_ACPT_DATE.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.ODR_ACPT_DATE.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/ODR_ACPT_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-ODR_ACPT_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-ODR_ACPT_DATE" name="ODR_ACPT_DATE" class="KR0010010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getODR_ACPT_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.REQ_PRD_QTY_1",rb)%></span><!-- 受注数 --></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-ODR_QTY">
expj.KR0010010.KR0010010form2.ODR_QTY = {};
expj.KR0010010.KR0010010form2.ODR_QTY.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/ODR_QTY.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.ODR_QTY.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'ODR_QTY', this);
  });
  expj.KR0010010.KR0010010form2.ODR_QTY.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-ODR_QTY" name="ODR_QTY" class="KR0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getODR_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-PKG_UNIT3">
expj.KR0010010.KR0010010form2.PKG_UNIT3 = {};
expj.KR0010010.KR0010010form2.PKG_UNIT3.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/PKG_UNIT3.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.PKG_UNIT3.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-PKG_UNIT3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'PKG_UNIT3', this);
  });
  expj.KR0010010.KR0010010form2.PKG_UNIT3.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.PKG_UNIT3.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/PKG_UNIT3.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-PKG_UNIT3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-PKG_UNIT3" name="PKG_UNIT3" class="KR0010010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getPKG_UNIT3()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SHIP_ODR_NO",rb)%></span><!-- 出荷指示番号 --></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010form2-SHIP_ODR_NO">
expj.KR0010010.KR0010010form2.SHIP_ODR_NO = {};
expj.KR0010010.KR0010010form2.SHIP_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KR0010010form2/SHIP_ODR_NO.onDecision');
  expj.KR0010010.KR0010010form2.executeAllOnDecision();
  expj.KR0010010.executeAllOnDecision();
};
expj.KR0010010.KR0010010form2.SHIP_ODR_NO.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010form2-SHIP_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0010010', 'KR0010010form2', 'SHIP_ODR_NO', this);
  });
  expj.KR0010010.KR0010010form2.SHIP_ODR_NO.executePScriptOnLoad();
};

expj.KR0010010.KR0010010form2.SHIP_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KR0010010form2/SHIP_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010form2-SHIP_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0010010-KR0010010form2-SHIP_ODR_NO" name="SHIP_ODR_NO" class="KR0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0010010Struct.getSHIP_ODR_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 399px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-KR0010010-KR0010010button2">
expj.KR0010010.KR0010010button2 = {};
expj.KR0010010.KR0010010button2.executeAllOnDecision = function () {
  console.log('execute KR0010010button2.onDecision');
};
expj.KR0010010.KR0010010button2.executeOnLoad = function () {
  expj.KR0010010.KR0010010button2.executePScriptOnLoad();
};

expj.KR0010010.KR0010010button2.executePScriptOnLoad = function () {
  console.log('execute KR0010010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KR0010010-KR0010010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KR0010010-KR0010010button2-Insert">
expj.KR0010010.KR0010010button2.Insert = {};
// script1="onClick;0;CHK;_KR0010010form2/SALES_UNIT_PRICE[gt]0[and]_KR0010010form2/SALES_QTY[numeq]0@!KU01001,*0"
expj.KR0010010.KR0010010button2.Insert.onClick0 = function () {
  console.log('Insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010button2', '_KR0010010form2/SALES_UNIT_PRICE')), '[gt]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010button2', '_KR0010010form2/SALES_QTY')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('KR0010010', 'KR0010010button2', 'KU01001');
} else {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="onClick;1;CHK;_KR0010010form2/SALES_UNIT_PRICE[numeq]0[and]_KR0010010form2/SALES_QTY[numeq]0[and]_KR0010010form2/SALES_AMOUNT[numeq]0@!KU01002"
expj.KR0010010.KR0010010button2.Insert.onClick1 = function () {
  console.log('Insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010button2', '_KR0010010form2/SALES_UNIT_PRICE')), '[numeq]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010button2', '_KR0010010form2/SALES_QTY')), '[numeq]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010button2', '_KR0010010form2/SALES_AMOUNT')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('KR0010010', 'KR0010010button2', 'KU01002');
}
};
// script3="onClick;2;CHK;_KR0010010form2/SALES_DATE[lt]_KR0010010form2/SHIP_DATE@!KU02009"
expj.KR0010010.KR0010010button2.Insert.onClick2 = function () {
  console.log('Insert script3');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010button2', '_KR0010010form2/SALES_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010button2', '_KR0010010form2/SHIP_DATE')))) {
expj.common.pscript.viewErrorMessage('KR0010010', 'KR0010010button2', 'KU02009');
}
};
// script4="onClick;3;CHK;_KR0010010form2/BUSINESS_OPR_DATE[neq][and]~TO_YYYY_MM(_KR0010010form2/SALES_DATE)[lt]~TO_YYYY_MM(_KR0010010form2/BUSINESS_OPR_DATE)@$KU02010"
expj.KR0010010.KR0010010button2.Insert.onClick3 = function () {
  console.log('Insert script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010button2', '_KR0010010form2/BUSINESS_OPR_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('KR0010010', 'KR0010010button2', '_KR0010010form2/SALES_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('KR0010010', 'KR0010010button2', '_KR0010010form2/BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('KR0010010', 'KR0010010button2', 'KU02010');
}
};
// script5="onClick;4;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KR0010010form1/*,_KR0010010form2/*@KR0010010Servlet,,$ZZ07001"
expj.KR0010010.KR0010010button2.Insert.onClick4 = function () {
  console.log('Insert script5');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KR0010010', 'KR0010010button2', '_KR0010010form1/*,_KR0010010form2/*', 'KR0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KR0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KR0010010', response);
expj.common.updateBusinessScreenTab('KR0010010', contents);
};
expj.common.pscript.callConfirm('KR0010010', 'KR0010010button2', 'ZZ07001', okEvent);
};
// script6="child;0;CHK;_KR0010010form2/SALES_UNIT_PRICE[numeq]0[and]_KR0010010form2/SALES_QTY[gt]0@!KU01001"
expj.KR0010010.KR0010010button2.Insert.child0 = function () {
  console.log('Insert script6');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010button2', '_KR0010010form2/SALES_UNIT_PRICE')), '[numeq]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010button2', '_KR0010010form2/SALES_QTY')), '[gt]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('KR0010010', 'KR0010010button2', 'KU01001');
}
};
expj.KR0010010.KR0010010button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0010010.KR0010010button2.Insert['onClick' + i])) {
        expj.KR0010010.KR0010010button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.KR0010010.KR0010010button2.Insert.executeAllOnDecision = function () {
};
expj.KR0010010.KR0010010button2.Insert.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0010010', 'KR0010010button2', 'Insert', this, 'Button');
    }
  });
  expj.KR0010010.KR0010010button2.Insert.executePScriptOnLoad();
};

expj.KR0010010.KR0010010button2.Insert.executePScriptOnLoad = function () {
  console.log('execute KR0010010button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0010010-KR0010010button2-Insert" name="Insert" class="KR0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010button2-Delete">
expj.KR0010010.KR0010010button2.Delete = {};
// script1="onClick;0;CHK;_KR0010010form2/SALES_UNIT_PRICE[numeq]0[or]_KR0010010form2/SALES_QTY[numeq]0@!KU01001"
expj.KR0010010.KR0010010button2.Delete.onClick0 = function () {
  console.log('Delete script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010button2', '_KR0010010form2/SALES_UNIT_PRICE')), '[numeq]', expj.common.pscript.convertNumber('0')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010button2', '_KR0010010form2/SALES_QTY')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('KR0010010', 'KR0010010button2', 'KU01001');
}
};
// script2="onClick;1;CHK;_KR0010010form2/SALES_DATE[lt]_KR0010010form2/SALES_DATE2@!KU02011"
expj.KR0010010.KR0010010button2.Delete.onClick1 = function () {
  console.log('Delete script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010button2', '_KR0010010form2/SALES_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010button2', '_KR0010010form2/SALES_DATE2')))) {
expj.common.pscript.viewErrorMessage('KR0010010', 'KR0010010button2', 'KU02011');
}
};
// script3="onClick;2;CHK;_KR0010010form2/BUSINESS_OPR_DATE[neq][and]~TO_YYYY_MM(_KR0010010form2/SALES_DATE)[lt]~TO_YYYY_MM(_KR0010010form2/BUSINESS_OPR_DATE)@$KU02010"
expj.KR0010010.KR0010010button2.Delete.onClick2 = function () {
  console.log('Delete script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0010010', 'KR0010010button2', '_KR0010010form2/BUSINESS_OPR_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('KR0010010', 'KR0010010button2', '_KR0010010form2/SALES_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('KR0010010', 'KR0010010button2', '_KR0010010form2/BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('KR0010010', 'KR0010010button2', 'KU02010');
}
};
// script4="onClick;3;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KR0010010form1/*,_KR0010010form2/*@KR0010010Servlet,,$ZZ07004"
expj.KR0010010.KR0010010button2.Delete.onClick3 = function () {
  console.log('Delete script4');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KR0010010', 'KR0010010button2', '_KR0010010form1/*,_KR0010010form2/*', 'KR0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KR0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KR0010010', response);
expj.common.updateBusinessScreenTab('KR0010010', contents);
};
expj.common.pscript.callConfirm('KR0010010', 'KR0010010button2', 'ZZ07004', okEvent);
};
expj.KR0010010.KR0010010button2.Delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0010010.KR0010010button2.Delete['onClick' + i])) {
        expj.KR0010010.KR0010010button2.Delete['onClick' + i]();
      }
    }
  }
};
expj.KR0010010.KR0010010button2.Delete.executeAllOnDecision = function () {
};
expj.KR0010010.KR0010010button2.Delete.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010button2-Delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0010010', 'KR0010010button2', 'Delete', this, 'Button');
    }
  });
  expj.KR0010010.KR0010010button2.Delete.executePScriptOnLoad();
};

expj.KR0010010.KR0010010button2.Delete.executePScriptOnLoad = function () {
  console.log('execute KR0010010button2/Delete.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010button2-Delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0010010-KR0010010button2-Delete" name="Delete" class="KR0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
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
<span class="version">KR0010010 Revision: 1.6  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KR0010010-KR0010010button0">
expj.KR0010010.KR0010010button0 = {};
expj.KR0010010.KR0010010button0.executeAllOnDecision = function () {
  console.log('execute KR0010010button0.onDecision');
};
expj.KR0010010.KR0010010button0.executeOnLoad = function () {
  expj.KR0010010.KR0010010button0.executePScriptOnLoad();
};

expj.KR0010010.KR0010010button0.executePScriptOnLoad = function () {
  console.log('execute KR0010010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KR0010010-KR0010010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KR0010010-KR0010010button0-Clear">
expj.KR0010010.KR0010010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KR0010010Servlet,,$ZZ07008"
expj.KR0010010.KR0010010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KR0010010', 'KR0010010button0', '', 'KR0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KR0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KR0010010', response);
expj.common.updateBusinessScreenTab('KR0010010', contents);
};
expj.common.pscript.callConfirm('KR0010010', 'KR0010010button0', 'ZZ07008', okEvent);
};
expj.KR0010010.KR0010010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0010010.KR0010010button0.Clear['onClick' + i])) {
        expj.KR0010010.KR0010010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KR0010010.KR0010010button0.Clear.executeAllOnDecision = function () {
};
expj.KR0010010.KR0010010button0.Clear.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0010010', 'KR0010010button0', 'Clear', this, 'Button');
    }
  });
  expj.KR0010010.KR0010010button0.Clear.executePScriptOnLoad();
};

expj.KR0010010.KR0010010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KR0010010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0010010-KR0010010button0-Clear" name="Clear" class="KR0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KR0010010-KR0010010button0-Close">
expj.KR0010010.KR0010010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KR0010010.KR0010010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KR0010010');
};
expj.KR0010010.KR0010010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0010010.KR0010010button0.Close['onClick' + i])) {
        expj.KR0010010.KR0010010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KR0010010.KR0010010button0.Close.executeAllOnDecision = function () {
};
expj.KR0010010.KR0010010button0.Close.executeOnLoad = function () {
  $('#expj-KR0010010-KR0010010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0010010', 'KR0010010button0', 'Close', this, 'Button');
    }
  });
  expj.KR0010010.KR0010010button0.Close.executePScriptOnLoad();
};

expj.KR0010010.KR0010010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KR0010010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KR0010010-KR0010010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0010010-KR0010010button0-Close" name="Close" class="KR0010010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KR0010010 (END)-->
<%
MessageStruct msgStruct = aKR0010010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KR0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KR0010010)) {
  expj.common.treeInstanceMap.KR0010010 = {};
}
expj.common.treeInstanceMap.KR0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KR0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KR0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KR0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KR0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KR0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KR0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KR0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KR0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KR0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KR0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KR0010010)) {
  expj.common.detailDialogMap.KR0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KR0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KR0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KR0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.KR0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KR0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KR0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KR0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KR0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KR0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KR0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KR0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KR0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KR0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KR0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KR0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KR0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KR0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KR0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KR0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KR0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KR0010010)) {
  expj.common.viewInstanceMap.KR0010010 = {};
}
expj.common.viewInstanceMap.KR0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.KR0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KR0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KR0010010.<%=viewId %>.init = function () {
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
    expj.KR0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KR0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KR0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KR0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KR0010010_init">
/**
 * KR0010010用のロード完了時初期化関数
 */
expj.KR0010010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KR0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KR0010010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KR0010010');
  expj.common.calendarInstanceMap.KR0010010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KR0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KR0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.KR0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KR0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KR0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KR0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KR0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KR0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KR0010010-<%=detailId %>');
<%
 }
%>
  try{expj.KR0010010.KR0010010form1.SLIP_CD.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form1.h_SLIP_CD.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form1.PeekerSlipCd.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form1.AI_AR_IF_FLG.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form1.h_INSTALL_FLG.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form1.MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010button1.Select.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.CUST_ANAME.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.STATUS.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.INSPC_ACPT_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.INSPC_ACPT_TYP.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.CUST_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.SALES_DATE.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.CalendarSalesDate.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.SALES_DATE2.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.BUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.SHIP_DATE.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.SALES_DEPT_CD.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.PeekerSalesDeptCd.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.ORG_NAME.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.CUST_CHRG_PSN_CD.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.PeekerCustChrgPsnCd.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.USER_NAME.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.CUST_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.CUST_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.SALES_QTY.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.PKG_UNIT.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.SHIP_QTY.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.PKG_UNIT2.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.SALES_UNIT_PRICE.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.SelectUnitCost.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.SALES_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.CUR_UNIT2.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.REMARKS.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.PART_DLV_SEQ_NO.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.DESINATED_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.ODR_ACPT_DATE.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.PKG_UNIT3.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.SHIP_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010button2.Insert.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010button2.Delete.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form1.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010button1.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010form2.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010button2.executeOnLoad();}catch(e){};
  try{expj.KR0010010.KR0010010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KR0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KR0010010', 'KR0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KR0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KR0010010-focus-move');
  // 初期フォーカス当てる処理
  $('.KR0010010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KR0010010', '<%=request.getContextPath() %>');
};

/**
 * KR0010010の全体onDecision処理
 */
expj.KR0010010.executeAllOnDecision = function () {
  expj.KR0010010.KR0010010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KR0010010_console">
expj.KR0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>