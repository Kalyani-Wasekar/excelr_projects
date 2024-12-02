package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_class {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		//actions class--keyboard or mouse operations
				//mouse operations--right click,double click,drag and drop,hover over
		        WebDriver driver = new ChromeDriver();
				driver.get("https://demoqa.com/buttons");
				
				WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
				Actions act=new Actions(driver);
				act.contextClick(rightclick).perform();
				
				WebElement doubleclick=driver.findElement(By.id("doubleClickBtn"));
				act.doubleClick(doubleclick).perform();
		
	}

}
