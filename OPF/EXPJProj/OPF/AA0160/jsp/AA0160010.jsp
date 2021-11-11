<%-- ***
This file is generated
 GeneratedDate  : Thu Feb 16 17:45:14 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0160\AA0160010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0160.*" %>
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
<jsp:useBean id="aAA0160010Control" class="com.nec.jp.orteus.metamorBase.AA0160.AA0160010Control" scope="request"/>
<jsp:useBean id="aAA0160010Struct" class="com.nec.jp.orteus.metamorBase.AA0160.AA0160010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

製品構成データ取込処理
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0160/jsp/AA0160010.jsp,v $
$Author: geng-jia $	
$Revision: 1.6 $ $Date: 2017/02/22 02:04:08 $
********************************************************* --%>
<html>
<head>
<title>製品構成データ取込処理</title>
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
<script class="expj-script-AA0160010_init">
  // AA0160010名前空間
  expj.AA0160010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AA0160010" data-screen="AA0160010" data-newdata="<%=aAA0160010Control.isNewData() %>">
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
              <script class="expj-script-AA0160010-AA0160010form1">
expj.AA0160010.AA0160010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AA0160010.AA0160010form1.onLoad0 = function () {
  console.log('AA0160010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AA0160010.AA0160010form1.onDecision0 = function () {
  console.log('AA0160010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AA0160010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AA0160010button1/CsvIn"
expj.AA0160010.AA0160010form1.child0 = function () {
  console.log('AA0160010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AA0160010', 'AA0160010form1', '_AA0160010button1/CsvIn');
};
// script4="child;1;MASK;_AA0160010button1/CsvIn"
expj.AA0160010.AA0160010form1.child1 = function () {
  console.log('AA0160010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AA0160010', 'AA0160010form1', '_AA0160010button1/CsvIn');
};
// script5="onDecision;1;CHKRQ;B@*6,*7"
expj.AA0160010.AA0160010form1.onDecision1 = function () {
  console.log('AA0160010form1 script5');
if (expj.common.pscript.satisfiedRequiredComponent('AA0160010', 'B')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script6="child;2;UNMASK;_AA0160010button1/CsvIn"
expj.AA0160010.AA0160010form1.child2 = function () {
  console.log('AA0160010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AA0160010', 'AA0160010form1', '_AA0160010button1/CsvIn');
};
// script7="child;3;MASK;_AA0160010button1/CsvIn"
expj.AA0160010.AA0160010form1.child3 = function () {
  console.log('AA0160010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AA0160010', 'AA0160010form1', '_AA0160010button1/CsvIn');
};
expj.AA0160010.AA0160010form1.executeAllOnDecision = function () {
  console.log('execute AA0160010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0160010.AA0160010form1['onDecision' + i])) {
        expj.AA0160010.AA0160010form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0160010.AA0160010form1.executeOnLoad = function () {
  expj.AA0160010.AA0160010form1.executePScriptOnLoad();
};

expj.AA0160010.AA0160010form1.executePScriptOnLoad = function () {
  console.log('execute AA0160010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0160010.AA0160010form1['onLoad' + i])) {
      expj.AA0160010.AA0160010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0160010-AA0160010form1" action="AA0160010Servlet" name="AA0160010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<script class="expj-script-AA0160010-AA0160010form1-rdoInsert">
expj.AA0160010.AA0160010form1.rdoInsert = {};
expj.AA0160010.AA0160010form1.rdoInsert.executeAllOnDecision = function () {
  console.log('execute AA0160010form1/rdoInsert.onDecision');
  expj.AA0160010.AA0160010form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160010form1.rdoInsert.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160010form1-rdoInsert').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0160010', 'AA0160010form1', 'rdoInsert', this, 'RadioButton');
    }
  });
  expj.AA0160010.AA0160010form1.rdoInsert.executePScriptOnLoad();
};

expj.AA0160010.AA0160010form1.rdoInsert.executePScriptOnLoad = function () {
  console.log('execute AA0160010form1/rdoInsert.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160010form1-rdoInsert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoPlantTyp" data-name="rdoInsert" value="true" <%= ("true".equals(TypeConverter.convert(aAA0160010Struct.getrdoInsert())) || "".equals(TypeConverter.convert(aAA0160010Struct.getrdoInsert())))?"checked=\"checked\"": "" %> class="" id="expj-AA0160010-AA0160010form1-rdoInsert" ><label for="expj-AA0160010-AA0160010form1-rdoInsert"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></label></div><!--/td-->
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
<script class="expj-script-AA0160010-AA0160010form1-rdoUpdate">
expj.AA0160010.AA0160010form1.rdoUpdate = {};
expj.AA0160010.AA0160010form1.rdoUpdate.executeAllOnDecision = function () {
  console.log('execute AA0160010form1/rdoUpdate.onDecision');
  expj.AA0160010.AA0160010form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160010form1.rdoUpdate.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160010form1-rdoUpdate').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0160010', 'AA0160010form1', 'rdoUpdate', this, 'RadioButton');
    }
  });
  expj.AA0160010.AA0160010form1.rdoUpdate.executePScriptOnLoad();
};

expj.AA0160010.AA0160010form1.rdoUpdate.executePScriptOnLoad = function () {
  console.log('execute AA0160010form1/rdoUpdate.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160010form1-rdoUpdate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoPlantTyp" data-name="rdoUpdate" value="true" <%= ("true".equals(TypeConverter.convert(aAA0160010Struct.getrdoUpdate())))?"checked=\"checked\"":"" %> class="" id="expj-AA0160010-AA0160010form1-rdoUpdate" ><label for="expj-AA0160010-AA0160010form1-rdoUpdate"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></label></div><!--/td-->
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
<script class="expj-script-AA0160010-AA0160010form1-rdoDelete">
expj.AA0160010.AA0160010form1.rdoDelete = {};
expj.AA0160010.AA0160010form1.rdoDelete.executeAllOnDecision = function () {
  console.log('execute AA0160010form1/rdoDelete.onDecision');
  expj.AA0160010.AA0160010form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160010form1.rdoDelete.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160010form1-rdoDelete').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0160010', 'AA0160010form1', 'rdoDelete', this, 'RadioButton');
    }
  });
  expj.AA0160010.AA0160010form1.rdoDelete.executePScriptOnLoad();
};

expj.AA0160010.AA0160010form1.rdoDelete.executePScriptOnLoad = function () {
  console.log('execute AA0160010form1/rdoDelete.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160010form1-rdoDelete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoPlantTyp" data-name="rdoDelete" value="true" <%= ("true".equals(TypeConverter.convert(aAA0160010Struct.getrdoDelete())))?"checked=\"checked\"":"" %> class="" id="expj-AA0160010-AA0160010form1-rdoDelete" ><label for="expj-AA0160010-AA0160010form1-rdoDelete"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></label></div><!--/td-->
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
<script class="expj-script-AA0160010-AA0160010form1-DO_CHK">
expj.AA0160010.AA0160010form1.DO_CHK = {};
expj.AA0160010.AA0160010form1.DO_CHK.executeAllOnDecision = function () {
  console.log('execute AA0160010form1/DO_CHK.onDecision');
  expj.AA0160010.AA0160010form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160010form1.DO_CHK.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160010form1-DO_CHK').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0160010', 'AA0160010form1', 'DO_CHK', this, 'CheckBox');
    }
  });
  expj.AA0160010.AA0160010form1.DO_CHK.executePScriptOnLoad();
};

