var now    = new Date()
var absnow = now
var Win=navigator.userAgent.indexOf('Win')!=-1
var Mac=navigator.userAgent.indexOf('Mac')!=-1
var X11=navigator.userAgent.indexOf('X11')!=-1
var Moz=navigator.userAgent.indexOf('Gecko')!=-1
var winflg=1
var aryFirst = 0

function wrtCalendar(oj,arg1,arg2){

  oj.blur()

  if(arguments.length == 1) {
    arg1=0
    arg2=-1
  } else if (arguments.length == 2) {
    arg2=-1
  }

  if(!Moz) {
    if(arguments.length >= 2 && (arguments[1]==-1 || arguments[1]==0 || arguments[1]==1)) {
      winflg=0
    }
  }


  //-初期化
  if(arg1==0||arg1==2)now = new Date()

  //-年月日取得
  nowdate  = now.getDate()
  nowmonth = now.getMonth()
  nowyear  = now.getYear()

  //-月移動処理
  if (winflg == 0) {
    if(nowmonth==11 && arg1 > 0){        //12月でarg1が+なら
      nowmonth = -1 + arg1 ; nowyear++   //月はarg1-1;1年加算
    } else if(nowmonth==0 && arg1 < 0){  //1月でarg1が-なら
      nowmonth = 12 + arg1 ; nowyear--   //月はarg1+12;1年減算
    } else {
      nowmonth +=  arg1                  //2-11月なら月は+arg1
    }
  }

  //-2000年問題対応
  if(nowyear<1900)nowyear=1900+nowyear

  //-現在月を確定
  now   = new Date(nowyear,nowmonth,1)

  //-YYYYMM作成
  nowyyyymm=nowyear*100+nowmonth

  //-YYYY/MM作成
  nowtitleyyyymm=nowyear+'/'+(nowmonth + 1)

  //-週設定
  week = new Array('日','月','火','水','木','金','土');

  //-カレンダー表示用サブウインドウオープン
  if(winflg){

    var w=152
    var h=152

    //-calendar用OS別サイズ微調整
    if(Moz)     { w+=15 ; h+=40 }
    else if(Win){ w+=0  ; h+=0  }
    else if(Mac){ w+=8  ; h+=22 }
    else if(X11){ w+=5  ; h+=46 }

    var x=100
    var y=20

    if(document.all){

        x=window.event.screenX+30
        y=window.event.screenY-180

    } else if (document.layers || document.getElementById){

        x+=window.screenX
        y+=window.screenY
    }

    GRS_mkSubWin('','calendar',x,y,w,h)

  }

  //-カレンダー構築用基準日の取得
  fstday   = now                                           //今月の1日
  startday = fstday - ( fstday.getDay() * 1000*60*60*24 )  //最初の日曜日
  startday = new Date(startday)

  //-カレンダー構築用HTML
  ddata = ''
  ddata += '<HTML>\n'
  ddata += '<HEAD>'
  if(!Moz)
  ddata += '<META HTTP-EQUIV="Content-Type" CONTENT="text/html;CHARSET=x-sjis">\n'
  ddata += '<TITLE>年月日入力</TITLE>\n'
  ddata += '<STYLE>\n'
  ddata += ' BODY  { font:9px ; line-height:12px ; margin : 6px }\n'
  ddata += ' TH  { font:9pt ; font-family : MS UI Gothic ; line-height:12px ; font-weight : 900 }\n'
  ddata += ' TD  { font:9px ; font-family : Arial; line-height:12px }\n'

  ddata += ' A  { text-decoration:none;color:#000000;font:11px;font-family:Arial;line-height:12px }\n'
  ddata += ' INPUT  { font:9px ; font-family : Arial ; line-height:10px ; padding:0px}\n'
  ddata += '</STYLE>\n'
  ddata += '</HEAD>\n'
  ddata += '<BODY  BGCOLOR=#dddddd>\n'

  ddata += '<FORM>\n'
  ddata += '<TABLE BORDER=0 BGCOLOR=#dddddd  BORDERCOLOR=#dddddd WIDTH=140 HEIGHT=140>\n'

  //-MONTH
  ddata += '   <TR id="trmonth" BGCOLOR=orange BORDERCOLOR=orange WIDTH=140 HEIGHT=14>\n'
    ddata += '   <TH COLSPAN=7 WIDTH=140 HEIGHT=14 ALIGN="right"><NOBR>\n'

    ddata +=       nowtitleyyyymm
    if (arg2 < 0) {
      ddata += '&nbsp;<INPUT TYPE=button VALUE="<<" style="font-family:MS UI Gothic; font-size:9pt; color:#000000; background-color:#FFFFFF; border:1 solid #778899; width:18; height:18;" onClick="self.opener.wrtCalendar(self.opener.document.'+oj.form.name+'.'+oj.name+',-1)">'
      ddata += '<INPUT TYPE=button VALUE="o" style="font-family:MS UI Gothic; font-size:9pt; color:#000000; background-color:#FFFFFF; border:1 solid #778899; width:18; height:18;" onClick="self.opener.wrtCalendar(self.opener.document.'+oj.form.name+'.'+oj.name+',0)">'
      ddata += '<INPUT TYPE=button VALUE=">>" style="font-family:MS UI Gothic; font-size:9pt; color:#000000; background-color:#FFFFFF; border:1 solid #778899; width:18; height:18;" onClick="self.opener.wrtCalendar(self.opener.document.'+oj.form.name+'.'+oj.name+',1)">\n'
    } else {
      ddata += '&nbsp;<INPUT TYPE=button VALUE="<<" style="font-family:MS UI Gothic; font-size:9pt; color:#000000; background-color:#FFFFFF; border:1 solid #778899; width:18; height:18;" onClick="self.opener.wrtCalendar(self.opener.document.'+oj.form.name+'.'+oj.name+'['+arg2+'],-1,'+arg2+')">'
      ddata += '<INPUT TYPE=button VALUE="o" style="font-family:MS UI Gothic; font-size:9pt; color:#000000; background-color:#FFFFFF; border:1 solid #778899; width:18; height:18;" onClick="self.opener.wrtCalendar(self.opener.document.'+oj.form.name+'.'+oj.name+'['+arg2+'],0,'+arg2+')">'
      ddata += '<INPUT TYPE=button VALUE=">>" style="font-family:MS UI Gothic; font-size:9pt; color:#000000; background-color:#FFFFFF; border:1 solid #778899; width:18; height:18;" onClick="self.opener.wrtCalendar(self.opener.document.'+oj.form.name+'.'+oj.name+'['+arg2+'],1,'+arg2+')">\n'
    }
    ddata += '</NOBR></TH>\n'
  ddata += '   </TR>\n'

  //-WEEK
  ddata += '   <TR BGCOLOR=pink WIDTH=140 HEIGHT=14>\n'

  for (i=0;i<7;i++){
    ddata += '   <TH WIDTH=14 HEIGHT=14>\n'
    ddata +=       week[i]
    ddata += '   </TH>\n'
  }
  ddata += '   </TR>\n'

  //-DATE
  for(j=0;j<6;j++){
    ddata += '   <TR BGCOLOR=#ffffff>\n'
    for(i=0;i<7;i++){
      nextday = startday.getTime() + (i * 1000*60*60*24)
      wrtday  = new Date(nextday)

      wrtdate = wrtday.getDate()
      wrtdatestr = wrtdate
      if (wrtdate < 10) { wrtdatestr = '0' + wrtdate }
      wrtmonth= wrtday.getMonth()
      wrtmonthstr = (wrtmonth+1)
      if (wrtmonthstr < 10) { wrtmonthstr = '0' + wrtmonthstr }
      wrtyear = wrtday.getYear()
      if(wrtyear < 1900)wrtyear=1900 + wrtyear
      wrtyyyymm = wrtyear * 100 + wrtmonth
      wrtyyyymmdd= ''+wrtyear +'/'+ wrtmonthstr +'/'+wrtdatestr

      wrtdateA = ''
      if (arg2 < 0) {
        wrtdateA  = '<A HREF="javascript:function v(){self.opener.document.'+oj.form.name+'.'+oj.name+'.value=(\''+wrtyyyymmdd+'\');self.close()};v()" '
      } else {
        wrtdateA  = '<A HREF="javascript:function v(){self.opener.document.'+oj.form.name+'.'+oj.name+'['+arg2+'].value=(\''+wrtyyyymmdd+'\');self.close()};v()" '
      }
 
      wrtdateA += '>\n'
      wrtdateA += '<FONT COLOR=#000000>\n'
      wrtdateA += wrtdate
      wrtdateA += '</FONT>\n'
      wrtdateA += '</A>\n'

      if(wrtyyyymm != nowyyyymm){ 
        ddata += ' <TD BGCOLOR=#cccccc WIDTH=14 HEIGHT=14>\n'
        ddata += wrtdateA

      } else if(wrtdate == absnow.getDate() && wrtmonth == absnow.getMonth() && wrtday.getYear() == absnow.getYear()){
        ddata += ' <TD BGCOLOR=magenta WIDTH=14 HEIGHT=14>\n'
        ddata += '<FONT COLOR="#ffffff">'+wrtdateA+'</FONT>\n'

      } else {
        ddata += ' <TD WIDTH=14 HEIGHT=14>\n'
        ddata += wrtdateA
      }
      ddata += '   </TD>\n'
    }
    ddata += '   </TR>\n'

    startday = new Date(nextday)
    startday = startday.getTime() + (1000*60*60*24)
    startday = new Date(startday)
  }

  //-mac用クローズボタン
  if(Mac){
    ddata += '   <TR>\n'
      ddata += '   <TD COLSPAN=7 ALIGN=center>\n'
       ddata += '   <INPUT TYPE=button VALUE="CLOSE" onClick="self.close();return false">\n'
      ddata += '   </TD>\n'
    ddata += '   </TR>\n'
  }

  ddata += '</TABLE>\n'

  ddata += '</FORM>\n'

  ddata += '</BODY>\n'
  ddata += '</HTML>\n'

calendarwin.document.write(ddata)
calendarwin.document.close()
calendarwin.focus()

winflg=1
}

var calendarwin;

function GRS_mkSubWin(URL,winName,x,y,w,h){

    var para =""
             +" left="        +x
             +",screenX="     +x
             +",top="         +y
             +",screenY="     +y
             +",toolbar="     +0
             +",location="    +0
             +",directories=" +0
             +",status="      +0
             +",menubar="     +0
             +",scrollbars="  +0
             +",resizable="   +1
             +",innerWidth="  +w
             +",innerHeight=" +h
             +",width="       +w
             +",height="      +h

        calendarwin=window.open(URL,winName,para);
        calendarwin.focus()

  }