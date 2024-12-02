package All_Java_Projects;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo123 {

    public static void main(String[] args) {
    	ChromeDriver driver = new ChromeDriver();
    	driver.get("https://www.google.com/");
    	driver.manage().window().maximize();
    	String Title=driver.getTitle();
    	System.out.println(Title);
    	System.out.println(driver.getPageSource());
    	//driver.quit();
    	
    	// pagesource -- source code for page

    	 
					
					
					
					
						
					
			
				}
				
				
			}
		    
			
			
		
    


