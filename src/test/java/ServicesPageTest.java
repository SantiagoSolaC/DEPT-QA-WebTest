import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class ServicesPageTest extends BaseTest{

    @Test
    public void technologyPageTest() throws InterruptedException {
        ServicesPage servicesPage = homePage.clickButtonServices();
        ExperiencePage experiencePage = servicesPage.clickExperienceButton();
        experiencePage.clickCasesButton();
        Thread.sleep(1000);
        SwitzerlandArticlePage switzerlandArticlePage = experiencePage.clickButtonSwitzerland();
        assertTrue(switzerlandArticlePage.getVerifyJustEatTakeaway().contains("Immerse "));
    }

}
