<%@ page import="com.nec.jp.orteus.util.*" %>
<%@ page import="com.nec.jp.orteus.msg.util.*" %>
<%@ page import="com.nec.jp.orteus.xaf.foundation.*" %>
<%@ page import="com.nec.jp.orteus.xaf.common.XafTools" %>

<%@ page import="com.nec.jp.orteus.expj.util.MessageStruct" %>
<%@ page import="com.nec.jp.orteus.expj.flash.Kind" %>
<%@ page import="com.nec.jp.orteus.expj.flash.ScreenMoveUtil" %>

<%
if ( so == null || so.getAttribute("UserId") == null){
%>
    <script language="JavaScript">
    opener.top.location.href="SessionTimeout.jsp";
    this.window.close();
    
    </script>
<%
    return;
}
%>
<%
    Business business = Business.getCurrentBusiness(so,request);
    int contextNo = business.getContextNumber();
%>
<%
    response.setHeader("Pragma","No-cache");
    response.setHeader("Cache-Control","no-cache");
    response.setDateHeader("Expires",0);
%>
<%
    String algorithm = "SHA-1";
    try {
        algorithm = AppServerResources.getInstance().getString("orteus.csrf.algorithm");
    } catch(Exception e) {
        // NO ACTION
    }

    String hashed = so.getId()!=null?XafTools.getCryptString(so.getId(), algorithm):"";
%>

<meta http-equiv="Content-Type" content="<%="text/html; charset=" + CoreTools.getCharset(locale)%>">
<script type="text/javascript" src="common/Message_<%= locale%>.js"></script>

<%
class FlashUtil{
	String put4FSCommand(String str){
		String retValue = "";

		retValue = "<script language=\"VBScript\">\n";
		retValue += "\tSub " + str + "_FSCommand(ByVal command, ByVal args)\n";
		retValue += "\t\tCall " + str + "_DoFSCommand(command, args)\n";
		retValue += "\tEnd Sub\n";
		retValue += "</script>\n";
		retValue += "<script>\n";
		retValue += "\tfunction " + str + "_DoFSCommand(command,args){\n";
		retValue += "\t\tif(command != \"\"){\n";
		retValue += "\t\t\tvar ary = args.split(\"%_FLASHSEPVALUES_%\");\n";
		retValue += "\t\t\tvar funcParam = \"\";\n";
		retValue += "\n";
		retValue += "\t\t\tif(ary.length > 0){\n";
		retValue += "\t\t\t\tfor(i = 0,cnt = ary.length;i < cnt;i++){\n";
		retValue += "\t\t\t\t\tfuncParam += \"\\\"\" + ary[i] + \"\\\"\";\n";
		retValue += "\t\t\t\t\tif((i + 1) < cnt){\n";
		retValue += "\t\t\t\t\t\tfuncParam += \",\";\n";
		retValue += "\t\t\t\t\t}\n";
		retValue += "\t\t\t\t}\n";
		retValue += "\t\t\t\teval(command+\"(\"+funcParam+\")\");\n";
		retValue += "\t\t\t}else{\n";
		retValue += "\t\t\t\teval(command);\n";
		retValue += "\t\t\t}\n";
		retValue += "\t\t}else{\n";
		retValue += "\t\t\talert(args);\n";
		retValue += "\t\t}\n";
		retValue += "\t}\n";
		retValue += "</script>\n";

		return retValue;
	}
}

FlashUtil fu = new FlashUtil();
%>


