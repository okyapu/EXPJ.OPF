echo off
setlocal
rem ==============================================================
rem Oracle Database Update Script
rem ==============================================================

rem Definition of DB environmental setting ahead -----------------------------------
rem Environmental making. Connected character string is defined. [DB User]/[DB Password]@[TNS Service Name]

rem DB User
set TOUSER=EXPJ

rem DB Password
set TOUSERPW=EXPJ

rem DB Connected character string TNS Service Name
set TOUSERCONNECT=EXPJ


rem Environment variable "NLS_LANG" is set. (To load UTF-8 form preservation csv file in sqlloader.)
set NLS_LANG=Japanese_Japan.al32utf8
sqlldr %TOUSER%/%TOUSERPW%@%TOUSERCONNECT% control=sys_business_message.ctl data=sys_business_message_zh.csv
set NLS_LANG=Japanese_Japan.JA16SJIS
