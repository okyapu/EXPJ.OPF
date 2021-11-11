<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:43:01 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AH0060\AH0060010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AH0060.*" %>
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
<jsp:useBean id="aAH0060010Control" class="com.nec.jp.orteus.metamorBase.AH0060.AH0060010Control" scope="request"/>
<jsp:useBean id="aAH0060010Struct" class="com.nec.jp.orteus.metamorBase.AH0060.AH0060010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

実棚一覧表出力
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0060/jsp/AH0060010.jsp,v $
$Author: geng-jia $	
$Revision: 1.13 $ $Date: 2017/02/22 02:06:08 $
********************************************************* --%>
<html>
<head>
<title>実棚一覧表出力</title>
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
<script class="expj-script-AH0060010_init">
  // AH0060010名前空間
  expj.AH0060010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AH0060010" data-screen="AH0060010" data-newdata="<%=aAH0060010Control.isNewData() %>">
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
              <script class="expj-script-AH0060010-AH0060010form1">
expj.AH0060010.AH0060010form1 = {};
// script1="onLoad;0;CALL;child@0,3,6,9"
expj.AH0060010.AH0060010form1.onLoad0 = function () {
  console.log('AH0060010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child3)){this.child3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child6)){this.child6();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child9)){this.child9();}
};
// script2="child;0;CHK;_AH0060010form1/h_sort_flg[eq]1@*1,*2"
expj.AH0060010.AH0060010form1.child0 = function () {
  console.log('AH0060010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/h_sort_flg'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;SET;_AH0060010form1/r1_sort2=true"
expj.AH0060010.AH0060010form1.child1 = function () {
  console.log('AH0060010form1 script3');
expj.common.pscript.setReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/r1_sort2', 'true');
};
// script4="child;2;SET;_AH0060010form1/r1_sort1=true"
expj.AH0060010.AH0060010form1.child2 = function () {
  console.log('AH0060010form1 script4');
expj.common.pscript.setReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/r1_sort1', 'true');
};
// script5="child;3;CHK;_AH0060010form1/h_JOB_ODR_CD_STOCK_flg[eq]1@*4,*5"
expj.AH0060010.AH0060010form1.child3 = function () {
  console.log('AH0060010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/h_JOB_ODR_CD_STOCK_flg'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;4;SET;_AH0060010form1/c_JOB_ODR_CD_STOCK_flg=true"
expj.AH0060010.AH0060010form1.child4 = function () {
  console.log('AH0060010form1 script6');
expj.common.pscript.setReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/c_JOB_ODR_CD_STOCK_flg', 'true');
};
// script7="child;5;SET;_AH0060010form1/c_JOB_ODR_CD_STOCK_flg=false"
expj.AH0060010.AH0060010form1.child5 = function () {
  console.log('AH0060010form1 script7');
expj.common.pscript.setReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/c_JOB_ODR_CD_STOCK_flg', 'false');
};
// script8="child;6;CHK;_AH0060010form1/h_JOB_ODR_CD_STOCK_flg[eq]1@*7,*8"
expj.AH0060010.AH0060010form1.child6 = function () {
  console.log('AH0060010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/h_JOB_ODR_CD_STOCK_flg'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script9="child;7;UNMASK;_AH0060010form1/w_JOB_ODR_CD,_AH0060010form1/Peekerw_JOB_ODR_CD"
expj.AH0060010.AH0060010form1.child7 = function () {
  console.log('AH0060010form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/w_JOB_ODR_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/Peekerw_JOB_ODR_CD');
};
// script10="child;8;MASK;_AH0060010form1/w_JOB_ODR_CD,_AH0060010form1/Peekerw_JOB_ODR_CD"
expj.AH0060010.AH0060010form1.child8 = function () {
  console.log('AH0060010form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/w_JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/Peekerw_JOB_ODR_CD');
};
// script11="child;9;CHK;?AH0060010form1/*[neq]NORMAL[and]?AH0060010form1/*[neq]TOO_MANY@*10"
expj.AH0060010.AH0060010form1.child9 = function () {
  console.log('AH0060010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '?AH0060010form1/*'), '[neq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '?AH0060010form1/*'), '[neq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script12="child;10;MASK;_AH0060010button0/Print,_AH0060010button0/csv_export"
expj.AH0060010.AH0060010form1.child10 = function () {
  console.log('AH0060010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010button0/Print');
expj.common.pscript.setMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010button0/csv_export');
};
// script13="onLoad;1;CALL;onDecision@0,1"
expj.AH0060010.AH0060010form1.onLoad1 = function () {
  console.log('AH0060010form1 script13');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script14="onDecision;0;CHKRQ;A@*11,*12"
expj.AH0060010.AH0060010form1.onDecision0 = function () {
  console.log('AH0060010form1 script14');
if (expj.common.pscript.satisfiedRequiredComponent('AH0060010', 'A')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script15="child;11;UNMASK;_AH0060010button1/select"
expj.AH0060010.AH0060010form1.child11 = function () {
  console.log('AH0060010form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010button1/select');
};
// script16="child;12;MASK;_AH0060010button1/select"
expj.AH0060010.AH0060010form1.child12 = function () {
  console.log('AH0060010form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010button1/select');
};
// script17="onDecision;1;CHKRQ;A@*13,*27"
expj.AH0060010.AH0060010form1.onDecision1 = function () {
  console.log('AH0060010form1 script17');
if (expj.common.pscript.satisfiedRequiredComponent('AH0060010', 'A')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
}
};
// script18="child;13;CHK;?AH0060010form1/*[eq]NORMAL[or]?AH0060010form1/*[eq]TOO_MANY@*14,*27"
expj.AH0060010.AH0060010form1.child13 = function () {
  console.log('AH0060010form1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '?AH0060010form1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '?AH0060010form1/*'), '[eq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
}
};
// script19="child;14;CHK;?AH0060010form1/INV_DATE[eq]SAME@*15,*27"
expj.AH0060010.AH0060010form1.child14 = function () {
  console.log('AH0060010form1 script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '?AH0060010form1/INV_DATE'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
}
};
// script20="child;15;CHK;?AH0060010form1/w_WH_CD[eq]SAME@*16,*27"
expj.AH0060010.AH0060010form1.child15 = function () {
  console.log('AH0060010form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '?AH0060010form1/w_WH_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
} else {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
}
};
// script21="child;16;CHK;?AH0060010form1/w_ITEM_CD[eq]SAME@*17,*27"
expj.AH0060010.AH0060010form1.child16 = function () {
  console.log('AH0060010form1 script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '?AH0060010form1/w_ITEM_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
} else {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
}
};
// script22="child;17;CHK;?AH0060010form1/w_difference_rate[eq]SAME@*18,*27"
expj.AH0060010.AH0060010form1.child17 = function () {
  console.log('AH0060010form1 script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '?AH0060010form1/w_difference_rate'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
} else {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
}
};
// script23="child;18;CHK;?AH0060010form1/s_ABC_TYP[eq]SAME@*19,*27"
expj.AH0060010.AH0060010form1.child18 = function () {
  console.log('AH0060010form1 script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '?AH0060010form1/s_ABC_TYP'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
} else {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
}
};
// script24="child;19;CHK;?AH0060010form1/r2_whlot1[eq]SAME@*20,*27"
expj.AH0060010.AH0060010form1.child19 = function () {
  console.log('AH0060010form1 script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '?AH0060010form1/r2_whlot1'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
} else {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
}
};
// script25="child;20;CHK;?AH0060010form1/r2_whlot2[eq]SAME@*21,*27"
expj.AH0060010.AH0060010form1.child20 = function () {
  console.log('AH0060010form1 script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '?AH0060010form1/r2_whlot2'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
} else {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
}
};
// script26="child;21;CHK;?AH0060010form1/c_JOB_ODR_CD_STOCK_flg[eq]SAME@*22,*27"
expj.AH0060010.AH0060010form1.child21 = function () {
  console.log('AH0060010form1 script26');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '?AH0060010form1/c_JOB_ODR_CD_STOCK_flg'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
} else {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
}
};
// script27="child;22;CHK;_AH0060010form1/c_JOB_ODR_CD_STOCK_flg[eq]true@*23,*24"
expj.AH0060010.AH0060010form1.child22 = function () {
  console.log('AH0060010form1 script27');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/c_JOB_ODR_CD_STOCK_flg'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
} else {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
}
};
// script28="child;23;CHK;?AH0060010form1/w_JOB_ODR_CD[eq]SAME@*24,*27"
expj.AH0060010.AH0060010form1.child23 = function () {
  console.log('AH0060010form1 script28');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '?AH0060010form1/w_JOB_ODR_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
} else {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
}
};
// script29="child;24;CHK;?AH0060010form1/w_STOCK_LOT_CD[eq]SAME@*25,*27"
expj.AH0060010.AH0060010form1.child24 = function () {
  console.log('AH0060010form1 script29');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '?AH0060010form1/w_STOCK_LOT_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child25)){this.child25();}
} else {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
}
};
// script30="child;25;CHK;_AH0060010form1/r1_sort1[eq]true[and]_AH0060010form1/h_save_sort_flg[neq]0@*27,*26"
expj.AH0060010.AH0060010form1.child25 = function () {
  console.log('AH0060010form1 script30');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/r1_sort1'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/h_save_sort_flg'), '[neq]', '0')) {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
} else {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
}
};
// script31="child;26;CHK;_AH0060010form1/r1_sort2[eq]true[and]_AH0060010form1/h_save_sort_flg[neq]1@*27,*28"
expj.AH0060010.AH0060010form1.child26 = function () {
  console.log('AH0060010form1 script31');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/r1_sort2'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/h_save_sort_flg'), '[neq]', '1')) {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
} else {
if(expj.common.checkNameSpace(this.child28)){this.child28();}
}
};
// script32="child;27;MASK;_AH0060010button0/Print,_AH0060010button0/csv_export"
expj.AH0060010.AH0060010form1.child27 = function () {
  console.log('AH0060010form1 script32');
expj.common.pscript.setMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010button0/Print');
expj.common.pscript.setMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010button0/csv_export');
};
// script33="child;28;UNMASK;_AH0060010button0/Print,_AH0060010button0/csv_export"
expj.AH0060010.AH0060010form1.child28 = function () {
  console.log('AH0060010form1 script33');
expj.common.pscript.setUnMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010button0/Print');
expj.common.pscript.setUnMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010button0/csv_export');
};
// script34="onLoad;2;CALL;child@29"
expj.AH0060010.AH0060010form1.onLoad2 = function () {
  console.log('AH0060010form1 script34');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child29)){this.child29();}
};
// script35="child;29;CHK;?AH0060010form1/*[eq]INITIAL@*31,*30"
expj.AH0060010.AH0060010form1.child29 = function () {
  console.log('AH0060010form1 script35');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '?AH0060010form1/*'), '[eq]', 'INITIAL')) {
if(expj.common.checkNameSpace(this.child31)){this.child31();}
} else {
if(expj.common.checkNameSpace(this.child30)){this.child30();}
}
};
// script36="child;30;CHK;_AH0060010form1/r2_whlot1[eq]true@*31"
expj.AH0060010.AH0060010form1.child30 = function () {
  console.log('AH0060010form1 script36');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/r2_whlot1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child31)){this.child31();}
}
};
// script37="child;31;MASK;_AH0060010form1/w_STOCK_LOT_CD,_AH0060010form1/Peekerw_STOCK_LOT_CD@*32"
expj.AH0060010.AH0060010form1.child31 = function () {
  console.log('AH0060010form1 script37');
expj.common.pscript.setMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/w_STOCK_LOT_CD');
expj.common.pscript.setMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/Peekerw_STOCK_LOT_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child32)){this.child32();}}
};
// script38="child;32;SET;_AH0060010form1/r2_whlot1=true,_AH0060010form1/w_STOCK_LOT_CD="
expj.AH0060010.AH0060010form1.child32 = function () {
  console.log('AH0060010form1 script38');
expj.common.pscript.setReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/r2_whlot1', 'true');
expj.common.pscript.setReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/w_STOCK_LOT_CD', '');
};
// script39="onLoad;3;CALL;child@33"
expj.AH0060010.AH0060010form1.onLoad3 = function () {
  console.log('AH0060010form1 script39');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child33)){this.child33();}
};
// script40="child;33;CHK;_AH0060010form1/h_lotCtrl[eq]true[and]_AH0060010form1/c_JOB_ODR_CD_STOCK_flg[neq]true@*34,*35"
expj.AH0060010.AH0060010form1.child33 = function () {
  console.log('AH0060010form1 script40');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/h_lotCtrl'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/c_JOB_ODR_CD_STOCK_flg'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child34)){this.child34();}
} else {
if(expj.common.checkNameSpace(this.child35)){this.child35();}
}
};
// script41="child;34;UNMASK;_AH0060010form1/r2_whlot2"
expj.AH0060010.AH0060010form1.child34 = function () {
  console.log('AH0060010form1 script41');
expj.common.pscript.setUnMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/r2_whlot2');
};
// script42="child;35;MASK;_AH0060010form1/r2_whlot2"
expj.AH0060010.AH0060010form1.child35 = function () {
  console.log('AH0060010form1 script42');
expj.common.pscript.setMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/r2_whlot2');
};
expj.AH0060010.AH0060010form1.executeAllOnDecision = function () {
  console.log('execute AH0060010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0060010.AH0060010form1['onDecision' + i])) {
        expj.AH0060010.AH0060010form1['onDecision' + i]();
      }
    }
  }
};
expj.AH0060010.AH0060010form1.executeOnLoad = function () {
  expj.AH0060010.AH0060010form1.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 3; i++) {
    if (expj.common.checkNameSpace(expj.AH0060010.AH0060010form1['onLoad' + i])) {
      expj.AH0060010.AH0060010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AH0060010-AH0060010form1" action="AH0060010Servlet" name="AH0060010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAH0060010Control.getReadStatusString()) %>" style="height:165px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:165px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:110px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.INV_DATE",rb)%></span><!-- 棚卸日 --></div><!--/td-->
<script class="expj-script-AH0060010-AH0060010form1-INV_DATE">
expj.AH0060010.AH0060010form1.INV_DATE = {};
expj.AH0060010.AH0060010form1.INV_DATE.executeAllOnDecision = function () {
  console.log('execute AH0060010form1/INV_DATE.onDecision');
  expj.AH0060010.AH0060010form1.executeAllOnDecision();
  expj.AH0060010.executeAllOnDecision();
};
expj.AH0060010.AH0060010form1.INV_DATE.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010form1-INV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0060010', 'AH0060010form1', 'INV_DATE', this);
  });
  expj.AH0060010.AH0060010form1.INV_DATE.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.INV_DATE.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1/INV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010form1-INV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AH0060010-AH0060010form1-INV_DATE" name="INV_DATE" class="AH0060010-focus-move  required-value expj-AH0060010-required-A" style="width:100%;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAH0060010Struct.getINV_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AH0060010-AH0060010form1-CalendarINV_DATE">
expj.AH0060010.AH0060010form1.CalendarINV_DATE = {};
// script1="onClick;0;CALENDAR;_AH0060010form1/INV_DATE"
expj.AH0060010.AH0060010form1.CalendarINV_DATE.onClick0 = function () {
  console.log('CalendarINV_DATE script1');
expj.common.pscript.executeCalendar('AH0060010','AH0060010form1','_AH0060010form1/INV_DATE');
};
expj.AH0060010.AH0060010form1.CalendarINV_DATE.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0060010.AH0060010form1.CalendarINV_DATE['onClick' + i])) {
        expj.AH0060010.AH0060010form1.CalendarINV_DATE['onClick' + i]();
      }
    }
  }
};
expj.AH0060010.AH0060010form1.CalendarINV_DATE.executeAllOnDecision = function () {
};
expj.AH0060010.AH0060010form1.CalendarINV_DATE.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010form1-CalendarINV_DATE').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0060010', 'AH0060010form1', 'CalendarINV_DATE', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AH0060010','AH0060010form1','_AH0060010form1/INV_DATE');
  expj.AH0060010.AH0060010form1.CalendarINV_DATE.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.CalendarINV_DATE.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1/CalendarINV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010form1-CalendarINV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AH0060010-AH0060010form1-CalendarINV_DATE" class="AH0060010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AH0060010-AH0060010form1-w_INV_status">
expj.AH0060010.AH0060010form1.w_INV_status = {};
expj.AH0060010.AH0060010form1.w_INV_status.executeAllOnDecision = function () {
  console.log('execute AH0060010form1/w_INV_status.onDecision');
  expj.AH0060010.AH0060010form1.executeAllOnDecision();
  expj.AH0060010.executeAllOnDecision();
};
expj.AH0060010.AH0060010form1.w_INV_status.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010form1-w_INV_status').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0060010', 'AH0060010form1', 'w_INV_status', this);
  });
  expj.AH0060010.AH0060010form1.w_INV_status.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.w_INV_status.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1/w_INV_status.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010form1-w_INV_status');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:430px;text-align:left;"><input type="text" id="expj-AH0060010-AH0060010form1-w_INV_status" name="w_INV_status" class="AH0060010-focus-move  " style="width:360px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0060010Struct.getw_INV_status()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AH0060010-AH0060010form1-h_JOB_ODR_CD_STOCK_flg" name="h_JOB_ODR_CD_STOCK_flg" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0060010Struct.geth_JOB_ODR_CD_STOCK_flg()) %>">
<script class="expj-script-AH0060010-AH0060010form1-h_JOB_ODR_CD_STOCK_flg">
expj.AH0060010.AH0060010form1.h_JOB_ODR_CD_STOCK_flg = {};
expj.AH0060010.AH0060010form1.h_JOB_ODR_CD_STOCK_flg.executeAllOnDecision = function () {
  console.log('execute AH0060010form1/h_JOB_ODR_CD_STOCK_flg.onDecision');
  expj.AH0060010.AH0060010form1.executeAllOnDecision();
  expj.AH0060010.executeAllOnDecision();
};
expj.AH0060010.AH0060010form1.h_JOB_ODR_CD_STOCK_flg.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010form1-h_JOB_ODR_CD_STOCK_flg').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0060010', 'AH0060010form1', 'h_JOB_ODR_CD_STOCK_flg', this);
  });
  expj.AH0060010.AH0060010form1.h_JOB_ODR_CD_STOCK_flg.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.h_JOB_ODR_CD_STOCK_flg.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1/h_JOB_ODR_CD_STOCK_flg.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010form1-h_JOB_ODR_CD_STOCK_flg');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AH0060010-AH0060010form1-h_sort_flg" name="h_sort_flg" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0060010Struct.geth_sort_flg()) %>">
<script class="expj-script-AH0060010-AH0060010form1-h_sort_flg">
expj.AH0060010.AH0060010form1.h_sort_flg = {};
expj.AH0060010.AH0060010form1.h_sort_flg.executeAllOnDecision = function () {
  console.log('execute AH0060010form1/h_sort_flg.onDecision');
  expj.AH0060010.AH0060010form1.executeAllOnDecision();
  expj.AH0060010.executeAllOnDecision();
};
expj.AH0060010.AH0060010form1.h_sort_flg.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010form1-h_sort_flg').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0060010', 'AH0060010form1', 'h_sort_flg', this);
  });
  expj.AH0060010.AH0060010form1.h_sort_flg.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.h_sort_flg.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1/h_sort_flg.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010form1-h_sort_flg');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AH0060010-AH0060010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0060010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AH0060010-AH0060010form1-DOWNLOAD_FILE">
expj.AH0060010.AH0060010form1.DOWNLOAD_FILE = {};
expj.AH0060010.AH0060010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AH0060010form1/DOWNLOAD_FILE.onDecision');
  expj.AH0060010.AH0060010form1.executeAllOnDecision();
  expj.AH0060010.executeAllOnDecision();
};
expj.AH0060010.AH0060010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0060010', 'AH0060010form1', 'DOWNLOAD_FILE', this);
  });
  expj.AH0060010.AH0060010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WH_CD",rb)%></span><!-- 保管区コード --></div><!--/td-->
<script class="expj-script-AH0060010-AH0060010form1-w_WH_CD">
expj.AH0060010.AH0060010form1.w_WH_CD = {};
expj.AH0060010.AH0060010form1.w_WH_CD.executeAllOnDecision = function () {
  console.log('execute AH0060010form1/w_WH_CD.onDecision');
  expj.AH0060010.AH0060010form1.executeAllOnDecision();
  expj.AH0060010.executeAllOnDecision();
};
expj.AH0060010.AH0060010form1.w_WH_CD.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010form1-w_WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0060010', 'AH0060010form1', 'w_WH_CD', this);
  });
  expj.AH0060010.AH0060010form1.w_WH_CD.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.w_WH_CD.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1/w_WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010form1-w_WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AH0060010-AH0060010form1-w_WH_CD" name="w_WH_CD" class="AH0060010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAH0060010Struct.getw_WH_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AH0060010-AH0060010form1-h_lotCtrl" name="h_lotCtrl" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0060010Struct.geth_lotCtrl()) %>">
<script class="expj-script-AH0060010-AH0060010form1-h_lotCtrl">
expj.AH0060010.AH0060010form1.h_lotCtrl = {};
expj.AH0060010.AH0060010form1.h_lotCtrl.executeAllOnDecision = function () {
  console.log('execute AH0060010form1/h_lotCtrl.onDecision');
  expj.AH0060010.AH0060010form1.executeAllOnDecision();
  expj.AH0060010.executeAllOnDecision();
};
expj.AH0060010.AH0060010form1.h_lotCtrl.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010form1-h_lotCtrl').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0060010', 'AH0060010form1', 'h_lotCtrl', this);
  });
  expj.AH0060010.AH0060010form1.h_lotCtrl.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.h_lotCtrl.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1/h_lotCtrl.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010form1-h_lotCtrl');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AH0060010-AH0060010form1-Peekerw_WH_CD">
expj.AH0060010.AH0060010form1.Peekerw_WH_CD = {};
// script1="onClick;0;PEEKER;_AH0060010form1/w_WH_CD@<%=contextNo%>"
expj.AH0060010.AH0060010form1.Peekerw_WH_CD.onClick0 = function () {
  console.log('Peekerw_WH_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AH0060010';
var parameterValues = 'Peekerw_WH_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/w_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AH0060010form1/w_WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AH0060010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AH0060010.AH0060010form1.Peekerw_WH_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0060010.AH0060010form1.Peekerw_WH_CD['onClick' + i])) {
        expj.AH0060010.AH0060010form1.Peekerw_WH_CD['onClick' + i]();
      }
    }
  }
};
expj.AH0060010.AH0060010form1.Peekerw_WH_CD.executeAllOnDecision = function () {
};
expj.AH0060010.AH0060010form1.Peekerw_WH_CD.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010form1-Peekerw_WH_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0060010', 'AH0060010form1', 'Peekerw_WH_CD', this, 'Button');
    }
  });
  expj.AH0060010.AH0060010form1.Peekerw_WH_CD.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.Peekerw_WH_CD.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1/Peekerw_WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010form1-Peekerw_WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AH0060010-AH0060010form1-Peekerw_WH_CD" class="AH0060010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- (ワイルドカード指定可) --></div><!--/td-->
<script class="expj-script-AH0060010-AH0060010form1-r1_sort1">
expj.AH0060010.AH0060010form1.r1_sort1 = {};
expj.AH0060010.AH0060010form1.r1_sort1.executeAllOnDecision = function () {
  console.log('execute AH0060010form1/r1_sort1.onDecision');
  expj.AH0060010.AH0060010form1.executeAllOnDecision();
  expj.AH0060010.executeAllOnDecision();
};
expj.AH0060010.AH0060010form1.r1_sort1.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010form1-r1_sort1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0060010', 'AH0060010form1', 'r1_sort1', this, 'RadioButton');
    }
  });
  expj.AH0060010.AH0060010form1.r1_sort1.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.r1_sort1.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1/r1_sort1.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010form1-r1_sort1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="sort" data-name="r1_sort1" value="true" <%= ("true".equals(TypeConverter.convert(aAH0060010Struct.getr1_sort1())))?"checked=\"checked\"":"" %> class="" id="expj-AH0060010-AH0060010form1-r1_sort1" ><label for="expj-AH0060010-AH0060010form1-r1_sort1"><%=CoreTools.getRBString("Expj.Cmt0054",rb)%></label></div><!--/td-->
<div class="div-td" style="width:110px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AH0060010-AH0060010form1-w_ITEM_CD">
expj.AH0060010.AH0060010form1.w_ITEM_CD = {};
expj.AH0060010.AH0060010form1.w_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AH0060010form1/w_ITEM_CD.onDecision');
  expj.AH0060010.AH0060010form1.executeAllOnDecision();
  expj.AH0060010.executeAllOnDecision();
};
expj.AH0060010.AH0060010form1.w_ITEM_CD.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010form1-w_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0060010', 'AH0060010form1', 'w_ITEM_CD', this);
  });
  expj.AH0060010.AH0060010form1.w_ITEM_CD.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.w_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1/w_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010form1-w_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AH0060010-AH0060010form1-w_ITEM_CD" name="w_ITEM_CD" class="AH0060010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAH0060010Struct.getw_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AH0060010-AH0060010form1-h_save_sort_flg" name="h_save_sort_flg" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0060010Struct.geth_save_sort_flg()) %>">
<script class="expj-script-AH0060010-AH0060010form1-h_save_sort_flg">
expj.AH0060010.AH0060010form1.h_save_sort_flg = {};
expj.AH0060010.AH0060010form1.h_save_sort_flg.executeAllOnDecision = function () {
  console.log('execute AH0060010form1/h_save_sort_flg.onDecision');
  expj.AH0060010.AH0060010form1.executeAllOnDecision();
  expj.AH0060010.executeAllOnDecision();
};
expj.AH0060010.AH0060010form1.h_save_sort_flg.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010form1-h_save_sort_flg').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0060010', 'AH0060010form1', 'h_save_sort_flg', this);
  });
  expj.AH0060010.AH0060010form1.h_save_sort_flg.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.h_save_sort_flg.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1/h_save_sort_flg.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010form1-h_save_sort_flg');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AH0060010-AH0060010form1-Peekerw_ITEM_CD">
expj.AH0060010.AH0060010form1.Peekerw_ITEM_CD = {};
// script1="onClick;0;PEEKER;_AH0060010form1/w_ITEM_CD@<%=contextNo%>"
expj.AH0060010.AH0060010form1.Peekerw_ITEM_CD.onClick0 = function () {
  console.log('Peekerw_ITEM_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AH0060010';
var parameterValues = 'Peekerw_ITEM_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/w_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AH0060010form1/w_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AH0060010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AH0060010.AH0060010form1.Peekerw_ITEM_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0060010.AH0060010form1.Peekerw_ITEM_CD['onClick' + i])) {
        expj.AH0060010.AH0060010form1.Peekerw_ITEM_CD['onClick' + i]();
      }
    }
  }
};
expj.AH0060010.AH0060010form1.Peekerw_ITEM_CD.executeAllOnDecision = function () {
};
expj.AH0060010.AH0060010form1.Peekerw_ITEM_CD.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010form1-Peekerw_ITEM_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0060010', 'AH0060010form1', 'Peekerw_ITEM_CD', this, 'Button');
    }
  });
  expj.AH0060010.AH0060010form1.Peekerw_ITEM_CD.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.Peekerw_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1/Peekerw_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010form1-Peekerw_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AH0060010-AH0060010form1-Peekerw_ITEM_CD" class="AH0060010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- (ワイルドカード指定可) --></div><!--/td-->
<script class="expj-script-AH0060010-AH0060010form1-r1_sort2">
expj.AH0060010.AH0060010form1.r1_sort2 = {};
expj.AH0060010.AH0060010form1.r1_sort2.executeAllOnDecision = function () {
  console.log('execute AH0060010form1/r1_sort2.onDecision');
  expj.AH0060010.AH0060010form1.executeAllOnDecision();
  expj.AH0060010.executeAllOnDecision();
};
expj.AH0060010.AH0060010form1.r1_sort2.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010form1-r1_sort2').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0060010', 'AH0060010form1', 'r1_sort2', this, 'RadioButton');
    }
  });
  expj.AH0060010.AH0060010form1.r1_sort2.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.r1_sort2.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1/r1_sort2.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010form1-r1_sort2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="sort" data-name="r1_sort2" value="true" <%= ("true".equals(TypeConverter.convert(aAH0060010Struct.getr1_sort2())))?"checked=\"checked\"":"" %> class="" id="expj-AH0060010-AH0060010form1-r1_sort2" ><label for="expj-AH0060010-AH0060010form1-r1_sort2"><%=CoreTools.getRBString("Expj.Cmt0055",rb)%></label></div><!--/td-->
<div class="div-td" style="width:110px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AH0060010-AH0060010form1-w_JOB_ODR_CD">
expj.AH0060010.AH0060010form1.w_JOB_ODR_CD = {};
expj.AH0060010.AH0060010form1.w_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AH0060010form1/w_JOB_ODR_CD.onDecision');
  expj.AH0060010.AH0060010form1.executeAllOnDecision();
  expj.AH0060010.executeAllOnDecision();
};
expj.AH0060010.AH0060010form1.w_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010form1-w_JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0060010', 'AH0060010form1', 'w_JOB_ODR_CD', this);
  });
  expj.AH0060010.AH0060010form1.w_JOB_ODR_CD.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.w_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1/w_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010form1-w_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AH0060010-AH0060010form1-w_JOB_ODR_CD" name="w_JOB_ODR_CD" class="AH0060010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAH0060010Struct.getw_JOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AH0060010-AH0060010form1-Peekerw_JOB_ODR_CD">
expj.AH0060010.AH0060010form1.Peekerw_JOB_ODR_CD = {};
// script1="onClick;0;PEEKER;_AH0060010form1/w_JOB_ODR_CD@<%=contextNo%>"
expj.AH0060010.AH0060010form1.Peekerw_JOB_ODR_CD.onClick0 = function () {
  console.log('Peekerw_JOB_ODR_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AH0060010';
var parameterValues = 'Peekerw_JOB_ODR_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/w_JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_4%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/w_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_04%&%';
parameterValues += 'TARGET_FIELD%=%_AH0060010form1/w_JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AH0060010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AH0060010.AH0060010form1.Peekerw_JOB_ODR_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0060010.AH0060010form1.Peekerw_JOB_ODR_CD['onClick' + i])) {
        expj.AH0060010.AH0060010form1.Peekerw_JOB_ODR_CD['onClick' + i]();
      }
    }
  }
};
expj.AH0060010.AH0060010form1.Peekerw_JOB_ODR_CD.executeAllOnDecision = function () {
};
expj.AH0060010.AH0060010form1.Peekerw_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010form1-Peekerw_JOB_ODR_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0060010', 'AH0060010form1', 'Peekerw_JOB_ODR_CD', this, 'Button');
    }
  });
  expj.AH0060010.AH0060010form1.Peekerw_JOB_ODR_CD.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.Peekerw_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1/Peekerw_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010form1-Peekerw_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AH0060010-AH0060010form1-Peekerw_JOB_ODR_CD" class="AH0060010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- (ワイルドカード指定可) --></div><!--/td-->
<script class="expj-script-AH0060010-AH0060010form1-c_JOB_ODR_CD_STOCK_flg">
expj.AH0060010.AH0060010form1.c_JOB_ODR_CD_STOCK_flg = {};
// script1="onClick;0;CHK;_THIS[eq]true@*0,*1"
expj.AH0060010.AH0060010form1.c_JOB_ODR_CD_STOCK_flg.onClick0 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;UNMASK;_AH0060010form1/w_JOB_ODR_CD,_AH0060010form1/Peekerw_JOB_ODR_CD@*3"
expj.AH0060010.AH0060010form1.c_JOB_ODR_CD_STOCK_flg.child0 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script2');
expj.common.pscript.setUnMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/w_JOB_ODR_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/Peekerw_JOB_ODR_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script3="child;1;SET;_AH0060010form1/w_JOB_ODR_CD=@*2"
expj.AH0060010.AH0060010form1.c_JOB_ODR_CD_STOCK_flg.child1 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script3');
expj.common.pscript.setReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/w_JOB_ODR_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script4="child;2;MASK;_AH0060010form1/w_JOB_ODR_CD,_AH0060010form1/Peekerw_JOB_ODR_CD@*4"
expj.AH0060010.AH0060010form1.c_JOB_ODR_CD_STOCK_flg.child2 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script4');
expj.common.pscript.setMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/w_JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/Peekerw_JOB_ODR_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script5="child;3;SET;_AH0060010form1/r2_whlot1=true@*8"
expj.AH0060010.AH0060010form1.c_JOB_ODR_CD_STOCK_flg.child3 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script5');
expj.common.pscript.setReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/r2_whlot1', 'true');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
// script6="child;4;UNMASK;_AH0060010form1/r2_whlot1@*5"
expj.AH0060010.AH0060010form1.c_JOB_ODR_CD_STOCK_flg.child4 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script6');
expj.common.pscript.setUnMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/r2_whlot1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script7="child;5;CHK;_AH0060010form1/h_lotCtrl[eq]true@*6,*7"
expj.AH0060010.AH0060010form1.c_JOB_ODR_CD_STOCK_flg.child5 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/h_lotCtrl'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script8="child;6;UNMASK;_AH0060010form1/r2_whlot2@*10"
expj.AH0060010.AH0060010form1.c_JOB_ODR_CD_STOCK_flg.child6 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script8');
expj.common.pscript.setUnMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/r2_whlot2');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child10)){this.child10();}}
};
// script9="child;7;MASK;_AH0060010form1/r2_whlot2"
expj.AH0060010.AH0060010form1.c_JOB_ODR_CD_STOCK_flg.child7 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script9');
expj.common.pscript.setMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/r2_whlot2');
};
// script10="child;8;MASK;_AH0060010form1/r2_whlot1,_AH0060010form1/r2_whlot2,_AH0060010form1/w_STOCK_LOT_CD,_AH0060010form1/Peekerw_STOCK_LOT_CD@*9"
expj.AH0060010.AH0060010form1.c_JOB_ODR_CD_STOCK_flg.child8 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script10');
expj.common.pscript.setMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/r2_whlot1');
expj.common.pscript.setMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/r2_whlot2');
expj.common.pscript.setMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/w_STOCK_LOT_CD');
expj.common.pscript.setMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/Peekerw_STOCK_LOT_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script11="child;9;SET;_AH0060010form1/w_STOCK_LOT_CD="
expj.AH0060010.AH0060010form1.c_JOB_ODR_CD_STOCK_flg.child9 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script11');
expj.common.pscript.setReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/w_STOCK_LOT_CD', '');
};
// script12="child;10;CHK;_AH0060010form1/r2_whlot1[eq]true@*11,*12"
expj.AH0060010.AH0060010form1.c_JOB_ODR_CD_STOCK_flg.child10 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/r2_whlot1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script13="child;11;MASK;_AH0060010form1/w_STOCK_LOT_CD,_AH0060010form1/Peekerw_STOCK_LOT_CD"
expj.AH0060010.AH0060010form1.c_JOB_ODR_CD_STOCK_flg.child11 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script13');
expj.common.pscript.setMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/w_STOCK_LOT_CD');
expj.common.pscript.setMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/Peekerw_STOCK_LOT_CD');
};
// script14="child;12;UNMASK;_AH0060010form1/w_STOCK_LOT_CD,_AH0060010form1/Peekerw_STOCK_LOT_CD"
expj.AH0060010.AH0060010form1.c_JOB_ODR_CD_STOCK_flg.child12 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script14');
expj.common.pscript.setUnMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/w_STOCK_LOT_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/Peekerw_STOCK_LOT_CD');
};
expj.AH0060010.AH0060010form1.c_JOB_ODR_CD_STOCK_flg.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0060010.AH0060010form1.c_JOB_ODR_CD_STOCK_flg['onClick' + i])) {
        expj.AH0060010.AH0060010form1.c_JOB_ODR_CD_STOCK_flg['onClick' + i]();
      }
    }
  }
};
expj.AH0060010.AH0060010form1.c_JOB_ODR_CD_STOCK_flg.executeAllOnDecision = function () {
  console.log('execute AH0060010form1/c_JOB_ODR_CD_STOCK_flg.onDecision');
  expj.AH0060010.AH0060010form1.executeAllOnDecision();
  expj.AH0060010.executeAllOnDecision();
};
expj.AH0060010.AH0060010form1.c_JOB_ODR_CD_STOCK_flg.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010form1-c_JOB_ODR_CD_STOCK_flg').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0060010', 'AH0060010form1', 'c_JOB_ODR_CD_STOCK_flg', this, 'CheckBox');
    }
  });
  expj.AH0060010.AH0060010form1.c_JOB_ODR_CD_STOCK_flg.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.c_JOB_ODR_CD_STOCK_flg.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1/c_JOB_ODR_CD_STOCK_flg.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010form1-c_JOB_ODR_CD_STOCK_flg');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_JOB_ODR_CD_STOCK_flg" value="true" <%= ("true".equals(TypeConverter.convert(aAH0060010Struct.getc_JOB_ODR_CD_STOCK_flg())) || "1".equals(TypeConverter.convert(aAH0060010Struct.getc_JOB_ODR_CD_STOCK_flg())))?"checked=\"checked\"":"" %>  class="AH0060010-focus-move" id="expj-AH0060010-AH0060010form1-c_JOB_ODR_CD_STOCK_flg"><label for="expj-AH0060010-AH0060010form1-c_JOB_ODR_CD_STOCK_flg"><%=CoreTools.getRBString("Expj.Cmt0208",rb)%></label></div><!--/td-->
<div class="div-td" style="width:110px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_LOT_CD",rb)%></span><!-- 在庫ロット番号 --></div><!--/td-->
<script class="expj-script-AH0060010-AH0060010form1-w_STOCK_LOT_CD">
expj.AH0060010.AH0060010form1.w_STOCK_LOT_CD = {};
expj.AH0060010.AH0060010form1.w_STOCK_LOT_CD.executeAllOnDecision = function () {
  console.log('execute AH0060010form1/w_STOCK_LOT_CD.onDecision');
  expj.AH0060010.AH0060010form1.executeAllOnDecision();
  expj.AH0060010.executeAllOnDecision();
};
expj.AH0060010.AH0060010form1.w_STOCK_LOT_CD.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010form1-w_STOCK_LOT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0060010', 'AH0060010form1', 'w_STOCK_LOT_CD', this);
  });
  expj.AH0060010.AH0060010form1.w_STOCK_LOT_CD.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.w_STOCK_LOT_CD.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1/w_STOCK_LOT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010form1-w_STOCK_LOT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AH0060010-AH0060010form1-w_STOCK_LOT_CD" name="w_STOCK_LOT_CD" class="AH0060010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAH0060010Struct.getw_STOCK_LOT_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AH0060010-AH0060010form1-Peekerw_STOCK_LOT_CD">
expj.AH0060010.AH0060010form1.Peekerw_STOCK_LOT_CD = {};
// script1="onClick;0;PEEKER;_AH0060010form1/w_STOCK_LOT_CD:_AH0060010form1/w_ITEM_CD:_AH0060010form1/w_WH_CD@<%=contextNo%>"
expj.AH0060010.AH0060010form1.Peekerw_STOCK_LOT_CD.onClick0 = function () {
  console.log('Peekerw_STOCK_LOT_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AH0060010';
var parameterValues = 'Peekerw_STOCK_LOT_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/w_STOCK_LOT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/w_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_3%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/w_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%LOT_NO_12%&%';
parameterValues += 'TARGET_FIELD%=%_AH0060010form1/w_STOCK_LOT_CD:_AH0060010form1/w_ITEM_CD:_AH0060010form1/w_WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AH0060010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AH0060010.AH0060010form1.Peekerw_STOCK_LOT_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0060010.AH0060010form1.Peekerw_STOCK_LOT_CD['onClick' + i])) {
        expj.AH0060010.AH0060010form1.Peekerw_STOCK_LOT_CD['onClick' + i]();
      }
    }
  }
};
expj.AH0060010.AH0060010form1.Peekerw_STOCK_LOT_CD.executeAllOnDecision = function () {
};
expj.AH0060010.AH0060010form1.Peekerw_STOCK_LOT_CD.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010form1-Peekerw_STOCK_LOT_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0060010', 'AH0060010form1', 'Peekerw_STOCK_LOT_CD', this, 'Button');
    }
  });
  expj.AH0060010.AH0060010form1.Peekerw_STOCK_LOT_CD.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.Peekerw_STOCK_LOT_CD.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1/Peekerw_STOCK_LOT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010form1-Peekerw_STOCK_LOT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AH0060010-AH0060010form1-Peekerw_STOCK_LOT_CD" class="AH0060010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- (ワイルドカード指定可) --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:110px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ABC_TYP",rb)%></span><!-- 棚卸区分 --></div><!--/td-->
<script class="expj-script-AH0060010-AH0060010form1-s_ABC_TYP">
expj.AH0060010.AH0060010form1.s_ABC_TYP = {};
expj.AH0060010.AH0060010form1.s_ABC_TYP.executeAllOnDecision = function () {
  console.log('execute AH0060010form1/s_ABC_TYP.onDecision');
  expj.AH0060010.AH0060010form1.executeAllOnDecision();
  expj.AH0060010.executeAllOnDecision();
};
expj.AH0060010.AH0060010form1.s_ABC_TYP.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010form1-s_ABC_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AH0060010', 'AH0060010form1', 's_ABC_TYP', this);
  });
  expj.AH0060010.AH0060010form1.s_ABC_TYP.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.s_ABC_TYP.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1/s_ABC_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010form1-s_ABC_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AH0060010-AH0060010form1-s_ABC_TYP" name='s_ABC_TYP' class='AH0060010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAH0060010Control.getStruct().getList_s_ABC_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAH0060010Control.getStruct().getList_s_ABC_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAH0060010Control.getStruct().getList_s_ABC_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAH0060010Struct.gets_ABC_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0050",rb)%></span><!-- 差異率 --></div><!--/td-->
<script class="expj-script-AH0060010-AH0060010form1-w_difference_rate">
expj.AH0060010.AH0060010form1.w_difference_rate = {};
expj.AH0060010.AH0060010form1.w_difference_rate.executeAllOnDecision = function () {
  console.log('execute AH0060010form1/w_difference_rate.onDecision');
  expj.AH0060010.AH0060010form1.executeAllOnDecision();
  expj.AH0060010.executeAllOnDecision();
};
expj.AH0060010.AH0060010form1.w_difference_rate.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010form1-w_difference_rate').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0060010', 'AH0060010form1', 'w_difference_rate', this);
  });
  expj.AH0060010.AH0060010form1.w_difference_rate.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.w_difference_rate.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1/w_difference_rate.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010form1-w_difference_rate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AH0060010-AH0060010form1-w_difference_rate" name="w_difference_rate" class="AH0060010-focus-move  " style="width:100%;text-align: right;" data-kind="OBT_INTEGER_Z;14;FLOOR;1" value="<%= TypeConverter.sanitizer(aAH0060010Struct.getw_difference_rate()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:110px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0049",rb)%></span><!-- ％以上 --></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AH0060010-AH0060010form1-r2_whlot1">
expj.AH0060010.AH0060010form1.r2_whlot1 = {};
// script1="onClick;0;CHK;_THIS[eq]true@*0,*1"
expj.AH0060010.AH0060010form1.r2_whlot1.onClick0 = function () {
  console.log('r2_whlot1 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;MASK;_AH0060010form1/w_STOCK_LOT_CD,_AH0060010form1/Peekerw_STOCK_LOT_CD@*2"
expj.AH0060010.AH0060010form1.r2_whlot1.child0 = function () {
  console.log('r2_whlot1 script2');
expj.common.pscript.setMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/w_STOCK_LOT_CD');
expj.common.pscript.setMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/Peekerw_STOCK_LOT_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script3="child;1;UNMASK;_AH0060010form1/w_STOCK_LOT_CD,_AH0060010form1/Peekerw_STOCK_LOT_CD"
expj.AH0060010.AH0060010form1.r2_whlot1.child1 = function () {
  console.log('r2_whlot1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/w_STOCK_LOT_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/Peekerw_STOCK_LOT_CD');
};
// script4="child;2;SET;_AH0060010form1/w_STOCK_LOT_CD="
expj.AH0060010.AH0060010form1.r2_whlot1.child2 = function () {
  console.log('r2_whlot1 script4');
expj.common.pscript.setReferenceComponentValue('AH0060010', 'AH0060010form1', '_AH0060010form1/w_STOCK_LOT_CD', '');
};
expj.AH0060010.AH0060010form1.r2_whlot1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0060010.AH0060010form1.r2_whlot1['onClick' + i])) {
        expj.AH0060010.AH0060010form1.r2_whlot1['onClick' + i]();
      }
    }
  }
};
expj.AH0060010.AH0060010form1.r2_whlot1.executeAllOnDecision = function () {
  console.log('execute AH0060010form1/r2_whlot1.onDecision');
  expj.AH0060010.AH0060010form1.executeAllOnDecision();
  expj.AH0060010.executeAllOnDecision();
};
expj.AH0060010.AH0060010form1.r2_whlot1.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010form1-r2_whlot1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0060010', 'AH0060010form1', 'r2_whlot1', this, 'RadioButton');
    }
  });
  expj.AH0060010.AH0060010form1.r2_whlot1.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.r2_whlot1.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1/r2_whlot1.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010form1-r2_whlot1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="whlot" data-name="r2_whlot1" value="true" <%= ("true".equals(TypeConverter.convert(aAH0060010Struct.getr2_whlot1())))?"checked=\"checked\"":"" %> class="" id="expj-AH0060010-AH0060010form1-r2_whlot1" ><label for="expj-AH0060010-AH0060010form1-r2_whlot1"><%=CoreTools.getRBString("Expj.Cmt5000",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AH0060010-AH0060010form1-r2_whlot2">
expj.AH0060010.AH0060010form1.r2_whlot2 = {};
// script1="onClick;0;CHK;_THIS[eq]true@*0"
expj.AH0060010.AH0060010form1.r2_whlot2.onClick0 = function () {
  console.log('r2_whlot2 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010form1', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;UNMASK;_AH0060010form1/w_STOCK_LOT_CD,_AH0060010form1/Peekerw_STOCK_LOT_CD"
expj.AH0060010.AH0060010form1.r2_whlot2.child0 = function () {
  console.log('r2_whlot2 script2');
expj.common.pscript.setUnMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/w_STOCK_LOT_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AH0060010', 'AH0060010form1', '_AH0060010form1/Peekerw_STOCK_LOT_CD');
};
expj.AH0060010.AH0060010form1.r2_whlot2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0060010.AH0060010form1.r2_whlot2['onClick' + i])) {
        expj.AH0060010.AH0060010form1.r2_whlot2['onClick' + i]();
      }
    }
  }
};
expj.AH0060010.AH0060010form1.r2_whlot2.executeAllOnDecision = function () {
  console.log('execute AH0060010form1/r2_whlot2.onDecision');
  expj.AH0060010.AH0060010form1.executeAllOnDecision();
  expj.AH0060010.executeAllOnDecision();
};
expj.AH0060010.AH0060010form1.r2_whlot2.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010form1-r2_whlot2').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0060010', 'AH0060010form1', 'r2_whlot2', this, 'RadioButton');
    }
  });
  expj.AH0060010.AH0060010form1.r2_whlot2.executePScriptOnLoad();
};

expj.AH0060010.AH0060010form1.r2_whlot2.executePScriptOnLoad = function () {
  console.log('execute AH0060010form1/r2_whlot2.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010form1-r2_whlot2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="radio" name="whlot" data-name="r2_whlot2" value="true" <%= ("true".equals(TypeConverter.convert(aAH0060010Struct.getr2_whlot2())))?"checked=\"checked\"":"" %> class="" id="expj-AH0060010-AH0060010form1-r2_whlot2" ><label for="expj-AH0060010-AH0060010form1-r2_whlot2"><%=CoreTools.getRBString("Expj.Cmt5001",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:110px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AH0060010-AH0060010button1">
expj.AH0060010.AH0060010button1 = {};
expj.AH0060010.AH0060010button1.executeAllOnDecision = function () {
  console.log('execute AH0060010button1.onDecision');
};
expj.AH0060010.AH0060010button1.executeOnLoad = function () {
  expj.AH0060010.AH0060010button1.executePScriptOnLoad();
};

expj.AH0060010.AH0060010button1.executePScriptOnLoad = function () {
  console.log('execute AH0060010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AH0060010-AH0060010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AH0060010-AH0060010button1-select">
expj.AH0060010.AH0060010button1.select = {};
// script1="onClick;0;CHK;1[eq]1@*0"
expj.AH0060010.AH0060010button1.select.onClick0 = function () {
  console.log('select script1');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_AH0060010form1/r1_sort2[eq]true@*1,*2"
expj.AH0060010.AH0060010button1.select.child0 = function () {
  console.log('select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010button1', '_AH0060010form1/r1_sort2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;SET;_AH0060010form1/h_sort_flg=1@*3"
expj.AH0060010.AH0060010button1.select.child1 = function () {
  console.log('select script3');
expj.common.pscript.setReferenceComponentValue('AH0060010', 'AH0060010button1', '_AH0060010form1/h_sort_flg', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script4="child;2;SET;_AH0060010form1/h_sort_flg=0@*3"
expj.AH0060010.AH0060010button1.select.child2 = function () {
  console.log('select script4');
expj.common.pscript.setReferenceComponentValue('AH0060010', 'AH0060010button1', '_AH0060010form1/h_sort_flg', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;3;CHK;_AH0060010form1/c_JOB_ODR_CD_STOCK_flg[eq]true@*4,*5"
expj.AH0060010.AH0060010button1.select.child3 = function () {
  console.log('select script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0060010', 'AH0060010button1', '_AH0060010form1/c_JOB_ODR_CD_STOCK_flg'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;4;SET;_AH0060010form1/h_JOB_ODR_CD_STOCK_flg=1@*6"
expj.AH0060010.AH0060010button1.select.child4 = function () {
  console.log('select script6');
expj.common.pscript.setReferenceComponentValue('AH0060010', 'AH0060010button1', '_AH0060010form1/h_JOB_ODR_CD_STOCK_flg', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script7="child;5;SET;_AH0060010form1/h_JOB_ODR_CD_STOCK_flg=0@*6"
expj.AH0060010.AH0060010button1.select.child5 = function () {
  console.log('select script7');
expj.common.pscript.setReferenceComponentValue('AH0060010', 'AH0060010button1', '_AH0060010form1/h_JOB_ODR_CD_STOCK_flg', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script8="child;6;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AH0060010form1/*,_AH0060010view1/*@AH0060010Servlet"
expj.AH0060010.AH0060010button1.select.child6 = function () {
  console.log('select script8');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0060010', 'AH0060010button1', '_AH0060010form1/*,_AH0060010view1/*', 'AH0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0060010', response);
expj.common.updateBusinessScreenTab('AH0060010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AH0060010.AH0060010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0060010.AH0060010button1.select['onClick' + i])) {
        expj.AH0060010.AH0060010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AH0060010.AH0060010button1.select.executeAllOnDecision = function () {
};
expj.AH0060010.AH0060010button1.select.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0060010', 'AH0060010button1', 'select', this, 'Button');
    }
  });
  expj.AH0060010.AH0060010button1.select.executePScriptOnLoad();
};

expj.AH0060010.AH0060010button1.select.executePScriptOnLoad = function () {
  console.log('execute AH0060010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0060010-AH0060010button1-select" name="select" class="AH0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AH0060010-AH0060010view1">
expj.AH0060010.AH0060010view1 = {};
expj.AH0060010.AH0060010view1.executeAllOnClick = function () {
};
expj.AH0060010.AH0060010view1.executeAllOnDecision = function () {
  console.log('execute AH0060010view1.onDecision');
};
expj.AH0060010.AH0060010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AH0060010view1", "expj.AH0060010.AH0060010view1.executeAllOnClick");
%>
  expj.AH0060010.AH0060010view1.executePScriptOnLoad();
};

expj.AH0060010.AH0060010view1.executePScriptOnLoad = function () {
  console.log('execute AH0060010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AH0060010-AH0060010view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AH0060010view1_Id = "AH0060010view1";
 String AH0060010view1_select = "single";
 String AH0060010view1_sortable = "true";
 String AH0060010view1_resize = "true";
 String AH0060010view1_scroll = "true";
 StringBuffer AH0060010view1_HB = new StringBuffer();
 StringBuffer AH0060010view1_DB = new StringBuffer();
%>
<%
 AH0060010view1_select = "multi";
 AH0060010view1_sortable = "true";
 AH0060010view1_resize = "true";
 AH0060010view1_scroll = "true";
%>
<%
 AH0060010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AH0060010view1_sortable).append("}").append(",");
%>
     
<%
AH0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AH0060010view1_sortable).append("}").append(",");
AH0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_CD",rb))).append("', 'name':'WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0060010view1_sortable).append("}").append(",");
AH0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_NAME",rb))).append("', 'name':'WH_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0060010view1_sortable).append("}").append(",");
AH0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'125px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0060010view1_sortable).append("}").append(",");
AH0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0060010view1_sortable).append("}").append(",");
AH0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0060010view1_sortable).append("}").append(",");
AH0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_LOT_CD",rb))).append("', 'name':'l_STOCK_LOT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0060010view1_sortable).append("}").append(",");
AH0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.FINAL_BOOK_STOCK_QTY",rb))).append("', 'name':'FINAL_BOOK_STOCK_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AH0060010view1_sortable).append("}").append(",");
AH0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACTUAL_STOCK_QTY",rb))).append("', 'name':'ACTUAL_STOCK_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AH0060010view1_sortable).append("}").append(",");
AH0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_UNIT",rb))).append("', 'name':'STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0060010view1_sortable).append("}").append(",");
AH0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0052",rb))).append("', 'name':'difference_rate', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AH0060010view1_sortable).append("}").append(",");
AH0060010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SAFETY_STOCK",rb))).append("', 'name':'SAFETY_STOCK', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AH0060010view1_sortable).append("}").append(",");
AH0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb))).append("', 'name':'w_MRP_ODR_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0060010view1_sortable).append("}").append(",");
AH0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ABC_TYP",rb))).append("', 'name':'w_ABC_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0060010view1_sortable).append("}").append(",");
AH0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MRP_FLG",rb))).append("', 'name':'w_MRP_FLG', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0060010view1_sortable).append("}").append(",");
AH0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_TYP",rb))).append("', 'name':'w_WH_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0060010view1_sortable).append("}").append(",");
AH0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0060010view1_sortable).append("}").append(",");
AH0060010view1_HB.append("{'visible':true, 'type':'string', 'width':'125px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_ANAME",rb))).append("', 'name':'VEND_ANAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0060010view1_sortable).append("}").append(",");
%>
<%
 int aAH0060010StructLength = aAH0060010Control.getListsize();
 final AH0060010Struct structBackup = aAH0060010Struct;
 aAH0060010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAH0060010StructLength; ++loopCount) {
  if((aAH0060010Struct = (AH0060010Struct) aAH0060010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAH0060010Struct", aAH0060010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AH0060010view1_DB.append("[");
 AH0060010view1_DB.append(loopCount);
 AH0060010view1_DB.append(",''");
 AH0060010view1_DB.append(",").append("'<span id=\"expj-AH0060010-AH0060010view1-WH_CD-").append(loopCount).append("\" class=\"expj-label expj-AH0060010-AH0060010view1-WH_CD\" data-name=\"WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0060010Struct.getWH_CD())).append("</span>'");
 AH0060010view1_DB.append(",").append("'<span id=\"expj-AH0060010-AH0060010view1-WH_NAME-").append(loopCount).append("\" class=\"expj-label expj-AH0060010-AH0060010view1-WH_NAME\" data-name=\"WH_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0060010Struct.getWH_NAME())).append("</span>'");
 AH0060010view1_DB.append(",").append("'<span id=\"expj-AH0060010-AH0060010view1-ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AH0060010-AH0060010view1-ITEM_CD\" data-name=\"ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0060010Struct.getITEM_CD())).append("</span>'");
 AH0060010view1_DB.append(",").append("'<span id=\"expj-AH0060010-AH0060010view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AH0060010-AH0060010view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0060010Struct.getITEM_NAME())).append("</span>'");
 AH0060010view1_DB.append(",").append("'<span id=\"expj-AH0060010-AH0060010view1-JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AH0060010-AH0060010view1-JOB_ODR_CD\" data-name=\"JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0060010Struct.getJOB_ODR_CD())).append("</span>'");
 AH0060010view1_DB.append(",").append("'<span id=\"expj-AH0060010-AH0060010view1-l_STOCK_LOT_CD-").append(loopCount).append("\" class=\"expj-label expj-AH0060010-AH0060010view1-l_STOCK_LOT_CD\" data-name=\"l_STOCK_LOT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0060010Struct.getl_STOCK_LOT_CD())).append("</span>'");
 AH0060010view1_DB.append(",").append("'<span id=\"expj-AH0060010-AH0060010view1-FINAL_BOOK_STOCK_QTY-").append(loopCount).append("\" class=\"expj-label expj-AH0060010-AH0060010view1-FINAL_BOOK_STOCK_QTY\" data-name=\"FINAL_BOOK_STOCK_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAH0060010Struct.getFINAL_BOOK_STOCK_QTY())).append("</span>'");
 AH0060010view1_DB.append(",").append("'<span id=\"expj-AH0060010-AH0060010view1-ACTUAL_STOCK_QTY-").append(loopCount).append("\" class=\"expj-label expj-AH0060010-AH0060010view1-ACTUAL_STOCK_QTY\" data-name=\"ACTUAL_STOCK_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAH0060010Struct.getACTUAL_STOCK_QTY())).append("</span>'");
 AH0060010view1_DB.append(",").append("'<span id=\"expj-AH0060010-AH0060010view1-STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AH0060010-AH0060010view1-STOCK_UNIT\" data-name=\"STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0060010Struct.getSTOCK_UNIT())).append("</span>'");
 AH0060010view1_DB.append(",").append("'<span id=\"expj-AH0060010-AH0060010view1-difference_rate-").append(loopCount).append("\" class=\"expj-label expj-AH0060010-AH0060010view1-difference_rate\" data-name=\"difference_rate\" data-view=\"true\" data-kind=\"OBT_INTEGER;16;;\">").append(TypeConverter.sanitizer(aAH0060010Struct.getdifference_rate())).append("</span>'");
 AH0060010view1_DB.append(",").append("'<span id=\"expj-AH0060010-AH0060010view1-SAFETY_STOCK-").append(loopCount).append("\" class=\"expj-label expj-AH0060010-AH0060010view1-SAFETY_STOCK\" data-name=\"SAFETY_STOCK\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAH0060010Struct.getSAFETY_STOCK())).append("</span>'");
 AH0060010view1_DB.append(",").append("'<span id=\"expj-AH0060010-AH0060010view1-w_MRP_ODR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AH0060010-AH0060010view1-w_MRP_ODR_TYP\" data-name=\"w_MRP_ODR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0060010Struct.getw_MRP_ODR_TYP())).append("</span>'");
 AH0060010view1_DB.append(",").append("'<span id=\"expj-AH0060010-AH0060010view1-w_ABC_TYP-").append(loopCount).append("\" class=\"expj-label expj-AH0060010-AH0060010view1-w_ABC_TYP\" data-name=\"w_ABC_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0060010Struct.getw_ABC_TYP())).append("</span>'");
 AH0060010view1_DB.append(",").append("'<span id=\"expj-AH0060010-AH0060010view1-w_MRP_FLG-").append(loopCount).append("\" class=\"expj-label expj-AH0060010-AH0060010view1-w_MRP_FLG\" data-name=\"w_MRP_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0060010Struct.getw_MRP_FLG())).append("</span>'");
 AH0060010view1_DB.append(",").append("'<span id=\"expj-AH0060010-AH0060010view1-w_WH_TYP-").append(loopCount).append("\" class=\"expj-label expj-AH0060010-AH0060010view1-w_WH_TYP\" data-name=\"w_WH_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0060010Struct.getw_WH_TYP())).append("</span>'");
 AH0060010view1_DB.append(",").append("'<span id=\"expj-AH0060010-AH0060010view1-VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AH0060010-AH0060010view1-VEND_CD\" data-name=\"VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0060010Struct.getVEND_CD())).append("</span>'");
 AH0060010view1_DB.append(",").append("'<span id=\"expj-AH0060010-AH0060010view1-VEND_ANAME-").append(loopCount).append("\" class=\"expj-label expj-AH0060010-AH0060010view1-VEND_ANAME\" data-name=\"VEND_ANAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0060010Struct.getVEND_ANAME())).append("</span>'");
 AH0060010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAH0060010StructLength) {
   AH0060010view1_DB.append(",");
  }
 }
 aAH0060010Struct = structBackup;
 viewIdList.add(AH0060010view1_Id);
 viewSelectList.add(AH0060010view1_select);
 viewResizeList.add(AH0060010view1_resize);
 viewScrollList.add(AH0060010view1_scroll);
 viewHeaderDataList.add(AH0060010view1_HB);
 viewBodyDataList.add(AH0060010view1_DB);
%>
<%
}
%>
</div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 420px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AH0060010 Revision: 1.9  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:420px;">
<script class="expj-script-AH0060010-AH0060010button0">
expj.AH0060010.AH0060010button0 = {};
expj.AH0060010.AH0060010button0.executeAllOnDecision = function () {
  console.log('execute AH0060010button0.onDecision');
};
expj.AH0060010.AH0060010button0.executeOnLoad = function () {
  expj.AH0060010.AH0060010button0.executePScriptOnLoad();
};

expj.AH0060010.AH0060010button0.executePScriptOnLoad = function () {
  console.log('execute AH0060010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AH0060010-AH0060010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AH0060010-AH0060010button0-Print">
expj.AH0060010.AH0060010button0.Print = {};
// script1="onClick;0;PRINTER;ORTEUS_HASHED=<%=hashed%>,_AH0060010form1/*@AH0060010Servlet:H,H,H"
expj.AH0060010.AH0060010button0.Print.onClick0 = function () {
  console.log('Print script1');
expj.common.pscript.viewPrinterDialog('AH0060010', 'AH0060010button0', '_AH0060010form1/*', 'AH0060010Servlet', 'H,H,H');
};
expj.AH0060010.AH0060010button0.Print.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0060010.AH0060010button0.Print['onClick' + i])) {
        expj.AH0060010.AH0060010button0.Print['onClick' + i]();
      }
    }
  }
};
expj.AH0060010.AH0060010button0.Print.executeAllOnDecision = function () {
};
expj.AH0060010.AH0060010button0.Print.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010button0-Print').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0060010', 'AH0060010button0', 'Print', this, 'Button');
    }
  });
  expj.AH0060010.AH0060010button0.Print.executePScriptOnLoad();
};

expj.AH0060010.AH0060010button0.Print.executePScriptOnLoad = function () {
  console.log('execute AH0060010button0/Print.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010button0-Print');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0060010-AH0060010button0-Print" name="Print" class="AH0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnPrint",rb)%></button><!-- 帳票出力ボタン --></div><!--/td-->
<script class="expj-script-AH0060010-AH0060010button0-csv_export">
expj.AH0060010.AH0060010button0.csv_export = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AH0060010form1/*,_AH0060010view1/*@AH0060010Servlet,,$ZZ07011"
expj.AH0060010.AH0060010button0.csv_export.onClick0 = function () {
  console.log('csv_export script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0060010', 'AH0060010button0', '_AH0060010form1/*,_AH0060010view1/*', 'AH0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0060010', response);
expj.common.updateBusinessScreenTab('AH0060010', contents);
};
expj.common.pscript.callConfirm('AH0060010', 'AH0060010button0', 'ZZ07011', okEvent);
};
expj.AH0060010.AH0060010button0.csv_export.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0060010.AH0060010button0.csv_export['onClick' + i])) {
        expj.AH0060010.AH0060010button0.csv_export['onClick' + i]();
      }
    }
  }
};
expj.AH0060010.AH0060010button0.csv_export.executeAllOnDecision = function () {
};
expj.AH0060010.AH0060010button0.csv_export.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010button0-csv_export').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0060010', 'AH0060010button0', 'csv_export', this, 'Button');
    }
  });
  expj.AH0060010.AH0060010button0.csv_export.executePScriptOnLoad();
};

expj.AH0060010.AH0060010button0.csv_export.executePScriptOnLoad = function () {
  console.log('execute AH0060010button0/csv_export.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010button0-csv_export');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0060010-AH0060010button0-csv_export" name="csv_export" class="AH0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-AH0060010-AH0060010button0-clear">
expj.AH0060010.AH0060010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AH0060010form1/*,_AH0060010view1/*@AH0060010Servlet,,$ZZ07008"
expj.AH0060010.AH0060010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0060010', 'AH0060010button0', '_AH0060010form1/*,_AH0060010view1/*', 'AH0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0060010', response);
expj.common.updateBusinessScreenTab('AH0060010', contents);
};
expj.common.pscript.callConfirm('AH0060010', 'AH0060010button0', 'ZZ07008', okEvent);
};
expj.AH0060010.AH0060010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0060010.AH0060010button0.clear['onClick' + i])) {
        expj.AH0060010.AH0060010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AH0060010.AH0060010button0.clear.executeAllOnDecision = function () {
};
expj.AH0060010.AH0060010button0.clear.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0060010', 'AH0060010button0', 'clear', this, 'Button');
    }
  });
  expj.AH0060010.AH0060010button0.clear.executePScriptOnLoad();
};

expj.AH0060010.AH0060010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AH0060010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0060010-AH0060010button0-clear" name="clear" class="AH0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AH0060010-AH0060010button0-close">
expj.AH0060010.AH0060010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AH0060010.AH0060010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AH0060010');
};
expj.AH0060010.AH0060010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0060010.AH0060010button0.close['onClick' + i])) {
        expj.AH0060010.AH0060010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AH0060010.AH0060010button0.close.executeAllOnDecision = function () {
};
expj.AH0060010.AH0060010button0.close.executeOnLoad = function () {
  $('#expj-AH0060010-AH0060010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0060010', 'AH0060010button0', 'close', this, 'Button');
    }
  });
  expj.AH0060010.AH0060010button0.close.executePScriptOnLoad();
};

expj.AH0060010.AH0060010button0.close.executePScriptOnLoad = function () {
  console.log('execute AH0060010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AH0060010-AH0060010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0060010-AH0060010button0-close" name="close" class="AH0060010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AH0060010 (END)-->
<%
MessageStruct msgStruct = aAH0060010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AH0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AH0060010)) {
  expj.common.treeInstanceMap.AH0060010 = {};
}
expj.common.treeInstanceMap.AH0060010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AH0060010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AH0060010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AH0060010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AH0060010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AH0060010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AH0060010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AH0060010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AH0060010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AH0060010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AH0060010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0060010)) {
  expj.common.detailDialogMap.AH0060010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0060010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AH0060010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0060010.<%=detailId %>)) {
  expj.common.detailDialogMap.AH0060010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0060010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AH0060010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0060010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AH0060010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AH0060010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AH0060010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AH0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AH0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AH0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AH0060010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AH0060010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AH0060010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AH0060010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AH0060010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AH0060010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AH0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AH0060010)) {
  expj.common.viewInstanceMap.AH0060010 = {};
}
expj.common.viewInstanceMap.AH0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AH0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AH0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AH0060010.<%=viewId %>.init = function () {
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
    expj.AH0060010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AH0060010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AH0060010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AH0060010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AH0060010_init">
/**
 * AH0060010用のロード完了時初期化関数
 */
expj.AH0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AH0060010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AH0060010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AH0060010');
  expj.common.calendarInstanceMap.AH0060010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AH0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AH0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AH0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AH0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AH0060010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AH0060010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AH0060010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AH0060010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AH0060010-<%=detailId %>');
<%
 }
%>
  try{expj.AH0060010.AH0060010form1.INV_DATE.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010form1.CalendarINV_DATE.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010form1.w_INV_status.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010form1.h_JOB_ODR_CD_STOCK_flg.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010form1.h_sort_flg.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010form1.w_WH_CD.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010form1.h_lotCtrl.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010form1.Peekerw_WH_CD.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010form1.r1_sort1.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010form1.w_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010form1.h_save_sort_flg.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010form1.Peekerw_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010form1.r1_sort2.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010form1.w_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010form1.Peekerw_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010form1.c_JOB_ODR_CD_STOCK_flg.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010form1.w_STOCK_LOT_CD.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010form1.Peekerw_STOCK_LOT_CD.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010form1.s_ABC_TYP.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010form1.w_difference_rate.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010form1.r2_whlot1.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010form1.r2_whlot2.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010button1.select.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010button0.Print.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010button0.csv_export.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010button0.close.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010form1.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010button1.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010view1.executeOnLoad();}catch(e){};
  try{expj.AH0060010.AH0060010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AH0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AH0060010', 'AH0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AH0060010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AH0060010-focus-move');
  // 初期フォーカス当てる処理
  $('.AH0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AH0060010', '<%=request.getContextPath() %>');
};

/**
 * AH0060010の全体onDecision処理
 */
expj.AH0060010.executeAllOnDecision = function () {
  expj.AH0060010.AH0060010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AH0060010_console">
expj.AH0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>