import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JustEatTakeawayPage {

    private WebDriver driver;

    private By titleLocator = By.className("heading");

    public JustEatTakeawayPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getVerify() {
        return driver.findElement(titleLocator).getText();
    }
}
