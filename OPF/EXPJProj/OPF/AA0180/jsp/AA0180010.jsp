<%-- ***
This file is generated
 GeneratedDate  : Wed Feb 15 10:19:02 JST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF.V320\EXPJProj\OPF\AA0180\AA0180010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0180.*" %>
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
<jsp:useBean id="aAA0180010Control" class="com.nec.jp.orteus.metamorBase.AA0180.AA0180010Control" scope="request"/>
<jsp:useBean id="aAA0180010Struct" class="com.nec.jp.orteus.metamorBase.AA0180.AA0180010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

構成系列ツリーメンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0180/jsp/AA0180010.jsp,v $
$Author: geng-jia $
$Revision: 1.7 $ $Date: 2017/02/22 02:04:12 $
********************************************************* --%>
<html>
<head>
<title>構成系列ツリーメンテナンス</title>
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
<script class="expj-script-AA0180010_init">
  // AA0180010名前空間
  expj.AA0180010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<% ScreenMoveUtil su = new ScreenMoveUtil("AA0130020Servlet", so); %>
<% ScreenMoveUtil su2 = new ScreenMoveUtil("AA0130030Servlet", so); %>

  <div id="expj-business-screen-AA0180010" data-screen="AA0180010" data-newdata="<%=aAA0180010Control.isNewData() %>">
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
              <script class="expj-script-AA0180010-AA0180010form1">
