<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 13:01:16 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KR0070\KR0070010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KR0070.*" %>
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
<jsp:useBean id="aKR0070010Control" class="com.nec.jp.orteus.metamorBase.KR0070.KR0070010Control" scope="request"/>
<jsp:useBean id="aKR0070010Struct" class="com.nec.jp.orteus.metamorBase.KR0070.KR0070010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

売上登録（非在庫品）
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0070/jsp/KR0070010.jsp,v $
$Author: geng-jia $	
$Revision: 1.5 $　$Date: 2017/02/22 02:07:21 $
********************************************************* --%>
<html>
<head>
<title>売上登録（非在庫品）</title>
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
<script class="expj-script-KR0070010_init">
  // KR0070010名前空間
  expj.KR0070010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<%
    // 実行環境
    String explannerFlag = aKR0070010Control.getExplannerFlag();
	// 会社コード
	String sysCompanyCd = aKR0070010Control.getsysCOMPANY_CD();
	
	// 伝票番号
	String sqlnameSlipCd = new String();
	String sqlparamSlipCd1 = new String();
	String sqlparamSlipCd2 = new String();
	String sqlparamSlipCd3 = new String();
	
	// 売上計上部門
	String sqlnameOrgCd = new String();
	String sqlparamOrgCd1 = new String();
	String sqlparamOrgCd2 = new String();
	
	// 営業担当者コード
	String sqlnameCustChrgPsnCd = new String();
	String sqlparamCustChrgPsnCd1 = new String();
	String sqlparamCustChrgPsnCd2 = new String();
	
	// 品目番号
	String sqlnameItemCd = new String();
	String sqlparamItemCd1 = new String();
	String sqlparamItemCd2 = new String();
	
    // Explanner/Jの場合
	if("J".equals(explannerFlag)){
		// 伝票番号
		sqlnameSlipCd = "SLIP_CD_22";
		sqlparamSlipCd1 = "_KR0070010form1/ODR_NO";
		sqlparamSlipCd2 = "_KR0070010form1/SLIP_CD";
		sqlparamSlipCd3 = "";
		
	    // 売上計上部門
		sqlnameOrgCd = "ORG_CD_D01";
		sqlparamOrgCd1 = "_KR0070010form2/SALES_DEPT_CD";
		sqlparamOrgCd2 = "";
		// 営業担当者コード
	    sqlnameCustChrgPsnCd = "USER_CD_06";
		sqlparamCustChrgPsnCd1 = "_KR0070010form2/CUST_CHRG_PSN_CD";
		sqlparamCustChrgPsnCd2 = "";
		// 品目番号
		sqlnameItemCd = "ITEM_CD_12";
		sqlparamItemCd1 = "_KR0070010form2/ITEM_CD";
		sqlparamItemCd2 = "";
		
	}
	// Explanner/Jaの場合
	else if("Ja".equals(explannerFlag)){
		// 伝票番号
		sqlnameSlipCd = "MP_SLIP_CD_04";
		sqlparamSlipCd1 = "_KR0070010form1/ODR_NO";
		sqlparamSlipCd2 = "_KR0070010form1/SLIP_CD";
		sqlparamSlipCd3 = "";
		
	   // 売上計上部門
		sqlnameOrgCd = "ORG_CD_D01";
		sqlparamOrgCd1 = "_KR0070010form2/SALES_DEPT_CD";
		sqlparamOrgCd2 = "";
		// 営業担当者コード
	    sqlnameCustChrgPsnCd = "USER_CD_06";
		sqlparamCustChrgPsnCd1 = "_KR0070010form2/CUST_CHRG_PSN_CD";
		sqlparamCustChrgPsnCd2 = "";
		// 品目番号
		sqlnameItemCd = "ITEM_CD_12";
		sqlparamItemCd1 = "_KR0070010form2/ITEM_CD";
		sqlparamItemCd2 = "";
	}
	// Explanner/JaScmの場合
	else if("JaScm".equals(explannerFlag)){
		// 伝票番号
		sqlnameSlipCd = "SCM_SLIP_CD_04";
		sqlparamSlipCd1 = sysCompanyCd;
		sqlparamSlipCd2 = "_KR0070010form1/ODR_NO";
		sqlparamSlipCd3 = "_KR0070010form1/SLIP_CD";
				
	   // 売上計上部門
		sqlnameOrgCd = "SCM_ORG_CD_02";
		sqlparamOrgCd1 = sysCompanyCd;
		sqlparamOrgCd2 = "_KR0070010form2/SALES_DEPT_CD";
		// 営業担当者コード
	    sqlnameCustChrgPsnCd = "SCM_USER_CD_03";
		sqlparamCustChrgPsnCd1 = sysCompanyCd;
		sqlparamCustChrgPsnCd2 = "_KR0070010form2/CUST_CHRG_PSN_CD";
		// 品目番号
		sqlnameItemCd = "SCM_PLANT_ITEM_CD_12";
		sqlparamItemCd1 = sysCompanyCd;
		sqlparamItemCd2 = "_KR0070010form2/ITEM_CD";
	}
	// Explanner/Jｆの場合
	else{
		// 伝票番号
		sqlnameSlipCd = "FD_SHIP_DLV_H_NO_09";
		sqlparamSlipCd1 = "_KR0070010form1/ODR_NO";
		sqlparamSlipCd2 = "_KR0070010form1/SLIP_CD";
		sqlparamSlipCd3 = "";
		
	  // 売上計上部門
		sqlnameOrgCd = "FD_CUST_CHRG_ORG_CD";
		sqlparamOrgCd1 = "_KR0070010form2/SALES_DEPT_CD";
		sqlparamOrgCd2 = "";
		// 営業担当者コード
	    sqlnameCustChrgPsnCd = "FD_CUST_CHRG_PSN_CD";
		sqlparamCustChrgPsnCd1 = "_KR0070010form2/CUST_CHRG_PSN_CD";
		sqlparamCustChrgPsnCd2 = "";
		// 品目番号
		sqlnameItemCd = "FD_ITEM_CD_01";
		sqlparamItemCd1 = "_KR0070010form2/CUST_CD";
		sqlparamItemCd2 = "_KR0070010form2/ITEM_CD";
	}
%>

<body>
  <div id="expj-business-screen-KR0070010" data-screen="KR0070010" data-newdata="<%=aKR0070010Control.isNewData() %>">
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
			  <script class="expj-script-KR0070010-KR0070010form1">