expj.AA0160010.AA0160010form1.DO_CHK.executePScriptOnLoad = function () {
  console.log('execute AA0160010form1/DO_CHK.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160010form1-DO_CHK');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="DO_CHK" value="true" <%= ("true".equals(TypeConverter.convert(aAA0160010Struct.getDO_CHK())) || "1".equals(TypeConverter.convert(aAA0160010Struct.getDO_CHK())))?"checked=\"checked\"":"" %>  class="AA0160010-focus-move" id="expj-AA0160010-AA0160010form1-DO_CHK"><label for="expj-AA0160010-AA0160010form1-DO_CHK"><%=CoreTools.getRBString("Expj.Cmt3093",rb)%></label></div><!--/td-->
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
<input type="hidden" id="expj-AA0160010-AA0160010form1-h_PARENT_ITEM_CD" name="h_PARENT_ITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0160010Struct.geth_PARENT_ITEM_CD()) %>">
<script class="expj-script-AA0160010-AA0160010form1-h_PARENT_ITEM_CD">
expj.AA0160010.AA0160010form1.h_PARENT_ITEM_CD = {};
expj.AA0160010.AA0160010form1.h_PARENT_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0160010form1/h_PARENT_ITEM_CD.onDecision');
  expj.AA0160010.AA0160010form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160010form1.h_PARENT_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160010form1-h_PARENT_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0160010', 'AA0160010form1', 'h_PARENT_ITEM_CD', this);
  });
  expj.AA0160010.AA0160010form1.h_PARENT_ITEM_CD.executePScriptOnLoad();
};

