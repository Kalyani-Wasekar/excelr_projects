package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class java_exceptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// java exception
		
		//EXCEPTIONS--checked and unchecked
				//checked:--shown or handelled by the compiler
				//io exception,interuppted,classnot found,file not found--
				//checked-- can be solved wjile writing your code in the compilation
				
				Thread.sleep(2000);
				
			//unchecked:occur afte ryou run the program
				//array index out of bound,arithmetic expe,null pointer
				
		int a=100;
		int b=0;
		System.out.println(a/b);

		
//selenium execptions
//no such element expection--common-page loading time is taking longer than usual//
		//invalid or wrong locator value
//invalid argument-- when you add wrong methods
		//.ElementClickInterceptedException- whne something or any ad id blocking your element
		//Unhandlled alert- when you donot handle alerts or popup
		//js exeception--js executor run the driver
		//element not interactable,element not visible-hidden
		//webdriver execption, stale element exeception--css changes made-no more found
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/select-menu");
		 
		 WebElement multiselect=driver.findElement(By.name("cars"));
		 
		 multiselect.click();
		
	}}