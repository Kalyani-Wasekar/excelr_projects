package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_demo_2 {

	public static void main(String[] args) {
		// tagname, css selector,xpath,classname
		
		 WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement heading=driver.findElement(By.className("_8eso"));
			String title=heading.getText();
			System.out.println(title);
			WebElement signup=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
			signup.click();
		//xpath--	xml path--is htmlpath of the element. 

	}

}
