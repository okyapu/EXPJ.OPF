// メッセージの確認、チェック用

function revivalMessage(){
	if(confirm("選択されたメッセージを戻しますか？")){
		document.form1.MSG_CONTROL.value="revival";
		return true;
	}
	else{
		return false;
	}
}

function deleteMessage(){
	if(confirm("選択されたメッセージを削除しますか？")){
		document.form1.MSG_CONTROL.value="delete";
		return true;
	}
	else{
		return false;
	}
}

function completeMessage(){
	return confirm("選択されたメッセージを完了化しますか？");
}

function checkD(){
	if(document.frmMsgNext.elements != null && document.frmMsgNext.elements.length != 0){
		for(i=0;i<document.frmMsgNext.elements.length;i++){
			name = document.frmMsgNext.elements[i].name;
			if(name != null && name.indexOf("MSG_LIMIT",0) != -1){
				value = document.frmMsgNext.elements[i].value;
				if(value == null || value.length == 0){
					alert("納期が入力されていません。");
					return false;
				}
				else if(isNaN(value)==true){
					alert("納期には数値を入力して下さい。");
					return false;
				}else{
					if(value.indexOf(".",0) != -1){
						alert("納期には整数を入力して下さい");
						return false;
					}
				}
			}
		}
	}
	return true;
}
