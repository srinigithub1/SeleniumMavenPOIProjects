package window_frames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleWindow2 {

	 public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  	System.out.println("opening broswer");
		System.setProperty("webdriver.chrome.driver", "C:\\Sleniumsoftwares\\chromedriver107\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		 String MainWindow=driver.getWindowHandle();	
		
		driver.findElement(By.id("windowButton")).click();
		
		 Set<String> s1=driver.getWindowHandles();		
	        Iterator<String> i1=s1.iterator();		
	        		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                 
	                    // Switching to Child window
	                    driver.switchTo().window(ChildWindow);	                                                                                                           
	                    String string_inside_window=driver.findElement(By.id("sampleHeading")).getText();
	                    System.out.println("the value inside the child window is: "+string_inside_window);	
	                                 
				// Closing the Child Window.
	                        driver.close();		
	            }		
	        }		
	        // Switching to Parent window i.e Main Window.
	            driver.switchTo().window(MainWindow);
		
	            driver.quit();
	}

}
