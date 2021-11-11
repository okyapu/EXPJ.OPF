<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:41:33 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AG0050\AG0050010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AG0050.*" %>
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
<jsp:useBean id="aAG0050010Control" class="com.nec.jp.orteus.metamorBase.AG0050.AG0050010Control" scope="request"/>
<jsp:useBean id="aAG0050010Struct" class="com.nec.jp.orteus.metamorBase.AG0050.AG0050010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

時系列入出庫予定一覧
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0050/jsp/AG0050010.jsp,v $
$Author: geng-jia $
$Revision: 1.16 $ $Date: 2017/02/22 02:06:00 $
********************************************************* --%>
<html>
<head>
<title>時系列入出庫予定一覧</title>
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
<script class="expj-script-AG0050010_init">
  // AG0050010名前空間
  expj.AG0050010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
	<% 
		  boolean IsExpJa;
  		  String DateWidth;
		  String DateKind;
		  if("1".equals(aAG0050010Struct.geth_INSTALL_FLG())) {
		  	IsExpJa = true;
			DateWidth = "130";
			DateKind = "OBT_DATE;TYPE_YMDTIME";
		  }else{
		  	IsExpJa = false;
			DateWidth = "80";
			DateKind = "OBT_DATE;TYPE_YMD";
		  }
		  boolean IsExpJ = !IsExpJa;
	%>
  <div id="expj-business-screen-AG0050010" data-screen="AG0050010" data-newdata="<%=aAG0050010Control.isNewData() %>">
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
   
            <div class="expj-td frame04" style=""></div><!--/td-->

            <div class="expj-td frame05" style=""> 
              <script class="expj-script-AG0050010-AG0050010form1">
