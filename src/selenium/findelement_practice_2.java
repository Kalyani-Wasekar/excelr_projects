package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelement_practice_2 {

	public static void main(String[] args) {
		// Q. Do check the checkbox for the above given page-link.
		WebDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/login");
		
	    WebElement checkbox=driver.findElement(By.name("remember"));
	    checkbox.click();
	    }

}
