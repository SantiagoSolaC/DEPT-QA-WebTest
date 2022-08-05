import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TechnologyPage {

    private WebDriver driver;
    private By buttonRalphLauren = By.xpath("//*[@id=\"case-4096047\"]");

    public TechnologyPage(WebDriver driver) {
        this.driver = driver;
    }


    public RalphLaurenPage clickButtonRalphLauren() {
        driver.findElement(buttonRalphLauren).click();
        return new RalphLaurenPage(driver);
    }

}
