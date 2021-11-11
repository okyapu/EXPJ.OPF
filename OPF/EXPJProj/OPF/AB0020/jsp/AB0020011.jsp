<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:26:42 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AB0020\AB0020011.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AB0020.*" %>
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
<jsp:useBean id="aAB0020010Control" class="com.nec.jp.orteus.metamorBase.AB0020.AB0020010Control" scope="request"/>
<jsp:useBean id="aAB0020010Struct" class="com.nec.jp.orteus.metamorBase.AB0020.AB0020010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

生産計画メンテナンス（製番）サブ1
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AB0020/jsp/AB0020011.jsp,v $
$Author: geng-jia $    
$Revision: 1.26 $ $Date: 2017/02/22 02:04:20 $
********************************************************* --%>
<html>
<head>
<title>生産計画メンテナンス（製番）サブ1</title>
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
<script class="expj-script-AB0020010_init">
  // AB0020010名前空間
  expj.AB0020010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

<% String CallButton = aAB0020010Control.getButton(); %>
  <div id="expj-business-screen-AB0020010" data-screen="AB0020011" data-newdata="<%=aAB0020010Control.isNewData() %>">
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
              <script class="expj-script-AB0020010-AB0020011form1">
expj.AB0020010.AB0020011form1 = {};
// script1="onLoad;0;CALL;child@0,7,18,31"
expj.AB0020010.AB0020011form1.onLoad0 = function () {
  console.log('AB0020011form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child7)){this.child7();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child18)){this.child18();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child31)){this.child31();}
};
// script2="child;0;CHK;<%=CallButton%>[eq]append[or]<%=CallButton%>[eq]insertSub1@*1,*4"
expj.AB0020010.AB0020011form1.child0 = function () {
  console.log('AB0020011form1 script2');
if (expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'append') || expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'insertSub1')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script3="child;1;MASK;_AB0020011button1/updateSub1@*2"
expj.AB0020010.AB0020011form1.child1 = function () {
  console.log('AB0020011form1 script3');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020011form1', '_AB0020011button1/updateSub1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script4="child;2;MASK;_AB0020011form2/c_JOB_ODR_DEL_FLG,_AB0020011form2/c_JOB_ODR_EXP_TYP@*3"
expj.AB0020010.AB0020011form1.child2 = function () {
  console.log('AB0020011form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020011form1', '_AB0020011form2/c_JOB_ODR_DEL_FLG');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020011form1', '_AB0020011form2/c_JOB_ODR_EXP_TYP');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;3;SET;_AB0020011form2/c_JOB_ODR_STS_TYP=true,_AB0020011form1/STS_FLG=true"
expj.AB0020010.AB0020011form1.child3 = function () {
  console.log('AB0020011form1 script5');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/c_JOB_ODR_STS_TYP', 'true');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form1/STS_FLG', 'true');
};
// script6="child;4;MASK;_AB0020011button1/insertSub1@*5"
expj.AB0020010.AB0020011form1.child4 = function () {
  console.log('AB0020011form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020011form1', '_AB0020011button1/insertSub1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script7="child;5;SET;_AB0020011form2/c_AUTO_NUM=true@*6"
expj.AB0020010.AB0020011form1.child5 = function () {
  console.log('AB0020011form1 script7');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/c_AUTO_NUM', 'true');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script8="child;6;MASK;_AB0020011form2/c_AUTO_NUM"
expj.AB0020010.AB0020011form1.child6 = function () {
  console.log('AB0020011form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020011form1', '_AB0020011form2/c_AUTO_NUM');
};
// script10="child;7;CHK;<%=CallButton%>[eq]modify[or]<%=CallButton%>[eq]updateSub1@*8"
expj.AB0020010.AB0020011form1.child7 = function () {
  console.log('AB0020011form1 script10');
if (expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'modify') || expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'updateSub1')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script11="child;8;CHK;_AB0020011form2/JOB_ODR_STS_TYP[eq]1@*9,*10"
expj.AB0020010.AB0020011form1.child8 = function () {
  console.log('AB0020011form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/JOB_ODR_STS_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script12="child;9;SET;_AB0020011form2/c_JOB_ODR_STS_TYP=false,_AB0020011form2/c_JOB_ODR_EXP_TYP=false,_AB0020011form2/c_JOB_ODR_DEL_FLG=false"
expj.AB0020010.AB0020011form1.child9 = function () {
  console.log('AB0020011form1 script12');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/c_JOB_ODR_STS_TYP', 'false');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/c_JOB_ODR_EXP_TYP', 'false');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/c_JOB_ODR_DEL_FLG', 'false');
};
// script13="child;10;CHK;_AB0020011form2/JOB_ODR_STS_TYP[eq]2@*11,*12"
expj.AB0020010.AB0020011form1.child10 = function () {
  console.log('AB0020011form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/JOB_ODR_STS_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script14="child;11;SET;_AB0020011form2/c_JOB_ODR_STS_TYP=true,_AB0020011form1/STS_FLG=true,_AB0020011form2/c_JOB_ODR_EXP_TYP=false,_AB0020011form2/c_JOB_ODR_DEL_FLG=false"
expj.AB0020010.AB0020011form1.child11 = function () {
  console.log('AB0020011form1 script14');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/c_JOB_ODR_STS_TYP', 'true');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form1/STS_FLG', 'true');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/c_JOB_ODR_EXP_TYP', 'false');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/c_JOB_ODR_DEL_FLG', 'false');
};
// script15="child;12;SET;_AB0020011form2/c_JOB_ODR_STS_TYP=true,_AB0020011form1/STS_FLG=true@*13"
expj.AB0020010.AB0020011form1.child12 = function () {
  console.log('AB0020011form1 script15');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/c_JOB_ODR_STS_TYP', 'true');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form1/STS_FLG', 'true');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child13)){this.child13();}}
};
// script16="child;13;CHK;_AB0020011form2/JOB_ODR_EXP_TYP[eq]1@*14,*15"
expj.AB0020010.AB0020011form1.child13 = function () {
  console.log('AB0020011form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/JOB_ODR_EXP_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script17="child;14;SET;_AB0020011form2/c_JOB_ODR_EXP_TYP=true,_AB0020011form1/EXP_FLG=true,_AB0020011form2/c_JOB_ODR_DEL_FLG=false"
expj.AB0020010.AB0020011form1.child14 = function () {
  console.log('AB0020011form1 script17');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/c_JOB_ODR_EXP_TYP', 'true');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form1/EXP_FLG', 'true');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/c_JOB_ODR_DEL_FLG', 'false');
};
// script18="child;15;CHK;_AB0020011form2/JOB_ODR_DEL_FLG[eq]0@*16,*17"
expj.AB0020010.AB0020011form1.child15 = function () {
  console.log('AB0020011form1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/JOB_ODR_DEL_FLG'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
} else {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script19="child;16;SET;_AB0020011form2/c_JOB_ODR_EXP_TYP=false,_AB0020011form2/c_JOB_ODR_DEL_FLG=false"
expj.AB0020010.AB0020011form1.child16 = function () {
  console.log('AB0020011form1 script19');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/c_JOB_ODR_EXP_TYP', 'false');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/c_JOB_ODR_DEL_FLG', 'false');
};
// script20="child;17;SET;_AB0020011form2/c_JOB_ODR_EXP_TYP=false,_AB0020011form2/c_JOB_ODR_DEL_FLG=true,_AB0020011form1/DEL_FLG=true"
expj.AB0020010.AB0020011form1.child17 = function () {
  console.log('AB0020011form1 script20');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/c_JOB_ODR_EXP_TYP', 'false');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/c_JOB_ODR_DEL_FLG', 'true');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form1/DEL_FLG', 'true');
};
// script21="child;18;CHK;<%=CallButton%>[eq]modify[or]<%=CallButton%>[eq]updateSub1@*19"
expj.AB0020010.AB0020011form1.child18 = function () {
  console.log('AB0020011form1 script21');
if (expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'modify') || expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'updateSub1')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script22="child;19;CHK;_AB0020011form2/JOB_ODR_STS_TYP[neq]1@*20,*21"
expj.AB0020010.AB0020011form1.child19 = function () {
  console.log('AB0020011form1 script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/JOB_ODR_STS_TYP'), '[neq]', '1')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
} else {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
}
};
// script23="child;20;CHK;_AB0020011form2/JOB_ODR_STS_TYP[eq]2@*21,*22"
expj.AB0020010.AB0020011form1.child20 = function () {
  console.log('AB0020011form1 script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/JOB_ODR_STS_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
} else {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script24="child;21;MASK;_AB0020011form2/c_JOB_ODR_EXP_TYP"
expj.AB0020010.AB0020011form1.child21 = function () {
  console.log('AB0020011form1 script24');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020011form1', '_AB0020011form2/c_JOB_ODR_EXP_TYP');
};
// script25="child;22;MASK;_AB0020011form2/c_JOB_ODR_STS_TYP,_AB0020011form2/JOB_ODR_TYP,_AB0020011form2/ALC_GRP_CD"
expj.AB0020010.AB0020011form1.child22 = function () {
  console.log('AB0020011form1 script25');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020011form1', '_AB0020011form2/c_JOB_ODR_STS_TYP');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020011form1', '_AB0020011form2/JOB_ODR_TYP');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020011form1', '_AB0020011form2/ALC_GRP_CD');
};
// script26="onLoad;1;CALL;onDecision@0,1"
expj.AB0020010.AB0020011form1.onLoad1 = function () {
  console.log('AB0020011form1 script26');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script27="onDecision;0;CHKRQ;B@*23,*28"
expj.AB0020010.AB0020011form1.onDecision0 = function () {
  console.log('AB0020011form1 script27');
if (expj.common.pscript.satisfiedRequiredComponent('AB0020010', 'B')) {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
} else {
if(expj.common.checkNameSpace(this.child28)){this.child28();}
}
};
// script28="child;23;CHK;_AB0020011form2/c_AUTO_NUM[neq]true@*24,*25"
expj.AB0020010.AB0020011form1.child23 = function () {
  console.log('AB0020011form1 script28');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/c_AUTO_NUM'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
} else {
if(expj.common.checkNameSpace(this.child25)){this.child25();}
}
};
// script29="child;24;CHKRQ;A@*25,*28"
expj.AB0020010.AB0020011form1.child24 = function () {
  console.log('AB0020011form1 script29');
if (expj.common.pscript.satisfiedRequiredComponent('AB0020010', 'A')) {
if(expj.common.checkNameSpace(this.child25)){this.child25();}
} else {
if(expj.common.checkNameSpace(this.child28)){this.child28();}
}
};
// script30="child;25;CHK;<%=CallButton%>[eq]append[or]<%=CallButton%>[eq]insertSub1@*26,*27"
expj.AB0020010.AB0020011form1.child25 = function () {
  console.log('AB0020011form1 script30');
if (expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'append') || expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'insertSub1')) {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
} else {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
}
};
// script31="child;26;UNMASK;_AB0020011button1/insertSub1"
expj.AB0020010.AB0020011form1.child26 = function () {
  console.log('AB0020011form1 script31');
expj.common.pscript.setUnMaskToReferenceComponent('AB0020010', 'AB0020011form1', '_AB0020011button1/insertSub1');
};
// script32="child;27;UNMASK;_AB0020011button1/updateSub1"
expj.AB0020010.AB0020011form1.child27 = function () {
  console.log('AB0020011form1 script32');
expj.common.pscript.setUnMaskToReferenceComponent('AB0020010', 'AB0020011form1', '_AB0020011button1/updateSub1');
};
// script33="child;28;MASK;_AB0020011button1/insertSub1,_AB0020011button1/updateSub1"
expj.AB0020010.AB0020011form1.child28 = function () {
  console.log('AB0020011form1 script33');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020011form1', '_AB0020011button1/insertSub1');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020011form1', '_AB0020011button1/updateSub1');
};
// script34="onDecision;1;CHK;_AB0020011form2/TIME_CTRL[eq]true@*29,*30"
expj.AB0020010.AB0020011form1.onDecision1 = function () {
  console.log('AB0020011form1 script34');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child29)){this.child29();}
} else {
if(expj.common.checkNameSpace(this.child30)){this.child30();}
}
};
// script35="child;29;UNMASK;_AB0020011form2/JOB_ODR_DLV_DATE_TIME"
expj.AB0020010.AB0020011form1.child29 = function () {
  console.log('AB0020011form1 script35');
expj.common.pscript.setUnMaskToReferenceComponent('AB0020010', 'AB0020011form1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME');
};
// script36="child;30;MASK;_AB0020011form2/JOB_ODR_DLV_DATE_TIME"
expj.AB0020010.AB0020011form1.child30 = function () {
  console.log('AB0020011form1 script36');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020011form1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME');
};
// script37="child;31;CHK;<%=CallButton%>[eq]append@*32"
expj.AB0020010.AB0020011form1.child31 = function () {
  console.log('AB0020011form1 script37');
if (expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'append')) {
if(expj.common.checkNameSpace(this.child32)){this.child32();}
}
};
// script38="child;32;CHK;_AB0020011form2/h_PRD_REQ_JOB_ODR_TYP_2[eq]0@*33"
expj.AB0020010.AB0020011form1.child32 = function () {
  console.log('AB0020011form1 script38');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/h_PRD_REQ_JOB_ODR_TYP_2'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child33)){this.child33();}
}
};
// script39="child;33;SET;_AB0020011form2/c_AUTO_NUM=true"
expj.AB0020010.AB0020011form1.child33 = function () {
  console.log('AB0020011form1 script39');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011form1', '_AB0020011form2/c_AUTO_NUM', 'true');
};
expj.AB0020010.AB0020011form1.executeAllOnDecision = function () {
  console.log('execute AB0020011form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0020010.AB0020011form1['onDecision' + i])) {
        expj.AB0020010.AB0020011form1['onDecision' + i]();
      }
    }
  }
};
expj.AB0020010.AB0020011form1.executeOnLoad = function () {
  expj.AB0020010.AB0020011form1.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form1.executePScriptOnLoad = function () {
  console.log('execute AB0020011form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AB0020010.AB0020011form1['onLoad' + i])) {
      expj.AB0020010.AB0020011form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AB0020010-AB0020011form1" action="AB0020010Servlet" name="AB0020011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:left"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ISSUE_PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AB0020010-AB0020011form1-PLANT_CD">
expj.AB0020010.AB0020011form1.PLANT_CD = {};
expj.AB0020010.AB0020011form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AB0020011form1/PLANT_CD.onDecision');
  expj.AB0020010.AB0020011form1.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form1', 'PLANT_CD', this);
  });
  expj.AB0020010.AB0020011form1.PLANT_CD.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AB0020011form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AB0020010-AB0020011form1-PLANT_CD" name="PLANT_CD" class="AB0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getPLANT_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AB0020010-AB0020011form1-UNIT_QTY_TYP" name="UNIT_QTY_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getUNIT_QTY_TYP()) %>">
