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


sqlldr %TOUSER%/%TOUSERPW%@%TOUSERCONNECT% control=sys_bat_parm.ctl data=sys_bat_parm.csv