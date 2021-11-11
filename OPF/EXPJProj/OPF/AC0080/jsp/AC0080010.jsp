<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:28:07 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AC0080\AC0080010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AC0080.*" %>
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
<jsp:useBean id="aAC0080010Control" class="com.nec.jp.orteus.metamorBase.AC0080.AC0080010Control" scope="request"/>
<jsp:useBean id="aAC0080010Struct" class="com.nec.jp.orteus.metamorBase.AC0080.AC0080010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

外部計画一覧
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0080/jsp/AC0080010.jsp,v $
$Author: geng-jia $	
$Revision: 1.13 $ $Date: 2017/02/22 02:04:28 $
********************************************************* --%>
<html>
<head>
<title>外部計画一覧</title>
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
<script class="expj-script-AC0080010_init">
  // AC0080010名前空間
  expj.AC0080010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AC0080010" data-screen="AC0080010" data-newdata="<%=aAC0080010Control.isNewData() %>">
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
              <script class="expj-script-AC0080010-AC0080010form1">
expj.AC0080010.AC0080010form1 = {};
// script1="onLoad;0;CALL;child@0,2,5,15"
expj.AC0080010.AC0080010form1.onLoad0 = function () {
  console.log('AC0080010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child2)){this.child2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child5)){this.child5();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child15)){this.child15();}
};
// script2="onLoad;1;CALL;onDecision@2,3"
expj.AC0080010.AC0080010form1.onLoad1 = function () {
  console.log('AC0080010form1 script2');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script3="child;0;CHK;_AC0080010form1/w_OD_TYP[eq]2@*1"
expj.AC0080010.AC0080010form1.child0 = function () {
  console.log('AC0080010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010form1', '_AC0080010form1/w_OD_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="child;1;MASK;_AC0080010form1/c_UN_CONNECT_DEMAND"
expj.AC0080010.AC0080010form1.child1 = function () {
  console.log('AC0080010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AC0080010', 'AC0080010form1', '_AC0080010form1/c_UN_CONNECT_DEMAND');
};
// script5="child;2;CHK;?AC0080010form1/*[eq]NORMAL@*3,*4"
expj.AC0080010.AC0080010form1.child2 = function () {
  console.log('AC0080010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010form1', '?AC0080010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;3;UNMASK;_AC0080010button2/choiceAll,_AC0080010button2/cancelAll"
expj.AC0080010.AC0080010form1.child3 = function () {
  console.log('AC0080010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AC0080010', 'AC0080010form1', '_AC0080010button2/choiceAll');
expj.common.pscript.setUnMaskToReferenceComponent('AC0080010', 'AC0080010form1', '_AC0080010button2/cancelAll');
};
// script7="child;4;MASK;_AC0080010button2/choiceAll,_AC0080010button2/cancelAll"
expj.AC0080010.AC0080010form1.child4 = function () {
  console.log('AC0080010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AC0080010', 'AC0080010form1', '_AC0080010button2/choiceAll');
expj.common.pscript.setMaskToReferenceComponent('AC0080010', 'AC0080010form1', '_AC0080010button2/cancelAll');
};
// script8="onDecision;0;CHK;1[eq]1@*5"
expj.AC0080010.AC0080010form1.onDecision0 = function () {
  console.log('AC0080010form1 script8');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script9="child;5;CHKRQ;A@*6,*14"
expj.AC0080010.AC0080010form1.child5 = function () {
  console.log('AC0080010form1 script9');
if (expj.common.pscript.satisfiedRequiredComponent('AC0080010', 'A')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script10="child;6;CHK;?AC0080010form1/*[eq]NORMAL@*7,*14"
expj.AC0080010.AC0080010form1.child6 = function () {
  console.log('AC0080010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010form1', '?AC0080010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script11="child;7;CHK;?AC0080010form1/w_PLANT_CD[eq]SAME@*8,*14"
expj.AC0080010.AC0080010form1.child7 = function () {
  console.log('AC0080010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010form1', '?AC0080010form1/w_PLANT_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script12="child;8;CHK;?AC0080010form1/w_ITEM_CD[eq]SAME@*9,*14"
expj.AC0080010.AC0080010form1.child8 = function () {
  console.log('AC0080010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010form1', '?AC0080010form1/w_ITEM_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script13="child;9;CHK;?AC0080010form1/w_DATE_FROM[eq]SAME@*10,*14"
expj.AC0080010.AC0080010form1.child9 = function () {
  console.log('AC0080010form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010form1', '?AC0080010form1/w_DATE_FROM'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script14="child;10;CHK;?AC0080010form1/w_DATE_TO[eq]SAME@*11,*14"
expj.AC0080010.AC0080010form1.child10 = function () {
  console.log('AC0080010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010form1', '?AC0080010form1/w_DATE_TO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script15="child;11;CHK;?AC0080010form1/w_OD_TYP[eq]SAME@*12,*14"
expj.AC0080010.AC0080010form1.child11 = function () {
  console.log('AC0080010form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010form1', '?AC0080010form1/w_OD_TYP'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script16="child;12;CHK;?AC0080010form1/c_UN_CONNECT_DEMAND[eq]SAME@*13,*14"
expj.AC0080010.AC0080010form1.child12 = function () {
  console.log('AC0080010form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010form1', '?AC0080010form1/c_UN_CONNECT_DEMAND'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script17="child;13;UNMASK;_AC0080010button0/csv"
expj.AC0080010.AC0080010form1.child13 = function () {
  console.log('AC0080010form1 script17');
expj.common.pscript.setUnMaskToReferenceComponent('AC0080010', 'AC0080010form1', '_AC0080010button0/csv');
};
// script18="child;14;MASK;_AC0080010button0/csv"
expj.AC0080010.AC0080010form1.child14 = function () {
  console.log('AC0080010form1 script18');
expj.common.pscript.setMaskToReferenceComponent('AC0080010', 'AC0080010form1', '_AC0080010button0/csv');
};
// script19="onDecision;1;CHK;1[eq]1@*15"
expj.AC0080010.AC0080010form1.onDecision1 = function () {
  console.log('AC0080010form1 script19');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script20="child;15;CHK;?AC0080010form1/*[eq]NORMAL@*16,*22"
expj.AC0080010.AC0080010form1.child15 = function () {
  console.log('AC0080010form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010form1', '?AC0080010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
} else {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script21="child;16;CHK;?AC0080010form1/w_PLANT_CD[eq]SAME@*17,*22"
expj.AC0080010.AC0080010form1.child16 = function () {
  console.log('AC0080010form1 script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010form1', '?AC0080010form1/w_PLANT_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
} else {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script22="child;17;CHK;?AC0080010form1/w_ITEM_CD[eq]SAME@*18,*22"
expj.AC0080010.AC0080010form1.child17 = function () {
  console.log('AC0080010form1 script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010form1', '?AC0080010form1/w_ITEM_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
} else {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script23="child;18;CHK;?AC0080010form1/w_DATE_FROM[eq]SAME@*19,*22"
expj.AC0080010.AC0080010form1.child18 = function () {
  console.log('AC0080010form1 script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010form1', '?AC0080010form1/w_DATE_FROM'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
} else {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script24="child;19;CHK;?AC0080010form1/w_DATE_TO[eq]SAME@*20,*22"
expj.AC0080010.AC0080010form1.child19 = function () {
  console.log('AC0080010form1 script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010form1', '?AC0080010form1/w_DATE_TO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
} else {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script25="child;20;CHK;?AC0080010form1/w_OD_TYP[eq]SAME@*21,*22"
expj.AC0080010.AC0080010form1.child20 = function () {
  console.log('AC0080010form1 script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010form1', '?AC0080010form1/w_OD_TYP'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
} else {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script26="child;21;CHK;?AC0080010form1/c_UN_CONNECT_DEMAND[eq]SAME@*23,*22"
expj.AC0080010.AC0080010form1.child21 = function () {
  console.log('AC0080010form1 script26');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010form1', '?AC0080010form1/c_UN_CONNECT_DEMAND'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
} else {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script27="child;22;MASK;_AC0080010button2/delete"
expj.AC0080010.AC0080010form1.child22 = function () {
  console.log('AC0080010form1 script27');
expj.common.pscript.setMaskToReferenceComponent('AC0080010', 'AC0080010form1', '_AC0080010button2/delete');
};
// script28="child;23;CHKRQ;?AC0080010view1/?[eq]SINGLE@*24,*25"
expj.AC0080010.AC0080010form1.child23 = function () {
  console.log('AC0080010form1 script28');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010form1', '?AC0080010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
} else {
if(expj.common.checkNameSpace(this.child25)){this.child25();}
}
};
// script29="child;24;UNMASK;_AC0080010button2/delete"
expj.AC0080010.AC0080010form1.child24 = function () {
  console.log('AC0080010form1 script29');
expj.common.pscript.setUnMaskToReferenceComponent('AC0080010', 'AC0080010form1', '_AC0080010button2/delete');
};
// script30="child;25;CHKRQ;?AC0080010view1/?[eq]MULTI@*26,*27"
expj.AC0080010.AC0080010form1.child25 = function () {
  console.log('AC0080010form1 script30');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010form1', '?AC0080010view1/?'), '[eq]', 'MULTI'))) {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
} else {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
}
};
// script31="child;26;UNMASK;_AC0080010button2/delete"
expj.AC0080010.AC0080010form1.child26 = function () {
  console.log('AC0080010form1 script31');
expj.common.pscript.setUnMaskToReferenceComponent('AC0080010', 'AC0080010form1', '_AC0080010button2/delete');
};
// script32="child;27;MASK;_AC0080010button2/delete"
expj.AC0080010.AC0080010form1.child27 = function () {
  console.log('AC0080010form1 script32');
expj.common.pscript.setMaskToReferenceComponent('AC0080010', 'AC0080010form1', '_AC0080010button2/delete');
};
// script33="onDecision;2;CHKRQ;A@*28,*29"
expj.AC0080010.AC0080010form1.onDecision2 = function () {
  console.log('AC0080010form1 script33');
if (expj.common.pscript.satisfiedRequiredComponent('AC0080010', 'A')) {
if(expj.common.checkNameSpace(this.child28)){this.child28();}
} else {
if(expj.common.checkNameSpace(this.child29)){this.child29();}
}
};
// script34="child;28;UNMASK;_AC0080010button1/select"
expj.AC0080010.AC0080010form1.child28 = function () {
  console.log('AC0080010form1 script34');
expj.common.pscript.setUnMaskToReferenceComponent('AC0080010', 'AC0080010form1', '_AC0080010button1/select');
};
// script35="child;29;MASK;_AC0080010button1/select"
expj.AC0080010.AC0080010form1.child29 = function () {
  console.log('AC0080010form1 script35');
expj.common.pscript.setMaskToReferenceComponent('AC0080010', 'AC0080010form1', '_AC0080010button1/select');
};
// script36="onDecision;3;CHK;_AC0080010form1/TIME_CTRL[eq]true@*30,*31"
expj.AC0080010.AC0080010form1.onDecision3 = function () {
  console.log('AC0080010form1 script36');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010form1', '_AC0080010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child30)){this.child30();}
} else {
if(expj.common.checkNameSpace(this.child31)){this.child31();}
}
};
// script37="child;30;UNMASK;_AC0080010form1/w_TIME_FROM,_AC0080010form1/w_TIME_TO"
expj.AC0080010.AC0080010form1.child30 = function () {
  console.log('AC0080010form1 script37');
expj.common.pscript.setUnMaskToReferenceComponent('AC0080010', 'AC0080010form1', '_AC0080010form1/w_TIME_FROM');
expj.common.pscript.setUnMaskToReferenceComponent('AC0080010', 'AC0080010form1', '_AC0080010form1/w_TIME_TO');
};
// script38="child;31;MASK;_AC0080010form1/w_TIME_FROM,_AC0080010form1/w_TIME_TO"
expj.AC0080010.AC0080010form1.child31 = function () {
  console.log('AC0080010form1 script38');
expj.common.pscript.setMaskToReferenceComponent('AC0080010', 'AC0080010form1', '_AC0080010form1/w_TIME_FROM');
expj.common.pscript.setMaskToReferenceComponent('AC0080010', 'AC0080010form1', '_AC0080010form1/w_TIME_TO');
};
expj.AC0080010.AC0080010form1.executeAllOnDecision = function () {
  console.log('execute AC0080010form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0080010.AC0080010form1['onDecision' + i])) {
        expj.AC0080010.AC0080010form1['onDecision' + i]();
      }
    }
  }
};
expj.AC0080010.AC0080010form1.executeOnLoad = function () {
  expj.AC0080010.AC0080010form1.executePScriptOnLoad();
};

expj.AC0080010.AC0080010form1.executePScriptOnLoad = function () {
  console.log('execute AC0080010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AC0080010.AC0080010form1['onLoad' + i])) {
      expj.AC0080010.AC0080010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AC0080010-AC0080010form1" action="AC0080010Servlet" name="AC0080010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAC0080010Control.getReadStatusString()) %>" style="height:96px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:96px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ISSUE_PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AC0080010-AC0080010form1-w_PLANT_CD">
expj.AC0080010.AC0080010form1.w_PLANT_CD = {};
expj.AC0080010.AC0080010form1.w_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AC0080010form1/w_PLANT_CD.onDecision');
  expj.AC0080010.AC0080010form1.executeAllOnDecision();
  expj.AC0080010.executeAllOnDecision();
};
expj.AC0080010.AC0080010form1.w_PLANT_CD.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010form1-w_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0080010', 'AC0080010form1', 'w_PLANT_CD', this);
  });
  expj.AC0080010.AC0080010form1.w_PLANT_CD.executePScriptOnLoad();
};

expj.AC0080010.AC0080010form1.w_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AC0080010form1/w_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010form1-w_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0080010-AC0080010form1-w_PLANT_CD" name="w_PLANT_CD" class="AC0080010-focus-move  required-value expj-AC0080010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0080010Struct.getw_PLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AC0080010-AC0080010form1-PeekerPlantCd">
expj.AC0080010.AC0080010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AC0080010form1/w_PLANT_CD@<%=contextNo%>"
expj.AC0080010.AC0080010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0080010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010form1', '_AC0080010form1/w_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AC0080010form1/w_PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0080010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0080010.AC0080010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0080010.AC0080010form1.PeekerPlantCd['onClick' + i])) {
        expj.AC0080010.AC0080010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AC0080010.AC0080010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AC0080010.AC0080010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0080010', 'AC0080010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AC0080010.AC0080010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.AC0080010.AC0080010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AC0080010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0080010-AC0080010form1-PeekerPlantCd" class="AC0080010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AC0080010-AC0080010form1-PLANT_NAME">
expj.AC0080010.AC0080010form1.PLANT_NAME = {};
expj.AC0080010.AC0080010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AC0080010form1/PLANT_NAME.onDecision');
  expj.AC0080010.AC0080010form1.executeAllOnDecision();
  expj.AC0080010.executeAllOnDecision();
};
expj.AC0080010.AC0080010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0080010', 'AC0080010form1', 'PLANT_NAME', this);
  });
  expj.AC0080010.AC0080010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.AC0080010.AC0080010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AC0080010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AC0080010-AC0080010form1-PLANT_NAME" name="PLANT_NAME" class="AC0080010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0080010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AC0080010-AC0080010form1-h_ODR_DMD_TYP" name="h_ODR_DMD_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0080010Struct.geth_ODR_DMD_TYP()) %>">
<script class="expj-script-AC0080010-AC0080010form1-h_ODR_DMD_TYP">
expj.AC0080010.AC0080010form1.h_ODR_DMD_TYP = {};
expj.AC0080010.AC0080010form1.h_ODR_DMD_TYP.executeAllOnDecision = function () {
  console.log('execute AC0080010form1/h_ODR_DMD_TYP.onDecision');
  expj.AC0080010.AC0080010form1.executeAllOnDecision();
  expj.AC0080010.executeAllOnDecision();
};
expj.AC0080010.AC0080010form1.h_ODR_DMD_TYP.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010form1-h_ODR_DMD_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0080010', 'AC0080010form1', 'h_ODR_DMD_TYP', this);
  });
  expj.AC0080010.AC0080010form1.h_ODR_DMD_TYP.executePScriptOnLoad();
};

expj.AC0080010.AC0080010form1.h_ODR_DMD_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0080010form1/h_ODR_DMD_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010form1-h_ODR_DMD_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AC0080010-AC0080010form1-h_DEMAND_FLG" name="h_DEMAND_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0080010Struct.geth_DEMAND_FLG()) %>">
<script class="expj-script-AC0080010-AC0080010form1-h_DEMAND_FLG">
expj.AC0080010.AC0080010form1.h_DEMAND_FLG = {};
expj.AC0080010.AC0080010form1.h_DEMAND_FLG.executeAllOnDecision = function () {
  console.log('execute AC0080010form1/h_DEMAND_FLG.onDecision');
  expj.AC0080010.AC0080010form1.executeAllOnDecision();
  expj.AC0080010.executeAllOnDecision();
};
expj.AC0080010.AC0080010form1.h_DEMAND_FLG.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010form1-h_DEMAND_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0080010', 'AC0080010form1', 'h_DEMAND_FLG', this);
  });
  expj.AC0080010.AC0080010form1.h_DEMAND_FLG.executePScriptOnLoad();
};

expj.AC0080010.AC0080010form1.h_DEMAND_FLG.executePScriptOnLoad = function () {
  console.log('execute AC0080010form1/h_DEMAND_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010form1-h_DEMAND_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0080010-AC0080010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0080010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AC0080010-AC0080010form1-DOWNLOAD_FILE">
expj.AC0080010.AC0080010form1.DOWNLOAD_FILE = {};
expj.AC0080010.AC0080010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AC0080010form1/DOWNLOAD_FILE.onDecision');
  expj.AC0080010.AC0080010form1.executeAllOnDecision();
  expj.AC0080010.executeAllOnDecision();
};
expj.AC0080010.AC0080010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0080010', 'AC0080010form1', 'DOWNLOAD_FILE', this);
  });
  expj.AC0080010.AC0080010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AC0080010.AC0080010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AC0080010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AC0080010-AC0080010form1-w_ITEM_CD">
expj.AC0080010.AC0080010form1.w_ITEM_CD = {};
expj.AC0080010.AC0080010form1.w_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AC0080010form1/w_ITEM_CD.onDecision');
  expj.AC0080010.AC0080010form1.executeAllOnDecision();
  expj.AC0080010.executeAllOnDecision();
};
expj.AC0080010.AC0080010form1.w_ITEM_CD.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010form1-w_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0080010', 'AC0080010form1', 'w_ITEM_CD', this);
  });
  expj.AC0080010.AC0080010form1.w_ITEM_CD.executePScriptOnLoad();
};

expj.AC0080010.AC0080010form1.w_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AC0080010form1/w_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010form1-w_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0080010-AC0080010form1-w_ITEM_CD" name="w_ITEM_CD" class="AC0080010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAC0080010Struct.getw_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AC0080010-AC0080010form1-PeekerItemCd">
expj.AC0080010.AC0080010form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AC0080010form1/w_ITEM_CD@<%=contextNo%>"
expj.AC0080010.AC0080010form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0080010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010form1', '_AC0080010form1/w_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AC0080010form1/w_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0080010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0080010.AC0080010form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0080010.AC0080010form1.PeekerItemCd['onClick' + i])) {
        expj.AC0080010.AC0080010form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AC0080010.AC0080010form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AC0080010.AC0080010form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0080010', 'AC0080010form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AC0080010.AC0080010form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AC0080010.AC0080010form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AC0080010form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0080010-AC0080010form1-PeekerItemCd" class="AC0080010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt0420",rb)%></span><!-- 生産計画期間 --></div><!--/td-->
<script class="expj-script-AC0080010-AC0080010form1-w_DATE_FROM">
expj.AC0080010.AC0080010form1.w_DATE_FROM = {};
expj.AC0080010.AC0080010form1.w_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AC0080010form1/w_DATE_FROM.onDecision');
  expj.AC0080010.AC0080010form1.executeAllOnDecision();
  expj.AC0080010.executeAllOnDecision();
};
expj.AC0080010.AC0080010form1.w_DATE_FROM.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010form1-w_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0080010', 'AC0080010form1', 'w_DATE_FROM', this);
  });
  expj.AC0080010.AC0080010form1.w_DATE_FROM.executePScriptOnLoad();
};

expj.AC0080010.AC0080010form1.w_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AC0080010form1/w_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010form1-w_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0080010-AC0080010form1-w_DATE_FROM" name="w_DATE_FROM" class="AC0080010-focus-move  required-value expj-AC0080010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0080010Struct.getw_DATE_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AC0080010-AC0080010form1-Calendarw_DATE_FROM">
expj.AC0080010.AC0080010form1.Calendarw_DATE_FROM = {};
// script1="onClick;0;CALENDAR;_AC0080010form1/w_DATE_FROM"
expj.AC0080010.AC0080010form1.Calendarw_DATE_FROM.onClick0 = function () {
  console.log('Calendarw_DATE_FROM script1');
expj.common.pscript.executeCalendar('AC0080010','AC0080010form1','_AC0080010form1/w_DATE_FROM');
};
expj.AC0080010.AC0080010form1.Calendarw_DATE_FROM.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0080010.AC0080010form1.Calendarw_DATE_FROM['onClick' + i])) {
        expj.AC0080010.AC0080010form1.Calendarw_DATE_FROM['onClick' + i]();
      }
    }
  }
};
expj.AC0080010.AC0080010form1.Calendarw_DATE_FROM.executeAllOnDecision = function () {
};
expj.AC0080010.AC0080010form1.Calendarw_DATE_FROM.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010form1-Calendarw_DATE_FROM').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0080010', 'AC0080010form1', 'Calendarw_DATE_FROM', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0080010','AC0080010form1','_AC0080010form1/w_DATE_FROM');
  expj.AC0080010.AC0080010form1.Calendarw_DATE_FROM.executePScriptOnLoad();
};

