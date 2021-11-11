<%-- ***
This file is generated
 GeneratedDate  : Thu Feb 16 20:40:12 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KT0010\KT0010010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KT0010.*" %>
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
<jsp:useBean id="aKT0010010Control" class="com.nec.jp.orteus.metamorBase.KT0010.KT0010010Control" scope="request"/>
<jsp:useBean id="aKT0010010Struct" class="com.nec.jp.orteus.metamorBase.KT0010.KT0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

出荷計画メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KT0010/jsp/KT0010010.jsp,v $
$Author: geng-jia $	
$Revision: 1.19 $　$Date: 2017/02/22 02:07:23 $
********************************************************* --%>
<html>
<head>
<title>出荷計画メンテナンス</title>
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
<script class="expj-script-KT0010010_init">
  // KT0010010名前空間
  expj.KT0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-KT0010010" data-screen="KT0010010" data-newdata="<%=aKT0010010Control.isNewData() %>">
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
              <script class="expj-script-KT0010010-KT0010010form1">
expj.KT0010010.KT0010010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5,6"
expj.KT0010010.KT0010010form1.onLoad0 = function () {
  console.log('KT0010010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision6)){this.onDecision6();}
};
// script2="onDecision;0;CHK;_r1_STS_TYP[eq]true@*0,*3"
expj.KT0010010.KT0010010form1.onDecision0 = function () {
  console.log('KT0010010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '_r1_STS_TYP'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script3="child;0;CHKRQ;?KT0010010view1/?[neq]NOT_SELECTED@*1,*3"
expj.KT0010010.KT0010010form1.child0 = function () {
  console.log('KT0010010form1 script3');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?KT0010010view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;1;CHK;?DESINATED_DLV_DATE[eq]SAME[and]?r1_STS_TYP[eq]SAME[and]?r2_STS_TYP[eq]SAME[and]?ODR_NO[eq]SAME[and]?CUST_CD[eq]SAME[and]?ITEM_CD[eq]SAME[and]?CUST_CHRG_PSN_CD[eq]SAME@*2,*3"
expj.KT0010010.KT0010010form1.child1 = function () {
  console.log('KT0010010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?DESINATED_DLV_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?r1_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?r2_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?ODR_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?CUST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?CUST_CHRG_PSN_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="child;2;UNMASK;_KT0010010button2/Insert"
expj.KT0010010.KT0010010form1.child2 = function () {
  console.log('KT0010010form1 script5');
expj.common.pscript.setUnMaskToReferenceComponent('KT0010010', 'KT0010010form1', '_KT0010010button2/Insert');
};
// script6="child;3;MASK;_KT0010010button2/Insert"
expj.KT0010010.KT0010010form1.child3 = function () {
  console.log('KT0010010form1 script6');
expj.common.pscript.setMaskToReferenceComponent('KT0010010', 'KT0010010form1', '_KT0010010button2/Insert');
};
// script7="onDecision;1;CHK;_r2_STS_TYP[eq]true@*4,*7"
expj.KT0010010.KT0010010form1.onDecision1 = function () {
  console.log('KT0010010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '_r2_STS_TYP'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script8="child;4;CHKRQ;?KT0010010view1/?[neq]NOT_SELECTED@*5,*7"
expj.KT0010010.KT0010010form1.child4 = function () {
  console.log('KT0010010form1 script8');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?KT0010010view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script9="child;5;CHK;?DESINATED_DLV_DATE[eq]SAME[and]?r1_STS_TYP[eq]SAME[and]?r2_STS_TYP[eq]SAME[and]?ODR_NO[eq]SAME[and]?CUST_CD[eq]SAME[and]?ITEM_CD[eq]SAME[and]?CUST_CHRG_PSN_CD[eq]SAME@*6,*7"
expj.KT0010010.KT0010010form1.child5 = function () {
  console.log('KT0010010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?DESINATED_DLV_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?r1_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?r2_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?ODR_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?CUST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?CUST_CHRG_PSN_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script10="child;6;UNMASK;_KT0010010button2/Update,_KT0010010button2/Delete"
expj.KT0010010.KT0010010form1.child6 = function () {
  console.log('KT0010010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('KT0010010', 'KT0010010form1', '_KT0010010button2/Update');
expj.common.pscript.setUnMaskToReferenceComponent('KT0010010', 'KT0010010form1', '_KT0010010button2/Delete');
};
// script11="child;7;MASK;_KT0010010button2/Update,_KT0010010button2/Delete"
expj.KT0010010.KT0010010form1.child7 = function () {
  console.log('KT0010010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('KT0010010', 'KT0010010form1', '_KT0010010button2/Update');
expj.common.pscript.setMaskToReferenceComponent('KT0010010', 'KT0010010form1', '_KT0010010button2/Delete');
};
// script12="onDecision;2;CHK;?DESINATED_DLV_DATE[eq]SAME[and]?r1_STS_TYP[eq]SAME[and]?r2_STS_TYP[eq]SAME[and]?ODR_NO[eq]SAME[and]?CUST_CD[eq]SAME[and]?ITEM_CD[eq]SAME[and]?CUST_CHRG_PSN_CD[eq]SAME[and]?KT0010010form1/*[eq]NORMAL@*8,*9"
expj.KT0010010.KT0010010form1.onDecision2 = function () {
  console.log('KT0010010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?DESINATED_DLV_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?r1_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?r2_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?ODR_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?CUST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?CUST_CHRG_PSN_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?KT0010010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script13="child;8;UNMASK;_KT0010010button2/CheckAll,_KT0010010button2/UncheckAll"
expj.KT0010010.KT0010010form1.child8 = function () {
  console.log('KT0010010form1 script13');
expj.common.pscript.setUnMaskToReferenceComponent('KT0010010', 'KT0010010form1', '_KT0010010button2/CheckAll');
expj.common.pscript.setUnMaskToReferenceComponent('KT0010010', 'KT0010010form1', '_KT0010010button2/UncheckAll');
};
// script14="child;9;MASK;_KT0010010button2/CheckAll,_KT0010010button2/UncheckAll"
expj.KT0010010.KT0010010form1.child9 = function () {
  console.log('KT0010010form1 script14');
expj.common.pscript.setMaskToReferenceComponent('KT0010010', 'KT0010010form1', '_KT0010010button2/CheckAll');
expj.common.pscript.setMaskToReferenceComponent('KT0010010', 'KT0010010form1', '_KT0010010button2/UncheckAll');
};
// script15="onDecision;3;CHK;_r1_STS_TYP[eq]true@*10,*13"
expj.KT0010010.KT0010010form1.onDecision3 = function () {
  console.log('KT0010010form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '_r1_STS_TYP'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script16="child;10;CHK;?KT0010010form1/*[eq]NORMAL[and]_ODR_NO[neq]@*11,*13"
expj.KT0010010.KT0010010form1.child10 = function () {
  console.log('KT0010010form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?KT0010010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '_ODR_NO'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script17="child;11;CHK;?DESINATED_DLV_DATE[eq]SAME[and]?r1_STS_TYP[eq]SAME[and]?r2_STS_TYP[eq]SAME[and]?ODR_NO[eq]SAME[and]?CUST_CD[eq]SAME[and]?ITEM_CD[eq]SAME[and]?CUST_CHRG_PSN_CD[eq]SAME@*12,*13"
expj.KT0010010.KT0010010form1.child11 = function () {
  console.log('KT0010010form1 script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?DESINATED_DLV_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?r1_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?r2_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?ODR_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?CUST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '?CUST_CHRG_PSN_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script18="child;12;UNMASK;_KT0010010button2/LineCopy"
expj.KT0010010.KT0010010form1.child12 = function () {
  console.log('KT0010010form1 script18');
expj.common.pscript.setUnMaskToReferenceComponent('KT0010010', 'KT0010010form1', '_KT0010010button2/LineCopy');
};
// script19="child;13;MASK;_KT0010010button2/LineCopy"
expj.KT0010010.KT0010010form1.child13 = function () {
  console.log('KT0010010form1 script19');
expj.common.pscript.setMaskToReferenceComponent('KT0010010', 'KT0010010form1', '_KT0010010button2/LineCopy');
};
// script20="onDecision;4;CHKRQ;A@*14,*15"
expj.KT0010010.KT0010010form1.onDecision4 = function () {
  console.log('KT0010010form1 script20');
if (expj.common.pscript.satisfiedRequiredComponent('KT0010010', 'A')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script21="child;14;UNMASK;_KT0010010button1/Select"
expj.KT0010010.KT0010010form1.child14 = function () {
  console.log('KT0010010form1 script21');
expj.common.pscript.setUnMaskToReferenceComponent('KT0010010', 'KT0010010form1', '_KT0010010button1/Select');
};
// script22="child;15;MASK;_KT0010010button1/Select"
expj.KT0010010.KT0010010form1.child15 = function () {
  console.log('KT0010010form1 script22');
expj.common.pscript.setMaskToReferenceComponent('KT0010010', 'KT0010010form1', '_KT0010010button1/Select');
};
// script23="onDecision;5;CHK;_r1_STS_TYP[eq]true@*16"
expj.KT0010010.KT0010010form1.onDecision5 = function () {
  console.log('KT0010010form1 script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '_r1_STS_TYP'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script24="child;16;SET;_h_SHIP_CMPLT_FLG=0"
expj.KT0010010.KT0010010form1.child16 = function () {
  console.log('KT0010010form1 script24');
expj.common.pscript.setReferenceComponentValue('KT0010010', 'KT0010010form1', '_h_SHIP_CMPLT_FLG', '0');
};
// script25="onDecision;6;CHK;_r2_STS_TYP[eq]true@*17"
expj.KT0010010.KT0010010form1.onDecision6 = function () {
  console.log('KT0010010form1 script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '_r2_STS_TYP'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script27="child;17;SET;_h_SHIP_CMPLT_FLG=1"
expj.KT0010010.KT0010010form1.child17 = function () {
  console.log('KT0010010form1 script27');
expj.common.pscript.setReferenceComponentValue('KT0010010', 'KT0010010form1', '_h_SHIP_CMPLT_FLG', '1');
};
expj.KT0010010.KT0010010form1.executeAllOnDecision = function () {
  console.log('execute KT0010010form1.onDecision');
  for (var i = 0; i <= 6; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KT0010010.KT0010010form1['onDecision' + i])) {
        expj.KT0010010.KT0010010form1['onDecision' + i]();
      }
    }
  }
};
expj.KT0010010.KT0010010form1.executeOnLoad = function () {
  expj.KT0010010.KT0010010form1.executePScriptOnLoad();
};

expj.KT0010010.KT0010010form1.executePScriptOnLoad = function () {
  console.log('execute KT0010010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KT0010010.KT0010010form1['onLoad' + i])) {
      expj.KT0010010.KT0010010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KT0010010-KT0010010form1" action="KT0010010Servlet" name="KT0010010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKT0010010Control.getReadStatusString()) %>" style="height:142px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:142px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb)%></span><!-- 指定納期日 --></div><!--/td-->
<script class="expj-script-KT0010010-KT0010010form1-DESINATED_DLV_DATE">
expj.KT0010010.KT0010010form1.DESINATED_DLV_DATE = {};
expj.KT0010010.KT0010010form1.DESINATED_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute KT0010010form1/DESINATED_DLV_DATE.onDecision');
  expj.KT0010010.KT0010010form1.executeAllOnDecision();
  expj.KT0010010.executeAllOnDecision();
};
expj.KT0010010.KT0010010form1.DESINATED_DLV_DATE.executeOnLoad = function () {
  $('#expj-KT0010010-KT0010010form1-DESINATED_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KT0010010', 'KT0010010form1', 'DESINATED_DLV_DATE', this);
  });
  expj.KT0010010.KT0010010form1.DESINATED_DLV_DATE.executePScriptOnLoad();
};

expj.KT0010010.KT0010010form1.DESINATED_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute KT0010010form1/DESINATED_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KT0010010-KT0010010form1-DESINATED_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KT0010010-KT0010010form1-DESINATED_DLV_DATE" name="DESINATED_DLV_DATE" class="KT0010010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKT0010010Struct.getDESINATED_DLV_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KT0010010-KT0010010form1-DESINATED_DLV_DATE_CALENDAR">
expj.KT0010010.KT0010010form1.DESINATED_DLV_DATE_CALENDAR = {};
// script1="onClick;0;CALENDAR;_KT0010010form1/DESINATED_DLV_DATE"
expj.KT0010010.KT0010010form1.DESINATED_DLV_DATE_CALENDAR.onClick0 = function () {
  console.log('DESINATED_DLV_DATE_CALENDAR script1');
expj.common.pscript.executeCalendar('KT0010010','KT0010010form1','_KT0010010form1/DESINATED_DLV_DATE');
};
expj.KT0010010.KT0010010form1.DESINATED_DLV_DATE_CALENDAR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KT0010010.KT0010010form1.DESINATED_DLV_DATE_CALENDAR['onClick' + i])) {
        expj.KT0010010.KT0010010form1.DESINATED_DLV_DATE_CALENDAR['onClick' + i]();
      }
    }
  }
};
expj.KT0010010.KT0010010form1.DESINATED_DLV_DATE_CALENDAR.executeAllOnDecision = function () {
};
expj.KT0010010.KT0010010form1.DESINATED_DLV_DATE_CALENDAR.executeOnLoad = function () {
  $('#expj-KT0010010-KT0010010form1-DESINATED_DLV_DATE_CALENDAR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KT0010010', 'KT0010010form1', 'DESINATED_DLV_DATE_CALENDAR', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KT0010010','KT0010010form1','_KT0010010form1/DESINATED_DLV_DATE');
  expj.KT0010010.KT0010010form1.DESINATED_DLV_DATE_CALENDAR.executePScriptOnLoad();
};

expj.KT0010010.KT0010010form1.DESINATED_DLV_DATE_CALENDAR.executePScriptOnLoad = function () {
  console.log('execute KT0010010form1/DESINATED_DLV_DATE_CALENDAR.onLoad');
  var targetComponent = document.getElementById('expj-KT0010010-KT0010010form1-DESINATED_DLV_DATE_CALENDAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KT0010010-KT0010010form1-DESINATED_DLV_DATE_CALENDAR" class="KT0010010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0028",rb)%></span><!-- まで --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-KT0010010-KT0010010form1-r1_STS_TYP">
expj.KT0010010.KT0010010form1.r1_STS_TYP = {};
// script1="onClick;0;SET;_DESINATED_DLV_DATE=,_ODR_NO=,_CUST_CD=,_ITEM_CD=,_CUST_CHRG_PSN_CD=,_CUST_ODR_NO=,_h_SHIP_CMPLT_FLG=0"
expj.KT0010010.KT0010010form1.r1_STS_TYP.onClick0 = function () {
  console.log('r1_STS_TYP script1');
expj.common.pscript.setReferenceComponentValue('KT0010010', 'KT0010010form1', '_DESINATED_DLV_DATE', '');
expj.common.pscript.setReferenceComponentValue('KT0010010', 'KT0010010form1', '_ODR_NO', '');
expj.common.pscript.setReferenceComponentValue('KT0010010', 'KT0010010form1', '_CUST_CD', '');
expj.common.pscript.setReferenceComponentValue('KT0010010', 'KT0010010form1', '_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('KT0010010', 'KT0010010form1', '_CUST_CHRG_PSN_CD', '');
expj.common.pscript.setReferenceComponentValue('KT0010010', 'KT0010010form1', '_CUST_ODR_NO', '');
expj.common.pscript.setReferenceComponentValue('KT0010010', 'KT0010010form1', '_h_SHIP_CMPLT_FLG', '0');
};
expj.KT0010010.KT0010010form1.r1_STS_TYP.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KT0010010.KT0010010form1.r1_STS_TYP['onClick' + i])) {
        expj.KT0010010.KT0010010form1.r1_STS_TYP['onClick' + i]();
      }
    }
  }
};
expj.KT0010010.KT0010010form1.r1_STS_TYP.executeAllOnDecision = function () {
  console.log('execute KT0010010form1/r1_STS_TYP.onDecision');
  expj.KT0010010.KT0010010form1.executeAllOnDecision();
  expj.KT0010010.executeAllOnDecision();
};
expj.KT0010010.KT0010010form1.r1_STS_TYP.executeOnLoad = function () {
  $('#expj-KT0010010-KT0010010form1-r1_STS_TYP').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KT0010010', 'KT0010010form1', 'r1_STS_TYP', this, 'RadioButton');
    }
  });
  expj.KT0010010.KT0010010form1.r1_STS_TYP.executePScriptOnLoad();
};

expj.KT0010010.KT0010010form1.r1_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute KT0010010form1/r1_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KT0010010-KT0010010form1-r1_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="STS_TYP" data-name="r1_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aKT0010010Struct.getr1_STS_TYP())))?"checked=\"checked\"":"" %> class="" id="expj-KT0010010-KT0010010form1-r1_STS_TYP" ><label for="expj-KT0010010-KT0010010form1-r1_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0457",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-KT0010010-KT0010010form1-h_SHIP_CMPLT_FLG" name="h_SHIP_CMPLT_FLG" class="" data-kind="" maxlength="2147483647" value="">
<script class="expj-script-KT0010010-KT0010010form1-h_SHIP_CMPLT_FLG">
expj.KT0010010.KT0010010form1.h_SHIP_CMPLT_FLG = {};
expj.KT0010010.KT0010010form1.h_SHIP_CMPLT_FLG.executeAllOnDecision = function () {
  console.log('execute KT0010010form1/h_SHIP_CMPLT_FLG.onDecision');
  expj.KT0010010.KT0010010form1.executeAllOnDecision();
  expj.KT0010010.executeAllOnDecision();
};
expj.KT0010010.KT0010010form1.h_SHIP_CMPLT_FLG.executeOnLoad = function () {
  $('#expj-KT0010010-KT0010010form1-h_SHIP_CMPLT_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KT0010010', 'KT0010010form1', 'h_SHIP_CMPLT_FLG', this);
  });
  expj.KT0010010.KT0010010form1.h_SHIP_CMPLT_FLG.executePScriptOnLoad();
};

expj.KT0010010.KT0010010form1.h_SHIP_CMPLT_FLG.executePScriptOnLoad = function () {
  console.log('execute KT0010010form1/h_SHIP_CMPLT_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KT0010010-KT0010010form1-h_SHIP_CMPLT_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SHIP_ORD_CD",rb)%></span><!-- 受注番号 --></div><!--/td-->
<script class="expj-script-KT0010010-KT0010010form1-ODR_NO">
expj.KT0010010.KT0010010form1.ODR_NO = {};
expj.KT0010010.KT0010010form1.ODR_NO.executeAllOnDecision = function () {
  console.log('execute KT0010010form1/ODR_NO.onDecision');
  expj.KT0010010.KT0010010form1.executeAllOnDecision();
  expj.KT0010010.executeAllOnDecision();
};
expj.KT0010010.KT0010010form1.ODR_NO.executeOnLoad = function () {
  $('#expj-KT0010010-KT0010010form1-ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KT0010010', 'KT0010010form1', 'ODR_NO', this);
  });
  expj.KT0010010.KT0010010form1.ODR_NO.executePScriptOnLoad();
};

expj.KT0010010.KT0010010form1.ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KT0010010form1/ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KT0010010-KT0010010form1-ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KT0010010-KT0010010form1-ODR_NO" name="ODR_NO" class="KT0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKT0010010Struct.getODR_NO()) %>" maxlength="15" ></div><!--/td-->
<script class="expj-script-KT0010010-KT0010010form1-PeekerCurCd">
expj.KT0010010.KT0010010form1.PeekerCurCd = {};
// script1="onClick;0;PEEKER;_KT0010010form1/ODR_NO@<%=contextNo%>"
expj.KT0010010.KT0010010form1.PeekerCurCd.onClick0 = function () {
  console.log('PeekerCurCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KT0010010';
var parameterValues = 'PeekerCurCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '_ODR_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_11%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '_h_SHIP_CMPLT_FLG') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ODR_NO_03%&%';
parameterValues += 'TARGET_FIELD%=%_KT0010010form1/ODR_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KT0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KT0010010.KT0010010form1.PeekerCurCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KT0010010.KT0010010form1.PeekerCurCd['onClick' + i])) {
        expj.KT0010010.KT0010010form1.PeekerCurCd['onClick' + i]();
      }
    }
  }
};
expj.KT0010010.KT0010010form1.PeekerCurCd.executeAllOnDecision = function () {
};
expj.KT0010010.KT0010010form1.PeekerCurCd.executeOnLoad = function () {
  $('#expj-KT0010010-KT0010010form1-PeekerCurCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KT0010010', 'KT0010010form1', 'PeekerCurCd', this, 'Button');
    }
  });
  expj.KT0010010.KT0010010form1.PeekerCurCd.executePScriptOnLoad();
};

expj.KT0010010.KT0010010form1.PeekerCurCd.executePScriptOnLoad = function () {
  console.log('execute KT0010010form1/PeekerCurCd.onLoad');
  var targetComponent = document.getElementById('expj-KT0010010-KT0010010form1-PeekerCurCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KT0010010-KT0010010form1-PeekerCurCd" class="KT0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-KT0010010-KT0010010form1-r2_STS_TYP">
expj.KT0010010.KT0010010form1.r2_STS_TYP = {};
// script1="onClick;0;SET;_DESINATED_DLV_DATE=,_ODR_NO=,_CUST_CD=,_ITEM_CD=,_CUST_CHRG_PSN_CD=,_CUST_ODR_NO=,_h_SHIP_CMPLT_FLG=1"
expj.KT0010010.KT0010010form1.r2_STS_TYP.onClick0 = function () {
  console.log('r2_STS_TYP script1');
expj.common.pscript.setReferenceComponentValue('KT0010010', 'KT0010010form1', '_DESINATED_DLV_DATE', '');
expj.common.pscript.setReferenceComponentValue('KT0010010', 'KT0010010form1', '_ODR_NO', '');
expj.common.pscript.setReferenceComponentValue('KT0010010', 'KT0010010form1', '_CUST_CD', '');
expj.common.pscript.setReferenceComponentValue('KT0010010', 'KT0010010form1', '_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('KT0010010', 'KT0010010form1', '_CUST_CHRG_PSN_CD', '');
expj.common.pscript.setReferenceComponentValue('KT0010010', 'KT0010010form1', '_CUST_ODR_NO', '');
expj.common.pscript.setReferenceComponentValue('KT0010010', 'KT0010010form1', '_h_SHIP_CMPLT_FLG', '1');
};
expj.KT0010010.KT0010010form1.r2_STS_TYP.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KT0010010.KT0010010form1.r2_STS_TYP['onClick' + i])) {
        expj.KT0010010.KT0010010form1.r2_STS_TYP['onClick' + i]();
      }
    }
  }
};
expj.KT0010010.KT0010010form1.r2_STS_TYP.executeAllOnDecision = function () {
  console.log('execute KT0010010form1/r2_STS_TYP.onDecision');
  expj.KT0010010.KT0010010form1.executeAllOnDecision();
  expj.KT0010010.executeAllOnDecision();
};
expj.KT0010010.KT0010010form1.r2_STS_TYP.executeOnLoad = function () {
  $('#expj-KT0010010-KT0010010form1-r2_STS_TYP').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KT0010010', 'KT0010010form1', 'r2_STS_TYP', this, 'RadioButton');
    }
  });
  expj.KT0010010.KT0010010form1.r2_STS_TYP.executePScriptOnLoad();
};

