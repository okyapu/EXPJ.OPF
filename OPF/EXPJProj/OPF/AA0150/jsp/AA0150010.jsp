<%-- ***
This file is generated
 GeneratedDate  : Thu Feb 16 20:31:58 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0150\AA0150010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0150.*" %>
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
<jsp:useBean id="aAA0150010Control" class="com.nec.jp.orteus.metamorBase.AA0150.AA0150010Control" scope="request"/>
<jsp:useBean id="aAA0150010Struct" class="com.nec.jp.orteus.metamorBase.AA0150.AA0150010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

品目データ取込処理
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0150/jsp/AA0150010.jsp,v $
$Author: geng-jia $	
$Revision: 1.11 $ $Date: 2017/02/22 02:04:07 $
********************************************************* --%>
<html>
<head>
<title>品目データ取込処理</title>
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
<script class="expj-script-AA0150010_init">
  // AA0150010名前空間
  expj.AA0150010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AA0150010" data-screen="AA0150010" data-newdata="<%=aAA0150010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style="width:968px;"></div><!--/td-->

    </div><!--/tr-->

    <div class="expj-tr expjDynamicHeight" style=""> 
      <div class="expj-td" style="width:5px;"></div><!--/td-->

      <div class="expj-td" style="width:calc(100% - 10px);height:100%;"> 
        <div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2-->
          <div class="expj-tr" style="width:100%;height:0px;display:none;">
 
            <div class="expj-td frame01"></div><!--/td-->

            <div class="expj-td frame02"></div><!--/td-->

            <div class="expj-td frame03"></div><!--/td-->

          </div><!--/tr-->

          <div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
 
            <div class="expj-td frame04" style="width:12px;"></div><!--/td-->

            <div class="expj-td frame05" style="height:100%;"> 
              <!-- ここに上段検索条件用のDataGridを配置する。↓ -->
              <script class="expj-script-AA0150010-AA0150010form1">
expj.AA0150010.AA0150010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AA0150010.AA0150010form1.onLoad0 = function () {
  console.log('AA0150010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AA0150010.AA0150010form1.onDecision0 = function () {
  console.log('AA0150010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AA0150010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AA0150010button1/CsvIn"
expj.AA0150010.AA0150010form1.child0 = function () {
  console.log('AA0150010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AA0150010', 'AA0150010form1', '_AA0150010button1/CsvIn');
};
// script4="child;1;MASK;_AA0150010button1/CsvIn"
expj.AA0150010.AA0150010form1.child1 = function () {
  console.log('AA0150010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AA0150010', 'AA0150010form1', '_AA0150010button1/CsvIn');
};
// script5="onDecision;1;CHKRQ;B@*6,*7"
expj.AA0150010.AA0150010form1.onDecision1 = function () {
  console.log('AA0150010form1 script5');
if (expj.common.pscript.satisfiedRequiredComponent('AA0150010', 'B')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script6="child;2;UNMASK;_AA0150010button1/CsvIn"
expj.AA0150010.AA0150010form1.child2 = function () {
  console.log('AA0150010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AA0150010', 'AA0150010form1', '_AA0150010button1/CsvIn');
};
// script7="child;3;MASK;_AA0150010button1/CsvIn"
expj.AA0150010.AA0150010form1.child3 = function () {
  console.log('AA0150010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AA0150010', 'AA0150010form1', '_AA0150010button1/CsvIn');
};
expj.AA0150010.AA0150010form1.executeAllOnDecision = function () {
  console.log('execute AA0150010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0150010.AA0150010form1['onDecision' + i])) {
        expj.AA0150010.AA0150010form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0150010.AA0150010form1.executeOnLoad = function () {
  expj.AA0150010.AA0150010form1.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0150010.AA0150010form1['onLoad' + i])) {
      expj.AA0150010.AA0150010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0150010-AA0150010form1" action="AA0150010Servlet" name="AA0150010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
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
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AA0150010-AA0150010form1-rdoInsert">
expj.AA0150010.AA0150010form1.rdoInsert = {};
expj.AA0150010.AA0150010form1.rdoInsert.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/rdoInsert.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.rdoInsert.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-rdoInsert').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0150010', 'AA0150010form1', 'rdoInsert', this, 'RadioButton');
    }
  });
  expj.AA0150010.AA0150010form1.rdoInsert.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.rdoInsert.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/rdoInsert.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-rdoInsert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoPlantTyp" data-name="rdoInsert" value="true" <%= ("true".equals(TypeConverter.convert(aAA0150010Struct.getrdoInsert())))?"checked=\"checked\"":"" %> class="" id="expj-AA0150010-AA0150010form1-rdoInsert" ><label for="expj-AA0150010-AA0150010form1-rdoInsert"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AA0150010-AA0150010form1-rdoUpdate">
expj.AA0150010.AA0150010form1.rdoUpdate = {};
expj.AA0150010.AA0150010form1.rdoUpdate.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/rdoUpdate.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.rdoUpdate.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-rdoUpdate').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0150010', 'AA0150010form1', 'rdoUpdate', this, 'RadioButton');
    }
  });
  expj.AA0150010.AA0150010form1.rdoUpdate.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.rdoUpdate.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/rdoUpdate.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-rdoUpdate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoPlantTyp" data-name="rdoUpdate" value="true" <%= ("true".equals(TypeConverter.convert(aAA0150010Struct.getrdoUpdate())))?"checked=\"checked\"":"" %> class="" id="expj-AA0150010-AA0150010form1-rdoUpdate" ><label for="expj-AA0150010-AA0150010form1-rdoUpdate"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AA0150010-AA0150010form1-rdoDelete">
