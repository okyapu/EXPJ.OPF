<%-- ********************************************************
  This file is generated
    GeneratedDate  : Wed Feb 15 16:45:00 CST 2017
    JspGeneratorVer: 1.1
    HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AZ0050\AZ0050018.html
********************************************************* --%>
<%-- ********** Generated section begin ********** --%>
<%@ page pageEncoding="MS932" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AZ0050.*" %>
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

<jsp:useBean id="aAZ0050010Control" class="com.nec.jp.orteus.metamorBase.AZ0050.AZ0050010Control" scope="request"/>
<jsp:useBean id="aAZ0050010Struct" class="com.nec.jp.orteus.metamorBase.AZ0050.AZ0050010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

>業務グループ設定
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0050/jsp/AZ0050018.jsp,v $
$Author: geng-jia $
$Revision: 1.12 $ $Date: 2017/02/22 02:06:34 $
********************************************************* --%>
<html>
<head>

<%@include file="common/AZ0050.inc"%>
<title> 業務グループ設定 </title>
<%@include file="common/expj.jsp" %>
<link rel="stylesheet" href="common/metamorbase.css">
<script src="common/libs/jquery-2.2.4.min.js"></script>
<script src="common/libs/OrteusUtils.js"></script>
<script language="JavaScript" src="common/nonflash.js"></script>
<script language="JavaScript">

<!--

var fmodel = new TableModel();			// 業務グループ名一覧
var fmodel_cd = new TableModel();		// 業務グループコード
var FromFLG = null;

var tmodel = new TableModel();			// 選択業務グループ名
var tmodel_cd = new TableModel();		// 選択業務グループコード
var ToFLG = null;

var datalen;

var isExist;

/* 初期化処理 */
function initialize()
{
	<%
		List fromGROUP = aAZ0050010Control.getSub8Data();
		List fromCODE = aAZ0050010Control.getSub8CodeData();
		for(int i=0;i<fromGROUP.size();i++) {
	%>
			fmodel.setValueAt("<%= TypeConverter.sanitizer(fromGROUP.get(i)) %>", <%= i %>, 0);
			fmodel_cd.setValueAt("<%= TypeConverter.sanitizer(fromCODE.get(i)) %>", <%= i %>, 0);
	<%
		}
	%>

	FromFLG = new Array(fmodel.getRowCount());
	
	<%
		List toGROUP = aAZ0050010Struct.getList_h_GROUP_TO();
		List toCODE = aAZ0050010Struct.getList_h_GROUP_CODE_TO();
		for(int i=0;i<toGROUP.size();i++) {
	%>
			tmodel.setValueAt("<%= toGROUP.get(i) %>", <%= i %>, 0);
			tmodel_cd.setValueAt("<%= toCODE.get(i) %>", <%= i %>, 0);
	<%
		}
	%>
	
	isExist = false;
	
	if(tmodel.getRowCount() != 0)
	{
		ToFLG = new Array(tmodel.getRowCount());
		datalen = tmodel.getRowCount();
		
		isExist = true;
	}
}

/* →ボタンを押した場合 */
function addRow() {
	if(FromFLG == null)
	{
		displayErrorMessage("AZ00023");
		return false;
	}
	
	// 追加業務グループ名が未選択時
	if(Selectline(FromFLG) == null) {
		displayErrorMessage("AZ00023");
		return false;
	}
	// 選択業務グループ名に追加する
	tmodel = addTbData(fmodel, tmodel, FromFLG);
	
	// 選択業務グループ名[業務グループコード]に追加する
	tmodel_cd = addTbData(fmodel_cd, tmodel_cd, FromFLG);

	// 選択業務グループ名用フラグ作成
	ToFLG = new Array(tmodel.getRowCount());

	// 選択状態解除
	clearTablesColor("mlgroupF" ,FromFLG);

	// 業務グループ名一覧用フラグの初期化
	FromFLG = clearFlgs(FromFLG);

	// 再描画処理
	repaintGroup("mlgroupT", tmodel, tmodel_cd);
}

/* ←ボタンを押した場合 */
function removeRow() {
	if(ToFLG == null)
	{
		displayErrorMessage("AZ00023");
		return false;
	}
	
	// 選択業務グループ名が未選択時
	if(Selectline(ToFLG) == null) {
		displayErrorMessage("AZ00023");
		return false;
	}

	// 選択業務グループ名再描画処理
	// 選択項目削除
	tmodel = removeTbData(tmodel, ToFLG);
	
	// 選択項目削除[業務グループコード]
	tmodel_cd = removeTbData(tmodel_cd, ToFLG);

	// 選択業務グループ名用フラグ再作成
	ToFLG = new Array(tmodel.getRowCount());

	// 描画処理
	repaintGroup("mlgroupT", tmodel, tmodel_cd);
	
	// 業務グループ名一覧再描画処理
	// 選択状態解除
	clearTablesColor("mlgroupF" ,FromFLG);

	// 業務グループ名一覧用フラグの初期化
	FromFLG = clearFlgs(FromFLG);

	// 描画処理
	repaintGroup("mlgroupT", tmodel, tmodel_cd);
}