expj.AC0080010.AC0080010form1.Calendarw_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AC0080010form1/Calendarw_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010form1-Calendarw_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0080010-AC0080010form1-Calendarw_DATE_FROM" class="AC0080010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AC0080010-AC0080010form1-w_TIME_FROM">
expj.AC0080010.AC0080010form1.w_TIME_FROM = {};
expj.AC0080010.AC0080010form1.w_TIME_FROM.executeAllOnDecision = function () {
  console.log('execute AC0080010form1/w_TIME_FROM.onDecision');
  expj.AC0080010.AC0080010form1.executeAllOnDecision();
  expj.AC0080010.executeAllOnDecision();
};
expj.AC0080010.AC0080010form1.w_TIME_FROM.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010form1-w_TIME_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0080010', 'AC0080010form1', 'w_TIME_FROM', this);
  });
  expj.AC0080010.AC0080010form1.w_TIME_FROM.executePScriptOnLoad();
};

expj.AC0080010.AC0080010form1.w_TIME_FROM.executePScriptOnLoad = function () {
  console.log('execute AC0080010form1/w_TIME_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010form1-w_TIME_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AC0080010-AC0080010form1-w_TIME_FROM" name="w_TIME_FROM" class="AC0080010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAC0080010Struct.getw_TIME_FROM()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<script class="expj-script-AC0080010-AC0080010form1-w_DATE_TO">
expj.AC0080010.AC0080010form1.w_DATE_TO = {};
expj.AC0080010.AC0080010form1.w_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AC0080010form1/w_DATE_TO.onDecision');
  expj.AC0080010.AC0080010form1.executeAllOnDecision();
  expj.AC0080010.executeAllOnDecision();
};
expj.AC0080010.AC0080010form1.w_DATE_TO.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010form1-w_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0080010', 'AC0080010form1', 'w_DATE_TO', this);
  });
  expj.AC0080010.AC0080010form1.w_DATE_TO.executePScriptOnLoad();
};

