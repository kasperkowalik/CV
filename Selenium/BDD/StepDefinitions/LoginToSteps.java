package stepDefinitions;

import Pages.LoginToPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginToSteps {
    public static WebDriver driver;

    @Given("^User is on login page$")
    public void user_is_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/index.html");
    }

    @When("^User write (.+) and (.+)$")
    public void user_write_and(String logid, String pass) {
        LoginToPage loginpage = PageFactory.initElements(driver, LoginToPage.class);
        loginpage.loginToWebsite(logid,pass);

    }

    @Then("^Unsuccessfull login$")
    public void unsuccessfull_login() {
        assert driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/h3/button")).isEnabled();
        driver.close();
    }
}
