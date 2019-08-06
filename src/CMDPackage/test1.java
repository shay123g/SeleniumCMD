package CMDPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test1
{
    public WebDriver driver;
    @BeforeClass
    public void InitVariables()
    {
        System.out.println("Initializing...");
        System.setProperty("webdriver.chrome.driver","C://Automation//libs//chromedriver.exe");
        System.setProperty("webdriver.chrome.silentOutput", "true");
         driver = new ChromeDriver();
    }


    @Test
    public void func1()
{
    driver.get("http://www.seleniumhq.org");
    driver.manage().window().maximize();
    driver.quit();
}
    }