expj.AA0160010.AA0160010form1.h_PARENT_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0160010form1/h_PARENT_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160010form1-h_PARENT_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0160010-AA0160010form1-h_COMP_ITEM_CD" name="h_COMP_ITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0160010Struct.geth_COMP_ITEM_CD()) %>">
<script class="expj-script-AA0160010-AA0160010form1-h_COMP_ITEM_CD">
expj.AA0160010.AA0160010form1.h_COMP_ITEM_CD = {};
expj.AA0160010.AA0160010form1.h_COMP_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0160010form1/h_COMP_ITEM_CD.onDecision');
  expj.AA0160010.AA0160010form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160010form1.h_COMP_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160010form1-h_COMP_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0160010', 'AA0160010form1', 'h_COMP_ITEM_CD', this);
  });
  expj.AA0160010.AA0160010form1.h_COMP_ITEM_CD.executePScriptOnLoad();
};

expj.AA0160010.AA0160010form1.h_COMP_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0160010form1/h_COMP_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160010form1-h_COMP_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0160010-AA0160010form1-h_PS_EDITION" name="h_PS_EDITION" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0160010Struct.geth_PS_EDITION()) %>">
<script class="expj-script-AA0160010-AA0160010form1-h_PS_EDITION">
expj.AA0160010.AA0160010form1.h_PS_EDITION = {};
expj.AA0160010.AA0160010form1.h_PS_EDITION.executeAllOnDecision = function () {
  console.log('execute AA0160010form1/h_PS_EDITION.onDecision');
  expj.AA0160010.AA0160010form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160010form1.h_PS_EDITION.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160010form1-h_PS_EDITION').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0160010', 'AA0160010form1', 'h_PS_EDITION', this);
  });
  expj.AA0160010.AA0160010form1.h_PS_EDITION.executePScriptOnLoad();
};

expj.AA0160010.AA0160010form1.h_PS_EDITION.executePScriptOnLoad = function () {
  console.log('execute AA0160010form1/h_PS_EDITION.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160010form1-h_PS_EDITION');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0160010-AA0160010form1-h_PS_UNIT_DENOMINATOR" name="h_PS_UNIT_DENOMINATOR" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0160010Struct.geth_PS_UNIT_DENOMINATOR()) %>">
<script class="expj-script-AA0160010-AA0160010form1-h_PS_UNIT_DENOMINATOR">
expj.AA0160010.AA0160010form1.h_PS_UNIT_DENOMINATOR = {};
expj.AA0160010.AA0160010form1.h_PS_UNIT_DENOMINATOR.executeAllOnDecision = function () {
  console.log('execute AA0160010form1/h_PS_UNIT_DENOMINATOR.onDecision');
  expj.AA0160010.AA0160010form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160010form1.h_PS_UNIT_DENOMINATOR.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160010form1-h_PS_UNIT_DENOMINATOR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0160010', 'AA0160010form1', 'h_PS_UNIT_DENOMINATOR', this);
  });
  expj.AA0160010.AA0160010form1.h_PS_UNIT_DENOMINATOR.executePScriptOnLoad();
};

