// ���b�Z�[�W�̊m�F�A�`�F�b�N�p

function revivalMessage(){
	if(confirm("�I�����ꂽ���b�Z�[�W��߂��܂����H")){
		document.form1.MSG_CONTROL.value="revival";
		return true;
	}
	else{
		return false;
	}
}

function deleteMessage(){
	if(confirm("�I�����ꂽ���b�Z�[�W���폜���܂����H")){
		document.form1.MSG_CONTROL.value="delete";
		return true;
	}
	else{
		return false;
	}
}

function completeMessage(){
	return confirm("�I�����ꂽ���b�Z�[�W�����������܂����H");
}

function checkD(){
	if(document.frmMsgNext.elements != null && document.frmMsgNext.elements.length != 0){
		for(i=0;i<document.frmMsgNext.elements.length;i++){
			name = document.frmMsgNext.elements[i].name;
			if(name != null && name.indexOf("MSG_LIMIT",0) != -1){
				value = document.frmMsgNext.elements[i].value;
				if(value == null || value.length == 0){
					alert("�[�������͂���Ă��܂���B");
					return false;
				}
				else if(isNaN(value)==true){
					alert("�[���ɂ͐��l����͂��ĉ������B");
					return false;
				}else{
					if(value.indexOf(".",0) != -1){
						alert("�[���ɂ͐�������͂��ĉ�����");
						return false;
					}
				}
			}
		}
	}
	return true;
}
