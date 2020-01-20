package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class toolsqa_locators {
	
	static WebDriver driver;
	
	public static void launchURL() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kubraabbas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
	}
	
	public static void acceptBtn() {
		WebElement acceptBtn = driver.findElement(By.id("cookie_action_close_header"));
		acceptBtn.click();
	}
	public static void radioBtnSelect() {
		WebElement femaleradioBtn = driver.findElement(By.xpath("//input[@value = 'Female']"));
		if (!femaleradioBtn.isSelected()) {
			femaleradioBtn.click();
		}
	}
	
	public static void yearsofExperience() {
		driver.findElement(By.id("exp-2")).click();
	}
	
	public static void profession() {
		driver.findElement(By.cssSelector("input[value = 'Automation Tester']")).click();
	}
	
	public static void automationTool() {
		driver.findElement(By.cssSelector("input[id = 'tool-1']")).click();
	}
	
	public static void dropdownContinents() {
		Select dropdownContinents = new Select(driver.findElement(By.id("continents")));
		dropdownContinents.selectByIndex(1);
		dropdownContinents.selectByVisibleText("Africa");
		System.out.println(dropdownContinents.getOptions());
		
	}
	
	public static void dropdownContinents1() {
		
	}
}
	
	
	

