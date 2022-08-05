import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArticlePage {
    private WebDriver driver;
    private By verifyArticlePage = By.xpath("/html/body/main/div[1]/div[1]/h1");

    public ArticlePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getVerify() {
        return driver.findElement(verifyArticlePage).getText();
    }
}