expj.KT0010010.KT0010010form1.r2_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute KT0010010form1/r2_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KT0010010-KT0010010form1-r2_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="STS_TYP" data-name="r2_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aKT0010010Struct.getr2_STS_TYP())))?"checked=\"checked\"":"" %> class="" id="expj-KT0010010-KT0010010form1-r2_STS_TYP" ><label for="expj-KT0010010-KT0010010form1-r2_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0458",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KT0010010-KT0010010form1-CUST_CD">
expj.KT0010010.KT0010010form1.CUST_CD = {};
expj.KT0010010.KT0010010form1.CUST_CD.executeAllOnDecision = function () {
  console.log('execute KT0010010form1/CUST_CD.onDecision');
  expj.KT0010010.KT0010010form1.executeAllOnDecision();
  expj.KT0010010.executeAllOnDecision();
};
expj.KT0010010.KT0010010form1.CUST_CD.executeOnLoad = function () {
  $('#expj-KT0010010-KT0010010form1-CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KT0010010', 'KT0010010form1', 'CUST_CD', this);
  });
  expj.KT0010010.KT0010010form1.CUST_CD.executePScriptOnLoad();
};

expj.KT0010010.KT0010010form1.CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KT0010010form1/CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KT0010010-KT0010010form1-CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KT0010010-KT0010010form1-CUST_CD" name="CUST_CD" class="KT0010010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aKT0010010Struct.getCUST_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KT0010010-KT0010010form1-PeekerCUST_CD">
expj.KT0010010.KT0010010form1.PeekerCUST_CD = {};
// script1="onClick;0;PEEKER;_KT0010010form1/CUST_CD@<%=contextNo%>"
expj.KT0010010.KT0010010form1.PeekerCUST_CD.onClick0 = function () {
  console.log('PeekerCUST_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KT0010010';
var parameterValues = 'PeekerCUST_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '_KT0010010form1/CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUST_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KT0010010form1/CUST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KT0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KT0010010.KT0010010form1.PeekerCUST_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KT0010010.KT0010010form1.PeekerCUST_CD['onClick' + i])) {
        expj.KT0010010.KT0010010form1.PeekerCUST_CD['onClick' + i]();
      }
    }
  }
};
expj.KT0010010.KT0010010form1.PeekerCUST_CD.executeAllOnDecision = function () {
};
expj.KT0010010.KT0010010form1.PeekerCUST_CD.executeOnLoad = function () {
  $('#expj-KT0010010-KT0010010form1-PeekerCUST_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KT0010010', 'KT0010010form1', 'PeekerCUST_CD', this, 'Button');
    }
  });
  expj.KT0010010.KT0010010form1.PeekerCUST_CD.executePScriptOnLoad();
};

