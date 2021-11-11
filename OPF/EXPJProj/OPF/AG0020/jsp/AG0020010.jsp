<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:41:03 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AG0020\AG0020010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AG0020.*" %>
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
<jsp:useBean id="aAG0020010Control" class="com.nec.jp.orteus.metamorBase.AG0020.AG0020010Control" scope="request"/>
<jsp:useBean id="aAG0020010Struct" class="com.nec.jp.orteus.metamorBase.AG0020.AG0020010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

入出庫一覧
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0020/jsp/AG0020010.jsp,v $
$Author: geng-jia $	
$Revision: 1.17 $ $Date: 2017/02/22 02:05:57 $
********************************************************* --%>
<html>
<head>
<title>入出庫一覧</title>
<%@include file="common/expj_v5.jsp" %>
<%
ScreenMoveUtil suAG0070 = new ScreenMoveUtil("AG0070010Servlet", so);
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
<script class="expj-script-AG0020010_init">
  // AG0020010名前空間
  expj.AG0020010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AG0020010" data-screen="AG0020010" data-newdata="<%=aAG0020010Control.isNewData() %>">
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
              <script class="expj-script-AG0020010-AG0020010form1">
expj.AG0020010.AG0020010form1 = {};
// script1="onLoad;0;CALL;child@0,5"
expj.AG0020010.AG0020010form1.onLoad0 = function () {
  console.log('AG0020010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child5)){this.child5();}
};
// script2="child;0;CHK;_AG0020010form1/r_SELECT_CHOICE[eq]2@*1,*2"
expj.AG0020010.AG0020010form1.child0 = function () {
  console.log('AG0020010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '_AG0020010form1/r_SELECT_CHOICE'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;SET;_AG0020010form1/r_SELECT_CHOICE3=true"
expj.AG0020010.AG0020010form1.child1 = function () {
  console.log('AG0020010form1 script3');
expj.common.pscript.setReferenceComponentValue('AG0020010', 'AG0020010form1', '_AG0020010form1/r_SELECT_CHOICE3', 'true');
};
// script4="child;2;CHK;_AG0020010form1/r_SELECT_CHOICE[eq]1@*3,*4"
expj.AG0020010.AG0020010form1.child2 = function () {
  console.log('AG0020010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '_AG0020010form1/r_SELECT_CHOICE'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script5="child;3;SET;_AG0020010form1/r_SELECT_CHOICE2=true"
expj.AG0020010.AG0020010form1.child3 = function () {
  console.log('AG0020010form1 script5');
expj.common.pscript.setReferenceComponentValue('AG0020010', 'AG0020010form1', '_AG0020010form1/r_SELECT_CHOICE2', 'true');
};
// script6="child;4;SET;_AG0020010form1/r_SELECT_CHOICE1=true"
expj.AG0020010.AG0020010form1.child4 = function () {
  console.log('AG0020010form1 script6');
expj.common.pscript.setReferenceComponentValue('AG0020010', 'AG0020010form1', '_AG0020010form1/r_SELECT_CHOICE1', 'true');
};
// script7="onDecision;0;CHK;1[eq]1@*5"
expj.AG0020010.AG0020010form1.onDecision0 = function () {
  console.log('AG0020010form1 script7');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="child;5;CHK;?AG0020010form1/*[eq]NORMAL@*6,*19"
expj.AG0020010.AG0020010form1.child5 = function () {
  console.log('AG0020010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script9="child;6;CHK;?AG0020010form1/w_PLANT_CD[eq]SAME@*7,*19"
expj.AG0020010.AG0020010form1.child6 = function () {
  console.log('AG0020010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/w_PLANT_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script10="child;7;CHK;?AG0020010form1/w_FROM_DATE[eq]SAME@*8,*19"
expj.AG0020010.AG0020010form1.child7 = function () {
  console.log('AG0020010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/w_FROM_DATE'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script11="child;8;CHK;?AG0020010form1/w_TO_DATE[eq]SAME@*9,*19"
expj.AG0020010.AG0020010form1.child8 = function () {
  console.log('AG0020010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/w_TO_DATE'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script12="child;9;CHK;?AG0020010form1/w_ITEM_CD[eq]SAME@*10,*19"
expj.AG0020010.AG0020010form1.child9 = function () {
  console.log('AG0020010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/w_ITEM_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script13="child;10;CHK;?AG0020010form1/w_JOB_ODR_CD[eq]SAME@*11,*19"
expj.AG0020010.AG0020010form1.child10 = function () {
  console.log('AG0020010form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/w_JOB_ODR_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script14="child;11;CHK;?AG0020010form1/w_WH_CD[eq]SAME@*12,*19"
expj.AG0020010.AG0020010form1.child11 = function () {
  console.log('AG0020010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/w_WH_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script15="child;12;CHK;?AG0020010form1/w_VEND_CD[eq]SAME@*13,*19"
expj.AG0020010.AG0020010form1.child12 = function () {
  console.log('AG0020010form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/w_VEND_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script16="child;13;CHK;?AG0020010form1/w_LOT_NO[eq]SAME@*14,*19"
expj.AG0020010.AG0020010form1.child13 = function () {
  console.log('AG0020010form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/w_LOT_NO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script17="child;14;CHK;?AG0020010form1/r_SELECT_CHOICE1[eq]SAME@*15,*19"
expj.AG0020010.AG0020010form1.child14 = function () {
  console.log('AG0020010form1 script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/r_SELECT_CHOICE1'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script18="child;15;CHK;?AG0020010form1/r_SELECT_CHOICE2[eq]SAME@*16,*19"
expj.AG0020010.AG0020010form1.child15 = function () {
  console.log('AG0020010form1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/r_SELECT_CHOICE2'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script19="child;16;CHK;?AG0020010form1/r_SELECT_CHOICE3[eq]SAME@*17,*19"
expj.AG0020010.AG0020010form1.child16 = function () {
  console.log('AG0020010form1 script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/r_SELECT_CHOICE3'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script20="child;17;CHK;?AG0020010form1/l_check[eq]SAME@*18,*19"
expj.AG0020010.AG0020010form1.child17 = function () {
  console.log('AG0020010form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/l_check'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script21="child;18;UNMASK;_AG0020010button0/csv"
expj.AG0020010.AG0020010form1.child18 = function () {
  console.log('AG0020010form1 script21');
expj.common.pscript.setUnMaskToReferenceComponent('AG0020010', 'AG0020010form1', '_AG0020010button0/csv');
};
// script22="child;19;MASK;_AG0020010button0/csv"
expj.AG0020010.AG0020010form1.child19 = function () {
  console.log('AG0020010form1 script22');
expj.common.pscript.setMaskToReferenceComponent('AG0020010', 'AG0020010form1', '_AG0020010button0/csv');
};
// script23="onLoad;1;CALL;onDecision@1"
expj.AG0020010.AG0020010form1.onLoad1 = function () {
  console.log('AG0020010form1 script23');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script24="onDecision;1;CHK;1[eq]1@*20"
expj.AG0020010.AG0020010form1.onDecision1 = function () {
  console.log('AG0020010form1 script24');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
// script25="child;20;CHK;?AG0020010form1/*[eq]NORMAL@*21,*26"
expj.AG0020010.AG0020010form1.child20 = function () {
  console.log('AG0020010form1 script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
} else {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
}
};
// script26="child;21;CHKRQ;?AG0020010view1/?[neq]NOT_SELECTED@*22,*26"
expj.AG0020010.AG0020010form1.child21 = function () {
  console.log('AG0020010form1 script26');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
} else {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
}
};
// script27="child;22;CHK;?AG0020010form1/w_PLANT_CD[eq]SAME[and]?AG0020010form1/w_FROM_DATE[eq]SAME[and]?AG0020010form1/w_TO_DATE[eq]SAME[and]?AG0020010form1/w_ITEM_CD[eq]SAME[and]?AG0020010form1/w_JOB_ODR_CD[eq]SAME[and]?AG0020010form1/w_WH_CD[eq]SAME[and]?AG0020010form1/w_VEND_CD[eq]SAME[and]?AG0020010form1/r_SELECT_CHOICE1[eq]SAME[and]?AG0020010form1/r_SELECT_CHOICE2[eq]SAME[and]?AG0020010form1/r_SELECT_CHOICE3[eq]SAME[and]?AG0020010form1/l_check[eq]SAME[and]?AG0020010form1/w_LOT_NO[eq]SAME@*23,*26"
expj.AG0020010.AG0020010form1.child22 = function () {
  console.log('AG0020010form1 script27');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/w_PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/w_FROM_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/w_TO_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/w_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/w_JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/w_WH_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/w_VEND_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/r_SELECT_CHOICE1'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/r_SELECT_CHOICE2'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/r_SELECT_CHOICE3'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/l_check'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '?AG0020010form1/w_LOT_NO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
} else {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
}
};
// script28="child;23;CHK;_AG0020010form1/h_lotCtrl[eq]true@*24,*26"
expj.AG0020010.AG0020010form1.child23 = function () {
  console.log('AG0020010form1 script28');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '_AG0020010form1/h_lotCtrl'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
} else {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
}
};
// script29="child;24;SELCHK;AG0020010view1:_LOT_NO[neq]@*25,*26"
expj.AG0020010.AG0020010form1.child24 = function () {
  console.log('AG0020010form1 script29');
var selectCells = expj.common.pscript.getSelectedVIEWCells('AG0020010', 'AG0020010view1');
var checkFlg = true;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (!(expj.common.pscript.evaluate(cell.LOT_NO, '[neq]', ''))) {
checkFlg = false;
break;
}
}
if (checkFlg) {
if(expj.common.checkNameSpace(this.child25)){this.child25();}
} else {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
}
};
// script30="child;25;UNMASK;_AG0020010button2/SelectLotTraceRef"
expj.AG0020010.AG0020010form1.child25 = function () {
  console.log('AG0020010form1 script30');
expj.common.pscript.setUnMaskToReferenceComponent('AG0020010', 'AG0020010form1', '_AG0020010button2/SelectLotTraceRef');
};
// script31="child;26;MASK;_AG0020010button2/SelectLotTraceRef"
expj.AG0020010.AG0020010form1.child26 = function () {
  console.log('AG0020010form1 script31');
expj.common.pscript.setMaskToReferenceComponent('AG0020010', 'AG0020010form1', '_AG0020010button2/SelectLotTraceRef');
};
expj.AG0020010.AG0020010form1.executeAllOnDecision = function () {
  console.log('execute AG0020010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0020010.AG0020010form1['onDecision' + i])) {
        expj.AG0020010.AG0020010form1['onDecision' + i]();
      }
    }
  }
};
expj.AG0020010.AG0020010form1.executeOnLoad = function () {
  expj.AG0020010.AG0020010form1.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AG0020010.AG0020010form1['onLoad' + i])) {
      expj.AG0020010.AG0020010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AG0020010-AG0020010form1" action="AG0020010Servlet" name="AG0020010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAG0020010Control.getReadStatusString()) %>" style="height:188px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:188px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:20px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-w_PLANT_CD">
expj.AG0020010.AG0020010form1.w_PLANT_CD = {};
expj.AG0020010.AG0020010form1.w_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AG0020010form1/w_PLANT_CD.onDecision');
  expj.AG0020010.AG0020010form1.executeAllOnDecision();
  expj.AG0020010.executeAllOnDecision();
};
expj.AG0020010.AG0020010form1.w_PLANT_CD.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-w_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0020010', 'AG0020010form1', 'w_PLANT_CD', this);
  });
  expj.AG0020010.AG0020010form1.w_PLANT_CD.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.w_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/w_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-w_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0020010-AG0020010form1-w_PLANT_CD" name="w_PLANT_CD" class="AG0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0020010Struct.getw_PLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-PeekerPlantCd">
expj.AG0020010.AG0020010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AG0020010form1/w_PLANT_CD@<%=contextNo%>"
expj.AG0020010.AG0020010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AG0020010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '_AG0020010form1/w_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AG0020010form1/w_PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AG0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AG0020010.AG0020010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0020010.AG0020010form1.PeekerPlantCd['onClick' + i])) {
        expj.AG0020010.AG0020010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AG0020010.AG0020010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AG0020010.AG0020010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0020010', 'AG0020010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AG0020010.AG0020010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AG0020010-AG0020010form1-PeekerPlantCd" class="AG0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-w_PLANT_NAME">
expj.AG0020010.AG0020010form1.w_PLANT_NAME = {};
expj.AG0020010.AG0020010form1.w_PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AG0020010form1/w_PLANT_NAME.onDecision');
  expj.AG0020010.AG0020010form1.executeAllOnDecision();
  expj.AG0020010.executeAllOnDecision();
};
expj.AG0020010.AG0020010form1.w_PLANT_NAME.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-w_PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0020010', 'AG0020010form1', 'w_PLANT_NAME', this);
  });
  expj.AG0020010.AG0020010form1.w_PLANT_NAME.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.w_PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/w_PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-w_PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AG0020010-AG0020010form1-w_PLANT_NAME" name="w_PLANT_NAME" class="AG0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0020010Struct.getw_PLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WH_CD",rb)%></span><!-- 保管区コード --></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-w_WH_CD">
expj.AG0020010.AG0020010form1.w_WH_CD = {};
expj.AG0020010.AG0020010form1.w_WH_CD.executeAllOnDecision = function () {
  console.log('execute AG0020010form1/w_WH_CD.onDecision');
  expj.AG0020010.AG0020010form1.executeAllOnDecision();
  expj.AG0020010.executeAllOnDecision();
};
expj.AG0020010.AG0020010form1.w_WH_CD.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-w_WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0020010', 'AG0020010form1', 'w_WH_CD', this);
  });
  expj.AG0020010.AG0020010form1.w_WH_CD.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.w_WH_CD.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/w_WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-w_WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0020010-AG0020010form1-w_WH_CD" name="w_WH_CD" class="AG0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0020010Struct.getw_WH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-PeekerWWhCd">
expj.AG0020010.AG0020010form1.PeekerWWhCd = {};
// script1="onClick;0;PEEKER;_AG0020010form1/w_WH_CD@<%=contextNo%>"
expj.AG0020010.AG0020010form1.PeekerWWhCd.onClick0 = function () {
  console.log('PeekerWWhCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AG0020010';
var parameterValues = 'PeekerWWhCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '_AG0020010form1/w_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_5%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '_AG0020010form1/w_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_04%&%';
parameterValues += 'TARGET_FIELD%=%_AG0020010form1/w_WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AG0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AG0020010.AG0020010form1.PeekerWWhCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0020010.AG0020010form1.PeekerWWhCd['onClick' + i])) {
        expj.AG0020010.AG0020010form1.PeekerWWhCd['onClick' + i]();
      }
    }
  }
};
expj.AG0020010.AG0020010form1.PeekerWWhCd.executeAllOnDecision = function () {
};
expj.AG0020010.AG0020010form1.PeekerWWhCd.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-PeekerWWhCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0020010', 'AG0020010form1', 'PeekerWWhCd', this, 'Button');
    }
  });
  expj.AG0020010.AG0020010form1.PeekerWWhCd.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.PeekerWWhCd.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/PeekerWWhCd.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-PeekerWWhCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AG0020010-AG0020010form1-PeekerWWhCd" class="AG0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-w_WH_NAME">
expj.AG0020010.AG0020010form1.w_WH_NAME = {};
expj.AG0020010.AG0020010form1.w_WH_NAME.executeAllOnDecision = function () {
  console.log('execute AG0020010form1/w_WH_NAME.onDecision');
  expj.AG0020010.AG0020010form1.executeAllOnDecision();
  expj.AG0020010.executeAllOnDecision();
};
expj.AG0020010.AG0020010form1.w_WH_NAME.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-w_WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0020010', 'AG0020010form1', 'w_WH_NAME', this);
  });
  expj.AG0020010.AG0020010form1.w_WH_NAME.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.w_WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/w_WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-w_WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AG0020010-AG0020010form1-w_WH_NAME" name="w_WH_NAME" class="AG0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0020010Struct.getw_WH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AG0020010-AG0020010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAG0020010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AG0020010-AG0020010form1-DOWNLOAD_FILE">
expj.AG0020010.AG0020010form1.DOWNLOAD_FILE = {};
expj.AG0020010.AG0020010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AG0020010form1/DOWNLOAD_FILE.onDecision');
  expj.AG0020010.AG0020010form1.executeAllOnDecision();
  expj.AG0020010.executeAllOnDecision();
};
expj.AG0020010.AG0020010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0020010', 'AG0020010form1', 'DOWNLOAD_FILE', this);
  });
  expj.AG0020010.AG0020010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AG0020010-AG0020010form1-r_SELECT_CHOICE" name="r_SELECT_CHOICE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAG0020010Struct.getr_SELECT_CHOICE()) %>">
<script class="expj-script-AG0020010-AG0020010form1-r_SELECT_CHOICE">
expj.AG0020010.AG0020010form1.r_SELECT_CHOICE = {};
expj.AG0020010.AG0020010form1.r_SELECT_CHOICE.executeAllOnDecision = function () {
  console.log('execute AG0020010form1/r_SELECT_CHOICE.onDecision');
  expj.AG0020010.AG0020010form1.executeAllOnDecision();
  expj.AG0020010.executeAllOnDecision();
};
expj.AG0020010.AG0020010form1.r_SELECT_CHOICE.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-r_SELECT_CHOICE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0020010', 'AG0020010form1', 'r_SELECT_CHOICE', this);
  });
  expj.AG0020010.AG0020010form1.r_SELECT_CHOICE.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.r_SELECT_CHOICE.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/r_SELECT_CHOICE.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-r_SELECT_CHOICE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0482",rb)%></span><!-- 入出庫日 --></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-w_FROM_DATE">
expj.AG0020010.AG0020010form1.w_FROM_DATE = {};
expj.AG0020010.AG0020010form1.w_FROM_DATE.executeAllOnDecision = function () {
  console.log('execute AG0020010form1/w_FROM_DATE.onDecision');
  expj.AG0020010.AG0020010form1.executeAllOnDecision();
  expj.AG0020010.executeAllOnDecision();
};
expj.AG0020010.AG0020010form1.w_FROM_DATE.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-w_FROM_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0020010', 'AG0020010form1', 'w_FROM_DATE', this);
  });
  expj.AG0020010.AG0020010form1.w_FROM_DATE.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.w_FROM_DATE.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/w_FROM_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-w_FROM_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AG0020010-AG0020010form1-w_FROM_DATE" name="w_FROM_DATE" class="AG0020010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAG0020010Struct.getw_FROM_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-Calendarw_FROM_DATE">
expj.AG0020010.AG0020010form1.Calendarw_FROM_DATE = {};
// script1="onClick;0;CALENDAR;_AG0020010form1/w_FROM_DATE"
expj.AG0020010.AG0020010form1.Calendarw_FROM_DATE.onClick0 = function () {
  console.log('Calendarw_FROM_DATE script1');
expj.common.pscript.executeCalendar('AG0020010','AG0020010form1','_AG0020010form1/w_FROM_DATE');
};
expj.AG0020010.AG0020010form1.Calendarw_FROM_DATE.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0020010.AG0020010form1.Calendarw_FROM_DATE['onClick' + i])) {
        expj.AG0020010.AG0020010form1.Calendarw_FROM_DATE['onClick' + i]();
      }
    }
  }
};
expj.AG0020010.AG0020010form1.Calendarw_FROM_DATE.executeAllOnDecision = function () {
};
expj.AG0020010.AG0020010form1.Calendarw_FROM_DATE.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-Calendarw_FROM_DATE').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0020010', 'AG0020010form1', 'Calendarw_FROM_DATE', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AG0020010','AG0020010form1','_AG0020010form1/w_FROM_DATE');
  expj.AG0020010.AG0020010form1.Calendarw_FROM_DATE.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.Calendarw_FROM_DATE.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/Calendarw_FROM_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-Calendarw_FROM_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AG0020010-AG0020010form1-Calendarw_FROM_DATE" class="AG0020010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-w_TO_DATE">
