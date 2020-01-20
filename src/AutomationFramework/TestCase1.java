package AutomationFramework;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 {

	public static void main(String[] args) {
	//	String exePath = "C:\\Users\\kubraabbas\\Downloads\\chromedriver_win32.exe";
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kubraabbas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		 String url = "http://toolsqa.com/automation-practice-form/";
		 
		// driver.navigate().forward();
		 driver.get(url);
		// WebElement acceptButton = driver.findElement(By.id())
		 WebElement acceptBtn = driver.findElement(By.id("cookie_action_close_header"));
		 acceptBtn.click();
		 WebElement submitButton = driver.findElement(By.xpath("//button[@class='btn']"));
		 submitButton.click();
		 WebElement firstName = driver.findElement(By.name("firstname"));
		 firstName.sendKeys("Kubra");
		 driver.navigate().back();
		 driver.close();
	//	 WebElement closeBtn = driver.findElement(By.className("class=\"cp-overlay-close cp-image-close cp-inside-close cp-adjacent-right\""));
	//	 closeBtn.click();
	/*	 WebElement femaleradiobtn = driver.findElement(By.id("sex-1"));
		 Select oSelect = new Select(femaleradiobtn);
		 oSelect.selectByIndex(0);*/
		/* WebElement searchIcon = driver.findElement(By.className("icon_search"));
		 searchIcon.click();
		 WebElement searchText = driver.findElement(By.name("s"));
		 searchText.sendKeys("hello");
		 driver.navigate().to(url);
		 WebElement dismissIcon = driver.findElement(By.className("woocommerce-store-notice__dismiss-link"));
		 dismissIcon.click();
		 WebElement myAccount = driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
		 myAccount.click();
		 WebElement cart = driver.findElement(By.xpath("//i[@class='icon_bag_alt']"));
		 cart.click();*/
		

		// WebElement myWishlistIcon = driver.findElement(By.linkText("https://shop.demoqa.com/wishlist/"));
		// myWishlistIcon.click();
		 
			 
		 //driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		 /*driver.getTitle();
		 String title = driver.getTitle();
		 int titleLength = title.length();
		 System.out.println(title);
		 System.out.println(titleLength);
		 driver.getCurrentUrl();
		 String pageURL =  driver.getCurrentUrl();
		 System.out.println(pageURL);
		 if (pageURL.equals(url)) {
			 System.out.println("Correct site is launched");
		 }
			 else {
			 System.out.println("Correct site is not launched");
			 }
		 driver.getPageSource();
		 String pageSource = driver.getPageSource();
		 int pageSourceLength = pageSource.length();
		 System.out.println(pageSourceLength);
		 driver.close();
		 */
		 } 
	}


/*driver.get("https://qainfotech.com/");
driver.getTitle();
String Title = driver.getTitle();
System.out.println(Title);*/
//driver.getPageSource();
//String PageSource = driver.getPageSource();
//System.out.println(PageSource);
//driver.close();
//driver.quit();
//driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
//driver.findElement(By.id("New Browser Window")).click();