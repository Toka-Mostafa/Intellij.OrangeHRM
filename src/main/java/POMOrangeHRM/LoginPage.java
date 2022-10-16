package POMOrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    @FindBy(xpath = "//input[@name=\"username\"]")
    WebElement userNameField;
    @FindBy(xpath = "//input[@name=\"password\"]")
    WebElement passwordField;
    @FindBy (xpath = "//button[@type=\"submit\"]")
    WebElement loginButton;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void setUserName (String userName){
        userNameField.sendKeys(userName);
    }
    public void setPasswordField (String password){
        passwordField.sendKeys(password);
    }

    public WelcomePage clickLoginButton (){
        loginButton.click();
        return new WelcomePage (driver);
    }


}
