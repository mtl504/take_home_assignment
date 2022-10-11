package test.ProjectName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.projectName.BaseTest;
import util.ProjectName.BrowserUtils;

public class DropdownTest extends BaseTest {

    @BeforeTest
    public void setupTest(){
        driver.get(BrowserUtils.getBaseUrl() + "/dropdown");
    }

    @Test
    public void dropdownTest(){

        WebElement dropdownElement = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdownElement);
        System.out.println(select.getOptions());
        select.selectByVisibleText("Option 1");
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Option 1");
        select.selectByVisibleText("Option 2");
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Option 2");

    }
}
