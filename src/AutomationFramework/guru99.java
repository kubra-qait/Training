package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kubraabbas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver; 
		 driver = new ChromeDriver();
		 driver.get("http://demo.guru99.com/v1/");
		 driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("mngr242581");
		 driver.findElement(By.cssSelector("input[name= 'password']")).sendKeys("saqAmYm");
		 driver.findElement(By.name("btnLogin")).click();
		 driver.findElement(By.xpath("//a[text() = 'New Customer']")).click();
		 driver.findElement(By.cssSelector("input[name = 'name']")).click();
		 driver.findElement(By.cssSelector("textarea[name = 'addr']")).sendKeys("ABC" + Keys.ENTER + "DEF" + Keys.RETURN + "GHI");
		 System.out.println(driver.findElement(By.id("message")).getText());
		 driver.findElement(By.cssSelector("#dob")).sendKeys("24-11-1995");
		 driver.findElement(By.xpath("//input[@type = 'radio'][2]")).click();
		 driver.findElement(By.cssSelector("input[name = 'sub']")).click();
		 driver.switchTo().alert().dismiss();
		 
		 /*if (driver.findElement(By.xpath("//input[@type = 'radio'][1]")).isDisplayed()) {
		 System.out.println("True");
	 }
	 else {
		 System.out.println("False");
	 }
	 if (driver.findElement(By.xpath("//input[@type = 'radio'][1]")).isEnabled()) {
		 System.out.println("True");
	 }
	 else {
		 System.out.println("False");
	 }
	 
	 if (driver.findElement(By.xpath("//input[@type = 'radio'][1]")).isSelected()) {
		 System.out.println("True");
	 }
	 else {
		 System.out.println("False");
	 }*/
		 
		 
	}

}