expj.AG0020010.AG0020010form1.w_TO_DATE = {};
expj.AG0020010.AG0020010form1.w_TO_DATE.executeAllOnDecision = function () {
  console.log('execute AG0020010form1/w_TO_DATE.onDecision');
  expj.AG0020010.AG0020010form1.executeAllOnDecision();
  expj.AG0020010.executeAllOnDecision();
};
expj.AG0020010.AG0020010form1.w_TO_DATE.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-w_TO_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0020010', 'AG0020010form1', 'w_TO_DATE', this);
  });
  expj.AG0020010.AG0020010form1.w_TO_DATE.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.w_TO_DATE.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/w_TO_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-w_TO_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AG0020010-AG0020010form1-w_TO_DATE" name="w_TO_DATE" class="AG0020010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAG0020010Struct.getw_TO_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-Calendarw_TO_DATE">
expj.AG0020010.AG0020010form1.Calendarw_TO_DATE = {};
// script1="onClick;0;CALENDAR;_AG0020010form1/w_TO_DATE"
expj.AG0020010.AG0020010form1.Calendarw_TO_DATE.onClick0 = function () {
  console.log('Calendarw_TO_DATE script1');
expj.common.pscript.executeCalendar('AG0020010','AG0020010form1','_AG0020010form1/w_TO_DATE');
};
expj.AG0020010.AG0020010form1.Calendarw_TO_DATE.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0020010.AG0020010form1.Calendarw_TO_DATE['onClick' + i])) {
        expj.AG0020010.AG0020010form1.Calendarw_TO_DATE['onClick' + i]();
      }
    }
  }
};
expj.AG0020010.AG0020010form1.Calendarw_TO_DATE.executeAllOnDecision = function () {
};
expj.AG0020010.AG0020010form1.Calendarw_TO_DATE.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-Calendarw_TO_DATE').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0020010', 'AG0020010form1', 'Calendarw_TO_DATE', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AG0020010','AG0020010form1','_AG0020010form1/w_TO_DATE');
  expj.AG0020010.AG0020010form1.Calendarw_TO_DATE.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.Calendarw_TO_DATE.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/Calendarw_TO_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-Calendarw_TO_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-AG0020010-AG0020010form1-Calendarw_TO_DATE" class="AG0020010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0056",rb)%></span><!-- 表示対象 --></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-w_ITEM_CD">
