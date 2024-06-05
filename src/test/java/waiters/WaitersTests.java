import java.time.Duration;
import java.util.List;

public class WaitersTests {

    WebDriver webDriver = new ChromeDriver();

    @Test
    public void prozzoroTests()
    {
        String searchValue = "Тумба";
        webDriver.get("https://prozorro.gov.ua/en");

        WebElement searchInput = webDriver.findElement(By.className("search-text__input"));
        searchInput.clear();
        searchInput.sendKeys(searchValue);
        searchInput.sendKeys(Keys.ENTER);

        List<WebElement> itemsHeaders = webDriver.findElements(By.className("item-title__title"));

        WebELement currentItem = itemsHeaders.get(3); // Введите свое число что бы достать нужный элемент

        new Actions(webDriver).move

        itemsHeaders.get(0).click();

        String actualResult = new WebDriverWait(webDriver, Duration.ofSeconds(15))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, 'tender--head--title')]")))
                .getText().trim();

        Assert.assertTrue(actualResult.contains(searchValue), "Search result is incorrect ");
    }

}

