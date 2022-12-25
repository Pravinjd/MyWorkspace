package Utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;
import org.testng.ITestContext;
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

public class ExtentListnerClass implements ITestListener  {

	// create variables of following classes
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;

	// to Initialize variables create 1 method



	public void configureReport() 
	{	
		ReadConfig readconfig = new ReadConfig();
		
		String timeStamp = new SimpleDateFormat("dd-MM-yyyy hh-mm-ss").format(new Date());
		String reportName = "NinjaReport-" + timeStamp + ".html";

		htmlReporter = new ExtentSparkReporter(".\\Reports\\" + reportName ); 
		reports      = new ExtentReports();
		reports.attachReporter(htmlReporter);

		//add Sysytem/Environment info into report
		reports.setSystemInfo("machine1", "testpc1"); // key,value pair
		reports.setSystemInfo("os", "win10");
		reports.setSystemInfo("user", "Pravin");
		reports.setSystemInfo("browser", readconfig.getBrowser());

		//configuration to change look and feel
		htmlReporter.config().setDocumentTitle("Extent Report Demo1");
		htmlReporter.config().setReportName("Pravin's Extent Report");
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'" );
	}



	public void onStart(ITestContext Result)
	{
		configureReport();
		System.out.println("on Start method invoked");
	}

	public void onFinish (ITestContext Result)
	{
		System.out.println("on Finish method invoked");
		reports.flush();   //IT IS MANDATORY TO GENERATE REPORTS
	}

	public void onTestFailure (ITestResult Result)
	{
		System.out.println("Name of test method failed :" +Result.getName() );

		test = reports.createTest(Result.getName());  //to create entry in html report its mandatory
		test.log(Status.FAIL, MarkupHelper.createLabel("Name of test case failed :"+ Result.getName() + " :FAILED", ExtentColor.RED));
		//test.fail(result.getThrowable());

		//to add screenshot in report

		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy hh-mm-ss");

		//String ScreenshotPath1=System.getProperty("user.dir") + "\\Screenshots\\" + sdf.format(d) + Result.getName() + ".png";
		String ScreenshotPath=".\\Screenshots\\" + sdf.format(d) + Result.getName() + ".png";

		File screnshotFile =new File(ScreenshotPath);

		if(screnshotFile.exists())
		{
			test.fail("Captured screenshot is below :" + test.addScreenCaptureFromPath(ScreenshotPath));
		}

		//to capture screenshot we write code in base class


	}

	public void onTestSkipped (ITestResult Result)
	{
		System.out.println("Name of test method skipped :" +Result.getName() );

		test = reports.createTest(Result.getName()); 
		test.log(Status.SKIP, MarkupHelper.createLabel("Name of test case skipped :"+ Result.getName() + " :SKIPPED", ExtentColor.YELLOW));

		
	}

	public void onTestPassed (ITestResult Result)
	{
		System.out.println("Name of test method Passed :" +Result.getName() );

		test = reports.createTest(Result.getName()); 
		test.log(Status.PASS, MarkupHelper.createLabel("Name of test case Passed :"+ Result.getName() + " :PASSED", ExtentColor.GREEN));

		
	}

	public void onTestStart(ITestResult Result)
	{
		System.out.println("Name of the method started :" + Result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult Result)
	{

	}



	@AfterTest
	public void tearDown()
	{
		reports.flush();
	}

}
