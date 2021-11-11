//------------------------------------------------------------------------------
// (#)AZ0050common.js
//
// Copyright (c) 2004 NEC Informatec Systems,Ltd.
//
// version 1.00
// 2004/01/28 新規作成  M.Shirai
//------------------------------------------------------------------------------

var selectOn = "yellow";
var selectOf = "#E6E6FA";

/* 選択した行の色を変更する[複数版] */
function selectRow(tbName, flgArr, idx)
{
	var tbl = document.getElementById(tbName);
	if(flgArr[idx - 1] == 1)
	{
		tbl.rows[idx].style.backgroundColor = selectOn;
	}
	else
	{
		tbl.rows[idx].style.backgroundColor = selectOf;
	}
}

/* 選択した行の色を変更する[単一版] */
function selectRowSingle(tbName, new_idx, old_idx)
{
	var tbl = document.getElementById(tbName);

	if(old_idx == 0){
		tbl.rows[new_idx].style.backgroundColor = selectOn;
	} else {
		if(old_idx == new_idx){
			if(tbl.rows[new_idx].style.backgroundColor == selectOn){
				tbl.rows[new_idx].style.backgroundColor = selectOf;
			} else {
				tbl.rows[new_idx].style.backgroundColor = selectOn;
			}
		} else {
			tbl.rows[old_idx].style.backgroundColor = selectOf;
			tbl.rows[new_idx].style.backgroundColor = selectOn;
		}
	}
}

/* 選択された行の選択フラグを更新して返却する */
function updatedFlg(flg)
{
	var value
	if(flg != 1)
	{
		value = 1;
	}
	else
	{
		value = 0;
	}
	
	return value;
}

/* 選択テーブル再描画処理 */
function repaint(tbName, tbData, tbComment) {
    tb = document.getElementById(tbName);

	while (tb.rows.length > 1) {
		tb.deleteRow(1);
	}
	for (i = 1;i <= tbData.getRowCount(); i++) {
		tb.insertRow(i);
		tb.rows[i].insertCell();
		tb.rows[i].cells[0].innerText = tbComment.getValueAt(i - 1, 0) + "[" + tbData.getValueAt(i - 1, 0) + "]";
		tb.rows[i].className = "rows";
	}
}

/* 項目選択テーブル[結合条件]再描画処理 */
function repaint2(tbName, tbData) {
    tb = document.getElementById(tbName);

	while (tb.rows.length > 1) {
		tb.deleteRow(1);
	}
	for (i = 1;i <= tbData.getRowCount(); i++) {
		tb.insertRow(i);
		tb.rows[i].insertCell();
		tb.rows[i].insertCell();
		tb.rows[i].cells[0].innerText = tbData.getValueAt(i - 1, 0);
		tb.rows[i].cells[1].innerText = tbData.getValueAt(i - 1, 1);
		tb.rows[i].className = "rows";
	}
}

/* 項目選択テーブル[項目選択]再描画処理 */
function repaint3(tbName, tbData) {
    tb = document.getElementById(tbName);

	while (tb.rows.length > 1) {
		tb.deleteRow(1);
	}
	for (i = 1;i <= tbData.getRowCount(); i++) {
		tb.insertRow(i);
		tb.rows[i].insertCell();
		tb.rows[i].insertCell();
		tb.rows[i].insertCell();
		tb.rows[i].cells[0].innerText = tbData.getValueAt(i - 1, 0);
		tb.rows[i].cells[1].innerText = tbData.getValueAt(i - 1, 1);
		tb.rows[i].cells[2].innerText = tbData.getValueAt(i - 1, 2);
		tb.rows[i].className = "rows";
	}
}

/* 結合条件テーブル再描画処理 */
function repaintCondition(tbName, leftAls, leftCom, cond, rightAls, rightCom) {
    tb = document.getElementById(tbName);
	var buffer;

	while (tb.rows.length > 1) {
		tb.deleteRow(1);
	}
	for (i = 1;i <= leftAls.getRowCount(); i++) {
		// 条件を判定
		if(cond.getValueAt(i - 1, 0) == "left") {
			buffer = "左全部と一致する";
		} else if(cond.getValueAt(i - 1, 0) == "right") {
			buffer = "右全部と一致する";
		} else {
			buffer = "両方と一致する";
		}
		tb.insertRow(i);
		tb.rows[i].insertCell();
		tb.rows[i].insertCell();
		tb.rows[i].insertCell();
		tb.rows[i].cells[0].innerText = leftAls.getValueAt(i - 1, 0) + "." + leftCom.getValueAt(i - 1, 0);
		tb.rows[i].cells[1].innerText = buffer;
		tb.rows[i].cells[2].innerText = rightAls.getValueAt(i - 1, 0) + "." + rightCom.getValueAt(i - 1, 0);
		tb.rows[i].className = "rows";
	}
}