expj.AA0150010.AA0150010form1.rdoDelete = {};
expj.AA0150010.AA0150010form1.rdoDelete.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/rdoDelete.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.rdoDelete.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-rdoDelete').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0150010', 'AA0150010form1', 'rdoDelete', this, 'RadioButton');
    }
  });
  expj.AA0150010.AA0150010form1.rdoDelete.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.rdoDelete.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/rdoDelete.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-rdoDelete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoPlantTyp" data-name="rdoDelete" value="true" <%= ("true".equals(TypeConverter.convert(aAA0150010Struct.getrdoDelete())))?"checked=\"checked\"":"" %> class="" id="expj-AA0150010-AA0150010form1-rdoDelete" ><label for="expj-AA0150010-AA0150010form1-rdoDelete"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AA0150010-AA0150010form1-DO_CHK">
expj.AA0150010.AA0150010form1.DO_CHK = {};
expj.AA0150010.AA0150010form1.DO_CHK.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/DO_CHK.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.DO_CHK.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-DO_CHK').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0150010', 'AA0150010form1', 'DO_CHK', this, 'CheckBox');
    }
  });
  expj.AA0150010.AA0150010form1.DO_CHK.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.DO_CHK.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/DO_CHK.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-DO_CHK');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="DO_CHK" value="true" <%= ("true".equals(TypeConverter.convert(aAA0150010Struct.getDO_CHK())) || "1".equals(TypeConverter.convert(aAA0150010Struct.getDO_CHK())))?"checked=\"checked\"":"" %>  class="AA0150010-focus-move" id="expj-AA0150010-AA0150010form1-DO_CHK"><label for="expj-AA0150010-AA0150010form1-DO_CHK"><%=CoreTools.getRBString("Expj.Cmt3093",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_SYORI_KUBUN" name="h_SYORI_KUBUN" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_SYORI_KUBUN()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_SYORI_KUBUN">
expj.AA0150010.AA0150010form1.h_SYORI_KUBUN = {};
expj.AA0150010.AA0150010form1.h_SYORI_KUBUN.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_SYORI_KUBUN.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_SYORI_KUBUN.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_SYORI_KUBUN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_SYORI_KUBUN', this);
  });
  expj.AA0150010.AA0150010form1.h_SYORI_KUBUN.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_SYORI_KUBUN.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_SYORI_KUBUN.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_SYORI_KUBUN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_ITEM_CD" name="h_ITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_ITEM_CD()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_ITEM_CD">
expj.AA0150010.AA0150010form1.h_ITEM_CD = {};
expj.AA0150010.AA0150010form1.h_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_ITEM_CD.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_ITEM_CD', this);
  });
  expj.AA0150010.AA0150010form1.h_ITEM_CD.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_ITEM_NAME" name="h_ITEM_NAME" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_ITEM_NAME()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_ITEM_NAME">
expj.AA0150010.AA0150010form1.h_ITEM_NAME = {};
expj.AA0150010.AA0150010form1.h_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_ITEM_NAME.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_ITEM_NAME', this);
  });
  expj.AA0150010.AA0150010form1.h_ITEM_NAME.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_DRAW_CD" name="h_DRAW_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_DRAW_CD()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_DRAW_CD">
expj.AA0150010.AA0150010form1.h_DRAW_CD = {};
expj.AA0150010.AA0150010form1.h_DRAW_CD.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_DRAW_CD.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_DRAW_CD.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_DRAW_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_DRAW_CD', this);
  });
  expj.AA0150010.AA0150010form1.h_DRAW_CD.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_DRAW_CD.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_DRAW_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_DRAW_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_SPEC" name="h_SPEC" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_SPEC()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_SPEC">
expj.AA0150010.AA0150010form1.h_SPEC = {};
expj.AA0150010.AA0150010form1.h_SPEC.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_SPEC.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_SPEC.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_SPEC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_SPEC', this);
  });
  expj.AA0150010.AA0150010form1.h_SPEC.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_SPEC.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_SPEC.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_SPEC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_HIGH_LEVEL_NO" name="h_HIGH_LEVEL_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_HIGH_LEVEL_NO()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_HIGH_LEVEL_NO">
