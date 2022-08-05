import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InsightsPage {

    private WebDriver driver;

    private By buttonAllWhitePapersLink = By.cssSelector("#whitepapers > div > div.block-panel-whitepaper__left > a > span.btn__label");

    public InsightsPage(WebDriver driver) {
        this.driver = driver;
    }

    public AllWhitePapersPage clickButtonAllWhitePapers() throws InterruptedException {
        //Thread.sleep(5000);
        WebElement element = driver.findElement(buttonAllWhitePapersLink);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(3000);
        element.click();
        return new AllWhitePapersPage(driver);
    }
}
