package POMOrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
    private WebDriver driver;

    public static String expectedWelcomePageUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";

    public WelcomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public String getWelcomePageUrlText() {
        return driver.getCurrentUrl() ;
    }

}
