package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_demo {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com/login/");
		String navtitle=driver.getTitle();
		System.out.println(navtitle);
		Thread.sleep(2000);
		
		driver.navigate().back();
		String forwared_title=driver.getTitle();
		System.out.println(forwared_title);
		Thread.sleep(2000);
		
		driver.navigate().forward();
		driver.navigate().refresh();
		String back=driver.getTitle();
		System.out.println(back);
		
		/*
		 * driver.manage().window().maximize();//maximize the window size String
		 * Title=driver.getTitle(); System.out.println(Title);
		 * System.out.println(driver.getPageSource()); //pagesouce---source code
		 */		
		
		//driver.quit();
		//WEBELEMENT--SELENIUM USE THESE WEBELEMNTS TO INTERACT WITH WEBPAGE
		//buttons, textboxes, dropdowns, radio buttons, links,checkbox,images,
		//advanced-- webtables, alerts, popups, frame,
	
	}
}

