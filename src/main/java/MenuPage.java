import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage{

    private WebDriver driver;

    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public IndustriesPage clickButtonIndustries() throws InterruptedException {
        Thread.sleep(3000);
        clickLink("/html/body/div[1]/ul[1]/li[1]/a");
        return new IndustriesPage(driver);
    }

    public RolesPage clickButtonRoles() throws InterruptedException {
        Thread.sleep(5000);
        clickLink("/html/body/div[1]/ul[1]/li[6]/a");
        return new RolesPage(driver);
    }

    public TheGoodCompanyPage clickButtonTheGoodCompany() throws InterruptedException {
        Thread.sleep(5000);
        clickLink("/html/body/div[1]/ul[1]/li[5]/a");
        return new TheGoodCompanyPage(driver);
    }

    public EventsPage clickButtonEvents() throws InterruptedException {
        Thread.sleep(5000);
        clickLink("/html/body/div[1]/ul[1]/li[3]/a");
        return new EventsPage(driver);
    }

    public PartnersPage clickButtonPartners() throws InterruptedException {
        Thread.sleep(4000);
        clickLink("/html/body/div[1]/ul[1]/li[2]/a");
        return new PartnersPage(driver);
    }

    public void clickLink(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
}
