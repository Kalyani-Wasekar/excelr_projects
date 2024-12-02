package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class webelemt_commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		WebElement email_txt=driver.findElement(By.name("email"));
		
		Dimension emaildimension=email_txt.getSize();
		System.out.println("width:"+emaildimension.width);
		System.out.println("height:"+emaildimension.height);
		
        // if we want to check presence and enablement of elts.
		if(email_txt.isDisplayed() && email_txt.isEnabled()	) {
			System.out.println("email txt box is displayed & enabled to the user");
		}	
		else
		{
			System.out.println("email txt box is not displayed & enabled to the user");
		}

		WebElement password=driver.findElement(By.id("pass"));
		//if we want to find the tag name of any element.
		String passwordtag=password.getTagName();
		System.out.println(passwordtag);
		
		WebElement login=driver.findElement(By.name("login")); 
		//if we want to find the inner text of any webelement.
		String logintxt=login.getText();
		System.out.println(logintxt);
		String loginattribute=login.getAttribute("id");
		System.out.println(loginattribute);
		
		String logincss=login.getCssValue("background-color");
		System.out.println(logincss);
		
		String hexcolour=Color.fromString(logincss).asHex();
		System.out.println(hexcolour);
		// we can confirm the hexcode also.
		if(hexcolour.equals("#1877f2")) {
			System.out.println("login button color is as per the req");
		}
		else {
			System.out.println("login button color is not as per the req");
		}
		

	}

}
