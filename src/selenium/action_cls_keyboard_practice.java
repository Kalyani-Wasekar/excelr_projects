package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_cls_keyboard_practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		WebElement first_name = driver.findElement(By.id("firstname"));
		first_name.sendKeys("Ramesh");
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("A");
		act.build().perform();
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("C");
		act.build().perform();
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		act.keyDown(Keys.TAB);
		act.build().perform();
		act.keyUp(Keys.TAB);
		act.build().perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("V");
		act.build().perform();
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
	
	    act.keyDown(Keys.PAGE_DOWN);
		act.build().perform();
		act.keyUp(Keys.PAGE_DOWN).build().perform();
			
		WebElement create_btn = driver.findElement(By.cssSelector("button[title='Create an Account']"));
		Thread.sleep(2000);
		create_btn.click();
		Thread.sleep(2000);
	}

}
