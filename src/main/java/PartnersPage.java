import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PartnersPage {
    private WebDriver driver;

    private By buttonGoogleLink = By.cssSelector("#all-partners > div > div.block-panel-partners__column.block-panel-partners__column--right > a:nth-child(8)");

    public PartnersPage(WebDriver driver) {
        this.driver = driver;
    }

    public GooglePage clickButtonGoogle() throws InterruptedException {
        Thread.sleep(5000);
        WebElement element = driver.findElement(buttonGoogleLink);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(5000);
        element.click();
        return new GooglePage(driver);
    }
}
