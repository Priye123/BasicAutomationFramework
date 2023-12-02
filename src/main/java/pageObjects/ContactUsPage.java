package pageObjects;

import org.openqa.selenium.By;
import testBase.TestBase;

//POM  without PageFactory
public class ContactUsPage extends TestBase {

    By firstName = By.name("first_name");
    By lastName = By.name("last_name");
    By email = By.name("email");
    By comments = By.xpath("//textarea[@name='message']");
    By submit = By.xpath("//input[@type='submit']");

    public void fillContactForm() {
        cm.sendKeysCustom(firstName, "Priye");
        cm.sendKeysCustom(lastName, "Ranjan");
        cm.sendKeysCustom(email, "priyerock@gmail.com");
        cm.sendKeysCustom(comments, "Testing sample UI");
        cm.clickCustom(submit);
    }
}