expj.AA0160010.AA0160010form1.h_PS_UNIT_DENOMINATOR.executePScriptOnLoad = function () {
  console.log('execute AA0160010form1/h_PS_UNIT_DENOMINATOR.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160010form1-h_PS_UNIT_DENOMINATOR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0160010-AA0160010form1-h_PS_UNIT_NUMERATOR" name="h_PS_UNIT_NUMERATOR" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0160010Struct.geth_PS_UNIT_NUMERATOR()) %>">
<script class="expj-script-AA0160010-AA0160010form1-h_PS_UNIT_NUMERATOR">
expj.AA0160010.AA0160010form1.h_PS_UNIT_NUMERATOR = {};
expj.AA0160010.AA0160010form1.h_PS_UNIT_NUMERATOR.executeAllOnDecision = function () {
  console.log('execute AA0160010form1/h_PS_UNIT_NUMERATOR.onDecision');
  expj.AA0160010.AA0160010form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160010form1.h_PS_UNIT_NUMERATOR.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160010form1-h_PS_UNIT_NUMERATOR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0160010', 'AA0160010form1', 'h_PS_UNIT_NUMERATOR', this);
  });
  expj.AA0160010.AA0160010form1.h_PS_UNIT_NUMERATOR.executePScriptOnLoad();
};

expj.AA0160010.AA0160010form1.h_PS_UNIT_NUMERATOR.executePScriptOnLoad = function () {
  console.log('execute AA0160010form1/h_PS_UNIT_NUMERATOR.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160010form1-h_PS_UNIT_NUMERATOR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0160010-AA0160010form1-h_EFF_PHASE_IN_DATE" name="h_EFF_PHASE_IN_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0160010Struct.geth_EFF_PHASE_IN_DATE()) %>">
<script class="expj-script-AA0160010-AA0160010form1-h_EFF_PHASE_IN_DATE">
expj.AA0160010.AA0160010form1.h_EFF_PHASE_IN_DATE = {};
expj.AA0160010.AA0160010form1.h_EFF_PHASE_IN_DATE.executeAllOnDecision = function () {
  console.log('execute AA0160010form1/h_EFF_PHASE_IN_DATE.onDecision');
  expj.AA0160010.AA0160010form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160010form1.h_EFF_PHASE_IN_DATE.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160010form1-h_EFF_PHASE_IN_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0160010', 'AA0160010form1', 'h_EFF_PHASE_IN_DATE', this);
  });
  expj.AA0160010.AA0160010form1.h_EFF_PHASE_IN_DATE.executePScriptOnLoad();
};

expj.AA0160010.AA0160010form1.h_EFF_PHASE_IN_DATE.executePScriptOnLoad = function () {
  console.log('execute AA0160010form1/h_EFF_PHASE_IN_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160010form1-h_EFF_PHASE_IN_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0160010-AA0160010form1-h_EFF_PHASE_OUT_DATE" name="h_EFF_PHASE_OUT_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0160010Struct.geth_EFF_PHASE_OUT_DATE()) %>">
<script class="expj-script-AA0160010-AA0160010form1-h_EFF_PHASE_OUT_DATE">
expj.AA0160010.AA0160010form1.h_EFF_PHASE_OUT_DATE = {};
expj.AA0160010.AA0160010form1.h_EFF_PHASE_OUT_DATE.executeAllOnDecision = function () {
  console.log('execute AA0160010form1/h_EFF_PHASE_OUT_DATE.onDecision');
  expj.AA0160010.AA0160010form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160010form1.h_EFF_PHASE_OUT_DATE.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160010form1-h_EFF_PHASE_OUT_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0160010', 'AA0160010form1', 'h_EFF_PHASE_OUT_DATE', this);
  });
  expj.AA0160010.AA0160010form1.h_EFF_PHASE_OUT_DATE.executePScriptOnLoad();
};

