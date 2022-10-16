package POMOrangeHRMTest;

import POMOrangeHRM.LoginPage;
import POMOrangeHRM.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestJava extends BaseTestJava {

    @BeforeMethod
    public void goHomePage(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test
    public void testSuccessfulLogin (){
        login = new LoginPage(driver);
        login.setUserName("Admin");
        login.setPasswordField("admin123");
        WelcomePage welcomePage = login.clickLoginButton();
        Assert.assertEquals(welcomePage.getWelcomePageUrlText(), welcomePage.expectedWelcomePageUrl);
    }
}
