package test.java.googleTests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.qameta.allure.*;

public class GoogleTests {

    @Test
    public void firstTest() 
    {
        webDriver.get("https://mvnrepository.com/");

        var bool = webDriver.findElement(By.xpath("//div[@id='logo']"));
        Assert.assertTrue(bool, "MVN page is not opened successfully");


    }
}
