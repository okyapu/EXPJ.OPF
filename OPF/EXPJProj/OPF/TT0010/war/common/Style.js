//------------------------------------------------------------------------------
// (#)Style.js
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/07/09 version 1.00 新規作成 Y.Inada
//------------------------------------------------------------------------------

/**
 * disabledのスタイル適用。
 * @param オブジェクト
 */
function applyDisable(obj)
{
	obj.disabled = true;
	obj.style.backgroundColor = "#CCCCCC";
}

/**
 * disabledのスタイル解除。
 * @param オブジェクト
 */
function applyEnable(obj)
{
	obj.disabled = false;
	obj.style.backgroundColor = "#FFFFFF";
}