<script class="expj-script-AB0020010-AB0020011form1-UNIT_QTY_TYP">
expj.AB0020010.AB0020011form1.UNIT_QTY_TYP = {};
expj.AB0020010.AB0020011form1.UNIT_QTY_TYP.executeAllOnDecision = function () {
  console.log('execute AB0020011form1/UNIT_QTY_TYP.onDecision');
  expj.AB0020010.AB0020011form1.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form1.UNIT_QTY_TYP.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form1-UNIT_QTY_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form1', 'UNIT_QTY_TYP', this);
  });
  expj.AB0020010.AB0020011form1.UNIT_QTY_TYP.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form1.UNIT_QTY_TYP.executePScriptOnLoad = function () {
  console.log('execute AB0020011form1/UNIT_QTY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form1-UNIT_QTY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AB0020010-AB0020011form1-PLANT_NAME">
expj.AB0020010.AB0020011form1.PLANT_NAME = {};
expj.AB0020010.AB0020011form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AB0020011form1/PLANT_NAME.onDecision');
  expj.AB0020010.AB0020011form1.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form1', 'PLANT_NAME', this);
  });
  expj.AB0020010.AB0020011form1.PLANT_NAME.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AB0020011form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AB0020010-AB0020011form1-PLANT_NAME" name="PLANT_NAME" class="AB0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AB0020010-AB0020011form1-DEL_FLG" name="DEL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getDEL_FLG()) %>">
<script class="expj-script-AB0020010-AB0020011form1-DEL_FLG">
expj.AB0020010.AB0020011form1.DEL_FLG = {};
expj.AB0020010.AB0020011form1.DEL_FLG.executeAllOnDecision = function () {
  console.log('execute AB0020011form1/DEL_FLG.onDecision');
  expj.AB0020010.AB0020011form1.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form1.DEL_FLG.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form1-DEL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form1', 'DEL_FLG', this);
  });
  expj.AB0020010.AB0020011form1.DEL_FLG.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form1.DEL_FLG.executePScriptOnLoad = function () {
  console.log('execute AB0020011form1/DEL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form1-DEL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AB0020010-AB0020011form1-STS_FLG" name="STS_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getSTS_FLG()) %>">
<script class="expj-script-AB0020010-AB0020011form1-STS_FLG">
expj.AB0020010.AB0020011form1.STS_FLG = {};
expj.AB0020010.AB0020011form1.STS_FLG.executeAllOnDecision = function () {
  console.log('execute AB0020011form1/STS_FLG.onDecision');
  expj.AB0020010.AB0020011form1.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form1.STS_FLG.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form1-STS_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form1', 'STS_FLG', this);
  });
  expj.AB0020010.AB0020011form1.STS_FLG.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form1.STS_FLG.executePScriptOnLoad = function () {
  console.log('execute AB0020011form1/STS_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form1-STS_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AB0020010-AB0020011form1-EXP_FLG" name="EXP_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getEXP_FLG()) %>">
<script class="expj-script-AB0020010-AB0020011form1-EXP_FLG">
expj.AB0020010.AB0020011form1.EXP_FLG = {};
expj.AB0020010.AB0020011form1.EXP_FLG.executeAllOnDecision = function () {
  console.log('execute AB0020011form1/EXP_FLG.onDecision');
  expj.AB0020010.AB0020011form1.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form1.EXP_FLG.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form1-EXP_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form1', 'EXP_FLG', this);
  });
  expj.AB0020010.AB0020011form1.EXP_FLG.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form1.EXP_FLG.executePScriptOnLoad = function () {
  console.log('execute AB0020011form1/EXP_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form1-EXP_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AB0020010-AB0020011form1-ITEM_CD">
expj.AB0020010.AB0020011form1.ITEM_CD = {};
expj.AB0020010.AB0020011form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AB0020011form1/ITEM_CD.onDecision');
  expj.AB0020010.AB0020011form1.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form1', 'ITEM_CD', this);
  });
  expj.AB0020010.AB0020011form1.ITEM_CD.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AB0020011form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AB0020010-AB0020011form1-ITEM_CD" name="ITEM_CD" class="AB0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AB0020010-AB0020011form1-ITEM_NAME">
expj.AB0020010.AB0020011form1.ITEM_NAME = {};
expj.AB0020010.AB0020011form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AB0020011form1/ITEM_NAME.onDecision');
  expj.AB0020010.AB0020011form1.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form1', 'ITEM_NAME', this);
  });
  expj.AB0020010.AB0020011form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AB0020011form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AB0020010-AB0020011form1-ITEM_NAME" name="ITEM_NAME" class="AB0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0420",rb)%></span><!-- 生産計画期間 --></div><!--/td-->
<script class="expj-script-AB0020010-AB0020011form1-w_DATE_FROM">
expj.AB0020010.AB0020011form1.w_DATE_FROM = {};
expj.AB0020010.AB0020011form1.w_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AB0020011form1/w_DATE_FROM.onDecision');
  expj.AB0020010.AB0020011form1.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form1.w_DATE_FROM.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form1-w_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form1', 'w_DATE_FROM', this);
  });
  expj.AB0020010.AB0020011form1.w_DATE_FROM.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form1.w_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AB0020011form1/w_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form1-w_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AB0020010-AB0020011form1-w_DATE_FROM" name="w_DATE_FROM" class="AB0020010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getw_DATE_FROM()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span>&nbsp;～</span></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AB0020010-AB0020011form1-w_DATE_TO">
