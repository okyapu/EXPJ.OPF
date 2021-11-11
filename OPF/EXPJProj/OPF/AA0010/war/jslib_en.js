// $Revision: 1.1 $
// $Date: 2017/03/13 08:11:14 $

/////////////////////////////////////////////////
//                                             //
/////////////////////////////////////////////////

var YEARMIN = 1900;       //
var YEARMAX = 2100;       //
var MONTHMIN = 1;         //
var MONTHMAX = 12;        //
var DAYMIN = 1;           //
var DAYMAX = 31;          //
var NUMMAX_H = 9999999999.9;             //
var NUMMAX_J = 9999999999.99;            //
var NUMMAX_K = 9999999999.9999999999;    //
var NUMMAX_L = 9999999999.9999999999;    //
var NUMMIN_H = 0;                        //
var NUMMIN_J = 0;                        //
var NUMMIN_K = 0;                        //
var NUMMIN_L = -9999999999.9999999999;   //

var INTEGER_STR = "0123456789";
var DECIMAL_STR = ".0123456789";

/////////////////////////////////////////////////
// HEADLIST
// nn:
// nu:
/////////////////////////////////////////////////

var HEADLIST = new Array("nn", "nu");
var HEADATTR = new Array("nn", "nu");
var HEADERR = new Array("No value has been entered in the mandatory input area",
                        "Please choose the record to delete",
                        "An eliminable record does not exist");

/////////////////////////////////////////////////
// CHECKLIST
// INT:
// DCM:
// DCH:
// DCJ:
// DCK:
// DCL:
// TEXT:
// SBTX:
// MBTX:
// YEAR:
// MNTH:
// DAY:
// DATE:
/////////////////////////////////////////////////

var CHECKLIST = new Array("INT","DCM","DCH","DCJ","DCK","DCL","TEXT","SBTX","MBTX","YEAR","MNTH","DAY","DATE");

/////////////////////////////////////////////////
// CHECKLIST
// I:chkInteger
// G:chkDecimal
// H:chkDecimal_H
// J:chkDecimal_J
// K:chkDecimal_K
// L:chkDecimal_L
// T:
// 1:chk2byte
// 2:chkAll2byte
// Y:chkYear
// M:chkMonth
// D:chkDay
// W:chkDate
/////////////////////////////////////////////////

var CHECKATTR = new Array("I","G","H","J","K","L","T","1","2","Y","M","D","W");

/////////////////////////////////////////////////
//
/////////////////////////////////////////////////

var CHECKERR = new Array("Enter an integer.",
                         "Enter a numeric value.",
                         "Enter a numeric value. Format：9999999999.9",
                         "Enter a numeric value. Format：9999999999.99",
                         "Enter a numeric value. Format：9999999999.9999999999",
                         "Enter a numeric value. Format：[+-]9999999999.9999999999",
                         "Enter a character string.",
                         "Enter 1-byte characters.",
                         "Enter 2-byte characters.",
                         "Enter YYYY (year in 4 digits).",
                         "Enter MM (month in 2 digits).",
                         "Enter DD (date in 2 digits).",
                         "Enter a date in the MM/DD/YYYY format.");

/////////////////////////////////////////////////
//                                             //
/////////////////////////////////////////////////
//
//
//

var dat = new Date();

//
function getYear()
{
    return dat.getYear();
}

//
function getMonth()
{
    var month = dat.getMonth() + 1;
    if (month < 10) {
        //
        month= "0" + month;
    }
    return month;
}

//
function getDay()
{
    var date = dat.getDate();
    if (date < 10) {
        //
        date= "0" + date;
    }
    return date;
}

/////////////////////////////////////////////////
//                                             //
//                                             //
//                                             //
/////////////////////////////////////////////////
function isNull(form)
{
    var i = 0;
    for (i = 0; i < form.length; i++) {
        if (form.elements[i].type == "text") {
            var name = form.elements[i].name;
            var flag = name.indexOf(HEADLIST[0],4);
            if (flag != -1 && (form.elements[i].value == "" || form.elements[i].value == null)) {
                form.elements[i].focus();
                return false;
            }
        }
    }
    return true;
}

