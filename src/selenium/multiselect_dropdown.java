package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselect_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/select-menu");
		 
		 WebElement multiselect=driver.findElement(By.name("cars"));
		 
		Select multi=new Select(multiselect);
		List<WebElement> options=multi.getOptions();
		
		for(WebElement element:options) {
			System.out.println(element.getText());
		}
		
		if(multi.isMultiple()) {
			System.out.println("multi select is enabled");
			multi.selectByVisibleText("Opel");
			multi.selectByVisibleText("Audi");
			
		}
		else {
			System.out.println("multiselect is disabled");
		}
		
List<WebElement> options_selected=multi.getAllSelectedOptions();
		
		for(WebElement element:options_selected) {
			System.out.println("selected element"+element.getText());
		}
		
		multi.deselectByVisibleText("Audi");
		
List<WebElement> options_deselected=multi.getAllSelectedOptions();
		
		for(WebElement element:options_deselected) {
			System.out.println("selected element"+element.getText());
		}
		
		
		 driver.close();

	}

}
