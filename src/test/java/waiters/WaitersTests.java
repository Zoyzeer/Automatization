package Waiters;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class WaitersTests extends BaseTest {

    @Test
    public void executeJs()
    {
        JavascriptExecutor js = (JavascriptExecutor)webDriver;
        js.executeScript("alert('Hello')");

    }


    @Test
    public void waitersTests()
    {
        webDriver.get("https://automationpanda.com/");

        WebElement follow = new WebDriverWait(webDriver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable
                        (By.xpath("//button[@class='wp-block-button__link']")));

        follow.click();
    }



    @Test
    public void prozzoroTests()
    {
        String searchValue ="тумба";
        webDriver.get("https://prozorro.gov.ua/en");

        WebElement searchInput = webDriver.findElement(By.className("search-text__input"));
        searchInput.clear();
        searchInput.sendKeys(searchValue);
        searchInput.sendKeys(Keys.ENTER);

        List<WebElement> itemsHeaders = webDriver.findElements(By.className("item-title__title"));

        WebElement currentItem = itemsHeaders.get(7);

        new Actions(webDriver).moveToElement(currentItem).build().perform();

        currentItem.click();

        String actualResult = new WebDriverWait(webDriver, Duration.ofSeconds(15))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class,'tender--head--title')]")))
                .getText().trim().toLowerCase();

        Assert.assertTrue(actualResult.contains(searchValue),"Search result is incorrect");
    }


}