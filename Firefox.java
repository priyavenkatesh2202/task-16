package task16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class Firefox {

	public static void main(String[] args) {
		// open firefox browser
		
		WebDriver driver = new FirefoxDriver();
		
		// navigate to the url
		driver.get("http://google.com");
		
		// maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		// to print the URL of the current page 
		
		String strUr  = driver.getCurrentUrl(); 
	
		System.out.println("current Url is: "+ strUr);
		
		// to reload the page
		driver.navigate().refresh();
		
		//close the drive
		
		driver.close();
	}

}


