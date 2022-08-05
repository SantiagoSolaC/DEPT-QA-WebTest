import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RalphLaurenPage {

    private WebDriver driver;
    private By titleLocator = By.xpath("/html/body/main/section/h1");

    public RalphLaurenPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getVerify() {
        return driver.findElement(titleLocator).getText();
    }
}
