package TestNgPgms;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReports {
WebDriver driver;
String baseurl="https://www.facebook.com";
ExtentHtmlReporter reporter;//to create html file and customize EXTENT REPORTS 
ExtentTest test;//to generate logs in extent report
ExtentReports extent;//to create tests
@BeforeTest
public void btest()
{
	reporter =new ExtentHtmlReporter("./Reports/myreport1.html");
	reporter.config().setDocumentTitle("Automation Report");
	reporter.config().setReportName("Functional test");
	reporter.config().setTheme(Theme.DARK);
	
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Hostname","localhost");
	extent.setSystemInfo("OS","Windows10");
	extent.setSystemInfo("testername","reeja");
	driver =new ChromeDriver();
	
}
@BeforeMethod
public void setup()
{
	driver.get(baseurl);
}
@Test
public void fbtotleverification()
{
	//ExtentTestClass
	test=extent.createTest("fbtotleverification");
	String exp="facebook";
	String act=driver.getTitle();
	Assert.assertEquals(exp,act);
}
@Test
public void fbbuttontest()
{
	test=extent.createTest("fbbuttontest");
	String buttontest=driver.findElement(By.xpath("//button[@name=\"login\"]")).getText();
	Assert.assertEquals(buttontest,"register");
}
@Test
public void fblogotest()
{
	test=extent.createTest("fblogotest");
	boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div//div/div/div[1]/div/img")).isDisplayed();
	Assert.assertTrue(b);
}
@AfterMethod
public void browserclose(ITestResult result)
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		test.log(Status.FAIL,"test case failed is "+result.getName());
		test.log(Status.FAIL,"test case failed is "+result.getThrowable());
	}
	else if(result.getStatus()==ITestResult.SKIP)
	{
		test.log(Status.SKIP,"test case skipped is "+result.getName());
	}
	else if(result.getStatus()==ITestResult.SUCCESS)
	{
		test.log(Status.PASS,"test case passed is "+result.getName());
	}
}
@AfterMethod
public void teardown()
{
	extent.flush();//to write test info to reporter
}
}