expj.AA0180010.AA0180010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5,6,7,8"
expj.AA0180010.AA0180010form1.onLoad0 = function () {
  console.log('AA0180010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision6)){this.onDecision6();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision7)){this.onDecision7();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision8)){this.onDecision8();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AA0180010.AA0180010form1.onDecision0 = function () {
  console.log('AA0180010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AA0180010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AA0180010button1/Select"
expj.AA0180010.AA0180010form1.child0 = function () {
  console.log('AA0180010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AA0180010', 'AA0180010form1', '_AA0180010button1/Select');
};
// script4="child;1;MASK;_AA0180010button1/Select"
expj.AA0180010.AA0180010form1.child1 = function () {
  console.log('AA0180010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AA0180010', 'AA0180010form1', '_AA0180010button1/Select');
};
// script5="onDecision;1;CHKRQ;?AA0180010tree1/*[eq]SELECTED@*2,*4"
expj.AA0180010.AA0180010form1.onDecision1 = function () {
  console.log('AA0180010form1 script5');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010tree1/*'), '[eq]', 'SELECTED'))) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;CHK;?AA0180010form1/*[eq]NORMAL[and]?AA0180010form1/Target_ITEM_CD[eq]SAME[and]?AA0180010form1/DEVELOP_TYP[eq]SAME[and]?AA0180010form1/TargetDate[eq]SAME[and]_AA0180010tree1/DET_TYP[eq]PS@*3,*4"
expj.AA0180010.AA0180010form1.child2 = function () {
  console.log('AA0180010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/Target_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/DEVELOP_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/TargetDate'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '_AA0180010tree1/DET_TYP'), '[eq]', 'PS')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_AA0180010button2/LineInsert"
expj.AA0180010.AA0180010form1.child3 = function () {
  console.log('AA0180010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AA0180010', 'AA0180010form1', '_AA0180010button2/LineInsert');
};
// script8="child;4;MASK;_AA0180010button2/LineInsert"
expj.AA0180010.AA0180010form1.child4 = function () {
  console.log('AA0180010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AA0180010', 'AA0180010form1', '_AA0180010button2/LineInsert');
};
// script9="onDecision;2;CHKRQ;?AA0180010tree1/*[eq]SELECTED@*5,*7"
expj.AA0180010.AA0180010form1.onDecision2 = function () {
  console.log('AA0180010form1 script9');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010tree1/*'), '[eq]', 'SELECTED'))) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script10="child;5;CHK;?AA0180010form1/*[eq]NORMAL[and]?AA0180010form1/Target_ITEM_CD[eq]SAME[and]?AA0180010form1/DEVELOP_TYP[eq]SAME[and]?AA0180010form1/TargetDate[eq]SAME[and]_AA0180010tree1/id[neq]1[and]_AA0180010tree1/DET_TYP[eq]PS@*6,*7"
expj.AA0180010.AA0180010form1.child5 = function () {
  console.log('AA0180010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/Target_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/DEVELOP_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/TargetDate'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '_AA0180010tree1/id'), '[neq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '_AA0180010tree1/DET_TYP'), '[eq]', 'PS')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script11="child;6;UNMASK;_AA0180010button2/LineUpdate,_AA0180010button2/LineDelete"
expj.AA0180010.AA0180010form1.child6 = function () {
  console.log('AA0180010form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('AA0180010', 'AA0180010form1', '_AA0180010button2/LineUpdate');
expj.common.pscript.setUnMaskToReferenceComponent('AA0180010', 'AA0180010form1', '_AA0180010button2/LineDelete');
};
// script12="child;7;MASK;_AA0180010button2/LineUpdate,_AA0180010button2/LineDelete"
expj.AA0180010.AA0180010form1.child7 = function () {
  console.log('AA0180010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('AA0180010', 'AA0180010form1', '_AA0180010button2/LineUpdate');
expj.common.pscript.setMaskToReferenceComponent('AA0180010', 'AA0180010form1', '_AA0180010button2/LineDelete');
};
// script13="onDecision;3;CHKRQ;?AA0180010tree1/*[eq]SELECTED@*8,*10"
expj.AA0180010.AA0180010form1.onDecision3 = function () {
  console.log('AA0180010form1 script13');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010tree1/*'), '[eq]', 'SELECTED'))) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script14="child;8;CHK;?AA0180010form1/*[eq]NORMAL[and]?AA0180010form1/Target_ITEM_CD[eq]SAME[and]?AA0180010form1/DEVELOP_TYP[eq]SAME[and]?AA0180010form1/TargetDate[eq]SAME@*9,*10"
expj.AA0180010.AA0180010form1.child8 = function () {
  console.log('AA0180010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/Target_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/DEVELOP_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/TargetDate'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script15="child;9;UNMASK;_AA0180010tree1/0:3"
expj.AA0180010.AA0180010form1.child9 = function () {
  console.log('AA0180010form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('AA0180010', 'AA0180010form1', '_AA0180010tree1/0:3');
};
// script16="child;10;MASK;_AA0180010tree1/0:3"
expj.AA0180010.AA0180010form1.child10 = function () {
  console.log('AA0180010form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AA0180010', 'AA0180010form1', '_AA0180010tree1/0:3');
};
// script17="onDecision;4;CHKRQ;?AA0180010tree1/*[eq]SELECTED@*11,*13"
expj.AA0180010.AA0180010form1.onDecision4 = function () {
  console.log('AA0180010form1 script17');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010tree1/*'), '[eq]', 'SELECTED'))) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script18="child;11;CHK;?AA0180010form1/*[eq]NORMAL[and]?AA0180010form1/Target_ITEM_CD[eq]SAME[and]?AA0180010form1/DEVELOP_TYP[eq]SAME[and]?AA0180010form1/TargetDate[eq]SAME[and]_AA0180010tree1/ctx[eq]N[and]_AA0180010tree1/not_read[neq]true[and]_AA0180010tree1/terminated[neq]true@*12,*13"
expj.AA0180010.AA0180010form1.child11 = function () {
  console.log('AA0180010form1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/Target_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/DEVELOP_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/TargetDate'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '_AA0180010tree1/ctx'), '[eq]', 'N') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '_AA0180010tree1/not_read'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '_AA0180010tree1/terminated'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script19="child;12;UNMASK;_AA0180010tree1/1:2"
expj.AA0180010.AA0180010form1.child12 = function () {
  console.log('AA0180010form1 script19');
expj.common.pscript.setUnMaskToReferenceComponent('AA0180010', 'AA0180010form1', '_AA0180010tree1/1:2');
};
// script20="child;13;MASK;_AA0180010tree1/1:2"
expj.AA0180010.AA0180010form1.child13 = function () {
  console.log('AA0180010form1 script20');
expj.common.pscript.setMaskToReferenceComponent('AA0180010', 'AA0180010form1', '_AA0180010tree1/1:2');
};
// script21="onDecision;5;CHKRQ;?AA0180010tree1/*[eq]SELECTED@*14,*16"
expj.AA0180010.AA0180010form1.onDecision5 = function () {
  console.log('AA0180010form1 script21');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010tree1/*'), '[eq]', 'SELECTED'))) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script22="child;14;CHK;?AA0180010form1/*[eq]NORMAL[and]?AA0180010form1/Target_ITEM_CD[eq]SAME[and]?AA0180010form1/DEVELOP_TYP[eq]SAME[and]?AA0180010form1/TargetDate[eq]SAME[and]_AA0180010tree1/DET_TYP[eq]PS@*15,*16"
expj.AA0180010.AA0180010form1.child14 = function () {
  console.log('AA0180010form1 script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/Target_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/DEVELOP_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/TargetDate'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '_AA0180010tree1/DET_TYP'), '[eq]', 'PS')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script23="child;15;UNMASK;_AA0180010button2/LineInsertProc"
expj.AA0180010.AA0180010form1.child15 = function () {
  console.log('AA0180010form1 script23');
expj.common.pscript.setUnMaskToReferenceComponent('AA0180010', 'AA0180010form1', '_AA0180010button2/LineInsertProc');
};
// script24="child;16;MASK;_AA0180010button2/LineInsertProc"
expj.AA0180010.AA0180010form1.child16 = function () {
  console.log('AA0180010form1 script24');
expj.common.pscript.setMaskToReferenceComponent('AA0180010', 'AA0180010form1', '_AA0180010button2/LineInsertProc');
};
// script25="onDecision;6;CHKRQ;?AA0180010tree1/*[eq]SELECTED@*17,*19"
expj.AA0180010.AA0180010form1.onDecision6 = function () {
  console.log('AA0180010form1 script25');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010tree1/*'), '[eq]', 'SELECTED'))) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script26="child;17;CHK;?AA0180010form1/*[eq]NORMAL[and]?AA0180010form1/Target_ITEM_CD[eq]SAME[and]?AA0180010form1/DEVELOP_TYP[eq]SAME[and]?AA0180010form1/TargetDate[eq]SAME[and]_AA0180010tree1/DET_TYP[eq]PROC@*18,*19"
expj.AA0180010.AA0180010form1.child17 = function () {
  console.log('AA0180010form1 script26');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/Target_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/DEVELOP_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '?AA0180010form1/TargetDate'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '_AA0180010tree1/DET_TYP'), '[eq]', 'PROC')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script27="child;18;UNMASK;_AA0180010button2/LineUpdateProc"
expj.AA0180010.AA0180010form1.child18 = function () {
  console.log('AA0180010form1 script27');
expj.common.pscript.setUnMaskToReferenceComponent('AA0180010', 'AA0180010form1', '_AA0180010button2/LineUpdateProc');
};
// script28="child;19;MASK;_AA0180010button2/LineUpdateProc"
expj.AA0180010.AA0180010form1.child19 = function () {
  console.log('AA0180010form1 script28');
expj.common.pscript.setMaskToReferenceComponent('AA0180010', 'AA0180010form1', '_AA0180010button2/LineUpdateProc');
};
expj.AA0180010.AA0180010form1.executeAllOnDecision = function () {
  console.log('execute AA0180010form1.onDecision');
  for (var i = 0; i <= 6; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0180010.AA0180010form1['onDecision' + i])) {
        expj.AA0180010.AA0180010form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0180010.AA0180010form1.executeOnLoad = function () {
  expj.AA0180010.AA0180010form1.executePScriptOnLoad();
};

expj.AA0180010.AA0180010form1.executePScriptOnLoad = function () {
  console.log('execute AA0180010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0180010.AA0180010form1['onLoad' + i])) {
      expj.AA0180010.AA0180010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0180010-AA0180010form1" action="AA0180010Servlet" name="AA0180010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAA0180010Control.getReadStatusString()) %>" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD_6",rb)%></span><!-- 対象品目番号 --></div><!--/td-->
<script class="expj-script-AA0180010-AA0180010form1-Target_ITEM_CD">
expj.AA0180010.AA0180010form1.Target_ITEM_CD = {};
expj.AA0180010.AA0180010form1.Target_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0180010form1/Target_ITEM_CD.onDecision');
  expj.AA0180010.AA0180010form1.executeAllOnDecision();
  expj.AA0180010.executeAllOnDecision();
};
expj.AA0180010.AA0180010form1.Target_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0180010-AA0180010form1-Target_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0180010', 'AA0180010form1', 'Target_ITEM_CD', this);
  });
  expj.AA0180010.AA0180010form1.Target_ITEM_CD.executePScriptOnLoad();
};

expj.AA0180010.AA0180010form1.Target_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0180010form1/Target_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0180010-AA0180010form1-Target_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0180010-AA0180010form1-Target_ITEM_CD" name="Target_ITEM_CD" class="AA0180010-focus-move  required-value expj-AA0180010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0180010Struct.getTarget_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0180010-AA0180010form1-PeekerTargetItemCd">
expj.AA0180010.AA0180010form1.PeekerTargetItemCd = {};
// script1="onClick;0;PEEKER;_AA0180010form1/Target_ITEM_CD@<%=contextNo%>"
expj.AA0180010.AA0180010form1.PeekerTargetItemCd.onClick0 = function () {
  console.log('PeekerTargetItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0180010';
var parameterValues = 'PeekerTargetItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010form1', '_Target_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0180010form1/Target_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0180010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0180010.AA0180010form1.PeekerTargetItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0180010.AA0180010form1.PeekerTargetItemCd['onClick' + i])) {
        expj.AA0180010.AA0180010form1.PeekerTargetItemCd['onClick' + i]();
      }
    }
  }
};
expj.AA0180010.AA0180010form1.PeekerTargetItemCd.executeAllOnDecision = function () {
};
expj.AA0180010.AA0180010form1.PeekerTargetItemCd.executeOnLoad = function () {
  $('#expj-AA0180010-AA0180010form1-PeekerTargetItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0180010', 'AA0180010form1', 'PeekerTargetItemCd', this, 'Button');
    }
  });
  expj.AA0180010.AA0180010form1.PeekerTargetItemCd.executePScriptOnLoad();
};

expj.AA0180010.AA0180010form1.PeekerTargetItemCd.executePScriptOnLoad = function () {
  console.log('execute AA0180010form1/PeekerTargetItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0180010-AA0180010form1-PeekerTargetItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0180010-AA0180010form1-PeekerTargetItemCd" class="AA0180010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0017",rb)%></span><!-- 展開区分 --></div><!--/td-->
<script class="expj-script-AA0180010-AA0180010form1-DEVELOP_TYP">
expj.AA0180010.AA0180010form1.DEVELOP_TYP = {};
expj.AA0180010.AA0180010form1.DEVELOP_TYP.executeAllOnDecision = function () {
  console.log('execute AA0180010form1/DEVELOP_TYP.onDecision');
  expj.AA0180010.AA0180010form1.executeAllOnDecision();
  expj.AA0180010.executeAllOnDecision();
};
expj.AA0180010.AA0180010form1.DEVELOP_TYP.executeOnLoad = function () {
  $('#expj-AA0180010-AA0180010form1-DEVELOP_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0180010', 'AA0180010form1', 'DEVELOP_TYP', this);
  });
  expj.AA0180010.AA0180010form1.DEVELOP_TYP.executePScriptOnLoad();
};

expj.AA0180010.AA0180010form1.DEVELOP_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0180010form1/DEVELOP_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0180010-AA0180010form1-DEVELOP_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0180010-AA0180010form1-DEVELOP_TYP" name='DEVELOP_TYP' class='AA0180010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0180010Control.getStruct().getList_DEVELOP_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0180010Control.getStruct().getList_DEVELOP_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0180010Control.getStruct().getList_DEVELOP_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0180010Struct.getDEVELOP_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE_3",rb)%></span><!-- 対象日付 --></div><!--/td-->
<script class="expj-script-AA0180010-AA0180010form1-TargetDate">
expj.AA0180010.AA0180010form1.TargetDate = {};
expj.AA0180010.AA0180010form1.TargetDate.executeAllOnDecision = function () {
  console.log('execute AA0180010form1/TargetDate.onDecision');
  expj.AA0180010.AA0180010form1.executeAllOnDecision();
  expj.AA0180010.executeAllOnDecision();
};
expj.AA0180010.AA0180010form1.TargetDate.executeOnLoad = function () {
  $('#expj-AA0180010-AA0180010form1-TargetDate').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0180010', 'AA0180010form1', 'TargetDate', this);
  });
  expj.AA0180010.AA0180010form1.TargetDate.executePScriptOnLoad();
};

expj.AA0180010.AA0180010form1.TargetDate.executePScriptOnLoad = function () {
  console.log('execute AA0180010form1/TargetDate.onLoad');
  var targetComponent = document.getElementById('expj-AA0180010-AA0180010form1-TargetDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0180010-AA0180010form1-TargetDate" name="TargetDate" class="AA0180010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAA0180010Struct.getTargetDate()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AA0180010-AA0180010form1-CalendarTargetDate">
expj.AA0180010.AA0180010form1.CalendarTargetDate = {};
// script1="onClick;0;CALENDAR;_AA0180010form1/TargetDate"
expj.AA0180010.AA0180010form1.CalendarTargetDate.onClick0 = function () {
  console.log('CalendarTargetDate script1');
expj.common.pscript.executeCalendar('AA0180010','AA0180010form1','_AA0180010form1/TargetDate');
};
expj.AA0180010.AA0180010form1.CalendarTargetDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0180010.AA0180010form1.CalendarTargetDate['onClick' + i])) {
        expj.AA0180010.AA0180010form1.CalendarTargetDate['onClick' + i]();
      }
    }
  }
};
expj.AA0180010.AA0180010form1.CalendarTargetDate.executeAllOnDecision = function () {
};
expj.AA0180010.AA0180010form1.CalendarTargetDate.executeOnLoad = function () {
  $('#expj-AA0180010-AA0180010form1-CalendarTargetDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0180010', 'AA0180010form1', 'CalendarTargetDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AA0180010','AA0180010form1','_AA0180010form1/TargetDate');
  expj.AA0180010.AA0180010form1.CalendarTargetDate.executePScriptOnLoad();
};

expj.AA0180010.AA0180010form1.CalendarTargetDate.executePScriptOnLoad = function () {
  console.log('execute AA0180010form1/CalendarTargetDate.onLoad');
  var targetComponent = document.getElementById('expj-AA0180010-AA0180010form1-CalendarTargetDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0180010-AA0180010form1-CalendarTargetDate" class="AA0180010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0018",rb)%></span><!-- 初期展開レベル --></div><!--/td-->
<script class="expj-script-AA0180010-AA0180010form1-InitLevel">
expj.AA0180010.AA0180010form1.InitLevel = {};
expj.AA0180010.AA0180010form1.InitLevel.executeAllOnDecision = function () {
  console.log('execute AA0180010form1/InitLevel.onDecision');
  expj.AA0180010.AA0180010form1.executeAllOnDecision();
  expj.AA0180010.executeAllOnDecision();
};
expj.AA0180010.AA0180010form1.InitLevel.executeOnLoad = function () {
  $('#expj-AA0180010-AA0180010form1-InitLevel').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0180010', 'AA0180010form1', 'InitLevel', this);
  });
  expj.AA0180010.AA0180010form1.InitLevel.executePScriptOnLoad();
};

expj.AA0180010.AA0180010form1.InitLevel.executePScriptOnLoad = function () {
  console.log('execute AA0180010form1/InitLevel.onLoad');
  var targetComponent = document.getElementById('expj-AA0180010-AA0180010form1-InitLevel');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0180010-AA0180010form1-InitLevel" name="InitLevel" class="AA0180010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;8" value="<%= TypeConverter.sanitizer(aAA0180010Struct.getInitLevel()) %>" maxlength="2147483647" ></div><!--/td-->
<input type="hidden" id="expj-AA0180010-AA0180010form1-h_MaxLevel" name="h_MaxLevel" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0180010Struct.geth_MaxLevel()) %>">
<script class="expj-script-AA0180010-AA0180010form1-h_MaxLevel">
expj.AA0180010.AA0180010form1.h_MaxLevel = {};
expj.AA0180010.AA0180010form1.h_MaxLevel.executeAllOnDecision = function () {
  console.log('execute AA0180010form1/h_MaxLevel.onDecision');
  expj.AA0180010.AA0180010form1.executeAllOnDecision();
  expj.AA0180010.executeAllOnDecision();
};
expj.AA0180010.AA0180010form1.h_MaxLevel.executeOnLoad = function () {
  $('#expj-AA0180010-AA0180010form1-h_MaxLevel').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0180010', 'AA0180010form1', 'h_MaxLevel', this);
  });
  expj.AA0180010.AA0180010form1.h_MaxLevel.executePScriptOnLoad();
};

expj.AA0180010.AA0180010form1.h_MaxLevel.executePScriptOnLoad = function () {
  console.log('execute AA0180010form1/h_MaxLevel.onLoad');
  var targetComponent = document.getElementById('expj-AA0180010-AA0180010form1-h_MaxLevel');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0180010-AA0180010form1-h_ProcTyp" name="h_ProcTyp" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0180010Struct.geth_ProcTyp()) %>">
<script class="expj-script-AA0180010-AA0180010form1-h_ProcTyp">
expj.AA0180010.AA0180010form1.h_ProcTyp = {};
expj.AA0180010.AA0180010form1.h_ProcTyp.executeAllOnDecision = function () {
  console.log('execute AA0180010form1/h_ProcTyp.onDecision');
  expj.AA0180010.AA0180010form1.executeAllOnDecision();
  expj.AA0180010.executeAllOnDecision();
};
expj.AA0180010.AA0180010form1.h_ProcTyp.executeOnLoad = function () {
  $('#expj-AA0180010-AA0180010form1-h_ProcTyp').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0180010', 'AA0180010form1', 'h_ProcTyp', this);
  });
  expj.AA0180010.AA0180010form1.h_ProcTyp.executePScriptOnLoad();
};

expj.AA0180010.AA0180010form1.h_ProcTyp.executePScriptOnLoad = function () {
  console.log('execute AA0180010form1/h_ProcTyp.onLoad');
  var targetComponent = document.getElementById('expj-AA0180010-AA0180010form1-h_ProcTyp');
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0180010-AA0180010button1">
expj.AA0180010.AA0180010button1 = {};
expj.AA0180010.AA0180010button1.executeAllOnDecision = function () {
  console.log('execute AA0180010button1.onDecision');
};
expj.AA0180010.AA0180010button1.executeOnLoad = function () {
  expj.AA0180010.AA0180010button1.executePScriptOnLoad();
};

expj.AA0180010.AA0180010button1.executePScriptOnLoad = function () {
  console.log('execute AA0180010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0180010-AA0180010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0180010-AA0180010button1-Select">
expj.AA0180010.AA0180010button1.Select = {};
// script1="onClick;0;CHK;_AA0180010form1/InitLevel[gt]_AA0180010form1/h_MaxLevel@#AA20001:_AA0180010form1/h_MaxLevel"
expj.AA0180010.AA0180010button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010button1', '_AA0180010form1/InitLevel')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010button1', '_AA0180010form1/h_MaxLevel')))) {
expj.common.pscript.addErrorMessage('AA0180010', 'AA0180010button1', 'AA20001:_AA0180010form1/h_MaxLevel');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0180010form1/*@AA0180010Servlet"
expj.AA0180010.AA0180010button1.Select.onClick1 = function () {
  console.log('Select script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0180010', 'AA0180010button1', '_AA0180010form1/*', 'AA0180010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0180010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0180010', response);
expj.common.updateBusinessScreenTab('AA0180010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0180010.AA0180010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0180010.AA0180010button1.Select['onClick' + i])) {
        expj.AA0180010.AA0180010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AA0180010.AA0180010button1.Select.executeAllOnDecision = function () {
};
expj.AA0180010.AA0180010button1.Select.executeOnLoad = function () {
  $('#expj-AA0180010-AA0180010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0180010', 'AA0180010button1', 'Select', this, 'Button');
    }
  });
  expj.AA0180010.AA0180010button1.Select.executePScriptOnLoad();
};

expj.AA0180010.AA0180010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AA0180010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AA0180010-AA0180010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0180010-AA0180010button1-Select" name="Select" class="AA0180010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><%
                String Context0 = CoreTools.getRBString("Expj.Cmt0241",rb);         // ここへコピー
                String Context1 = CoreTools.getRBString("Expj.Cmt0242",rb);         // これをコピー
                String Context2 = CoreTools.getRBString("Expj.BtnDeleteAll_1",rb);  // 一括削除
                String Context3 = CoreTools.getRBString("Expj.BtnReplaceAll",rb);   // 一括置換
                String Context4 = CoreTools.getRBString("Expj.Cmt0243",rb);         // この品目で正展開
                String Context5 = CoreTools.getRBString("Expj.Cmt0244",rb);         // この品目で逆展開
              %><script class="expj-script-AA0180010-AA0180010tree1">
expj.AA0180010.AA0180010tree1 = {};
// script1="setContext;0;N1,T1,P0;<%=Context0%>@0"
expj.AA0180010.AA0180010tree1.setContext0 = function () {
  console.log('AA0180010tree1 script1');
expj.AA0180010.AA0180010tree1.child0();
};
// script2="setContext;1;N1,T0,P0;<%=Context1%>@1"
expj.AA0180010.AA0180010tree1.setContext1 = function () {
  console.log('AA0180010tree1 script2');
expj.AA0180010.AA0180010tree1.child1();
};
// script3="setContext;2;N1,T0,P0;<%=Context2%>@3"
expj.AA0180010.AA0180010tree1.setContext2 = function () {
  console.log('AA0180010tree1 script3');
expj.AA0180010.AA0180010tree1.child3();
};
// script4="setContext;3;N1,T1,P0;<%=Context3%>@4"
expj.AA0180010.AA0180010tree1.setContext3 = function () {
  console.log('AA0180010tree1 script4');
expj.AA0180010.AA0180010tree1.child4();
};
// script5="setContext;4;;SEP"
expj.AA0180010.AA0180010tree1.setContext4 = function () {
  console.log('AA0180010tree1 script5');
};
// script6="setContext;5;N1,T1,P0;<%=Context4%>@5"
expj.AA0180010.AA0180010tree1.setContext5 = function () {
  console.log('AA0180010tree1 script6');
expj.AA0180010.AA0180010tree1.child5();
};
// script7="setContext;6;N1,T1,P0;<%=Context5%>@6"
expj.AA0180010.AA0180010tree1.setContext6 = function () {
  console.log('AA0180010tree1 script7');
expj.AA0180010.AA0180010tree1.child6();
};
// script8="onClick;0;FSHOW;AA0180010float1@115"
expj.AA0180010.AA0180010tree1.onClick0 = function () {
  console.log('AA0180010tree1 script8');
expj.common.pscript.showDetailWindow('AA0180010', 'AA0180010float1', '115');
};
// script9="onClick;1;CHK;_DET_TYP[eq]PS@*7,*8"
expj.AA0180010.AA0180010tree1.onClick1 = function () {
  console.log('AA0180010tree1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010tree1', '_DET_TYP'), '[eq]', 'PS')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script10="child;0;SET;_AA0180010form1/h_ProcTyp=CopyTo@*2"
expj.AA0180010.AA0180010tree1.child0 = function () {
  console.log('AA0180010tree1 script10');
expj.common.pscript.setReferenceComponentValue('AA0180010', 'AA0180010tree1', '_AA0180010form1/h_ProcTyp', 'CopyTo');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script11="child;1;SET;_AA0180010form1/h_ProcTyp=CopyFrom@*2"
expj.AA0180010.AA0180010tree1.child1 = function () {
  console.log('AA0180010tree1 script11');
expj.common.pscript.setReferenceComponentValue('AA0180010', 'AA0180010tree1', '_AA0180010form1/h_ProcTyp', 'CopyFrom');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script12="child;2;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AA0180010form1/*,_AA0180010tree1/+@AA0130020Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.AA0180010.AA0180010tree1.child2 = function () {
  console.log('AA0180010tree1 script12');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0180010', 'AA0180010tree1', '_AA0180010form1/*,_AA0180010tree1/+', 'AA0130020Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AA0130020Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AA0130020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'AA0180010');
};
expj.common.pscript.callSubmit(okEvent);
};
// script13="child;3;SUBMIT;ORTEUS_HASHED=<%=hashed%>,DeleteAll=ACT,_AA0180010form1/*,_AA0180010tree1/*@AA0180010Servlet,,$ZZ07004"
expj.AA0180010.AA0180010tree1.child3 = function () {
  console.log('AA0180010tree1 script13');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0180010', 'AA0180010tree1', 'DeleteAll=ACT,_AA0180010form1/*,_AA0180010tree1/*', 'AA0180010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0180010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0180010', response);
expj.common.updateBusinessScreenTab('AA0180010', contents);
};
expj.common.pscript.callConfirm('AA0180010', 'AA0180010tree1', 'ZZ07004', okEvent);
};
// script14="child;4;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AA0180010form1/*,_AA0180010tree1/+@AA0130030Servlet,<%=contextNo%>,<%=su2.getScreenName()%>,<%=su2.getScreenID()%>"
expj.AA0180010.AA0180010tree1.child4 = function () {
  console.log('AA0180010tree1 script14');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0180010', 'AA0180010tree1', '_AA0180010form1/*,_AA0180010tree1/+', 'AA0130030Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su2.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AA0130030Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AA0130030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su2.getScreenName()%>', contents, 'AA0180010');
};
expj.common.pscript.callSubmit(okEvent);
};
// script15="child;5;SUBMIT;ORTEUS_HASHED=<%=hashed%>,ShowS_Tree=ACT,_AA0180010form1/*,_AA0180010tree1/+@AA0180010Servlet"
expj.AA0180010.AA0180010tree1.child5 = function () {
  console.log('AA0180010tree1 script15');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0180010', 'AA0180010tree1', 'ShowS_Tree=ACT,_AA0180010form1/*,_AA0180010tree1/+', 'AA0180010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0180010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0180010', response);
expj.common.updateBusinessScreenTab('AA0180010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script16="child;6;SUBMIT;ORTEUS_HASHED=<%=hashed%>,ShowR_Tree=ACT,_AA0180010form1/*,_AA0180010tree1/+@AA0180010Servlet"
expj.AA0180010.AA0180010tree1.child6 = function () {
  console.log('AA0180010tree1 script16');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0180010', 'AA0180010tree1', 'ShowR_Tree=ACT,_AA0180010form1/*,_AA0180010tree1/+', 'AA0180010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0180010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0180010', response);
expj.common.updateBusinessScreenTab('AA0180010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script17="child;7;SUBMIT;ORTEUS_HASHED=<%=hashed%>,ShowDetail=ACT,SUBMIT_BUTTON_TYPE=0,_AA0180010form1/*,_AA0180010tree1/+@AA0180010Servlet"
expj.AA0180010.AA0180010tree1.child7 = function () {
  console.log('AA0180010tree1 script17');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0180010', 'AA0180010tree1', 'ShowDetail=ACT,SUBMIT_BUTTON_TYPE=0,_AA0180010form1/*,_AA0180010tree1/+', 'AA0180010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0180010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0180010', response);
expj.common.updateBusinessScreenTab('AA0180010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script18="child;8;SUBMIT;ORTEUS_HASHED=<%=hashed%>,ShowDetail2=ACT,SUBMIT_BUTTON_TYPE=0,_AA0180010form1/*,_AA0180010tree1/+@AA0180010Servlet"
expj.AA0180010.AA0180010tree1.child8 = function () {
  console.log('AA0180010tree1 script18');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0180010', 'AA0180010tree1', 'ShowDetail2=ACT,SUBMIT_BUTTON_TYPE=0,_AA0180010form1/*,_AA0180010tree1/+', 'AA0180010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0180010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0180010', response);
expj.common.updateBusinessScreenTab('AA0180010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script19="onDmyOpen;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,AddTree=ACT,_AA0180010form1/*,_AA0180010tree1/+@AA0180010Servlet"
expj.AA0180010.AA0180010tree1.onDmyOpen0 = function () {
  console.log('AA0180010tree1 script19');
var params = expj.common.pscript.createParameter('AA0180010', 'AA0180010tree1', 'AddTree=ACT,_AA0180010form1/*,_AA0180010tree1/+', 'AA0180010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
return params;
};
expj.AA0180010.AA0180010tree1.setContextAll = function () {
  var controlData = [
    'N1,T1,P0','N1,T0,P0','N1,T0,P0','N1,T1,P0','','N1,T1,P0','N1,T1,P0',
  ];
  var contextData = [
    {'title':'<%=Context0%>', 'action':expj.AA0180010.AA0180010tree1.setContext0},
    {'title':'<%=Context1%>', 'action':expj.AA0180010.AA0180010tree1.setContext1},
    {'title':'<%=Context2%>', 'action':expj.AA0180010.AA0180010tree1.setContext2},
    {'title':'<%=Context3%>', 'action':expj.AA0180010.AA0180010tree1.setContext3},
    {'title':'----'},
    {'title':'<%=Context4%>', 'action':expj.AA0180010.AA0180010tree1.setContext5},
    {'title':'<%=Context5%>', 'action':expj.AA0180010.AA0180010tree1.setContext6},
  ];
  var beforeFunc = function (event, ui) {
    expj.common.changeStateTreeContext(expj.common.treeInstanceMap.AA0180010.AA0180010tree1.gPrevSelectedNode, ui);
  };
  expj.common.createTreeContextInstance('#expj-AA0180010-AA0180010tree1-wrapper', '#expj-AA0180010-AA0180010tree1', contextData, controlData, beforeFunc);
};
expj.AA0180010.AA0180010tree1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0180010.AA0180010tree1['onClick' + i])) {
        expj.AA0180010.AA0180010tree1['onClick' + i]();
      }
    }
  }
};
expj.AA0180010.AA0180010tree1.executeAllOnDecision = function () {
  console.log('execute AA0180010tree1.onDecision');
};
expj.AA0180010.AA0180010tree1.executeOnLoad = function () {
<%
    treeClickEvent.put("AA0180010tree1", "expj.AA0180010.AA0180010tree1.executeAllOnClick");
%>
  expj.AA0180010.AA0180010tree1.setContextAll();
  expj.AA0180010.AA0180010tree1.executePScriptOnLoad();
};

expj.AA0180010.AA0180010tree1.executePScriptOnLoad = function () {
  console.log('execute AA0180010tree1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
if(aAA0180010Control.isNewData() == true){
%>
<div id="expj-AA0180010-AA0180010tree1-wrapper" class="expj-datagrid-tree" style="width:100%; height:100%; overflow:auto;background-color:#FFFFFF;">
<div id="expj-AA0180010-AA0180010tree1" data-orftype="Tree" data-mode="TREE" class="hasmenu" style="background-color:#FFFFFF;">
</div><!--Tree-->
</div>
<%
 treeId = "AA0180010tree1";
 treeXmlData = aAA0180010Control.getFlashTreeXML();
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:420px;"><script class="expj-script-AA0180010-AA0180010button2">
expj.AA0180010.AA0180010button2 = {};
expj.AA0180010.AA0180010button2.executeAllOnDecision = function () {
  console.log('execute AA0180010button2.onDecision');
};
expj.AA0180010.AA0180010button2.executeOnLoad = function () {
  expj.AA0180010.AA0180010button2.executePScriptOnLoad();
};

expj.AA0180010.AA0180010button2.executePScriptOnLoad = function () {
  console.log('execute AA0180010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0180010-AA0180010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0180010-AA0180010button2-LineInsert">
expj.AA0180010.AA0180010button2.LineInsert = {};
// script1="onClick;0;CHK;_AA0180010form1/DEVELOP_TYP[eq]1[and]_AA0180010tree1/Lower_MANHOUR_TYP[eq]1@!AA00178"
expj.AA0180010.AA0180010button2.LineInsert.onClick0 = function () {
  console.log('LineInsert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010button2', '_AA0180010form1/DEVELOP_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0180010', 'AA0180010button2', '_AA0180010tree1/Lower_MANHOUR_TYP'), '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('AA0180010', 'AA0180010button2', 'AA00178');
}
};
// script2="onClick;1;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0180010form1/*,_AA0180010tree1/+@AA0180010Servlet"
expj.AA0180010.AA0180010button2.LineInsert.onClick1 = function () {
  console.log('LineInsert script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0180010', 'AA0180010button2', '_AA0180010form1/*,_AA0180010tree1/+', 'AA0180010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0180010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0180010', response);
expj.common.changeBusinessScreenTab('AA0180010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0180010.AA0180010button2.LineInsert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0180010.AA0180010button2.LineInsert['onClick' + i])) {
        expj.AA0180010.AA0180010button2.LineInsert['onClick' + i]();
      }
    }
  }
};
expj.AA0180010.AA0180010button2.LineInsert.executeAllOnDecision = function () {
};
expj.AA0180010.AA0180010button2.LineInsert.executeOnLoad = function () {
  $('#expj-AA0180010-AA0180010button2-LineInsert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0180010', 'AA0180010button2', 'LineInsert', this, 'Button');
    }
  });
  expj.AA0180010.AA0180010button2.LineInsert.executePScriptOnLoad();
};

expj.AA0180010.AA0180010button2.LineInsert.executePScriptOnLoad = function () {
  console.log('execute AA0180010button2/LineInsert.onLoad');
  var targetComponent = document.getElementById('expj-AA0180010-AA0180010button2-LineInsert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0180010-AA0180010button2-LineInsert" name="LineInsert" class="AA0180010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsertPs",rb)%></button><!-- 構成追加ボタン --></div><!--/td-->
<script class="expj-script-AA0180010-AA0180010button2-LineUpdate">
expj.AA0180010.AA0180010button2.LineUpdate = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0180010form1/*,_AA0180010tree1/+@AA0180010Servlet"
expj.AA0180010.AA0180010button2.LineUpdate.onClick0 = function () {
  console.log('LineUpdate script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0180010', 'AA0180010button2', '_AA0180010form1/*,_AA0180010tree1/+', 'AA0180010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0180010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0180010', response);
expj.common.changeBusinessScreenTab('AA0180010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0180010.AA0180010button2.LineUpdate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0180010.AA0180010button2.LineUpdate['onClick' + i])) {
        expj.AA0180010.AA0180010button2.LineUpdate['onClick' + i]();
      }
    }
  }
};
expj.AA0180010.AA0180010button2.LineUpdate.executeAllOnDecision = function () {
};
expj.AA0180010.AA0180010button2.LineUpdate.executeOnLoad = function () {
  $('#expj-AA0180010-AA0180010button2-LineUpdate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0180010', 'AA0180010button2', 'LineUpdate', this, 'Button');
    }
  });
  expj.AA0180010.AA0180010button2.LineUpdate.executePScriptOnLoad();
};

expj.AA0180010.AA0180010button2.LineUpdate.executePScriptOnLoad = function () {
  console.log('execute AA0180010button2/LineUpdate.onLoad');
  var targetComponent = document.getElementById('expj-AA0180010-AA0180010button2-LineUpdate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0180010-AA0180010button2-LineUpdate" name="LineUpdate" class="AA0180010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdatePs",rb)%></button><!-- 構成修正ボタン --></div><!--/td-->
<script class="expj-script-AA0180010-AA0180010button2-LineInsertProc">
expj.AA0180010.AA0180010button2.LineInsertProc = {};
// script1="onClick;1;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0180010form1/*,_AA0180010tree1/+@AA0180010Servlet"
expj.AA0180010.AA0180010button2.LineInsertProc.onClick1 = function () {
  console.log('LineInsertProc script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0180010', 'AA0180010button2', '_AA0180010form1/*,_AA0180010tree1/+', 'AA0180010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0180010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0180010', response);
expj.common.changeBusinessScreenTab('AA0180010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0180010.AA0180010button2.LineInsertProc.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0180010.AA0180010button2.LineInsertProc['onClick' + i])) {
        expj.AA0180010.AA0180010button2.LineInsertProc['onClick' + i]();
      }
    }
  }
};
expj.AA0180010.AA0180010button2.LineInsertProc.executeAllOnDecision = function () {
};
expj.AA0180010.AA0180010button2.LineInsertProc.executeOnLoad = function () {
  $('#expj-AA0180010-AA0180010button2-LineInsertProc').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0180010', 'AA0180010button2', 'LineInsertProc', this, 'Button');
    }
  });
  expj.AA0180010.AA0180010button2.LineInsertProc.executePScriptOnLoad();
};

expj.AA0180010.AA0180010button2.LineInsertProc.executePScriptOnLoad = function () {
  console.log('execute AA0180010button2/LineInsertProc.onLoad');
  var targetComponent = document.getElementById('expj-AA0180010-AA0180010button2-LineInsertProc');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0180010-AA0180010button2-LineInsertProc" name="LineInsertProc" class="AA0180010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsertProc",rb)%></button><!-- 系列追加ボタン --></div><!--/td-->
<script class="expj-script-AA0180010-AA0180010button2-LineUpdateProc">
expj.AA0180010.AA0180010button2.LineUpdateProc = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0180010form1/*,_AA0180010tree1/+@AA0180010Servlet"
expj.AA0180010.AA0180010button2.LineUpdateProc.onClick0 = function () {
  console.log('LineUpdateProc script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0180010', 'AA0180010button2', '_AA0180010form1/*,_AA0180010tree1/+', 'AA0180010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0180010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0180010', response);
expj.common.changeBusinessScreenTab('AA0180010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0180010.AA0180010button2.LineUpdateProc.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0180010.AA0180010button2.LineUpdateProc['onClick' + i])) {
        expj.AA0180010.AA0180010button2.LineUpdateProc['onClick' + i]();
      }
    }
  }
};
expj.AA0180010.AA0180010button2.LineUpdateProc.executeAllOnDecision = function () {
};
expj.AA0180010.AA0180010button2.LineUpdateProc.executeOnLoad = function () {
  $('#expj-AA0180010-AA0180010button2-LineUpdateProc').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0180010', 'AA0180010button2', 'LineUpdateProc', this, 'Button');
    }
  });
  expj.AA0180010.AA0180010button2.LineUpdateProc.executePScriptOnLoad();
};

expj.AA0180010.AA0180010button2.LineUpdateProc.executePScriptOnLoad = function () {
  console.log('execute AA0180010button2/LineUpdateProc.onLoad');
  var targetComponent = document.getElementById('expj-AA0180010-AA0180010button2-LineUpdateProc');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0180010-AA0180010button2-LineUpdateProc" name="LineUpdateProc" class="AA0180010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdateProc",rb)%></button><!-- 系列修正ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 399px);"></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AA0180010 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AA0180010-AA0180010button0">
expj.AA0180010.AA0180010button0 = {};
expj.AA0180010.AA0180010button0.executeAllOnDecision = function () {
  console.log('execute AA0180010button0.onDecision');
};
expj.AA0180010.AA0180010button0.executeOnLoad = function () {
  expj.AA0180010.AA0180010button0.executePScriptOnLoad();
};

expj.AA0180010.AA0180010button0.executePScriptOnLoad = function () {
  console.log('execute AA0180010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0180010-AA0180010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0180010-AA0180010button0-Clear">
expj.AA0180010.AA0180010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AA0180010Servlet,,$ZZ07008"
expj.AA0180010.AA0180010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0180010', 'AA0180010button0', '', 'AA0180010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0180010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0180010', response);
expj.common.updateBusinessScreenTab('AA0180010', contents);
};
expj.common.pscript.callConfirm('AA0180010', 'AA0180010button0', 'ZZ07008', okEvent);
};
expj.AA0180010.AA0180010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0180010.AA0180010button0.Clear['onClick' + i])) {
        expj.AA0180010.AA0180010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AA0180010.AA0180010button0.Clear.executeAllOnDecision = function () {
};
expj.AA0180010.AA0180010button0.Clear.executeOnLoad = function () {
  $('#expj-AA0180010-AA0180010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0180010', 'AA0180010button0', 'Clear', this, 'Button');
    }
  });
  expj.AA0180010.AA0180010button0.Clear.executePScriptOnLoad();
};

expj.AA0180010.AA0180010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AA0180010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AA0180010-AA0180010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0180010-AA0180010button0-Clear" name="Clear" class="AA0180010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AA0180010-AA0180010button0-Close">
expj.AA0180010.AA0180010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AA0180010.AA0180010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AA0180010');
};
expj.AA0180010.AA0180010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0180010.AA0180010button0.Close['onClick' + i])) {
        expj.AA0180010.AA0180010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AA0180010.AA0180010button0.Close.executeAllOnDecision = function () {
};
expj.AA0180010.AA0180010button0.Close.executeOnLoad = function () {
  $('#expj-AA0180010-AA0180010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0180010', 'AA0180010button0', 'Close', this, 'Button');
    }
  });
  expj.AA0180010.AA0180010button0.Close.executePScriptOnLoad();
};

expj.AA0180010.AA0180010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AA0180010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AA0180010-AA0180010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0180010-AA0180010button0-Close" name="Close" class="AA0180010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0180010 (END)-->
<%
  MessageStruct msgStruct = aAA0180010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><script class="expj-script-AA0180010-AA0180010detailview1">
expj.AA0180010.AA0180010detailview1 = {};
expj.AA0180010.AA0180010detailview1.executeAllOnDecision = function () {
  console.log('execute AA0180010detailview1.onDecision');
};
expj.AA0180010.AA0180010detailview1.executeOnLoad = function () {
  expj.AA0180010.AA0180010detailview1.executePScriptOnLoad();
};

expj.AA0180010.AA0180010detailview1.executePScriptOnLoad = function () {
  console.log('execute AA0180010detailview1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAA0180010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AA0180010-AA0180010detailview1" class="expj-datagird-detail" data-float="AA0180010float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AA0180010detailview1";
 detailFloat = "AA0180010float1";
 detailWidth = 358;
 detailHeight = 342 + 47;
 String AA0180010detailview1_Id = "AA0180010detailview1";
 String AA0180010detailview1_select = "single";
 String AA0180010detailview1_sortable = "true";
 String AA0180010detailview1_resize = "true";
 String AA0180010detailview1_scroll = "true";
 StringBuffer AA0180010detailview1_HB = new StringBuffer();
 StringBuffer AA0180010detailview1_DB = new StringBuffer();
%>
<%
 AA0180010detailview1_sortable = "false";
 AA0180010detailview1_select = "none";
%>
<% AA0180010detailview1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AA0180010detailview1_sortable).append("}").append(","); %>
<%  AA0180010detailview1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AA0180010detailview1_sortable).append("}").append(",");
AA0180010detailview1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AA0180010detailview1_sortable).append("}").append(",");
AA0180010detailview1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AA0180010detailview1_sortable).append("}").append(",");
 %>
   <% if (aAA0180010Control.getDetType().equals("PS")) { %>
 <% AA0180010detailview1_DB.append("['1','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-DetParent_ITEM_CD\" class=\"expj-label\" data-name=\"DetParent_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDetParent_ITEM_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['2','").append(CoreTools.getRBString("Expj.ITEM_NAME",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-DetParent_ITEM_NAME\" class=\"expj-label\" data-name=\"DetParent_ITEM_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDetParent_ITEM_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['3','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-DetParent_MRP_ODR_TYP\" class=\"expj-label\" data-name=\"DetParent_MRP_ODR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDetParent_MRP_ODR_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['4','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP_4",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-DetParent_OUTSIDE_TYP\" class=\"expj-label\" data-name=\"DetParent_OUTSIDE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDetParent_OUTSIDE_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['5','").append(CoreTools.getRBString("Expj.COMP_ITEM_CD_1",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-DetComp_ITEM_CD\" class=\"expj-label\" data-name=\"DetComp_ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDetComp_ITEM_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['6','").append(CoreTools.getRBString("Expj.ITEM_NAME_1",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-DetComp_ITEM_NAME\" class=\"expj-label\" data-name=\"DetComp_ITEM_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDetComp_ITEM_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['7','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP_1",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-DetComp_MRP_ODR_TYP\" class=\"expj-label\" data-name=\"DetComp_MRP_ODR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDetComp_MRP_ODR_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['8','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP_5",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-DetComp_OUTSIDE_TYP\" class=\"expj-label\" data-name=\"DetComp_OUTSIDE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDetComp_OUTSIDE_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['9','").append(CoreTools.getRBString("Expj.PS_EDITION",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det_PS_EDITION\" class=\"expj-label\" data-name=\"Det_PS_EDITION\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet_PS_EDITION())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['10','").append(CoreTools.getRBString("Expj.PS_UNIT_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det_PS_UNIT_QTY\" class=\"expj-label\" data-name=\"Det_PS_UNIT_QTY\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet_PS_UNIT_QTY())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['11','").append(CoreTools.getRBString("Expj.STOCK_UNIT",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det_STOCK_UNIT\" class=\"expj-label\" data-name=\"Det_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet_STOCK_UNIT())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['12','").append(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE_4",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det_EFF_PHASE_IN_DATE\" class=\"expj-label\" data-name=\"Det_EFF_PHASE_IN_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet_EFF_PHASE_IN_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['13','").append(CoreTools.getRBString("Expj.EFF_PHASE_OUT_DATE",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det_EFF_PHASE_OUT_DATE\" class=\"expj-label\" data-name=\"Det_EFF_PHASE_OUT_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet_EFF_PHASE_OUT_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['14','").append(CoreTools.getRBString("Expj.PS_SPOIL",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det_PS_SPOIL\" class=\"expj-label\" data-name=\"Det_PS_SPOIL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER;5.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet_PS_SPOIL())).append("</span>").append("</div>','").append(CoreTools.getRBString("Expj.Cmt0051",rb)).append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['15','").append(CoreTools.getRBString("Expj.CONS_TYP",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det_CONS_TYP\" class=\"expj-label\" data-name=\"Det_CONS_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet_CONS_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['16','").append(CoreTools.getRBString("Expj.PS_LT_FLG",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det_PS_LT_FLG\" class=\"expj-label\" data-name=\"Det_PS_LT_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet_PS_LT_FLG())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['17','").append(CoreTools.getRBString("Expj.PS_FIXED_LT",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det_PS_FIXED_LT\" class=\"expj-label\" data-name=\"Det_PS_FIXED_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet_PS_FIXED_LT())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['18','").append(CoreTools.getRBString("Expj.PS_PROP_LT",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det_PS_PROP_LT\" class=\"expj-label\" data-name=\"Det_PS_PROP_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet_PS_PROP_LT())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['19','").append(CoreTools.getRBString("Expj.PS_PROP_LOT_SIZE",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det_PS_PROP_LOT_SIZE\" class=\"expj-label\" data-name=\"Det_PS_PROP_LOT_SIZE\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet_PS_PROP_LOT_SIZE())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['20','").append(CoreTools.getRBString("Expj.PS_REF_NO",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det_PS_REF_NO\" class=\"expj-label\" data-name=\"Det_PS_REF_NO\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet_PS_REF_NO())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['21','").append(CoreTools.getRBString("Expj.COST_UP_TYP_2",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det_COST_UP_TYP\" class=\"expj-label\" data-name=\"Det_COST_UP_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet_COST_UP_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['22','").append(CoreTools.getRBString("Expj.MRP_EXP_TYP_2",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det_MRP_EXP_TYP\" class=\"expj-label\" data-name=\"Det_MRP_EXP_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet_MRP_EXP_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['23','").append(CoreTools.getRBString("Expj.MANHOUR_TYP_1",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det_MANHOUR_TYP\" class=\"expj-label\" data-name=\"Det_MANHOUR_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet_MANHOUR_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
  <% } else if (aAA0180010Control.getDetType().equals("PROC")) { %>
 <% AA0180010detailview1_DB.append("['24','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det2ITEM_CD\" class=\"expj-label\" data-name=\"Det2ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet2ITEM_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['25','").append(CoreTools.getRBString("Expj.ITEM_NAME",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det2ITEM_NAME\" class=\"expj-label\" data-name=\"Det2ITEM_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet2ITEM_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['26','").append(CoreTools.getRBString("Expj.PROC_CD",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det2PROC_CD\" class=\"expj-label\" data-name=\"Det2PROC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet2PROC_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['27','").append(CoreTools.getRBString("Expj.PROC_NO",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det2PROC_NO\" class=\"expj-label\" data-name=\"Det2PROC_NO\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet2PROC_NO())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['28','").append(CoreTools.getRBString("Expj.PROC_NAME",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det2PROC_NAME\" class=\"expj-label\" data-name=\"Det2PROC_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet2PROC_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['29','").append(CoreTools.getRBString("Expj.WS_CD",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det2WS_CD\" class=\"expj-label\" data-name=\"Det2WS_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet2WS_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['30','").append(CoreTools.getRBString("Expj.WS_NAME",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det2WS_NAME\" class=\"expj-label\" data-name=\"Det2WS_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet2WS_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['31','").append(CoreTools.getRBString("Expj.COMPANY_CD",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det2COMPANY_CD\" class=\"expj-label\" data-name=\"Det2COMPANY_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet2COMPANY_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['32','").append(CoreTools.getRBString("Expj.VEND_CD",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det2VEND_CD\" class=\"expj-label\" data-name=\"Det2VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet2VEND_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['33','").append(CoreTools.getRBString("Expj.VEND_NAME",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det2VEND_NAME\" class=\"expj-label\" data-name=\"Det2VEND_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet2VEND_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['34','").append(CoreTools.getRBString("Expj.FIXED_LT",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det2FIXED_LT\" class=\"expj-label\" data-name=\"Det2FIXED_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet2FIXED_LT())).append("</span>").append("</div>','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det2FIXED_LT_UNIT\" class=\"expj-label\" data-name=\"Det2FIXED_LT_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet2FIXED_LT_UNIT())).append("</span>").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['35','").append(CoreTools.getRBString("Expj.PROP_LT",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det2PROP_LT\" class=\"expj-label\" data-name=\"Det2PROP_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet2PROP_LT())).append("</span>").append("</div>','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det2PROP_LT_UNIT\" class=\"expj-label\" data-name=\"Det2PROP_LT_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet2PROP_LT_UNIT())).append("</span>").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['36','").append(CoreTools.getRBString("Expj.PROP_LOT_SIZE",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det2PROP_LOT_SIZE\" class=\"expj-label\" data-name=\"Det2PROP_LOT_SIZE\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet2PROP_LOT_SIZE())).append("</span>").append("</div>','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det2PROP_LOT_SIZE_UNIT\" class=\"expj-label\" data-name=\"Det2PROP_LOT_SIZE_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet2PROP_LOT_SIZE_UNIT())).append("</span>").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['37','").append(CoreTools.getRBString("Expj.SAFETY_LT",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det2SAFETY_LT\" class=\"expj-label\" data-name=\"Det2SAFETY_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet2SAFETY_LT())).append("</span>").append("</div>','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det2SAFETY_LT_UNIT\" class=\"expj-label\" data-name=\"Det2SAFETY_LT_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet2SAFETY_LT_UNIT())).append("</span>").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['38','").append(CoreTools.getRBString("Expj.SPOIL",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det2SPOIL\" class=\"expj-label\" data-name=\"Det2SPOIL\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER;5.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet2SPOIL())).append("</span>").append("</div>','").append(CoreTools.getRBString("Expj.Cmt0051",rb)).append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['39','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det2OUTSIDE_TYP\" class=\"expj-label\" data-name=\"Det2OUTSIDE_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet2OUTSIDE_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['40','").append(CoreTools.getRBString("Expj.ACPT_INSPC_TYP",rb)).append("','").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det2ACPT_INSPC_TYP\" class=\"expj-label\" data-name=\"Det2ACPT_INSPC_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet2ACPT_INSPC_TYP())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0180010detailview1_DB.append("['41','").append(CoreTools.getRBString("Expj.STANDARD_COST",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0180010-AA0180010detailview1-Det2STANDARD_COST\" class=\"expj-label\" data-name=\"Det2STANDARD_COST\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0180010Struct.getDet2STANDARD_COST())).append("</span>").append("</div>','").append("").append("']").append(",");%>
  <% } %>
<%
 detailViewId = AA0180010detailview1_Id;
 detailViewSelect = AA0180010detailview1_select;
 detailViewResize = AA0180010detailview1_resize;
 detailViewScroll = AA0180010detailview1_scroll;
 detailViewHeaderData = AA0180010detailview1_HB;
 detailViewBodyData = AA0180010detailview1_DB;
%>
<%
}
%>
<%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0180010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0180010)) {
  expj.common.treeInstanceMap.AA0180010 = {};
}
expj.common.treeInstanceMap.AA0180010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0180010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0180010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0180010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0180010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0180010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0180010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0180010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0180010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = expj.AA0180010.AA0180010tree1.onDmyOpen0;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0180010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0180010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0180010)) {
  expj.common.detailDialogMap.AA0180010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0180010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0180010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0180010.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0180010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0180010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0180010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0180010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0180010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0180010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0180010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0180010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0180010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0180010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0180010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0180010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0180010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0180010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0180010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0180010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0180010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0180010)) {
  expj.common.viewInstanceMap.AA0180010 = {};
}
expj.common.viewInstanceMap.AA0180010.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0180010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0180010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0180010.<%=viewId %>.init = function () {
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
    expj.AA0180010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0180010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0180010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0180010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0180010_init">
/**
 * AA0180010用のロード完了時初期化関数
 */
expj.AA0180010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0180010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0180010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0180010');
  expj.common.calendarInstanceMap.AA0180010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0180010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0180010.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0180010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0180010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0180010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0180010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0180010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0180010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0180010-<%=detailId %>');
<%
 }
%>
  try{expj.AA0180010.AA0180010form1.Target_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0180010.AA0180010form1.PeekerTargetItemCd.executeOnLoad();}catch(e){};
  try{expj.AA0180010.AA0180010form1.DEVELOP_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0180010.AA0180010form1.TargetDate.executeOnLoad();}catch(e){};
  try{expj.AA0180010.AA0180010form1.CalendarTargetDate.executeOnLoad();}catch(e){};
  try{expj.AA0180010.AA0180010form1.InitLevel.executeOnLoad();}catch(e){};
  try{expj.AA0180010.AA0180010form1.h_MaxLevel.executeOnLoad();}catch(e){};
  try{expj.AA0180010.AA0180010form1.h_ProcTyp.executeOnLoad();}catch(e){};
  try{expj.AA0180010.AA0180010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AA0180010.AA0180010button2.LineInsert.executeOnLoad();}catch(e){};
  try{expj.AA0180010.AA0180010button2.LineUpdate.executeOnLoad();}catch(e){};
  try{expj.AA0180010.AA0180010button2.LineInsertProc.executeOnLoad();}catch(e){};
  try{expj.AA0180010.AA0180010button2.LineUpdateProc.executeOnLoad();}catch(e){};
  try{expj.AA0180010.AA0180010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AA0180010.AA0180010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AA0180010.AA0180010form1.executeOnLoad();}catch(e){};
  try{expj.AA0180010.AA0180010button1.executeOnLoad();}catch(e){};
  try{expj.AA0180010.AA0180010tree1.executeOnLoad();}catch(e){};
  try{expj.AA0180010.AA0180010button2.executeOnLoad();}catch(e){};
  try{expj.AA0180010.AA0180010button0.executeOnLoad();}catch(e){};
  try{expj.AA0180010.AA0180010detailview1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0180010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0180010', 'AA0180010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0180010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0180010-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0180010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0180010', '<%=request.getContextPath() %>');
};

/**
 * AA0180010の全体onDecision処理
 */
expj.AA0180010.executeAllOnDecision = function () {
  expj.AA0180010.AA0180010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0180010_console">
expj.AA0180010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>