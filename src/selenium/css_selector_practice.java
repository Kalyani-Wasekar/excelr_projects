package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
  public class css_selector_practice {
    public static void main(String[] args) {

WebDriver blaze = new ChromeDriver();
blaze.get("https://blazedemo.com/login");
WebElement username= blaze.findElement(By.cssSelector("#email"));
username.sendKeys("5689856hfdudhgu");
WebElement password=blaze.findElement(By.cssSelector("input[type='password']"));
password.sendKeys ("768737985587");

    }
  }
