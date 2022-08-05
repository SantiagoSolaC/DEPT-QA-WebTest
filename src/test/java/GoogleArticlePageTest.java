import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class GoogleArticlePageTest extends BaseTest{

    @Test
    public void TestEventsPage() throws InterruptedException {
        MenuPage menuPage = homePage.clickButtonMenu();
        PartnersPage partnersPage = menuPage.clickButtonPartners();
        GooglePage googlePage = partnersPage.clickButtonGoogle();
        assertTrue(googlePage.getVerifyGoogleArticle().contains("Google practices"));

    }
}
