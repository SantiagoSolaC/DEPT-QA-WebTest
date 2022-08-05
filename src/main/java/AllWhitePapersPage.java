import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllWhitePapersPage {
    private WebDriver driver;
    private By articleLink = By.xpath("//*[@id=\"all-whitepapers\"]/div/div[2]/a[10]");

    public AllWhitePapersPage(WebDriver driver) {
        this.driver = driver;
    }

    public ArticlePage clickArticle() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(articleLink);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(9000);
        element.click();
        return new ArticlePage(driver);
    }
}
