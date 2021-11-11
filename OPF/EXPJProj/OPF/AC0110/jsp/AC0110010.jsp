<%-- ***
This file is generated
 GeneratedDate  : Mon Feb 20 09:27:28 JST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF.V320\EXPJProj\OPF\AC0110\AC0110010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AC0110.*" %>
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
<jsp:useBean id="aAC0110010Control" class="com.nec.jp.orteus.metamorBase.AC0110.AC0110010Control" scope="request"/>
<jsp:useBean id="aAC0110010Struct" class="com.nec.jp.orteus.metamorBase.AC0110.AC0110010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

製番引当過不足一覧
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0110/jsp/AC0110010.jsp,v $
$Author: geng-jia $	
$Revision: 1.20 $ $Date: 2017/02/22 02:04:31 $
********************************************************* --%>
<html>
<head>
<title>製番引当過不足一覧</title>
<%@include file="common/expj_v5.jsp" %>
<%
ScreenMoveUtil su = new ScreenMoveUtil("AC0100010Servlet", so);
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
<script class="expj-script-AC0110010_init">
  // AC0110010名前空間
  expj.AC0110010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AC0110010" data-screen="AC0110010" data-newdata="<%=aAC0110010Control.isNewData() %>">
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
              <script class="expj-script-AC0110010-AC0110010form1">
expj.AC0110010.AC0110010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2"
expj.AC0110010.AC0110010form1.onLoad0 = function () {
  console.log('AC0110010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script2="onDecision;0;CHKRQ;?AC0110010view1/?[neq]NOT_SELECTED@*0,*2"
expj.AC0110010.AC0110010form1.onDecision0 = function () {
  console.log('AC0110010form1 script2');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?AC0110010view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;0;CHK;?r1_VIEW_TYP[eq]SAME[and]?r2_VIEW_TYP[eq]SAME[and]?ITEM_CD[eq]SAME[and]?DUE_DATE_FROM[eq]SAME[and]?DUE_DATE_TO[eq]SAME[and]?JOB_ODR_CD[eq]SAME[and]?JOB_ODR_CANCEL_NO[eq]SAME[and]?ALC_GRP_CD[eq]SAME[and]?c1_DM_STS_TYP[eq]SAME[and]?c2_DM_STS_TYP[eq]SAME[and]?c3_DM_STS_TYP[eq]SAME@*1,*2"
expj.AC0110010.AC0110010form1.child0 = function () {
  console.log('AC0110010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?r1_VIEW_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?r2_VIEW_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?DUE_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?DUE_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?JOB_ODR_CANCEL_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?ALC_GRP_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?c1_DM_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?c2_DM_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?c3_DM_STS_TYP'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="child;1;UNMASK;_AC0110010button3/JobOdrAlc"
expj.AC0110010.AC0110010form1.child1 = function () {
  console.log('AC0110010form1 script4');
expj.common.pscript.setUnMaskToReferenceComponent('AC0110010', 'AC0110010form1', '_AC0110010button3/JobOdrAlc');
};
// script5="child;2;MASK;_AC0110010button3/JobOdrAlc"
expj.AC0110010.AC0110010form1.child2 = function () {
  console.log('AC0110010form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AC0110010', 'AC0110010form1', '_AC0110010button3/JobOdrAlc');
};
// script6="onDecision;1;CHK;?AC0110010form1/*[eq]NORMAL@*3,*5"
expj.AC0110010.AC0110010form1.onDecision1 = function () {
  console.log('AC0110010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?AC0110010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="child;3;CHK;?r1_VIEW_TYP[eq]SAME[and]?r2_VIEW_TYP[eq]SAME[and]?ITEM_CD[eq]SAME[and]?DUE_DATE_FROM[eq]SAME[and]?DUE_DATE_TO[eq]SAME[and]?JOB_ODR_CD[eq]SAME[and]?JOB_ODR_CANCEL_NO[eq]SAME[and]?ALC_GRP_CD[eq]SAME[and]?c1_DM_STS_TYP[eq]SAME[and]?c2_DM_STS_TYP[eq]SAME[and]?c3_DM_STS_TYP[eq]SAME@*4,*5"
expj.AC0110010.AC0110010form1.child3 = function () {
  console.log('AC0110010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?r1_VIEW_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?r2_VIEW_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?DUE_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?DUE_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?JOB_ODR_CANCEL_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?ALC_GRP_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?c1_DM_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?c2_DM_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '?c3_DM_STS_TYP'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="child;4;UNMASK;_AC0110010button0/CsvOut"
expj.AC0110010.AC0110010form1.child4 = function () {
  console.log('AC0110010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AC0110010', 'AC0110010form1', '_AC0110010button0/CsvOut');
};
// script9="child;5;MASK;_AC0110010button0/CsvOut"
expj.AC0110010.AC0110010form1.child5 = function () {
  console.log('AC0110010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('AC0110010', 'AC0110010form1', '_AC0110010button0/CsvOut');
};
// script10="onDecision;2;CHK;_AC0110010form1/TIME_CTRL[eq]true@*6,*7"
expj.AC0110010.AC0110010form1.onDecision2 = function () {
  console.log('AC0110010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '_AC0110010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script11="child;6;UNMASK;_AC0110010form1/DUE_TIME_FROM,_AC0110010form1/DUE_TIME_TO"
expj.AC0110010.AC0110010form1.child6 = function () {
  console.log('AC0110010form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('AC0110010', 'AC0110010form1', '_AC0110010form1/DUE_TIME_FROM');
expj.common.pscript.setUnMaskToReferenceComponent('AC0110010', 'AC0110010form1', '_AC0110010form1/DUE_TIME_TO');
};
// script12="child;7;MASK;_AC0110010form1/DUE_TIME_FROM,_AC0110010form1/DUE_TIME_TO"
expj.AC0110010.AC0110010form1.child7 = function () {
  console.log('AC0110010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('AC0110010', 'AC0110010form1', '_AC0110010form1/DUE_TIME_FROM');
expj.common.pscript.setMaskToReferenceComponent('AC0110010', 'AC0110010form1', '_AC0110010form1/DUE_TIME_TO');
};
expj.AC0110010.AC0110010form1.executeAllOnDecision = function () {
  console.log('execute AC0110010form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0110010.AC0110010form1['onDecision' + i])) {
        expj.AC0110010.AC0110010form1['onDecision' + i]();
      }
    }
  }
};
expj.AC0110010.AC0110010form1.executeOnLoad = function () {
  expj.AC0110010.AC0110010form1.executePScriptOnLoad();
};

expj.AC0110010.AC0110010form1.executePScriptOnLoad = function () {
  console.log('execute AC0110010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AC0110010.AC0110010form1['onLoad' + i])) {
      expj.AC0110010.AC0110010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AC0110010-AC0110010form1" action="AC0110010Servlet" name="AC0110010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAC0110010Control.getReadStatusString()) %>" style="height:142px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:142px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:96px;align:left"></div>
<div class="div-td" style="width:14px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:18px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:20px;align:"></div>
<div class="div-td" style="width:14px;align:"></div>
<div class="div-td" style="width:20px;align:center"></div>
<div class="div-td" style="width:34px;align:"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:150px;align:right"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:148px;align:right"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0056",rb)%></span><!-- 表示対象 --></div><!--/td-->
<script class="expj-script-AC0110010-AC0110010form1-r1_VIEW_TYP">
expj.AC0110010.AC0110010form1.r1_VIEW_TYP = {};
expj.AC0110010.AC0110010form1.r1_VIEW_TYP.executeAllOnDecision = function () {
  console.log('execute AC0110010form1/r1_VIEW_TYP.onDecision');
  expj.AC0110010.AC0110010form1.executeAllOnDecision();
  expj.AC0110010.executeAllOnDecision();
};
expj.AC0110010.AC0110010form1.r1_VIEW_TYP.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010form1-r1_VIEW_TYP').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0110010', 'AC0110010form1', 'r1_VIEW_TYP', this, 'RadioButton');
    }
  });
  expj.AC0110010.AC0110010form1.r1_VIEW_TYP.executePScriptOnLoad();
};

expj.AC0110010.AC0110010form1.r1_VIEW_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0110010form1/r1_VIEW_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010form1-r1_VIEW_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:96px;text-align:left;"><input type="radio" name="r_MRP_ODR_TYP" data-name="r1_VIEW_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAC0110010Struct.getr1_VIEW_TYP())) || "".equals(TypeConverter.convert(aAC0110010Struct.getr1_VIEW_TYP())))?"checked=\"checked\"": "" %> class="" id="expj-AC0110010-AC0110010form1-r1_VIEW_TYP" ><label for="expj-AC0110010-AC0110010form1-r1_VIEW_TYP"><%=CoreTools.getRBString("Expj.Cmt0703",rb)%></label></div><!--/td-->
<div class="div-td" style="width:14px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:18px;text-align:left;"></div><!--/td-->
<script class="expj-script-AC0110010-AC0110010form1-r2_VIEW_TYP">
expj.AC0110010.AC0110010form1.r2_VIEW_TYP = {};
expj.AC0110010.AC0110010form1.r2_VIEW_TYP.executeAllOnDecision = function () {
  console.log('execute AC0110010form1/r2_VIEW_TYP.onDecision');
  expj.AC0110010.AC0110010form1.executeAllOnDecision();
  expj.AC0110010.executeAllOnDecision();
};
expj.AC0110010.AC0110010form1.r2_VIEW_TYP.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010form1-r2_VIEW_TYP').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0110010', 'AC0110010form1', 'r2_VIEW_TYP', this, 'RadioButton');
    }
  });
  expj.AC0110010.AC0110010form1.r2_VIEW_TYP.executePScriptOnLoad();
};

