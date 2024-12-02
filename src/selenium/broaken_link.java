package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broaken_link {

	public static void main(String[] args) throws IOException {
		
        //broaken links---http response code-200
		//200-valid link
		//301/301---temp page redirect
		//404- not found
		//400- bad request, 401- unauthorised, 500-internal error.
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		int link_len=links.size();
		System.out.println(link_len);
		
		for(int i=0;i<link_len;i++) {
			WebElement element=links.get(i);
			String element_text=element.getText();
			String url=element.getAttribute("href");
			
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
