import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RolesPage {
    private WebDriver driver;
    private By buttonLocation = By.xpath("//*[@id=\"open-roles\"]/div/div[1]/div[2]/button");
    private By buttonQAAutomationLink = By.xpath("//*[@id=\"open-roles\"]/div/div[2]/div[2]/a[3]/button");
    public RolesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void buttonLocationClick() throws InterruptedException {
        Thread.sleep(3000);
        WebElement element = driver.findElement(buttonLocation);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(1000);
        element.click();
    }

    public void buttonLocationArgentinaClick() throws InterruptedException {
        Thread.sleep(2000);
        clickLink("//*[@id=\"tippy-1\"]/div/div/div/label[1]/input");
    }

    public void buttonEmploymentTypeClick() throws InterruptedException {
        Thread.sleep(2000);
        clickLink("//*[@id=\"open-roles\"]/div/div[1]/div[3]/button");
    }

    public void buttonEmploymentTypeEmployeeClick() throws InterruptedException {
        Thread.sleep(2000);
        clickLink("//*[@id=\"tippy-2\"]/div/div/div/label[2]/input");
    }

    public void buttonDepartmentClick() throws InterruptedException {
        Thread.sleep(2000);
        clickLink("//*[@id=\"open-roles\"]/div/div[1]/div[4]/button");
    }

    public void buttonDepartmentDevelopmentClick() throws InterruptedException {
        Thread.sleep(2000);
        clickLink("//*[@id=\"tippy-3\"]/div/div/div/label[5]/input");
        Thread.sleep(2000);
    }

    public QAAutomationPage clickButtonQAAutomationLink() throws InterruptedException {
        Thread.sleep(4000);
        WebElement element = driver.findElement(buttonQAAutomationLink);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(1000);
        element.click();
        return new QAAutomationPage(driver);
    }

    public void clickLink(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
}
