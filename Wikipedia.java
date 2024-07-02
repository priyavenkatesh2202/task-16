package task16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia {

	public static void main(String[] args) {
		// open chrome browser
		WebDriver driver = new ChromeDriver();

		// navigate to the link
		driver.get("https://www.wikipedia.org/");

		// maximizes the window
		driver.manage().window().maximize();

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// to search on the input field
		driver.findElement(By.id("searchInput")).click();
		// to search by entering the input on search field
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence ");
		
		driver.findElement(By.id("searchInput")).submit();
		
		// to click history section
		 driver.findElement(By.xpath("//span[contains(text(),'History')]")).click();
		  
		 // to get the title text in the console
		String title =  driver.findElement(By.id("History")).getText();
		System.out.println("The Title is: " + title);
		
				 
				
		
	}

}
