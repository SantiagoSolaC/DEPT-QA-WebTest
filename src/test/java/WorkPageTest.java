import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WorkPageTest extends BaseTest{
    @Test
    public void technologyPageTest() throws InterruptedException {
        WorkPage workPage = homePage.clickButtonWork();
        workPage.clickPlusCategories();
        Thread.sleep(3500);
        TechnologyPage technologyPage = workPage.clickTechnology();
        Thread.sleep(3500);
        RalphLaurenPage ralphLaurenPage = technologyPage.clickButtonRalphLauren();
        assertTrue(ralphLaurenPage.getVerify().contains("Ralph Lauren"));
    }
}

