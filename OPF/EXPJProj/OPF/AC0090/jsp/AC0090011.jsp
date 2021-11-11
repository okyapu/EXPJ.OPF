<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:28:21 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AC0090\AC0090011.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AC0090.*" %>
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
<jsp:useBean id="aAC0090010Control" class="com.nec.jp.orteus.metamorBase.AC0090.AC0090010Control" scope="request"/>
<jsp:useBean id="aAC0090010Struct" class="com.nec.jp.orteus.metamorBase.AC0090.AC0090010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

外部デマンド紐付けサブ1
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0090/jsp/AC0090011.jsp,v $
$Author: geng-jia $	
$Revision: 1.11 $ $Date: 2017/02/22 02:04:29 $
********************************************************* --%>
<html>
<head>
<title>外部デマンド紐付けサブ1</title>
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
<script class="expj-script-AC0090010_init">
  // AC0090010名前空間
  expj.AC0090010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AC0090010" data-screen="AC0090011" data-newdata="<%=aAC0090010Control.isNewData() %>">
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
              <script class="expj-script-AC0090010-AC0090011form1">
expj.AC0090010.AC0090011form1 = {};
// script1="onLoad;0;CALL;child@0,4"
expj.AC0090010.AC0090011form1.onLoad0 = function () {
  console.log('AC0090011form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child4)){this.child4();}
};
// script2="onLoad;1;CALL;onDecision@0,2,3"
expj.AC0090010.AC0090011form1.onLoad1 = function () {
  console.log('AC0090011form1 script2');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script3="child;0;CHK;?AC0090011form1/*[neq]NORMAL@*1"
expj.AC0090010.AC0090011form1.child0 = function () {
  console.log('AC0090011form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011form1', '?AC0090011form1/*'), '[neq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="child;1;MASK;_AC0090011button2/update_sub1"
expj.AC0090010.AC0090011form1.child1 = function () {
  console.log('AC0090011form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AC0090010', 'AC0090011form1', '_AC0090011button2/update_sub1');
};
// script5="onDecision;0;CHKRQ;A@*2,*3"
expj.AC0090010.AC0090011form1.onDecision0 = function () {
  console.log('AC0090011form1 script5');
if (expj.common.pscript.satisfiedRequiredComponent('AC0090010', 'A')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;2;UNMASK;_AC0090011button1/select_sub1"
expj.AC0090010.AC0090011form1.child2 = function () {
  console.log('AC0090011form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AC0090010', 'AC0090011form1', '_AC0090011button1/select_sub1');
};
// script7="child;3;MASK;_AC0090011button1/select_sub1"
expj.AC0090010.AC0090011form1.child3 = function () {
  console.log('AC0090011form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AC0090010', 'AC0090011form1', '_AC0090011button1/select_sub1');
};
// script8="onDecision;1;CHK;1[eq]1@*4"
expj.AC0090010.AC0090011form1.onDecision1 = function () {
  console.log('AC0090011form1 script8');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script9="child;4;CHKRQ;?AC0090011view1/?[eq]SINGLE@*5"
expj.AC0090010.AC0090011form1.child4 = function () {
  console.log('AC0090011form1 script9');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011form1', '?AC0090011view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script10="child;5;CHK;?AC0090011form1/*[eq]NORMAL@*6,*9"
expj.AC0090010.AC0090011form1.child5 = function () {
  console.log('AC0090011form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011form1', '?AC0090011form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script11="child;6;CHK;?AC0090011form1/w_subDATE_FROM[eq]SAME@*7,*9"
expj.AC0090010.AC0090011form1.child6 = function () {
  console.log('AC0090011form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011form1', '?AC0090011form1/w_subDATE_FROM'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script12="child;7;CHK;?AC0090011form1/w_subDATE_TO[eq]SAME@*8,*9"
expj.AC0090010.AC0090011form1.child7 = function () {
  console.log('AC0090011form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011form1', '?AC0090011form1/w_subDATE_TO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script13="child;8;UNMASK;_AC0090011button2/update_sub1"
expj.AC0090010.AC0090011form1.child8 = function () {
  console.log('AC0090011form1 script13');
expj.common.pscript.setUnMaskToReferenceComponent('AC0090010', 'AC0090011form1', '_AC0090011button2/update_sub1');
};
// script14="child;9;MASK;_AC0090011button2/update_sub1"
expj.AC0090010.AC0090011form1.child9 = function () {
  console.log('AC0090011form1 script14');
expj.common.pscript.setMaskToReferenceComponent('AC0090010', 'AC0090011form1', '_AC0090011button2/update_sub1');
};
// script15="onDecision;2;CHKRQ;?AC0090011view1/?[neq]SINGLE@*10"
expj.AC0090010.AC0090011form1.onDecision2 = function () {
  console.log('AC0090011form1 script15');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011form1', '?AC0090011view1/?'), '[neq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script16="child;10;MASK;_AC0090011button2/update_sub1"
expj.AC0090010.AC0090011form1.child10 = function () {
  console.log('AC0090011form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AC0090010', 'AC0090011form1', '_AC0090011button2/update_sub1');
};
// script17="onDecision;3;CHK;_AC0090011form1/TIME_CTRL[eq]true@*11,*12"
expj.AC0090010.AC0090011form1.onDecision3 = function () {
  console.log('AC0090011form1 script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011form1', '_AC0090011form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script18="child;11;UNMASK;_AC0090011form1/w_subTIME_FROM,_AC0090011form1/w_subTIME_TO"
expj.AC0090010.AC0090011form1.child11 = function () {
  console.log('AC0090011form1 script18');
expj.common.pscript.setUnMaskToReferenceComponent('AC0090010', 'AC0090011form1', '_AC0090011form1/w_subTIME_FROM');
expj.common.pscript.setUnMaskToReferenceComponent('AC0090010', 'AC0090011form1', '_AC0090011form1/w_subTIME_TO');
};
// script19="child;12;MASK;_AC0090011form1/w_subTIME_FROM,_AC0090011form1/w_subTIME_TO"
expj.AC0090010.AC0090011form1.child12 = function () {
  console.log('AC0090011form1 script19');
expj.common.pscript.setMaskToReferenceComponent('AC0090010', 'AC0090011form1', '_AC0090011form1/w_subTIME_FROM');
expj.common.pscript.setMaskToReferenceComponent('AC0090010', 'AC0090011form1', '_AC0090011form1/w_subTIME_TO');
};
expj.AC0090010.AC0090011form1.executeAllOnDecision = function () {
  console.log('execute AC0090011form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0090010.AC0090011form1['onDecision' + i])) {
        expj.AC0090010.AC0090011form1['onDecision' + i]();
      }
    }
  }
};
expj.AC0090010.AC0090011form1.executeOnLoad = function () {
  expj.AC0090010.AC0090011form1.executePScriptOnLoad();
};

expj.AC0090010.AC0090011form1.executePScriptOnLoad = function () {
  console.log('execute AC0090011form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AC0090010.AC0090011form1['onLoad' + i])) {
      expj.AC0090010.AC0090011form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AC0090010-AC0090011form1" action="AC0090010Servlet" name="AC0090011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAC0090010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
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
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:66px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt0420",rb)%></span><!-- 生産計画期間 --></div><!--/td-->
<script class="expj-script-AC0090010-AC0090011form1-w_subDATE_FROM">
expj.AC0090010.AC0090011form1.w_subDATE_FROM = {};
expj.AC0090010.AC0090011form1.w_subDATE_FROM.executeAllOnDecision = function () {
  console.log('execute AC0090011form1/w_subDATE_FROM.onDecision');
  expj.AC0090010.AC0090011form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090011form1.w_subDATE_FROM.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090011form1-w_subDATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090011form1', 'w_subDATE_FROM', this);
  });
  expj.AC0090010.AC0090011form1.w_subDATE_FROM.executePScriptOnLoad();
};

expj.AC0090010.AC0090011form1.w_subDATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AC0090011form1/w_subDATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090011form1-w_subDATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0090010-AC0090011form1-w_subDATE_FROM" name="w_subDATE_FROM" class="AC0090010-focus-move  required-value expj-AC0090010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_subDATE_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AC0090010-AC0090011form1-Calendarw_subDATE_FROM">
expj.AC0090010.AC0090011form1.Calendarw_subDATE_FROM = {};
// script1="onClick;0;CALENDAR;_AC0090011form1/w_subDATE_FROM"
expj.AC0090010.AC0090011form1.Calendarw_subDATE_FROM.onClick0 = function () {
  console.log('Calendarw_subDATE_FROM script1');
expj.common.pscript.executeCalendar('AC0090010','AC0090011form1','_AC0090011form1/w_subDATE_FROM');
};
expj.AC0090010.AC0090011form1.Calendarw_subDATE_FROM.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0090010.AC0090011form1.Calendarw_subDATE_FROM['onClick' + i])) {
        expj.AC0090010.AC0090011form1.Calendarw_subDATE_FROM['onClick' + i]();
      }
    }
  }
};
expj.AC0090010.AC0090011form1.Calendarw_subDATE_FROM.executeAllOnDecision = function () {
};
expj.AC0090010.AC0090011form1.Calendarw_subDATE_FROM.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090011form1-Calendarw_subDATE_FROM').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0090010', 'AC0090011form1', 'Calendarw_subDATE_FROM', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0090010','AC0090011form1','_AC0090011form1/w_subDATE_FROM');
  expj.AC0090010.AC0090011form1.Calendarw_subDATE_FROM.executePScriptOnLoad();
};

expj.AC0090010.AC0090011form1.Calendarw_subDATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AC0090011form1/Calendarw_subDATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090011form1-Calendarw_subDATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0090010-AC0090011form1-Calendarw_subDATE_FROM" class="AC0090010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AC0090010-AC0090011form1-w_subTIME_FROM">
expj.AC0090010.AC0090011form1.w_subTIME_FROM = {};
expj.AC0090010.AC0090011form1.w_subTIME_FROM.executeAllOnDecision = function () {
  console.log('execute AC0090011form1/w_subTIME_FROM.onDecision');
  expj.AC0090010.AC0090011form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090011form1.w_subTIME_FROM.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090011form1-w_subTIME_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090011form1', 'w_subTIME_FROM', this);
  });
  expj.AC0090010.AC0090011form1.w_subTIME_FROM.executePScriptOnLoad();
};

expj.AC0090010.AC0090011form1.w_subTIME_FROM.executePScriptOnLoad = function () {
  console.log('execute AC0090011form1/w_subTIME_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090011form1-w_subTIME_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AC0090010-AC0090011form1-w_subTIME_FROM" name="w_subTIME_FROM" class="AC0090010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_subTIME_FROM()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"><span>～</span></div><!--/td-->
<script class="expj-script-AC0090010-AC0090011form1-w_subDATE_TO">
expj.AC0090010.AC0090011form1.w_subDATE_TO = {};
expj.AC0090010.AC0090011form1.w_subDATE_TO.executeAllOnDecision = function () {
  console.log('execute AC0090011form1/w_subDATE_TO.onDecision');
  expj.AC0090010.AC0090011form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090011form1.w_subDATE_TO.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090011form1-w_subDATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090011form1', 'w_subDATE_TO', this);
  });
  expj.AC0090010.AC0090011form1.w_subDATE_TO.executePScriptOnLoad();
};

expj.AC0090010.AC0090011form1.w_subDATE_TO.executePScriptOnLoad = function () {
  console.log('execute AC0090011form1/w_subDATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090011form1-w_subDATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0090010-AC0090011form1-w_subDATE_TO" name="w_subDATE_TO" class="AC0090010-focus-move  required-value expj-AC0090010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_subDATE_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AC0090010-AC0090011form1-Calendarw_subDATE_TO">
expj.AC0090010.AC0090011form1.Calendarw_subDATE_TO = {};
// script1="onClick;0;CALENDAR;_AC0090011form1/w_subDATE_TO"
expj.AC0090010.AC0090011form1.Calendarw_subDATE_TO.onClick0 = function () {
  console.log('Calendarw_subDATE_TO script1');
expj.common.pscript.executeCalendar('AC0090010','AC0090011form1','_AC0090011form1/w_subDATE_TO');
};
expj.AC0090010.AC0090011form1.Calendarw_subDATE_TO.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0090010.AC0090011form1.Calendarw_subDATE_TO['onClick' + i])) {
        expj.AC0090010.AC0090011form1.Calendarw_subDATE_TO['onClick' + i]();
      }
    }
  }
};
expj.AC0090010.AC0090011form1.Calendarw_subDATE_TO.executeAllOnDecision = function () {
};
expj.AC0090010.AC0090011form1.Calendarw_subDATE_TO.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090011form1-Calendarw_subDATE_TO').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0090010', 'AC0090011form1', 'Calendarw_subDATE_TO', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0090010','AC0090011form1','_AC0090011form1/w_subDATE_TO');
  expj.AC0090010.AC0090011form1.Calendarw_subDATE_TO.executePScriptOnLoad();
};

expj.AC0090010.AC0090011form1.Calendarw_subDATE_TO.executePScriptOnLoad = function () {
  console.log('execute AC0090011form1/Calendarw_subDATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090011form1-Calendarw_subDATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-AC0090010-AC0090011form1-Calendarw_subDATE_TO" class="AC0090010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AC0090010-AC0090011form1-w_subTIME_TO">
expj.AC0090010.AC0090011form1.w_subTIME_TO = {};
expj.AC0090010.AC0090011form1.w_subTIME_TO.executeAllOnDecision = function () {
  console.log('execute AC0090011form1/w_subTIME_TO.onDecision');
  expj.AC0090010.AC0090011form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090011form1.w_subTIME_TO.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090011form1-w_subTIME_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090011form1', 'w_subTIME_TO', this);
  });
  expj.AC0090010.AC0090011form1.w_subTIME_TO.executePScriptOnLoad();
};

expj.AC0090010.AC0090011form1.w_subTIME_TO.executePScriptOnLoad = function () {
  console.log('execute AC0090011form1/w_subTIME_TO.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090011form1-w_subTIME_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td over-inner" style="width:150px;text-align:;"><input type="text" id="expj-AC0090010-AC0090011form1-w_subTIME_TO" name="w_subTIME_TO" class="AC0090010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_subTIME_TO()) %>" maxlength="4" ></div><input type="hidden" id="expj-AC0090010-AC0090011form1-OD_NO" name="OD_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getOD_NO()) %>">
<script class="expj-script-AC0090010-AC0090011form1-OD_NO">
expj.AC0090010.AC0090011form1.OD_NO = {};
expj.AC0090010.AC0090011form1.OD_NO.executeAllOnDecision = function () {
  console.log('execute AC0090011form1/OD_NO.onDecision');
  expj.AC0090010.AC0090011form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090011form1.OD_NO.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090011form1-OD_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090011form1', 'OD_NO', this);
  });
  expj.AC0090010.AC0090011form1.OD_NO.executePScriptOnLoad();
};

expj.AC0090010.AC0090011form1.OD_NO.executePScriptOnLoad = function () {
  console.log('execute AC0090011form1/OD_NO.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090011form1-OD_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0090010-AC0090011form1-MODIFY_COUNT" name="MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getMODIFY_COUNT()) %>">
<script class="expj-script-AC0090010-AC0090011form1-MODIFY_COUNT">
expj.AC0090010.AC0090011form1.MODIFY_COUNT = {};
expj.AC0090010.AC0090011form1.MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AC0090011form1/MODIFY_COUNT.onDecision');
  expj.AC0090010.AC0090011form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090011form1.MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090011form1-MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090011form1', 'MODIFY_COUNT', this);
  });
  expj.AC0090010.AC0090011form1.MODIFY_COUNT.executePScriptOnLoad();
};

expj.AC0090010.AC0090011form1.MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AC0090011form1/MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090011form1-MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0090010-AC0090011form1-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getTIME_CTRL()) %>">
<script class="expj-script-AC0090010-AC0090011form1-TIME_CTRL">
expj.AC0090010.AC0090011form1.TIME_CTRL = {};
expj.AC0090010.AC0090011form1.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AC0090011form1/TIME_CTRL.onDecision');
  expj.AC0090010.AC0090011form1.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090011form1.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090011form1-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090011form1', 'TIME_CTRL', this);
  });
  expj.AC0090010.AC0090011form1.TIME_CTRL.executePScriptOnLoad();
};

