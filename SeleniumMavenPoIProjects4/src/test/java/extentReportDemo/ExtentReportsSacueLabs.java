package extentReportDemo;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;

import org.testng.SkipException;
import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsSacueLabs {
	public WebDriver driver;
	public ExtentSparkReporter spark;
	public ExtentReports extent;
	public ExtentTest logger;

	@BeforeTest
	public void startReport() {
		// Create an object of Extent Reports
		extent = new ExtentReports();

		spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/SwagLabsExtentReport.html");
		extent.attachReporter(spark);
		extent.setSystemInfo("Host Name", "Deloitte - Testing Batch");
		extent.setSystemInfo("Environment", "Production");
		extent.setSystemInfo("User Name", "srinivasarao");
		spark.config().setDocumentTitle("Swag Labs - Regression Testing ");
		// Name of the report
		spark.config().setReportName("Swag Labs - Verifying Login page ");
		// Dark Theme
		spark.config().setTheme(Theme.STANDARD);
	}

//This method is to capture the screenshot and return the path of the screenshot.
	public static String getScreenShot(WebDriver driver, String screenshotName) throws IOException {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
// after execution, you could see a folder "FailedTestsScreenshots" under src folder
		String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Sleniumsoftwares\\chromedriver107\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@Test
	public void verifyTitle() {
		logger = extent.createTest("To verify SwagLabs Title");
		Assert.assertEquals(driver.getTitle(), "Swag Labs123");
	}

	@Test
	public void verifyusername() throws InterruptedException {
		logger = extent.createTest("To verify UserName field displayed in the app");
		Thread.sleep(2000);
		boolean img = driver.findElement(By.id("user-name")).isDisplayed();
		if(img) {
		logger.createNode("UserName Input Field is Present");
		Assert.assertTrue(img);
		logger.createNode("Test case - Success");
		
		}else {
		logger.createNode("UserName Input Field is not Present");
		Assert.assertFalse(img);
		logger.createNode("Test case - Failed");
		}
	}
	
	@Test
	public void verifyPassword() throws InterruptedException {
		logger = extent.createTest("To verify Passwrod filed present in the app");
		Thread.sleep(2000);
		boolean img =  driver.findElement(By.id("password123")).isDisplayed();
		if(img) {
		logger.createNode("passwrod Input Field is Present");
		Assert.assertTrue(img);
		}else {
		logger.createNode("Password Input Field is not Present");
		Assert.assertFalse(img);
		}
	}
	
	@Test
	public void VerifyLoginButton() throws InterruptedException {
		logger = extent.createTest("To verify Login Button present in the application");
		Thread.sleep(2000);
		boolean img = driver.findElement(By.xpath("//*[@id=\"login-button\"]")).isDisplayed();
		if(img) {
		logger.createNode("Login buttion is Present");
		Assert.assertTrue(img);
		}else {
		logger.createNode("Login buttion is not Present");
		Assert.assertFalse(img);
		}
	}
	
	@Test
	public void VefifyLogin() throws InterruptedException {
		logger = extent.createTest("To verify Login Functionality of the Swag Labs app");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		boolean img = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed();
		if(img) {
		logger.createNode("product page is Present");
		Assert.assertTrue(img);
		}else {
		logger.createNode("products page is not Present");
		Assert.assertFalse(img);
		}
		
	}
	
	
	
	

	@AfterMethod
	public void getResult(ITestResult result) throws Exception {
		if (result.getStatus() == ITestResult.FAILURE) {
//MarkupHelper is used to display the output in different colors
			logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
//To capture screenshot path and store the path of the screenshot in the string "screenshotPath"
//We do pass the path captured by this method in to the extent reports using "logger.addScreenCapture" method.
//String Scrnshot=TakeScreenshot.captuerScreenshot(driver,"TestCaseFailed");
			String screenshotPath = getScreenShot(driver, result.getName());
//To add it in the extent report
			logger.fail("Test Case Failed Snapshot is below " + logger.addScreenCaptureFromPath(screenshotPath));
		} else if (result.getStatus() == ITestResult.SKIP) {
			logger.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(Status.PASS,
					MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
		}
		driver.quit();
	}

	@AfterTest
	public void endReport() {
		extent.flush();
	}
}