expj.AA0150010.AA0150010form1.h_HIGH_LEVEL_NO = {};
expj.AA0150010.AA0150010form1.h_HIGH_LEVEL_NO.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_HIGH_LEVEL_NO.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_HIGH_LEVEL_NO.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_HIGH_LEVEL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_HIGH_LEVEL_NO', this);
  });
  expj.AA0150010.AA0150010form1.h_HIGH_LEVEL_NO.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_HIGH_LEVEL_NO.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_HIGH_LEVEL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_HIGH_LEVEL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_MRP_ODR_TYP" name="h_MRP_ODR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_MRP_ODR_TYP()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_MRP_ODR_TYP">
expj.AA0150010.AA0150010form1.h_MRP_ODR_TYP = {};
expj.AA0150010.AA0150010form1.h_MRP_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_MRP_ODR_TYP.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_MRP_ODR_TYP.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_MRP_ODR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_MRP_ODR_TYP', this);
  });
  expj.AA0150010.AA0150010form1.h_MRP_ODR_TYP.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_MRP_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_MRP_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_MRP_ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_OUTSIDE_TYP" name="h_OUTSIDE_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_OUTSIDE_TYP()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_OUTSIDE_TYP">
expj.AA0150010.AA0150010form1.h_OUTSIDE_TYP = {};
expj.AA0150010.AA0150010form1.h_OUTSIDE_TYP.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_OUTSIDE_TYP.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_OUTSIDE_TYP.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_OUTSIDE_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_OUTSIDE_TYP', this);
  });
  expj.AA0150010.AA0150010form1.h_OUTSIDE_TYP.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_OUTSIDE_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_OUTSIDE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_OUTSIDE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_STOCK_UNIT_FLG" name="h_STOCK_UNIT_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_STOCK_UNIT_FLG()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_STOCK_UNIT_FLG">
expj.AA0150010.AA0150010form1.h_STOCK_UNIT_FLG = {};
expj.AA0150010.AA0150010form1.h_STOCK_UNIT_FLG.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_STOCK_UNIT_FLG.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_STOCK_UNIT_FLG.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_STOCK_UNIT_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_STOCK_UNIT_FLG', this);
  });
  expj.AA0150010.AA0150010form1.h_STOCK_UNIT_FLG.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_STOCK_UNIT_FLG.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_STOCK_UNIT_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_STOCK_UNIT_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_STOCK_UNIT" name="h_STOCK_UNIT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_STOCK_UNIT()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_STOCK_UNIT">
expj.AA0150010.AA0150010form1.h_STOCK_UNIT = {};
expj.AA0150010.AA0150010form1.h_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_STOCK_UNIT.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_STOCK_UNIT', this);
  });
  expj.AA0150010.AA0150010form1.h_STOCK_UNIT.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_PKG_UNIT" name="h_PKG_UNIT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_PKG_UNIT()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_PKG_UNIT">
expj.AA0150010.AA0150010form1.h_PKG_UNIT = {};
expj.AA0150010.AA0150010form1.h_PKG_UNIT.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_PKG_UNIT.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_PKG_UNIT.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_PKG_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_PKG_UNIT', this);
  });
  expj.AA0150010.AA0150010form1.h_PKG_UNIT.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_PKG_UNIT.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_PKG_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_PKG_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_PKG_UNIT_QTY" name="h_PKG_UNIT_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_PKG_UNIT_QTY()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_PKG_UNIT_QTY">
expj.AA0150010.AA0150010form1.h_PKG_UNIT_QTY = {};
expj.AA0150010.AA0150010form1.h_PKG_UNIT_QTY.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_PKG_UNIT_QTY.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_PKG_UNIT_QTY.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_PKG_UNIT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_PKG_UNIT_QTY', this);
  });
  expj.AA0150010.AA0150010form1.h_PKG_UNIT_QTY.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_PKG_UNIT_QTY.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_PKG_UNIT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_PKG_UNIT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_UNIT_QTY_TYP" name="h_UNIT_QTY_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_UNIT_QTY_TYP()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_UNIT_QTY_TYP">
expj.AA0150010.AA0150010form1.h_UNIT_QTY_TYP = {};
expj.AA0150010.AA0150010form1.h_UNIT_QTY_TYP.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_UNIT_QTY_TYP.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_UNIT_QTY_TYP.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_UNIT_QTY_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_UNIT_QTY_TYP', this);
  });
  expj.AA0150010.AA0150010form1.h_UNIT_QTY_TYP.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_UNIT_QTY_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_UNIT_QTY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_UNIT_QTY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_ODR_LT" name="h_ODR_LT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_ODR_LT()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_ODR_LT">
expj.AA0150010.AA0150010form1.h_ODR_LT = {};
expj.AA0150010.AA0150010form1.h_ODR_LT.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_ODR_LT.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_ODR_LT.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_ODR_LT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_ODR_LT', this);
  });
  expj.AA0150010.AA0150010form1.h_ODR_LT.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_ODR_LT.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_ODR_LT.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_ODR_LT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_FIXED_LT" name="h_FIXED_LT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_FIXED_LT()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_FIXED_LT">
