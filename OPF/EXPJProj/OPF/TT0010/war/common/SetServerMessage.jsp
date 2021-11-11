<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

サーバメッセージ出力
$Source: D:/EXPJCVS/EXPJCORE/ejstudioV2/EXPJStudio/tools/framework/expjhtml5/EJmenu/common/SetServerMessage.jsp,v $
$Author: n-saito $	
$Revision: 1.1 $ $Date: 2017/03/13 08:11:16 $
********************************************************* --%>

<%
	List type = msgStruct.getType();
	List code = msgStruct.getCode();
	List message = msgStruct.getMessage();

	String messageString = "";

	// メッセージサイズ取得
	int messageSize = 0;
	if(message != null) messageSize = message.size();

	int totalSize = messageSize;

	if(totalSize != 0){

		// メッセージの組み立て
		if(message != null){
			String messageWork = "";
			String messageWork2 = "";
			char targetChar;
			int    messageLength=-1;
			for(int i = 0; i < totalSize; i++) {
				messageWork = "";
				messageWork2 = "";

				messageWork = (String)message.get(i);
				messageLength = messageWork.length();

				for(int j = 0; j < messageLength; j++) {
					targetChar = messageWork.charAt(j);
					if(targetChar == '\'') {
						messageWork2 += "' + \"'\" + '";
					}
					else if(targetChar == '"') {
						messageWork2 += "' + '\"' + '";
					}
					else {
						messageWork2 += targetChar;
					}
				}

				if(i != 0) {
					//messageString = messageString + "|msg%%";
					messageString = messageString + "<br>";
				}
				//essageString = messageString + messageWork2;
                messageWork2 = TypeConverter.sanitizer(messageWork2);
                messageWork2 = messageWork2.replaceAll("[\r\n\t]", "");
				if ( msgStruct.ERROR == Integer.parseInt((String)type.get(i)) ) {
					//messageString = messageString + "&color%%FF0000&icontype%%ERROR";
					messageString += "<img draggable=\"false\" src=\"common/img/error.png\">&nbsp;<span style=\"color: #FF0000;\">" + messageWork2 + "</span>";
				} else if ( msgStruct.WARN == Integer.parseInt((String)type.get(i)) ) {
				//20080702 UPD メッセージ色修正 START
					//messageString = messageString + "&color%%007500&icontype%%WARN";
					messageString += "<img draggable=\"false\" src=\"common/img/warn.png\">&nbsp;<span style=\"color: #007500;\">" + messageWork2 + "</span>";
				//20080702 UPD メッセージ色修正 END
				} else {
					//messageString = messageString + "&color%%0000FF&icontype%%INFO";
					messageString += "<img draggable=\"false\" src=\"common/img/info.png\">&nbsp;<span style=\"color: #0000FF;\">" + messageWork2 + "</span>";
				}
			}
			//out.println("<script> parent.setMessage('msg%%" + messageString + "'); </script>");
		}
	}
%>