expj.AA0160010.AA0160010form1.h_EFF_PHASE_OUT_DATE.executePScriptOnLoad = function () {
  console.log('execute AA0160010form1/h_EFF_PHASE_OUT_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160010form1-h_EFF_PHASE_OUT_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0160010-AA0160010form1-h_PS_SPOIL" name="h_PS_SPOIL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0160010Struct.geth_PS_SPOIL()) %>">
<script class="expj-script-AA0160010-AA0160010form1-h_PS_SPOIL">
expj.AA0160010.AA0160010form1.h_PS_SPOIL = {};
expj.AA0160010.AA0160010form1.h_PS_SPOIL.executeAllOnDecision = function () {
  console.log('execute AA0160010form1/h_PS_SPOIL.onDecision');
  expj.AA0160010.AA0160010form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160010form1.h_PS_SPOIL.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160010form1-h_PS_SPOIL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0160010', 'AA0160010form1', 'h_PS_SPOIL', this);
  });
  expj.AA0160010.AA0160010form1.h_PS_SPOIL.executePScriptOnLoad();
};

expj.AA0160010.AA0160010form1.h_PS_SPOIL.executePScriptOnLoad = function () {
  console.log('execute AA0160010form1/h_PS_SPOIL.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160010form1-h_PS_SPOIL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0160010-AA0160010form1-h_CONS_TYP" name="h_CONS_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0160010Struct.geth_CONS_TYP()) %>">
<script class="expj-script-AA0160010-AA0160010form1-h_CONS_TYP">
expj.AA0160010.AA0160010form1.h_CONS_TYP = {};
expj.AA0160010.AA0160010form1.h_CONS_TYP.executeAllOnDecision = function () {
  console.log('execute AA0160010form1/h_CONS_TYP.onDecision');
  expj.AA0160010.AA0160010form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160010form1.h_CONS_TYP.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160010form1-h_CONS_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0160010', 'AA0160010form1', 'h_CONS_TYP', this);
  });
  expj.AA0160010.AA0160010form1.h_CONS_TYP.executePScriptOnLoad();
};

expj.AA0160010.AA0160010form1.h_CONS_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0160010form1/h_CONS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160010form1-h_CONS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<input type="hidden" id="expj-AA0160010-AA0160010form1-h_PS_LT_FLG" name="h_PS_LT_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0160010Struct.geth_PS_LT_FLG()) %>">
<script class="expj-script-AA0160010-AA0160010form1-h_PS_LT_FLG">
expj.AA0160010.AA0160010form1.h_PS_LT_FLG = {};
expj.AA0160010.AA0160010form1.h_PS_LT_FLG.executeAllOnDecision = function () {
  console.log('execute AA0160010form1/h_PS_LT_FLG.onDecision');
  expj.AA0160010.AA0160010form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160010form1.h_PS_LT_FLG.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160010form1-h_PS_LT_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0160010', 'AA0160010form1', 'h_PS_LT_FLG', this);
  });
  expj.AA0160010.AA0160010form1.h_PS_LT_FLG.executePScriptOnLoad();
};

expj.AA0160010.AA0160010form1.h_PS_LT_FLG.executePScriptOnLoad = function () {
  console.log('execute AA0160010form1/h_PS_LT_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160010form1-h_PS_LT_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0160010-AA0160010form1-h_PS_FIXED_LT" name="h_PS_FIXED_LT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0160010Struct.geth_PS_FIXED_LT()) %>">
<script class="expj-script-AA0160010-AA0160010form1-h_PS_FIXED_LT">
expj.AA0160010.AA0160010form1.h_PS_FIXED_LT = {};
expj.AA0160010.AA0160010form1.h_PS_FIXED_LT.executeAllOnDecision = function () {
  console.log('execute AA0160010form1/h_PS_FIXED_LT.onDecision');
  expj.AA0160010.AA0160010form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160010form1.h_PS_FIXED_LT.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160010form1-h_PS_FIXED_LT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0160010', 'AA0160010form1', 'h_PS_FIXED_LT', this);
  });
  expj.AA0160010.AA0160010form1.h_PS_FIXED_LT.executePScriptOnLoad();
};