expj.AA0150010.AA0150010form1.h_FIXED_LT = {};
expj.AA0150010.AA0150010form1.h_FIXED_LT.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_FIXED_LT.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_FIXED_LT.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_FIXED_LT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_FIXED_LT', this);
  });
  expj.AA0150010.AA0150010form1.h_FIXED_LT.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_FIXED_LT.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_FIXED_LT.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_FIXED_LT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_PROP_LT" name="h_PROP_LT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_PROP_LT()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_PROP_LT">
expj.AA0150010.AA0150010form1.h_PROP_LT = {};
expj.AA0150010.AA0150010form1.h_PROP_LT.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_PROP_LT.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_PROP_LT.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_PROP_LT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_PROP_LT', this);
  });
  expj.AA0150010.AA0150010form1.h_PROP_LT.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_PROP_LT.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_PROP_LT.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_PROP_LT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_SAFETY_LT" name="h_SAFETY_LT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_SAFETY_LT()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_SAFETY_LT">
expj.AA0150010.AA0150010form1.h_SAFETY_LT = {};
expj.AA0150010.AA0150010form1.h_SAFETY_LT.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_SAFETY_LT.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_SAFETY_LT.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_SAFETY_LT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_SAFETY_LT', this);
  });
  expj.AA0150010.AA0150010form1.h_SAFETY_LT.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_SAFETY_LT.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_SAFETY_LT.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_SAFETY_LT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_ISSUE_LT" name="h_ISSUE_LT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_ISSUE_LT()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_ISSUE_LT">
expj.AA0150010.AA0150010form1.h_ISSUE_LT = {};
expj.AA0150010.AA0150010form1.h_ISSUE_LT.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_ISSUE_LT.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_ISSUE_LT.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_ISSUE_LT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_ISSUE_LT', this);
  });
  expj.AA0150010.AA0150010form1.h_ISSUE_LT.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_ISSUE_LT.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_ISSUE_LT.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_ISSUE_LT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_PROP_LOT_SIZE" name="h_PROP_LOT_SIZE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_PROP_LOT_SIZE()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_PROP_LOT_SIZE">
expj.AA0150010.AA0150010form1.h_PROP_LOT_SIZE = {};
expj.AA0150010.AA0150010form1.h_PROP_LOT_SIZE.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_PROP_LOT_SIZE.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_PROP_LOT_SIZE.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_PROP_LOT_SIZE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_PROP_LOT_SIZE', this);
  });
  expj.AA0150010.AA0150010form1.h_PROP_LOT_SIZE.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_PROP_LOT_SIZE.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_PROP_LOT_SIZE.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_PROP_LOT_SIZE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_ITEM_SPOIL" name="h_ITEM_SPOIL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_ITEM_SPOIL()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_ITEM_SPOIL">
expj.AA0150010.AA0150010form1.h_ITEM_SPOIL = {};
expj.AA0150010.AA0150010form1.h_ITEM_SPOIL.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_ITEM_SPOIL.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_ITEM_SPOIL.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_ITEM_SPOIL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_ITEM_SPOIL', this);
  });
  expj.AA0150010.AA0150010form1.h_ITEM_SPOIL.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_ITEM_SPOIL.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_ITEM_SPOIL.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_ITEM_SPOIL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_SAFETY_STOCK" name="h_SAFETY_STOCK" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_SAFETY_STOCK()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_SAFETY_STOCK">
expj.AA0150010.AA0150010form1.h_SAFETY_STOCK = {};
expj.AA0150010.AA0150010form1.h_SAFETY_STOCK.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_SAFETY_STOCK.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_SAFETY_STOCK.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_SAFETY_STOCK').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_SAFETY_STOCK', this);
  });
  expj.AA0150010.AA0150010form1.h_SAFETY_STOCK.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_SAFETY_STOCK.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_SAFETY_STOCK.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_SAFETY_STOCK');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_LOT_SIZING_TYP" name="h_LOT_SIZING_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_LOT_SIZING_TYP()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_LOT_SIZING_TYP">
expj.AA0150010.AA0150010form1.h_LOT_SIZING_TYP = {};
expj.AA0150010.AA0150010form1.h_LOT_SIZING_TYP.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_LOT_SIZING_TYP.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_LOT_SIZING_TYP.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_LOT_SIZING_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_LOT_SIZING_TYP', this);
  });
  expj.AA0150010.AA0150010form1.h_LOT_SIZING_TYP.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_LOT_SIZING_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_LOT_SIZING_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_LOT_SIZING_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_MAX_PERIOD" name="h_MAX_PERIOD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_MAX_PERIOD()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_MAX_PERIOD">
expj.AA0150010.AA0150010form1.h_MAX_PERIOD = {};
expj.AA0150010.AA0150010form1.h_MAX_PERIOD.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_MAX_PERIOD.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_MAX_PERIOD.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_MAX_PERIOD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_MAX_PERIOD', this);
  });
  expj.AA0150010.AA0150010form1.h_MAX_PERIOD.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_MAX_PERIOD.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_MAX_PERIOD.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_MAX_PERIOD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_MAX_ODR_QTY" name="h_MAX_ODR_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_MAX_ODR_QTY()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_MAX_ODR_QTY">
