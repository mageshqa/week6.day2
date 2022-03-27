package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{
	
	@When("User clicks on Lead tab")
	public void clickLeadsTab() {
		driver.findElement(By.linkText("Leads")).click();

	}
	/*
	 * @Then("User lands on Lead page") public void leadsPage() {
	 * System.out.println("User enters Leads Page"); }
	 */

	@When("User Clicks on Create Lead link under Shortcuts section")
	public void clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();

	}

	@Then("User lands on Create Lead page")
	public void createLeadsPage() {
		System.out.println("User enters Create Leads Page");
	}

	@When("Enters Company Name as {string}")
	public void companyName(String compName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compName);

	}

	@And("Enters First Name as {string}")
	public void firstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);

	}

	@And("Enters Last Name as {string}")
	public void lastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);

	}

	@And("Clicks Create Lead Button")
	public void createLeadButton() {
		driver.findElement(By.name("submitButton")).click();

	}

	@Then("User comes to Lead Summary page")
	public void leadSummaryPage() {
		System.out.println("User lands in Lead Summary Page");
	}



}