expj.AA0160010.AA0160010form1.h_PS_FIXED_LT.executePScriptOnLoad = function () {
  console.log('execute AA0160010form1/h_PS_FIXED_LT.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160010form1-h_PS_FIXED_LT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0160010-AA0160010form1-h_PS_PROP_LT" name="h_PS_PROP_LT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0160010Struct.geth_PS_PROP_LT()) %>">
<script class="expj-script-AA0160010-AA0160010form1-h_PS_PROP_LT">
expj.AA0160010.AA0160010form1.h_PS_PROP_LT = {};
expj.AA0160010.AA0160010form1.h_PS_PROP_LT.executeAllOnDecision = function () {
  console.log('execute AA0160010form1/h_PS_PROP_LT.onDecision');
  expj.AA0160010.AA0160010form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160010form1.h_PS_PROP_LT.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160010form1-h_PS_PROP_LT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0160010', 'AA0160010form1', 'h_PS_PROP_LT', this);
  });
  expj.AA0160010.AA0160010form1.h_PS_PROP_LT.executePScriptOnLoad();
};

expj.AA0160010.AA0160010form1.h_PS_PROP_LT.executePScriptOnLoad = function () {
  console.log('execute AA0160010form1/h_PS_PROP_LT.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160010form1-h_PS_PROP_LT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0160010-AA0160010form1-h_PS_PROP_LOT_SIZE" name="h_PS_PROP_LOT_SIZE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0160010Struct.geth_PS_PROP_LOT_SIZE()) %>">
<script class="expj-script-AA0160010-AA0160010form1-h_PS_PROP_LOT_SIZE">
expj.AA0160010.AA0160010form1.h_PS_PROP_LOT_SIZE = {};
expj.AA0160010.AA0160010form1.h_PS_PROP_LOT_SIZE.executeAllOnDecision = function () {
  console.log('execute AA0160010form1/h_PS_PROP_LOT_SIZE.onDecision');
  expj.AA0160010.AA0160010form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160010form1.h_PS_PROP_LOT_SIZE.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160010form1-h_PS_PROP_LOT_SIZE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0160010', 'AA0160010form1', 'h_PS_PROP_LOT_SIZE', this);
  });
  expj.AA0160010.AA0160010form1.h_PS_PROP_LOT_SIZE.executePScriptOnLoad();
};

expj.AA0160010.AA0160010form1.h_PS_PROP_LOT_SIZE.executePScriptOnLoad = function () {
  console.log('execute AA0160010form1/h_PS_PROP_LOT_SIZE.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160010form1-h_PS_PROP_LOT_SIZE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0160010-AA0160010form1-h_PS_REF_NO" name="h_PS_REF_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0160010Struct.geth_PS_REF_NO()) %>">
<script class="expj-script-AA0160010-AA0160010form1-h_PS_REF_NO">
expj.AA0160010.AA0160010form1.h_PS_REF_NO = {};
expj.AA0160010.AA0160010form1.h_PS_REF_NO.executeAllOnDecision = function () {
  console.log('execute AA0160010form1/h_PS_REF_NO.onDecision');
  expj.AA0160010.AA0160010form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160010form1.h_PS_REF_NO.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160010form1-h_PS_REF_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0160010', 'AA0160010form1', 'h_PS_REF_NO', this);
  });
  expj.AA0160010.AA0160010form1.h_PS_REF_NO.executePScriptOnLoad();
};

expj.AA0160010.AA0160010form1.h_PS_REF_NO.executePScriptOnLoad = function () {
  console.log('execute AA0160010form1/h_PS_REF_NO.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160010form1-h_PS_REF_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0160010-AA0160010form1-h_COST_UP_TYP" name="h_COST_UP_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0160010Struct.geth_COST_UP_TYP()) %>">
<script class="expj-script-AA0160010-AA0160010form1-h_COST_UP_TYP">
expj.AA0160010.AA0160010form1.h_COST_UP_TYP = {};
expj.AA0160010.AA0160010form1.h_COST_UP_TYP.executeAllOnDecision = function () {
  console.log('execute AA0160010form1/h_COST_UP_TYP.onDecision');
  expj.AA0160010.AA0160010form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160010form1.h_COST_UP_TYP.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160010form1-h_COST_UP_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0160010', 'AA0160010form1', 'h_COST_UP_TYP', this);
  });
  expj.AA0160010.AA0160010form1.h_COST_UP_TYP.executePScriptOnLoad();
};

