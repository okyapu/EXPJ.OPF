<%-- ********************************************************
  This file is generated
    GeneratedDate  : Wed Feb 15 16:44:51 CST 2017
    JspGeneratorVer: 1.1
    HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AZ0050\AZ0050015.html
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

>対象項目選択
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0050/jsp/AZ0050015.jsp,v $
$Author: geng-jia $
$Revision: 1.11 $ $Date: 2017/02/22 02:06:33 $
********************************************************* --%>
<html>
<head>

<%@include file="common/AZ0050.inc"%>

<title> 対象項目選択 </title>
<%@include file="common/expj.jsp" %>
<link rel="stylesheet" href="common/metamorbase.css">

<script src="common/libs/jquery-2.2.4.min.js"></script>
<script src="common/libs/OrteusUtils.js"></script>
<script language="JavaScript" src="common/nonflash.js"></script>
<script language="JavaScript">
<!--

// 初期変数
var index;
var line;

var fmodel;								// 選択テーブル全カラム用リスト
var FromFLG = null;

var tmodel = new TableModel();			// 表示項目用リスト
var TableName = new TableModel();		// テーブル名リスト
var TableAlias = new TableModel();		// エリアス名リスト
var Column = new TableModel();			// カラム名リスト
var ToFLG = null;

var tablelist;
var TableDataList;
var TableAliasList;

/* 初期化処理 */
function initialize()
{

	<%
		// テーブル一覧
		List l_tbl = aAZ0050010Struct.getList_h_TABLE_TO();
		
		// テーブルエリアス一覧
		List l_als = aAZ0050010Struct.getList_h_TABLE_ALIAS_TO();
		
		
		// 設定済みテーブル名の取得[行修正、行複写対応]
		List l_sel_tbl = aAZ0050010Struct.getList_h_TABLE_NAME();
		
		// 設定済みエリアス名の取得[行修正、行複写対応]
		List l_sel_als = aAZ0050010Struct.getList_h_TABLE_ALIAS();
		
		// 設定済みカラム名の取得[行修正、行複写対応]
		List l_sel_col = aAZ0050010Struct.getList_h_COLUMN();
	%>

	// 領域確保
	tablelist = new Array(<%= l_tbl.size() %> * 2);
	TableDataList = new Array(<%= l_tbl.size() %>);
	TableAliasList = new Array(<%= l_tbl.size() %>);

	<%
		for(int i=0; i<l_tbl.size(); i++)
		{
			AZ0050DBInfo dbinfo = aAZ0050010Control.getDBinfo((String)l_tbl.get(i));
		
			List colData = dbinfo.getColumnNames();
			List colComment = dbinfo.getColumnComments();
	%>
	
		// テーブル一覧とテーブルエリアス一覧を作成
		TableDataList[<%=i%>] = "<%= TypeConverter.sanitizer(l_tbl.get(i)) %>";
		TableAliasList[<%=i%>] = "<%= TypeConverter.sanitizer(l_als.get(i)) %>";
		
		// 擬似二次元配列の作成
		tablelist[<%=i * 2%>] = new Array(<%= colData.size() %>);
		tablelist[<%=i * 2 + 1%>] = new Array(<%= colData.size() %>);
	
	<%
			for(int j=0; j<colData.size(); j++)
			{
	%>
				// カラム名、コメント名を設定
				tablelist[<%=i * 2%>][<%=j%>] = "<%= TypeConverter.sanitizer(colData.get(j)) %>";
				tablelist[<%=i * 2 + 1%>][<%=j%>] = "<%= TypeConverter.sanitizer(colComment.get(j)) %>";
	<%
			}
		}
	%>
	
	// 既存データがある場合[行複写、行修正対応]
	<%
		String sel_tbl_comment;
		String sel_col_comment;
		String disptable;
		
		for(int i=0; i<l_sel_tbl.size(); i++)
		{
			// テーブルコメントとカラムコメントの取得
			sel_tbl_comment = aAZ0050010Control.getDBUtilToTableComment((String)l_sel_tbl.get(i));
			sel_col_comment = aAZ0050010Control.getDBUtilToColumnComment((String)l_sel_tbl.get(i), (String)l_sel_col.get(i));
			
			// 表示用テーブル名を作成
			disptable = sel_tbl_comment + "[" + (String)l_sel_als.get(i) + "]";
	%>

			tmodel.setValueAt("<%= disptable %>", <%= i %>, 0);
			tmodel.setValueAt("<%= l_sel_col.get(i) %>", <%= i %>, 1);
			tmodel.setValueAt("<%= sel_col_comment %>", <%= i %>, 2);
			
			TableName.setValueAt("<%= l_sel_tbl.get(i) %>", <%= i %>, 0);
			TableAlias.setValueAt("<%= l_sel_als.get(i) %>", <%= i %>, 0);
			Column.setValueAt("<%= l_sel_col.get(i) %>", <%= i %>, 0);
	
	<%
		}
	%>
	
	// フラグを生成する
	if(tmodel.getRowCount() != 0)
	{
		ToFLG = new Array(tmodel.getRowCount());
	}
	
}