/* 業務グループ名一覧の選択した行の色を変更する */
function selectRowFrom() {

	if (event.srcElement.parentElement.rowIndex == null) {
		return;
	}
	if (event.srcElement.parentElement.rowIndex == 0) {
		return;
	} 

	FromFLG[event.srcElement.parentElement.rowIndex -1]
	= updatedFlg(FromFLG[event.srcElement.parentElement.rowIndex -1]);

	selectRow("mlgroupF", FromFLG, event.srcElement.parentElement.rowIndex);
}

/* 選択業務グループ名の選択した行の色を変更する */
function selectRowTo() {
	if (event.srcElement.parentElement.rowIndex == null) {
		return;
	}
	if (event.srcElement.parentElement.rowIndex == 0) {
		return;
	} 
	
	ToFLG[event.srcElement.parentElement.rowIndex -1]
	= updatedFlg(ToFLG[event.srcElement.parentElement.rowIndex -1]);
	
	selectRow("mlgroupT", ToFLG, event.srcElement.parentElement.rowIndex);
}

/* 戻るボタン押下時の処理 */
function checkReturn()
{

	// 確認メッセージ出力
	if(displayConfirmMessage("AZ90001") != true) return false;

	// submit済フラグ ON
	prepareSubmit();
	PreparNoLock();

	return true;
}

/* 登録押下時の処理 */
function checkInsert()
{

	if((tmodel.getRowCount() == 0) && (isExist == false))
	{
		displayErrorMessage("AZ00006");
		return false;
	}

	// 確認メッセージ出力
	if(displayConfirmMessage("ZZ07005") == false)  return false;

	createHiddenTags(tmodel_cd, "h_GROUP_CODE_TO", "FORM");
	
	// submit済フラグ ON
	prepareSubmit();
	PreparLock();

	return true;
}

//-->
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
    parentFrame = parent.document.getElementById('expj-business-screen-tabs-body-AZ0050010');
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
        var parentFrame = parent.document.getElementById('expj-business-screen-tabs-body-AZ0050010');
        // 業務画面に与えられた高さを取得
        var frameHeight = parentFrame.clientHeight;

        // 与えられた高さから固定箇所の高さを引く
        frameHeight -= document.getElementById('layoutRow1').offsetHeight;
        frameHeight -= document.getElementById('layoutRow3').offsetHeight;

        // 誤差がある時は更に引く
        frameHeight -= 40;

        // レイアウトを調整したい場所の高さを修正
        // レイアウトを調整したい場所の高さを修正
        document.getElementById('layoutRow2').setAttribute('style', 'height:' + frameHeight + 'px');
        document.getElementById('layoutDiv21').setAttribute('style', 'height:' + frameHeight + 'px' + ';'+'border: 1px solid black');
        document.getElementById('layoutDiv22').setAttribute('style', 'height:' + frameHeight + 'px' + ';'+'border: 1px solid black');
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
    $(window).off('resize.' + 'AZ0050010');
    // windowサイズ変更イベント関数を登録
    $(window).on('resize.' + 'AZ0050010', resizeFunc);
    
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

<body onLoad="initialize();loadComplete();exprSize()"><%-- ********** Generated section begin ********** --%>
<div id="expj-business-screen-AZ0050010" data-noFlash="true" data-screenId="AZ0050010" class="expj-noflash">
<%String nativevalue;%>
<%-- ********** Generated section end ********** --%>
<% 
	aAZ0050010Struct = null;
	aAZ0050010Struct = aAZ0050010Control.getStruct();
%>
<form id="FORM" name="header" method="post" action="AZ0050010Servlet">

<table width="100%" border="0" height="100%">
<!----------------------------------------------------------------------------->
<tr id="layoutRow1">
	<!--- 上段 --->
	<td>
<%
	AZ0050010Struct currentQuery = aAZ0050010Control.getSelStruct();
	// クエリ名/分類/概要いずれか設定があれば表示
	if(currentQuery.getQUERY_NAME() != null || currentQuery.getQUERY_GROUP() != null || currentQuery.getQUERY_MEMO() != null){
%>
    <table border="0" width="100%">
      <tr> 
        <td width="120" class="name"><%=CoreTools.getRBString("Expj.Cmt0413",rb)%></td>
        <td>
          <input type="text" name="QUERY_NAME" size="100" class="readonly" readonly value="<%= TypeConverter.sanitizer(currentQuery.getQUERY_NAME()) %>">
        </td>
      </tr>
      <tr>
        <td class="name"><%=CoreTools.getRBString("Expj.Cmt0014",rb)%></td>
        <td>
          <input type="text" name="QUERY_GROUP" size="50" class="readonly" readonly value="<%= TypeConverter.sanitizer(currentQuery.getQUERY_GROUP()) %>">
        </td>
      </tr>
      <tr>
        <td class="name"><%=CoreTools.getRBString("Expj.Cmt0006",rb)%></td>
        <td> 
          <input type="text" name="QUERY_MEMO" size="100" class="readonly" readonly value="<%= TypeConverter.sanitizer(currentQuery.getQUERY_MEMO()) %>">
        </td>
      </tr>
      <tr> 
        <td colspan="3"> <hr></td>
      </tr>
    </table>
<%	}
	// タイトル未定のときは ダミーの入力域を配置
	else{ %>
      <input type="hidden" name="QUERY_NAME" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getQUERY_NAME()) %>">
      <input type="hidden" name="QUERY_GROUP" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getQUERY_GROUP()) %>">
      <input type="hidden" name="QUERY_MEMO" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getQUERY_MEMO()) %>">
