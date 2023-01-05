package selneiumTests;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
public class SauceLabAutomationTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
//    driver = new ChromeDriver();
//    js = (JavascriptExecutor) driver;
//    vars = new HashMap<String, Object>();
	  
	  	System.out.println("opening broswer");
		System.setProperty("webdriver.chrome.driver", "C:\\Sleniumsoftwares\\chromedriver107\\chromedriver.exe");
		driver=new ChromeDriver();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void sauceLabAutomation() {
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
    driver.findElement(By.cssSelector("*[data-test=\"add-to-cart-sauce-labs-backpack\"]")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("#inventory_container #inventory_container"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("#inventory_container #inventory_container"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("#inventory_container #inventory_container"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector("#inventory_container #inventory_container")).click();
    driver.findElement(By.cssSelector(".shopping_cart_badge")).click();
    driver.findElement(By.cssSelector("*[data-test=\"checkout\"]")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("*[data-test=\"firstName\"]"));
      Boolean isEditable = element.isEnabled() && element.getAttribute("readonly") == null;
      assertTrue(isEditable);
    }
    driver.findElement(By.cssSelector("*[data-test=\"firstName\"]")).sendKeys("ramu");
    driver.findElement(By.cssSelector("*[data-test=\"lastName\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"lastName\"]")).sendKeys("Jeevan");
    driver.findElement(By.cssSelector("*[data-test=\"postalCode\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"postalCode\"]")).sendKeys("234342");
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("*[data-test=\"continue\"]"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector("*[data-test=\"continue\"]")).click();
   // vars.put("OrederRef", driver.findElement(By.cssSelector(".summary_value_label:nth-child(2)")).getText());
    driver.findElement(By.cssSelector("*[data-test=\"finish\"]")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("*[data-test=\"back-to-products\"]"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector("*[data-test=\"back-to-products\"]")).click();
    driver.findElement(By.id("react-burger-menu-btn")).click();
    
    Actions objaction=new Actions(driver);
    
    WebElement logout_link=driver.findElement(By.id("logout_sidebar_link"));
    
    objaction.moveToElement(logout_link); 
    objaction.click();
    
   // driver.findElement(By.id("logout_sidebar_link")).click();
    driver.close();
  }
}
