<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:41:48 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AH0010\AH0010020.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AH0010.*" %>
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
<jsp:useBean id="aAH0010020Control" class="com.nec.jp.orteus.metamorBase.AH0010.AH0010020Control" scope="request"/>
<jsp:useBean id="aAH0010020Struct" class="com.nec.jp.orteus.metamorBase.AH0010.AH0010020Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

品目別棚卸設定ファイルメンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0010/jsp/AH0010020.jsp,v $
$Author: geng-jia $	
$Revision: 1.7 $ $Date: 2017/02/22 02:06:01 $
********************************************************* --%>
<html>
<head>
<title>品目別棚卸設定ファイルメンテナンス</title>
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
<script class="expj-script-AH0010020_init">
  // AH0010020名前空間
  expj.AH0010020 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AH0010020" data-screen="AH0010020" data-newdata="<%=aAH0010020Control.isNewData() %>">
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
              <script class="expj-script-AH0010020-AH0010020form1">
expj.AH0010020.AH0010020form1 = {};
// script1="onLoad;0;CALL;child@0,2,4,6,8,10,12,14,16,18,20,22,24,27"
expj.AH0010020.AH0010020form1.onLoad0 = function () {
  console.log('AH0010020form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child2)){this.child2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child4)){this.child4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child6)){this.child6();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child8)){this.child8();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child10)){this.child10();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child12)){this.child12();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child14)){this.child14();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child16)){this.child16();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child18)){this.child18();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child20)){this.child20();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child22)){this.child22();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child24)){this.child24();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child27)){this.child27();}
};
// script2="child;0;CHK;_AH0010020form2/h_INV_FLG_JAN[eq]1@*1"
expj.AH0010020.AH0010020form1.child0 = function () {
  console.log('AH0010020form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/h_INV_FLG_JAN'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;1;SET;_AH0010020form2/c_INV_FLG_JAN=true"
expj.AH0010020.AH0010020form1.child1 = function () {
  console.log('AH0010020form1 script3');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/c_INV_FLG_JAN', 'true');
};
// script4="child;2;CHK;_AH0010020form2/h_INV_FLG_FEB[eq]1@*3"
expj.AH0010020.AH0010020form1.child2 = function () {
  console.log('AH0010020form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/h_INV_FLG_FEB'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="child;3;SET;_AH0010020form2/c_INV_FLG_FEB=true"
expj.AH0010020.AH0010020form1.child3 = function () {
  console.log('AH0010020form1 script5');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/c_INV_FLG_FEB', 'true');
};
// script6="child;4;CHK;_AH0010020form2/h_INV_FLG_MAR[eq]1@*5"
expj.AH0010020.AH0010020form1.child4 = function () {
  console.log('AH0010020form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/h_INV_FLG_MAR'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="child;5;SET;_AH0010020form2/c_INV_FLG_MAR=true"
expj.AH0010020.AH0010020form1.child5 = function () {
  console.log('AH0010020form1 script7');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/c_INV_FLG_MAR', 'true');
};
// script8="child;6;CHK;_AH0010020form2/h_INV_FLG_APR[eq]1@*7"
expj.AH0010020.AH0010020form1.child6 = function () {
  console.log('AH0010020form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/h_INV_FLG_APR'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script9="child;7;SET;_AH0010020form2/c_INV_FLG_APR=true"
expj.AH0010020.AH0010020form1.child7 = function () {
  console.log('AH0010020form1 script9');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/c_INV_FLG_APR', 'true');
};
// script10="child;8;CHK;_AH0010020form2/h_INV_FLG_MAY[eq]1@*9"
expj.AH0010020.AH0010020form1.child8 = function () {
  console.log('AH0010020form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/h_INV_FLG_MAY'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script11="child;9;SET;_AH0010020form2/c_INV_FLG_MAY=true"
expj.AH0010020.AH0010020form1.child9 = function () {
  console.log('AH0010020form1 script11');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/c_INV_FLG_MAY', 'true');
};
// script12="child;10;CHK;_AH0010020form2/h_INV_FLG_JUN[eq]1@*11"
expj.AH0010020.AH0010020form1.child10 = function () {
  console.log('AH0010020form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/h_INV_FLG_JUN'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script13="child;11;SET;_AH0010020form2/c_INV_FLG_JUN=true"
expj.AH0010020.AH0010020form1.child11 = function () {
  console.log('AH0010020form1 script13');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/c_INV_FLG_JUN', 'true');
};
// script14="child;12;CHK;_AH0010020form2/h_INV_FLG_JUL[eq]1@*13"
expj.AH0010020.AH0010020form1.child12 = function () {
  console.log('AH0010020form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/h_INV_FLG_JUL'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script15="child;13;SET;_AH0010020form2/c_INV_FLG_JUL=true"
expj.AH0010020.AH0010020form1.child13 = function () {
  console.log('AH0010020form1 script15');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/c_INV_FLG_JUL', 'true');
};
// script16="child;14;CHK;_AH0010020form2/h_INV_FLG_AUG[eq]1@*15"
expj.AH0010020.AH0010020form1.child14 = function () {
  console.log('AH0010020form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/h_INV_FLG_AUG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script17="child;15;SET;_AH0010020form2/c_INV_FLG_AUG=true"
expj.AH0010020.AH0010020form1.child15 = function () {
  console.log('AH0010020form1 script17');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/c_INV_FLG_AUG', 'true');
};
// script18="child;16;CHK;_AH0010020form2/h_INV_FLG_SEP[eq]1@*17"
expj.AH0010020.AH0010020form1.child16 = function () {
  console.log('AH0010020form1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/h_INV_FLG_SEP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script19="child;17;SET;_AH0010020form2/c_INV_FLG_SEP=true"
expj.AH0010020.AH0010020form1.child17 = function () {
  console.log('AH0010020form1 script19');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/c_INV_FLG_SEP', 'true');
};
// script20="child;18;CHK;_AH0010020form2/h_INV_FLG_OCT[eq]1@*19"
expj.AH0010020.AH0010020form1.child18 = function () {
  console.log('AH0010020form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/h_INV_FLG_OCT'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script21="child;19;SET;_AH0010020form2/c_INV_FLG_OCT=true"
expj.AH0010020.AH0010020form1.child19 = function () {
  console.log('AH0010020form1 script21');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/c_INV_FLG_OCT', 'true');
};
// script22="child;20;CHK;_AH0010020form2/h_INV_FLG_NOV[eq]1@*21"
expj.AH0010020.AH0010020form1.child20 = function () {
  console.log('AH0010020form1 script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/h_INV_FLG_NOV'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
}
};
// script23="child;21;SET;_AH0010020form2/c_INV_FLG_NOV=true"
expj.AH0010020.AH0010020form1.child21 = function () {
  console.log('AH0010020form1 script23');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/c_INV_FLG_NOV', 'true');
};
// script24="child;22;CHK;_AH0010020form2/h_INV_FLG_DEC[eq]1@*23"
expj.AH0010020.AH0010020form1.child22 = function () {
  console.log('AH0010020form1 script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/h_INV_FLG_DEC'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
}
};
// script25="child;23;SET;_AH0010020form2/c_INV_FLG_DEC=true"
expj.AH0010020.AH0010020form1.child23 = function () {
  console.log('AH0010020form1 script25');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form2/c_INV_FLG_DEC', 'true');
};
// script26="onDecision;0;CHK;1[eq]1@*24"
expj.AH0010020.AH0010020form1.onDecision0 = function () {
  console.log('AH0010020form1 script26');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
}
};
// script27="child;24;CHKRQ;A@*25,*26"
expj.AH0010020.AH0010020form1.child24 = function () {
  console.log('AH0010020form1 script27');
if (expj.common.pscript.satisfiedRequiredComponent('AH0010020', 'A')) {
if(expj.common.checkNameSpace(this.child25)){this.child25();}
} else {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
}
};
// script28="child;25;UNMASK;_AH0010020button1/select"
expj.AH0010020.AH0010020form1.child25 = function () {
  console.log('AH0010020form1 script28');
expj.common.pscript.setUnMaskToReferenceComponent('AH0010020', 'AH0010020form1', '_AH0010020button1/select');
};
// script29="child;26;MASK;_AH0010020button1/select"
expj.AH0010020.AH0010020form1.child26 = function () {
  console.log('AH0010020form1 script29');
expj.common.pscript.setMaskToReferenceComponent('AH0010020', 'AH0010020form1', '_AH0010020button1/select');
};
// script30="onDecision;1;CHK;1[eq]1@*27"
expj.AH0010020.AH0010020form1.onDecision1 = function () {
  console.log('AH0010020form1 script30');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
}
};
// script31="child;27;CHKRQ;A@*28,*31"
expj.AH0010020.AH0010020form1.child27 = function () {
  console.log('AH0010020form1 script31');
if (expj.common.pscript.satisfiedRequiredComponent('AH0010020', 'A')) {
if(expj.common.checkNameSpace(this.child28)){this.child28();}
} else {
if(expj.common.checkNameSpace(this.child31)){this.child31();}
}
};
// script32="child;28;CHK;?AH0010020form1/*[eq]NORMAL@*29,*31"
expj.AH0010020.AH0010020form1.child28 = function () {
  console.log('AH0010020form1 script32');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020form1', '?AH0010020form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child29)){this.child29();}
} else {
if(expj.common.checkNameSpace(this.child31)){this.child31();}
}
};
// script33="child;29;CHK;_AH0010020form1/w_ITEM_CD[eq]_AH0010020form1/h_saveITEM_CD@*30,*31"
expj.AH0010020.AH0010020form1.child29 = function () {
  console.log('AH0010020form1 script33');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form1/w_ITEM_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form1/h_saveITEM_CD'))) {
if(expj.common.checkNameSpace(this.child30)){this.child30();}
} else {
if(expj.common.checkNameSpace(this.child31)){this.child31();}
}
};
// script34="child;30;UNMASK;_AH0010020button2/update"
expj.AH0010020.AH0010020form1.child30 = function () {
  console.log('AH0010020form1 script34');
expj.common.pscript.setUnMaskToReferenceComponent('AH0010020', 'AH0010020form1', '_AH0010020button2/update');
};
// script35="child;31;MASK;_AH0010020button2/update"
expj.AH0010020.AH0010020form1.child31 = function () {
  console.log('AH0010020form1 script35');
expj.common.pscript.setMaskToReferenceComponent('AH0010020', 'AH0010020form1', '_AH0010020button2/update');
};
expj.AH0010020.AH0010020form1.executeAllOnDecision = function () {
  console.log('execute AH0010020form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0010020.AH0010020form1['onDecision' + i])) {
        expj.AH0010020.AH0010020form1['onDecision' + i]();
      }
    }
  }
};
expj.AH0010020.AH0010020form1.executeOnLoad = function () {
  expj.AH0010020.AH0010020form1.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form1.executePScriptOnLoad = function () {
  console.log('execute AH0010020form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AH0010020.AH0010020form1['onLoad' + i])) {
      expj.AH0010020.AH0010020form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AH0010020-AH0010020form1" action="AH0010020Servlet" name="AH0010020form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAH0010020Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<script class="expj-script-AH0010020-AH0010020form1-w_ITEM_CD">
expj.AH0010020.AH0010020form1.w_ITEM_CD = {};
expj.AH0010020.AH0010020form1.w_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AH0010020form1/w_ITEM_CD.onDecision');
  expj.AH0010020.AH0010020form1.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form1.w_ITEM_CD.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form1-w_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0010020', 'AH0010020form1', 'w_ITEM_CD', this);
  });
  expj.AH0010020.AH0010020form1.w_ITEM_CD.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form1.w_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AH0010020form1/w_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form1-w_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AH0010020-AH0010020form1-w_ITEM_CD" name="w_ITEM_CD" class="AH0010020-focus-move  required-value expj-AH0010020-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0010020Struct.getw_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AH0010020-AH0010020form1-PeekerWItemCd">
expj.AH0010020.AH0010020form1.PeekerWItemCd = {};
// script1="onClick;0;PEEKER;_AH0010020form1/w_ITEM_CD@<%=contextNo%>"
expj.AH0010020.AH0010020form1.PeekerWItemCd.onClick0 = function () {
  console.log('PeekerWItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AH0010020';
var parameterValues = 'PeekerWItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020form1', '_AH0010020form1/w_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AH0010020form1/w_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AH0010020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AH0010020.AH0010020form1.PeekerWItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0010020.AH0010020form1.PeekerWItemCd['onClick' + i])) {
        expj.AH0010020.AH0010020form1.PeekerWItemCd['onClick' + i]();
      }
    }
  }
};
expj.AH0010020.AH0010020form1.PeekerWItemCd.executeAllOnDecision = function () {
};
expj.AH0010020.AH0010020form1.PeekerWItemCd.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form1-PeekerWItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010020', 'AH0010020form1', 'PeekerWItemCd', this, 'Button');
    }
  });
  expj.AH0010020.AH0010020form1.PeekerWItemCd.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form1.PeekerWItemCd.executePScriptOnLoad = function () {
  console.log('execute AH0010020form1/PeekerWItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form1-PeekerWItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AH0010020-AH0010020form1-PeekerWItemCd" class="AH0010020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AH0010020-AH0010020form1-w_ITEM_NAME">
expj.AH0010020.AH0010020form1.w_ITEM_NAME = {};
expj.AH0010020.AH0010020form1.w_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AH0010020form1/w_ITEM_NAME.onDecision');
  expj.AH0010020.AH0010020form1.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form1.w_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form1-w_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0010020', 'AH0010020form1', 'w_ITEM_NAME', this);
  });
  expj.AH0010020.AH0010020form1.w_ITEM_NAME.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form1.w_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AH0010020form1/w_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form1-w_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AH0010020-AH0010020form1-w_ITEM_NAME" name="w_ITEM_NAME" class="AH0010020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0010020Struct.getw_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AH0010020-AH0010020form1-h_saveITEM_CD" name="h_saveITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0010020Struct.geth_saveITEM_CD()) %>">
<script class="expj-script-AH0010020-AH0010020form1-h_saveITEM_CD">
expj.AH0010020.AH0010020form1.h_saveITEM_CD = {};
expj.AH0010020.AH0010020form1.h_saveITEM_CD.executeAllOnDecision = function () {
  console.log('execute AH0010020form1/h_saveITEM_CD.onDecision');
  expj.AH0010020.AH0010020form1.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form1.h_saveITEM_CD.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form1-h_saveITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0010020', 'AH0010020form1', 'h_saveITEM_CD', this);
  });
  expj.AH0010020.AH0010020form1.h_saveITEM_CD.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form1.h_saveITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AH0010020form1/h_saveITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form1-h_saveITEM_CD');
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AH0010020-AH0010020button1">
expj.AH0010020.AH0010020button1 = {};
expj.AH0010020.AH0010020button1.executeAllOnDecision = function () {
  console.log('execute AH0010020button1.onDecision');
};
expj.AH0010020.AH0010020button1.executeOnLoad = function () {
  expj.AH0010020.AH0010020button1.executePScriptOnLoad();
};

expj.AH0010020.AH0010020button1.executePScriptOnLoad = function () {
  console.log('execute AH0010020button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AH0010020-AH0010020button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AH0010020-AH0010020button1-CsvImport">
expj.AH0010020.AH0010020button1.CsvImport = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AH0010020form1/*,_AH0010020form2/*,_AH0010020form3/*@AH0010020Servlet"
expj.AH0010020.AH0010020button1.CsvImport.onClick0 = function () {
  console.log('CsvImport script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0010020', 'AH0010020button1', '_AH0010020form1/*,_AH0010020form2/*,_AH0010020form3/*', 'AH0010020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0010020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0010020', response);
expj.common.changeBusinessScreenTab('AH0010020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AH0010020.AH0010020button1.CsvImport.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0010020.AH0010020button1.CsvImport['onClick' + i])) {
        expj.AH0010020.AH0010020button1.CsvImport['onClick' + i]();
      }
    }
  }
};
expj.AH0010020.AH0010020button1.CsvImport.executeAllOnDecision = function () {
};
expj.AH0010020.AH0010020button1.CsvImport.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020button1-CsvImport').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010020', 'AH0010020button1', 'CsvImport', this, 'Button');
    }
  });
  expj.AH0010020.AH0010020button1.CsvImport.executePScriptOnLoad();
};

expj.AH0010020.AH0010020button1.CsvImport.executePScriptOnLoad = function () {
  console.log('execute AH0010020button1/CsvImport.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020button1-CsvImport');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0010020-AH0010020button1-CsvImport" name="CsvImport" class="AH0010020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvImport",rb)%></button><!-- CSV取込ボタン --></div><!--/td-->
<script class="expj-script-AH0010020-AH0010020button1-select">
expj.AH0010020.AH0010020button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AH0010020form1/*,_AH0010020form2/*,_AH0010020form3/*@AH0010020Servlet"
expj.AH0010020.AH0010020button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0010020', 'AH0010020button1', '_AH0010020form1/*,_AH0010020form2/*,_AH0010020form3/*', 'AH0010020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0010020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0010020', response);
expj.common.updateBusinessScreenTab('AH0010020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AH0010020.AH0010020button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0010020.AH0010020button1.select['onClick' + i])) {
        expj.AH0010020.AH0010020button1.select['onClick' + i]();
      }
    }
  }
};
expj.AH0010020.AH0010020button1.select.executeAllOnDecision = function () {
};
expj.AH0010020.AH0010020button1.select.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010020', 'AH0010020button1', 'select', this, 'Button');
    }
  });
  expj.AH0010020.AH0010020button1.select.executePScriptOnLoad();
};

expj.AH0010020.AH0010020button1.select.executePScriptOnLoad = function () {
  console.log('execute AH0010020button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0010020-AH0010020button1-select" name="select" class="AH0010020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AH0010020-AH0010020form2">
expj.AH0010020.AH0010020form2 = {};
expj.AH0010020.AH0010020form2.executeAllOnDecision = function () {
  console.log('execute AH0010020form2.onDecision');
};
expj.AH0010020.AH0010020form2.executeOnLoad = function () {
  expj.AH0010020.AH0010020form2.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AH0010020-AH0010020form2" action="AH0010020Servlet" name="AH0010020form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AH0010020-AH0010020form2-c_INV_FLG_JAN">
expj.AH0010020.AH0010020form2.c_INV_FLG_JAN = {};
expj.AH0010020.AH0010020form2.c_INV_FLG_JAN.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/c_INV_FLG_JAN.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.c_INV_FLG_JAN.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-c_INV_FLG_JAN').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010020', 'AH0010020form2', 'c_INV_FLG_JAN', this, 'CheckBox');
    }
  });
  expj.AH0010020.AH0010020form2.c_INV_FLG_JAN.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.c_INV_FLG_JAN.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/c_INV_FLG_JAN.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-c_INV_FLG_JAN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_INV_FLG_JAN" value="true" <%= ("true".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_JAN())) || "1".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_JAN())))?"checked=\"checked\"":"" %>  class="AH0010020-focus-move" id="expj-AH0010020-AH0010020form2-c_INV_FLG_JAN"><label for="expj-AH0010020-AH0010020form2-c_INV_FLG_JAN"><%=CoreTools.getRBString("Expj.Cmt0119",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-AH0010020-AH0010020form2-h_INV_FLG_JAN" name="h_INV_FLG_JAN" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0010020Struct.geth_INV_FLG_JAN()) %>">
<script class="expj-script-AH0010020-AH0010020form2-h_INV_FLG_JAN">
expj.AH0010020.AH0010020form2.h_INV_FLG_JAN = {};
expj.AH0010020.AH0010020form2.h_INV_FLG_JAN.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/h_INV_FLG_JAN.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.h_INV_FLG_JAN.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-h_INV_FLG_JAN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0010020', 'AH0010020form2', 'h_INV_FLG_JAN', this);
  });
  expj.AH0010020.AH0010020form2.h_INV_FLG_JAN.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.h_INV_FLG_JAN.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/h_INV_FLG_JAN.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-h_INV_FLG_JAN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AH0010020-AH0010020form2-h_INV_FLG_FEB" name="h_INV_FLG_FEB" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0010020Struct.geth_INV_FLG_FEB()) %>">
<script class="expj-script-AH0010020-AH0010020form2-h_INV_FLG_FEB">
expj.AH0010020.AH0010020form2.h_INV_FLG_FEB = {};
expj.AH0010020.AH0010020form2.h_INV_FLG_FEB.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/h_INV_FLG_FEB.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.h_INV_FLG_FEB.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-h_INV_FLG_FEB').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0010020', 'AH0010020form2', 'h_INV_FLG_FEB', this);
  });
  expj.AH0010020.AH0010020form2.h_INV_FLG_FEB.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.h_INV_FLG_FEB.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/h_INV_FLG_FEB.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-h_INV_FLG_FEB');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AH0010020-AH0010020form2-h_INV_FLG_MAR" name="h_INV_FLG_MAR" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0010020Struct.geth_INV_FLG_MAR()) %>">
<script class="expj-script-AH0010020-AH0010020form2-h_INV_FLG_MAR">
expj.AH0010020.AH0010020form2.h_INV_FLG_MAR = {};
expj.AH0010020.AH0010020form2.h_INV_FLG_MAR.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/h_INV_FLG_MAR.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.h_INV_FLG_MAR.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-h_INV_FLG_MAR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0010020', 'AH0010020form2', 'h_INV_FLG_MAR', this);
  });
  expj.AH0010020.AH0010020form2.h_INV_FLG_MAR.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.h_INV_FLG_MAR.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/h_INV_FLG_MAR.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-h_INV_FLG_MAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AH0010020-AH0010020form2-c_INV_FLG_JUL">
expj.AH0010020.AH0010020form2.c_INV_FLG_JUL = {};
expj.AH0010020.AH0010020form2.c_INV_FLG_JUL.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/c_INV_FLG_JUL.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.c_INV_FLG_JUL.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-c_INV_FLG_JUL').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010020', 'AH0010020form2', 'c_INV_FLG_JUL', this, 'CheckBox');
    }
  });
  expj.AH0010020.AH0010020form2.c_INV_FLG_JUL.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.c_INV_FLG_JUL.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/c_INV_FLG_JUL.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-c_INV_FLG_JUL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c_INV_FLG_JUL" value="true" <%= ("true".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_JUL())) || "1".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_JUL())))?"checked=\"checked\"":"" %>  class="AH0010020-focus-move" id="expj-AH0010020-AH0010020form2-c_INV_FLG_JUL"><label for="expj-AH0010020-AH0010020form2-c_INV_FLG_JUL"><%=CoreTools.getRBString("Expj.Cmt0125",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-AH0010020-AH0010020form2-h_INV_FLG_APR" name="h_INV_FLG_APR" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0010020Struct.geth_INV_FLG_APR()) %>">
<script class="expj-script-AH0010020-AH0010020form2-h_INV_FLG_APR">
expj.AH0010020.AH0010020form2.h_INV_FLG_APR = {};
expj.AH0010020.AH0010020form2.h_INV_FLG_APR.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/h_INV_FLG_APR.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.h_INV_FLG_APR.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-h_INV_FLG_APR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0010020', 'AH0010020form2', 'h_INV_FLG_APR', this);
  });
  expj.AH0010020.AH0010020form2.h_INV_FLG_APR.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.h_INV_FLG_APR.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/h_INV_FLG_APR.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-h_INV_FLG_APR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AH0010020-AH0010020form2-h_INV_FLG_MAY" name="h_INV_FLG_MAY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0010020Struct.geth_INV_FLG_MAY()) %>">
<script class="expj-script-AH0010020-AH0010020form2-h_INV_FLG_MAY">
expj.AH0010020.AH0010020form2.h_INV_FLG_MAY = {};
expj.AH0010020.AH0010020form2.h_INV_FLG_MAY.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/h_INV_FLG_MAY.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.h_INV_FLG_MAY.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-h_INV_FLG_MAY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0010020', 'AH0010020form2', 'h_INV_FLG_MAY', this);
  });
  expj.AH0010020.AH0010020form2.h_INV_FLG_MAY.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.h_INV_FLG_MAY.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/h_INV_FLG_MAY.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-h_INV_FLG_MAY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AH0010020-AH0010020form2-h_INV_FLG_JUN" name="h_INV_FLG_JUN" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0010020Struct.geth_INV_FLG_JUN()) %>">
<script class="expj-script-AH0010020-AH0010020form2-h_INV_FLG_JUN">
expj.AH0010020.AH0010020form2.h_INV_FLG_JUN = {};
expj.AH0010020.AH0010020form2.h_INV_FLG_JUN.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/h_INV_FLG_JUN.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.h_INV_FLG_JUN.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-h_INV_FLG_JUN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0010020', 'AH0010020form2', 'h_INV_FLG_JUN', this);
  });
  expj.AH0010020.AH0010020form2.h_INV_FLG_JUN.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.h_INV_FLG_JUN.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/h_INV_FLG_JUN.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-h_INV_FLG_JUN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AH0010020-AH0010020form2-c_INV_FLG_FEB">
expj.AH0010020.AH0010020form2.c_INV_FLG_FEB = {};
expj.AH0010020.AH0010020form2.c_INV_FLG_FEB.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/c_INV_FLG_FEB.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.c_INV_FLG_FEB.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-c_INV_FLG_FEB').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010020', 'AH0010020form2', 'c_INV_FLG_FEB', this, 'CheckBox');
    }
  });
  expj.AH0010020.AH0010020form2.c_INV_FLG_FEB.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.c_INV_FLG_FEB.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/c_INV_FLG_FEB.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-c_INV_FLG_FEB');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_INV_FLG_FEB" value="true" <%= ("true".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_FEB())) || "1".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_FEB())))?"checked=\"checked\"":"" %>  class="AH0010020-focus-move" id="expj-AH0010020-AH0010020form2-c_INV_FLG_FEB"><label for="expj-AH0010020-AH0010020form2-c_INV_FLG_FEB"><%=CoreTools.getRBString("Expj.Cmt0120",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-AH0010020-AH0010020form2-h_INV_FLG_JUL" name="h_INV_FLG_JUL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0010020Struct.geth_INV_FLG_JUL()) %>">
<script class="expj-script-AH0010020-AH0010020form2-h_INV_FLG_JUL">
expj.AH0010020.AH0010020form2.h_INV_FLG_JUL = {};
expj.AH0010020.AH0010020form2.h_INV_FLG_JUL.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/h_INV_FLG_JUL.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.h_INV_FLG_JUL.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-h_INV_FLG_JUL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0010020', 'AH0010020form2', 'h_INV_FLG_JUL', this);
  });
  expj.AH0010020.AH0010020form2.h_INV_FLG_JUL.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.h_INV_FLG_JUL.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/h_INV_FLG_JUL.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-h_INV_FLG_JUL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AH0010020-AH0010020form2-h_INV_FLG_AUG" name="h_INV_FLG_AUG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0010020Struct.geth_INV_FLG_AUG()) %>">
<script class="expj-script-AH0010020-AH0010020form2-h_INV_FLG_AUG">
expj.AH0010020.AH0010020form2.h_INV_FLG_AUG = {};
expj.AH0010020.AH0010020form2.h_INV_FLG_AUG.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/h_INV_FLG_AUG.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.h_INV_FLG_AUG.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-h_INV_FLG_AUG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0010020', 'AH0010020form2', 'h_INV_FLG_AUG', this);
  });
  expj.AH0010020.AH0010020form2.h_INV_FLG_AUG.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.h_INV_FLG_AUG.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/h_INV_FLG_AUG.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-h_INV_FLG_AUG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AH0010020-AH0010020form2-h_INV_FLG_SEP" name="h_INV_FLG_SEP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0010020Struct.geth_INV_FLG_SEP()) %>">
<script class="expj-script-AH0010020-AH0010020form2-h_INV_FLG_SEP">
expj.AH0010020.AH0010020form2.h_INV_FLG_SEP = {};
expj.AH0010020.AH0010020form2.h_INV_FLG_SEP.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/h_INV_FLG_SEP.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.h_INV_FLG_SEP.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-h_INV_FLG_SEP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0010020', 'AH0010020form2', 'h_INV_FLG_SEP', this);
  });
  expj.AH0010020.AH0010020form2.h_INV_FLG_SEP.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.h_INV_FLG_SEP.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/h_INV_FLG_SEP.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-h_INV_FLG_SEP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AH0010020-AH0010020form2-c_INV_FLG_AUG">
expj.AH0010020.AH0010020form2.c_INV_FLG_AUG = {};
expj.AH0010020.AH0010020form2.c_INV_FLG_AUG.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/c_INV_FLG_AUG.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.c_INV_FLG_AUG.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-c_INV_FLG_AUG').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010020', 'AH0010020form2', 'c_INV_FLG_AUG', this, 'CheckBox');
    }
  });
  expj.AH0010020.AH0010020form2.c_INV_FLG_AUG.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.c_INV_FLG_AUG.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/c_INV_FLG_AUG.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-c_INV_FLG_AUG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c_INV_FLG_AUG" value="true" <%= ("true".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_AUG())) || "1".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_AUG())))?"checked=\"checked\"":"" %>  class="AH0010020-focus-move" id="expj-AH0010020-AH0010020form2-c_INV_FLG_AUG"><label for="expj-AH0010020-AH0010020form2-c_INV_FLG_AUG"><%=CoreTools.getRBString("Expj.Cmt0126",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-AH0010020-AH0010020form2-h_INV_FLG_OCT" name="h_INV_FLG_OCT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0010020Struct.geth_INV_FLG_OCT()) %>">
<script class="expj-script-AH0010020-AH0010020form2-h_INV_FLG_OCT">
expj.AH0010020.AH0010020form2.h_INV_FLG_OCT = {};
expj.AH0010020.AH0010020form2.h_INV_FLG_OCT.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/h_INV_FLG_OCT.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.h_INV_FLG_OCT.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-h_INV_FLG_OCT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0010020', 'AH0010020form2', 'h_INV_FLG_OCT', this);
  });
  expj.AH0010020.AH0010020form2.h_INV_FLG_OCT.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.h_INV_FLG_OCT.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/h_INV_FLG_OCT.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-h_INV_FLG_OCT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AH0010020-AH0010020form2-h_INV_FLG_NOV" name="h_INV_FLG_NOV" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0010020Struct.geth_INV_FLG_NOV()) %>">
<script class="expj-script-AH0010020-AH0010020form2-h_INV_FLG_NOV">
expj.AH0010020.AH0010020form2.h_INV_FLG_NOV = {};
expj.AH0010020.AH0010020form2.h_INV_FLG_NOV.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/h_INV_FLG_NOV.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.h_INV_FLG_NOV.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-h_INV_FLG_NOV').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0010020', 'AH0010020form2', 'h_INV_FLG_NOV', this);
  });
  expj.AH0010020.AH0010020form2.h_INV_FLG_NOV.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.h_INV_FLG_NOV.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/h_INV_FLG_NOV.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-h_INV_FLG_NOV');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AH0010020-AH0010020form2-h_INV_FLG_DEC" name="h_INV_FLG_DEC" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0010020Struct.geth_INV_FLG_DEC()) %>">
<script class="expj-script-AH0010020-AH0010020form2-h_INV_FLG_DEC">
expj.AH0010020.AH0010020form2.h_INV_FLG_DEC = {};
expj.AH0010020.AH0010020form2.h_INV_FLG_DEC.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/h_INV_FLG_DEC.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.h_INV_FLG_DEC.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-h_INV_FLG_DEC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0010020', 'AH0010020form2', 'h_INV_FLG_DEC', this);
  });
  expj.AH0010020.AH0010020form2.h_INV_FLG_DEC.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.h_INV_FLG_DEC.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/h_INV_FLG_DEC.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-h_INV_FLG_DEC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AH0010020-AH0010020form2-c_INV_FLG_MAR">
expj.AH0010020.AH0010020form2.c_INV_FLG_MAR = {};
expj.AH0010020.AH0010020form2.c_INV_FLG_MAR.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/c_INV_FLG_MAR.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.c_INV_FLG_MAR.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-c_INV_FLG_MAR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010020', 'AH0010020form2', 'c_INV_FLG_MAR', this, 'CheckBox');
    }
  });
  expj.AH0010020.AH0010020form2.c_INV_FLG_MAR.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.c_INV_FLG_MAR.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/c_INV_FLG_MAR.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-c_INV_FLG_MAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_INV_FLG_MAR" value="true" <%= ("true".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_MAR())) || "1".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_MAR())))?"checked=\"checked\"":"" %>  class="AH0010020-focus-move" id="expj-AH0010020-AH0010020form2-c_INV_FLG_MAR"><label for="expj-AH0010020-AH0010020form2-c_INV_FLG_MAR"><%=CoreTools.getRBString("Expj.Cmt0121",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AH0010020-AH0010020form2-c_INV_FLG_SEP">
expj.AH0010020.AH0010020form2.c_INV_FLG_SEP = {};
expj.AH0010020.AH0010020form2.c_INV_FLG_SEP.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/c_INV_FLG_SEP.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.c_INV_FLG_SEP.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-c_INV_FLG_SEP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010020', 'AH0010020form2', 'c_INV_FLG_SEP', this, 'CheckBox');
    }
  });
  expj.AH0010020.AH0010020form2.c_INV_FLG_SEP.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.c_INV_FLG_SEP.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/c_INV_FLG_SEP.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-c_INV_FLG_SEP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c_INV_FLG_SEP" value="true" <%= ("true".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_SEP())) || "1".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_SEP())))?"checked=\"checked\"":"" %>  class="AH0010020-focus-move" id="expj-AH0010020-AH0010020form2-c_INV_FLG_SEP"><label for="expj-AH0010020-AH0010020form2-c_INV_FLG_SEP"><%=CoreTools.getRBString("Expj.Cmt0127",rb)%></label></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AH0010020-AH0010020form2-c_INV_FLG_APR">
expj.AH0010020.AH0010020form2.c_INV_FLG_APR = {};
expj.AH0010020.AH0010020form2.c_INV_FLG_APR.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/c_INV_FLG_APR.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.c_INV_FLG_APR.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-c_INV_FLG_APR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010020', 'AH0010020form2', 'c_INV_FLG_APR', this, 'CheckBox');
    }
  });
  expj.AH0010020.AH0010020form2.c_INV_FLG_APR.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.c_INV_FLG_APR.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/c_INV_FLG_APR.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-c_INV_FLG_APR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_INV_FLG_APR" value="true" <%= ("true".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_APR())) || "1".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_APR())))?"checked=\"checked\"":"" %>  class="AH0010020-focus-move" id="expj-AH0010020-AH0010020form2-c_INV_FLG_APR"><label for="expj-AH0010020-AH0010020form2-c_INV_FLG_APR"><%=CoreTools.getRBString("Expj.Cmt0122",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AH0010020-AH0010020form2-c_INV_FLG_OCT">
expj.AH0010020.AH0010020form2.c_INV_FLG_OCT = {};
expj.AH0010020.AH0010020form2.c_INV_FLG_OCT.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/c_INV_FLG_OCT.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.c_INV_FLG_OCT.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-c_INV_FLG_OCT').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010020', 'AH0010020form2', 'c_INV_FLG_OCT', this, 'CheckBox');
    }
  });
  expj.AH0010020.AH0010020form2.c_INV_FLG_OCT.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.c_INV_FLG_OCT.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/c_INV_FLG_OCT.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-c_INV_FLG_OCT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c_INV_FLG_OCT" value="true" <%= ("true".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_OCT())) || "1".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_OCT())))?"checked=\"checked\"":"" %>  class="AH0010020-focus-move" id="expj-AH0010020-AH0010020form2-c_INV_FLG_OCT"><label for="expj-AH0010020-AH0010020form2-c_INV_FLG_OCT"><%=CoreTools.getRBString("Expj.Cmt0128",rb)%></label></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AH0010020-AH0010020form2-c_INV_FLG_MAY">
expj.AH0010020.AH0010020form2.c_INV_FLG_MAY = {};
expj.AH0010020.AH0010020form2.c_INV_FLG_MAY.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/c_INV_FLG_MAY.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.c_INV_FLG_MAY.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-c_INV_FLG_MAY').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010020', 'AH0010020form2', 'c_INV_FLG_MAY', this, 'CheckBox');
    }
  });
  expj.AH0010020.AH0010020form2.c_INV_FLG_MAY.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.c_INV_FLG_MAY.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/c_INV_FLG_MAY.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-c_INV_FLG_MAY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_INV_FLG_MAY" value="true" <%= ("true".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_MAY())) || "1".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_MAY())))?"checked=\"checked\"":"" %>  class="AH0010020-focus-move" id="expj-AH0010020-AH0010020form2-c_INV_FLG_MAY"><label for="expj-AH0010020-AH0010020form2-c_INV_FLG_MAY"><%=CoreTools.getRBString("Expj.Cmt0123",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AH0010020-AH0010020form2-c_INV_FLG_NOV">
expj.AH0010020.AH0010020form2.c_INV_FLG_NOV = {};
expj.AH0010020.AH0010020form2.c_INV_FLG_NOV.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/c_INV_FLG_NOV.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.c_INV_FLG_NOV.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-c_INV_FLG_NOV').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010020', 'AH0010020form2', 'c_INV_FLG_NOV', this, 'CheckBox');
    }
  });
  expj.AH0010020.AH0010020form2.c_INV_FLG_NOV.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.c_INV_FLG_NOV.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/c_INV_FLG_NOV.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-c_INV_FLG_NOV');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c_INV_FLG_NOV" value="true" <%= ("true".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_NOV())) || "1".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_NOV())))?"checked=\"checked\"":"" %>  class="AH0010020-focus-move" id="expj-AH0010020-AH0010020form2-c_INV_FLG_NOV"><label for="expj-AH0010020-AH0010020form2-c_INV_FLG_NOV"><%=CoreTools.getRBString("Expj.Cmt0129",rb)%></label></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AH0010020-AH0010020form2-c_INV_FLG_JUN">
expj.AH0010020.AH0010020form2.c_INV_FLG_JUN = {};
expj.AH0010020.AH0010020form2.c_INV_FLG_JUN.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/c_INV_FLG_JUN.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.c_INV_FLG_JUN.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-c_INV_FLG_JUN').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010020', 'AH0010020form2', 'c_INV_FLG_JUN', this, 'CheckBox');
    }
  });
  expj.AH0010020.AH0010020form2.c_INV_FLG_JUN.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.c_INV_FLG_JUN.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/c_INV_FLG_JUN.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-c_INV_FLG_JUN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_INV_FLG_JUN" value="true" <%= ("true".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_JUN())) || "1".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_JUN())))?"checked=\"checked\"":"" %>  class="AH0010020-focus-move" id="expj-AH0010020-AH0010020form2-c_INV_FLG_JUN"><label for="expj-AH0010020-AH0010020form2-c_INV_FLG_JUN"><%=CoreTools.getRBString("Expj.Cmt0124",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AH0010020-AH0010020form2-c_INV_FLG_DEC">
expj.AH0010020.AH0010020form2.c_INV_FLG_DEC = {};
expj.AH0010020.AH0010020form2.c_INV_FLG_DEC.executeAllOnDecision = function () {
  console.log('execute AH0010020form2/c_INV_FLG_DEC.onDecision');
  expj.AH0010020.AH0010020form2.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form2.c_INV_FLG_DEC.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form2-c_INV_FLG_DEC').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010020', 'AH0010020form2', 'c_INV_FLG_DEC', this, 'CheckBox');
    }
  });
  expj.AH0010020.AH0010020form2.c_INV_FLG_DEC.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form2.c_INV_FLG_DEC.executePScriptOnLoad = function () {
  console.log('execute AH0010020form2/c_INV_FLG_DEC.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form2-c_INV_FLG_DEC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c_INV_FLG_DEC" value="true" <%= ("true".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_DEC())) || "1".equals(TypeConverter.convert(aAH0010020Struct.getc_INV_FLG_DEC())))?"checked=\"checked\"":"" %>  class="AH0010020-focus-move" id="expj-AH0010020-AH0010020form2-c_INV_FLG_DEC"><label for="expj-AH0010020-AH0010020form2-c_INV_FLG_DEC"><%=CoreTools.getRBString("Expj.Cmt0130",rb)%></label></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AH0010020-AH0010020button2">
expj.AH0010020.AH0010020button2 = {};
expj.AH0010020.AH0010020button2.executeAllOnDecision = function () {
  console.log('execute AH0010020button2.onDecision');
};
expj.AH0010020.AH0010020button2.executeOnLoad = function () {
  expj.AH0010020.AH0010020button2.executePScriptOnLoad();
};

expj.AH0010020.AH0010020button2.executePScriptOnLoad = function () {
  console.log('execute AH0010020button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AH0010020-AH0010020button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AH0010020-AH0010020button2-update">
expj.AH0010020.AH0010020button2.update = {};
// script1="onClick;0;CHK;1[eq]1@*0"
expj.AH0010020.AH0010020button2.update.onClick0 = function () {
  console.log('update script1');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_AH0010020form2/c_INV_FLG_JAN[eq]true@*1,*2"
expj.AH0010020.AH0010020button2.update.child0 = function () {
  console.log('update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/c_INV_FLG_JAN'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;SET;_AH0010020form2/h_INV_FLG_JAN=1@*3"
expj.AH0010020.AH0010020button2.update.child1 = function () {
  console.log('update script3');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_JAN', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script4="child;2;SET;_AH0010020form2/h_INV_FLG_JAN=0@*3"
expj.AH0010020.AH0010020button2.update.child2 = function () {
  console.log('update script4');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_JAN', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;3;CHK;_AH0010020form2/c_INV_FLG_FEB[eq]true@*4,*5"
expj.AH0010020.AH0010020button2.update.child3 = function () {
  console.log('update script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/c_INV_FLG_FEB'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;4;SET;_AH0010020form2/h_INV_FLG_FEB=1@*6"
expj.AH0010020.AH0010020button2.update.child4 = function () {
  console.log('update script6');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_FEB', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script7="child;5;SET;_AH0010020form2/h_INV_FLG_FEB=0@*6"
expj.AH0010020.AH0010020button2.update.child5 = function () {
  console.log('update script7');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_FEB', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script8="child;6;CHK;_AH0010020form2/c_INV_FLG_MAR[eq]true@*7,*8"
expj.AH0010020.AH0010020button2.update.child6 = function () {
  console.log('update script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/c_INV_FLG_MAR'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script9="child;7;SET;_AH0010020form2/h_INV_FLG_MAR=1@*9"
expj.AH0010020.AH0010020button2.update.child7 = function () {
  console.log('update script9');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_MAR', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script10="child;8;SET;_AH0010020form2/h_INV_FLG_MAR=0@*9"
expj.AH0010020.AH0010020button2.update.child8 = function () {
  console.log('update script10');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_MAR', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script11="child;9;CHK;_AH0010020form2/c_INV_FLG_APR[eq]true@*10,*11"
expj.AH0010020.AH0010020button2.update.child9 = function () {
  console.log('update script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/c_INV_FLG_APR'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script12="child;10;SET;_AH0010020form2/h_INV_FLG_APR=1@*12"
expj.AH0010020.AH0010020button2.update.child10 = function () {
  console.log('update script12');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_APR', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child12)){this.child12();}}
};
// script13="child;11;SET;_AH0010020form2/h_INV_FLG_APR=0@*12"
expj.AH0010020.AH0010020button2.update.child11 = function () {
  console.log('update script13');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_APR', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child12)){this.child12();}}
};
// script14="child;12;CHK;_AH0010020form2/c_INV_FLG_MAY[eq]true@*13,*14"
expj.AH0010020.AH0010020button2.update.child12 = function () {
  console.log('update script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/c_INV_FLG_MAY'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script15="child;13;SET;_AH0010020form2/h_INV_FLG_MAY=1@*15"
expj.AH0010020.AH0010020button2.update.child13 = function () {
  console.log('update script15');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_MAY', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child15)){this.child15();}}
};
// script16="child;14;SET;_AH0010020form2/h_INV_FLG_MAY=0@*15"
expj.AH0010020.AH0010020button2.update.child14 = function () {
  console.log('update script16');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_MAY', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child15)){this.child15();}}
};
// script17="child;15;CHK;_AH0010020form2/c_INV_FLG_JUN[eq]true@*16,*17"
expj.AH0010020.AH0010020button2.update.child15 = function () {
  console.log('update script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/c_INV_FLG_JUN'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
} else {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script18="child;16;SET;_AH0010020form2/h_INV_FLG_JUN=1@*18"
expj.AH0010020.AH0010020button2.update.child16 = function () {
  console.log('update script18');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_JUN', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child18)){this.child18();}}
};
// script19="child;17;SET;_AH0010020form2/h_INV_FLG_JUN=0@*18"
expj.AH0010020.AH0010020button2.update.child17 = function () {
  console.log('update script19');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_JUN', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child18)){this.child18();}}
};
// script20="child;18;CHK;_AH0010020form2/c_INV_FLG_JUL[eq]true@*19,*20"
expj.AH0010020.AH0010020button2.update.child18 = function () {
  console.log('update script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/c_INV_FLG_JUL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
} else {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
// script21="child;19;SET;_AH0010020form2/h_INV_FLG_JUL=1@*21"
expj.AH0010020.AH0010020button2.update.child19 = function () {
  console.log('update script21');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_JUL', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child21)){this.child21();}}
};
// script22="child;20;SET;_AH0010020form2/h_INV_FLG_JUL=0@*21"
expj.AH0010020.AH0010020button2.update.child20 = function () {
  console.log('update script22');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_JUL', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child21)){this.child21();}}
};
// script23="child;21;CHK;_AH0010020form2/c_INV_FLG_AUG[eq]true@*22,*23"
expj.AH0010020.AH0010020button2.update.child21 = function () {
  console.log('update script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/c_INV_FLG_AUG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
} else {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
}
};
// script24="child;22;SET;_AH0010020form2/h_INV_FLG_AUG=1@*24"
expj.AH0010020.AH0010020button2.update.child22 = function () {
  console.log('update script24');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_AUG', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child24)){this.child24();}}
};
// script25="child;23;SET;_AH0010020form2/h_INV_FLG_AUG=0@*24"
expj.AH0010020.AH0010020button2.update.child23 = function () {
  console.log('update script25');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_AUG', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child24)){this.child24();}}
};
// script26="child;24;CHK;_AH0010020form2/c_INV_FLG_SEP[eq]true@*25,*26"
expj.AH0010020.AH0010020button2.update.child24 = function () {
  console.log('update script26');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/c_INV_FLG_SEP'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child25)){this.child25();}
} else {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
}
};
// script27="child;25;SET;_AH0010020form2/h_INV_FLG_SEP=1@*27"
expj.AH0010020.AH0010020button2.update.child25 = function () {
  console.log('update script27');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_SEP', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child27)){this.child27();}}
};
// script28="child;26;SET;_AH0010020form2/h_INV_FLG_SEP=0@*27"
expj.AH0010020.AH0010020button2.update.child26 = function () {
  console.log('update script28');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_SEP', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child27)){this.child27();}}
};
// script29="child;27;CHK;_AH0010020form2/c_INV_FLG_OCT[eq]true@*28,*29"
expj.AH0010020.AH0010020button2.update.child27 = function () {
  console.log('update script29');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/c_INV_FLG_OCT'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child28)){this.child28();}
} else {
if(expj.common.checkNameSpace(this.child29)){this.child29();}
}
};
// script30="child;28;SET;_AH0010020form2/h_INV_FLG_OCT=1@*30"
expj.AH0010020.AH0010020button2.update.child28 = function () {
  console.log('update script30');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_OCT', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child30)){this.child30();}}
};
// script31="child;29;SET;_AH0010020form2/h_INV_FLG_OCT=0@*30"
expj.AH0010020.AH0010020button2.update.child29 = function () {
  console.log('update script31');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_OCT', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child30)){this.child30();}}
};
// script32="child;30;CHK;_AH0010020form2/c_INV_FLG_NOV[eq]true@*31,*32"
expj.AH0010020.AH0010020button2.update.child30 = function () {
  console.log('update script32');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/c_INV_FLG_NOV'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child31)){this.child31();}
} else {
if(expj.common.checkNameSpace(this.child32)){this.child32();}
}
};
// script33="child;31;SET;_AH0010020form2/h_INV_FLG_NOV=1@*33"
expj.AH0010020.AH0010020button2.update.child31 = function () {
  console.log('update script33');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_NOV', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child33)){this.child33();}}
};
// script34="child;32;SET;_AH0010020form2/h_INV_FLG_NOV=0@*33"
expj.AH0010020.AH0010020button2.update.child32 = function () {
  console.log('update script34');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_NOV', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child33)){this.child33();}}
};
// script35="child;33;CHK;_AH0010020form2/c_INV_FLG_DEC[eq]true@*34,*35"
expj.AH0010020.AH0010020button2.update.child33 = function () {
  console.log('update script35');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/c_INV_FLG_DEC'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child34)){this.child34();}
} else {
if(expj.common.checkNameSpace(this.child35)){this.child35();}
}
};
// script36="child;34;SET;_AH0010020form2/h_INV_FLG_DEC=1@*36"
expj.AH0010020.AH0010020button2.update.child34 = function () {
  console.log('update script36');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_DEC', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child36)){this.child36();}}
};
// script37="child;35;SET;_AH0010020form2/h_INV_FLG_DEC=0@*36"
expj.AH0010020.AH0010020button2.update.child35 = function () {
  console.log('update script37');
expj.common.pscript.setReferenceComponentValue('AH0010020', 'AH0010020button2', '_AH0010020form2/h_INV_FLG_DEC', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child36)){this.child36();}}
};
// script38="child;36;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AH0010020form1/*,_AH0010020form2/*,_AH0010020form3/*@AH0010020Servlet,,$ZZ07003"
expj.AH0010020.AH0010020button2.update.child36 = function () {
  console.log('update script38');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0010020', 'AH0010020button2', '_AH0010020form1/*,_AH0010020form2/*,_AH0010020form3/*', 'AH0010020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0010020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0010020', response);
expj.common.updateBusinessScreenTab('AH0010020', contents);
};
expj.common.pscript.callConfirm('AH0010020', 'AH0010020button2', 'ZZ07003', okEvent);
};
expj.AH0010020.AH0010020button2.update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0010020.AH0010020button2.update['onClick' + i])) {
        expj.AH0010020.AH0010020button2.update['onClick' + i]();
      }
    }
  }
};
expj.AH0010020.AH0010020button2.update.executeAllOnDecision = function () {
};
expj.AH0010020.AH0010020button2.update.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020button2-update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010020', 'AH0010020button2', 'update', this, 'Button');
    }
  });
  expj.AH0010020.AH0010020button2.update.executePScriptOnLoad();
};

expj.AH0010020.AH0010020button2.update.executePScriptOnLoad = function () {
  console.log('execute AH0010020button2/update.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020button2-update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0010020-AH0010020button2-update" name="update" class="AH0010020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style=""><script class="expj-script-AH0010020-AH0010020form3">
expj.AH0010020.AH0010020form3 = {};
expj.AH0010020.AH0010020form3.executeAllOnDecision = function () {
  console.log('execute AH0010020form3.onDecision');
};
expj.AH0010020.AH0010020form3.executeOnLoad = function () {
  expj.AH0010020.AH0010020form3.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form3.executePScriptOnLoad = function () {
  console.log('execute AH0010020form3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AH0010020-AH0010020form3" action="AH0010020Servlet" name="AH0010020form3" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:96px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:96px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DRAW_CD",rb)%></span><!-- 図面番号 --></div><!--/td-->
<script class="expj-script-AH0010020-AH0010020form3-w_DRAW_CD">
expj.AH0010020.AH0010020form3.w_DRAW_CD = {};
expj.AH0010020.AH0010020form3.w_DRAW_CD.executeAllOnDecision = function () {
  console.log('execute AH0010020form3/w_DRAW_CD.onDecision');
  expj.AH0010020.AH0010020form3.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form3.w_DRAW_CD.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form3-w_DRAW_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0010020', 'AH0010020form3', 'w_DRAW_CD', this);
  });
  expj.AH0010020.AH0010020form3.w_DRAW_CD.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form3.w_DRAW_CD.executePScriptOnLoad = function () {
  console.log('execute AH0010020form3/w_DRAW_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form3-w_DRAW_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AH0010020-AH0010020form3-w_DRAW_CD" name="w_DRAW_CD" class="AH0010020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0010020Struct.getw_DRAW_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_SPEC",rb)%></span><!-- 規格 --></div><!--/td-->
<script class="expj-script-AH0010020-AH0010020form3-w_SPEC">
expj.AH0010020.AH0010020form3.w_SPEC = {};
expj.AH0010020.AH0010020form3.w_SPEC.executeAllOnDecision = function () {
  console.log('execute AH0010020form3/w_SPEC.onDecision');
  expj.AH0010020.AH0010020form3.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form3.w_SPEC.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form3-w_SPEC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0010020', 'AH0010020form3', 'w_SPEC', this);
  });
  expj.AH0010020.AH0010020form3.w_SPEC.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form3.w_SPEC.executePScriptOnLoad = function () {
  console.log('execute AH0010020form3/w_SPEC.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form3-w_SPEC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AH0010020-AH0010020form3-w_SPEC" name="w_SPEC" class="AH0010020-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0010020Struct.getw_SPEC()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)%></span><!-- 品目手配区分 --></div><!--/td-->
<script class="expj-script-AH0010020-AH0010020form3-w_MRP_ODR_TYP">
expj.AH0010020.AH0010020form3.w_MRP_ODR_TYP = {};
expj.AH0010020.AH0010020form3.w_MRP_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute AH0010020form3/w_MRP_ODR_TYP.onDecision');
  expj.AH0010020.AH0010020form3.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form3.w_MRP_ODR_TYP.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form3-w_MRP_ODR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0010020', 'AH0010020form3', 'w_MRP_ODR_TYP', this);
  });
  expj.AH0010020.AH0010020form3.w_MRP_ODR_TYP.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form3.w_MRP_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute AH0010020form3/w_MRP_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form3-w_MRP_ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AH0010020-AH0010020form3-w_MRP_ODR_TYP" name="w_MRP_ODR_TYP" class="AH0010020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0010020Struct.getw_MRP_ODR_TYP()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)%></span><!-- 内外作区分 --></div><!--/td-->
<script class="expj-script-AH0010020-AH0010020form3-w_OUTSIDE_TYP">
expj.AH0010020.AH0010020form3.w_OUTSIDE_TYP = {};
expj.AH0010020.AH0010020form3.w_OUTSIDE_TYP.executeAllOnDecision = function () {
  console.log('execute AH0010020form3/w_OUTSIDE_TYP.onDecision');
  expj.AH0010020.AH0010020form3.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form3.w_OUTSIDE_TYP.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form3-w_OUTSIDE_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0010020', 'AH0010020form3', 'w_OUTSIDE_TYP', this);
  });
  expj.AH0010020.AH0010020form3.w_OUTSIDE_TYP.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form3.w_OUTSIDE_TYP.executePScriptOnLoad = function () {
  console.log('execute AH0010020form3/w_OUTSIDE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form3-w_OUTSIDE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AH0010020-AH0010020form3-w_OUTSIDE_TYP" name="w_OUTSIDE_TYP" class="AH0010020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0010020Struct.getw_OUTSIDE_TYP()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ABC_TYP",rb)%></span><!-- 棚卸区分 --></div><!--/td-->
<script class="expj-script-AH0010020-AH0010020form3-w_ABC_TYP">
expj.AH0010020.AH0010020form3.w_ABC_TYP = {};
expj.AH0010020.AH0010020form3.w_ABC_TYP.executeAllOnDecision = function () {
  console.log('execute AH0010020form3/w_ABC_TYP.onDecision');
  expj.AH0010020.AH0010020form3.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010020form3.w_ABC_TYP.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020form3-w_ABC_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0010020', 'AH0010020form3', 'w_ABC_TYP', this);
  });
  expj.AH0010020.AH0010020form3.w_ABC_TYP.executePScriptOnLoad();
};

expj.AH0010020.AH0010020form3.w_ABC_TYP.executePScriptOnLoad = function () {
  console.log('execute AH0010020form3/w_ABC_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020form3-w_ABC_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AH0010020-AH0010020form3-w_ABC_TYP" name="w_ABC_TYP" class="AH0010020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0010020Struct.getw_ABC_TYP()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame18" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame19" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame20 button-area-left" style="width:60px;"></div><!--/td-->
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
<span class="version">AH0010020 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AH0010020-AH0010020button0">
expj.AH0010020.AH0010020button0 = {};
expj.AH0010020.AH0010020button0.executeAllOnDecision = function () {
  console.log('execute AH0010020button0.onDecision');
};
expj.AH0010020.AH0010020button0.executeOnLoad = function () {
  expj.AH0010020.AH0010020button0.executePScriptOnLoad();
};

expj.AH0010020.AH0010020button0.executePScriptOnLoad = function () {
  console.log('execute AH0010020button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AH0010020-AH0010020button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AH0010020-AH0010020button0-clear">
expj.AH0010020.AH0010020button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AH0010020form1/*,_AH0010020form2/*,_AH0010020form3/*@AH0010020Servlet,,$ZZ07008"
expj.AH0010020.AH0010020button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0010020', 'AH0010020button0', '_AH0010020form1/*,_AH0010020form2/*,_AH0010020form3/*', 'AH0010020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0010020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0010020', response);
expj.common.updateBusinessScreenTab('AH0010020', contents);
};
expj.common.pscript.callConfirm('AH0010020', 'AH0010020button0', 'ZZ07008', okEvent);
};
expj.AH0010020.AH0010020button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0010020.AH0010020button0.clear['onClick' + i])) {
        expj.AH0010020.AH0010020button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AH0010020.AH0010020button0.clear.executeAllOnDecision = function () {
};
expj.AH0010020.AH0010020button0.clear.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010020', 'AH0010020button0', 'clear', this, 'Button');
    }
  });
  expj.AH0010020.AH0010020button0.clear.executePScriptOnLoad();
};

expj.AH0010020.AH0010020button0.clear.executePScriptOnLoad = function () {
  console.log('execute AH0010020button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0010020-AH0010020button0-clear" name="clear" class="AH0010020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AH0010020-AH0010020button0-close">
expj.AH0010020.AH0010020button0.close = {};
// script1="onClick;0;CLOSE"
expj.AH0010020.AH0010020button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AH0010020');
};
expj.AH0010020.AH0010020button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0010020.AH0010020button0.close['onClick' + i])) {
        expj.AH0010020.AH0010020button0.close['onClick' + i]();
      }
    }
  }
};
expj.AH0010020.AH0010020button0.close.executeAllOnDecision = function () {
};
expj.AH0010020.AH0010020button0.close.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010020button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010020', 'AH0010020button0', 'close', this, 'Button');
    }
  });
  expj.AH0010020.AH0010020button0.close.executePScriptOnLoad();
};

expj.AH0010020.AH0010020button0.close.executePScriptOnLoad = function () {
  console.log('execute AH0010020button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010020button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0010020-AH0010020button0-close" name="close" class="AH0010020-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AH0010020 (END)-->
<%
MessageStruct msgStruct = aAH0010020Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AH0010020-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AH0010020)) {
  expj.common.treeInstanceMap.AH0010020 = {};
}
expj.common.treeInstanceMap.AH0010020.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AH0010020.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AH0010020.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AH0010020.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AH0010020.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AH0010020.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AH0010020.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AH0010020.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AH0010020.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AH0010020-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AH0010020-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0010020)) {
  expj.common.detailDialogMap.AH0010020 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0010020._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AH0010020._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0010020.<%=detailId %>)) {
  expj.common.detailDialogMap.AH0010020.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0010020.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AH0010020.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0010020.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AH0010020.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AH0010020.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AH0010020.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AH0010020-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AH0010020.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AH0010020-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AH0010020.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AH0010020-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AH0010020.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AH0010020.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AH0010020.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AH0010020._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AH0010020-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AH0010020)) {
  expj.common.viewInstanceMap.AH0010020 = {};
}
expj.common.viewInstanceMap.AH0010020.<%=viewId %> = {};
expj.common.viewInstanceMap.AH0010020.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AH0010020.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AH0010020.<%=viewId %>.init = function () {
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
    expj.AH0010020.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AH0010020.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AH0010020-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AH0010020-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AH0010020_init">
/**
 * AH0010020用のロード完了時初期化関数
 */
expj.AH0010020.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AH0010020');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AH0010020');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AH0010020');
  expj.common.calendarInstanceMap.AH0010020 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AH0010020.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AH0010020.<%=detailId %>.init();
  expj.common.detailDialogMap.AH0010020.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AH0010020.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AH0010020.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AH0010020');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AH0010020');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AH0010020-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AH0010020-<%=detailId %>');
<%
 }
%>
  try{expj.AH0010020.AH0010020form1.w_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form1.PeekerWItemCd.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form1.w_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form1.h_saveITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020button1.CsvImport.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020button1.select.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.c_INV_FLG_JAN.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.h_INV_FLG_JAN.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.h_INV_FLG_FEB.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.h_INV_FLG_MAR.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.c_INV_FLG_JUL.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.h_INV_FLG_APR.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.h_INV_FLG_MAY.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.h_INV_FLG_JUN.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.c_INV_FLG_FEB.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.h_INV_FLG_JUL.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.h_INV_FLG_AUG.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.h_INV_FLG_SEP.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.c_INV_FLG_AUG.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.h_INV_FLG_OCT.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.h_INV_FLG_NOV.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.h_INV_FLG_DEC.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.c_INV_FLG_MAR.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.c_INV_FLG_SEP.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.c_INV_FLG_APR.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.c_INV_FLG_OCT.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.c_INV_FLG_MAY.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.c_INV_FLG_NOV.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.c_INV_FLG_JUN.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.c_INV_FLG_DEC.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020button2.update.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form3.w_DRAW_CD.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form3.w_SPEC.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form3.w_MRP_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form3.w_OUTSIDE_TYP.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form3.w_ABC_TYP.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020button0.clear.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020button0.close.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form1.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020button1.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form2.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020button2.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020form3.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010020button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AH0010020.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AH0010020', 'AH0010020');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AH0010020');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AH0010020-focus-move');
  // 初期フォーカス当てる処理
  $('.AH0010020-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AH0010020', '<%=request.getContextPath() %>');
};

/**
 * AH0010020の全体onDecision処理
 */
expj.AH0010020.executeAllOnDecision = function () {
  expj.AH0010020.AH0010020form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AH0010020_console">
expj.AH0010020.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>