expj.AC0080010.AC0080010form1.w_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AC0080010form1/w_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010form1-w_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0080010-AC0080010form1-w_DATE_TO" name="w_DATE_TO" class="AC0080010-focus-move  required-value expj-AC0080010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0080010Struct.getw_DATE_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AC0080010-AC0080010form1-Calendarw_DATE_TO">
expj.AC0080010.AC0080010form1.Calendarw_DATE_TO = {};
// script1="onClick;0;CALENDAR;_AC0080010form1/w_DATE_TO"
expj.AC0080010.AC0080010form1.Calendarw_DATE_TO.onClick0 = function () {
  console.log('Calendarw_DATE_TO script1');
expj.common.pscript.executeCalendar('AC0080010','AC0080010form1','_AC0080010form1/w_DATE_TO');
};
expj.AC0080010.AC0080010form1.Calendarw_DATE_TO.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0080010.AC0080010form1.Calendarw_DATE_TO['onClick' + i])) {
        expj.AC0080010.AC0080010form1.Calendarw_DATE_TO['onClick' + i]();
      }
    }
  }
};
expj.AC0080010.AC0080010form1.Calendarw_DATE_TO.executeAllOnDecision = function () {
};
expj.AC0080010.AC0080010form1.Calendarw_DATE_TO.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010form1-Calendarw_DATE_TO').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0080010', 'AC0080010form1', 'Calendarw_DATE_TO', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0080010','AC0080010form1','_AC0080010form1/w_DATE_TO');
  expj.AC0080010.AC0080010form1.Calendarw_DATE_TO.executePScriptOnLoad();
};

