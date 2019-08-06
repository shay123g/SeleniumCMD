set projectLocation=C:\Automation\workspace\SeleniumCMD
cd %projectLocation%
set classpath=%projectLocation%\out\production\SeleniumCMD;%projectLocation%\libs\*
java org.testng.TestNG %projectLocation%\testing.xml