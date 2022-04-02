package week6.day2.RetryAnalyser;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedCase implements IRetryAnalyzer {

	public boolean retry(ITestResult result) {
		int count = 0;
		if (count < 3) {
			count++;
			return true;
		}
		return false;
	}

}
