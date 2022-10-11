package base.projectName;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pages.ProjectName.LoginPage;
import util.ProjectName.ConfigurationReader;
import util.ProjectName.Driver;

public class BaseTest {

    public WebDriver driver;


    @BeforeTest
    public void setup(){
       driver = Driver.getDriver();

    }

    @AfterTest
    public void tearDown(){
     driver.quit();
    }
}

