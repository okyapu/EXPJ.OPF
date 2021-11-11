<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J"%>

<% //CoreTools関連 %>
<%@ page import="com.nec.jp.orteus.common.*" %>
<%@ page import="com.nec.jp.orteus.eo.*" %>
<%@ page import="com.nec.jp.orteus.util.*" %>

<% //foundation関連 %>
<%@ page import="com.nec.jp.orteus.xaf.foundation.*" %>
<%@ page import="com.nec.jp.orteus.xaf.common.*" %>
<%@ page import="com.nec.jp.orteus.xaf.log.*" %>
<%@ page import="com.nec.jp.orteus.xaf.wa.*" %>
<%@ page import="com.nec.jp.orteus.xaf.util.*" %>
<%@ page import="com.nec.jp.orteus.util.*" %>

<% //logging関連 logger.jar必須%>
<%@ page import="com.nec.jp.orteus.util.logging.*" %>

<%@ page import="com.nec.jp.orteus.expj.util.LeftGet" %>
<%@ page import="com.nec.jp.orteus.expj.util.MessageStruct" %>

<% // 2003/07/15 追加 %>
<%@ page import="com.nec.jp.orteus.msg.core.*" %>

<%@ page import="com.nec.jp.orteus.msg.util.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.net.*" %>

<%
    HttpSession so = null;
    so = request.getSession(false);
    if (so == null || so.isNew() == true) {
        out.println("<!DOCTYPE html><html><head>");
        out.println("<script type=\"text/javascript\">");
        out.println("top.location.href=\"SessionTimeout.jsp\";");
        out.println("this.window.close();");
        out.println("</script>");
        out.println("</head><body></body></html>");
        return;
    }

    //-------------------------------------------------------
    // 2004/01/22 国際化対応
    String locale = (String)so.getAttribute("LOCALE");
    String charset = CoreTools.getCharset(locale);
    ResourceBundle rb = CoreTools.getResourceBundle("OrteusSysDic", locale);
    ResourceBundle rb2 = CoreTools.getResourceBundle("ExpjMessage", locale);

    response.setHeader("Content-Type", "text/html; charset=" + charset);
    response.setContentType("text/html; charset=" + charset);
    response.setHeader("Pragma","no-store");
    response.setHeader("Cache-Control","no-store");
    response.setDateHeader("Expires",0);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="<%=charset %>">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-store">
<meta http-equiv="expires" content="0">
<meta http-equiv="cache-control" content="no-store">

<jsp:useBean id="model" class="com.nec.jp.orteus.msg.core.LeftModel" scope="request"/>

