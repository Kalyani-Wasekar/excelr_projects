package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class locators_practice {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement username_box =driver.findElement(By.id("user-name"));
		
		String username_attribute= username_box.getAttribute("placeholder");
		System.out.println(username_attribute);
		WebElement password_box =driver.findElement(By.id("password"));
		
		if(password_box.isDisplayed() && password_box.isEnabled()) {
			System.out.println("password text box is shown over there .");
		}
		else {
			System.out.println("password text box is not shown over there .");
		}

		WebElement login_btn = driver.findElement(By.id("login-button"));
		Dimension login_dim=login_btn.getSize();
		System.out.println("width:"+login_dim.width);
		System.out.println("height:"+login_dim.height);

		String login_btn_css = login_btn.getCssValue("background-color");
		System.out.println(login_btn_css);
		String login_hex = Color.fromString(login_btn_css).asHex();
		System.out.println(login_hex);
		String org_hex="#3ddc91";
		if(login_hex.equals(org_hex)) {
			System.out.println("yes, its matched with the given bg color of login btn. ");
		}
		else { 
			System.out.println("yes its not matched with the given bg color of login btn. ");
		}
       username_box.sendKeys("standard_user");
       password_box.sendKeys("secret_sauce");
       login_btn.click();
	
	}
}
	