expj.AG0050010.AG0050010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4"
expj.AG0050010.AG0050010form1.onLoad0 = function () {
  console.log('AG0050010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
};
// script2="onDecision;0;CHK;_AG0050010form1/rdoItemCd[eq]true@*0,*1"
expj.AG0050010.AG0050010form1.onDecision0 = function () {
  console.log('AG0050010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/rdoItemCd'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;MASK;_AG0050010form1/w_PARENT_ITEM_CD,_AG0050010form1/w_COMP_ITEM_CD,_AG0050010form1/PeekerWPItemCd,_AG0050010form1/PeekerWCItemCd@*24"
expj.AG0050010.AG0050010form1.child0 = function () {
  console.log('AG0050010form1 script3');
expj.common.pscript.setMaskToReferenceComponent('AG0050010', 'AG0050010form1', '_AG0050010form1/w_PARENT_ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('AG0050010', 'AG0050010form1', '_AG0050010form1/w_COMP_ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('AG0050010', 'AG0050010form1', '_AG0050010form1/PeekerWPItemCd');
expj.common.pscript.setMaskToReferenceComponent('AG0050010', 'AG0050010form1', '_AG0050010form1/PeekerWCItemCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child24)){this.child24();}}
};
// script4="child;1;CHK;_AG0050010form1/rdoParentItemCd[eq]true@*2,*4"
expj.AG0050010.AG0050010form1.child1 = function () {
  console.log('AG0050010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/rdoParentItemCd'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script5="child;2;UNMASK;_AG0050010form1/w_PARENT_ITEM_CD,_AG0050010form1/PeekerWPItemCd@*3"
expj.AG0050010.AG0050010form1.child2 = function () {
  console.log('AG0050010form1 script5');
expj.common.pscript.setUnMaskToReferenceComponent('AG0050010', 'AG0050010form1', '_AG0050010form1/w_PARENT_ITEM_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AG0050010', 'AG0050010form1', '_AG0050010form1/PeekerWPItemCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script6="child;3;MASK;_AG0050010form1/w_COMP_ITEM_CD,_AG0050010form1/PeekerWCItemCd@*23"
expj.AG0050010.AG0050010form1.child3 = function () {
  console.log('AG0050010form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AG0050010', 'AG0050010form1', '_AG0050010form1/w_COMP_ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('AG0050010', 'AG0050010form1', '_AG0050010form1/PeekerWCItemCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child23)){this.child23();}}
};
// script7="child;4;CHK;_AG0050010form1/rdoCompItemCd[eq]true@*5"
expj.AG0050010.AG0050010form1.child4 = function () {
  console.log('AG0050010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/rdoCompItemCd'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="child;5;UNMASK;_AG0050010form1/w_COMP_ITEM_CD,_AG0050010form1/PeekerWCItemCd@*6"
expj.AG0050010.AG0050010form1.child5 = function () {
  console.log('AG0050010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AG0050010', 'AG0050010form1', '_AG0050010form1/w_COMP_ITEM_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AG0050010', 'AG0050010form1', '_AG0050010form1/PeekerWCItemCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script9="child;6;MASK;_AG0050010form1/w_PARENT_ITEM_CD,_AG0050010form1/PeekerWPItemCd@*22"
expj.AG0050010.AG0050010form1.child6 = function () {
  console.log('AG0050010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('AG0050010', 'AG0050010form1', '_AG0050010form1/w_PARENT_ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('AG0050010', 'AG0050010form1', '_AG0050010form1/PeekerWPItemCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child22)){this.child22();}}
};
// script10="onDecision;1;MASK;_AG0050010button1/select"
expj.AG0050010.AG0050010form1.onDecision1 = function () {
  console.log('AG0050010form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AG0050010', 'AG0050010form1', '_AG0050010button1/select');
};
// script11="onDecision;2;CHK;_AG0050010form1/rdoItemCd[eq]true[and]_AG0050010form1/rdoParentItemCd[neq]true[and]_AG0050010form1/rdoCompItemCd[neq]true@*7,*10"
expj.AG0050010.AG0050010form1.onDecision2 = function () {
  console.log('AG0050010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/rdoItemCd'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/rdoParentItemCd'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/rdoCompItemCd'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script12="child;7;CHKRQ;A@*8,*9"
expj.AG0050010.AG0050010form1.child7 = function () {
  console.log('AG0050010form1 script12');
if (expj.common.pscript.satisfiedRequiredComponent('AG0050010', 'A')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script13="child;8;UNMASK;_AG0050010button1/select"
expj.AG0050010.AG0050010form1.child8 = function () {
  console.log('AG0050010form1 script13');
expj.common.pscript.setUnMaskToReferenceComponent('AG0050010', 'AG0050010form1', '_AG0050010button1/select');
};
// script14="child;9;MASK;_AG0050010button1/select"
expj.AG0050010.AG0050010form1.child9 = function () {
  console.log('AG0050010form1 script14');
expj.common.pscript.setMaskToReferenceComponent('AG0050010', 'AG0050010form1', '_AG0050010button1/select');
};
// script15="child;10;CHK;_AG0050010form1/rdoItemCd[neq]true[and]_AG0050010form1/rdoParentItemCd[eq]true[and]_AG0050010form1/rdoCompItemCd[neq]true@*11,*15"
expj.AG0050010.AG0050010form1.child10 = function () {
  console.log('AG0050010form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/rdoItemCd'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/rdoParentItemCd'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/rdoCompItemCd'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script16="child;11;CHKRQ;A@*12,*14"
expj.AG0050010.AG0050010form1.child11 = function () {
  console.log('AG0050010form1 script16');
if (expj.common.pscript.satisfiedRequiredComponent('AG0050010', 'A')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script17="child;12;CHKRQ;B@*13,*14"
expj.AG0050010.AG0050010form1.child12 = function () {
  console.log('AG0050010form1 script17');
if (expj.common.pscript.satisfiedRequiredComponent('AG0050010', 'B')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script18="child;13;UNMASK;_AG0050010button1/select"
expj.AG0050010.AG0050010form1.child13 = function () {
  console.log('AG0050010form1 script18');
expj.common.pscript.setUnMaskToReferenceComponent('AG0050010', 'AG0050010form1', '_AG0050010button1/select');
};
// script19="child;14;MASK;_AG0050010button1/select"
expj.AG0050010.AG0050010form1.child14 = function () {
  console.log('AG0050010form1 script19');
expj.common.pscript.setMaskToReferenceComponent('AG0050010', 'AG0050010form1', '_AG0050010button1/select');
};
// script20="child;15;CHK;_AG0050010form1/rdoItemCd[neq]true[and]_AG0050010form1/rdoParentItemCd[neq]true[and]_AG0050010form1/rdoCompItemCd[eq]true@*16,*19"
expj.AG0050010.AG0050010form1.child15 = function () {
  console.log('AG0050010form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/rdoItemCd'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/rdoParentItemCd'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/rdoCompItemCd'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script21="child;16;CHKRQ;A@*17,*19"
expj.AG0050010.AG0050010form1.child16 = function () {
  console.log('AG0050010form1 script21');
if (expj.common.pscript.satisfiedRequiredComponent('AG0050010', 'A')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script22="child;17;CHKRQ;C@*18,*19"
expj.AG0050010.AG0050010form1.child17 = function () {
  console.log('AG0050010form1 script22');
if (expj.common.pscript.satisfiedRequiredComponent('AG0050010', 'C')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script23="child;18;UNMASK;_AG0050010button1/select"
expj.AG0050010.AG0050010form1.child18 = function () {
  console.log('AG0050010form1 script23');
expj.common.pscript.setUnMaskToReferenceComponent('AG0050010', 'AG0050010form1', '_AG0050010button1/select');
};
// script24="child;19;MASK;_AG0050010button1/select"
expj.AG0050010.AG0050010form1.child19 = function () {
  console.log('AG0050010form1 script24');
expj.common.pscript.setMaskToReferenceComponent('AG0050010', 'AG0050010form1', '_AG0050010button1/select');
};
// script25="onDecision;3;SET;_AG0050010form2/STOCK_UNIT_1=_AG0050010form2/STOCK_UNIT,_AG0050010form2/STOCK_UNIT_2=_AG0050010form2/STOCK_UNIT,_AG0050010form2/STOCK_UNIT_3=_AG0050010form2/STOCK_UNIT,_AG0050010form2/STOCK_UNIT_4=_AG0050010form2/STOCK_UNIT,_AG0050010form2/STOCK_UNIT_5=_AG0050010form2/STOCK_UNIT"
expj.AG0050010.AG0050010form1.onDecision3 = function () {
  console.log('AG0050010form1 script25');
expj.common.pscript.setReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form2/STOCK_UNIT_1', expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form2/STOCK_UNIT'));
expj.common.pscript.setReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form2/STOCK_UNIT_2', expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form2/STOCK_UNIT'));
expj.common.pscript.setReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form2/STOCK_UNIT_3', expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form2/STOCK_UNIT'));
expj.common.pscript.setReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form2/STOCK_UNIT_4', expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form2/STOCK_UNIT'));
expj.common.pscript.setReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form2/STOCK_UNIT_5', expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form2/STOCK_UNIT'));
};
// script26="onDecision;4;CHK;?AG0050010form1/*[eq]NORMAL@*20,*21"
expj.AG0050010.AG0050010form1.onDecision4 = function () {
  console.log('AG0050010form1 script26');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '?AG0050010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
} else {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
}
};
// script27="child;20;UNMASK;_AG0050010button0/CsvOut"
expj.AG0050010.AG0050010form1.child20 = function () {
  console.log('AG0050010form1 script27');
expj.common.pscript.setUnMaskToReferenceComponent('AG0050010', 'AG0050010form1', '_AG0050010button0/CsvOut');
};
// script28="child;21;MASK;_AG0050010button0/CsvOut"
expj.AG0050010.AG0050010form1.child21 = function () {
  console.log('AG0050010form1 script28');
expj.common.pscript.setMaskToReferenceComponent('AG0050010', 'AG0050010form1', '_AG0050010button0/CsvOut');
};
// script29="child;22;SET;_AG0050010form1/w_PARENT_ITEM_CD=,_AG0050010form1/w_PARENT_ITEM_NAME="
expj.AG0050010.AG0050010form1.child22 = function () {
  console.log('AG0050010form1 script29');
expj.common.pscript.setReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/w_PARENT_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/w_PARENT_ITEM_NAME', '');
};
// script30="child;23;SET;_AG0050010form1/w_COMP_ITEM_CD=,_AG0050010form1/w_COMP_ITEM_NAME="
expj.AG0050010.AG0050010form1.child23 = function () {
  console.log('AG0050010form1 script30');
expj.common.pscript.setReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/w_COMP_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/w_COMP_ITEM_NAME', '');
};
// script31="child;24;SET;_AG0050010form1/w_PARENT_ITEM_CD=,_AG0050010form1/w_PARENT_ITEM_NAME=@*23"
expj.AG0050010.AG0050010form1.child24 = function () {
  console.log('AG0050010form1 script31');
expj.common.pscript.setReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/w_PARENT_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/w_PARENT_ITEM_NAME', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child23)){this.child23();}}
};
expj.AG0050010.AG0050010form1.executeAllOnDecision = function () {
  console.log('execute AG0050010form1.onDecision');
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0050010.AG0050010form1['onDecision' + i])) {
        expj.AG0050010.AG0050010form1['onDecision' + i]();
      }
    }
  }
};
expj.AG0050010.AG0050010form1.executeOnLoad = function () {
  expj.AG0050010.AG0050010form1.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form1.executePScriptOnLoad = function () {
  console.log('execute AG0050010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AG0050010.AG0050010form1['onLoad' + i])) {
      expj.AG0050010.AG0050010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AG0050010-AG0050010form1" action="AG0050010Servlet" name="AG0050010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%=TypeConverter.sanitizer(aAG0050010Control.getReadStatusString())%>" style="height:116px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:116px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:160px;align:right"></div>
<div class="div-td" style="width:90px;align:"></div>
<div class="div-td" style="width:70px;align:"></div>
<div class="div-td" style="width:20px;align:"></div>
<div class="div-td" style="width:90px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:40px;align:"></div>
<div class="div-td" style="width:28px;align:"></div>
<div class="div-td" style="width:112px;align:"></div>
<div class="div-td" style="width:140px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:160px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form1-w_PLANT_CD">
expj.AG0050010.AG0050010form1.w_PLANT_CD = {};
expj.AG0050010.AG0050010form1.w_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AG0050010form1/w_PLANT_CD.onDecision');
  expj.AG0050010.AG0050010form1.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form1.w_PLANT_CD.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form1-w_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0050010', 'AG0050010form1', 'w_PLANT_CD', this);
  });
  expj.AG0050010.AG0050010form1.w_PLANT_CD.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form1.w_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AG0050010form1/w_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form1-w_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:270px;text-align:left;"><input type="text" id="expj-AG0050010-AG0050010form1-w_PLANT_CD" name="w_PLANT_CD" class="AG0050010-focus-move  required-value expj-AG0050010-required-A" style="width:270px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0050010Struct.getw_PLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form1-PeekerWPlantCd">
expj.AG0050010.AG0050010form1.PeekerWPlantCd = {};
// script1="onClick;0;PEEKER;_AG0050010form1/w_PLANT_CD@<%=contextNo%>"
expj.AG0050010.AG0050010form1.PeekerWPlantCd.onClick0 = function () {
  console.log('PeekerWPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AG0050010';
var parameterValues = 'PeekerWPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/w_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AG0050010form1/w_PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AG0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AG0050010.AG0050010form1.PeekerWPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0050010.AG0050010form1.PeekerWPlantCd['onClick' + i])) {
        expj.AG0050010.AG0050010form1.PeekerWPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AG0050010.AG0050010form1.PeekerWPlantCd.executeAllOnDecision = function () {
};
expj.AG0050010.AG0050010form1.PeekerWPlantCd.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form1-PeekerWPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0050010', 'AG0050010form1', 'PeekerWPlantCd', this, 'Button');
    }
  });
  expj.AG0050010.AG0050010form1.PeekerWPlantCd.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form1.PeekerWPlantCd.executePScriptOnLoad = function () {
  console.log('execute AG0050010form1/PeekerWPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form1-PeekerWPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AG0050010-AG0050010form1-PeekerWPlantCd" class="AG0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form1-w_PLANT_NAME">
expj.AG0050010.AG0050010form1.w_PLANT_NAME = {};
expj.AG0050010.AG0050010form1.w_PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AG0050010form1/w_PLANT_NAME.onDecision');
  expj.AG0050010.AG0050010form1.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form1.w_PLANT_NAME.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form1-w_PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0050010', 'AG0050010form1', 'w_PLANT_NAME', this);
  });
  expj.AG0050010.AG0050010form1.w_PLANT_NAME.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form1.w_PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AG0050010form1/w_PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form1-w_PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AG0050010-AG0050010form1-w_PLANT_NAME" name="w_PLANT_NAME" class="AG0050010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0050010Struct.getw_PLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AG0050010-AG0050010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAG0050010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AG0050010-AG0050010form1-DOWNLOAD_FILE">
expj.AG0050010.AG0050010form1.DOWNLOAD_FILE = {};
expj.AG0050010.AG0050010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AG0050010form1/DOWNLOAD_FILE.onDecision');
  expj.AG0050010.AG0050010form1.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0050010', 'AG0050010form1', 'DOWNLOAD_FILE', this);
  });
  expj.AG0050010.AG0050010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AG0050010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:160px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form1-w_ITEM_CD">
expj.AG0050010.AG0050010form1.w_ITEM_CD = {};
expj.AG0050010.AG0050010form1.w_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AG0050010form1/w_ITEM_CD.onDecision');
  expj.AG0050010.AG0050010form1.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form1.w_ITEM_CD.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form1-w_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0050010', 'AG0050010form1', 'w_ITEM_CD', this);
  });
  expj.AG0050010.AG0050010form1.w_ITEM_CD.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form1.w_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AG0050010form1/w_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form1-w_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:270px;text-align:left;"><input type="text" id="expj-AG0050010-AG0050010form1-w_ITEM_CD" name="w_ITEM_CD" class="AG0050010-focus-move  required-value expj-AG0050010-required-A" style="width:270px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0050010Struct.getw_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form1-PeekerWItemCd">
expj.AG0050010.AG0050010form1.PeekerWItemCd = {};
// script1="onClick;0;PEEKER;_AG0050010form1/w_ITEM_CD@<%=contextNo%>"
expj.AG0050010.AG0050010form1.PeekerWItemCd.onClick0 = function () {
  console.log('PeekerWItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AG0050010';
var parameterValues = 'PeekerWItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/w_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AG0050010form1/w_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AG0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AG0050010.AG0050010form1.PeekerWItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0050010.AG0050010form1.PeekerWItemCd['onClick' + i])) {
        expj.AG0050010.AG0050010form1.PeekerWItemCd['onClick' + i]();
      }
    }
  }
};
expj.AG0050010.AG0050010form1.PeekerWItemCd.executeAllOnDecision = function () {
};
expj.AG0050010.AG0050010form1.PeekerWItemCd.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form1-PeekerWItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0050010', 'AG0050010form1', 'PeekerWItemCd', this, 'Button');
    }
  });
  expj.AG0050010.AG0050010form1.PeekerWItemCd.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form1.PeekerWItemCd.executePScriptOnLoad = function () {
  console.log('execute AG0050010form1/PeekerWItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form1-PeekerWItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AG0050010-AG0050010form1-PeekerWItemCd" class="AG0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form1-w_ITEM_NAME">
expj.AG0050010.AG0050010form1.w_ITEM_NAME = {};
expj.AG0050010.AG0050010form1.w_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AG0050010form1/w_ITEM_NAME.onDecision');
  expj.AG0050010.AG0050010form1.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form1.w_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form1-w_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0050010', 'AG0050010form1', 'w_ITEM_NAME', this);
  });
  expj.AG0050010.AG0050010form1.w_ITEM_NAME.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form1.w_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AG0050010form1/w_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form1-w_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AG0050010-AG0050010form1-w_ITEM_NAME" name="w_ITEM_NAME" class="AG0050010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0050010Struct.getw_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form1-rdoItemCd">
expj.AG0050010.AG0050010form1.rdoItemCd = {};
expj.AG0050010.AG0050010form1.rdoItemCd.executeAllOnDecision = function () {
  console.log('execute AG0050010form1/rdoItemCd.onDecision');
  expj.AG0050010.AG0050010form1.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form1.rdoItemCd.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form1-rdoItemCd').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0050010', 'AG0050010form1', 'rdoItemCd', this, 'RadioButton');
    }
  });
  expj.AG0050010.AG0050010form1.rdoItemCd.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form1.rdoItemCd.executePScriptOnLoad = function () {
  console.log('execute AG0050010form1/rdoItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form1-rdoItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="radio" name="rdoItemTyp" data-name="rdoItemCd" value="true" <%= ("true".equals(TypeConverter.convert(aAG0050010Struct.getrdoItemCd())) || "".equals(TypeConverter.convert(aAG0050010Struct.getrdoItemCd())))?"checked=\"checked\"": "" %> class="" id="expj-AG0050010-AG0050010form1-rdoItemCd" ><label for="expj-AG0050010-AG0050010form1-rdoItemCd"><%=CoreTools.getRBString("Expj.Cmt3101",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:160px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PARENT_ITEM_CD",rb)%></span><!-- 親品目番号 --></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form1-w_PARENT_ITEM_CD">
expj.AG0050010.AG0050010form1.w_PARENT_ITEM_CD = {};
expj.AG0050010.AG0050010form1.w_PARENT_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AG0050010form1/w_PARENT_ITEM_CD.onDecision');
  expj.AG0050010.AG0050010form1.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form1.w_PARENT_ITEM_CD.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form1-w_PARENT_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0050010', 'AG0050010form1', 'w_PARENT_ITEM_CD', this);
  });
  expj.AG0050010.AG0050010form1.w_PARENT_ITEM_CD.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form1.w_PARENT_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AG0050010form1/w_PARENT_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form1-w_PARENT_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:270px;text-align:left;"><input type="text" id="expj-AG0050010-AG0050010form1-w_PARENT_ITEM_CD" name="w_PARENT_ITEM_CD" class="AG0050010-focus-move  required-value expj-AG0050010-required-B" style="width:270px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0050010Struct.getw_PARENT_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form1-PeekerWPItemCd">
expj.AG0050010.AG0050010form1.PeekerWPItemCd = {};
// script1="onClick;0;PEEKER;_AG0050010form1/w_PARENT_ITEM_CD@<%=contextNo%>"
expj.AG0050010.AG0050010form1.PeekerWPItemCd.onClick0 = function () {
  console.log('PeekerWPItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AG0050010';
var parameterValues = 'PeekerWPItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/w_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/w_PARENT_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%M_PS_01%&%';
parameterValues += 'TARGET_FIELD%=%_AG0050010form1/w_PARENT_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AG0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AG0050010.AG0050010form1.PeekerWPItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0050010.AG0050010form1.PeekerWPItemCd['onClick' + i])) {
        expj.AG0050010.AG0050010form1.PeekerWPItemCd['onClick' + i]();
      }
    }
  }
};
expj.AG0050010.AG0050010form1.PeekerWPItemCd.executeAllOnDecision = function () {
};
expj.AG0050010.AG0050010form1.PeekerWPItemCd.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form1-PeekerWPItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0050010', 'AG0050010form1', 'PeekerWPItemCd', this, 'Button');
    }
  });
  expj.AG0050010.AG0050010form1.PeekerWPItemCd.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form1.PeekerWPItemCd.executePScriptOnLoad = function () {
  console.log('execute AG0050010form1/PeekerWPItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form1-PeekerWPItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AG0050010-AG0050010form1-PeekerWPItemCd" class="AG0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form1-w_PARENT_ITEM_NAME">
expj.AG0050010.AG0050010form1.w_PARENT_ITEM_NAME = {};
expj.AG0050010.AG0050010form1.w_PARENT_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AG0050010form1/w_PARENT_ITEM_NAME.onDecision');
  expj.AG0050010.AG0050010form1.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form1.w_PARENT_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form1-w_PARENT_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0050010', 'AG0050010form1', 'w_PARENT_ITEM_NAME', this);
  });
  expj.AG0050010.AG0050010form1.w_PARENT_ITEM_NAME.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form1.w_PARENT_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AG0050010form1/w_PARENT_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form1-w_PARENT_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AG0050010-AG0050010form1-w_PARENT_ITEM_NAME" name="w_PARENT_ITEM_NAME" class="AG0050010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0050010Struct.getw_PARENT_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form1-rdoParentItemCd">