<%
    LeftGet mymodel = new LeftGet(so);
    so.setAttribute("UserName", mymodel.getMyName());
    mymodel.makePlantData(request.getRemoteUser());
    so.setAttribute("PlantCd", mymodel.getPlantCd());
    so.setAttribute("PlantName", mymodel.getPlantName());
    String msgStr01 = "";
    
    String [] groupCd = model.getMyBusinessGroupCdList();
    String folder_tree_img = null;

    final String expandedTrue = "\"expanded\":true";
    final String expandedFalse = "\"expanded\":false";
    
    StringBuffer treejsonBuilder = new StringBuffer("[");
    if (groupCd != null) {
        for(int i = 0; i < groupCd.length; i++) {
            String [] businessClass = model.getBusinessClassCdList(groupCd[i]);
            if((businessClass != null) && (businessClass.length > 0)) {
                
                StringBuffer workStr = new StringBuffer();
                String parentShutStr = expandedFalse;
                
                for (int j = 0; j < businessClass.length; j++) {
                    String [] parmBusinessCd = model.getParmBusinessCdList(groupCd[i],businessClass[j]);
                    
                    boolean bShut = model.getShutFlag(groupCd[i],businessClass[j]);
                    String shutStr = expandedFalse;
                    if (bShut) {
                        shutStr = expandedFalse;
                    } else {
                        shutStr = expandedTrue;
                        parentShutStr = expandedTrue;
                    }
                    String branchKey = "group-" + groupCd[i] + "-" + businessClass[j];
                    workStr.append("{\"title\":\"").append(model.getNameFromBusinessClassCd(groupCd[i],businessClass[j])).append("\",\"key\":\"").append(branchKey).append("\",").append(shutStr).append(",\"folder\":true,\"children\":[");
                
                    if(parmBusinessCd != null){
                        for (int k = 0; k < parmBusinessCd.length; k++) {
                            String businessUrl = model.getUrl(parmBusinessCd[k]);
                            businessUrl = URLEncoder.encode(businessUrl, charset);
                            
                            String windowType = "CREATE";
                            String printerDlgFlg = model.getPrinterDlgFlgFromBusinessCd(parmBusinessCd[k]);
                            if((printerDlgFlg != null)) {
                                windowType = "PRINT";
                            }
                            else {
                                printerDlgFlg = "";
                            }
                        
                            String printerType = model.getPrinterTypFromBusinessCd(parmBusinessCd[k]);
                            if(printerType==null) {
                                printerType="";
                            }
                            String printerMsgCd = model.getMsgCdFromBusinessCd(parmBusinessCd[k]);
                            if(printerMsgCd==null) {
                                printerMsgCd="";
                            }
                            String printerName = model.getPrinterNameFromBusinessCd(parmBusinessCd[k]);
                            if(printerName==null) {
                                printerName="";
                            }
                            String printerSeqNo = model.getPrinterSeqNoFromBusinessCd(parmBusinessCd[k]);
                            if(printerSeqNo==null) {
                                printerSeqNo="";
                            }
                            
                            int textIndex = businessUrl.lastIndexOf("Servlet");
                            String nodeKey = null;
                            if (textIndex > -1) {
                                nodeKey = businessUrl.substring(0, textIndex);
                            } else {
                                nodeKey = groupCd[i] + businessClass[j] + parmBusinessCd[k];
                            }
                            
                            if(windowType=="PRINT") {
                                workStr.append("{\"title\":\"").append(model.getNameFromBusinessCd(parmBusinessCd[k])).append("\",\"type\":\"").append(windowType).append("\",\"url\":\"").append(businessUrl).append("\",\"contextno\":\"1\",\"key\":\"").append(nodeKey).append("\",\"dlgflag\":\"").append(printerDlgFlg).append("\",\"printerno\":\"").append(printerName).append("\",\"printertype\":\"").append(printerType).append("\",\"msgid\":\"").append(printerMsgCd).append("\"},");
                            } else {
                                workStr.append("{\"title\":\"").append(model.getNameFromBusinessCd(parmBusinessCd[k])).append("\",\"type\":\"").append(windowType).append("\",\"url\":\"messageControl?MSG_PG=").append(businessUrl).append("&MSG_BUSINESS_GROUP_CD=").append(groupCd[i]).append("&MSG_BUSINESS_CD=").append(parmBusinessCd[k]).append("&MSG_MESSAGE_ID=0\",\"key\":\"").append(nodeKey).append("\"},");
                            }
                        }
                        workStr = workStr.replace(workStr.length() - 1, workStr.length(), "");
                    }
                    workStr.append("]},");
                }
                
                treejsonBuilder.append("{\"title\":\"" + model.getNameFromBusinessGroupCd(groupCd[i]) + "\",\"key\":\"group-" + groupCd[i] + "\"," + parentShutStr + ",\"folder\":true,\"children\":[");
                treejsonBuilder.append(workStr.replace(workStr.length() - 1, workStr.length(), "").toString());
                treejsonBuilder.append("]},");
            }
        }
    } else {
        //パスワードの期限が切れる
        msgStr01 = CoreTools.getRBString("Orteus.CoreMsg.N00805", rb);
        msgStr01 = "<img draggable=\"false\" src=\"common/img/error.png\">&nbsp;<span style=\"color: #FF0000\">" + msgStr01 + "</span>";
    }
    treejsonBuilder.append("{\"title\":\"PASSWORD\",\"key\":\"PASSWORD\",\"url\":\"changePassword.jsp\",\"type\":\"CREATE\"}");
    treejsonBuilder.append("]");
    
    String millisTime = String.valueOf(System.currentTimeMillis());
%>

<title>EXPLANNER/J</title>
<link rel="stylesheet" href="common/libs/jquery-ui-1.11.4-smoothness/jquery-ui.min.css">
<link rel="stylesheet" href="common/libs/fancytree-2.15.0/dist/skin-win8/ui.fancytree.css">
<link rel="stylesheet" href="common/libs/OrteusView-1.0.0/jQuery.OrteusView.css">
<link rel="stylesheet" href="common/expj-html5-business-screen.css?<%=millisTime %>">
<link rel="stylesheet" href="common/custom/custom.css?<%=millisTime %>">

