package test.ProjectName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.projectName.BaseTest;
import util.ProjectName.BrowserUtils;
import util.ProjectName.Driver;

public class DynamicContentTest extends BaseTest {

    @BeforeTest
    public void setupTest(){
        driver.get(BrowserUtils.getBaseUrl() + "/dynamic_content");
    }

    @Test
    public void dynamicContentTest(){
        WebElement text1 = driver.findElement(By.xpath("(//div[@class='large-10 columns'])[3]"));
        String firstText = text1.getText();
        Driver.getDriver().navigate().refresh();
        WebElement text2 = driver.findElement(By.xpath("(//div[@class='large-10 columns'])[3]"));
        String secondText = text2.getText();
        Assert.assertNotEquals(firstText, secondText);
        Driver.getDriver().navigate().refresh();
        WebElement text3 = driver.findElement(By.xpath("(//div[@class='large-10 columns'])[3]"));
        String thirdText = text3.getText();
        Assert.assertNotEquals(secondText, thirdText);
    }
}