expj.KT0010010.KT0010010form1.PeekerCUST_CD.executePScriptOnLoad = function () {
  console.log('execute KT0010010form1/PeekerCUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KT0010010-KT0010010form1-PeekerCUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KT0010010-KT0010010form1-PeekerCUST_CD" class="KT0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-KT0010010-KT0010010form1-ITEM_CD">
expj.KT0010010.KT0010010form1.ITEM_CD = {};
expj.KT0010010.KT0010010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KT0010010form1/ITEM_CD.onDecision');
  expj.KT0010010.KT0010010form1.executeAllOnDecision();
  expj.KT0010010.executeAllOnDecision();
};
expj.KT0010010.KT0010010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-KT0010010-KT0010010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KT0010010', 'KT0010010form1', 'ITEM_CD', this);
  });
  expj.KT0010010.KT0010010form1.ITEM_CD.executePScriptOnLoad();
};

expj.KT0010010.KT0010010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KT0010010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KT0010010-KT0010010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KT0010010-KT0010010form1-ITEM_CD" name="ITEM_CD" class="KT0010010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aKT0010010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KT0010010-KT0010010form1-PeekerITEM_CD">
expj.KT0010010.KT0010010form1.PeekerITEM_CD = {};
// script1="onClick;0;PEEKER;_KT0010010form1/ITEM_CD@<%=contextNo%>"
expj.KT0010010.KT0010010form1.PeekerITEM_CD.onClick0 = function () {
  console.log('PeekerITEM_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KT0010010';
var parameterValues = 'PeekerITEM_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KT0010010', 'KT0010010form1', '_KT0010010form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KT0010010form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KT0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KT0010010.KT0010010form1.PeekerITEM_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KT0010010.KT0010010form1.PeekerITEM_CD['onClick' + i])) {
        expj.KT0010010.KT0010010form1.PeekerITEM_CD['onClick' + i]();
      }
    }
  }
};
expj.KT0010010.KT0010010form1.PeekerITEM_CD.executeAllOnDecision = function () {
};
expj.KT0010010.KT0010010form1.PeekerITEM_CD.executeOnLoad = function () {
  $('#expj-KT0010010-KT0010010form1-PeekerITEM_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KT0010010', 'KT0010010form1', 'PeekerITEM_CD', this, 'Button');
    }
  });
  expj.KT0010010.KT0010010form1.PeekerITEM_CD.executePScriptOnLoad();
};

