package testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageObjects.ContactUsPage;
import reusableComponents.CommonMethods;
import reusableComponents.PropertiesOperations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase extends ObjectsRepo {

    public void LaunchBrowserAndNavigate() throws IOException {
        //String browser = "chrome";
        String browser = PropertiesOperations.getValueofkey("browser");
        //String url = "http://www.webdriveruniversity.com/Contact-Us/contactus.html";
        String url = PropertiesOperations.getValueofkey("url");
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }

    @BeforeMethod
    public void setUpMethod() throws IOException {
        LaunchBrowserAndNavigate();
        contact = new ContactUsPage();
        cm = new CommonMethods();
    }

    @AfterMethod
    public void TearDown() {
        driver.close();
    }
}