expj.AC0080010.AC0080010form1.Calendarw_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AC0080010form1/Calendarw_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010form1-Calendarw_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-AC0080010-AC0080010form1-Calendarw_DATE_TO" class="AC0080010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AC0080010-AC0080010form1-w_TIME_TO">
expj.AC0080010.AC0080010form1.w_TIME_TO = {};
expj.AC0080010.AC0080010form1.w_TIME_TO.executeAllOnDecision = function () {
  console.log('execute AC0080010form1/w_TIME_TO.onDecision');
  expj.AC0080010.AC0080010form1.executeAllOnDecision();
  expj.AC0080010.executeAllOnDecision();
};
expj.AC0080010.AC0080010form1.w_TIME_TO.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010form1-w_TIME_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0080010', 'AC0080010form1', 'w_TIME_TO', this);
  });
  expj.AC0080010.AC0080010form1.w_TIME_TO.executePScriptOnLoad();
};

expj.AC0080010.AC0080010form1.w_TIME_TO.executePScriptOnLoad = function () {
  console.log('execute AC0080010form1/w_TIME_TO.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010form1-w_TIME_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td over-inner" style="width:150px;text-align:;"><input type="text" id="expj-AC0080010-AC0080010form1-w_TIME_TO" name="w_TIME_TO" class="AC0080010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAC0080010Struct.getw_TIME_TO()) %>" maxlength="4" ></div><input type="hidden" id="expj-AC0080010-AC0080010form1-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0080010Struct.getTIME_CTRL()) %>">
<script class="expj-script-AC0080010-AC0080010form1-TIME_CTRL">
expj.AC0080010.AC0080010form1.TIME_CTRL = {};
expj.AC0080010.AC0080010form1.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AC0080010form1/TIME_CTRL.onDecision');
  expj.AC0080010.AC0080010form1.executeAllOnDecision();
  expj.AC0080010.executeAllOnDecision();
};
expj.AC0080010.AC0080010form1.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010form1-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0080010', 'AC0080010form1', 'TIME_CTRL', this);
  });
  expj.AC0080010.AC0080010form1.TIME_CTRL.executePScriptOnLoad();
};

expj.AC0080010.AC0080010form1.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AC0080010form1/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010form1-TIME_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OD_TYP",rb)%></span><!-- オーダデマンド区分 --></div><!--/td-->
<script class="expj-script-AC0080010-AC0080010form1-w_OD_TYP">
expj.AC0080010.AC0080010form1.w_OD_TYP = {};
// script1="onDecision;0;CHK;1[eq]1@*0"
expj.AC0080010.AC0080010form1.w_OD_TYP.onDecision0 = function () {
  console.log('w_OD_TYP script1');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_AC0080010form1/w_OD_TYP[eq]2@*1,*3"
expj.AC0080010.AC0080010form1.w_OD_TYP.child0 = function () {
  console.log('w_OD_TYP script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010form1', '_AC0080010form1/w_OD_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script3="child;1;SET;_AC0080010form1/c_UN_CONNECT_DEMAND=false@*2"
expj.AC0080010.AC0080010form1.w_OD_TYP.child1 = function () {
  console.log('w_OD_TYP script3');
expj.common.pscript.setReferenceComponentValue('AC0080010', 'AC0080010form1', '_AC0080010form1/c_UN_CONNECT_DEMAND', 'false');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script4="child;2;MASK;_AC0080010form1/c_UN_CONNECT_DEMAND"
expj.AC0080010.AC0080010form1.w_OD_TYP.child2 = function () {
  console.log('w_OD_TYP script4');
expj.common.pscript.setMaskToReferenceComponent('AC0080010', 'AC0080010form1', '_AC0080010form1/c_UN_CONNECT_DEMAND');
};
// script5="child;3;UNMASK;_AC0080010form1/c_UN_CONNECT_DEMAND"
expj.AC0080010.AC0080010form1.w_OD_TYP.child3 = function () {
  console.log('w_OD_TYP script5');
expj.common.pscript.setUnMaskToReferenceComponent('AC0080010', 'AC0080010form1', '_AC0080010form1/c_UN_CONNECT_DEMAND');
};
expj.AC0080010.AC0080010form1.w_OD_TYP.executeAllOnDecision = function () {
  console.log('execute AC0080010form1/w_OD_TYP.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0080010.AC0080010form1.w_OD_TYP['onDecision' + i])) {
        expj.AC0080010.AC0080010form1.w_OD_TYP['onDecision' + i]();
      }
    }
  }
  expj.AC0080010.AC0080010form1.executeAllOnDecision();
  expj.AC0080010.executeAllOnDecision();
};
expj.AC0080010.AC0080010form1.w_OD_TYP.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010form1-w_OD_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AC0080010', 'AC0080010form1', 'w_OD_TYP', this);
  });
  expj.AC0080010.AC0080010form1.w_OD_TYP.executePScriptOnLoad();
};