expj.AA0150010.AA0150010form1.h_MAX_ODR_QTY = {};
expj.AA0150010.AA0150010form1.h_MAX_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_MAX_ODR_QTY.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_MAX_ODR_QTY.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_MAX_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_MAX_ODR_QTY', this);
  });
  expj.AA0150010.AA0150010form1.h_MAX_ODR_QTY.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_MAX_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_MAX_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_MAX_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_ODR_POINT" name="h_ODR_POINT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_ODR_POINT()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_ODR_POINT">
expj.AA0150010.AA0150010form1.h_ODR_POINT = {};
expj.AA0150010.AA0150010form1.h_ODR_POINT.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_ODR_POINT.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_ODR_POINT.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_ODR_POINT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_ODR_POINT', this);
  });
  expj.AA0150010.AA0150010form1.h_ODR_POINT.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_ODR_POINT.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_ODR_POINT.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_ODR_POINT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_FIXED_ODR_QTY" name="h_FIXED_ODR_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_FIXED_ODR_QTY()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_FIXED_ODR_QTY">
expj.AA0150010.AA0150010form1.h_FIXED_ODR_QTY = {};
expj.AA0150010.AA0150010form1.h_FIXED_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_FIXED_ODR_QTY.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_FIXED_ODR_QTY.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_FIXED_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_FIXED_ODR_QTY', this);
  });
  expj.AA0150010.AA0150010form1.h_FIXED_ODR_QTY.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_FIXED_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_FIXED_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_FIXED_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_MIN_ODR_QTY" name="h_MIN_ODR_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_MIN_ODR_QTY()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_MIN_ODR_QTY">
expj.AA0150010.AA0150010form1.h_MIN_ODR_QTY = {};
expj.AA0150010.AA0150010form1.h_MIN_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_MIN_ODR_QTY.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_MIN_ODR_QTY.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_MIN_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_MIN_ODR_QTY', this);
  });
  expj.AA0150010.AA0150010form1.h_MIN_ODR_QTY.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_MIN_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_MIN_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_MIN_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_MUL_ODR_QTY" name="h_MUL_ODR_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_MUL_ODR_QTY()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_MUL_ODR_QTY">
expj.AA0150010.AA0150010form1.h_MUL_ODR_QTY = {};
expj.AA0150010.AA0150010form1.h_MUL_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_MUL_ODR_QTY.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_MUL_ODR_QTY.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_MUL_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_MUL_ODR_QTY', this);
  });
  expj.AA0150010.AA0150010form1.h_MUL_ODR_QTY.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_MUL_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_MUL_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_MUL_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_ISSUE_TYP" name="h_ISSUE_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_ISSUE_TYP()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_ISSUE_TYP">
expj.AA0150010.AA0150010form1.h_ISSUE_TYP = {};
expj.AA0150010.AA0150010form1.h_ISSUE_TYP.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_ISSUE_TYP.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_ISSUE_TYP.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_ISSUE_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_ISSUE_TYP', this);
  });
  expj.AA0150010.AA0150010form1.h_ISSUE_TYP.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_ISSUE_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_ISSUE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_ISSUE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_MPS_FLG" name="h_MPS_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_MPS_FLG()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_MPS_FLG">
expj.AA0150010.AA0150010form1.h_MPS_FLG = {};
expj.AA0150010.AA0150010form1.h_MPS_FLG.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_MPS_FLG.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_MPS_FLG.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_MPS_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_MPS_FLG', this);
  });
  expj.AA0150010.AA0150010form1.h_MPS_FLG.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_MPS_FLG.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_MPS_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_MPS_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_ACPT_INSPC_TYP" name="h_ACPT_INSPC_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_ACPT_INSPC_TYP()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_ACPT_INSPC_TYP">
expj.AA0150010.AA0150010form1.h_ACPT_INSPC_TYP = {};
expj.AA0150010.AA0150010form1.h_ACPT_INSPC_TYP.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_ACPT_INSPC_TYP.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_ACPT_INSPC_TYP.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_ACPT_INSPC_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_ACPT_INSPC_TYP', this);
  });
  expj.AA0150010.AA0150010form1.h_ACPT_INSPC_TYP.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_ACPT_INSPC_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_ACPT_INSPC_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_ACPT_INSPC_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_PRODUCT_TYP" name="h_PRODUCT_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_PRODUCT_TYP()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_PRODUCT_TYP">
expj.AA0150010.AA0150010form1.h_PRODUCT_TYP = {};
expj.AA0150010.AA0150010form1.h_PRODUCT_TYP.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_PRODUCT_TYP.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_PRODUCT_TYP.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_PRODUCT_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_PRODUCT_TYP', this);
  });
  expj.AA0150010.AA0150010form1.h_PRODUCT_TYP.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_PRODUCT_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_PRODUCT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_PRODUCT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_CLASIFICATION_CD" name="h_CLASIFICATION_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_CLASIFICATION_CD()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_CLASIFICATION_CD">
