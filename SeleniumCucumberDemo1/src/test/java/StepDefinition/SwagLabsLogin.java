package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SwagLabsLogin {

	public static WebDriver driver;
	

	@Given("Launch app in chrome Browswer")
	public static void launch_app_in_chrome_browswer() {
	    // Write code here that turns the phrase above into concrete actions
	
		  
	  	System.out.println("opening broswer");
		System.setProperty("webdriver.chrome.driver", "C:\\Sleniumsoftwares\\chromedriver107\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@Given("Home page should be opened")
	public void home_page_should_be_opened() {
		driver.get("https://www.saucedemo.com/");
	    // Write code here that turns the phrase above into concrete actions
	
		String title=driver.getTitle();
		Assert.assertEquals("Swag Labs", title);
		
	}

	@When("i Enter username")
	public void i_enter_username() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	}

	@When("Enter passwrod")
	public void enter_passwrod() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("standard_user");
	}

	@When("click login link")
	public void click_login_link() {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.id("login-button")).click();
	}

	@Then("I validate products page")
	public void i_validate_products_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  Thread.sleep(4000);
	}

	@Then("click logout button")
	public void click_logout_button() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("check HOme page")
	public void check_h_ome_page() {
	    // Write code here that turns the phrase above into concrete actions
	
	}
	

	@Then("close App")
	public void close_browser() {
		driver.close();
	}
	
}