expj.AC0110010.AC0110010form1.r2_VIEW_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0110010form1/r2_VIEW_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010form1-r2_VIEW_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="radio" name="r_MRP_ODR_TYP" data-name="r2_VIEW_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAC0110010Struct.getr2_VIEW_TYP())))?"checked=\"checked\"":"" %> class="" id="expj-AC0110010-AC0110010form1-r2_VIEW_TYP" ><label for="expj-AC0110010-AC0110010form1-r2_VIEW_TYP"><%=CoreTools.getRBString("Expj.Cmt0704",rb)%></label></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:14px;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:34px;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:148px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AC0110010-AC0110010form1-ITEM_CD">
expj.AC0110010.AC0110010form1.ITEM_CD = {};
expj.AC0110010.AC0110010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AC0110010form1/ITEM_CD.onDecision');
  expj.AC0110010.AC0110010form1.executeAllOnDecision();
  expj.AC0110010.executeAllOnDecision();
};
expj.AC0110010.AC0110010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0110010', 'AC0110010form1', 'ITEM_CD', this);
  });
  expj.AC0110010.AC0110010form1.ITEM_CD.executePScriptOnLoad();
};

expj.AC0110010.AC0110010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AC0110010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0110010-AC0110010form1-ITEM_CD" name="ITEM_CD" class="AC0110010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0110010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AC0110010-AC0110010form1-PeekerItemCd">
expj.AC0110010.AC0110010form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AC0110010form1/ITEM_CD@<%=contextNo%>"
expj.AC0110010.AC0110010form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0110010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '_AC0110010form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AC0110010form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0110010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0110010.AC0110010form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0110010.AC0110010form1.PeekerItemCd['onClick' + i])) {
        expj.AC0110010.AC0110010form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AC0110010.AC0110010form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AC0110010.AC0110010form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0110010', 'AC0110010form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AC0110010.AC0110010form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AC0110010.AC0110010form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AC0110010form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0110010-AC0110010form1-PeekerItemCd" class="AC0110010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AC0110010-AC0110010form1-ITEM_NAME">
expj.AC0110010.AC0110010form1.ITEM_NAME = {};
expj.AC0110010.AC0110010form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AC0110010form1/ITEM_NAME.onDecision');
  expj.AC0110010.AC0110010form1.executeAllOnDecision();
  expj.AC0110010.executeAllOnDecision();
};
expj.AC0110010.AC0110010form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0110010', 'AC0110010form1', 'ITEM_NAME', this);
  });
  expj.AC0110010.AC0110010form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AC0110010.AC0110010form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AC0110010form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AC0110010-AC0110010form1-ITEM_NAME" name="ITEM_NAME" class="AC0110010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0110010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DUE_DATE",rb)%></span><!-- 要求納期 --></div><!--/td-->
<script class="expj-script-AC0110010-AC0110010form1-DUE_DATE_FROM">
expj.AC0110010.AC0110010form1.DUE_DATE_FROM = {};
expj.AC0110010.AC0110010form1.DUE_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AC0110010form1/DUE_DATE_FROM.onDecision');
  expj.AC0110010.AC0110010form1.executeAllOnDecision();
  expj.AC0110010.executeAllOnDecision();
};
expj.AC0110010.AC0110010form1.DUE_DATE_FROM.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010form1-DUE_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0110010', 'AC0110010form1', 'DUE_DATE_FROM', this);
  });
  expj.AC0110010.AC0110010form1.DUE_DATE_FROM.executePScriptOnLoad();
};

expj.AC0110010.AC0110010form1.DUE_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AC0110010form1/DUE_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010form1-DUE_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0110010-AC0110010form1-DUE_DATE_FROM" name="DUE_DATE_FROM" class="AC0110010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0110010Struct.getDUE_DATE_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AC0110010-AC0110010form1-CalendarDueDateFrom">
expj.AC0110010.AC0110010form1.CalendarDueDateFrom = {};
// script1="onClick;0;CALENDAR;_AC0110010form1/DUE_DATE_FROM"
expj.AC0110010.AC0110010form1.CalendarDueDateFrom.onClick0 = function () {
  console.log('CalendarDueDateFrom script1');
expj.common.pscript.executeCalendar('AC0110010','AC0110010form1','_AC0110010form1/DUE_DATE_FROM');
};
expj.AC0110010.AC0110010form1.CalendarDueDateFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0110010.AC0110010form1.CalendarDueDateFrom['onClick' + i])) {
        expj.AC0110010.AC0110010form1.CalendarDueDateFrom['onClick' + i]();
      }
    }
  }
};
expj.AC0110010.AC0110010form1.CalendarDueDateFrom.executeAllOnDecision = function () {
};
expj.AC0110010.AC0110010form1.CalendarDueDateFrom.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010form1-CalendarDueDateFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0110010', 'AC0110010form1', 'CalendarDueDateFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0110010','AC0110010form1','_AC0110010form1/DUE_DATE_FROM');
  expj.AC0110010.AC0110010form1.CalendarDueDateFrom.executePScriptOnLoad();
};

