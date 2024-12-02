package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_1 {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		
		
//		Thread.sleep(2000);
		
		driver.navigate().to("https://phptravels.com/demo");
		String navtitle=driver.getTitle();
		System.out.println(navtitle);
		
		driver.navigate().back();
		String backtitle=driver.getTitle();
		System.out.println(backtitle);
		                    
//		driver.quit();

	}

}
