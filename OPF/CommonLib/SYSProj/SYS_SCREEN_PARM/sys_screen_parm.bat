echo off
setlocal
rem ==============================================================
rem Oracle database update Script 
rem ==============================================================

rem Definition of DB in a environment configuration destination -----------------------------------
rem [Environment create DB user]/[Password]@[Connection character string]

rem DB user
set TOUSER=EXPJ

rem DB password
set TOUSERPW=EXPJ

rem DB Connection character string TNS service name
set TOUSERCONNECT=EXPJ


rem NLS_LANG Setting
rem Environment variable "NLS_LANG" is set. (To load UTF-8 form preservation csv file in sqlplus or sqlloader.)
set NLS_LANG=Japanese_Japan.al32utf8

sqlldr %TOUSER%/%TOUSERPW%@%TOUSERCONNECT% control=sys_screen_parm.ctl data=sys_screen_parm.csv
set NLS_LANG=Japanese_Japan.JA16SJIS
