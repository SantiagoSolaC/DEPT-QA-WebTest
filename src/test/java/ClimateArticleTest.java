import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ClimateArticleTest extends BaseTest{

    @Test
    public void ClimateArticle() throws InterruptedException {
        MenuPage menuPage = homePage.clickButtonMenu();
        TheGoodCompanyPage theGoodCompanyPage = menuPage.clickButtonTheGoodCompany();
        theGoodCompanyPage.buttonPlusClimateClick();
        assertTrue(theGoodCompanyPage.getVerifyClimateArticle().contains("Close"));
    }
}
