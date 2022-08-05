import org.testng.annotations.Test;

public class RolesPageTest extends BaseTest{

    @Test
    public void getClickButtonRoles() throws InterruptedException {
        MenuPage menuPage = homePage.clickButtonMenu();
        RolesPage rolesPage = menuPage.clickButtonRoles();
    }
}
