cd /D %1
cd EXPJStudio\lib\expj
cmd /c ant
copy /y ExpjMessage.japanese AlarmMessage.japanese
copy /y ExpjMessage.properties AlarmMessage.properties