expj.AA0160010.AA0160010form1.h_COST_UP_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0160010form1/h_COST_UP_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160010form1-h_COST_UP_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0160010-AA0160010form1-h_MRP_EXP_TYP" name="h_MRP_EXP_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0160010Struct.geth_MRP_EXP_TYP()) %>">
<script class="expj-script-AA0160010-AA0160010form1-h_MRP_EXP_TYP">
expj.AA0160010.AA0160010form1.h_MRP_EXP_TYP = {};
expj.AA0160010.AA0160010form1.h_MRP_EXP_TYP.executeAllOnDecision = function () {
  console.log('execute AA0160010form1/h_MRP_EXP_TYP.onDecision');
  expj.AA0160010.AA0160010form1.executeAllOnDecision();
  expj.AA0160010.executeAllOnDecision();
};
expj.AA0160010.AA0160010form1.h_MRP_EXP_TYP.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160010form1-h_MRP_EXP_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0160010', 'AA0160010form1', 'h_MRP_EXP_TYP', this);
  });
  expj.AA0160010.AA0160010form1.h_MRP_EXP_TYP.executePScriptOnLoad();
};

expj.AA0160010.AA0160010form1.h_MRP_EXP_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0160010form1/h_MRP_EXP_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160010form1-h_MRP_EXP_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
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
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 387px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0160010-AA0160010button1">
expj.AA0160010.AA0160010button1 = {};
expj.AA0160010.AA0160010button1.executeAllOnDecision = function () {
  console.log('execute AA0160010button1.onDecision');
};
expj.AA0160010.AA0160010button1.executeOnLoad = function () {
  expj.AA0160010.AA0160010button1.executePScriptOnLoad();
};

