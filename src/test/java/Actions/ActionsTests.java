package Actions;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DragAndDropPage;

public class ActionsTests extends BaseTest {

    @Test
    public void dragAndDrop()
    {
        webDriver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        String expectedColor ="rgb(0, 255, 0)";

        WebElement capital = webDriver.findElement(By.id("box6"));
        WebElement country = webDriver.findElement(By.id("box106"));

        new Actions(webDriver)
                .dragAndDrop(capital,country).perform();

        String styleAfterMoving = capital.getAttribute("style");

        Assert.assertTrue(styleAfterMoving.contains(expectedColor));
    }
    @Test
    public void dragAndDropTwo()
    {
        webDriver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        String expectedColor = "rgb(0, 255, 0)";

        DragAndDropPage dragAndDropPage = new DragAndDropPage(webDriver);

         String actualStyle = dragAndDropPage
                 .moveRomeToItaly()
                 .getRomeStyleInfo();

        Assert.assertTrue(actualStyle.contains(expectedColor));
    }
}









