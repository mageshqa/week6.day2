package week6.day2.RetryAnalyser;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation) {
		annotation.setRetryAnalyzer(RetryFailedCase.class);
	}

}
