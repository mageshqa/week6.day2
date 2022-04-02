package week6.day2.RetryAnalyser;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseClass{
	

	/*
	 * @Parameters("excelfilepath")
	 * 
	 * @BeforeTest public void excelFilePath(String excelfilepath) { excelFilePath =
	 * excelfilepath; }
	 */

	@Test(dataProvider="DuplicateLeadDataProvider", priority = 2,
			retryAnalyzer = RetryFailedCase.class)
	public void duplicateLead(String username, String pswd, String phnNum) throws InterruptedException {

		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pswd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phnNum);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.name("submitButton")).click();

	}


}
