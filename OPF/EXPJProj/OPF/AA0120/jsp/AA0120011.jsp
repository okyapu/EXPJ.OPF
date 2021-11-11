<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:23:38 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0120\AA0120011.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0120.*" %>
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
<jsp:useBean id="aAA0120010Control" class="com.nec.jp.orteus.metamorBase.AA0120.AA0120010Control" scope="request"/>
<jsp:useBean id="aAA0120010Struct" class="com.nec.jp.orteus.metamorBase.AA0120.AA0120010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

為替レート情報メンテナンスサブ１
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0120/jsp/AA0120011.jsp,v $
$Author: geng-jia $	
$Revision: 1.8 $ $Date: 2017/02/22 02:04:01 $
********************************************************* --%>
<html>
<head>
<title>為替レート情報メンテナンスサブ１</title>
<%@include file="common/expj_v5.jsp" %>
<%
String callButton = aAA0120010Control.getButton();
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
<script class="expj-script-AA0120010_init">
  // AA0120010名前空間
  expj.AA0120010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AA0120010" data-screen="AA0120011" data-newdata="<%=aAA0120010Control.isNewData() %>">
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
              <script class="expj-script-AA0120010-AA0120011form1">
expj.AA0120010.AA0120011form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5"
expj.AA0120010.AA0120011form1.onLoad0 = function () {
  console.log('AA0120011form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
};
// script2="onDecision;0;CHKRQ;B@*0,*4"
expj.AA0120010.AA0120011form1.onDecision0 = function () {
  console.log('AA0120011form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AA0120010', 'B')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script3="child;0;CHK;<%=callButton%>[eq]LineUpdate[or]<%=callButton%>[eq]Update[or]?AA0120011form1/*[eq]ERROR@*4,*1"
expj.AA0120010.AA0120011form1.child0 = function () {
  console.log('AA0120011form1 script3');
if (expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'LineUpdate') || expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'Update') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0120010', 'AA0120011form1', '?AA0120011form1/*'), '[eq]', 'ERROR')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="child;1;CHK;_AA0120011form2/EXCH_TYP[eq]2@*2,*3"
expj.AA0120010.AA0120011form1.child1 = function () {
  console.log('AA0120011form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0120010', 'AA0120011form1', '_AA0120011form2/EXCH_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="child;2;CHKRQ;A@*3,*4"
expj.AA0120010.AA0120011form1.child2 = function () {
  console.log('AA0120011form1 script5');
if (expj.common.pscript.satisfiedRequiredComponent('AA0120010', 'A')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;3;UNMASK;_AA0120011button2/Insert"
expj.AA0120010.AA0120011form1.child3 = function () {
  console.log('AA0120011form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AA0120010', 'AA0120011form1', '_AA0120011button2/Insert');
};
// script7="child;4;MASK;_AA0120011button2/Insert"
expj.AA0120010.AA0120011form1.child4 = function () {
  console.log('AA0120011form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AA0120010', 'AA0120011form1', '_AA0120011button2/Insert');
};
// script8="onDecision;1;CHK;<%=callButton%>[eq]LineInsert[or]<%=callButton%>[eq]LineCopy[or]<%=callButton%>[eq]Insert[or]?AA0120011form1/*[eq]ERROR@*6,*5"
expj.AA0120010.AA0120011form1.onDecision1 = function () {
  console.log('AA0120011form1 script8');
if (expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'LineInsert') || expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'LineCopy') || expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'Insert') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0120010', 'AA0120011form1', '?AA0120011form1/*'), '[eq]', 'ERROR')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script9="child;5;UNMASK;_AA0120011button2/Update"
expj.AA0120010.AA0120011form1.child5 = function () {
  console.log('AA0120011form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('AA0120010', 'AA0120011form1', '_AA0120011button2/Update');
};
// script10="child;6;MASK;_AA0120011button2/Update"
expj.AA0120010.AA0120011form1.child6 = function () {
  console.log('AA0120011form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AA0120010', 'AA0120011form1', '_AA0120011button2/Update');
};
// script11="onDecision;2;CHK;<%=callButton%>[eq]LineInsert[or]<%=callButton%>[eq]LineCopy[or]<%=callButton%>[eq]Insert[or]?AA0120011form1/*[eq]ERROR@*7,*8"
expj.AA0120010.AA0120011form1.onDecision2 = function () {
  console.log('AA0120011form1 script11');
if (expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'LineInsert') || expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'LineCopy') || expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'Insert') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0120010', 'AA0120011form1', '?AA0120011form1/*'), '[eq]', 'ERROR')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script12="child;7;UNMASK;_AA0120011form2/EXCH_TYP,_AA0120011form2/EXCH_START_DATE,_AA0120011form2/CalendarExchStartDate"
expj.AA0120010.AA0120011form1.child7 = function () {
  console.log('AA0120011form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('AA0120010', 'AA0120011form1', '_AA0120011form2/EXCH_TYP');
expj.common.pscript.setUnMaskToReferenceComponent('AA0120010', 'AA0120011form1', '_AA0120011form2/EXCH_START_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('AA0120010', 'AA0120011form1', '_AA0120011form2/CalendarExchStartDate');
};
// script13="child;8;MASK;_AA0120011form2/EXCH_TYP,_AA0120011form2/EXCH_START_DATE,_AA0120011form2/CalendarExchStartDate"
expj.AA0120010.AA0120011form1.child8 = function () {
  console.log('AA0120011form1 script13');
expj.common.pscript.setMaskToReferenceComponent('AA0120010', 'AA0120011form1', '_AA0120011form2/EXCH_TYP');
expj.common.pscript.setMaskToReferenceComponent('AA0120010', 'AA0120011form1', '_AA0120011form2/EXCH_START_DATE');
expj.common.pscript.setMaskToReferenceComponent('AA0120010', 'AA0120011form1', '_AA0120011form2/CalendarExchStartDate');
};
// script14="onDecision;3;CHK;<%=callButton%>[eq]LineUpdate[or]<%=callButton%>[eq]Update@*11,*9"
expj.AA0120010.AA0120011form1.onDecision3 = function () {
  console.log('AA0120011form1 script14');
if (expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'LineUpdate') || expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'Update')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script15="child;9;CHK;_AA0120011form2/EXCH_TYP[eq]2@*10,*11"
expj.AA0120010.AA0120011form1.child9 = function () {
  console.log('AA0120011form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0120010', 'AA0120011form1', '_AA0120011form2/EXCH_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script16="child;10;UNMASK;_AA0120011form2/EXCH_RESERVE_CD"
expj.AA0120010.AA0120011form1.child10 = function () {
  console.log('AA0120011form1 script16');
expj.common.pscript.setUnMaskToReferenceComponent('AA0120010', 'AA0120011form1', '_AA0120011form2/EXCH_RESERVE_CD');
};
// script17="child;11;MASK;_AA0120011form2/EXCH_RESERVE_CD"
expj.AA0120010.AA0120011form1.child11 = function () {
  console.log('AA0120011form1 script17');
expj.common.pscript.setMaskToReferenceComponent('AA0120010', 'AA0120011form1', '_AA0120011form2/EXCH_RESERVE_CD');
};
// script18="onDecision;4;CHK;_AA0120011form2/h_APR_EXCH_RATE[eq]0@*12,*13"
expj.AA0120010.AA0120011form1.onDecision4 = function () {
  console.log('AA0120011form1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0120010', 'AA0120011form1', '_AA0120011form2/h_APR_EXCH_RATE'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script19="child;12;MASK;_AA0120011form2/APPR_REMARKS"
expj.AA0120010.AA0120011form1.child12 = function () {
  console.log('AA0120011form1 script19');
expj.common.pscript.setMaskToReferenceComponent('AA0120010', 'AA0120011form1', '_AA0120011form2/APPR_REMARKS');
};
// script20="child;13;UNMASK;_AA0120011form2/APPR_REMARKS"
expj.AA0120010.AA0120011form1.child13 = function () {
  console.log('AA0120011form1 script20');
expj.common.pscript.setUnMaskToReferenceComponent('AA0120010', 'AA0120011form1', '_AA0120011form2/APPR_REMARKS');
};
// script21="onDecision;5;CHK;_AA0120011form1/h_APPR_ID[neq]@*14"
expj.AA0120010.AA0120011form1.onDecision5 = function () {
  console.log('AA0120011form1 script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0120010', 'AA0120011form1', '_AA0120011form1/h_APPR_ID'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script22="child;14;MASK;_AA0120011button2/Insert,_AA0120011button2/Update"
expj.AA0120010.AA0120011form1.child14 = function () {
  console.log('AA0120011form1 script22');
expj.common.pscript.setMaskToReferenceComponent('AA0120010', 'AA0120011form1', '_AA0120011button2/Insert');
expj.common.pscript.setMaskToReferenceComponent('AA0120010', 'AA0120011form1', '_AA0120011button2/Update');
};
expj.AA0120010.AA0120011form1.executeAllOnDecision = function () {
  console.log('execute AA0120011form1.onDecision');
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0120010.AA0120011form1['onDecision' + i])) {
        expj.AA0120010.AA0120011form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0120010.AA0120011form1.executeOnLoad = function () {
  expj.AA0120010.AA0120011form1.executePScriptOnLoad();
};

expj.AA0120010.AA0120011form1.executePScriptOnLoad = function () {
  console.log('execute AA0120011form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0120010.AA0120011form1['onLoad' + i])) {
      expj.AA0120010.AA0120011form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0120010-AA0120011form1" action="AA0120010Servlet" name="AA0120011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAA0120010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CUR_CD",rb)%></span><!-- 通貨コード --></div><!--/td-->
<script class="expj-script-AA0120010-AA0120011form1-CUR_CD">
expj.AA0120010.AA0120011form1.CUR_CD = {};
expj.AA0120010.AA0120011form1.CUR_CD.executeAllOnDecision = function () {
  console.log('execute AA0120011form1/CUR_CD.onDecision');
  expj.AA0120010.AA0120011form1.executeAllOnDecision();
  expj.AA0120010.executeAllOnDecision();
};
expj.AA0120010.AA0120011form1.CUR_CD.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120011form1-CUR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0120010', 'AA0120011form1', 'CUR_CD', this);
  });
  expj.AA0120010.AA0120011form1.CUR_CD.executePScriptOnLoad();
};

expj.AA0120010.AA0120011form1.CUR_CD.executePScriptOnLoad = function () {
  console.log('execute AA0120011form1/CUR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120011form1-CUR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0120010-AA0120011form1-CUR_CD" name="CUR_CD" class="AA0120010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0120010Struct.getCUR_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AA0120010-AA0120011form1-CUR_NAME">
expj.AA0120010.AA0120011form1.CUR_NAME = {};
expj.AA0120010.AA0120011form1.CUR_NAME.executeAllOnDecision = function () {
  console.log('execute AA0120011form1/CUR_NAME.onDecision');
  expj.AA0120010.AA0120011form1.executeAllOnDecision();
  expj.AA0120010.executeAllOnDecision();
};
expj.AA0120010.AA0120011form1.CUR_NAME.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120011form1-CUR_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0120010', 'AA0120011form1', 'CUR_NAME', this);
  });
  expj.AA0120010.AA0120011form1.CUR_NAME.executePScriptOnLoad();
};

expj.AA0120010.AA0120011form1.CUR_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0120011form1/CUR_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120011form1-CUR_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0120010-AA0120011form1-CUR_NAME" name="CUR_NAME" class="AA0120010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0120010Struct.getCUR_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AA0120010-AA0120011form1-h_APPR_ID" name="h_APPR_ID" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0120010Struct.geth_APPR_ID()) %>">
<script class="expj-script-AA0120010-AA0120011form1-h_APPR_ID">
expj.AA0120010.AA0120011form1.h_APPR_ID = {};
expj.AA0120010.AA0120011form1.h_APPR_ID.executeAllOnDecision = function () {
  console.log('execute AA0120011form1/h_APPR_ID.onDecision');
  expj.AA0120010.AA0120011form1.executeAllOnDecision();
  expj.AA0120010.executeAllOnDecision();
};
expj.AA0120010.AA0120011form1.h_APPR_ID.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120011form1-h_APPR_ID').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0120010', 'AA0120011form1', 'h_APPR_ID', this);
  });
  expj.AA0120010.AA0120011form1.h_APPR_ID.executePScriptOnLoad();
};

expj.AA0120010.AA0120011form1.h_APPR_ID.executePScriptOnLoad = function () {
  console.log('execute AA0120011form1/h_APPR_ID.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120011form1-h_APPR_ID');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0120010-AA0120011form1-MODIFY_COUNT" name="MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0120010Struct.getMODIFY_COUNT()) %>">
<script class="expj-script-AA0120010-AA0120011form1-MODIFY_COUNT">
expj.AA0120010.AA0120011form1.MODIFY_COUNT = {};
expj.AA0120010.AA0120011form1.MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AA0120011form1/MODIFY_COUNT.onDecision');
  expj.AA0120010.AA0120011form1.executeAllOnDecision();
  expj.AA0120010.executeAllOnDecision();
};
expj.AA0120010.AA0120011form1.MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120011form1-MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0120010', 'AA0120011form1', 'MODIFY_COUNT', this);
  });
  expj.AA0120010.AA0120011form1.MODIFY_COUNT.executePScriptOnLoad();
};

expj.AA0120010.AA0120011form1.MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AA0120011form1/MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120011form1-MODIFY_COUNT');
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
<div class="datagrid-button-field" style="width: 100%; height:px;">
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AA0120010-AA0120011form2">
expj.AA0120010.AA0120011form2 = {};
expj.AA0120010.AA0120011form2.executeAllOnDecision = function () {
  console.log('execute AA0120011form2.onDecision');
};
expj.AA0120010.AA0120011form2.executeOnLoad = function () {
  expj.AA0120010.AA0120011form2.executePScriptOnLoad();
};

expj.AA0120010.AA0120011form2.executePScriptOnLoad = function () {
  console.log('execute AA0120011form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0120010-AA0120011form2" action="AA0120010Servlet" name="AA0120011form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAA0120010Control.getReadStatus()) %>" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.EXCH_TYP",rb)%></span><!-- 為替種別 --></div><!--/td-->
<script class="expj-script-AA0120010-AA0120011form2-EXCH_TYP">
expj.AA0120010.AA0120011form2.EXCH_TYP = {};
expj.AA0120010.AA0120011form2.EXCH_TYP.executeAllOnDecision = function () {
  console.log('execute AA0120011form2/EXCH_TYP.onDecision');
  expj.AA0120010.AA0120011form2.executeAllOnDecision();
  expj.AA0120010.executeAllOnDecision();
};
expj.AA0120010.AA0120011form2.EXCH_TYP.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120011form2-EXCH_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0120010', 'AA0120011form2', 'EXCH_TYP', this);
  });
  expj.AA0120010.AA0120011form2.EXCH_TYP.executePScriptOnLoad();
};

expj.AA0120010.AA0120011form2.EXCH_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0120011form2/EXCH_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120011form2-EXCH_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0120010-AA0120011form2-EXCH_TYP" name='EXCH_TYP' class='AA0120010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0120010Control.getStruct().getList_EXCH_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0120010Control.getStruct().getList_EXCH_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0120010Control.getStruct().getList_EXCH_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0120010Struct.getEXCH_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<input type="hidden" id="expj-AA0120010-AA0120011form2-h_SCREENMOVE_TYP" name="h_SCREENMOVE_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0120010Struct.geth_SCREENMOVE_TYP()) %>">
<script class="expj-script-AA0120010-AA0120011form2-h_SCREENMOVE_TYP">
expj.AA0120010.AA0120011form2.h_SCREENMOVE_TYP = {};
expj.AA0120010.AA0120011form2.h_SCREENMOVE_TYP.executeAllOnDecision = function () {
  console.log('execute AA0120011form2/h_SCREENMOVE_TYP.onDecision');
  expj.AA0120010.AA0120011form2.executeAllOnDecision();
  expj.AA0120010.executeAllOnDecision();
};
expj.AA0120010.AA0120011form2.h_SCREENMOVE_TYP.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120011form2-h_SCREENMOVE_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0120010', 'AA0120011form2', 'h_SCREENMOVE_TYP', this);
  });
  expj.AA0120010.AA0120011form2.h_SCREENMOVE_TYP.executePScriptOnLoad();
};

expj.AA0120010.AA0120011form2.h_SCREENMOVE_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0120011form2/h_SCREENMOVE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120011form2-h_SCREENMOVE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.EXCH_RESERVE_CD",rb)%></span><!-- 為替予約コード --></div><!--/td-->
<script class="expj-script-AA0120010-AA0120011form2-EXCH_RESERVE_CD">
expj.AA0120010.AA0120011form2.EXCH_RESERVE_CD = {};
expj.AA0120010.AA0120011form2.EXCH_RESERVE_CD.executeAllOnDecision = function () {
  console.log('execute AA0120011form2/EXCH_RESERVE_CD.onDecision');
  expj.AA0120010.AA0120011form2.executeAllOnDecision();
  expj.AA0120010.executeAllOnDecision();
};
expj.AA0120010.AA0120011form2.EXCH_RESERVE_CD.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120011form2-EXCH_RESERVE_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0120010', 'AA0120011form2', 'EXCH_RESERVE_CD', this);
  });
  expj.AA0120010.AA0120011form2.EXCH_RESERVE_CD.executePScriptOnLoad();
};

expj.AA0120010.AA0120011form2.EXCH_RESERVE_CD.executePScriptOnLoad = function () {
  console.log('execute AA0120011form2/EXCH_RESERVE_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120011form2-EXCH_RESERVE_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0120010-AA0120011form2-EXCH_RESERVE_CD" name="EXCH_RESERVE_CD" class="AA0120010-focus-move  required-value expj-AA0120010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0120010Struct.getEXCH_RESERVE_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<input type="hidden" id="expj-AA0120010-AA0120011form2-h_APR_EXCH_RATE" name="h_APR_EXCH_RATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0120010Struct.geth_APR_EXCH_RATE()) %>">
<script class="expj-script-AA0120010-AA0120011form2-h_APR_EXCH_RATE">
expj.AA0120010.AA0120011form2.h_APR_EXCH_RATE = {};
expj.AA0120010.AA0120011form2.h_APR_EXCH_RATE.executeAllOnDecision = function () {
  console.log('execute AA0120011form2/h_APR_EXCH_RATE.onDecision');
  expj.AA0120010.AA0120011form2.executeAllOnDecision();
  expj.AA0120010.executeAllOnDecision();
};
expj.AA0120010.AA0120011form2.h_APR_EXCH_RATE.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120011form2-h_APR_EXCH_RATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0120010', 'AA0120011form2', 'h_APR_EXCH_RATE', this);
  });
  expj.AA0120010.AA0120011form2.h_APR_EXCH_RATE.executePScriptOnLoad();
};

expj.AA0120010.AA0120011form2.h_APR_EXCH_RATE.executePScriptOnLoad = function () {
  console.log('execute AA0120011form2/h_APR_EXCH_RATE.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120011form2-h_APR_EXCH_RATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.EXCH_START_DATE",rb)%></span><!-- 為替開始日付 --></div><!--/td-->
<script class="expj-script-AA0120010-AA0120011form2-EXCH_START_DATE">
expj.AA0120010.AA0120011form2.EXCH_START_DATE = {};
expj.AA0120010.AA0120011form2.EXCH_START_DATE.executeAllOnDecision = function () {
  console.log('execute AA0120011form2/EXCH_START_DATE.onDecision');
  expj.AA0120010.AA0120011form2.executeAllOnDecision();
  expj.AA0120010.executeAllOnDecision();
};
expj.AA0120010.AA0120011form2.EXCH_START_DATE.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120011form2-EXCH_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0120010', 'AA0120011form2', 'EXCH_START_DATE', this);
  });
  expj.AA0120010.AA0120011form2.EXCH_START_DATE.executePScriptOnLoad();
};

expj.AA0120010.AA0120011form2.EXCH_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AA0120011form2/EXCH_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120011form2-EXCH_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0120010-AA0120011form2-EXCH_START_DATE" name="EXCH_START_DATE" class="AA0120010-focus-move  required-value expj-AA0120010-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAA0120010Struct.getEXCH_START_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AA0120010-AA0120011form2-CalendarExchStartDate">
expj.AA0120010.AA0120011form2.CalendarExchStartDate = {};
// script1="onClick;0;CALENDAR;_AA0120011form2/EXCH_START_DATE"
expj.AA0120010.AA0120011form2.CalendarExchStartDate.onClick0 = function () {
  console.log('CalendarExchStartDate script1');
expj.common.pscript.executeCalendar('AA0120010','AA0120011form2','_AA0120011form2/EXCH_START_DATE');
};
expj.AA0120010.AA0120011form2.CalendarExchStartDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0120010.AA0120011form2.CalendarExchStartDate['onClick' + i])) {
        expj.AA0120010.AA0120011form2.CalendarExchStartDate['onClick' + i]();
      }
    }
  }
};
expj.AA0120010.AA0120011form2.CalendarExchStartDate.executeAllOnDecision = function () {
};
expj.AA0120010.AA0120011form2.CalendarExchStartDate.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120011form2-CalendarExchStartDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0120010', 'AA0120011form2', 'CalendarExchStartDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AA0120010','AA0120011form2','_AA0120011form2/EXCH_START_DATE');
  expj.AA0120010.AA0120011form2.CalendarExchStartDate.executePScriptOnLoad();
};

expj.AA0120010.AA0120011form2.CalendarExchStartDate.executePScriptOnLoad = function () {
  console.log('execute AA0120011form2/CalendarExchStartDate.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120011form2-CalendarExchStartDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0120010-AA0120011form2-CalendarExchStartDate" class="AA0120010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.EXCH_RATE",rb)%></span><!-- 為替レート --></div><!--/td-->
<script class="expj-script-AA0120010-AA0120011form2-EXCH_RATE">
expj.AA0120010.AA0120011form2.EXCH_RATE = {};
expj.AA0120010.AA0120011form2.EXCH_RATE.executeAllOnDecision = function () {
  console.log('execute AA0120011form2/EXCH_RATE.onDecision');
  expj.AA0120010.AA0120011form2.executeAllOnDecision();
  expj.AA0120010.executeAllOnDecision();
};
expj.AA0120010.AA0120011form2.EXCH_RATE.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120011form2-EXCH_RATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0120010', 'AA0120011form2', 'EXCH_RATE', this);
  });
  expj.AA0120010.AA0120011form2.EXCH_RATE.executePScriptOnLoad();
};

expj.AA0120010.AA0120011form2.EXCH_RATE.executePScriptOnLoad = function () {
  console.log('execute AA0120011form2/EXCH_RATE.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120011form2-EXCH_RATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0120010-AA0120011form2-EXCH_RATE" name="EXCH_RATE" class="AA0120010-focus-move expj-align-right required-value expj-AA0120010-required-B" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.2;FLOOR;6" value="<%= TypeConverter.sanitizer(aAA0120010Struct.getEXCH_RATE()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3165",rb)%></span><!-- 承認備考 --></div><!--/td-->
<script class="expj-script-AA0120010-AA0120011form2-APPR_REMARKS">
expj.AA0120010.AA0120011form2.APPR_REMARKS = {};
expj.AA0120010.AA0120011form2.APPR_REMARKS.executeAllOnDecision = function () {
  console.log('execute AA0120011form2/APPR_REMARKS.onDecision');
  expj.AA0120010.AA0120011form2.executeAllOnDecision();
  expj.AA0120010.executeAllOnDecision();
};
expj.AA0120010.AA0120011form2.APPR_REMARKS.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120011form2-APPR_REMARKS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0120010', 'AA0120011form2', 'APPR_REMARKS', this);
  });
  expj.AA0120010.AA0120011form2.APPR_REMARKS.executePScriptOnLoad();
};

expj.AA0120010.AA0120011form2.APPR_REMARKS.executePScriptOnLoad = function () {
  console.log('execute AA0120011form2/APPR_REMARKS.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120011form2-APPR_REMARKS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AA0120010-AA0120011form2-APPR_REMARKS" name="APPR_REMARKS" class="AA0120010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0120010Struct.getAPPR_REMARKS()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AA0120010-AA0120011button2">
expj.AA0120010.AA0120011button2 = {};
expj.AA0120010.AA0120011button2.executeAllOnDecision = function () {
  console.log('execute AA0120011button2.onDecision');
};
expj.AA0120010.AA0120011button2.executeOnLoad = function () {
  expj.AA0120010.AA0120011button2.executePScriptOnLoad();
};

expj.AA0120010.AA0120011button2.executePScriptOnLoad = function () {
  console.log('execute AA0120011button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0120010-AA0120011button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0120010-AA0120011button2-Insert">
expj.AA0120010.AA0120011button2.Insert = {};
// script1="onClick;0;CHK;_AA0120011form2/EXCH_RATE[gt]0@*0,!AA10016"
expj.AA0120010.AA0120011button2.Insert.onClick0 = function () {
  console.log('Insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0120010', 'AA0120011button2', '_AA0120011form2/EXCH_RATE')), '[gt]', expj.common.pscript.convertNumber('0'))) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
expj.common.pscript.viewErrorMessage('AA0120010', 'AA0120011button2', 'AA10016');
}
};
// script2="child;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0120011form1/*,_AA0120011form2/*@AA0120010Servlet,,$ZZ07001"
expj.AA0120010.AA0120011button2.Insert.child0 = function () {
  console.log('Insert script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0120010', 'AA0120011button2', '_AA0120011form1/*,_AA0120011form2/*', 'AA0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0120010', response);
expj.common.changeBusinessScreenTab('AA0120010', contents);
};
expj.common.pscript.callConfirm('AA0120010', 'AA0120011button2', 'ZZ07001', okEvent);
};
expj.AA0120010.AA0120011button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0120010.AA0120011button2.Insert['onClick' + i])) {
        expj.AA0120010.AA0120011button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.AA0120010.AA0120011button2.Insert.executeAllOnDecision = function () {
};
expj.AA0120010.AA0120011button2.Insert.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120011button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0120010', 'AA0120011button2', 'Insert', this, 'Button');
    }
  });
  expj.AA0120010.AA0120011button2.Insert.executePScriptOnLoad();
};

expj.AA0120010.AA0120011button2.Insert.executePScriptOnLoad = function () {
  console.log('execute AA0120011button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120011button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0120010-AA0120011button2-Insert" name="Insert" class="AA0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AA0120010-AA0120011button2-Update">
expj.AA0120010.AA0120011button2.Update = {};
// script1="onClick;0;CHK;_AA0120011form2/EXCH_RATE[gt]0@*0,!AA10016"
expj.AA0120010.AA0120011button2.Update.onClick0 = function () {
  console.log('Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0120010', 'AA0120011button2', '_AA0120011form2/EXCH_RATE')), '[gt]', expj.common.pscript.convertNumber('0'))) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
expj.common.pscript.viewErrorMessage('AA0120010', 'AA0120011button2', 'AA10016');
}
};
// script2="child;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0120011form1/*,_AA0120011form2/*@AA0120010Servlet,,$ZZ07003"
expj.AA0120010.AA0120011button2.Update.child0 = function () {
  console.log('Update script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0120010', 'AA0120011button2', '_AA0120011form1/*,_AA0120011form2/*', 'AA0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0120010', response);
expj.common.changeBusinessScreenTab('AA0120010', contents);
};
expj.common.pscript.callConfirm('AA0120010', 'AA0120011button2', 'ZZ07003', okEvent);
};
expj.AA0120010.AA0120011button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0120010.AA0120011button2.Update['onClick' + i])) {
        expj.AA0120010.AA0120011button2.Update['onClick' + i]();
      }
    }
  }
};
expj.AA0120010.AA0120011button2.Update.executeAllOnDecision = function () {
};
expj.AA0120010.AA0120011button2.Update.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120011button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0120010', 'AA0120011button2', 'Update', this, 'Button');
    }
  });
  expj.AA0120010.AA0120011button2.Update.executePScriptOnLoad();
};

expj.AA0120010.AA0120011button2.Update.executePScriptOnLoad = function () {
  console.log('execute AA0120011button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120011button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0120010-AA0120011button2-Update" name="Update" class="AA0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<span class="version">AA0120011 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AA0120010-AA0120011button0">
expj.AA0120010.AA0120011button0 = {};
expj.AA0120010.AA0120011button0.executeAllOnDecision = function () {
  console.log('execute AA0120011button0.onDecision');
};
expj.AA0120010.AA0120011button0.executeOnLoad = function () {
  expj.AA0120010.AA0120011button0.executePScriptOnLoad();
};

expj.AA0120010.AA0120011button0.executePScriptOnLoad = function () {
  console.log('execute AA0120011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0120010-AA0120011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0120010-AA0120011button0-Return">
expj.AA0120010.AA0120011button0.Return = {};
// script1="onClick;0;CHK;_AA0120011form2/h_SCREENMOVE_TYP[eq]@*0,*1"
expj.AA0120010.AA0120011button0.Return.onClick0 = function () {
  console.log('Return script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0120010', 'AA0120011button0', '_AA0120011form2/h_SCREENMOVE_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0120011form1/*@AA0120010Servlet,,$ZZ07013"
expj.AA0120010.AA0120011button0.Return.child0 = function () {
  console.log('Return script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0120010', 'AA0120011button0', '_AA0120011form1/*', 'AA0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0120010', response);
expj.common.changeBusinessScreenTab('AA0120010', contents);
};
expj.common.pscript.callConfirm('AA0120010', 'AA0120011button0', 'ZZ07013', okEvent);
};
// script3="child;1;CLOSE"
expj.AA0120010.AA0120011button0.Return.child1 = function () {
  console.log('Return script3');
expj.common.executeBusinessScreenCloseDialog('AA0120010');
};
expj.AA0120010.AA0120011button0.Return.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0120010.AA0120011button0.Return['onClick' + i])) {
        expj.AA0120010.AA0120011button0.Return['onClick' + i]();
      }
    }
  }
};
expj.AA0120010.AA0120011button0.Return.executeAllOnDecision = function () {
};
expj.AA0120010.AA0120011button0.Return.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120011button0-Return').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0120010', 'AA0120011button0', 'Return', this, 'Button');
    }
  });
  expj.AA0120010.AA0120011button0.Return.executePScriptOnLoad();
};

expj.AA0120010.AA0120011button0.Return.executePScriptOnLoad = function () {
  console.log('execute AA0120011button0/Return.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120011button0-Return');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0120010-AA0120011button0-Return" name="Return" class="AA0120010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0120010 (END)-->
<%
MessageStruct msgStruct = aAA0120010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0120010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0120010)) {
  expj.common.treeInstanceMap.AA0120010 = {};
}
expj.common.treeInstanceMap.AA0120010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0120010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0120010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0120010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0120010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0120010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0120010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0120010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0120010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0120010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0120010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0120010)) {
  expj.common.detailDialogMap.AA0120010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0120010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0120010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0120010.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0120010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0120010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0120010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0120010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0120010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0120010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0120010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0120010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0120010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0120010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0120010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0120010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0120010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0120010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0120010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0120010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0120010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0120010)) {
  expj.common.viewInstanceMap.AA0120010 = {};
}
expj.common.viewInstanceMap.AA0120010.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0120010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0120010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0120010.<%=viewId %>.init = function () {
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
    expj.AA0120010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0120010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0120010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0120010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0120010_init">
/**
 * AA0120010用のロード完了時初期化関数
 */
expj.AA0120010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0120010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0120010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0120010');
  expj.common.calendarInstanceMap.AA0120010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0120010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0120010.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0120010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0120010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0120010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0120010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0120010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0120010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0120010-<%=detailId %>');
<%
 }
%>
  try{expj.AA0120010.AA0120011form1.CUR_CD.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120011form1.CUR_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120011form1.h_APPR_ID.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120011form1.MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120011form2.EXCH_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120011form2.h_SCREENMOVE_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120011form2.EXCH_RESERVE_CD.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120011form2.h_APR_EXCH_RATE.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120011form2.EXCH_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120011form2.CalendarExchStartDate.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120011form2.EXCH_RATE.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120011form2.APPR_REMARKS.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120011button2.Insert.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120011button2.Update.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120011button0.Return.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120011form1.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120011form2.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120011button2.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120011button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0120010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0120010', 'AA0120010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0120010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0120010-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0120010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0120010', '<%=request.getContextPath() %>');
};

/**
 * AA0120010の全体onDecision処理
 */
expj.AA0120010.executeAllOnDecision = function () {
  expj.AA0120010.AA0120011form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0120010_console">
expj.AA0120010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>