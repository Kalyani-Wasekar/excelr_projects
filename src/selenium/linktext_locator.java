package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext_locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		//(link text)--exclusively used on links, using full inner text of link---any element with 'a' tag
		//WebElement forgot=driver.findElement(By.linkText("Forgotten account?"));
		//(partial link text)- used with front or the last part of the link text from link.
		WebElement signup=driver.findElement(By.partialLinkText("Facebook"));
		System.out.println(signup);
		signup.click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
