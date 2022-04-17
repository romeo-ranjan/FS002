Set projectLocation=G:\Programing\Selenium\Automation Testing\FS002_Frm
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause