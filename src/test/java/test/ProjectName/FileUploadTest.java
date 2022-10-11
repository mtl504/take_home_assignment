package test.ProjectName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.projectName.BaseTest;
import util.ProjectName.BrowserUtils;

public class FileUploadTest extends BaseTest {

    @BeforeTest
    public void setupTest(){
        driver.get(BrowserUtils.getBaseUrl() + "/upload");
    }

    @Test
    public void uploadTest(){
        String localDirectory = ""; // your local machine download directory
        WebElement uploadBox = driver.findElement(By.xpath("//input[@id='file-upload']"));
//        uploadBox.sendKeys("C:\\Users\\igork\\Downloads\\some-file.txt"); is works only on my local machine
        uploadBox.sendKeys(localDirectory + "some-file.txt");
        WebElement uploadBtn = driver.findElement(By.xpath("//input[@class='button']"));
        uploadBtn.click();
        WebElement fileUploadedMsg = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(fileUploadedMsg.isDisplayed());
    }
}
