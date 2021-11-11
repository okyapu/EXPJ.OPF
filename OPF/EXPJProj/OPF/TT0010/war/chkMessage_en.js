// confirm or check message

function revivalMessage(){
	if(confirm("Do you wish to return the selected message?")){
		document.form1.MSG_CONTROL.value="revival";
		return true;
	}
	else{
		return false;
	}
}

function deleteMessage(){
	if(confirm("Do you wish to delete the selected message?")){
		document.form1.MSG_CONTROL.value="delete";
		return true;
	}
	else{
		return false;
	}
}

function completeMessage(){
	return confirm("Do you wish to complete the selected message?");
}

function checkD(){
	if(document.frmMsgNext.elements != null && document.frmMsgNext.elements.length != 0){
		for(i=0;i<document.frmMsgNext.elements.length;i++){
			name = document.frmMsgNext.elements[i].name;
			if(name != null && name.indexOf("MSG_LIMIT",0) != -1){
				value = document.frmMsgNext.elements[i].value;
				if(value == null || value.length == 0){
					alert("A delivery date has not been entered.");
					return false;
				}
				else if(isNaN(value)==true){
					alert("Enter a numeric value for a delivery date.");
					return false;
				}else{
					if(value.indexOf(".",0) != -1){
						alert("Enter an integer value for a delivery date.");
						return false;
					}
				}
			}
		}
	}
	return true;
}
