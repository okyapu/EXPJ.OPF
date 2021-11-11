<% //CoreTools関連 %>
<%@ page import="com.nec.jp.orteus.xaf.foundation.*" %>
<%@ page import="com.nec.jp.orteus.common.*" %>
<%@ page import="com.nec.jp.orteus.eo.*" %>
<%@ page import="com.nec.jp.orteus.util.*" %>
<%@ page import="org.apache.struts.taglib.TagUtils" %>

<% //JAVA関連 %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>

<%
    request = new com.nec.jp.orteus.struts.upload.ParameterizedRequestWrapper(request);
	String locale     = (String) session.getAttribute("LOCALE");
	String charset    = CoreTools.getCharset(locale);
	ResourceBundle rb = CoreTools.getResourceBundle("OrteusSysDic", locale);

	response.setHeader("Content-Type", "text/html; charset=" + charset);
	response.setContentType("text/html; charset=" + charset);

	// 指定可能年月範囲を「AppSvrResources.properties」から取得
	int HEAD_YEAR  = 1900;
	int HEAD_MONTH = 1;
	int END_YEAR   = 2100;
	int END_MONTH  = 12;
	
	String sHeadYear  = CoreTools.getContainer().getString("orteus.calendar.head.year");
	String sHeadMonth = CoreTools.getContainer().getString("orteus.calendar.head.month");
	String sEndYear   = CoreTools.getContainer().getString("orteus.calendar.end.year");
	String sEndMonth  = CoreTools.getContainer().getString("orteus.calendar.end.month");
		
	if (sHeadYear != null && sHeadYear.length() > 0) {
		HEAD_YEAR  = Integer.parseInt( sHeadYear );
	}
	
	if (sHeadMonth != null && sHeadMonth.length() > 0) {
		HEAD_MONTH = Integer.parseInt( sHeadMonth );
	}
	
	if (sEndYear != null && sEndYear.length() > 0) {
		END_YEAR   = Integer.parseInt( sEndYear );
	}
	
	if (sEndMonth != null && sEndMonth.length() > 0) {
		END_MONTH  = Integer.parseInt( sEndMonth );
	}
	
	// 曜日の指定
	DateFormatSymbols dfs = new DateFormatSymbols(new Locale(locale));
	String[] weekDays     = dfs.getShortWeekdays();
	
    // カレンダー作成
    Calendar cal = Calendar.getInstance();

    int iNowYear  = cal.get( Calendar.YEAR  );
    int iNowMonth = cal.get( Calendar.MONTH ) + 1;
    int iNowDay   = cal.get( Calendar.DATE );
    int iSelYear  = iNowYear;
    int iSelMonth = iNowMonth;
    int iSelDay   = iNowDay;
    
	String reqYear   = request.getParameter("OrCalendarYear");
	String reqMonth  = request.getParameter("OrCalendarMonth");
	String reqFormat = request.getParameter("OrCalendarFormat");

	if( reqYear != null ){
		iSelYear = Integer.parseInt( reqYear );
    }
    
    if( reqMonth != null ){
		iSelMonth = Integer.parseInt( reqMonth );
		iSelDay   = 1;
		
		if(iSelMonth <= 0){
			iSelMonth = 12;
			iSelYear  = iSelYear - 1;
		} else if(iSelMonth > 12){
			iSelMonth = 1;
			iSelYear  = iSelYear + 1;
		}
    }
    
    cal.set(iSelYear, iSelMonth-1, iSelDay, 0, 0, 0);
    String sSelTitleYYYYMM = iSelYear + "/" + iSelMonth;

	// カレンダー構築用基準日の取得
	int iDayWeek   = cal.get(Calendar.DAY_OF_WEEK) - 1;		// 現在の曜日を取得
	int iWeekMonth = cal.get(Calendar.WEEK_OF_MONTH) - 1;	// 現在の月の何週目かを取得
	cal.add(Calendar.DATE, -(iWeekMonth * 7 + iDayWeek));
