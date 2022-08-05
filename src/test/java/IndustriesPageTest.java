import org.testng.annotations.Test;

public class IndustriesPageTest extends BaseTest{

    @Test
    public void getClickButtonIndustries() throws InterruptedException {
        MenuPage menuPage = homePage.clickButtonMenu();
        IndustriesPage industriesPage = menuPage.clickButtonIndustries();
    }
}
