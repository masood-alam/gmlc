
Restcomm Gateway Mobile Location Centre (GMLC)
=============================================

The **GMLC** enables offering Location Based Services (LBS) involving mobile subscribers roaming accross either legacy GSM or UMTS/HSPA+ networks, or Next Generation Networks like LTE/LTE-Advanced.

GMLC is built on [RestComm jSS7](https://github.com/RestComm/jSS7).

Dependencies
------------
1. Java 7 runtime environment
2. Apache maven (3.3.9 or above)
3. Apache ant (1.8 or above)


*Installation*
------------
From the release folder run "ant release".
It will download the stack binaries such as jboss-5.1.0.GA, jain-slee, jss7 etc.

Finally it will build the jboss-5.1.0.GA-gmlc.zip

This zip file can be used with docker project [ubuntu-jboss-gmlc](http://10.120.10.234/masoodalam/ubuntu-jboss-gmlc).

Or this zip file can be extracted in root folder and run as standalone application.


*Running as Standalone Application*
-----------------------------------
unzip the archive file

~$unzip gmlc/release/jboss-5.1.0.GA-gmlc.zip

run bin/run.sh script

visit http://localhost:8080/jss7-mangamgent-console in the Browser
configure sctp, mtp3, sccp stack parameters
 
