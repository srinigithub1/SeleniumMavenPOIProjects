package StepDefinition;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class MyTest {
	
	public static WebDriver driver;

	@Given("Open the Firefox and launch the application")
	public void open_the_firefox_and_launch_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("we are launching browser");
	//    System.setProperty("webdriver.chrome.driver", chromepath);
	//    driver=new ChromeDriver();
	}

	@When("Enter the Username and Password")
	public void enter_the_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	//	driver.get(appurl);
	
		System.out.println("Entering username");
		 System.out.println("Entering password");
		 
	}

	@Then("Reset the credential")
	public void reset_the_credential() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Click Reset Button");
	}
}
