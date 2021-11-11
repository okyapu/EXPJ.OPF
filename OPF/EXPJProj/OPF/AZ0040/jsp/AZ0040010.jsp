<%-- ********************************************************
  This file is generated
    GeneratedDate  : Fri Feb 17 10:25:02 CST 2017
    JspGeneratorVer: 1.1
    HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AZ0040\AZ0040010.html
********************************************************* --%>
<%-- ********** Generated section begin ********** --%>
<%@ page pageEncoding="MS932" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AZ0040.*" %>
<%@ page import="com.nec.jp.orteus.util.*" %>
<%@ page import="com.nec.jp.orteus.msg.util.*" %>
<%@ page import="java.util.*" %>

<%
    HttpSession so = request.getSession(false);
    String locale = (String)so.getAttribute("LOCALE");
    ResourceBundle rb = CoreTools.getResourceBundle("OrteusUserDic", locale);
    ResourceBundle rbs = CoreTools.getResourceBundle("OrteusSysDic", locale);

    response.setHeader("Content-Type", "text/html; charset=" + CoreTools.getCharset(locale));
    response.setContentType("text/html; charset=" + CoreTools.getCharset(locale));
%>

<jsp:useBean id="aAZ0040010Control" class="com.nec.jp.orteus.metamorBase.AZ0040.AZ0040010Control" scope="request"/>
<jsp:useBean id="aAZ0040010Struct" class="com.nec.jp.orteus.metamorBase.AZ0040.AZ0040010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

>一般検索（参照）
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0040/jsp/AZ0040010.jsp,v $
$Author: geng-jia $
$Revision: 1.20 $ $Date: 2017/02/22 02:06:31 $
********************************************************* --%>
<html>
<head>

<title>一般検索（参照）</title>
<%@include file="common/expj.jsp" %>
<link rel="stylesheet" href="common/metamorbase.css">
<script src="common/libs/jquery-2.2.4.min.js"></script>
<script src="common/libs/OrteusUtils.js"></script>
<script language="JavaScript" src="common/nonflash.js"></script>
<script language="JavaScript">
<!--
/* 年月日形式チェック処理 */
function checkDateType(){

	var bRet = true;

	//年未入力チェック 開始日
	if(isNull(document.header.w_CREATED_DATE_FROM) == false){
		var vObjDate = document.header.w_CREATED_DATE_FROM;
		var vValDate =	document.header.w_CREATED_DATE_FROM.value;
		vObjDate.value = vObjDate.value;
		//年月日形式チェック
		if( isDate(vObjDate) == false ){
			bRet = false;
		}
		document.header.w_CREATED_DATE_FROM.value = vValDate;
  }

	//年未入力チェック 終了日
	if(isNull(document.header.w_CREATED_DATE_TO) == false){
		var vObjDate = document.header.w_CREATED_DATE_TO;
		var vValDate =	document.header.w_CREATED_DATE_TO.value;
		vObjDate.value = vObjDate.value;
		//年月日形式チェック
		if( isDate(vObjDate) == false ){
			bRet = false;
		}
		document.header.w_CREATED_DATE_TO.value = vValDate;
  }

	return bRet;
}
// -->
</script>

<script language="JavaScript">
<!--
/* 年月日の開始・終了 相関チェック処理 */
function checkDateSokan()
{
	var fm = document.header;
	//開始と終了の指定がある場合は、チェックする。
	if(isNull(fm.w_CREATED_DATE_FROM) == false && isNull(fm.w_CREATED_DATE_TO) == false){
		if(Date.parse(fm.w_CREATED_DATE_FROM.value) > Date.parse(fm.w_CREATED_DATE_TO.value))
		      return false;
	}
	return true;
}
// -->
</script>

<script language="JavaScript">
<!--
/* 読込ボタン押下時の処理 */
function checkSelect()
{

	// 年月日形式チェック
	if(checkDateType() == false){
		addErrorMessage("ZZ05007");
	}
	if(displayErrorMessages() == true){
		// エラー出力
		return false;
	}

	// 年月日相関チェック
	if(checkDateSokan() == false){
		addErrorMessage("ZZ05101");
	}
	if(displayErrorMessages() == true){
		// エラー出力
		return false;
	}

	// submit済フラグ ON
	prepareSubmit();
	PreparNoLock();
	
	return true;
}
// -->
</script>

