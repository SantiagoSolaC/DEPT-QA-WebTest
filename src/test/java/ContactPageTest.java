import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ContactPageTest extends BaseTest{

    @Test
    public void ZurichTestPage() throws InterruptedException {
        ContactPage contactPage = homePage.clickButtonContact();
        MarDelPlataPage marDelPlataPage = contactPage.clickMarDelPlataButton();
        assertTrue(marDelPlataPage.getVerify().contains("Mar del Plata"));
    }
}
