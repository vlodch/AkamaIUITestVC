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

	@FindBy(id = "keywordLocation")
	private WebElement searchinput;

	@FindBy(id = "location")
	private WebElement selectLocation;


	public AkamaiPage(WebDriver driver) {
		super(driver);
	}

	public void searchText(String key) {
		searchinput.sendKeys(key + Keys.ENTER);
	}

	public void seectCountry(String text) {
		searchText("Poland");
		searchinput.sendKeys(text + Keys.ENTER);
	}
}
