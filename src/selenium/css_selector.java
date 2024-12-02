package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector {

	public static void main(String[] args) {
	
       //css selector-types you can use in selenium
		//id,class,attribute,sub string, inner string
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
	//id--	"tagname#id value" or "tagname[id='idvalue']" or "#idvalue"
		 
	WebElement username=driver.findElement(By.cssSelector("input#email"));
	username.sendKeys("abcdefgh");
	//WebElement password=driver.findElement(By.cssSelector("input[id='pass']"));
	// other attributes apart from id or class--"tagname[id='idvalue']"
	WebElement password=driver.findElement(By.cssSelector("input[placeholder='Password']"));
	password.sendKeys("123214354");
	
	//class---"tagname[id='idvalue']",,tagname.classvalue,.classvalue
	
	WebElement title=driver.findElement(By.cssSelector("._8eso"));
	String heading=title.getText();
	System.out.println(heading);
			
	//mutiple attributes--- id and placeholder-- tagname #idvalue [placeholder=value] 
	
	//substring-- tagname[attribute^=prefix value of string]-prefix value to be used
	//tagname[attribute$=suffix value]--suffix
	//tagname[attribute*=any mid value]--mid string
	
	WebElement Loginbtn=driver.findElement(By.cssSelector("button[id^='u_0_']"));
	Loginbtn.click();
	
	
	}

}
