package AutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeFirefox {
	protected static WebDriver driver;
	static String browser = "Chrome";
	
	public static void main(String[] args) {
		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kubraabbas\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equals("Firefox"))
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\kubraabbas\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();	
		}	
	}
