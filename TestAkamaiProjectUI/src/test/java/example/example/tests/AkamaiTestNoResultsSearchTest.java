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
public class AkamaiTestNoResultsSearchTest extends BaseTest {

	/**
	 * Akamai search test no results.
	 */
	@Test
	public void akamaiSearchTest() {
		driver.get("https://akamaicareers.inflightcloud.com/");
		AkamaiPage akamaiPage = PageinstancesFactory.getInstance(AkamaiPage.class);
		akamaiPage.searchText("Senior Software Development Engineer in Test");//Search by category, keyword, or location
		akamaiPage.seectCountry("Poland");
		Assert.assertTrue(driver.getTitle().contains("Akamai"), "Akamai title: Test Failed");
		Assert.assertTrue(driver.getPageSource().contains("Senior Software Development Engineer in Test"), "Position search : Test Failed");
		Assert.assertTrue(driver.getPageSource().contains("Poland"), "Poland search : Test Failed");
		Assert.assertTrue(driver.getPageSource().contains("We found 0 jobs based on your search criteria"), "Poland search : Test Failed");
	}
}