%>


<HTML>
  <HEAD>
    <META HTTP-EQUIV="Content-Type" CONTENT="<%="text/html; CHARSET=" + charset%>">
    <TITLE><%=CoreTools.getRBString("Orteus.Calendar.Msg.Title",rb)%></TITLE>
    <STYLE>
      BODY  { font:9px ; line-height:12px ; margin : 6px }
      TH    { font:9pt ; font-family : MS UI Gothic ; line-height:12px ; font-weight : 900 }
      TD    { font:9px ; font-family : Arial; line-height:12px }
      A     { text-decoration:none;color:#000000;font:11px;font-family:Arial;line-height:12px }
      INPUT { font:9px ; font-family : Arial ; line-height:10px ; padding:0px}
    </STYLE>
  </HEAD>
  
  <BODY>
  <FORM METHOD="POST">
  <INPUT TYPE=hidden NAME="OrCalendarYear" VALUE="<%=iSelYear%>">
  <INPUT TYPE=hidden NAME="OrCalendarMonth" VALUE="<%=iSelMonth%>">
  <TABLE BORDER=0 BGCOLOR=#dddddd  BORDERCOLOR=#dddddd WIDTH=140 HEIGHT=140>
    <TR id="trmonth" BGCOLOR=orange BORDERCOLOR=orange WIDTH=140 HEIGHT=14>
      <TH COLSPAN=7 WIDTH=140 HEIGHT=14 ALIGN="right">
      <NOBR>
      <%=sSelTitleYYYYMM%>&nbsp;      
<%	// 指定可能年月範囲外の場合、ボタンをグレイに表示
	if(iSelYear == HEAD_YEAR && iSelMonth == HEAD_MONTH) {	%>
      <INPUT TYPE=submit VALUE="<<" style="font-family:MS UI Gothic; font-size:9pt; color:#000000; background-color:#CCCCCC; border:1 solid #778899; width:18; height:18;" disabled="true">
<%	} else {	%>
      <INPUT TYPE=submit VALUE="<<" style="font-family:MS UI Gothic; font-size:9pt; color:#000000; background-color:#FFFFFF; border:1 solid #778899; width:18; height:18;" onClick="this.form.OrCalendarMonth.value = --this.form.OrCalendarMonth.value;">
<%	}	%>
      <INPUT TYPE=submit VALUE="o" style="font-family:MS UI Gothic; font-size:9pt; color:#000000; background-color:#FFFFFF; border:1 solid #778899; width:18; height:18;" onClick="this.form.OrCalendarYear.value = <%=iNowYear%>; this.form.OrCalendarMonth.value = <%=iNowMonth%>;">
<%	if(iSelYear == END_YEAR && iSelMonth == END_MONTH) {	%>
      <INPUT TYPE=submit VALUE=">>" style="font-family:MS UI Gothic; font-size:9pt; color:#000000; background-color:#CCCCCC; border:1 solid #778899; width:18; height:18;" disabled="true">
<%	} else {	%>
      <INPUT TYPE=submit VALUE=">>" style="font-family:MS UI Gothic; font-size:9pt; color:#000000; background-color:#FFFFFF; border:1 solid #778899; width:18; height:18;" onClick="this.form.OrCalendarMonth.value = ++this.form.OrCalendarMonth.value;">
<%	}	%>
      </NOBR>
      </TH>
    </TR>
    <TR BGCOLOR=pink WIDTH=140 HEIGHT=14>
    
<%  // 曜日ヘッダ
	for (int i = 1; i < weekDays.length; i++){  %>
		<TH WIDTH=14 HEIGHT=14>
		<%=weekDays[i]%>
		</TH>
<%	}  %>
	</TR>
    
<%	int  iDay = 0, iMonth = 0, iYear = 0;
	int  iYYYYMM = 0;
	int  iNowYYYYMM = iSelYear*100 + iSelMonth;
	String sDay = "", sMonth = "", sYear = "";
	String sYYYYMMDD = "";
	
	// 日付けテーブル作成
	for (int j = 0; j < 6; j++){  %>
	<TR BGCOLOR=#ffffff>
<%		for (int i = 0; i < 7; i++){
		
			iDay   = cal.get(Calendar.DATE);
			iMonth = cal.get(Calendar.MONTH) + 1;
			iYear  = cal.get(Calendar.YEAR);
			
			if (iDay < 10) { sDay = "0" + iDay; }
			else { sDay = Integer.toString(iDay); }
			
			if (iMonth < 10) { sMonth = "0" + iMonth; }
			else { sMonth = Integer.toString(iMonth); }
			
			iYYYYMM = iYear * 100 + iMonth;
			sYYYYMMDD = iYear + "/" + sMonth + "/" + sDay;
			if(reqFormat != null && reqFormat.length() > 0) {
				if("SHORT".equals(reqFormat)){
					sYYYYMMDD = TypeConverter.convert(cal.getTime(), new Locale(locale), DateFormat.SHORT);
				} else if("MEDIUM".equals(reqFormat)){
					sYYYYMMDD = TypeConverter.convert(cal.getTime(), new Locale(locale), DateFormat.MEDIUM);
				} else if("LONG".equals(reqFormat)){
					sYYYYMMDD = TypeConverter.convert(cal.getTime(), new Locale(locale), DateFormat.LONG);
				} else if("FULL".equals(reqFormat)){
					sYYYYMMDD = TypeConverter.convert(cal.getTime(), new Locale(locale), DateFormat.FULL);
				} else {
					sYYYYMMDD = TypeConverter.convert(cal.getTime(), new Locale(locale), reqFormat);
				}
			}
			
			// 2008-5-21 セキュリティに関する脆弱性を解消する begin.
			// サニタイズ処理
			sYYYYMMDD = TagUtils.getInstance().filter(sYYYYMMDD);
			// hidden 経由で Javascript に渡す (直接評価されることに対する XSS 対策)
			String formatKey = "formatKey-" + i + "-" + j;
			%>
			<input type="hidden" name="<%= formatKey %>" value="<%= sYYYYMMDD %>">
			<%
			// 2008-5-21 end.

			// 日付のバックグランドカラーの指定
			if (iNowYYYYMM != iYYYYMM) {  %>
      <TD BGCOLOR=#cccccc WIDTH=14 HEIGHT=14 ALIGN="center">
<%			} else if(iYear == iNowYear && iMonth == iNowMonth && iDay == iNowDay) { %>
      <TD BGCOLOR=magenta WIDTH=14 HEIGHT=14 ALIGN="center">
<%			} else { %>
      <TD WIDTH=14 HEIGHT=14 ALIGN="center">
<%			}
			// 指定可能範囲外の日付はアンカーを付けない
			if ( iYear <  HEAD_YEAR                         || 
			    (iYear == HEAD_YEAR && iMonth < HEAD_MONTH) || 
			     iYear >  END_YEAR                          || 
			    (iYear == END_YEAR  && iMonth > END_MONTH )    ) {	%>
        <FONT COLOR=#CCCCCC><%=iDay%></FONT>
<%			} else {	%>
      <A HREF="javascript:
        function v() {
          var dateFormat = document.getElementsByName('<%= formatKey %>')[0].value;          opener.document.getElementsByName(self.opener.formName)[0][self.opener.targetName].value=(dateFormat);
          self.close();
        };
        v()">
        <FONT COLOR=#000000><%=iDay%></FONT>
      </A>
<%			}	%>
      </TD>
<%			cal.add(Calendar.DATE, 1);
		}  %>
    </TR>  
<%	}  %>
  </TABLE>
  </FORM>
  </BODY>
</HTML>