expj.AB0020010.AB0020011form1.w_DATE_TO = {};
expj.AB0020010.AB0020011form1.w_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AB0020011form1/w_DATE_TO.onDecision');
  expj.AB0020010.AB0020011form1.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form1.w_DATE_TO.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form1-w_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form1', 'w_DATE_TO', this);
  });
  expj.AB0020010.AB0020011form1.w_DATE_TO.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form1.w_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AB0020011form1/w_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form1-w_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="text" id="expj-AB0020010-AB0020011form1-w_DATE_TO" name="w_DATE_TO" class="AB0020010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getw_DATE_TO()) %>" maxlength="2147483647" disabled></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AB0020010-AB0020011form2">
expj.AB0020010.AB0020011form2 = {};
expj.AB0020010.AB0020011form2.executeAllOnDecision = function () {
  console.log('execute AB0020011form2.onDecision');
};
expj.AB0020010.AB0020011form2.executeOnLoad = function () {
  expj.AB0020010.AB0020011form2.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form2.executePScriptOnLoad = function () {
  console.log('execute AB0020011form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AB0020010-AB0020011form2" action="AB0020010Servlet" name="AB0020011form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AB0020010-AB0020011form2-JOB_ODR_CD">
expj.AB0020010.AB0020011form2.JOB_ODR_CD = {};
expj.AB0020010.AB0020011form2.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AB0020011form2/JOB_ODR_CD.onDecision');
  expj.AB0020010.AB0020011form2.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form2.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form2-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form2', 'JOB_ODR_CD', this);
  });
  expj.AB0020010.AB0020011form2.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form2.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AB0020011form2/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form2-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AB0020010-AB0020011form2-JOB_ODR_CD" name="JOB_ODR_CD" class="AB0020010-focus-move  required-value expj-AB0020010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AB0020010-AB0020011form2-h_AUTO_NUM" name="h_AUTO_NUM" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0020010Struct.geth_AUTO_NUM()) %>">
<script class="expj-script-AB0020010-AB0020011form2-h_AUTO_NUM">
expj.AB0020010.AB0020011form2.h_AUTO_NUM = {};
expj.AB0020010.AB0020011form2.h_AUTO_NUM.executeAllOnDecision = function () {
  console.log('execute AB0020011form2/h_AUTO_NUM.onDecision');
  expj.AB0020010.AB0020011form2.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form2.h_AUTO_NUM.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form2-h_AUTO_NUM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form2', 'h_AUTO_NUM', this);
  });
  expj.AB0020010.AB0020011form2.h_AUTO_NUM.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form2.h_AUTO_NUM.executePScriptOnLoad = function () {
  console.log('execute AB0020011form2/h_AUTO_NUM.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form2-h_AUTO_NUM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AB0020010-AB0020011form2-c_AUTO_NUM">
expj.AB0020010.AB0020011form2.c_AUTO_NUM = {};
// script1="onLoad;0;CALL;onClick@0"
expj.AB0020010.AB0020011form2.c_AUTO_NUM.onLoad0 = function () {
  console.log('c_AUTO_NUM script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;_AB0020011form2/c_AUTO_NUM[eq]true@*1,*2"
expj.AB0020010.AB0020011form2.c_AUTO_NUM.onClick0 = function () {
  console.log('c_AUTO_NUM script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011form2', '_AB0020011form2/c_AUTO_NUM'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;MASK;_AB0020011form2/JOB_ODR_CD"
expj.AB0020010.AB0020011form2.c_AUTO_NUM.child1 = function () {
  console.log('c_AUTO_NUM script3');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020011form2', '_AB0020011form2/JOB_ODR_CD');
};
// script4="child;2;UNMASK;_AB0020011form2/JOB_ODR_CD"
expj.AB0020010.AB0020011form2.c_AUTO_NUM.child2 = function () {
  console.log('c_AUTO_NUM script4');
expj.common.pscript.setUnMaskToReferenceComponent('AB0020010', 'AB0020011form2', '_AB0020011form2/JOB_ODR_CD');
};
expj.AB0020010.AB0020011form2.c_AUTO_NUM.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0020010.AB0020011form2.c_AUTO_NUM['onClick' + i])) {
        expj.AB0020010.AB0020011form2.c_AUTO_NUM['onClick' + i]();
      }
    }
  }
};
expj.AB0020010.AB0020011form2.c_AUTO_NUM.executeAllOnDecision = function () {
  console.log('execute AB0020011form2/c_AUTO_NUM.onDecision');
  expj.AB0020010.AB0020011form2.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form2.c_AUTO_NUM.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form2-c_AUTO_NUM').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0020010', 'AB0020011form2', 'c_AUTO_NUM', this, 'CheckBox');
    }
  });
  expj.AB0020010.AB0020011form2.c_AUTO_NUM.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form2.c_AUTO_NUM.executePScriptOnLoad = function () {
  console.log('execute AB0020011form2/c_AUTO_NUM.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form2-c_AUTO_NUM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AB0020010.AB0020011form2.c_AUTO_NUM['onLoad' + i])) {
      expj.AB0020010.AB0020011form2.c_AUTO_NUM['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c_AUTO_NUM" value="true" <%= ("true".equals(TypeConverter.convert(aAB0020010Struct.getc_AUTO_NUM())) || "1".equals(TypeConverter.convert(aAB0020010Struct.getc_AUTO_NUM())))?"checked=\"checked\"":"" %>  class="AB0020010-focus-move" id="expj-AB0020010-AB0020011form2-c_AUTO_NUM"><label for="expj-AB0020010-AB0020011form2-c_AUTO_NUM"><%=CoreTools.getRBString("Expj.Cmt0209",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-AB0020010-AB0020011form2-h_PRD_REQ_JOB_ODR_TYP_2" name="h_PRD_REQ_JOB_ODR_TYP_2" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0020010Struct.geth_PRD_REQ_JOB_ODR_TYP_2()) %>">
<script class="expj-script-AB0020010-AB0020011form2-h_PRD_REQ_JOB_ODR_TYP_2">
expj.AB0020010.AB0020011form2.h_PRD_REQ_JOB_ODR_TYP_2 = {};
expj.AB0020010.AB0020011form2.h_PRD_REQ_JOB_ODR_TYP_2.executeAllOnDecision = function () {
  console.log('execute AB0020011form2/h_PRD_REQ_JOB_ODR_TYP_2.onDecision');
  expj.AB0020010.AB0020011form2.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form2.h_PRD_REQ_JOB_ODR_TYP_2.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form2-h_PRD_REQ_JOB_ODR_TYP_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form2', 'h_PRD_REQ_JOB_ODR_TYP_2', this);
  });
  expj.AB0020010.AB0020011form2.h_PRD_REQ_JOB_ODR_TYP_2.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form2.h_PRD_REQ_JOB_ODR_TYP_2.executePScriptOnLoad = function () {
  console.log('execute AB0020011form2/h_PRD_REQ_JOB_ODR_TYP_2.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form2-h_PRD_REQ_JOB_ODR_TYP_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_TYP",rb)%></span><!-- 製番種別 --></div><!--/td-->
<script class="expj-script-AB0020010-AB0020011form2-JOB_ODR_TYP">
expj.AB0020010.AB0020011form2.JOB_ODR_TYP = {};
expj.AB0020010.AB0020011form2.JOB_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute AB0020011form2/JOB_ODR_TYP.onDecision');
  expj.AB0020010.AB0020011form2.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form2.JOB_ODR_TYP.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form2-JOB_ODR_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AB0020010', 'AB0020011form2', 'JOB_ODR_TYP', this);
  });
  expj.AB0020010.AB0020011form2.JOB_ODR_TYP.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form2.JOB_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute AB0020011form2/JOB_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form2-JOB_ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AB0020010-AB0020011form2-JOB_ODR_TYP" name='JOB_ODR_TYP' class='AB0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAB0020010Control.getStruct().getList_JOB_ODR_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAB0020010Control.getStruct().getList_JOB_ODR_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAB0020010Control.getStruct().getList_JOB_ODR_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAB0020010Struct.getJOB_ODR_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<input type="hidden" id="expj-AB0020010-AB0020011form2-h_JOB_ODR_CD" name="h_JOB_ODR_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0020010Struct.geth_JOB_ODR_CD()) %>">
<script class="expj-script-AB0020010-AB0020011form2-h_JOB_ODR_CD">
expj.AB0020010.AB0020011form2.h_JOB_ODR_CD = {};
expj.AB0020010.AB0020011form2.h_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AB0020011form2/h_JOB_ODR_CD.onDecision');
  expj.AB0020010.AB0020011form2.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form2.h_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form2-h_JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form2', 'h_JOB_ODR_CD', this);
  });
  expj.AB0020010.AB0020011form2.h_JOB_ODR_CD.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form2.h_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AB0020011form2/h_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form2-h_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PLAN_TYP",rb)%></span><!-- 計画タイプ --></div><!--/td-->
<script class="expj-script-AB0020010-AB0020011form2-PLAN_TYP">
expj.AB0020010.AB0020011form2.PLAN_TYP = {};
expj.AB0020010.AB0020011form2.PLAN_TYP.executeAllOnDecision = function () {
  console.log('execute AB0020011form2/PLAN_TYP.onDecision');
  expj.AB0020010.AB0020011form2.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form2.PLAN_TYP.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form2-PLAN_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AB0020010', 'AB0020011form2', 'PLAN_TYP', this);
  });
  expj.AB0020010.AB0020011form2.PLAN_TYP.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form2.PLAN_TYP.executePScriptOnLoad = function () {
  console.log('execute AB0020011form2/PLAN_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form2-PLAN_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AB0020010-AB0020011form2-PLAN_TYP" name='PLAN_TYP' class='AB0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAB0020010Control.getStruct().getList_PLAN_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAB0020010Control.getStruct().getList_PLAN_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAB0020010Control.getStruct().getList_PLAN_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAB0020010Struct.getPLAN_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.JOB_ODR_DLV_DATE",rb)%></span><!-- 製番納期 --></div><!--/td-->
<script class="expj-script-AB0020010-AB0020011form2-JOB_ODR_DLV_DATE">
expj.AB0020010.AB0020011form2.JOB_ODR_DLV_DATE = {};
expj.AB0020010.AB0020011form2.JOB_ODR_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute AB0020011form2/JOB_ODR_DLV_DATE.onDecision');
  expj.AB0020010.AB0020011form2.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form2.JOB_ODR_DLV_DATE.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form2-JOB_ODR_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form2', 'JOB_ODR_DLV_DATE', this);
  });
  expj.AB0020010.AB0020011form2.JOB_ODR_DLV_DATE.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form2.JOB_ODR_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute AB0020011form2/JOB_ODR_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form2-JOB_ODR_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AB0020010-AB0020011form2-JOB_ODR_DLV_DATE" name="JOB_ODR_DLV_DATE" class="AB0020010-focus-move  required-value expj-AB0020010-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getJOB_ODR_DLV_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AB0020010-AB0020011form2-CalendarJOB_ODR_DLV_DATE">
