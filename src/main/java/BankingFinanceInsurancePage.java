import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class BankingFinanceInsurancePage {

    private WebDriver driver;
    private By buttonGetInContact = By.className("block-industry-post-header__cta-bar");
    private By companyField = By.cssSelector("#\\33 21011_26169pi_321011_26169");
    private By firstNameField = By.id("321011_26171pi_321011_26171");
    private By lastNameField = By.id("321011_26173pi_321011_26173");
    private By emailField = By.id("321011_26175pi_321011_26175");
    private By phoneField = By.id("321011_26177pi_321011_26177");
    private By messageField = By.id("321011_26179pi_321011_26179");
    protected By termsConditionsCheck = By.id("321011_35226pi_321011_35226");
    protected By reciveNewsCheck = By.id("321011_35228pi_321011_35228");
    private By sendItButton = By.xpath("//*[@id=\"pardot-form\"]/div/div/input");

    public BankingFinanceInsurancePage(WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        this.driver = driver;
    }

    public void getbuttonGetInContact() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(buttonGetInContact).click();
        Thread.sleep(1000);
    }

    public void setCompany(String company) throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(companyField).sendKeys(company);
    }

    public void setFirstName(String firstName) throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastName(String lastName) throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setEmail(String email) throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(emailField).sendKeys(email);

        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver); //Scroll
        eventFiringWebDriver.executeScript("document.querySelector('body > main > div.flyout-drawer.js-flyout-drawer.flyout-drawer__position--right.is-open > div.flyout-drawer__part.flyout-drawer__part--right > div.flyout-drawer__content.flyout-drawer__content--center > div').scrollTop = 500");
        Thread.sleep(3000);
    }

    public void setPhone(String phone) throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void setMessage(String message) throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(messageField).sendKeys(message);
    }

    public void termsConditionsCheck() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(buttonGetInContact).click();
    }

    public void reciveNewsCheck() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(buttonGetInContact).click();
    }

    public AlertTextFormPage clickSendItButton() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(buttonGetInContact).click();
        return new AlertTextFormPage(driver);
    }
}