/* 選択したテーブルのカラム／コメントの一覧を表示する */
function checkDispColumn()
{
	index = document.header.tables.selectedIndex;
	fmodel = new TableModel();
	
	FromFLG = new Array(fmodel.getRowCount());
	 
	for(i=0;i<tablelist[index * 2].length;i++)
	{
		fmodel.setValueAt(tablelist[index * 2][i], i, 0);
		fmodel.setValueAt(tablelist[index *2 + 1][i], i, 1);
	}
	// 再描画処理
	repaint2("mltableF", fmodel);
}

/* →ボタンを押した場合 */
function addRow() {
	if(FromFLG == null)
	{
		displayErrorMessage("AZ00031");
		return false;
	}
	
	// 追加する項目が未選択時
	if(Selectline(FromFLG) == null) {
		displayErrorMessage("AZ00031");
		return false;
	}
	
	if(index != document.header.tables.selectedIndex)
	{
		displayErrorMessage("AZ00029");
		return false;
	}
	
	var cnt = document.header.tables.selectedIndex;
	
	// 表示用テーブルの作成
	tmodel = addTbData2(fmodel, tmodel, FromFLG, document.header.tables.options[cnt].text);
	
	// 選択カラム名の作成
	Column = addTbData(fmodel, Column, FromFLG);

	// 選択したカラムのテーブル名、エリアス名の作成
	for(i=0;i<FromFLG.length;i++) {
		if(FromFLG[i] == 1) {
			TableName = addTableData(TableDataList[index] ,TableName);
			TableAlias = addTableData(TableAliasList[index] ,TableAlias);
		}
	}
	
	// 選択テーブル用フラグ作成
	ToFLG = new Array(tmodel.getRowCount());

	// 選択状態解除
	clearTablesColor("mltableF" ,FromFLG);

	// テーブル一覧用フラグの初期化
	FromFLG = clearFlgs(FromFLG);
	
	// 再描画処理
	repaint3("mltableT", tmodel);
}

/* ←ボタンを押した場合 */
function removeRow() {
	
	if(ToFLG == null)
	{
		displayErrorMessage("AZ00032");
		return false;
	}
	
	// 削除項目が未選択時
	if(Selectline(ToFLG) == null) {
		displayErrorMessage("AZ00032");
		return false;
	}
	
	// 項目選択一覧テーブル
	// 選択項目削除
	tmodel = removeTbData2(tmodel, ToFLG);
	
	// 選択カラムの削除
	Column = removeTbData(Column, ToFLG);
	
	// 選択したカラム名のテーブルを削除
	TableName = removeTbData(TableName, ToFLG);
	
	// 選択したカラム名のテーブルエリアスを削除
	TableAlias = removeTbData(TableAlias, ToFLG);

	// 選択テーブル用フラグ再作成
	ToFLG = new Array(tmodel.getRowCount());

	// 再描画処理
	repaint3("mltableT", tmodel);
	
	// 対象項目選択テーブル
	if(fmodel != null) {
		// 選択状態解除
		clearTablesColor("mltableF" ,FromFLG);

		// テーブル一覧用フラグの初期化
		FromFLG = clearFlgs(FromFLG);
	}
}

