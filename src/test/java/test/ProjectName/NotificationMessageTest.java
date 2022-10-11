package test.ProjectName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.projectName.BaseTest;
import util.ProjectName.BrowserUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NotificationMessageTest extends BaseTest {

    @BeforeTest
    public void setupTest() {
        driver.get(BrowserUtils.getBaseUrl() + "/notification_message_rendered");
    }

    @Test
    public void notificationMessageTest() {

        List<String> messages = Arrays.asList("Action successful", "Action unsuccessful, please try again", "Action Unsuccessful");
        driver.findElement(By.xpath("//a[.='Click here']")).click();
        String text1 = driver.findElement(By.id("flash")).getText().split("×")[0].strip();
        if(messages.contains(text1)) {
            Assert.assertTrue(true);
        }

        driver.findElement(By.xpath("//a[text()='Click here']")).click();
        String text2 = driver.findElement(By.id("flash")).getText().split("×")[0].strip();

        if(messages.contains(text2)) {
            Assert.assertTrue(true);
        }

        driver.findElement(By.xpath("//a[text()='Click here']")).click();
        String text3 = driver.findElement(By.id("flash")).getText().split("×")[0].strip();

        if(messages.contains(text3)) {
            Assert.assertTrue(true);
        }

    }
}
