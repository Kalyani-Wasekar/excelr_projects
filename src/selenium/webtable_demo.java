package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.get("https://cosmocode.io/automation-practice-webtable/");
		 WebElement check=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/article/div/div/table/tbody/tr[4]/td[1]/input"));
		 check.click();
		 
	
	}

}