expj.AA0150010.AA0150010form1.h_CLASIFICATION_CD = {};
expj.AA0150010.AA0150010form1.h_CLASIFICATION_CD.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_CLASIFICATION_CD.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_CLASIFICATION_CD.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_CLASIFICATION_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_CLASIFICATION_CD', this);
  });
  expj.AA0150010.AA0150010form1.h_CLASIFICATION_CD.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_CLASIFICATION_CD.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_CLASIFICATION_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_CLASIFICATION_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_UNIT_WEIGHT" name="h_UNIT_WEIGHT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_UNIT_WEIGHT()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_UNIT_WEIGHT">
expj.AA0150010.AA0150010form1.h_UNIT_WEIGHT = {};
expj.AA0150010.AA0150010form1.h_UNIT_WEIGHT.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_UNIT_WEIGHT.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_UNIT_WEIGHT.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_UNIT_WEIGHT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_UNIT_WEIGHT', this);
  });
  expj.AA0150010.AA0150010form1.h_UNIT_WEIGHT.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_UNIT_WEIGHT.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_UNIT_WEIGHT.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_UNIT_WEIGHT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_ABC_TYP" name="h_ABC_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_ABC_TYP()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_ABC_TYP">
expj.AA0150010.AA0150010form1.h_ABC_TYP = {};
expj.AA0150010.AA0150010form1.h_ABC_TYP.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_ABC_TYP.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_ABC_TYP.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_ABC_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_ABC_TYP', this);
  });
  expj.AA0150010.AA0150010form1.h_ABC_TYP.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_ABC_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_ABC_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_ABC_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_OPR_RSLT_TYP" name="h_OPR_RSLT_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_OPR_RSLT_TYP()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_OPR_RSLT_TYP">
expj.AA0150010.AA0150010form1.h_OPR_RSLT_TYP = {};
expj.AA0150010.AA0150010form1.h_OPR_RSLT_TYP.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_OPR_RSLT_TYP.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_OPR_RSLT_TYP.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_OPR_RSLT_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_OPR_RSLT_TYP', this);
  });
  expj.AA0150010.AA0150010form1.h_OPR_RSLT_TYP.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_OPR_RSLT_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_OPR_RSLT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_OPR_RSLT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_SPL_ITEM_TYP" name="h_SPL_ITEM_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_SPL_ITEM_TYP()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_SPL_ITEM_TYP">
expj.AA0150010.AA0150010form1.h_SPL_ITEM_TYP = {};
expj.AA0150010.AA0150010form1.h_SPL_ITEM_TYP.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_SPL_ITEM_TYP.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_SPL_ITEM_TYP.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_SPL_ITEM_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_SPL_ITEM_TYP', this);
  });
  expj.AA0150010.AA0150010form1.h_SPL_ITEM_TYP.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_SPL_ITEM_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_SPL_ITEM_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_SPL_ITEM_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_TAX_CD" name="h_TAX_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_TAX_CD()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_TAX_CD">
expj.AA0150010.AA0150010form1.h_TAX_CD = {};
expj.AA0150010.AA0150010form1.h_TAX_CD.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_TAX_CD.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_TAX_CD.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_TAX_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_TAX_CD', this);
  });
  expj.AA0150010.AA0150010form1.h_TAX_CD.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_TAX_CD.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_TAX_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_TAX_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_WH_CD" name="h_WH_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_WH_CD()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_WH_CD">
expj.AA0150010.AA0150010form1.h_WH_CD = {};
expj.AA0150010.AA0150010form1.h_WH_CD.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_WH_CD.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_WH_CD.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_WH_CD', this);
  });
  expj.AA0150010.AA0150010form1.h_WH_CD.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_WH_CD.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_CAL_NO" name="h_CAL_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_CAL_NO()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_CAL_NO">
expj.AA0150010.AA0150010form1.h_CAL_NO = {};
expj.AA0150010.AA0150010form1.h_CAL_NO.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_CAL_NO.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_CAL_NO.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_CAL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_CAL_NO', this);
  });
  expj.AA0150010.AA0150010form1.h_CAL_NO.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_CAL_NO.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_CAL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_CAL_NO');
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
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_DEPT_CD" name="h_DEPT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_DEPT_CD()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_DEPT_CD">
expj.AA0150010.AA0150010form1.h_DEPT_CD = {};
expj.AA0150010.AA0150010form1.h_DEPT_CD.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_DEPT_CD.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_DEPT_CD.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_DEPT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_DEPT_CD', this);
  });
  expj.AA0150010.AA0150010form1.h_DEPT_CD.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_DEPT_CD.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_DEPT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_DEPT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_PJ_CD" name="h_PJ_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_PJ_CD()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_PJ_CD">
