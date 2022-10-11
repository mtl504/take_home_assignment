package test.ProjectName;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.projectName.BaseTest;
import util.ProjectName.BrowserUtils;

public class FloatingMenuTest extends BaseTest {

    @BeforeTest
    public void setupTest(){
        driver.get(BrowserUtils.getBaseUrl() + "/floating_menu");
    }

    @Test
    public void floatingMenuTest(){

        JavascriptExecutor js =  (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)");
        WebElement menu = driver.findElement(By.xpath("//div[@id='menu']"));
        Assert.assertTrue(menu.isDisplayed());
        js.executeScript("window.scrollBy(0,1000)");
        Assert.assertTrue(menu.isDisplayed());

    }
}
