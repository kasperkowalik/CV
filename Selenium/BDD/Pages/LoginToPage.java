package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginToPage {

    WebDriver driver;

    public LoginToPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how= How.ID,using = "user-name")
    @CacheLookup
    WebElement username;

    @FindBy(how = How.ID,using = "password")
    @CacheLookup
    WebElement password;

    @FindBy(how = How.XPATH,using = "//*[@id=\"login_button_container\"]/div/form/input[3]")
    @CacheLookup
    WebElement loginButton;

    public void loginToWebsite(String user, String pass) {
        username.sendKeys(user);
        password.sendKeys(pass);
        loginButton.click();
    }
}
