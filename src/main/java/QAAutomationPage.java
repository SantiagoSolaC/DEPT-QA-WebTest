import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QAAutomationPage {
    private WebDriver driver;
    private By verifyQAAutomationPage = By.xpath("/html/body/main/div[1]/div[1]/h1");

    public QAAutomationPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getVerifyQAAutomationPage() {
        return driver.findElement(verifyQAAutomationPage).getText();
    }
}
