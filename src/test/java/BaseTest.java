import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.deptagency.com/");
        homePage = new HomePage(driver);
        driver.findElement(By.xpath("/html/body/main/div[8]/div[1]/button[2]")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}