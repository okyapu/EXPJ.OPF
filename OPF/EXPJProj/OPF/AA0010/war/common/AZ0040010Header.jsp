<%
/*------------------------------------------------------------------------------
��ʌ����i�Q�Ɓj �T�u��ʃw�b�_�����C�A�E�g

2004/01/15 �V�K�쐬  K.Shiraki
------------------------------------------------------------------------------*/
%>

<%
	AZ0040010Struct currentQuery = aAZ0040010Control.getSelStruct();
	// �N�G����/����/�T�v�����ꂩ�ݒ肪����Ε\��
	if(currentQuery.getQUERY_NAME() != null || currentQuery.getQUERY_GROUP() != null || currentQuery.getQUERY_MEMO() != null){
%>
    <table border="0" width="100%">
      <tr> 
        <td width="120" class="name">�N�G����</td>
        <td>
          <input type="text" name="QUERY_NAME" size="100" class="readonly" readonly value="<%= TypeConverter.sanitizer(currentQuery.getQUERY_NAME()) %>">
        </td>
      </tr>
      <tr>
        <td class="name">����</td>
        <td>
          <input type="text" name="QUERY_GROUP" size="50" class="readonly" readonly value="<%= TypeConverter.sanitizer(currentQuery.getQUERY_GROUP()) %>">
        </td>
      </tr>
      <tr>
        <td class="name">�T�v</td>
        <td> 
          <input type="text" name="QUERY_MEMO" size="100" class="readonly" readonly value="<%= TypeConverter.sanitizer(currentQuery.getQUERY_MEMO()) %>">
        </td>
      </tr>
      <tr> 
        <td colspan="3"> <hr></td>
      </tr>
    </table>
<%	}
	// �^�C�g������̂Ƃ��� �_�~�[�̓��͈��z�u
	else{ %>
      <input type="hidden" name="QUERY_NAME" value="<%= TypeConverter.sanitizer(aAZ0040010Struct.getQUERY_NAME()) %>">
      <input type="hidden" name="QUERY_GROUP" value="<%= TypeConverter.sanitizer(aAZ0040010Struct.getQUERY_GROUP()) %>">
      <input type="hidden" name="QUERY_MEMO" value="<%= TypeConverter.sanitizer(aAZ0040010Struct.getQUERY_MEMO()) %>">
<%	} %>