/* 選択行を削除しテーブルを再編成する */
function removeTbData(tbData, flgArr) {
	var tbl = new TableModel();
	var j = 0;

	for(i=0;i<flgArr.length;i++)
	{
		// 選択行にnullを設定する
		if(flgArr[i] == 1)
		{
			tbData.setValueAt(null, i, 0);
		}
	}
	
	for(i=0;i<flgArr.length;i++) {
		if(tbData.getValueAt(i, 0) != null)
		{
			tbl.setValueAt(tbData.getValueAt(i, 0), j, 0);
			j++;
		}
	}
	return tbl
}


/* 選択行を削除しテーブルを再編成する[表示項目選択テーブル用] */
function removeTbData2(tbData, flgArr) {
	var tbl = new TableModel();
	var j = 0;

	for(i=0;i<flgArr.length;i++)
	{
		// 選択行にnullを設定する
		if(flgArr[i] == 1)
		{
			tbData.setValueAt(null, i, 0);
			tbData.setValueAt(null, i, 1);
			tbData.setValueAt(null, i, 2);
		}
	}
	
	for(i=0;i<flgArr.length;i++) {
		if(tbData.getValueAt(i, 0) != null)
		{
			tbl.setValueAt(tbData.getValueAt(i, 0), j, 0);
			tbl.setValueAt(tbData.getValueAt(i, 1), j, 1);
			tbl.setValueAt(tbData.getValueAt(i, 2), j, 2);
			j++;
		}
	}
	return tbl
}


/* 選択したテーブルを追加する */
function addTbData(frData, toData, flgArr) {
	for(i=0;i<frData.getRowCount();i++)
	{
		if(flgArr[i] == 1)
		{
			var rowCount = toData.getRowCount();
			
			toData.setValueAt(frData.getValueAt(i, 0), rowCount, 0);
		}
	}
	
	return toData;
}

/* 選択したカラム／コメントを追加する */
function addTbData2(frData, toData, flgArr, tbl) {
	for(i=0;i<frData.getRowCount();i++)
	{
		if(flgArr[i] == 1)
		{
			var rowCount = toData.getRowCount();
			
			toData.setValueAt(tbl, rowCount, 0);
			toData.setValueAt(frData.getValueAt(i, 0), rowCount, 1);
			toData.setValueAt(frData.getValueAt(i, 1), rowCount, 2);
		}
	}
	
	return toData;
}

/* 選択したテカラム情報を追加する */
function addColumnData(frData, toData, index, types) {
	var rowCount = toData.getRowCount();

	toData.setValueAt(frData.getValueAt(index - 1, types), rowCount, 0);
	
	return toData;
}

/* 選択したテーブル情報を追加する */
function addTableData(tbl, toData) {
	var rowCount = toData.getRowCount();
	
	toData.setValueAt(tbl, rowCount, 0);
	
	return toData;
}

/* テーブルの選択状態を解除する[複数用] */
function clearTablesColor(tbName, flgArr) {
	var tbl = document.getElementById(tbName);
	
	for(i=0;i<flgArr.length;i++) {
		if(flgArr[i] == 1) {
			tbl.rows[i + 1].style.backgroundColor = selectOf;
		}
	}
}

/* テーブルの選択状態を解除する[単一用] */
function clearTableColor(tbName, flg) {
	var tbl = document.getElementById(tbName);
	
	tbl.rows[flg].style.backgroundColor = selectOf;
}

/* 選択状態を非選択状態に変更する */
function clearFlgs(flgArr)
{
	for(i=0;i<flgArr.length;i++) {
		if(flgArr[i] == 1) {
			flgArr[i] = 0;
		}
	}
	
	return flgArr;
}

/* 選択項目が複数あるかチェックをする */
function SelectChkFlgs(flgArr)
{
	var flgCount = 0;
	var line;
	for(i=0;i<flgArr.length;i++) {
		if(flgArr[i] == 1) {
			flgCount++;
		}
	}
	
	if(1<flgCount) {
		return false;
	} else {
		return true;
	}
}

/* 選択項目の行数を取得する */
function Selectline(flgArr)
{
	for(i=0;i<flgArr.length;i++) {
		if(flgArr[i] == 1) {
			return i;
		}
	}
	
	return null;
}