expj.AC0110010.AC0110010form1.CalendarDueDateFrom.executePScriptOnLoad = function () {
  console.log('execute AC0110010form1/CalendarDueDateFrom.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010form1-CalendarDueDateFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0110010-AC0110010form1-CalendarDueDateFrom" class="AC0110010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AC0110010-AC0110010form1-DUE_TIME_FROM">
expj.AC0110010.AC0110010form1.DUE_TIME_FROM = {};
expj.AC0110010.AC0110010form1.DUE_TIME_FROM.executeAllOnDecision = function () {
  console.log('execute AC0110010form1/DUE_TIME_FROM.onDecision');
  expj.AC0110010.AC0110010form1.executeAllOnDecision();
  expj.AC0110010.executeAllOnDecision();
};
expj.AC0110010.AC0110010form1.DUE_TIME_FROM.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010form1-DUE_TIME_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0110010', 'AC0110010form1', 'DUE_TIME_FROM', this);
  });
  expj.AC0110010.AC0110010form1.DUE_TIME_FROM.executePScriptOnLoad();
};

expj.AC0110010.AC0110010form1.DUE_TIME_FROM.executePScriptOnLoad = function () {
  console.log('execute AC0110010form1/DUE_TIME_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010form1-DUE_TIME_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AC0110010-AC0110010form1-DUE_TIME_FROM" name="DUE_TIME_FROM" class="AC0110010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAC0110010Struct.getDUE_TIME_FROM()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<script class="expj-script-AC0110010-AC0110010form1-DUE_DATE_TO">
expj.AC0110010.AC0110010form1.DUE_DATE_TO = {};
expj.AC0110010.AC0110010form1.DUE_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AC0110010form1/DUE_DATE_TO.onDecision');
  expj.AC0110010.AC0110010form1.executeAllOnDecision();
  expj.AC0110010.executeAllOnDecision();
};
expj.AC0110010.AC0110010form1.DUE_DATE_TO.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010form1-DUE_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0110010', 'AC0110010form1', 'DUE_DATE_TO', this);
  });
  expj.AC0110010.AC0110010form1.DUE_DATE_TO.executePScriptOnLoad();
};

expj.AC0110010.AC0110010form1.DUE_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AC0110010form1/DUE_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010form1-DUE_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0110010-AC0110010form1-DUE_DATE_TO" name="DUE_DATE_TO" class="AC0110010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0110010Struct.getDUE_DATE_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AC0110010-AC0110010form1-CalendarDueDateTo">
expj.AC0110010.AC0110010form1.CalendarDueDateTo = {};
// script1="onClick;0;CALENDAR;_AC0110010form1/DUE_DATE_TO"
expj.AC0110010.AC0110010form1.CalendarDueDateTo.onClick0 = function () {
  console.log('CalendarDueDateTo script1');
expj.common.pscript.executeCalendar('AC0110010','AC0110010form1','_AC0110010form1/DUE_DATE_TO');
};
expj.AC0110010.AC0110010form1.CalendarDueDateTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0110010.AC0110010form1.CalendarDueDateTo['onClick' + i])) {
        expj.AC0110010.AC0110010form1.CalendarDueDateTo['onClick' + i]();
      }
    }
  }
};
expj.AC0110010.AC0110010form1.CalendarDueDateTo.executeAllOnDecision = function () {
};
expj.AC0110010.AC0110010form1.CalendarDueDateTo.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010form1-CalendarDueDateTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0110010', 'AC0110010form1', 'CalendarDueDateTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0110010','AC0110010form1','_AC0110010form1/DUE_DATE_TO');
  expj.AC0110010.AC0110010form1.CalendarDueDateTo.executePScriptOnLoad();
};

expj.AC0110010.AC0110010form1.CalendarDueDateTo.executePScriptOnLoad = function () {
  console.log('execute AC0110010form1/CalendarDueDateTo.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010form1-CalendarDueDateTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0110010-AC0110010form1-CalendarDueDateTo" class="AC0110010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AC0110010-AC0110010form1-DUE_TIME_TO">
expj.AC0110010.AC0110010form1.DUE_TIME_TO = {};
expj.AC0110010.AC0110010form1.DUE_TIME_TO.executeAllOnDecision = function () {
  console.log('execute AC0110010form1/DUE_TIME_TO.onDecision');
  expj.AC0110010.AC0110010form1.executeAllOnDecision();
  expj.AC0110010.executeAllOnDecision();
};
expj.AC0110010.AC0110010form1.DUE_TIME_TO.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010form1-DUE_TIME_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0110010', 'AC0110010form1', 'DUE_TIME_TO', this);
  });
  expj.AC0110010.AC0110010form1.DUE_TIME_TO.executePScriptOnLoad();
};

expj.AC0110010.AC0110010form1.DUE_TIME_TO.executePScriptOnLoad = function () {
  console.log('execute AC0110010form1/DUE_TIME_TO.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010form1-DUE_TIME_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:148px;text-align:left;"><input type="text" id="expj-AC0110010-AC0110010form1-DUE_TIME_TO" name="DUE_TIME_TO" class="AC0110010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAC0110010Struct.getDUE_TIME_TO()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AC0110010-AC0110010form1-JOB_ODR_CD">
expj.AC0110010.AC0110010form1.JOB_ODR_CD = {};
expj.AC0110010.AC0110010form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AC0110010form1/JOB_ODR_CD.onDecision');
  expj.AC0110010.AC0110010form1.executeAllOnDecision();
  expj.AC0110010.executeAllOnDecision();
};
expj.AC0110010.AC0110010form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0110010', 'AC0110010form1', 'JOB_ODR_CD', this);
  });
  expj.AC0110010.AC0110010form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AC0110010.AC0110010form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AC0110010form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0110010-AC0110010form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AC0110010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0110010Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AC0110010-AC0110010form1-Peekerjobodrcd">
expj.AC0110010.AC0110010form1.Peekerjobodrcd = {};
// script1="onClick;0;PEEKER;_AC0110010form1/JOB_ODR_CD@<%=contextNo%>"
expj.AC0110010.AC0110010form1.Peekerjobodrcd.onClick0 = function () {
  console.log('Peekerjobodrcd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0110010';
var parameterValues = 'Peekerjobodrcd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AC0110010', 'Peekerjobodrcd', 'SQLPARAM_1', '<%=aAC0110010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010form1', '_AC0110010form1/JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_04%&%';
parameterValues += 'TARGET_FIELD%=%_AC0110010form1/JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0110010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0110010.AC0110010form1.Peekerjobodrcd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0110010.AC0110010form1.Peekerjobodrcd['onClick' + i])) {
        expj.AC0110010.AC0110010form1.Peekerjobodrcd['onClick' + i]();
      }
    }
  }
};
expj.AC0110010.AC0110010form1.Peekerjobodrcd.executeAllOnDecision = function () {
};
expj.AC0110010.AC0110010form1.Peekerjobodrcd.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010form1-Peekerjobodrcd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0110010', 'AC0110010form1', 'Peekerjobodrcd', this, 'Button');
    }
  });
  expj.AC0110010.AC0110010form1.Peekerjobodrcd.executePScriptOnLoad();
};

