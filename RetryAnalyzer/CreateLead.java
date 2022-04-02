package week6.day2.RetryAnalyser;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	/*
	 * @Parameters("excelfilepath")
	 * 
	 * @BeforeTest public void excelFilePath(String excelfilepath) { excelFilePath =
	 * excelfilepath; }
	 */

	@Test(dataProvider = "CreateLeadDataProvider", priority = 1,
			retryAnalyzer = RetryFailedCase.class)
	public void createLead(String userName, String pswd, String compName, String firstName, String lastName) {

		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(pswd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();

	}

}
