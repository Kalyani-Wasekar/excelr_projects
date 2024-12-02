package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broaken_img_practice {

	public static void main(String[] args) throws IOException {
		//list out the broaken images from the page.
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		List<WebElement> img =driver.findElements(By.tagName("img"));

		int img_count=img.size();
		
		
		for(int i=0;i<img_count;i++) {
			WebElement element=img.get(i);
			String element_text=element.getText();
			String url=element.getAttribute("src");
			
			URL link=new URL(url);
			HttpURLConnection httpconnect=(HttpURLConnection)link.openConnection();
			httpconnect.connect();
			
			int status_code=httpconnect.getResponseCode();
			
			if(status_code>=400) {
				System.out.println(status_code + "  "+ link + ": "+ element_text + "   The link is broken");
			}
			else {
				System.out.println(status_code + "  "+ link + ": "+ element_text + "   The link is not broken");
			}
			
		}
		
		
	}

}