<script src="common/Message_<%= locale%>.js?<%=millisTime %>"></script>
<script src="common/apversion.js?<%=millisTime %>"></script>
<script src="common/libs/jquery-2.2.4.min.js"></script>
<script src="common/libs/jquery-ui-1.11.4-smoothness/jquery-ui.min.js"></script>
<script src="common/libs/jquery-ui-contextmenu-1.11.0/jquery.ui-contextmenu.js"></script>
<script src="common/libs/fancytree-2.15.0/dist/jquery.fancytree.min.js"></script>
<script src="common/libs/OrteusView-1.0.0/jQuery.OrteusView.js"></script>
<script src="common/libs/OrteusView-1.0.0/jQuery.OrteusViewEx.js"></script>
<script src="common/libs/moment.js"></script>
<script src="common/libs/OrteusUtils.js"></script>
<script src="common/html5-js/expjcore.js?<%=millisTime %>"></script>
<script src="common/html5-js/expjcontrolkey.js?<%=millisTime %>"></script>
<script src="common/html5-js/expjcontext.js?<%=millisTime %>"></script>
<script src="common/html5-js/expjpscript.js?<%=millisTime %>"></script>
<script src="common/html5-js/expjeval.js?<%=millisTime %>"></script>
<script src="common/custom/config.js?<%=millisTime %>"></script>
<script src="common/html5-js/expjkind.js?<%=millisTime %>"></script>
<script src="common/html5-js/expjposition.js?<%=millisTime %>"></script>
<script>
expj.common.local = '<%= locale%>';
var closeButtonTitle = '<%=CoreTools.getRBString("Orteus.Common.N00001", rb) %>';
expj.common.getLeftJspMenuWindowTreeJsonData = function () {
  return '<%=treejsonBuilder.toString() %>';
}
function expj_get_left_jsp_user_plant_name_data() {
  return '<%=TypeConverter.sanitizer(mymodel.getPlantName())%>';
}
function expj_get_left_jsp_user_name_data() {
  return '<%=TypeConverter.sanitizer(mymodel.getMyName())%>';
}
function logOff() {
	var userAgent = window.navigator.userAgent.toLowerCase();
	var result = true;
	if(expj.common.config.logoutMessageFlg){
		result = confirm(_message["ZZ01121"]);
	}
	if (result) {
		if (userAgent.indexOf('chrome') > -1) {
			window.open("logout.jsp",window.opener.name);
			this.close();
		}else{
			opener.location.href = "logout.jsp";
			opener.focus();
			this.close();
		}
	}
}
function viewDispHelp() {
  var businessScreenState = expj.common.getActivateBusinessScreenTabPageState();
  if (businessScreenState !== null) {
    dispHelp(businessScreenState.url);
  }
}
var helpWindow = null;
function dispHelp(id){
  var stp = id.indexOf("MSG_PG=");
  var edp = id.indexOf("Servlet");
  
  if(stp != -1 && edp != -1){
    var domain = id.substr(stp + 7, 1);
    var subdomain = id.substr(stp + 9, 1);
    var domain2 = id.substr(stp + 8, 1);
    var str = id.substr(stp + 7,9);
    var path = "./help/EXPLANNERJ.PRSA.DOC/index.html"; 
    
    switch(domain) {
    case "A":
      if(domain2=="S") {
        path = "./help/EXPLANNERJ.ASPR.DOC/index.html";
      } else {
        if(subdomain=="1") {
          path = "./help/EXPLANNERJ.MPSA.DOC/index.html"; 
        } else {
          path = "./help/EXPLANNERJ.PRSA.DOC/index.html"; 
        }
      }
      break;
    case "Z":
      path = "./help/EXPLANNERJ.PRSA.DOC/index.html";
      break;
    case "B":
    case "C":
      path = "./help/EXPLANNERJ.ARAP.DOC/index.html"; 
      break;
    case "D":
      path = "./help/EXPLANNERJ.PRSA.DOC/index.html"; 
      break;
    case "G":
      path = "./help/EXPLANNERJ.ACCO.DOC/index.html"; 
      break;
    case "J":
      path = "./help/EXPLANNERJ.JOPR.DOC/index.html"; 
      break;
    case "K":
      if(subdomain=="1") {
        path = "./help/EXPLANNERJ.MPSA.DOC/index.html"; 
      } else {
        path = "./help/EXPLANNERJ.PRSA.DOC/index.html"; 
      }
      break;
    case "P":
      path = "./help/EXPLANNERJ.FORM.DOC/index.html"; 
      break;
    case "V":
      path = "./help/EXPLANNERJ.COMG.DOC/index.html"; 
      break;
    default:
      path = "./help/EXPLANNERJ.PRSA.DOC/index.html"; 
      break;
    }
    
    helpWindow = window.open(path,"HELP");
  }
}
</script>
</head>
<!-- 画面のbody。ここは特に編集しない -->
<body>
<!-- 画面ラッパー用タグ。画面幅の設定を行う -->
<div id="expj-screen-wrapper">
  <!-- EXPJ画面枠部品（タブ部分除く）を構築する領域 -->
  <div id="expj-screen-header">
    <!-- 画面枠部品のユーザ情報表示フィールドを構築する -->
    <div id="expj-screen-header-user-info-field">
      <!-- ユーザ情報表示タグ -->
      <span id="expj-screen-header-user-info"><%=TypeConverter.sanitizer(mymodel.getPlantName()) + "／" + TypeConverter.sanitizer(mymodel.getMyName())%></span>
    </div>
    <!-- 画面枠部品（ロゴ、各種メニュー、コンソール）フィールドを構築する -->
    <div id="expj-screen-header-objects-field">
      <!-- 画面枠部品（ロゴ、各種メニュー）フィールドを構築する -->
      <div id="expj-screen-header-objects-logomenu-field">
        <!-- 画面枠部品（ロゴ）部分の構築 -->
        <div id="expj-screen-header-objects-ej-logo" onclick="expj.common.printVersion();">
          <img draggable="false" src="common/img/expj_logo.png"  style="width:260px;height:32px">
        </div>
        <!-- 画面枠部品（各種メニュー）の構築 -->
        <div id="expj-screen-header-objects-menu-icons">
          <img draggable="false" src="common/img/menu.png" onmouseover="this.src='common/img/menu_a.png'" onmouseout="this.src='common/img/menu.png'" onclick="expj.common.executeMenuWindow()">
          <img draggable="false" src="common/img/clear.png" onmouseover="this.src='common/img/clear_a.png'" onmouseout="this.src='common/img/clear.png'">
          <img draggable="false" src="common/img/doc.png" onmouseover="this.src='common/img/doc_a.png'" onmouseout="this.src='common/img/doc.png'" onclick="viewDispHelp()">
          <img draggable="false" src="common/img/exit.png" onmouseover="this.src='common/img/exit_a.png'" onmouseout="this.src='common/img/exit.png'" onclick="logOff()">
        </div>
      </div> <!-- expj-screen-header-objects-logomenu-field -->
      <!-- 画面枠部品（コンソール）の構築 -->
      <div id="expj-screen-header-objects-messages">
        <span id="expj-screen-header-message-text"><%=msgStr01%></span>
      </div>
    </div> <!-- expj-screen-header-objects-field -->
  </div> <!-- expj-screen-header -->

  <div id="expj-screen-header-tabs">
    <!-- タブの要素を格納するulタグ。スピナーと横並びさせるため、float(left)を指定。 -->
    <ul style="float: left;">
    </ul>
    <!-- 業務画面タブのページングスピナースペース -->
    <div style="float: left;">
      <input type="text" id="expj-screen-header-paging-tab-spinner" value="1" readonly="readonly">
    </div>
    <!-- 業務画面タブとページングスピナーは横揃えされているので、それを解除するダミーDIVタブ -->
    <div style="clear: left;"></div>
    
    <!-- 業務画面がひとつも開かれていない時の画面 -->
    <div id="expj-initial-business-screen" class="expj-business-screen-height">
      <!-- ロゴラインを形成するタグ -->
      <div id="expj-initial-business-screen-logo-space">
        <img draggable="false" src="common/img/expj_logo.png"  style="width:260px;height:32px">
      </div>
    </div> <!-- expj-initial-business-screen -->
  </div> <!-- expj-screen-header-tabs -->
</div> <!-- expj-screen-wrapper -->

<!-- メニューウィンドウのダイアログここから -->
<div id="expj-menu-window" title="MENU">
  <!--ツリー部分 -->
  <div id="expj-menu-tree"></div>
</div>
<!-- メニューウィンドウのダイアログここまで -->

<%
    String loadingMessage = "Wait a moment, please.";
    if ("ja".equals(locale)) {
        loadingMessage = "処理中です。少しお待ちください。";
    }
%>
<!-- ローディング時のマスクスクリーン -->
<div id="expj-loading-mask-screen">
  <div id="expj-loading-screen-frame">
    <div id="expj-loading-text"><%=loadingMessage %></div>
  </div>
</div>

<!-- 隠しファイルアップロードフィールド -->
<div id="expj-file-field">
  <form name="csvup" method="post" enctype="multipart/form-data" onsubmit="return false;">
    <input type="file" name="upload" />
    <input type="submit" name="CsvIn" />
  </form>
</div>

</body>
</html>