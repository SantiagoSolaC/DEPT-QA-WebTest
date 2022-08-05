import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CareersPageTest extends BaseTest{

    @Test
    public void ZurichTestPage() throws InterruptedException {
        CareersPage careersPage = homePage.clickButtonCareers();
        MexicoPage mexicoPage = careersPage.clickMexicoButton();
        assertTrue(mexicoPage.getVerify().contains("Mexico"));
    }
}
