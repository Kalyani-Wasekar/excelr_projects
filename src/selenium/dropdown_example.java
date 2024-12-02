package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_example {

	public static void main(String[] args) {
	//dropdown---range of options to select
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/r.php");
		 
		 WebElement Birthdate=driver.findElement(By.name("birthday_day"));
		 
		 Select date=new Select(Birthdate);
		 // sleect by value, select by index, select by visible text
		 
		 date.selectByIndex(14);
		 
		 WebElement birthmonth=driver.findElement(By.name("birthday_month"));
		 
		 Select month=new Select(birthmonth);
		 month.selectByVisibleText("May");
	     
	}

}
