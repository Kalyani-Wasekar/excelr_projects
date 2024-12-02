package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelement_practice {

	public static void main(String[] args) {
	
      // Q. Find the no of buttons in the given above page and print its name also.
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		List<WebElement> btns =driver.findElements(By.tagName("button"));
		System.out.println(btns.size());
		
		for(WebElement element:btns) {
			System.out.println(element.getText()+ element.getAttribute("title"));
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
  
	
}