<%	} %>
  </td>
</tr>
<!----------------------------------------------------------------------------->
	<!--- 中段 --->
<tr id="layoutRow2">
	<td height="100%">
		<div class="center">
			<table border="0" height="100%" width="100%">
				<tr height="100%">
					<td width="500" valign="top" align="center">
						<div id="layoutDiv21" class="half" style="border: 1px solid black">
							<table class="outer" cellspacing=0 cellpadding=0 width="100%">
								<tr>
									<td align="center">
										<table id="mlgroupF" cellspacing=1 cellpadding=3 width="100%" onclick="return selectRowFrom()" style="{cursor:hand;}">
										<tr class="header"> 
										  <td><%=CoreTools.getRBString("Expj.BUSINESS_GROUP_NAME",rb)%></td>
										</tr>
										<%
											List grp_f_list = aAZ0050010Control.getSub8Data();

											for(int cnt=0; cnt<grp_f_list.size(); cnt++)
											{
										%>
										<tr class="rows">
										  <td><%= TypeConverter.sanitizer(grp_f_list.get(cnt)) == null ? null : TypeConverter.sanitizer(grp_f_list.get(cnt)).replaceAll(" ","&nbsp;") %></td>
										</tr>
										<%
											}
										%>
										  
										</table>
									</td>
								</tr>
							</table>
						</div>
					</td>
					<td align="center">
						<p><input type="button" value='<%=CoreTools.getRBString("Expj.BtnRight",rb)%>' class="subButton" onClick="return addRow();"></p>
						<p><input type="button" value='<%=CoreTools.getRBString("Expj.BtnLeft",rb)%>' class="subButton" onClick="return removeRow();"></p>
					</td>
					<td width="500" valign="top" align="center">
						<div id="layoutDiv22" class="half" style="border: 1px solid black">
							<table class="outer" cellspacing=0 cellpadding=0 width="100%">
								<tr>
									<td align="center">
										<table id="mlgroupT" cellspacing=1 cellpadding=3 width="100%" onclick="return selectRowTo()" style="{cursor:hand;}">
										<tr class="header"> 
										  <td><%=CoreTools.getRBString("Expj.SELECTED_BUSINESS_GROUP_NAME",rb)%></td>
										</tr>
										<%
										List grp_t_list = aAZ0050010Struct.getList_h_GROUP_TO();
										
										for(int cnt=0; cnt<grp_t_list.size(); cnt++)
										{
										%>
										<tr class="rows">
										  <td><%= TypeConverter.sanitizer(grp_t_list.get(cnt)) == null ? null : TypeConverter.sanitizer(grp_t_list.get(cnt)).replaceAll(" ","&nbsp;") %></td>
										</tr>
										<%
											}
										%>
										</table>
									</td>
								</tr>
							</table>
						</div>
					</td>
				</tr>
			</table>
		</div>
	</td>
</tr>
    <!----------------------------------------------------------------------------->
<tr id="layoutRow3">
	<!--- 下段 --->
	<td height="50" width="100%">
		
      <table height="50" width="100%">
        <tr> 
          <td height="30">
            <hr>
          </td>
        </tr>
        <tr> 
          <td height="30"> 
            <div align="right">
              <input type="hidden" name="SUBMIT_BUTTON_TYPE" value="0">
              <input type="submit" name="sub8Insert" value='<%=CoreTools.getRBString("Expj.BtnInsert",rb)%>' class="button" onClick="return checkInsert();">
              <input type="submit" name="sub8clear" value='<%=CoreTools.getRBString("Expj.BtnClear",rb)%>' class="button" onClick="return clearPage();">
              <input type="submit" name="sub8return" value='<%=CoreTools.getRBString("Expj.BtnReturn",rb)%>' class="button" onClick="return checkReturn();">
            </div>
          </td>
        </tr>
      </table>
	</td>
</tr>
<!----------------------------------------------------------------------------->
<% MessageStruct msgStruct = aAZ0050010Control.getMessage(); %>
<%@ include file="common/SetServerMessage.jsp" %>
</table>

<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div>
<script class="expj-script-AZ0050010-noflash-console-message">
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
