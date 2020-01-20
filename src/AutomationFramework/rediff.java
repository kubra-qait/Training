package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {
	
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kubraabbas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver; 
		 driver = new ChromeDriver();
		 driver.get("https://www.rediff.com/");
		 driver.findElement(By.cssSelector("a.signin")).click();
		 driver.findElement(By.cssSelector("#login1")).sendKeys("Kubra");
		 driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Kubra123");
		 driver.findElement(By.cssSelector("input[name='proceed']")).click();
	//	 driver.close();
	}
	

}
