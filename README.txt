=====================
SIMPLE VIRUS DETECTOR
=====================

Find the source code of the project in "src" folder.

Open in NetBeans to run the project from IDE.


To run the project :
--------------------

1) Go to "dist" folder in terminal.
2) Execute command : java -jar "VirusAnalyzer.jar" 
3) Select the file you want scan for virus, from the file chooser window.
4) Program will detect whether the file contains a virus or not, based on the
   md5 hash of the file's byte code and the provided virus definitions.


NOTE :
======

*) "virusDef.txt" in "dist" folder contains 1000 md5 hashes of files which are
   identified as viruses.

   Source : https://virusshare.com/hashes.4n6

*) EICAR (European Institute for Computer Antivirus Research) Standard Anti-Virus Test File
   is included in "testvirus" folder.

   Source : https://www.ikarussecurity.com/support/virus-info/test-viruses/