expj.AB0020010.AB0020011form2.CalendarJOB_ODR_DLV_DATE = {};
// script1="onClick;0;CALENDAR;_AB0020011form2/JOB_ODR_DLV_DATE"
expj.AB0020010.AB0020011form2.CalendarJOB_ODR_DLV_DATE.onClick0 = function () {
  console.log('CalendarJOB_ODR_DLV_DATE script1');
expj.common.pscript.executeCalendar('AB0020010','AB0020011form2','_AB0020011form2/JOB_ODR_DLV_DATE');
};
expj.AB0020010.AB0020011form2.CalendarJOB_ODR_DLV_DATE.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0020010.AB0020011form2.CalendarJOB_ODR_DLV_DATE['onClick' + i])) {
        expj.AB0020010.AB0020011form2.CalendarJOB_ODR_DLV_DATE['onClick' + i]();
      }
    }
  }
};
expj.AB0020010.AB0020011form2.CalendarJOB_ODR_DLV_DATE.executeAllOnDecision = function () {
};
expj.AB0020010.AB0020011form2.CalendarJOB_ODR_DLV_DATE.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form2-CalendarJOB_ODR_DLV_DATE').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0020010', 'AB0020011form2', 'CalendarJOB_ODR_DLV_DATE', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AB0020010','AB0020011form2','_AB0020011form2/JOB_ODR_DLV_DATE');
  expj.AB0020010.AB0020011form2.CalendarJOB_ODR_DLV_DATE.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form2.CalendarJOB_ODR_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute AB0020011form2/CalendarJOB_ODR_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form2-CalendarJOB_ODR_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AB0020010-AB0020011form2-CalendarJOB_ODR_DLV_DATE" class="AB0020010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AB0020010-AB0020011form2-JOB_ODR_DLV_DATE_TIME">
expj.AB0020010.AB0020011form2.JOB_ODR_DLV_DATE_TIME = {};
expj.AB0020010.AB0020011form2.JOB_ODR_DLV_DATE_TIME.executeAllOnDecision = function () {
  console.log('execute AB0020011form2/JOB_ODR_DLV_DATE_TIME.onDecision');
  expj.AB0020010.AB0020011form2.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form2.JOB_ODR_DLV_DATE_TIME.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form2-JOB_ODR_DLV_DATE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form2', 'JOB_ODR_DLV_DATE_TIME', this);
  });
  expj.AB0020010.AB0020011form2.JOB_ODR_DLV_DATE_TIME.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form2.JOB_ODR_DLV_DATE_TIME.executePScriptOnLoad = function () {
  console.log('execute AB0020011form2/JOB_ODR_DLV_DATE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form2-JOB_ODR_DLV_DATE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AB0020010-AB0020011form2-JOB_ODR_DLV_DATE_TIME" name="JOB_ODR_DLV_DATE_TIME" class="AB0020010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getJOB_ODR_DLV_DATE_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.JOB_ODR_QTY_1",rb)%></span><!-- 手配数 --></div><!--/td-->
<script class="expj-script-AB0020010-AB0020011form2-JOB_ODR_QTY">
expj.AB0020010.AB0020011form2.JOB_ODR_QTY = {};
expj.AB0020010.AB0020011form2.JOB_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AB0020011form2/JOB_ODR_QTY.onDecision');
  expj.AB0020010.AB0020011form2.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form2.JOB_ODR_QTY.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form2-JOB_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form2', 'JOB_ODR_QTY', this);
  });
  expj.AB0020010.AB0020011form2.JOB_ODR_QTY.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form2.JOB_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AB0020011form2/JOB_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form2-JOB_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AB0020010-AB0020011form2-JOB_ODR_QTY" name="JOB_ODR_QTY" class="AB0020010-focus-move expj-align-right required-value expj-AB0020010-required-Z" style="width:150px;" data-kind="<%= Kind.convertNumeric(aAB0020010Struct.getUNIT_QTY_TYP().toString(), Kind.Z, 14, 1, Kind.FLOOR, 4) %>" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getJOB_ODR_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AB0020010-AB0020011form2-STOCK_UNIT">
expj.AB0020010.AB0020011form2.STOCK_UNIT = {};
expj.AB0020010.AB0020011form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AB0020011form2/STOCK_UNIT.onDecision');
  expj.AB0020010.AB0020011form2.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form2', 'STOCK_UNIT', this);
  });
  expj.AB0020010.AB0020011form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AB0020011form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AB0020010-AB0020011form2-STOCK_UNIT" name="STOCK_UNIT" class="AB0020010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ALC_GRP_CD",rb)%></span><!-- 引当グループコード --></div><!--/td-->