expj.KR0070010.KR0070010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5"
expj.KR0070010.KR0070010form1.onLoad0 = function () {
  console.log('KR0070010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
};
// script2="onDecision;0;CHK;_KR0070010form1/rdoInsert[eq]true@*0,*1"
expj.KR0070010.KR0070010form1.onDecision0 = function () {
  console.log('KR0070010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form1', '_KR0070010form1/rdoInsert'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;CHKRQ;A@*2,*3"
expj.KR0070010.KR0070010form1.child0 = function () {
  console.log('KR0070010form1 script3');
if (expj.common.pscript.satisfiedRequiredComponent('KR0070010', 'A')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;1;CHKRQ;A,B@*2,*3"
expj.KR0070010.KR0070010form1.child1 = function () {
  console.log('KR0070010form1 script4');
if (expj.common.pscript.satisfiedRequiredComponent('KR0070010', 'A') && expj.common.pscript.satisfiedRequiredComponent('KR0070010', 'B')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="child;2;UNMASK;_KR0070010button1/Select"
expj.KR0070010.KR0070010form1.child2 = function () {
  console.log('KR0070010form1 script5');
expj.common.pscript.setUnMaskToReferenceComponent('KR0070010', 'KR0070010form1', '_KR0070010button1/Select');
};
// script6="child;3;MASK;_KR0070010button1/Select"
expj.KR0070010.KR0070010form1.child3 = function () {
  console.log('KR0070010form1 script6');
expj.common.pscript.setMaskToReferenceComponent('KR0070010', 'KR0070010form1', '_KR0070010button1/Select');
};
// script7="onDecision;1;CHKRQ;C@*4,*5"
expj.KR0070010.KR0070010form1.onDecision1 = function () {
  console.log('KR0070010form1 script7');
if (expj.common.pscript.satisfiedRequiredComponent('KR0070010', 'C')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="child;4;CHK;_KR0070010form1/rdoInsert[eq]true@*6,*7"
expj.KR0070010.KR0070010form1.child4 = function () {
  console.log('KR0070010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form1', '_KR0070010form1/rdoInsert'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script9="child;5;MASK;_KR0070010button2/Recalc,_KR0070010button2/Insert@*8"
expj.KR0070010.KR0070010form1.child5 = function () {
  console.log('KR0070010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('KR0070010', 'KR0070010form1', '_KR0070010button2/Recalc');
expj.common.pscript.setMaskToReferenceComponent('KR0070010', 'KR0070010form1', '_KR0070010button2/Insert');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
// script10="child;6;UNMASK;_KR0070010button2/Recalc,_KR0070010button2/Insert@*8"
expj.KR0070010.KR0070010form1.child6 = function () {
  console.log('KR0070010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('KR0070010', 'KR0070010form1', '_KR0070010button2/Recalc');
expj.common.pscript.setUnMaskToReferenceComponent('KR0070010', 'KR0070010form1', '_KR0070010button2/Insert');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
// script11="child;7;UNMASK;_KR0070010button2/Update,_KR0070010button2/Delete@*15"
expj.KR0070010.KR0070010form1.child7 = function () {
  console.log('KR0070010form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('KR0070010', 'KR0070010form1', '_KR0070010button2/Update');
expj.common.pscript.setUnMaskToReferenceComponent('KR0070010', 'KR0070010form1', '_KR0070010button2/Delete');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child15)){this.child15();}}
};
// script12="child;8;MASK;_KR0070010button2/Update,_KR0070010button2/Delete"
expj.KR0070010.KR0070010form1.child8 = function () {
  console.log('KR0070010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('KR0070010', 'KR0070010form1', '_KR0070010button2/Update');
expj.common.pscript.setMaskToReferenceComponent('KR0070010', 'KR0070010form1', '_KR0070010button2/Delete');
};
// script13="onDecision;2;CHK;_KR0070010form2/SALES_UNIT_PRICE[numeq]0[and]_KR0070010form2/SALES_QTY[numeq]0@*9,*10"
expj.KR0070010.KR0070010form1.onDecision2 = function () {
  console.log('KR0070010form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form1', '_KR0070010form2/SALES_UNIT_PRICE')), '[numeq]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form1', '_KR0070010form2/SALES_QTY')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script14="child;9;UNMASK;_KR0070010form2/SALES_AMOUNT"
expj.KR0070010.KR0070010form1.child9 = function () {
  console.log('KR0070010form1 script14');
expj.common.pscript.setUnMaskToReferenceComponent('KR0070010', 'KR0070010form1', '_KR0070010form2/SALES_AMOUNT');
};
// script15="child;10;MASK;_KR0070010form2/SALES_AMOUNT"
expj.KR0070010.KR0070010form1.child10 = function () {
  console.log('KR0070010form1 script15');
expj.common.pscript.setMaskToReferenceComponent('KR0070010', 'KR0070010form1', '_KR0070010form2/SALES_AMOUNT');
};
// script16="onDecision;5;CHK;?KR0070010form1/*[eq]NORMAL@*11,*5"
expj.KR0070010.KR0070010form1.onDecision5 = function () {
  console.log('KR0070010form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form1', '?KR0070010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script17="child;11;CHK;_KR0070010form1/ODR_NO[neq]_KR0070010form1/h_ODR_NO[or]_KR0070010form1/SLIP_CD[neq]_KR0070010form1/h_SLIP_CD[or]_KR0070010form1/rdoInsert[neq]_KR0070010form1/h_rdoInsert@*5"
expj.KR0070010.KR0070010form1.child11 = function () {
  console.log('KR0070010form1 script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form1', '_KR0070010form1/ODR_NO'), '[neq]', expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form1', '_KR0070010form1/h_ODR_NO')) || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form1', '_KR0070010form1/SLIP_CD'), '[neq]', expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form1', '_KR0070010form1/h_SLIP_CD')) || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form1', '_KR0070010form1/rdoInsert'), '[neq]', expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form1', '_KR0070010form1/h_rdoInsert'))) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script18="onDecision;4;CHK;_KR0070010form1/rdoInsert[eq]true@*12,*13"
expj.KR0070010.KR0070010form1.onDecision4 = function () {
  console.log('KR0070010form1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form1', '_KR0070010form1/rdoInsert'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script19="child;12;MASK;_KR0070010form1/SLIP_CD,_KR0070010form1/PeekerSlipCd@*14"
expj.KR0070010.KR0070010form1.child12 = function () {
  console.log('KR0070010form1 script19');
expj.common.pscript.setMaskToReferenceComponent('KR0070010', 'KR0070010form1', '_KR0070010form1/SLIP_CD');
expj.common.pscript.setMaskToReferenceComponent('KR0070010', 'KR0070010form1', '_KR0070010form1/PeekerSlipCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child14)){this.child14();}}
};
// script20="child;13;UNMASK;_KR0070010form1/SLIP_CD,_KR0070010form1/PeekerSlipCd"
expj.KR0070010.KR0070010form1.child13 = function () {
  console.log('KR0070010form1 script20');
expj.common.pscript.setUnMaskToReferenceComponent('KR0070010', 'KR0070010form1', '_KR0070010form1/SLIP_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KR0070010', 'KR0070010form1', '_KR0070010form1/PeekerSlipCd');
};
// script21="child;14;SET;_KR0070010form1/SLIP_CD="
expj.KR0070010.KR0070010form1.child14 = function () {
  console.log('KR0070010form1 script21');
expj.common.pscript.setReferenceComponentValue('KR0070010', 'KR0070010form1', '_KR0070010form1/SLIP_CD', '');
};
// script22="child;15;MASK;_KR0070010button2/Insert"
expj.KR0070010.KR0070010form1.child15 = function () {
  console.log('KR0070010form1 script22');
expj.common.pscript.setMaskToReferenceComponent('KR0070010', 'KR0070010form1', '_KR0070010button2/Insert');
};
// script23="onDecision;3;CHKRQ;C@*16,*17"
expj.KR0070010.KR0070010form1.onDecision3 = function () {
  console.log('KR0070010form1 script23');
if (expj.common.pscript.satisfiedRequiredComponent('KR0070010', 'C')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
} else {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script24="child;16;UNMASK;_KR0070010button2/Recalc"
expj.KR0070010.KR0070010form1.child16 = function () {
  console.log('KR0070010form1 script24');
expj.common.pscript.setUnMaskToReferenceComponent('KR0070010', 'KR0070010form1', '_KR0070010button2/Recalc');
};
// script25="child;17;MASK;_KR0070010button2/Recalc"
expj.KR0070010.KR0070010form1.child17 = function () {
  console.log('KR0070010form1 script25');
expj.common.pscript.setMaskToReferenceComponent('KR0070010', 'KR0070010form1', '_KR0070010button2/Recalc');
};
expj.KR0070010.KR0070010form1.executeAllOnDecision = function () {
  console.log('execute KR0070010form1.onDecision');
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0070010.KR0070010form1['onDecision' + i])) {
        expj.KR0070010.KR0070010form1['onDecision' + i]();
      }
    }
  }
};
expj.KR0070010.KR0070010form1.executeOnLoad = function () {
  expj.KR0070010.KR0070010form1.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form1.executePScriptOnLoad = function () {
  console.log('execute KR0070010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KR0070010.KR0070010form1['onLoad' + i])) {
      expj.KR0070010.KR0070010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KR0070010-KR0070010form1" action="KR0070010Servlet" name="KR0070010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKR0070010Control.getReadStatusString()) %>" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ACPT_ODR_CD",rb)%></span><!-- 受注番号 --></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form1-ODR_NO">
expj.KR0070010.KR0070010form1.ODR_NO = {};
expj.KR0070010.KR0070010form1.ODR_NO.executeAllOnDecision = function () {
  console.log('execute KR0070010form1/ODR_NO.onDecision');
  expj.KR0070010.KR0070010form1.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form1.ODR_NO.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form1-ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form1', 'ODR_NO', this);
  });
  expj.KR0070010.KR0070010form1.ODR_NO.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form1.ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KR0070010form1/ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form1-ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form1-ODR_NO" name="ODR_NO" class="KR0070010-focus-move  required-value expj-KR0070010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getODR_NO()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-KR0070010-KR0070010form1-h_rdoInsert" name="h_rdoInsert" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0070010Struct.geth_rdoInsert()) %>">
<script class="expj-script-KR0070010-KR0070010form1-h_rdoInsert">
expj.KR0070010.KR0070010form1.h_rdoInsert = {};
expj.KR0070010.KR0070010form1.h_rdoInsert.executeAllOnDecision = function () {
  console.log('execute KR0070010form1/h_rdoInsert.onDecision');
  expj.KR0070010.KR0070010form1.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form1.h_rdoInsert.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form1-h_rdoInsert').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form1', 'h_rdoInsert', this);
  });
  expj.KR0070010.KR0070010form1.h_rdoInsert.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form1.h_rdoInsert.executePScriptOnLoad = function () {
  console.log('execute KR0070010form1/h_rdoInsert.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form1-h_rdoInsert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-KR0070010-KR0070010form1-ODR_NO_PEEKER">
expj.KR0070010.KR0070010form1.ODR_NO_PEEKER = {};
// script1="onClick;0;PEEKER;_KR0070010form1/ODR_NO@<%=contextNo%>"
expj.KR0070010.KR0070010form1.ODR_NO_PEEKER.onClick0 = function () {
  console.log('ODR_NO_PEEKER script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KR0070010';
var parameterValues = 'ODR_NO_PEEKER%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('KR0070010', 'ODR_NO_PEEKER', 'SQLPARAM_1', '<%=sysCompanyCd%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form1', '_KR0070010form1/ODR_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ODR_NO_UNSTOCK_01%&%';
parameterValues += 'TARGET_FIELD%=%_KR0070010form1/ODR_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KR0070010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KR0070010.KR0070010form1.ODR_NO_PEEKER.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0070010.KR0070010form1.ODR_NO_PEEKER['onClick' + i])) {
        expj.KR0070010.KR0070010form1.ODR_NO_PEEKER['onClick' + i]();
      }
    }
  }
};
expj.KR0070010.KR0070010form1.ODR_NO_PEEKER.executeAllOnDecision = function () {
};
expj.KR0070010.KR0070010form1.ODR_NO_PEEKER.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form1-ODR_NO_PEEKER').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0070010', 'KR0070010form1', 'ODR_NO_PEEKER', this, 'Button');
    }
  });
  expj.KR0070010.KR0070010form1.ODR_NO_PEEKER.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form1.ODR_NO_PEEKER.executePScriptOnLoad = function () {
  console.log('execute KR0070010form1/ODR_NO_PEEKER.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form1-ODR_NO_PEEKER');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KR0070010-KR0070010form1-ODR_NO_PEEKER" class="KR0070010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form1-rdoInsert">
expj.KR0070010.KR0070010form1.rdoInsert = {};
expj.KR0070010.KR0070010form1.rdoInsert.executeAllOnDecision = function () {
  console.log('execute KR0070010form1/rdoInsert.onDecision');
  expj.KR0070010.KR0070010form1.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form1.rdoInsert.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form1-rdoInsert').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0070010', 'KR0070010form1', 'rdoInsert', this, 'RadioButton');
    }
  });
  expj.KR0070010.KR0070010form1.rdoInsert.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form1.rdoInsert.executePScriptOnLoad = function () {
  console.log('execute KR0070010form1/rdoInsert.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form1-rdoInsert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="radio" name="rdoProcessTyp" data-name="rdoInsert" value="true" <%= ("true".equals(TypeConverter.convert(aKR0070010Struct.getrdoInsert())))?"checked=\"checked\"":"" %> class="" id="expj-KR0070010-KR0070010form1-rdoInsert" ><label for="expj-KR0070010-KR0070010form1-rdoInsert"><%=CoreTools.getRBString("Expj.Cmt0011",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-KR0070010-KR0070010form1-MODIFY_COUNT" name="MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getMODIFY_COUNT()) %>">
<script class="expj-script-KR0070010-KR0070010form1-MODIFY_COUNT">
expj.KR0070010.KR0070010form1.MODIFY_COUNT = {};
expj.KR0070010.KR0070010form1.MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute KR0070010form1/MODIFY_COUNT.onDecision');
  expj.KR0070010.KR0070010form1.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form1.MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form1-MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form1', 'MODIFY_COUNT', this);
  });
  expj.KR0070010.KR0070010form1.MODIFY_COUNT.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form1.MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute KR0070010form1/MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form1-MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KR0070010-KR0070010form1-h_ODR_NO" name="h_ODR_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0070010Struct.geth_ODR_NO()) %>">
<script class="expj-script-KR0070010-KR0070010form1-h_ODR_NO">
expj.KR0070010.KR0070010form1.h_ODR_NO = {};
expj.KR0070010.KR0070010form1.h_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KR0070010form1/h_ODR_NO.onDecision');
  expj.KR0070010.KR0070010form1.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form1.h_ODR_NO.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form1-h_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form1', 'h_ODR_NO', this);
  });
  expj.KR0070010.KR0070010form1.h_ODR_NO.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form1.h_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KR0070010form1/h_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form1-h_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KR0070010-KR0070010form1-ODR_MODIFY_COUNT" name="ODR_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getODR_MODIFY_COUNT()) %>">
<script class="expj-script-KR0070010-KR0070010form1-ODR_MODIFY_COUNT">
expj.KR0070010.KR0070010form1.ODR_MODIFY_COUNT = {};
expj.KR0070010.KR0070010form1.ODR_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute KR0070010form1/ODR_MODIFY_COUNT.onDecision');
  expj.KR0070010.KR0070010form1.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form1.ODR_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form1-ODR_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form1', 'ODR_MODIFY_COUNT', this);
  });
  expj.KR0070010.KR0070010form1.ODR_MODIFY_COUNT.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form1.ODR_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute KR0070010form1/ODR_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form1-ODR_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.SLIP_CD",rb)%></span><!-- 伝票番号 --></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form1-SLIP_CD">
expj.KR0070010.KR0070010form1.SLIP_CD = {};
expj.KR0070010.KR0070010form1.SLIP_CD.executeAllOnDecision = function () {
  console.log('execute KR0070010form1/SLIP_CD.onDecision');
  expj.KR0070010.KR0070010form1.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form1.SLIP_CD.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form1-SLIP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form1', 'SLIP_CD', this);
  });
  expj.KR0070010.KR0070010form1.SLIP_CD.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form1.SLIP_CD.executePScriptOnLoad = function () {
  console.log('execute KR0070010form1/SLIP_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form1-SLIP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form1-SLIP_CD" name="SLIP_CD" class="KR0070010-focus-move  required-value expj-KR0070010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getSLIP_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-KR0070010-KR0070010form1-H_MODIFY_COUNT" name="H_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getH_MODIFY_COUNT()) %>">
<script class="expj-script-KR0070010-KR0070010form1-H_MODIFY_COUNT">
expj.KR0070010.KR0070010form1.H_MODIFY_COUNT = {};
expj.KR0070010.KR0070010form1.H_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute KR0070010form1/H_MODIFY_COUNT.onDecision');
  expj.KR0070010.KR0070010form1.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form1.H_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form1-H_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form1', 'H_MODIFY_COUNT', this);
  });
  expj.KR0070010.KR0070010form1.H_MODIFY_COUNT.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form1.H_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute KR0070010form1/H_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form1-H_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-KR0070010-KR0070010form1-PeekerSlipCd">
