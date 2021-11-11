set classpath=./classes
set CLASSPATH=%CLASSPATH%;D:/bea/weblogic81/server/lib/weblogic.jar
set CLASSPATH=%CLASSPATH%;D:/oracle/ora92/jdbc/lib/ojdbc14.jar
set CLASSPATH=%CLASSPATH%;D:/oracle/ora92/jdbc/lib/nls_charset12.jar
set CLASSPATH=%CLASSPATH%;D:/EXPJStudio/Orlib/foundation.jar
set CLASSPATH=%CLASSPATH%;D:/EXPJStudio/Orlib/coreapi.jar
set CLASSPATH=%CLASSPATH%;D:/EXPJStudio/Orlib/oracleconverter.jar
set CLASSPATH=%CLASSPATH%;D:/EXPJStudio/Orlib/license.jar
set CLASSPATH=%CLASSPATH%;D:/EXPJStudio/Orlib/logging.jar
set CLASSPATH=%CLASSPATH%;D:/EXPJStudio/Orlib/wsecurity81.jar
set CLASSPATH=%CLASSPATH%;D:/EXPJStudio/Orlib/dynsql.jar
set CLASSPATH=%CLASSPATH%;D:/EXPJStudio/Orlib/crimson.jar
set CLASSPATH=%CLASSPATH%;D:/EXPJStudio/lib/commons-lang-2.0.jar
set CLASSPATH=%CLASSPATH%;D:/EXPJStudio/lib/expjlib.jar
set CLASSPATH=%CLASSPATH%;D:/EXPJStudio/lib/metamorBaselib.jar
set CLASSPATH=%CLASSPATH%;D:/EXPJStudio/lib/metamorBaseCommonlib.jar
set CLASSPATH=%CLASSPATH%;D:/EXPJStudio/lib/metamorBaseCommon01lib.jar
set CLASSPATH=%CLASSPATH%;D:/EXPJStudio/lib/metamorBaseCommon02lib.jar
set CLASSPATH=%CLASSPATH%;D:/EXPJStudio/lib/metamorBaseCommon03lib.jar
set CLASSPATH=%CLASSPATH%;D:/EXPJStudio/lib/metamorBaseCommon04lib.jar
set CLASSPATH=%CLASSPATH%;D:/EXPJStudio/lib/license.jar
set CLASSPATH=%CLASSPATH%;D:/EXPJStudio/lib/
echo %classpath%

D:\bea\jdk141_05\bin\java -Dcom.nec.jp.orteus.util.logging.config.file=D:\EXPJStudio\lib\SystemLog.properties com.nec.jp.orteus.metamorBase.KV0030.KV0030B001.mainKV0030B001 2 EJ00 P0 KV0030010

pause

