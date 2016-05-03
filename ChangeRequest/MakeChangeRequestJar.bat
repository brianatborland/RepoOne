@echo off
	echo -
	echo ***************************************
	echo *   Starting MakeChangeRequestJar     *
	echo ***************************************
	echo -

echo This process may take some time, please wait...

REM - If Jar.exe is not in your path, you need to change
REM - this as well. Typical locations for Jar.exe are
REM - shown commented out below.

REM - Typical locations for jar.exe
REM - Use the following if you have the JDK installed
REM SET JAR="c:\jdk1.3.1\bin\jar.exe"
REM - Or use the following if you have JBuilder Personal installed
SET JAR=c:\jbuilder7\jdk1.3.1\bin\jar.exe

REM - Build the Jar
%jar% cvf ChangeRequest.jar -C classes com

if errorlevel 1 goto Failed
goto Done

:Failed
	echo -
	echo ***************************************
	echo **********  ERRORS OCCURRED!  *********
	echo ***************************************
	echo -
	goto Bye
:Done
	echo -
	echo ***************************************
	echo *    Successfully created             *
	echo *    ChangeRequest.jar                * 
	echo ***************************************
	echo -
:Bye

pause
