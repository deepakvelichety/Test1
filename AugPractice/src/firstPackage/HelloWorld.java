package firstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
	
public static void main(String[]args) {
	

System.setProperty("webdriver.chrome.driver", "/Users/Deepu/Downloads/chromedriver");

WebDriver driver = new ChromeDriver();

driver.get("https://google.com");

	
	
	
}

}
