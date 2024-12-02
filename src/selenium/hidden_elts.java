package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden_elts {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement show=driver.findElement(By.id("show-textbox"));
		show.click();
		WebElement hide=driver.findElement(By.id("hide-textbox"));
		hide.click();
		
		/*
		 * WebElement txtbox=driver.findElement(By.name("show-hide"));
		 * txtbox.sendKeys("hello"); System.out.println(txtbox.getText());
		 * 
		 */
	// ((As we unable to get retrieve the data from the hidden elements.
		// so we need to this "JavascriptExecutor))"
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//send values
		js.executeScript("document.getElementById('displayed-text').Value='Excelr';");
		String text=(String)js.executeScript("return document.getElementById('displayed-text').Value");
		System.out.println(text);
		
		
		

	}

}
