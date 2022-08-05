import org.testng.annotations.Test;

public class MenuPageTest extends BaseTest{

    @Test
    public void getClickButtonMenu() throws InterruptedException {
        MenuPage menuPage = homePage.clickButtonMenu();
    }
}
