package week6.day1.stepdefn;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MasterSteps extends W6D1HooksBaseClass {

	private String leadID;

	// Login
	@Given("User Enters User name as {string} and Password as {string}")
	public void user_enters_user_name_as_and_password_as(String userName, String pswd) {
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(pswd);

	}

	@And("User Click on Logon Button")
	public void user_click_on_logon_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

	}

	// common
	@Then("{string} should be displayed")
	public void page(String page) {
		boolean displayed = driver.findElement(By.xpath("//div[text()='" + page + "']")).isDisplayed();
		System.out.println(page + " Page displayed :" + displayed);

	}

	@When("User clicks on Lead tab")
	public void user_clicks_on_lead_tab() {
		driver.findElement(By.linkText("Leads")).click();

	}

	// create lead
	@When("User Clicks on Create Lead link under Shortcuts section")
	public void user_clicks_on_create_lead_link_under_shortcuts_section() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@When("Enters new Company Name as {string}")
	public void enters_new_company_name_as(String compName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compName);

	}
	
	@And("Enters updated Company Name as {string}")
	public void enters_updated_company_name_as(String compName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(compName);

	}

	@And("Enters First Name as {string}")
	public void enters_first_name_as(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);

	}

	@And("Enters Last Name as {string}")
	public void enters_last_name_as_last_name(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);

	}

	@And("Clicks Create Lead Button")
	public void clicks_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("User comes to Lead Summary page")
	public void user_comes_to_lead_summary_page() {
		System.out.println(driver.getTitle());
	}

	// Delete Lead
	@When("User Clicks on Find Lead link under Shortcuts section")
	public void user_clicks_on_find_lead_link_under_shortcuts_section() {
		driver.findElement(By.linkText("Find Leads")).click();

	}

	@When("Enters Phone Number as {string}")
	public void enters_phone_number_as(String phoneNum) {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNum);

	}

	@And("Click Find Lead button")
	public void click_find_lead_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);

	}

	@Then("Open first Lead from result")
	public void open_first_lead_from_result() {
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

	}

	@When("Click Delete button")
	public void click_delete_button() {
		driver.findElement(By.linkText("Delete")).click();

	}

	@And("Click Find Lead link under Shortcuts section")
	public void click_find_lead_link_under_shortcuts_section() {
		driver.findElement(By.linkText("Find Leads")).click();

	}

	@Then("Search by Lead ID")
	public void search_by_lead_id() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);

	}

	@And("Click search button")
	public void click_search_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}

	@And("Verify Lead account matches")
	public void verify_lead_account_matches() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}

	// duplicate lead
	/*
	 * @When("User Clicks on Find Lead link under Shortcuts section") public void
	 * findLeads() { driver.findElement(By.linkText("Find Leads")).click();
	 * 
	 * }
	 */

	@When("Click Duplicate button")
	public void duplicateButton() {
		driver.findElement(By.linkText("Duplicate Lead")).click();

	}

	@And("Click Create Lead button")
	public void createLead() {
		driver.findElement(By.name("submitButton")).click();

	}

	// edit lead
	@When("Click Edit Button")
	public void editButton() {
		driver.findElement(By.linkText("Edit")).click();

	}

	@And("Click Update button")
	public void updateButton() {
		driver.findElement(By.name("submitButton")).click();

	}

	// merge lead
	@When("User Clicks on Merge Lead link under Shortcuts section")
	public void mergeLink() {
		driver.findElement(By.linkText("Merge Leads")).click();

	}

	@When("Enters First Lead Name as {string}")
	public void firstLeadName(String firstname) throws InterruptedException {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstname);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));

	}

	@And("Enters Second Lead Name as {string}")
	public void secondLeadName(String secondname) throws InterruptedException {

		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(secondname);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles2.get(0));

	}

	@And("Click Merge Lead Button")
	public void mergeButton() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();

	}

}
