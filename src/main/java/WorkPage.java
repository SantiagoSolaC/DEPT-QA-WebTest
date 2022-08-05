import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WorkPage {

    private WebDriver driver;
    private By buttonPlusCategories = By.xpath("//button[@title='Categories']");
    private By buttonTechnology = By.xpath("//button[@data-term-id=\"58\"]");


    public WorkPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickPlusCategories() throws InterruptedException {
        WebElement element = driver.findElement(buttonPlusCategories);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(3000);
        element.click();
    }

    public TechnologyPage clickTechnology() {
        driver.findElement(buttonTechnology).click();
        return new TechnologyPage(driver);
    }


}