package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hover_over {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/menu/");
		WebElement main_menu=driver.findElement(By.linkText("Main Item 2"));
		Actions act=new Actions(driver);
act.moveToElement(main_menu).perform();

WebElement sub_menu=driver.findElement(By.linkText("SUB SUB LIST »"));
act.moveToElement(sub_menu).perform();
	}

}
