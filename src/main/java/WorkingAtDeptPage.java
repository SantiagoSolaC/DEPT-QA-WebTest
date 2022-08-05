import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WorkingAtDeptPage {

    private WebDriver driver;
    private By firstNameField = By.xpath("//*[@id=\"pardot-form\"]/div[1]/ul/li[1]");
    private By lastNameField = By.id("321011_84762pi_321011_84762");
    private By companyField = By.id("321011_84764pi_321011_84764");
    private By emailField = By.id("321011_84764pi_321011_84766");
    private By messageField = By.id("321011_84764pi_321011_84768");
    private By termsAndConditionsCheckbox = By.cssSelector("#pardot-form > div.c-pardot-form__body > ul > li.c-pardot-form__field.Opt_in_gdpr.pd-checkbox.required > span");
    private By articlesAndEventsCheckbox = By.cssSelector("#pardot-form > div.c-pardot-form__body > ul > li.c-pardot-form__field.Opt_in_marketing.pd-checkbox > span");
//    private By sendButton = By.cssSelector("321011_84774pi_321011_84774");

    public WorkingAtDeptPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setFirstNameField(String firstName) throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(firstNameField).sendKeys(firstName);
    }
    public void setLastNameField(String lastName) throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(lastNameField).sendKeys(lastName);
    }
    public void setCompanyField(String company) throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(companyField).sendKeys(company);
    }
    public void setEmailField(String email) throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(emailField).sendKeys(email);

        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver); //Scroll
        eventFiringWebDriver.executeScript("document.querySelector('#people > div.flyout-drawer.js-flyout-drawer.flyout-drawer__position--right.is-open > div.flyout-drawer__part.flyout-drawer__part--right > div.flyout-drawer__content.flyout-drawer__content--center > div').scrollTop = 500");
        Thread.sleep(3000);
    }

    public void setMessageField(String message) throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(messageField).sendKeys(message);
    }
    public void setTermsAndConditionsCheckbox() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(termsAndConditionsCheckbox).click();
    }
    public void setArticlesAndEventsCheckbox() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(articlesAndEventsCheckbox).click();
    }
//    public WorkingAtDeptAfterFormPage sendForm() {
//        driver.findElement(sendButton).click();
//        return new WorkingAtDeptAfterFormPage(driver);
//    }

}
