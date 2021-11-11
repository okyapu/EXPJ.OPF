/*
 * Copyright (c) 2003-2004 NEC Corporation
 * Copyright (c) 2003-2004 NEC informatec Systems,Ltd.
 *
 * AL0040010�F�����H�����ʕ��׎Q�Ɖ�ʗpJavaScript�֐��Q
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0040/jsp/common/AL0040010.js,v $
 * $Author: shakya $
 * $Revision: 1.2 $ $Date: 2005/04/05 07:54:44 $
 */

/**
 * �Ǎ��{�^���������̏���
 */
function checkSelectKey(frmMe)
{
	// submit�\���ǂ������m�F
	if (canSubmit() == false) {
		return false;
	}

	// �������̃`�F�b�N
	if (isNull(frmMe.DateFrom) == true || isNull(frmMe.DateTo) == true) {
		// ����(From), ����(To)�̂����ꂩ��Null�̏ꍇ
		addErrorMessage("ZZ01104");
	}

	if (isDate(frmMe.DateFrom) == false) {
		// ����(From)�����t�Ƃ��Đ������Ȃ��ꍇ
		addErrorMessage("AL40011");
	}

	if (isDate(frmMe.DateTo) == false) {
		// ����(To)�����t�Ƃ��Đ������Ȃ��ꍇ
		addErrorMessage("AL40012");
	}

	if (isNull(frmMe.DateFrom) == false && isNull(frmMe.DateTo) == false
			&& isDate(frmMe.DateTo) == true && isDate(frmMe.DateFrom) == true) {
		// ����(From), ����(To)�̂���������t�Ƃ��Đ������ꍇ

		// ���Ԃ̑召���`�F�b�N
		if (Date.parse(frmMe.DateFrom.value) > Date.parse(frmMe.DateTo.value)) {
			addErrorMessage("AL04001");
		}

		// 90���ȓ������`�F�b�N
		ChangeDay = new Date(frmMe.DateFrom.value);
		Day = 24 * 60 * 60 * 1000;
		if (Date.parse(frmMe.DateTo.value) > ChangeDay.setTime(ChangeDay.getTime() + Day * 89)) {
			addErrorMessage("AL04002");
		}
	}

	// �G���[���b�Z�[�W��\��
	if (displayErrorMessages()) {
		return false;
	}

	// submit�σt���O��ݒ�
	preSubmit();
	return true;
}

/**
 * �T�u(�q)��ʖ߂�{�^���������̏���
 */
function checkCancel1(frmMe)
{
	// submit�\���ǂ������m�F
	if (canSubmit() == false) {
		return false;
	}

	// �m�F�_�C�A���O��\��
	if (displayConfirmMessage("ZZ07013") == false) {
		return false;
	}

	// submit�σt���O��ݒ�
	preSubmit();
	return true;
}

/**
 * �T�u(��)��ʖ߂�{�^���������̏���
 */
function checkCancel2(frmMe)
{
	// submit�\���ǂ������m�F
	if (canSubmit() == false) {
		return false;
	}

	// �m�F�_�C�A���O��\��
	if (displayConfirmMessage("ZZ07013") == false) {
		return false;
	}

	// submit�σt���O��ݒ�
	preSubmit();
	return true;
}

/**
 * �O���t�ړ����̃`�F�b�N����
 */
function checkSelGraph(frmMe)
{
	// submit�\���ǂ������m�F
	if (canSubmit() == false) {
		return false;
	}

	if (isNull(frmMe.Shift_Date) == true) {
		// �ړ�������Null�̏ꍇ
		addErrorMessage("ZZ05002");
		displayErrorMessages();
		_another_exit = 0;
		_dupl_submit = 0;
		return false;
	}
	if (isInteger(frmMe.Shift_Date) == false) {
		// �ړ����������l�łȂ��̏ꍇ
		addErrorMessage("ZZ05002");
		displayErrorMessages();
		_another_exit = 0;
		_dupl_submit = 0;
		return false;
	}

	// submit�σt���O��ݒ�
	preSubmit();
	return true;
}

/**
 * �N���A�{�^���������̏���
 */
function clickClear(frmMe)
{
	// submit�\���ǂ������m�F
	if (canSubmit() == false) {
		return false;
	}

	// �m�F�_�C�A���O��\��
	if (displayConfirmMessage("ZZ07008") == false) {
		return false;
	}

	// submit�σt���O��ݒ�
	preSubmit();
	return true;
}

/**
 * ����{�^���������̏���
 */
function clickClose()
{
	// submit�\���ǂ������m�F
	if (canSubmit() == false) {
		return false;
	}

//	// �m�F�_�C�A���O��\��
//	if (displayConfirmMessage("ZZ01112") == false) {
//		return false;
//	}

	// submit�σt���O��ݒ�
	preSubmit();
	return true;
}

/**
 * �A���J�[�N���b�N�̏���
 */
function clickAnchor()
{
	// submit�\���ǂ������m�F
	if (canSubmit() == false) {
		return false;
	}

	// submit�σt���O��ݒ�
	preSubmit();
	return true;
}

/**
 * �O���t�n�C�p�[�����N�N���b�N�̏���
 */
