package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_demo {

	public static void main(String[] args) throws InterruptedException {
		//Locators- to locate the web-elements or html elements.
		//there are 8 types of locators.
		//(name),(id),(link text), (partial link text),(classname),(css selector),(tagname),(xpath)
		//(findElement()) -it is one of the method to find the w-elements.
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement email_txt=driver.findElement(By.name("email"));	
		WebElement password=driver.findElement(By.id("pass"));
		Thread.sleep(2000);
		password.clear();
		password.sendKeys("abcdefg");
		
		WebElement login=driver.findElement(By.name("login")); 
		
		// login.click(); we can use it also.
		login.submit() ;// as it is "button" tag and also enclosed in form tag.
		
		 
	}

}
