package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_practice {

	public static void main(String[] args) {
		// Q. put the userame and pass on the given page only and only by using xpath method.
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
         WebElement username= driver.findElement(By.xpath("//input[contains(@id,'username')]"));
         username.sendKeys("Admin");
         WebElement password= driver.findElement(By.xpath("//input[starts-with(@id,'pass')]"));
         password.sendKeys("Admin123");
         
         driver.close();
	}

}
