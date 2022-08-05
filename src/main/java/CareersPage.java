import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class CareersPage {

    private WebDriver driver;

    public CareersPage(WebDriver driver) {
        this.driver = driver;
    }
    private By divMexico = By.className("js-block-scroll-control-carousel-items");
    private By buttonMexicoLink = By.xpath("//*[@id=\"locations\"]/div/div[3]/a[24]/p");

    public MexicoPage clickMexicoButton() throws InterruptedException {
        WebElement element = driver.findElement(divMexico);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(3000);

        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
        eventFiringWebDriver.executeScript("document.querySelector('#locations > div').scrollLeft = 9000");
        Thread.sleep(9900);
        driver.findElement(buttonMexicoLink).click();
        return new MexicoPage(driver);
    }
}
