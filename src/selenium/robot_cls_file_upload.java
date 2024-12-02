package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robot_cls_file_upload {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		WebElement username= driver.findElement(By.cssSelector("input[name='username']"));
        username.sendKeys("Admin");
        
        WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
        password.sendKeys("admin123");
        
        WebElement login_btn= driver.findElement(By.cssSelector("button[type='submit']"));
        login_btn.click();
        
        WebElement info= driver.findElement(By.partialLinkText("My Info"));
        info.click();
        
        
        Actions act=new Actions(driver);
        act.keyDown(Keys.PAGE_DOWN);
		act.build().perform();
		act.keyUp(Keys.PAGE_DOWN).build().perform();
		
		WebElement add=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/button"));
		add.click();
		WebElement browse=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/div/div[1]"));
		browse.click();
		
		// to handle the external file uploading(when we do not have the tag name as "input").
		// we can use "Robot" class.
		Robot robo=new Robot();
		
		StringSelection st=new StringSelection("C:\\Users\\kalya\\OneDrive\\Pictures\\Screenshots\\Screenshot (1385).png");
		
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st, st);
        
        robo.setAutoDelay(2000);
        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.setAutoDelay(2000);
        robo.keyPress(KeyEvent.VK_V);
        robo.setAutoDelay(2000);
        
       robo.keyPress(KeyEvent.VK_ENTER);
       robo.keyRelease(KeyEvent.VK_CONTROL);
       robo.keyRelease(KeyEvent.VK_V);
       robo.keyRelease(KeyEvent.VK_ENTER);
       
       WebElement filename=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/div/div[2]"));
       String file_upload=filename.getText();
       String org_value="No file selected";
       if(file_upload.equals(org_value)) {
    	   System.out.println("file is not uploaded");
       }
       else {
    	   System.out.println("file is uploaded");
       }
        
	}

}
