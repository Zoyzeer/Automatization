import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {
    
    WebDriver webDriver;

    @BeforeMethod
    public void initDriver() { webDriver = new ChromeDriver(); }

    @AfterMethod
    public void quitDriver() { webDriver.quit(); }
}