expj.AA0160010.AA0160010button1.executePScriptOnLoad = function () {
  console.log('execute AA0160010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0160010-AA0160010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0160010-AA0160010button1-CsvImport">
expj.AA0160010.AA0160010button1.CsvImport = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0160010form1/*,_AA0160010form2/*,_AA0160010form3/*@AA0160010Servlet"
expj.AA0160010.AA0160010button1.CsvImport.onClick0 = function () {
  console.log('CsvImport script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0160010', 'AA0160010button1', '_AA0160010form1/*,_AA0160010form2/*,_AA0160010form3/*', 'AA0160010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0160010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0160010', response);
expj.common.changeBusinessScreenTab('AA0160010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0160010.AA0160010button1.CsvImport.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0160010.AA0160010button1.CsvImport['onClick' + i])) {
        expj.AA0160010.AA0160010button1.CsvImport['onClick' + i]();
      }
    }
  }
};
expj.AA0160010.AA0160010button1.CsvImport.executeAllOnDecision = function () {
};
expj.AA0160010.AA0160010button1.CsvImport.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160010button1-CsvImport').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0160010', 'AA0160010button1', 'CsvImport', this, 'Button');
    }
  });
  expj.AA0160010.AA0160010button1.CsvImport.executePScriptOnLoad();
};

expj.AA0160010.AA0160010button1.CsvImport.executePScriptOnLoad = function () {
  console.log('execute AA0160010button1/CsvImport.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160010button1-CsvImport');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0160010-AA0160010button1-CsvImport" name="CsvImport" class="AA0160010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvImport",rb)%></button><!-- CSV取込ボタン --></div><!--/td-->
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
<span class="version">AA0160010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AA0160010-AA0160010button0">
expj.AA0160010.AA0160010button0 = {};
expj.AA0160010.AA0160010button0.executeAllOnDecision = function () {
  console.log('execute AA0160010button0.onDecision');
};
expj.AA0160010.AA0160010button0.executeOnLoad = function () {
  expj.AA0160010.AA0160010button0.executePScriptOnLoad();
};

expj.AA0160010.AA0160010button0.executePScriptOnLoad = function () {
  console.log('execute AA0160010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0160010-AA0160010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0160010-AA0160010button0-Clear">
expj.AA0160010.AA0160010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0160010form1/*@AA0160010Servlet,,$ZZ07008"
expj.AA0160010.AA0160010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0160010', 'AA0160010button0', '_AA0160010form1/*', 'AA0160010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0160010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0160010', response);
expj.common.updateBusinessScreenTab('AA0160010', contents);
};
expj.common.pscript.callConfirm('AA0160010', 'AA0160010button0', 'ZZ07008', okEvent);
};
expj.AA0160010.AA0160010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0160010.AA0160010button0.Clear['onClick' + i])) {
        expj.AA0160010.AA0160010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AA0160010.AA0160010button0.Clear.executeAllOnDecision = function () {
};
expj.AA0160010.AA0160010button0.Clear.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0160010', 'AA0160010button0', 'Clear', this, 'Button');
    }
  });
  expj.AA0160010.AA0160010button0.Clear.executePScriptOnLoad();
};

expj.AA0160010.AA0160010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AA0160010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0160010-AA0160010button0-Clear" name="Clear" class="AA0160010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AA0160010-AA0160010button0-Close">
expj.AA0160010.AA0160010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AA0160010.AA0160010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AA0160010');
};
expj.AA0160010.AA0160010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0160010.AA0160010button0.Close['onClick' + i])) {
        expj.AA0160010.AA0160010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AA0160010.AA0160010button0.Close.executeAllOnDecision = function () {
};
expj.AA0160010.AA0160010button0.Close.executeOnLoad = function () {
  $('#expj-AA0160010-AA0160010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0160010', 'AA0160010button0', 'Close', this, 'Button');
    }
  });
  expj.AA0160010.AA0160010button0.Close.executePScriptOnLoad();
};

expj.AA0160010.AA0160010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AA0160010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AA0160010-AA0160010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0160010-AA0160010button0-Close" name="Close" class="AA0160010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0160010 (END)-->
<%
MessageStruct msgStruct = aAA0160010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0160010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0160010)) {
  expj.common.treeInstanceMap.AA0160010 = {};
}
expj.common.treeInstanceMap.AA0160010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0160010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0160010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0160010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0160010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0160010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0160010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0160010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0160010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0160010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0160010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0160010)) {
  expj.common.detailDialogMap.AA0160010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0160010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0160010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0160010.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0160010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0160010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0160010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0160010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0160010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0160010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0160010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0160010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0160010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0160010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0160010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0160010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0160010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0160010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0160010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0160010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0160010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0160010)) {
  expj.common.viewInstanceMap.AA0160010 = {};
}
expj.common.viewInstanceMap.AA0160010.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0160010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0160010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0160010.<%=viewId %>.init = function () {
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
    expj.AA0160010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0160010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0160010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0160010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0160010_init">
/**
 * AA0160010用のロード完了時初期化関数
 */
expj.AA0160010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0160010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0160010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0160010');
  expj.common.calendarInstanceMap.AA0160010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0160010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0160010.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0160010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0160010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0160010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0160010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0160010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0160010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0160010-<%=detailId %>');
<%
 }
%>
  try{expj.AA0160010.AA0160010form1.rdoInsert.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010form1.rdoUpdate.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010form1.rdoDelete.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010form1.DO_CHK.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010form1.h_PARENT_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010form1.h_COMP_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010form1.h_PS_EDITION.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010form1.h_PS_UNIT_DENOMINATOR.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010form1.h_PS_UNIT_NUMERATOR.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010form1.h_EFF_PHASE_IN_DATE.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010form1.h_EFF_PHASE_OUT_DATE.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010form1.h_PS_SPOIL.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010form1.h_CONS_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010form1.h_PS_LT_FLG.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010form1.h_PS_FIXED_LT.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010form1.h_PS_PROP_LT.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010form1.h_PS_PROP_LOT_SIZE.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010form1.h_PS_REF_NO.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010form1.h_COST_UP_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010form1.h_MRP_EXP_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010button1.CsvImport.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010form1.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010button1.executeOnLoad();}catch(e){};
  try{expj.AA0160010.AA0160010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0160010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0160010', 'AA0160010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0160010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0160010-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0160010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0160010', '<%=request.getContextPath() %>');
};

/**
 * AA0160010の全体onDecision処理
 */
expj.AA0160010.executeAllOnDecision = function () {
  expj.AA0160010.AA0160010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0160010_console">
expj.AA0160010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>