expj.AG0020010.AG0020010form1.w_ITEM_CD = {};
expj.AG0020010.AG0020010form1.w_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AG0020010form1/w_ITEM_CD.onDecision');
  expj.AG0020010.AG0020010form1.executeAllOnDecision();
  expj.AG0020010.executeAllOnDecision();
};
expj.AG0020010.AG0020010form1.w_ITEM_CD.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-w_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0020010', 'AG0020010form1', 'w_ITEM_CD', this);
  });
  expj.AG0020010.AG0020010form1.w_ITEM_CD.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.w_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/w_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-w_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0020010-AG0020010form1-w_ITEM_CD" name="w_ITEM_CD" class="AG0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0020010Struct.getw_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-PeekerWItemCd">
expj.AG0020010.AG0020010form1.PeekerWItemCd = {};
// script1="onClick;0;PEEKER;_AG0020010form1/w_ITEM_CD@<%=contextNo%>"
expj.AG0020010.AG0020010form1.PeekerWItemCd.onClick0 = function () {
  console.log('PeekerWItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AG0020010';
var parameterValues = 'PeekerWItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '_AG0020010form1/w_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AG0020010form1/w_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AG0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AG0020010.AG0020010form1.PeekerWItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0020010.AG0020010form1.PeekerWItemCd['onClick' + i])) {
        expj.AG0020010.AG0020010form1.PeekerWItemCd['onClick' + i]();
      }
    }
  }
};
expj.AG0020010.AG0020010form1.PeekerWItemCd.executeAllOnDecision = function () {
};
expj.AG0020010.AG0020010form1.PeekerWItemCd.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-PeekerWItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0020010', 'AG0020010form1', 'PeekerWItemCd', this, 'Button');
    }
  });
  expj.AG0020010.AG0020010form1.PeekerWItemCd.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.PeekerWItemCd.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/PeekerWItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-PeekerWItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AG0020010-AG0020010form1-PeekerWItemCd" class="AG0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-w_ITEM_NAME">
