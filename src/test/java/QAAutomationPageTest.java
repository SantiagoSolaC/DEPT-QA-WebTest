import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class QAAutomationPageTest extends BaseTest{

    @Test
    public void QAAutomation() throws InterruptedException {
        MenuPage menuPage = homePage.clickButtonMenu();
        RolesPage rolesPage = menuPage.clickButtonRoles();
        rolesPage.buttonLocationClick();
        rolesPage.buttonLocationArgentinaClick();
        rolesPage.buttonEmploymentTypeClick();
        rolesPage.buttonEmploymentTypeEmployeeClick();
        rolesPage.buttonDepartmentClick();
        rolesPage.buttonDepartmentDevelopmentClick();
        QAAutomationPage qaAutomationPage = rolesPage.clickButtonQAAutomationLink();
        assertTrue(qaAutomationPage.getVerifyQAAutomationPage().contains("QA Automation | Argentina"));
    }

}
