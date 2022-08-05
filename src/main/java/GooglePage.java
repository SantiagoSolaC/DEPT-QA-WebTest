import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {
    private WebDriver driver;

    private By verifyGoogleArticle = By.cssSelector("body > main > div:nth-child(6) > div.block-panel-with-rich-text__left.block-panel-with-rich-text__left--white > h2");

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getVerifyGoogleArticle() throws InterruptedException {
        Thread.sleep(5000);
        WebElement element = driver.findElement(verifyGoogleArticle);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(5000);
        element.click();
        return driver.findElement(verifyGoogleArticle).getText();
    }
}
