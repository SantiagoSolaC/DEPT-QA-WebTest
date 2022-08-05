import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExperiencePage {

    private WebDriver driver;
    private By buttonCases = By.cssSelector("body > main > div.block-service-post-header.block-service-post-header__block-service-post-header.block-service-post-header--white > div.block-service-post-header__left > div > button:nth-child(2)");
    private By buttonSwitzerlandLink = By.cssSelector("#case-1921");

    public ExperiencePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCasesButton() throws InterruptedException {
        WebElement element = driver.findElement(buttonCases);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(1000);
        element.click();
    }

    public SwitzerlandArticlePage clickButtonSwitzerland() throws InterruptedException {
        WebElement element = driver.findElement(buttonSwitzerlandLink);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(1000);
        element.click();
        return new SwitzerlandArticlePage(driver);
    }

}