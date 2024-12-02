package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_btn_demo {

	public static void main(String[] args) {
	
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/r.php");
		 
		 WebElement maleradio=driver.findElement(By.cssSelector("input[value='2']"));
		 
		 maleradio.click();

		    if(maleradio.isSelected()) {
		    	System.out.println("radio is selected");
		    }
		    else {
		    	System.out.println("radio is not selected");
		    }
		    driver.close();
	
	}

}