expj.AG0020010.AG0020010form1.w_ITEM_NAME = {};
expj.AG0020010.AG0020010form1.w_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AG0020010form1/w_ITEM_NAME.onDecision');
  expj.AG0020010.AG0020010form1.executeAllOnDecision();
  expj.AG0020010.executeAllOnDecision();
};
expj.AG0020010.AG0020010form1.w_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-w_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0020010', 'AG0020010form1', 'w_ITEM_NAME', this);
  });
  expj.AG0020010.AG0020010form1.w_ITEM_NAME.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.w_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/w_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-w_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AG0020010-AG0020010form1-w_ITEM_NAME" name="w_ITEM_NAME" class="AG0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0020010Struct.getw_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-r_SELECT_CHOICE1">
expj.AG0020010.AG0020010form1.r_SELECT_CHOICE1 = {};
expj.AG0020010.AG0020010form1.r_SELECT_CHOICE1.executeAllOnDecision = function () {
  console.log('execute AG0020010form1/r_SELECT_CHOICE1.onDecision');
  expj.AG0020010.AG0020010form1.executeAllOnDecision();
  expj.AG0020010.executeAllOnDecision();
};
expj.AG0020010.AG0020010form1.r_SELECT_CHOICE1.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-r_SELECT_CHOICE1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0020010', 'AG0020010form1', 'r_SELECT_CHOICE1', this, 'RadioButton');
    }
  });
  expj.AG0020010.AG0020010form1.r_SELECT_CHOICE1.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.r_SELECT_CHOICE1.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/r_SELECT_CHOICE1.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-r_SELECT_CHOICE1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="radio" name="group1" data-name="r_SELECT_CHOICE1" value="true" <%= ("true".equals(TypeConverter.convert(aAG0020010Struct.getr_SELECT_CHOICE1())))?"checked=\"checked\"":"" %> class="" id="expj-AG0020010-AG0020010form1-r_SELECT_CHOICE1" ><label for="expj-AG0020010-AG0020010form1-r_SELECT_CHOICE1"><%=CoreTools.getRBString("Expj.Cmt0427",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-w_JOB_ODR_CD">
expj.AG0020010.AG0020010form1.w_JOB_ODR_CD = {};
expj.AG0020010.AG0020010form1.w_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AG0020010form1/w_JOB_ODR_CD.onDecision');
  expj.AG0020010.AG0020010form1.executeAllOnDecision();
  expj.AG0020010.executeAllOnDecision();
};
expj.AG0020010.AG0020010form1.w_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-w_JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0020010', 'AG0020010form1', 'w_JOB_ODR_CD', this);
  });
  expj.AG0020010.AG0020010form1.w_JOB_ODR_CD.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.w_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/w_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-w_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0020010-AG0020010form1-w_JOB_ODR_CD" name="w_JOB_ODR_CD" class="AG0020010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAG0020010Struct.getw_JOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-Peekerw_JOB_ODR_CD">
expj.AG0020010.AG0020010form1.Peekerw_JOB_ODR_CD = {};
// script1="onClick;0;PEEKER;_AG0020010form1/w_JOB_ODR_CD@<%=contextNo%>"
expj.AG0020010.AG0020010form1.Peekerw_JOB_ODR_CD.onClick0 = function () {
  console.log('Peekerw_JOB_ODR_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AG0020010';
var parameterValues = 'Peekerw_JOB_ODR_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '_AG0020010form1/w_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '_AG0020010form1/w_JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_4%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '_AG0020010form1/w_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_04%&%';
parameterValues += 'TARGET_FIELD%=%_AG0020010form1/w_JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AG0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AG0020010.AG0020010form1.Peekerw_JOB_ODR_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0020010.AG0020010form1.Peekerw_JOB_ODR_CD['onClick' + i])) {
        expj.AG0020010.AG0020010form1.Peekerw_JOB_ODR_CD['onClick' + i]();
      }
    }
  }
};
expj.AG0020010.AG0020010form1.Peekerw_JOB_ODR_CD.executeAllOnDecision = function () {
};
expj.AG0020010.AG0020010form1.Peekerw_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-Peekerw_JOB_ODR_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0020010', 'AG0020010form1', 'Peekerw_JOB_ODR_CD', this, 'Button');
    }
  });
  expj.AG0020010.AG0020010form1.Peekerw_JOB_ODR_CD.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.Peekerw_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/Peekerw_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-Peekerw_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AG0020010-AG0020010form1-Peekerw_JOB_ODR_CD" class="AG0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-r_SELECT_CHOICE2">
expj.AG0020010.AG0020010form1.r_SELECT_CHOICE2 = {};
expj.AG0020010.AG0020010form1.r_SELECT_CHOICE2.executeAllOnDecision = function () {
  console.log('execute AG0020010form1/r_SELECT_CHOICE2.onDecision');
  expj.AG0020010.AG0020010form1.executeAllOnDecision();
  expj.AG0020010.executeAllOnDecision();
};
expj.AG0020010.AG0020010form1.r_SELECT_CHOICE2.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-r_SELECT_CHOICE2').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0020010', 'AG0020010form1', 'r_SELECT_CHOICE2', this, 'RadioButton');
    }
  });
  expj.AG0020010.AG0020010form1.r_SELECT_CHOICE2.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.r_SELECT_CHOICE2.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/r_SELECT_CHOICE2.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-r_SELECT_CHOICE2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="radio" name="group1" data-name="r_SELECT_CHOICE2" value="true" <%= ("true".equals(TypeConverter.convert(aAG0020010Struct.getr_SELECT_CHOICE2())))?"checked=\"checked\"":"" %> class="" id="expj-AG0020010-AG0020010form1-r_SELECT_CHOICE2" ><label for="expj-AG0020010-AG0020010form1-r_SELECT_CHOICE2"><%=CoreTools.getRBString("Expj.Cmt0424",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_CD",rb)%></span><!-- 取引先コード --></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-w_VEND_CD">
expj.AG0020010.AG0020010form1.w_VEND_CD = {};
expj.AG0020010.AG0020010form1.w_VEND_CD.executeAllOnDecision = function () {
  console.log('execute AG0020010form1/w_VEND_CD.onDecision');
  expj.AG0020010.AG0020010form1.executeAllOnDecision();
  expj.AG0020010.executeAllOnDecision();
};
expj.AG0020010.AG0020010form1.w_VEND_CD.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-w_VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0020010', 'AG0020010form1', 'w_VEND_CD', this);
  });
  expj.AG0020010.AG0020010form1.w_VEND_CD.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.w_VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/w_VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-w_VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0020010-AG0020010form1-w_VEND_CD" name="w_VEND_CD" class="AG0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0020010Struct.getw_VEND_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-PeekerWVendCd">
expj.AG0020010.AG0020010form1.PeekerWVendCd = {};
// script1="onClick;0;PEEKER;_AG0020010form1/w_VEND_CD@<%=contextNo%>"
expj.AG0020010.AG0020010form1.PeekerWVendCd.onClick0 = function () {
  console.log('PeekerWVendCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AG0020010';
var parameterValues = 'PeekerWVendCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '_AG0020010form1/w_VEND_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%VEND_CD_02%&%';
parameterValues += 'TARGET_FIELD%=%_AG0020010form1/w_VEND_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AG0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AG0020010.AG0020010form1.PeekerWVendCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0020010.AG0020010form1.PeekerWVendCd['onClick' + i])) {
        expj.AG0020010.AG0020010form1.PeekerWVendCd['onClick' + i]();
      }
    }
  }
};
expj.AG0020010.AG0020010form1.PeekerWVendCd.executeAllOnDecision = function () {
};
expj.AG0020010.AG0020010form1.PeekerWVendCd.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-PeekerWVendCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0020010', 'AG0020010form1', 'PeekerWVendCd', this, 'Button');
    }
  });
  expj.AG0020010.AG0020010form1.PeekerWVendCd.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.PeekerWVendCd.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/PeekerWVendCd.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-PeekerWVendCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AG0020010-AG0020010form1-PeekerWVendCd" class="AG0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-w_VEND_NAME">
