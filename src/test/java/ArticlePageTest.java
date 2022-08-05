import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ArticlePageTest extends BaseTest{

    @Test
    public void articlePageTest() throws InterruptedException {
        InsightsPage insightsPage = homePage.clickButtonInsights();
        AllWhitePapersPage allWhitepapersPage = insightsPage.clickButtonAllWhitePapers();
        ArticlePage articlePage = allWhitepapersPage.clickArticle();
        assertTrue(articlePage.getVerify().contains("The Shift Left approach to testing"));
    }
}