@echo off
rem $Id$

set _CLASSPATH=%CLASSPATH%

call classpath.cmd

jdb org.apache.tools.ant.Main %*

set CLASSPATH=%_CLASSPATH%
set _CLASSPATH=