expj.AG0020010.AG0020010form1.w_VEND_NAME = {};
expj.AG0020010.AG0020010form1.w_VEND_NAME.executeAllOnDecision = function () {
  console.log('execute AG0020010form1/w_VEND_NAME.onDecision');
  expj.AG0020010.AG0020010form1.executeAllOnDecision();
  expj.AG0020010.executeAllOnDecision();
};
expj.AG0020010.AG0020010form1.w_VEND_NAME.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-w_VEND_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0020010', 'AG0020010form1', 'w_VEND_NAME', this);
  });
  expj.AG0020010.AG0020010form1.w_VEND_NAME.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.w_VEND_NAME.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/w_VEND_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-w_VEND_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AG0020010-AG0020010form1-w_VEND_NAME" name="w_VEND_NAME" class="AG0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0020010Struct.getw_VEND_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-r_SELECT_CHOICE3">
expj.AG0020010.AG0020010form1.r_SELECT_CHOICE3 = {};
expj.AG0020010.AG0020010form1.r_SELECT_CHOICE3.executeAllOnDecision = function () {
  console.log('execute AG0020010form1/r_SELECT_CHOICE3.onDecision');
  expj.AG0020010.AG0020010form1.executeAllOnDecision();
  expj.AG0020010.executeAllOnDecision();
};
expj.AG0020010.AG0020010form1.r_SELECT_CHOICE3.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-r_SELECT_CHOICE3').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0020010', 'AG0020010form1', 'r_SELECT_CHOICE3', this, 'RadioButton');
    }
  });
  expj.AG0020010.AG0020010form1.r_SELECT_CHOICE3.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.r_SELECT_CHOICE3.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/r_SELECT_CHOICE3.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-r_SELECT_CHOICE3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="radio" name="group1" data-name="r_SELECT_CHOICE3" value="true" <%= ("true".equals(TypeConverter.convert(aAG0020010Struct.getr_SELECT_CHOICE3())))?"checked=\"checked\"":"" %> class="" id="expj-AG0020010-AG0020010form1-r_SELECT_CHOICE3" ><label for="expj-AG0020010-AG0020010form1-r_SELECT_CHOICE3"><%=CoreTools.getRBString("Expj.Cmt0423",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_LOT_CD",rb)%></span><!-- 在庫ロット番号 --></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-w_LOT_NO">
expj.AG0020010.AG0020010form1.w_LOT_NO = {};
expj.AG0020010.AG0020010form1.w_LOT_NO.executeAllOnDecision = function () {
  console.log('execute AG0020010form1/w_LOT_NO.onDecision');
  expj.AG0020010.AG0020010form1.executeAllOnDecision();
  expj.AG0020010.executeAllOnDecision();
};
expj.AG0020010.AG0020010form1.w_LOT_NO.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-w_LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0020010', 'AG0020010form1', 'w_LOT_NO', this);
  });
  expj.AG0020010.AG0020010form1.w_LOT_NO.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.w_LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/w_LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-w_LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0020010-AG0020010form1-w_LOT_NO" name="w_LOT_NO" class="AG0020010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAG0020010Struct.getw_LOT_NO()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-PeekerWLotNo">
expj.AG0020010.AG0020010form1.PeekerWLotNo = {};
// script1="onClick;0;PEEKER;_AG0020010form1/w_LOT_NO@<%=contextNo%>"
expj.AG0020010.AG0020010form1.PeekerWLotNo.onClick0 = function () {
  console.log('PeekerWLotNo script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AG0020010';
var parameterValues = 'PeekerWLotNo%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '_AG0020010form1/w_LOT_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010form1', '_AG0020010form1/w_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%LOT_NO_11%&%';
parameterValues += 'TARGET_FIELD%=%_AG0020010form1/w_LOT_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AG0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AG0020010.AG0020010form1.PeekerWLotNo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0020010.AG0020010form1.PeekerWLotNo['onClick' + i])) {
        expj.AG0020010.AG0020010form1.PeekerWLotNo['onClick' + i]();
      }
    }
  }
};
expj.AG0020010.AG0020010form1.PeekerWLotNo.executeAllOnDecision = function () {
};
expj.AG0020010.AG0020010form1.PeekerWLotNo.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-PeekerWLotNo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0020010', 'AG0020010form1', 'PeekerWLotNo', this, 'Button');
    }
  });
  expj.AG0020010.AG0020010form1.PeekerWLotNo.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.PeekerWLotNo.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/PeekerWLotNo.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-PeekerWLotNo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AG0020010-AG0020010form1-PeekerWLotNo" class="AG0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010form1-l_check">
expj.AG0020010.AG0020010form1.l_check = {};
expj.AG0020010.AG0020010form1.l_check.executeAllOnDecision = function () {
  console.log('execute AG0020010form1/l_check.onDecision');
  expj.AG0020010.AG0020010form1.executeAllOnDecision();
  expj.AG0020010.executeAllOnDecision();
};
expj.AG0020010.AG0020010form1.l_check.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-l_check').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0020010', 'AG0020010form1', 'l_check', this, 'CheckBox');
    }
  });
  expj.AG0020010.AG0020010form1.l_check.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.l_check.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/l_check.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-l_check');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="l_check" value="true" <%= ("true".equals(TypeConverter.convert(aAG0020010Struct.getl_check())) || "".equals(TypeConverter.convert(aAG0020010Struct.getl_check())))?"checked=\"checked\"": "" %> class="AG0020010-focus-move" id="expj-AG0020010-AG0020010form1-l_check"><label for="expj-AG0020010-AG0020010form1-l_check"><%=CoreTools.getRBString("Expj.RCV_ISSUE_QTY_9",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<input type="hidden" id="expj-AG0020010-AG0020010form1-h_lotCtrl" name="h_lotCtrl" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAG0020010Struct.geth_lotCtrl()) %>">
<script class="expj-script-AG0020010-AG0020010form1-h_lotCtrl">
expj.AG0020010.AG0020010form1.h_lotCtrl = {};
expj.AG0020010.AG0020010form1.h_lotCtrl.executeAllOnDecision = function () {
  console.log('execute AG0020010form1/h_lotCtrl.onDecision');
  expj.AG0020010.AG0020010form1.executeAllOnDecision();
  expj.AG0020010.executeAllOnDecision();
};
expj.AG0020010.AG0020010form1.h_lotCtrl.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010form1-h_lotCtrl').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0020010', 'AG0020010form1', 'h_lotCtrl', this);
  });
  expj.AG0020010.AG0020010form1.h_lotCtrl.executePScriptOnLoad();
};

