package Failed_Testcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	
	//counter to keep track of failed retry attempts
	int counterForRetryAttempts = 0;
	
	//set max limit for retry attempts
	int setMaxLimitForRetry = 3 ;
	
	// method to retry failed test cases
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(!result.isSuccess())
		{
			if(counterForRetryAttempts <setMaxLimitForRetry )
			{
				counterForRetryAttempts++;
				return true;
			}
				

		}
		return false;
		
	}

}