expj.AC0090010.AC0090011form1.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AC0090011form1/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090011form1-TIME_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:66px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AC0090010-AC0090011button1">
expj.AC0090010.AC0090011button1 = {};
expj.AC0090010.AC0090011button1.executeAllOnDecision = function () {
  console.log('execute AC0090011button1.onDecision');
};
expj.AC0090010.AC0090011button1.executeOnLoad = function () {
  expj.AC0090010.AC0090011button1.executePScriptOnLoad();
};

expj.AC0090010.AC0090011button1.executePScriptOnLoad = function () {
  console.log('execute AC0090011button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0090010-AC0090011button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0090010-AC0090011button1-select_sub1">
expj.AC0090010.AC0090011button1.select_sub1 = {};
// script1="onClick;0;CHK;_AC0090011form1/w_subDATE_FROM[gt]_AC0090011form1/w_subDATE_TO@#AC10007"
expj.AC0090010.AC0090011button1.select_sub1.onClick0 = function () {
  console.log('select_sub1 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subDATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subDATE_TO')))) {
expj.common.pscript.addErrorMessage('AC0090010', 'AC0090011button1', 'AC10007');
}
};
// script2="onClick;1;CHK;_AC0090011form1/w_subDATE_FROM[eq]_AC0090011form1/w_subDATE_TO[and]_AC0090011form1/w_subTIME_FROM[neq][and]_AC0090011form1/w_subTIME_TO[neq][and]_AC0090011form1/w_subTIME_FROM[gt]_AC0090011form1/w_subTIME_TO@#AC10007"
expj.AC0090010.AC0090011button1.select_sub1.onClick1 = function () {
  console.log('select_sub1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subDATE_FROM'), '[eq]', expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subDATE_TO')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_TO')))) {
expj.common.pscript.addErrorMessage('AC0090010', 'AC0090011button1', 'AC10007');
}
};
// script3="onClick;2;CHK;~LEN(_AC0090011form1/w_subTIME_FROM)[eq]1[or]~LEN(_AC0090011form1/w_subTIME_FROM)[eq]2@#AS00123"
expj.AC0090010.AC0090011button1.select_sub1.onClick2 = function () {
  console.log('select_sub1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_FROM'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_FROM'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AC0090010', 'AC0090011button1', 'AS00123');
}
};
// script4="onClick;3;CHK;~LEN(_AC0090011form1/w_subTIME_TO)[eq]1[or]~LEN(_AC0090011form1/w_subTIME_TO)[eq]2@#AS00120"
expj.AC0090010.AC0090011button1.select_sub1.onClick3 = function () {
  console.log('select_sub1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_TO'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_TO'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AC0090010', 'AC0090011button1', 'AS00120');
}
};
// script5="onClick;4;CHK;_AC0090011form1/TIME_CTRL[eq]true[and]~LEN(_AC0090011form1/w_subTIME_FROM)[eq]3@*0"
expj.AC0090010.AC0090011button1.select_sub1.onClick4 = function () {
  console.log('select_sub1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011button1', '_AC0090011form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_FROM'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script6="onClick;5;CHK;_AC0090011form1/TIME_CTRL[eq]true[and]~LEN(_AC0090011form1/w_subTIME_TO)[eq]3@*1"
expj.AC0090010.AC0090011button1.select_sub1.onClick5 = function () {
  console.log('select_sub1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011button1', '_AC0090011form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_TO'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script7="onClick;6;CHK;_AC0090011form1/TIME_CTRL[eq]true[and]~LEN(_AC0090011form1/w_subTIME_FROM)[eq]4@*2"
expj.AC0090010.AC0090011button1.select_sub1.onClick6 = function () {
  console.log('select_sub1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011button1', '_AC0090011form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_FROM'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script8="onClick;7;CHK;_AC0090011form1/TIME_CTRL[eq]true[and]~LEN(_AC0090011form1/w_subTIME_TO)[eq]4@*5"
expj.AC0090010.AC0090011button1.select_sub1.onClick7 = function () {
  console.log('select_sub1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011button1', '_AC0090011form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_TO'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script9="onClick;8;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0090011form1/*,_AC0090011form2/*@AC0090010Servlet"
expj.AC0090010.AC0090011button1.select_sub1.onClick8 = function () {
  console.log('select_sub1 script9');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0090010', 'AC0090011button1', '_AC0090011form1/*,_AC0090011form2/*', 'AC0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0090010', response);
expj.common.updateBusinessScreenTab('AC0090010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script10="child;0;CHK;[{~CHARAT(_AC0090011form1/w_subTIME_FROM:1)}*10+{~CHARAT(_AC0090011form1/w_subTIME_FROM:2)}][gte]60@#AS00121"
expj.AC0090010.AC0090011button1.select_sub1.child0 = function () {
  console.log('select_sub1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_FROM', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_FROM', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AC0090010', 'AC0090011button1', 'AS00121');
}
};
// script11="child;1;CHK;[{~CHARAT(_AC0090011form1/w_subTIME_TO:1)}*10+{~CHARAT(_AC0090011form1/w_subTIME_TO:2)}][gte]60@#AS00122"
expj.AC0090010.AC0090011button1.select_sub1.child1 = function () {
  console.log('select_sub1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_TO', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_TO', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AC0090010', 'AC0090011button1', 'AS00122');
}
};
// script12="child;2;CHK;[{~CHARAT(_AC0090011form1/w_subTIME_FROM:0)}*10+{~CHARAT(_AC0090011form1/w_subTIME_FROM:1)}][gte]24@#AS00121,*3"
expj.AC0090010.AC0090011button1.select_sub1.child2 = function () {
  console.log('select_sub1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_FROM', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_FROM', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24'))) {
expj.common.pscript.addErrorMessage('AC0090010', 'AC0090011button1', 'AS00121');
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script13="child;3;CHK;_AC0090011form1/TIME_CTRL[eq]true[and]~LEN(_AC0090011form1/w_subTIME_FROM)[eq]4@*4"
expj.AC0090010.AC0090011button1.select_sub1.child3 = function () {
  console.log('select_sub1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011button1', '_AC0090011form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_FROM'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script14="child;4;CHK;[{~CHARAT(_AC0090011form1/w_subTIME_FROM:2)}*10+{~CHARAT(_AC0090011form1/w_subTIME_FROM:3)}][gte]60@#AS00121"
expj.AC0090010.AC0090011button1.select_sub1.child4 = function () {
  console.log('select_sub1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_FROM', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_FROM', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AC0090010', 'AC0090011button1', 'AS00121');
}
};
// script15="child;5;CHK;[{~CHARAT(_AC0090011form1/w_subTIME_TO:0)}*10+{~CHARAT(_AC0090011form1/w_subTIME_TO:1)}][gte]24@#AS00122,*6"
expj.AC0090010.AC0090011button1.select_sub1.child5 = function () {
  console.log('select_sub1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_TO', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_TO', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24'))) {
expj.common.pscript.addErrorMessage('AC0090010', 'AC0090011button1', 'AS00122');
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script16="child;6;CHK;_AC0090011form1/TIME_CTRL[eq]true[and]~LEN(_AC0090011form1/w_subTIME_TO)[eq]4@*7"
expj.AC0090010.AC0090011button1.select_sub1.child6 = function () {
  console.log('select_sub1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011button1', '_AC0090011form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_TO'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script17="child;7;CHK;[{~CHARAT(_AC0090011form1/w_subTIME_TO:2)}*10+{~CHARAT(_AC0090011form1/w_subTIME_TO:3)}][gte]60@#AS00122"
expj.AC0090010.AC0090011button1.select_sub1.child7 = function () {
  console.log('select_sub1 script17');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_TO', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0090010', 'AC0090011button1', '_AC0090011form1/w_subTIME_TO', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AC0090010', 'AC0090011button1', 'AS00122');
}
};
expj.AC0090010.AC0090011button1.select_sub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 8; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0090010.AC0090011button1.select_sub1['onClick' + i])) {
        expj.AC0090010.AC0090011button1.select_sub1['onClick' + i]();
      }
    }
  }
};
expj.AC0090010.AC0090011button1.select_sub1.executeAllOnDecision = function () {
};
expj.AC0090010.AC0090011button1.select_sub1.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090011button1-select_sub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0090010', 'AC0090011button1', 'select_sub1', this, 'Button');
    }
  });
  expj.AC0090010.AC0090011button1.select_sub1.executePScriptOnLoad();
};

expj.AC0090010.AC0090011button1.select_sub1.executePScriptOnLoad = function () {
  console.log('execute AC0090011button1/select_sub1.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090011button1-select_sub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0090010-AC0090011button1-select_sub1" name="select_sub1" class="AC0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AC0090010-AC0090011view1">
expj.AC0090010.AC0090011view1 = {};
expj.AC0090010.AC0090011view1.executeAllOnClick = function () {
};
expj.AC0090010.AC0090011view1.executeAllOnDecision = function () {
  console.log('execute AC0090011view1.onDecision');
};
expj.AC0090010.AC0090011view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AC0090011view1", "expj.AC0090010.AC0090011view1.executeAllOnClick");
%>
  expj.AC0090010.AC0090011view1.executePScriptOnLoad();
};

expj.AC0090010.AC0090011view1.executePScriptOnLoad = function () {
  console.log('execute AC0090011view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AC0090010-AC0090011view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AC0090011view1_Id = "AC0090011view1";
 String AC0090011view1_select = "single";
 String AC0090011view1_sortable = "true";
 String AC0090011view1_resize = "true";
 String AC0090011view1_scroll = "true";
 StringBuffer AC0090011view1_HB = new StringBuffer();
 StringBuffer AC0090011view1_DB = new StringBuffer();
%>
<%
 AC0090011view1_select = "single";
 AC0090011view1_sortable = "true";
 AC0090011view1_resize = "true";
 AC0090011view1_scroll = "true";
%>
<%
 AC0090011view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AC0090011view1_sortable).append("}").append(",");
%>
     
<%
AC0090011view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'subMODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0090011view1_sortable).append("}").append(",");
AC0090011view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'subJOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0090011view1_sortable).append("}").append(",");
AC0090011view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PARENT_ITEM_CD",rb))).append("', 'name':'subITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0090011view1_sortable).append("}").append(",");
AC0090011view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0450",rb))).append("', 'name':'subITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0090011view1_sortable).append("}").append(",");
AC0090011view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_START_DATE",rb))).append("', 'name':'subODR_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0090011view1_sortable).append("}").append(",");
AC0090011view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_START_DATE",rb))).append("', 'name':'subPRD_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0090011view1_sortable).append("}").append(",");
AC0090011view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRD_DUE_DATE",rb))).append("', 'name':'subPRD_DUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0090011view1_sortable).append("}").append(",");
AC0090011view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_QTY",rb))).append("', 'name':'subODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AC0090011view1_sortable).append("}").append(",");
AC0090011view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0451",rb))).append("', 'name':'subSU_DM_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AC0090011view1_sortable).append("}").append(",");
AC0090011view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0330",rb))).append("', 'name':'subRE_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AC0090011view1_sortable).append("}").append(",");
AC0090011view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'CP_UNIT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0090011view1_sortable).append("}").append(",");
AC0090011view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_UNIT_NUMERATOR_2",rb))).append("', 'name':'subPS_UNIT_NUMERATOR', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AC0090011view1_sortable).append("}").append(",");
AC0090011view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_UNIT_DENOMINATOR_2",rb))).append("', 'name':'subPS_UNIT_DENOMINATOR', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AC0090011view1_sortable).append("}").append(",");
AC0090011view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'subOD_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0090011view1_sortable).append("}").append(",");
%>
<%
 int aAC0090010StructLength = aAC0090010Control.getListsize();
 final AC0090010Struct structBackup = aAC0090010Struct;
 aAC0090010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAC0090010StructLength; ++loopCount) {
  if((aAC0090010Struct = (AC0090010Struct) aAC0090010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAC0090010Struct", aAC0090010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AC0090011view1_DB.append("[");
 AC0090011view1_DB.append(loopCount);
 AC0090011view1_DB.append(",").append("'<span id=\"expj-AC0090010-AC0090011view1-subMODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AC0090010-AC0090011view1-subMODIFY_COUNT\" data-name=\"subMODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getsubMODIFY_COUNT())).append("</span>'");
 AC0090011view1_DB.append(",").append("'<span id=\"expj-AC0090010-AC0090011view1-subJOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AC0090010-AC0090011view1-subJOB_ODR_CD\" data-name=\"subJOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getsubJOB_ODR_CD())).append("</span>'");
 AC0090011view1_DB.append(",").append("'<span id=\"expj-AC0090010-AC0090011view1-subITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AC0090010-AC0090011view1-subITEM_CD\" data-name=\"subITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getsubITEM_CD())).append("</span>'");
 AC0090011view1_DB.append(",").append("'<span id=\"expj-AC0090010-AC0090011view1-subITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AC0090010-AC0090011view1-subITEM_NAME\" data-name=\"subITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getsubITEM_NAME())).append("</span>'");
 AC0090011view1_DB.append(",").append("'<span id=\"expj-AC0090010-AC0090011view1-subODR_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0090010-AC0090011view1-subODR_START_DATE\" data-name=\"subODR_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getsubODR_START_DATE())).append("</span>'");
 AC0090011view1_DB.append(",").append("'<span id=\"expj-AC0090010-AC0090011view1-subPRD_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0090010-AC0090011view1-subPRD_START_DATE\" data-name=\"subPRD_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getsubPRD_START_DATE())).append("</span>'");
 AC0090011view1_DB.append(",").append("'<span id=\"expj-AC0090010-AC0090011view1-subPRD_DUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0090010-AC0090011view1-subPRD_DUE_DATE\" data-name=\"subPRD_DUE_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getsubPRD_DUE_DATE())).append("</span>'");
 AC0090011view1_DB.append(",").append("'<span id=\"expj-AC0090010-AC0090011view1-subODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0090010-AC0090011view1-subODR_QTY\" data-name=\"subODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0090010Struct.getsubODR_QTY())).append("</span>'");
 AC0090011view1_DB.append(",").append("'<span id=\"expj-AC0090010-AC0090011view1-subSU_DM_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0090010-AC0090011view1-subSU_DM_QTY\" data-name=\"subSU_DM_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0090010Struct.getsubSU_DM_QTY())).append("</span>'");
 AC0090011view1_DB.append(",").append("'<span id=\"expj-AC0090010-AC0090011view1-subRE_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0090010-AC0090011view1-subRE_ODR_QTY\" data-name=\"subRE_ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0090010Struct.getsubRE_ODR_QTY())).append("</span>'");
 AC0090011view1_DB.append(",").append("'<span id=\"expj-AC0090010-AC0090011view1-CP_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AC0090010-AC0090011view1-CP_UNIT\" data-name=\"CP_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getCP_UNIT())).append("</span>'");
 AC0090011view1_DB.append(",").append("'<span id=\"expj-AC0090010-AC0090011view1-subPS_UNIT_NUMERATOR-").append(loopCount).append("\" class=\"expj-label expj-AC0090010-AC0090011view1-subPS_UNIT_NUMERATOR\" data-name=\"subPS_UNIT_NUMERATOR\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0090010Struct.getsubPS_UNIT_NUMERATOR())).append("</span>'");
 AC0090011view1_DB.append(",").append("'<span id=\"expj-AC0090010-AC0090011view1-subPS_UNIT_DENOMINATOR-").append(loopCount).append("\" class=\"expj-label expj-AC0090010-AC0090011view1-subPS_UNIT_DENOMINATOR\" data-name=\"subPS_UNIT_DENOMINATOR\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0090010Struct.getsubPS_UNIT_DENOMINATOR())).append("</span>'");
 AC0090011view1_DB.append(",").append("'<span id=\"expj-AC0090010-AC0090011view1-subOD_NO-").append(loopCount).append("\" class=\"expj-label expj-AC0090010-AC0090011view1-subOD_NO\" data-name=\"subOD_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0090010Struct.getsubOD_NO())).append("</span>'");
 AC0090011view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAC0090010StructLength) {
   AC0090011view1_DB.append(",");
  }
 }
 aAC0090010Struct = structBackup;
 viewIdList.add(AC0090011view1_Id);
 viewSelectList.add(AC0090011view1_select);
 viewResizeList.add(AC0090011view1_resize);
 viewScrollList.add(AC0090011view1_scroll);
 viewHeaderDataList.add(AC0090011view1_HB);
 viewBodyDataList.add(AC0090011view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AC0090010-AC0090011button2">
expj.AC0090010.AC0090011button2 = {};
expj.AC0090010.AC0090011button2.executeAllOnDecision = function () {
  console.log('execute AC0090011button2.onDecision');
};
expj.AC0090010.AC0090011button2.executeOnLoad = function () {
  expj.AC0090010.AC0090011button2.executePScriptOnLoad();
};

expj.AC0090010.AC0090011button2.executePScriptOnLoad = function () {
  console.log('execute AC0090011button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0090010-AC0090011button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0090010-AC0090011button2-update_sub1">
expj.AC0090010.AC0090011button2.update_sub1 = {};
// script1="onClick;0;CHK;_AC0090011form2/w_subDM_QTY[gt]_AC0090011view1/subRE_ODR_QTY@*0,*1"
expj.AC0090010.AC0090011button2.update_sub1.onClick0 = function () {
  console.log('update_sub1 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011button2', '_AC0090011form2/w_subDM_QTY')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011button2', '_AC0090011view1/subRE_ODR_QTY')))) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AC0090011form1/*,_AC0090011form2/*,_AC0090011view1/+@AC0090010Servlet,,$AC90007"
expj.AC0090010.AC0090011button2.update_sub1.child0 = function () {
  console.log('update_sub1 script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0090010', 'AC0090011button2', '_AC0090011form1/*,_AC0090011form2/*,_AC0090011view1/+', 'AC0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0090010', response);
expj.common.changeBusinessScreenTab('AC0090010', contents);
};
expj.common.pscript.callConfirm('AC0090010', 'AC0090011button2', 'AC90007', okEvent);
};
// script3="child;1;CHK;_AC0090011form2/w_subDM_QTY[lt]_AC0090011view1/subRE_ODR_QTY@*2,*3"
expj.AC0090010.AC0090011button2.update_sub1.child1 = function () {
  console.log('update_sub1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011button2', '_AC0090011form2/w_subDM_QTY')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0090010', 'AC0090011button2', '_AC0090011view1/subRE_ODR_QTY')))) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;2;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AC0090011form1/*,_AC0090011form2/*,_AC0090011view1/+@AC0090010Servlet,,$AC90008"
expj.AC0090010.AC0090011button2.update_sub1.child2 = function () {
  console.log('update_sub1 script4');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0090010', 'AC0090011button2', '_AC0090011form1/*,_AC0090011form2/*,_AC0090011view1/+', 'AC0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0090010', response);
expj.common.changeBusinessScreenTab('AC0090010', contents);
};
expj.common.pscript.callConfirm('AC0090010', 'AC0090011button2', 'AC90008', okEvent);
};
// script5="child;3;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AC0090011form1/*,_AC0090011form2/*,_AC0090011view1/+@AC0090010Servlet,,$ZZ07001"
expj.AC0090010.AC0090011button2.update_sub1.child3 = function () {
  console.log('update_sub1 script5');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0090010', 'AC0090011button2', '_AC0090011form1/*,_AC0090011form2/*,_AC0090011view1/+', 'AC0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0090010', response);
expj.common.changeBusinessScreenTab('AC0090010', contents);
};
expj.common.pscript.callConfirm('AC0090010', 'AC0090011button2', 'ZZ07001', okEvent);
};
expj.AC0090010.AC0090011button2.update_sub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0090010.AC0090011button2.update_sub1['onClick' + i])) {
        expj.AC0090010.AC0090011button2.update_sub1['onClick' + i]();
      }
    }
  }
};
expj.AC0090010.AC0090011button2.update_sub1.executeAllOnDecision = function () {
};
expj.AC0090010.AC0090011button2.update_sub1.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090011button2-update_sub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0090010', 'AC0090011button2', 'update_sub1', this, 'Button');
    }
  });
  expj.AC0090010.AC0090011button2.update_sub1.executePScriptOnLoad();
};

expj.AC0090010.AC0090011button2.update_sub1.executePScriptOnLoad = function () {
  console.log('execute AC0090011button2/update_sub1.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090011button2-update_sub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0090010-AC0090011button2-update_sub1" name="update_sub1" class="AC0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame17" style="width:12px;"></div><!--/td-->
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
<div class="expj-td frame05" style=""><script class="expj-script-AC0090010-AC0090011form2">
expj.AC0090010.AC0090011form2 = {};
expj.AC0090010.AC0090011form2.executeAllOnDecision = function () {
  console.log('execute AC0090011form2.onDecision');
};
expj.AC0090010.AC0090011form2.executeOnLoad = function () {
  expj.AC0090010.AC0090011form2.executePScriptOnLoad();
};

expj.AC0090010.AC0090011form2.executePScriptOnLoad = function () {
  console.log('execute AC0090011form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AC0090010-AC0090011form2" action="AC0090010Servlet" name="AC0090011form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:96px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:96px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.LIMIT",rb)%></span><!-- 納期 --></div><!--/td-->
<script class="expj-script-AC0090010-AC0090011form2-w_subDUE_DATE">
expj.AC0090010.AC0090011form2.w_subDUE_DATE = {};
expj.AC0090010.AC0090011form2.w_subDUE_DATE.executeAllOnDecision = function () {
  console.log('execute AC0090011form2/w_subDUE_DATE.onDecision');
  expj.AC0090010.AC0090011form2.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090011form2.w_subDUE_DATE.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090011form2-w_subDUE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090011form2', 'w_subDUE_DATE', this);
  });
  expj.AC0090010.AC0090011form2.w_subDUE_DATE.executePScriptOnLoad();
};

expj.AC0090010.AC0090011form2.w_subDUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0090011form2/w_subDUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090011form2-w_subDUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0090010-AC0090011form2-w_subDUE_DATE" name="w_subDUE_DATE" class="AC0090010-focus-move  " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_subDUE_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0090010-AC0090011form2-w_subDUE_TIME">
expj.AC0090010.AC0090011form2.w_subDUE_TIME = {};
expj.AC0090010.AC0090011form2.w_subDUE_TIME.executeAllOnDecision = function () {
  console.log('execute AC0090011form2/w_subDUE_TIME.onDecision');
  expj.AC0090010.AC0090011form2.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090011form2.w_subDUE_TIME.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090011form2-w_subDUE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090011form2', 'w_subDUE_TIME', this);
  });
  expj.AC0090010.AC0090011form2.w_subDUE_TIME.executePScriptOnLoad();
};

expj.AC0090010.AC0090011form2.w_subDUE_TIME.executePScriptOnLoad = function () {
  console.log('execute AC0090011form2/w_subDUE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090011form2-w_subDUE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AC0090010-AC0090011form2-w_subDUE_TIME" name="w_subDUE_TIME" class="AC0090010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_subDUE_TIME()) %>" maxlength="5" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0447",rb)%></span><!-- 外部デマンド数 --></div><!--/td-->
<script class="expj-script-AC0090010-AC0090011form2-w_subDM_QTY">
expj.AC0090010.AC0090011form2.w_subDM_QTY = {};
expj.AC0090010.AC0090011form2.w_subDM_QTY.executeAllOnDecision = function () {
  console.log('execute AC0090011form2/w_subDM_QTY.onDecision');
  expj.AC0090010.AC0090011form2.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090011form2.w_subDM_QTY.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090011form2-w_subDM_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090011form2', 'w_subDM_QTY', this);
  });
  expj.AC0090010.AC0090011form2.w_subDM_QTY.executePScriptOnLoad();
};

expj.AC0090010.AC0090011form2.w_subDM_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0090011form2/w_subDM_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090011form2-w_subDM_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0090010-AC0090011form2-w_subDM_QTY" name="w_subDM_QTY" class="AC0090010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_subDM_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AC0090010-AC0090011form2-STOCK_UNIT">
expj.AC0090010.AC0090011form2.STOCK_UNIT = {};
expj.AC0090010.AC0090011form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AC0090011form2/STOCK_UNIT.onDecision');
  expj.AC0090010.AC0090011form2.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090011form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090011form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090011form2', 'STOCK_UNIT', this);
  });
  expj.AC0090010.AC0090011form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.AC0090010.AC0090011form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AC0090011form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090011form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AC0090010-AC0090011form2-STOCK_UNIT" name="STOCK_UNIT" class="AC0090010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AC0090010-AC0090011form2-w_subITEM_CD">
expj.AC0090010.AC0090011form2.w_subITEM_CD = {};
expj.AC0090010.AC0090011form2.w_subITEM_CD.executeAllOnDecision = function () {
  console.log('execute AC0090011form2/w_subITEM_CD.onDecision');
  expj.AC0090010.AC0090011form2.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090011form2.w_subITEM_CD.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090011form2-w_subITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090011form2', 'w_subITEM_CD', this);
  });
  expj.AC0090010.AC0090011form2.w_subITEM_CD.executePScriptOnLoad();
};

expj.AC0090010.AC0090011form2.w_subITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AC0090011form2/w_subITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090011form2-w_subITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0090010-AC0090011form2-w_subITEM_CD" name="w_subITEM_CD" class="AC0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_subITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AC0090010-AC0090011form2-w_subITEM_NAME">
expj.AC0090010.AC0090011form2.w_subITEM_NAME = {};
expj.AC0090010.AC0090011form2.w_subITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AC0090011form2/w_subITEM_NAME.onDecision');
  expj.AC0090010.AC0090011form2.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090011form2.w_subITEM_NAME.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090011form2-w_subITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090011form2', 'w_subITEM_NAME', this);
  });
  expj.AC0090010.AC0090011form2.w_subITEM_NAME.executePScriptOnLoad();
};

expj.AC0090010.AC0090011form2.w_subITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AC0090011form2/w_subITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090011form2-w_subITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AC0090010-AC0090011form2-w_subITEM_NAME" name="w_subITEM_NAME" class="AC0090010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_subITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0434",rb)%></span><!-- 外部計画番号 --></div><!--/td-->
<script class="expj-script-AC0090010-AC0090011form2-w_subEXTERNAL_PLAN_CD">
expj.AC0090010.AC0090011form2.w_subEXTERNAL_PLAN_CD = {};
expj.AC0090010.AC0090011form2.w_subEXTERNAL_PLAN_CD.executeAllOnDecision = function () {
  console.log('execute AC0090011form2/w_subEXTERNAL_PLAN_CD.onDecision');
  expj.AC0090010.AC0090011form2.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090011form2.w_subEXTERNAL_PLAN_CD.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090011form2-w_subEXTERNAL_PLAN_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090011form2', 'w_subEXTERNAL_PLAN_CD', this);
  });
  expj.AC0090010.AC0090011form2.w_subEXTERNAL_PLAN_CD.executePScriptOnLoad();
};

expj.AC0090010.AC0090011form2.w_subEXTERNAL_PLAN_CD.executePScriptOnLoad = function () {
  console.log('execute AC0090011form2/w_subEXTERNAL_PLAN_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090011form2-w_subEXTERNAL_PLAN_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0090010-AC0090011form2-w_subEXTERNAL_PLAN_CD" name="w_subEXTERNAL_PLAN_CD" class="AC0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_subEXTERNAL_PLAN_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ISSUE_PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AC0090010-AC0090011form2-w_subPLANT_CD">
expj.AC0090010.AC0090011form2.w_subPLANT_CD = {};
expj.AC0090010.AC0090011form2.w_subPLANT_CD.executeAllOnDecision = function () {
  console.log('execute AC0090011form2/w_subPLANT_CD.onDecision');
  expj.AC0090010.AC0090011form2.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090011form2.w_subPLANT_CD.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090011form2-w_subPLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090011form2', 'w_subPLANT_CD', this);
  });
  expj.AC0090010.AC0090011form2.w_subPLANT_CD.executePScriptOnLoad();
};

expj.AC0090010.AC0090011form2.w_subPLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AC0090011form2/w_subPLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090011form2-w_subPLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0090010-AC0090011form2-w_subPLANT_CD" name="w_subPLANT_CD" class="AC0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_subPLANT_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AC0090010-AC0090011form2-w_subPLANT_NAME">
expj.AC0090010.AC0090011form2.w_subPLANT_NAME = {};
expj.AC0090010.AC0090011form2.w_subPLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AC0090011form2/w_subPLANT_NAME.onDecision');
  expj.AC0090010.AC0090011form2.executeAllOnDecision();
  expj.AC0090010.executeAllOnDecision();
};
expj.AC0090010.AC0090011form2.w_subPLANT_NAME.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090011form2-w_subPLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0090010', 'AC0090011form2', 'w_subPLANT_NAME', this);
  });
  expj.AC0090010.AC0090011form2.w_subPLANT_NAME.executePScriptOnLoad();
};

expj.AC0090010.AC0090011form2.w_subPLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AC0090011form2/w_subPLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090011form2-w_subPLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AC0090010-AC0090011form2-w_subPLANT_NAME" name="w_subPLANT_NAME" class="AC0090010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0090010Struct.getw_subPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 95px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AC0090011 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AC0090010-AC0090011button0">
expj.AC0090010.AC0090011button0 = {};
expj.AC0090010.AC0090011button0.executeAllOnDecision = function () {
  console.log('execute AC0090011button0.onDecision');
};
expj.AC0090010.AC0090011button0.executeOnLoad = function () {
  expj.AC0090010.AC0090011button0.executePScriptOnLoad();
};

expj.AC0090010.AC0090011button0.executePScriptOnLoad = function () {
  console.log('execute AC0090011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0090010-AC0090011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0090010-AC0090011button0-return_sub1">
expj.AC0090010.AC0090011button0.return_sub1 = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>@AC0090010Servlet,,$ZZ07013"
expj.AC0090010.AC0090011button0.return_sub1.onClick0 = function () {
  console.log('return_sub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0090010', 'AC0090011button0', '', 'AC0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0090010', response);
expj.common.changeBusinessScreenTab('AC0090010', contents);
};
expj.common.pscript.callConfirm('AC0090010', 'AC0090011button0', 'ZZ07013', okEvent);
};
expj.AC0090010.AC0090011button0.return_sub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0090010.AC0090011button0.return_sub1['onClick' + i])) {
        expj.AC0090010.AC0090011button0.return_sub1['onClick' + i]();
      }
    }
  }
};
expj.AC0090010.AC0090011button0.return_sub1.executeAllOnDecision = function () {
};
expj.AC0090010.AC0090011button0.return_sub1.executeOnLoad = function () {
  $('#expj-AC0090010-AC0090011button0-return_sub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0090010', 'AC0090011button0', 'return_sub1', this, 'Button');
    }
  });
  expj.AC0090010.AC0090011button0.return_sub1.executePScriptOnLoad();
};

expj.AC0090010.AC0090011button0.return_sub1.executePScriptOnLoad = function () {
  console.log('execute AC0090011button0/return_sub1.onLoad');
  var targetComponent = document.getElementById('expj-AC0090010-AC0090011button0-return_sub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0090010-AC0090011button0-return_sub1" name="return_sub1" class="AC0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AC0090010 (END)-->
<%
MessageStruct msgStruct = aAC0090010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AC0090010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AC0090010)) {
  expj.common.treeInstanceMap.AC0090010 = {};
}
expj.common.treeInstanceMap.AC0090010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0090010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AC0090010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0090010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AC0090010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AC0090010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AC0090010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AC0090010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AC0090010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AC0090010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AC0090010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0090010)) {
  expj.common.detailDialogMap.AC0090010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0090010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AC0090010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0090010.<%=detailId %>)) {
  expj.common.detailDialogMap.AC0090010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0090010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AC0090010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0090010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AC0090010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AC0090010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AC0090010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AC0090010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AC0090010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AC0090010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AC0090010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AC0090010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AC0090010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AC0090010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AC0090010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AC0090010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AC0090010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AC0090010)) {
  expj.common.viewInstanceMap.AC0090010 = {};
}
expj.common.viewInstanceMap.AC0090010.<%=viewId %> = {};
expj.common.viewInstanceMap.AC0090010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AC0090010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AC0090010.<%=viewId %>.init = function () {
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
    expj.AC0090010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AC0090010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AC0090010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AC0090010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AC0090010_init">
/**
 * AC0090010用のロード完了時初期化関数
 */
expj.AC0090010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AC0090010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AC0090010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AC0090010');
  expj.common.calendarInstanceMap.AC0090010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AC0090010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AC0090010.<%=detailId %>.init();
  expj.common.detailDialogMap.AC0090010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AC0090010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AC0090010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AC0090010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AC0090010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AC0090010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AC0090010-<%=detailId %>');
<%
 }
%>
  try{expj.AC0090010.AC0090011form1.w_subDATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011form1.Calendarw_subDATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011form1.w_subTIME_FROM.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011form1.w_subDATE_TO.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011form1.Calendarw_subDATE_TO.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011form1.w_subTIME_TO.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011form1.OD_NO.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011form1.MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011form1.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011button1.select_sub1.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011button2.update_sub1.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011form2.w_subDUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011form2.w_subDUE_TIME.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011form2.w_subDM_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011form2.w_subITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011form2.w_subITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011form2.w_subEXTERNAL_PLAN_CD.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011form2.w_subPLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011form2.w_subPLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011button0.return_sub1.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011form1.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011button1.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011view1.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011button2.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011form2.executeOnLoad();}catch(e){};
  try{expj.AC0090010.AC0090011button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AC0090010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AC0090010', 'AC0090010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AC0090010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AC0090010-focus-move');
  // 初期フォーカス当てる処理
  $('.AC0090010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AC0090010', '<%=request.getContextPath() %>');
};

/**
 * AC0090010の全体onDecision処理
 */
expj.AC0090010.executeAllOnDecision = function () {
  expj.AC0090010.AC0090011form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AC0090010_console">
expj.AC0090010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>