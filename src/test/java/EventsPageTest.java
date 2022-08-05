import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class EventsPageTest extends BaseTest{

    @Test
    public void TestEventsPage() throws InterruptedException {
        MenuPage menuPage = homePage.clickButtonMenu();
        EventsPage eventsPage = menuPage.clickButtonEvents();
        eventsPage.clickButtonUpcomingEvents();
        assertTrue(eventsPage.getVerifyUpcomingEvents().contains("Upcoming events"));

    }
}