function clickHyperlink()
{
	// submit�\���ǂ������m�F
	if (canSubmit() == false) {
		return false;
	}

	// submit�σt���O��ݒ�
	preSubmit();
	return true;
}

// --- from docheck.js ---

/** ��ʕ\�������t���O */
var g_completed = false;

/** submit�σt���O */
var g_submitted = false;

/** �����[�h�\��t���O */
var g_maybeLegalUnload = false;

/**
 * ��ʕ\�������ݒ�
 * ���ӁFbody��onLoad�Ŏ��s���邱�ƁB
 */
function setCompleted()
{
	g_completed = true;
}

/**
 * submit�\���ǂ����̊m�F
 * ���ӁFsubmit����������C�x���g�̐擪�Ŗ{�֐������s�� submit���m�F���邱�ƁB
 *       �{�֐��̖߂肪false�̏ꍇ �C�x���g�̖߂��false�ŏI�����邱�ƁB
 *
 * @return true:��/false:�s��
 */
function canSubmit()
{
    // �\���������̂Ƃ� ���������I��
    if (g_completed == false) {
		return false;
	}

    // submit��
    if (g_submitted) {
    	displayErrorMessage("ZZ01110");
        return false;
    }

    // OK
    return true;
}

/**
 * submit���s���O����
 * ���ӁFsubmit�����s���钼�O�Ŗ{�֐������s���邱�ƁB
 *       ������ submit�̌��� �ʉ�ʂ�\��/�`�悷��Ƃ��� ���s���Ȃ��B
 */
function preSubmit()
{
	g_submitted = true;
	g_maybeLegalUnload = true;
}

/**
 * ��ʃA�����[�h������
 * ���ӁFbody �� onBeforeUnload�Ŏ��s���邱�ƁB
 */
function confirmIfIllegal()
{
	if (g_maybeLegalUnload == false) {
		window.event.returnValue = getMessageOnly("ZZ01117");
	}
}

/**
 * ��ʏI��������
 * ���ӁFhtml����script��close()���ĂԑO�Ɏ��s���邱�ƁB
 */
function preClose()
{
	g_maybeLegalUnload = true;
}

// --- from metamorbase.js ---

/////////////////////////////////////////////////
//                  ���ʕϐ��錾               //
/////////////////////////////////////////////////

var _another_exit = 0; // �{�^�������̃t���O�B�����[�h�i��ʏI���܂ށj�̏ꍇ�̓{�^�������ɂ��Ӑ}�������̂ł���Ή�ʈړ��i�I���j�̓��ۂ�₤�B
var _dupl_submit = 0; // ��x������Ԃ̃t���O�B�{�^��������A��ʂ̃����[�h�J�n�܂Łi�T�[�o�������j�̃{�^�����������ۂ���B

/////////////////////////////////////////////////
//                  �ėp                       //
/////////////////////////////////////////////////
var YEARMIN     = 1;           // �N�`�F�b�N�ŏ��l
var YEARMAX     = Infinity;    // �N�`�F�b�N�ő�l
var MONTHMIN    = 1;           // ���`�F�b�N�ŏ��l
var MONTHMAX    = 12;          // ���`�F�b�N�ő�l
var DAYMIN      = 1;           // ���`�F�b�N�ŏ��l
var DAYMAX      = 31;          // ���`�F�b�N�ő�l


/**
 * ���͒l��NULL�`�F�b�N
 *
 * @param obj �`�F�b�N�ΏۃI�u�W�F�N�g
 */
function isNull(obj)
{
	if (obj.value == null || obj.value.length == 0) {
		return true;
	}
	chkstr = obj.value.replace(/^\s+|\s+$/g, "");
	if (chkstr == null || chkstr.length == 0) {
		return true;
	}
	return false;
}

/**
 * ���t�`�F�b�N
 *
 * @param obj �`�F�b�N�ΏۃI�u�W�F�N�g
 */
function isDate(obj)
{
	if (obj.value == null || obj.value.length == 0) {
		return true;
	}
	var date = obj.value;

	if (date.length < 8 || date.length > 10) {
		return false;
	}
	if (!date.match(/(^[0-9]{4,4})\/([0-9]{1,2})\/([0-9]{1,2})$/)) {
		return false;
	}
	var year = RegExp.$1;
	var month = RegExp.$2;
	var day = RegExp.$3;

	var Monthdays = new Array(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
	// �N�A���邤�N�̐ݒ�
	if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
		Monthdays[1] = 29;
	}
	// �N�`�F�b�N
	if (isNaN(year) || year < YEARMIN || year > YEARMAX) {
		return false;
	}
	// ���`�F�b�N
	if (isNaN(month) || month < MONTHMIN || month > MONTHMAX) {
		return false;
	}
	// ���`�F�b�N
	DAYMAX = Monthdays[month - 1];
	if (isNaN(day) || day < DAYMIN || day > DAYMAX) {
		return false;
	}

	return true;
}

/**
 * �����l�`�F�b�N
 *
 * @param obj �`�F�b�N�ΏۃI�u�W�F�N�g
 */
function isInteger(obj)
{
	if (obj.value == null || obj.value.length == 0) {
		return true;
	}
	var str = obj.value;
	if (!str.match(/^[-+]?[0-9]+$/)) {
		return false;
	}
	return true;
}

