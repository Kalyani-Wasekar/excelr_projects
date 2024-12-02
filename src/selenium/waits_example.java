package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits_example {

	public static void main(String[] args) throws InterruptedException {
		
		//waits--implicit, explicit
		//implicit-condition less wait--applied to all the elements
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		
		WebElement timer_alert=driver.findElement(By.id("timerAlertButton"));
		timer_alert.click();
		
		//explicit wait- conditioned wait
		WebDriverWait explict_wait=new WebDriverWait(driver,Duration.ofSeconds(7));
		explict_wait.until(ExpectedConditions.alertIsPresent());
		
		Alert timer=driver.switchTo().alert();
		
		timer.accept();
		System.out.println("timer alert is handelled");
		
		
		
	}

}