/* ↑ボタンを押下時 */
function doUp() {
	
	// 項目が選択されてない場合
	if(tmodel.getRowCount() == 0) {
		return;
	}

	if(SelectChkFlgs(ToFLG) == false)
	{
		displayErrorMessage("AZ00034");
		return false;
	}

	// 選択行の取得
	line = Selectline(ToFLG);

	// 選択行が先頭の場合
	if(line == 0 || line == null) {
		return;
	}

	// 選択した行を一つ上に移動する
	tmodel = selectRowUpDisp(tmodel, line);
	TableName = selectRowUpData(TableName, line);
	TableAlias = selectRowUpData(TableAlias, line);
	Column = selectRowUpData(Column, line);
	
	// 再描画処理
	repaint3("mltableT", tmodel);
	
//	if((line - 1) == 0) {
//		ToFLG[line] = 0;
//	} 
//	else {
		// フラグ再設定
		ToFLG[line - 1] = 1;
		ToFLG[line] = 0;
		selectRowSingle("mltableT", line, (line + 1));
//	}
}

/* ↓ボタンを押下時 */
function doDown() {

	// 項目が選択されてない場合
	if(tmodel.getRowCount() == 0) {
		return;
	}
	
	if(SelectChkFlgs(ToFLG) == false)
	{
		displayErrorMessage("複数項目が選択されています");
		return false;
	}
	
	// 選択行の取得
	line = Selectline(ToFLG);
	
	// 選択行が先最後尾の場合
	if(line == (ToFLG.length - 1) || line == null) {
		return;
	}

	// 選択した行を一つ下に移動する
	tmodel = selectRowDownDisp(tmodel, line);
	TableName = selectRowDownData(TableName, line);
	TableAlias = selectRowDownData(TableAlias, line);
	Column = selectRowDownData(Column, line);
	
	// 再描画処理
	repaint3("mltableT", tmodel);

//	if((line + 1) == (ToFLG.length - 1)) {
//		ToFLG[line] = 0;
//	} else {
		// フラグ再設定
		ToFLG[line + 1] = 1;
		ToFLG[line] = 0;
		selectRowSingle("mltableT", (line + 2), line + 1);
//	}
}



/* 選択した項目行の色を変更する */
function selectRowFrom() {
	if (event.srcElement.parentElement.rowIndex == null) {
		return;
	}
	if (event.srcElement.parentElement.rowIndex == 0) {
		return;
	} 

	FromFLG[event.srcElement.parentElement.rowIndex -1]
	= updatedFlg(FromFLG[event.srcElement.parentElement.rowIndex -1]);

	selectRow("mltableF", FromFLG, event.srcElement.parentElement.rowIndex);
}

/* 追加した項目行の色を変更する */
function selectRowTo() {
	if (event.srcElement.parentElement.rowIndex == null) {
		return;
	}
	if (event.srcElement.parentElement.rowIndex == 0) {
		return;
	} 
	
	ToFLG[event.srcElement.parentElement.rowIndex -1]
	= updatedFlg(ToFLG[event.srcElement.parentElement.rowIndex -1]);
	
	selectRow("mltableT", ToFLG, event.srcElement.parentElement.rowIndex);
}

/* クエリ一覧ボタン押下時の処理 */
function checkReturn()
{

	// 確認メッセージ出力
	if(displayConfirmMessage("AZ90001") != true) return false;

	// submit済フラグ ON
	prepareSubmit();
	PreparNoLock();

	return true;
}

