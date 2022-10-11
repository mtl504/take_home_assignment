package test.ProjectName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.projectName.BaseTest;
import util.ProjectName.BrowserUtils;

public class IframeTest extends BaseTest {

    @BeforeTest
    public void setupTest(){
        driver.get(BrowserUtils.getBaseUrl() + "/iframe");
    }

    @Test
    public void iframeTest(){

        WebElement frame = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(frame);
        WebElement textBox = driver.findElement(By.id("tinymce"));
        textBox.clear();
        textBox.sendKeys("Wooden Spoon");
        Assert.assertEquals(textBox.getText(), "Wooden Spoon");

    }
}
