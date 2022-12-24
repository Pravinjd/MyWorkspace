package Extent_Report;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BasicExtenetReport implements ITestListener {

	// create variables of following classes
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;

	// to Initialize variables create 1 method


	@BeforeTest
	public void startReport() 
	{
		htmlReporter = new ExtentSparkReporter("ExtentReportDemo.html"); //in parameter we can also give path for file

		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);

		//add Environment details
		reports.setSystemInfo("machine1", "testpc1");
		reports.setSystemInfo("os", "win10");
		reports.setSystemInfo("user", "Pravin");
		reports.setSystemInfo("browser", "chrome");

		//configuration to change look and feel
		htmlReporter.config().setDocumentTitle("Extent Report Demo1");
		htmlReporter.config().setReportName("Pravin's Extent Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'" );
	}

	@Test
	public void LaunchBrowserAndOpenURL()
	{
		//create test
		test = reports.createTest("Launch Browser & Open URL");
		Assert.assertTrue(true); //will pass this test
	}

	@Test
	public void VerifyTitle()
	{
		//create test 
		test = reports.createTest("Verify Title");
		Assert.assertTrue(false); //will fail this test
	}

	@Test
	public void VerifyLogo()
	{
		//create test
		test = reports.createTest("Verify Logo");
		Assert.assertTrue(true);//will pass this test
	}

	@Test
	public void VerifyEmail()
	{
		//create test
		test = reports.createTest("Verify Email");
		throw new SkipException("skipping this test case with exception...");
	}

	@Test
	public void VerifyUserName()
	{
		//create test
		test = reports.createTest("Verify UserName");
		Assert.assertTrue(true); //will pass this test
	}

	@AfterMethod
	public void getTestResult(ITestResult result)
	{
		if (result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " :FAILED", ExtentColor.RED));
			test.fail(result.getThrowable());
		}
		else if (result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "  :PASSED", ExtentColor.GREEN));
		}
		else if (result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "  :SKIPPED", ExtentColor.ORANGE));
		}
	}

	@AfterTest
	public void tearDown()
	{
		reports.flush();
	}

}
