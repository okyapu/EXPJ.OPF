<%-- ***
This file is generated
 GeneratedDate  : Tue Apr 25 16:35:09 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj_WK\OPF\KQ0090\KQ0090010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KQ0090.*" %>
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
<jsp:useBean id="aKQ0090010Control" class="com.nec.jp.orteus.metamorBase.KQ0090.KQ0090010Control" scope="request"/>
<jsp:useBean id="aKQ0090010Struct" class="com.nec.jp.orteus.metamorBase.KQ0090.KQ0090010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

受注登録（非在庫品）
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0090/jsp/KQ0090010.jsp,v $
$Author: xu-jing $	
$Revision: 1.8 $　$Date: 2017/04/27 10:15:45 $
********************************************************* --%>
<html>
<head>
<title>受注登録（非在庫品）</title>
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
<script class="expj-script-KQ0090010_init">
  // KQ0090010名前空間
  expj.KQ0090010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<%
    // システムオプション識別子
    String strOptionId = aKQ0090010Struct.getw_OPTION_ID();
	// 会社コード
	String strSysCompanyCd = aKQ0090010Struct.geth_SYS_COMPANY_CODE();
	
	// 元受注番号
	String sqlnameOrgnOdrNo = new String();
	String sqlparamOrgnOdrNo1 = new String();
	String sqlparamOrgnOdrNo2 = new String();
	
	// 得意先コード
	String sqlnameCustCd = new String();
	String sqlparamCustCd1 = new String();
	String sqlparamCustCd2 = new String();
	
	// 営業担当者コード
	String sqlnameCustChrgPsnCd = new String();
	String sqlparamCustChrgPsnCd1 = new String();
	String sqlparamCustChrgPsnCd2 = new String();
	
	// 品目番号
	String sqlnameItemCd = new String();
	String sqlparamItemCd1 = new String();
	String sqlparamItemCd2 = new String();
	
    // Explanner/Jの場合
	if("J*".equals(strOptionId)){
	    sqlnameOrgnOdrNo = "ODR_NO_04";
		sqlparamOrgnOdrNo1 = "_KQ0090010form2/ORGN_ODR_NO";
		sqlparamOrgnOdrNo2 = "";
	}
	// Explanner/Jaの場合
	else if("JA*".equals(strOptionId)){
	    sqlnameOrgnOdrNo = "ODR_CTL_NO_03";
		sqlparamOrgnOdrNo1 = "_KQ0090010form2/ORGN_ODR_NO";
		sqlparamOrgnOdrNo2 = "";
	}
	// Explanner/JaScmの場合
	else if("SCM*".equals(strOptionId)){
	    sqlnameOrgnOdrNo = "SCM_ODR_CTL_NO_03";
		sqlparamOrgnOdrNo1 = strSysCompanyCd;
		sqlparamOrgnOdrNo2 = "_KQ0090010form2/ORGN_ODR_NO";
	}
	// Explanner/Jｆの場合
	else{
	    sqlnameOrgnOdrNo = "FD_ODR_CD_07";
		sqlparamOrgnOdrNo1 = "_KQ0090010form2/ORGN_ODR_NO";
		sqlparamOrgnOdrNo2 = "";
	}
	// Explanner/JaScmの場合
	if("SCM*".equals(strOptionId)){
	    sqlnameCustCd = "SCM_CUST_CD_01";
		sqlparamCustCd1 = strSysCompanyCd;
		sqlparamCustCd2 = "_KQ0090010form2/CUST_CD";
		
		sqlnameCustChrgPsnCd = "SCM_USER_CD_04";
		sqlparamCustChrgPsnCd1 = strSysCompanyCd;
		sqlparamCustChrgPsnCd2 = "_KQ0090010form2/CUST_CHRG_PSN_CD";
		
		sqlnameItemCd = "SCM_PLANT_ITEM_CD_12";
		sqlparamItemCd1 = strSysCompanyCd;
		sqlparamItemCd2 = "_KQ0090010form2/ITEM_CD";
	}
	// Explanner/JaScm以外の場合
	else{
	    sqlnameCustCd = "MP_CUST_CD_02";
		sqlparamCustCd1 = "_KQ0090010form2/CUST_CD";
		sqlparamCustCd2 = "";
		
		sqlnameCustChrgPsnCd = "USER_CD_06";
		sqlparamCustChrgPsnCd1 = "_KQ0090010form2/CUST_CHRG_PSN_CD";
		sqlparamCustChrgPsnCd2 = "";
		
		sqlnameItemCd = "ITEM_CD_12";
		sqlparamItemCd1 = "_KQ0090010form2/ITEM_CD";
		sqlparamItemCd2 = "";
	}
%>
<body>
  <div id="expj-business-screen-KQ0090010" data-screen="KQ0090010" data-newdata="<%=aKQ0090010Control.isNewData() %>">
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
			  <script class="expj-script-KQ0090010-KQ0090010form1">
