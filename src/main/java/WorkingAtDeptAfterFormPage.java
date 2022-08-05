import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkingAtDeptAfterFormPage {

    private WebDriver driver;
    private By succesfullMessage = By.linkText("Thanks!");

    public WorkingAtDeptAfterFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public String gettingSuccesfullMessage() {
        return driver.findElement(succesfullMessage).getText();
    }
}
