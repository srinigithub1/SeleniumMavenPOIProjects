package window_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleFrames {

	 public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  	System.out.println("opening broswer");
		System.setProperty("webdriver.chrome.driver", "C:\\Sleniumsoftwares\\chromedriver107\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		int size = driver.findElements(By.tagName("iframe")).size();
		
		driver.switchTo().frame("frame2");
		
		String text_inside_frame=driver.findElement(By.id("sampleHeading")).getText();
System.out.println("the text inside frame is: "+ text_inside_frame);

		
driver.close();
	}

}
