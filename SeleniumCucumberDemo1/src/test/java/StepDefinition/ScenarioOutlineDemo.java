package StepDefinition;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ScenarioOutlineDemo {
	
	@Given("Open the Chrome and launch the Swaglabs App")
	public void open_the_chrome_and_launch_the_swaglabs_app() {
	    // Write code here that turns the phrase above into concrete actions
		
		Assert.assertTrue(true);
	   
	}

	@When("Enter the valid username{string}")
	public void enter_the_valid_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("the value of user name is: "+string);
		Assert.assertTrue(true);
	   
	}
	
	@When("Enter the valid password{string}")
	public void enter_the_valid_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("the value of password name is: "+string);
		Assert.assertTrue(true);
	   
	}

	@When("click Login Button")
	public void click_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(true);
	   
	}

	@Then("verify Products Page and user able to login successfully")
	public void verify_products_page_and_user_able_to_login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(true);
	  
	}

	@Then("Click Logout Button")
	public void click_logout_button() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(false);
	   
	}

	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(true);
	   
	}

	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(true);
	   
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String string1, String string2) {
	    // Write code here that turns the phrase above into concrete actions
//		
//		driver.findElement(By.id("log")).sendKeys(username); 	 
//	    driver.findElement(By.id("pwd")).sendKeys(password);
		
		System.out.println("we are using usern anme: "+string1);
		System.out.println("we are using usern anme: "+string2);
		
		Assert.assertTrue(true);
	   
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(true);
	   
	}


}