<script language="JavaScript">
<!--
/* 読込済みチェック */
function checkFinishSelect()
{
	//読込チェック
	if(document.header.h_MODE.value == "select"){
		return true;
	}

    if (document.header.h_MODE.value == "normal") {
		//未読込エラー
		displayErrorMessage("ZZ01114");
	} else if(document.header.h_MODE.value == "select_war"){
		//対象データなしエラー
		displayErrorMessage("ZZ06001");
	}
	return false;
}

function checkFinishSelect2()
{
	if((document.header.h_MODE.value == "select") || 
	   (document.header.h_MODE.value == "select_war")) {
		return true;
	}
	//未読込エラー
	displayErrorMessage("ZZ01114");
	return false;
}

// -->
</script>

<script language="JavaScript">
<!--
/* 検索実行ボタン押下時の処理 */
function checkSubmit()
{

	// 読込実行後?
	if(checkFinishSelect() == false) return false;

	// submit済フラグ ON
	prepareSubmit();
	PreparNoLock();

	return true;
}
// -->
</script>


<script language="JavaScript">
<!--
/* 検索条件設定ボタン押下時の処理 */
function checkSubmit2()
{
	var fm = document.header;

	// 読込実行後?
	if(checkFinishSelect() == false) return false;

	// 選択したクエリがＧＵＩかチェック
	if (<%= aAZ0040010Control.getListsize() %> == 1) {
		if(fm.r_Btn.checked == true){
			if(fm.EDIT_TYP.value != <%= TypeConverter.sanitizer(AZ0040Const.C_INPUT_GUI) %> ){
				displayErrorMessage("AZ00017"); return false;
			}
		}

	} else {
		for( n=0; n< <%= aAZ0040010Control.getListsize() %> ; n++ ){
			if(fm.r_Btn[n].checked == true){
				if(fm.EDIT_TYP[n].value != <%= TypeConverter.sanitizer(AZ0040Const.C_INPUT_GUI) %> )	{
					displayErrorMessage("AZ00017"); return false;
				}
			}
		}
	}
	
	// submit済フラグ ON
	prepareSubmit();
	PreparNoLock();

	return true;
}
// -->
</script>

<script language="JavaScript">
<!--
/* 共通チェック */
function checkCommon()
{
	return true;
}
// -->
</script>

<script language="JavaScript">
<!--
/* 画面表示時処理 */
function initialize()
{
	sizing();
}
// -->
</script>

<script language="JavaScript">
<!--
/* 入力項目のサイズ設定 */
function sizing()
{
	var fm = document.header;
	fm.w_QUERY_NAME.size = 100;
	fm.w_QUERY_GROUP.size = 50;
	fm.w_MEMO.size = 100;
	fm.w_CREATED_BY.size = 45;				    // 作成者

}
// -->
</script>

<script language="JavaScript">
<!--
function PreparLock(){ document.header.SUBMIT_BUTTON_TYPE.value=1; }

function PreparNoLock(){ document.header.SUBMIT_BUTTON_TYPE.value=0; }

// -->
</script>

