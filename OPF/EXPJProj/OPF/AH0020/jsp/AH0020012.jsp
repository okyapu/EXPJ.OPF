<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:42:11 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AH0020\AH0020012.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AH0020.*" %>
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
<jsp:useBean id="aAH0020010Control" class="com.nec.jp.orteus.metamorBase.AH0020.AH0020010Control" scope="request"/>
<jsp:useBean id="aAH0020010Struct" class="com.nec.jp.orteus.metamorBase.AH0020.AH0020010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

棚卸条件メンテナンスサブ2
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0020/jsp/AH0020012.jsp,v $
$Author: geng-jia $    
$Revision: 1.8 $ $Date: 2017/02/22 02:06:04 $
********************************************************* --%>
<html>
<head>
<title>棚卸条件メンテナンスサブ2</title>
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
<script class="expj-script-AH0020010_init">
  // AH0020010名前空間
  expj.AH0020010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AH0020010" data-screen="AH0020012" data-newdata="<%=aAH0020010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style=""></div><!--/td-->

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
              <script class="expj-script-AH0020010-AH0020012form1">
expj.AH0020010.AH0020012form1 = {};
// script1="onLoad;0;CALL;child@0,2"
expj.AH0020010.AH0020012form1.onLoad0 = function () {
  console.log('AH0020012form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child2)){this.child2();}
};
// script2="child;0;CHK;_AH0020012form1/h_disp_entry_item[eq]1@*1"
expj.AH0020010.AH0020012form1.child0 = function () {
  console.log('AH0020012form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020012form1', '_AH0020012form1/h_disp_entry_item'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;1;SET;_AH0020012form1/c_disp_entry_item=true"
expj.AH0020010.AH0020012form1.child1 = function () {
  console.log('AH0020012form1 script3');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020012form1', '_AH0020012form1/c_disp_entry_item', 'true');
};
// script4="child;2;CHK;?AH0020012form1/*[eq]NORMAL@*3,*4"
expj.AH0020010.AH0020012form1.child2 = function () {
  console.log('AH0020012form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020012form1', '?AH0020012form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script5="child;3;UNMASK;_AH0020012button2/selectall,_AH0020012button2/cancelselectall"
expj.AH0020010.AH0020012form1.child3 = function () {
  console.log('AH0020012form1 script5');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020012form1', '_AH0020012button2/selectall');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020012form1', '_AH0020012button2/cancelselectall');
};
// script6="child;4;MASK;_AH0020012button2/selectall,_AH0020012button2/cancelselectall"
expj.AH0020010.AH0020012form1.child4 = function () {
  console.log('AH0020012form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020012form1', '_AH0020012button2/selectall');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020012form1', '_AH0020012button2/cancelselectall');
};
// script7="onLoad;1;CALL;onDecision@0,1"
expj.AH0020010.AH0020012form1.onLoad1 = function () {
  console.log('AH0020012form1 script7');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script8="onDecision;0;CHKRQ;A@*5,*6"
expj.AH0020010.AH0020012form1.onDecision0 = function () {
  console.log('AH0020012form1 script8');
if (expj.common.pscript.satisfiedRequiredComponent('AH0020010', 'A')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script9="child;5;UNMASK;_AH0020012button1/select_sub2"
expj.AH0020010.AH0020012form1.child5 = function () {
  console.log('AH0020012form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020012form1', '_AH0020012button1/select_sub2');
};
// script10="child;6;MASK;_AH0020012button1/select_sub2"
expj.AH0020010.AH0020012form1.child6 = function () {
  console.log('AH0020012form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020012form1', '_AH0020012button1/select_sub2');
};
// script11="onDecision;1;CHKRQ;A@*7,*12"
expj.AH0020010.AH0020012form1.onDecision1 = function () {
  console.log('AH0020012form1 script11');
if (expj.common.pscript.satisfiedRequiredComponent('AH0020010', 'A')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script12="child;7;CHK;?AH0020012form1/*[eq]NORMAL@*8,*12"
expj.AH0020010.AH0020012form1.child7 = function () {
  console.log('AH0020012form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020012form1', '?AH0020012form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script13="child;8;CHK;?AH0020012form1/w_ITEM_CD[eq]SAME@*9,*12"
expj.AH0020010.AH0020012form1.child8 = function () {
  console.log('AH0020012form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020012form1', '?AH0020012form1/w_ITEM_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script14="child;9;CHK;?AH0020012form1/c_disp_entry_item[eq]SAME@*10,*12"
expj.AH0020010.AH0020012form1.child9 = function () {
  console.log('AH0020012form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020012form1', '?AH0020012form1/c_disp_entry_item'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script15="child;10;CHK;?AH0020012form1/s_ABC_TYP[eq]SAME@*11,*12"
expj.AH0020010.AH0020012form1.child10 = function () {
  console.log('AH0020012form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020012form1', '?AH0020012form1/s_ABC_TYP'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script16="child;11;UNMASK;_AH0020012button2/update_sub2"
expj.AH0020010.AH0020012form1.child11 = function () {
  console.log('AH0020012form1 script16');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020012form1', '_AH0020012button2/update_sub2');
};
// script17="child;12;MASK;_AH0020012button2/update_sub2"
expj.AH0020010.AH0020012form1.child12 = function () {
  console.log('AH0020012form1 script17');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020012form1', '_AH0020012button2/update_sub2');
};
expj.AH0020010.AH0020012form1.executeAllOnDecision = function () {
  console.log('execute AH0020012form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0020010.AH0020012form1['onDecision' + i])) {
        expj.AH0020010.AH0020012form1['onDecision' + i]();
      }
    }
  }
};
expj.AH0020010.AH0020012form1.executeOnLoad = function () {
  expj.AH0020010.AH0020012form1.executePScriptOnLoad();
};

expj.AH0020010.AH0020012form1.executePScriptOnLoad = function () {
  console.log('execute AH0020012form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AH0020010.AH0020012form1['onLoad' + i])) {
      expj.AH0020010.AH0020012form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AH0020010-AH0020012form1" action="AH0020010Servlet" name="AH0020012form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAH0020010Control.getReadStatusString()) %>" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.INV_DATE",rb)%></span><!-- 棚卸日 --></div><!--/td-->
<script class="expj-script-AH0020010-AH0020012form1-INV_DATE">
expj.AH0020010.AH0020012form1.INV_DATE = {};
expj.AH0020010.AH0020012form1.INV_DATE.executeAllOnDecision = function () {
  console.log('execute AH0020012form1/INV_DATE.onDecision');
  expj.AH0020010.AH0020012form1.executeAllOnDecision();
  expj.AH0020010.executeAllOnDecision();
};
expj.AH0020010.AH0020012form1.INV_DATE.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020012form1-INV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0020010', 'AH0020012form1', 'INV_DATE', this);
  });
  expj.AH0020010.AH0020012form1.INV_DATE.executePScriptOnLoad();
};

expj.AH0020010.AH0020012form1.INV_DATE.executePScriptOnLoad = function () {
  console.log('execute AH0020012form1/INV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020012form1-INV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AH0020010-AH0020012form1-INV_DATE" name="INV_DATE" class="AH0020010-focus-move  " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0020010Struct.getINV_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AH0020010-AH0020012form1-h_disp_entry_item" name="h_disp_entry_item" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0020010Struct.geth_disp_entry_item()) %>">
<script class="expj-script-AH0020010-AH0020012form1-h_disp_entry_item">
expj.AH0020010.AH0020012form1.h_disp_entry_item = {};
expj.AH0020010.AH0020012form1.h_disp_entry_item.executeAllOnDecision = function () {
  console.log('execute AH0020012form1/h_disp_entry_item.onDecision');
  expj.AH0020010.AH0020012form1.executeAllOnDecision();
  expj.AH0020010.executeAllOnDecision();
};
expj.AH0020010.AH0020012form1.h_disp_entry_item.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020012form1-h_disp_entry_item').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0020010', 'AH0020012form1', 'h_disp_entry_item', this);
  });
  expj.AH0020010.AH0020012form1.h_disp_entry_item.executePScriptOnLoad();
};

expj.AH0020010.AH0020012form1.h_disp_entry_item.executePScriptOnLoad = function () {
  console.log('execute AH0020012form1/h_disp_entry_item.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020012form1-h_disp_entry_item');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AH0020010-AH0020012form1-c_disp_entry_item">
expj.AH0020010.AH0020012form1.c_disp_entry_item = {};
expj.AH0020010.AH0020012form1.c_disp_entry_item.executeAllOnDecision = function () {
  console.log('execute AH0020012form1/c_disp_entry_item.onDecision');
  expj.AH0020010.AH0020012form1.executeAllOnDecision();
  expj.AH0020010.executeAllOnDecision();
};
expj.AH0020010.AH0020012form1.c_disp_entry_item.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020012form1-c_disp_entry_item').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0020010', 'AH0020012form1', 'c_disp_entry_item', this, 'CheckBox');
    }
  });
  expj.AH0020010.AH0020012form1.c_disp_entry_item.executePScriptOnLoad();
};

expj.AH0020010.AH0020012form1.c_disp_entry_item.executePScriptOnLoad = function () {
  console.log('execute AH0020012form1/c_disp_entry_item.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020012form1-c_disp_entry_item');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c_disp_entry_item" value="true" <%= ("true".equals(TypeConverter.convert(aAH0020010Struct.getc_disp_entry_item())) || "1".equals(TypeConverter.convert(aAH0020010Struct.getc_disp_entry_item())))?"checked=\"checked\"":"" %>  class="AH0020010-focus-move" id="expj-AH0020010-AH0020012form1-c_disp_entry_item"><label for="expj-AH0020010-AH0020012form1-c_disp_entry_item"><%=CoreTools.getRBString("Expj.Cmt0233",rb)%></label></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AH0020010-AH0020012form1-w_ITEM_CD">
expj.AH0020010.AH0020012form1.w_ITEM_CD = {};
expj.AH0020010.AH0020012form1.w_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AH0020012form1/w_ITEM_CD.onDecision');
  expj.AH0020010.AH0020012form1.executeAllOnDecision();
  expj.AH0020010.executeAllOnDecision();
};
expj.AH0020010.AH0020012form1.w_ITEM_CD.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020012form1-w_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0020010', 'AH0020012form1', 'w_ITEM_CD', this);
  });
  expj.AH0020010.AH0020012form1.w_ITEM_CD.executePScriptOnLoad();
};

expj.AH0020010.AH0020012form1.w_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AH0020012form1/w_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020012form1-w_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AH0020010-AH0020012form1-w_ITEM_CD" name="w_ITEM_CD" class="AH0020010-focus-move  required-value expj-AH0020010-required-A" style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAH0020010Struct.getw_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AH0020010-AH0020012form1-Peekerw_ITEM_CD">
expj.AH0020010.AH0020012form1.Peekerw_ITEM_CD = {};
// script1="onClick;0;PEEKER;_AH0020012form1/w_ITEM_CD@<%=contextNo%>"
expj.AH0020010.AH0020012form1.Peekerw_ITEM_CD.onClick0 = function () {
  console.log('Peekerw_ITEM_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AH0020010';
var parameterValues = 'Peekerw_ITEM_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020012form1', '_AH0020012form1/w_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AH0020012form1/w_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AH0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AH0020010.AH0020012form1.Peekerw_ITEM_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0020010.AH0020012form1.Peekerw_ITEM_CD['onClick' + i])) {
        expj.AH0020010.AH0020012form1.Peekerw_ITEM_CD['onClick' + i]();
      }
    }
  }
};
expj.AH0020010.AH0020012form1.Peekerw_ITEM_CD.executeAllOnDecision = function () {
};
expj.AH0020010.AH0020012form1.Peekerw_ITEM_CD.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020012form1-Peekerw_ITEM_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0020010', 'AH0020012form1', 'Peekerw_ITEM_CD', this, 'Button');
    }
  });
  expj.AH0020010.AH0020012form1.Peekerw_ITEM_CD.executePScriptOnLoad();
};