expj.AG0020010.AG0020010form1.h_lotCtrl.executePScriptOnLoad = function () {
  console.log('execute AG0020010form1/h_lotCtrl.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010form1-h_lotCtrl');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AG0020010-AG0020010button1">
expj.AG0020010.AG0020010button1 = {};
expj.AG0020010.AG0020010button1.executeAllOnDecision = function () {
  console.log('execute AG0020010button1.onDecision');
};
expj.AG0020010.AG0020010button1.executeOnLoad = function () {
  expj.AG0020010.AG0020010button1.executePScriptOnLoad();
};

expj.AG0020010.AG0020010button1.executePScriptOnLoad = function () {
  console.log('execute AG0020010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AG0020010-AG0020010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AG0020010-AG0020010button1-select">
expj.AG0020010.AG0020010button1.select = {};
// script1="onClick;0;CHK;_AG0020010form1/r_SELECT_CHOICE3[eq]true@*0,*1"
expj.AG0020010.AG0020010button1.select.onClick0 = function () {
  console.log('select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010button1', '_AG0020010form1/r_SELECT_CHOICE3'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;SET;_AG0020010form1/r_SELECT_CHOICE=2@*4"
expj.AG0020010.AG0020010button1.select.child0 = function () {
  console.log('select script2');
expj.common.pscript.setReferenceComponentValue('AG0020010', 'AG0020010button1', '_AG0020010form1/r_SELECT_CHOICE', '2');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script3="child;1;CHK;_AG0020010form1/r_SELECT_CHOICE2[eq]true@*2,*3"
expj.AG0020010.AG0020010button1.select.child1 = function () {
  console.log('select script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010button1', '_AG0020010form1/r_SELECT_CHOICE2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;2;SET;_AG0020010form1/r_SELECT_CHOICE=1@*4"
expj.AG0020010.AG0020010button1.select.child2 = function () {
  console.log('select script4');
expj.common.pscript.setReferenceComponentValue('AG0020010', 'AG0020010button1', '_AG0020010form1/r_SELECT_CHOICE', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script5="child;3;SET;_AG0020010form1/r_SELECT_CHOICE=9@*4"
expj.AG0020010.AG0020010button1.select.child3 = function () {
  console.log('select script5');
expj.common.pscript.setReferenceComponentValue('AG0020010', 'AG0020010button1', '_AG0020010form1/r_SELECT_CHOICE', '9');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script6="child;4;CHK;_AG0020010form1/w_FROM_DATE[neq]''[and]_AG0020010form1/w_TO_DATE[neq]''@*5,*6"
expj.AG0020010.AG0020010button1.select.child4 = function () {
  console.log('select script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010button1', '_AG0020010form1/w_FROM_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010button1', '_AG0020010form1/w_TO_DATE'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script7="child;5;CHK;_AG0020010form1/w_FROM_DATE[gt]_AG0020010form1/w_TO_DATE@!ZZ05101,*6"
expj.AG0020010.AG0020010button1.select.child5 = function () {
  console.log('select script7');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010button1', '_AG0020010form1/w_FROM_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AG0020010', 'AG0020010button1', '_AG0020010form1/w_TO_DATE')))) {
expj.common.pscript.viewErrorMessage('AG0020010', 'AG0020010button1', 'ZZ05101');
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script8="child;6;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AG0020010form1/*@AG0020010Servlet"
expj.AG0020010.AG0020010button1.select.child6 = function () {
  console.log('select script8');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AG0020010', 'AG0020010button1', '_AG0020010form1/*', 'AG0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AG0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AG0020010', response);
expj.common.updateBusinessScreenTab('AG0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AG0020010.AG0020010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0020010.AG0020010button1.select['onClick' + i])) {
        expj.AG0020010.AG0020010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AG0020010.AG0020010button1.select.executeAllOnDecision = function () {
};
expj.AG0020010.AG0020010button1.select.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0020010', 'AG0020010button1', 'select', this, 'Button');
    }
  });
  expj.AG0020010.AG0020010button1.select.executePScriptOnLoad();
};

expj.AG0020010.AG0020010button1.select.executePScriptOnLoad = function () {
  console.log('execute AG0020010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0020010-AG0020010button1-select" name="select" class="AG0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AG0020010-AG0020010view1">
expj.AG0020010.AG0020010view1 = {};
expj.AG0020010.AG0020010view1.executeAllOnClick = function () {
};
expj.AG0020010.AG0020010view1.executeAllOnDecision = function () {
  console.log('execute AG0020010view1.onDecision');
};
expj.AG0020010.AG0020010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AG0020010view1", "expj.AG0020010.AG0020010view1.executeAllOnClick");
%>
  expj.AG0020010.AG0020010view1.executePScriptOnLoad();
};

expj.AG0020010.AG0020010view1.executePScriptOnLoad = function () {
  console.log('execute AG0020010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AG0020010-AG0020010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AG0020010view1_Id = "AG0020010view1";
 String AG0020010view1_select = "single";
 String AG0020010view1_sortable = "true";
 String AG0020010view1_resize = "true";
 String AG0020010view1_scroll = "true";
 StringBuffer AG0020010view1_HB = new StringBuffer();
 StringBuffer AG0020010view1_DB = new StringBuffer();
%>
<%
 AG0020010view1_select = "single";
 AG0020010view1_sortable = "true";
 AG0020010view1_resize = "true";
 AG0020010view1_scroll = "true";
%>
<%
 AG0020010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
%>
     
<%
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'40px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLANT_CD",rb))).append("', 'name':'PLANT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0482",rb))).append("', 'name':'RCV_ISSUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_NAME",rb))).append("', 'name':'VEND_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_CD",rb))).append("', 'name':'WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_NAME",rb))).append("', 'name':'WH_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RCV_ISSUE_BEFORE_QTY",rb))).append("', 'name':'RCV_ISSUE_BEFORE_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RCV_ISSUE_QTY",rb))).append("', 'name':'RCV_ISSUE_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RCV_ISSUE_AFTER_QTY",rb))).append("', 'name':'RCV_ISSUE_AFTER_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_UNIT_1",rb))).append("', 'name':'STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'RCV_ISSUE_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RCV_ISSUE_TYP",rb))).append("', 'name':'RCV_ISSUE_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'RCV_ISSUE_GNR_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RCV_ISSUE_GNR_TYP",rb))).append("', 'name':'RCV_ISSUE_GNR_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_ODR_CD",rb))).append("', 'name':'WORK_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_IN_PROC_CD",rb))).append("', 'name':'WORK_IN_PROC_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PARTIAL_PRD_NO",rb))).append("', 'name':'PARTIAL_PRD_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_CRCT_NO_1",rb))).append("', 'name':'OPR_RSLT_CRCT_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_CD",rb))).append("', 'name':'PUCH_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_NO",rb))).append("', 'name':'ACPT_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_RSLT_CRCT_NO",rb))).append("', 'name':'ACPT_RSLT_CRCT_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.INSPEC_RSLT_CRCT_NO",rb))).append("', 'name':'INSPEC_RSLT_CRCT_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_CD",rb))).append("', 'name':'ISSUE_INST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'RCV_ISSUE_CMPLT_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RCV_ISSUE_CMPLT_FLG",rb))).append("', 'name':'RCV_ISSUE_CMPLT_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'MRP_ODR_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb))).append("', 'name':'MRP_ODR_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RCV_ISSUE_CTRL_CD",rb))).append("', 'name':'RCV_ISSUE_CTRL_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'STOCK_UPD_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_UPD_TYP",rb))).append("', 'name':'STOCK_UPD_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_LOT_CD",rb))).append("', 'name':'LOT_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_LOT_NO",rb))).append("', 'name':'VEND_LOT_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt6856",rb))).append("', 'name':'RCV_ISSUE_COMMENT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CREATED_DATE_1",rb))).append("', 'name':'CREATED_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CREATED_BY",rb))).append("', 'name':'CREATED_BY', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_SHIP_ITEM_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
AG0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_INV_LOT_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AG0020010view1_sortable).append("}").append(",");
%>
<%
 int aAG0020010StructLength = aAG0020010Control.getListsize();
 final AG0020010Struct structBackup = aAG0020010Struct;
 aAG0020010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAG0020010StructLength; ++loopCount) {
  if((aAG0020010Struct = (AG0020010Struct) aAG0020010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAG0020010Struct", aAG0020010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AG0020010view1_DB.append("[");
 AG0020010view1_DB.append(loopCount);
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-PLANT_CD-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-PLANT_CD\" data-name=\"PLANT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getPLANT_CD())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-RCV_ISSUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-RCV_ISSUE_DATE\" data-name=\"RCV_ISSUE_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAG0020010Struct.getRCV_ISSUE_DATE())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-ITEM_CD\" data-name=\"ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getITEM_CD())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getITEM_NAME())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-JOB_ODR_CD\" data-name=\"JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getJOB_ODR_CD())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-VEND_CD\" data-name=\"VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getVEND_CD())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-VEND_NAME-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-VEND_NAME\" data-name=\"VEND_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getVEND_NAME())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-WH_CD-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-WH_CD\" data-name=\"WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getWH_CD())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-WH_NAME-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-WH_NAME\" data-name=\"WH_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getWH_NAME())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-RCV_ISSUE_BEFORE_QTY-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-RCV_ISSUE_BEFORE_QTY\" data-name=\"RCV_ISSUE_BEFORE_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0020010Struct.getRCV_ISSUE_BEFORE_QTY())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-RCV_ISSUE_QTY-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-RCV_ISSUE_QTY\" data-name=\"RCV_ISSUE_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0020010Struct.getRCV_ISSUE_QTY())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-RCV_ISSUE_AFTER_QTY-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-RCV_ISSUE_AFTER_QTY\" data-name=\"RCV_ISSUE_AFTER_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0020010Struct.getRCV_ISSUE_AFTER_QTY())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-STOCK_UNIT\" data-name=\"STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getSTOCK_UNIT())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-RCV_ISSUE_TYP-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-RCV_ISSUE_TYP\" data-name=\"RCV_ISSUE_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getRCV_ISSUE_TYP())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-RCV_ISSUE_NAME-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-RCV_ISSUE_NAME\" data-name=\"RCV_ISSUE_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getRCV_ISSUE_NAME())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-RCV_ISSUE_GNR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-RCV_ISSUE_GNR_TYP\" data-name=\"RCV_ISSUE_GNR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getRCV_ISSUE_GNR_TYP())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-RCV_ISSUE_GNR_NAME-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-RCV_ISSUE_GNR_NAME\" data-name=\"RCV_ISSUE_GNR_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getRCV_ISSUE_GNR_NAME())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-WORK_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-WORK_ODR_CD\" data-name=\"WORK_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getWORK_ODR_CD())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-WORK_IN_PROC_CD-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-WORK_IN_PROC_CD\" data-name=\"WORK_IN_PROC_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getWORK_IN_PROC_CD())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-PARTIAL_PRD_NO-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-PARTIAL_PRD_NO\" data-name=\"PARTIAL_PRD_NO\" data-view=\"true\" data-kind=\"OBT_INTEGER;6;;\">").append(TypeConverter.sanitizer(aAG0020010Struct.getPARTIAL_PRD_NO())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-OPR_RSLT_CRCT_NO-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-OPR_RSLT_CRCT_NO\" data-name=\"OPR_RSLT_CRCT_NO\" data-view=\"true\" data-kind=\"OBT_INTEGER;6;;\">").append(TypeConverter.sanitizer(aAG0020010Struct.getOPR_RSLT_CRCT_NO())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-PUCH_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-PUCH_ODR_CD\" data-name=\"PUCH_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getPUCH_ODR_CD())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-ACPT_NO-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-ACPT_NO\" data-name=\"ACPT_NO\" data-view=\"true\" data-kind=\"OBT_INTEGER;6;;\">").append(TypeConverter.sanitizer(aAG0020010Struct.getACPT_NO())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-ACPT_RSLT_CRCT_NO-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-ACPT_RSLT_CRCT_NO\" data-name=\"ACPT_RSLT_CRCT_NO\" data-view=\"true\" data-kind=\"OBT_INTEGER;6;;\">").append(TypeConverter.sanitizer(aAG0020010Struct.getACPT_RSLT_CRCT_NO())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-INSPEC_RSLT_CRCT_NO-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-INSPEC_RSLT_CRCT_NO\" data-name=\"INSPEC_RSLT_CRCT_NO\" data-view=\"true\" data-kind=\"OBT_INTEGER;6;;\">").append(TypeConverter.sanitizer(aAG0020010Struct.getINSPEC_RSLT_CRCT_NO())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-ISSUE_INST_CD-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-ISSUE_INST_CD\" data-name=\"ISSUE_INST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getISSUE_INST_CD())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-RCV_ISSUE_CMPLT_FLG-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-RCV_ISSUE_CMPLT_FLG\" data-name=\"RCV_ISSUE_CMPLT_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getRCV_ISSUE_CMPLT_FLG())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-RCV_ISSUE_CMPLT_NAME-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-RCV_ISSUE_CMPLT_NAME\" data-name=\"RCV_ISSUE_CMPLT_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getRCV_ISSUE_CMPLT_NAME())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-MRP_ODR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-MRP_ODR_TYP\" data-name=\"MRP_ODR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getMRP_ODR_TYP())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-MRP_ODR_NAME-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-MRP_ODR_NAME\" data-name=\"MRP_ODR_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getMRP_ODR_NAME())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-RCV_ISSUE_CTRL_CD-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-RCV_ISSUE_CTRL_CD\" data-name=\"RCV_ISSUE_CTRL_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getRCV_ISSUE_CTRL_CD())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-STOCK_UPD_TYP-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-STOCK_UPD_TYP\" data-name=\"STOCK_UPD_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getSTOCK_UPD_TYP())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-STOCK_UPD_NAME-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-STOCK_UPD_NAME\" data-name=\"STOCK_UPD_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getSTOCK_UPD_NAME())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-LOT_NO-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-LOT_NO\" data-name=\"LOT_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getLOT_NO())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-VEND_LOT_NO-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-VEND_LOT_NO\" data-name=\"VEND_LOT_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getVEND_LOT_NO())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-RCV_ISSUE_COMMENT-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-RCV_ISSUE_COMMENT\" data-name=\"RCV_ISSUE_COMMENT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getRCV_ISSUE_COMMENT())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-CREATED_DATE-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-CREATED_DATE\" data-name=\"CREATED_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMDTIME\">").append(TypeConverter.sanitizer(aAG0020010Struct.getCREATED_DATE())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-CREATED_BY-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-CREATED_BY\" data-name=\"CREATED_BY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getCREATED_BY())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-l_SHIP_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-l_SHIP_ITEM_CD\" data-name=\"l_SHIP_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getl_SHIP_ITEM_CD())).append("</span>'");
 AG0020010view1_DB.append(",").append("'<span id=\"expj-AG0020010-AG0020010view1-l_INV_LOT_NO-").append(loopCount).append("\" class=\"expj-label expj-AG0020010-AG0020010view1-l_INV_LOT_NO\" data-name=\"l_INV_LOT_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0020010Struct.getl_INV_LOT_NO())).append("</span>'");
 AG0020010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAG0020010StructLength) {
   AG0020010view1_DB.append(",");
  }
 }
 aAG0020010Struct = structBackup;
 viewIdList.add(AG0020010view1_Id);
 viewSelectList.add(AG0020010view1_select);
 viewResizeList.add(AG0020010view1_resize);
 viewScrollList.add(AG0020010view1_scroll);
 viewHeaderDataList.add(AG0020010view1_HB);
 viewBodyDataList.add(AG0020010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame18 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AG0020010-AG0020010button2">
expj.AG0020010.AG0020010button2 = {};
expj.AG0020010.AG0020010button2.executeAllOnDecision = function () {
  console.log('execute AG0020010button2.onDecision');
};
expj.AG0020010.AG0020010button2.executeOnLoad = function () {
  expj.AG0020010.AG0020010button2.executePScriptOnLoad();
};

expj.AG0020010.AG0020010button2.executePScriptOnLoad = function () {
  console.log('execute AG0020010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AG0020010-AG0020010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AG0020010-AG0020010button2-SelectLotTraceRef">
expj.AG0020010.AG0020010button2.SelectLotTraceRef = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AG0020010view1/+@AG0070010Servlet,<%=contextNo%>,<%=suAG0070.getScreenName()%>,<%=suAG0070.getScreenID()%>"
expj.AG0020010.AG0020010button2.SelectLotTraceRef.onClick0 = function () {
  console.log('SelectLotTraceRef script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AG0020010', 'AG0020010button2', '_AG0020010view1/+', 'AG0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=suAG0070.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AG0070010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AG0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=suAG0070.getScreenName()%>', contents, 'AG0020010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AG0020010.AG0020010button2.SelectLotTraceRef.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0020010.AG0020010button2.SelectLotTraceRef['onClick' + i])) {
        expj.AG0020010.AG0020010button2.SelectLotTraceRef['onClick' + i]();
      }
    }
  }
};
expj.AG0020010.AG0020010button2.SelectLotTraceRef.executeAllOnDecision = function () {
};
expj.AG0020010.AG0020010button2.SelectLotTraceRef.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010button2-SelectLotTraceRef').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0020010', 'AG0020010button2', 'SelectLotTraceRef', this, 'Button');
    }
  });
  expj.AG0020010.AG0020010button2.SelectLotTraceRef.executePScriptOnLoad();
};

expj.AG0020010.AG0020010button2.SelectLotTraceRef.executePScriptOnLoad = function () {
  console.log('execute AG0020010button2/SelectLotTraceRef.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010button2-SelectLotTraceRef');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0020010-AG0020010button2-SelectLotTraceRef" name="SelectLotTraceRef" class="AG0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLotTraceRef",rb)%></button><!-- ロットトレース参照ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame21 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame19" style="width:calc(100% - 399px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame20" style="width:12px;"></div><!--/td-->
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
<span class="version">AG0020010 Revision: 1.14  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-AG0020010-AG0020010button0">
expj.AG0020010.AG0020010button0 = {};
expj.AG0020010.AG0020010button0.executeAllOnDecision = function () {
  console.log('execute AG0020010button0.onDecision');
};
expj.AG0020010.AG0020010button0.executeOnLoad = function () {
  expj.AG0020010.AG0020010button0.executePScriptOnLoad();
};

expj.AG0020010.AG0020010button0.executePScriptOnLoad = function () {
  console.log('execute AG0020010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AG0020010-AG0020010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AG0020010-AG0020010button0-csv">
expj.AG0020010.AG0020010button0.csv = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AG0020010form1/*@AG0020010Servlet,,$ZZ07011"
expj.AG0020010.AG0020010button0.csv.onClick0 = function () {
  console.log('csv script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AG0020010', 'AG0020010button0', '_AG0020010form1/*', 'AG0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AG0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AG0020010', response);
expj.common.updateBusinessScreenTab('AG0020010', contents);
};
expj.common.pscript.callConfirm('AG0020010', 'AG0020010button0', 'ZZ07011', okEvent);
};
expj.AG0020010.AG0020010button0.csv.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0020010.AG0020010button0.csv['onClick' + i])) {
        expj.AG0020010.AG0020010button0.csv['onClick' + i]();
      }
    }
  }
};
expj.AG0020010.AG0020010button0.csv.executeAllOnDecision = function () {
};
expj.AG0020010.AG0020010button0.csv.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010button0-csv').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0020010', 'AG0020010button0', 'csv', this, 'Button');
    }
  });
  expj.AG0020010.AG0020010button0.csv.executePScriptOnLoad();
};

expj.AG0020010.AG0020010button0.csv.executePScriptOnLoad = function () {
  console.log('execute AG0020010button0/csv.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010button0-csv');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0020010-AG0020010button0-csv" name="csv" class="AG0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010button0-clear">
expj.AG0020010.AG0020010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AG0020010Servlet,,$ZZ07008"
expj.AG0020010.AG0020010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AG0020010', 'AG0020010button0', '', 'AG0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AG0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AG0020010', response);
expj.common.updateBusinessScreenTab('AG0020010', contents);
};
expj.common.pscript.callConfirm('AG0020010', 'AG0020010button0', 'ZZ07008', okEvent);
};
expj.AG0020010.AG0020010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0020010.AG0020010button0.clear['onClick' + i])) {
        expj.AG0020010.AG0020010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AG0020010.AG0020010button0.clear.executeAllOnDecision = function () {
};
expj.AG0020010.AG0020010button0.clear.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0020010', 'AG0020010button0', 'clear', this, 'Button');
    }
  });
  expj.AG0020010.AG0020010button0.clear.executePScriptOnLoad();
};

expj.AG0020010.AG0020010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AG0020010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0020010-AG0020010button0-clear" name="clear" class="AG0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AG0020010-AG0020010button0-close">
expj.AG0020010.AG0020010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AG0020010.AG0020010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AG0020010');
};
expj.AG0020010.AG0020010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0020010.AG0020010button0.close['onClick' + i])) {
        expj.AG0020010.AG0020010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AG0020010.AG0020010button0.close.executeAllOnDecision = function () {
};
expj.AG0020010.AG0020010button0.close.executeOnLoad = function () {
  $('#expj-AG0020010-AG0020010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0020010', 'AG0020010button0', 'close', this, 'Button');
    }
  });
  expj.AG0020010.AG0020010button0.close.executePScriptOnLoad();
};

expj.AG0020010.AG0020010button0.close.executePScriptOnLoad = function () {
  console.log('execute AG0020010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AG0020010-AG0020010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0020010-AG0020010button0-close" name="close" class="AG0020010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AG0020010 (END)-->
<%
MessageStruct msgStruct = aAG0020010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AG0020010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AG0020010)) {
  expj.common.treeInstanceMap.AG0020010 = {};
}
expj.common.treeInstanceMap.AG0020010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AG0020010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AG0020010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AG0020010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AG0020010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AG0020010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AG0020010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AG0020010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AG0020010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AG0020010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AG0020010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0020010)) {
  expj.common.detailDialogMap.AG0020010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0020010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AG0020010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0020010.<%=detailId %>)) {
  expj.common.detailDialogMap.AG0020010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0020010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AG0020010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0020010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AG0020010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AG0020010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AG0020010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AG0020010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AG0020010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AG0020010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AG0020010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AG0020010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AG0020010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AG0020010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AG0020010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AG0020010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AG0020010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AG0020010)) {
  expj.common.viewInstanceMap.AG0020010 = {};
}
expj.common.viewInstanceMap.AG0020010.<%=viewId %> = {};
expj.common.viewInstanceMap.AG0020010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AG0020010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AG0020010.<%=viewId %>.init = function () {
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
    expj.AG0020010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AG0020010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AG0020010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AG0020010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AG0020010_init">
/**
 * AG0020010用のロード完了時初期化関数
 */
expj.AG0020010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AG0020010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AG0020010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AG0020010');
  expj.common.calendarInstanceMap.AG0020010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AG0020010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AG0020010.<%=detailId %>.init();
  expj.common.detailDialogMap.AG0020010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AG0020010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AG0020010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AG0020010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AG0020010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AG0020010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AG0020010-<%=detailId %>');
<%
 }
%>
  try{expj.AG0020010.AG0020010form1.w_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.w_PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.w_WH_CD.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.PeekerWWhCd.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.w_WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.r_SELECT_CHOICE.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.w_FROM_DATE.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.Calendarw_FROM_DATE.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.w_TO_DATE.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.Calendarw_TO_DATE.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.w_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.PeekerWItemCd.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.w_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.r_SELECT_CHOICE1.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.w_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.Peekerw_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.r_SELECT_CHOICE2.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.w_VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.PeekerWVendCd.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.w_VEND_NAME.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.r_SELECT_CHOICE3.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.w_LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.PeekerWLotNo.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.l_check.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.h_lotCtrl.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010button1.select.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010button2.SelectLotTraceRef.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010button0.csv.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010button0.close.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010form1.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010button1.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010view1.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010button2.executeOnLoad();}catch(e){};
  try{expj.AG0020010.AG0020010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AG0020010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AG0020010', 'AG0020010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AG0020010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AG0020010-focus-move');
  // 初期フォーカス当てる処理
  $('.AG0020010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AG0020010', '<%=request.getContextPath() %>');
};

/**
 * AG0020010の全体onDecision処理
 */
expj.AG0020010.executeAllOnDecision = function () {
  expj.AG0020010.AG0020010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AG0020010_console">
expj.AG0020010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>