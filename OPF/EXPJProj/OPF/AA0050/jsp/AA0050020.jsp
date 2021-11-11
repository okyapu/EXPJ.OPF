<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:21:55 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0050\AA0050020.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0050.*" %>
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
<jsp:useBean id="aAA0050020Control" class="com.nec.jp.orteus.metamorBase.AA0050.AA0050020Control" scope="request"/>
<jsp:useBean id="aAA0050020Struct" class="com.nec.jp.orteus.metamorBase.AA0050.AA0050020Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************>
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

保管先優先順位メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0050/jsp/AA0050020.jsp,v $
$Author: geng-jia $
$Revision: 1.12 $ $Date: 2017/02/22 02:03:51 $
********************************************************* --%>
<html>
<head>
<title>保管先優先順位メンテナンス</title>
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
<script class="expj-script-AA0050020_init">
  // AA0050020名前空間
  expj.AA0050020 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AA0050020" data-screen="AA0050020" data-newdata="<%=aAA0050020Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px">
      <div class="expj-td" style=""></div><!--/td-->

    </div><!--/tr-->

<% /*
                      script9="child;5;CHK;_AA0050020form1/ITEM_CD[eq]_AA0050020form1/h_ITEM_CD@*6,*7"
*/ %>
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
              <script class="expj-script-AA0050020-AA0050020form1">
expj.AA0050020.AA0050020form1 = {};
// script1="onLoad;0;CALL;child@0"
expj.AA0050020.AA0050020form1.onLoad0 = function () {
  console.log('AA0050020form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;CHK;?AA0050020form1/*[neq]NORMAL@*1"
expj.AA0050020.AA0050020form1.child0 = function () {
  console.log('AA0050020form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050020form1', '?AA0050020form1/*'), '[neq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;1;MASK;_AA0050020button2/modify,_AA0050020button2/copy,_AA0050020button2/erase@*2"
expj.AA0050020.AA0050020form1.child1 = function () {
  console.log('AA0050020form1 script3');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/modify');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/copy');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/erase');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script4="child;2;CHK;?AA0050020form1/*[neq]NOT_FOUND@*3,*4"
expj.AA0050020.AA0050020form1.child2 = function () {
  console.log('AA0050020form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050020form1', '?AA0050020form1/*'), '[neq]', 'NOT_FOUND')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script5="child;3;MASK;_AA0050020button2/append,_AA0050020button2/eraseAll,_AA0050020button2/change"
expj.AA0050020.AA0050020form1.child3 = function () {
  console.log('AA0050020form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/append');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/eraseAll');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/change');
};
// script6="child;4;MASK;_AA0050020button2/eraseAll,_AA0050020button2/change"
expj.AA0050020.AA0050020form1.child4 = function () {
  console.log('AA0050020form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/eraseAll');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/change');
};
// script7="onLoad;1;CALL;onDecision@0,1,2"
expj.AA0050020.AA0050020form1.onLoad1 = function () {
  console.log('AA0050020form1 script7');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script8="onDecision;0;CHKRQ;A@*5,*6"
expj.AA0050020.AA0050020form1.onDecision0 = function () {
  console.log('AA0050020form1 script8');
if (expj.common.pscript.satisfiedRequiredComponent('AA0050020', 'A')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script9="child;5;UNMASK;_AA0050020button1/select@*7"
expj.AA0050020.AA0050020form1.child5 = function () {
  console.log('AA0050020form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button1/select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child7)){this.child7();}}
};
// script10="child;6;MASK;_AA0050020button1/select,_AA0050020button2/append,_AA0050020button2/modify,_AA0050020button2/copy,_AA0050020button2/erase,_AA0050020button2/eraseAll,_AA0050020button2/change"
expj.AA0050020.AA0050020form1.child6 = function () {
  console.log('AA0050020form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button1/select');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/append');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/modify');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/copy');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/erase');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/eraseAll');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/change');
};
// script11="child;7;CHK;?AA0050020form1/*[eq]NORMAL@*8,*11"
expj.AA0050020.AA0050020form1.child7 = function () {
  console.log('AA0050020form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050020form1', '?AA0050020form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script12="child;8;CHK;_AA0050020form1/ITEM_CD[eq]_AA0050020form1/h_ITEM_CD@*9,*10"
expj.AA0050020.AA0050020form1.child8 = function () {
  console.log('AA0050020form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050020form1', '_AA0050020form1/ITEM_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050020form1', '_AA0050020form1/h_ITEM_CD'))) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script13="child;9;UNMASK;_AA0050020button2/append,_AA0050020button2/eraseAll,_AA0050020button2/change"
expj.AA0050020.AA0050020form1.child9 = function () {
  console.log('AA0050020form1 script13');
expj.common.pscript.setUnMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/append');
expj.common.pscript.setUnMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/eraseAll');
expj.common.pscript.setUnMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/change');
};
// script14="child;10;MASK;_AA0050020button2/append,_AA0050020button2/eraseAll,_AA0050020button2/change"
expj.AA0050020.AA0050020form1.child10 = function () {
  console.log('AA0050020form1 script14');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/append');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/eraseAll');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/change');
};
// script15="child;11;CHK;_AA0050020form1/ITEM_CD[eq]_AA0050020form1/h_ITEM_CD@*12,*13"
expj.AA0050020.AA0050020form1.child11 = function () {
  console.log('AA0050020form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050020form1', '_AA0050020form1/ITEM_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050020form1', '_AA0050020form1/h_ITEM_CD'))) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script16="child;12;UNMASK;_AA0050020button2/append"
expj.AA0050020.AA0050020form1.child12 = function () {
  console.log('AA0050020form1 script16');
expj.common.pscript.setUnMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/append');
};
// script17="child;13;MASK;_AA0050020button2/append"
expj.AA0050020.AA0050020form1.child13 = function () {
  console.log('AA0050020form1 script17');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/append');
};
// script18="onDecision;1;CHKRQ;?AA0050020view1/?[eq]SINGLE@*14,*21"
expj.AA0050020.AA0050020form1.onDecision1 = function () {
  console.log('AA0050020form1 script18');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050020form1', '?AA0050020view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
}
};
// script19="child;14;CHK;?AA0050020form1/*[eq]NORMAL@*15,*18"
expj.AA0050020.AA0050020form1.child14 = function () {
  console.log('AA0050020form1 script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050020form1', '?AA0050020form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script20="child;15;CHK;_AA0050020form1/ITEM_CD[eq]_AA0050020form1/h_ITEM_CD@*16,*17"
expj.AA0050020.AA0050020form1.child15 = function () {
  console.log('AA0050020form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050020form1', '_AA0050020form1/ITEM_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050020form1', '_AA0050020form1/h_ITEM_CD'))) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
} else {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script21="child;16;UNMASK;_AA0050020button2/append,_AA0050020button2/modify,_AA0050020button2/copy,_AA0050020button2/erase,_AA0050020button2/eraseAll,_AA0050020button2/change"
expj.AA0050020.AA0050020form1.child16 = function () {
  console.log('AA0050020form1 script21');
expj.common.pscript.setUnMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/append');
expj.common.pscript.setUnMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/modify');
expj.common.pscript.setUnMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/copy');
expj.common.pscript.setUnMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/erase');
expj.common.pscript.setUnMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/eraseAll');
expj.common.pscript.setUnMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/change');
};
// script22="child;17;MASK;_AA0050020button2/append,_AA0050020button2/modify,_AA0050020button2/copy,_AA0050020button2/erase,_AA0050020button2/eraseAll,_AA0050020button2/change"
expj.AA0050020.AA0050020form1.child17 = function () {
  console.log('AA0050020form1 script22');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/append');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/modify');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/copy');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/erase');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/eraseAll');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/change');
};
// script23="child;18;CHK;?AA0050020form1/*[neq]INITIAL@*19"
expj.AA0050020.AA0050020form1.child18 = function () {
  console.log('AA0050020form1 script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050020form1', '?AA0050020form1/*'), '[neq]', 'INITIAL')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script24="child;19;CHK;_AA0050020form1/ITEM_CD[eq]_AA0050020form1/h_ITEM_CD@*20,*21"
