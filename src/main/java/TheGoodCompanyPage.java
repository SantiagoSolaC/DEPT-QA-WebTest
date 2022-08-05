import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TheGoodCompanyPage {

    private WebDriver driver;
    private By buttonPlusClimate = By.xpath("/html/body/main/div[4]/div[2]/div/div[1]/div/div[1]");
    private By verifyClimateArticle = By.cssSelector("#card-teaser__62e86f4549813 > button");

    public TheGoodCompanyPage(WebDriver driver) {
        this.driver = driver;
    }

    public void buttonPlusClimateClick() throws InterruptedException {
        Thread.sleep(4000);
        WebElement element = driver.findElement(buttonPlusClimate);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(5000);
        element.click();
    }

    public String getVerifyClimateArticle() throws InterruptedException {
        Thread.sleep(4000);
        return driver.findElement(verifyClimateArticle).getText();
    }

}