expj.AC0110010.AC0110010form1.Peekerjobodrcd.executePScriptOnLoad = function () {
  console.log('execute AC0110010form1/Peekerjobodrcd.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010form1-Peekerjobodrcd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0110010-AC0110010form1-Peekerjobodrcd" class="AC0110010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CANCEL_NO",rb)%></span><!-- 製番取消発生番号 --></div><!--/td-->
<script class="expj-script-AC0110010-AC0110010form1-JOB_ODR_CANCEL_NO">
expj.AC0110010.AC0110010form1.JOB_ODR_CANCEL_NO = {};
expj.AC0110010.AC0110010form1.JOB_ODR_CANCEL_NO.executeAllOnDecision = function () {
  console.log('execute AC0110010form1/JOB_ODR_CANCEL_NO.onDecision');
  expj.AC0110010.AC0110010form1.executeAllOnDecision();
  expj.AC0110010.executeAllOnDecision();
};
expj.AC0110010.AC0110010form1.JOB_ODR_CANCEL_NO.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010form1-JOB_ODR_CANCEL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0110010', 'AC0110010form1', 'JOB_ODR_CANCEL_NO', this);
  });
  expj.AC0110010.AC0110010form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad();
};

expj.AC0110010.AC0110010form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad = function () {
  console.log('execute AC0110010form1/JOB_ODR_CANCEL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010form1-JOB_ODR_CANCEL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="text" id="expj-AC0110010-AC0110010form1-JOB_ODR_CANCEL_NO" name="JOB_ODR_CANCEL_NO" class="AC0110010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAC0110010Struct.getJOB_ODR_CANCEL_NO()) %>" maxlength="6" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ALC_GRP_CD",rb)%></span><!-- 引当グループコード --></div><!--/td-->
<script class="expj-script-AC0110010-AC0110010form1-ALC_GRP_CD">
expj.AC0110010.AC0110010form1.ALC_GRP_CD = {};
expj.AC0110010.AC0110010form1.ALC_GRP_CD.executeAllOnDecision = function () {
  console.log('execute AC0110010form1/ALC_GRP_CD.onDecision');
  expj.AC0110010.AC0110010form1.executeAllOnDecision();
  expj.AC0110010.executeAllOnDecision();
};
expj.AC0110010.AC0110010form1.ALC_GRP_CD.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010form1-ALC_GRP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0110010', 'AC0110010form1', 'ALC_GRP_CD', this);
  });
  expj.AC0110010.AC0110010form1.ALC_GRP_CD.executePScriptOnLoad();
};

expj.AC0110010.AC0110010form1.ALC_GRP_CD.executePScriptOnLoad = function () {
  console.log('execute AC0110010form1/ALC_GRP_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010form1-ALC_GRP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0110010-AC0110010form1-ALC_GRP_CD" name="ALC_GRP_CD" class="AC0110010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0110010Struct.getALC_GRP_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:148px;text-align:right;"></div><!--/td-->
<input type="hidden" id="expj-AC0110010-AC0110010form1-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0110010Struct.getTIME_CTRL()) %>">
<script class="expj-script-AC0110010-AC0110010form1-TIME_CTRL">
expj.AC0110010.AC0110010form1.TIME_CTRL = {};
expj.AC0110010.AC0110010form1.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AC0110010form1/TIME_CTRL.onDecision');
  expj.AC0110010.AC0110010form1.executeAllOnDecision();
  expj.AC0110010.executeAllOnDecision();
};
expj.AC0110010.AC0110010form1.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010form1-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0110010', 'AC0110010form1', 'TIME_CTRL', this);
  });
  expj.AC0110010.AC0110010form1.TIME_CTRL.executePScriptOnLoad();
};

expj.AC0110010.AC0110010form1.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AC0110010form1/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010form1-TIME_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0110010-AC0110010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0110010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AC0110010-AC0110010form1-DOWNLOAD_FILE">
expj.AC0110010.AC0110010form1.DOWNLOAD_FILE = {};
expj.AC0110010.AC0110010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AC0110010form1/DOWNLOAD_FILE.onDecision');
  expj.AC0110010.AC0110010form1.executeAllOnDecision();
  expj.AC0110010.executeAllOnDecision();
};
expj.AC0110010.AC0110010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0110010', 'AC0110010form1', 'DOWNLOAD_FILE', this);
  });
  expj.AC0110010.AC0110010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AC0110010.AC0110010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AC0110010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DM_STS_TYP",rb)%></span><!-- デマンド状態区分 --></div><!--/td-->
<script class="expj-script-AC0110010-AC0110010form1-c1_DM_STS_TYP">
expj.AC0110010.AC0110010form1.c1_DM_STS_TYP = {};
expj.AC0110010.AC0110010form1.c1_DM_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AC0110010form1/c1_DM_STS_TYP.onDecision');
  expj.AC0110010.AC0110010form1.executeAllOnDecision();
  expj.AC0110010.executeAllOnDecision();
};
expj.AC0110010.AC0110010form1.c1_DM_STS_TYP.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010form1-c1_DM_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0110010', 'AC0110010form1', 'c1_DM_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AC0110010.AC0110010form1.c1_DM_STS_TYP.executePScriptOnLoad();
};

expj.AC0110010.AC0110010form1.c1_DM_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0110010form1/c1_DM_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010form1-c1_DM_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:96px;text-align:left;"><input type="checkbox" name="c1_DM_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAC0110010Struct.getc1_DM_STS_TYP())) || "1".equals(TypeConverter.convert(aAC0110010Struct.getc1_DM_STS_TYP())))?"checked=\"checked\"":"" %>  class="AC0110010-focus-move" id="expj-AC0110010-AC0110010form1-c1_DM_STS_TYP"><label for="expj-AC0110010-AC0110010form1-c1_DM_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0440",rb)%></label></div><!--/td-->
<div class="div-td" style="width:14px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:18px;text-align:left;"></div><!--/td-->
<script class="expj-script-AC0110010-AC0110010form1-c2_DM_STS_TYP">
expj.AC0110010.AC0110010form1.c2_DM_STS_TYP = {};
expj.AC0110010.AC0110010form1.c2_DM_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AC0110010form1/c2_DM_STS_TYP.onDecision');
  expj.AC0110010.AC0110010form1.executeAllOnDecision();
  expj.AC0110010.executeAllOnDecision();
};
expj.AC0110010.AC0110010form1.c2_DM_STS_TYP.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010form1-c2_DM_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0110010', 'AC0110010form1', 'c2_DM_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AC0110010.AC0110010form1.c2_DM_STS_TYP.executePScriptOnLoad();
};

