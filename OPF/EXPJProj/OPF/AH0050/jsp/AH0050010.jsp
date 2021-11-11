<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:42:44 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AH0050\AH0050010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AH0050.*" %>
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
<jsp:useBean id="aAH0050010Control" class="com.nec.jp.orteus.metamorBase.AH0050.AH0050010Control" scope="request"/>
<jsp:useBean id="aAH0050010Struct" class="com.nec.jp.orteus.metamorBase.AH0050.AH0050010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

実棚入力
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0050/jsp/AH0050010.jsp,v $
$Author: geng-jia $	
$Revision: 1.11 $ $Date: 2017/02/22 02:06:06 $
********************************************************* --%>
<html>
<head>
<title>実棚入力</title>
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
<script class="expj-script-AH0050010_init">
  // AH0050010名前空間
  expj.AH0050010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AH0050010" data-screen="AH0050010" data-newdata="<%=aAH0050010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style=""></div><!--/td-->

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
              <script class="expj-script-AH0050010-AH0050010form1">
expj.AH0050010.AH0050010form1 = {};
// script1="onLoad;0;CALL;child@0,3"
expj.AH0050010.AH0050010form1.onLoad0 = function () {
  console.log('AH0050010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child3)){this.child3();}
};
// script2="child;0;CHK;_AH0050010form1/h_JOB_ODR_CD_STOCK_flg[eq]1@*1,*2"
expj.AH0050010.AH0050010form1.child0 = function () {
  console.log('AH0050010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010form1', '_AH0050010form1/h_JOB_ODR_CD_STOCK_flg'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;SET;_AH0050010form1/c_JOB_ODR_CD_STOCK_flg=true"
expj.AH0050010.AH0050010form1.child1 = function () {
  console.log('AH0050010form1 script3');
expj.common.pscript.setReferenceComponentValue('AH0050010', 'AH0050010form1', '_AH0050010form1/c_JOB_ODR_CD_STOCK_flg', 'true');
};
// script4="child;2;SET;_AH0050010form1/c_JOB_ODR_CD_STOCK_flg=false"
expj.AH0050010.AH0050010form1.child2 = function () {
  console.log('AH0050010form1 script4');
expj.common.pscript.setReferenceComponentValue('AH0050010', 'AH0050010form1', '_AH0050010form1/c_JOB_ODR_CD_STOCK_flg', 'false');
};
// script5="child;3;CHK;_AH0050010form1/h_JOB_ODR_CD_STOCK_flg[eq]1@*4,*5"
expj.AH0050010.AH0050010form1.child3 = function () {
  console.log('AH0050010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010form1', '_AH0050010form1/h_JOB_ODR_CD_STOCK_flg'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;4;UNMASK;_AH0050010form1/JOB_ODR_CD,_AH0050010form1/PeekerJOB_ODR_CD"
expj.AH0050010.AH0050010form1.child4 = function () {
  console.log('AH0050010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010form1/JOB_ODR_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010form1/PeekerJOB_ODR_CD');
};
// script7="child;5;MASK;_AH0050010form1/JOB_ODR_CD,_AH0050010form1/PeekerJOB_ODR_CD"
expj.AH0050010.AH0050010form1.child5 = function () {
  console.log('AH0050010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010form1/JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010form1/PeekerJOB_ODR_CD');
};
// script8="onLoad;1;CALL;onDecision@0,1"
expj.AH0050010.AH0050010form1.onLoad1 = function () {
  console.log('AH0050010form1 script8');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script9="onDecision;0;CHKRQ;A,B@*6,*7"
expj.AH0050010.AH0050010form1.onDecision0 = function () {
  console.log('AH0050010form1 script9');
if (expj.common.pscript.satisfiedRequiredComponent('AH0050010', 'A') && expj.common.pscript.satisfiedRequiredComponent('AH0050010', 'B')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script10="child;6;UNMASK;_AH0050010button1/select"
expj.AH0050010.AH0050010form1.child6 = function () {
  console.log('AH0050010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010button1/select');
};
// script11="child;7;MASK;_AH0050010button1/select"
expj.AH0050010.AH0050010form1.child7 = function () {
  console.log('AH0050010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010button1/select');
};
// script12="onDecision;1;CHKRQ;A,B@*8,*18"
expj.AH0050010.AH0050010form1.onDecision1 = function () {
  console.log('AH0050010form1 script12');
if (expj.common.pscript.satisfiedRequiredComponent('AH0050010', 'A') && expj.common.pscript.satisfiedRequiredComponent('AH0050010', 'B')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script13="child;8;CHK;?AH0050010form1/*[eq]NORMAL[or]?AH0050010form1/*[eq]NOT_FOUND@*9,*18"
expj.AH0050010.AH0050010form1.child8 = function () {
  console.log('AH0050010form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010form1', '?AH0050010form1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010form1', '?AH0050010form1/*'), '[eq]', 'NOT_FOUND')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script14="child;9;CHK;?AH0050010form1/WH_CD[eq]SAME@*10,*18"
expj.AH0050010.AH0050010form1.child9 = function () {
  console.log('AH0050010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010form1', '?AH0050010form1/WH_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script15="child;10;CHK;?AH0050010form1/w_ITEM_CD[eq]SAME@*11,*18"
expj.AH0050010.AH0050010form1.child10 = function () {
  console.log('AH0050010form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010form1', '?AH0050010form1/w_ITEM_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script16="child;11;CHK;?AH0050010form1/c_JOB_ODR_CD_STOCK_flg[eq]SAME@*12,*18"
expj.AH0050010.AH0050010form1.child11 = function () {
  console.log('AH0050010form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010form1', '?AH0050010form1/c_JOB_ODR_CD_STOCK_flg'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script17="child;12;CHK;_AH0050010form1/c_JOB_ODR_CD_STOCK_flg[eq]true@*13,*14"
expj.AH0050010.AH0050010form1.child12 = function () {
  console.log('AH0050010form1 script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010form1', '_AH0050010form1/c_JOB_ODR_CD_STOCK_flg'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script18="child;13;CHK;?AH0050010form1/JOB_ODR_CD[eq]SAME@*14,*18"
expj.AH0050010.AH0050010form1.child13 = function () {
  console.log('AH0050010form1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010form1', '?AH0050010form1/JOB_ODR_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script19="child;14;CHK;?AH0050010form1/*[eq]NORMAL@*15,*16"
expj.AH0050010.AH0050010form1.child14 = function () {
  console.log('AH0050010form1 script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010form1', '?AH0050010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script20="child;15;UNMASK;_AH0050010button2/update,_AH0050010button2/append"
expj.AH0050010.AH0050010form1.child15 = function () {
  console.log('AH0050010form1 script20');
expj.common.pscript.setUnMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010button2/update');
expj.common.pscript.setUnMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010button2/append');
};
// script21="child;16;UNMASK;_AH0050010button2/append@*17"
expj.AH0050010.AH0050010form1.child16 = function () {
  console.log('AH0050010form1 script21');
expj.common.pscript.setUnMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010button2/append');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child17)){this.child17();}}
};
// script22="child;17;MASK;_AH0050010button2/update"
expj.AH0050010.AH0050010form1.child17 = function () {
  console.log('AH0050010form1 script22');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010button2/update');
};
// script23="child;18;MASK;_AH0050010button2/update,_AH0050010button2/append"
expj.AH0050010.AH0050010form1.child18 = function () {
  console.log('AH0050010form1 script23');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010button2/update');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010button2/append');
};
// script24="onLoad;2;CALL;child@19"
expj.AH0050010.AH0050010form1.onLoad2 = function () {
  console.log('AH0050010form1 script24');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child19)){this.child19();}
};
// script25="child;19;CHK;_AH0050010form1/h_lotCtrl[eq]true@*20,*21"
expj.AH0050010.AH0050010form1.child19 = function () {
  console.log('AH0050010form1 script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010form1', '_AH0050010form1/h_lotCtrl'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
} else {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
}
};
// script26="child;20;UNMASK;_AH0050010form1/LOT_NO_form,_AH0050010form1/Peekerw_STOCK_LOT_CD"
expj.AH0050010.AH0050010form1.child20 = function () {
  console.log('AH0050010form1 script26');
expj.common.pscript.setUnMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010form1/LOT_NO_form');
expj.common.pscript.setUnMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010form1/Peekerw_STOCK_LOT_CD');
};
// script27="child;21;MASK;_AH0050010form1/LOT_NO_form,_AH0050010form1/Peekerw_STOCK_LOT_CD"
expj.AH0050010.AH0050010form1.child21 = function () {
  console.log('AH0050010form1 script27');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010form1/LOT_NO_form');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010form1/Peekerw_STOCK_LOT_CD');
};
// script28="onLoad;3;CALL;onDecision@2,3"
expj.AH0050010.AH0050010form1.onLoad3 = function () {
  console.log('AH0050010form1 script28');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script29="onDecision;2;CHK;_AH0050010form1/h_APR_INV_CTRL[eq]1[and]_AH0050010form1/h_APRR_FLG[eq]2@*23"
expj.AH0050010.AH0050010form1.onDecision2 = function () {
  console.log('AH0050010form1 script29');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010form1', '_AH0050010form1/h_APR_INV_CTRL'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010form1', '_AH0050010form1/h_APRR_FLG'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
}
};
// script31="child;23;MASK;_AH0050010button2/update,_AH0050010button2/append,_AH0050010button1/CsvImport,_AH0050010button1/select"
expj.AH0050010.AH0050010form1.child23 = function () {
  console.log('AH0050010form1 script31');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010button2/update');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010button2/append');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010button1/CsvImport');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010button1/select');
};
// script32="onDecision;3;CHK;?AH0050010form1/*[eq]ERROR@*24"
expj.AH0050010.AH0050010form1.onDecision3 = function () {
  console.log('AH0050010form1 script32');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010form1', '?AH0050010form1/*'), '[eq]', 'ERROR')) {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
}
};
// script33="child;24;MASK;_AH0050010button2/update,_AH0050010button2/append,_AH0050010button1/CsvImport,_AH0050010button1/select"
expj.AH0050010.AH0050010form1.child24 = function () {
  console.log('AH0050010form1 script33');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010button2/update');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010button2/append');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010button1/CsvImport');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010button1/select');
};
expj.AH0050010.AH0050010form1.executeAllOnDecision = function () {
  console.log('execute AH0050010form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0050010.AH0050010form1['onDecision' + i])) {
        expj.AH0050010.AH0050010form1['onDecision' + i]();
      }
    }
  }
};
expj.AH0050010.AH0050010form1.executeOnLoad = function () {
  expj.AH0050010.AH0050010form1.executePScriptOnLoad();
};

expj.AH0050010.AH0050010form1.executePScriptOnLoad = function () {
  console.log('execute AH0050010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 3; i++) {
    if (expj.common.checkNameSpace(expj.AH0050010.AH0050010form1['onLoad' + i])) {
      expj.AH0050010.AH0050010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AH0050010-AH0050010form1" action="AH0050010Servlet" name="AH0050010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAH0050010Control.getReadStatusString()) %>" style="height:142px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.INV_DATE",rb)%></span><!-- 棚卸日 --></div><!--/td-->
<script class="expj-script-AH0050010-AH0050010form1-INV_DATE">
expj.AH0050010.AH0050010form1.INV_DATE = {};
expj.AH0050010.AH0050010form1.INV_DATE.executeAllOnDecision = function () {
  console.log('execute AH0050010form1/INV_DATE.onDecision');
  expj.AH0050010.AH0050010form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050010form1.INV_DATE.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010form1-INV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050010form1', 'INV_DATE', this);
  });
  expj.AH0050010.AH0050010form1.INV_DATE.executePScriptOnLoad();
};

expj.AH0050010.AH0050010form1.INV_DATE.executePScriptOnLoad = function () {
  console.log('execute AH0050010form1/INV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010form1-INV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AH0050010-AH0050010form1-INV_DATE" name="INV_DATE" class="AH0050010-focus-move  required-value expj-AH0050010-required-B" style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0050010Struct.getINV_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AH0050010-AH0050010form1-w_INV_status">
expj.AH0050010.AH0050010form1.w_INV_status = {};
expj.AH0050010.AH0050010form1.w_INV_status.executeAllOnDecision = function () {
  console.log('execute AH0050010form1/w_INV_status.onDecision');
  expj.AH0050010.AH0050010form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050010form1.w_INV_status.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010form1-w_INV_status').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050010form1', 'w_INV_status', this);
  });
  expj.AH0050010.AH0050010form1.w_INV_status.executePScriptOnLoad();
};

expj.AH0050010.AH0050010form1.w_INV_status.executePScriptOnLoad = function () {
  console.log('execute AH0050010form1/w_INV_status.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010form1-w_INV_status');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:430px;text-align:left;"><input type="text" id="expj-AH0050010-AH0050010form1-w_INV_status" name="w_INV_status" class="AH0050010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0050010Struct.getw_INV_status()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AH0050010-AH0050010form1-h_JOB_ODR_CD_STOCK_flg" name="h_JOB_ODR_CD_STOCK_flg" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0050010Struct.geth_JOB_ODR_CD_STOCK_flg()) %>">
<script class="expj-script-AH0050010-AH0050010form1-h_JOB_ODR_CD_STOCK_flg">
expj.AH0050010.AH0050010form1.h_JOB_ODR_CD_STOCK_flg = {};
expj.AH0050010.AH0050010form1.h_JOB_ODR_CD_STOCK_flg.executeAllOnDecision = function () {
  console.log('execute AH0050010form1/h_JOB_ODR_CD_STOCK_flg.onDecision');
  expj.AH0050010.AH0050010form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050010form1.h_JOB_ODR_CD_STOCK_flg.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010form1-h_JOB_ODR_CD_STOCK_flg').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050010form1', 'h_JOB_ODR_CD_STOCK_flg', this);
  });
  expj.AH0050010.AH0050010form1.h_JOB_ODR_CD_STOCK_flg.executePScriptOnLoad();
};

expj.AH0050010.AH0050010form1.h_JOB_ODR_CD_STOCK_flg.executePScriptOnLoad = function () {
  console.log('execute AH0050010form1/h_JOB_ODR_CD_STOCK_flg.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010form1-h_JOB_ODR_CD_STOCK_flg');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AH0050010-AH0050010form1-h_lotCtrl" name="h_lotCtrl" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0050010Struct.geth_lotCtrl()) %>">
<script class="expj-script-AH0050010-AH0050010form1-h_lotCtrl">
expj.AH0050010.AH0050010form1.h_lotCtrl = {};
expj.AH0050010.AH0050010form1.h_lotCtrl.executeAllOnDecision = function () {
  console.log('execute AH0050010form1/h_lotCtrl.onDecision');
  expj.AH0050010.AH0050010form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050010form1.h_lotCtrl.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010form1-h_lotCtrl').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050010form1', 'h_lotCtrl', this);
  });
  expj.AH0050010.AH0050010form1.h_lotCtrl.executePScriptOnLoad();
};

expj.AH0050010.AH0050010form1.h_lotCtrl.executePScriptOnLoad = function () {
  console.log('execute AH0050010form1/h_lotCtrl.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010form1-h_lotCtrl');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AH0050010-AH0050010form1-h_APR_INV_CTRL" name="h_APR_INV_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0050010Struct.geth_APR_INV_CTRL()) %>">
<script class="expj-script-AH0050010-AH0050010form1-h_APR_INV_CTRL">
expj.AH0050010.AH0050010form1.h_APR_INV_CTRL = {};
expj.AH0050010.AH0050010form1.h_APR_INV_CTRL.executeAllOnDecision = function () {
  console.log('execute AH0050010form1/h_APR_INV_CTRL.onDecision');
  expj.AH0050010.AH0050010form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050010form1.h_APR_INV_CTRL.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010form1-h_APR_INV_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050010form1', 'h_APR_INV_CTRL', this);
  });
  expj.AH0050010.AH0050010form1.h_APR_INV_CTRL.executePScriptOnLoad();
};

expj.AH0050010.AH0050010form1.h_APR_INV_CTRL.executePScriptOnLoad = function () {
  console.log('execute AH0050010form1/h_APR_INV_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010form1-h_APR_INV_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AH0050010-AH0050010form1-h_change_flg" name="h_change_flg" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0050010Struct.geth_change_flg()) %>">
<script class="expj-script-AH0050010-AH0050010form1-h_change_flg">
expj.AH0050010.AH0050010form1.h_change_flg = {};
expj.AH0050010.AH0050010form1.h_change_flg.executeAllOnDecision = function () {
  console.log('execute AH0050010form1/h_change_flg.onDecision');
  expj.AH0050010.AH0050010form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050010form1.h_change_flg.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010form1-h_change_flg').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050010form1', 'h_change_flg', this);
  });
  expj.AH0050010.AH0050010form1.h_change_flg.executePScriptOnLoad();
};

expj.AH0050010.AH0050010form1.h_change_flg.executePScriptOnLoad = function () {
  console.log('execute AH0050010form1/h_change_flg.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010form1-h_change_flg');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WH_CD",rb)%></span><!-- 保管区コード --></div><!--/td-->
<script class="expj-script-AH0050010-AH0050010form1-WH_CD">
expj.AH0050010.AH0050010form1.WH_CD = {};
expj.AH0050010.AH0050010form1.WH_CD.executeAllOnDecision = function () {
  console.log('execute AH0050010form1/WH_CD.onDecision');
  expj.AH0050010.AH0050010form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050010form1.WH_CD.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010form1-WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050010form1', 'WH_CD', this);
  });
  expj.AH0050010.AH0050010form1.WH_CD.executePScriptOnLoad();
};

expj.AH0050010.AH0050010form1.WH_CD.executePScriptOnLoad = function () {
  console.log('execute AH0050010form1/WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010form1-WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AH0050010-AH0050010form1-WH_CD" name="WH_CD" class="AH0050010-focus-move  required-value expj-AH0050010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0050010Struct.getWH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AH0050010-AH0050010form1-PeekerWH_CD">
expj.AH0050010.AH0050010form1.PeekerWH_CD = {};
// script1="onClick;0;PEEKER;_AH0050010form1/WH_CD@<%=contextNo%>"
expj.AH0050010.AH0050010form1.PeekerWH_CD.onClick0 = function () {
  console.log('PeekerWH_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AH0050010';
var parameterValues = 'PeekerWH_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AH0050010', 'PeekerWH_CD', 'SQLPARAM_1', '<%=aAH0050010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010form1', '_AH0050010form1/WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AH0050010form1/WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AH0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AH0050010.AH0050010form1.PeekerWH_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0050010.AH0050010form1.PeekerWH_CD['onClick' + i])) {
        expj.AH0050010.AH0050010form1.PeekerWH_CD['onClick' + i]();
      }
    }
  }
};
expj.AH0050010.AH0050010form1.PeekerWH_CD.executeAllOnDecision = function () {
};
expj.AH0050010.AH0050010form1.PeekerWH_CD.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010form1-PeekerWH_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0050010', 'AH0050010form1', 'PeekerWH_CD', this, 'Button');
    }
  });
  expj.AH0050010.AH0050010form1.PeekerWH_CD.executePScriptOnLoad();
};

expj.AH0050010.AH0050010form1.PeekerWH_CD.executePScriptOnLoad = function () {
  console.log('execute AH0050010form1/PeekerWH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010form1-PeekerWH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AH0050010-AH0050010form1-PeekerWH_CD" class="AH0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AH0050010-AH0050010form1-WH_NAME">
expj.AH0050010.AH0050010form1.WH_NAME = {};
expj.AH0050010.AH0050010form1.WH_NAME.executeAllOnDecision = function () {
  console.log('execute AH0050010form1/WH_NAME.onDecision');
  expj.AH0050010.AH0050010form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050010form1.WH_NAME.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010form1-WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050010form1', 'WH_NAME', this);
  });
  expj.AH0050010.AH0050010form1.WH_NAME.executePScriptOnLoad();
};

expj.AH0050010.AH0050010form1.WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AH0050010form1/WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010form1-WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AH0050010-AH0050010form1-WH_NAME" name="WH_NAME" class="AH0050010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0050010Struct.getWH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AH0050010-AH0050010form1-h_APRR_FLG" name="h_APRR_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0050010Struct.geth_APRR_FLG()) %>">
<script class="expj-script-AH0050010-AH0050010form1-h_APRR_FLG">
expj.AH0050010.AH0050010form1.h_APRR_FLG = {};
expj.AH0050010.AH0050010form1.h_APRR_FLG.executeAllOnDecision = function () {
  console.log('execute AH0050010form1/h_APRR_FLG.onDecision');
  expj.AH0050010.AH0050010form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050010form1.h_APRR_FLG.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010form1-h_APRR_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050010form1', 'h_APRR_FLG', this);
  });
  expj.AH0050010.AH0050010form1.h_APRR_FLG.executePScriptOnLoad();
};

expj.AH0050010.AH0050010form1.h_APRR_FLG.executePScriptOnLoad = function () {
  console.log('execute AH0050010form1/h_APRR_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010form1-h_APRR_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AH0050010-AH0050010form1-w_ITEM_CD">
expj.AH0050010.AH0050010form1.w_ITEM_CD = {};
expj.AH0050010.AH0050010form1.w_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AH0050010form1/w_ITEM_CD.onDecision');
  expj.AH0050010.AH0050010form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050010form1.w_ITEM_CD.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010form1-w_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050010form1', 'w_ITEM_CD', this);
  });
  expj.AH0050010.AH0050010form1.w_ITEM_CD.executePScriptOnLoad();
};

expj.AH0050010.AH0050010form1.w_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AH0050010form1/w_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010form1-w_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AH0050010-AH0050010form1-w_ITEM_CD" name="w_ITEM_CD" class="AH0050010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAH0050010Struct.getw_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AH0050010-AH0050010form1-Peekerw_ITEM_CD">
expj.AH0050010.AH0050010form1.Peekerw_ITEM_CD = {};
// script1="onClick;0;PEEKER;_AH0050010form1/w_ITEM_CD@<%=contextNo%>"
expj.AH0050010.AH0050010form1.Peekerw_ITEM_CD.onClick0 = function () {
  console.log('Peekerw_ITEM_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AH0050010';
var parameterValues = 'Peekerw_ITEM_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010form1', '_AH0050010form1/w_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AH0050010form1/w_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AH0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AH0050010.AH0050010form1.Peekerw_ITEM_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0050010.AH0050010form1.Peekerw_ITEM_CD['onClick' + i])) {
        expj.AH0050010.AH0050010form1.Peekerw_ITEM_CD['onClick' + i]();
      }
    }
  }
};
expj.AH0050010.AH0050010form1.Peekerw_ITEM_CD.executeAllOnDecision = function () {
};
expj.AH0050010.AH0050010form1.Peekerw_ITEM_CD.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010form1-Peekerw_ITEM_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0050010', 'AH0050010form1', 'Peekerw_ITEM_CD', this, 'Button');
    }
  });
  expj.AH0050010.AH0050010form1.Peekerw_ITEM_CD.executePScriptOnLoad();
};

expj.AH0050010.AH0050010form1.Peekerw_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AH0050010form1/Peekerw_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010form1-Peekerw_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AH0050010-AH0050010form1-Peekerw_ITEM_CD" class="AH0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_LOT_CD",rb)%></span><!-- 在庫ロット番号 --></div><!--/td-->
<script class="expj-script-AH0050010-AH0050010form1-LOT_NO_form">
expj.AH0050010.AH0050010form1.LOT_NO_form = {};
expj.AH0050010.AH0050010form1.LOT_NO_form.executeAllOnDecision = function () {
  console.log('execute AH0050010form1/LOT_NO_form.onDecision');
  expj.AH0050010.AH0050010form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050010form1.LOT_NO_form.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010form1-LOT_NO_form').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050010form1', 'LOT_NO_form', this);
  });
  expj.AH0050010.AH0050010form1.LOT_NO_form.executePScriptOnLoad();
};

expj.AH0050010.AH0050010form1.LOT_NO_form.executePScriptOnLoad = function () {
  console.log('execute AH0050010form1/LOT_NO_form.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010form1-LOT_NO_form');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AH0050010-AH0050010form1-LOT_NO_form" name="LOT_NO_form" class="AH0050010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAH0050010Struct.getLOT_NO_form()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AH0050010-AH0050010form1-Peekerw_STOCK_LOT_CD">
expj.AH0050010.AH0050010form1.Peekerw_STOCK_LOT_CD = {};
// script1="onClick;0;PEEKER;_AH0050010form1/LOT_NO_form:_AH0050010form1/w_ITEM_CD:_AH0050010form1/WH_CD@<%=contextNo%>"
expj.AH0050010.AH0050010form1.Peekerw_STOCK_LOT_CD.onClick0 = function () {
  console.log('Peekerw_STOCK_LOT_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AH0050010';
var parameterValues = 'Peekerw_STOCK_LOT_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010form1', '_AH0050010form1/LOT_NO_form') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010form1', '_AH0050010form1/w_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_3%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010form1', '_AH0050010form1/WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%LOT_NO_12%&%';
parameterValues += 'TARGET_FIELD%=%_AH0050010form1/LOT_NO_form:_AH0050010form1/w_ITEM_CD:_AH0050010form1/WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AH0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AH0050010.AH0050010form1.Peekerw_STOCK_LOT_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0050010.AH0050010form1.Peekerw_STOCK_LOT_CD['onClick' + i])) {
        expj.AH0050010.AH0050010form1.Peekerw_STOCK_LOT_CD['onClick' + i]();
      }
    }
  }
};
expj.AH0050010.AH0050010form1.Peekerw_STOCK_LOT_CD.executeAllOnDecision = function () {
};
expj.AH0050010.AH0050010form1.Peekerw_STOCK_LOT_CD.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010form1-Peekerw_STOCK_LOT_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0050010', 'AH0050010form1', 'Peekerw_STOCK_LOT_CD', this, 'Button');
    }
  });
  expj.AH0050010.AH0050010form1.Peekerw_STOCK_LOT_CD.executePScriptOnLoad();
};

expj.AH0050010.AH0050010form1.Peekerw_STOCK_LOT_CD.executePScriptOnLoad = function () {
  console.log('execute AH0050010form1/Peekerw_STOCK_LOT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010form1-Peekerw_STOCK_LOT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AH0050010-AH0050010form1-Peekerw_STOCK_LOT_CD" class="AH0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AH0050010-AH0050010form1-JOB_ODR_CD">
expj.AH0050010.AH0050010form1.JOB_ODR_CD = {};
expj.AH0050010.AH0050010form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AH0050010form1/JOB_ODR_CD.onDecision');
  expj.AH0050010.AH0050010form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050010form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050010form1', 'JOB_ODR_CD', this);
  });
  expj.AH0050010.AH0050010form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AH0050010.AH0050010form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AH0050010form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AH0050010-AH0050010form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AH0050010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAH0050010Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AH0050010-AH0050010form1-PeekerJOB_ODR_CD">
expj.AH0050010.AH0050010form1.PeekerJOB_ODR_CD = {};
// script1="onClick;0;PEEKER;_AH0050010form1/JOB_ODR_CD@<%=contextNo%>"
expj.AH0050010.AH0050010form1.PeekerJOB_ODR_CD.onClick0 = function () {
  console.log('PeekerJOB_ODR_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AH0050010';
var parameterValues = 'PeekerJOB_ODR_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010form1', '_AH0050010form1/JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_04%&%';
parameterValues += 'TARGET_FIELD%=%_AH0050010form1/JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AH0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AH0050010.AH0050010form1.PeekerJOB_ODR_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0050010.AH0050010form1.PeekerJOB_ODR_CD['onClick' + i])) {
        expj.AH0050010.AH0050010form1.PeekerJOB_ODR_CD['onClick' + i]();
      }
    }
  }
};
expj.AH0050010.AH0050010form1.PeekerJOB_ODR_CD.executeAllOnDecision = function () {
};
expj.AH0050010.AH0050010form1.PeekerJOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010form1-PeekerJOB_ODR_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0050010', 'AH0050010form1', 'PeekerJOB_ODR_CD', this, 'Button');
    }
  });
  expj.AH0050010.AH0050010form1.PeekerJOB_ODR_CD.executePScriptOnLoad();
};

expj.AH0050010.AH0050010form1.PeekerJOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AH0050010form1/PeekerJOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010form1-PeekerJOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AH0050010-AH0050010form1-PeekerJOB_ODR_CD" class="AH0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<script class="expj-script-AH0050010-AH0050010form1-c_JOB_ODR_CD_STOCK_flg">
expj.AH0050010.AH0050010form1.c_JOB_ODR_CD_STOCK_flg = {};
// script1="onClick;0;CHK;_THIS[eq]true@*0,*2"
expj.AH0050010.AH0050010form1.c_JOB_ODR_CD_STOCK_flg.onClick0 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010form1', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script2="child;0;UNMASK;_AH0050010form1/JOB_ODR_CD@*1"
expj.AH0050010.AH0050010form1.c_JOB_ODR_CD_STOCK_flg.child0 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script2');
expj.common.pscript.setUnMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010form1/JOB_ODR_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script3="child;1;UNMASK;_AH0050010form1/PeekerJOB_ODR_CD@*5"
expj.AH0050010.AH0050010form1.c_JOB_ODR_CD_STOCK_flg.child1 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script3');
expj.common.pscript.setUnMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010form1/PeekerJOB_ODR_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script4="child;2;SET;_AH0050010form1/JOB_ODR_CD=@*3"
expj.AH0050010.AH0050010form1.c_JOB_ODR_CD_STOCK_flg.child2 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script4');
expj.common.pscript.setReferenceComponentValue('AH0050010', 'AH0050010form1', '_AH0050010form1/JOB_ODR_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;3;MASK;_AH0050010form1/JOB_ODR_CD@*4"
expj.AH0050010.AH0050010form1.c_JOB_ODR_CD_STOCK_flg.child3 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script5');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010form1/JOB_ODR_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script6="child;4;MASK;_AH0050010form1/PeekerJOB_ODR_CD@*7"
expj.AH0050010.AH0050010form1.c_JOB_ODR_CD_STOCK_flg.child4 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script6');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010form1/PeekerJOB_ODR_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child7)){this.child7();}}
};
// script7="child;5;SET;_AH0050010form1/LOT_NO_form=@*6"
expj.AH0050010.AH0050010form1.c_JOB_ODR_CD_STOCK_flg.child5 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script7');
expj.common.pscript.setReferenceComponentValue('AH0050010', 'AH0050010form1', '_AH0050010form1/LOT_NO_form', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script8="child;6;MASK;_AH0050010form1/LOT_NO_form@*9"
expj.AH0050010.AH0050010form1.c_JOB_ODR_CD_STOCK_flg.child6 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script8');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010form1/LOT_NO_form');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script9="child;7;CHK;_AH0050010form1/h_lotCtrl[eq]true@*8"
expj.AH0050010.AH0050010form1.c_JOB_ODR_CD_STOCK_flg.child7 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010form1', '_AH0050010form1/h_lotCtrl'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script10="child;8;UNMASK;_AH0050010form1/LOT_NO_form@*10"
expj.AH0050010.AH0050010form1.c_JOB_ODR_CD_STOCK_flg.child8 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script10');
expj.common.pscript.setUnMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010form1/LOT_NO_form');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child10)){this.child10();}}
};
// script11="child;9;MASK;_AH0050010form1/Peekerw_STOCK_LOT_CD"
expj.AH0050010.AH0050010form1.c_JOB_ODR_CD_STOCK_flg.child9 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script11');
expj.common.pscript.setMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010form1/Peekerw_STOCK_LOT_CD');
};
// script12="child;10;UNMASK;_AH0050010form1/Peekerw_STOCK_LOT_CD"
expj.AH0050010.AH0050010form1.c_JOB_ODR_CD_STOCK_flg.child10 = function () {
  console.log('c_JOB_ODR_CD_STOCK_flg script12');
expj.common.pscript.setUnMaskToReferenceComponent('AH0050010', 'AH0050010form1', '_AH0050010form1/Peekerw_STOCK_LOT_CD');
};
expj.AH0050010.AH0050010form1.c_JOB_ODR_CD_STOCK_flg.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0050010.AH0050010form1.c_JOB_ODR_CD_STOCK_flg['onClick' + i])) {
        expj.AH0050010.AH0050010form1.c_JOB_ODR_CD_STOCK_flg['onClick' + i]();
      }
    }
  }
};
expj.AH0050010.AH0050010form1.c_JOB_ODR_CD_STOCK_flg.executeAllOnDecision = function () {
  console.log('execute AH0050010form1/c_JOB_ODR_CD_STOCK_flg.onDecision');
  expj.AH0050010.AH0050010form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050010form1.c_JOB_ODR_CD_STOCK_flg.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010form1-c_JOB_ODR_CD_STOCK_flg').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0050010', 'AH0050010form1', 'c_JOB_ODR_CD_STOCK_flg', this, 'CheckBox');
    }
  });
  expj.AH0050010.AH0050010form1.c_JOB_ODR_CD_STOCK_flg.executePScriptOnLoad();
};

expj.AH0050010.AH0050010form1.c_JOB_ODR_CD_STOCK_flg.executePScriptOnLoad = function () {
  console.log('execute AH0050010form1/c_JOB_ODR_CD_STOCK_flg.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010form1-c_JOB_ODR_CD_STOCK_flg');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_JOB_ODR_CD_STOCK_flg" value="true" <%= ("true".equals(TypeConverter.convert(aAH0050010Struct.getc_JOB_ODR_CD_STOCK_flg())) || "1".equals(TypeConverter.convert(aAH0050010Struct.getc_JOB_ODR_CD_STOCK_flg())))?"checked=\"checked\"":"" %>  class="AH0050010-focus-move" id="expj-AH0050010-AH0050010form1-c_JOB_ODR_CD_STOCK_flg"><label for="expj-AH0050010-AH0050010form1-c_JOB_ODR_CD_STOCK_flg"><%=CoreTools.getRBString("Expj.Cmt0208",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_SAVE_DATE",rb)%></span><!-- 在庫退避日時 --></div><!--/td-->
<script class="expj-script-AH0050010-AH0050010form1-STOCK_SAVE_DATE">
expj.AH0050010.AH0050010form1.STOCK_SAVE_DATE = {};
expj.AH0050010.AH0050010form1.STOCK_SAVE_DATE.executeAllOnDecision = function () {
  console.log('execute AH0050010form1/STOCK_SAVE_DATE.onDecision');
  expj.AH0050010.AH0050010form1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050010form1.STOCK_SAVE_DATE.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010form1-STOCK_SAVE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050010form1', 'STOCK_SAVE_DATE', this);
  });
  expj.AH0050010.AH0050010form1.STOCK_SAVE_DATE.executePScriptOnLoad();
};

expj.AH0050010.AH0050010form1.STOCK_SAVE_DATE.executePScriptOnLoad = function () {
  console.log('execute AH0050010form1/STOCK_SAVE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010form1-STOCK_SAVE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AH0050010-AH0050010form1-STOCK_SAVE_DATE" name="STOCK_SAVE_DATE" class="AH0050010-focus-move  " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0050010Struct.getSTOCK_SAVE_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AH0050010-AH0050010button1">
expj.AH0050010.AH0050010button1 = {};
expj.AH0050010.AH0050010button1.executeAllOnDecision = function () {
  console.log('execute AH0050010button1.onDecision');
};
expj.AH0050010.AH0050010button1.executeOnLoad = function () {
  expj.AH0050010.AH0050010button1.executePScriptOnLoad();
};

expj.AH0050010.AH0050010button1.executePScriptOnLoad = function () {
  console.log('execute AH0050010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AH0050010-AH0050010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AH0050010-AH0050010button1-CsvImport">
expj.AH0050010.AH0050010button1.CsvImport = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AH0050010form1/*@AH0050010Servlet"
expj.AH0050010.AH0050010button1.CsvImport.onClick0 = function () {
  console.log('CsvImport script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0050010', 'AH0050010button1', '_AH0050010form1/*', 'AH0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0050010', response);
expj.common.changeBusinessScreenTab('AH0050010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AH0050010.AH0050010button1.CsvImport.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0050010.AH0050010button1.CsvImport['onClick' + i])) {
        expj.AH0050010.AH0050010button1.CsvImport['onClick' + i]();
      }
    }
  }
};
expj.AH0050010.AH0050010button1.CsvImport.executeAllOnDecision = function () {
};
expj.AH0050010.AH0050010button1.CsvImport.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010button1-CsvImport').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0050010', 'AH0050010button1', 'CsvImport', this, 'Button');
    }
  });
  expj.AH0050010.AH0050010button1.CsvImport.executePScriptOnLoad();
};

expj.AH0050010.AH0050010button1.CsvImport.executePScriptOnLoad = function () {
  console.log('execute AH0050010button1/CsvImport.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010button1-CsvImport');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0050010-AH0050010button1-CsvImport" name="CsvImport" class="AH0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvImport",rb)%></button><!-- CSV取込ボタン --></div><!--/td-->
<script class="expj-script-AH0050010-AH0050010button1-select">
expj.AH0050010.AH0050010button1.select = {};
// script1="onClick;0;CHK;1[eq]1@*0"
expj.AH0050010.AH0050010button1.select.onClick0 = function () {
  console.log('select script1');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_AH0050010form1/c_JOB_ODR_CD_STOCK_flg[eq]true@*1,*2"
expj.AH0050010.AH0050010button1.select.child0 = function () {
  console.log('select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010button1', '_AH0050010form1/c_JOB_ODR_CD_STOCK_flg'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;SET;_AH0050010form1/h_JOB_ODR_CD_STOCK_flg=1@*3"
expj.AH0050010.AH0050010button1.select.child1 = function () {
  console.log('select script3');
expj.common.pscript.setReferenceComponentValue('AH0050010', 'AH0050010button1', '_AH0050010form1/h_JOB_ODR_CD_STOCK_flg', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script4="child;2;SET;_AH0050010form1/h_JOB_ODR_CD_STOCK_flg=0@*3"
expj.AH0050010.AH0050010button1.select.child2 = function () {
  console.log('select script4');
expj.common.pscript.setReferenceComponentValue('AH0050010', 'AH0050010button1', '_AH0050010form1/h_JOB_ODR_CD_STOCK_flg', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;3;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AH0050010form1/*,_AH0050010view1/*@AH0050010Servlet"
expj.AH0050010.AH0050010button1.select.child3 = function () {
  console.log('select script5');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0050010', 'AH0050010button1', '_AH0050010form1/*,_AH0050010view1/*', 'AH0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0050010', response);
expj.common.updateBusinessScreenTab('AH0050010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AH0050010.AH0050010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0050010.AH0050010button1.select['onClick' + i])) {
        expj.AH0050010.AH0050010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AH0050010.AH0050010button1.select.executeAllOnDecision = function () {
};
expj.AH0050010.AH0050010button1.select.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0050010', 'AH0050010button1', 'select', this, 'Button');
    }
  });
  expj.AH0050010.AH0050010button1.select.executePScriptOnLoad();
};

expj.AH0050010.AH0050010button1.select.executePScriptOnLoad = function () {
  console.log('execute AH0050010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0050010-AH0050010button1-select" name="select" class="AH0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AH0050010-AH0050010view1">
expj.AH0050010.AH0050010view1 = {};
expj.AH0050010.AH0050010view1.executeAllOnClick = function () {
};
expj.AH0050010.AH0050010view1.executeAllOnDecision = function () {
  console.log('execute AH0050010view1.onDecision');
};
expj.AH0050010.AH0050010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AH0050010view1", "expj.AH0050010.AH0050010view1.executeAllOnClick");
%>
  expj.AH0050010.AH0050010view1.executePScriptOnLoad();
};

expj.AH0050010.AH0050010view1.executePScriptOnLoad = function () {
  console.log('execute AH0050010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AH0050010-AH0050010view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AH0050010view1_Id = "AH0050010view1";
 String AH0050010view1_select = "single";
 String AH0050010view1_sortable = "true";
 String AH0050010view1_resize = "true";
 String AH0050010view1_scroll = "true";
 StringBuffer AH0050010view1_HB = new StringBuffer();
 StringBuffer AH0050010view1_DB = new StringBuffer();
%>
<%
 AH0050010view1_select = "multi";
 AH0050010view1_sortable = "false";
 AH0050010view1_resize = "true";
 AH0050010view1_scroll = "true";
%>
<%
 AH0050010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AH0050010view1_sortable).append("}").append(",");
%>
    <script class="expj-script-AH0050010-AH0050010view1-ACTUAL_STOCK_QTY">
expj.AH0050010.AH0050010view1.ACTUAL_STOCK_QTY = {};
// script1="onDecision;0;CHK;1[eq]1@*0"
expj.AH0050010.AH0050010view1.ACTUAL_STOCK_QTY.onDecision0 = function () {
  console.log('ACTUAL_STOCK_QTY script1');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SET;_AH0050010form1/h_change_flg=1"
expj.AH0050010.AH0050010view1.ACTUAL_STOCK_QTY.child0 = function () {
  console.log('ACTUAL_STOCK_QTY script2');
expj.common.pscript.setReferenceComponentValue('AH0050010', 'AH0050010view1', '_AH0050010form1/h_change_flg', '1');
};
expj.AH0050010.AH0050010view1.ACTUAL_STOCK_QTY.executeAllOnClick = function () {
};
expj.AH0050010.AH0050010view1.ACTUAL_STOCK_QTY.executeAllOnDecision = function () {
  console.log('execute AH0050010view1/ACTUAL_STOCK_QTY.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0050010.AH0050010view1.ACTUAL_STOCK_QTY['onDecision' + i])) {
        expj.AH0050010.AH0050010view1.ACTUAL_STOCK_QTY['onDecision' + i]();
      }
    }
  }
  expj.AH0050010.AH0050010view1.executeAllOnDecision();
  expj.AH0050010.executeAllOnDecision();
};
expj.AH0050010.AH0050010view1.ACTUAL_STOCK_QTY.executeOnLoad = function () {
  $('.expj-AH0050010-AH0050010view1-ACTUAL_STOCK_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0050010', 'AH0050010view1', 'ACTUAL_STOCK_QTY', this);
  });
  expj.AH0050010.AH0050010view1.ACTUAL_STOCK_QTY.executePScriptOnLoad();
};

expj.AH0050010.AH0050010view1.ACTUAL_STOCK_QTY.executePScriptOnLoad = function () {
  console.log('execute AH0050010view1/ACTUAL_STOCK_QTY.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 
<%
AH0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'UNIT_QTY_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AH0050010view1_sortable).append("}").append(",");
AH0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AH0050010view1_sortable).append("}").append(",");
AH0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'MODIFY_COUNT_1', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AH0050010view1_sortable).append("}").append(",");
AH0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0050010view1_sortable).append("}").append(",");
AH0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0050010view1_sortable).append("}").append(",");
AH0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_LOT_CD",rb))).append("', 'name':'LOT_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0050010view1_sortable).append("}").append(",");
AH0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'w_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0050010view1_sortable).append("}").append(",");
AH0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.FINAL_BOOK_STOCK_QTY",rb))).append("', 'name':'FINAL_BOOK_STOCK_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AH0050010view1_sortable).append("}").append(",");
AH0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACTUAL_STOCK_QTY",rb))).append("', 'name':'ACTUAL_STOCK_QTY', 'class':'expj-tooltip expj-view-cell-textinput expj-align-right', 'sortable':").append(AH0050010view1_sortable).append("}").append(",");
AH0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_UNIT",rb))).append("', 'name':'STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0050010view1_sortable).append("}").append(",");
%>
<%
 int aAH0050010StructLength = aAH0050010Control.getListsize();
 final AH0050010Struct structBackup = aAH0050010Struct;
 aAH0050010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAH0050010StructLength; ++loopCount) {
  if((aAH0050010Struct = (AH0050010Struct) aAH0050010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAH0050010Struct", aAH0050010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AH0050010view1_DB.append("[");
 AH0050010view1_DB.append(loopCount);
 AH0050010view1_DB.append(",").append("'<span id=\"expj-AH0050010-AH0050010view1-UNIT_QTY_TYP-").append(loopCount).append("\" class=\"expj-label expj-AH0050010-AH0050010view1-UNIT_QTY_TYP\" data-name=\"UNIT_QTY_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0050010Struct.getUNIT_QTY_TYP())).append("</span>'");
 AH0050010view1_DB.append(",").append("'<span id=\"expj-AH0050010-AH0050010view1-MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AH0050010-AH0050010view1-MODIFY_COUNT\" data-name=\"MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0050010Struct.getMODIFY_COUNT())).append("</span>'");
 AH0050010view1_DB.append(",").append("'<span id=\"expj-AH0050010-AH0050010view1-MODIFY_COUNT_1-").append(loopCount).append("\" class=\"expj-label expj-AH0050010-AH0050010view1-MODIFY_COUNT_1\" data-name=\"MODIFY_COUNT_1\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0050010Struct.getMODIFY_COUNT_1())).append("</span>'");
 AH0050010view1_DB.append(",").append("'<span id=\"expj-AH0050010-AH0050010view1-ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AH0050010-AH0050010view1-ITEM_CD\" data-name=\"ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0050010Struct.getITEM_CD())).append("</span>'");
 AH0050010view1_DB.append(",").append("'<span id=\"expj-AH0050010-AH0050010view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AH0050010-AH0050010view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0050010Struct.getITEM_NAME())).append("</span>'");
 AH0050010view1_DB.append(",").append("'<span id=\"expj-AH0050010-AH0050010view1-LOT_NO-").append(loopCount).append("\" class=\"expj-label expj-AH0050010-AH0050010view1-LOT_NO\" data-name=\"LOT_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0050010Struct.getLOT_NO())).append("</span>'");
 AH0050010view1_DB.append(",").append("'<span id=\"expj-AH0050010-AH0050010view1-w_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AH0050010-AH0050010view1-w_JOB_ODR_CD\" data-name=\"w_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0050010Struct.getw_JOB_ODR_CD())).append("</span>'");
 AH0050010view1_DB.append(",").append("'<span id=\"expj-AH0050010-AH0050010view1-FINAL_BOOK_STOCK_QTY-").append(loopCount).append("\" class=\"expj-label expj-AH0050010-AH0050010view1-FINAL_BOOK_STOCK_QTY\" data-name=\"FINAL_BOOK_STOCK_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAH0050010Struct.getFINAL_BOOK_STOCK_QTY())).append("</span>'");
 AH0050010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AH0050010-AH0050010view1-ACTUAL_STOCK_QTY-").append(loopCount).append("\" class=\"expj-AH0050010-AH0050010view1-ACTUAL_STOCK_QTY AH0050010-focus-move\" data-name=\"ACTUAL_STOCK_QTY\" data-view=\"true\" maxlength=\"2147483647\" data-kind=\"").append(Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 1, Kind.FLOOR, ("1".equals(aAH0050010Struct.getUNIT_QTY_TYP())==true ? 0:4))).append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAH0050010Struct.getACTUAL_STOCK_QTY())).append("\">'");
 AH0050010view1_DB.append(",").append("'<span id=\"expj-AH0050010-AH0050010view1-STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AH0050010-AH0050010view1-STOCK_UNIT\" data-name=\"STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0050010Struct.getSTOCK_UNIT())).append("</span>'");
 AH0050010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAH0050010StructLength) {
   AH0050010view1_DB.append(",");
  }
 }
 aAH0050010Struct = structBackup;
 viewIdList.add(AH0050010view1_Id);
 viewSelectList.add(AH0050010view1_select);
 viewResizeList.add(AH0050010view1_resize);
 viewScrollList.add(AH0050010view1_scroll);
 viewHeaderDataList.add(AH0050010view1_HB);
 viewBodyDataList.add(AH0050010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AH0050010-AH0050010button2">
expj.AH0050010.AH0050010button2 = {};
expj.AH0050010.AH0050010button2.executeAllOnDecision = function () {
  console.log('execute AH0050010button2.onDecision');
};
expj.AH0050010.AH0050010button2.executeOnLoad = function () {
  expj.AH0050010.AH0050010button2.executePScriptOnLoad();
};

expj.AH0050010.AH0050010button2.executePScriptOnLoad = function () {
  console.log('execute AH0050010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AH0050010-AH0050010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AH0050010-AH0050010button2-update">
expj.AH0050010.AH0050010button2.update = {};
// script1="onClick;0;CHK;1[eq]1@*0"
expj.AH0050010.AH0050010button2.update.onClick0 = function () {
  console.log('update script1');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_AH0050010form1/c_JOB_ODR_CD_STOCK_flg[eq]true@*1,*2"
expj.AH0050010.AH0050010button2.update.child0 = function () {
  console.log('update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010button2', '_AH0050010form1/c_JOB_ODR_CD_STOCK_flg'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;SET;_AH0050010form1/h_JOB_ODR_CD_STOCK_flg=1@*3"
expj.AH0050010.AH0050010button2.update.child1 = function () {
  console.log('update script3');
expj.common.pscript.setReferenceComponentValue('AH0050010', 'AH0050010button2', '_AH0050010form1/h_JOB_ODR_CD_STOCK_flg', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script4="child;2;SET;_AH0050010form1/h_JOB_ODR_CD_STOCK_flg=0@*3"
expj.AH0050010.AH0050010button2.update.child2 = function () {
  console.log('update script4');
expj.common.pscript.setReferenceComponentValue('AH0050010', 'AH0050010button2', '_AH0050010form1/h_JOB_ODR_CD_STOCK_flg', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;3;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AH0050010form1/*,_AH0050010view1/*@AH0050010Servlet,,$ZZ07003"
expj.AH0050010.AH0050010button2.update.child3 = function () {
  console.log('update script5');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0050010', 'AH0050010button2', '_AH0050010form1/*,_AH0050010view1/*', 'AH0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0050010', response);
expj.common.updateBusinessScreenTab('AH0050010', contents);
};
expj.common.pscript.callConfirm('AH0050010', 'AH0050010button2', 'ZZ07003', okEvent);
};
expj.AH0050010.AH0050010button2.update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0050010.AH0050010button2.update['onClick' + i])) {
        expj.AH0050010.AH0050010button2.update['onClick' + i]();
      }
    }
  }
};
expj.AH0050010.AH0050010button2.update.executeAllOnDecision = function () {
};
expj.AH0050010.AH0050010button2.update.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010button2-update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0050010', 'AH0050010button2', 'update', this, 'Button');
    }
  });
  expj.AH0050010.AH0050010button2.update.executePScriptOnLoad();
};

expj.AH0050010.AH0050010button2.update.executePScriptOnLoad = function () {
  console.log('execute AH0050010button2/update.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010button2-update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0050010-AH0050010button2-update" name="update" class="AH0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdateAll",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-AH0050010-AH0050010button2-append">
expj.AH0050010.AH0050010button2.append = {};
// script1="onClick;0;CHK;1[eq]1@*0"
expj.AH0050010.AH0050010button2.append.onClick0 = function () {
  console.log('append script1');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_AH0050010form1/c_JOB_ODR_CD_STOCK_flg[eq]true@*1,*2"
expj.AH0050010.AH0050010button2.append.child0 = function () {
  console.log('append script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010button2', '_AH0050010form1/c_JOB_ODR_CD_STOCK_flg'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;SET;_AH0050010form1/h_JOB_ODR_CD_STOCK_flg=1@*3"
expj.AH0050010.AH0050010button2.append.child1 = function () {
  console.log('append script3');
expj.common.pscript.setReferenceComponentValue('AH0050010', 'AH0050010button2', '_AH0050010form1/h_JOB_ODR_CD_STOCK_flg', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script4="child;2;SET;_AH0050010form1/h_JOB_ODR_CD_STOCK_flg=0@*3"
expj.AH0050010.AH0050010button2.append.child2 = function () {
  console.log('append script4');
expj.common.pscript.setReferenceComponentValue('AH0050010', 'AH0050010button2', '_AH0050010form1/h_JOB_ODR_CD_STOCK_flg', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;3;CHK;_AH0050010form1/h_change_flg[eq]1@*5,*4"
expj.AH0050010.AH0050010button2.append.child3 = function () {
  console.log('append script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0050010', 'AH0050010button2', '_AH0050010form1/h_change_flg'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;4;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AH0050010form1/*,_AH0050010view1/*@AH0050010Servlet"
expj.AH0050010.AH0050010button2.append.child4 = function () {
  console.log('append script6');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0050010', 'AH0050010button2', '_AH0050010form1/*,_AH0050010view1/*', 'AH0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0050010', response);
expj.common.changeBusinessScreenTab('AH0050010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script7="child;5;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AH0050010form1/*,_AH0050010view1/*@AH0050010Servlet,,$AH90003"
expj.AH0050010.AH0050010button2.append.child5 = function () {
  console.log('append script7');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0050010', 'AH0050010button2', '_AH0050010form1/*,_AH0050010view1/*', 'AH0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0050010', response);
expj.common.changeBusinessScreenTab('AH0050010', contents);
};
expj.common.pscript.callConfirm('AH0050010', 'AH0050010button2', 'AH90003', okEvent);
};
expj.AH0050010.AH0050010button2.append.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0050010.AH0050010button2.append['onClick' + i])) {
        expj.AH0050010.AH0050010button2.append['onClick' + i]();
      }
    }
  }
};
expj.AH0050010.AH0050010button2.append.executeAllOnDecision = function () {
};
expj.AH0050010.AH0050010button2.append.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010button2-append').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0050010', 'AH0050010button2', 'append', this, 'Button');
    }
  });
  expj.AH0050010.AH0050010button2.append.executePScriptOnLoad();
};

expj.AH0050010.AH0050010button2.append.executePScriptOnLoad = function () {
  console.log('execute AH0050010button2/append.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010button2-append');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0050010-AH0050010button2-append" name="append" class="AH0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsert",rb)%></button><!-- 行追加ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame17" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 200px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AH0050010 Revision: 1.4  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AH0050010-AH0050010button0">
expj.AH0050010.AH0050010button0 = {};
expj.AH0050010.AH0050010button0.executeAllOnDecision = function () {
  console.log('execute AH0050010button0.onDecision');
};
expj.AH0050010.AH0050010button0.executeOnLoad = function () {
  expj.AH0050010.AH0050010button0.executePScriptOnLoad();
};

expj.AH0050010.AH0050010button0.executePScriptOnLoad = function () {
  console.log('execute AH0050010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AH0050010-AH0050010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AH0050010-AH0050010button0-clear">
expj.AH0050010.AH0050010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AH0050010form1/*,_AH0050010view1/*@AH0050010Servlet,,$ZZ07008"
expj.AH0050010.AH0050010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0050010', 'AH0050010button0', '_AH0050010form1/*,_AH0050010view1/*', 'AH0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0050010', response);
expj.common.updateBusinessScreenTab('AH0050010', contents);
};
expj.common.pscript.callConfirm('AH0050010', 'AH0050010button0', 'ZZ07008', okEvent);
};
expj.AH0050010.AH0050010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0050010.AH0050010button0.clear['onClick' + i])) {
        expj.AH0050010.AH0050010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AH0050010.AH0050010button0.clear.executeAllOnDecision = function () {
};
expj.AH0050010.AH0050010button0.clear.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0050010', 'AH0050010button0', 'clear', this, 'Button');
    }
  });
  expj.AH0050010.AH0050010button0.clear.executePScriptOnLoad();
};

expj.AH0050010.AH0050010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AH0050010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0050010-AH0050010button0-clear" name="clear" class="AH0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AH0050010-AH0050010button0-close">
expj.AH0050010.AH0050010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AH0050010.AH0050010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AH0050010');
};
expj.AH0050010.AH0050010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0050010.AH0050010button0.close['onClick' + i])) {
        expj.AH0050010.AH0050010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AH0050010.AH0050010button0.close.executeAllOnDecision = function () {
};
expj.AH0050010.AH0050010button0.close.executeOnLoad = function () {
  $('#expj-AH0050010-AH0050010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0050010', 'AH0050010button0', 'close', this, 'Button');
    }
  });
  expj.AH0050010.AH0050010button0.close.executePScriptOnLoad();
};

expj.AH0050010.AH0050010button0.close.executePScriptOnLoad = function () {
  console.log('execute AH0050010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AH0050010-AH0050010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0050010-AH0050010button0-close" name="close" class="AH0050010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AH0050010 (END)-->
<%
MessageStruct msgStruct = aAH0050010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AH0050010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AH0050010)) {
  expj.common.treeInstanceMap.AH0050010 = {};
}
expj.common.treeInstanceMap.AH0050010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AH0050010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AH0050010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AH0050010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AH0050010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AH0050010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AH0050010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AH0050010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AH0050010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AH0050010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AH0050010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0050010)) {
  expj.common.detailDialogMap.AH0050010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0050010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AH0050010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0050010.<%=detailId %>)) {
  expj.common.detailDialogMap.AH0050010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0050010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AH0050010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0050010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AH0050010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AH0050010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AH0050010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AH0050010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AH0050010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AH0050010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AH0050010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AH0050010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AH0050010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AH0050010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AH0050010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AH0050010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AH0050010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AH0050010)) {
  expj.common.viewInstanceMap.AH0050010 = {};
}
expj.common.viewInstanceMap.AH0050010.<%=viewId %> = {};
expj.common.viewInstanceMap.AH0050010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AH0050010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AH0050010.<%=viewId %>.init = function () {
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
    expj.AH0050010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AH0050010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AH0050010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AH0050010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AH0050010_init">
/**
 * AH0050010用のロード完了時初期化関数
 */
expj.AH0050010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AH0050010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AH0050010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AH0050010');
  expj.common.calendarInstanceMap.AH0050010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AH0050010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AH0050010.<%=detailId %>.init();
  expj.common.detailDialogMap.AH0050010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AH0050010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AH0050010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AH0050010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AH0050010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AH0050010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AH0050010-<%=detailId %>');
<%
 }
%>
  try{expj.AH0050010.AH0050010form1.INV_DATE.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010form1.w_INV_status.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010form1.h_JOB_ODR_CD_STOCK_flg.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010form1.h_lotCtrl.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010form1.h_APR_INV_CTRL.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010form1.h_change_flg.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010form1.WH_CD.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010form1.PeekerWH_CD.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010form1.WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010form1.h_APRR_FLG.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010form1.w_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010form1.Peekerw_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010form1.LOT_NO_form.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010form1.Peekerw_STOCK_LOT_CD.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010form1.PeekerJOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010form1.c_JOB_ODR_CD_STOCK_flg.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010form1.STOCK_SAVE_DATE.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010button1.CsvImport.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010button1.select.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010view1.ACTUAL_STOCK_QTY.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010button2.update.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010button2.append.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010button0.close.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010form1.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010button1.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010view1.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010button2.executeOnLoad();}catch(e){};
  try{expj.AH0050010.AH0050010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AH0050010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AH0050010', 'AH0050010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AH0050010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AH0050010-focus-move');
  // 初期フォーカス当てる処理
  $('.AH0050010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AH0050010', '<%=request.getContextPath() %>');
};

/**
 * AH0050010の全体onDecision処理
 */
expj.AH0050010.executeAllOnDecision = function () {
  expj.AH0050010.AH0050010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AH0050010_console">
expj.AH0050010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>