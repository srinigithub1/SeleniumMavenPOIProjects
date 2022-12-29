package selenumJunitDemo;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelneiumJunitDemo {
	 private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		
		  
	  	System.out.println("opening broswer");
		System.setProperty("webdriver.chrome.driver", "C:\\Sleniumsoftwares\\chromedriver107\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		
		driver.close();
	}

	@Test
	public void test() {
		 driver.get("https://www.saucedemo.com/");
		    driver.manage().window().setSize(new Dimension(1280, 680));
		    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).click();
		    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys("standard_user");
		    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
		    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");
		    {
		      List<WebElement> elements = driver.findElements(By.cssSelector("*[data-test=\"login-button\"]"));
		      assert(elements.size() > 0);
		    }
		    driver.findElement(By.cssSelector("*[data-test=\"login-button\"]")).click();
		    {
		      List<WebElement> elements = driver.findElements(By.cssSelector("*[data-test=\"add-to-cart-sauce-labs-backpack\"]"));
		      assert(elements.size() > 0);
		    }
		    
		    Assert.assertTrue(true);
	}

}