/////////////////////////////////////////////////
//
/////////////////////////////////////////////////
function checkForm(form)
{
    if (isNull(form) != true) {
        alert(HEADERR[0]);
        return false;
    }
    var i = 0, k = 0;
    var flag = false;
    for (i = 0; i < form.length; i++) {
        if (form.elements[i].type == "text") {
            var name = form.elements[i].name;
            for (k = 0; k < CHECKLIST.length; k++) {
                flag = name.indexOf(CHECKLIST[k],6);
                if (flag == 6) {
                    break;
                }
            }
            var res, value;
            value = form.elements[i].value;
            if (value == "" || value.length == 0) {
                res = true;
            }
            else {
                switch(CHECKATTR[k]) {
                  case "I":
                    res = chkInteger(value);
                    break;
                  case "G":
                    res = chkDecimal(value);
                    break;
                  case "H":
                    res = chkDecimal_H(value);
                    break;
                  case "J":
                    res = chkDecimal_J(value);
                    break;
                  case "K":
                    res = chkDecimal_K(value);
                    break;
                  case "L":
                    res = chkDecimal_L(value);
                    break;
                  case "1":
                    res = chk2byte(value);
                    if (res == false) {
                        res = true ;
                    }
                    else {
                        res = false;
                    }
                    break;
                  case "2":
                    res = chkAll2byte(value);
                    break;
                  case "Y":
                    res = chkYear(value);
                    break;
                  case "M":
                    res = chkMonth(value);
                    break;
                  case "D":
                    res = chkDay(value);
                    break;
                  case "W":
                    res = chkDate(value);
                    break;
                }
            }
            if (res == false) {
                alert(CHECKERR[k]);
                form.elements[i].focus();
                return false;
            }
        }
    }
}

/////////////////////////////////////////////////
//                                             //
/////////////////////////////////////////////////
//
function ResizeToMax(obj)
{
    var sWidth = obj.screen.availWidth;
    var sHeight = obj.screen.availHeight;
    obj.resizeTo(sWidth,sHeight);
    obj.moveTo(0,0);
    obj.focus();
}

/////////////////////////////////////////////////
//                                             //
/////////////////////////////////////////////////
//
function checkLength(obj, min_length, max_length)
{
    var len;
    if (obj == null) {
        return false;
    }
    len = getLength(obj.value);
    if (len < min_length || len > max_length) {
        dispLengthErr(min_length, max_length);
        obj.focus();
        return false;
    }
    return true;
}

//
function checkNull(obj)
{
	if(obj != null) {
		// 
		if(obj.length > 0) {
		    var i;
		    for(i = 0; i < obj.length; i++) {
		    	if (obj[i].value == null || obj[i].value.length == 0) {
		        	alert(HEADERR[0]);
			        obj[i].focus();
		    	    return false;
		    	}
		    }
		}
		
		// 
		else {
		    if (obj.value == null || obj.value.length == 0) {
				alert(HEADERR[0]);
		        obj.focus();
		        return false;
		    }
		}
	}
	return true;
}


// 
function checkCheckboxSelected(obj)
{
	if(obj != null) {
		// 
		if(obj.length > 0){
		    var i;
		    for(i = 0; i < obj.length; i++) {
				
				// 
				if(obj[i] != null && obj[i].checked == true){
					return true;
				}
				else{
			        obj[i].focus();
		        	continue;
				}
		    }
		    alert(HEADERR[1]);
			return false;
		}
		
		// 
		else{
			
			// 
			if(obj != null && obj.checked == true){
				return true;
			}
		    obj.focus();
		    alert(HEADERR[1]);
			return false;
		}
	} else {
		alert(HEADERR[2]);
		return false;
	}
	return false;
}


/////////////////////////////////////////////////
//                                             //
/////////////////////////////////////////////////
//
//
//

//
function checkYear(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkYear(obj.value) == false) {
        alert(CHECKERR[9]);
        obj.focus();
        return false;
    }
    return true;
}

//
function checkMonth(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkMonth(obj.value) == false) {
        alert(CHECKERR[10]);
        obj.focus();
        return false;
    }
    return true;
}

//
function checkDay(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkDay(obj.value) == false) {
        alert(CHECKERR[11]);
        obj.focus();
        return false;
    }
    return true;
}

//
function checkDate(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkDate(obj.value) == false) {
        alert(CHECKERR[12]);
        obj.focus();
        return false;
    }
    return true;
}