expj.KR0070010.KR0070010form1.PeekerSlipCd = {};
// script1="onClick;0;PEEKER;_KR0070010form1/SLIP_CD@<%=contextNo%>"
expj.KR0070010.KR0070010form1.PeekerSlipCd.onClick0 = function () {
  console.log('PeekerSlipCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KR0070010';
var parameterValues = 'PeekerSlipCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('KR0070010', 'PeekerSlipCd', 'SQLPARAM_1', '<%=sqlparamSlipCd1%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
var checkParam = expj.common.pscript.getPeekerParam('KR0070010', 'PeekerSlipCd', 'SQLPARAM_2', '<%=sqlparamSlipCd2%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_3%=%';
var checkParam = expj.common.pscript.getPeekerParam('KR0070010', 'PeekerSlipCd', 'SQLPARAM_3', '<%=sqlparamSlipCd3%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%<%=sqlnameSlipCd%>%&%';
parameterValues += 'TARGET_FIELD%=%_KR0070010form1/SLIP_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KR0070010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KR0070010.KR0070010form1.PeekerSlipCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0070010.KR0070010form1.PeekerSlipCd['onClick' + i])) {
        expj.KR0070010.KR0070010form1.PeekerSlipCd['onClick' + i]();
      }
    }
  }
};
expj.KR0070010.KR0070010form1.PeekerSlipCd.executeAllOnDecision = function () {
};
expj.KR0070010.KR0070010form1.PeekerSlipCd.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form1-PeekerSlipCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0070010', 'KR0070010form1', 'PeekerSlipCd', this, 'Button');
    }
  });
  expj.KR0070010.KR0070010form1.PeekerSlipCd.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form1.PeekerSlipCd.executePScriptOnLoad = function () {
  console.log('execute KR0070010form1/PeekerSlipCd.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form1-PeekerSlipCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KR0070010-KR0070010form1-PeekerSlipCd" class="KR0070010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form1-rdoUpdateDelete">
expj.KR0070010.KR0070010form1.rdoUpdateDelete = {};
expj.KR0070010.KR0070010form1.rdoUpdateDelete.executeAllOnDecision = function () {
  console.log('execute KR0070010form1/rdoUpdateDelete.onDecision');
  expj.KR0070010.KR0070010form1.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form1.rdoUpdateDelete.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form1-rdoUpdateDelete').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0070010', 'KR0070010form1', 'rdoUpdateDelete', this, 'RadioButton');
    }
  });
  expj.KR0070010.KR0070010form1.rdoUpdateDelete.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form1.rdoUpdateDelete.executePScriptOnLoad = function () {
  console.log('execute KR0070010form1/rdoUpdateDelete.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form1-rdoUpdateDelete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="radio" name="rdoProcessTyp" data-name="rdoUpdateDelete" value="true" <%= ("true".equals(TypeConverter.convert(aKR0070010Struct.getrdoUpdateDelete())))?"checked=\"checked\"":"" %> class="" id="expj-KR0070010-KR0070010form1-rdoUpdateDelete" ><label for="expj-KR0070010-KR0070010form1-rdoUpdateDelete"><%=CoreTools.getRBString("Expj.Cmt6681",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-KR0070010-KR0070010form1-h_SLIP_CD" name="h_SLIP_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0070010Struct.geth_SLIP_CD()) %>">
<script class="expj-script-KR0070010-KR0070010form1-h_SLIP_CD">
expj.KR0070010.KR0070010form1.h_SLIP_CD = {};
expj.KR0070010.KR0070010form1.h_SLIP_CD.executeAllOnDecision = function () {
  console.log('execute KR0070010form1/h_SLIP_CD.onDecision');
  expj.KR0070010.KR0070010form1.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form1.h_SLIP_CD.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form1-h_SLIP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form1', 'h_SLIP_CD', this);
  });
  expj.KR0070010.KR0070010form1.h_SLIP_CD.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form1.h_SLIP_CD.executePScriptOnLoad = function () {
  console.log('execute KR0070010form1/h_SLIP_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form1-h_SLIP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KR0070010-KR0070010form1-h_SALES_H_NO" name="h_SALES_H_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0070010Struct.geth_SALES_H_NO()) %>">
<script class="expj-script-KR0070010-KR0070010form1-h_SALES_H_NO">
expj.KR0070010.KR0070010form1.h_SALES_H_NO = {};
expj.KR0070010.KR0070010form1.h_SALES_H_NO.executeAllOnDecision = function () {
  console.log('execute KR0070010form1/h_SALES_H_NO.onDecision');
  expj.KR0070010.KR0070010form1.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form1.h_SALES_H_NO.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form1-h_SALES_H_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form1', 'h_SALES_H_NO', this);
  });
  expj.KR0070010.KR0070010form1.h_SALES_H_NO.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form1.h_SALES_H_NO.executePScriptOnLoad = function () {
  console.log('execute KR0070010form1/h_SALES_H_NO.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form1-h_SALES_H_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KR0070010-KR0070010form1-COMPANY_CD" name="COMPANY_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getCOMPANY_CD()) %>">
<script class="expj-script-KR0070010-KR0070010form1-COMPANY_CD">
expj.KR0070010.KR0070010form1.COMPANY_CD = {};
expj.KR0070010.KR0070010form1.COMPANY_CD.executeAllOnDecision = function () {
  console.log('execute KR0070010form1/COMPANY_CD.onDecision');
  expj.KR0070010.KR0070010form1.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form1.COMPANY_CD.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form1-COMPANY_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form1', 'COMPANY_CD', this);
  });
  expj.KR0070010.KR0070010form1.COMPANY_CD.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form1.COMPANY_CD.executePScriptOnLoad = function () {
  console.log('execute KR0070010form1/COMPANY_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form1-COMPANY_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KR0070010-KR0070010button1">
expj.KR0070010.KR0070010button1 = {};
expj.KR0070010.KR0070010button1.executeAllOnDecision = function () {
  console.log('execute KR0070010button1.onDecision');
};
expj.KR0070010.KR0070010button1.executeOnLoad = function () {
  expj.KR0070010.KR0070010button1.executePScriptOnLoad();
};

expj.KR0070010.KR0070010button1.executePScriptOnLoad = function () {
  console.log('execute KR0070010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KR0070010-KR0070010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KR0070010-KR0070010button1-Select">
expj.KR0070010.KR0070010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KR0070010form1/*@KR0070010Servlet,,"
expj.KR0070010.KR0070010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KR0070010', 'KR0070010button1', '_KR0070010form1/*', 'KR0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KR0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KR0070010', response);
expj.common.updateBusinessScreenTab('KR0070010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KR0070010.KR0070010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0070010.KR0070010button1.Select['onClick' + i])) {
        expj.KR0070010.KR0070010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.KR0070010.KR0070010button1.Select.executeAllOnDecision = function () {
};
expj.KR0070010.KR0070010button1.Select.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0070010', 'KR0070010button1', 'Select', this, 'Button');
    }
  });
  expj.KR0070010.KR0070010button1.Select.executePScriptOnLoad();
};

expj.KR0070010.KR0070010button1.Select.executePScriptOnLoad = function () {
  console.log('execute KR0070010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0070010-KR0070010button1-Select" name="Select" class="KR0070010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KR0070010-KR0070010form2">
expj.KR0070010.KR0070010form2 = {};
expj.KR0070010.KR0070010form2.executeAllOnDecision = function () {
  console.log('execute KR0070010form2.onDecision');
};
expj.KR0070010.KR0070010form2.executeOnLoad = function () {
  expj.KR0070010.KR0070010form2.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KR0070010-KR0070010form2" action="KR0070010Servlet" name="KR0070010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%= TypeConverter.sanitizer(aKR0070010Struct.getlbORGN_ODR_NO()) %></span></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-ORGN_ODR_NO">
expj.KR0070010.KR0070010form2.ORGN_ODR_NO = {};
expj.KR0070010.KR0070010form2.ORGN_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/ORGN_ODR_NO.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.ORGN_ODR_NO.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-ORGN_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'ORGN_ODR_NO', this);
  });
  expj.KR0070010.KR0070010form2.ORGN_ODR_NO.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.ORGN_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/ORGN_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-ORGN_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form2-ORGN_ODR_NO" name="ORGN_ODR_NO" class="KR0070010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getORGN_ODR_NO()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-addAmountOrder">
expj.KR0070010.KR0070010form2.addAmountOrder = {};
expj.KR0070010.KR0070010form2.addAmountOrder.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/addAmountOrder.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.addAmountOrder.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-addAmountOrder').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0070010', 'KR0070010form2', 'addAmountOrder', this, 'CheckBox');
    }
  });
  expj.KR0070010.KR0070010form2.addAmountOrder.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.addAmountOrder.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/addAmountOrder.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-addAmountOrder');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="addAmountOrder" value="true" <%= ("true".equals(TypeConverter.convert(aKR0070010Struct.getaddAmountOrder())) || "1".equals(TypeConverter.convert(aKR0070010Struct.getaddAmountOrder())))?"checked=\"checked\"":"" %>  class="KR0070010-focus-move" id="expj-KR0070010-KR0070010form2-addAmountOrder" disabled><label for="expj-KR0070010-KR0070010form2-addAmountOrder"><%=CoreTools.getRBString("Expj.Cmt6679",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-KR0070010-KR0070010form2-h_ADD_ODR_FLG" name="h_ADD_ODR_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0070010Struct.geth_ADD_ODR_FLG()) %>">
<script class="expj-script-KR0070010-KR0070010form2-h_ADD_ODR_FLG">
expj.KR0070010.KR0070010form2.h_ADD_ODR_FLG = {};
expj.KR0070010.KR0070010form2.h_ADD_ODR_FLG.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/h_ADD_ODR_FLG.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.h_ADD_ODR_FLG.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-h_ADD_ODR_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'h_ADD_ODR_FLG', this);
  });
  expj.KR0070010.KR0070010form2.h_ADD_ODR_FLG.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.h_ADD_ODR_FLG.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/h_ADD_ODR_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-h_ADD_ODR_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_ODR_NO",rb)%></span><!-- 得意先注文番号 --></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-CUST_ODR_NO">
expj.KR0070010.KR0070010form2.CUST_ODR_NO = {};
expj.KR0070010.KR0070010form2.CUST_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/CUST_ODR_NO.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.CUST_ODR_NO.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-CUST_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'CUST_ODR_NO', this);
  });
  expj.KR0070010.KR0070010form2.CUST_ODR_NO.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.CUST_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/CUST_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-CUST_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form2-CUST_ODR_NO" name="CUST_ODR_NO" class="KR0070010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getCUST_ODR_NO()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<input type="hidden" id="expj-KR0070010-KR0070010form2-AI_AR_IF_FLG" name="AI_AR_IF_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getAI_AR_IF_FLG()) %>">
<script class="expj-script-KR0070010-KR0070010form2-AI_AR_IF_FLG">
expj.KR0070010.KR0070010form2.AI_AR_IF_FLG = {};
expj.KR0070010.KR0070010form2.AI_AR_IF_FLG.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/AI_AR_IF_FLG.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.AI_AR_IF_FLG.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-AI_AR_IF_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'AI_AR_IF_FLG', this);
  });
  expj.KR0070010.KR0070010form2.AI_AR_IF_FLG.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.AI_AR_IF_FLG.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/AI_AR_IF_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-AI_AR_IF_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-CUST_CD">
expj.KR0070010.KR0070010form2.CUST_CD = {};
expj.KR0070010.KR0070010form2.CUST_CD.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/CUST_CD.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.CUST_CD.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'CUST_CD', this);
  });
  expj.KR0070010.KR0070010form2.CUST_CD.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form2-CUST_CD" name="CUST_CD" class="KR0070010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getCUST_CD()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-CUST_NAME">
expj.KR0070010.KR0070010form2.CUST_NAME = {};
expj.KR0070010.KR0070010form2.CUST_NAME.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/CUST_NAME.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.CUST_NAME.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-CUST_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'CUST_NAME', this);
  });
  expj.KR0070010.KR0070010form2.CUST_NAME.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.CUST_NAME.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/CUST_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-CUST_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form2-CUST_NAME" name="CUST_NAME" class="KR0070010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getCUST_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KR0070010-KR0070010form2-h_CUR_CD" name="h_CUR_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0070010Struct.geth_CUR_CD()) %>">
<script class="expj-script-KR0070010-KR0070010form2-h_CUR_CD">
expj.KR0070010.KR0070010form2.h_CUR_CD = {};
expj.KR0070010.KR0070010form2.h_CUR_CD.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/h_CUR_CD.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.h_CUR_CD.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-h_CUR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'h_CUR_CD', this);
  });
  expj.KR0070010.KR0070010form2.h_CUR_CD.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.h_CUR_CD.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/h_CUR_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-h_CUR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-ITEM_CD">
expj.KR0070010.KR0070010form2.ITEM_CD = {};
expj.KR0070010.KR0070010form2.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/ITEM_CD.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.ITEM_CD.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'ITEM_CD', this);
  });
  expj.KR0070010.KR0070010form2.ITEM_CD.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form2-ITEM_CD" name="ITEM_CD" class="KR0070010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-PeekerItemCd">
expj.KR0070010.KR0070010form2.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_KR0070010form2/ITEM_CD:@<%=contextNo%>"
expj.KR0070010.KR0070010form2.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KR0070010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('KR0070010', 'PeekerItemCd', 'SQLPARAM_1', '<%=sqlparamItemCd1%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
var checkParam = expj.common.pscript.getPeekerParam('KR0070010', 'PeekerItemCd', 'SQLPARAM_2', '<%=sqlparamItemCd2%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%<%=sqlnameItemCd%>%&%';
parameterValues += 'TARGET_FIELD%=%_KR0070010form2/ITEM_CD:%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KR0070010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KR0070010.KR0070010form2.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0070010.KR0070010form2.PeekerItemCd['onClick' + i])) {
        expj.KR0070010.KR0070010form2.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.KR0070010.KR0070010form2.PeekerItemCd.executeAllOnDecision = function () {
};
expj.KR0070010.KR0070010form2.PeekerItemCd.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0070010', 'KR0070010form2', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.KR0070010.KR0070010form2.PeekerItemCd.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KR0070010-KR0070010form2-PeekerItemCd" class="KR0070010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<input type="hidden" id="expj-KR0070010-KR0070010form2-BUSINESS_OPR_DATE" name="BUSINESS_OPR_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getBUSINESS_OPR_DATE()) %>">
<script class="expj-script-KR0070010-KR0070010form2-BUSINESS_OPR_DATE">
expj.KR0070010.KR0070010form2.BUSINESS_OPR_DATE = {};
expj.KR0070010.KR0070010form2.BUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/BUSINESS_OPR_DATE.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.BUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-BUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'BUSINESS_OPR_DATE', this);
  });
  expj.KR0070010.KR0070010form2.BUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.BUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/BUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-BUSINESS_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_NAME",rb)%></span><!-- 品目名 --></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-ITEM_NAME">
expj.KR0070010.KR0070010form2.ITEM_NAME = {};
expj.KR0070010.KR0070010form2.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/ITEM_NAME.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.ITEM_NAME.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'ITEM_NAME', this);
  });
  expj.KR0070010.KR0070010form2.ITEM_NAME.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form2-ITEM_NAME" name="ITEM_NAME" class="KR0070010-focus-move  required-value expj-KR0070010-required-D" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getITEM_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<input type="hidden" id="expj-KR0070010-KR0070010form2-h_SALES_SEQ_NO" name="h_SALES_SEQ_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0070010Struct.geth_SALES_SEQ_NO()) %>">
<script class="expj-script-KR0070010-KR0070010form2-h_SALES_SEQ_NO">
expj.KR0070010.KR0070010form2.h_SALES_SEQ_NO = {};
expj.KR0070010.KR0070010form2.h_SALES_SEQ_NO.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/h_SALES_SEQ_NO.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.h_SALES_SEQ_NO.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-h_SALES_SEQ_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'h_SALES_SEQ_NO', this);
  });
  expj.KR0070010.KR0070010form2.h_SALES_SEQ_NO.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.h_SALES_SEQ_NO.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/h_SALES_SEQ_NO.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-h_SALES_SEQ_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb)%></span><!-- 指定納期 --></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-DESINATED_DLV_DATE">
expj.KR0070010.KR0070010form2.DESINATED_DLV_DATE = {};
expj.KR0070010.KR0070010form2.DESINATED_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/DESINATED_DLV_DATE.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.DESINATED_DLV_DATE.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-DESINATED_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'DESINATED_DLV_DATE', this);
  });
  expj.KR0070010.KR0070010form2.DESINATED_DLV_DATE.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.DESINATED_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/DESINATED_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-DESINATED_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form2-DESINATED_DLV_DATE" name="DESINATED_DLV_DATE" class="KR0070010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD;" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getDESINATED_DLV_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.SALES_DATE",rb)%></span><!-- 売上計上日 --></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-SALES_DATE">
expj.KR0070010.KR0070010form2.SALES_DATE = {};
expj.KR0070010.KR0070010form2.SALES_DATE.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/SALES_DATE.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.SALES_DATE.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-SALES_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'SALES_DATE', this);
  });
  expj.KR0070010.KR0070010form2.SALES_DATE.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.SALES_DATE.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/SALES_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-SALES_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form2-SALES_DATE" name="SALES_DATE" class="KR0070010-focus-move  required-value expj-KR0070010-required-C" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD;" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getSALES_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-CalendarSalesDate">
expj.KR0070010.KR0070010form2.CalendarSalesDate = {};
// script1="onClick;0;CALENDAR;_KR0070010form2/SALES_DATE"
expj.KR0070010.KR0070010form2.CalendarSalesDate.onClick0 = function () {
  console.log('CalendarSalesDate script1');
expj.common.pscript.executeCalendar('KR0070010','KR0070010form2','_KR0070010form2/SALES_DATE');
};
expj.KR0070010.KR0070010form2.CalendarSalesDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0070010.KR0070010form2.CalendarSalesDate['onClick' + i])) {
        expj.KR0070010.KR0070010form2.CalendarSalesDate['onClick' + i]();
      }
    }
  }
};
expj.KR0070010.KR0070010form2.CalendarSalesDate.executeAllOnDecision = function () {
};
expj.KR0070010.KR0070010form2.CalendarSalesDate.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-CalendarSalesDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0070010', 'KR0070010form2', 'CalendarSalesDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KR0070010','KR0070010form2','_KR0070010form2/SALES_DATE');
  expj.KR0070010.KR0070010form2.CalendarSalesDate.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.CalendarSalesDate.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/CalendarSalesDate.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-CalendarSalesDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KR0070010-KR0070010form2-CalendarSalesDate" class="KR0070010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.SALES_DEPT_CD",rb)%></span><!-- 売上計上部門 --></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-SALES_DEPT_CD">
expj.KR0070010.KR0070010form2.SALES_DEPT_CD = {};
expj.KR0070010.KR0070010form2.SALES_DEPT_CD.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/SALES_DEPT_CD.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.SALES_DEPT_CD.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-SALES_DEPT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'SALES_DEPT_CD', this);
  });
  expj.KR0070010.KR0070010form2.SALES_DEPT_CD.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.SALES_DEPT_CD.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/SALES_DEPT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-SALES_DEPT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form2-SALES_DEPT_CD" name="SALES_DEPT_CD" class="KR0070010-focus-move  required-value expj-KR0070010-required-C" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getSALES_DEPT_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-PeekerSalesDeptCd">
expj.KR0070010.KR0070010form2.PeekerSalesDeptCd = {};
// script1="onClick;0;PEEKER;_KR0070010form2/SALES_DEPT_CD:@<%=contextNo%>"
expj.KR0070010.KR0070010form2.PeekerSalesDeptCd.onClick0 = function () {
  console.log('PeekerSalesDeptCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KR0070010';
var parameterValues = 'PeekerSalesDeptCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('KR0070010', 'PeekerSalesDeptCd', 'SQLPARAM_1', '<%=sqlparamOrgCd1%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
var checkParam = expj.common.pscript.getPeekerParam('KR0070010', 'PeekerSalesDeptCd', 'SQLPARAM_2', '<%=sqlparamOrgCd2%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%<%=sqlnameOrgCd%>%&%';
parameterValues += 'TARGET_FIELD%=%_KR0070010form2/SALES_DEPT_CD:%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KR0070010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KR0070010.KR0070010form2.PeekerSalesDeptCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0070010.KR0070010form2.PeekerSalesDeptCd['onClick' + i])) {
        expj.KR0070010.KR0070010form2.PeekerSalesDeptCd['onClick' + i]();
      }
    }
  }
};
expj.KR0070010.KR0070010form2.PeekerSalesDeptCd.executeAllOnDecision = function () {
};
expj.KR0070010.KR0070010form2.PeekerSalesDeptCd.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-PeekerSalesDeptCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0070010', 'KR0070010form2', 'PeekerSalesDeptCd', this, 'Button');
    }
  });
  expj.KR0070010.KR0070010form2.PeekerSalesDeptCd.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.PeekerSalesDeptCd.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/PeekerSalesDeptCd.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-PeekerSalesDeptCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KR0070010-KR0070010form2-PeekerSalesDeptCd" class="KR0070010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-ORG_NAME">
expj.KR0070010.KR0070010form2.ORG_NAME = {};
expj.KR0070010.KR0070010form2.ORG_NAME.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/ORG_NAME.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.ORG_NAME.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-ORG_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'ORG_NAME', this);
  });
  expj.KR0070010.KR0070010form2.ORG_NAME.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.ORG_NAME.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/ORG_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-ORG_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form2-ORG_NAME" name="ORG_NAME" class="KR0070010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getORG_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CHRG_PSN_CD",rb)%></span><!-- 営業担当者コード --></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-CUST_CHRG_PSN_CD">
expj.KR0070010.KR0070010form2.CUST_CHRG_PSN_CD = {};
expj.KR0070010.KR0070010form2.CUST_CHRG_PSN_CD.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/CUST_CHRG_PSN_CD.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.CUST_CHRG_PSN_CD.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-CUST_CHRG_PSN_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'CUST_CHRG_PSN_CD', this);
  });
  expj.KR0070010.KR0070010form2.CUST_CHRG_PSN_CD.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.CUST_CHRG_PSN_CD.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/CUST_CHRG_PSN_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-CUST_CHRG_PSN_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form2-CUST_CHRG_PSN_CD" name="CUST_CHRG_PSN_CD" class="KR0070010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getCUST_CHRG_PSN_CD()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-PeekerCustChrgPsnCd">
expj.KR0070010.KR0070010form2.PeekerCustChrgPsnCd = {};
// script1="onClick;0;PEEKER;_KR0070010form2/CUST_CHRG_PSN_CD:@<%=contextNo%>"
expj.KR0070010.KR0070010form2.PeekerCustChrgPsnCd.onClick0 = function () {
  console.log('PeekerCustChrgPsnCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KR0070010';
var parameterValues = 'PeekerCustChrgPsnCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('KR0070010', 'PeekerCustChrgPsnCd', 'SQLPARAM_1', '<%=sqlparamCustChrgPsnCd1%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
var checkParam = expj.common.pscript.getPeekerParam('KR0070010', 'PeekerCustChrgPsnCd', 'SQLPARAM_2', '<%=sqlparamCustChrgPsnCd2%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%<%=sqlnameCustChrgPsnCd%>%&%';
parameterValues += 'TARGET_FIELD%=%_KR0070010form2/CUST_CHRG_PSN_CD:%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KR0070010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KR0070010.KR0070010form2.PeekerCustChrgPsnCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0070010.KR0070010form2.PeekerCustChrgPsnCd['onClick' + i])) {
        expj.KR0070010.KR0070010form2.PeekerCustChrgPsnCd['onClick' + i]();
      }
    }
  }
};
expj.KR0070010.KR0070010form2.PeekerCustChrgPsnCd.executeAllOnDecision = function () {
};
expj.KR0070010.KR0070010form2.PeekerCustChrgPsnCd.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-PeekerCustChrgPsnCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0070010', 'KR0070010form2', 'PeekerCustChrgPsnCd', this, 'Button');
    }
  });
  expj.KR0070010.KR0070010form2.PeekerCustChrgPsnCd.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.PeekerCustChrgPsnCd.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/PeekerCustChrgPsnCd.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-PeekerCustChrgPsnCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KR0070010-KR0070010form2-PeekerCustChrgPsnCd" class="KR0070010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-USER_NAME">
expj.KR0070010.KR0070010form2.USER_NAME = {};
expj.KR0070010.KR0070010form2.USER_NAME.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/USER_NAME.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.USER_NAME.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-USER_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'USER_NAME', this);
  });
  expj.KR0070010.KR0070010form2.USER_NAME.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.USER_NAME.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/USER_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-USER_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form2-USER_NAME" name="USER_NAME" class="KR0070010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getUSER_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KR0070010-KR0070010form2-ODR_ACPT_PSN_CD" name="ODR_ACPT_PSN_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getODR_ACPT_PSN_CD()) %>">
<script class="expj-script-KR0070010-KR0070010form2-ODR_ACPT_PSN_CD">
expj.KR0070010.KR0070010form2.ODR_ACPT_PSN_CD = {};
expj.KR0070010.KR0070010form2.ODR_ACPT_PSN_CD.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/ODR_ACPT_PSN_CD.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.ODR_ACPT_PSN_CD.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-ODR_ACPT_PSN_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'ODR_ACPT_PSN_CD', this);
  });
  expj.KR0070010.KR0070010form2.ODR_ACPT_PSN_CD.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.ODR_ACPT_PSN_CD.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/ODR_ACPT_PSN_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-ODR_ACPT_PSN_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SALES_UNIT_PRICE",rb)%></span><!-- 売上単価 --></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-SALES_UNIT_PRICE">
expj.KR0070010.KR0070010form2.SALES_UNIT_PRICE = {};
// script1="onDecision;0;CHK;99999999999999.9999[lt][{_KR0070010form2/SALES_QTY}*{_KR0070010form2/SALES_UNIT_PRICE}]@*0,*1"
expj.KR0070010.KR0070010form2.SALES_UNIT_PRICE.onDecision0 = function () {
  console.log('SALES_UNIT_PRICE script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber('99999999999999.9999'), '[lt]', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form2', '_KR0070010form2/SALES_QTY') + '*' + expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form2', '_KR0070010form2/SALES_UNIT_PRICE')))) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;SET;_KR0070010form2/SALES_UNIT_PRICE=0@*2"
expj.KR0070010.KR0070010form2.SALES_UNIT_PRICE.child0 = function () {
  console.log('SALES_UNIT_PRICE script2');
expj.common.pscript.setReferenceComponentValue('KR0070010', 'KR0070010form2', '_KR0070010form2/SALES_UNIT_PRICE', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script3="child;1;SET;_KR0070010form2/SALES_AMOUNT=[{_KR0070010form2/SALES_QTY}*{_KR0070010form2/SALES_UNIT_PRICE}]"
expj.KR0070010.KR0070010form2.SALES_UNIT_PRICE.child1 = function () {
  console.log('SALES_UNIT_PRICE script3');
expj.common.pscript.setReferenceComponentValue('KR0070010', 'KR0070010form2', '_KR0070010form2/SALES_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form2', '_KR0070010form2/SALES_QTY') + '*' + expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form2', '_KR0070010form2/SALES_UNIT_PRICE')));
};
// script4="child;2;CHK;1[eq]1@!KR20024"
expj.KR0070010.KR0070010form2.SALES_UNIT_PRICE.child2 = function () {
  console.log('SALES_UNIT_PRICE script4');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('KR0070010', 'KR0070010form2', 'KR20024');
}
};
expj.KR0070010.KR0070010form2.SALES_UNIT_PRICE.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/SALES_UNIT_PRICE.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0070010.KR0070010form2.SALES_UNIT_PRICE['onDecision' + i])) {
        expj.KR0070010.KR0070010form2.SALES_UNIT_PRICE['onDecision' + i]();
      }
    }
  }
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.SALES_UNIT_PRICE.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-SALES_UNIT_PRICE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'SALES_UNIT_PRICE', this);
  });
  expj.KR0070010.KR0070010form2.SALES_UNIT_PRICE.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.SALES_UNIT_PRICE.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/SALES_UNIT_PRICE.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-SALES_UNIT_PRICE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form2-SALES_UNIT_PRICE" name="SALES_UNIT_PRICE" class="KR0070010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getSALES_UNIT_PRICE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-CUR_UNIT_PRICE">
expj.KR0070010.KR0070010form2.CUR_UNIT_PRICE = {};
expj.KR0070010.KR0070010form2.CUR_UNIT_PRICE.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/CUR_UNIT_PRICE.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.CUR_UNIT_PRICE.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-CUR_UNIT_PRICE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'CUR_UNIT_PRICE', this);
  });
  expj.KR0070010.KR0070010form2.CUR_UNIT_PRICE.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.CUR_UNIT_PRICE.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/CUR_UNIT_PRICE.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-CUR_UNIT_PRICE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form2-CUR_UNIT_PRICE" name="CUR_UNIT_PRICE" class="KR0070010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getCUR_UNIT_PRICE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SALES_QTY",rb)%></span><!-- 売上実績数量 --></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-SALES_QTY">
expj.KR0070010.KR0070010form2.SALES_QTY = {};
// script1="onDecision;0;CHK;99999999999999.9999[lt][{_KR0070010form2/SALES_QTY}*{_KR0070010form2/SALES_UNIT_PRICE}]@*0,*1"
expj.KR0070010.KR0070010form2.SALES_QTY.onDecision0 = function () {
  console.log('SALES_QTY script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber('99999999999999.9999'), '[lt]', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form2', '_KR0070010form2/SALES_QTY') + '*' + expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form2', '_KR0070010form2/SALES_UNIT_PRICE')))) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;SET;_KR0070010form2/SALES_QTY=0@*2"
expj.KR0070010.KR0070010form2.SALES_QTY.child0 = function () {
  console.log('SALES_QTY script2');
expj.common.pscript.setReferenceComponentValue('KR0070010', 'KR0070010form2', '_KR0070010form2/SALES_QTY', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script3="child;1;SET;_KR0070010form2/SALES_AMOUNT=[{_KR0070010form2/SALES_QTY}*{_KR0070010form2/SALES_UNIT_PRICE}]"
expj.KR0070010.KR0070010form2.SALES_QTY.child1 = function () {
  console.log('SALES_QTY script3');
expj.common.pscript.setReferenceComponentValue('KR0070010', 'KR0070010form2', '_KR0070010form2/SALES_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form2', '_KR0070010form2/SALES_QTY') + '*' + expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form2', '_KR0070010form2/SALES_UNIT_PRICE')));
};
// script4="child;2;CHK;1[eq]1@!KR20024"
expj.KR0070010.KR0070010form2.SALES_QTY.child2 = function () {
  console.log('SALES_QTY script4');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('KR0070010', 'KR0070010form2', 'KR20024');
}
};
expj.KR0070010.KR0070010form2.SALES_QTY.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/SALES_QTY.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0070010.KR0070010form2.SALES_QTY['onDecision' + i])) {
        expj.KR0070010.KR0070010form2.SALES_QTY['onDecision' + i]();
      }
    }
  }
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.SALES_QTY.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-SALES_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'SALES_QTY', this);
  });
  expj.KR0070010.KR0070010form2.SALES_QTY.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.SALES_QTY.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/SALES_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-SALES_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form2-SALES_QTY" name="SALES_QTY" class="KR0070010-focus-move  " style="width:100%;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getSALES_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-STOCK_UNIT">
expj.KR0070010.KR0070010form2.STOCK_UNIT = {};
expj.KR0070010.KR0070010form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/STOCK_UNIT.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'STOCK_UNIT', this);
  });
  expj.KR0070010.KR0070010form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form2-STOCK_UNIT" name="STOCK_UNIT" class="KR0070010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SALES_AMOUNT",rb)%></span><!-- 売上金額 --></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-SALES_AMOUNT">
expj.KR0070010.KR0070010form2.SALES_AMOUNT = {};
expj.KR0070010.KR0070010form2.SALES_AMOUNT.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/SALES_AMOUNT.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.SALES_AMOUNT.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-SALES_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'SALES_AMOUNT', this);
  });
  expj.KR0070010.KR0070010form2.SALES_AMOUNT.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.SALES_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/SALES_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-SALES_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form2-SALES_AMOUNT" name="SALES_AMOUNT" class="KR0070010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getSALES_AMOUNT()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-CUR_UNIT_AMOUNT">
expj.KR0070010.KR0070010form2.CUR_UNIT_AMOUNT = {};
expj.KR0070010.KR0070010form2.CUR_UNIT_AMOUNT.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/CUR_UNIT_AMOUNT.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.CUR_UNIT_AMOUNT.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-CUR_UNIT_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'CUR_UNIT_AMOUNT', this);
  });
  expj.KR0070010.KR0070010form2.CUR_UNIT_AMOUNT.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.CUR_UNIT_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/CUR_UNIT_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-CUR_UNIT_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form2-CUR_UNIT_AMOUNT" name="CUR_UNIT_AMOUNT" class="KR0070010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getCUR_UNIT_AMOUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.TAX_CD_1",rb)%></span><!-- 消費税コード --></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-TAX_CD">
expj.KR0070010.KR0070010form2.TAX_CD = {};
expj.KR0070010.KR0070010form2.TAX_CD.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/TAX_CD.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.TAX_CD.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-TAX_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'TAX_CD', this);
  });
  expj.KR0070010.KR0070010form2.TAX_CD.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.TAX_CD.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/TAX_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-TAX_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form2-TAX_CD" name="TAX_CD" class="KR0070010-focus-move  required-value expj-KR0070010-required-C" style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getTAX_CD()) %>" maxlength="3" ></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-PeekerTaxCd">
expj.KR0070010.KR0070010form2.PeekerTaxCd = {};
// script1="onClick;0;PEEKER;_KR0070010form2/TAX_CD@<%=contextNo%>"
expj.KR0070010.KR0070010form2.PeekerTaxCd.onClick0 = function () {
  console.log('PeekerTaxCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KR0070010';
var parameterValues = 'PeekerTaxCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010form2', '_TAX_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%TAX_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KR0070010form2/TAX_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KR0070010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KR0070010.KR0070010form2.PeekerTaxCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0070010.KR0070010form2.PeekerTaxCd['onClick' + i])) {
        expj.KR0070010.KR0070010form2.PeekerTaxCd['onClick' + i]();
      }
    }
  }
};
expj.KR0070010.KR0070010form2.PeekerTaxCd.executeAllOnDecision = function () {
};
expj.KR0070010.KR0070010form2.PeekerTaxCd.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-PeekerTaxCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0070010', 'KR0070010form2', 'PeekerTaxCd', this, 'Button');
    }
  });
  expj.KR0070010.KR0070010form2.PeekerTaxCd.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.PeekerTaxCd.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/PeekerTaxCd.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-PeekerTaxCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KR0070010-KR0070010form2-PeekerTaxCd" class="KR0070010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KR0070010-KR0070010form2-h_TAX_CD" name="h_TAX_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKR0070010Struct.geth_TAX_CD()) %>">
<script class="expj-script-KR0070010-KR0070010form2-h_TAX_CD">
expj.KR0070010.KR0070010form2.h_TAX_CD = {};
expj.KR0070010.KR0070010form2.h_TAX_CD.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/h_TAX_CD.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.h_TAX_CD.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-h_TAX_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'h_TAX_CD', this);
  });
  expj.KR0070010.KR0070010form2.h_TAX_CD.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.h_TAX_CD.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/h_TAX_CD.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-h_TAX_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_QTY_4",rb)%></span><!-- 受注数量 --></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-ODR_QTY">
expj.KR0070010.KR0070010form2.ODR_QTY = {};
expj.KR0070010.KR0070010form2.ODR_QTY.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/ODR_QTY.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.ODR_QTY.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'ODR_QTY', this);
  });
  expj.KR0070010.KR0070010form2.ODR_QTY.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form2-ODR_QTY" name="ODR_QTY" class="KR0070010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;CEIL;4" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getODR_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-STOCK_UNIT_ODR">
expj.KR0070010.KR0070010form2.STOCK_UNIT_ODR = {};
expj.KR0070010.KR0070010form2.STOCK_UNIT_ODR.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/STOCK_UNIT_ODR.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.STOCK_UNIT_ODR.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-STOCK_UNIT_ODR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'STOCK_UNIT_ODR', this);
  });
  expj.KR0070010.KR0070010form2.STOCK_UNIT_ODR.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.STOCK_UNIT_ODR.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/STOCK_UNIT_ODR.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-STOCK_UNIT_ODR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form2-STOCK_UNIT_ODR" name="STOCK_UNIT_ODR" class="KR0070010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getSTOCK_UNIT_ODR()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_ACPT_DATE",rb)%></span><!-- 受注日 --></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-ODR_ACPT_DATE">
expj.KR0070010.KR0070010form2.ODR_ACPT_DATE = {};
expj.KR0070010.KR0070010form2.ODR_ACPT_DATE.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/ODR_ACPT_DATE.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.ODR_ACPT_DATE.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-ODR_ACPT_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'ODR_ACPT_DATE', this);
  });
  expj.KR0070010.KR0070010form2.ODR_ACPT_DATE.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.ODR_ACPT_DATE.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/ODR_ACPT_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-ODR_ACPT_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form2-ODR_ACPT_DATE" name="ODR_ACPT_DATE" class="KR0070010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD;" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getODR_ACPT_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.REMARKS",rb)%></span><!-- 備考 --></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010form2-REMARKS">
expj.KR0070010.KR0070010form2.REMARKS = {};
expj.KR0070010.KR0070010form2.REMARKS.executeAllOnDecision = function () {
  console.log('execute KR0070010form2/REMARKS.onDecision');
  expj.KR0070010.KR0070010form2.executeAllOnDecision();
  expj.KR0070010.executeAllOnDecision();
};
expj.KR0070010.KR0070010form2.REMARKS.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010form2-REMARKS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KR0070010', 'KR0070010form2', 'REMARKS', this);
  });
  expj.KR0070010.KR0070010form2.REMARKS.executePScriptOnLoad();
};

expj.KR0070010.KR0070010form2.REMARKS.executePScriptOnLoad = function () {
  console.log('execute KR0070010form2/REMARKS.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010form2-REMARKS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KR0070010-KR0070010form2-REMARKS" name="REMARKS" class="KR0070010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKR0070010Struct.getREMARKS()) %>" maxlength="100" ></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 504px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:420px;"><script class="expj-script-KR0070010-KR0070010button2">
expj.KR0070010.KR0070010button2 = {};
expj.KR0070010.KR0070010button2.executeAllOnDecision = function () {
  console.log('execute KR0070010button2.onDecision');
};
expj.KR0070010.KR0070010button2.executeOnLoad = function () {
  expj.KR0070010.KR0070010button2.executePScriptOnLoad();
};

expj.KR0070010.KR0070010button2.executePScriptOnLoad = function () {
  console.log('execute KR0070010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KR0070010-KR0070010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KR0070010-KR0070010button2-Recalc">
expj.KR0070010.KR0070010button2.Recalc = {};
// script1="onClick;0;CHK;_KR0070010form2/SALES_AMOUNT[numeq]0@!KU01002"
expj.KR0070010.KR0070010button2.Recalc.onClick0 = function () {
  console.log('Recalc script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010button2', '_KR0070010form2/SALES_AMOUNT')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('KR0070010', 'KR0070010button2', 'KU01002');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KR0070010form1/*,_KR0070010form2/*@KR0070010Servlet,,"
expj.KR0070010.KR0070010button2.Recalc.onClick1 = function () {
  console.log('Recalc script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KR0070010', 'KR0070010button2', '_KR0070010form1/*,_KR0070010form2/*', 'KR0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KR0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KR0070010', response);
expj.common.updateBusinessScreenTab('KR0070010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KR0070010.KR0070010button2.Recalc.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0070010.KR0070010button2.Recalc['onClick' + i])) {
        expj.KR0070010.KR0070010button2.Recalc['onClick' + i]();
      }
    }
  }
};
expj.KR0070010.KR0070010button2.Recalc.executeAllOnDecision = function () {
};
expj.KR0070010.KR0070010button2.Recalc.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010button2-Recalc').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0070010', 'KR0070010button2', 'Recalc', this, 'Button');
    }
  });
  expj.KR0070010.KR0070010button2.Recalc.executePScriptOnLoad();
};

expj.KR0070010.KR0070010button2.Recalc.executePScriptOnLoad = function () {
  console.log('execute KR0070010button2/Recalc.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010button2-Recalc');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0070010-KR0070010button2-Recalc" name="Recalc" class="KR0070010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnRecalc",rb)%></button><!-- 再計算ボタン --></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010button2-Insert">
expj.KR0070010.KR0070010button2.Insert = {};
// script1="onClick;0;CHK;_KR0070010form2/SALES_AMOUNT[numeq]0@!KU01002"
expj.KR0070010.KR0070010button2.Insert.onClick0 = function () {
  console.log('Insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010button2', '_KR0070010form2/SALES_AMOUNT')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('KR0070010', 'KR0070010button2', 'KU01002');
}
};
// script2="onClick;1;CHK;_KR0070010form2/BUSINESS_OPR_DATE[neq][and]_KR0070010form2/SALES_DATE[gt]_KR0070010form2/BUSINESS_OPR_DATE@!KR10024"
expj.KR0070010.KR0070010button2.Insert.onClick1 = function () {
  console.log('Insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010button2', '_KR0070010form2/BUSINESS_OPR_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010button2', '_KR0070010form2/SALES_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010button2', '_KR0070010form2/BUSINESS_OPR_DATE')))) {
expj.common.pscript.viewErrorMessage('KR0070010', 'KR0070010button2', 'KR10024');
}
};
// script3="onClick;2;CHK;_KR0070010form2/BUSINESS_OPR_DATE[neq][and]~TO_YYYY_MM(_KR0070010form2/SALES_DATE)[lt]~TO_YYYY_MM(_KR0070010form2/BUSINESS_OPR_DATE)@$KU02010"
expj.KR0070010.KR0070010button2.Insert.onClick2 = function () {
  console.log('Insert script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010button2', '_KR0070010form2/BUSINESS_OPR_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('KR0070010', 'KR0070010button2', '_KR0070010form2/SALES_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('KR0070010', 'KR0070010button2', '_KR0070010form2/BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('KR0070010', 'KR0070010button2', 'KU02010');
}
};
// script4="onClick;3;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KR0070010form1/*,_KR0070010form2/*@KR0070010Servlet,,$ZZ07001"
expj.KR0070010.KR0070010button2.Insert.onClick3 = function () {
  console.log('Insert script4');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KR0070010', 'KR0070010button2', '_KR0070010form1/*,_KR0070010form2/*', 'KR0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KR0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KR0070010', response);
expj.common.updateBusinessScreenTab('KR0070010', contents);
};
expj.common.pscript.callConfirm('KR0070010', 'KR0070010button2', 'ZZ07001', okEvent);
};
expj.KR0070010.KR0070010button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0070010.KR0070010button2.Insert['onClick' + i])) {
        expj.KR0070010.KR0070010button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.KR0070010.KR0070010button2.Insert.executeAllOnDecision = function () {
};
expj.KR0070010.KR0070010button2.Insert.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0070010', 'KR0070010button2', 'Insert', this, 'Button');
    }
  });
  expj.KR0070010.KR0070010button2.Insert.executePScriptOnLoad();
};

expj.KR0070010.KR0070010button2.Insert.executePScriptOnLoad = function () {
  console.log('execute KR0070010button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0070010-KR0070010button2-Insert" name="Insert" class="KR0070010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010button2-Update">
expj.KR0070010.KR0070010button2.Update = {};
// script1="onClick;0;CHK;_KR0070010form2/SALES_AMOUNT[numeq]0@!KU01002"
expj.KR0070010.KR0070010button2.Update.onClick0 = function () {
  console.log('Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010button2', '_KR0070010form2/SALES_AMOUNT')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('KR0070010', 'KR0070010button2', 'KU01002');
}
};
// script2="onClick;1;CHK;_KR0070010form2/BUSINESS_OPR_DATE[neq][and]_KR0070010form2/SALES_DATE[gt]_KR0070010form2/BUSINESS_OPR_DATE@!KR10024"
expj.KR0070010.KR0070010button2.Update.onClick1 = function () {
  console.log('Update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010button2', '_KR0070010form2/BUSINESS_OPR_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010button2', '_KR0070010form2/SALES_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010button2', '_KR0070010form2/BUSINESS_OPR_DATE')))) {
expj.common.pscript.viewErrorMessage('KR0070010', 'KR0070010button2', 'KR10024');
}
};
// script3="onClick;2;CHK;_KR0070010form2/BUSINESS_OPR_DATE[neq][and]~TO_YYYY_MM(_KR0070010form2/SALES_DATE)[lt]~TO_YYYY_MM(_KR0070010form2/BUSINESS_OPR_DATE)@$KU02010"
expj.KR0070010.KR0070010button2.Update.onClick2 = function () {
  console.log('Update script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010button2', '_KR0070010form2/BUSINESS_OPR_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('KR0070010', 'KR0070010button2', '_KR0070010form2/SALES_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('KR0070010', 'KR0070010button2', '_KR0070010form2/BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('KR0070010', 'KR0070010button2', 'KU02010');
}
};
// script4="onClick;3;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KR0070010form1/*,_KR0070010form2/*@KR0070010Servlet,,$ZZ07003"
expj.KR0070010.KR0070010button2.Update.onClick3 = function () {
  console.log('Update script4');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KR0070010', 'KR0070010button2', '_KR0070010form1/*,_KR0070010form2/*', 'KR0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KR0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KR0070010', response);
expj.common.updateBusinessScreenTab('KR0070010', contents);
};
expj.common.pscript.callConfirm('KR0070010', 'KR0070010button2', 'ZZ07003', okEvent);
};
expj.KR0070010.KR0070010button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0070010.KR0070010button2.Update['onClick' + i])) {
        expj.KR0070010.KR0070010button2.Update['onClick' + i]();
      }
    }
  }
};
expj.KR0070010.KR0070010button2.Update.executeAllOnDecision = function () {
};
expj.KR0070010.KR0070010button2.Update.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0070010', 'KR0070010button2', 'Update', this, 'Button');
    }
  });
  expj.KR0070010.KR0070010button2.Update.executePScriptOnLoad();
};

expj.KR0070010.KR0070010button2.Update.executePScriptOnLoad = function () {
  console.log('execute KR0070010button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0070010-KR0070010button2-Update" name="Update" class="KR0070010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010button2-Delete">
expj.KR0070010.KR0070010button2.Delete = {};
// script1="onClick;0;CHK;_KR0070010form2/BUSINESS_OPR_DATE[neq][and]~TO_YYYY_MM(_KR0070010form2/SALES_DATE)[lt]~TO_YYYY_MM(_KR0070010form2/BUSINESS_OPR_DATE)@$KU02010"
expj.KR0070010.KR0070010button2.Delete.onClick0 = function () {
  console.log('Delete script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KR0070010', 'KR0070010button2', '_KR0070010form2/BUSINESS_OPR_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('KR0070010', 'KR0070010button2', '_KR0070010form2/SALES_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('KR0070010', 'KR0070010button2', '_KR0070010form2/BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('KR0070010', 'KR0070010button2', 'KU02010');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KR0070010form1/*,_KR0070010form2/*@KR0070010Servlet,,$ZZ07004"
expj.KR0070010.KR0070010button2.Delete.onClick1 = function () {
  console.log('Delete script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KR0070010', 'KR0070010button2', '_KR0070010form1/*,_KR0070010form2/*', 'KR0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KR0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KR0070010', response);
expj.common.updateBusinessScreenTab('KR0070010', contents);
};
expj.common.pscript.callConfirm('KR0070010', 'KR0070010button2', 'ZZ07004', okEvent);
};
expj.KR0070010.KR0070010button2.Delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0070010.KR0070010button2.Delete['onClick' + i])) {
        expj.KR0070010.KR0070010button2.Delete['onClick' + i]();
      }
    }
  }
};
expj.KR0070010.KR0070010button2.Delete.executeAllOnDecision = function () {
};
expj.KR0070010.KR0070010button2.Delete.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010button2-Delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0070010', 'KR0070010button2', 'Delete', this, 'Button');
    }
  });
  expj.KR0070010.KR0070010button2.Delete.executePScriptOnLoad();
};

expj.KR0070010.KR0070010button2.Delete.executePScriptOnLoad = function () {
  console.log('execute KR0070010button2/Delete.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010button2-Delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0070010-KR0070010button2-Delete" name="Delete" class="KR0070010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">KR0070010 Revision: 1.1  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KR0070010-KR0070010button0">
expj.KR0070010.KR0070010button0 = {};
expj.KR0070010.KR0070010button0.executeAllOnDecision = function () {
  console.log('execute KR0070010button0.onDecision');
};
expj.KR0070010.KR0070010button0.executeOnLoad = function () {
  expj.KR0070010.KR0070010button0.executePScriptOnLoad();
};

expj.KR0070010.KR0070010button0.executePScriptOnLoad = function () {
  console.log('execute KR0070010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KR0070010-KR0070010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KR0070010-KR0070010button0-Clear">
expj.KR0070010.KR0070010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KR0070010Servlet,,$ZZ07008"
expj.KR0070010.KR0070010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KR0070010', 'KR0070010button0', '', 'KR0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KR0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KR0070010', response);
expj.common.updateBusinessScreenTab('KR0070010', contents);
};
expj.common.pscript.callConfirm('KR0070010', 'KR0070010button0', 'ZZ07008', okEvent);
};
expj.KR0070010.KR0070010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0070010.KR0070010button0.Clear['onClick' + i])) {
        expj.KR0070010.KR0070010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KR0070010.KR0070010button0.Clear.executeAllOnDecision = function () {
};
expj.KR0070010.KR0070010button0.Clear.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0070010', 'KR0070010button0', 'Clear', this, 'Button');
    }
  });
  expj.KR0070010.KR0070010button0.Clear.executePScriptOnLoad();
};

expj.KR0070010.KR0070010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KR0070010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0070010-KR0070010button0-Clear" name="Clear" class="KR0070010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KR0070010-KR0070010button0-Close">
expj.KR0070010.KR0070010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KR0070010.KR0070010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KR0070010');
};
expj.KR0070010.KR0070010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KR0070010.KR0070010button0.Close['onClick' + i])) {
        expj.KR0070010.KR0070010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KR0070010.KR0070010button0.Close.executeAllOnDecision = function () {
};
expj.KR0070010.KR0070010button0.Close.executeOnLoad = function () {
  $('#expj-KR0070010-KR0070010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KR0070010', 'KR0070010button0', 'Close', this, 'Button');
    }
  });
  expj.KR0070010.KR0070010button0.Close.executePScriptOnLoad();
};

expj.KR0070010.KR0070010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KR0070010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KR0070010-KR0070010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KR0070010-KR0070010button0-Close" name="Close" class="KR0070010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KR0070010 (END)-->
<%
MessageStruct msgStruct = aKR0070010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KR0070010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KR0070010)) {
  expj.common.treeInstanceMap.KR0070010 = {};
}
expj.common.treeInstanceMap.KR0070010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KR0070010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KR0070010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KR0070010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KR0070010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KR0070010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KR0070010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KR0070010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KR0070010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KR0070010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KR0070010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KR0070010)) {
  expj.common.detailDialogMap.KR0070010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KR0070010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KR0070010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KR0070010.<%=detailId %>)) {
  expj.common.detailDialogMap.KR0070010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KR0070010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KR0070010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KR0070010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KR0070010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KR0070010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KR0070010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KR0070010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KR0070010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KR0070010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KR0070010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KR0070010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KR0070010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KR0070010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KR0070010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KR0070010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KR0070010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KR0070010)) {
  expj.common.viewInstanceMap.KR0070010 = {};
}
expj.common.viewInstanceMap.KR0070010.<%=viewId %> = {};
expj.common.viewInstanceMap.KR0070010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KR0070010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KR0070010.<%=viewId %>.init = function () {
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
    expj.KR0070010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KR0070010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KR0070010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KR0070010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KR0070010_init">
/**
 * KR0070010用のロード完了時初期化関数
 */
expj.KR0070010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KR0070010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KR0070010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KR0070010');
  expj.common.calendarInstanceMap.KR0070010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KR0070010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KR0070010.<%=detailId %>.init();
  expj.common.detailDialogMap.KR0070010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KR0070010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KR0070010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KR0070010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KR0070010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KR0070010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KR0070010-<%=detailId %>');
<%
 }
%>
  try{expj.KR0070010.KR0070010form1.ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form1.h_rdoInsert.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form1.ODR_NO_PEEKER.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form1.rdoInsert.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form1.MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form1.h_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form1.ODR_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form1.SLIP_CD.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form1.H_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form1.PeekerSlipCd.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form1.rdoUpdateDelete.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form1.h_SLIP_CD.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form1.h_SALES_H_NO.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form1.COMPANY_CD.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010button1.Select.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.ORGN_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.addAmountOrder.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.h_ADD_ODR_FLG.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.CUST_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.AI_AR_IF_FLG.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.CUST_NAME.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.h_CUR_CD.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.BUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.h_SALES_SEQ_NO.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.DESINATED_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.SALES_DATE.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.CalendarSalesDate.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.SALES_DEPT_CD.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.PeekerSalesDeptCd.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.ORG_NAME.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.CUST_CHRG_PSN_CD.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.PeekerCustChrgPsnCd.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.USER_NAME.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.ODR_ACPT_PSN_CD.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.SALES_UNIT_PRICE.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.CUR_UNIT_PRICE.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.SALES_QTY.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.SALES_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.CUR_UNIT_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.TAX_CD.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.PeekerTaxCd.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.h_TAX_CD.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.STOCK_UNIT_ODR.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.ODR_ACPT_DATE.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.REMARKS.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010button2.Recalc.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010button2.Insert.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010button2.Update.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010button2.Delete.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form1.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010button1.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010form2.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010button2.executeOnLoad();}catch(e){};
  try{expj.KR0070010.KR0070010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KR0070010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KR0070010', 'KR0070010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KR0070010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KR0070010-focus-move');
  // 初期フォーカス当てる処理
  $('.KR0070010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KR0070010', '<%=request.getContextPath() %>');
};

/**
 * KR0070010の全体onDecision処理
 */
expj.KR0070010.executeAllOnDecision = function () {
  expj.KR0070010.KR0070010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KR0070010_console">
expj.KR0070010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>