<script class="expj-script-AB0020010-AB0020011form2-ALC_GRP_CD">
expj.AB0020010.AB0020011form2.ALC_GRP_CD = {};
expj.AB0020010.AB0020011form2.ALC_GRP_CD.executeAllOnDecision = function () {
  console.log('execute AB0020011form2/ALC_GRP_CD.onDecision');
  expj.AB0020010.AB0020011form2.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form2.ALC_GRP_CD.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form2-ALC_GRP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form2', 'ALC_GRP_CD', this);
  });
  expj.AB0020010.AB0020011form2.ALC_GRP_CD.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form2.ALC_GRP_CD.executePScriptOnLoad = function () {
  console.log('execute AB0020011form2/ALC_GRP_CD.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form2-ALC_GRP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AB0020010-AB0020011form2-ALC_GRP_CD" name="ALC_GRP_CD" class="AB0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getALC_GRP_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AB0020010-AB0020011form2-c_JOB_ODR_DEL_FLG">
expj.AB0020010.AB0020011form2.c_JOB_ODR_DEL_FLG = {};
// script1="onClick;0;CHK;<%=CallButton%>[eq]modify[or]<%=CallButton%>[eq]updateSub1@*0"
expj.AB0020010.AB0020011form2.c_JOB_ODR_DEL_FLG.onClick0 = function () {
  console.log('c_JOB_ODR_DEL_FLG script1');
if (expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'modify') || expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'updateSub1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_AB0020011form2/c_JOB_ODR_DEL_FLG[eq]true@*1,*2"
expj.AB0020010.AB0020011form2.c_JOB_ODR_DEL_FLG.child0 = function () {
  console.log('c_JOB_ODR_DEL_FLG script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011form2', '_AB0020011form2/c_JOB_ODR_DEL_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;MASK;_AB0020011form2/c_JOB_ODR_STS_TYP,_AB0020011form2/c_JOB_ODR_EXP_TYP"
expj.AB0020010.AB0020011form2.c_JOB_ODR_DEL_FLG.child1 = function () {
  console.log('c_JOB_ODR_DEL_FLG script3');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020011form2', '_AB0020011form2/c_JOB_ODR_STS_TYP');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020011form2', '_AB0020011form2/c_JOB_ODR_EXP_TYP');
};
// script4="child;2;CHK;_AB0020011form2/JOB_ODR_STS_TYP[neq]1@*3,*4"
expj.AB0020010.AB0020011form2.c_JOB_ODR_DEL_FLG.child2 = function () {
  console.log('c_JOB_ODR_DEL_FLG script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011form2', '_AB0020011form2/JOB_ODR_STS_TYP'), '[neq]', '1')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script5="child;3;CHK;_AB0020011form2/JOB_ODR_STS_TYP[eq]2@*4,*5"
expj.AB0020010.AB0020011form2.c_JOB_ODR_DEL_FLG.child3 = function () {
  console.log('c_JOB_ODR_DEL_FLG script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011form2', '_AB0020011form2/JOB_ODR_STS_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;4;UNMASK;_AB0020011form2/c_JOB_ODR_STS_TYP"
expj.AB0020010.AB0020011form2.c_JOB_ODR_DEL_FLG.child4 = function () {
  console.log('c_JOB_ODR_DEL_FLG script6');
expj.common.pscript.setUnMaskToReferenceComponent('AB0020010', 'AB0020011form2', '_AB0020011form2/c_JOB_ODR_STS_TYP');
};
// script7="child;5;UNMASK;_AB0020011form2/c_JOB_ODR_EXP_TYP"
expj.AB0020010.AB0020011form2.c_JOB_ODR_DEL_FLG.child5 = function () {
  console.log('c_JOB_ODR_DEL_FLG script7');
expj.common.pscript.setUnMaskToReferenceComponent('AB0020010', 'AB0020011form2', '_AB0020011form2/c_JOB_ODR_EXP_TYP');
};
expj.AB0020010.AB0020011form2.c_JOB_ODR_DEL_FLG.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0020010.AB0020011form2.c_JOB_ODR_DEL_FLG['onClick' + i])) {
        expj.AB0020010.AB0020011form2.c_JOB_ODR_DEL_FLG['onClick' + i]();
      }
    }
  }
};
expj.AB0020010.AB0020011form2.c_JOB_ODR_DEL_FLG.executeAllOnDecision = function () {
  console.log('execute AB0020011form2/c_JOB_ODR_DEL_FLG.onDecision');
  expj.AB0020010.AB0020011form2.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form2.c_JOB_ODR_DEL_FLG.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form2-c_JOB_ODR_DEL_FLG').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0020010', 'AB0020011form2', 'c_JOB_ODR_DEL_FLG', this, 'CheckBox');
    }
  });
  expj.AB0020010.AB0020011form2.c_JOB_ODR_DEL_FLG.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form2.c_JOB_ODR_DEL_FLG.executePScriptOnLoad = function () {
  console.log('execute AB0020011form2/c_JOB_ODR_DEL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form2-c_JOB_ODR_DEL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_JOB_ODR_DEL_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aAB0020010Struct.getc_JOB_ODR_DEL_FLG())) || "1".equals(TypeConverter.convert(aAB0020010Struct.getc_JOB_ODR_DEL_FLG())))?"checked=\"checked\"":"" %>  class="AB0020010-focus-move" id="expj-AB0020010-AB0020011form2-c_JOB_ODR_DEL_FLG"><label for="expj-AB0020010-AB0020011form2-c_JOB_ODR_DEL_FLG"><%=CoreTools.getRBString("Expj.Cmt0207",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-AB0020010-AB0020011form2-JOB_ODR_DEL_FLG" name="JOB_ODR_DEL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getJOB_ODR_DEL_FLG()) %>">
<script class="expj-script-AB0020010-AB0020011form2-JOB_ODR_DEL_FLG">
expj.AB0020010.AB0020011form2.JOB_ODR_DEL_FLG = {};
expj.AB0020010.AB0020011form2.JOB_ODR_DEL_FLG.executeAllOnDecision = function () {
  console.log('execute AB0020011form2/JOB_ODR_DEL_FLG.onDecision');
  expj.AB0020010.AB0020011form2.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form2.JOB_ODR_DEL_FLG.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form2-JOB_ODR_DEL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form2', 'JOB_ODR_DEL_FLG', this);
  });
  expj.AB0020010.AB0020011form2.JOB_ODR_DEL_FLG.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form2.JOB_ODR_DEL_FLG.executePScriptOnLoad = function () {
  console.log('execute AB0020011form2/JOB_ODR_DEL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form2-JOB_ODR_DEL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AB0020010-AB0020011form2-MODIFY_COUNT" name="MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getMODIFY_COUNT()) %>">
<script class="expj-script-AB0020010-AB0020011form2-MODIFY_COUNT">
expj.AB0020010.AB0020011form2.MODIFY_COUNT = {};
expj.AB0020010.AB0020011form2.MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AB0020011form2/MODIFY_COUNT.onDecision');
  expj.AB0020010.AB0020011form2.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form2.MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form2-MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form2', 'MODIFY_COUNT', this);
  });
  expj.AB0020010.AB0020011form2.MODIFY_COUNT.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form2.MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AB0020011form2/MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form2-MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AB0020010-AB0020011form2-c_JOB_ODR_STS_TYP">
expj.AB0020010.AB0020011form2.c_JOB_ODR_STS_TYP = {};
// script1="onClick;0;CHK;<%=CallButton%>[eq]modify[or]<%=CallButton%>[eq]updateSub1@*0"
expj.AB0020010.AB0020011form2.c_JOB_ODR_STS_TYP.onClick0 = function () {
  console.log('c_JOB_ODR_STS_TYP script1');
if (expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'modify') || expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'updateSub1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_AB0020011form2/c_JOB_ODR_STS_TYP[eq]true@*1,*2"
expj.AB0020010.AB0020011form2.c_JOB_ODR_STS_TYP.child0 = function () {
  console.log('c_JOB_ODR_STS_TYP script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011form2', '_AB0020011form2/c_JOB_ODR_STS_TYP'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;MASK;_AB0020011form2/c_JOB_ODR_DEL_FLG"
expj.AB0020010.AB0020011form2.c_JOB_ODR_STS_TYP.child1 = function () {
  console.log('c_JOB_ODR_STS_TYP script3');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020011form2', '_AB0020011form2/c_JOB_ODR_DEL_FLG');
};
// script4="child;2;UNMASK;_AB0020011form2/c_JOB_ODR_DEL_FLG"
expj.AB0020010.AB0020011form2.c_JOB_ODR_STS_TYP.child2 = function () {
  console.log('c_JOB_ODR_STS_TYP script4');
expj.common.pscript.setUnMaskToReferenceComponent('AB0020010', 'AB0020011form2', '_AB0020011form2/c_JOB_ODR_DEL_FLG');
};
expj.AB0020010.AB0020011form2.c_JOB_ODR_STS_TYP.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0020010.AB0020011form2.c_JOB_ODR_STS_TYP['onClick' + i])) {
        expj.AB0020010.AB0020011form2.c_JOB_ODR_STS_TYP['onClick' + i]();
      }
    }
  }
};
expj.AB0020010.AB0020011form2.c_JOB_ODR_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AB0020011form2/c_JOB_ODR_STS_TYP.onDecision');
  expj.AB0020010.AB0020011form2.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form2.c_JOB_ODR_STS_TYP.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form2-c_JOB_ODR_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0020010', 'AB0020011form2', 'c_JOB_ODR_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AB0020010.AB0020011form2.c_JOB_ODR_STS_TYP.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form2.c_JOB_ODR_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AB0020011form2/c_JOB_ODR_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form2-c_JOB_ODR_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_JOB_ODR_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAB0020010Struct.getc_JOB_ODR_STS_TYP())) || "1".equals(TypeConverter.convert(aAB0020010Struct.getc_JOB_ODR_STS_TYP())))?"checked=\"checked\"":"" %>  class="AB0020010-focus-move" id="expj-AB0020010-AB0020011form2-c_JOB_ODR_STS_TYP"><label for="expj-AB0020010-AB0020011form2-c_JOB_ODR_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0215",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-AB0020010-AB0020011form2-JOB_ODR_STS_TYP" name="JOB_ODR_STS_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getJOB_ODR_STS_TYP()) %>">
<script class="expj-script-AB0020010-AB0020011form2-JOB_ODR_STS_TYP">
expj.AB0020010.AB0020011form2.JOB_ODR_STS_TYP = {};
expj.AB0020010.AB0020011form2.JOB_ODR_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AB0020011form2/JOB_ODR_STS_TYP.onDecision');
  expj.AB0020010.AB0020011form2.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form2.JOB_ODR_STS_TYP.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form2-JOB_ODR_STS_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form2', 'JOB_ODR_STS_TYP', this);
  });
  expj.AB0020010.AB0020011form2.JOB_ODR_STS_TYP.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form2.JOB_ODR_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AB0020011form2/JOB_ODR_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form2-JOB_ODR_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AB0020010-AB0020011form2-UPDATE_FLG" name="UPDATE_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getUPDATE_FLG()) %>">