function checkCondition()
{

	if(tmodel.getRowCount() == 0)
	{
		displayErrorMessage("AZ00026");
		return false;
	}

	createHiddenTags(Column, "h_COLUMN", "FORM");
	createHiddenTags(TableAlias, "h_TABLE_ALIAS", "FORM");
	createHiddenTags(TableName, "h_TABLE_NAME", "FORM");

	// submit済フラグ ON
	prepareSubmit();
	PreparNoLock();

	return true;
}

function checkFreeSql()
{

	if(tmodel.getRowCount() != 0)
	{
		createHiddenTags(Column, "h_COLUMN", "FORM");
		createHiddenTags(TableAlias, "h_TABLE_ALIAS", "FORM");
		createHiddenTags(TableName, "h_TABLE_NAME", "FORM");
	}

	// submit済フラグ ON
	prepareSubmit();
	PreparNoLock();

	return true;
}


/* その他のボタン押下時の処理 */
function checkSubmit()
{

	if(tmodel.getRowCount() != 0)
	{
		createHiddenTags(Column, "h_COLUMN", "FORM");
		createHiddenTags(TableAlias, "h_TABLE_ALIAS", "FORM");
		createHiddenTags(TableName, "h_TABLE_NAME", "FORM");
	}

	// submit済フラグ ON
	prepareSubmit();
	PreparNoLock();

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
        frameHeight -= document.getElementById('layoutRow2').offsetHeight;
        frameHeight -= document.getElementById('layoutRow4').offsetHeight;

        // 誤差がある時は更に引く
        frameHeight -= 40;

        // レイアウトを調整したい場所の高さを修正
        // レイアウトを調整したい場所の高さを修正
        document.getElementById('layoutRow3').setAttribute('style', 'height:' + frameHeight + 'px');
        document.getElementById('layoutDiv31').setAttribute('style', 'height:' + frameHeight + 'px' + ';'+'border: 1px solid black');
        document.getElementById('layoutDiv32').setAttribute('style', 'height:' + frameHeight + 'px' + ';'+'border: 1px solid black');
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
<tr id="layoutRow2">
<td colspan="4">
<%
	List tbl_list = aAZ0050010Struct.getList_h_TABLE_ALIAS_TO();
	List tbl_comment = aAZ0050010Struct.getList_h_TABLE_COMMENT_TO();
%>
		<table border="0" height="100%" width="100%">
        <tr> 
          <td>&nbsp;&nbsp;&nbsp;&nbsp;
            <select name="tables">
            <%
              for(int cnt=0; cnt<tbl_list.size(); cnt++)
              {
            %>
              <OPTION><%= TypeConverter.sanitizer(tbl_comment.get(cnt)) == null ? null : TypeConverter.sanitizer(tbl_comment.get(cnt)).replaceAll(" ","&nbsp;") %>[<%= TypeConverter.sanitizer(tbl_list.get(cnt)) %>]</OPTION>
            <%
              }
            %>
            </select> <input type="button" name="dispcalumn" value='<%=CoreTools.getRBString("Expj.Cmt0023",rb)%>' class="button" onClick="return checkDispColumn();"></td></tr>
            
          </table>
</td>

</tr>
	<!--- 中段 --->
<tr id="layoutRow3">
	<td height="100%">
		<div class="center">
			<table border="0" height="100%" width="100%">
				<tr height="100%">
					<td align="center">
						<div id="layoutDiv31" class="half" style="border: 1px solid black">
							<table class="outer" cellspacing=0 cellpadding=0 width="100%">
								<tr>
									<td align="center">

                      <table id="mltableF" cellspacing=1 cellpadding=3 width="100%" onclick="return selectRowFrom()" style="{cursor:hand;}">
                        <tr class="header"> 
                          <td><%=CoreTools.getRBString("Expj.Cmt0066",rb)%></td>
                          <td><%=CoreTools.getRBString("Expj.Cmt0067",rb)%></td>
                        </tr>
                      </table>
									</td>
								</tr>
							</table>
						</div>
					</td>
					<td align="center">
						<p><input type="button" value='<%=CoreTools.getRBString("Expj.BtnRight",rb)%>' class="subButton" onClick="return addRow();"></p>
						<p><br></p>
						<p><input type="button" value='<%=CoreTools.getRBString("Expj.BtnLeft",rb)%>' class="subButton" onClick="return removeRow();"></p>
					</td>
					<td align="center">
						<div id="layoutDiv32" class="half" style="border: 1px solid black">
							<table class="outer" cellspacing=0 cellpadding=0 width="100%">
								<tr>
									<td align="center">

                      <table id="mltableT" cellspacing=1 cellpadding=3 width="100%" onclick="return selectRowTo()" style="{cursor:hand;}">
                        <tr class="header"> 
                          <td><%=CoreTools.getRBString("Expj.TABLE_NAME",rb)%></td>
                          <td><%=CoreTools.getRBString("Expj.Cmt0066",rb)%></td>
                          <td><%=CoreTools.getRBString("Expj.Cmt0067",rb)%></td>
                        </tr>
                        <%
                        	List sel_tbl = aAZ0050010Struct.getList_h_TABLE_NAME();
							List sel_als = aAZ0050010Struct.getList_h_TABLE_ALIAS();
							List sel_col = aAZ0050010Struct.getList_h_COLUMN();
							
							for(int cnt=0; cnt<sel_tbl.size(); cnt++)
							{
								// テーブルコメントとカラムコメントの取得
								String tbl_com = aAZ0050010Control.getDBUtilToTableComment((String)sel_tbl.get(cnt));
								String col_com = aAZ0050010Control.getDBUtilToColumnComment((String)sel_tbl.get(cnt), (String)sel_col.get(cnt));
			
								// 表示用テーブル名を作成
								String tbl_disp = tbl_com + "[" + (String)sel_als.get(cnt) + "]";
                        %>
                        <tr class="rows">
                          <td><%= TypeConverter.sanitizer(tbl_disp) == null ? null :  TypeConverter.sanitizer(tbl_disp).replaceAll(" ","&nbsp;") %></td>
                          <td><%= TypeConverter.sanitizer(sel_col.get(cnt)) %></td>
                          <td><%= TypeConverter.sanitizer(col_com) == null ? null :  TypeConverter.sanitizer(col_com).replaceAll(" ","&nbsp;") %></td>
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
						<p><input type="button" value='<%=CoreTools.getRBString("Expj.BtnUp",rb)%>' class="subButton" onClick="return doUp();"></p>
						<p><br></p>
						<p><input type="button" value='<%=CoreTools.getRBString("Expj.BtnDown",rb)%>' class="subButton" onClick="return doDown();"></p>
					</td>
				</tr>
			</table>
		</div>
	</td>
</tr>
    <!----------------------------------------------------------------------------->
<tr id="layoutRow4" valign="middle">
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
              <input type="submit" name="sub5condition" value='<%=CoreTools.getRBString("Expj.BtnNextCond",rb)%>' class="button" onClick="return checkCondition();">
              <input type="submit" name="sub5prior" value='<%=CoreTools.getRBString("Expj.BtnBeforeCond",rb)%>' class="button" onClick="return checkSubmit();">
              <input type="submit" name="sub5freeSql" value='<%=CoreTools.getRBString("Expj.BtnFreeInput",rb)%>' class="button" onClick="return checkFreeSql();">
              <input type="submit" name="sub5clear" value='<%=CoreTools.getRBString("Expj.BtnClear",rb)%>' class="button" onClick="return clearPage();">
              <input type="submit" name="sub5return" value='<%=CoreTools.getRBString("Expj.BtnReturn",rb)%>' class="button" onClick="return checkReturn();">
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
