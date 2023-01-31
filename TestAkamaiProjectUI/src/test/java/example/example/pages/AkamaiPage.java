package example.example.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The Class represents AkamaiBasePage.
 *
 * @author Vchukhna
 */
public class AkamaiPage extends BasePage {

	/**
	 * The searchinput.
	 */
	@FindBy(id = "keywordLocation")
	private WebElement searchinput;

	@FindBy(id = "location")
	private WebElement selectLocation;


	/**
	 * Instantiates a new Akamai page.
	 *
	 * @param driver the driver
	 */
	public AkamaiPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Searches the given text.
	 *
	 * @param key the key
	 */
	public void searchText(String key) {
		searchinput.sendKeys(key + Keys.ENTER);
	}

	public void seectCountry(String text) {
		searchText("Poland");
		searchinput.sendKeys(text + Keys.ENTER);
	}
}
