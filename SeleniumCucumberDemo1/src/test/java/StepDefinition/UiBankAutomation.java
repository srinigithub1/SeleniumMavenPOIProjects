package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;

public class UiBankAutomation {
	
	public static WebDriver driver;
	public static String AppTitle="UiBank";

	@Given("I want to launch UiBank app in Chrome browser")
	public void i_want_to_launch_ui_bank_app_in_chrome_browser() {
		// Write code here that turns the phrase above into concrete actions
				  
	  	System.out.println("opening broswer");
		System.setProperty("webdriver.chrome.driver", "E:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://uibank.uipath.com/");
		
	}

	@Given("Ensure Login page hasbeen displayed")
	public void ensure_login_page_hasbeen_displayed() {
		// Write code here that turns the phrase above into concrete actions
		
		System.out.println("Implement logic for verify Launch app ");
		
		Assert.assertEquals(AppTitle, driver.getTitle());
		
		
	}

	@When("As a End User valid Enter username in Uibank App")
	public void as_a_end_user_valid_enter_username_in_uibank_app() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Implement logic for verify Launch app ");
		
	}

	@When("As a End User valid Enter Password in Uibank App")
	public void as_a_end_user_valid_enter_password_in_uibank_app() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Implement logic for verify Launch app ");
	}

	@When("Click Login button in Uibank applicaiton")
	public void click_login_button_in_uibank_applicaiton() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Implement logic for verify Launch app ");
		
		
	}

	@Then("Verify Account Summary page in UiBankApp")
	public void verify_account_summary_page_in_ui_bank_app() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Implement logic for verify Launch app ");
		
	}

	@Then("Verify Logout button in Uibank Ac Summary Page")
	public void verify_logout_button_in_uibank_ac_summary_page() {
		// Write code here that turns the phrase above into concrete actions
		
		System.out.println("Implement logic for verify Launch app ");
		
	}

	@When("As a End User invalid Enter username in Uibank App")
	public void as_a_end_user_invalid_enter_username_in_uibank_app() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Implement logic for verify Launch app ");
		
	}

	@When("As a End User invalid Enter Password in Uibank App")
	public void as_a_end_user_invalid_enter_password_in_uibank_app() {
		// Write code here that turns the phrase above into concrete actions
		
		System.out.println("Implement logic for verify Launch app ");
		
	}

	@Then("Verify Error Mesage in UiBankApp")
	public void verify_error_mesage_in_ui_bank_app() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Implement logic for verify Launch app ");
		
	}
	
	@Then("close Browser")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.close();
	}

	@When("As a End User invalid Enter Empty value of username in Uibank App")
	public void as_a_end_user_invalid_enter_empty_value_of_username_in_uibank_app() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Implement logic for verify Launch app ");
	}

	@When("As a End User invalid Enter Empty value of Password in Uibank App")
	public void as_a_end_user_invalid_enter_empty_value_of_password_in_uibank_app() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Implement logic for verify Launch app ");
	}

	@Then("Verify Error Mesage of LoginFailed in UiBankApp")
	public void verify_error_mesage_of_login_failed_in_ui_bank_app() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Implement logic for verify Launch app ");
	}


}
