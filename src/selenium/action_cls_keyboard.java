package selenium;

import java.io.File; 

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class action_cls_keyboard {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		// to scroll down the given web page.
		for(int i=0;i<=8;i++) {
		act.keyDown(Keys.ARROW_DOWN);
		act.build().perform();
		act.keyUp(Keys.ARROW_DOWN).build().perform();
		}
		WebElement cur_address=driver.findElement(By.id("currentAddress"));
		cur_address.sendKeys("Excelr");
		
		
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
		//JPEG,JPG,BMP,PNG
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file,new File("D:\\Testing_Training_(excelr)\\mate_gene_eclipse\\screenshot\\myimage.jpeg")); // copy to local.
	}

}