<script language="JavaScript">
// 関数名は任意
function exprSize() {

  // Flash版との切り分け（値がnullならばFlash版）
  var parentFrame = null;
  if (parent !== null && parent.document !== null) {
    parentFrame = parent.document.getElementById('expj-business-screen-tabs-body-AZ0040010');
  }
  if (parentFrame === null) {
    return;
  }

  // IE専用処理
  // isMSIEをisChromeにするとChrome専用になる
  if (com.nec.jp.orteus.utils.ClientInfo.browser.isMSIE) {
    // サイズ調整関数の定義
    var resizeFunc = function () {
      try {
        // 業務画面に割り当てられたフレームタグを取得
        var parentFrame = parent.document.getElementById('expj-business-screen-tabs-body-AZ0040010');
        // 業務画面に与えられた高さを取得
        var frameHeight = parentFrame.clientHeight;

        // 与えられた高さから固定箇所の高さを引く
        frameHeight -= document.getElementById('layoutRow1').offsetHeight;
        frameHeight -= document.getElementById('layoutRow3').offsetHeight;
        frameHeight -= document.getElementById('layoutRow4').offsetHeight;
        // 誤差がある時は更に引く
        frameHeight -= 50;

        // レイアウトを調整したい場所の高さを修正
        document.getElementById('layoutRow2').setAttribute('style', 'height:' + frameHeight + 'px');
        document.getElementById('layoutDiv2').setAttribute('style', 'height:' + frameHeight + 'px');
        // ※既にタグにstyle属性がある場合は、以下を利用すると既存のstyle属性に影響を与えずに修正できる
        // $('#layoutRow2').css('height', frameHeight + 'px');
        // $('#layoutDiv2').css('height', frameHeight + 'px');

      } catch (e) {
        // エラーが発生したらここでキャッチされる。
      }
    };

    // 1回関数を呼び出してレイアウトを調整する
    resizeFunc();

    // すでに登録してあるwindowサイズ変更イベント関数を削除
    $(window).off('resize.' + 'AZ0040010');
    // windowサイズ変更イベント関数を登録
    $(window).on('resize.' + 'AZ0040010', resizeFunc);
    
  } else if (com.nec.jp.orteus.utils.ClientInfo.browser.isChrome) {
    // formタグのmargin-bottomを修正
    $('form').css('margin-bottom', '0px');
  }
}
</script>

<%-- ********** Generated section begin ********** --%>
<script language="javascript">
function executeSubmit(formobj) {
  return(true);
}
</script>
<meta http-equiv="X-UA-Compatible" content="IE=5" />
<script language="JavaScript" src="common/html5_message.js"></script>
<meta http-equiv="Content-Type" content="<%="text/html; charset=" + CoreTools.getCharset(locale)%>">
<%-- ********** Generated section end ********** --%>
</head>

<body onLoad="sizing();loadComplete();exprSize();"><%-- ********** Generated section begin ********** --%>
<div id="expj-business-screen-AZ0040010" data-noFlash="true" data-screenId="AZ0040010" class="expj-noflash">
<%String nativevalue;%>
<%-- ********** Generated section end ********** --%>

<form name="header" method="post" action="AZ0040010Servlet">

  <!-- 画面モードフラグ保持用 -->
	<input type="hidden" name="h_MODE" value="<%= TypeConverter.sanitizer(aAZ0040010Control.getMode()) %>">
  <!-- 押下ボタン種別保持用 -->
	<input type="hidden" name="SUBMIT_BUTTON_TYPE" value="0">
  <!-- ウィンドウクローズ処理 -->
	<script language="JavaScript">
		if(document.header.h_MODE.value == "close"){
			close();
		}
	</script>

	<%
		//画面表示用 Struct
		aAZ0040010Struct = null;
		aAZ0040010Struct=(AZ0040010Struct)aAZ0040010Control.getKeyStruct();
	%>

  <table width="100%" border="0" height="100%">