expj.AC0110010.AC0110010form1.c2_DM_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0110010form1/c2_DM_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010form1-c2_DM_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="checkbox" name="c2_DM_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAC0110010Struct.getc2_DM_STS_TYP())) || "1".equals(TypeConverter.convert(aAC0110010Struct.getc2_DM_STS_TYP())))?"checked=\"checked\"":"" %>  class="AC0110010-focus-move" id="expj-AC0110010-AC0110010form1-c2_DM_STS_TYP"><label for="expj-AC0110010-AC0110010form1-c2_DM_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0441",rb)%></label></div><!--/td-->
<div class="div-td" style="width:20px;"></div><!--/td-->
<div class="div-td" style="width:14px;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:34px;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AC0110010-AC0110010form1-c3_DM_STS_TYP">
expj.AC0110010.AC0110010form1.c3_DM_STS_TYP = {};
expj.AC0110010.AC0110010form1.c3_DM_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AC0110010form1/c3_DM_STS_TYP.onDecision');
  expj.AC0110010.AC0110010form1.executeAllOnDecision();
  expj.AC0110010.executeAllOnDecision();
};
expj.AC0110010.AC0110010form1.c3_DM_STS_TYP.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010form1-c3_DM_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0110010', 'AC0110010form1', 'c3_DM_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AC0110010.AC0110010form1.c3_DM_STS_TYP.executePScriptOnLoad();
};

expj.AC0110010.AC0110010form1.c3_DM_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0110010form1/c3_DM_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010form1-c3_DM_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c3_DM_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAC0110010Struct.getc3_DM_STS_TYP())) || "1".equals(TypeConverter.convert(aAC0110010Struct.getc3_DM_STS_TYP())))?"checked=\"checked\"":"" %>  class="AC0110010-focus-move" id="expj-AC0110010-AC0110010form1-c3_DM_STS_TYP"><label for="expj-AC0110010-AC0110010form1-c3_DM_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0013",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:148px;text-align:right;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AC0110010-AC0110010button1">
expj.AC0110010.AC0110010button1 = {};
expj.AC0110010.AC0110010button1.executeAllOnDecision = function () {
  console.log('execute AC0110010button1.onDecision');
};
expj.AC0110010.AC0110010button1.executeOnLoad = function () {
  expj.AC0110010.AC0110010button1.executePScriptOnLoad();
};

