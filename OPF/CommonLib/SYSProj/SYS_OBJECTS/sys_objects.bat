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

rem Table to be update
rem Table name
set TBLNAME=sys_objects

rem ctlFile Name
set CTLFILE=%TBLNAME%.ctl

rem Data file name
set INFILE=%TBLNAME%.csv

rem Log file name
set LOGFILE=%TBLNAME%.log

rem File connected with bad data
rem bad file name
set BADFILE=%TBLNAME%.bad

rem File that evacuate data from the beginning
rem Export file name
set EXPFILE=%TBLNAME%.exp

rem start

echo Evacuate the data

set NLS_LANG=Japanese_Japan.al32utf8
exp %TOUSER%/%TOUSERPW%@%TOUSERCONNECT% tables=%TBLNAME% file=%EXPFILE%
if ERRORLEVEL 1 goto ERR
set NLS_LANG=Japanese_Japan.JA16SJIS

if %ERRORLEVEL% neq 0 (
echo Failed when exported.Dataloading cannot be executed.
goto :err
) else (
echo Exported data into %EXPFILE% successfully.
)

rem Delete the bad file 	
if exist %BADFILE% (
 (del %BADFILE%) 
echo Bad file was deleted
)

rem Dataload
rem NLS_LANG setting
rem Japanese Windows
rem EJ Application,that face Japanese WindowsOS,has developed to now,the NLS_LANG was fixed(2011/2Now)
set NLS_LANG=Japanese_Japan.JA16SJIS
rem English Windows:Because there is Japanese in SQL*PLUS SQL or SQL*LOADER csv data,it will NG when you set.
rem Please select when SQL Japanese fixed where customized in English.
rem set NLS_LANG=AMERICAN_AMERICA.WE8MSWIN1252
rem Chinese(Simple)Windows:Because there is Japanese in SQL*PLUS SQL or SQL*LOADER csv data,it will NG when you set.
rem Please select when SQL Japanese fixed where customized in Chinese.
rem set NLS_LANG=SIMPLIFIED CHINESE_CHINA.ZHS16GBK 
sqlldr %TOUSER%/%TOUSERPW%@%TOUSERCONNECT% control=%CTLFILE% data=%INFILE% bad=%BADFILE% log=%LOGFILE%
if ERRORLEVEL 1 goto ERR


rem Dataloading Check
echo.
if exist %BADFILE% (
echo Data was Failed in %BADFILE% when loaded.Please refer to %LOGFILE%
goto :err
) else (
echo Data load successfully.

)

:NORMAL
echo *******************************************
echo Process successfully.
echo *******************************************
GOTO end

:err
echo *******************************************
echo Error occurs.
echo After the setting and log was checked,please execut.
echo *******************************************
pause

:end