expj.AA0050020.AA0050020form1.child19 = function () {
  console.log('AA0050020form1 script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050020form1', '_AA0050020form1/ITEM_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050020form1', '_AA0050020form1/h_ITEM_CD'))) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
} else {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
}
};
// script25="child;20;UNMASK;_AA0050020button2/modify,_AA0050020button2/copy,_AA0050020button2/erase"
expj.AA0050020.AA0050020form1.child20 = function () {
  console.log('AA0050020form1 script25');
expj.common.pscript.setUnMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/modify');
expj.common.pscript.setUnMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/copy');
expj.common.pscript.setUnMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/erase');
};
// script26="child;21;MASK;_AA0050020button2/modify,_AA0050020button2/copy,_AA0050020button2/erase"
expj.AA0050020.AA0050020form1.child21 = function () {
  console.log('AA0050020form1 script26');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/modify');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/copy');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button2/erase');
};
// script27="onDecision;2;CHK;?AA0050020form1/*[eq]NORMAL[or]?AA0050020form1/*[eq]NOT_FOUND@*22,*24"
expj.AA0050020.AA0050020form1.onDecision2 = function () {
  console.log('AA0050020form1 script27');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050020form1', '?AA0050020form1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050020form1', '?AA0050020form1/*'), '[eq]', 'NOT_FOUND')) {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
} else {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
}
};
// script28="child;22;CHK;_AA0050020form1/ITEM_CD[eq]_AA0050020form1/h_ITEM_CD@*23,*24"
expj.AA0050020.AA0050020form1.child22 = function () {
  console.log('AA0050020form1 script28');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050020form1', '_AA0050020form1/ITEM_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050020form1', '_AA0050020form1/h_ITEM_CD'))) {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
} else {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
}
};
// script29="child;23;UNMASK;_AA0050020button3/Update"
expj.AA0050020.AA0050020form1.child23 = function () {
  console.log('AA0050020form1 script29');
expj.common.pscript.setUnMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button3/Update');
};
// script30="child;24;MASK;_AA0050020button3/Update"
expj.AA0050020.AA0050020form1.child24 = function () {
  console.log('AA0050020form1 script30');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050020form1', '_AA0050020button3/Update');
};
expj.AA0050020.AA0050020form1.executeAllOnDecision = function () {
  console.log('execute AA0050020form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0050020.AA0050020form1['onDecision' + i])) {
        expj.AA0050020.AA0050020form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0050020.AA0050020form1.executeOnLoad = function () {
  expj.AA0050020.AA0050020form1.executePScriptOnLoad();
};

expj.AA0050020.AA0050020form1.executePScriptOnLoad = function () {
  console.log('execute AA0050020form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AA0050020.AA0050020form1['onLoad' + i])) {
      expj.AA0050020.AA0050020form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0050020-AA0050020form1" action="AA0050020Servlet" name="AA0050020form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAA0050020Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AA0050020-AA0050020form1-ITEM_CD">
expj.AA0050020.AA0050020form1.ITEM_CD = {};
expj.AA0050020.AA0050020form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0050020form1/ITEM_CD.onDecision');
  expj.AA0050020.AA0050020form1.executeAllOnDecision();
  expj.AA0050020.executeAllOnDecision();
};
expj.AA0050020.AA0050020form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050020form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0050020', 'AA0050020form1', 'ITEM_CD', this);
  });
  expj.AA0050020.AA0050020form1.ITEM_CD.executePScriptOnLoad();
};

expj.AA0050020.AA0050020form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0050020form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050020form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0050020-AA0050020form1-ITEM_CD" name="ITEM_CD" class="AA0050020-focus-move  required-value expj-AA0050020-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0050020Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AA0050020-AA0050020form1-h_ITEM_CD" name="h_ITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0050020Struct.geth_ITEM_CD()) %>">
<script class="expj-script-AA0050020-AA0050020form1-h_ITEM_CD">
expj.AA0050020.AA0050020form1.h_ITEM_CD = {};
expj.AA0050020.AA0050020form1.h_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0050020form1/h_ITEM_CD.onDecision');
  expj.AA0050020.AA0050020form1.executeAllOnDecision();
  expj.AA0050020.executeAllOnDecision();
};
expj.AA0050020.AA0050020form1.h_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050020form1-h_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0050020', 'AA0050020form1', 'h_ITEM_CD', this);
  });
  expj.AA0050020.AA0050020form1.h_ITEM_CD.executePScriptOnLoad();
};

expj.AA0050020.AA0050020form1.h_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0050020form1/h_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050020form1-h_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AA0050020-AA0050020form1-PeekerItemCd">
expj.AA0050020.AA0050020form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AA0050020form1/ITEM_CD@<%=contextNo%>"
expj.AA0050020.AA0050020form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0050020';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050020form1', '_AA0050020form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0050020form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0050020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0050020.AA0050020form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0050020.AA0050020form1.PeekerItemCd['onClick' + i])) {
        expj.AA0050020.AA0050020form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AA0050020.AA0050020form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AA0050020.AA0050020form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050020form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0050020', 'AA0050020form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AA0050020.AA0050020form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AA0050020.AA0050020form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AA0050020form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050020form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0050020-AA0050020form1-PeekerItemCd" class="AA0050020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0050020-AA0050020form1-ITEM_NAME">
expj.AA0050020.AA0050020form1.ITEM_NAME = {};
expj.AA0050020.AA0050020form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AA0050020form1/ITEM_NAME.onDecision');
  expj.AA0050020.AA0050020form1.executeAllOnDecision();
  expj.AA0050020.executeAllOnDecision();
};
expj.AA0050020.AA0050020form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050020form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0050020', 'AA0050020form1', 'ITEM_NAME', this);
  });
  expj.AA0050020.AA0050020form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AA0050020.AA0050020form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0050020form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050020form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0050020-AA0050020form1-ITEM_NAME" name="ITEM_NAME" class="AA0050020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0050020Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AA0050020-AA0050020form1-MRP_ODR_TYP" name="MRP_ODR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0050020Struct.getMRP_ODR_TYP()) %>">
<script class="expj-script-AA0050020-AA0050020form1-MRP_ODR_TYP">
expj.AA0050020.AA0050020form1.MRP_ODR_TYP = {};
expj.AA0050020.AA0050020form1.MRP_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute AA0050020form1/MRP_ODR_TYP.onDecision');
  expj.AA0050020.AA0050020form1.executeAllOnDecision();
  expj.AA0050020.executeAllOnDecision();
};
expj.AA0050020.AA0050020form1.MRP_ODR_TYP.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050020form1-MRP_ODR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0050020', 'AA0050020form1', 'MRP_ODR_TYP', this);
  });
  expj.AA0050020.AA0050020form1.MRP_ODR_TYP.executePScriptOnLoad();
};

expj.AA0050020.AA0050020form1.MRP_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0050020form1/MRP_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050020form1-MRP_ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0050020-AA0050020form1-OUTSIDE_TYP" name="OUTSIDE_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0050020Struct.getOUTSIDE_TYP()) %>">
<script class="expj-script-AA0050020-AA0050020form1-OUTSIDE_TYP">
expj.AA0050020.AA0050020form1.OUTSIDE_TYP = {};
expj.AA0050020.AA0050020form1.OUTSIDE_TYP.executeAllOnDecision = function () {
  console.log('execute AA0050020form1/OUTSIDE_TYP.onDecision');
  expj.AA0050020.AA0050020form1.executeAllOnDecision();
  expj.AA0050020.executeAllOnDecision();
};
expj.AA0050020.AA0050020form1.OUTSIDE_TYP.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050020form1-OUTSIDE_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0050020', 'AA0050020form1', 'OUTSIDE_TYP', this);
  });
  expj.AA0050020.AA0050020form1.OUTSIDE_TYP.executePScriptOnLoad();
};

expj.AA0050020.AA0050020form1.OUTSIDE_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0050020form1/OUTSIDE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050020form1-OUTSIDE_TYP');
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AA0050020-AA0050020button1">
expj.AA0050020.AA0050020button1 = {};
expj.AA0050020.AA0050020button1.executeAllOnDecision = function () {
  console.log('execute AA0050020button1.onDecision');
};
expj.AA0050020.AA0050020button1.executeOnLoad = function () {
  expj.AA0050020.AA0050020button1.executePScriptOnLoad();
};

expj.AA0050020.AA0050020button1.executePScriptOnLoad = function () {
  console.log('execute AA0050020button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0050020-AA0050020button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0050020-AA0050020button1-Detail">
expj.AA0050020.AA0050020button1.Detail = {};
// script1="onClick;0;FSHOW;AA0050020float1"
expj.AA0050020.AA0050020button1.Detail.onClick0 = function () {
  console.log('Detail script1');
expj.common.pscript.showDetailWindow('AA0050020', 'AA0050020float1', '');
};
expj.AA0050020.AA0050020button1.Detail.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0050020.AA0050020button1.Detail['onClick' + i])) {
        expj.AA0050020.AA0050020button1.Detail['onClick' + i]();
      }
    }
  }
};
expj.AA0050020.AA0050020button1.Detail.executeAllOnDecision = function () {
};
expj.AA0050020.AA0050020button1.Detail.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050020button1-Detail').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0050020', 'AA0050020button1', 'Detail', this, 'Button');
    }
  });
  expj.AA0050020.AA0050020button1.Detail.executePScriptOnLoad();
};

expj.AA0050020.AA0050020button1.Detail.executePScriptOnLoad = function () {
  console.log('execute AA0050020button1/Detail.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050020button1-Detail');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0050020-AA0050020button1-Detail" name="Detail" class="AA0050020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDetail",rb)%></button><!-- 詳細ボタン --></div><!--/td-->
<script class="expj-script-AA0050020-AA0050020button1-select">
expj.AA0050020.AA0050020button1.select = {};
// script1="onClick;0;SET;_AA0050020form1/h_ITEM_CD=_AA0050020form1/ITEM_CD"
expj.AA0050020.AA0050020button1.select.onClick0 = function () {
  console.log('select script1');
expj.common.pscript.setReferenceComponentValue('AA0050020', 'AA0050020button1', '_AA0050020form1/h_ITEM_CD', expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050020button1', '_AA0050020form1/ITEM_CD'));
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0050020form1/*@AA0050020Servlet"
expj.AA0050020.AA0050020button1.select.onClick1 = function () {
  console.log('select script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0050020', 'AA0050020button1', '_AA0050020form1/*', 'AA0050020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0050020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0050020', response);
expj.common.updateBusinessScreenTab('AA0050020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0050020.AA0050020button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0050020.AA0050020button1.select['onClick' + i])) {
        expj.AA0050020.AA0050020button1.select['onClick' + i]();
      }
    }
  }
};
expj.AA0050020.AA0050020button1.select.executeAllOnDecision = function () {
};
expj.AA0050020.AA0050020button1.select.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050020button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0050020', 'AA0050020button1', 'select', this, 'Button');
    }
  });
  expj.AA0050020.AA0050020button1.select.executePScriptOnLoad();
};

expj.AA0050020.AA0050020button1.select.executePScriptOnLoad = function () {
  console.log('execute AA0050020button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050020button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0050020-AA0050020button1-select" name="select" class="AA0050020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><script class="expj-script-AA0050020-AA0050020form2">
expj.AA0050020.AA0050020form2 = {};
expj.AA0050020.AA0050020form2.executeAllOnDecision = function () {
  console.log('execute AA0050020form2.onDecision');
};
expj.AA0050020.AA0050020form2.executeOnLoad = function () {
  expj.AA0050020.AA0050020form2.executePScriptOnLoad();
};

expj.AA0050020.AA0050020form2.executePScriptOnLoad = function () {
  console.log('execute AA0050020form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0050020-AA0050020form2" action="AA0050020Servlet" name="AA0050020form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WH_CD_8",rb)%></span><!-- 入庫先保管区コード --></div><!--/td-->
<script class="expj-script-AA0050020-AA0050020form2-RCV_WH_CD">
expj.AA0050020.AA0050020form2.RCV_WH_CD = {};
expj.AA0050020.AA0050020form2.RCV_WH_CD.executeAllOnDecision = function () {
  console.log('execute AA0050020form2/RCV_WH_CD.onDecision');
  expj.AA0050020.AA0050020form2.executeAllOnDecision();
  expj.AA0050020.executeAllOnDecision();
};
expj.AA0050020.AA0050020form2.RCV_WH_CD.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050020form2-RCV_WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0050020', 'AA0050020form2', 'RCV_WH_CD', this);
  });
  expj.AA0050020.AA0050020form2.RCV_WH_CD.executePScriptOnLoad();
};

expj.AA0050020.AA0050020form2.RCV_WH_CD.executePScriptOnLoad = function () {
  console.log('execute AA0050020form2/RCV_WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050020form2-RCV_WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0050020-AA0050020form2-RCV_WH_CD" name="RCV_WH_CD" class="AA0050020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0050020Struct.getRCV_WH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0050020-AA0050020form2-PeekerRcvWhCd">
expj.AA0050020.AA0050020form2.PeekerRcvWhCd = {};
// script1="onClick;0;PEEKER;_AA0050020form2/RCV_WH_CD@<%=contextNo%>"
expj.AA0050020.AA0050020form2.PeekerRcvWhCd.onClick0 = function () {
  console.log('PeekerRcvWhCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0050020';
var parameterValues = 'PeekerRcvWhCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AA0050020', 'PeekerRcvWhCd', 'SQLPARAM_1', '<%=aAA0050020Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050020form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050020form2', '_AA0050020form2/RCV_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_08%&%';
parameterValues += 'TARGET_FIELD%=%_AA0050020form2/RCV_WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0050020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0050020.AA0050020form2.PeekerRcvWhCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0050020.AA0050020form2.PeekerRcvWhCd['onClick' + i])) {
        expj.AA0050020.AA0050020form2.PeekerRcvWhCd['onClick' + i]();
      }
    }
  }
};
expj.AA0050020.AA0050020form2.PeekerRcvWhCd.executeAllOnDecision = function () {
};
expj.AA0050020.AA0050020form2.PeekerRcvWhCd.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050020form2-PeekerRcvWhCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0050020', 'AA0050020form2', 'PeekerRcvWhCd', this, 'Button');
    }
  });
  expj.AA0050020.AA0050020form2.PeekerRcvWhCd.executePScriptOnLoad();
};

expj.AA0050020.AA0050020form2.PeekerRcvWhCd.executePScriptOnLoad = function () {
  console.log('execute AA0050020form2/PeekerRcvWhCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050020form2-PeekerRcvWhCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0050020-AA0050020form2-PeekerRcvWhCd" class="AA0050020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0050020-AA0050020form2-RCV_WH_NAME">
expj.AA0050020.AA0050020form2.RCV_WH_NAME = {};
expj.AA0050020.AA0050020form2.RCV_WH_NAME.executeAllOnDecision = function () {
  console.log('execute AA0050020form2/RCV_WH_NAME.onDecision');
  expj.AA0050020.AA0050020form2.executeAllOnDecision();
  expj.AA0050020.executeAllOnDecision();
};
expj.AA0050020.AA0050020form2.RCV_WH_NAME.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050020form2-RCV_WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0050020', 'AA0050020form2', 'RCV_WH_NAME', this);
  });
  expj.AA0050020.AA0050020form2.RCV_WH_NAME.executePScriptOnLoad();
};

expj.AA0050020.AA0050020form2.RCV_WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0050020form2/RCV_WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050020form2-RCV_WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0050020-AA0050020form2-RCV_WH_NAME" name="RCV_WH_NAME" class="AA0050020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0050020Struct.getRCV_WH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0050020-AA0050020button3">
expj.AA0050020.AA0050020button3 = {};
expj.AA0050020.AA0050020button3.executeAllOnDecision = function () {
  console.log('execute AA0050020button3.onDecision');
};
expj.AA0050020.AA0050020button3.executeOnLoad = function () {
  expj.AA0050020.AA0050020button3.executePScriptOnLoad();
};

expj.AA0050020.AA0050020button3.executePScriptOnLoad = function () {
  console.log('execute AA0050020button3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0050020-AA0050020button3" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0050020-AA0050020button3-Update">
expj.AA0050020.AA0050020button3.Update = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0050020form1/*,_AA0050020form2/*@AA0050020Servlet,,$ZZ07003"
expj.AA0050020.AA0050020button3.Update.onClick0 = function () {
  console.log('Update script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0050020', 'AA0050020button3', '_AA0050020form1/*,_AA0050020form2/*', 'AA0050020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0050020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0050020', response);
expj.common.updateBusinessScreenTab('AA0050020', contents);
};
expj.common.pscript.callConfirm('AA0050020', 'AA0050020button3', 'ZZ07003', okEvent);
};
expj.AA0050020.AA0050020button3.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0050020.AA0050020button3.Update['onClick' + i])) {
        expj.AA0050020.AA0050020button3.Update['onClick' + i]();
      }
    }
  }
};
expj.AA0050020.AA0050020button3.Update.executeAllOnDecision = function () {
};
expj.AA0050020.AA0050020button3.Update.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050020button3-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0050020', 'AA0050020button3', 'Update', this, 'Button');
    }
  });
  expj.AA0050020.AA0050020button3.Update.executePScriptOnLoad();
};

expj.AA0050020.AA0050020button3.Update.executePScriptOnLoad = function () {
  console.log('execute AA0050020button3/Update.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050020button3-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0050020-AA0050020button3-Update" name="Update" class="AA0050020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AA0050020-AA0050020view1">
expj.AA0050020.AA0050020view1 = {};
expj.AA0050020.AA0050020view1.executeAllOnClick = function () {
};
expj.AA0050020.AA0050020view1.executeAllOnDecision = function () {
  console.log('execute AA0050020view1.onDecision');
};
expj.AA0050020.AA0050020view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0050020view1", "expj.AA0050020.AA0050020view1.executeAllOnClick");
%>
  expj.AA0050020.AA0050020view1.executePScriptOnLoad();
};

expj.AA0050020.AA0050020view1.executePScriptOnLoad = function () {
  console.log('execute AA0050020view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0050020-AA0050020view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AA0050020view1_Id = "AA0050020view1";
 String AA0050020view1_select = "single";
 String AA0050020view1_sortable = "true";
 String AA0050020view1_resize = "true";
 String AA0050020view1_scroll = "true";
 StringBuffer AA0050020view1_HB = new StringBuffer();
 StringBuffer AA0050020view1_DB = new StringBuffer();
%>
<%
 AA0050020view1_select = "single";
 AA0050020view1_sortable = "true";
 AA0050020view1_resize = "true";
 AA0050020view1_scroll = "true";
%>
<%
 AA0050020view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0050020view1_sortable).append("}").append(",");
%>
    <script class="expj-script-AA0050020-AA0050020view1-w_MODIFY_COUNT">
expj.AA0050020.AA0050020view1.w_MODIFY_COUNT = {};
expj.AA0050020.AA0050020view1.w_MODIFY_COUNT.executeAllOnClick = function () {
};
expj.AA0050020.AA0050020view1.w_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AA0050020view1/w_MODIFY_COUNT.onDecision');
  expj.AA0050020.AA0050020view1.executeAllOnDecision();
  expj.AA0050020.executeAllOnDecision();
};
expj.AA0050020.AA0050020view1.w_MODIFY_COUNT.executeOnLoad = function () {
  $('.expj-AA0050020-AA0050020view1-w_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0050020', 'AA0050020view1', 'w_MODIFY_COUNT', this);
  });
  expj.AA0050020.AA0050020view1.w_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AA0050020.AA0050020view1.w_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AA0050020view1/w_MODIFY_COUNT.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 
<%
AA0050020view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_CD_9",rb))).append("', 'name':'WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0050020view1_sortable).append("}").append(",");
AA0050020view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_NAME_4",rb))).append("', 'name':'WH_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0050020view1_sortable).append("}").append(",");
AA0050020view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'NO_A', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0050020view1_sortable).append("}").append(",");
AA0050020view1_HB.append("{'visible':true, 'type':'numeric', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_PRIORITY_REF_NO_1",rb))).append("', 'name':'WH_PRIORITY_REF_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0050020view1_sortable).append("}").append(",");
AA0050020view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'w_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0050020view1_sortable).append("}").append(",");
%>
<%
 int aAA0050020StructLength = aAA0050020Control.getListsize();
 final AA0050020Struct structBackup = aAA0050020Struct;
 aAA0050020Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0050020StructLength; ++loopCount) {
  if((aAA0050020Struct = (AA0050020Struct) aAA0050020Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0050020Struct", aAA0050020Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AA0050020view1_DB.append("[");
 AA0050020view1_DB.append(loopCount);
 AA0050020view1_DB.append(",").append("'<span id=\"expj-AA0050020-AA0050020view1-WH_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0050020-AA0050020view1-WH_CD\" data-name=\"WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0050020Struct.getWH_CD())).append("</span>'");
 AA0050020view1_DB.append(",").append("'<span id=\"expj-AA0050020-AA0050020view1-WH_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0050020-AA0050020view1-WH_NAME\" data-name=\"WH_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0050020Struct.getWH_NAME())).append("</span>'");
 AA0050020view1_DB.append(",").append("'<span id=\"expj-AA0050020-AA0050020view1-NO_A-").append(loopCount).append("\" class=\"expj-label expj-AA0050020-AA0050020view1-NO_A\" data-name=\"NO_A\" data-view=\"true\">").append("").append("</span>'");
 AA0050020view1_DB.append(",").append("'<span id=\"expj-AA0050020-AA0050020view1-WH_PRIORITY_REF_NO-").append(loopCount).append("\" class=\"expj-label expj-AA0050020-AA0050020view1-WH_PRIORITY_REF_NO\" data-name=\"WH_PRIORITY_REF_NO\" data-view=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0050020Struct.getWH_PRIORITY_REF_NO())).append("</span>'");
 AA0050020view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AA0050020-AA0050020view1-w_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-AA0050020-AA0050020view1-w_MODIFY_COUNT AA0050020-focus-move\" data-name=\"w_MODIFY_COUNT\" data-view=\"true\" maxlength=\"2147483647\" data-kind=\"").append("").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAA0050020Struct.getw_MODIFY_COUNT())).append("\">'");
 AA0050020view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAA0050020StructLength) {
   AA0050020view1_DB.append(",");
  }
 }
 aAA0050020Struct = structBackup;
 viewIdList.add(AA0050020view1_Id);
 viewSelectList.add(AA0050020view1_select);
 viewResizeList.add(AA0050020view1_resize);
 viewScrollList.add(AA0050020view1_scroll);
 viewHeaderDataList.add(AA0050020view1_HB);
 viewBodyDataList.add(AA0050020view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:630px;"><script class="expj-script-AA0050020-AA0050020button2">
expj.AA0050020.AA0050020button2 = {};
expj.AA0050020.AA0050020button2.executeAllOnDecision = function () {
  console.log('execute AA0050020button2.onDecision');
};
expj.AA0050020.AA0050020button2.executeOnLoad = function () {
  expj.AA0050020.AA0050020button2.executePScriptOnLoad();
};

expj.AA0050020.AA0050020button2.executePScriptOnLoad = function () {
  console.log('execute AA0050020button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0050020-AA0050020button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:630px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0050020-AA0050020button2-append">
expj.AA0050020.AA0050020button2.append = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0050020form1/*@AA0050020Servlet"
expj.AA0050020.AA0050020button2.append.onClick0 = function () {
  console.log('append script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0050020', 'AA0050020button2', '_AA0050020form1/*', 'AA0050020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0050020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0050020', response);
expj.common.changeBusinessScreenTab('AA0050020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0050020.AA0050020button2.append.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0050020.AA0050020button2.append['onClick' + i])) {
        expj.AA0050020.AA0050020button2.append['onClick' + i]();
      }
    }
  }
};
expj.AA0050020.AA0050020button2.append.executeAllOnDecision = function () {
};
expj.AA0050020.AA0050020button2.append.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050020button2-append').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0050020', 'AA0050020button2', 'append', this, 'Button');
    }
  });
  expj.AA0050020.AA0050020button2.append.executePScriptOnLoad();
};

expj.AA0050020.AA0050020button2.append.executePScriptOnLoad = function () {
  console.log('execute AA0050020button2/append.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050020button2-append');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0050020-AA0050020button2-append" name="append" class="AA0050020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsert",rb)%></button><!-- 行追加ボタン --></div><!--/td-->
<script class="expj-script-AA0050020-AA0050020button2-modify">
expj.AA0050020.AA0050020button2.modify = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0050020form1/*,_AA0050020view1/+@AA0050020Servlet"
expj.AA0050020.AA0050020button2.modify.onClick0 = function () {
  console.log('modify script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0050020', 'AA0050020button2', '_AA0050020form1/*,_AA0050020view1/+', 'AA0050020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0050020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0050020', response);
expj.common.changeBusinessScreenTab('AA0050020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0050020.AA0050020button2.modify.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0050020.AA0050020button2.modify['onClick' + i])) {
        expj.AA0050020.AA0050020button2.modify['onClick' + i]();
      }
    }
  }
};
expj.AA0050020.AA0050020button2.modify.executeAllOnDecision = function () {
};
expj.AA0050020.AA0050020button2.modify.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050020button2-modify').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0050020', 'AA0050020button2', 'modify', this, 'Button');
    }
  });
  expj.AA0050020.AA0050020button2.modify.executePScriptOnLoad();
};

expj.AA0050020.AA0050020button2.modify.executePScriptOnLoad = function () {
  console.log('execute AA0050020button2/modify.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050020button2-modify');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0050020-AA0050020button2-modify" name="modify" class="AA0050020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
<script class="expj-script-AA0050020-AA0050020button2-copy">
expj.AA0050020.AA0050020button2.copy = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0050020form1/*,_AA0050020view1/+@AA0050020Servlet"
expj.AA0050020.AA0050020button2.copy.onClick0 = function () {
  console.log('copy script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0050020', 'AA0050020button2', '_AA0050020form1/*,_AA0050020view1/+', 'AA0050020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0050020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0050020', response);
expj.common.changeBusinessScreenTab('AA0050020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0050020.AA0050020button2.copy.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0050020.AA0050020button2.copy['onClick' + i])) {
        expj.AA0050020.AA0050020button2.copy['onClick' + i]();
      }
    }
  }
};
expj.AA0050020.AA0050020button2.copy.executeAllOnDecision = function () {
};
expj.AA0050020.AA0050020button2.copy.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050020button2-copy').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0050020', 'AA0050020button2', 'copy', this, 'Button');
    }
  });
  expj.AA0050020.AA0050020button2.copy.executePScriptOnLoad();
};

expj.AA0050020.AA0050020button2.copy.executePScriptOnLoad = function () {
  console.log('execute AA0050020button2/copy.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050020button2-copy');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0050020-AA0050020button2-copy" name="copy" class="AA0050020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineCopy",rb)%></button><!-- 行複写ボタン --></div><!--/td-->
<script class="expj-script-AA0050020-AA0050020button2-erase">
expj.AA0050020.AA0050020button2.erase = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0050020form1/*,_AA0050020view1/+@AA0050020Servlet,,$ZZ07004"
expj.AA0050020.AA0050020button2.erase.onClick0 = function () {
  console.log('erase script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0050020', 'AA0050020button2', '_AA0050020form1/*,_AA0050020view1/+', 'AA0050020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0050020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0050020', response);
expj.common.updateBusinessScreenTab('AA0050020', contents);
};
expj.common.pscript.callConfirm('AA0050020', 'AA0050020button2', 'ZZ07004', okEvent);
};
expj.AA0050020.AA0050020button2.erase.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0050020.AA0050020button2.erase['onClick' + i])) {
        expj.AA0050020.AA0050020button2.erase['onClick' + i]();
      }
    }
  }
};
expj.AA0050020.AA0050020button2.erase.executeAllOnDecision = function () {
};
expj.AA0050020.AA0050020button2.erase.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050020button2-erase').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0050020', 'AA0050020button2', 'erase', this, 'Button');
    }
  });
  expj.AA0050020.AA0050020button2.erase.executePScriptOnLoad();
};

expj.AA0050020.AA0050020button2.erase.executePScriptOnLoad = function () {
  console.log('execute AA0050020button2/erase.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050020button2-erase');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0050020-AA0050020button2-erase" name="erase" class="AA0050020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineDelete",rb)%></button><!-- 行削除ボタン --></div><!--/td-->
<script class="expj-script-AA0050020-AA0050020button2-eraseAll">
expj.AA0050020.AA0050020button2.eraseAll = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0050020form1/*@AA0050020Servlet,,$ZZ07014"
expj.AA0050020.AA0050020button2.eraseAll.onClick0 = function () {
  console.log('eraseAll script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0050020', 'AA0050020button2', '_AA0050020form1/*', 'AA0050020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0050020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0050020', response);
expj.common.updateBusinessScreenTab('AA0050020', contents);
};
expj.common.pscript.callConfirm('AA0050020', 'AA0050020button2', 'ZZ07014', okEvent);
};
expj.AA0050020.AA0050020button2.eraseAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0050020.AA0050020button2.eraseAll['onClick' + i])) {
        expj.AA0050020.AA0050020button2.eraseAll['onClick' + i]();
      }
    }
  }
};
expj.AA0050020.AA0050020button2.eraseAll.executeAllOnDecision = function () {
};
expj.AA0050020.AA0050020button2.eraseAll.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050020button2-eraseAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0050020', 'AA0050020button2', 'eraseAll', this, 'Button');
    }
  });
  expj.AA0050020.AA0050020button2.eraseAll.executePScriptOnLoad();
};

expj.AA0050020.AA0050020button2.eraseAll.executePScriptOnLoad = function () {
  console.log('execute AA0050020button2/eraseAll.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050020button2-eraseAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0050020-AA0050020button2-eraseAll" name="eraseAll" class="AA0050020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDeleteAll",rb)%></button><!-- 全削除ボタン --></div><!--/td-->
<script class="expj-script-AA0050020-AA0050020button2-change">
expj.AA0050020.AA0050020button2.change = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0050020form1/*,_AA0050020view1/*@AA0050020Servlet,,$ZZ07009"
expj.AA0050020.AA0050020button2.change.onClick0 = function () {
  console.log('change script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0050020', 'AA0050020button2', '_AA0050020form1/*,_AA0050020view1/*', 'AA0050020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0050020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0050020', response);
expj.common.updateBusinessScreenTab('AA0050020', contents);
};
expj.common.pscript.callConfirm('AA0050020', 'AA0050020button2', 'ZZ07009', okEvent);
};
expj.AA0050020.AA0050020button2.change.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0050020.AA0050020button2.change['onClick' + i])) {
        expj.AA0050020.AA0050020button2.change['onClick' + i]();
      }
    }
  }
};
expj.AA0050020.AA0050020button2.change.executeAllOnDecision = function () {
};
expj.AA0050020.AA0050020button2.change.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050020button2-change').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0050020', 'AA0050020button2', 'change', this, 'Button');
    }
  });
  expj.AA0050020.AA0050020button2.change.executePScriptOnLoad();
};

expj.AA0050020.AA0050020button2.change.executePScriptOnLoad = function () {
  console.log('execute AA0050020button2/change.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050020button2-change');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0050020-AA0050020button2-change" name="change" class="AA0050020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnChangeNumber",rb)%></button><!-- 番号再振ボタン --></div><!--/td-->
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
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AA0050020 Revision: 1.4  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AA0050020-AA0050020button0">
expj.AA0050020.AA0050020button0 = {};
expj.AA0050020.AA0050020button0.executeAllOnDecision = function () {
  console.log('execute AA0050020button0.onDecision');
};
expj.AA0050020.AA0050020button0.executeOnLoad = function () {
  expj.AA0050020.AA0050020button0.executePScriptOnLoad();
};

expj.AA0050020.AA0050020button0.executePScriptOnLoad = function () {
  console.log('execute AA0050020button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0050020-AA0050020button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0050020-AA0050020button0-clear">
expj.AA0050020.AA0050020button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AA0050020Servlet,,$ZZ07008"
expj.AA0050020.AA0050020button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0050020', 'AA0050020button0', '', 'AA0050020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0050020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0050020', response);
expj.common.updateBusinessScreenTab('AA0050020', contents);
};
expj.common.pscript.callConfirm('AA0050020', 'AA0050020button0', 'ZZ07008', okEvent);
};
expj.AA0050020.AA0050020button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0050020.AA0050020button0.clear['onClick' + i])) {
        expj.AA0050020.AA0050020button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AA0050020.AA0050020button0.clear.executeAllOnDecision = function () {
};
expj.AA0050020.AA0050020button0.clear.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050020button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0050020', 'AA0050020button0', 'clear', this, 'Button');
    }
  });
  expj.AA0050020.AA0050020button0.clear.executePScriptOnLoad();
};

expj.AA0050020.AA0050020button0.clear.executePScriptOnLoad = function () {
  console.log('execute AA0050020button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050020button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0050020-AA0050020button0-clear" name="clear" class="AA0050020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AA0050020-AA0050020button0-close">
expj.AA0050020.AA0050020button0.close = {};
// script1="onClick;0;CLOSE"
expj.AA0050020.AA0050020button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AA0050020');
};
expj.AA0050020.AA0050020button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0050020.AA0050020button0.close['onClick' + i])) {
        expj.AA0050020.AA0050020button0.close['onClick' + i]();
      }
    }
  }
};
expj.AA0050020.AA0050020button0.close.executeAllOnDecision = function () {
};
expj.AA0050020.AA0050020button0.close.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050020button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0050020', 'AA0050020button0', 'close', this, 'Button');
    }
  });
  expj.AA0050020.AA0050020button0.close.executePScriptOnLoad();
};

expj.AA0050020.AA0050020button0.close.executePScriptOnLoad = function () {
  console.log('execute AA0050020button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050020button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0050020-AA0050020button0-close" name="close" class="AA0050020-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0050020 (END)-->
<script class="expj-script-AA0050020-AA0050020detail1">
expj.AA0050020.AA0050020detail1 = {};
expj.AA0050020.AA0050020detail1.executeAllOnDecision = function () {
  console.log('execute AA0050020detail1.onDecision');
};
expj.AA0050020.AA0050020detail1.executeOnLoad = function () {
  expj.AA0050020.AA0050020detail1.executePScriptOnLoad();
};

expj.AA0050020.AA0050020detail1.executePScriptOnLoad = function () {
  console.log('execute AA0050020detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAA0050020Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AA0050020-AA0050020detail1" class="expj-datagird-detail" data-float="AA0050020float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AA0050020detail1";
 detailFloat = "AA0050020float1";
 detailWidth = 358;
 detailHeight = 200 + 47;
 String AA0050020detail1_Id = "AA0050020detail1";
 String AA0050020detail1_select = "single";
 String AA0050020detail1_sortable = "true";
 String AA0050020detail1_resize = "true";
 String AA0050020detail1_scroll = "true";
 StringBuffer AA0050020detail1_HB = new StringBuffer();
 StringBuffer AA0050020detail1_DB = new StringBuffer();
%>
<%
 AA0050020detail1_sortable = "false";
 AA0050020detail1_select = "none";
%>
<% AA0050020detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AA0050020detail1_sortable).append("}").append(","); %>
<%  AA0050020detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AA0050020detail1_sortable).append("}").append(",");
AA0050020detail1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AA0050020detail1_sortable).append("}").append(",");
AA0050020detail1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AA0050020detail1_sortable).append("}").append(",");
 %>
  <% AA0050020detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.DRAW_CD",rb)).append("','").append("<span id=\"expj-AA0050020-AA0050020detail1-DRAW_CD\" class=\"expj-label\" data-name=\"DRAW_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0050020Struct.getDRAW_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0050020detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.ITEM_SPEC",rb)).append("','").append("<span id=\"expj-AA0050020-AA0050020detail1-SPEC\" class=\"expj-label\" data-name=\"SPEC\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0050020Struct.getSPEC())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0050020detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)).append("','").append("<span id=\"expj-AA0050020-AA0050020detail1-MRP_ODR_NAME\" class=\"expj-label\" data-name=\"MRP_ODR_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0050020Struct.getMRP_ODR_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0050020detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)).append("','").append("<span id=\"expj-AA0050020-AA0050020detail1-OUTSIDE_NAME\" class=\"expj-label\" data-name=\"OUTSIDE_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0050020Struct.getOUTSIDE_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
<%
 detailViewId = AA0050020detail1_Id;
 detailViewSelect = AA0050020detail1_select;
 detailViewResize = AA0050020detail1_resize;
 detailViewScroll = AA0050020detail1_scroll;
 detailViewHeaderData = AA0050020detail1_HB;
 detailViewBodyData = AA0050020detail1_DB;
%>
<%
}
%>
<%
MessageStruct msgStruct = aAA0050020Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0050020-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0050020)) {
  expj.common.treeInstanceMap.AA0050020 = {};
}
expj.common.treeInstanceMap.AA0050020.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0050020.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0050020.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0050020.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0050020.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0050020.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0050020.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0050020.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0050020.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0050020-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0050020-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0050020)) {
  expj.common.detailDialogMap.AA0050020 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0050020._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0050020._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0050020.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0050020.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0050020.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0050020.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0050020.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0050020.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0050020.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0050020.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0050020-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0050020.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0050020-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0050020.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0050020-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0050020.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0050020.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0050020.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0050020._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0050020-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0050020)) {
  expj.common.viewInstanceMap.AA0050020 = {};
}
expj.common.viewInstanceMap.AA0050020.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0050020.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0050020.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0050020.<%=viewId %>.init = function () {
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
    expj.AA0050020.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0050020.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0050020-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0050020-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0050020_init">
/**
 * AA0050020用のロード完了時初期化関数
 */
expj.AA0050020.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0050020');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0050020');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0050020');
  expj.common.calendarInstanceMap.AA0050020 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0050020.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0050020.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0050020.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0050020.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0050020.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0050020');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0050020');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0050020-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0050020-<%=detailId %>');
<%
 }
%>
  try{expj.AA0050020.AA0050020form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020form1.h_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020form1.MRP_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020form1.OUTSIDE_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020button1.Detail.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020button1.select.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020form2.RCV_WH_CD.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020form2.PeekerRcvWhCd.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020form2.RCV_WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020button3.Update.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020view1.w_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020button2.append.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020button2.modify.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020button2.copy.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020button2.erase.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020button2.eraseAll.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020button2.change.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020button0.clear.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020button0.close.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020form1.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020button1.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020form2.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020button3.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020view1.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020button2.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020button0.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050020detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0050020.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0050020', 'AA0050020');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0050020');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0050020-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0050020-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0050020', '<%=request.getContextPath() %>');
};

/**
 * AA0050020の全体onDecision処理
 */
expj.AA0050020.executeAllOnDecision = function () {
  expj.AA0050020.AA0050020form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0050020_console">
expj.AA0050020.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>