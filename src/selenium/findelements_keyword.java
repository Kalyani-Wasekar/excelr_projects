package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements_keyword {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement element: links) {
			System.out.println(element.getText() + ":"+element.getAttribute("href"));
		}
		System.out.println("***********************************************");
		
		List<WebElement> textbox= driver.findElements(By.tagName("input"));
		System.out.println(textbox.size());
		for(WebElement element: textbox) {
			System.out.println(element.getText() + ":"+element.getAttribute("placeholder"));
		}
}
}
