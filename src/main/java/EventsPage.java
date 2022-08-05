import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EventsPage {
    private WebDriver driver;

    private By buttonUpcomingEvents = By.cssSelector("body > main > div.block-featured-event > div > button");
    private By verifyUpcomingEvents = By.cssSelector("#events > div > div.block-panel-event__left > h1");

    public EventsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonUpcomingEvents() throws InterruptedException {
        Thread.sleep(5000);
        WebElement element = driver.findElement(buttonUpcomingEvents);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(5000);
        element.click();
    }

    public String getVerifyUpcomingEvents() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(verifyUpcomingEvents).getText();
    }
}
