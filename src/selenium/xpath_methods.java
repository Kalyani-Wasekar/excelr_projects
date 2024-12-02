package selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpath_methods {

	public static void main(String[] args) {
		//xpath contains--//tagname[contains(@attribute,'value')]// NOTE- partial values are allowed
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		//attributes---
		WebElement radio=driver.findElement(By.xpath("//input[contains(@value,'benz')]"));
		radio.click();
		
		// startswith function
		////tagname[starts-with(@attribute,'value')]
		//AND OR Operators--multiple elements with same attributes-"//input[(@value='honda'and @type='checkbox')]"
		WebElement checkbox=driver.findElement(By.xpath("//input[(@value='honda'and @type='checkbox')]"));
		checkbox.click();
		
		//text function--//tagname[text()='textvalue']
		WebElement text=driver.findElement(By.xpath("//h1[text()='Practice Page']"));
		System.out.println(text.getText());

        driver.close();

	}

}
