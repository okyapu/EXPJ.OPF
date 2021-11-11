<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:31:19 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AD0050\AD0050010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AD0050.*" %>
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
<jsp:useBean id="aAD0050010Control" class="com.nec.jp.orteus.metamorBase.AD0050.AD0050010Control" scope="request"/>
<jsp:useBean id="aAD0050010Struct" class="com.nec.jp.orteus.metamorBase.AD0050.AD0050010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

出来高実績入力
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0050/jsp/AD0050010.jsp,v $
$Author: geng-jia $	
$Revision: 1.15 $ $Date: 2017/02/22 02:04:50 $
********************************************************* --%>
<html>
<head>
<title>出来高実績入力</title>
<%@include file="common/expj_v5.jsp" %>
<%ScreenMoveUtil su = new ScreenMoveUtil("AE0200010Servlet", so);%>

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
<script class="expj-script-AD0050010_init">
  // AD0050010名前空間
  expj.AD0050010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

<% 
String callButton = aAD0050010Control.getButton(); 
String h_ACPT_QTY = aAD0050010Control.getKeepRsltStruct().getACPT_QTY();
String h_LOT_NO = aAD0050010Control.getKeepRsltStruct().getLOT_NO();
%>
  <div id="expj-business-screen-AD0050010" data-screen="AD0050010" data-newdata="<%=aAD0050010Control.isNewData() %>">
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
              <!-- ここに上段検索条件用のDataGridを配置する。↓ -->
              <script class="expj-script-AD0050010-AD0050010form1">