expj.AG0050010.AG0050010form1.rdoParentItemCd = {};
expj.AG0050010.AG0050010form1.rdoParentItemCd.executeAllOnDecision = function () {
  console.log('execute AG0050010form1/rdoParentItemCd.onDecision');
  expj.AG0050010.AG0050010form1.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form1.rdoParentItemCd.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form1-rdoParentItemCd').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0050010', 'AG0050010form1', 'rdoParentItemCd', this, 'RadioButton');
    }
  });
  expj.AG0050010.AG0050010form1.rdoParentItemCd.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form1.rdoParentItemCd.executePScriptOnLoad = function () {
  console.log('execute AG0050010form1/rdoParentItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form1-rdoParentItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="radio" name="rdoItemTyp" data-name="rdoParentItemCd" value="true" <%= ("true".equals(TypeConverter.convert(aAG0050010Struct.getrdoParentItemCd())))?"checked=\"checked\"":"" %> class="" id="expj-AG0050010-AG0050010form1-rdoParentItemCd" ><label for="expj-AG0050010-AG0050010form1-rdoParentItemCd"><%=CoreTools.getRBString("Expj.Cmt3102",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:160px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.COMP_ITEM_CD",rb)%></span><!-- 子品目番号 --></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form1-w_COMP_ITEM_CD">
expj.AG0050010.AG0050010form1.w_COMP_ITEM_CD = {};
expj.AG0050010.AG0050010form1.w_COMP_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AG0050010form1/w_COMP_ITEM_CD.onDecision');
  expj.AG0050010.AG0050010form1.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form1.w_COMP_ITEM_CD.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form1-w_COMP_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0050010', 'AG0050010form1', 'w_COMP_ITEM_CD', this);
  });
  expj.AG0050010.AG0050010form1.w_COMP_ITEM_CD.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form1.w_COMP_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AG0050010form1/w_COMP_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form1-w_COMP_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:270px;text-align:left;"><input type="text" id="expj-AG0050010-AG0050010form1-w_COMP_ITEM_CD" name="w_COMP_ITEM_CD" class="AG0050010-focus-move  required-value expj-AG0050010-required-C" style="width:270px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0050010Struct.getw_COMP_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form1-PeekerWCItemCd">
