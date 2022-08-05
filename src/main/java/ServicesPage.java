import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ServicesPage {

    private WebDriver driver;
    private By buttonServicesLink = By.xpath("//button[@data-target='#services']");
    private By buttonExperienceLink = By.className("service-teaser__heading-wrap");

    public ServicesPage(WebDriver driver) {
        this.driver = driver;
    }

    public ExperiencePage clickExperienceButton() throws InterruptedException {
        driver.findElement(buttonServicesLink).click();
        Thread.sleep(1500);
        driver.findElement(buttonExperienceLink).click();
        return new ExperiencePage(driver);
    }
}