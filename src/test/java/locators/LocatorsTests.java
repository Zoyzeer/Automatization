package locators;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorsTests extends BaseTest {

    @Test
    public void FindById()
    {
       webDriver.get("https://www.ukr.net/");

       WebElement consentButton = webDriver.findElement(By.xpath("//button[@aria-label='Consent']"));
       consentButton.click();

       WebElement inputSearch = webDriver.findElement(By.id("search-input"));
       WebElement findButton = webDriver.findElement(By.xpath("//form[@id='search-form']//input[@type='button']"));

       inputSearch.clear();
       inputSearch.sendKeys("hello");
       findButton.click();
    }

    @Test
   public void findByName()
    {
       webDriver.get("https://automationpanda.com/");
       WebElement emailInput = webDriver.findElement((By.name("email")));
       emailInput.clear();
       emailInput.sendKeys("email@email.com");
    }

    @Test
    public void findByLink()
    {
       webDriver.get("https://automationpanda.com/");

       WebElement link = webDriver.findElement(By.linkText("automation"));

       link.click();
    }

   @Test
   public void findByPartialLink()
   {
      webDriver.get("https://automationpanda.com/");

      WebElement link = webDriver.findElement(By.partialLinkText("Automation"));

      link.click();
   }

     @Test
    public void findByCssSelector() {
         webDriver.get("https://automationpanda.com/");
         WebElement emailInput = webDriver.findElement(By.cssSelector("#subscribe-email > input"));

         emailInput.clear();
         emailInput.sendKeys("test@test.com");

         WebElement emailInput2 = webDriver.findElement(By.cssSelector("#subscribe-email > input[placeholder]"));

         emailInput2.clear();
         emailInput2.sendKeys("test2@test.com");
     }

     @Test
     public void findByXpath()
     {
         webDriver.get("https://automationpanda.com/");
         WebElement emailInput = webDriver
                 .findElement(By.xpath("//p[@id='subscribe-submit']/preceding-sibling::p[@id='subscribe-email']/input"));
         emailInput.clear();
         emailInput.sendKeys("test@test.com");
     }


}