expj.KQ0090010.KQ0090010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5,6,7,8,9,10"
expj.KQ0090010.KQ0090010form1.onLoad0 = function () {
  console.log('KQ0090010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision6)){this.onDecision6();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision7)){this.onDecision7();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision8)){this.onDecision8();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision9)){this.onDecision9();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision10)){this.onDecision10();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.KQ0090010.KQ0090010form1.onDecision0 = function () {
  console.log('KQ0090010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('KQ0090010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_KQ0090010button1/Select"
expj.KQ0090010.KQ0090010form1.child0 = function () {
  console.log('KQ0090010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010button1/Select');
};
// script4="child;1;MASK;_KQ0090010button1/Select"
expj.KQ0090010.KQ0090010form1.child1 = function () {
  console.log('KQ0090010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010button1/Select');
};
// script5="onDecision;1;CHK;_KQ0090010form2/chkADD_ODR_FLG[eq]true@*2,*3"
expj.KQ0090010.KQ0090010form1.onDecision1 = function () {
  console.log('KQ0090010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form1', '_KQ0090010form2/chkADD_ODR_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;2;UNMASK;_KQ0090010form2/ORGN_ODR_NO,_KQ0090010form2/ORGN_ODR_NO_PEEKER"
expj.KQ0090010.KQ0090010form1.child2 = function () {
  console.log('KQ0090010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010form2/ORGN_ODR_NO');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010form2/ORGN_ODR_NO_PEEKER');
};
// script7="child;3;MASK;_KQ0090010form2/ORGN_ODR_NO,_KQ0090010form2/ORGN_ODR_NO_PEEKER@*4"
expj.KQ0090010.KQ0090010form1.child3 = function () {
  console.log('KQ0090010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010form2/ORGN_ODR_NO');
expj.common.pscript.setMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010form2/ORGN_ODR_NO_PEEKER');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script8="child;4;SET;_KQ0090010form2/ORGN_ODR_NO="
expj.KQ0090010.KQ0090010form1.child4 = function () {
  console.log('KQ0090010form1 script8');
expj.common.pscript.setReferenceComponentValue('KQ0090010', 'KQ0090010form1', '_KQ0090010form2/ORGN_ODR_NO', '');
};
// script9="onDecision;2;CHK;_KQ0090010form2/chkADD_ODR_FLG[eq]true@*5,*6"
expj.KQ0090010.KQ0090010form1.onDecision2 = function () {
  console.log('KQ0090010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form1', '_KQ0090010form2/chkADD_ODR_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script10="child;5;CHKRQ;B,C,D@*7,*8"
expj.KQ0090010.KQ0090010form1.child5 = function () {
  console.log('KQ0090010form1 script10');
if (expj.common.pscript.satisfiedRequiredComponent('KQ0090010', 'B') && expj.common.pscript.satisfiedRequiredComponent('KQ0090010', 'C') && expj.common.pscript.satisfiedRequiredComponent('KQ0090010', 'D')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script11="child;6;CHKRQ;B,C,E@*7,*8"
expj.KQ0090010.KQ0090010form1.child6 = function () {
  console.log('KQ0090010form1 script11');
if (expj.common.pscript.satisfiedRequiredComponent('KQ0090010', 'B') && expj.common.pscript.satisfiedRequiredComponent('KQ0090010', 'C') && expj.common.pscript.satisfiedRequiredComponent('KQ0090010', 'E')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script12="child;7;UNMASK;_KQ0090010button2/Insert"
expj.KQ0090010.KQ0090010form1.child7 = function () {
  console.log('KQ0090010form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010button2/Insert');
};
// script13="child;8;MASK;_KQ0090010button2/Insert"
expj.KQ0090010.KQ0090010form1.child8 = function () {
  console.log('KQ0090010form1 script13');
expj.common.pscript.setMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010button2/Insert');
};
// script14="onDecision;3;CHK;?KQ0090010form1/*[eq]NORMAL[and]?KQ0090010form1/ODR_NO[neq]SAME@*9"
expj.KQ0090010.KQ0090010form1.onDecision3 = function () {
  console.log('KQ0090010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form1', '?KQ0090010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form1', '?KQ0090010form1/ODR_NO'), '[neq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script15="child;9;CHK;_KQ0090010form1/ODR_NO[neq]@*10,*11"
expj.KQ0090010.KQ0090010form1.child9 = function () {
  console.log('KQ0090010form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form1', '_KQ0090010form1/ODR_NO'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script16="child;10;MASK;_KQ0090010button2/Insert,_KQ0090010button2/Update,_KQ0090010button2/Delete"
expj.KQ0090010.KQ0090010form1.child10 = function () {
  console.log('KQ0090010form1 script16');
expj.common.pscript.setMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010button2/Insert');
expj.common.pscript.setMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010button2/Update');
expj.common.pscript.setMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010button2/Delete');
};
// script17="child;11;CHK;_KQ0090010form2/chkADD_ODR_FLG[eq]true@*12,*13"
expj.KQ0090010.KQ0090010form1.child11 = function () {
  console.log('KQ0090010form1 script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form1', '_KQ0090010form2/chkADD_ODR_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script18="child;12;CHKRQ;B,C,D@*14,*16"
expj.KQ0090010.KQ0090010form1.child12 = function () {
  console.log('KQ0090010form1 script18');
if (expj.common.pscript.satisfiedRequiredComponent('KQ0090010', 'B') && expj.common.pscript.satisfiedRequiredComponent('KQ0090010', 'C') && expj.common.pscript.satisfiedRequiredComponent('KQ0090010', 'D')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script19="child;13;CHKRQ;B,C,E@*14,*16"
expj.KQ0090010.KQ0090010form1.child13 = function () {
  console.log('KQ0090010form1 script19');
if (expj.common.pscript.satisfiedRequiredComponent('KQ0090010', 'B') && expj.common.pscript.satisfiedRequiredComponent('KQ0090010', 'C') && expj.common.pscript.satisfiedRequiredComponent('KQ0090010', 'E')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script20="child;14;UNMASK;_KQ0090010button2/Insert@*15"
expj.KQ0090010.KQ0090010form1.child14 = function () {
  console.log('KQ0090010form1 script20');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010button2/Insert');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child15)){this.child15();}}
};
// script21="child;15;MASK;_KQ0090010button2/Update,_KQ0090010button2/Delete"
expj.KQ0090010.KQ0090010form1.child15 = function () {
  console.log('KQ0090010form1 script21');
expj.common.pscript.setMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010button2/Update');
expj.common.pscript.setMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010button2/Delete');
};
// script22="child;16;MASK;_KQ0090010button2/Insert,_KQ0090010button2/Update,_KQ0090010button2/Delete"
expj.KQ0090010.KQ0090010form1.child16 = function () {
  console.log('KQ0090010form1 script22');
expj.common.pscript.setMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010button2/Insert');
expj.common.pscript.setMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010button2/Update');
expj.common.pscript.setMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010button2/Delete');
};
// script23="onDecision;4;CHK;_KQ0090010form2/ORGN_ODR_NO[neq]@*17,*18"
expj.KQ0090010.KQ0090010form1.onDecision4 = function () {
  console.log('KQ0090010form1 script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form1', '_KQ0090010form2/ORGN_ODR_NO'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
} else {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script24="child;17;MASK;_KQ0090010form2/CUST_CD,_KQ0090010form2/CUST_CD_PEEKER"
expj.KQ0090010.KQ0090010form1.child17 = function () {
  console.log('KQ0090010form1 script24');
expj.common.pscript.setMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010form2/CUST_CD');
expj.common.pscript.setMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010form2/CUST_CD_PEEKER');
};
// script25="child;18;UNMASK;_KQ0090010form2/CUST_CD,_KQ0090010form2/CUST_CD_PEEKER"
expj.KQ0090010.KQ0090010form1.child18 = function () {
  console.log('KQ0090010form1 script25');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010form2/CUST_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010form2/CUST_CD_PEEKER');
};
// script27="onDecision;5;CHK;?KQ0090010form1/*[eq]NORMAL[and]?KQ0090010form1/ODR_NO[eq]SAME@*20"
expj.KQ0090010.KQ0090010form1.onDecision5 = function () {
  console.log('KQ0090010form1 script27');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form1', '?KQ0090010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form1', '?KQ0090010form1/ODR_NO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
// script28="child;20;CHK;_KQ0090010form2/chkADD_ODR_FLG[eq]true@*21,*22"
expj.KQ0090010.KQ0090010form1.child20 = function () {
  console.log('KQ0090010form1 script28');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form1', '_KQ0090010form2/chkADD_ODR_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
} else {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script29="child;21;CHKRQ;B,D@*23,*24"
expj.KQ0090010.KQ0090010form1.child21 = function () {
  console.log('KQ0090010form1 script29');
if (expj.common.pscript.satisfiedRequiredComponent('KQ0090010', 'B') && expj.common.pscript.satisfiedRequiredComponent('KQ0090010', 'D')) {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
} else {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
}
};
// script30="child;22;CHKRQ;B,E@*23,*24"
expj.KQ0090010.KQ0090010form1.child22 = function () {
  console.log('KQ0090010form1 script30');
if (expj.common.pscript.satisfiedRequiredComponent('KQ0090010', 'B') && expj.common.pscript.satisfiedRequiredComponent('KQ0090010', 'E')) {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
} else {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
}
};
// script31="child;23;UNMASK;_KQ0090010button2/Update,_KQ0090010button2/Delete@*25"
expj.KQ0090010.KQ0090010form1.child23 = function () {
  console.log('KQ0090010form1 script31');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010button2/Update');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010button2/Delete');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child25)){this.child25();}}
};
// script32="child;24;MASK;_KQ0090010button2/Update@*25"
expj.KQ0090010.KQ0090010form1.child24 = function () {
  console.log('KQ0090010form1 script32');
expj.common.pscript.setMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010button2/Update');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child25)){this.child25();}}
};
// script33="child;25;MASK;_KQ0090010button2/Insert"
expj.KQ0090010.KQ0090010form1.child25 = function () {
  console.log('KQ0090010form1 script33');
expj.common.pscript.setMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010button2/Insert');
};
// script34="onDecision;6;CHK;_KQ0090010form2/ORGN_ODR_NO[eq]@*26,*27"
expj.KQ0090010.KQ0090010form1.onDecision6 = function () {
  console.log('KQ0090010form1 script34');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form1', '_KQ0090010form2/ORGN_ODR_NO'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
} else {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
}
};
// script35="child;26;MASK;_KQ0090010form2/GetDefault"
expj.KQ0090010.KQ0090010form1.child26 = function () {
  console.log('KQ0090010form1 script35');
expj.common.pscript.setMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010form2/GetDefault');
};
// script36="child;27;UNMASK;_KQ0090010form2/GetDefault"
expj.KQ0090010.KQ0090010form1.child27 = function () {
  console.log('KQ0090010form1 script36');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010form2/GetDefault');
};
// script37="onDecision;7;CHK;?KQ0090010form1/*[eq]INITIAL@*28"
expj.KQ0090010.KQ0090010form1.onDecision7 = function () {
  console.log('KQ0090010form1 script37');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form1', '?KQ0090010form1/*'), '[eq]', 'INITIAL')) {
if(expj.common.checkNameSpace(this.child28)){this.child28();}
}
};
// script38="child;28;MASK;_KQ0090010button2/Update,_KQ0090010button2/Delete"
expj.KQ0090010.KQ0090010form1.child28 = function () {
  console.log('KQ0090010form1 script38');
expj.common.pscript.setMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010button2/Update');
expj.common.pscript.setMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010button2/Delete');
};
// script39="onDecision;8;CHK;?KQ0090010form1/*[eq]ERROR[or]?KQ0090010form1/*[eq]NOT_FOUND@*29"
expj.KQ0090010.KQ0090010form1.onDecision8 = function () {
  console.log('KQ0090010form1 script39');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form1', '?KQ0090010form1/*'), '[eq]', 'ERROR') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form1', '?KQ0090010form1/*'), '[eq]', 'NOT_FOUND')) {
if(expj.common.checkNameSpace(this.child29)){this.child29();}
}
};
// script40="child;29;MASK;_KQ0090010button2/Update,_KQ0090010button2/Delete"
expj.KQ0090010.KQ0090010form1.child29 = function () {
  console.log('KQ0090010form1 script40');
expj.common.pscript.setMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010button2/Update');
expj.common.pscript.setMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010button2/Delete');
};
// script41="onDecision;9;CHK;_KQ0090010form2/ODR_UNIT_PRICE[numeq]0[and]_KQ0090010form2/ODR_QTY[numeq]0@*30,*31"
expj.KQ0090010.KQ0090010form1.onDecision9 = function () {
  console.log('KQ0090010form1 script41');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form1', '_KQ0090010form2/ODR_UNIT_PRICE')), '[numeq]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form1', '_KQ0090010form2/ODR_QTY')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
if(expj.common.checkNameSpace(this.child30)){this.child30();}
} else {
if(expj.common.checkNameSpace(this.child31)){this.child31();}
}
};
// script42="child;30;UNMASK;_KQ0090010form2/ODR_AMOUNT"
expj.KQ0090010.KQ0090010form1.child30 = function () {
  console.log('KQ0090010form1 script42');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010form2/ODR_AMOUNT');
};
// script43="child;31;MASK;_KQ0090010form2/ODR_AMOUNT"
expj.KQ0090010.KQ0090010form1.child31 = function () {
  console.log('KQ0090010form1 script43');
expj.common.pscript.setMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010form2/ODR_AMOUNT');
};
// script44="onDecision;10;CHK;_KQ0090010form1/h_APR_ODR[eq]1@*32,*33"
expj.KQ0090010.KQ0090010form1.onDecision10 = function () {
  console.log('KQ0090010form1 script44');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form1', '_KQ0090010form1/h_APR_ODR'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child32)){this.child32();}
} else {
if(expj.common.checkNameSpace(this.child33)){this.child33();}
}
};
// script45="child;32;UNMASK;_KQ0090010form2/APPROVED_COMMENT"
expj.KQ0090010.KQ0090010form1.child32 = function () {
  console.log('KQ0090010form1 script45');
expj.common.pscript.setUnMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010form2/APPROVED_COMMENT');
};
// script46="child;33;MASK;_KQ0090010form2/APPROVED_COMMENT"
expj.KQ0090010.KQ0090010form1.child33 = function () {
  console.log('KQ0090010form1 script46');
expj.common.pscript.setMaskToReferenceComponent('KQ0090010', 'KQ0090010form1', '_KQ0090010form2/APPROVED_COMMENT');
};
expj.KQ0090010.KQ0090010form1.executeAllOnDecision = function () {
  console.log('execute KQ0090010form1.onDecision');
  for (var i = 0; i <= 10; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0090010.KQ0090010form1['onDecision' + i])) {
        expj.KQ0090010.KQ0090010form1['onDecision' + i]();
      }
    }
  }
};
expj.KQ0090010.KQ0090010form1.executeOnLoad = function () {
  expj.KQ0090010.KQ0090010form1.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form1.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KQ0090010.KQ0090010form1['onLoad' + i])) {
      expj.KQ0090010.KQ0090010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KQ0090010-KQ0090010form1" action="KQ0090010Servlet" name="KQ0090010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKQ0090010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:260px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:110px;align:left"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:222px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ACPT_ODR_CD",rb)%></span><!-- 受注番号 --></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form1-ODR_NO">
expj.KQ0090010.KQ0090010form1.ODR_NO = {};
expj.KQ0090010.KQ0090010form1.ODR_NO.executeAllOnDecision = function () {
  console.log('execute KQ0090010form1/ODR_NO.onDecision');
  expj.KQ0090010.KQ0090010form1.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form1.ODR_NO.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form1-ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form1', 'ODR_NO', this);
  });
  expj.KQ0090010.KQ0090010form1.ODR_NO.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form1.ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form1/ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form1-ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0090010-KQ0090010form1-ODR_NO" name="ODR_NO" class="KQ0090010-focus-move  required-value expj-KQ0090010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getODR_NO()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form1-ODR_NO_PEEKER">
expj.KQ0090010.KQ0090010form1.ODR_NO_PEEKER = {};
// script1="onClick;0;PEEKER;_KQ0090010form1/ODR_NO@<%=contextNo%>"
expj.KQ0090010.KQ0090010form1.ODR_NO_PEEKER.onClick0 = function () {
  console.log('ODR_NO_PEEKER script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KQ0090010';
var parameterValues = 'ODR_NO_PEEKER%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('KQ0090010', 'ODR_NO_PEEKER', 'SQLPARAM_1', '<%=strSysCompanyCd%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form1', '_KQ0090010form1/ODR_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ODR_NO_UNSTOCK_01%&%';
parameterValues += 'TARGET_FIELD%=%_KQ0090010form1/ODR_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KQ0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KQ0090010.KQ0090010form1.ODR_NO_PEEKER.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0090010.KQ0090010form1.ODR_NO_PEEKER['onClick' + i])) {
        expj.KQ0090010.KQ0090010form1.ODR_NO_PEEKER['onClick' + i]();
      }
    }
  }
};
expj.KQ0090010.KQ0090010form1.ODR_NO_PEEKER.executeAllOnDecision = function () {
};
expj.KQ0090010.KQ0090010form1.ODR_NO_PEEKER.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form1-ODR_NO_PEEKER').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0090010', 'KQ0090010form1', 'ODR_NO_PEEKER', this, 'Button');
    }
  });
  expj.KQ0090010.KQ0090010form1.ODR_NO_PEEKER.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form1.ODR_NO_PEEKER.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form1/ODR_NO_PEEKER.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form1-ODR_NO_PEEKER');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0090010-KQ0090010form1-ODR_NO_PEEKER" class="KQ0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:110px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0001",rb)%></span><!-- （自動採番） --></div><!--/td-->
<input type="hidden" id="expj-KQ0090010-KQ0090010form1-h_MODIFY_COUNT" name="h_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.geth_MODIFY_COUNT()) %>">
<script class="expj-script-KQ0090010-KQ0090010form1-h_MODIFY_COUNT">
expj.KQ0090010.KQ0090010form1.h_MODIFY_COUNT = {};
expj.KQ0090010.KQ0090010form1.h_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute KQ0090010form1/h_MODIFY_COUNT.onDecision');
  expj.KQ0090010.KQ0090010form1.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form1.h_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form1-h_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form1', 'h_MODIFY_COUNT', this);
  });
  expj.KQ0090010.KQ0090010form1.h_MODIFY_COUNT.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form1.h_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form1/h_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form1-h_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KQ0090010-KQ0090010form1-h_SYS_COMPANY_CODE" name="h_SYS_COMPANY_CODE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.geth_SYS_COMPANY_CODE()) %>">
<script class="expj-script-KQ0090010-KQ0090010form1-h_SYS_COMPANY_CODE">
expj.KQ0090010.KQ0090010form1.h_SYS_COMPANY_CODE = {};
expj.KQ0090010.KQ0090010form1.h_SYS_COMPANY_CODE.executeAllOnDecision = function () {
  console.log('execute KQ0090010form1/h_SYS_COMPANY_CODE.onDecision');
  expj.KQ0090010.KQ0090010form1.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form1.h_SYS_COMPANY_CODE.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form1-h_SYS_COMPANY_CODE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form1', 'h_SYS_COMPANY_CODE', this);
  });
  expj.KQ0090010.KQ0090010form1.h_SYS_COMPANY_CODE.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form1.h_SYS_COMPANY_CODE.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form1/h_SYS_COMPANY_CODE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form1-h_SYS_COMPANY_CODE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KQ0090010-KQ0090010form1-h_APR_ODR" name="h_APR_ODR" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.geth_APR_ODR()) %>">
<script class="expj-script-KQ0090010-KQ0090010form1-h_APR_ODR">
expj.KQ0090010.KQ0090010form1.h_APR_ODR = {};
expj.KQ0090010.KQ0090010form1.h_APR_ODR.executeAllOnDecision = function () {
  console.log('execute KQ0090010form1/h_APR_ODR.onDecision');
  expj.KQ0090010.KQ0090010form1.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form1.h_APR_ODR.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form1-h_APR_ODR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form1', 'h_APR_ODR', this);
  });
  expj.KQ0090010.KQ0090010form1.h_APR_ODR.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form1.h_APR_ODR.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form1/h_APR_ODR.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form1-h_APR_ODR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:222px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KQ0090010-KQ0090010button1">
expj.KQ0090010.KQ0090010button1 = {};
expj.KQ0090010.KQ0090010button1.executeAllOnDecision = function () {
  console.log('execute KQ0090010button1.onDecision');
};
expj.KQ0090010.KQ0090010button1.executeOnLoad = function () {
  expj.KQ0090010.KQ0090010button1.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010button1.executePScriptOnLoad = function () {
  console.log('execute KQ0090010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KQ0090010-KQ0090010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KQ0090010-KQ0090010button1-Select">
expj.KQ0090010.KQ0090010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0090010form1/*,_KQ0090010form2/h_BUSINESS_OPR_DATE@KQ0090010Servlet"
expj.KQ0090010.KQ0090010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0090010', 'KQ0090010button1', '_KQ0090010form1/*,_KQ0090010form2/h_BUSINESS_OPR_DATE', 'KQ0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0090010', response);
expj.common.updateBusinessScreenTab('KQ0090010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KQ0090010.KQ0090010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0090010.KQ0090010button1.Select['onClick' + i])) {
        expj.KQ0090010.KQ0090010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.KQ0090010.KQ0090010button1.Select.executeAllOnDecision = function () {
};
expj.KQ0090010.KQ0090010button1.Select.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0090010', 'KQ0090010button1', 'Select', this, 'Button');
    }
  });
  expj.KQ0090010.KQ0090010button1.Select.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010button1.Select.executePScriptOnLoad = function () {
  console.log('execute KQ0090010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0090010-KQ0090010button1-Select" name="Select" class="KQ0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KQ0090010-KQ0090010form2">
expj.KQ0090010.KQ0090010form2 = {};
expj.KQ0090010.KQ0090010form2.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2.onDecision');
};
expj.KQ0090010.KQ0090010form2.executeOnLoad = function () {
  expj.KQ0090010.KQ0090010form2.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KQ0090010-KQ0090010form2" action="KQ0090010Servlet" name="KQ0090010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:110px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:115px;align:left"></div>
<div class="div-td" style="align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name true"><%= TypeConverter.sanitizer(aKQ0090010Struct.getlbORGN_ODR_NO()) %></span></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-ORGN_ODR_NO">
expj.KQ0090010.KQ0090010form2.ORGN_ODR_NO = {};
// script1="onDecision;0;CHK;_KQ0090010form2/ORGN_ODR_NO[neq]@*0"
expj.KQ0090010.KQ0090010form2.ORGN_ODR_NO.onDecision0 = function () {
  console.log('ORGN_ODR_NO script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form2', '_KQ0090010form2/ORGN_ODR_NO'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SET;_KQ0090010form2/CUST_CD=,_KQ0090010form2/CUST_ANAME="
expj.KQ0090010.KQ0090010form2.ORGN_ODR_NO.child0 = function () {
  console.log('ORGN_ODR_NO script2');
expj.common.pscript.setReferenceComponentValue('KQ0090010', 'KQ0090010form2', '_KQ0090010form2/CUST_CD', '');
expj.common.pscript.setReferenceComponentValue('KQ0090010', 'KQ0090010form2', '_KQ0090010form2/CUST_ANAME', '');
};
expj.KQ0090010.KQ0090010form2.ORGN_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/ORGN_ODR_NO.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0090010.KQ0090010form2.ORGN_ODR_NO['onDecision' + i])) {
        expj.KQ0090010.KQ0090010form2.ORGN_ODR_NO['onDecision' + i]();
      }
    }
  }
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.ORGN_ODR_NO.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-ORGN_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'ORGN_ODR_NO', this);
  });
  expj.KQ0090010.KQ0090010form2.ORGN_ODR_NO.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.ORGN_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/ORGN_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-ORGN_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0090010-KQ0090010form2-ORGN_ODR_NO" name="ORGN_ODR_NO" class="KQ0090010-focus-move  required-value expj-KQ0090010-required-D" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getORGN_ODR_NO()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-ORGN_ODR_NO_PEEKER">
expj.KQ0090010.KQ0090010form2.ORGN_ODR_NO_PEEKER = {};
// script1="onClick;0;PEEKER;_KQ0090010form2/ORGN_ODR_NO@<%=contextNo%>"
expj.KQ0090010.KQ0090010form2.ORGN_ODR_NO_PEEKER.onClick0 = function () {
  console.log('ORGN_ODR_NO_PEEKER script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KQ0090010';
var parameterValues = 'ORGN_ODR_NO_PEEKER%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('KQ0090010', 'ORGN_ODR_NO_PEEKER', 'SQLPARAM_1', '<%=sqlparamOrgnOdrNo1%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
var checkParam = expj.common.pscript.getPeekerParam('KQ0090010', 'ORGN_ODR_NO_PEEKER', 'SQLPARAM_2', '<%=sqlparamOrgnOdrNo2%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%<%=sqlnameOrgnOdrNo%>%&%';
parameterValues += 'TARGET_FIELD%=%_KQ0090010form2/ORGN_ODR_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KQ0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KQ0090010.KQ0090010form2.ORGN_ODR_NO_PEEKER.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0090010.KQ0090010form2.ORGN_ODR_NO_PEEKER['onClick' + i])) {
        expj.KQ0090010.KQ0090010form2.ORGN_ODR_NO_PEEKER['onClick' + i]();
      }
    }
  }
};
expj.KQ0090010.KQ0090010form2.ORGN_ODR_NO_PEEKER.executeAllOnDecision = function () {
};
expj.KQ0090010.KQ0090010form2.ORGN_ODR_NO_PEEKER.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-ORGN_ODR_NO_PEEKER').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0090010', 'KQ0090010form2', 'ORGN_ODR_NO_PEEKER', this, 'Button');
    }
  });
  expj.KQ0090010.KQ0090010form2.ORGN_ODR_NO_PEEKER.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.ORGN_ODR_NO_PEEKER.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/ORGN_ODR_NO_PEEKER.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-ORGN_ODR_NO_PEEKER');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0090010-KQ0090010form2-ORGN_ODR_NO_PEEKER" class="KQ0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-chkADD_ODR_FLG">
expj.KQ0090010.KQ0090010form2.chkADD_ODR_FLG = {};
expj.KQ0090010.KQ0090010form2.chkADD_ODR_FLG.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/chkADD_ODR_FLG.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.chkADD_ODR_FLG.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-chkADD_ODR_FLG').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0090010', 'KQ0090010form2', 'chkADD_ODR_FLG', this, 'CheckBox');
    }
  });
  expj.KQ0090010.KQ0090010form2.chkADD_ODR_FLG.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.chkADD_ODR_FLG.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/chkADD_ODR_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-chkADD_ODR_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:115px;text-align:left;"><input type="checkbox" name="chkADD_ODR_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aKQ0090010Struct.getchkADD_ODR_FLG())) || "1".equals(TypeConverter.convert(aKQ0090010Struct.getchkADD_ODR_FLG())))?"checked=\"checked\"":"" %>  class="KQ0090010-focus-move" id="expj-KQ0090010-KQ0090010form2-chkADD_ODR_FLG"><label for="expj-KQ0090010-KQ0090010form2-chkADD_ODR_FLG"><%=CoreTools.getRBString("Expj.Cmt6679",rb)%></label></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-GetDefault">
expj.KQ0090010.KQ0090010form2.GetDefault = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0090010form1/*,_KQ0090010form2/*@KQ0090010Servlet"
expj.KQ0090010.KQ0090010form2.GetDefault.onClick0 = function () {
  console.log('GetDefault script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0090010', 'KQ0090010form2', '_KQ0090010form1/*,_KQ0090010form2/*', 'KQ0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0090010', response);
expj.common.updateBusinessScreenTab('KQ0090010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KQ0090010.KQ0090010form2.GetDefault.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0090010.KQ0090010form2.GetDefault['onClick' + i])) {
        expj.KQ0090010.KQ0090010form2.GetDefault['onClick' + i]();
      }
    }
  }
};
expj.KQ0090010.KQ0090010form2.GetDefault.executeAllOnDecision = function () {
};
expj.KQ0090010.KQ0090010form2.GetDefault.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-GetDefault').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0090010', 'KQ0090010form2', 'GetDefault', this, 'Button');
    }
  });
  expj.KQ0090010.KQ0090010form2.GetDefault.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.GetDefault.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/GetDefault.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-GetDefault');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:100px;text-align:left;"><button type="button" id="expj-KQ0090010-KQ0090010form2-GetDefault" name="GetDefault" class="KQ0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnGetOrgnOdrInfo",rb)%></button><!-- 元受注情報取得ボタン --></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ODR_ACPT_DATE",rb)%></span><!-- 受注日 --></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-ODR_ACPT_DATE">
expj.KQ0090010.KQ0090010form2.ODR_ACPT_DATE = {};
expj.KQ0090010.KQ0090010form2.ODR_ACPT_DATE.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/ODR_ACPT_DATE.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.ODR_ACPT_DATE.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-ODR_ACPT_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'ODR_ACPT_DATE', this);
  });
  expj.KQ0090010.KQ0090010form2.ODR_ACPT_DATE.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.ODR_ACPT_DATE.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/ODR_ACPT_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-ODR_ACPT_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0090010-KQ0090010form2-ODR_ACPT_DATE" name="ODR_ACPT_DATE" class="KQ0090010-focus-move  required-value expj-KQ0090010-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getODR_ACPT_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-ODR_ACPT_DATE_CALENDAR">
expj.KQ0090010.KQ0090010form2.ODR_ACPT_DATE_CALENDAR = {};
// script1="onClick;0;CALENDAR;_KQ0090010form2/ODR_ACPT_DATE"
expj.KQ0090010.KQ0090010form2.ODR_ACPT_DATE_CALENDAR.onClick0 = function () {
  console.log('ODR_ACPT_DATE_CALENDAR script1');
expj.common.pscript.executeCalendar('KQ0090010','KQ0090010form2','_KQ0090010form2/ODR_ACPT_DATE');
};
expj.KQ0090010.KQ0090010form2.ODR_ACPT_DATE_CALENDAR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0090010.KQ0090010form2.ODR_ACPT_DATE_CALENDAR['onClick' + i])) {
        expj.KQ0090010.KQ0090010form2.ODR_ACPT_DATE_CALENDAR['onClick' + i]();
      }
    }
  }
};
expj.KQ0090010.KQ0090010form2.ODR_ACPT_DATE_CALENDAR.executeAllOnDecision = function () {
};
expj.KQ0090010.KQ0090010form2.ODR_ACPT_DATE_CALENDAR.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-ODR_ACPT_DATE_CALENDAR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0090010', 'KQ0090010form2', 'ODR_ACPT_DATE_CALENDAR', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KQ0090010','KQ0090010form2','_KQ0090010form2/ODR_ACPT_DATE');
  expj.KQ0090010.KQ0090010form2.ODR_ACPT_DATE_CALENDAR.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.ODR_ACPT_DATE_CALENDAR.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/ODR_ACPT_DATE_CALENDAR.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-ODR_ACPT_DATE_CALENDAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><button type="button" id="expj-KQ0090010-KQ0090010form2-ODR_ACPT_DATE_CALENDAR" class="KQ0090010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:115px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CUST_ODR_NO",rb)%></span><!-- 得意先注文番号 --></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-CUST_ODR_NO">
expj.KQ0090010.KQ0090010form2.CUST_ODR_NO = {};
expj.KQ0090010.KQ0090010form2.CUST_ODR_NO.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/CUST_ODR_NO.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.CUST_ODR_NO.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-CUST_ODR_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'CUST_ODR_NO', this);
  });
  expj.KQ0090010.KQ0090010form2.CUST_ODR_NO.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.CUST_ODR_NO.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/CUST_ODR_NO.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-CUST_ODR_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0090010-KQ0090010form2-CUST_ODR_NO" name="CUST_ODR_NO" class="KQ0090010-focus-move  required-value expj-KQ0090010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getCUST_ODR_NO()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:115px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-CUST_CD">
expj.KQ0090010.KQ0090010form2.CUST_CD = {};
expj.KQ0090010.KQ0090010form2.CUST_CD.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/CUST_CD.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.CUST_CD.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'CUST_CD', this);
  });
  expj.KQ0090010.KQ0090010form2.CUST_CD.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0090010-KQ0090010form2-CUST_CD" name="CUST_CD" class="KQ0090010-focus-move  required-value expj-KQ0090010-required-E" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getCUST_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-CUST_CD_PEEKER">
expj.KQ0090010.KQ0090010form2.CUST_CD_PEEKER = {};
// script1="onClick;0;PEEKER;_KQ0090010form2/CUST_CD:_KQ0090010form2/CUST_ANAME@<%=contextNo%>"
expj.KQ0090010.KQ0090010form2.CUST_CD_PEEKER.onClick0 = function () {
  console.log('CUST_CD_PEEKER script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KQ0090010';
var parameterValues = 'CUST_CD_PEEKER%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('KQ0090010', 'CUST_CD_PEEKER', 'SQLPARAM_1', '<%=sqlparamCustCd1%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
var checkParam = expj.common.pscript.getPeekerParam('KQ0090010', 'CUST_CD_PEEKER', 'SQLPARAM_2', '<%=sqlparamCustCd2%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%<%=sqlnameCustCd%>%&%';
parameterValues += 'TARGET_FIELD%=%_KQ0090010form2/CUST_CD:_KQ0090010form2/CUST_ANAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KQ0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KQ0090010.KQ0090010form2.CUST_CD_PEEKER.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0090010.KQ0090010form2.CUST_CD_PEEKER['onClick' + i])) {
        expj.KQ0090010.KQ0090010form2.CUST_CD_PEEKER['onClick' + i]();
      }
    }
  }
};
expj.KQ0090010.KQ0090010form2.CUST_CD_PEEKER.executeAllOnDecision = function () {
};
expj.KQ0090010.KQ0090010form2.CUST_CD_PEEKER.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-CUST_CD_PEEKER').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0090010', 'KQ0090010form2', 'CUST_CD_PEEKER', this, 'Button');
    }
  });
  expj.KQ0090010.KQ0090010form2.CUST_CD_PEEKER.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.CUST_CD_PEEKER.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/CUST_CD_PEEKER.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-CUST_CD_PEEKER');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0090010-KQ0090010form2-CUST_CD_PEEKER" class="KQ0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-CUST_ANAME">
expj.KQ0090010.KQ0090010form2.CUST_ANAME = {};
expj.KQ0090010.KQ0090010form2.CUST_ANAME.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/CUST_ANAME.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.CUST_ANAME.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-CUST_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'CUST_ANAME', this);
  });
  expj.KQ0090010.KQ0090010form2.CUST_ANAME.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.CUST_ANAME.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/CUST_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-CUST_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:137px;text-align:left;"><input type="text" id="expj-KQ0090010-KQ0090010form2-CUST_ANAME" name="CUST_ANAME" class="KQ0090010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getCUST_ANAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CHRG_PSN_CD",rb)%></span><!-- 営業担当者コード --></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-CUST_CHRG_PSN_CD">
expj.KQ0090010.KQ0090010form2.CUST_CHRG_PSN_CD = {};
expj.KQ0090010.KQ0090010form2.CUST_CHRG_PSN_CD.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/CUST_CHRG_PSN_CD.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.CUST_CHRG_PSN_CD.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-CUST_CHRG_PSN_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'CUST_CHRG_PSN_CD', this);
  });
  expj.KQ0090010.KQ0090010form2.CUST_CHRG_PSN_CD.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.CUST_CHRG_PSN_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/CUST_CHRG_PSN_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-CUST_CHRG_PSN_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0090010-KQ0090010form2-CUST_CHRG_PSN_CD" name="CUST_CHRG_PSN_CD" class="KQ0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getCUST_CHRG_PSN_CD()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-CUST_CHRG_PSN_CD_PEEKER">
expj.KQ0090010.KQ0090010form2.CUST_CHRG_PSN_CD_PEEKER = {};
// script1="onClick;0;PEEKER;_KQ0090010form2/CUST_CHRG_PSN_CD:_KQ0090010form2/USER_NAME@<%=contextNo%>"
expj.KQ0090010.KQ0090010form2.CUST_CHRG_PSN_CD_PEEKER.onClick0 = function () {
  console.log('CUST_CHRG_PSN_CD_PEEKER script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KQ0090010';
var parameterValues = 'CUST_CHRG_PSN_CD_PEEKER%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('KQ0090010', 'CUST_CHRG_PSN_CD_PEEKER', 'SQLPARAM_1', '<%=sqlparamCustChrgPsnCd1%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
var checkParam = expj.common.pscript.getPeekerParam('KQ0090010', 'CUST_CHRG_PSN_CD_PEEKER', 'SQLPARAM_2', '<%=sqlparamCustChrgPsnCd2%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%<%=sqlnameCustChrgPsnCd%>%&%';
parameterValues += 'TARGET_FIELD%=%_KQ0090010form2/CUST_CHRG_PSN_CD:_KQ0090010form2/USER_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KQ0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KQ0090010.KQ0090010form2.CUST_CHRG_PSN_CD_PEEKER.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0090010.KQ0090010form2.CUST_CHRG_PSN_CD_PEEKER['onClick' + i])) {
        expj.KQ0090010.KQ0090010form2.CUST_CHRG_PSN_CD_PEEKER['onClick' + i]();
      }
    }
  }
};
expj.KQ0090010.KQ0090010form2.CUST_CHRG_PSN_CD_PEEKER.executeAllOnDecision = function () {
};
expj.KQ0090010.KQ0090010form2.CUST_CHRG_PSN_CD_PEEKER.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-CUST_CHRG_PSN_CD_PEEKER').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0090010', 'KQ0090010form2', 'CUST_CHRG_PSN_CD_PEEKER', this, 'Button');
    }
  });
  expj.KQ0090010.KQ0090010form2.CUST_CHRG_PSN_CD_PEEKER.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.CUST_CHRG_PSN_CD_PEEKER.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/CUST_CHRG_PSN_CD_PEEKER.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-CUST_CHRG_PSN_CD_PEEKER');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0090010-KQ0090010form2-CUST_CHRG_PSN_CD_PEEKER" class="KQ0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-USER_NAME">
expj.KQ0090010.KQ0090010form2.USER_NAME = {};
expj.KQ0090010.KQ0090010form2.USER_NAME.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/USER_NAME.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.USER_NAME.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-USER_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'USER_NAME', this);
  });
  expj.KQ0090010.KQ0090010form2.USER_NAME.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.USER_NAME.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/USER_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-USER_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:137px;text-align:left;"><input type="text" id="expj-KQ0090010-KQ0090010form2-USER_NAME" name="USER_NAME" class="KQ0090010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getUSER_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-ITEM_CD">
expj.KQ0090010.KQ0090010form2.ITEM_CD = {};
expj.KQ0090010.KQ0090010form2.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/ITEM_CD.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.ITEM_CD.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'ITEM_CD', this);
  });
  expj.KQ0090010.KQ0090010form2.ITEM_CD.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0090010-KQ0090010form2-ITEM_CD" name="ITEM_CD" class="KQ0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-ITEM_CD_PEEKER">
expj.KQ0090010.KQ0090010form2.ITEM_CD_PEEKER = {};
// script1="onClick;0;PEEKER;_KQ0090010form2/ITEM_CD@<%=contextNo%>"
expj.KQ0090010.KQ0090010form2.ITEM_CD_PEEKER.onClick0 = function () {
  console.log('ITEM_CD_PEEKER script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KQ0090010';
var parameterValues = 'ITEM_CD_PEEKER%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('KQ0090010', 'ITEM_CD_PEEKER', 'SQLPARAM_1', '<%=sqlparamItemCd1%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
var checkParam = expj.common.pscript.getPeekerParam('KQ0090010', 'ITEM_CD_PEEKER', 'SQLPARAM_2', '<%=sqlparamItemCd2%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%<%=sqlnameItemCd%>%&%';
parameterValues += 'TARGET_FIELD%=%_KQ0090010form2/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KQ0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KQ0090010.KQ0090010form2.ITEM_CD_PEEKER.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0090010.KQ0090010form2.ITEM_CD_PEEKER['onClick' + i])) {
        expj.KQ0090010.KQ0090010form2.ITEM_CD_PEEKER['onClick' + i]();
      }
    }
  }
};
expj.KQ0090010.KQ0090010form2.ITEM_CD_PEEKER.executeAllOnDecision = function () {
};
expj.KQ0090010.KQ0090010form2.ITEM_CD_PEEKER.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-ITEM_CD_PEEKER').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0090010', 'KQ0090010form2', 'ITEM_CD_PEEKER', this, 'Button');
    }
  });
  expj.KQ0090010.KQ0090010form2.ITEM_CD_PEEKER.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.ITEM_CD_PEEKER.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/ITEM_CD_PEEKER.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-ITEM_CD_PEEKER');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KQ0090010-KQ0090010form2-ITEM_CD_PEEKER" class="KQ0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:115px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_NAME",rb)%></span><!-- 品目名 --></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-ITEM_NAME">
expj.KQ0090010.KQ0090010form2.ITEM_NAME = {};
expj.KQ0090010.KQ0090010form2.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/ITEM_NAME.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.ITEM_NAME.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'ITEM_NAME', this);
  });
  expj.KQ0090010.KQ0090010form2.ITEM_NAME.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KQ0090010-KQ0090010form2-ITEM_NAME" name="ITEM_NAME" class="KQ0090010-focus-move  required-value expj-KQ0090010-required-Z" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getITEM_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:115px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb)%></span><!-- 指定納期 --></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-DESINATED_DLV_DATE">
expj.KQ0090010.KQ0090010form2.DESINATED_DLV_DATE = {};
expj.KQ0090010.KQ0090010form2.DESINATED_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/DESINATED_DLV_DATE.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.DESINATED_DLV_DATE.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-DESINATED_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'DESINATED_DLV_DATE', this);
  });
  expj.KQ0090010.KQ0090010form2.DESINATED_DLV_DATE.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.DESINATED_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/DESINATED_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-DESINATED_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0090010-KQ0090010form2-DESINATED_DLV_DATE" name="DESINATED_DLV_DATE" class="KQ0090010-focus-move  required-value expj-KQ0090010-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getDESINATED_DLV_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-DESINATED_DLV_DATE_CALENDAR">
expj.KQ0090010.KQ0090010form2.DESINATED_DLV_DATE_CALENDAR = {};
// script1="onClick;0;CALENDAR;_KQ0090010form2/DESINATED_DLV_DATE"
expj.KQ0090010.KQ0090010form2.DESINATED_DLV_DATE_CALENDAR.onClick0 = function () {
  console.log('DESINATED_DLV_DATE_CALENDAR script1');
expj.common.pscript.executeCalendar('KQ0090010','KQ0090010form2','_KQ0090010form2/DESINATED_DLV_DATE');
};
expj.KQ0090010.KQ0090010form2.DESINATED_DLV_DATE_CALENDAR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0090010.KQ0090010form2.DESINATED_DLV_DATE_CALENDAR['onClick' + i])) {
        expj.KQ0090010.KQ0090010form2.DESINATED_DLV_DATE_CALENDAR['onClick' + i]();
      }
    }
  }
};
expj.KQ0090010.KQ0090010form2.DESINATED_DLV_DATE_CALENDAR.executeAllOnDecision = function () {
};
expj.KQ0090010.KQ0090010form2.DESINATED_DLV_DATE_CALENDAR.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-DESINATED_DLV_DATE_CALENDAR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0090010', 'KQ0090010form2', 'DESINATED_DLV_DATE_CALENDAR', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KQ0090010','KQ0090010form2','_KQ0090010form2/DESINATED_DLV_DATE');
  expj.KQ0090010.KQ0090010form2.DESINATED_DLV_DATE_CALENDAR.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.DESINATED_DLV_DATE_CALENDAR.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/DESINATED_DLV_DATE_CALENDAR.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-DESINATED_DLV_DATE_CALENDAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><button type="button" id="expj-KQ0090010-KQ0090010form2-DESINATED_DLV_DATE_CALENDAR" class="KQ0090010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KQ0090010-KQ0090010form2-h_BUSINESS_OPR_DATE" name="h_BUSINESS_OPR_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.geth_BUSINESS_OPR_DATE()) %>">
<script class="expj-script-KQ0090010-KQ0090010form2-h_BUSINESS_OPR_DATE">
expj.KQ0090010.KQ0090010form2.h_BUSINESS_OPR_DATE = {};
expj.KQ0090010.KQ0090010form2.h_BUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/h_BUSINESS_OPR_DATE.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.h_BUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-h_BUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'h_BUSINESS_OPR_DATE', this);
  });
  expj.KQ0090010.KQ0090010form2.h_BUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.h_BUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/h_BUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-h_BUSINESS_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:115px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.UNIT_COST",rb)%></span><!-- 単価 --></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-ODR_UNIT_PRICE">
expj.KQ0090010.KQ0090010form2.ODR_UNIT_PRICE = {};
// script1="onDecision;0;CHK;99999999999999.9999[lt][{_KQ0090010form2/ODR_UNIT_PRICE}*{_KQ0090010form2/ODR_QTY}]@*0,*1"
expj.KQ0090010.KQ0090010form2.ODR_UNIT_PRICE.onDecision0 = function () {
  console.log('ODR_UNIT_PRICE script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber('99999999999999.9999'), '[lt]', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form2', '_KQ0090010form2/ODR_UNIT_PRICE') + '*' + expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form2', '_KQ0090010form2/ODR_QTY')))) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;SET;_KQ0090010form2/ODR_UNIT_PRICE=0@*2"
expj.KQ0090010.KQ0090010form2.ODR_UNIT_PRICE.child0 = function () {
  console.log('ODR_UNIT_PRICE script2');
expj.common.pscript.setReferenceComponentValue('KQ0090010', 'KQ0090010form2', '_KQ0090010form2/ODR_UNIT_PRICE', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script3="child;1;SET;_KQ0090010form2/ODR_AMOUNT=[{_KQ0090010form2/ODR_UNIT_PRICE}*{_KQ0090010form2/ODR_QTY}]"
expj.KQ0090010.KQ0090010form2.ODR_UNIT_PRICE.child1 = function () {
  console.log('ODR_UNIT_PRICE script3');
expj.common.pscript.setReferenceComponentValue('KQ0090010', 'KQ0090010form2', '_KQ0090010form2/ODR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form2', '_KQ0090010form2/ODR_UNIT_PRICE') + '*' + expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form2', '_KQ0090010form2/ODR_QTY')));
};
// script4="child;2;CHK;1[eq]1@!KQ00346"
expj.KQ0090010.KQ0090010form2.ODR_UNIT_PRICE.child2 = function () {
  console.log('ODR_UNIT_PRICE script4');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('KQ0090010', 'KQ0090010form2', 'KQ00346');
}
};
expj.KQ0090010.KQ0090010form2.ODR_UNIT_PRICE.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/ODR_UNIT_PRICE.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0090010.KQ0090010form2.ODR_UNIT_PRICE['onDecision' + i])) {
        expj.KQ0090010.KQ0090010form2.ODR_UNIT_PRICE['onDecision' + i]();
      }
    }
  }
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.ODR_UNIT_PRICE.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-ODR_UNIT_PRICE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'ODR_UNIT_PRICE', this);
  });
  expj.KQ0090010.KQ0090010form2.ODR_UNIT_PRICE.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.ODR_UNIT_PRICE.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/ODR_UNIT_PRICE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-ODR_UNIT_PRICE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0090010-KQ0090010form2-ODR_UNIT_PRICE" name="ODR_UNIT_PRICE" class="KQ0090010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getODR_UNIT_PRICE()) %>" maxlength="19" ></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-CUR_UNIT_PRICE">
expj.KQ0090010.KQ0090010form2.CUR_UNIT_PRICE = {};
expj.KQ0090010.KQ0090010form2.CUR_UNIT_PRICE.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/CUR_UNIT_PRICE.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.CUR_UNIT_PRICE.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-CUR_UNIT_PRICE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'CUR_UNIT_PRICE', this);
  });
  expj.KQ0090010.KQ0090010form2.CUR_UNIT_PRICE.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.CUR_UNIT_PRICE.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/CUR_UNIT_PRICE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-CUR_UNIT_PRICE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KQ0090010-KQ0090010form2-CUR_UNIT_PRICE" name="CUR_UNIT_PRICE" class="KQ0090010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getCUR_UNIT_PRICE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:115px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_QTY_4",rb)%></span><!-- 受注数量 --></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-ODR_QTY">
expj.KQ0090010.KQ0090010form2.ODR_QTY = {};
// script1="onDecision;0;CHK;99999999999999.9999[lt][{_KQ0090010form2/ODR_UNIT_PRICE}*{_KQ0090010form2/ODR_QTY}]@*0,*1"
expj.KQ0090010.KQ0090010form2.ODR_QTY.onDecision0 = function () {
  console.log('ODR_QTY script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber('99999999999999.9999'), '[lt]', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form2', '_KQ0090010form2/ODR_UNIT_PRICE') + '*' + expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form2', '_KQ0090010form2/ODR_QTY')))) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;SET;_KQ0090010form2/ODR_QTY=0@*2"
expj.KQ0090010.KQ0090010form2.ODR_QTY.child0 = function () {
  console.log('ODR_QTY script2');
expj.common.pscript.setReferenceComponentValue('KQ0090010', 'KQ0090010form2', '_KQ0090010form2/ODR_QTY', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script3="child;1;SET;_KQ0090010form2/ODR_AMOUNT=[{_KQ0090010form2/ODR_UNIT_PRICE}*{_KQ0090010form2/ODR_QTY}]"
expj.KQ0090010.KQ0090010form2.ODR_QTY.child1 = function () {
  console.log('ODR_QTY script3');
expj.common.pscript.setReferenceComponentValue('KQ0090010', 'KQ0090010form2', '_KQ0090010form2/ODR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form2', '_KQ0090010form2/ODR_UNIT_PRICE') + '*' + expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form2', '_KQ0090010form2/ODR_QTY')));
};
// script4="child;2;CHK;1[eq]1@!KQ00346"
expj.KQ0090010.KQ0090010form2.ODR_QTY.child2 = function () {
  console.log('ODR_QTY script4');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('KQ0090010', 'KQ0090010form2', 'KQ00346');
}
};
expj.KQ0090010.KQ0090010form2.ODR_QTY.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/ODR_QTY.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0090010.KQ0090010form2.ODR_QTY['onDecision' + i])) {
        expj.KQ0090010.KQ0090010form2.ODR_QTY['onDecision' + i]();
      }
    }
  }
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.ODR_QTY.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'ODR_QTY', this);
  });
  expj.KQ0090010.KQ0090010form2.ODR_QTY.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0090010-KQ0090010form2-ODR_QTY" name="ODR_QTY" class="KQ0090010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getODR_QTY()) %>" maxlength="19" ></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-STOCK_UNIT">
expj.KQ0090010.KQ0090010form2.STOCK_UNIT = {};
expj.KQ0090010.KQ0090010form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/STOCK_UNIT.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'STOCK_UNIT', this);
  });
  expj.KQ0090010.KQ0090010form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KQ0090010-KQ0090010form2-STOCK_UNIT" name="STOCK_UNIT" class="KQ0090010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:115px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_AMOUNT",rb)%></span><!-- 受注金額 --></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-ODR_AMOUNT">
expj.KQ0090010.KQ0090010form2.ODR_AMOUNT = {};
expj.KQ0090010.KQ0090010form2.ODR_AMOUNT.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/ODR_AMOUNT.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.ODR_AMOUNT.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-ODR_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'ODR_AMOUNT', this);
  });
  expj.KQ0090010.KQ0090010form2.ODR_AMOUNT.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.ODR_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/ODR_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-ODR_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0090010-KQ0090010form2-ODR_AMOUNT" name="ODR_AMOUNT" class="KQ0090010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getODR_AMOUNT()) %>" maxlength="19" ></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-CUR_UNIT_AMOUNT">
expj.KQ0090010.KQ0090010form2.CUR_UNIT_AMOUNT = {};
expj.KQ0090010.KQ0090010form2.CUR_UNIT_AMOUNT.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/CUR_UNIT_AMOUNT.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.CUR_UNIT_AMOUNT.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-CUR_UNIT_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'CUR_UNIT_AMOUNT', this);
  });
  expj.KQ0090010.KQ0090010form2.CUR_UNIT_AMOUNT.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.CUR_UNIT_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/CUR_UNIT_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-CUR_UNIT_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KQ0090010-KQ0090010form2-CUR_UNIT_AMOUNT" name="CUR_UNIT_AMOUNT" class="KQ0090010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getCUR_UNIT_AMOUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:115px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.TAX_CD_1",rb)%></span><!-- 消費税コード --></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-TAX_CD">
expj.KQ0090010.KQ0090010form2.TAX_CD = {};
expj.KQ0090010.KQ0090010form2.TAX_CD.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/TAX_CD.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.TAX_CD.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-TAX_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'TAX_CD', this);
  });
  expj.KQ0090010.KQ0090010form2.TAX_CD.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.TAX_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/TAX_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-TAX_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KQ0090010-KQ0090010form2-TAX_CD" name="TAX_CD" class="KQ0090010-focus-move  required-value expj-KQ0090010-required-C" style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getTAX_CD()) %>" maxlength="3" ></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-TAX_CD_PEEKER">
expj.KQ0090010.KQ0090010form2.TAX_CD_PEEKER = {};
// script1="onClick;0;PEEKER;_KQ0090010form2/TAX_CD@<%=contextNo%>"
expj.KQ0090010.KQ0090010form2.TAX_CD_PEEKER.onClick0 = function () {
  console.log('TAX_CD_PEEKER script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KQ0090010';
var parameterValues = 'TAX_CD_PEEKER%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010form2', '_KQ0090010form2/TAX_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%TAX_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KQ0090010form2/TAX_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KQ0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KQ0090010.KQ0090010form2.TAX_CD_PEEKER.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0090010.KQ0090010form2.TAX_CD_PEEKER['onClick' + i])) {
        expj.KQ0090010.KQ0090010form2.TAX_CD_PEEKER['onClick' + i]();
      }
    }
  }
};
expj.KQ0090010.KQ0090010form2.TAX_CD_PEEKER.executeAllOnDecision = function () {
};
expj.KQ0090010.KQ0090010form2.TAX_CD_PEEKER.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-TAX_CD_PEEKER').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0090010', 'KQ0090010form2', 'TAX_CD_PEEKER', this, 'Button');
    }
  });
  expj.KQ0090010.KQ0090010form2.TAX_CD_PEEKER.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.TAX_CD_PEEKER.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/TAX_CD_PEEKER.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-TAX_CD_PEEKER');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><button type="button" id="expj-KQ0090010-KQ0090010form2-TAX_CD_PEEKER" class="KQ0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:115px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SHIP_REMARK",rb)%></span><!-- 備考 --></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-REMARKS">
expj.KQ0090010.KQ0090010form2.REMARKS = {};
expj.KQ0090010.KQ0090010form2.REMARKS.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/REMARKS.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.REMARKS.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-REMARKS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'REMARKS', this);
  });
  expj.KQ0090010.KQ0090010form2.REMARKS.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.REMARKS.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/REMARKS.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-REMARKS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:419px;text-align:left;"><input type="text" id="expj-KQ0090010-KQ0090010form2-REMARKS" name="REMARKS" class="KQ0090010-focus-move  " style="width:714px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getREMARKS()) %>" maxlength="100" ></div><!--/td-->
<input type="hidden" id="expj-KQ0090010-KQ0090010form2-l_OWN_ORG_CD" name="l_OWN_ORG_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getl_OWN_ORG_CD()) %>">
<script class="expj-script-KQ0090010-KQ0090010form2-l_OWN_ORG_CD">
expj.KQ0090010.KQ0090010form2.l_OWN_ORG_CD = {};
expj.KQ0090010.KQ0090010form2.l_OWN_ORG_CD.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/l_OWN_ORG_CD.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.l_OWN_ORG_CD.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-l_OWN_ORG_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'l_OWN_ORG_CD', this);
  });
  expj.KQ0090010.KQ0090010form2.l_OWN_ORG_CD.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.l_OWN_ORG_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/l_OWN_ORG_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-l_OWN_ORG_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-KQ0090010-KQ0090010form2-l_OWN_PERSON_CD" name="l_OWN_PERSON_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getl_OWN_PERSON_CD()) %>">
<script class="expj-script-KQ0090010-KQ0090010form2-l_OWN_PERSON_CD">
expj.KQ0090010.KQ0090010form2.l_OWN_PERSON_CD = {};
expj.KQ0090010.KQ0090010form2.l_OWN_PERSON_CD.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/l_OWN_PERSON_CD.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.l_OWN_PERSON_CD.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-l_OWN_PERSON_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'l_OWN_PERSON_CD', this);
  });
  expj.KQ0090010.KQ0090010form2.l_OWN_PERSON_CD.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.l_OWN_PERSON_CD.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/l_OWN_PERSON_CD.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-l_OWN_PERSON_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3165",rb)%></span><!-- 承認備考 --></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010form2-APPROVED_COMMENT">
expj.KQ0090010.KQ0090010form2.APPROVED_COMMENT = {};
expj.KQ0090010.KQ0090010form2.APPROVED_COMMENT.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/APPROVED_COMMENT.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.APPROVED_COMMENT.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-APPROVED_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'APPROVED_COMMENT', this);
  });
  expj.KQ0090010.KQ0090010form2.APPROVED_COMMENT.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.APPROVED_COMMENT.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/APPROVED_COMMENT.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-APPROVED_COMMENT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:419px;text-align:left;"><input type="text" id="expj-KQ0090010-KQ0090010form2-APPROVED_COMMENT" name="APPROVED_COMMENT" class="KQ0090010-focus-move  " style="width:714px;" data-kind="" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getAPPROVED_COMMENT()) %>" maxlength="80" ></div><!--/td-->
<input type="hidden" id="expj-KQ0090010-KQ0090010form2-h_ODR_TYP" name="h_ODR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.geth_ODR_TYP()) %>">
<script class="expj-script-KQ0090010-KQ0090010form2-h_ODR_TYP">
expj.KQ0090010.KQ0090010form2.h_ODR_TYP = {};
expj.KQ0090010.KQ0090010form2.h_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/h_ODR_TYP.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.h_ODR_TYP.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-h_ODR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'h_ODR_TYP', this);
  });
  expj.KQ0090010.KQ0090010form2.h_ODR_TYP.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.h_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/h_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-h_ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-KQ0090010-KQ0090010form2-DEPO_TYP" name="DEPO_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getDEPO_TYP()) %>">
<script class="expj-script-KQ0090010-KQ0090010form2-DEPO_TYP">
expj.KQ0090010.KQ0090010form2.DEPO_TYP = {};
expj.KQ0090010.KQ0090010form2.DEPO_TYP.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/DEPO_TYP.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.DEPO_TYP.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-DEPO_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'DEPO_TYP', this);
  });
  expj.KQ0090010.KQ0090010form2.DEPO_TYP.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.DEPO_TYP.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/DEPO_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-DEPO_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-KQ0090010-KQ0090010form2-l_h_ESTIMATE_TYPE" name="l_h_ESTIMATE_TYPE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getl_h_ESTIMATE_TYPE()) %>">
<script class="expj-script-KQ0090010-KQ0090010form2-l_h_ESTIMATE_TYPE">
expj.KQ0090010.KQ0090010form2.l_h_ESTIMATE_TYPE = {};
expj.KQ0090010.KQ0090010form2.l_h_ESTIMATE_TYPE.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/l_h_ESTIMATE_TYPE.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.l_h_ESTIMATE_TYPE.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-l_h_ESTIMATE_TYPE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'l_h_ESTIMATE_TYPE', this);
  });
  expj.KQ0090010.KQ0090010form2.l_h_ESTIMATE_TYPE.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.l_h_ESTIMATE_TYPE.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/l_h_ESTIMATE_TYPE.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-l_h_ESTIMATE_TYPE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-KQ0090010-KQ0090010form2-SPCL_PRICE_TYP" name="SPCL_PRICE_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKQ0090010Struct.getSPCL_PRICE_TYP()) %>">
<script class="expj-script-KQ0090010-KQ0090010form2-SPCL_PRICE_TYP">
expj.KQ0090010.KQ0090010form2.SPCL_PRICE_TYP = {};
expj.KQ0090010.KQ0090010form2.SPCL_PRICE_TYP.executeAllOnDecision = function () {
  console.log('execute KQ0090010form2/SPCL_PRICE_TYP.onDecision');
  expj.KQ0090010.KQ0090010form2.executeAllOnDecision();
  expj.KQ0090010.executeAllOnDecision();
};
expj.KQ0090010.KQ0090010form2.SPCL_PRICE_TYP.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010form2-SPCL_PRICE_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KQ0090010', 'KQ0090010form2', 'SPCL_PRICE_TYP', this);
  });
  expj.KQ0090010.KQ0090010form2.SPCL_PRICE_TYP.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010form2.SPCL_PRICE_TYP.executePScriptOnLoad = function () {
  console.log('execute KQ0090010form2/SPCL_PRICE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010form2-SPCL_PRICE_TYP');
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
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 399px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-KQ0090010-KQ0090010button2">
expj.KQ0090010.KQ0090010button2 = {};
expj.KQ0090010.KQ0090010button2.executeAllOnDecision = function () {
  console.log('execute KQ0090010button2.onDecision');
};
expj.KQ0090010.KQ0090010button2.executeOnLoad = function () {
  expj.KQ0090010.KQ0090010button2.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010button2.executePScriptOnLoad = function () {
  console.log('execute KQ0090010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KQ0090010-KQ0090010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KQ0090010-KQ0090010button2-Insert">
expj.KQ0090010.KQ0090010button2.Insert = {};
// script1="onClick;0;CHK;_KQ0090010form2/ODR_ACPT_DATE[gt]_KQ0090010form2/h_BUSINESS_OPR_DATE@!KQ00317"
expj.KQ0090010.KQ0090010button2.Insert.onClick0 = function () {
  console.log('Insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010button2', '_KQ0090010form2/ODR_ACPT_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010button2', '_KQ0090010form2/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.viewErrorMessage('KQ0090010', 'KQ0090010button2', 'KQ00317');
}
};
// script2="onClick;1;CHK;_KQ0090010form2/ODR_AMOUNT[numeq]0@!KQ00344"
expj.KQ0090010.KQ0090010button2.Insert.onClick1 = function () {
  console.log('Insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010button2', '_KQ0090010form2/ODR_AMOUNT')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('KQ0090010', 'KQ0090010button2', 'KQ00344');
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0090010form1/*,_KQ0090010form2/*@KQ0090010Servlet,,$ZZ07001"
expj.KQ0090010.KQ0090010button2.Insert.onClick2 = function () {
  console.log('Insert script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0090010', 'KQ0090010button2', '_KQ0090010form1/*,_KQ0090010form2/*', 'KQ0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0090010', response);
expj.common.updateBusinessScreenTab('KQ0090010', contents);
};
expj.common.pscript.callConfirm('KQ0090010', 'KQ0090010button2', 'ZZ07001', okEvent);
};
expj.KQ0090010.KQ0090010button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0090010.KQ0090010button2.Insert['onClick' + i])) {
        expj.KQ0090010.KQ0090010button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.KQ0090010.KQ0090010button2.Insert.executeAllOnDecision = function () {
};
expj.KQ0090010.KQ0090010button2.Insert.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0090010', 'KQ0090010button2', 'Insert', this, 'Button');
    }
  });
  expj.KQ0090010.KQ0090010button2.Insert.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010button2.Insert.executePScriptOnLoad = function () {
  console.log('execute KQ0090010button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0090010-KQ0090010button2-Insert" name="Insert" class="KQ0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010button2-Update">
expj.KQ0090010.KQ0090010button2.Update = {};
// script1="onClick;0;CHK;_KQ0090010form2/ODR_ACPT_DATE[gt]_KQ0090010form2/h_BUSINESS_OPR_DATE@!KQ00317"
expj.KQ0090010.KQ0090010button2.Update.onClick0 = function () {
  console.log('Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010button2', '_KQ0090010form2/ODR_ACPT_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010button2', '_KQ0090010form2/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.viewErrorMessage('KQ0090010', 'KQ0090010button2', 'KQ00317');
}
};
// script2="onClick;1;CHK;_KQ0090010form2/ODR_AMOUNT[numeq]0@!KQ00344"
expj.KQ0090010.KQ0090010button2.Update.onClick1 = function () {
  console.log('Update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KQ0090010', 'KQ0090010button2', '_KQ0090010form2/ODR_AMOUNT')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('KQ0090010', 'KQ0090010button2', 'KQ00344');
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0090010form1/*,_KQ0090010form2/*@KQ0090010Servlet,,$ZZ07003"
expj.KQ0090010.KQ0090010button2.Update.onClick2 = function () {
  console.log('Update script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0090010', 'KQ0090010button2', '_KQ0090010form1/*,_KQ0090010form2/*', 'KQ0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0090010', response);
expj.common.updateBusinessScreenTab('KQ0090010', contents);
};
expj.common.pscript.callConfirm('KQ0090010', 'KQ0090010button2', 'ZZ07003', okEvent);
};
expj.KQ0090010.KQ0090010button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0090010.KQ0090010button2.Update['onClick' + i])) {
        expj.KQ0090010.KQ0090010button2.Update['onClick' + i]();
      }
    }
  }
};
expj.KQ0090010.KQ0090010button2.Update.executeAllOnDecision = function () {
};
expj.KQ0090010.KQ0090010button2.Update.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0090010', 'KQ0090010button2', 'Update', this, 'Button');
    }
  });
  expj.KQ0090010.KQ0090010button2.Update.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010button2.Update.executePScriptOnLoad = function () {
  console.log('execute KQ0090010button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0090010-KQ0090010button2-Update" name="Update" class="KQ0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010button2-Delete">
expj.KQ0090010.KQ0090010button2.Delete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KQ0090010form1/*,_KQ0090010form2/*@KQ0090010Servlet,,$ZZ07004"
expj.KQ0090010.KQ0090010button2.Delete.onClick0 = function () {
  console.log('Delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0090010', 'KQ0090010button2', '_KQ0090010form1/*,_KQ0090010form2/*', 'KQ0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0090010', response);
expj.common.updateBusinessScreenTab('KQ0090010', contents);
};
expj.common.pscript.callConfirm('KQ0090010', 'KQ0090010button2', 'ZZ07004', okEvent);
};
expj.KQ0090010.KQ0090010button2.Delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0090010.KQ0090010button2.Delete['onClick' + i])) {
        expj.KQ0090010.KQ0090010button2.Delete['onClick' + i]();
      }
    }
  }
};
expj.KQ0090010.KQ0090010button2.Delete.executeAllOnDecision = function () {
};
expj.KQ0090010.KQ0090010button2.Delete.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010button2-Delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0090010', 'KQ0090010button2', 'Delete', this, 'Button');
    }
  });
  expj.KQ0090010.KQ0090010button2.Delete.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010button2.Delete.executePScriptOnLoad = function () {
  console.log('execute KQ0090010button2/Delete.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010button2-Delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0090010-KQ0090010button2-Delete" name="Delete" class="KQ0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
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
<span class="version">KQ0090010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KQ0090010-KQ0090010button0">
expj.KQ0090010.KQ0090010button0 = {};
expj.KQ0090010.KQ0090010button0.executeAllOnDecision = function () {
  console.log('execute KQ0090010button0.onDecision');
};
expj.KQ0090010.KQ0090010button0.executeOnLoad = function () {
  expj.KQ0090010.KQ0090010button0.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010button0.executePScriptOnLoad = function () {
  console.log('execute KQ0090010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KQ0090010-KQ0090010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KQ0090010-KQ0090010button0-Clear">
expj.KQ0090010.KQ0090010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KQ0090010Servlet,,$ZZ07008"
expj.KQ0090010.KQ0090010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KQ0090010', 'KQ0090010button0', '', 'KQ0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KQ0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KQ0090010', response);
expj.common.updateBusinessScreenTab('KQ0090010', contents);
};
expj.common.pscript.callConfirm('KQ0090010', 'KQ0090010button0', 'ZZ07008', okEvent);
};
expj.KQ0090010.KQ0090010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0090010.KQ0090010button0.Clear['onClick' + i])) {
        expj.KQ0090010.KQ0090010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KQ0090010.KQ0090010button0.Clear.executeAllOnDecision = function () {
};
expj.KQ0090010.KQ0090010button0.Clear.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0090010', 'KQ0090010button0', 'Clear', this, 'Button');
    }
  });
  expj.KQ0090010.KQ0090010button0.Clear.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KQ0090010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0090010-KQ0090010button0-Clear" name="Clear" class="KQ0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KQ0090010-KQ0090010button0-Close">
expj.KQ0090010.KQ0090010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KQ0090010.KQ0090010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KQ0090010');
};
expj.KQ0090010.KQ0090010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KQ0090010.KQ0090010button0.Close['onClick' + i])) {
        expj.KQ0090010.KQ0090010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KQ0090010.KQ0090010button0.Close.executeAllOnDecision = function () {
};
expj.KQ0090010.KQ0090010button0.Close.executeOnLoad = function () {
  $('#expj-KQ0090010-KQ0090010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KQ0090010', 'KQ0090010button0', 'Close', this, 'Button');
    }
  });
  expj.KQ0090010.KQ0090010button0.Close.executePScriptOnLoad();
};

expj.KQ0090010.KQ0090010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KQ0090010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KQ0090010-KQ0090010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KQ0090010-KQ0090010button0-Close" name="Close" class="KQ0090010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KQ0090010 (END)-->
<%
MessageStruct msgStruct = aKQ0090010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KQ0090010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KQ0090010)) {
  expj.common.treeInstanceMap.KQ0090010 = {};
}
expj.common.treeInstanceMap.KQ0090010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KQ0090010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KQ0090010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KQ0090010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KQ0090010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KQ0090010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KQ0090010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KQ0090010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KQ0090010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KQ0090010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KQ0090010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0090010)) {
  expj.common.detailDialogMap.KQ0090010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0090010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KQ0090010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0090010.<%=detailId %>)) {
  expj.common.detailDialogMap.KQ0090010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0090010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KQ0090010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KQ0090010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KQ0090010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KQ0090010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KQ0090010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KQ0090010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KQ0090010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KQ0090010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KQ0090010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KQ0090010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KQ0090010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KQ0090010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KQ0090010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KQ0090010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KQ0090010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KQ0090010)) {
  expj.common.viewInstanceMap.KQ0090010 = {};
}
expj.common.viewInstanceMap.KQ0090010.<%=viewId %> = {};
expj.common.viewInstanceMap.KQ0090010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KQ0090010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KQ0090010.<%=viewId %>.init = function () {
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
    expj.KQ0090010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KQ0090010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KQ0090010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KQ0090010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KQ0090010_init">
/**
 * KQ0090010用のロード完了時初期化関数
 */
expj.KQ0090010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KQ0090010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KQ0090010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KQ0090010');
  expj.common.calendarInstanceMap.KQ0090010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KQ0090010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KQ0090010.<%=detailId %>.init();
  expj.common.detailDialogMap.KQ0090010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KQ0090010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KQ0090010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KQ0090010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KQ0090010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KQ0090010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KQ0090010-<%=detailId %>');
<%
 }
%>
  try{expj.KQ0090010.KQ0090010form1.ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form1.ODR_NO_PEEKER.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form1.h_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form1.h_SYS_COMPANY_CODE.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form1.h_APR_ODR.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010button1.Select.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.ORGN_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.ORGN_ODR_NO_PEEKER.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.chkADD_ODR_FLG.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.GetDefault.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.ODR_ACPT_DATE.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.ODR_ACPT_DATE_CALENDAR.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.CUST_ODR_NO.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.CUST_CD_PEEKER.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.CUST_ANAME.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.CUST_CHRG_PSN_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.CUST_CHRG_PSN_CD_PEEKER.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.USER_NAME.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.ITEM_CD_PEEKER.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.DESINATED_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.DESINATED_DLV_DATE_CALENDAR.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.h_BUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.ODR_UNIT_PRICE.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.CUR_UNIT_PRICE.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.ODR_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.CUR_UNIT_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.TAX_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.TAX_CD_PEEKER.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.REMARKS.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.l_OWN_ORG_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.l_OWN_PERSON_CD.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.APPROVED_COMMENT.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.h_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.DEPO_TYP.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.l_h_ESTIMATE_TYPE.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.SPCL_PRICE_TYP.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010button2.Insert.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010button2.Update.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010button2.Delete.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form1.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010button1.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010form2.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010button2.executeOnLoad();}catch(e){};
  try{expj.KQ0090010.KQ0090010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KQ0090010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KQ0090010', 'KQ0090010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KQ0090010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KQ0090010-focus-move');
  // 初期フォーカス当てる処理
  $('.KQ0090010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KQ0090010', '<%=request.getContextPath() %>');
};

/**
 * KQ0090010の全体onDecision処理
 */
expj.KQ0090010.executeAllOnDecision = function () {
  expj.KQ0090010.KQ0090010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KQ0090010_console">
expj.KQ0090010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>