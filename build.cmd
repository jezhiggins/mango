@echo off
rem $Id$

set _CLASSPATH=%CLASSPATH%

call classpath.cmd

java org.apache.tools.ant.Main %*

set CLASSPATH=%_CLASSPATH%
set _CLASSPATH=