expj.AG0050010.AG0050010form1.PeekerWCItemCd = {};
// script1="onClick;0;PEEKER;_AG0050010form1/w_COMP_ITEM_CD@<%=contextNo%>"
expj.AG0050010.AG0050010form1.PeekerWCItemCd.onClick0 = function () {
  console.log('PeekerWCItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AG0050010';
var parameterValues = 'PeekerWCItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/w_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0050010', 'AG0050010form1', '_AG0050010form1/w_COMP_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%M_PS_02%&%';
parameterValues += 'TARGET_FIELD%=%_AG0050010form1/w_COMP_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AG0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AG0050010.AG0050010form1.PeekerWCItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0050010.AG0050010form1.PeekerWCItemCd['onClick' + i])) {
        expj.AG0050010.AG0050010form1.PeekerWCItemCd['onClick' + i]();
      }
    }
  }
};
expj.AG0050010.AG0050010form1.PeekerWCItemCd.executeAllOnDecision = function () {
};
expj.AG0050010.AG0050010form1.PeekerWCItemCd.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form1-PeekerWCItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0050010', 'AG0050010form1', 'PeekerWCItemCd', this, 'Button');
    }
  });
  expj.AG0050010.AG0050010form1.PeekerWCItemCd.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form1.PeekerWCItemCd.executePScriptOnLoad = function () {
  console.log('execute AG0050010form1/PeekerWCItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form1-PeekerWCItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AG0050010-AG0050010form1-PeekerWCItemCd" class="AG0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form1-w_COMP_ITEM_NAME">
expj.AG0050010.AG0050010form1.w_COMP_ITEM_NAME = {};
expj.AG0050010.AG0050010form1.w_COMP_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AG0050010form1/w_COMP_ITEM_NAME.onDecision');
  expj.AG0050010.AG0050010form1.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form1.w_COMP_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form1-w_COMP_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0050010', 'AG0050010form1', 'w_COMP_ITEM_NAME', this);
  });
  expj.AG0050010.AG0050010form1.w_COMP_ITEM_NAME.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form1.w_COMP_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AG0050010form1/w_COMP_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form1-w_COMP_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AG0050010-AG0050010form1-w_COMP_ITEM_NAME" name="w_COMP_ITEM_NAME" class="AG0050010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0050010Struct.getw_COMP_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form1-rdoCompItemCd">
