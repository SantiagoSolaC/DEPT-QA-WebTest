import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ZurichPage {

    private WebDriver driver;

    private By titleLocator = By.className("heading heading__size--xl heading__align--left block-panel-location-detail__heading");

    public ZurichPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getVerify() {
        return driver.findElement(titleLocator).getText();
    }

}