expj.KT0010010.KT0010010form1.PeekerITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KT0010010form1/PeekerITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KT0010010-KT0010010form1-PeekerITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KT0010010-KT0010010form1-PeekerITEM_CD" class="KT0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OWN_PERSON_CD_2",rb)%></span><!-- 発注/営業担当者コード --></div><!--/td-->
<script class="expj-script-KT0010010-KT0010010form1-CUST_CHRG_PSN_CD">
expj.KT0010010.KT0010010form1.CUST_CHRG_PSN_CD = {};
expj.KT0010010.KT0010010form1.CUST_CHRG_PSN_CD.executeAllOnDecision = function () {
  console.log('execute KT0010010form1/CUST_CHRG_PSN_CD.onDecision');
  expj.KT0010010.KT0010010form1.executeAllOnDecision();
  expj.KT0010010.executeAllOnDecision();
};
expj.KT0010010.KT0010010form1.CUST_CHRG_PSN_CD.executeOnLoad = function () {
  $('#expj-KT0010010-KT0010010form1-CUST_CHRG_PSN_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KT0010010', 'KT0010010form1', 'CUST_CHRG_PSN_CD', this);
  });
  expj.KT0010010.KT0010010form1.CUST_CHRG_PSN_CD.executePScriptOnLoad();
};

expj.KT0010010.KT0010010form1.CUST_CHRG_PSN_CD.executePScriptOnLoad = function () {
  console.log('execute KT0010010form1/CUST_CHRG_PSN_CD.onLoad');
  var targetComponent = document.getElementById('expj-KT0010010-KT0010010form1-CUST_CHRG_PSN_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KT0010010-KT0010010form1-CUST_CHRG_PSN_CD" name="CUST_CHRG_PSN_CD" class="KT0010010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aKT0010010Struct.getCUST_CHRG_PSN_CD()) %>" maxlength="10" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_ODR_NO",rb)%></span><!-- 得意先注文番号 --></div><!--/td-->
<script class="expj-script-KT0010010-KT0010010form1-CUST_ODR_NO">
expj.KT0010010.KT0010010form1.CUST_ODR_NO = {};
expj.KT0010010.KT0010010form1.CUST_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KT0010010form1/CUST_ODR_NO.onDecision');
  expj.KT0010010.KT0010010form1.executeAllOnDecision();
  expj.KT0010010.executeAllOnDecision();
};
expj.KT0010010.KT0010010form1.CUST_ODR_NO.executeOnLoad = function () {
  $('#expj-KT0010010-KT0010010form1-CUST_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KT0010010', 'KT0010010form1', 'CUST_ODR_NO', this);
  });
  expj.KT0010010.KT0010010form1.CUST_ODR_NO.executePScriptOnLoad();
};

expj.KT0010010.KT0010010form1.CUST_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KT0010010form1/CUST_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KT0010010-KT0010010form1-CUST_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KT0010010-KT0010010form1-CUST_ODR_NO" name="CUST_ODR_NO" class="KT0010010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aKT0010010Struct.getCUST_ODR_NO()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KT0010010-KT0010010button1">
expj.KT0010010.KT0010010button1 = {};
expj.KT0010010.KT0010010button1.executeAllOnDecision = function () {
  console.log('execute KT0010010button1.onDecision');
};
expj.KT0010010.KT0010010button1.executeOnLoad = function () {
  expj.KT0010010.KT0010010button1.executePScriptOnLoad();
};

