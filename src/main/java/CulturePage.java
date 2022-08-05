import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CulturePage {

    private WebDriver driver;
    private By buttonPeopleLink = By.xpath("/html/body/main/div[1]/div/button[2]");
    private By buttonDimiAlbersLink = By.xpath("//button[@title='Contact']");
    private By buttonWorkingAtDeptLink = By.xpath("//*[@id=\"people\"]/div[2]/div[2]/div[2]/div/form/label[4]/span");


    public CulturePage(WebDriver driver) {
        this.driver = driver;
    }


    public WorkingAtDeptPage clickDimiAlbers() throws InterruptedException {
        driver.findElement(buttonPeopleLink).click();
        Thread.sleep(3000);
        driver.findElement(buttonDimiAlbersLink).click();
        Thread.sleep(3000);
        driver.findElement(buttonWorkingAtDeptLink).click();
        Thread.sleep(3000);
        return new WorkingAtDeptPage(driver);
    }

}

