package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {
    WebDriver driver;

    By Name = new By.ById("name");
    By Email = new By.ById("email");
    By Phone = new By.ById("phone");
    By Subject = new By.ById("subject");
    By Message = new By.ById("message");
    By Submit = new By.ById("submitContact");

    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setName() {
        driver.findElement(Name).sendKeys("aaaaaaaaaa");
    }

    public void setEmail(String text) {
        driver.findElement(Email).sendKeys(text);
    }

    public void setPhone(String text) {
        driver.findElement(Phone).sendKeys(text);
    }

    public void setSubject(String text) {
        driver.findElement(Subject).sendKeys(text);
    }

    public void setMessage(String text) {
        driver.findElement(Message).sendKeys(text);
    }

    public void doSubmit() {
        driver.findElement(Submit).click();
    }
}
