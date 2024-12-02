package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/droppable/");
			
			WebElement drag=driver.findElement(By.id("draggable"));
			
			WebElement drop=driver.findElement(By.id("droppable"));
			String before_drop=drop.getText();
			System.out.println(before_drop);
			Actions act=new Actions(driver);
			act.dragAndDrop(drag, drop).perform();
			
			String after_drop="Dropped!";
			if(!after_drop.equals(before_drop))
			{
				System.out.println("element is dropped");
			}
			else {
				System.out.println("drop failed");
			}
			
			
	}

}
