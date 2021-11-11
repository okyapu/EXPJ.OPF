<%@ page import="com.nec.jp.orteus.util.UserAgentUtil" %>
<%
	// パラメータ参照
	String jspmobile = request.getParameter("orteus_switch_mobile");
	String jsppc     = request.getParameter("orteus_switch_pc");
	
	ServletContext context = pageContext.getServletContext();
	String jsp = null;
	if (UserAgentUtil.isMobile(request)) {
		jsp = jspmobile;
	} else {
		jsp = jsppc;
	}

	//System.out.println("switching : " + jsp);

	jsp = response.encodeURL(jsp);
	RequestDispatcher dispatcher = context.getRequestDispatcher(jsp);
	dispatcher.forward(request,response);
%>
