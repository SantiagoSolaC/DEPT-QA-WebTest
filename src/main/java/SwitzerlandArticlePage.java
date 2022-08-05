import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitzerlandArticlePage {

    private WebDriver driver;

    private By verifySwitzerlandArticle = By.cssSelector("body > main > div:nth-child(24) > div.block-panel-with-rich-text__left.block-panel-with-rich-text__left--richBlack > h2");

    public SwitzerlandArticlePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getVerifyJustEatTakeaway() throws InterruptedException {
        Thread.sleep(5000);
        WebElement element = driver.findElement(verifySwitzerlandArticle);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(5000);
        return driver.findElement(verifySwitzerlandArticle).getText();
    }
}
