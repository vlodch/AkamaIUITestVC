package example.example.tests;

import example.example.factory.PageinstancesFactory;
import example.example.pages.AkamaiPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * The Class AkamaiSearch.
 *
 * @author Volodya Chukhna
 */
@Test(testName = "Akamai search test", description = "Test description")
public class AkamaiTestResultsAvailableSearchTest extends BaseTest {

	/**
	 * Akamai search test.
	 */
	@Test
	public void akamaiSearchTest() {
		driver.get("https://akamaicareers.inflightcloud.com/");
		AkamaiPage akamaiPage = PageinstancesFactory.getInstance(AkamaiPage.class);
		akamaiPage.searchText("Software Development Engineer in Test Senior");
		Assert.assertTrue(driver.getPageSource().contains("Software Development Engineer in Test Senior"), "Akamai title: Test Failed");
	}
}
