package task16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoBlaze {

	public static void main(String[] args) {
		// open the chrome browser
		WebDriver driver = new ChromeDriver();
		
		
		// launch the url 
		driver.get("https://www.demoblaze.com/");

		
		// maximize the window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// to verify the title 
		WebElement ele = driver.findElement(By.className("navbar-brand"));
		
		boolean isDisplayed = ele.isDisplayed();
		
		// to print whether the title matches or not
		
		if (isDisplayed) {
		    System.out.println("Page landed on correct website");
		   
		} else {
		    System.out.println("Page not landed on correct website");
		    
		}
	}
}
		

		
		
		
		
		
		

	
