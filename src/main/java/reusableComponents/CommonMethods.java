package reusableComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import testBase.TestBase;

public class CommonMethods extends TestBase {

    public void sendKeysCustom(By value, String valueTobeSent) {
        getElement(value).sendKeys(valueTobeSent);
    }

    public void clickCustom(By value) {
        getElement(value).click();
    }

    public WebElement getElement(By value) {
        WebElement ele = driver.findElement(value);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: none; border: 5px solid blue;');", ele);
        return ele;
    }
}
