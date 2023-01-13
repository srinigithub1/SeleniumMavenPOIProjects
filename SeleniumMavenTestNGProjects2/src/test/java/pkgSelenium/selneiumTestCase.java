package pkgSelenium;

import static org.junit.Assert.*;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class selneiumTestCase {
	
	private WebDriver driver;
	
	static String url_app="https://www.saucedemo.com/";

	@BeforeClass
	public void setUp() throws Exception {
		
		System.out.println("opening broswer");
		System.setProperty("webdriver.chrome.driver", "E:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@AfterClass
	public void tearDown() throws Exception {
		
		driver.quit();
		//driver.close();
	}

	@Test
	public void test() {
		driver.get(url_app);
		String title_app=driver.getTitle();
		System.out.println("the title of the page from app is: "+title_app);
		
		if(title_app.equals("Swag Labs")) {
			System.out.println("Application launched successfully");
			Assert.assertTrue(true);
		}else {
			System.out.println("Application Not launched , TC Failed");
			Assert.assertTrue(false);
		}
		
		
		//login-button
		
		WebElement WElement_login_button;
		
		
		
		//*[@id="login-button"]
		//using - xpath
		WElement_login_button=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		
		   
	    
		
		boolean checkloginbutton=WElement_login_button.isDisplayed();
		
		if(checkloginbutton) {
			System.out.println("Login page is opened succefully");
			
			// ener data into user name 
			
			
			List<WebElement> List_input=driver.findElements(By.tagName("input"));
			
			System.out.println("the no of input field in the page is "+List_input.size());
			
			driver.findElement(By.id("user-name")).clear();
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			WElement_login_button.click();
		}else {
			System.out.println("Login page is NOT opened succefully");
		}
		
	}

}