/////////////////////////////////////////////////
//                                             //
/////////////////////////////////////////////////
//
function checkInteger(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkInteger(obj.value) == false) {
        alert(CHECKERR[0]);
        obj.focus();
        return false;
    }
    return true;
}

//
function checkDecimal(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkDecimal(obj.value) == false) {
        alert(CHECKERR[1]);
        obj.focus();
        return false;
    }
    return true;
}

//
function checkIntegerRange(obj, min, max)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkInteger(obj.value) == false) {
        alert(CHECKERR[0]);
        obj.focus();
        return false;
    }
    if (obj.value < min || obj.value > max) {
        dispRangeErr(min, max);
        obj.focus();
        return false;
    }
    return true;
}

//
function checkDecimalRange(obj, min, max)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkDecimal(obj.value) == false) {
        alert(CHECKERR[1]);
        obj.focus();
        return false;
    }
    if (obj.value < min || obj.value > max) {
        dispRangeErr(min, max);
        obj.focus();
        return false;
    }
    return true;
}

//
function checkDecimal_H(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkDecimal_H(obj.value) == false) {
        alert(CHECKERR[2]);
        obj.focus();
        return false;
    }
    return true;
}

//
function checkDecimal_J(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkDecimal_J(obj.value) == false) {
        alert(CHECKERR[3]);
        obj.focus();
        return false;
    }
    return true;
}

//
function checkDecimal_K(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkDecimal_K(obj.value) == false) {
        alert(CHECKERR[4]);
        obj.focus();
        return false;
    }
    return true;
}

//
function checkDecimal_L(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkDecimal_L(obj.value) == false) {
        alert(CHECKERR[5]);
        obj.focus();
        return false;
    }
    return true;
}

//
function checkText(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    return true;
}

//
function checkSingleByte(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chk2byte(obj.value) == true) {
        alert(CHECKERR[7]);
        obj.focus();
        return false;
    }
    return true;
}

//
function checkMultiByte(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkAll2byte(obj.value) == false) {
        alert(CHECKERR[8]);
        obj.focus();
        return false;
    }
    return true;
}

/////////////////////////////////////////////////
//                                             //
/////////////////////////////////////////////////

//
function chkYear(value)
{
    var year = value;
    if (year.length == 0) {
        return true;
    }
    if (chkInteger(year) == false) {
        return false;
    }
    if (year < YEARMIN || year > YEARMAX) {
        return false;
    }
    return true;
}

//
function chkMonth(value)
{
    var month = value;
    if (month.length == 0) {
        return true;
    }
    if (chkInteger(month) == false) {
        return false;
    }
    if (month < MONTHMIN || month > MONTHMAX) {
        return false;
    }
    return true;
}

//
function chkDay(value)
{
    var day = value;
    if (day.length == 0) {
        return true;
    }
    if (chkInteger(day) == false) {
        return false;
    }
    if (day < DAYMIN || day > DAYMAX) {
        return false;
    }
    return true;
}

//
function chkDate(value)
{
    var monthdays0 = new Array(31,28,31,30,31,30,31,31,30,31,30,31);
    var monthdays1 = new Array(31,29,31,30,31,30,31,31,30,31,30,31); //
    var date = value;
    var year, month, day;
    var leapyear = false;
    var dx;

    //
    if (date.length == 0) {
        return true;
    }
    if (date.length < 10) {
        return false;
    }
    month = date.substr(0,2);
    day = date.substr(3,2);
    year = date.substr(6,4);
    if (chkInteger(month) == false) {
        return false;
    }
    if (date.substr(2,1) != "/") {
        return false;
    }
    if (chkInteger(day) == false) {
        return false;
    }
    if (date.substr(5,1) != "/") {
        return false;
    }
    if (chkInteger(year) == false) {
        return false;
    }

    //
    if (year < YEARMIN || year > YEARMAX) {
        return false;
    }
    if (month < MONTHMIN || month > MONTHMAX) {
        return false;
    }
    //
    if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
        leapyear = true;
    }
    if (leapyear == false) {
        dx = monthdays0[eval(month) - 1];
    }
    else {
        dx = monthdays1[eval(month) - 1];
    }
    if (day < DAYMIN || day > dx) {
        return false;
    }
    return true;
}

