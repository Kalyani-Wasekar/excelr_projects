package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice_task {

	public static void main(String[] args) {
		
		
				 WebDriver driver = new ChromeDriver();
				 driver.get("https://www.letskodeit.com/practice");
				 WebElement 
				 BMWradio=driver.findElement(By.cssSelector("input[value='bmw']"));
				 
				 BMWradio.click();

				    if(BMWradio.isSelected()) {
				    	System.out.println("radio is selected");
				    }
				    else {
				    	System.out.println("radio is not selected");
				    }
				   
				    
			WebElement multiselect=driver.findElement(By.id("multiple-select-example"));
				 
				Select multi=new Select(multiselect);
				List<WebElement> options=multi.getOptions();
				
				for(WebElement element:options) {
					System.out.println(element.getText());
				}
				
				if(multi.isMultiple()) {
					System.out.println("multi select is enabled");
					multi.selectByVisibleText("Apple");
					multi.selectByVisibleText("Orange");
					
				}
				else {
					System.out.println("multiselect is disabled");
				}
				
		
					// dropdown
					WebElement 
					dropdown=driver.findElement(By.id("carselect"));
					Select cars=new Select(dropdown);
					
					cars.selectByVisibleText("Benz");
					
					
					
					
				}
				
				
				 

			}

		


	


