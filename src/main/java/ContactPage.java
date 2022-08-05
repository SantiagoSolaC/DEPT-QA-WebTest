import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ContactPage {

    private WebDriver driver;
    private By buttonOfficesLink = By.xpath("/html/body/main/div[1]/div[1]/div/button[1]/span");
    private By buttonMarDelPlataLink = By.xpath("//*[@id=\"offices\"]/div/ul/li[23]/a");

    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public MarDelPlataPage clickMarDelPlataButton() throws InterruptedException {
        driver.findElement(buttonOfficesLink).click();
        Thread.sleep(3000);
        //Thread.sleep(3000);

        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
        eventFiringWebDriver.executeScript("document.querySelector('#offices > div > ul').scrollTop = 1500");
        Thread.sleep(3000);
        driver.findElement(buttonMarDelPlataLink).click();
        return new MarDelPlataPage(driver);
    }
}