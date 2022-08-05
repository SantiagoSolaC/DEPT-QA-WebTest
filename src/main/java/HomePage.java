import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WorkPage clickButtonWork() {
        clickLink("navbar-shortcut-menu__item--32257");
        return new WorkPage(driver);
    }

    public CulturePage clickButtonCulture() {
        clickLink("navbar-shortcut-menu__item--32271");
        return new CulturePage(driver);
    }

    public InsightsPage clickButtonInsights() throws InterruptedException {
        Thread.sleep(5000);
        clickLink("navbar-shortcut-menu__item--32261");
        return new InsightsPage(driver);
    }

    public MenuPage clickButtonMenu() throws InterruptedException {
        clickLink("menu-open-close-button__icon");
        Thread.sleep(1000);
        return new MenuPage(driver);
    }

    public ServicesPage clickButtonServices() {
        clickLink("navbar-shortcut-menu__item--27304");
        return new ServicesPage(driver);
    }

    public CareersPage clickButtonCareers() {
        clickLink("navbar-shortcut-menu__item--4101077");
        return new CareersPage(driver);
    }

    public ContactPage clickButtonContact() {
        clickLink("navbar-shortcut-menu__item--33043");
        return new ContactPage(driver);
    }

    public void clickLink(String className){
        driver.findElement(By.className(className)).click();
    }
}