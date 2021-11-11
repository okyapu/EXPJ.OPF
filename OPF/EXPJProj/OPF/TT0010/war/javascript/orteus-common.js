var orteusSubmitStatus = false;

function orteusCheckDoubleSubmit() {
	if (orteusSubmitStatus) {
		return false;
	} else {
		orteusSubmitStatus = true;
		return true;
	}
}

function orteusSubmitForm(formname, method) 
{
	var form = null;
	for (i=0; i < document.forms.length; i++) {
		if (document.forms[i].name == formname) {
			form = document.forms[i];
			break;
		}
	}
	if (form == null) {
		alert("Form name error : " + formname);
		return false;
	}

	var action = form.action;
	var params = "com.nec.jp.orteusActionMethod.orteusSubmitByLink=" + method;
	
	if (-1 == action.indexOf("?", 0)) {
		action = action + "?" + params;
	}
	else {
		action = action + "&" + params;
	}
	
	form.action = action;
	form.submit();
	
	return false;
}