expj.AC0080010.AC0080010form1.w_OD_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0080010form1/w_OD_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010form1-w_OD_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AC0080010-AC0080010form1-w_OD_TYP" name='w_OD_TYP' class='AC0080010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAC0080010Control.getStruct().getList_w_OD_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAC0080010Control.getStruct().getList_w_OD_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAC0080010Control.getStruct().getList_w_OD_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAC0080010Struct.getw_OD_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AC0080010-AC0080010form1-c_UN_CONNECT_DEMAND">
expj.AC0080010.AC0080010form1.c_UN_CONNECT_DEMAND = {};
expj.AC0080010.AC0080010form1.c_UN_CONNECT_DEMAND.executeAllOnDecision = function () {
  console.log('execute AC0080010form1/c_UN_CONNECT_DEMAND.onDecision');
  expj.AC0080010.AC0080010form1.executeAllOnDecision();
  expj.AC0080010.executeAllOnDecision();
};
expj.AC0080010.AC0080010form1.c_UN_CONNECT_DEMAND.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010form1-c_UN_CONNECT_DEMAND').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0080010', 'AC0080010form1', 'c_UN_CONNECT_DEMAND', this, 'CheckBox');
    }
  });
  expj.AC0080010.AC0080010form1.c_UN_CONNECT_DEMAND.executePScriptOnLoad();
};

