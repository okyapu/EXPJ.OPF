// confirm or check message

function revivalMessage(){
	if(confirm("�˻ر�ѡ�����Ϣ��")){
		document.form1.MSG_CONTROL.value="revival";
		return true;
	}
	else{
		return false;
	}
}

function deleteMessage(){
	if(confirm("ɾ����ѡ�����Ϣ��")){
		document.form1.MSG_CONTROL.value="delete";
		return true;
	}
	else{
		return false;
	}
}

function completeMessage(){
	return confirm("��ɱ�ѡ�����Ϣ��");
}

function checkD(){
	if(document.frmMsgNext.elements != null && document.frmMsgNext.elements.length != 0){
		for(i=0;i<document.frmMsgNext.elements.length;i++){
			name = document.frmMsgNext.elements[i].name;
			if(name != null && name.indexOf("MSG_LIMIT",0) != -1){
				value = document.frmMsgNext.elements[i].value;
				if(value == null || value.length == 0){
					alert("����û�����롣");
					return false;
				}
				else if(isNaN(value)==true){
					alert("��������������ֵ��");
					return false;
				}else{
					if(value.indexOf(".",0) != -1){
						alert("������������������");
						return false;
					}
				}
			}
		}
	}
	return true;
}