<!----------------------------------------------------------------------------->
<tr id="layoutRow1">
  <td> 
    <table border="0" width="100%">
      <tr>
        <td nowrap class="name"><%=CoreTools.getRBString("Expj.Cmt0413",rb)%></td>
        <td colspan="2">
            <input type="text" name="w_QUERY_NAME" value="<%= TypeConverter.sanitizer(aAZ0040010Struct.getw_QUERY_NAME()) %>">
            <%=CoreTools.getRBString("Expj.Cmt0002",rb)%>
        </td>
      </tr>
      <tr> 
        <td class="name"><%=CoreTools.getRBString("Expj.Cmt0014",rb)%></td>
        <td colspan="2">
          <input type="text" name="w_QUERY_GROUP" value="<%= TypeConverter.sanitizer(aAZ0040010Struct.getw_QUERY_GROUP()) %>">
          <%=CoreTools.getRBString("Expj.Cmt0002",rb)%>
        </td>
      </tr>
      <tr> 
        <td class="name"><%=CoreTools.getRBString("Expj.Cmt0006",rb)%></td>
        <td colspan="2">
          <input type="text" name="w_MEMO" value="<%= TypeConverter.sanitizer(aAZ0040010Struct.getw_MEMO()) %>">
          <%=CoreTools.getRBString("Expj.Cmt0002",rb)%>
        </td>
      </tr>
      <tr>
        <td class="name"><%=CoreTools.getRBString("Expj.CREATED_BY",rb)%></td>
        <td>
          <input type="text" name="w_CREATED_BY" value="<%= TypeConverter.sanitizer(aAZ0040010Struct.getw_CREATED_BY()) %>">
        </td>
      </tr>
      <tr> 
        <td class="name"><%=CoreTools.getRBString("Expj.CREATED_DATE",rb)%></td>
        <td>
          <input type="text" name="w_CREATED_DATE_FROM" maxlength="10" value="<%= TypeConverter.sanitizer(aAZ0040010Struct.getw_CREATED_DATE_FROM()) %>"> <%=CoreTools.getRBString("Expj.Cmt0043",rb)%>  <input type="text" name="w_CREATED_DATE_TO" maxlength="10" value="<%= TypeConverter.sanitizer(aAZ0040010Struct.getw_CREATED_DATE_TO()) %>">
        </td>
        <td align="right">
          <input type="submit" name="select" value='<%=CoreTools.getRBString("Expj.BtnSelect",rb)%>' class="button" onClick="return checkSelect();">
        </td>
      </tr>
      <tr> 
        <td colspan="3"><hr></td>
      </tr>
    </table>
  </td>
</tr>
<!----------------------------------------------------------------------------->
<tr id="layoutRow2">
  <td height="100%">
    <div class="center" id="layoutDiv2">
    <table class="outer" cellspacing=0 cellpadding=0><tr><td>
      <table cellspacing=1 cellpadding=3>
        <tr class="header"> 
          <td align="center"><%=CoreTools.getRBString("Expj.Cmt0015",rb)%></td>
          <td><%=CoreTools.getRBString("Expj.Cmt0065",rb)%></td>
          <td><%=CoreTools.getRBString("Expj.Cmt0413",rb)%></td>
          <td><%=CoreTools.getRBString("Expj.Cmt0014",rb)%></td>
          <td><%=CoreTools.getRBString("Expj.Cmt0006",rb)%></td>
          <td><%=CoreTools.getRBString("Expj.CREATED_BY",rb)%></td>
          <td><%=CoreTools.getRBString("Expj.CREATED_DATE",rb)%></td>
          <td><%=CoreTools.getRBString("Expj.UPDATED_BY",rb)%></td>
          <td><%=CoreTools.getRBString("Expj.UPDATED_DATE",rb)%></td>
        </tr>
        <%-- ********** Generated section begin ********** --%>