<script class="expj-script-AB0020010-AB0020011form2-UPDATE_FLG">
expj.AB0020010.AB0020011form2.UPDATE_FLG = {};
expj.AB0020010.AB0020011form2.UPDATE_FLG.executeAllOnDecision = function () {
  console.log('execute AB0020011form2/UPDATE_FLG.onDecision');
  expj.AB0020010.AB0020011form2.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form2.UPDATE_FLG.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form2-UPDATE_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form2', 'UPDATE_FLG', this);
  });
  expj.AB0020010.AB0020011form2.UPDATE_FLG.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form2.UPDATE_FLG.executePScriptOnLoad = function () {
  console.log('execute AB0020011form2/UPDATE_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form2-UPDATE_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AB0020010-AB0020011form2-c_JOB_ODR_EXP_TYP">
expj.AB0020010.AB0020011form2.c_JOB_ODR_EXP_TYP = {};
// script1="onClick;0;CHK;<%=CallButton%>[eq]modify[or]<%=CallButton%>[eq]updateSub1@*0"
expj.AB0020010.AB0020011form2.c_JOB_ODR_EXP_TYP.onClick0 = function () {
  console.log('c_JOB_ODR_EXP_TYP script1');
if (expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'modify') || expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'updateSub1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_AB0020011form2/c_JOB_ODR_EXP_TYP[eq]true@*1,*2"
expj.AB0020010.AB0020011form2.c_JOB_ODR_EXP_TYP.child0 = function () {
  console.log('c_JOB_ODR_EXP_TYP script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011form2', '_AB0020011form2/c_JOB_ODR_EXP_TYP'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script10="child;1;MASK;_AB0020011form2/c_JOB_ODR_DEL_FLG"
expj.AB0020010.AB0020011form2.c_JOB_ODR_EXP_TYP.child1 = function () {
  console.log('c_JOB_ODR_EXP_TYP script10');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020011form2', '_AB0020011form2/c_JOB_ODR_DEL_FLG');
};
// script20="child;2;CHK;_AB0020011form2/JOB_ODR_STS_TYP[eq]2@*3,*4"
expj.AB0020010.AB0020011form2.c_JOB_ODR_EXP_TYP.child2 = function () {
  console.log('c_JOB_ODR_EXP_TYP script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011form2', '_AB0020011form2/JOB_ODR_STS_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script21="child;3;MASK;_AB0020011form2/c_JOB_ODR_DEL_FLG"
expj.AB0020010.AB0020011form2.c_JOB_ODR_EXP_TYP.child3 = function () {
  console.log('c_JOB_ODR_EXP_TYP script21');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020011form2', '_AB0020011form2/c_JOB_ODR_DEL_FLG');
};
// script22="child;4;CHK;<%=aAB0020010Control.getJobOdrStsTyp()%>[eq]4@*5,*7"
expj.AB0020010.AB0020011form2.c_JOB_ODR_EXP_TYP.child4 = function () {
  console.log('c_JOB_ODR_EXP_TYP script22');
if (expj.common.pscript.evaluate('<%=aAB0020010Control.getJobOdrStsTyp()%>', '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script23="child;5;CHK;<%=aAB0020010Control.getSysJobOdrDelFlg()%>[eq]1@*6,*7"
expj.AB0020010.AB0020011form2.c_JOB_ODR_EXP_TYP.child5 = function () {
  console.log('c_JOB_ODR_EXP_TYP script23');
if (expj.common.pscript.evaluate('<%=aAB0020010Control.getSysJobOdrDelFlg()%>', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script24="child;6;MASK;_AB0020011form2/c_JOB_ODR_DEL_FLG"
expj.AB0020010.AB0020011form2.c_JOB_ODR_EXP_TYP.child6 = function () {
  console.log('c_JOB_ODR_EXP_TYP script24');
expj.common.pscript.setMaskToReferenceComponent('AB0020010', 'AB0020011form2', '_AB0020011form2/c_JOB_ODR_DEL_FLG');
};
// script25="child;7;UNMASK;_AB0020011form2/c_JOB_ODR_DEL_FLG"
expj.AB0020010.AB0020011form2.c_JOB_ODR_EXP_TYP.child7 = function () {
  console.log('c_JOB_ODR_EXP_TYP script25');
expj.common.pscript.setUnMaskToReferenceComponent('AB0020010', 'AB0020011form2', '_AB0020011form2/c_JOB_ODR_DEL_FLG');
};
expj.AB0020010.AB0020011form2.c_JOB_ODR_EXP_TYP.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0020010.AB0020011form2.c_JOB_ODR_EXP_TYP['onClick' + i])) {
        expj.AB0020010.AB0020011form2.c_JOB_ODR_EXP_TYP['onClick' + i]();
      }
    }
  }
};
expj.AB0020010.AB0020011form2.c_JOB_ODR_EXP_TYP.executeAllOnDecision = function () {
  console.log('execute AB0020011form2/c_JOB_ODR_EXP_TYP.onDecision');
  expj.AB0020010.AB0020011form2.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form2.c_JOB_ODR_EXP_TYP.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form2-c_JOB_ODR_EXP_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0020010', 'AB0020011form2', 'c_JOB_ODR_EXP_TYP', this, 'CheckBox');
    }
  });
  expj.AB0020010.AB0020011form2.c_JOB_ODR_EXP_TYP.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form2.c_JOB_ODR_EXP_TYP.executePScriptOnLoad = function () {
  console.log('execute AB0020011form2/c_JOB_ODR_EXP_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form2-c_JOB_ODR_EXP_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_JOB_ODR_EXP_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAB0020010Struct.getc_JOB_ODR_EXP_TYP())) || "1".equals(TypeConverter.convert(aAB0020010Struct.getc_JOB_ODR_EXP_TYP())))?"checked=\"checked\"":"" %>  class="AB0020010-focus-move" id="expj-AB0020010-AB0020011form2-c_JOB_ODR_EXP_TYP"><label for="expj-AB0020010-AB0020011form2-c_JOB_ODR_EXP_TYP"><%=CoreTools.getRBString("Expj.Cmt0204",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-AB0020010-AB0020011form2-JOB_ODR_EXP_TYP" name="JOB_ODR_EXP_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getJOB_ODR_EXP_TYP()) %>">
<script class="expj-script-AB0020010-AB0020011form2-JOB_ODR_EXP_TYP">
expj.AB0020010.AB0020011form2.JOB_ODR_EXP_TYP = {};
expj.AB0020010.AB0020011form2.JOB_ODR_EXP_TYP.executeAllOnDecision = function () {
  console.log('execute AB0020011form2/JOB_ODR_EXP_TYP.onDecision');
  expj.AB0020010.AB0020011form2.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form2.JOB_ODR_EXP_TYP.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form2-JOB_ODR_EXP_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form2', 'JOB_ODR_EXP_TYP', this);
  });
  expj.AB0020010.AB0020011form2.JOB_ODR_EXP_TYP.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form2.JOB_ODR_EXP_TYP.executePScriptOnLoad = function () {
  console.log('execute AB0020011form2/JOB_ODR_EXP_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form2-JOB_ODR_EXP_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AB0020010-AB0020011form2-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAB0020010Struct.getTIME_CTRL()) %>">
<script class="expj-script-AB0020010-AB0020011form2-TIME_CTRL">
expj.AB0020010.AB0020011form2.TIME_CTRL = {};
expj.AB0020010.AB0020011form2.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AB0020011form2/TIME_CTRL.onDecision');
  expj.AB0020010.AB0020011form2.executeAllOnDecision();
  expj.AB0020010.executeAllOnDecision();
};
expj.AB0020010.AB0020011form2.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011form2-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AB0020010', 'AB0020011form2', 'TIME_CTRL', this);
  });
  expj.AB0020010.AB0020011form2.TIME_CTRL.executePScriptOnLoad();
};

expj.AB0020010.AB0020011form2.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AB0020011form2/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011form2-TIME_CTRL');
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AB0020010-AB0020011button1">
expj.AB0020010.AB0020011button1 = {};
expj.AB0020010.AB0020011button1.executeAllOnDecision = function () {
  console.log('execute AB0020011button1.onDecision');
};
expj.AB0020010.AB0020011button1.executeOnLoad = function () {
  expj.AB0020010.AB0020011button1.executePScriptOnLoad();
};

expj.AB0020010.AB0020011button1.executePScriptOnLoad = function () {
  console.log('execute AB0020011button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AB0020010-AB0020011button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AB0020010-AB0020011button1-insertSub1">
expj.AB0020010.AB0020011button1.insertSub1 = {};
// script1="onClick;0;CHK;_AB0020011form2/TIME_CTRL[eq]true@*0"
expj.AB0020010.AB0020011button1.insertSub1.onClick0 = function () {
  console.log('insertSub1 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;~LEN(_AB0020011form2/JOB_ODR_DLV_DATE_TIME)[eq]1[or]~LEN(_AB0020011form2/JOB_ODR_DLV_DATE_TIME)[eq]2@#AS00017"
expj.AB0020010.AB0020011button1.insertSub1.child0 = function () {
  console.log('insertSub1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AB0020010', 'AB0020011button1', 'AS00017');
}
};
// script3="onClick;1;CHK;_AB0020011form2/TIME_CTRL[eq]true[and]~LEN(_AB0020011form2/JOB_ODR_DLV_DATE_TIME)[eq]3@*1"
expj.AB0020010.AB0020011button1.insertSub1.onClick1 = function () {
  console.log('insertSub1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="child;1;CHK;[{~CHARAT(_AB0020011form2/JOB_ODR_DLV_DATE_TIME:1)}*10+{~CHARAT(_AB0020011form2/JOB_ODR_DLV_DATE_TIME:2)}][gte]60@#AS00018"
expj.AB0020010.AB0020011button1.insertSub1.child1 = function () {
  console.log('insertSub1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AB0020010', 'AB0020011button1', 'AS00018');
}
};
// script5="onClick;2;CHK;_AB0020011form2/TIME_CTRL[eq]true[and]~LEN(_AB0020011form2/JOB_ODR_DLV_DATE_TIME)[eq]4@*2"
expj.AB0020010.AB0020011button1.insertSub1.onClick2 = function () {
  console.log('insertSub1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script6="child;2;CHK;[{~CHARAT(_AB0020011form2/JOB_ODR_DLV_DATE_TIME:0)}*10+{~CHARAT(_AB0020011form2/JOB_ODR_DLV_DATE_TIME:1)}][gte]24[or][{~CHARAT(_AB0020011form2/JOB_ODR_DLV_DATE_TIME:2)}*10+{~CHARAT(_AB0020011form2/JOB_ODR_DLV_DATE_TIME:3)}][gte]60@#AS00018"
expj.AB0020010.AB0020011button1.insertSub1.child2 = function () {
  console.log('insertSub1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AB0020010', 'AB0020011button1', 'AS00018');
}
};
// script7="onClick;3;CHK;_AB0020011form2/TIME_CTRL[eq]true[and]_AB0020011form2/JOB_ODR_DLV_DATE_TIME[eq]@*11"
expj.AB0020010.AB0020011button1.insertSub1.onClick3 = function () {
  console.log('insertSub1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script8="child;11;SET;_AB0020011form2/JOB_ODR_DLV_DATE_TIME=2359"
expj.AB0020010.AB0020011button1.insertSub1.child11 = function () {
  console.log('insertSub1 script8');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME', '2359');
};
// script9="onClick;4;CHK;_AB0020011form2/JOB_ODR_DLV_DATE[gt]_AB0020011form1/w_DATE_TO[or]_AB0020011form2/JOB_ODR_DLV_DATE[lt]_AB0020011form1/w_DATE_FROM@#AB00020"
expj.AB0020010.AB0020011button1.insertSub1.onClick4 = function () {
  console.log('insertSub1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form1/w_DATE_TO'))) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form1/w_DATE_FROM')))) {
expj.common.pscript.addErrorMessage('AB0020010', 'AB0020011button1', 'AB00020');
}
};
// script10="onClick;5;CHK;_AB0020011form2/JOB_ODR_QTY[lte]0@#AB00037"
expj.AB0020010.AB0020011button1.insertSub1.onClick5 = function () {
  console.log('insertSub1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AB0020010', 'AB0020011button1', 'AB00037');
}
};
// script11="onClick;6;CHK;_AB0020011form2/c_AUTO_NUM[eq]true@*3,*4"
expj.AB0020010.AB0020011button1.insertSub1.onClick6 = function () {
  console.log('insertSub1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/c_AUTO_NUM'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script12="child;3;SET;_AB0020011form2/h_AUTO_NUM=1@*5"
expj.AB0020010.AB0020011button1.insertSub1.child3 = function () {
  console.log('insertSub1 script12');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/h_AUTO_NUM', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script13="child;4;SET;_AB0020011form2/h_AUTO_NUM=0@*5"
expj.AB0020010.AB0020011button1.insertSub1.child4 = function () {
  console.log('insertSub1 script13');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/h_AUTO_NUM', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script14="child;5;CHK;_AB0020011form2/c_JOB_ODR_STS_TYP[eq]true@*6,*7"
expj.AB0020010.AB0020011button1.insertSub1.child5 = function () {
  console.log('insertSub1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/c_JOB_ODR_STS_TYP'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script15="child;6;SET;_AB0020011form2/JOB_ODR_STS_TYP=2@*8"
expj.AB0020010.AB0020011button1.insertSub1.child6 = function () {
  console.log('insertSub1 script15');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_STS_TYP', '2');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
// script16="child;7;SET;_AB0020011form2/JOB_ODR_STS_TYP=1@*8"
expj.AB0020010.AB0020011button1.insertSub1.child7 = function () {
  console.log('insertSub1 script16');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_STS_TYP', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
// script17="child;8;SET;_AB0020011form2/JOB_ODR_EXP_TYP=1@*9"
expj.AB0020010.AB0020011button1.insertSub1.child8 = function () {
  console.log('insertSub1 script17');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_EXP_TYP', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script18="child;9;SET;_AB0020011form2/JOB_ODR_DEL_FLG=1@*10"
expj.AB0020010.AB0020011button1.insertSub1.child9 = function () {
  console.log('insertSub1 script18');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DEL_FLG', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child10)){this.child10();}}
};
// script19="child;10;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AB0020011form1/*,_AB0020011form2/*@AB0020010Servlet,,$ZZ07001"
expj.AB0020010.AB0020011button1.insertSub1.child10 = function () {
  console.log('insertSub1 script19');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AB0020010', 'AB0020011button1', '_AB0020011form1/*,_AB0020011form2/*', 'AB0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AB0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AB0020010', response);
expj.common.changeBusinessScreenTab('AB0020010', contents);
};
expj.common.pscript.callConfirm('AB0020010', 'AB0020011button1', 'ZZ07001', okEvent);
};
expj.AB0020010.AB0020011button1.insertSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 6; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0020010.AB0020011button1.insertSub1['onClick' + i])) {
        expj.AB0020010.AB0020011button1.insertSub1['onClick' + i]();
      }
    }
  }
};
expj.AB0020010.AB0020011button1.insertSub1.executeAllOnDecision = function () {
};
expj.AB0020010.AB0020011button1.insertSub1.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011button1-insertSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0020010', 'AB0020011button1', 'insertSub1', this, 'Button');
    }
  });
  expj.AB0020010.AB0020011button1.insertSub1.executePScriptOnLoad();
};

expj.AB0020010.AB0020011button1.insertSub1.executePScriptOnLoad = function () {
  console.log('execute AB0020011button1/insertSub1.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011button1-insertSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AB0020010-AB0020011button1-insertSub1" name="insertSub1" class="AB0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AB0020010-AB0020011button1-updateSub1">
expj.AB0020010.AB0020011button1.updateSub1 = {};
// script1="onClick;0;CHK;_AB0020011form2/TIME_CTRL[eq]true@*0"
expj.AB0020010.AB0020011button1.updateSub1.onClick0 = function () {
  console.log('updateSub1 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;~LEN(_AB0020011form2/JOB_ODR_DLV_DATE_TIME)[eq]1[or]~LEN(_AB0020011form2/JOB_ODR_DLV_DATE_TIME)[eq]2@#AS00017"
expj.AB0020010.AB0020011button1.updateSub1.child0 = function () {
  console.log('updateSub1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AB0020010', 'AB0020011button1', 'AS00017');
}
};
// script3="onClick;1;CHK;_AB0020011form2/TIME_CTRL[eq]true[and]~LEN(_AB0020011form2/JOB_ODR_DLV_DATE_TIME)[eq]3@*1"
expj.AB0020010.AB0020011button1.updateSub1.onClick1 = function () {
  console.log('updateSub1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="child;1;CHK;[{~CHARAT(_AB0020011form2/JOB_ODR_DLV_DATE_TIME:1)}*10+{~CHARAT(_AB0020011form2/JOB_ODR_DLV_DATE_TIME:2)}][gte]60@#AS00018"
expj.AB0020010.AB0020011button1.updateSub1.child1 = function () {
  console.log('updateSub1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AB0020010', 'AB0020011button1', 'AS00018');
}
};
// script5="onClick;2;CHK;_AB0020011form2/TIME_CTRL[eq]true[and]~LEN(_AB0020011form2/JOB_ODR_DLV_DATE_TIME)[eq]4@*2"
expj.AB0020010.AB0020011button1.updateSub1.onClick2 = function () {
  console.log('updateSub1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script6="child;2;CHK;[{~CHARAT(_AB0020011form2/JOB_ODR_DLV_DATE_TIME:0)}*10+{~CHARAT(_AB0020011form2/JOB_ODR_DLV_DATE_TIME:1)}][gte]24[or][{~CHARAT(_AB0020011form2/JOB_ODR_DLV_DATE_TIME:2)}*10+{~CHARAT(_AB0020011form2/JOB_ODR_DLV_DATE_TIME:3)}][gte]60@#AS00018"
expj.AB0020010.AB0020011button1.updateSub1.child2 = function () {
  console.log('updateSub1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AB0020010', 'AB0020011button1', 'AS00018');
}
};
// script7="onClick;3;CHK;_AB0020011form2/TIME_CTRL[eq]true[and]_AB0020011form2/JOB_ODR_DLV_DATE_TIME[eq]@*3"
expj.AB0020010.AB0020011button1.updateSub1.onClick3 = function () {
  console.log('updateSub1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script8="child;3;SET;_AB0020011form2/JOB_ODR_DLV_DATE_TIME=2359"
expj.AB0020010.AB0020011button1.updateSub1.child3 = function () {
  console.log('updateSub1 script8');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE_TIME', '2359');
};
// script9="onClick;4;CHK;_AB0020011form2/JOB_ODR_DLV_DATE[gt]_AB0020011form1/w_DATE_TO[or]_AB0020011form2/JOB_ODR_DLV_DATE[lt]_AB0020011form1/w_DATE_FROM@#AB00020"
expj.AB0020010.AB0020011button1.updateSub1.onClick4 = function () {
  console.log('updateSub1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form1/w_DATE_TO'))) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DLV_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form1/w_DATE_FROM')))) {
expj.common.pscript.addErrorMessage('AB0020010', 'AB0020011button1', 'AB00020');
}
};
// script10="onClick;5;CHK;_AB0020011form2/JOB_ODR_QTY[lte]0@!AB00037"
expj.AB0020010.AB0020011button1.updateSub1.onClick5 = function () {
  console.log('updateSub1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('AB0020010', 'AB0020011button1', 'AB00037');
}
};
// script11="onClick;6;CHK;_AB0020011form2/c_JOB_ODR_DEL_FLG[neq]true[and]_AB0020011form2/JOB_ODR_TYP[neq]1[and]_AB0020011form2/h_JOB_ODR_CD[neq]@!AB00052,*4"
expj.AB0020010.AB0020011button1.updateSub1.onClick6 = function () {
  console.log('updateSub1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/c_JOB_ODR_DEL_FLG'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_TYP'), '[neq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/h_JOB_ODR_CD'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('AB0020010', 'AB0020011button1', 'AB00052');
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script12="child;4;CHK;_AB0020011form2/c_JOB_ODR_DEL_FLG[neq]true[and]_AB0020011form2/PLAN_TYP[neq]1[and]_AB0020011form2/h_JOB_ODR_CD[neq]@!AB00052"
expj.AB0020010.AB0020011button1.updateSub1.child4 = function () {
  console.log('updateSub1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/c_JOB_ODR_DEL_FLG'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/PLAN_TYP'), '[neq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/h_JOB_ODR_CD'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('AB0020010', 'AB0020011button1', 'AB00052');
}
};
// script13="onClick;7;CHK;_AB0020011form2/JOB_ODR_STS_TYP[eq]1[or]_AB0020011form2/JOB_ODR_STS_TYP[eq]2@*5,*12"
expj.AB0020010.AB0020011button1.updateSub1.onClick7 = function () {
  console.log('updateSub1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_STS_TYP'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_STS_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script14="child;5;CHK;_AB0020011form2/c_JOB_ODR_DEL_FLG[eq]true@*6,*7"
expj.AB0020010.AB0020011button1.updateSub1.child5 = function () {
  console.log('updateSub1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/c_JOB_ODR_DEL_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script15="child;6;SET;_AB0020011form2/JOB_ODR_DEL_FLG=1@*23"
expj.AB0020010.AB0020011button1.updateSub1.child6 = function () {
  console.log('updateSub1 script15');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DEL_FLG', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child23)){this.child23();}}
};
// script16="child;7;SET;_AB0020011form2/JOB_ODR_EXP_TYP=1@*8"
expj.AB0020010.AB0020011button1.updateSub1.child7 = function () {
  console.log('updateSub1 script16');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_EXP_TYP', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
// script17="child;8;SET;_AB0020011form2/JOB_ODR_DEL_FLG=0@*9"
expj.AB0020010.AB0020011button1.updateSub1.child8 = function () {
  console.log('updateSub1 script17');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DEL_FLG', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script18="child;9;CHK;_AB0020011form2/c_JOB_ODR_STS_TYP[eq]true@*10,*11"
expj.AB0020010.AB0020011button1.updateSub1.child9 = function () {
  console.log('updateSub1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/c_JOB_ODR_STS_TYP'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script19="child;10;SET;_AB0020011form2/JOB_ODR_STS_TYP=2@*23"
expj.AB0020010.AB0020011button1.updateSub1.child10 = function () {
  console.log('updateSub1 script19');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_STS_TYP', '2');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child23)){this.child23();}}
};
// script20="child;11;SET;_AB0020011form2/JOB_ODR_STS_TYP=1@*23"
expj.AB0020010.AB0020011button1.updateSub1.child11 = function () {
  console.log('updateSub1 script20');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_STS_TYP', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child23)){this.child23();}}
};
// script21="child;12;CHK;_AB0020011form2/c_JOB_ODR_EXP_TYP[eq]true@*13,*15"
expj.AB0020010.AB0020011button1.updateSub1.child12 = function () {
  console.log('updateSub1 script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/c_JOB_ODR_EXP_TYP'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script22="child;13;SET;_AB0020011form2/JOB_ODR_EXP_TYP=1@*14"
expj.AB0020010.AB0020011button1.updateSub1.child13 = function () {
  console.log('updateSub1 script22');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_EXP_TYP', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child14)){this.child14();}}
};
// script23="child;14;SET;_AB0020011form2/JOB_ODR_DEL_FLG=1@*23"
expj.AB0020010.AB0020011button1.updateSub1.child14 = function () {
  console.log('updateSub1 script23');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DEL_FLG', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child23)){this.child23();}}
};
// script24="child;15;CHK;_AB0020011form2/c_JOB_ODR_DEL_FLG[eq]true@*16,*18"
expj.AB0020010.AB0020011button1.updateSub1.child15 = function () {
  console.log('updateSub1 script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/c_JOB_ODR_DEL_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
} else {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script25="child;16;SET;_AB0020011form2/JOB_ODR_EXP_TYP=2@*17"
expj.AB0020010.AB0020011button1.updateSub1.child16 = function () {
  console.log('updateSub1 script25');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_EXP_TYP', '2');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child17)){this.child17();}}
};
// script26="child;17;SET;_AB0020011form2/JOB_ODR_DEL_FLG=1@*23"
expj.AB0020010.AB0020011button1.updateSub1.child17 = function () {
  console.log('updateSub1 script26');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DEL_FLG', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child23)){this.child23();}}
};
// script27="child;18;SET;_AB0020011form2/JOB_ODR_EXP_TYP=2@*19"
expj.AB0020010.AB0020011button1.updateSub1.child18 = function () {
  console.log('updateSub1 script27');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_EXP_TYP', '2');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child19)){this.child19();}}
};
// script28="child;19;SET;_AB0020011form2/JOB_ODR_DEL_FLG=0@*23"
expj.AB0020010.AB0020011button1.updateSub1.child19 = function () {
  console.log('updateSub1 script28');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DEL_FLG', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child23)){this.child23();}}
};
// script29="child;20;CHK;_AB0020011form2/JOB_ODR_DEL_FLG[eq]1[and]_AB0020011form2/h_JOB_ODR_CD[neq]@*21,*22"
expj.AB0020010.AB0020011button1.updateSub1.child20 = function () {
  console.log('updateSub1 script29');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/JOB_ODR_DEL_FLG'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/h_JOB_ODR_CD'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
} else {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script30="child;21;CFMPUT;_AB0020011button1/updateSub1=YES:22@AB00051"
expj.AB0020010.AB0020011button1.updateSub1.child21 = function () {
  console.log('updateSub1 script30');
var yesFunc = function () {
expj.AB0020010.AB0020011button1.updateSub1.child22();
};
var noFunc = function () {
};
expj.common.pscript.executeConfirmPut('AB0020010', 'AB0020011button1', '_AB0020011button1/updateSub1', 'AB00051', yesFunc, noFunc);
};
// script31="child;22;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AB0020011form1/*,_AB0020011form2/*@AB0020010Servlet,,$ZZ07003"
expj.AB0020010.AB0020011button1.updateSub1.child22 = function () {
  console.log('updateSub1 script31');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AB0020010', 'AB0020011button1', '_AB0020011form1/*,_AB0020011form2/*', 'AB0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AB0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AB0020010', response);
expj.common.changeBusinessScreenTab('AB0020010', contents);
};
expj.common.pscript.callConfirm('AB0020010', 'AB0020011button1', 'ZZ07003', okEvent);
};
// script32="child;23;CHK;?AB0020011form2/JOB_ODR_TYP[eq]SAME[and]?AB0020011form2/PLAN_TYP[eq]SAME[and]?AB0020011form2/JOB_ODR_DLV_DATE[eq]SAME[and]?AB0020011form2/JOB_ODR_QTY[eq]SAME[and]?AB0020011form2/ALC_GRP_CD[eq]SAME[and]_AB0020011form2/c_JOB_ODR_DEL_FLG[eq]_AB0020011form1/DEL_FLG[and]_AB0020011form2/c_JOB_ODR_STS_TYP[eq]_AB0020011form1/STS_FLG[and]_AB0020011form2/c_JOB_ODR_EXP_TYP[eq]_AB0020011form1/EXP_FLG@*24,*25"
expj.AB0020010.AB0020011button1.updateSub1.child23 = function () {
  console.log('updateSub1 script32');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '?AB0020011form2/JOB_ODR_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '?AB0020011form2/PLAN_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '?AB0020011form2/JOB_ODR_DLV_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '?AB0020011form2/JOB_ODR_QTY'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '?AB0020011form2/ALC_GRP_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/c_JOB_ODR_DEL_FLG'), '[eq]', expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form1/DEL_FLG')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/c_JOB_ODR_STS_TYP'), '[eq]', expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form1/STS_FLG')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/c_JOB_ODR_EXP_TYP'), '[eq]', expj.common.pscript.getReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form1/EXP_FLG'))) {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
} else {
if(expj.common.checkNameSpace(this.child25)){this.child25();}
}
};
// script33="child;24;SET;_AB0020011form2/UPDATE_FLG=1@*20"
expj.AB0020010.AB0020011button1.updateSub1.child24 = function () {
  console.log('updateSub1 script33');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/UPDATE_FLG', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child20)){this.child20();}}
};
// script34="child;25;SET;_AB0020011form2/UPDATE_FLG=0@*20"
expj.AB0020010.AB0020011button1.updateSub1.child25 = function () {
  console.log('updateSub1 script34');
expj.common.pscript.setReferenceComponentValue('AB0020010', 'AB0020011button1', '_AB0020011form2/UPDATE_FLG', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child20)){this.child20();}}
};
expj.AB0020010.AB0020011button1.updateSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 7; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0020010.AB0020011button1.updateSub1['onClick' + i])) {
        expj.AB0020010.AB0020011button1.updateSub1['onClick' + i]();
      }
    }
  }
};
expj.AB0020010.AB0020011button1.updateSub1.executeAllOnDecision = function () {
};
expj.AB0020010.AB0020011button1.updateSub1.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011button1-updateSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0020010', 'AB0020011button1', 'updateSub1', this, 'Button');
    }
  });
  expj.AB0020010.AB0020011button1.updateSub1.executePScriptOnLoad();
};

expj.AB0020010.AB0020011button1.updateSub1.executePScriptOnLoad = function () {
  console.log('execute AB0020011button1/updateSub1.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011button1-updateSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AB0020010-AB0020011button1-updateSub1" name="updateSub1" class="AB0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 95px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AB0020011 Revision: 1.12  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AB0020010-AB0020011button0">
expj.AB0020010.AB0020011button0 = {};
expj.AB0020010.AB0020011button0.executeAllOnDecision = function () {
  console.log('execute AB0020011button0.onDecision');
};
expj.AB0020010.AB0020011button0.executeOnLoad = function () {
  expj.AB0020010.AB0020011button0.executePScriptOnLoad();
};

expj.AB0020010.AB0020011button0.executePScriptOnLoad = function () {
  console.log('execute AB0020011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AB0020010-AB0020011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AB0020010-AB0020011button0-cancelSub1">
expj.AB0020010.AB0020011button0.cancelSub1 = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>@AB0020010Servlet,,$ZZ07013"
expj.AB0020010.AB0020011button0.cancelSub1.onClick0 = function () {
  console.log('cancelSub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AB0020010', 'AB0020011button0', '', 'AB0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AB0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AB0020010', response);
expj.common.changeBusinessScreenTab('AB0020010', contents);
};
expj.common.pscript.callConfirm('AB0020010', 'AB0020011button0', 'ZZ07013', okEvent);
};
expj.AB0020010.AB0020011button0.cancelSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AB0020010.AB0020011button0.cancelSub1['onClick' + i])) {
        expj.AB0020010.AB0020011button0.cancelSub1['onClick' + i]();
      }
    }
  }
};
expj.AB0020010.AB0020011button0.cancelSub1.executeAllOnDecision = function () {
};
expj.AB0020010.AB0020011button0.cancelSub1.executeOnLoad = function () {
  $('#expj-AB0020010-AB0020011button0-cancelSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AB0020010', 'AB0020011button0', 'cancelSub1', this, 'Button');
    }
  });
  expj.AB0020010.AB0020011button0.cancelSub1.executePScriptOnLoad();
};

expj.AB0020010.AB0020011button0.cancelSub1.executePScriptOnLoad = function () {
  console.log('execute AB0020011button0/cancelSub1.onLoad');
  var targetComponent = document.getElementById('expj-AB0020010-AB0020011button0-cancelSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AB0020010-AB0020011button0-cancelSub1" name="cancelSub1" class="AB0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AB0020010 (END)-->
<%
MessageStruct msgStruct = aAB0020010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AB0020010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AB0020010)) {
  expj.common.treeInstanceMap.AB0020010 = {};
}
expj.common.treeInstanceMap.AB0020010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AB0020010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AB0020010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AB0020010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AB0020010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AB0020010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AB0020010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AB0020010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AB0020010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AB0020010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AB0020010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AB0020010)) {
  expj.common.detailDialogMap.AB0020010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AB0020010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AB0020010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AB0020010.<%=detailId %>)) {
  expj.common.detailDialogMap.AB0020010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AB0020010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AB0020010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AB0020010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AB0020010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AB0020010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AB0020010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AB0020010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AB0020010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AB0020010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AB0020010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AB0020010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AB0020010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AB0020010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AB0020010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AB0020010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AB0020010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AB0020010)) {
  expj.common.viewInstanceMap.AB0020010 = {};
}
expj.common.viewInstanceMap.AB0020010.<%=viewId %> = {};
expj.common.viewInstanceMap.AB0020010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AB0020010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AB0020010.<%=viewId %>.init = function () {
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
    expj.AB0020010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AB0020010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AB0020010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AB0020010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AB0020010_init">
/**
 * AB0020010用のロード完了時初期化関数
 */
expj.AB0020010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AB0020010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AB0020010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AB0020010');
  expj.common.calendarInstanceMap.AB0020010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AB0020010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AB0020010.<%=detailId %>.init();
  expj.common.detailDialogMap.AB0020010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AB0020010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AB0020010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AB0020010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AB0020010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AB0020010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AB0020010-<%=detailId %>');
<%
 }
%>
  try{expj.AB0020010.AB0020011form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form1.UNIT_QTY_TYP.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form1.DEL_FLG.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form1.STS_FLG.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form1.EXP_FLG.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form1.w_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form1.w_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form2.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form2.h_AUTO_NUM.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form2.c_AUTO_NUM.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form2.h_PRD_REQ_JOB_ODR_TYP_2.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form2.JOB_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form2.h_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form2.PLAN_TYP.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form2.JOB_ODR_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form2.CalendarJOB_ODR_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form2.JOB_ODR_DLV_DATE_TIME.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form2.JOB_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form2.ALC_GRP_CD.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form2.c_JOB_ODR_DEL_FLG.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form2.JOB_ODR_DEL_FLG.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form2.MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form2.c_JOB_ODR_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form2.JOB_ODR_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form2.UPDATE_FLG.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form2.c_JOB_ODR_EXP_TYP.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form2.JOB_ODR_EXP_TYP.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form2.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011button1.insertSub1.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011button1.updateSub1.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011button0.cancelSub1.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form1.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011form2.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011button1.executeOnLoad();}catch(e){};
  try{expj.AB0020010.AB0020011button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AB0020010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AB0020010', 'AB0020010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AB0020010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AB0020010-focus-move');
  // 初期フォーカス当てる処理
  $('.AB0020010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AB0020010', '<%=request.getContextPath() %>');
};

/**
 * AB0020010の全体onDecision処理
 */
expj.AB0020010.executeAllOnDecision = function () {
  expj.AB0020010.AB0020011form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AB0020010_console">
expj.AB0020010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>