/* 選択した行を一つ上に移動する[表示用] */
function selectRowUpDisp(toData, selIdx) {
	var tbl = new TableModel();
	var selData0;
	var selData1;
	var selData2
	
	selData0 = toData.getValueAt(selIdx - 1, 0);
	selData1 = toData.getValueAt(selIdx - 1, 1);
	selData2 = toData.getValueAt(selIdx - 1, 2);
	
	for(i=0;i<toData.getRowCount();i++) {
		if(i == line) {
			tbl.setValueAt(toData.getValueAt(i, 0), i - 1, 0);
			tbl.setValueAt(toData.getValueAt(i, 1), i - 1, 1);
			tbl.setValueAt(toData.getValueAt(i, 2), i - 1, 2);
			tbl.setValueAt(selData0, i , 0);
			tbl.setValueAt(selData1, i , 1);
			tbl.setValueAt(selData2, i , 2);
		} else {
			tbl.setValueAt(toData.getValueAt(i, 0), i, 0);
			tbl.setValueAt(toData.getValueAt(i, 1), i, 1);
			tbl.setValueAt(toData.getValueAt(i, 2), i, 2);
		}
	}
	
	return tbl;
}

/* 選択した行を一つ上に移動する[送信用] */
function selectRowUpData(toData, selIdx) {
	var tbl = new TableModel();
	var selData0;
	
	selData0 = toData.getValueAt(selIdx - 1, 0);
	
	for(i=0;i<toData.getRowCount();i++) {

		
		if(i == line) {
			tbl.setValueAt(toData.getValueAt(i, 0), i - 1, 0);
			tbl.setValueAt(selData0, i , 0);
		} else {
			tbl.setValueAt(toData.getValueAt(i, 0), i, 0);
		}
	}
	
	return tbl;
}

/* 選択した行を一つ下に移動する[表示用] */
function selectRowDownDisp(toData, selIdx) {
	var tbl = new TableModel();
	var selData0;
	var selData1;
	var selData2

	selData0 = toData.getValueAt(selIdx, 0);
	selData1 = toData.getValueAt(selIdx, 1);
	selData2 = toData.getValueAt(selIdx, 2);

	for(i=0;i<toData.getRowCount();i++) {
		if(i == line + 1) {
			tbl.setValueAt(toData.getValueAt(i, 0), i - 1, 0);
			tbl.setValueAt(toData.getValueAt(i, 1), i - 1, 1);
			tbl.setValueAt(toData.getValueAt(i, 2), i - 1, 2);
			tbl.setValueAt(selData0, i , 0);
			tbl.setValueAt(selData1, i , 1);
			tbl.setValueAt(selData2, i , 2);
		} else {
			tbl.setValueAt(toData.getValueAt(i, 0), i, 0);
			tbl.setValueAt(toData.getValueAt(i, 1), i, 1);
			tbl.setValueAt(toData.getValueAt(i, 2), i, 2);
		}
	}
	
	return tbl;
}

/* 選択した行を一つ下に移動する[送信用] */
function selectRowDownData(toData, selIdx) {
	var tbl = new TableModel();
	var selData0;

	selData0 = toData.getValueAt(selIdx, 0);

	for(i=0;i<toData.getRowCount();i++) {
		if(i == line + 1) {
			tbl.setValueAt(toData.getValueAt(i, 0), i - 1, 0);
			tbl.setValueAt(selData0, i , 0);
		} else {
			tbl.setValueAt(toData.getValueAt(i, 0), i, 0);
		}
	}
	
	return tbl;
}

/* 動的にinput(hidden) タグを生成する */
function createHiddenTags(tbData,fieldName, obj) {
	var text = "";

	for(i = 0; i < tbData.getRowCount() ;i++) { 
		text = "<input type='hidden' name='" + fieldName + "' value='" + tbData.getValueAt(i, 0) + "'>";

		document.getElementById(obj).insertAdjacentHTML("BeforeEnd", text);
	}

   document.close();
}

/* 選択業務グループ名再描画処理 */
function repaintGroup(grpName, grpData, grpCode) {
    grp = document.getElementById(grpName);

	while (grp.rows.length > 1) {
		grp.deleteRow(1);
	}
	for (i = 1;i <= grpData.getRowCount(); i++) {
		grp.insertRow(i);
		grp.rows[i].insertCell();
		grp.rows[i].cells[0].innerText = grpData.getValueAt(i - 1, 0);
		grp.rows[i].className = "rows";
	}
}
