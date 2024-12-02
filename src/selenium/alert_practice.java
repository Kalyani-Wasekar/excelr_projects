package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement first_alert= driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button"));
		first_alert.click();
		Alert first= driver.switchTo().alert();
		first.accept();
		WebElement alert_with_ok= driver.findElement(By.linkText("Alert with OK & Cancel"));
		alert_with_ok.click();
		//Alert a= driver.switchTo().alert();
		//first.accept();
		WebElement conform_box_alert= driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button"));
		conform_box_alert.click();
		Alert conform= driver.switchTo().alert();
		conform.dismiss();
		WebElement alert_with_text= driver.findElement(By.linkText("Alert with Textbox"));
		alert_with_text.click();
		WebElement alert_prompt_box= driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button"));
		alert_prompt_box.click();
		Alert prompt= driver.switchTo().alert();
		prompt.sendKeys("selenium");
		prompt.accept();
	


	}

}
