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
rem Japanese Windows
rem EJ Application has developed it for Japanese WindowsOS, book NLS_LANG value fixing (2011/2)
set NLS_LANG=Japanese_Japan.JA16SJIS
rem English Windows: For Japanese to be included in SQL sentence of SQL * PLUS or csv data of SQL * LOADER, that it's established, NG.
rem When customizing a Japanese point of SQL sentence in English, please choose.
rem set NLS_LANG=AMERICAN_AMERICA.WE8MSWIN1252
rem Chinese (simplified Chinese character) Windows: For Japanese to be included in SQL sentence of SQL * PLUS or csv data of SQL * LOADER, that it's established, NG.
rem When customizing a Japanese point of SQL sentence in Chinese, please choose.
rem set NLS_LANG=SIMPLIFIED CHINESE_CHINA.ZHS16GBK 

(sqlplus %TOUSER%/%TOUSERPW%@%TOUSERCONNECT% @insertPeeker.sql 2> insertPeekerErr.log) > insertPeekerStd.log
