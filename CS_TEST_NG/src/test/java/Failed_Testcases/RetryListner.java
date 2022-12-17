 package Failed_Testcases;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;

public class RetryListner implements IAnnotationTransformer {
	
	// we will overide method of interface 
	public void transform(ITestAnnotation testAnnotation, Class testClass,
			Constructor testConstructor , Method testMethod ) 
	{
		testAnnotation.setRetryAnalyzer(RetryAnalyzer.class);
	}

}
