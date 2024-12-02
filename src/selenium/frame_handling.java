package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame_handling {

	public static void main(String[] args) {
		//Frame or IFrame
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.switchTo().frame("frame1");
		WebElement frametext=driver.findElement(By.id("sampleHeading"));
		System.out.println(frametext.getText());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		WebElement second_frametext=driver.findElement(By.id("sampleHeading"));
		System.out.println(second_frametext.getText());
	}
}
