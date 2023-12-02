import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

public class ContactUsPageTest extends TestBase {

    @Test(invocationCount = 2)
    public void fillFormTest(){
        contact.fillContactForm();
        Assert.assertEquals(driver.findElement(By.xpath("//h1[text()='Thank You for your Message!']")).getText(),"Thank You for your Message!");
    }
}