expj.AA0150010.AA0150010form1.h_PJ_CD = {};
expj.AA0150010.AA0150010form1.h_PJ_CD.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_PJ_CD.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_PJ_CD.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_PJ_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_PJ_CD', this);
  });
  expj.AA0150010.AA0150010form1.h_PJ_CD.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_PJ_CD.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_PJ_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_PJ_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_SEG_CONTENTS_1" name="h_SEG_CONTENTS_1" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_SEG_CONTENTS_1()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_SEG_CONTENTS_1">
expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_1 = {};
expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_1.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_SEG_CONTENTS_1.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_1.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_SEG_CONTENTS_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_SEG_CONTENTS_1', this);
  });
  expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_1.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_1.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_SEG_CONTENTS_1.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_SEG_CONTENTS_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_SEG_CONTENTS_2" name="h_SEG_CONTENTS_2" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_SEG_CONTENTS_2()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_SEG_CONTENTS_2">
expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_2 = {};
expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_2.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_SEG_CONTENTS_2.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_2.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_SEG_CONTENTS_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_SEG_CONTENTS_2', this);
  });
  expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_2.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_2.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_SEG_CONTENTS_2.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_SEG_CONTENTS_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_SEG_CONTENTS_3" name="h_SEG_CONTENTS_3" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_SEG_CONTENTS_3()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_SEG_CONTENTS_3">
expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_3 = {};
expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_3.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_SEG_CONTENTS_3.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_3.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_SEG_CONTENTS_3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_SEG_CONTENTS_3', this);
  });
  expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_3.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_3.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_SEG_CONTENTS_3.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_SEG_CONTENTS_3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0150010-AA0150010form1-h_SEG_CONTENTS_4" name="h_SEG_CONTENTS_4" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0150010Struct.geth_SEG_CONTENTS_4()) %>">
<script class="expj-script-AA0150010-AA0150010form1-h_SEG_CONTENTS_4">
expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_4 = {};
expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_4.executeAllOnDecision = function () {
  console.log('execute AA0150010form1/h_SEG_CONTENTS_4.onDecision');
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
  expj.AA0150010.executeAllOnDecision();
};
expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_4.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010form1-h_SEG_CONTENTS_4').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0150010', 'AA0150010form1', 'h_SEG_CONTENTS_4', this);
  });
  expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_4.executePScriptOnLoad();
};

expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_4.executePScriptOnLoad = function () {
  console.log('execute AA0150010form1/h_SEG_CONTENTS_4.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010form1-h_SEG_CONTENTS_4');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 387px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0150010-AA0150010button1">
expj.AA0150010.AA0150010button1 = {};
expj.AA0150010.AA0150010button1.executeAllOnDecision = function () {
  console.log('execute AA0150010button1.onDecision');
};
expj.AA0150010.AA0150010button1.executeOnLoad = function () {
  expj.AA0150010.AA0150010button1.executePScriptOnLoad();
};

expj.AA0150010.AA0150010button1.executePScriptOnLoad = function () {
  console.log('execute AA0150010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0150010-AA0150010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0150010-AA0150010button1-CsvImport">
expj.AA0150010.AA0150010button1.CsvImport = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0150010form1/*,_AA0150010form2/*,_AA0150010form3/*@AA0150010Servlet"
expj.AA0150010.AA0150010button1.CsvImport.onClick0 = function () {
  console.log('CsvImport script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0150010', 'AA0150010button1', '_AA0150010form1/*,_AA0150010form2/*,_AA0150010form3/*', 'AA0150010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0150010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0150010', response);
expj.common.changeBusinessScreenTab('AA0150010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0150010.AA0150010button1.CsvImport.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0150010.AA0150010button1.CsvImport['onClick' + i])) {
        expj.AA0150010.AA0150010button1.CsvImport['onClick' + i]();
      }
    }
  }
};
expj.AA0150010.AA0150010button1.CsvImport.executeAllOnDecision = function () {
};
expj.AA0150010.AA0150010button1.CsvImport.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010button1-CsvImport').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0150010', 'AA0150010button1', 'CsvImport', this, 'Button');
    }
  });
  expj.AA0150010.AA0150010button1.CsvImport.executePScriptOnLoad();
};

expj.AA0150010.AA0150010button1.CsvImport.executePScriptOnLoad = function () {
  console.log('execute AA0150010button1/CsvImport.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010button1-CsvImport');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0150010-AA0150010button1-CsvImport" name="CsvImport" class="AA0150010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvImport",rb)%></button><!-- CSV取込ボタン --></div><!--/td-->
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
<span class="version">AA0150010 Revision: 1.1.1.1  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AA0150010-AA0150010button0">
expj.AA0150010.AA0150010button0 = {};
expj.AA0150010.AA0150010button0.executeAllOnDecision = function () {
  console.log('execute AA0150010button0.onDecision');
};
expj.AA0150010.AA0150010button0.executeOnLoad = function () {
  expj.AA0150010.AA0150010button0.executePScriptOnLoad();
};

expj.AA0150010.AA0150010button0.executePScriptOnLoad = function () {
  console.log('execute AA0150010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0150010-AA0150010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0150010-AA0150010button0-Clear">
expj.AA0150010.AA0150010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0150010form1/*@AA0150010Servlet,,$ZZ07008"
expj.AA0150010.AA0150010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0150010', 'AA0150010button0', '_AA0150010form1/*', 'AA0150010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0150010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0150010', response);
expj.common.updateBusinessScreenTab('AA0150010', contents);
};
expj.common.pscript.callConfirm('AA0150010', 'AA0150010button0', 'ZZ07008', okEvent);
};
expj.AA0150010.AA0150010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0150010.AA0150010button0.Clear['onClick' + i])) {
        expj.AA0150010.AA0150010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AA0150010.AA0150010button0.Clear.executeAllOnDecision = function () {
};
expj.AA0150010.AA0150010button0.Clear.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0150010', 'AA0150010button0', 'Clear', this, 'Button');
    }
  });
  expj.AA0150010.AA0150010button0.Clear.executePScriptOnLoad();
};

expj.AA0150010.AA0150010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AA0150010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0150010-AA0150010button0-Clear" name="Clear" class="AA0150010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AA0150010-AA0150010button0-Close">
expj.AA0150010.AA0150010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AA0150010.AA0150010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AA0150010');
};
expj.AA0150010.AA0150010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0150010.AA0150010button0.Close['onClick' + i])) {
        expj.AA0150010.AA0150010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AA0150010.AA0150010button0.Close.executeAllOnDecision = function () {
};
expj.AA0150010.AA0150010button0.Close.executeOnLoad = function () {
  $('#expj-AA0150010-AA0150010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0150010', 'AA0150010button0', 'Close', this, 'Button');
    }
  });
  expj.AA0150010.AA0150010button0.Close.executePScriptOnLoad();
};

expj.AA0150010.AA0150010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AA0150010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AA0150010-AA0150010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0150010-AA0150010button0-Close" name="Close" class="AA0150010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0150010 (END)-->
<%
MessageStruct msgStruct = aAA0150010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0150010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0150010)) {
  expj.common.treeInstanceMap.AA0150010 = {};
}
expj.common.treeInstanceMap.AA0150010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0150010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0150010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0150010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0150010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0150010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0150010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0150010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0150010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0150010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0150010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0150010)) {
  expj.common.detailDialogMap.AA0150010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0150010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0150010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0150010.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0150010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0150010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0150010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0150010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0150010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0150010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0150010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0150010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0150010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0150010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0150010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0150010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0150010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0150010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0150010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0150010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0150010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0150010)) {
  expj.common.viewInstanceMap.AA0150010 = {};
}
expj.common.viewInstanceMap.AA0150010.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0150010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0150010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0150010.<%=viewId %>.init = function () {
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
    expj.AA0150010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0150010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0150010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0150010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0150010_init">
/**
 * AA0150010用のロード完了時初期化関数
 */
expj.AA0150010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0150010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0150010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0150010');
  expj.common.calendarInstanceMap.AA0150010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0150010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0150010.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0150010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0150010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0150010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0150010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0150010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0150010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0150010-<%=detailId %>');
<%
 }
%>
  try{expj.AA0150010.AA0150010form1.rdoInsert.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.rdoUpdate.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.rdoDelete.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.DO_CHK.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_SYORI_KUBUN.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_DRAW_CD.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_SPEC.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_HIGH_LEVEL_NO.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_MRP_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_OUTSIDE_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_STOCK_UNIT_FLG.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_PKG_UNIT.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_PKG_UNIT_QTY.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_UNIT_QTY_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_ODR_LT.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_FIXED_LT.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_PROP_LT.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_SAFETY_LT.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_ISSUE_LT.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_PROP_LOT_SIZE.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_ITEM_SPOIL.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_SAFETY_STOCK.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_LOT_SIZING_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_MAX_PERIOD.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_MAX_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_ODR_POINT.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_FIXED_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_MIN_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_MUL_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_ISSUE_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_MPS_FLG.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_ACPT_INSPC_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_PRODUCT_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_CLASIFICATION_CD.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_UNIT_WEIGHT.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_ABC_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_OPR_RSLT_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_SPL_ITEM_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_TAX_CD.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_WH_CD.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_CAL_NO.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_DEPT_CD.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_PJ_CD.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_1.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_2.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_3.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.h_SEG_CONTENTS_4.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010button1.CsvImport.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010form1.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010button1.executeOnLoad();}catch(e){};
  try{expj.AA0150010.AA0150010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0150010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0150010', 'AA0150010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0150010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0150010-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0150010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0150010', '<%=request.getContextPath() %>');
};

/**
 * AA0150010の全体onDecision処理
 */
expj.AA0150010.executeAllOnDecision = function () {
  expj.AA0150010.AA0150010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0150010_console">
expj.AA0150010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>