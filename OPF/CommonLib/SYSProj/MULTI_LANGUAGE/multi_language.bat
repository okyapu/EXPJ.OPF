cd /D %1

rem For EXPLANNER/J development environment folder composition
IF EXIST ..\..\..\EXPJProj (move /Y _mlangtable.xml.large ..\..\..\EXPJProj\common)
IF EXIST ..\..\..\EXPJProj (move /Y _mlangtable.xml ..\..\..\EXPJProj\common)

rem For EXPLANENR/J package CVS repository folder composition
IF EXIST ..\..\EXPJProj (move /Y _mlangtable.xml.large ..\..\EXPJProj\common)
IF EXIST ..\..\EXPJProj (move /Y _mlangtable.xml ..\..\EXPJProj\common)

cd EXPJStudio\lib\expj
cmd /c ant
