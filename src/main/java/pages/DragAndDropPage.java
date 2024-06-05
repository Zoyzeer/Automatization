package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPage {

    private final WebDriver driver;

    @FindBy(id = "box6")
    private WebElement rome;

    @FindBy(id = "box106")
    private  WebElement italy;

    public  DragAndDropPage moveRomeToItaly()
    {
        new Actions(driver).dragAndDrop(rome,italy).build().perform();
        return this;
    }

    public String getRomeStyleInfo()
    {
        return rome.getAttribute("style");
    }

    public DragAndDropPage(WebDriver webDriver)
    {
        this.driver = webDriver;
        PageFactory.initElements(webDriver, this);
    }


}
