<!-------------------------------------------------------------------------------------------->
<table cellpadding="2" cellspacing="2" border="0" width="100%" bgcolor="#ccffe6">
    <tbody>
    <tr><td height="3"></td></tr>
        <tr>
            <% // 受信メッセージ %>
            <td  nowrap valign="Top"><b><%=CoreTools.getRBString("Orteus.CoreMsg.N00802", rb)%></b></td>
        </tr>
    </tbody>
</table>
<%
    if(groupCd != null){
        for(int i=0;i<groupCd.length;i++){
%>
            <table border="0" width="100%" cellspacing="0" cellpadding="0" bgcolor="#ccffe6">
<%
            // 業務グループ単位のメッセージの表示 %>
            <tr><td height="4"></td></tr>
            <tr>
                <td width="50%" nowrap class="titleMenu">
                    <img src="images/blue-square.gif">
                    <a href="messageControl?MSG_PG=list&MSG_LISTKEY=businessGroupCd&MSG_BUSINESS_GROUP_CD=<%=MessageSetForm.setInputType(groupCd[i])%>" target="UP" onClick="move()">
                    <b><%=MessageSetForm.setText(model.getNameFromBusinessGroupCd(groupCd[i]))%>(<%=model.getGroupMessageCount(groupCd[i])%>)</b></a></FONT>
                </td>
            </tr>
<%
            // 引数で指定した業務グループコードの業務コード一覧を配列で取得
            String [] businessCd = model.getRecvBusinessCdList(groupCd[i]);
            if(businessCd != null){
                for(int j=0;j<businessCd.length;j++){
                    if( j<(businessCd.length - 1) ) {
                        folder_tree_img = "images/folder_tree.gif";
                    } else {
                        folder_tree_img = "images/folder_tree_end.gif";
                    }
%>
                    <tr>
                        <% // 業務単位のメッセージの表示 %>
                        <td width="50%" nowrap CLASS="titleMenu">
                            <img src="<%=folder_tree_img%>" style="vertical-align:bottom">
                            <% if(MessageListModel.isLineMessage(businessCd[j]) == true) { // ラインメッセージがある場合 %>
                                <a href="messageControl?MSG_PG=list&MSG_LISTKEY=businessCd&MSG_BUSINESS_CD=<%=MessageSetForm.setInputType(businessCd[j])%>&MSG_BUSINESS_GROUP_CD=<%=MessageSetForm.setInputType(groupCd[i])%>&MSG_USER_CD=<%=MessageSetForm.setInputType((String)so.getAttribute("MSG_USER_CD"))%>" target="UP" onClick="move()">
                            <% }
                            else { %>
                                <a href="messageControl?MSG_PG=list&MSG_LISTKEY=businessCd&MSG_BUSINESS_CD=<%=MessageSetForm.setInputType(businessCd[j])%>&MSG_BUSINESS_GROUP_CD=<%=MessageSetForm.setInputType(groupCd[i])%>" target="UP" onClick="move()">
                            <% } %>
                            <%=MessageSetForm.setText(model.getNameFromBusinessCd(businessCd[j]))%>(<%=model.getBusinessMessageCount(businessCd[j])%>)</a>
                        </td>
                    </tr>
<%
                }
            }
%>
            </table>
<%
        }
    }
%>

<!-------------------------------------------------------------------------------------------->
<table border="0" width="100%" cellspacing="0" cellpadding="0" bgcolor="#ccffe6">
    <tr><td height="5"></td></tr>
    <tr>
    <% // 送信済み %>
        <td width="100%" nowrap class="titleMenu">
            <img src="images/red-square.gif">
            <a href="messageControl?MSG_PG=sendList&MSG_LISTKEY=sended" target="UP" onClick="move()">
            <B><%=CoreTools.getRBString("Orteus.CoreMsg.N00803", rb)%>(<%=model.getSendMessageCount()%>)</B></a>
        </td>
    </tr>
    <tr>
    <% // 完了 %>
        <td width="100%" nowrap class="titleMenu">
            <img src="images/red-square.gif">
            <a href="messageControl?MSG_PG=completeList&MSG_LISTKEY=complete" target="UP" onClick="move()">
            <B><%=CoreTools.getRBString("Orteus.Common.N00013", rb)%>(<%=model.getCompleteMessageCount()%>)</B></a>
        </td>
    </tr>
    <tr><td height="8"></td></tr>
</table>

<table>
    <tr><td height="2"></td></tr>
</table>
