// confirm or check message

function revivalMessage(){
	if(confirm("退回被选择的消息吗？")){
		document.form1.MSG_CONTROL.value="revival";
		return true;
	}
	else{
		return false;
	}
}

function deleteMessage(){
	if(confirm("删掉被选择的消息吗？")){
		document.form1.MSG_CONTROL.value="delete";
		return true;
	}
	else{
		return false;
	}
}

function completeMessage(){
	return confirm("完成被选择的消息吗？");
}

function checkD(){
	if(document.frmMsgNext.elements != null && document.frmMsgNext.elements.length != 0){
		for(i=0;i<document.frmMsgNext.elements.length;i++){
			name = document.frmMsgNext.elements[i].name;
			if(name != null && name.indexOf("MSG_LIMIT",0) != -1){
				value = document.frmMsgNext.elements[i].value;
				if(value == null || value.length == 0){
					alert("交期没被输入。");
					return false;
				}
				else if(isNaN(value)==true){
					alert("交期里请输入数值。");
					return false;
				}else{
					if(value.indexOf(".",0) != -1){
						alert("交期里请输入整数。");
						return false;
					}
				}
			}
		}
	}
	return true;
}

