package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts_handle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//alerts- short message or information
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		WebElement simple_alert=driver.findElement(By.id("alertButton"));
		
		simple_alert.click();
		Thread.sleep(2000);
		Alert simple=driver.switchTo().alert();
		simple.accept();
		System.out.println("simple alert is handelled");
		WebElement confirmation=driver.findElement(By.id("confirmButton"));
		confirmation.click();
		Thread.sleep(2000);
		Alert confirm=driver.switchTo().alert();
		confirm.dismiss();
		System.out.println("confirmation alert is handelled");
		WebElement prompt_alert=driver.findElement(By.id("promtButton"));
		prompt_alert.click();
		Thread.sleep(2000);
		Alert prompt=driver.switchTo().alert();
		prompt.sendKeys("EXCELR");
		prompt.accept();
		System.out.println("prompt alert is handelled");
		
		
		
		
	}

}
