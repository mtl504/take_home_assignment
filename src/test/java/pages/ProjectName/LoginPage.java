package pages.ProjectName;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.ProjectName.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "username")
    public WebElement username_box;

    @FindBy(id = "password")
    public WebElement password_box;

    @FindBy (xpath = "//button")
    public WebElement loginBtn;

    @FindBy (xpath = "//div[@class='flash success']")
    public WebElement loginMsgSuccess;

    @FindBy (xpath = "//div[@class='flash error']")
    public WebElement loginMsgFailed;

}
