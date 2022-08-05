import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertTextFormPage {

    private WebDriver driver;
    private By statusAlert = By.linkText("Thanks!");

    public AlertTextFormPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }

}
