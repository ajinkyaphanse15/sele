package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pra {

	public static void main(String[] args) {
   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chrome2//chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.unishivaji.ac.in/");
	}

}