expj.AH0020010.AH0020012form1.Peekerw_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AH0020012form1/Peekerw_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020012form1-Peekerw_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AH0020010-AH0020012form1-Peekerw_ITEM_CD" class="AH0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ABC_TYP",rb)%></span><!-- 棚卸区分 --></div><!--/td-->
<script class="expj-script-AH0020010-AH0020012form1-s_ABC_TYP">
expj.AH0020010.AH0020012form1.s_ABC_TYP = {};
expj.AH0020010.AH0020012form1.s_ABC_TYP.executeAllOnDecision = function () {
  console.log('execute AH0020012form1/s_ABC_TYP.onDecision');
  expj.AH0020010.AH0020012form1.executeAllOnDecision();
  expj.AH0020010.executeAllOnDecision();
};
expj.AH0020010.AH0020012form1.s_ABC_TYP.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020012form1-s_ABC_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AH0020010', 'AH0020012form1', 's_ABC_TYP', this);
  });
  expj.AH0020010.AH0020012form1.s_ABC_TYP.executePScriptOnLoad();
};

expj.AH0020010.AH0020012form1.s_ABC_TYP.executePScriptOnLoad = function () {
  console.log('execute AH0020012form1/s_ABC_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020012form1-s_ABC_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AH0020010-AH0020012form1-s_ABC_TYP" name='s_ABC_TYP' class='AH0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAH0020010Control.getStruct().getList_s_ABC_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAH0020010Control.getStruct().getList_s_ABC_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAH0020010Control.getStruct().getList_s_ABC_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAH0020010Struct.gets_ABC_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AH0020010-AH0020012button1">
expj.AH0020010.AH0020012button1 = {};
expj.AH0020010.AH0020012button1.executeAllOnDecision = function () {
  console.log('execute AH0020012button1.onDecision');
};
expj.AH0020010.AH0020012button1.executeOnLoad = function () {
  expj.AH0020010.AH0020012button1.executePScriptOnLoad();
};

expj.AH0020010.AH0020012button1.executePScriptOnLoad = function () {
  console.log('execute AH0020012button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AH0020010-AH0020012button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AH0020010-AH0020012button1-CsvImportItem">
expj.AH0020010.AH0020012button1.CsvImportItem = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AH0020012form1/*,_AH0020012view1/*@AH0020010Servlet"
expj.AH0020010.AH0020012button1.CsvImportItem.onClick0 = function () {
  console.log('CsvImportItem script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0020010', 'AH0020012button1', '_AH0020012form1/*,_AH0020012view1/*', 'AH0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0020010', response);
expj.common.changeBusinessScreenTab('AH0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AH0020010.AH0020012button1.CsvImportItem.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0020010.AH0020012button1.CsvImportItem['onClick' + i])) {
        expj.AH0020010.AH0020012button1.CsvImportItem['onClick' + i]();
      }
    }
  }
};
expj.AH0020010.AH0020012button1.CsvImportItem.executeAllOnDecision = function () {
};
expj.AH0020010.AH0020012button1.CsvImportItem.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020012button1-CsvImportItem').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0020010', 'AH0020012button1', 'CsvImportItem', this, 'Button');
    }
  });
  expj.AH0020010.AH0020012button1.CsvImportItem.executePScriptOnLoad();
};

expj.AH0020010.AH0020012button1.CsvImportItem.executePScriptOnLoad = function () {
  console.log('execute AH0020012button1/CsvImportItem.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020012button1-CsvImportItem');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0020010-AH0020012button1-CsvImportItem" name="CsvImportItem" class="AH0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvImport",rb)%></button><!-- CSV取込ボタン --></div><!--/td-->
<script class="expj-script-AH0020010-AH0020012button1-select_sub2">
expj.AH0020010.AH0020012button1.select_sub2 = {};
// script1="onClick;0;CHK;1[eq]1@*0"
expj.AH0020010.AH0020012button1.select_sub2.onClick0 = function () {
  console.log('select_sub2 script1');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_AH0020012form1/c_disp_entry_item[eq]true@*1,*2"
expj.AH0020010.AH0020012button1.select_sub2.child0 = function () {
  console.log('select_sub2 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020012button1', '_AH0020012form1/c_disp_entry_item'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;SET;_AH0020012form1/h_disp_entry_item=1@*3"
expj.AH0020010.AH0020012button1.select_sub2.child1 = function () {
  console.log('select_sub2 script3');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020012button1', '_AH0020012form1/h_disp_entry_item', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script4="child;2;SET;_AH0020012form1/h_disp_entry_item=0@*3"
expj.AH0020010.AH0020012button1.select_sub2.child2 = function () {
  console.log('select_sub2 script4');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020012button1', '_AH0020012form1/h_disp_entry_item', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;3;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AH0020012form1/*,_AH0020012view1/*@AH0020010Servlet"
expj.AH0020010.AH0020012button1.select_sub2.child3 = function () {
  console.log('select_sub2 script5');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0020010', 'AH0020012button1', '_AH0020012form1/*,_AH0020012view1/*', 'AH0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0020010', response);
expj.common.updateBusinessScreenTab('AH0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AH0020010.AH0020012button1.select_sub2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0020010.AH0020012button1.select_sub2['onClick' + i])) {
        expj.AH0020010.AH0020012button1.select_sub2['onClick' + i]();
      }
    }
  }
};
expj.AH0020010.AH0020012button1.select_sub2.executeAllOnDecision = function () {
};
expj.AH0020010.AH0020012button1.select_sub2.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020012button1-select_sub2').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0020010', 'AH0020012button1', 'select_sub2', this, 'Button');
    }
  });
  expj.AH0020010.AH0020012button1.select_sub2.executePScriptOnLoad();
};

expj.AH0020010.AH0020012button1.select_sub2.executePScriptOnLoad = function () {
  console.log('execute AH0020012button1/select_sub2.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020012button1-select_sub2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0020010-AH0020012button1-select_sub2" name="select_sub2" class="AH0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AH0020010-AH0020012view1">
expj.AH0020010.AH0020012view1 = {};
expj.AH0020010.AH0020012view1.executeAllOnClick = function () {
};
expj.AH0020010.AH0020012view1.executeAllOnDecision = function () {
  console.log('execute AH0020012view1.onDecision');
};
expj.AH0020010.AH0020012view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AH0020012view1", "expj.AH0020010.AH0020012view1.executeAllOnClick");
%>
  expj.AH0020010.AH0020012view1.executePScriptOnLoad();
};

expj.AH0020010.AH0020012view1.executePScriptOnLoad = function () {
  console.log('execute AH0020012view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AH0020010-AH0020012view1" class="expj-datagrid-view expj-view-noselect" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AH0020012view1_Id = "AH0020012view1";
 String AH0020012view1_select = "single";
 String AH0020012view1_sortable = "true";
 String AH0020012view1_resize = "true";
 String AH0020012view1_scroll = "true";
 StringBuffer AH0020012view1_HB = new StringBuffer();
 StringBuffer AH0020012view1_DB = new StringBuffer();
%>
<%
 AH0020012view1_select = "none";
 AH0020012view1_sortable = "true";
 AH0020012view1_resize = "true";
 AH0020012view1_scroll = "true";
%>
<%
 AH0020012view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AH0020012view1_sortable).append("}").append(",");
%>
    <script class="expj-script-AH0020010-AH0020012view1-c_target">
expj.AH0020010.AH0020012view1.c_target = {};
expj.AH0020010.AH0020012view1.c_target.executeAllOnClick = function () {
};
expj.AH0020010.AH0020012view1.c_target.executeAllOnDecision = function () {
  console.log('execute AH0020012view1/c_target.onDecision');
  expj.AH0020010.AH0020012view1.executeAllOnDecision();
  expj.AH0020010.executeAllOnDecision();
};
expj.AH0020010.AH0020012view1.c_target.executeOnLoad = function () {
  $('.expj-AH0020010-AH0020012view1-c_target').click(function () {
    var component = this;
    if (!component.hasAttribute('disabled')) {
      setTimeout(function () {
        expj.common.pscript.executeOnClickEvent('AH0020010', 'AH0020012view1', 'c_target', component, 'CheckBox');
      }, 0);
    }
  });
  expj.AH0020010.AH0020012view1.c_target.executePScriptOnLoad();
};

expj.AH0020010.AH0020012view1.c_target.executePScriptOnLoad = function () {
  console.log('execute AH0020012view1/c_target.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>

 
<%
AH0020012view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AH0020012view1_sortable).append("}").append(",");
AH0020012view1_HB.append("{'visible':true, 'type':'string', 'width':'40px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0015",rb))).append("', 'name':'c_target', 'class':'expj-tooltip expj-view-cell-checkbox', 'sortable':").append(AH0020012view1_sortable).append("}").append(",");
AH0020012view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0020012view1_sortable).append("}").append(",");
AH0020012view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0020012view1_sortable).append("}").append(",");
AH0020012view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb))).append("', 'name':'w_MRP_ODR_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0020012view1_sortable).append("}").append(",");
AH0020012view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb))).append("', 'name':'w_OUTSIDE_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0020012view1_sortable).append("}").append(",");
AH0020012view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'INV_ITEM_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AH0020012view1_sortable).append("}").append(",");
AH0020012view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'MRP_ODR_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AH0020012view1_sortable).append("}").append(",");
AH0020012view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'OUTSIDE_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AH0020012view1_sortable).append("}").append(",");
AH0020012view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ABC_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AH0020012view1_sortable).append("}").append(",");
AH0020012view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'w_target', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AH0020012view1_sortable).append("}").append(",");
AH0020012view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ABC_TYP",rb))).append("', 'name':'w_ABC_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0020012view1_sortable).append("}").append(",");
%>
<%
 int aAH0020010StructLength = aAH0020010Control.getListsize();
 final AH0020010Struct structBackup = aAH0020010Struct;
 aAH0020010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAH0020010StructLength; ++loopCount) {
  if((aAH0020010Struct = (AH0020010Struct) aAH0020010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAH0020010Struct", aAH0020010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AH0020012view1_DB.append("[");
 AH0020012view1_DB.append(loopCount);
 AH0020012view1_DB.append(",''");
 AH0020012view1_DB.append(",").append("'<input type=\"checkbox\" id=\"expj-AH0020010-AH0020012view1-c_target-").append(loopCount).append("\" class=\"expj-AH0020010-AH0020012view1-c_target AH0020010-focus-move\" data-name=\"c_target\" data-view=\"true\"").append("true".equals(TypeConverter.convert(aAH0020010Struct.getc_target())) ? " checked=\"checked\"" : "").append("").append(">'");
 AH0020012view1_DB.append(",").append("'<span id=\"expj-AH0020010-AH0020012view1-ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AH0020010-AH0020012view1-ITEM_CD\" data-name=\"ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0020010Struct.getITEM_CD())).append("</span>'");
 AH0020012view1_DB.append(",").append("'<span id=\"expj-AH0020010-AH0020012view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AH0020010-AH0020012view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0020010Struct.getITEM_NAME())).append("</span>'");
 AH0020012view1_DB.append(",").append("'<span id=\"expj-AH0020010-AH0020012view1-w_MRP_ODR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AH0020010-AH0020012view1-w_MRP_ODR_TYP\" data-name=\"w_MRP_ODR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0020010Struct.getw_MRP_ODR_TYP())).append("</span>'");
 AH0020012view1_DB.append(",").append("'<span id=\"expj-AH0020010-AH0020012view1-w_OUTSIDE_TYP-").append(loopCount).append("\" class=\"expj-label expj-AH0020010-AH0020012view1-w_OUTSIDE_TYP\" data-name=\"w_OUTSIDE_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0020010Struct.getw_OUTSIDE_TYP())).append("</span>'");
 AH0020012view1_DB.append(",").append("'<span id=\"expj-AH0020010-AH0020012view1-INV_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AH0020010-AH0020012view1-INV_ITEM_CD\" data-name=\"INV_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0020010Struct.getINV_ITEM_CD())).append("</span>'");
 AH0020012view1_DB.append(",").append("'<span id=\"expj-AH0020010-AH0020012view1-MRP_ODR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AH0020010-AH0020012view1-MRP_ODR_TYP\" data-name=\"MRP_ODR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0020010Struct.getMRP_ODR_TYP())).append("</span>'");
 AH0020012view1_DB.append(",").append("'<span id=\"expj-AH0020010-AH0020012view1-OUTSIDE_TYP-").append(loopCount).append("\" class=\"expj-label expj-AH0020010-AH0020012view1-OUTSIDE_TYP\" data-name=\"OUTSIDE_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0020010Struct.getOUTSIDE_TYP())).append("</span>'");
 AH0020012view1_DB.append(",").append("'<span id=\"expj-AH0020010-AH0020012view1-ABC_TYP-").append(loopCount).append("\" class=\"expj-label expj-AH0020010-AH0020012view1-ABC_TYP\" data-name=\"ABC_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0020010Struct.getABC_TYP())).append("</span>'");
 AH0020012view1_DB.append(",").append("'<span id=\"expj-AH0020010-AH0020012view1-w_target-").append(loopCount).append("\" class=\"expj-label expj-AH0020010-AH0020012view1-w_target\" data-name=\"w_target\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0020010Struct.getw_target())).append("</span>'");
 AH0020012view1_DB.append(",").append("'<span id=\"expj-AH0020010-AH0020012view1-w_ABC_TYP-").append(loopCount).append("\" class=\"expj-label expj-AH0020010-AH0020012view1-w_ABC_TYP\" data-name=\"w_ABC_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0020010Struct.getw_ABC_TYP())).append("</span>'");
 AH0020012view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAH0020010StructLength) {
   AH0020012view1_DB.append(",");
  }
 }
 aAH0020010Struct = structBackup;
 viewIdList.add(AH0020012view1_Id);
 viewSelectList.add(AH0020012view1_select);
 viewResizeList.add(AH0020012view1_resize);
 viewScrollList.add(AH0020012view1_scroll);
 viewHeaderDataList.add(AH0020012view1_HB);
 viewBodyDataList.add(AH0020012view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-AH0020010-AH0020012button2">
expj.AH0020010.AH0020012button2 = {};
expj.AH0020010.AH0020012button2.executeAllOnDecision = function () {
  console.log('execute AH0020012button2.onDecision');
};
expj.AH0020010.AH0020012button2.executeOnLoad = function () {
  expj.AH0020010.AH0020012button2.executePScriptOnLoad();
};

expj.AH0020010.AH0020012button2.executePScriptOnLoad = function () {
  console.log('execute AH0020012button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AH0020010-AH0020012button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AH0020010-AH0020012button2-update_sub2">
expj.AH0020010.AH0020012button2.update_sub2 = {};
// script1="onClick;0;CHK;1[eq]1@*0"
expj.AH0020010.AH0020012button2.update_sub2.onClick0 = function () {
  console.log('update_sub2 script1');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_AH0020012form1/c_disp_entry_item[eq]true@*1,*2"
expj.AH0020010.AH0020012button2.update_sub2.child0 = function () {
  console.log('update_sub2 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020012button2', '_AH0020012form1/c_disp_entry_item'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;SET;_AH0020012form1/h_disp_entry_item=1@*3"
expj.AH0020010.AH0020012button2.update_sub2.child1 = function () {
  console.log('update_sub2 script3');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020012button2', '_AH0020012form1/h_disp_entry_item', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script4="child;2;SET;_AH0020012form1/h_disp_entry_item=0@*3"
expj.AH0020010.AH0020012button2.update_sub2.child2 = function () {
  console.log('update_sub2 script4');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020012button2', '_AH0020012form1/h_disp_entry_item', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;3;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AH0020012form1/*,_AH0020012view1/*@AH0020010Servlet,,$ZZ07003"
expj.AH0020010.AH0020012button2.update_sub2.child3 = function () {
  console.log('update_sub2 script5');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0020010', 'AH0020012button2', '_AH0020012form1/*,_AH0020012view1/*', 'AH0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0020010', response);
expj.common.changeBusinessScreenTab('AH0020010', contents);
};
expj.common.pscript.callConfirm('AH0020010', 'AH0020012button2', 'ZZ07003', okEvent);
};
expj.AH0020010.AH0020012button2.update_sub2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0020010.AH0020012button2.update_sub2['onClick' + i])) {
        expj.AH0020010.AH0020012button2.update_sub2['onClick' + i]();
      }
    }
  }
};
expj.AH0020010.AH0020012button2.update_sub2.executeAllOnDecision = function () {
};
expj.AH0020010.AH0020012button2.update_sub2.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020012button2-update_sub2').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0020010', 'AH0020012button2', 'update_sub2', this, 'Button');
    }
  });
  expj.AH0020010.AH0020012button2.update_sub2.executePScriptOnLoad();
};

expj.AH0020010.AH0020012button2.update_sub2.executePScriptOnLoad = function () {
  console.log('execute AH0020012button2/update_sub2.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020012button2-update_sub2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0020010-AH0020012button2-update_sub2" name="update_sub2" class="AH0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-AH0020010-AH0020012button2-selectall">
expj.AH0020010.AH0020012button2.selectall = {};
// script1="onClick;0;COLSET;_AH0020012view1/c_target=true"
expj.AH0020010.AH0020012button2.selectall.onClick0 = function () {
  console.log('selectall script1');
expj.common.pscript.setVIEWColumn('AH0020010', 'AH0020012button2', '_AH0020012view1/c_target', 'true');
};
expj.AH0020010.AH0020012button2.selectall.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0020010.AH0020012button2.selectall['onClick' + i])) {
        expj.AH0020010.AH0020012button2.selectall['onClick' + i]();
      }
    }
  }
};
expj.AH0020010.AH0020012button2.selectall.executeAllOnDecision = function () {
};
expj.AH0020010.AH0020012button2.selectall.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020012button2-selectall').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0020010', 'AH0020012button2', 'selectall', this, 'Button');
    }
  });
  expj.AH0020010.AH0020012button2.selectall.executePScriptOnLoad();
};

expj.AH0020010.AH0020012button2.selectall.executePScriptOnLoad = function () {
  console.log('execute AH0020012button2/selectall.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020012button2-selectall');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0020010-AH0020012button2-selectall" name="selectall" class="AH0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckAll",rb)%></button><!-- 全選択ボタン --></div><!--/td-->
<script class="expj-script-AH0020010-AH0020012button2-cancelselectall">
expj.AH0020010.AH0020012button2.cancelselectall = {};
// script1="onClick;0;COLSET;_AH0020012view1/c_target=NULL"
expj.AH0020010.AH0020012button2.cancelselectall.onClick0 = function () {
  console.log('cancelselectall script1');
expj.common.pscript.setVIEWColumn('AH0020010', 'AH0020012button2', '_AH0020012view1/c_target', 'NULL');
};
expj.AH0020010.AH0020012button2.cancelselectall.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0020010.AH0020012button2.cancelselectall['onClick' + i])) {
        expj.AH0020010.AH0020012button2.cancelselectall['onClick' + i]();
      }
    }
  }
};
expj.AH0020010.AH0020012button2.cancelselectall.executeAllOnDecision = function () {
};
expj.AH0020010.AH0020012button2.cancelselectall.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020012button2-cancelselectall').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0020010', 'AH0020012button2', 'cancelselectall', this, 'Button');
    }
  });
  expj.AH0020010.AH0020012button2.cancelselectall.executePScriptOnLoad();
};

expj.AH0020010.AH0020012button2.cancelselectall.executePScriptOnLoad = function () {
  console.log('execute AH0020012button2/cancelselectall.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020012button2-cancelselectall');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0020010-AH0020012button2-cancelselectall" name="cancelselectall" class="AH0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckClear",rb)%></button><!-- 全解除ボタン --></div><!--/td-->
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
<span class="version">AH0020012 Revision: 1.4  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AH0020010-AH0020012button0">
expj.AH0020010.AH0020012button0 = {};
expj.AH0020010.AH0020012button0.executeAllOnDecision = function () {
  console.log('execute AH0020012button0.onDecision');
};
expj.AH0020010.AH0020012button0.executeOnLoad = function () {
  expj.AH0020010.AH0020012button0.executePScriptOnLoad();
};

expj.AH0020010.AH0020012button0.executePScriptOnLoad = function () {
  console.log('execute AH0020012button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AH0020010-AH0020012button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AH0020010-AH0020012button0-clear_sub2">
expj.AH0020010.AH0020012button0.clear_sub2 = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AH0020012form1/*,_AH0020012view1/*@AH0020010Servlet,,$ZZ07008"
expj.AH0020010.AH0020012button0.clear_sub2.onClick0 = function () {
  console.log('clear_sub2 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0020010', 'AH0020012button0', '_AH0020012form1/*,_AH0020012view1/*', 'AH0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0020010', response);
expj.common.updateBusinessScreenTab('AH0020010', contents);
};
expj.common.pscript.callConfirm('AH0020010', 'AH0020012button0', 'ZZ07008', okEvent);
};
expj.AH0020010.AH0020012button0.clear_sub2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0020010.AH0020012button0.clear_sub2['onClick' + i])) {
        expj.AH0020010.AH0020012button0.clear_sub2['onClick' + i]();
      }
    }
  }
};
expj.AH0020010.AH0020012button0.clear_sub2.executeAllOnDecision = function () {
};
expj.AH0020010.AH0020012button0.clear_sub2.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020012button0-clear_sub2').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0020010', 'AH0020012button0', 'clear_sub2', this, 'Button');
    }
  });
  expj.AH0020010.AH0020012button0.clear_sub2.executePScriptOnLoad();
};

expj.AH0020010.AH0020012button0.clear_sub2.executePScriptOnLoad = function () {
  console.log('execute AH0020012button0/clear_sub2.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020012button0-clear_sub2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0020010-AH0020012button0-clear_sub2" name="clear_sub2" class="AH0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AH0020010-AH0020012button0-return_sub2">
expj.AH0020010.AH0020012button0.return_sub2 = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AH0020012form1/*,_AH0020012view1/*@AH0020010Servlet,,$ZZ07013"
expj.AH0020010.AH0020012button0.return_sub2.onClick0 = function () {
  console.log('return_sub2 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0020010', 'AH0020012button0', '_AH0020012form1/*,_AH0020012view1/*', 'AH0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0020010', response);
expj.common.changeBusinessScreenTab('AH0020010', contents);
};
expj.common.pscript.callConfirm('AH0020010', 'AH0020012button0', 'ZZ07013', okEvent);
};
expj.AH0020010.AH0020012button0.return_sub2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0020010.AH0020012button0.return_sub2['onClick' + i])) {
        expj.AH0020010.AH0020012button0.return_sub2['onClick' + i]();
      }
    }
  }
};
expj.AH0020010.AH0020012button0.return_sub2.executeAllOnDecision = function () {
};
expj.AH0020010.AH0020012button0.return_sub2.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020012button0-return_sub2').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0020010', 'AH0020012button0', 'return_sub2', this, 'Button');
    }
  });
  expj.AH0020010.AH0020012button0.return_sub2.executePScriptOnLoad();
};

expj.AH0020010.AH0020012button0.return_sub2.executePScriptOnLoad = function () {
  console.log('execute AH0020012button0/return_sub2.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020012button0-return_sub2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0020010-AH0020012button0-return_sub2" name="return_sub2" class="AH0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AH0020010 (END)-->
<%
MessageStruct msgStruct = aAH0020010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AH0020010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AH0020010)) {
  expj.common.treeInstanceMap.AH0020010 = {};
}
expj.common.treeInstanceMap.AH0020010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AH0020010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AH0020010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AH0020010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AH0020010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AH0020010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AH0020010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AH0020010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AH0020010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AH0020010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AH0020010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0020010)) {
  expj.common.detailDialogMap.AH0020010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0020010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AH0020010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0020010.<%=detailId %>)) {
  expj.common.detailDialogMap.AH0020010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0020010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AH0020010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0020010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AH0020010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AH0020010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AH0020010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AH0020010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AH0020010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AH0020010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AH0020010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AH0020010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AH0020010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AH0020010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AH0020010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AH0020010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AH0020010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AH0020010)) {
  expj.common.viewInstanceMap.AH0020010 = {};
}
expj.common.viewInstanceMap.AH0020010.<%=viewId %> = {};
expj.common.viewInstanceMap.AH0020010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AH0020010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AH0020010.<%=viewId %>.init = function () {
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
    expj.AH0020010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AH0020010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AH0020010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AH0020010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AH0020010_init">
/**
 * AH0020010用のロード完了時初期化関数
 */
expj.AH0020010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AH0020010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AH0020010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AH0020010');
  expj.common.calendarInstanceMap.AH0020010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AH0020010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AH0020010.<%=detailId %>.init();
  expj.common.detailDialogMap.AH0020010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AH0020010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AH0020010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AH0020010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AH0020010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AH0020010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AH0020010-<%=detailId %>');
<%
 }
%>
  try{expj.AH0020010.AH0020012form1.INV_DATE.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020012form1.h_disp_entry_item.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020012form1.c_disp_entry_item.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020012form1.w_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020012form1.Peekerw_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020012form1.s_ABC_TYP.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020012button1.CsvImportItem.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020012button1.select_sub2.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020012view1.c_target.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020012button2.update_sub2.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020012button2.selectall.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020012button2.cancelselectall.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020012button0.clear_sub2.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020012button0.return_sub2.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020012form1.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020012button1.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020012view1.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020012button2.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020012button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AH0020010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AH0020010', 'AH0020010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AH0020010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AH0020010-focus-move');
  // 初期フォーカス当てる処理
  $('.AH0020010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AH0020010', '<%=request.getContextPath() %>');
};

/**
 * AH0020010の全体onDecision処理
 */
expj.AH0020010.executeAllOnDecision = function () {
  expj.AH0020010.AH0020012form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AH0020010_console">
expj.AH0020010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>