<%
{
  int aAZ0040010StructLength = aAZ0040010Control.getListsize();
  final AZ0040010Struct structBackup = aAZ0040010Struct;
  aAZ0040010Struct = null;
  for(int loopCount = 0; loopCount < aAZ0040010StructLength; ++loopCount) {
%>
<%
  if((aAZ0040010Struct = (AZ0040010Struct) aAZ0040010Control.getListvalue(loopCount)) == null) continue;
  pageContext.setAttribute("aAZ0040010Struct", aAZ0040010Struct);
  String rowStyleClass=(loopCount%2==0)?"":"";
%>
<%-- ********** Generated section end ********** --%>
        <tr class="rows"> 
          <td align="center"> 
            <% if(loopCount == 0){ %>
              <input type="radio" name="r_Btn" value="<%=loopCount%>" id='<%="r_Btn" + loopCount%>' checked>
            <% }else{ %>
              <input type="radio" name="r_Btn" value="<%=loopCount%>" id='<%="r_Btn" + loopCount%>'>
            <% } %>
          </td>
		  <td><%= TypeConverter.sanitizer(aAZ0040010Struct.getEDIT_NAME()) %></orlabel></td>
          <td><%= TypeConverter.sanitizer(aAZ0040010Struct.getQUERY_NAME()) == null ? null : TypeConverter.sanitizer(aAZ0040010Struct.getQUERY_NAME()).replaceAll(" ","&nbsp;") %></td>
          <td><%= TypeConverter.sanitizer(aAZ0040010Struct.getQUERY_GROUP()) == null ? null : TypeConverter.sanitizer(aAZ0040010Struct.getQUERY_GROUP()).replaceAll(" ","&nbsp;") %></td>
          <td><%= TypeConverter.sanitizer(aAZ0040010Struct.getQUERY_MEMO()) == null ? null : TypeConverter.sanitizer(aAZ0040010Struct.getQUERY_MEMO()).replaceAll(" ","&nbsp;") %></td>
          <td><%= TypeConverter.sanitizer(aAZ0040010Struct.getCREATED_BY()) == null ? null : TypeConverter.sanitizer(aAZ0040010Struct.getCREATED_BY()).replaceAll(" ","&nbsp;") %></td>
          <td><%= TypeConverter.sanitizer(aAZ0040010Struct.getCREATED_DATE()) %></orlabel></td>
          <td><%= TypeConverter.sanitizer(aAZ0040010Struct.getUPDATED_BY()) == null ? null : TypeConverter.sanitizer(aAZ0040010Struct.getUPDATED_BY()).replaceAll(" ","&nbsp;") %></td>
          <td><%= TypeConverter.sanitizer(aAZ0040010Struct.getUPDATED_DATE()) %><br></orlabel></td>
		  <input type="hidden" name="EDIT_TYP" value="<%= TypeConverter.sanitizer(aAZ0040010Struct.getEDIT_TYP()) %>">
        </tr>
        <%-- ********** Generated section begin ********** --%>
<%
  }
  aAZ0040010Struct = structBackup;
}
%>
<%-- ********** Generated section end ********** --%>
      </table>
    </td>
    </tr>
    </table>
    </div>
  </td>
</tr>
<tr>
  <td> 
  </td>
</tr>
<tr id="layoutRow3">
  <td>
    <input type="submit" name="execute" value='<%=CoreTools.getRBString("Expj.BtnExcuteQuery",rb)%>' class="button" onClick="return checkSubmit();">
    <input type="submit" name="condition" value='<%=CoreTools.getRBString("Expj.BtnSetCondition",rb)%>' class="button" onClick="return checkSubmit2();">
  </td>
</tr>
<!----------------------------------------------------------------------------->
<tr id="layoutRow4">
  <td height="40px" width="100%">
    <table width="100%">
      <tr>
        <td height="10px"><hr></td>
      </tr>
      <tr>
        <td height="30px" align="right">
          <input type="submit" name="clear" value='<%=CoreTools.getRBString("Expj.BtnClear",rb)%>' class="button" onClick="return clearPage();">
          <input type="button" name="close" value='<%=CoreTools.getRBString("Expj.BtnClose",rb)%>' class="button" onClick="return delPage();">
        </td>
      </tr>
    </table>
  </td>
</tr>
<% MessageStruct msgStruct = aAZ0040010Control.getMessage(); %>
<%@ include file="common/SetServerMessage.jsp" %>
</table>
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div>
<script class="expj-script-AZ0040010-noflash-console-message">
function getExpjNoFlashPageConsoleMessage() {
  return '<%=messageString %>';
}
(function () {
  var message = getExpjNoFlashPageConsoleMessage();
  if (message !== '') {
    // コンソール出力
    parent.expj.common.setScreenFrameConsoleMessage(message);
  }
  parent.expj.common.controlLoadingScreen(false);
  _expj_screen_move_convert();
  
  var forms = document.getElementsByTagName('form');
  for (var formElement in forms) {
    var ele = forms[formElement];
    forms[formElement].onsubmit = function () {
      parent.expj.common.controlLoadingScreen(true);
    };
  }
})();
</script>
</body>
</html>
