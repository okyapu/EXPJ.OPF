<%@ page import="com.nec.jp.orteus.util.*" %>
<%@ page import="com.nec.jp.orteus.msg.util.*" %>
<%@ page import="com.nec.jp.orteus.xaf.foundation.*" %>
<%@ page import="com.nec.jp.orteus.xaf.common.XafTools" %>

<%@ page import="com.nec.jp.orteus.expj.util.MessageStruct" %>
<%@ page import="com.nec.jp.orteus.expj.flash.Kind" %>
<%@ page import="com.nec.jp.orteus.expj.flash.ScreenMoveUtil" %>

<%
if ( so == null || so.getAttribute("UserId") == null){
    out.print("<html><head></head><body><div id=\"expj-session-timeout\"></div></body></html>");
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
<!-- <script type="text/javascript" src="common/flash_v5.js"></script> -->
<!-- <script type="text/javascript" src="common/expj_flash.js"></script> -->
