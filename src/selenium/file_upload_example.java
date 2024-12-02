package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_upload_example {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://xndev.com/display-image/");
		driver.manage().window().maximize();
		// NOTE :- file upload only if there tag name is "input".
		WebElement upload=driver.findElement(By.cssSelector("input[type='file']"));
		upload.sendKeys("C:\\Users\\kalya\\OneDrive\\Pictures\\Screenshots\\Screenshot (1385).png");
	}

}
