import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndustriesPage {

    private WebDriver driver;
    private By buttonBankingFinanceInsuranceLink = By.cssSelector("#industries_list > div > div.block-panel-industries__column.block-panel-industries__column--right > a:nth-child(3)");

    public IndustriesPage(WebDriver driver) {
        this.driver = driver;
    }

    public BankingFinanceInsurancePage clickButtonBankingFinanceInsurance() throws InterruptedException {
        Thread.sleep(5000);
        WebElement element = driver.findElement(buttonBankingFinanceInsuranceLink);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(5000);
        element.click();
        return new BankingFinanceInsurancePage(driver);
    }
}
