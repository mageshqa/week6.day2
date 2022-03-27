package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login extends BaseClass {

	/*
	 * @Given("User launches LeafTaps website {string}") public void
	 * openChromeBrowser(String url) {
	 * 
	 * driver.get(url); driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 * 
	 * }
	 */

	@Given("User Enters User name as {string} and Password as {string}")
	public void username(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("User Click on Logon Button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@Then("User lands on {string} page")
	public void landPage(String pageText) {
		boolean pgTxt = driver.findElement(By.xpath("//div[text()='" + pageText + "']")).isDisplayed();
		System.out.println(pageText + " is " + pgTxt);
	}

}