expj.KT0010010.KT0010010button1.executePScriptOnLoad = function () {
  console.log('execute KT0010010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KT0010010-KT0010010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KT0010010-KT0010010button1-Select">
expj.KT0010010.KT0010010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KT0010010form1/*@KT0010010Servlet"
expj.KT0010010.KT0010010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KT0010010', 'KT0010010button1', '_KT0010010form1/*', 'KT0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KT0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KT0010010', response);
expj.common.updateBusinessScreenTab('KT0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KT0010010.KT0010010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KT0010010.KT0010010button1.Select['onClick' + i])) {
        expj.KT0010010.KT0010010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.KT0010010.KT0010010button1.Select.executeAllOnDecision = function () {
};
expj.KT0010010.KT0010010button1.Select.executeOnLoad = function () {
  $('#expj-KT0010010-KT0010010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KT0010010', 'KT0010010button1', 'Select', this, 'Button');
    }
  });
  expj.KT0010010.KT0010010button1.Select.executePScriptOnLoad();
};

expj.KT0010010.KT0010010button1.Select.executePScriptOnLoad = function () {
  console.log('execute KT0010010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-KT0010010-KT0010010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KT0010010-KT0010010button1-Select" name="Select" class="KT0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-KT0010010-KT0010010view1">
expj.KT0010010.KT0010010view1 = {};
expj.KT0010010.KT0010010view1.executeAllOnClick = function () {
};
expj.KT0010010.KT0010010view1.executeAllOnDecision = function () {
  console.log('execute KT0010010view1.onDecision');
};
expj.KT0010010.KT0010010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("KT0010010view1", "expj.KT0010010.KT0010010view1.executeAllOnClick");
%>
  expj.KT0010010.KT0010010view1.executePScriptOnLoad();
};

expj.KT0010010.KT0010010view1.executePScriptOnLoad = function () {
  console.log('execute KT0010010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-KT0010010-KT0010010view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String KT0010010view1_Id = "KT0010010view1";
 String KT0010010view1_select = "single";
 String KT0010010view1_sortable = "true";
 String KT0010010view1_resize = "true";
 String KT0010010view1_scroll = "true";
 StringBuffer KT0010010view1_HB = new StringBuffer();
 StringBuffer KT0010010view1_DB = new StringBuffer();
%>
<%
 KT0010010view1_select = "multi";
 KT0010010view1_sortable = "false";
 KT0010010view1_resize = "true";
 KT0010010view1_scroll = "true";
%>
<%
 KT0010010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
%>
    <script class="expj-script-KT0010010-KT0010010view1-l_DESINATED_SHIP_DATE">
expj.KT0010010.KT0010010view1.l_DESINATED_SHIP_DATE = {};
expj.KT0010010.KT0010010view1.l_DESINATED_SHIP_DATE.executeAllOnClick = function () {
};
expj.KT0010010.KT0010010view1.l_DESINATED_SHIP_DATE.executeAllOnDecision = function () {
  console.log('execute KT0010010view1/l_DESINATED_SHIP_DATE.onDecision');
  expj.KT0010010.KT0010010view1.executeAllOnDecision();
  expj.KT0010010.executeAllOnDecision();
};
expj.KT0010010.KT0010010view1.l_DESINATED_SHIP_DATE.executeOnLoad = function () {
  $('.expj-KT0010010-KT0010010view1-l_DESINATED_SHIP_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KT0010010', 'KT0010010view1', 'l_DESINATED_SHIP_DATE', this);
  });
  expj.KT0010010.KT0010010view1.l_DESINATED_SHIP_DATE.executePScriptOnLoad();
};

expj.KT0010010.KT0010010view1.l_DESINATED_SHIP_DATE.executePScriptOnLoad = function () {
  console.log('execute KT0010010view1/l_DESINATED_SHIP_DATE.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-KT0010010-KT0010010view1-l_DESINATED_SHIP_QTY">
expj.KT0010010.KT0010010view1.l_DESINATED_SHIP_QTY = {};
expj.KT0010010.KT0010010view1.l_DESINATED_SHIP_QTY.executeAllOnClick = function () {
};
expj.KT0010010.KT0010010view1.l_DESINATED_SHIP_QTY.executeAllOnDecision = function () {
  console.log('execute KT0010010view1/l_DESINATED_SHIP_QTY.onDecision');
  expj.KT0010010.KT0010010view1.executeAllOnDecision();
  expj.KT0010010.executeAllOnDecision();
};
expj.KT0010010.KT0010010view1.l_DESINATED_SHIP_QTY.executeOnLoad = function () {
  $('.expj-KT0010010-KT0010010view1-l_DESINATED_SHIP_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KT0010010', 'KT0010010view1', 'l_DESINATED_SHIP_QTY', this);
  });
  expj.KT0010010.KT0010010view1.l_DESINATED_SHIP_QTY.executePScriptOnLoad();
};

expj.KT0010010.KT0010010view1.l_DESINATED_SHIP_QTY.executePScriptOnLoad = function () {
  console.log('execute KT0010010view1/l_DESINATED_SHIP_QTY.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 
<%
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ODR_NO",rb))).append("', 'name':'l_CUST_ODR_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb))).append("', 'name':'l_DESINATED_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SHIP_ORD_CD",rb))).append("', 'name':'l_ODR_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_CD",rb))).append("', 'name':'l_CUST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_QTY_4",rb))).append("', 'name':'l_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SHIP_PLAN_REMAIN_QTY",rb))).append("', 'name':'l_SHIP_PLAN_REMAIN_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DESINATED_SHIP_DATE",rb))).append("', 'name':'l_DESINATED_SHIP_DATE', 'class':'expj-tooltip expj-view-cell-textinput', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DESINATED_SHIP_QTY",rb))).append("', 'name':'l_DESINATED_SHIP_QTY', 'class':'expj-tooltip expj-view-cell-textinput expj-align-right', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_UNIT",rb))).append("', 'name':'l_PKG_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_TYP",rb))).append("', 'name':'l_DEPO_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PARTIAL_SHIP_INST_FLG",rb))).append("', 'name':'l_PARTIAL_SHIP_INST_FLG', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_NAME",rb))).append("', 'name':'l_CUST_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_CD",rb))).append("', 'name':'l_CUST_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_NAME",rb))).append("', 'name':'l_CUST_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'l_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.REMARKS",rb))).append("', 'name':'l_REMARKS', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'PARTIAL_SHIP_INST_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_PART_DLV_SEQ_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_bk_DESINATED_SHIP_QTY', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_UNIT_QTY_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_SHIP_WH_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
KT0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_SHIP_PLANT_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KT0010010view1_sortable).append("}").append(",");
%>
<%
 int aKT0010010StructLength = aKT0010010Control.getListsize();
 final KT0010010Struct structBackup = aKT0010010Struct;
 aKT0010010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aKT0010010StructLength; ++loopCount) {
  if((aKT0010010Struct = (KT0010010Struct) aKT0010010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aKT0010010Struct", aKT0010010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 KT0010010view1_DB.append("[");
 KT0010010view1_DB.append(loopCount);
 KT0010010view1_DB.append(",").append("'<span id=\"expj-KT0010010-KT0010010view1-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KT0010010-KT0010010view1-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKT0010010Struct.getl_ITEM_CD())).append("</span>'");
 KT0010010view1_DB.append(",").append("'<span id=\"expj-KT0010010-KT0010010view1-l_CUST_ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KT0010010-KT0010010view1-l_CUST_ODR_NO\" data-name=\"l_CUST_ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKT0010010Struct.getl_CUST_ODR_NO())).append("</span>'");
 KT0010010view1_DB.append(",").append("'<span id=\"expj-KT0010010-KT0010010view1-l_DESINATED_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-KT0010010-KT0010010view1-l_DESINATED_DLV_DATE\" data-name=\"l_DESINATED_DLV_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aKT0010010Struct.getl_DESINATED_DLV_DATE())).append("</span>'");
 KT0010010view1_DB.append(",").append("'<span id=\"expj-KT0010010-KT0010010view1-l_ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KT0010010-KT0010010view1-l_ODR_NO\" data-name=\"l_ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKT0010010Struct.getl_ODR_NO())).append("</span>'");
 KT0010010view1_DB.append(",").append("'<span id=\"expj-KT0010010-KT0010010view1-l_CUST_CD-").append(loopCount).append("\" class=\"expj-label expj-KT0010010-KT0010010view1-l_CUST_CD\" data-name=\"l_CUST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKT0010010Struct.getl_CUST_CD())).append("</span>'");
 KT0010010view1_DB.append(",").append("'<span id=\"expj-KT0010010-KT0010010view1-l_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-KT0010010-KT0010010view1-l_ODR_QTY\" data-name=\"l_ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aKT0010010Struct.getl_ODR_QTY())).append("</span>'");
 KT0010010view1_DB.append(",").append("'<span id=\"expj-KT0010010-KT0010010view1-l_SHIP_PLAN_REMAIN_QTY-").append(loopCount).append("\" class=\"expj-label expj-KT0010010-KT0010010view1-l_SHIP_PLAN_REMAIN_QTY\" data-name=\"l_SHIP_PLAN_REMAIN_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;CEIL;4\">").append(TypeConverter.sanitizer(aKT0010010Struct.getl_SHIP_PLAN_REMAIN_QTY())).append("</span>'");
 KT0010010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-KT0010010-KT0010010view1-l_DESINATED_SHIP_DATE-").append(loopCount).append("\" class=\"expj-KT0010010-KT0010010view1-l_DESINATED_SHIP_DATE KT0010010-focus-move\" data-name=\"l_DESINATED_SHIP_DATE\" data-view=\"true\" maxlength=\"2147483647\" data-kind=\"").append("OBT_DATE;TYPE_YMD").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aKT0010010Struct.getl_DESINATED_SHIP_DATE())).append("\">'");
 KT0010010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-KT0010010-KT0010010view1-l_DESINATED_SHIP_QTY-").append(loopCount).append("\" class=\"expj-KT0010010-KT0010010view1-l_DESINATED_SHIP_QTY KT0010010-focus-move\" data-name=\"l_DESINATED_SHIP_QTY\" data-view=\"true\" style=\"text-align:right;\" maxlength=\"2147483647\" data-kind=\"").append("OBT_NUMBER_P;14.1;CEIL;4").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aKT0010010Struct.getl_DESINATED_SHIP_QTY())).append("\">'");
 KT0010010view1_DB.append(",").append("'<span id=\"expj-KT0010010-KT0010010view1-l_PKG_UNIT-").append(loopCount).append("\" class=\"expj-label expj-KT0010010-KT0010010view1-l_PKG_UNIT\" data-name=\"l_PKG_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKT0010010Struct.getl_PKG_UNIT())).append("</span>'");
 KT0010010view1_DB.append(",").append("'<span id=\"expj-KT0010010-KT0010010view1-l_DEPO_TYP-").append(loopCount).append("\" class=\"expj-label expj-KT0010010-KT0010010view1-l_DEPO_TYP\" data-name=\"l_DEPO_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKT0010010Struct.getl_DEPO_TYP())).append("</span>'");
 KT0010010view1_DB.append(",").append("'<span id=\"expj-KT0010010-KT0010010view1-l_PARTIAL_SHIP_INST_FLG-").append(loopCount).append("\" class=\"expj-label expj-KT0010010-KT0010010view1-l_PARTIAL_SHIP_INST_FLG\" data-name=\"l_PARTIAL_SHIP_INST_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aKT0010010Struct.getl_PARTIAL_SHIP_INST_FLG())).append("</span>'");
 KT0010010view1_DB.append(",").append("'<span id=\"expj-KT0010010-KT0010010view1-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KT0010010-KT0010010view1-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKT0010010Struct.getl_ITEM_NAME())).append("</span>'");
 KT0010010view1_DB.append(",").append("'<span id=\"expj-KT0010010-KT0010010view1-l_CUST_NAME-").append(loopCount).append("\" class=\"expj-label expj-KT0010010-KT0010010view1-l_CUST_NAME\" data-name=\"l_CUST_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKT0010010Struct.getl_CUST_NAME())).append("</span>'");
 KT0010010view1_DB.append(",").append("'<span id=\"expj-KT0010010-KT0010010view1-l_CUST_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KT0010010-KT0010010view1-l_CUST_ITEM_CD\" data-name=\"l_CUST_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKT0010010Struct.getl_CUST_ITEM_CD())).append("</span>'");
 KT0010010view1_DB.append(",").append("'<span id=\"expj-KT0010010-KT0010010view1-l_CUST_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KT0010010-KT0010010view1-l_CUST_ITEM_NAME\" data-name=\"l_CUST_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKT0010010Struct.getl_CUST_ITEM_NAME())).append("</span>'");
 KT0010010view1_DB.append(",").append("'<span id=\"expj-KT0010010-KT0010010view1-l_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-KT0010010-KT0010010view1-l_JOB_ODR_CD\" data-name=\"l_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKT0010010Struct.getl_JOB_ODR_CD())).append("</span>'");
 KT0010010view1_DB.append(",").append("'<span id=\"expj-KT0010010-KT0010010view1-l_REMARKS-").append(loopCount).append("\" class=\"expj-label expj-KT0010010-KT0010010view1-l_REMARKS\" data-name=\"l_REMARKS\" data-view=\"true\">").append(TypeConverter.sanitizer(aKT0010010Struct.getl_REMARKS())).append("</span>'");
 KT0010010view1_DB.append(",").append("'<span id=\"expj-KT0010010-KT0010010view1-PARTIAL_SHIP_INST_FLG-").append(loopCount).append("\" class=\"expj-label expj-KT0010010-KT0010010view1-PARTIAL_SHIP_INST_FLG\" data-name=\"PARTIAL_SHIP_INST_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aKT0010010Struct.getPARTIAL_SHIP_INST_FLG())).append("</span>'");
 KT0010010view1_DB.append(",").append("'<span id=\"expj-KT0010010-KT0010010view1-l_PART_DLV_SEQ_NO-").append(loopCount).append("\" class=\"expj-label expj-KT0010010-KT0010010view1-l_PART_DLV_SEQ_NO\" data-name=\"l_PART_DLV_SEQ_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKT0010010Struct.getl_PART_DLV_SEQ_NO())).append("</span>'");
 KT0010010view1_DB.append(",").append("'<span id=\"expj-KT0010010-KT0010010view1-l_bk_DESINATED_SHIP_QTY-").append(loopCount).append("\" class=\"expj-label expj-KT0010010-KT0010010view1-l_bk_DESINATED_SHIP_QTY\" data-name=\"l_bk_DESINATED_SHIP_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aKT0010010Struct.getl_bk_DESINATED_SHIP_QTY())).append("</span>'");
 KT0010010view1_DB.append(",").append("'<span id=\"expj-KT0010010-KT0010010view1-l_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-KT0010010-KT0010010view1-l_MODIFY_COUNT\" data-name=\"l_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKT0010010Struct.getl_MODIFY_COUNT())).append("</span>'");
 KT0010010view1_DB.append(",").append("'<span id=\"expj-KT0010010-KT0010010view1-l_UNIT_QTY_TYP-").append(loopCount).append("\" class=\"expj-label expj-KT0010010-KT0010010view1-l_UNIT_QTY_TYP\" data-name=\"l_UNIT_QTY_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKT0010010Struct.getl_UNIT_QTY_TYP())).append("</span>'");
 KT0010010view1_DB.append(",").append("'<span id=\"expj-KT0010010-KT0010010view1-l_SHIP_WH_CD-").append(loopCount).append("\" class=\"expj-label expj-KT0010010-KT0010010view1-l_SHIP_WH_CD\" data-name=\"l_SHIP_WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKT0010010Struct.getl_SHIP_WH_CD())).append("</span>'");
 KT0010010view1_DB.append(",").append("'<span id=\"expj-KT0010010-KT0010010view1-l_SHIP_PLANT_CD-").append(loopCount).append("\" class=\"expj-label expj-KT0010010-KT0010010view1-l_SHIP_PLANT_CD\" data-name=\"l_SHIP_PLANT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKT0010010Struct.getl_SHIP_PLANT_CD())).append("</span>'");
 KT0010010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aKT0010010StructLength) {
   KT0010010view1_DB.append(",");
  }
 }
 aKT0010010Struct = structBackup;
 viewIdList.add(KT0010010view1_Id);
 viewSelectList.add(KT0010010view1_select);
 viewResizeList.add(KT0010010view1_resize);
 viewScrollList.add(KT0010010view1_scroll);
 viewHeaderDataList.add(KT0010010view1_HB);
 viewBodyDataList.add(KT0010010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:630px;"><script class="expj-script-KT0010010-KT0010010button2">
expj.KT0010010.KT0010010button2 = {};
expj.KT0010010.KT0010010button2.executeAllOnDecision = function () {
  console.log('execute KT0010010button2.onDecision');
};
expj.KT0010010.KT0010010button2.executeOnLoad = function () {
  expj.KT0010010.KT0010010button2.executePScriptOnLoad();
};

expj.KT0010010.KT0010010button2.executePScriptOnLoad = function () {
  console.log('execute KT0010010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KT0010010-KT0010010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:630px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KT0010010-KT0010010button2-Insert">
expj.KT0010010.KT0010010button2.Insert = {};
// script1="onClick;0;SELCHKT;KT0010010view1:_l_DESINATED_SHIP_DATE[eq]@#KT00001"
expj.KT0010010.KT0010010button2.Insert.onClick0 = function () {
  console.log('Insert script1');
var selectCells = expj.common.pscript.getSelectedVIEWCells('KT0010010', 'KT0010010view1');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(cell.l_DESINATED_SHIP_DATE, '[eq]', '')) {
checkFlg = true;
break;
}
}
if (checkFlg) {
expj.common.pscript.addErrorMessage('KT0010010', 'KT0010010button2', 'KT00001');
}
};
// script2="onClick;1;SELCHKT;KT0010010view1:_PARTIAL_SHIP_INST_FLG[eq]0[and]_l_ODR_QTY[numneq]_l_DESINATED_SHIP_QTY@$KT00020"
expj.KT0010010.KT0010010button2.Insert.onClick1 = function () {
  console.log('Insert script2');
var selectCells = expj.common.pscript.getSelectedVIEWCells('KT0010010', 'KT0010010view1');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(cell.PARTIAL_SHIP_INST_FLG, '[eq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(cell.l_ODR_QTY), '[numneq]', expj.common.pscript.convertNumber(cell.l_DESINATED_SHIP_QTY))) {
checkFlg = true;
break;
}
}
if (checkFlg) {
expj.common.pscript.addWarningMessage('KT0010010', 'KT0010010button2', 'KT00020');
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KT0010010form1/*,_KT0010010view1/*@KT0010010Servlet,,$ZZ07001"
expj.KT0010010.KT0010010button2.Insert.onClick2 = function () {
  console.log('Insert script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KT0010010', 'KT0010010button2', '_KT0010010form1/*,_KT0010010view1/*', 'KT0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KT0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KT0010010', response);
expj.common.updateBusinessScreenTab('KT0010010', contents);
};
expj.common.pscript.callConfirm('KT0010010', 'KT0010010button2', 'ZZ07001', okEvent);
};
expj.KT0010010.KT0010010button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KT0010010.KT0010010button2.Insert['onClick' + i])) {
        expj.KT0010010.KT0010010button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.KT0010010.KT0010010button2.Insert.executeAllOnDecision = function () {
};
expj.KT0010010.KT0010010button2.Insert.executeOnLoad = function () {
  $('#expj-KT0010010-KT0010010button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KT0010010', 'KT0010010button2', 'Insert', this, 'Button');
    }
  });
  expj.KT0010010.KT0010010button2.Insert.executePScriptOnLoad();
};

expj.KT0010010.KT0010010button2.Insert.executePScriptOnLoad = function () {
  console.log('execute KT0010010button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-KT0010010-KT0010010button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KT0010010-KT0010010button2-Insert" name="Insert" class="KT0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsertAssort",rb)%></button><!-- 選択登録ボタン --></div><!--/td-->
<script class="expj-script-KT0010010-KT0010010button2-Update">
expj.KT0010010.KT0010010button2.Update = {};
// script1="onClick;0;SELCHKT;KT0010010view1:_l_DESINATED_SHIP_DATE[eq]@#KT00001"
expj.KT0010010.KT0010010button2.Update.onClick0 = function () {
  console.log('Update script1');
var selectCells = expj.common.pscript.getSelectedVIEWCells('KT0010010', 'KT0010010view1');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(cell.l_DESINATED_SHIP_DATE, '[eq]', '')) {
checkFlg = true;
break;
}
}
if (checkFlg) {
expj.common.pscript.addErrorMessage('KT0010010', 'KT0010010button2', 'KT00001');
}
};
// script2="onClick;1;SELCHKT;KT0010010view1:_PARTIAL_SHIP_INST_FLG[eq]0[and]_l_ODR_QTY[numneq]_l_DESINATED_SHIP_QTY@$KT00020"
expj.KT0010010.KT0010010button2.Update.onClick1 = function () {
  console.log('Update script2');
var selectCells = expj.common.pscript.getSelectedVIEWCells('KT0010010', 'KT0010010view1');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(cell.PARTIAL_SHIP_INST_FLG, '[eq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(cell.l_ODR_QTY), '[numneq]', expj.common.pscript.convertNumber(cell.l_DESINATED_SHIP_QTY))) {
checkFlg = true;
break;
}
}
if (checkFlg) {
expj.common.pscript.addWarningMessage('KT0010010', 'KT0010010button2', 'KT00020');
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KT0010010form1/*,_KT0010010view1/*@KT0010010Servlet,,$ZZ07003"
expj.KT0010010.KT0010010button2.Update.onClick2 = function () {
  console.log('Update script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KT0010010', 'KT0010010button2', '_KT0010010form1/*,_KT0010010view1/*', 'KT0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KT0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KT0010010', response);
expj.common.updateBusinessScreenTab('KT0010010', contents);
};
expj.common.pscript.callConfirm('KT0010010', 'KT0010010button2', 'ZZ07003', okEvent);
};
expj.KT0010010.KT0010010button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KT0010010.KT0010010button2.Update['onClick' + i])) {
        expj.KT0010010.KT0010010button2.Update['onClick' + i]();
      }
    }
  }
};
expj.KT0010010.KT0010010button2.Update.executeAllOnDecision = function () {
};
expj.KT0010010.KT0010010button2.Update.executeOnLoad = function () {
  $('#expj-KT0010010-KT0010010button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KT0010010', 'KT0010010button2', 'Update', this, 'Button');
    }
  });
  expj.KT0010010.KT0010010button2.Update.executePScriptOnLoad();
};

expj.KT0010010.KT0010010button2.Update.executePScriptOnLoad = function () {
  console.log('execute KT0010010button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-KT0010010-KT0010010button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KT0010010-KT0010010button2-Update" name="Update" class="KT0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdateAssort",rb)%></button><!-- 選択更新ボタン --></div><!--/td-->
<script class="expj-script-KT0010010-KT0010010button2-Delete">
expj.KT0010010.KT0010010button2.Delete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KT0010010form1/*,_KT0010010view1/*@KT0010010Servlet,,$ZZ07004"
expj.KT0010010.KT0010010button2.Delete.onClick0 = function () {
  console.log('Delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KT0010010', 'KT0010010button2', '_KT0010010form1/*,_KT0010010view1/*', 'KT0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KT0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KT0010010', response);
expj.common.updateBusinessScreenTab('KT0010010', contents);
};
expj.common.pscript.callConfirm('KT0010010', 'KT0010010button2', 'ZZ07004', okEvent);
};
expj.KT0010010.KT0010010button2.Delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KT0010010.KT0010010button2.Delete['onClick' + i])) {
        expj.KT0010010.KT0010010button2.Delete['onClick' + i]();
      }
    }
  }
};
expj.KT0010010.KT0010010button2.Delete.executeAllOnDecision = function () {
};
expj.KT0010010.KT0010010button2.Delete.executeOnLoad = function () {
  $('#expj-KT0010010-KT0010010button2-Delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KT0010010', 'KT0010010button2', 'Delete', this, 'Button');
    }
  });
  expj.KT0010010.KT0010010button2.Delete.executePScriptOnLoad();
};

expj.KT0010010.KT0010010button2.Delete.executePScriptOnLoad = function () {
  console.log('execute KT0010010button2/Delete.onLoad');
  var targetComponent = document.getElementById('expj-KT0010010-KT0010010button2-Delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KT0010010-KT0010010button2-Delete" name="Delete" class="KT0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDeleteAssort_1",rb)%></button><!-- 選択削除ボタン --></div><!--/td-->
<script class="expj-script-KT0010010-KT0010010button2-CheckAll">
expj.KT0010010.KT0010010button2.CheckAll = {};
// script1="onClick;0;DGSALL;KT0010010view1"
expj.KT0010010.KT0010010button2.CheckAll.onClick0 = function () {
  console.log('CheckAll script1');
expj.common.pscript.selectVIEWAllRow('KT0010010', 'KT0010010view1');
};
expj.KT0010010.KT0010010button2.CheckAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KT0010010.KT0010010button2.CheckAll['onClick' + i])) {
        expj.KT0010010.KT0010010button2.CheckAll['onClick' + i]();
      }
    }
  }
};
expj.KT0010010.KT0010010button2.CheckAll.executeAllOnDecision = function () {
};
expj.KT0010010.KT0010010button2.CheckAll.executeOnLoad = function () {
  $('#expj-KT0010010-KT0010010button2-CheckAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KT0010010', 'KT0010010button2', 'CheckAll', this, 'Button');
    }
  });
  expj.KT0010010.KT0010010button2.CheckAll.executePScriptOnLoad();
};

expj.KT0010010.KT0010010button2.CheckAll.executePScriptOnLoad = function () {
  console.log('execute KT0010010button2/CheckAll.onLoad');
  var targetComponent = document.getElementById('expj-KT0010010-KT0010010button2-CheckAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KT0010010-KT0010010button2-CheckAll" name="CheckAll" class="KT0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckAll",rb)%></button><!-- 全選択ボタン --></div><!--/td-->
<script class="expj-script-KT0010010-KT0010010button2-UncheckAll">
expj.KT0010010.KT0010010button2.UncheckAll = {};
// script1="onClick;0;DGSCANCEL;KT0010010view1"
expj.KT0010010.KT0010010button2.UncheckAll.onClick0 = function () {
  console.log('UncheckAll script1');
expj.common.pscript.unselectVIEWAllRow('KT0010010', 'KT0010010view1');
};
expj.KT0010010.KT0010010button2.UncheckAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KT0010010.KT0010010button2.UncheckAll['onClick' + i])) {
        expj.KT0010010.KT0010010button2.UncheckAll['onClick' + i]();
      }
    }
  }
};
expj.KT0010010.KT0010010button2.UncheckAll.executeAllOnDecision = function () {
};
expj.KT0010010.KT0010010button2.UncheckAll.executeOnLoad = function () {
  $('#expj-KT0010010-KT0010010button2-UncheckAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KT0010010', 'KT0010010button2', 'UncheckAll', this, 'Button');
    }
  });
  expj.KT0010010.KT0010010button2.UncheckAll.executePScriptOnLoad();
};

expj.KT0010010.KT0010010button2.UncheckAll.executePScriptOnLoad = function () {
  console.log('execute KT0010010button2/UncheckAll.onLoad');
  var targetComponent = document.getElementById('expj-KT0010010-KT0010010button2-UncheckAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KT0010010-KT0010010button2-UncheckAll" name="UncheckAll" class="KT0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckClear",rb)%></button><!-- 全解除ボタン --></div><!--/td-->
<script class="expj-script-KT0010010-KT0010010button2-LineCopy">
expj.KT0010010.KT0010010button2.LineCopy = {};
// script1="onClick;0;COLCHKT;KT0010010view1:_PARTIAL_SHIP_INST_FLG[eq]0@$KT00017"
expj.KT0010010.KT0010010button2.LineCopy.onClick0 = function () {
  console.log('LineCopy script1');
var selectCells = expj.common.pscript.getPreviewVIEWCells('KT0010010', 'KT0010010view1');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(cell.PARTIAL_SHIP_INST_FLG, '[eq]', '0')) {
checkFlg = true;
break;
}
}
if (checkFlg) {
expj.common.pscript.addWarningMessage('KT0010010', 'KT0010010button2', 'KT00017');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KT0010010form1/*,_KT0010010view1/*@KT0010010Servlet"
expj.KT0010010.KT0010010button2.LineCopy.onClick1 = function () {
  console.log('LineCopy script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KT0010010', 'KT0010010button2', '_KT0010010form1/*,_KT0010010view1/*', 'KT0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KT0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KT0010010', response);
expj.common.updateBusinessScreenTab('KT0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KT0010010.KT0010010button2.LineCopy.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KT0010010.KT0010010button2.LineCopy['onClick' + i])) {
        expj.KT0010010.KT0010010button2.LineCopy['onClick' + i]();
      }
    }
  }
};
expj.KT0010010.KT0010010button2.LineCopy.executeAllOnDecision = function () {
};
expj.KT0010010.KT0010010button2.LineCopy.executeOnLoad = function () {
  $('#expj-KT0010010-KT0010010button2-LineCopy').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KT0010010', 'KT0010010button2', 'LineCopy', this, 'Button');
    }
  });
  expj.KT0010010.KT0010010button2.LineCopy.executePScriptOnLoad();
};

expj.KT0010010.KT0010010button2.LineCopy.executePScriptOnLoad = function () {
  console.log('execute KT0010010button2/LineCopy.onLoad');
  var targetComponent = document.getElementById('expj-KT0010010-KT0010010button2-LineCopy');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KT0010010-KT0010010button2-LineCopy" name="LineCopy" class="KT0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnPartialLineCopy",rb)%></button><!-- 分納行複写ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 714px);"></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 200px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">KT0010010 Revision: 1.10  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KT0010010-KT0010010button0">
expj.KT0010010.KT0010010button0 = {};
expj.KT0010010.KT0010010button0.executeAllOnDecision = function () {
  console.log('execute KT0010010button0.onDecision');
};
expj.KT0010010.KT0010010button0.executeOnLoad = function () {
  expj.KT0010010.KT0010010button0.executePScriptOnLoad();
};

expj.KT0010010.KT0010010button0.executePScriptOnLoad = function () {
  console.log('execute KT0010010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KT0010010-KT0010010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KT0010010-KT0010010button0-Clear">
expj.KT0010010.KT0010010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KT0010010form1/*@KT0010010Servlet,,$ZZ07008"
expj.KT0010010.KT0010010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KT0010010', 'KT0010010button0', '_KT0010010form1/*', 'KT0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KT0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KT0010010', response);
expj.common.updateBusinessScreenTab('KT0010010', contents);
};
expj.common.pscript.callConfirm('KT0010010', 'KT0010010button0', 'ZZ07008', okEvent);
};
expj.KT0010010.KT0010010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KT0010010.KT0010010button0.Clear['onClick' + i])) {
        expj.KT0010010.KT0010010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KT0010010.KT0010010button0.Clear.executeAllOnDecision = function () {
};
expj.KT0010010.KT0010010button0.Clear.executeOnLoad = function () {
  $('#expj-KT0010010-KT0010010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KT0010010', 'KT0010010button0', 'Clear', this, 'Button');
    }
  });
  expj.KT0010010.KT0010010button0.Clear.executePScriptOnLoad();
};

expj.KT0010010.KT0010010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KT0010010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KT0010010-KT0010010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KT0010010-KT0010010button0-Clear" name="Clear" class="KT0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KT0010010-KT0010010button0-Close">
expj.KT0010010.KT0010010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KT0010010.KT0010010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KT0010010');
};
expj.KT0010010.KT0010010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KT0010010.KT0010010button0.Close['onClick' + i])) {
        expj.KT0010010.KT0010010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KT0010010.KT0010010button0.Close.executeAllOnDecision = function () {
};
expj.KT0010010.KT0010010button0.Close.executeOnLoad = function () {
  $('#expj-KT0010010-KT0010010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KT0010010', 'KT0010010button0', 'Close', this, 'Button');
    }
  });
  expj.KT0010010.KT0010010button0.Close.executePScriptOnLoad();
};

expj.KT0010010.KT0010010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KT0010010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KT0010010-KT0010010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KT0010010-KT0010010button0-Close" name="Close" class="KT0010010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KT0010010 (END)-->
<%
MessageStruct msgStruct = aKT0010010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KT0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KT0010010)) {
  expj.common.treeInstanceMap.KT0010010 = {};
}
expj.common.treeInstanceMap.KT0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KT0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KT0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KT0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KT0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KT0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KT0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KT0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KT0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KT0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KT0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KT0010010)) {
  expj.common.detailDialogMap.KT0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KT0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KT0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KT0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.KT0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KT0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KT0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KT0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KT0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KT0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KT0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KT0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KT0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KT0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KT0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KT0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KT0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KT0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KT0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KT0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KT0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KT0010010)) {
  expj.common.viewInstanceMap.KT0010010 = {};
}
expj.common.viewInstanceMap.KT0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.KT0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KT0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KT0010010.<%=viewId %>.init = function () {
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
    expj.KT0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KT0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KT0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KT0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KT0010010_init">
/**
 * KT0010010用のロード完了時初期化関数
 */
expj.KT0010010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KT0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KT0010010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KT0010010');
  expj.common.calendarInstanceMap.KT0010010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KT0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KT0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.KT0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KT0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KT0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KT0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KT0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KT0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KT0010010-<%=detailId %>');
<%
 }
%>
  try{expj.KT0010010.KT0010010form1.DESINATED_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010form1.DESINATED_DLV_DATE_CALENDAR.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010form1.r1_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010form1.h_SHIP_CMPLT_FLG.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010form1.ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010form1.PeekerCurCd.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010form1.r2_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010form1.CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010form1.PeekerCUST_CD.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010form1.PeekerITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010form1.CUST_CHRG_PSN_CD.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010form1.CUST_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010button1.Select.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010view1.l_DESINATED_SHIP_DATE.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010view1.l_DESINATED_SHIP_QTY.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010button2.Insert.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010button2.Update.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010button2.Delete.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010button2.CheckAll.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010button2.UncheckAll.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010button2.LineCopy.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010form1.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010button1.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010view1.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010button2.executeOnLoad();}catch(e){};
  try{expj.KT0010010.KT0010010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KT0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KT0010010', 'KT0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KT0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KT0010010-focus-move');
  // 初期フォーカス当てる処理
  $('.KT0010010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KT0010010', '<%=request.getContextPath() %>');
};

/**
 * KT0010010の全体onDecision処理
 */
expj.KT0010010.executeAllOnDecision = function () {
  expj.KT0010010.KT0010010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KT0010010_console">
expj.KT0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>