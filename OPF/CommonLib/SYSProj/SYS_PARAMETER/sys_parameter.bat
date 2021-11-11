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
set TBLNAME=sys_parameter
rem File that evacuate data from the beginning
rem Export file name
set EXPFILE=%TBLNAME%.exp

echo Evacuate the data
exp %TOUSER%/%TOUSERPW%@%TOUSERCONNECT% tables=%TBLNAME% file=%EXPFILE%

echo The chargeable supplies stock management category is picked out
echo Data extraction(The chargeable supplies stock management category
echo And COMG Module 'CM_ACCOUNTING_IF_BAT_PATH_"COMPANY_CD"' Cost information (Ai cooperation) interface template booting batch file pass)
rem NLS_LANG setting
rem Environment variable "NLS_LANG" is set. (To load UTF-8 form preservation csv file in sqlplus or sqlloader.)
set NLS_LANG=Japanese_Japan.al32utf8
sqlplus %TOUSER%/%TOUSERPW%@%TOUSERCONNECT% @get_onerous.sql

sqlldr %TOUSER%/%TOUSERPW%@%TOUSERCONNECT% control=sys_parameter.ctl data=sys_parameter.csv

rem Addition of Onerous
sqlldr %TOUSER%/%TOUSERPW%@%TOUSERCONNECT% control=sys_parameter_onerous.ctl data=sys_parameter_onerous.csv
set NLS_LANG=Japanese_Japan.JA16SJIS
