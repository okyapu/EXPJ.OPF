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

(sqlplus %TOUSER%/%TOUSERPW%@%TOUSERCONNECT% @insertLock.sql 2> insertLockErr.log) > insertLockStd.log