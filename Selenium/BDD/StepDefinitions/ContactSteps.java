package stepDefinitions;

import Pages.ContactPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactSteps {
    public static WebDriver driver;



    @Given("^User is on contact page$")
    public void user_is_on_contact_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationintesting.online/");
        driver.findElement(By.xpath("//*[@id=\"next\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"next\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"next\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"next\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"closeModal\"]")).click();
    }

    @When("^User complete form with correct data$")
    public void user_complete_form_with_correct_data() {
        ContactPage contact = new ContactPage(driver);
        contact.setName();
        contact.setEmail("aaa@wp.pl");
        contact.setPhone("12345123451");
        contact.setSubject("bcdsbhcdhssdadasdasdadadadada");
        contact.setMessage("ssdadasdasdadadadadasdadasdasdadadadada");

    }

    @When("^User complete form with incorrect data$")
    public void user_complete_form_with_incorrect_data() {
        ContactPage contact = new ContactPage(driver);
        contact.setName();
        contact.setEmail("aaawp.pl");
        contact.setPhone("12123451");
        contact.setSubject("@!#$!#@$!#@$!#@$!@#$!@#$!!!");
        contact.setMessage("ssdadasdasdadadadada");


    }

    @Then("^Mail has been sent$")
    public void mail_has_been_sent() {
        ContactPage contact = new ContactPage(driver);
        contact.doSubmit();
    }

    @Then("^See communicate below incorrect field$")
    public void see_communicate_below_incorrect_field() {
    }

    @And("^User see communicate$")
    public void user_see_communicate() {
    String communicate = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[5]/div[2]/div")).getText();
    System.out.println(communicate);
    }

}
