package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nested_iframe_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		
		driver.switchTo().frame("frame1");
		WebElement tag=driver.findElement(By.xpath("/html/body/p"));
		driver.switchTo().frame(tag);
		System.out.println(tag.getText());
		

	}

}
