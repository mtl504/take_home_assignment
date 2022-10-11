package test.ProjectName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.projectName.BaseTest;
import util.ProjectName.BrowserUtils;
import util.ProjectName.Driver;

public class CheckboxTest extends BaseTest {

    @BeforeTest
    public void setupTest(){
        driver.get(BrowserUtils.getBaseUrl() + "/checkboxes");
    }

    @Test
    public void checkTest(){

        WebElement checkbox1 = driver.findElement(By.xpath("//input[1]"));
        Assert.assertFalse(checkbox1.isSelected());
        checkbox1.click();
        Assert.assertTrue(checkbox1.isSelected());

        WebElement checkbox2 = driver.findElement(By.xpath("//input[2]"));
        Assert.assertTrue(checkbox2.isSelected());
        checkbox2.click();
        Assert.assertFalse(checkbox2.isSelected());
    }
}