expj.AC0110010.AC0110010button1.executePScriptOnLoad = function () {
  console.log('execute AC0110010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0110010-AC0110010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0110010-AC0110010button1-Select">
expj.AC0110010.AC0110010button1.Select = {};
// script1="onClick;0;CHK;_AC0110010form1/TIME_CTRL[eq]true@*0"
expj.AC0110010.AC0110010button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010button1', '_AC0110010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="onClick;1;CHK;_AC0110010form1/TIME_CTRL[eq]true@*1"
expj.AC0110010.AC0110010button1.Select.onClick1 = function () {
  console.log('Select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010button1', '_AC0110010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="onClick;2;CHK;_AC0110010form1/TIME_CTRL[eq]true@*2"
expj.AC0110010.AC0110010button1.Select.onClick2 = function () {
  console.log('Select script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010button1', '_AC0110010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="onClick;3;CHK;_AC0110010form1/TIME_CTRL[eq]true@*3"
expj.AC0110010.AC0110010button1.Select.onClick3 = function () {
  console.log('Select script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010button1', '_AC0110010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="onClick;4;CHK;_AC0110010form1/TIME_CTRL[eq]true[and]~LEN(_AC0110010form1/DUE_TIME_FROM)[eq]3@*4"
expj.AC0110010.AC0110010button1.Select.onClick4 = function () {
  console.log('Select script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010button1', '_AC0110010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_FROM'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="onClick;5;CHK;_AC0110010form1/TIME_CTRL[eq]true[and]~LEN(_AC0110010form1/DUE_TIME_FROM)[eq]4@*5"
expj.AC0110010.AC0110010button1.Select.onClick5 = function () {
  console.log('Select script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010button1', '_AC0110010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_FROM'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="onClick;6;CHK;_AC0110010form1/TIME_CTRL[eq]true[and]~LEN(_AC0110010form1/DUE_TIME_TO)[eq]3@*6"
expj.AC0110010.AC0110010button1.Select.onClick6 = function () {
  console.log('Select script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010button1', '_AC0110010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_TO'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script8="onClick;7;CHK;_AC0110010form1/TIME_CTRL[eq]true[and]~LEN(_AC0110010form1/DUE_TIME_TO)[eq]4@*7"
expj.AC0110010.AC0110010button1.Select.onClick7 = function () {
  console.log('Select script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010button1', '_AC0110010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_TO'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script9="onClick;8;CHK;_AC0110010form1/TIME_CTRL[eq]true[and]_AC0110010form1/DUE_DATE_FROM[eq]_AC0110010form1/DUE_DATE_TO@*8"
expj.AC0110010.AC0110010button1.Select.onClick8 = function () {
  console.log('Select script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010button1', '_AC0110010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_DATE_FROM'), '[eq]', expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_DATE_TO'))) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script10="onClick;9;CHK;_AC0110010form1/DUE_DATE_FROM[neq][and]_AC0110010form1/DUE_DATE_TO[neq][and]_AC0110010form1/DUE_DATE_TO[lt]_AC0110010form1/DUE_DATE_FROM@!ZZ05101"
expj.AC0110010.AC0110010button1.Select.onClick9 = function () {
  console.log('Select script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_DATE_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_DATE_TO')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_DATE_FROM')))) {
expj.common.pscript.viewErrorMessage('AC0110010', 'AC0110010button1', 'ZZ05101');
}
};
// script11="onClick;10;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0110010form1/*@AC0110010Servlet"
expj.AC0110010.AC0110010button1.Select.onClick10 = function () {
  console.log('Select script11');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0110010', 'AC0110010button1', '_AC0110010form1/*', 'AC0110010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0110010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0110010', response);
expj.common.updateBusinessScreenTab('AC0110010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script12="child;0;CHK;_AC0110010form1/DUE_DATE_FROM[eq][and]_AC0110010form1/DUE_TIME_FROM[neq]@!AS00021"
expj.AC0110010.AC0110010button1.Select.child0 = function () {
  console.log('Select script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_DATE_FROM'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_FROM'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('AC0110010', 'AC0110010button1', 'AS00021');
}
};
// script13="child;1;CHK;_AC0110010form1/DUE_DATE_TO[eq][and]_AC0110010form1/DUE_TIME_TO[neq]@!AS00022"
expj.AC0110010.AC0110010button1.Select.child1 = function () {
  console.log('Select script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_DATE_TO'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_TO'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('AC0110010', 'AC0110010button1', 'AS00022');
}
};
// script14="child;2;CHK;~LEN(_AC0110010form1/DUE_TIME_FROM)[eq]1[or]~LEN(_AC0110010form1/DUE_TIME_FROM)[eq]2@!AS00023"
expj.AC0110010.AC0110010button1.Select.child2 = function () {
  console.log('Select script14');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_FROM'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_FROM'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AC0110010', 'AC0110010button1', 'AS00023');
}
};
// script15="child;3;CHK;~LEN(_AC0110010form1/DUE_TIME_TO)[eq]1[or]~LEN(_AC0110010form1/DUE_TIME_TO)[eq]2@!AS00024"
expj.AC0110010.AC0110010button1.Select.child3 = function () {
  console.log('Select script15');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_TO'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_TO'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AC0110010', 'AC0110010button1', 'AS00024');
}
};
// script16="child;4;CHK;[{~CHARAT(_AC0110010form1/DUE_TIME_FROM:1)}*10+{~CHARAT(_AC0110010form1/DUE_TIME_FROM:2)}][gte]60@!AS00025"
expj.AC0110010.AC0110010button1.Select.child4 = function () {
  console.log('Select script16');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_FROM', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_FROM', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AC0110010', 'AC0110010button1', 'AS00025');
}
};
// script17="child;5;CHK;[{~CHARAT(_AC0110010form1/DUE_TIME_FROM:0)}*10+{~CHARAT(_AC0110010form1/DUE_TIME_FROM:1)}][gte]24[or][{~CHARAT(_AC0110010form1/DUE_TIME_FROM:2)}*10+{~CHARAT(_AC0110010form1/DUE_TIME_FROM:3)}][gte]60@!AS00025"
expj.AC0110010.AC0110010button1.Select.child5 = function () {
  console.log('Select script17');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_FROM', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_FROM', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_FROM', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_FROM', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AC0110010', 'AC0110010button1', 'AS00025');
}
};
// script18="child;6;CHK;[{~CHARAT(_AC0110010form1/DUE_TIME_TO:1)}*10+{~CHARAT(_AC0110010form1/DUE_TIME_TO:2)}][gte]60@!AS00026"
expj.AC0110010.AC0110010button1.Select.child6 = function () {
  console.log('Select script18');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_TO', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_TO', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AC0110010', 'AC0110010button1', 'AS00026');
}
};
// script19="child;7;CHK;[{~CHARAT(_AC0110010form1/DUE_TIME_TO:0)}*10+{~CHARAT(_AC0110010form1/DUE_TIME_TO:1)}][gte]24[or][{~CHARAT(_AC0110010form1/DUE_TIME_TO:2)}*10+{~CHARAT(_AC0110010form1/DUE_TIME_TO:3)}][gte]60@!AS00026"
expj.AC0110010.AC0110010button1.Select.child7 = function () {
  console.log('Select script19');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_TO', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_TO', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_TO', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_TO', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AC0110010', 'AC0110010button1', 'AS00026');
}
};
// script20="child;8;CHK;_AC0110010form1/DUE_TIME_FROM[neq][and]_AC0110010form1/DUE_TIME_TO[neq]@*9"
expj.AC0110010.AC0110010button1.Select.child8 = function () {
  console.log('Select script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_TO'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script21="child;9;CHK;_AC0110010form1/DUE_TIME_FROM[gt]_AC0110010form1/DUE_TIME_TO@!ZZ05101"
expj.AC0110010.AC0110010button1.Select.child9 = function () {
  console.log('Select script21');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0110010', 'AC0110010button1', '_AC0110010form1/DUE_TIME_TO')))) {
expj.common.pscript.viewErrorMessage('AC0110010', 'AC0110010button1', 'ZZ05101');
}
};
expj.AC0110010.AC0110010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 10; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0110010.AC0110010button1.Select['onClick' + i])) {
        expj.AC0110010.AC0110010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AC0110010.AC0110010button1.Select.executeAllOnDecision = function () {
};
expj.AC0110010.AC0110010button1.Select.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0110010', 'AC0110010button1', 'Select', this, 'Button');
    }
  });
  expj.AC0110010.AC0110010button1.Select.executePScriptOnLoad();
};

expj.AC0110010.AC0110010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AC0110010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0110010-AC0110010button1-Select" name="Select" class="AC0110010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AC0110010-AC0110010view1">
expj.AC0110010.AC0110010view1 = {};
expj.AC0110010.AC0110010view1.executeAllOnClick = function () {
};
expj.AC0110010.AC0110010view1.executeAllOnDecision = function () {
  console.log('execute AC0110010view1.onDecision');
};
expj.AC0110010.AC0110010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AC0110010view1", "expj.AC0110010.AC0110010view1.executeAllOnClick");
%>
  expj.AC0110010.AC0110010view1.executePScriptOnLoad();
};

expj.AC0110010.AC0110010view1.executePScriptOnLoad = function () {
  console.log('execute AC0110010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AC0110010-AC0110010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AC0110010view1_Id = "AC0110010view1";
 String AC0110010view1_select = "single";
 String AC0110010view1_sortable = "true";
 String AC0110010view1_resize = "true";
 String AC0110010view1_scroll = "true";
 StringBuffer AC0110010view1_HB = new StringBuffer();
 StringBuffer AC0110010view1_DB = new StringBuffer();
%>
<%
 AC0110010view1_select = "single";
 AC0110010view1_sortable = "true";
 AC0110010view1_resize = "true";
 AC0110010view1_scroll = "true";
%>
<%
 AC0110010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AC0110010view1_sortable).append("}").append(",");
%>
     
<%
AC0110010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'l_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0110010view1_sortable).append("}").append(",");
AC0110010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CANCEL_NO",rb))).append("', 'name':'l_JOB_ODR_CANCEL_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0110010view1_sortable).append("}").append(",");
AC0110010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ALC_GRP_CD",rb))).append("', 'name':'l_ALC_GRP_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0110010view1_sortable).append("}").append(",");
AC0110010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0110010view1_sortable).append("}").append(",");
AC0110010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0110010view1_sortable).append("}").append(",");
AC0110010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.REQ_PRD_QTY",rb))).append("', 'name':'l_DM_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AC0110010view1_sortable).append("}").append(",");
AC0110010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ALC_ALCD_QTY",rb))).append("', 'name':'l_ALC_ALCD_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AC0110010view1_sortable).append("}").append(",");
AC0110010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0358",rb))).append("', 'name':'l_ALCDLE_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AC0110010view1_sortable).append("}").append(",");
AC0110010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TOTAL_ISSUE_QTY",rb))).append("', 'name':'l_TOTAL_ISSUE_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AC0110010view1_sortable).append("}").append(",");
AC0110010view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_UNIT_1",rb))).append("', 'name':'l_STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0110010view1_sortable).append("}").append(",");
AC0110010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DUE_DATE",rb))).append("', 'name':'l_DUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0110010view1_sortable).append("}").append(",");
AC0110010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DM_STS_TYP",rb))).append("', 'name':'l_DM_STS_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0110010view1_sortable).append("}").append(",");
AC0110010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OD_TYP",rb))).append("', 'name':'l_OD_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0110010view1_sortable).append("}").append(",");
AC0110010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb))).append("', 'name':'l_MRP_ODR_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0110010view1_sortable).append("}").append(",");
AC0110010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OD_NO",rb))).append("', 'name':'l_OD_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0110010view1_sortable).append("}").append(",");
%>
<%
 int aAC0110010StructLength = aAC0110010Control.getListsize();
 final AC0110010Struct structBackup = aAC0110010Struct;
 aAC0110010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAC0110010StructLength; ++loopCount) {
  if((aAC0110010Struct = (AC0110010Struct) aAC0110010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAC0110010Struct", aAC0110010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AC0110010view1_DB.append("[");
 AC0110010view1_DB.append(loopCount);
 AC0110010view1_DB.append(",").append("'<span id=\"expj-AC0110010-AC0110010view1-l_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AC0110010-AC0110010view1-l_JOB_ODR_CD\" data-name=\"l_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0110010Struct.getl_JOB_ODR_CD())).append("</span>'");
 AC0110010view1_DB.append(",").append("'<span id=\"expj-AC0110010-AC0110010view1-l_JOB_ODR_CANCEL_NO-").append(loopCount).append("\" class=\"expj-label expj-AC0110010-AC0110010view1-l_JOB_ODR_CANCEL_NO\" data-name=\"l_JOB_ODR_CANCEL_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0110010Struct.getl_JOB_ODR_CANCEL_NO())).append("</span>'");
 AC0110010view1_DB.append(",").append("'<span id=\"expj-AC0110010-AC0110010view1-l_ALC_GRP_CD-").append(loopCount).append("\" class=\"expj-label expj-AC0110010-AC0110010view1-l_ALC_GRP_CD\" data-name=\"l_ALC_GRP_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0110010Struct.getl_ALC_GRP_CD())).append("</span>'");
 AC0110010view1_DB.append(",").append("'<span id=\"expj-AC0110010-AC0110010view1-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AC0110010-AC0110010view1-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0110010Struct.getl_ITEM_CD())).append("</span>'");
 AC0110010view1_DB.append(",").append("'<span id=\"expj-AC0110010-AC0110010view1-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AC0110010-AC0110010view1-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0110010Struct.getl_ITEM_NAME())).append("</span>'");
 AC0110010view1_DB.append(",").append("'<span id=\"expj-AC0110010-AC0110010view1-l_DM_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0110010-AC0110010view1-l_DM_QTY\" data-name=\"l_DM_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0110010Struct.getl_DM_QTY())).append("</span>'");
 AC0110010view1_DB.append(",").append("'<span id=\"expj-AC0110010-AC0110010view1-l_ALC_ALCD_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0110010-AC0110010view1-l_ALC_ALCD_QTY\" data-name=\"l_ALC_ALCD_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0110010Struct.getl_ALC_ALCD_QTY())).append("</span>'");
 AC0110010view1_DB.append(",").append("'<span id=\"expj-AC0110010-AC0110010view1-l_ALCDLE_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0110010-AC0110010view1-l_ALCDLE_QTY\" data-name=\"l_ALCDLE_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0110010Struct.getl_ALCDLE_QTY())).append("</span>'");
 AC0110010view1_DB.append(",").append("'<span id=\"expj-AC0110010-AC0110010view1-l_TOTAL_ISSUE_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0110010-AC0110010view1-l_TOTAL_ISSUE_QTY\" data-name=\"l_TOTAL_ISSUE_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0110010Struct.getl_TOTAL_ISSUE_QTY())).append("</span>'");
 AC0110010view1_DB.append(",").append("'<span id=\"expj-AC0110010-AC0110010view1-l_STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AC0110010-AC0110010view1-l_STOCK_UNIT\" data-name=\"l_STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0110010Struct.getl_STOCK_UNIT())).append("</span>'");
 AC0110010view1_DB.append(",").append("'<span id=\"expj-AC0110010-AC0110010view1-l_DUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0110010-AC0110010view1-l_DUE_DATE\" data-name=\"l_DUE_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0110010Struct.getl_DUE_DATE())).append("</span>'");
 AC0110010view1_DB.append(",").append("'<span id=\"expj-AC0110010-AC0110010view1-l_DM_STS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0110010-AC0110010view1-l_DM_STS_TYP\" data-name=\"l_DM_STS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0110010Struct.getl_DM_STS_TYP())).append("</span>'");
 AC0110010view1_DB.append(",").append("'<span id=\"expj-AC0110010-AC0110010view1-l_OD_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0110010-AC0110010view1-l_OD_TYP\" data-name=\"l_OD_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0110010Struct.getl_OD_TYP())).append("</span>'");
 AC0110010view1_DB.append(",").append("'<span id=\"expj-AC0110010-AC0110010view1-l_MRP_ODR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0110010-AC0110010view1-l_MRP_ODR_TYP\" data-name=\"l_MRP_ODR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0110010Struct.getl_MRP_ODR_TYP())).append("</span>'");
 AC0110010view1_DB.append(",").append("'<span id=\"expj-AC0110010-AC0110010view1-l_OD_NO-").append(loopCount).append("\" class=\"expj-label expj-AC0110010-AC0110010view1-l_OD_NO\" data-name=\"l_OD_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0110010Struct.getl_OD_NO())).append("</span>'");
 AC0110010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAC0110010StructLength) {
   AC0110010view1_DB.append(",");
  }
 }
 aAC0110010Struct = structBackup;
 viewIdList.add(AC0110010view1_Id);
 viewSelectList.add(AC0110010view1_select);
 viewResizeList.add(AC0110010view1_resize);
 viewScrollList.add(AC0110010view1_scroll);
 viewHeaderDataList.add(AC0110010view1_HB);
 viewBodyDataList.add(AC0110010view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AC0110010-AC0110010button3">
expj.AC0110010.AC0110010button3 = {};
expj.AC0110010.AC0110010button3.executeAllOnDecision = function () {
  console.log('execute AC0110010button3.onDecision');
};
expj.AC0110010.AC0110010button3.executeOnLoad = function () {
  expj.AC0110010.AC0110010button3.executePScriptOnLoad();
};

expj.AC0110010.AC0110010button3.executePScriptOnLoad = function () {
  console.log('execute AC0110010button3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0110010-AC0110010button3" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0110010-AC0110010button3-JobOdrAlc">
expj.AC0110010.AC0110010button3.JobOdrAlc = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AC0110010view1/+@AC0100010Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.AC0110010.AC0110010button3.JobOdrAlc.onClick0 = function () {
  console.log('JobOdrAlc script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0110010', 'AC0110010button3', '_AC0110010view1/+', 'AC0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AC0100010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AC0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'AC0110010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AC0110010.AC0110010button3.JobOdrAlc.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0110010.AC0110010button3.JobOdrAlc['onClick' + i])) {
        expj.AC0110010.AC0110010button3.JobOdrAlc['onClick' + i]();
      }
    }
  }
};
expj.AC0110010.AC0110010button3.JobOdrAlc.executeAllOnDecision = function () {
};
expj.AC0110010.AC0110010button3.JobOdrAlc.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010button3-JobOdrAlc').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0110010', 'AC0110010button3', 'JobOdrAlc', this, 'Button');
    }
  });
  expj.AC0110010.AC0110010button3.JobOdrAlc.executePScriptOnLoad();
};

expj.AC0110010.AC0110010button3.JobOdrAlc.executePScriptOnLoad = function () {
  console.log('execute AC0110010button3/JobOdrAlc.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010button3-JobOdrAlc');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0110010-AC0110010button3-JobOdrAlc" name="JobOdrAlc" class="AC0110010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReserveFundOrder",rb)%></button><!-- 製番引当ボタン --></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AC0110010 Revision: 1.9  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AC0110010-AC0110010button0">
expj.AC0110010.AC0110010button0 = {};
expj.AC0110010.AC0110010button0.executeAllOnDecision = function () {
  console.log('execute AC0110010button0.onDecision');
};
expj.AC0110010.AC0110010button0.executeOnLoad = function () {
  expj.AC0110010.AC0110010button0.executePScriptOnLoad();
};

expj.AC0110010.AC0110010button0.executePScriptOnLoad = function () {
  console.log('execute AC0110010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0110010-AC0110010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0110010-AC0110010button0-CsvOut">
expj.AC0110010.AC0110010button0.CsvOut = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0110010form1/*@AC0110010Servlet,,$ZZ07011"
expj.AC0110010.AC0110010button0.CsvOut.onClick0 = function () {
  console.log('CsvOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0110010', 'AC0110010button0', '_AC0110010form1/*', 'AC0110010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0110010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0110010', response);
expj.common.updateBusinessScreenTab('AC0110010', contents);
};
expj.common.pscript.callConfirm('AC0110010', 'AC0110010button0', 'ZZ07011', okEvent);
};
expj.AC0110010.AC0110010button0.CsvOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0110010.AC0110010button0.CsvOut['onClick' + i])) {
        expj.AC0110010.AC0110010button0.CsvOut['onClick' + i]();
      }
    }
  }
};
expj.AC0110010.AC0110010button0.CsvOut.executeAllOnDecision = function () {
};
expj.AC0110010.AC0110010button0.CsvOut.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010button0-CsvOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0110010', 'AC0110010button0', 'CsvOut', this, 'Button');
    }
  });
  expj.AC0110010.AC0110010button0.CsvOut.executePScriptOnLoad();
};

expj.AC0110010.AC0110010button0.CsvOut.executePScriptOnLoad = function () {
  console.log('execute AC0110010button0/CsvOut.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010button0-CsvOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0110010-AC0110010button0-CsvOut" name="CsvOut" class="AC0110010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-AC0110010-AC0110010button0-Clear">
expj.AC0110010.AC0110010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0110010form1/*@AC0110010Servlet,,$ZZ07008"
expj.AC0110010.AC0110010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0110010', 'AC0110010button0', '_AC0110010form1/*', 'AC0110010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0110010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0110010', response);
expj.common.updateBusinessScreenTab('AC0110010', contents);
};
expj.common.pscript.callConfirm('AC0110010', 'AC0110010button0', 'ZZ07008', okEvent);
};
expj.AC0110010.AC0110010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0110010.AC0110010button0.Clear['onClick' + i])) {
        expj.AC0110010.AC0110010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AC0110010.AC0110010button0.Clear.executeAllOnDecision = function () {
};
expj.AC0110010.AC0110010button0.Clear.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0110010', 'AC0110010button0', 'Clear', this, 'Button');
    }
  });
  expj.AC0110010.AC0110010button0.Clear.executePScriptOnLoad();
};

expj.AC0110010.AC0110010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AC0110010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0110010-AC0110010button0-Clear" name="Clear" class="AC0110010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AC0110010-AC0110010button0-Close">
expj.AC0110010.AC0110010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AC0110010.AC0110010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AC0110010');
};
expj.AC0110010.AC0110010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0110010.AC0110010button0.Close['onClick' + i])) {
        expj.AC0110010.AC0110010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AC0110010.AC0110010button0.Close.executeAllOnDecision = function () {
};
expj.AC0110010.AC0110010button0.Close.executeOnLoad = function () {
  $('#expj-AC0110010-AC0110010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0110010', 'AC0110010button0', 'Close', this, 'Button');
    }
  });
  expj.AC0110010.AC0110010button0.Close.executePScriptOnLoad();
};

expj.AC0110010.AC0110010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AC0110010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AC0110010-AC0110010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0110010-AC0110010button0-Close" name="Close" class="AC0110010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AC0110010 (END)-->
<%
MessageStruct msgStruct = aAC0110010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AC0110010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AC0110010)) {
  expj.common.treeInstanceMap.AC0110010 = {};
}
expj.common.treeInstanceMap.AC0110010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0110010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AC0110010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0110010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AC0110010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AC0110010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AC0110010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AC0110010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AC0110010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AC0110010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AC0110010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0110010)) {
  expj.common.detailDialogMap.AC0110010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0110010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AC0110010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0110010.<%=detailId %>)) {
  expj.common.detailDialogMap.AC0110010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0110010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AC0110010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0110010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AC0110010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AC0110010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AC0110010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AC0110010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AC0110010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AC0110010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AC0110010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AC0110010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AC0110010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AC0110010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AC0110010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AC0110010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AC0110010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AC0110010)) {
  expj.common.viewInstanceMap.AC0110010 = {};
}
expj.common.viewInstanceMap.AC0110010.<%=viewId %> = {};
expj.common.viewInstanceMap.AC0110010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AC0110010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AC0110010.<%=viewId %>.init = function () {
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
    expj.AC0110010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AC0110010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AC0110010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AC0110010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AC0110010_init">
/**
 * AC0110010用のロード完了時初期化関数
 */
expj.AC0110010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AC0110010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AC0110010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AC0110010');
  expj.common.calendarInstanceMap.AC0110010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AC0110010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AC0110010.<%=detailId %>.init();
  expj.common.detailDialogMap.AC0110010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AC0110010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AC0110010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AC0110010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AC0110010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AC0110010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AC0110010-<%=detailId %>');
<%
 }
%>
  try{expj.AC0110010.AC0110010form1.r1_VIEW_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010form1.r2_VIEW_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010form1.DUE_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010form1.CalendarDueDateFrom.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010form1.DUE_TIME_FROM.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010form1.DUE_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010form1.CalendarDueDateTo.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010form1.DUE_TIME_TO.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010form1.Peekerjobodrcd.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010form1.JOB_ODR_CANCEL_NO.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010form1.ALC_GRP_CD.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010form1.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010form1.c1_DM_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010form1.c2_DM_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010form1.c3_DM_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010button3.JobOdrAlc.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010button0.CsvOut.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010form1.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010button1.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010view1.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010button3.executeOnLoad();}catch(e){};
  try{expj.AC0110010.AC0110010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AC0110010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AC0110010', 'AC0110010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AC0110010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AC0110010-focus-move');
  // 初期フォーカス当てる処理
  $('.AC0110010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AC0110010', '<%=request.getContextPath() %>');
};

/**
 * AC0110010の全体onDecision処理
 */
expj.AC0110010.executeAllOnDecision = function () {
  expj.AC0110010.AC0110010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AC0110010_console">
expj.AC0110010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>