//
function chkInteger(str)
{
    if (chkChar(str, INTEGER_STR) == false) {
        return false;
    }
    return true;
}

//
function chkDecimal(str)
{
    if (chkChar(str, DECIMAL_STR) == false) {
        return false;
    }
    if (chkDot(str) == false) {
        return false;
    }
    return true;
}

//
function chkDecimal_H(str)
{
    if (chkDecimal(str) == false) {
        return false;
    }
    if (chkFormat(str, 10, 1) == false) {
        return false;
    }
    return true;
}

//
function chkDecimal_J(str)
{
    if (chkDecimal(str) == false) {
        return false;
    }
    if (chkFormat(str, 10, 2) == false) {
        return false;
    }
    return true;
}

//
function chkDecimal_K(str)
{
    if (chkDecimal(str) == false) {
        return false;
    }
    if (chkFormat(str, 10, 10) == false) {
        return false;
    }
    return true;
}

//
function chkDecimal_L(str)
{
    var nstr;
    if (str.charAt(0) == "-") {
        nstr = str.substr(1);
    }
    else {
        nstr = str;
    }
    if (chkDecimal_K(nstr) == false) {
        return false;
    }
    return true;
}

//
function getLength(str)
{
    var i, cnt = 0;
    for(i = 0; i < str.length; i++) {
        if (isZenkaku(str.charCodeAt(i)) == true) {
            cnt += 2;
        }
        else {
            cnt++;
        }
    }
    return cnt;
}

//
function chk2byte(str)
{
    var i;
    for(i = 0; i < str.length; i++) {
        if (isZenkaku(str.charCodeAt(i)) == true) {
            return true; //
        }
    }
    return false; //
}

//
function chkAll2byte(str)
{
    var i;
    for(i = 0; i < str.length; i++) {
        if (isZenkaku(str.charCodeAt(i)) == false) {
            return false;
        }
    }
    return true;
}

// isUndefined
function isUndefined(obj)
{
    if (obj.toString() == "undefined") {
        return true;
    }
    return false;
}

// chkChar
function chkChar(str, chkstr)
{
    var flag = false;
    var i = 0, j = 0;
    for (i = 0; i < str.length; i++) {
        flag = false;
        for(j = 0; j < chkstr.length; j++) {
            if (str.charAt(i) == chkstr.charAt(j)) {
                flag = true;
                break;
            }
        }
        if (flag != true) {
            return false;
        }
    }
    return true;
}

// chkDot
function chkDot(str)
{
    var first, last;
    first = str.indexOf(".");
    last = str.lastIndexOf(".");
    if (first == last) {
        return true;
    }
    return false;
}

// chkFormat
function chkFormat(str, left, right)
{
    var dot = str.indexOf(".");
    if (dot == -1) { //
        if (str.length > left) {
            return false;
        }
        return true;
    }
    if (dot > left) {
        return false;
    }
    if ((str.length - dot) > (right + 1)) {
        return false;
    }
    return true;
}

// isZenkaku
function isZenkaku(code)
{
    //
    if ((code != 0x9 || code != 0x0A || code != 0x0D || code != 0x20) && (code <= 0x7F)) {
        return false;
    }
    //
    if ((code >= 0xFF6C && code <= 0xFF9F) || (code >= 0xFF66 && code <= 0xFF6B) || (code >= 0xFF61 && code <= 0xFF63) && (code != 0x30FB)) {
        return false;
    }
    return true;
}

//
function getAppName()
{
    return navigator.appName;
}

/////////////////////////////////////////////////
//
/////////////////////////////////////////////////
function dispLengthErr(min, max)
{
    if (min == max) {
        alert("Enter the value of " + min + " characters.");
    }
    else{
        alert("Enter the value of " + min + " to " + max + " characters.");
    }
}

function dispRangeErr(min, max)
{
    alert("Enter the value of the range of " + min + "-" + max + ".");
}




////////////////////////////////////////////////////////////
//  PAGE CONTROLLER FUNCTION
////////////////////////////////////////////////////////////

/*
 * Page Controller
 *
 * param formobj FormObject
 * param row     Row of beggning of searching
 */
function pageLink( formobj, row ) {

    formobj.orteusBeginRow.value = row;
    formobj.submit();
}