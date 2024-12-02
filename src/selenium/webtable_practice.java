package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable_practice {

	public static void main(String[] args) {
		// Q.Find the given text "Catalan" from the given page and print it also.
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
        WebElement lang=driver.findElement(By.xpath("//td[text()='Catalan']"));
       System.out.println(lang.getText()); 
      
	}

}