expj.AG0050010.AG0050010form1.rdoCompItemCd = {};
expj.AG0050010.AG0050010form1.rdoCompItemCd.executeAllOnDecision = function () {
  console.log('execute AG0050010form1/rdoCompItemCd.onDecision');
  expj.AG0050010.AG0050010form1.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form1.rdoCompItemCd.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form1-rdoCompItemCd').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0050010', 'AG0050010form1', 'rdoCompItemCd', this, 'RadioButton');
    }
  });
  expj.AG0050010.AG0050010form1.rdoCompItemCd.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form1.rdoCompItemCd.executePScriptOnLoad = function () {
  console.log('execute AG0050010form1/rdoCompItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form1-rdoCompItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="radio" name="rdoItemTyp" data-name="rdoCompItemCd" value="true" <%= ("true".equals(TypeConverter.convert(aAG0050010Struct.getrdoCompItemCd())))?"checked=\"checked\"":"" %> class="" id="expj-AG0050010-AG0050010form1-rdoCompItemCd" ><label for="expj-AG0050010-AG0050010form1-rdoCompItemCd"><%=CoreTools.getRBString("Expj.Cmt3103",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:160px;text-align:right;"></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form1-checkMrpFlg">
expj.AG0050010.AG0050010form1.checkMrpFlg = {};
expj.AG0050010.AG0050010form1.checkMrpFlg.executeAllOnDecision = function () {
  console.log('execute AG0050010form1/checkMrpFlg.onDecision');
  expj.AG0050010.AG0050010form1.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form1.checkMrpFlg.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form1-checkMrpFlg').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0050010', 'AG0050010form1', 'checkMrpFlg', this, 'CheckBox');
    }
  });
  expj.AG0050010.AG0050010form1.checkMrpFlg.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form1.checkMrpFlg.executePScriptOnLoad = function () {
  console.log('execute AG0050010form1/checkMrpFlg.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form1-checkMrpFlg');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:90px;text-align:left;"><input type="checkbox" name="checkMrpFlg" value="true" <%= ("true".equals(TypeConverter.convert(aAG0050010Struct.getcheckMrpFlg())) || "1".equals(TypeConverter.convert(aAG0050010Struct.getcheckMrpFlg())))?"checked=\"checked\"":"" %>  class="AG0050010-focus-move" id="expj-AG0050010-AG0050010form1-checkMrpFlg"><label for="expj-AG0050010-AG0050010form1-checkMrpFlg"><%=CoreTools.getRBString("Expj.Cmt3127",rb)%></label></div><!--/td-->
<div class="div-td" style="width:70px;"></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form1-checkProdPlan">
expj.AG0050010.AG0050010form1.checkProdPlan = {};
expj.AG0050010.AG0050010form1.checkProdPlan.executeAllOnDecision = function () {
  console.log('execute AG0050010form1/checkProdPlan.onDecision');
  expj.AG0050010.AG0050010form1.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form1.checkProdPlan.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form1-checkProdPlan').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0050010', 'AG0050010form1', 'checkProdPlan', this, 'CheckBox');
    }
  });
  expj.AG0050010.AG0050010form1.checkProdPlan.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form1.checkProdPlan.executePScriptOnLoad = function () {
  console.log('execute AG0050010form1/checkProdPlan.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form1-checkProdPlan');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:20px;text-align:left;"><input type="checkbox" name="checkProdPlan" value="true" <%= ("true".equals(TypeConverter.convert(aAG0050010Struct.getcheckProdPlan())) || "1".equals(TypeConverter.convert(aAG0050010Struct.getcheckProdPlan())))?"checked=\"checked\"":"" %>  class="AG0050010-focus-move" id="expj-AG0050010-AG0050010form1-checkProdPlan"><label for="expj-AG0050010-AG0050010form1-checkProdPlan"><%=CoreTools.getRBString("Expj.Cmt3128",rb)%></label></div><!--/td-->
<div class="div-td" style="width:90px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AG0050010-AG0050010form1-h_DM_CREATE_BASE_TBL" name="h_DM_CREATE_BASE_TBL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAG0050010Struct.geth_DM_CREATE_BASE_TBL()) %>">
<script class="expj-script-AG0050010-AG0050010form1-h_DM_CREATE_BASE_TBL">
expj.AG0050010.AG0050010form1.h_DM_CREATE_BASE_TBL = {};
expj.AG0050010.AG0050010form1.h_DM_CREATE_BASE_TBL.executeAllOnDecision = function () {
  console.log('execute AG0050010form1/h_DM_CREATE_BASE_TBL.onDecision');
  expj.AG0050010.AG0050010form1.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form1.h_DM_CREATE_BASE_TBL.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form1-h_DM_CREATE_BASE_TBL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0050010', 'AG0050010form1', 'h_DM_CREATE_BASE_TBL', this);
  });
  expj.AG0050010.AG0050010form1.h_DM_CREATE_BASE_TBL.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form1.h_DM_CREATE_BASE_TBL.executePScriptOnLoad = function () {
  console.log('execute AG0050010form1/h_DM_CREATE_BASE_TBL.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form1-h_DM_CREATE_BASE_TBL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:40px;text-align:left;"></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form1-checkUncnfm">
expj.AG0050010.AG0050010form1.checkUncnfm = {};
expj.AG0050010.AG0050010form1.checkUncnfm.executeAllOnDecision = function () {
  console.log('execute AG0050010form1/checkUncnfm.onDecision');
  expj.AG0050010.AG0050010form1.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form1.checkUncnfm.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form1-checkUncnfm').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0050010', 'AG0050010form1', 'checkUncnfm', this, 'CheckBox');
    }
  });
  expj.AG0050010.AG0050010form1.checkUncnfm.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form1.checkUncnfm.executePScriptOnLoad = function () {
  console.log('execute AG0050010form1/checkUncnfm.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form1-checkUncnfm');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:28px;text-align:left;"><input type="checkbox" name="checkUncnfm" value="true" <%= ("true".equals(TypeConverter.convert(aAG0050010Struct.getcheckUncnfm())) || "1".equals(TypeConverter.convert(aAG0050010Struct.getcheckUncnfm())))?"checked=\"checked\"":"" %>  class="AG0050010-focus-move" id="expj-AG0050010-AG0050010form1-checkUncnfm" <%= ("true".equals(TypeConverter.convert(IsExpJ))) ? "" : " disabled=\"disabled\"" %>><label for="expj-AG0050010-AG0050010form1-checkUncnfm"><%=CoreTools.getRBString("Expj.Cmt3129",rb)%></label></div><!--/td-->
<div class="div-td" style="width:112px;"></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form1-checkQty">
expj.AG0050010.AG0050010form1.checkQty = {};
expj.AG0050010.AG0050010form1.checkQty.executeAllOnDecision = function () {
  console.log('execute AG0050010form1/checkQty.onDecision');
  expj.AG0050010.AG0050010form1.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form1.checkQty.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form1-checkQty').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0050010', 'AG0050010form1', 'checkQty', this, 'CheckBox');
    }
  });
  expj.AG0050010.AG0050010form1.checkQty.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form1.checkQty.executePScriptOnLoad = function () {
  console.log('execute AG0050010form1/checkQty.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form1-checkQty');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:140px;text-align:left;"><input type="checkbox" name="checkQty" value="true" <%= ("true".equals(TypeConverter.convert(aAG0050010Struct.getcheckQty())) || "1".equals(TypeConverter.convert(aAG0050010Struct.getcheckQty())))?"checked=\"checked\"":"" %>  class="AG0050010-focus-move" id="expj-AG0050010-AG0050010form1-checkQty"><label for="expj-AG0050010-AG0050010form1-checkQty"><%=CoreTools.getRBString("Expj.Cmt6790",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AG0050010-AG0050010form1-h_INSTALL_FLG" name="h_INSTALL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAG0050010Struct.geth_INSTALL_FLG()) %>">
<script class="expj-script-AG0050010-AG0050010form1-h_INSTALL_FLG">
expj.AG0050010.AG0050010form1.h_INSTALL_FLG = {};
expj.AG0050010.AG0050010form1.h_INSTALL_FLG.executeAllOnDecision = function () {
  console.log('execute AG0050010form1/h_INSTALL_FLG.onDecision');
  expj.AG0050010.AG0050010form1.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form1.h_INSTALL_FLG.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form1-h_INSTALL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0050010', 'AG0050010form1', 'h_INSTALL_FLG', this);
  });
  expj.AG0050010.AG0050010form1.h_INSTALL_FLG.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form1.h_INSTALL_FLG.executePScriptOnLoad = function () {
  console.log('execute AG0050010form1/h_INSTALL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form1-h_INSTALL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style=""></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AG0050010-AG0050010button1">
expj.AG0050010.AG0050010button1 = {};
expj.AG0050010.AG0050010button1.executeAllOnDecision = function () {
  console.log('execute AG0050010button1.onDecision');
};
expj.AG0050010.AG0050010button1.executeOnLoad = function () {
  expj.AG0050010.AG0050010button1.executePScriptOnLoad();
};

expj.AG0050010.AG0050010button1.executePScriptOnLoad = function () {
  console.log('execute AG0050010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AG0050010-AG0050010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AG0050010-AG0050010button1-select">
expj.AG0050010.AG0050010button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AG0050010form1/*@AG0050010Servlet"
expj.AG0050010.AG0050010button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AG0050010', 'AG0050010button1', '_AG0050010form1/*', 'AG0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AG0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AG0050010', response);
expj.common.updateBusinessScreenTab('AG0050010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AG0050010.AG0050010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0050010.AG0050010button1.select['onClick' + i])) {
        expj.AG0050010.AG0050010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AG0050010.AG0050010button1.select.executeAllOnDecision = function () {
};
expj.AG0050010.AG0050010button1.select.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0050010', 'AG0050010button1', 'select', this, 'Button');
    }
  });
  expj.AG0050010.AG0050010button1.select.executePScriptOnLoad();
};

expj.AG0050010.AG0050010button1.select.executePScriptOnLoad = function () {
  console.log('execute AG0050010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0050010-AG0050010button1-select" name="select" class="AG0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style=""></div><!--/td-->
<div class="expj-td frame05" style=""><script class="expj-script-AG0050010-AG0050010form2">
expj.AG0050010.AG0050010form2 = {};
expj.AG0050010.AG0050010form2.executeAllOnDecision = function () {
  console.log('execute AG0050010form2.onDecision');
};
expj.AG0050010.AG0050010form2.executeOnLoad = function () {
  expj.AG0050010.AG0050010form2.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form2.executePScriptOnLoad = function () {
  console.log('execute AG0050010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AG0050010-AG0050010form2" action="AG0050010Servlet" name="AG0050010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3104",rb)%></span><!-- 出庫予定合計（確定） --></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form2-SCDL_ISSUE_TOTAL_FIX">
expj.AG0050010.AG0050010form2.SCDL_ISSUE_TOTAL_FIX = {};
expj.AG0050010.AG0050010form2.SCDL_ISSUE_TOTAL_FIX.executeAllOnDecision = function () {
  console.log('execute AG0050010form2/SCDL_ISSUE_TOTAL_FIX.onDecision');
  expj.AG0050010.AG0050010form2.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form2.SCDL_ISSUE_TOTAL_FIX.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form2-SCDL_ISSUE_TOTAL_FIX').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0050010', 'AG0050010form2', 'SCDL_ISSUE_TOTAL_FIX', this);
  });
  expj.AG0050010.AG0050010form2.SCDL_ISSUE_TOTAL_FIX.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form2.SCDL_ISSUE_TOTAL_FIX.executePScriptOnLoad = function () {
  console.log('execute AG0050010form2/SCDL_ISSUE_TOTAL_FIX.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form2-SCDL_ISSUE_TOTAL_FIX');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AG0050010-AG0050010form2-SCDL_ISSUE_TOTAL_FIX" name="SCDL_ISSUE_TOTAL_FIX" class="AG0050010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAG0050010Struct.getSCDL_ISSUE_TOTAL_FIX()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form2-STOCK_UNIT">
expj.AG0050010.AG0050010form2.STOCK_UNIT = {};
expj.AG0050010.AG0050010form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AG0050010form2/STOCK_UNIT.onDecision');
  expj.AG0050010.AG0050010form2.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0050010', 'AG0050010form2', 'STOCK_UNIT', this);
  });
  expj.AG0050010.AG0050010form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AG0050010form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AG0050010-AG0050010form2-STOCK_UNIT" name="STOCK_UNIT" class="AG0050010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0050010Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3105",rb)%></span><!-- 入庫予定合計（確定） --></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form2-SCDL_RCV_TOTAL_FIX">
expj.AG0050010.AG0050010form2.SCDL_RCV_TOTAL_FIX = {};
expj.AG0050010.AG0050010form2.SCDL_RCV_TOTAL_FIX.executeAllOnDecision = function () {
  console.log('execute AG0050010form2/SCDL_RCV_TOTAL_FIX.onDecision');
  expj.AG0050010.AG0050010form2.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form2.SCDL_RCV_TOTAL_FIX.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form2-SCDL_RCV_TOTAL_FIX').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0050010', 'AG0050010form2', 'SCDL_RCV_TOTAL_FIX', this);
  });
  expj.AG0050010.AG0050010form2.SCDL_RCV_TOTAL_FIX.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form2.SCDL_RCV_TOTAL_FIX.executePScriptOnLoad = function () {
  console.log('execute AG0050010form2/SCDL_RCV_TOTAL_FIX.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form2-SCDL_RCV_TOTAL_FIX');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AG0050010-AG0050010form2-SCDL_RCV_TOTAL_FIX" name="SCDL_RCV_TOTAL_FIX" class="AG0050010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAG0050010Struct.getSCDL_RCV_TOTAL_FIX()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form2-STOCK_UNIT_3">
expj.AG0050010.AG0050010form2.STOCK_UNIT_3 = {};
expj.AG0050010.AG0050010form2.STOCK_UNIT_3.executeAllOnDecision = function () {
  console.log('execute AG0050010form2/STOCK_UNIT_3.onDecision');
  expj.AG0050010.AG0050010form2.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form2.STOCK_UNIT_3.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form2-STOCK_UNIT_3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0050010', 'AG0050010form2', 'STOCK_UNIT_3', this);
  });
  expj.AG0050010.AG0050010form2.STOCK_UNIT_3.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form2.STOCK_UNIT_3.executePScriptOnLoad = function () {
  console.log('execute AG0050010form2/STOCK_UNIT_3.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form2-STOCK_UNIT_3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="text" id="expj-AG0050010-AG0050010form2-STOCK_UNIT_3" name="STOCK_UNIT_3" class="AG0050010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0050010Struct.getSTOCK_UNIT_3()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3106",rb)%></span><!-- 出庫予定合計（未確定） --></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form2-SCDL_ISSUE_TOTAL_NOFIX">
expj.AG0050010.AG0050010form2.SCDL_ISSUE_TOTAL_NOFIX = {};
expj.AG0050010.AG0050010form2.SCDL_ISSUE_TOTAL_NOFIX.executeAllOnDecision = function () {
  console.log('execute AG0050010form2/SCDL_ISSUE_TOTAL_NOFIX.onDecision');
  expj.AG0050010.AG0050010form2.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form2.SCDL_ISSUE_TOTAL_NOFIX.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form2-SCDL_ISSUE_TOTAL_NOFIX').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0050010', 'AG0050010form2', 'SCDL_ISSUE_TOTAL_NOFIX', this);
  });
  expj.AG0050010.AG0050010form2.SCDL_ISSUE_TOTAL_NOFIX.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form2.SCDL_ISSUE_TOTAL_NOFIX.executePScriptOnLoad = function () {
  console.log('execute AG0050010form2/SCDL_ISSUE_TOTAL_NOFIX.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form2-SCDL_ISSUE_TOTAL_NOFIX');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AG0050010-AG0050010form2-SCDL_ISSUE_TOTAL_NOFIX" name="SCDL_ISSUE_TOTAL_NOFIX" class="AG0050010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAG0050010Struct.getSCDL_ISSUE_TOTAL_NOFIX()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form2-STOCK_UNIT_1">
expj.AG0050010.AG0050010form2.STOCK_UNIT_1 = {};
expj.AG0050010.AG0050010form2.STOCK_UNIT_1.executeAllOnDecision = function () {
  console.log('execute AG0050010form2/STOCK_UNIT_1.onDecision');
  expj.AG0050010.AG0050010form2.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form2.STOCK_UNIT_1.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form2-STOCK_UNIT_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0050010', 'AG0050010form2', 'STOCK_UNIT_1', this);
  });
  expj.AG0050010.AG0050010form2.STOCK_UNIT_1.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form2.STOCK_UNIT_1.executePScriptOnLoad = function () {
  console.log('execute AG0050010form2/STOCK_UNIT_1.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form2-STOCK_UNIT_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AG0050010-AG0050010form2-STOCK_UNIT_1" name="STOCK_UNIT_1" class="AG0050010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0050010Struct.getSTOCK_UNIT_1()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3107",rb)%></span><!-- 入庫予定合計（未確定） --></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form2-SCDL_RCV_TOTAL_NOFIX">
expj.AG0050010.AG0050010form2.SCDL_RCV_TOTAL_NOFIX = {};
expj.AG0050010.AG0050010form2.SCDL_RCV_TOTAL_NOFIX.executeAllOnDecision = function () {
  console.log('execute AG0050010form2/SCDL_RCV_TOTAL_NOFIX.onDecision');
  expj.AG0050010.AG0050010form2.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form2.SCDL_RCV_TOTAL_NOFIX.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form2-SCDL_RCV_TOTAL_NOFIX').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0050010', 'AG0050010form2', 'SCDL_RCV_TOTAL_NOFIX', this);
  });
  expj.AG0050010.AG0050010form2.SCDL_RCV_TOTAL_NOFIX.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form2.SCDL_RCV_TOTAL_NOFIX.executePScriptOnLoad = function () {
  console.log('execute AG0050010form2/SCDL_RCV_TOTAL_NOFIX.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form2-SCDL_RCV_TOTAL_NOFIX');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AG0050010-AG0050010form2-SCDL_RCV_TOTAL_NOFIX" name="SCDL_RCV_TOTAL_NOFIX" class="AG0050010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAG0050010Struct.getSCDL_RCV_TOTAL_NOFIX()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form2-STOCK_UNIT_4">
expj.AG0050010.AG0050010form2.STOCK_UNIT_4 = {};
expj.AG0050010.AG0050010form2.STOCK_UNIT_4.executeAllOnDecision = function () {
  console.log('execute AG0050010form2/STOCK_UNIT_4.onDecision');
  expj.AG0050010.AG0050010form2.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form2.STOCK_UNIT_4.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form2-STOCK_UNIT_4').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0050010', 'AG0050010form2', 'STOCK_UNIT_4', this);
  });
  expj.AG0050010.AG0050010form2.STOCK_UNIT_4.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form2.STOCK_UNIT_4.executePScriptOnLoad = function () {
  console.log('execute AG0050010form2/STOCK_UNIT_4.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form2-STOCK_UNIT_4');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="text" id="expj-AG0050010-AG0050010form2-STOCK_UNIT_4" name="STOCK_UNIT_4" class="AG0050010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0050010Struct.getSTOCK_UNIT_4()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3108",rb)%></span><!-- 出庫予定合計 --></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form2-SCDL_ISSUE_TOTAL">
expj.AG0050010.AG0050010form2.SCDL_ISSUE_TOTAL = {};
expj.AG0050010.AG0050010form2.SCDL_ISSUE_TOTAL.executeAllOnDecision = function () {
  console.log('execute AG0050010form2/SCDL_ISSUE_TOTAL.onDecision');
  expj.AG0050010.AG0050010form2.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form2.SCDL_ISSUE_TOTAL.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form2-SCDL_ISSUE_TOTAL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0050010', 'AG0050010form2', 'SCDL_ISSUE_TOTAL', this);
  });
  expj.AG0050010.AG0050010form2.SCDL_ISSUE_TOTAL.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form2.SCDL_ISSUE_TOTAL.executePScriptOnLoad = function () {
  console.log('execute AG0050010form2/SCDL_ISSUE_TOTAL.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form2-SCDL_ISSUE_TOTAL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AG0050010-AG0050010form2-SCDL_ISSUE_TOTAL" name="SCDL_ISSUE_TOTAL" class="AG0050010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAG0050010Struct.getSCDL_ISSUE_TOTAL()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form2-STOCK_UNIT_2">
expj.AG0050010.AG0050010form2.STOCK_UNIT_2 = {};
expj.AG0050010.AG0050010form2.STOCK_UNIT_2.executeAllOnDecision = function () {
  console.log('execute AG0050010form2/STOCK_UNIT_2.onDecision');
  expj.AG0050010.AG0050010form2.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form2.STOCK_UNIT_2.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form2-STOCK_UNIT_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0050010', 'AG0050010form2', 'STOCK_UNIT_2', this);
  });
  expj.AG0050010.AG0050010form2.STOCK_UNIT_2.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form2.STOCK_UNIT_2.executePScriptOnLoad = function () {
  console.log('execute AG0050010form2/STOCK_UNIT_2.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form2-STOCK_UNIT_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AG0050010-AG0050010form2-STOCK_UNIT_2" name="STOCK_UNIT_2" class="AG0050010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0050010Struct.getSTOCK_UNIT_2()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3109",rb)%></span><!-- 入庫予定合計 --></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form2-SCDL_RCV_TOTAL">
expj.AG0050010.AG0050010form2.SCDL_RCV_TOTAL = {};
expj.AG0050010.AG0050010form2.SCDL_RCV_TOTAL.executeAllOnDecision = function () {
  console.log('execute AG0050010form2/SCDL_RCV_TOTAL.onDecision');
  expj.AG0050010.AG0050010form2.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form2.SCDL_RCV_TOTAL.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form2-SCDL_RCV_TOTAL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0050010', 'AG0050010form2', 'SCDL_RCV_TOTAL', this);
  });
  expj.AG0050010.AG0050010form2.SCDL_RCV_TOTAL.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form2.SCDL_RCV_TOTAL.executePScriptOnLoad = function () {
  console.log('execute AG0050010form2/SCDL_RCV_TOTAL.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form2-SCDL_RCV_TOTAL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AG0050010-AG0050010form2-SCDL_RCV_TOTAL" name="SCDL_RCV_TOTAL" class="AG0050010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAG0050010Struct.getSCDL_RCV_TOTAL()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010form2-STOCK_UNIT_5">
expj.AG0050010.AG0050010form2.STOCK_UNIT_5 = {};
expj.AG0050010.AG0050010form2.STOCK_UNIT_5.executeAllOnDecision = function () {
  console.log('execute AG0050010form2/STOCK_UNIT_5.onDecision');
  expj.AG0050010.AG0050010form2.executeAllOnDecision();
  expj.AG0050010.executeAllOnDecision();
};
expj.AG0050010.AG0050010form2.STOCK_UNIT_5.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010form2-STOCK_UNIT_5').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0050010', 'AG0050010form2', 'STOCK_UNIT_5', this);
  });
  expj.AG0050010.AG0050010form2.STOCK_UNIT_5.executePScriptOnLoad();
};

expj.AG0050010.AG0050010form2.STOCK_UNIT_5.executePScriptOnLoad = function () {
  console.log('execute AG0050010form2/STOCK_UNIT_5.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010form2-STOCK_UNIT_5');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="text" id="expj-AG0050010-AG0050010form2-STOCK_UNIT_5" name="STOCK_UNIT_5" class="AG0050010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0050010Struct.getSTOCK_UNIT_5()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style=""></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame18" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame19" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame20 button-area-left" style="width:60px;"></div><!--/td-->
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
<div class="expj-td frame04" style=""></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AG0050010-AG0050010view1">
expj.AG0050010.AG0050010view1 = {};
expj.AG0050010.AG0050010view1.executeAllOnClick = function () {
};
expj.AG0050010.AG0050010view1.executeAllOnDecision = function () {
  console.log('execute AG0050010view1.onDecision');
};
expj.AG0050010.AG0050010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AG0050010view1", "expj.AG0050010.AG0050010view1.executeAllOnClick");
%>
  expj.AG0050010.AG0050010view1.executePScriptOnLoad();
};

expj.AG0050010.AG0050010view1.executePScriptOnLoad = function () {
  console.log('execute AG0050010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AG0050010-AG0050010view1" class="expj-datagrid-view expj-view-noselect" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AG0050010view1_Id = "AG0050010view1";
 String AG0050010view1_select = "single";
 String AG0050010view1_sortable = "true";
 String AG0050010view1_resize = "true";
 String AG0050010view1_scroll = "true";
 StringBuffer AG0050010view1_HB = new StringBuffer();
 StringBuffer AG0050010view1_DB = new StringBuffer();
%>
<%
 AG0050010view1_select = "none";
 AG0050010view1_sortable = "true";
 AG0050010view1_resize = "true";
 AG0050010view1_scroll = "true";
%>
<%
 AG0050010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
%>
     
<%
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'").append(DateWidth).append("px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0135",rb))).append("', 'name':'DELIVERY_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3110",rb))).append("', 'name':'INSIDE_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right").append("true".equals(TypeConverter.convert(IsExpJa)) ? " expj-view-cell-hidden " : " ").append("'").append(",'hidden':'").append(TypeConverter.convert(IsExpJa)).append("', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3180",rb))).append("', 'name':'INTEGRATE_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right").append("true".equals(TypeConverter.convert(IsExpJ)) ? " expj-view-cell-hidden " : " ").append("'").append(",'hidden':'").append(TypeConverter.convert(IsExpJ)).append("', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DM_QTY",rb))).append("', 'name':'DEMAND_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3111",rb))).append("', 'name':'STOCK_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'40px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3112",rb))).append("', 'name':'ADD_SUBTRACT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3122",rb))).append("', 'name':'EFFECT_STOCK_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_UNIT_1",rb))).append("', 'name':'PURCHASE_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0721",rb))).append("', 'name':'STATUS', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3114",rb))).append("', 'name':'PARENT_ORDER_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3118",rb))).append("', 'name':'PARENT_ORDER_ITEM_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'160px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3119",rb))).append("', 'name':'PARENT_ORDER_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3115",rb))).append("', 'name':'DEMAND_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3116",rb))).append("', 'name':'ORDER_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_CD",rb))).append("', 'name':'WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'160px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_NAME",rb))).append("', 'name':'WH_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3117",rb))).append("', 'name':'GNR_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CANCEL_NO",rb))).append("', 'name':'JOB_ODR_CANCEL_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_CD",rb))).append("', 'name':'CUST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_NAME",rb))).append("', 'name':'CUST_ANAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DLV_LOC_CD",rb))).append("', 'name':'DLV_LOC_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb))).append("', 'name':'DESINATED_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label").append("true".equals(TypeConverter.convert(IsExpJa)) ? " expj-view-cell-hidden " : " ").append("'").append(",'hidden':'").append(TypeConverter.convert(IsExpJa)).append("', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_ACPT_DATE",rb))).append("', 'name':'ODR_ACPT_DATE', 'class':'expj-tooltip expj-view-cell-label").append("true".equals(TypeConverter.convert(IsExpJa)) ? " expj-view-cell-hidden " : " ").append("'").append(",'hidden':'").append(TypeConverter.convert(IsExpJa)).append("', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_NAME",rb))).append("', 'name':'VEND_ANAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3120",rb))).append("', 'name':'ODR_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3121",rb))).append("', 'name':'PUCH_ODR_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3070",rb))).append("', 'name':'FIX_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right").append("true".equals(TypeConverter.convert(IsExpJ)) ? " expj-view-cell-hidden " : " ").append("'").append(",'hidden':'").append(TypeConverter.convert(IsExpJ)).append("', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3069",rb))).append("', 'name':'UNOFFICIAL_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right").append("true".equals(TypeConverter.convert(IsExpJ)) ? " expj-view-cell-hidden " : " ").append("'").append(",'hidden':'").append(TypeConverter.convert(IsExpJ)).append("', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3179",rb))).append("', 'name':'DEPOT_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right").append("true".equals(TypeConverter.convert(IsExpJ)) ? " expj-view-cell-hidden " : " ").append("'").append(",'hidden':'").append(TypeConverter.convert(IsExpJ)).append("', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_DEPOT_CTL_NO",rb))).append("', 'name':'ODR_DEPOT_CTL_NO', 'class':'expj-tooltip expj-view-cell-label").append("true".equals(TypeConverter.convert(IsExpJ)) ? " expj-view-cell-hidden " : " ").append("'").append(",'hidden':'").append(TypeConverter.convert(IsExpJ)).append("', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ODR_NO",rb))).append("', 'name':'CUST_ODR_NO', 'class':'expj-tooltip expj-view-cell-label").append("true".equals(TypeConverter.convert(IsExpJ)) ? " expj-view-cell-hidden " : " ").append("'").append(",'hidden':'").append(TypeConverter.convert(IsExpJ)).append("', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
AG0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_CHARACTERISTIC",rb))).append("', 'name':'ODR_CHARACTERISTIC', 'class':'expj-tooltip expj-view-cell-label").append("true".equals(TypeConverter.convert(IsExpJ)) ? " expj-view-cell-hidden " : " ").append("'").append(",'hidden':'").append(TypeConverter.convert(IsExpJ)).append("', 'sortable':").append(AG0050010view1_sortable).append("}").append(",");
%>
<%
 int aAG0050010StructLength = aAG0050010Control.getListsize();
 final AG0050010Struct structBackup = aAG0050010Struct;
 aAG0050010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAG0050010StructLength; ++loopCount) {
  if((aAG0050010Struct = (AG0050010Struct) aAG0050010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAG0050010Struct", aAG0050010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AG0050010view1_DB.append("[");
 AG0050010view1_DB.append(loopCount);
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-DELIVERY_DATE-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-DELIVERY_DATE\" data-name=\"DELIVERY_DATE\" data-view=\"true\" data-kind=\"").append(DateKind).append("\">").append(TypeConverter.sanitizer(aAG0050010Struct.getDELIVERY_DATE())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-INSIDE_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-INSIDE_ODR_QTY\" data-name=\"INSIDE_ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0050010Struct.getINSIDE_ODR_QTY())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-INTEGRATE_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-INTEGRATE_ODR_QTY\" data-name=\"INTEGRATE_ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0050010Struct.getINTEGRATE_ODR_QTY())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-DEMAND_QTY-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-DEMAND_QTY\" data-name=\"DEMAND_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0050010Struct.getDEMAND_QTY())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-STOCK_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-STOCK_ODR_QTY\" data-name=\"STOCK_ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0050010Struct.getSTOCK_ODR_QTY())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-ADD_SUBTRACT-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-ADD_SUBTRACT\" data-name=\"ADD_SUBTRACT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0050010Struct.getADD_SUBTRACT())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-EFFECT_STOCK_QTY-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-EFFECT_STOCK_QTY\" data-name=\"EFFECT_STOCK_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0050010Struct.getEFFECT_STOCK_QTY())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-PURCHASE_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-PURCHASE_UNIT\" data-name=\"PURCHASE_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0050010Struct.getPURCHASE_UNIT())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-STATUS-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-STATUS\" data-name=\"STATUS\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0050010Struct.getSTATUS())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-PARENT_ORDER_NO-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-PARENT_ORDER_NO\" data-name=\"PARENT_ORDER_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0050010Struct.getPARENT_ORDER_NO())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-PARENT_ORDER_ITEM_NO-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-PARENT_ORDER_ITEM_NO\" data-name=\"PARENT_ORDER_ITEM_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0050010Struct.getPARENT_ORDER_ITEM_NO())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-PARENT_ORDER_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-PARENT_ORDER_ITEM_NAME\" data-name=\"PARENT_ORDER_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0050010Struct.getPARENT_ORDER_ITEM_NAME())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-DEMAND_NO-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-DEMAND_NO\" data-name=\"DEMAND_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0050010Struct.getDEMAND_NO())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-ORDER_NO-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-ORDER_NO\" data-name=\"ORDER_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0050010Struct.getORDER_NO())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-JOB_ODR_CD\" data-name=\"JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0050010Struct.getJOB_ODR_CD())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-WH_CD-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-WH_CD\" data-name=\"WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0050010Struct.getWH_CD())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-WH_NAME-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-WH_NAME\" data-name=\"WH_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0050010Struct.getWH_NAME())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-GNR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-GNR_TYP\" data-name=\"GNR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0050010Struct.getGNR_TYP())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-JOB_ODR_CANCEL_NO-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-JOB_ODR_CANCEL_NO\" data-name=\"JOB_ODR_CANCEL_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0050010Struct.getJOB_ODR_CANCEL_NO())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-CUST_CD-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-CUST_CD\" data-name=\"CUST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0050010Struct.getCUST_CD())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-CUST_ANAME-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-CUST_ANAME\" data-name=\"CUST_ANAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0050010Struct.getCUST_ANAME())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-DLV_LOC_CD-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-DLV_LOC_CD\" data-name=\"DLV_LOC_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0050010Struct.getDLV_LOC_CD())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-DESINATED_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-DESINATED_DLV_DATE\" data-name=\"DESINATED_DLV_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAG0050010Struct.getDESINATED_DLV_DATE())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-ODR_ACPT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-ODR_ACPT_DATE\" data-name=\"ODR_ACPT_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAG0050010Struct.getODR_ACPT_DATE())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-VEND_CD\" data-name=\"VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0050010Struct.getVEND_CD())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-VEND_ANAME-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-VEND_ANAME\" data-name=\"VEND_ANAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0050010Struct.getVEND_ANAME())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-ODR_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-ODR_START_DATE\" data-name=\"ODR_START_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAG0050010Struct.getODR_START_DATE())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-PUCH_ODR_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-PUCH_ODR_START_DATE\" data-name=\"PUCH_ODR_START_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAG0050010Struct.getPUCH_ODR_START_DATE())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-FIX_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-FIX_ODR_QTY\" data-name=\"FIX_ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0050010Struct.getFIX_ODR_QTY())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-UNOFFICIAL_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-UNOFFICIAL_ODR_QTY\" data-name=\"UNOFFICIAL_ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0050010Struct.getUNOFFICIAL_ODR_QTY())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-DEPOT_QTY-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-DEPOT_QTY\" data-name=\"DEPOT_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAG0050010Struct.getDEPOT_QTY())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-ODR_DEPOT_CTL_NO-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-ODR_DEPOT_CTL_NO\" data-name=\"ODR_DEPOT_CTL_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0050010Struct.getODR_DEPOT_CTL_NO())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-CUST_ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-CUST_ODR_NO\" data-name=\"CUST_ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0050010Struct.getCUST_ODR_NO())).append("</span>'");
 AG0050010view1_DB.append(",").append("'<span id=\"expj-AG0050010-AG0050010view1-ODR_CHARACTERISTIC-").append(loopCount).append("\" class=\"expj-label expj-AG0050010-AG0050010view1-ODR_CHARACTERISTIC\" data-name=\"ODR_CHARACTERISTIC\" data-view=\"true\">").append(TypeConverter.sanitizer(aAG0050010Struct.getODR_CHARACTERISTIC())).append("</span>'");
 AG0050010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAG0050010StructLength) {
   AG0050010view1_DB.append(",");
  }
 }
 aAG0050010Struct = structBackup;
 viewIdList.add(AG0050010view1_Id);
 viewSelectList.add(AG0050010view1_select);
 viewResizeList.add(AG0050010view1_resize);
 viewScrollList.add(AG0050010view1_scroll);
 viewHeaderDataList.add(AG0050010view1_HB);
 viewBodyDataList.add(AG0050010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style=""></div><!--/td-->
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
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 200px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AG0050010 Revision: 1.12  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AG0050010-AG0050010button0">
expj.AG0050010.AG0050010button0 = {};
expj.AG0050010.AG0050010button0.executeAllOnDecision = function () {
  console.log('execute AG0050010button0.onDecision');
};
expj.AG0050010.AG0050010button0.executeOnLoad = function () {
  expj.AG0050010.AG0050010button0.executePScriptOnLoad();
};

expj.AG0050010.AG0050010button0.executePScriptOnLoad = function () {
  console.log('execute AG0050010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AG0050010-AG0050010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AG0050010-AG0050010button0-CsvOut">
expj.AG0050010.AG0050010button0.CsvOut = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AG0050010form1/*,_AG0050010form2/*@AG0050010Servlet,,$ZZ07011"
expj.AG0050010.AG0050010button0.CsvOut.onClick0 = function () {
  console.log('CsvOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AG0050010', 'AG0050010button0', '_AG0050010form1/*,_AG0050010form2/*', 'AG0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AG0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AG0050010', response);
expj.common.updateBusinessScreenTab('AG0050010', contents);
};
expj.common.pscript.callConfirm('AG0050010', 'AG0050010button0', 'ZZ07011', okEvent);
};
expj.AG0050010.AG0050010button0.CsvOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0050010.AG0050010button0.CsvOut['onClick' + i])) {
        expj.AG0050010.AG0050010button0.CsvOut['onClick' + i]();
      }
    }
  }
};
expj.AG0050010.AG0050010button0.CsvOut.executeAllOnDecision = function () {
};
expj.AG0050010.AG0050010button0.CsvOut.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010button0-CsvOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0050010', 'AG0050010button0', 'CsvOut', this, 'Button');
    }
  });
  expj.AG0050010.AG0050010button0.CsvOut.executePScriptOnLoad();
};

expj.AG0050010.AG0050010button0.CsvOut.executePScriptOnLoad = function () {
  console.log('execute AG0050010button0/CsvOut.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010button0-CsvOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0050010-AG0050010button0-CsvOut" name="CsvOut" class="AG0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010button0-clear">
expj.AG0050010.AG0050010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AG0050010Servlet,,$ZZ07008"
expj.AG0050010.AG0050010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AG0050010', 'AG0050010button0', '', 'AG0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AG0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AG0050010', response);
expj.common.updateBusinessScreenTab('AG0050010', contents);
};
expj.common.pscript.callConfirm('AG0050010', 'AG0050010button0', 'ZZ07008', okEvent);
};
expj.AG0050010.AG0050010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0050010.AG0050010button0.clear['onClick' + i])) {
        expj.AG0050010.AG0050010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AG0050010.AG0050010button0.clear.executeAllOnDecision = function () {
};
expj.AG0050010.AG0050010button0.clear.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0050010', 'AG0050010button0', 'clear', this, 'Button');
    }
  });
  expj.AG0050010.AG0050010button0.clear.executePScriptOnLoad();
};

expj.AG0050010.AG0050010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AG0050010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0050010-AG0050010button0-clear" name="clear" class="AG0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AG0050010-AG0050010button0-close">
expj.AG0050010.AG0050010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AG0050010.AG0050010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AG0050010');
};
expj.AG0050010.AG0050010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0050010.AG0050010button0.close['onClick' + i])) {
        expj.AG0050010.AG0050010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AG0050010.AG0050010button0.close.executeAllOnDecision = function () {
};
expj.AG0050010.AG0050010button0.close.executeOnLoad = function () {
  $('#expj-AG0050010-AG0050010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0050010', 'AG0050010button0', 'close', this, 'Button');
    }
  });
  expj.AG0050010.AG0050010button0.close.executePScriptOnLoad();
};

expj.AG0050010.AG0050010button0.close.executePScriptOnLoad = function () {
  console.log('execute AG0050010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AG0050010-AG0050010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0050010-AG0050010button0-close" name="close" class="AG0050010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AG0050010 (END)-->
<%
MessageStruct msgStruct = aAG0050010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AG0050010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AG0050010)) {
  expj.common.treeInstanceMap.AG0050010 = {};
}
expj.common.treeInstanceMap.AG0050010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AG0050010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AG0050010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AG0050010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AG0050010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AG0050010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AG0050010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AG0050010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AG0050010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AG0050010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AG0050010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0050010)) {
  expj.common.detailDialogMap.AG0050010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0050010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AG0050010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0050010.<%=detailId %>)) {
  expj.common.detailDialogMap.AG0050010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0050010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AG0050010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0050010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AG0050010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AG0050010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AG0050010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AG0050010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AG0050010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AG0050010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AG0050010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AG0050010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AG0050010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AG0050010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AG0050010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AG0050010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AG0050010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AG0050010)) {
  expj.common.viewInstanceMap.AG0050010 = {};
}
expj.common.viewInstanceMap.AG0050010.<%=viewId %> = {};
expj.common.viewInstanceMap.AG0050010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AG0050010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AG0050010.<%=viewId %>.init = function () {
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
    expj.AG0050010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AG0050010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AG0050010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AG0050010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AG0050010_init">
/**
 * AG0050010用のロード完了時初期化関数
 */
expj.AG0050010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AG0050010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AG0050010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AG0050010');
  expj.common.calendarInstanceMap.AG0050010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AG0050010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AG0050010.<%=detailId %>.init();
  expj.common.detailDialogMap.AG0050010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AG0050010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AG0050010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AG0050010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AG0050010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AG0050010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AG0050010-<%=detailId %>');
<%
 }
%>
  try{expj.AG0050010.AG0050010form1.w_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form1.PeekerWPlantCd.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form1.w_PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form1.w_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form1.PeekerWItemCd.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form1.w_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form1.rdoItemCd.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form1.w_PARENT_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form1.PeekerWPItemCd.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form1.w_PARENT_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form1.rdoParentItemCd.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form1.w_COMP_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form1.PeekerWCItemCd.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form1.w_COMP_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form1.rdoCompItemCd.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form1.checkMrpFlg.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form1.checkProdPlan.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form1.h_DM_CREATE_BASE_TBL.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form1.checkUncnfm.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form1.checkQty.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form1.h_INSTALL_FLG.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010button1.select.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form2.SCDL_ISSUE_TOTAL_FIX.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form2.SCDL_RCV_TOTAL_FIX.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form2.STOCK_UNIT_3.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form2.SCDL_ISSUE_TOTAL_NOFIX.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form2.STOCK_UNIT_1.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form2.SCDL_RCV_TOTAL_NOFIX.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form2.STOCK_UNIT_4.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form2.SCDL_ISSUE_TOTAL.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form2.STOCK_UNIT_2.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form2.SCDL_RCV_TOTAL.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form2.STOCK_UNIT_5.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010button0.CsvOut.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010button0.close.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form1.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010button1.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010form2.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010view1.executeOnLoad();}catch(e){};
  try{expj.AG0050010.AG0050010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AG0050010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AG0050010', 'AG0050010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AG0050010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AG0050010-focus-move');
  // 初期フォーカス当てる処理
  $('.AG0050010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AG0050010', '<%=request.getContextPath() %>');
};

/**
 * AG0050010の全体onDecision処理
 */
expj.AG0050010.executeAllOnDecision = function () {
  expj.AG0050010.AG0050010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AG0050010_console">
expj.AG0050010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>