expj.AC0080010.AC0080010form1.c_UN_CONNECT_DEMAND.executePScriptOnLoad = function () {
  console.log('execute AC0080010form1/c_UN_CONNECT_DEMAND.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010form1-c_UN_CONNECT_DEMAND');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_UN_CONNECT_DEMAND" value="true" <%= ("true".equals(TypeConverter.convert(aAC0080010Struct.getc_UN_CONNECT_DEMAND())) || "1".equals(TypeConverter.convert(aAC0080010Struct.getc_UN_CONNECT_DEMAND())))?"checked=\"checked\"":"" %>  class="AC0080010-focus-move" id="expj-AC0080010-AC0080010form1-c_UN_CONNECT_DEMAND"><label for="expj-AC0080010-AC0080010form1-c_UN_CONNECT_DEMAND"><%=CoreTools.getRBString("Expj.Cmt0445",rb)%></label></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AC0080010-AC0080010button1">
expj.AC0080010.AC0080010button1 = {};
expj.AC0080010.AC0080010button1.executeAllOnDecision = function () {
  console.log('execute AC0080010button1.onDecision');
};
expj.AC0080010.AC0080010button1.executeOnLoad = function () {
  expj.AC0080010.AC0080010button1.executePScriptOnLoad();
};

expj.AC0080010.AC0080010button1.executePScriptOnLoad = function () {
  console.log('execute AC0080010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0080010-AC0080010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0080010-AC0080010button1-select">
expj.AC0080010.AC0080010button1.select = {};
// script1="onClick;0;CHK;_AC0080010form1/w_DATE_FROM[gt]_AC0080010form1/w_DATE_TO@#AC10007"
expj.AC0080010.AC0080010button1.select.onClick0 = function () {
  console.log('select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010button1', '_AC0080010form1/w_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010button1', '_AC0080010form1/w_DATE_TO')))) {
expj.common.pscript.addErrorMessage('AC0080010', 'AC0080010button1', 'AC10007');
}
};
// script2="onClick;1;CHK;_AC0080010form1/w_DATE_FROM[eq]_AC0080010form1/w_DATE_TO[and]_AC0080010form1/w_TIME_FROM[neq][and]_AC0080010form1/w_TIME_TO[neq][and]_AC0080010form1/w_TIME_FROM[gt]_AC0080010form1/w_TIME_TO@#AC10007"
expj.AC0080010.AC0080010button1.select.onClick1 = function () {
  console.log('select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010button1', '_AC0080010form1/w_DATE_FROM'), '[eq]', expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010button1', '_AC0080010form1/w_DATE_TO')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_TO')))) {
expj.common.pscript.addErrorMessage('AC0080010', 'AC0080010button1', 'AC10007');
}
};
// script3="onClick;2;CHK;~LEN(_AC0080010form1/w_TIME_FROM)[eq]1[or]~LEN(_AC0080010form1/w_TIME_FROM)[eq]2@#AS00123"
expj.AC0080010.AC0080010button1.select.onClick2 = function () {
  console.log('select script3');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_FROM'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_FROM'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AC0080010', 'AC0080010button1', 'AS00123');
}
};
// script4="onClick;3;CHK;~LEN(_AC0080010form1/w_TIME_TO)[eq]1[or]~LEN(_AC0080010form1/w_TIME_TO)[eq]2@#AS00120"
expj.AC0080010.AC0080010button1.select.onClick3 = function () {
  console.log('select script4');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_TO'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_TO'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AC0080010', 'AC0080010button1', 'AS00120');
}
};
// script5="onClick;4;CHK;_AC0080010form1/TIME_CTRL[eq]true[and]~LEN(_AC0080010form1/w_TIME_FROM)[eq]3@*0"
expj.AC0080010.AC0080010button1.select.onClick4 = function () {
  console.log('select script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010button1', '_AC0080010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_FROM'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script6="onClick;5;CHK;_AC0080010form1/TIME_CTRL[eq]true[and]~LEN(_AC0080010form1/w_TIME_TO)[eq]3@*1"
expj.AC0080010.AC0080010button1.select.onClick5 = function () {
  console.log('select script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010button1', '_AC0080010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_TO'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script7="onClick;6;CHK;_AC0080010form1/TIME_CTRL[eq]true[and]~LEN(_AC0080010form1/w_TIME_FROM)[eq]4@*2"
expj.AC0080010.AC0080010button1.select.onClick6 = function () {
  console.log('select script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010button1', '_AC0080010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_FROM'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script8="onClick;7;CHK;_AC0080010form1/TIME_CTRL[eq]true[and]~LEN(_AC0080010form1/w_TIME_TO)[eq]4@*5"
expj.AC0080010.AC0080010button1.select.onClick7 = function () {
  console.log('select script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010button1', '_AC0080010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_TO'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script9="onClick;8;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0080010form1/*@AC0080010Servlet"
expj.AC0080010.AC0080010button1.select.onClick8 = function () {
  console.log('select script9');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0080010', 'AC0080010button1', '_AC0080010form1/*', 'AC0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0080010', response);
expj.common.updateBusinessScreenTab('AC0080010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script10="child;0;CHK;[{~CHARAT(_AC0080010form1/w_TIME_FROM:1)}*10+{~CHARAT(_AC0080010form1/w_TIME_FROM:2)}][gte]60@#AS00121"
expj.AC0080010.AC0080010button1.select.child0 = function () {
  console.log('select script10');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_FROM', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_FROM', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AC0080010', 'AC0080010button1', 'AS00121');
}
};
// script11="child;1;CHK;[{~CHARAT(_AC0080010form1/w_TIME_TO:1)}*10+{~CHARAT(_AC0080010form1/w_TIME_TO:2)}][gte]60@#AS00122"
expj.AC0080010.AC0080010button1.select.child1 = function () {
  console.log('select script11');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_TO', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_TO', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AC0080010', 'AC0080010button1', 'AS00122');
}
};
// script12="child;2;CHK;[{~CHARAT(_AC0080010form1/w_TIME_FROM:0)}*10+{~CHARAT(_AC0080010form1/w_TIME_FROM:1)}][gte]24@#AS00121,*3"
expj.AC0080010.AC0080010button1.select.child2 = function () {
  console.log('select script12');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_FROM', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_FROM', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24'))) {
expj.common.pscript.addErrorMessage('AC0080010', 'AC0080010button1', 'AS00121');
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script13="child;3;CHK;_AC0080010form1/TIME_CTRL[eq]true[and]~LEN(_AC0080010form1/w_TIME_FROM)[eq]4@*4"
expj.AC0080010.AC0080010button1.select.child3 = function () {
  console.log('select script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010button1', '_AC0080010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_FROM'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script14="child;4;CHK;[{~CHARAT(_AC0080010form1/w_TIME_FROM:2)}*10+{~CHARAT(_AC0080010form1/w_TIME_FROM:3)}][gte]60@#AS00121"
expj.AC0080010.AC0080010button1.select.child4 = function () {
  console.log('select script14');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_FROM', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_FROM', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AC0080010', 'AC0080010button1', 'AS00121');
}
};
// script15="child;5;CHK;[{~CHARAT(_AC0080010form1/w_TIME_TO:0)}*10+{~CHARAT(_AC0080010form1/w_TIME_TO:1)}][gte]24@#AS00122,*6"
expj.AC0080010.AC0080010button1.select.child5 = function () {
  console.log('select script15');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_TO', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_TO', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24'))) {
expj.common.pscript.addErrorMessage('AC0080010', 'AC0080010button1', 'AS00122');
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script16="child;6;CHK;_AC0080010form1/TIME_CTRL[eq]true[and]~LEN(_AC0080010form1/w_TIME_TO)[eq]4@*7"
expj.AC0080010.AC0080010button1.select.child6 = function () {
  console.log('select script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0080010', 'AC0080010button1', '_AC0080010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_TO'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script17="child;7;CHK;[{~CHARAT(_AC0080010form1/w_TIME_TO:2)}*10+{~CHARAT(_AC0080010form1/w_TIME_TO:3)}][gte]60@#AS00122"
expj.AC0080010.AC0080010button1.select.child7 = function () {
  console.log('select script17');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_TO', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0080010', 'AC0080010button1', '_AC0080010form1/w_TIME_TO', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AC0080010', 'AC0080010button1', 'AS00122');
}
};
expj.AC0080010.AC0080010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 8; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0080010.AC0080010button1.select['onClick' + i])) {
        expj.AC0080010.AC0080010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AC0080010.AC0080010button1.select.executeAllOnDecision = function () {
};
expj.AC0080010.AC0080010button1.select.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0080010', 'AC0080010button1', 'select', this, 'Button');
    }
  });
  expj.AC0080010.AC0080010button1.select.executePScriptOnLoad();
};

expj.AC0080010.AC0080010button1.select.executePScriptOnLoad = function () {
  console.log('execute AC0080010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0080010-AC0080010button1-select" name="select" class="AC0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AC0080010-AC0080010view1">
expj.AC0080010.AC0080010view1 = {};
expj.AC0080010.AC0080010view1.executeAllOnClick = function () {
};
expj.AC0080010.AC0080010view1.executeAllOnDecision = function () {
  console.log('execute AC0080010view1.onDecision');
};
expj.AC0080010.AC0080010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AC0080010view1", "expj.AC0080010.AC0080010view1.executeAllOnClick");
%>
  expj.AC0080010.AC0080010view1.executePScriptOnLoad();
};

expj.AC0080010.AC0080010view1.executePScriptOnLoad = function () {
  console.log('execute AC0080010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AC0080010-AC0080010view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AC0080010view1_Id = "AC0080010view1";
 String AC0080010view1_select = "single";
 String AC0080010view1_sortable = "true";
 String AC0080010view1_resize = "true";
 String AC0080010view1_scroll = "true";
 StringBuffer AC0080010view1_HB = new StringBuffer();
 StringBuffer AC0080010view1_DB = new StringBuffer();
%>
<%
 AC0080010view1_select = "multi";
 AC0080010view1_sortable = "true";
 AC0080010view1_resize = "true";
 AC0080010view1_scroll = "true";
%>
<%
 AC0080010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AC0080010view1_sortable).append("}").append(",");
%>
      
<%
AC0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'EX_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0080010view1_sortable).append("}").append(",");
AC0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'OD_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0080010view1_sortable).append("}").append(",");
AC0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_OD_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0080010view1_sortable).append("}").append(",");
AC0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_PARENT_OD_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0080010view1_sortable).append("}").append(",");
AC0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0434",rb))).append("', 'name':'EXTERNAL_PLAN_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0080010view1_sortable).append("}").append(",");
AC0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0080010view1_sortable).append("}").append(",");
AC0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0080010view1_sortable).append("}").append(",");
AC0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.LIMIT",rb))).append("', 'name':'PRD_DUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0080010view1_sortable).append("}").append(",");
AC0080010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_QTY_1",rb))).append("', 'name':'ODR_DM_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AC0080010view1_sortable).append("}").append(",");
AC0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OD_TYP",rb))).append("', 'name':'OD_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0080010view1_sortable).append("}").append(",");
AC0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0446",rb))).append("', 'name':'w_STS_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0080010view1_sortable).append("}").append(",");
AC0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb))).append("', 'name':'OUTSIDE_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0080010view1_sortable).append("}").append(",");
%>
<%
 int aAC0080010StructLength = aAC0080010Control.getListsize();
 final AC0080010Struct structBackup = aAC0080010Struct;
 aAC0080010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAC0080010StructLength; ++loopCount) {
  if((aAC0080010Struct = (AC0080010Struct) aAC0080010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAC0080010Struct", aAC0080010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AC0080010view1_DB.append("[");
 AC0080010view1_DB.append(loopCount);
%> <%
    String canSelect = "false";
    
    if(TypeConverter.sanitizer(aAC0080010Struct.geth_PARENT_OD_NO()) == null ||
       TypeConverter.sanitizer(aAC0080010Struct.geth_PARENT_OD_NO()).length() == 0 &&
       ("3").equals(TypeConverter.sanitizer(aAC0080010Struct.gets_OD_TYP())))
    {
        canSelect = "true";
    }
%> <%
 AC0080010view1_DB.append(",").append("'<span id=\"expj-AC0080010-AC0080010view1-EX_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AC0080010-AC0080010view1-EX_MODIFY_COUNT\" data-name=\"EX_MODIFY_COUNT\" data-view=\"true\" data-rowselectable=\"").append( canSelect ).append("\">").append(TypeConverter.sanitizer(aAC0080010Struct.getEX_MODIFY_COUNT())).append("</span>'");
 AC0080010view1_DB.append(",").append("'<span id=\"expj-AC0080010-AC0080010view1-OD_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AC0080010-AC0080010view1-OD_MODIFY_COUNT\" data-name=\"OD_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0080010Struct.getOD_MODIFY_COUNT())).append("</span>'");
 AC0080010view1_DB.append(",").append("'<span id=\"expj-AC0080010-AC0080010view1-h_OD_NO-").append(loopCount).append("\" class=\"expj-label expj-AC0080010-AC0080010view1-h_OD_NO\" data-name=\"h_OD_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0080010Struct.geth_OD_NO())).append("</span>'");
 AC0080010view1_DB.append(",").append("'<span id=\"expj-AC0080010-AC0080010view1-h_PARENT_OD_NO-").append(loopCount).append("\" class=\"expj-label expj-AC0080010-AC0080010view1-h_PARENT_OD_NO\" data-name=\"h_PARENT_OD_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0080010Struct.geth_PARENT_OD_NO())).append("</span>'");
 AC0080010view1_DB.append(",").append("'<span id=\"expj-AC0080010-AC0080010view1-EXTERNAL_PLAN_CD-").append(loopCount).append("\" class=\"expj-label expj-AC0080010-AC0080010view1-EXTERNAL_PLAN_CD\" data-name=\"EXTERNAL_PLAN_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0080010Struct.getEXTERNAL_PLAN_CD())).append("</span>'");
 AC0080010view1_DB.append(",").append("'<span id=\"expj-AC0080010-AC0080010view1-ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AC0080010-AC0080010view1-ITEM_CD\" data-name=\"ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0080010Struct.getITEM_CD())).append("</span>'");
 AC0080010view1_DB.append(",").append("'<span id=\"expj-AC0080010-AC0080010view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AC0080010-AC0080010view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0080010Struct.getITEM_NAME())).append("</span>'");
 AC0080010view1_DB.append(",").append("'<span id=\"expj-AC0080010-AC0080010view1-PRD_DUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0080010-AC0080010view1-PRD_DUE_DATE\" data-name=\"PRD_DUE_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0080010Struct.getPRD_DUE_DATE())).append("</span>'");
 AC0080010view1_DB.append(",").append("'<span id=\"expj-AC0080010-AC0080010view1-ODR_DM_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0080010-AC0080010view1-ODR_DM_QTY\" data-name=\"ODR_DM_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0080010Struct.getODR_DM_QTY())).append("</span>'");
 AC0080010view1_DB.append(",").append("'<span id=\"expj-AC0080010-AC0080010view1-OD_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0080010-AC0080010view1-OD_TYP\" data-name=\"OD_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0080010Struct.getOD_TYP())).append("</span>'");
 AC0080010view1_DB.append(",").append("'<span id=\"expj-AC0080010-AC0080010view1-w_STS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0080010-AC0080010view1-w_STS_TYP\" data-name=\"w_STS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0080010Struct.getw_STS_TYP())).append("</span>'");
 AC0080010view1_DB.append(",").append("'<span id=\"expj-AC0080010-AC0080010view1-OUTSIDE_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0080010-AC0080010view1-OUTSIDE_TYP\" data-name=\"OUTSIDE_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0080010Struct.getOUTSIDE_TYP())).append("</span>'");
 AC0080010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAC0080010StructLength) {
   AC0080010view1_DB.append(",");
  }
 }
 aAC0080010Struct = structBackup;
 viewIdList.add(AC0080010view1_Id);
 viewSelectList.add(AC0080010view1_select);
 viewResizeList.add(AC0080010view1_resize);
 viewScrollList.add(AC0080010view1_scroll);
 viewHeaderDataList.add(AC0080010view1_HB);
 viewBodyDataList.add(AC0080010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-AC0080010-AC0080010button2">
expj.AC0080010.AC0080010button2 = {};
expj.AC0080010.AC0080010button2.executeAllOnDecision = function () {
  console.log('execute AC0080010button2.onDecision');
};
expj.AC0080010.AC0080010button2.executeOnLoad = function () {
  expj.AC0080010.AC0080010button2.executePScriptOnLoad();
};

expj.AC0080010.AC0080010button2.executePScriptOnLoad = function () {
  console.log('execute AC0080010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0080010-AC0080010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0080010-AC0080010button2-delete">
expj.AC0080010.AC0080010button2.delete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0080010form1/*,_AC0080010view1/+@AC0080010Servlet,,$ZZ07004"
expj.AC0080010.AC0080010button2.delete.onClick0 = function () {
  console.log('delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0080010', 'AC0080010button2', '_AC0080010form1/*,_AC0080010view1/+', 'AC0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0080010', response);
expj.common.updateBusinessScreenTab('AC0080010', contents);
};
expj.common.pscript.callConfirm('AC0080010', 'AC0080010button2', 'ZZ07004', okEvent);
};
expj.AC0080010.AC0080010button2.delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0080010.AC0080010button2.delete['onClick' + i])) {
        expj.AC0080010.AC0080010button2.delete['onClick' + i]();
      }
    }
  }
};
expj.AC0080010.AC0080010button2.delete.executeAllOnDecision = function () {
};
expj.AC0080010.AC0080010button2.delete.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010button2-delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0080010', 'AC0080010button2', 'delete', this, 'Button');
    }
  });
  expj.AC0080010.AC0080010button2.delete.executePScriptOnLoad();
};

expj.AC0080010.AC0080010button2.delete.executePScriptOnLoad = function () {
  console.log('execute AC0080010button2/delete.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010button2-delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0080010-AC0080010button2-delete" name="delete" class="AC0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDeleteAssort_1",rb)%></button><!-- 選択削除ボタン --></div><!--/td-->
<script class="expj-script-AC0080010-AC0080010button2-choiceAll">
expj.AC0080010.AC0080010button2.choiceAll = {};
// script1="onClick;0;DGSALL;AC0080010view1"
expj.AC0080010.AC0080010button2.choiceAll.onClick0 = function () {
  console.log('choiceAll script1');
expj.common.pscript.selectVIEWAllRow('AC0080010', 'AC0080010view1');
};
expj.AC0080010.AC0080010button2.choiceAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0080010.AC0080010button2.choiceAll['onClick' + i])) {
        expj.AC0080010.AC0080010button2.choiceAll['onClick' + i]();
      }
    }
  }
};
expj.AC0080010.AC0080010button2.choiceAll.executeAllOnDecision = function () {
};
expj.AC0080010.AC0080010button2.choiceAll.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010button2-choiceAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0080010', 'AC0080010button2', 'choiceAll', this, 'Button');
    }
  });
  expj.AC0080010.AC0080010button2.choiceAll.executePScriptOnLoad();
};

expj.AC0080010.AC0080010button2.choiceAll.executePScriptOnLoad = function () {
  console.log('execute AC0080010button2/choiceAll.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010button2-choiceAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0080010-AC0080010button2-choiceAll" name="choiceAll" class="AC0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckAll",rb)%></button><!-- 全選択ボタン --></div><!--/td-->
<script class="expj-script-AC0080010-AC0080010button2-cancelAll">
expj.AC0080010.AC0080010button2.cancelAll = {};
// script1="onClick;0;DGSCANCEL;AC0080010view1"
expj.AC0080010.AC0080010button2.cancelAll.onClick0 = function () {
  console.log('cancelAll script1');
expj.common.pscript.unselectVIEWAllRow('AC0080010', 'AC0080010view1');
};
expj.AC0080010.AC0080010button2.cancelAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0080010.AC0080010button2.cancelAll['onClick' + i])) {
        expj.AC0080010.AC0080010button2.cancelAll['onClick' + i]();
      }
    }
  }
};
expj.AC0080010.AC0080010button2.cancelAll.executeAllOnDecision = function () {
};
expj.AC0080010.AC0080010button2.cancelAll.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010button2-cancelAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0080010', 'AC0080010button2', 'cancelAll', this, 'Button');
    }
  });
  expj.AC0080010.AC0080010button2.cancelAll.executePScriptOnLoad();
};

expj.AC0080010.AC0080010button2.cancelAll.executePScriptOnLoad = function () {
  console.log('execute AC0080010button2/cancelAll.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010button2-cancelAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0080010-AC0080010button2-cancelAll" name="cancelAll" class="AC0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckClear",rb)%></button><!-- 全解除ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 305px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AC0080010 Revision: 1.6  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-AC0080010-AC0080010button0">
expj.AC0080010.AC0080010button0 = {};
expj.AC0080010.AC0080010button0.executeAllOnDecision = function () {
  console.log('execute AC0080010button0.onDecision');
};
expj.AC0080010.AC0080010button0.executeOnLoad = function () {
  expj.AC0080010.AC0080010button0.executePScriptOnLoad();
};

expj.AC0080010.AC0080010button0.executePScriptOnLoad = function () {
  console.log('execute AC0080010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0080010-AC0080010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0080010-AC0080010button0-csv">
expj.AC0080010.AC0080010button0.csv = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0080010form1/*@AC0080010Servlet,,$ZZ07011"
expj.AC0080010.AC0080010button0.csv.onClick0 = function () {
  console.log('csv script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0080010', 'AC0080010button0', '_AC0080010form1/*', 'AC0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0080010', response);
expj.common.updateBusinessScreenTab('AC0080010', contents);
};
expj.common.pscript.callConfirm('AC0080010', 'AC0080010button0', 'ZZ07011', okEvent);
};
expj.AC0080010.AC0080010button0.csv.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0080010.AC0080010button0.csv['onClick' + i])) {
        expj.AC0080010.AC0080010button0.csv['onClick' + i]();
      }
    }
  }
};
expj.AC0080010.AC0080010button0.csv.executeAllOnDecision = function () {
};
expj.AC0080010.AC0080010button0.csv.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010button0-csv').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0080010', 'AC0080010button0', 'csv', this, 'Button');
    }
  });
  expj.AC0080010.AC0080010button0.csv.executePScriptOnLoad();
};

expj.AC0080010.AC0080010button0.csv.executePScriptOnLoad = function () {
  console.log('execute AC0080010button0/csv.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010button0-csv');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0080010-AC0080010button0-csv" name="csv" class="AC0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- ＣＳＶ出力ボタン --></div><!--/td-->
<script class="expj-script-AC0080010-AC0080010button0-clear">
expj.AC0080010.AC0080010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AC0080010Servlet,,$ZZ07008"
expj.AC0080010.AC0080010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0080010', 'AC0080010button0', '', 'AC0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0080010', response);
expj.common.updateBusinessScreenTab('AC0080010', contents);
};
expj.common.pscript.callConfirm('AC0080010', 'AC0080010button0', 'ZZ07008', okEvent);
};
expj.AC0080010.AC0080010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0080010.AC0080010button0.clear['onClick' + i])) {
        expj.AC0080010.AC0080010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AC0080010.AC0080010button0.clear.executeAllOnDecision = function () {
};
expj.AC0080010.AC0080010button0.clear.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0080010', 'AC0080010button0', 'clear', this, 'Button');
    }
  });
  expj.AC0080010.AC0080010button0.clear.executePScriptOnLoad();
};

expj.AC0080010.AC0080010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AC0080010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0080010-AC0080010button0-clear" name="clear" class="AC0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AC0080010-AC0080010button0-close">
expj.AC0080010.AC0080010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AC0080010.AC0080010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AC0080010');
};
expj.AC0080010.AC0080010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0080010.AC0080010button0.close['onClick' + i])) {
        expj.AC0080010.AC0080010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AC0080010.AC0080010button0.close.executeAllOnDecision = function () {
};
expj.AC0080010.AC0080010button0.close.executeOnLoad = function () {
  $('#expj-AC0080010-AC0080010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0080010', 'AC0080010button0', 'close', this, 'Button');
    }
  });
  expj.AC0080010.AC0080010button0.close.executePScriptOnLoad();
};

expj.AC0080010.AC0080010button0.close.executePScriptOnLoad = function () {
  console.log('execute AC0080010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AC0080010-AC0080010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0080010-AC0080010button0-close" name="close" class="AC0080010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AC0080010 (END)-->
<%
MessageStruct msgStruct = aAC0080010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AC0080010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AC0080010)) {
  expj.common.treeInstanceMap.AC0080010 = {};
}
expj.common.treeInstanceMap.AC0080010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0080010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AC0080010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0080010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AC0080010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AC0080010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AC0080010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AC0080010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AC0080010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AC0080010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AC0080010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0080010)) {
  expj.common.detailDialogMap.AC0080010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0080010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AC0080010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0080010.<%=detailId %>)) {
  expj.common.detailDialogMap.AC0080010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0080010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AC0080010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0080010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AC0080010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AC0080010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AC0080010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AC0080010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AC0080010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AC0080010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AC0080010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AC0080010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AC0080010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AC0080010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AC0080010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AC0080010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AC0080010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AC0080010)) {
  expj.common.viewInstanceMap.AC0080010 = {};
}
expj.common.viewInstanceMap.AC0080010.<%=viewId %> = {};
expj.common.viewInstanceMap.AC0080010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AC0080010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AC0080010.<%=viewId %>.init = function () {
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
    expj.AC0080010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AC0080010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AC0080010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AC0080010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AC0080010_init">
/**
 * AC0080010用のロード完了時初期化関数
 */
expj.AC0080010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AC0080010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AC0080010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AC0080010');
  expj.common.calendarInstanceMap.AC0080010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AC0080010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AC0080010.<%=detailId %>.init();
  expj.common.detailDialogMap.AC0080010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AC0080010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AC0080010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AC0080010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AC0080010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AC0080010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AC0080010-<%=detailId %>');
<%
 }
%>
  try{expj.AC0080010.AC0080010form1.w_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010form1.h_ODR_DMD_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010form1.h_DEMAND_FLG.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010form1.w_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010form1.w_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010form1.Calendarw_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010form1.w_TIME_FROM.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010form1.w_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010form1.Calendarw_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010form1.w_TIME_TO.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010form1.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010form1.w_OD_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010form1.c_UN_CONNECT_DEMAND.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010button1.select.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010button2.delete.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010button2.choiceAll.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010button2.cancelAll.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010button0.csv.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010button0.close.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010form1.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010button1.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010view1.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010button2.executeOnLoad();}catch(e){};
  try{expj.AC0080010.AC0080010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AC0080010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AC0080010', 'AC0080010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AC0080010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AC0080010-focus-move');
  // 初期フォーカス当てる処理
  $('.AC0080010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AC0080010', '<%=request.getContextPath() %>');
};

/**
 * AC0080010の全体onDecision処理
 */
expj.AC0080010.executeAllOnDecision = function () {
  expj.AC0080010.AC0080010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AC0080010_console">
expj.AC0080010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>