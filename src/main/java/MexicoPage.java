import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MexicoPage {

    private WebDriver driver;

    private By titleLocator = By.cssSelector("body > main > div.block-panel-location-detail > div.block-panel-location-detail__column.block-panel-location-detail__column--left > h1");

    public MexicoPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getVerify() {
        return driver.findElement(titleLocator).getText();
    }

}
