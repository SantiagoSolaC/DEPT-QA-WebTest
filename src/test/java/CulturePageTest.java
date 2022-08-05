import org.testng.annotations.Test;

public class CulturePageTest extends BaseTest{
    @Test
    public void culturePageTest() throws InterruptedException {
        CulturePage culturePage = homePage.clickButtonCulture();
        WorkingAtDeptPage workingAtDeptPage = culturePage.clickDimiAlbers();
        Thread.sleep(3000);
        workingAtDeptPage.setFirstNameField("Test FirsName");
        workingAtDeptPage.setLastNameField("Test LastName");
        workingAtDeptPage.setCompanyField("Test Company");
        workingAtDeptPage.setEmailField("Test@email.com");
        workingAtDeptPage.setMessageField("Test Message");
        workingAtDeptPage.setArticlesAndEventsCheckbox();
        workingAtDeptPage.setTermsAndConditionsCheckbox();
    }
}