expj.AD0050010.AD0050010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5,6"
expj.AD0050010.AD0050010form1.onLoad0 = function () {
  console.log('AD0050010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision6)){this.onDecision6();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AD0050010.AD0050010form1.onDecision0 = function () {
  console.log('AD0050010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AD0050010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AD0050010button1/Select"
expj.AD0050010.AD0050010form1.child0 = function () {
  console.log('AD0050010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AD0050010', 'AD0050010form1', '_AD0050010button1/Select');
};
// script4="child;1;MASK;_AD0050010button1/Select"
expj.AD0050010.AD0050010form1.child1 = function () {
  console.log('AD0050010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AD0050010', 'AD0050010form1', '_AD0050010button1/Select');
};
// script5="onDecision;1;CHKRQ;B,C@*2,*3"
expj.AD0050010.AD0050010form1.onDecision1 = function () {
  console.log('AD0050010form1 script5');
if (expj.common.pscript.satisfiedRequiredComponent('AD0050010', 'B') && expj.common.pscript.satisfiedRequiredComponent('AD0050010', 'C')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;2;UNMASK;_AD0050010button2/Insert10"
expj.AD0050010.AD0050010form1.child2 = function () {
  console.log('AD0050010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AD0050010', 'AD0050010form1', '_AD0050010button2/Insert10');
};
// script7="child;3;MASK;_AD0050010button2/Insert10"
expj.AD0050010.AD0050010form1.child3 = function () {
  console.log('AD0050010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AD0050010', 'AD0050010form1', '_AD0050010button2/Insert10');
};
// script8="onDecision;2;CHKRQ;C@*4,*8"
expj.AD0050010.AD0050010form1.onDecision2 = function () {
  console.log('AD0050010form1 script8');
if (expj.common.pscript.satisfiedRequiredComponent('AD0050010', 'C')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script9="child;4;CHK;?AD0050010form1/IN_OUTPUT_RSLT_CD[eq]SAME@*5,*8"
expj.AD0050010.AD0050010form1.child4 = function () {
  console.log('AD0050010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form1', '?AD0050010form1/IN_OUTPUT_RSLT_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script10="child;5;CHK;?AD0050010form1/*[eq]NORMAL[or]?AD0050010form1/*[eq]TOO_MANY@*6,*8"
expj.AD0050010.AD0050010form1.child5 = function () {
  console.log('AD0050010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form1', '?AD0050010form1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form1', '?AD0050010form1/*'), '[eq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script11="child;6;CHK;_AD0050010form1/IN_OUTPUT_RSLT_CD[neq]@*7,*8"
expj.AD0050010.AD0050010form1.child6 = function () {
  console.log('AD0050010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form1', '_AD0050010form1/IN_OUTPUT_RSLT_CD'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script12="child;7;UNMASK;_AD0050010button2/Update10,_AD0050010button3/UseParts,_AD0050010button3/UpdateAll"
expj.AD0050010.AD0050010form1.child7 = function () {
  console.log('AD0050010form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('AD0050010', 'AD0050010form1', '_AD0050010button2/Update10');
expj.common.pscript.setUnMaskToReferenceComponent('AD0050010', 'AD0050010form1', '_AD0050010button3/UseParts');
expj.common.pscript.setUnMaskToReferenceComponent('AD0050010', 'AD0050010form1', '_AD0050010button3/UpdateAll');
};
// script13="child;8;MASK;_AD0050010button2/Update10,_AD0050010button3/UseParts,_AD0050010button3/UpdateAll"
expj.AD0050010.AD0050010form1.child8 = function () {
  console.log('AD0050010form1 script13');
expj.common.pscript.setMaskToReferenceComponent('AD0050010', 'AD0050010form1', '_AD0050010button2/Update10');
expj.common.pscript.setMaskToReferenceComponent('AD0050010', 'AD0050010form1', '_AD0050010button3/UseParts');
expj.common.pscript.setMaskToReferenceComponent('AD0050010', 'AD0050010form1', '_AD0050010button3/UpdateAll');
};
// script14="onDecision;3;CHK;?AD0050010form1/IN_OUTPUT_RSLT_CD[eq]SAME@*9,*13"
expj.AD0050010.AD0050010form1.onDecision3 = function () {
  console.log('AD0050010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form1', '?AD0050010form1/IN_OUTPUT_RSLT_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script15="child;9;CHK;?AD0050010form1/*[eq]NORMAL[or]?AD0050010form1/*[eq]TOO_MANY@*10,*13"
expj.AD0050010.AD0050010form1.child9 = function () {
  console.log('AD0050010form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form1', '?AD0050010form1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form1', '?AD0050010form1/*'), '[eq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script16="child;10;CHK;_AD0050010form1/IN_OUTPUT_RSLT_CD[neq]@*11,*13"
expj.AD0050010.AD0050010form1.child10 = function () {
  console.log('AD0050010form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form1', '_AD0050010form1/IN_OUTPUT_RSLT_CD'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script17="child;11;CHKRQ;?AD0050010view1/?[eq]SINGLE@*12,*13"
expj.AD0050010.AD0050010form1.child11 = function () {
  console.log('AD0050010form1 script17');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form1', '?AD0050010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script18="child;12;UNMASK;_AD0050010button3/NoUserParts"
expj.AD0050010.AD0050010form1.child12 = function () {
  console.log('AD0050010form1 script18');
expj.common.pscript.setUnMaskToReferenceComponent('AD0050010', 'AD0050010form1', '_AD0050010button3/NoUserParts');
};
// script19="child;13;MASK;_AD0050010button3/NoUserParts"
expj.AD0050010.AD0050010form1.child13 = function () {
  console.log('AD0050010form1 script19');
expj.common.pscript.setMaskToReferenceComponent('AD0050010', 'AD0050010form1', '_AD0050010button3/NoUserParts');
};
// script20="onDecision;4;CHK;?AD0050010form1/*[eq]NORMAL[or]?AD0050010form1/*[eq]TOO_MANY@*14,*15"
expj.AD0050010.AD0050010form1.onDecision4 = function () {
  console.log('AD0050010form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form1', '?AD0050010form1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form1', '?AD0050010form1/*'), '[eq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script21="child;14;MASK;_AD0050010form2/ITEM_CD,_AD0050010form2/PeekerItemCd"
expj.AD0050010.AD0050010form1.child14 = function () {
  console.log('AD0050010form1 script21');
expj.common.pscript.setMaskToReferenceComponent('AD0050010', 'AD0050010form1', '_AD0050010form2/ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('AD0050010', 'AD0050010form1', '_AD0050010form2/PeekerItemCd');
};
// script22="child;15;UNMASK;_AD0050010form2/ITEM_CD,_AD0050010form2/PeekerItemCd"
expj.AD0050010.AD0050010form1.child15 = function () {
  console.log('AD0050010form1 script22');
expj.common.pscript.setUnMaskToReferenceComponent('AD0050010', 'AD0050010form1', '_AD0050010form2/ITEM_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AD0050010', 'AD0050010form1', '_AD0050010form2/PeekerItemCd');
};
// script23="onDecision;5;CHK;?AD0050010form1/*[eq]NORMAL[or]?AD0050010form1/*[eq]TOO_MANY@*16"
expj.AD0050010.AD0050010form1.onDecision5 = function () {
  console.log('AD0050010form1 script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form1', '?AD0050010form1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form1', '?AD0050010form1/*'), '[eq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script24="child;16;SET;_AD0050010form2/d1_STOCK_UNIT=_AD0050010form2/STOCK_UNIT"
expj.AD0050010.AD0050010form1.child16 = function () {
  console.log('AD0050010form1 script24');
expj.common.pscript.setReferenceComponentValue('AD0050010', 'AD0050010form1', '_AD0050010form2/d1_STOCK_UNIT', expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form1', '_AD0050010form2/STOCK_UNIT'));
};
// script25="onDecision;6;CHK;_AD0050010form1/h_SYS_LOT_CTRL_FLG[eq]true@*17,*24"
expj.AD0050010.AD0050010form1.onDecision6 = function () {
  console.log('AD0050010form1 script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form1', '_AD0050010form1/h_SYS_LOT_CTRL_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
} else {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
}
};
// script26="child;17;CHK;?AD0050010form1/IN_OUTPUT_RSLT_CD[eq]SAME@*18,*25"
expj.AD0050010.AD0050010form1.child17 = function () {
  console.log('AD0050010form1 script26');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form1', '?AD0050010form1/IN_OUTPUT_RSLT_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
} else {
if(expj.common.checkNameSpace(this.child25)){this.child25();}
}
};
// script27="child;18;CHK;?AD0050010form1/*[eq]NORMAL[or]?AD0050010form1/*[eq]TOO_MANY@*19,*25"
expj.AD0050010.AD0050010form1.child18 = function () {
  console.log('AD0050010form1 script27');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form1', '?AD0050010form1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form1', '?AD0050010form1/*'), '[eq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
} else {
if(expj.common.checkNameSpace(this.child25)){this.child25();}
}
};
// script28="child;19;CHK;_AD0050010form1/IN_OUTPUT_RSLT_CD[neq]@*20,*25"
expj.AD0050010.AD0050010form1.child19 = function () {
  console.log('AD0050010form1 script28');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form1', '_AD0050010form1/IN_OUTPUT_RSLT_CD'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
} else {
if(expj.common.checkNameSpace(this.child25)){this.child25();}
}
};
// script29="child;20;CHK;<%=TypeConverter.sanitizer(h_ACPT_QTY)%>[numeq]0@*21,*24"
expj.AD0050010.AD0050010form1.child20 = function () {
  console.log('AD0050010form1 script29');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber('<%=TypeConverter.sanitizer(h_ACPT_QTY)%>'), '[numeq]', expj.common.pscript.convertNumber('0'))) {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
} else {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
}
};
// script30="child;21;CHK;<%=TypeConverter.sanitizer(h_LOT_NO)%>[eq]@*22,*24"
expj.AD0050010.AD0050010form1.child21 = function () {
  console.log('AD0050010form1 script30');
if (expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(h_LOT_NO)%>', '[eq]', '')) {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
} else {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
}
};
// script31="child;22;CHK;_AD0050010form2/ACPT_QTY[numeq]0@*23,*25"
expj.AD0050010.AD0050010form1.child22 = function () {
  console.log('AD0050010form1 script31');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form1', '_AD0050010form2/ACPT_QTY')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
} else {
if(expj.common.checkNameSpace(this.child25)){this.child25();}
}
};
// script32="child;23;SET;_AD0050010form2/LOT_NO=<%=TypeConverter.sanitizer(h_LOT_NO)%>@*24"
expj.AD0050010.AD0050010form1.child23 = function () {
  console.log('AD0050010form1 script32');
expj.common.pscript.setReferenceComponentValue('AD0050010', 'AD0050010form1', '_AD0050010form2/LOT_NO', '<%=TypeConverter.sanitizer(h_LOT_NO)%>');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child24)){this.child24();}}
};
// script33="child;24;MASK;_AD0050010form2/LOT_NO,_AD0050010form2/PeekerLotNo,_AD0050010form2/LotInsert"
expj.AD0050010.AD0050010form1.child24 = function () {
  console.log('AD0050010form1 script33');
expj.common.pscript.setMaskToReferenceComponent('AD0050010', 'AD0050010form1', '_AD0050010form2/LOT_NO');
expj.common.pscript.setMaskToReferenceComponent('AD0050010', 'AD0050010form1', '_AD0050010form2/PeekerLotNo');
expj.common.pscript.setMaskToReferenceComponent('AD0050010', 'AD0050010form1', '_AD0050010form2/LotInsert');
};
// script34="child;25;UNMASK;_AD0050010form2/LOT_NO,_AD0050010form2/PeekerLotNo,_AD0050010form2/LotInsert"
expj.AD0050010.AD0050010form1.child25 = function () {
  console.log('AD0050010form1 script34');
expj.common.pscript.setUnMaskToReferenceComponent('AD0050010', 'AD0050010form1', '_AD0050010form2/LOT_NO');
expj.common.pscript.setUnMaskToReferenceComponent('AD0050010', 'AD0050010form1', '_AD0050010form2/PeekerLotNo');
expj.common.pscript.setUnMaskToReferenceComponent('AD0050010', 'AD0050010form1', '_AD0050010form2/LotInsert');
};
expj.AD0050010.AD0050010form1.executeAllOnDecision = function () {
  console.log('execute AD0050010form1.onDecision');
  for (var i = 0; i <= 6; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0050010.AD0050010form1['onDecision' + i])) {
        expj.AD0050010.AD0050010form1['onDecision' + i]();
      }
    }
  }
};
expj.AD0050010.AD0050010form1.executeOnLoad = function () {
  expj.AD0050010.AD0050010form1.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form1.executePScriptOnLoad = function () {
  console.log('execute AD0050010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AD0050010.AD0050010form1['onLoad' + i])) {
      expj.AD0050010.AD0050010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0050010-AD0050010form1" action="AD0050010Servlet" name="AD0050010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAD0050010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.OUTPUT_RSLT_CD",rb)%></span><!-- 出来高実績番号 --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form1-IN_OUTPUT_RSLT_CD">
expj.AD0050010.AD0050010form1.IN_OUTPUT_RSLT_CD = {};
expj.AD0050010.AD0050010form1.IN_OUTPUT_RSLT_CD.executeAllOnDecision = function () {
  console.log('execute AD0050010form1/IN_OUTPUT_RSLT_CD.onDecision');
  expj.AD0050010.AD0050010form1.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form1.IN_OUTPUT_RSLT_CD.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form1-IN_OUTPUT_RSLT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form1', 'IN_OUTPUT_RSLT_CD', this);
  });
  expj.AD0050010.AD0050010form1.IN_OUTPUT_RSLT_CD.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form1.IN_OUTPUT_RSLT_CD.executePScriptOnLoad = function () {
  console.log('execute AD0050010form1/IN_OUTPUT_RSLT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form1-IN_OUTPUT_RSLT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form1-IN_OUTPUT_RSLT_CD" name="IN_OUTPUT_RSLT_CD" class="AD0050010-focus-move  required-value expj-AD0050010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getIN_OUTPUT_RSLT_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form1-PeekerOutputRsltCd">
expj.AD0050010.AD0050010form1.PeekerOutputRsltCd = {};
// script1="onClick;0;PEEKER;_AD0050010form1/IN_OUTPUT_RSLT_CD@<%=contextNo%>"
expj.AD0050010.AD0050010form1.PeekerOutputRsltCd.onClick0 = function () {
  console.log('PeekerOutputRsltCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0050010';
var parameterValues = 'PeekerOutputRsltCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AD0050010', 'PeekerOutputRsltCd', 'SQLPARAM_1', '<%=aAD0050010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form1', '_IN_OUTPUT_RSLT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%OUTPUT_RSLT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AD0050010form1/IN_OUTPUT_RSLT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0050010.AD0050010form1.PeekerOutputRsltCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0050010.AD0050010form1.PeekerOutputRsltCd['onClick' + i])) {
        expj.AD0050010.AD0050010form1.PeekerOutputRsltCd['onClick' + i]();
      }
    }
  }
};
expj.AD0050010.AD0050010form1.PeekerOutputRsltCd.executeAllOnDecision = function () {
};
expj.AD0050010.AD0050010form1.PeekerOutputRsltCd.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form1-PeekerOutputRsltCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0050010', 'AD0050010form1', 'PeekerOutputRsltCd', this, 'Button');
    }
  });
  expj.AD0050010.AD0050010form1.PeekerOutputRsltCd.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form1.PeekerOutputRsltCd.executePScriptOnLoad = function () {
  console.log('execute AD0050010form1/PeekerOutputRsltCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form1-PeekerOutputRsltCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0050010-AD0050010form1-PeekerOutputRsltCd" class="AD0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0001",rb)%></span><!-- （自動採番） --></div><!--/td-->
<input type="hidden" id="expj-AD0050010-AD0050010form1-h_SYS_LOT_CTRL_FLG" name="h_SYS_LOT_CTRL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0050010Struct.geth_SYS_LOT_CTRL_FLG()) %>">
<script class="expj-script-AD0050010-AD0050010form1-h_SYS_LOT_CTRL_FLG">
expj.AD0050010.AD0050010form1.h_SYS_LOT_CTRL_FLG = {};
expj.AD0050010.AD0050010form1.h_SYS_LOT_CTRL_FLG.executeAllOnDecision = function () {
  console.log('execute AD0050010form1/h_SYS_LOT_CTRL_FLG.onDecision');
  expj.AD0050010.AD0050010form1.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form1.h_SYS_LOT_CTRL_FLG.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form1-h_SYS_LOT_CTRL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form1', 'h_SYS_LOT_CTRL_FLG', this);
  });
  expj.AD0050010.AD0050010form1.h_SYS_LOT_CTRL_FLG.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form1.h_SYS_LOT_CTRL_FLG.executePScriptOnLoad = function () {
  console.log('execute AD0050010form1/h_SYS_LOT_CTRL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form1-h_SYS_LOT_CTRL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AD0050010-AD0050010button1">
expj.AD0050010.AD0050010button1 = {};
expj.AD0050010.AD0050010button1.executeAllOnDecision = function () {
  console.log('execute AD0050010button1.onDecision');
};
expj.AD0050010.AD0050010button1.executeOnLoad = function () {
  expj.AD0050010.AD0050010button1.executePScriptOnLoad();
};

expj.AD0050010.AD0050010button1.executePScriptOnLoad = function () {
  console.log('execute AD0050010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0050010-AD0050010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0050010-AD0050010button1-Select">
expj.AD0050010.AD0050010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0050010form1/*@AD0050010Servlet"
expj.AD0050010.AD0050010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0050010', 'AD0050010button1', '_AD0050010form1/*', 'AD0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0050010', response);
expj.common.updateBusinessScreenTab('AD0050010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0050010.AD0050010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0050010.AD0050010button1.Select['onClick' + i])) {
        expj.AD0050010.AD0050010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AD0050010.AD0050010button1.Select.executeAllOnDecision = function () {
};
expj.AD0050010.AD0050010button1.Select.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0050010', 'AD0050010button1', 'Select', this, 'Button');
    }
  });
  expj.AD0050010.AD0050010button1.Select.executePScriptOnLoad();
};

expj.AD0050010.AD0050010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AD0050010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0050010-AD0050010button1-Select" name="Select" class="AD0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AD0050010-AD0050010form2">
expj.AD0050010.AD0050010form2 = {};
expj.AD0050010.AD0050010form2.executeAllOnDecision = function () {
  console.log('execute AD0050010form2.onDecision');
};
expj.AD0050010.AD0050010form2.executeOnLoad = function () {
  expj.AD0050010.AD0050010form2.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0050010-AD0050010form2" action="AD0050010Servlet" name="AD0050010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:212px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:212px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-ITEM_CD">
expj.AD0050010.AD0050010form2.ITEM_CD = {};
expj.AD0050010.AD0050010form2.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/ITEM_CD.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.ITEM_CD.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'ITEM_CD', this);
  });
  expj.AD0050010.AD0050010form2.ITEM_CD.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form2-ITEM_CD" name="ITEM_CD" class="AD0050010-focus-move  required-value expj-AD0050010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-PeekerItemCd">
expj.AD0050010.AD0050010form2.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AD0050010form2/ITEM_CD@<%=contextNo%>"
expj.AD0050010.AD0050010form2.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0050010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form2', '_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_03%&%';
parameterValues += 'TARGET_FIELD%=%_AD0050010form2/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0050010.AD0050010form2.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0050010.AD0050010form2.PeekerItemCd['onClick' + i])) {
        expj.AD0050010.AD0050010form2.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AD0050010.AD0050010form2.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AD0050010.AD0050010form2.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0050010', 'AD0050010form2', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AD0050010.AD0050010form2.PeekerItemCd.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0050010-AD0050010form2-PeekerItemCd" class="AD0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-ITEM_NAME">
expj.AD0050010.AD0050010form2.ITEM_NAME = {};
expj.AD0050010.AD0050010form2.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/ITEM_NAME.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'ITEM_NAME', this);
  });
  expj.AD0050010.AD0050010form2.ITEM_NAME.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form2-ITEM_NAME" name="ITEM_NAME" class="AD0050010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DRAW_CD",rb)%></span><!-- 図面番号 --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-DRAW_CD">
expj.AD0050010.AD0050010form2.DRAW_CD = {};
expj.AD0050010.AD0050010form2.DRAW_CD.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/DRAW_CD.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.DRAW_CD.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-DRAW_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'DRAW_CD', this);
  });
  expj.AD0050010.AD0050010form2.DRAW_CD.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.DRAW_CD.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/DRAW_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-DRAW_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form2-DRAW_CD" name="DRAW_CD" class="AD0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getDRAW_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_SPEC",rb)%></span><!-- 規格 --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-SPEC">
expj.AD0050010.AD0050010form2.SPEC = {};
expj.AD0050010.AD0050010form2.SPEC.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/SPEC.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.SPEC.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-SPEC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'SPEC', this);
  });
  expj.AD0050010.AD0050010form2.SPEC.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.SPEC.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/SPEC.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-SPEC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form2-SPEC" name="SPEC" class="AD0050010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getSPEC()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WS_CD",rb)%></span><!-- 作業区コード --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-WS_CD">
expj.AD0050010.AD0050010form2.WS_CD = {};
expj.AD0050010.AD0050010form2.WS_CD.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/WS_CD.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.WS_CD.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-WS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'WS_CD', this);
  });
  expj.AD0050010.AD0050010form2.WS_CD.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.WS_CD.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/WS_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-WS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form2-WS_CD" name="WS_CD" class="AD0050010-focus-move  required-value expj-AD0050010-required-C" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getWS_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-PeekerWsCd">
expj.AD0050010.AD0050010form2.PeekerWsCd = {};
// script1="onClick;0;PEEKER;_AD0050010form2/WS_CD@<%=contextNo%>"
expj.AD0050010.AD0050010form2.PeekerWsCd.onClick0 = function () {
  console.log('PeekerWsCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0050010';
var parameterValues = 'PeekerWsCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AD0050010', 'PeekerWsCd', 'SQLPARAM_1', '<%=aAD0050010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form2', '_WS_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WS_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AD0050010form2/WS_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0050010.AD0050010form2.PeekerWsCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0050010.AD0050010form2.PeekerWsCd['onClick' + i])) {
        expj.AD0050010.AD0050010form2.PeekerWsCd['onClick' + i]();
      }
    }
  }
};
expj.AD0050010.AD0050010form2.PeekerWsCd.executeAllOnDecision = function () {
};
expj.AD0050010.AD0050010form2.PeekerWsCd.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-PeekerWsCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0050010', 'AD0050010form2', 'PeekerWsCd', this, 'Button');
    }
  });
  expj.AD0050010.AD0050010form2.PeekerWsCd.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.PeekerWsCd.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/PeekerWsCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-PeekerWsCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0050010-AD0050010form2-PeekerWsCd" class="AD0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-WS_NAME">
expj.AD0050010.AD0050010form2.WS_NAME = {};
expj.AD0050010.AD0050010form2.WS_NAME.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/WS_NAME.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.WS_NAME.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-WS_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'WS_NAME', this);
  });
  expj.AD0050010.AD0050010form2.WS_NAME.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.WS_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/WS_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-WS_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form2-WS_NAME" name="WS_NAME" class="AD0050010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getWS_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ACPT_QTY",rb)%></span><!-- 良品数 --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-ACPT_QTY">
expj.AD0050010.AD0050010form2.ACPT_QTY = {};
expj.AD0050010.AD0050010form2.ACPT_QTY.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/ACPT_QTY.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.ACPT_QTY.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-ACPT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'ACPT_QTY', this);
  });
  expj.AD0050010.AD0050010form2.ACPT_QTY.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.ACPT_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/ACPT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-ACPT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form2-ACPT_QTY" name="ACPT_QTY" class="AD0050010-focus-move  required-value expj-AD0050010-required-C" style="width:150px;" data-kind="<%=Kind.convertNumeric(aAD0050010Struct.geth_UNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getACPT_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-STOCK_UNIT">
expj.AD0050010.AD0050010form2.STOCK_UNIT = {};
expj.AD0050010.AD0050010form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/STOCK_UNIT.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'STOCK_UNIT', this);
  });
  expj.AD0050010.AD0050010form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form2-STOCK_UNIT" name="STOCK_UNIT" class="AD0050010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.OPR_DATE_3",rb)%></span><!-- 作業日 --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-OPR_DATE">
expj.AD0050010.AD0050010form2.OPR_DATE = {};
expj.AD0050010.AD0050010form2.OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/OPR_DATE.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.OPR_DATE.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'OPR_DATE', this);
  });
  expj.AD0050010.AD0050010form2.OPR_DATE.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form2-OPR_DATE" name="OPR_DATE" class="AD0050010-focus-move  required-value expj-AD0050010-required-C" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getOPR_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-CalendarOprDate">
expj.AD0050010.AD0050010form2.CalendarOprDate = {};
// script1="onClick;0;CALENDAR;_AD0050010form2/OPR_DATE"
expj.AD0050010.AD0050010form2.CalendarOprDate.onClick0 = function () {
  console.log('CalendarOprDate script1');
expj.common.pscript.executeCalendar('AD0050010','AD0050010form2','_AD0050010form2/OPR_DATE');
};
expj.AD0050010.AD0050010form2.CalendarOprDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0050010.AD0050010form2.CalendarOprDate['onClick' + i])) {
        expj.AD0050010.AD0050010form2.CalendarOprDate['onClick' + i]();
      }
    }
  }
};
expj.AD0050010.AD0050010form2.CalendarOprDate.executeAllOnDecision = function () {
};
expj.AD0050010.AD0050010form2.CalendarOprDate.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-CalendarOprDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0050010', 'AD0050010form2', 'CalendarOprDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0050010','AD0050010form2','_AD0050010form2/OPR_DATE');
  expj.AD0050010.AD0050010form2.CalendarOprDate.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.CalendarOprDate.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/CalendarOprDate.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-CalendarOprDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0050010-AD0050010form2-CalendarOprDate" class="AD0050010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<input type="hidden" id="expj-AD0050010-AD0050010form2-h_OPR_DATE" name="h_OPR_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0050010Struct.geth_OPR_DATE()) %>">
<script class="expj-script-AD0050010-AD0050010form2-h_OPR_DATE">
expj.AD0050010.AD0050010form2.h_OPR_DATE = {};
expj.AD0050010.AD0050010form2.h_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/h_OPR_DATE.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.h_OPR_DATE.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-h_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'h_OPR_DATE', this);
  });
  expj.AD0050010.AD0050010form2.h_OPR_DATE.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.h_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/h_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-h_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WH_CD",rb)%></span><!-- 保管区コード --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-WH_CD">
expj.AD0050010.AD0050010form2.WH_CD = {};
expj.AD0050010.AD0050010form2.WH_CD.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/WH_CD.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.WH_CD.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'WH_CD', this);
  });
  expj.AD0050010.AD0050010form2.WH_CD.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.WH_CD.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form2-WH_CD" name="WH_CD" class="AD0050010-focus-move  required-value expj-AD0050010-required-C" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getWH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-PeekerWhCd">
expj.AD0050010.AD0050010form2.PeekerWhCd = {};
// script1="onClick;0;PEEKER;_AD0050010form2/WH_CD@<%=contextNo%>"
expj.AD0050010.AD0050010form2.PeekerWhCd.onClick0 = function () {
  console.log('PeekerWhCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0050010';
var parameterValues = 'PeekerWhCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AD0050010', 'PeekerWhCd', 'SQLPARAM_1', '<%=aAD0050010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form2', '_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AD0050010form2/WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0050010.AD0050010form2.PeekerWhCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0050010.AD0050010form2.PeekerWhCd['onClick' + i])) {
        expj.AD0050010.AD0050010form2.PeekerWhCd['onClick' + i]();
      }
    }
  }
};
expj.AD0050010.AD0050010form2.PeekerWhCd.executeAllOnDecision = function () {
};
expj.AD0050010.AD0050010form2.PeekerWhCd.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-PeekerWhCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0050010', 'AD0050010form2', 'PeekerWhCd', this, 'Button');
    }
  });
  expj.AD0050010.AD0050010form2.PeekerWhCd.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.PeekerWhCd.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/PeekerWhCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-PeekerWhCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0050010-AD0050010form2-PeekerWhCd" class="AD0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-WH_NAME">
expj.AD0050010.AD0050010form2.WH_NAME = {};
expj.AD0050010.AD0050010form2.WH_NAME.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/WH_NAME.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.WH_NAME.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'WH_NAME', this);
  });
  expj.AD0050010.AD0050010form2.WH_NAME.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form2-WH_NAME" name="WH_NAME" class="AD0050010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getWH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OUTPUT_RSLT_COMMENT_1",rb)%></span><!-- 備考 --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-OUTPUT_RSLT_COMMENT">
expj.AD0050010.AD0050010form2.OUTPUT_RSLT_COMMENT = {};
expj.AD0050010.AD0050010form2.OUTPUT_RSLT_COMMENT.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/OUTPUT_RSLT_COMMENT.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.OUTPUT_RSLT_COMMENT.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-OUTPUT_RSLT_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'OUTPUT_RSLT_COMMENT', this);
  });
  expj.AD0050010.AD0050010form2.OUTPUT_RSLT_COMMENT.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.OUTPUT_RSLT_COMMENT.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/OUTPUT_RSLT_COMMENT.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-OUTPUT_RSLT_COMMENT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form2-OUTPUT_RSLT_COMMENT" name="OUTPUT_RSLT_COMMENT" class="AD0050010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getOUTPUT_RSLT_COMMENT()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_LOT_CD",rb)%></span><!-- 在庫ロット番号 --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-LOT_NO">
expj.AD0050010.AD0050010form2.LOT_NO = {};
expj.AD0050010.AD0050010form2.LOT_NO.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/LOT_NO.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.LOT_NO.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'LOT_NO', this);
  });
  expj.AD0050010.AD0050010form2.LOT_NO.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form2-LOT_NO" name="LOT_NO" class="AD0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getLOT_NO()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AD0050010-AD0050010form2-LOT_CTRL_FLG" name="LOT_CTRL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getLOT_CTRL_FLG()) %>">
<script class="expj-script-AD0050010-AD0050010form2-LOT_CTRL_FLG">
expj.AD0050010.AD0050010form2.LOT_CTRL_FLG = {};
expj.AD0050010.AD0050010form2.LOT_CTRL_FLG.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/LOT_CTRL_FLG.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.LOT_CTRL_FLG.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-LOT_CTRL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'LOT_CTRL_FLG', this);
  });
  expj.AD0050010.AD0050010form2.LOT_CTRL_FLG.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.LOT_CTRL_FLG.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/LOT_CTRL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-LOT_CTRL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AD0050010-AD0050010form2-PeekerLotNo">
expj.AD0050010.AD0050010form2.PeekerLotNo = {};
// script1="onClick;0;PEEKER;_AD0050010form2/LOT_NO:_AD0050010form2/ITEM_CD@<%=contextNo%>"
expj.AD0050010.AD0050010form2.PeekerLotNo.onClick0 = function () {
  console.log('PeekerLotNo script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0050010';
var parameterValues = 'PeekerLotNo%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form2', '_AD0050010form2/LOT_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form2', '_AD0050010form2/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%LOT_NO_08%&%';
parameterValues += 'TARGET_FIELD%=%_AD0050010form2/LOT_NO:_AD0050010form2/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0050010.AD0050010form2.PeekerLotNo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0050010.AD0050010form2.PeekerLotNo['onClick' + i])) {
        expj.AD0050010.AD0050010form2.PeekerLotNo['onClick' + i]();
      }
    }
  }
};
expj.AD0050010.AD0050010form2.PeekerLotNo.executeAllOnDecision = function () {
};
expj.AD0050010.AD0050010form2.PeekerLotNo.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-PeekerLotNo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0050010', 'AD0050010form2', 'PeekerLotNo', this, 'Button');
    }
  });
  expj.AD0050010.AD0050010form2.PeekerLotNo.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.PeekerLotNo.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/PeekerLotNo.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-PeekerLotNo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0050010-AD0050010form2-PeekerLotNo" class="AD0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-LotInsert">
expj.AD0050010.AD0050010form2.LotInsert = {};
// script1="onClick;0;CHK;_AD0050010form2/ITEM_CD[eq]@!AD20022"
expj.AD0050010.AD0050010form2.LotInsert.onClick0 = function () {
  console.log('LotInsert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form2', '_AD0050010form2/ITEM_CD'), '[eq]', '')) {
expj.common.pscript.viewErrorMessage('AD0050010', 'AD0050010form2', 'AD20022');
}
};
// script2="onClick;1;CHK;_AD0050010form2/ACPT_QTY[numeq]0@!AD20139"
expj.AD0050010.AD0050010form2.LotInsert.onClick1 = function () {
  console.log('LotInsert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010form2', '_AD0050010form2/ACPT_QTY')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('AD0050010', 'AD0050010form2', 'AD20139');
}
};
// script3="onClick;2;SET;_AD0050010form2/param1=AD0050010form2/ITEM_CD,_AD0050010form2/param2=AD0050010form2/LOT_NO,_AD0050010form2/param3=AD0050010form2/OPR_DATE@*0"
expj.AD0050010.AD0050010form2.LotInsert.onClick2 = function () {
  console.log('LotInsert script3');
expj.common.pscript.setReferenceComponentValue('AD0050010', 'AD0050010form2', '_AD0050010form2/param1', 'AD0050010form2/ITEM_CD');
expj.common.pscript.setReferenceComponentValue('AD0050010', 'AD0050010form2', '_AD0050010form2/param2', 'AD0050010form2/LOT_NO');
expj.common.pscript.setReferenceComponentValue('AD0050010', 'AD0050010form2', '_AD0050010form2/param3', 'AD0050010form2/OPR_DATE');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child0)){this.child0();}}
};
// script4="child;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AD0050010form2/ITEM_CD,_AD0050010form2/OPR_DATE,_AD0050010form2/LOT_NO,_AD0050010form2/param1,_AD0050010form2/param2,_AD0050010form2/param3@AE0200010Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.AD0050010.AD0050010form2.LotInsert.child0 = function () {
  console.log('LotInsert script4');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0050010', 'AD0050010form2', '_AD0050010form2/ITEM_CD,_AD0050010form2/OPR_DATE,_AD0050010form2/LOT_NO,_AD0050010form2/param1,_AD0050010form2/param2,_AD0050010form2/param3', 'AE0200010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AE0200010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AE0200010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'AD0050010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0050010.AD0050010form2.LotInsert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0050010.AD0050010form2.LotInsert['onClick' + i])) {
        expj.AD0050010.AD0050010form2.LotInsert['onClick' + i]();
      }
    }
  }
};
expj.AD0050010.AD0050010form2.LotInsert.executeAllOnDecision = function () {
};
expj.AD0050010.AD0050010form2.LotInsert.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-LotInsert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0050010', 'AD0050010form2', 'LotInsert', this, 'Button');
    }
  });
  expj.AD0050010.AD0050010form2.LotInsert.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.LotInsert.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/LotInsert.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-LotInsert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-AD0050010-AD0050010form2-LotInsert" name="LotInsert" class="AD0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLotInsert",rb)%></button><!-- ロット管理ボタン --></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_LOT_NO_1",rb)%></span><!-- 製造ロット番号 --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-VEND_LOT_NO">
expj.AD0050010.AD0050010form2.VEND_LOT_NO = {};
expj.AD0050010.AD0050010form2.VEND_LOT_NO.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/VEND_LOT_NO.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.VEND_LOT_NO.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-VEND_LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'VEND_LOT_NO', this);
  });
  expj.AD0050010.AD0050010form2.VEND_LOT_NO.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.VEND_LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/VEND_LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-VEND_LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form2-VEND_LOT_NO" name="VEND_LOT_NO" class="AD0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getVEND_LOT_NO()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DEFECT_QTY",rb)%></span><!-- 不良数 --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-DEFECT_QTY">
expj.AD0050010.AD0050010form2.DEFECT_QTY = {};
expj.AD0050010.AD0050010form2.DEFECT_QTY.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/DEFECT_QTY.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.DEFECT_QTY.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-DEFECT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'DEFECT_QTY', this);
  });
  expj.AD0050010.AD0050010form2.DEFECT_QTY.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.DEFECT_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/DEFECT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-DEFECT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form2-DEFECT_QTY" name="DEFECT_QTY" class="AD0050010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAD0050010Struct.geth_UNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getDEFECT_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-d1_STOCK_UNIT">
expj.AD0050010.AD0050010form2.d1_STOCK_UNIT = {};
expj.AD0050010.AD0050010form2.d1_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/d1_STOCK_UNIT.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.d1_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-d1_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'd1_STOCK_UNIT', this);
  });
  expj.AD0050010.AD0050010form2.d1_STOCK_UNIT.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.d1_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/d1_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-d1_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form2-d1_STOCK_UNIT" name="d1_STOCK_UNIT" class="AD0050010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DEFECT_CAUSE_CD",rb)%></span><!-- 不良理由コード --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-DEFECT_CAUSE_CD">
expj.AD0050010.AD0050010form2.DEFECT_CAUSE_CD = {};
expj.AD0050010.AD0050010form2.DEFECT_CAUSE_CD.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/DEFECT_CAUSE_CD.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.DEFECT_CAUSE_CD.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-DEFECT_CAUSE_CD').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AD0050010', 'AD0050010form2', 'DEFECT_CAUSE_CD', this);
  });
  expj.AD0050010.AD0050010form2.DEFECT_CAUSE_CD.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.DEFECT_CAUSE_CD.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/DEFECT_CAUSE_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-DEFECT_CAUSE_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AD0050010-AD0050010form2-DEFECT_CAUSE_CD" name='DEFECT_CAUSE_CD' class='AD0050010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAD0050010Control.getStruct().getList_DEFECT_CAUSE_CD_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAD0050010Control.getStruct().getList_DEFECT_CAUSE_CD_name().get(i));    String val = TypeConverter.sanitizer((String)aAD0050010Control.getStruct().getList_DEFECT_CAUSE_CD_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAD0050010Struct.getDEFECT_CAUSE_CD()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DEFECT_COMMENT",rb)%></span><!-- 不良備考 --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-DEFECT_COMMENT">
expj.AD0050010.AD0050010form2.DEFECT_COMMENT = {};
expj.AD0050010.AD0050010form2.DEFECT_COMMENT.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/DEFECT_COMMENT.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.DEFECT_COMMENT.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-DEFECT_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'DEFECT_COMMENT', this);
  });
  expj.AD0050010.AD0050010form2.DEFECT_COMMENT.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.DEFECT_COMMENT.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/DEFECT_COMMENT.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-DEFECT_COMMENT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form2-DEFECT_COMMENT" name="DEFECT_COMMENT" class="AD0050010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getDEFECT_COMMENT()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OUTPUT_RSLT_PERSON_1",rb)%></span><!-- 作業担当者 --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-OUTPUT_RSLT_PERSON">
expj.AD0050010.AD0050010form2.OUTPUT_RSLT_PERSON = {};
expj.AD0050010.AD0050010form2.OUTPUT_RSLT_PERSON.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/OUTPUT_RSLT_PERSON.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.OUTPUT_RSLT_PERSON.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-OUTPUT_RSLT_PERSON').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'OUTPUT_RSLT_PERSON', this);
  });
  expj.AD0050010.AD0050010form2.OUTPUT_RSLT_PERSON.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.OUTPUT_RSLT_PERSON.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/OUTPUT_RSLT_PERSON.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-OUTPUT_RSLT_PERSON');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form2-OUTPUT_RSLT_PERSON" name="OUTPUT_RSLT_PERSON" class="AD0050010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getOUTPUT_RSLT_PERSON()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0050010-AD0050010form2-param1" name="param1" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getparam1()) %>">
<script class="expj-script-AD0050010-AD0050010form2-param1">
expj.AD0050010.AD0050010form2.param1 = {};
expj.AD0050010.AD0050010form2.param1.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/param1.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.param1.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-param1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'param1', this);
  });
  expj.AD0050010.AD0050010form2.param1.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.param1.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/param1.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-param1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OPR_TIME_UNIT_TYP",rb)%></span><!-- 作業時間単位区分 --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-OPR_TIME_UNIT_TYP">
expj.AD0050010.AD0050010form2.OPR_TIME_UNIT_TYP = {};
expj.AD0050010.AD0050010form2.OPR_TIME_UNIT_TYP.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/OPR_TIME_UNIT_TYP.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.OPR_TIME_UNIT_TYP.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-OPR_TIME_UNIT_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AD0050010', 'AD0050010form2', 'OPR_TIME_UNIT_TYP', this);
  });
  expj.AD0050010.AD0050010form2.OPR_TIME_UNIT_TYP.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.OPR_TIME_UNIT_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/OPR_TIME_UNIT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-OPR_TIME_UNIT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AD0050010-AD0050010form2-OPR_TIME_UNIT_TYP" name='OPR_TIME_UNIT_TYP' class='AD0050010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAD0050010Control.getStruct().getList_OPR_TIME_UNIT_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAD0050010Control.getStruct().getList_OPR_TIME_UNIT_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAD0050010Control.getStruct().getList_OPR_TIME_UNIT_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAD0050010Struct.getOPR_TIME_UNIT_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0050010-AD0050010form2-param2" name="param2" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getparam2()) %>">
<script class="expj-script-AD0050010-AD0050010form2-param2">
expj.AD0050010.AD0050010form2.param2 = {};
expj.AD0050010.AD0050010form2.param2.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/param2.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.param2.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-param2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'param2', this);
  });
  expj.AD0050010.AD0050010form2.param2.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.param2.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/param2.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-param2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PRE_ARRANGEMENT_TIME",rb)%></span><!-- 前段取時間 --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-PRE_ARRANGEMENT_TIME">
expj.AD0050010.AD0050010form2.PRE_ARRANGEMENT_TIME = {};
expj.AD0050010.AD0050010form2.PRE_ARRANGEMENT_TIME.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/PRE_ARRANGEMENT_TIME.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.PRE_ARRANGEMENT_TIME.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-PRE_ARRANGEMENT_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'PRE_ARRANGEMENT_TIME', this);
  });
  expj.AD0050010.AD0050010form2.PRE_ARRANGEMENT_TIME.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.PRE_ARRANGEMENT_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/PRE_ARRANGEMENT_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-PRE_ARRANGEMENT_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form2-PRE_ARRANGEMENT_TIME" name="PRE_ARRANGEMENT_TIME" class="AD0050010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getPRE_ARRANGEMENT_TIME()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OPR_TIME",rb)%></span><!-- 作業時間 --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-OPR_TIME">
expj.AD0050010.AD0050010form2.OPR_TIME = {};
expj.AD0050010.AD0050010form2.OPR_TIME.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/OPR_TIME.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.OPR_TIME.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-OPR_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'OPR_TIME', this);
  });
  expj.AD0050010.AD0050010form2.OPR_TIME.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.OPR_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/OPR_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-OPR_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form2-OPR_TIME" name="OPR_TIME" class="AD0050010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getOPR_TIME()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0050010-AD0050010form2-param3" name="param3" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getparam3()) %>">
<script class="expj-script-AD0050010-AD0050010form2-param3">
expj.AD0050010.AD0050010form2.param3 = {};
expj.AD0050010.AD0050010form2.param3.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/param3.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.param3.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-param3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'param3', this);
  });
  expj.AD0050010.AD0050010form2.param3.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.param3.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/param3.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-param3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.POST_ARRANGEMENT_TIME",rb)%></span><!-- 後段取時間 --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-POST_ARRANGEMENT_TIME">
expj.AD0050010.AD0050010form2.POST_ARRANGEMENT_TIME = {};
expj.AD0050010.AD0050010form2.POST_ARRANGEMENT_TIME.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/POST_ARRANGEMENT_TIME.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.POST_ARRANGEMENT_TIME.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-POST_ARRANGEMENT_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'POST_ARRANGEMENT_TIME', this);
  });
  expj.AD0050010.AD0050010form2.POST_ARRANGEMENT_TIME.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.POST_ARRANGEMENT_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/POST_ARRANGEMENT_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-POST_ARRANGEMENT_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form2-POST_ARRANGEMENT_TIME" name="POST_ARRANGEMENT_TIME" class="AD0050010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getPOST_ARRANGEMENT_TIME()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CESSATION_TIME",rb)%></span><!-- 停止時間 --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-CESSATION_TIME">
expj.AD0050010.AD0050010form2.CESSATION_TIME = {};
expj.AD0050010.AD0050010form2.CESSATION_TIME.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/CESSATION_TIME.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.CESSATION_TIME.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-CESSATION_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'CESSATION_TIME', this);
  });
  expj.AD0050010.AD0050010form2.CESSATION_TIME.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.CESSATION_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/CESSATION_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-CESSATION_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form2-CESSATION_TIME" name="CESSATION_TIME" class="AD0050010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getCESSATION_TIME()) %>" maxlength="2147483647" ></div><!--/td-->
<input type="hidden" id="expj-AD0050010-AD0050010form2-LOT_NUMBERING_TYP" name="LOT_NUMBERING_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getLOT_NUMBERING_TYP()) %>">
<script class="expj-script-AD0050010-AD0050010form2-LOT_NUMBERING_TYP">
expj.AD0050010.AD0050010form2.LOT_NUMBERING_TYP = {};
expj.AD0050010.AD0050010form2.LOT_NUMBERING_TYP.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/LOT_NUMBERING_TYP.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.LOT_NUMBERING_TYP.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-LOT_NUMBERING_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'LOT_NUMBERING_TYP', this);
  });
  expj.AD0050010.AD0050010form2.LOT_NUMBERING_TYP.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.LOT_NUMBERING_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/LOT_NUMBERING_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-LOT_NUMBERING_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CESSATION_CAUSE",rb)%></span><!-- 停止理由 --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010form2-CESSATION_CAUSE">
expj.AD0050010.AD0050010form2.CESSATION_CAUSE = {};
expj.AD0050010.AD0050010form2.CESSATION_CAUSE.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/CESSATION_CAUSE.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.CESSATION_CAUSE.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-CESSATION_CAUSE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'CESSATION_CAUSE', this);
  });
  expj.AD0050010.AD0050010form2.CESSATION_CAUSE.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.CESSATION_CAUSE.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/CESSATION_CAUSE.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-CESSATION_CAUSE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AD0050010-AD0050010form2-CESSATION_CAUSE" name="CESSATION_CAUSE" class="AD0050010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0050010Struct.getCESSATION_CAUSE()) %>" maxlength="80" ></div><!--/td-->
<input type="hidden" id="expj-AD0050010-AD0050010form2-h_UNIT_QTY_TYP" name="h_UNIT_QTY_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0050010Struct.geth_UNIT_QTY_TYP()) %>">
<script class="expj-script-AD0050010-AD0050010form2-h_UNIT_QTY_TYP">
expj.AD0050010.AD0050010form2.h_UNIT_QTY_TYP = {};
expj.AD0050010.AD0050010form2.h_UNIT_QTY_TYP.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/h_UNIT_QTY_TYP.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.h_UNIT_QTY_TYP.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-h_UNIT_QTY_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'h_UNIT_QTY_TYP', this);
  });
  expj.AD0050010.AD0050010form2.h_UNIT_QTY_TYP.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.h_UNIT_QTY_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/h_UNIT_QTY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-h_UNIT_QTY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AD0050010-AD0050010form2-h_BUSINESS_OPR_DATE" name="h_BUSINESS_OPR_DATE" class="" data-kind="OBT_DATE;TYPE_YMD" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0050010Struct.geth_BUSINESS_OPR_DATE()) %>">
<script class="expj-script-AD0050010-AD0050010form2-h_BUSINESS_OPR_DATE">
expj.AD0050010.AD0050010form2.h_BUSINESS_OPR_DATE = {};
expj.AD0050010.AD0050010form2.h_BUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/h_BUSINESS_OPR_DATE.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.h_BUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-h_BUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'h_BUSINESS_OPR_DATE', this);
  });
  expj.AD0050010.AD0050010form2.h_BUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.h_BUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/h_BUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-h_BUSINESS_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AD0050010-AD0050010form2-h_WORK_ODR_CD" name="h_WORK_ODR_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0050010Struct.geth_WORK_ODR_CD()) %>">
<script class="expj-script-AD0050010-AD0050010form2-h_WORK_ODR_CD">
expj.AD0050010.AD0050010form2.h_WORK_ODR_CD = {};
expj.AD0050010.AD0050010form2.h_WORK_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/h_WORK_ODR_CD.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.h_WORK_ODR_CD.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-h_WORK_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'h_WORK_ODR_CD', this);
  });
  expj.AD0050010.AD0050010form2.h_WORK_ODR_CD.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.h_WORK_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/h_WORK_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-h_WORK_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AD0050010-AD0050010form2-h_RSLT_MODIFY_COUNT" name="h_RSLT_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0050010Struct.geth_RSLT_MODIFY_COUNT()) %>">
<script class="expj-script-AD0050010-AD0050010form2-h_RSLT_MODIFY_COUNT">
expj.AD0050010.AD0050010form2.h_RSLT_MODIFY_COUNT = {};
expj.AD0050010.AD0050010form2.h_RSLT_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AD0050010form2/h_RSLT_MODIFY_COUNT.onDecision');
  expj.AD0050010.AD0050010form2.executeAllOnDecision();
  expj.AD0050010.executeAllOnDecision();
};
expj.AD0050010.AD0050010form2.h_RSLT_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010form2-h_RSLT_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0050010', 'AD0050010form2', 'h_RSLT_MODIFY_COUNT', this);
  });
  expj.AD0050010.AD0050010form2.h_RSLT_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AD0050010.AD0050010form2.h_RSLT_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AD0050010form2/h_RSLT_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010form2-h_RSLT_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AD0050010-AD0050010button2">
expj.AD0050010.AD0050010button2 = {};
expj.AD0050010.AD0050010button2.executeAllOnDecision = function () {
  console.log('execute AD0050010button2.onDecision');
};
expj.AD0050010.AD0050010button2.executeOnLoad = function () {
  expj.AD0050010.AD0050010button2.executePScriptOnLoad();
};

expj.AD0050010.AD0050010button2.executePScriptOnLoad = function () {
  console.log('execute AD0050010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0050010-AD0050010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0050010-AD0050010button2-Insert10">
expj.AD0050010.AD0050010button2.Insert10 = {};
// script1="onClick;0;CHK;_AD0050010form1/IN_OUTPUT_RSLT_CD[neq]''@!AD00028"
expj.AD0050010.AD0050010button2.Insert10.onClick0 = function () {
  console.log('Insert10 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form1/IN_OUTPUT_RSLT_CD'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('AD0050010', 'AD0050010button2', 'AD00028');
}
};
// script2="onClick;1;CHK;_AD0050010form2/ACPT_QTY[numeq]0[and]_AD0050010form2/DEFECT_QTY[numeq]0@#AD00083"
expj.AD0050010.AD0050010button2.Insert10.onClick1 = function () {
  console.log('Insert10 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/ACPT_QTY')), '[numeq]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/DEFECT_QTY')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AD0050010', 'AD0050010button2', 'AD00083');
}
};
// script3="onClick;2;CHK;_AD0050010form2/OPR_DATE[gt]_AD0050010form2/h_BUSINESS_OPR_DATE@#AD30773"
expj.AD0050010.AD0050010button2.Insert10.onClick2 = function () {
  console.log('Insert10 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/OPR_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addErrorMessage('AD0050010', 'AD0050010button2', 'AD30773');
}
};
// script4="onClick;3;CHK;_AD0050010form2/OPR_DATE[lt]_AD0050010form2/h_BUSINESS_OPR_DATE@$AD25033"
expj.AD0050010.AD0050010button2.Insert10.onClick3 = function () {
  console.log('Insert10 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/OPR_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('AD0050010', 'AD0050010button2', 'AD25033');
}
};
// script5="onClick;4;CHK;_AD0050010form2/ACPT_QTY[numeq]0@*0"
expj.AD0050010.AD0050010button2.Insert10.onClick4 = function () {
  console.log('Insert10 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/ACPT_QTY')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script6="child;0;CHK;_AD0050010form2/LOT_NO[neq]@#AD20139"
expj.AD0050010.AD0050010button2.Insert10.child0 = function () {
  console.log('Insert10 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/LOT_NO'), '[neq]', '')) {
expj.common.pscript.addErrorMessage('AD0050010', 'AD0050010button2', 'AD20139');
}
};
// script7="onClick;5;CHK;_AD0050010form2/h_UNIT_QTY_TYP[eq]1[and]_AD0050010form2/DEFECT_QTY[lte]0[and]_AD0050010form2/DEFECT_CAUSE_CD[neq]0@#AE05033"
expj.AD0050010.AD0050010button2.Insert10.onClick5 = function () {
  console.log('Insert10 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/h_UNIT_QTY_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/DEFECT_QTY')), '[lte]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/DEFECT_CAUSE_CD'), '[neq]', '0')) {
expj.common.pscript.addErrorMessage('AD0050010', 'AD0050010button2', 'AE05033');
}
};
// script8="onClick;6;CHK;_AD0050010form2/h_UNIT_QTY_TYP[eq]2[and]_AD0050010form2/DEFECT_QTY[lte]0[and]_AD0050010form2/DEFECT_CAUSE_CD[neq]0@#AE05032"
expj.AD0050010.AD0050010button2.Insert10.onClick6 = function () {
  console.log('Insert10 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/h_UNIT_QTY_TYP'), '[eq]', '2') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/DEFECT_QTY')), '[lte]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/DEFECT_CAUSE_CD'), '[neq]', '0')) {
expj.common.pscript.addErrorMessage('AD0050010', 'AD0050010button2', 'AE05032');
}
};
// script9="onClick;7;CHK;_AD0050010form2/DEFECT_QTY[gt]0[and]_AD0050010form2/DEFECT_CAUSE_CD[eq]0@#AE05039"
expj.AD0050010.AD0050010button2.Insert10.onClick7 = function () {
  console.log('Insert10 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/DEFECT_QTY')), '[gt]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/DEFECT_CAUSE_CD'), '[eq]', '0')) {
expj.common.pscript.addErrorMessage('AD0050010', 'AD0050010button2', 'AE05039');
}
};
// script10="onClick;8;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0050010form2/*@AD0050010Servlet,,$ZZ07001"
expj.AD0050010.AD0050010button2.Insert10.onClick8 = function () {
  console.log('Insert10 script10');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0050010', 'AD0050010button2', '_AD0050010form2/*', 'AD0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0050010', response);
expj.common.updateBusinessScreenTab('AD0050010', contents);
};
expj.common.pscript.callConfirm('AD0050010', 'AD0050010button2', 'ZZ07001', okEvent);
};
expj.AD0050010.AD0050010button2.Insert10.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 8; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0050010.AD0050010button2.Insert10['onClick' + i])) {
        expj.AD0050010.AD0050010button2.Insert10['onClick' + i]();
      }
    }
  }
};
expj.AD0050010.AD0050010button2.Insert10.executeAllOnDecision = function () {
};
expj.AD0050010.AD0050010button2.Insert10.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010button2-Insert10').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0050010', 'AD0050010button2', 'Insert10', this, 'Button');
    }
  });
  expj.AD0050010.AD0050010button2.Insert10.executePScriptOnLoad();
};

expj.AD0050010.AD0050010button2.Insert10.executePScriptOnLoad = function () {
  console.log('execute AD0050010button2/Insert10.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010button2-Insert10');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0050010-AD0050010button2-Insert10" name="Insert10" class="AD0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010button2-Update10">
expj.AD0050010.AD0050010button2.Update10 = {};
// script1="onClick;0;CHK;_AD0050010form2/ACPT_QTY[numeq]0[and]_AD0050010form2/DEFECT_QTY[numeq]0@#AD00083"
expj.AD0050010.AD0050010button2.Update10.onClick0 = function () {
  console.log('Update10 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/ACPT_QTY')), '[numeq]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/DEFECT_QTY')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AD0050010', 'AD0050010button2', 'AD00083');
}
};
// script2="onClick;1;CHK;_AD0050010form2/OPR_DATE[gt]_AD0050010form2/h_BUSINESS_OPR_DATE@#AD30773"
expj.AD0050010.AD0050010button2.Update10.onClick1 = function () {
  console.log('Update10 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/OPR_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addErrorMessage('AD0050010', 'AD0050010button2', 'AD30773');
}
};
// script3="onClick;2;CHK;_AD0050010form2/OPR_DATE[lt]_AD0050010form2/h_BUSINESS_OPR_DATE@$AD25033"
expj.AD0050010.AD0050010button2.Update10.onClick2 = function () {
  console.log('Update10 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/OPR_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('AD0050010', 'AD0050010button2', 'AD25033');
}
};
// script4="onClick;3;CHK;_AD0050010form2/h_UNIT_QTY_TYP[eq]1[and]_AD0050010form2/DEFECT_QTY[lte]0[and]_AD0050010form2/DEFECT_CAUSE_CD[neq]0@#AE05033"
expj.AD0050010.AD0050010button2.Update10.onClick3 = function () {
  console.log('Update10 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/h_UNIT_QTY_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/DEFECT_QTY')), '[lte]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/DEFECT_CAUSE_CD'), '[neq]', '0')) {
expj.common.pscript.addErrorMessage('AD0050010', 'AD0050010button2', 'AE05033');
}
};
// script5="onClick;4;CHK;_AD0050010form2/h_UNIT_QTY_TYP[eq]2[and]_AD0050010form2/DEFECT_QTY[lte]0[and]_AD0050010form2/DEFECT_CAUSE_CD[neq]0@#AE05032"
expj.AD0050010.AD0050010button2.Update10.onClick4 = function () {
  console.log('Update10 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/h_UNIT_QTY_TYP'), '[eq]', '2') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/DEFECT_QTY')), '[lte]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/DEFECT_CAUSE_CD'), '[neq]', '0')) {
expj.common.pscript.addErrorMessage('AD0050010', 'AD0050010button2', 'AE05032');
}
};
// script6="onClick;5;CHK;_AD0050010form2/DEFECT_QTY[gt]0[and]_AD0050010form2/DEFECT_CAUSE_CD[eq]0@#AE05039"
expj.AD0050010.AD0050010button2.Update10.onClick5 = function () {
  console.log('Update10 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/DEFECT_QTY')), '[gt]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button2', '_AD0050010form2/DEFECT_CAUSE_CD'), '[eq]', '0')) {
expj.common.pscript.addErrorMessage('AD0050010', 'AD0050010button2', 'AE05039');
}
};
// script7="onClick;6;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0050010form1/*,_AD0050010form2/*@AD0050010Servlet,,$ZZ07003"
expj.AD0050010.AD0050010button2.Update10.onClick6 = function () {
  console.log('Update10 script7');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0050010', 'AD0050010button2', '_AD0050010form1/*,_AD0050010form2/*', 'AD0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0050010', response);
expj.common.updateBusinessScreenTab('AD0050010', contents);
};
expj.common.pscript.callConfirm('AD0050010', 'AD0050010button2', 'ZZ07003', okEvent);
};
expj.AD0050010.AD0050010button2.Update10.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 6; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0050010.AD0050010button2.Update10['onClick' + i])) {
        expj.AD0050010.AD0050010button2.Update10['onClick' + i]();
      }
    }
  }
};
expj.AD0050010.AD0050010button2.Update10.executeAllOnDecision = function () {
};
expj.AD0050010.AD0050010button2.Update10.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010button2-Update10').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0050010', 'AD0050010button2', 'Update10', this, 'Button');
    }
  });
  expj.AD0050010.AD0050010button2.Update10.executePScriptOnLoad();
};

expj.AD0050010.AD0050010button2.Update10.executePScriptOnLoad = function () {
  console.log('execute AD0050010button2/Update10.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010button2-Update10');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0050010-AD0050010button2-Update10" name="Update10" class="AD0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AD0050010-AD0050010view1">
expj.AD0050010.AD0050010view1 = {};
expj.AD0050010.AD0050010view1.executeAllOnClick = function () {
};
expj.AD0050010.AD0050010view1.executeAllOnDecision = function () {
  console.log('execute AD0050010view1.onDecision');
};
expj.AD0050010.AD0050010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AD0050010view1", "expj.AD0050010.AD0050010view1.executeAllOnClick");
%>
  expj.AD0050010.AD0050010view1.executePScriptOnLoad();
};

expj.AD0050010.AD0050010view1.executePScriptOnLoad = function () {
  console.log('execute AD0050010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AD0050010-AD0050010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AD0050010view1_Id = "AD0050010view1";
 String AD0050010view1_select = "single";
 String AD0050010view1_sortable = "true";
 String AD0050010view1_resize = "true";
 String AD0050010view1_scroll = "true";
 StringBuffer AD0050010view1_HB = new StringBuffer();
 StringBuffer AD0050010view1_DB = new StringBuffer();
%>
<%
 AD0050010view1_select = "single";
 AD0050010view1_sortable = "true";
 AD0050010view1_resize = "true";
 AD0050010view1_scroll = "true";
%>
<%
 AD0050010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AD0050010view1_sortable).append("}").append(",");
%>
     
<%
AD0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD_5",rb))).append("', 'name':'ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0050010view1_sortable).append("}").append(",");
AD0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME_2",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0050010view1_sortable).append("}").append(",");
AD0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_LOT_CD",rb))).append("', 'name':'l_LOT_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0050010view1_sortable).append("}").append(",");
AD0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_TYP",rb))).append("', 'name':'ISSUE_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0050010view1_sortable).append("}").append(",");
AD0050010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0320",rb))).append("', 'name':'TEMP_PLAN_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AD0050010view1_sortable).append("}").append(",");
AD0050010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0321",rb))).append("', 'name':'TEMP_USEOVER_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AD0050010view1_sortable).append("}").append(",");
AD0050010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0322",rb))).append("', 'name':'TEMP_PLANOUT_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AD0050010view1_sortable).append("}").append(",");
AD0050010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0323",rb))).append("', 'name':'TEMP_USE_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AD0050010view1_sortable).append("}").append(",");
AD0050010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_UNIT_NUMERATOR_2",rb))).append("', 'name':'ISSUE_INST_UNIT_NUMERATOR', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AD0050010view1_sortable).append("}").append(",");
AD0050010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_UNIT_DENOMINATOR_2",rb))).append("', 'name':'ISSUE_INST_UNIT_DENOMINATOR', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AD0050010view1_sortable).append("}").append(",");
AD0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_ISSUE_INST_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0050010view1_sortable).append("}").append(",");
AD0050010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_UNIT_QTY_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0050010view1_sortable).append("}").append(",");
%>
<%
 int aAD0050010StructLength = aAD0050010Control.getListsize();
 final AD0050010Struct structBackup = aAD0050010Struct;
 aAD0050010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAD0050010StructLength; ++loopCount) {
  if((aAD0050010Struct = (AD0050010Struct) aAD0050010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAD0050010Struct", aAD0050010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AD0050010view1_DB.append("[");
 AD0050010view1_DB.append(loopCount);
 AD0050010view1_DB.append(",").append("'<span id=\"expj-AD0050010-AD0050010view1-ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0050010-AD0050010view1-ITEM_CD\" data-name=\"ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0050010Struct.getITEM_CD())).append("</span>'");
 AD0050010view1_DB.append(",").append("'<span id=\"expj-AD0050010-AD0050010view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AD0050010-AD0050010view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0050010Struct.getITEM_NAME())).append("</span>'");
 AD0050010view1_DB.append(",").append("'<span id=\"expj-AD0050010-AD0050010view1-l_LOT_NO-").append(loopCount).append("\" class=\"expj-label expj-AD0050010-AD0050010view1-l_LOT_NO\" data-name=\"l_LOT_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0050010Struct.getl_LOT_NO())).append("</span>'");
 AD0050010view1_DB.append(",").append("'<span id=\"expj-AD0050010-AD0050010view1-ISSUE_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AD0050010-AD0050010view1-ISSUE_TYP_DN\" data-name=\"ISSUE_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0050010Struct.getISSUE_TYP_DN())).append("</span>'");
 AD0050010view1_DB.append(",").append("'<span id=\"expj-AD0050010-AD0050010view1-TEMP_PLAN_QTY-").append(loopCount).append("\" class=\"expj-label expj-AD0050010-AD0050010view1-TEMP_PLAN_QTY\" data-name=\"TEMP_PLAN_QTY\" data-view=\"true\" data-kind=\"").append(Kind.convertNumeric(aAD0050010Struct.getl_UNIT_QTY_TYP(), Kind.N, 14, 1, Kind.FLOOR, 4)).append("\">").append(TypeConverter.sanitizer(aAD0050010Struct.getTEMP_PLAN_QTY())).append("</span>'");
 AD0050010view1_DB.append(",").append("'<span id=\"expj-AD0050010-AD0050010view1-TEMP_USEOVER_QTY-").append(loopCount).append("\" class=\"expj-label expj-AD0050010-AD0050010view1-TEMP_USEOVER_QTY\" data-name=\"TEMP_USEOVER_QTY\" data-view=\"true\" data-kind=\"").append(Kind.convertNumeric(aAD0050010Struct.getl_UNIT_QTY_TYP(), Kind.N, 14, 1, Kind.FLOOR, 4)).append("\">").append(TypeConverter.sanitizer(aAD0050010Struct.getTEMP_USEOVER_QTY())).append("</span>'");
 AD0050010view1_DB.append(",").append("'<span id=\"expj-AD0050010-AD0050010view1-TEMP_PLANOUT_QTY-").append(loopCount).append("\" class=\"expj-label expj-AD0050010-AD0050010view1-TEMP_PLANOUT_QTY\" data-name=\"TEMP_PLANOUT_QTY\" data-view=\"true\" data-kind=\"").append(Kind.convertNumeric(aAD0050010Struct.getl_UNIT_QTY_TYP(), Kind.N, 14, 1, Kind.FLOOR, 4)).append("\">").append(TypeConverter.sanitizer(aAD0050010Struct.getTEMP_PLANOUT_QTY())).append("</span>'");
 AD0050010view1_DB.append(",").append("'<span id=\"expj-AD0050010-AD0050010view1-TEMP_USE_QTY-").append(loopCount).append("\" class=\"expj-label expj-AD0050010-AD0050010view1-TEMP_USE_QTY\" data-name=\"TEMP_USE_QTY\" data-view=\"true\" data-kind=\"").append(Kind.convertNumeric(aAD0050010Struct.getl_UNIT_QTY_TYP(), Kind.N, 14, 1, Kind.FLOOR, 4)).append("\">").append(TypeConverter.sanitizer(aAD0050010Struct.getTEMP_USE_QTY())).append("</span>'");
 AD0050010view1_DB.append(",").append("'<span id=\"expj-AD0050010-AD0050010view1-ISSUE_INST_UNIT_NUMERATOR-").append(loopCount).append("\" class=\"expj-label expj-AD0050010-AD0050010view1-ISSUE_INST_UNIT_NUMERATOR\" data-name=\"ISSUE_INST_UNIT_NUMERATOR\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAD0050010Struct.getISSUE_INST_UNIT_NUMERATOR())).append("</span>'");
 AD0050010view1_DB.append(",").append("'<span id=\"expj-AD0050010-AD0050010view1-ISSUE_INST_UNIT_DENOMINATOR-").append(loopCount).append("\" class=\"expj-label expj-AD0050010-AD0050010view1-ISSUE_INST_UNIT_DENOMINATOR\" data-name=\"ISSUE_INST_UNIT_DENOMINATOR\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAD0050010Struct.getISSUE_INST_UNIT_DENOMINATOR())).append("</span>'");
 AD0050010view1_DB.append(",").append("'<span id=\"expj-AD0050010-AD0050010view1-h_ISSUE_INST_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0050010-AD0050010view1-h_ISSUE_INST_CD\" data-name=\"h_ISSUE_INST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0050010Struct.geth_ISSUE_INST_CD())).append("</span>'");
 AD0050010view1_DB.append(",").append("'<span id=\"expj-AD0050010-AD0050010view1-l_UNIT_QTY_TYP-").append(loopCount).append("\" class=\"expj-label expj-AD0050010-AD0050010view1-l_UNIT_QTY_TYP\" data-name=\"l_UNIT_QTY_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0050010Struct.getl_UNIT_QTY_TYP())).append("</span>'");
 AD0050010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAD0050010StructLength) {
   AD0050010view1_DB.append(",");
  }
 }
 aAD0050010Struct = structBackup;
 viewIdList.add(AD0050010view1_Id);
 viewSelectList.add(AD0050010view1_select);
 viewResizeList.add(AD0050010view1_resize);
 viewScrollList.add(AD0050010view1_scroll);
 viewHeaderDataList.add(AD0050010view1_HB);
 viewBodyDataList.add(AD0050010view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-AD0050010-AD0050010button3">
expj.AD0050010.AD0050010button3 = {};
expj.AD0050010.AD0050010button3.executeAllOnDecision = function () {
  console.log('execute AD0050010button3.onDecision');
};
expj.AD0050010.AD0050010button3.executeOnLoad = function () {
  expj.AD0050010.AD0050010button3.executePScriptOnLoad();
};

expj.AD0050010.AD0050010button3.executePScriptOnLoad = function () {
  console.log('execute AD0050010button3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0050010-AD0050010button3" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0050010-AD0050010button3-UpdateAll">
expj.AD0050010.AD0050010button3.UpdateAll = {};
// script1="onClick;0;CHK;?AD0050010form1/*[neq]TOO_MANY[and]?AD0050010view1/$[lte]0@!AD00089"
expj.AD0050010.AD0050010button3.UpdateAll.onClick0 = function () {
  console.log('UpdateAll script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button3', '?AD0050010form1/*'), '[neq]', 'TOO_MANY') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0050010', 'AD0050010button3', '?AD0050010view1/$')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('AD0050010', 'AD0050010button3', 'AD00089');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0050010form1/*,_AD0050010form2/*@AD0050010Servlet,,$ZZ07003"
expj.AD0050010.AD0050010button3.UpdateAll.onClick1 = function () {
  console.log('UpdateAll script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0050010', 'AD0050010button3', '_AD0050010form1/*,_AD0050010form2/*', 'AD0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0050010', response);
expj.common.updateBusinessScreenTab('AD0050010', contents);
};
expj.common.pscript.callConfirm('AD0050010', 'AD0050010button3', 'ZZ07003', okEvent);
};
expj.AD0050010.AD0050010button3.UpdateAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0050010.AD0050010button3.UpdateAll['onClick' + i])) {
        expj.AD0050010.AD0050010button3.UpdateAll['onClick' + i]();
      }
    }
  }
};
expj.AD0050010.AD0050010button3.UpdateAll.executeAllOnDecision = function () {
};
expj.AD0050010.AD0050010button3.UpdateAll.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010button3-UpdateAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0050010', 'AD0050010button3', 'UpdateAll', this, 'Button');
    }
  });
  expj.AD0050010.AD0050010button3.UpdateAll.executePScriptOnLoad();
};

expj.AD0050010.AD0050010button3.UpdateAll.executePScriptOnLoad = function () {
  console.log('execute AD0050010button3/UpdateAll.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010button3-UpdateAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0050010-AD0050010button3-UpdateAll" name="UpdateAll" class="AD0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdateAll",rb)%></button><!-- 一括更新ボタン --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010button3-NoUserParts">
expj.AD0050010.AD0050010button3.NoUserParts = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0050010form1/*,_AD0050010form2/*,_AD0050010view1/+@AD0050010Servlet"
expj.AD0050010.AD0050010button3.NoUserParts.onClick0 = function () {
  console.log('NoUserParts script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0050010', 'AD0050010button3', '_AD0050010form1/*,_AD0050010form2/*,_AD0050010view1/+', 'AD0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0050010', response);
expj.common.changeBusinessScreenTab('AD0050010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0050010.AD0050010button3.NoUserParts.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0050010.AD0050010button3.NoUserParts['onClick' + i])) {
        expj.AD0050010.AD0050010button3.NoUserParts['onClick' + i]();
      }
    }
  }
};
expj.AD0050010.AD0050010button3.NoUserParts.executeAllOnDecision = function () {
};
expj.AD0050010.AD0050010button3.NoUserParts.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010button3-NoUserParts').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0050010', 'AD0050010button3', 'NoUserParts', this, 'Button');
    }
  });
  expj.AD0050010.AD0050010button3.NoUserParts.executePScriptOnLoad();
};

expj.AD0050010.AD0050010button3.NoUserParts.executePScriptOnLoad = function () {
  console.log('execute AD0050010button3/NoUserParts.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010button3-NoUserParts');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0050010-AD0050010button3-NoUserParts" name="NoUserParts" class="AD0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnNumRegistration",rb)%></button><!-- 調整数登録ボタン --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010button3-UseParts">
expj.AD0050010.AD0050010button3.UseParts = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0050010form1/*,_AD0050010form2/*@AD0050010Servlet"
expj.AD0050010.AD0050010button3.UseParts.onClick0 = function () {
  console.log('UseParts script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0050010', 'AD0050010button3', '_AD0050010form1/*,_AD0050010form2/*', 'AD0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0050010', response);
expj.common.changeBusinessScreenTab('AD0050010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0050010.AD0050010button3.UseParts.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0050010.AD0050010button3.UseParts['onClick' + i])) {
        expj.AD0050010.AD0050010button3.UseParts['onClick' + i]();
      }
    }
  }
};
expj.AD0050010.AD0050010button3.UseParts.executeAllOnDecision = function () {
};
expj.AD0050010.AD0050010button3.UseParts.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010button3-UseParts').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0050010', 'AD0050010button3', 'UseParts', this, 'Button');
    }
  });
  expj.AD0050010.AD0050010button3.UseParts.executePScriptOnLoad();
};

expj.AD0050010.AD0050010button3.UseParts.executePScriptOnLoad = function () {
  console.log('execute AD0050010button3/UseParts.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010button3-UseParts');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0050010-AD0050010button3-UseParts" name="UseParts" class="AD0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUseParts",rb)%></button><!-- 子部品追加登録ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 200px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AD0050010 Revision: 1.7  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AD0050010-AD0050010button0">
expj.AD0050010.AD0050010button0 = {};
expj.AD0050010.AD0050010button0.executeAllOnDecision = function () {
  console.log('execute AD0050010button0.onDecision');
};
expj.AD0050010.AD0050010button0.executeOnLoad = function () {
  expj.AD0050010.AD0050010button0.executePScriptOnLoad();
};

expj.AD0050010.AD0050010button0.executePScriptOnLoad = function () {
  console.log('execute AD0050010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0050010-AD0050010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0050010-AD0050010button0-Clear">
expj.AD0050010.AD0050010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0050010form1/*@AD0050010Servlet,,$ZZ07008"
expj.AD0050010.AD0050010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0050010', 'AD0050010button0', '_AD0050010form1/*', 'AD0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0050010', response);
expj.common.updateBusinessScreenTab('AD0050010', contents);
};
expj.common.pscript.callConfirm('AD0050010', 'AD0050010button0', 'ZZ07008', okEvent);
};
expj.AD0050010.AD0050010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0050010.AD0050010button0.Clear['onClick' + i])) {
        expj.AD0050010.AD0050010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AD0050010.AD0050010button0.Clear.executeAllOnDecision = function () {
};
expj.AD0050010.AD0050010button0.Clear.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0050010', 'AD0050010button0', 'Clear', this, 'Button');
    }
  });
  expj.AD0050010.AD0050010button0.Clear.executePScriptOnLoad();
};

expj.AD0050010.AD0050010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AD0050010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0050010-AD0050010button0-Clear" name="Clear" class="AD0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AD0050010-AD0050010button0-Close">
expj.AD0050010.AD0050010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AD0050010.AD0050010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AD0050010');
};
expj.AD0050010.AD0050010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0050010.AD0050010button0.Close['onClick' + i])) {
        expj.AD0050010.AD0050010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AD0050010.AD0050010button0.Close.executeAllOnDecision = function () {
};
expj.AD0050010.AD0050010button0.Close.executeOnLoad = function () {
  $('#expj-AD0050010-AD0050010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0050010', 'AD0050010button0', 'Close', this, 'Button');
    }
  });
  expj.AD0050010.AD0050010button0.Close.executePScriptOnLoad();
};

expj.AD0050010.AD0050010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AD0050010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AD0050010-AD0050010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0050010-AD0050010button0-Close" name="Close" class="AD0050010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AD0050010 (END)-->
<%
MessageStruct msgStruct = aAD0050010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AD0050010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AD0050010)) {
  expj.common.treeInstanceMap.AD0050010 = {};
}
expj.common.treeInstanceMap.AD0050010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0050010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AD0050010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0050010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AD0050010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AD0050010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AD0050010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AD0050010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AD0050010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AD0050010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AD0050010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0050010)) {
  expj.common.detailDialogMap.AD0050010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0050010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AD0050010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0050010.<%=detailId %>)) {
  expj.common.detailDialogMap.AD0050010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0050010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AD0050010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0050010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AD0050010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AD0050010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AD0050010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AD0050010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AD0050010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AD0050010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AD0050010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AD0050010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AD0050010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AD0050010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AD0050010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AD0050010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AD0050010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AD0050010)) {
  expj.common.viewInstanceMap.AD0050010 = {};
}
expj.common.viewInstanceMap.AD0050010.<%=viewId %> = {};
expj.common.viewInstanceMap.AD0050010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AD0050010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AD0050010.<%=viewId %>.init = function () {
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
    expj.AD0050010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AD0050010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AD0050010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AD0050010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AD0050010_init">
/**
 * AD0050010用のロード完了時初期化関数
 */
expj.AD0050010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AD0050010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AD0050010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AD0050010');
  expj.common.calendarInstanceMap.AD0050010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AD0050010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AD0050010.<%=detailId %>.init();
  expj.common.detailDialogMap.AD0050010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AD0050010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AD0050010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AD0050010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AD0050010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AD0050010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AD0050010-<%=detailId %>');
<%
 }
%>
  try{expj.AD0050010.AD0050010form1.IN_OUTPUT_RSLT_CD.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form1.PeekerOutputRsltCd.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form1.h_SYS_LOT_CTRL_FLG.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.DRAW_CD.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.SPEC.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.WS_CD.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.PeekerWsCd.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.WS_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.ACPT_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.CalendarOprDate.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.h_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.WH_CD.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.PeekerWhCd.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.OUTPUT_RSLT_COMMENT.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.LOT_CTRL_FLG.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.PeekerLotNo.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.LotInsert.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.VEND_LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.DEFECT_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.d1_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.DEFECT_CAUSE_CD.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.DEFECT_COMMENT.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.OUTPUT_RSLT_PERSON.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.param1.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.OPR_TIME_UNIT_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.param2.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.PRE_ARRANGEMENT_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.OPR_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.param3.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.POST_ARRANGEMENT_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.CESSATION_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.LOT_NUMBERING_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.CESSATION_CAUSE.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.h_UNIT_QTY_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.h_BUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.h_WORK_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.h_RSLT_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010button2.Insert10.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010button2.Update10.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010button3.UpdateAll.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010button3.NoUserParts.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010button3.UseParts.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form1.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010button1.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010form2.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010button2.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010view1.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010button3.executeOnLoad();}catch(e){};
  try{expj.AD0050010.AD0050010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AD0050010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AD0050010', 'AD0050010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AD0050010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AD0050010-focus-move');
  // 初期フォーカス当てる処理
  $('.AD0050010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AD0050010', '<%=request.getContextPath() %>');
};

/**
 * AD0050010の全体onDecision処理
 */
expj.AD0050010.executeAllOnDecision = function () {
  expj.AD0050010.AD0050010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AD0050010_console">
expj.AD0050010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>