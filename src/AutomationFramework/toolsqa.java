package AutomationFramework;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class toolsqa extends toolsqa_locators{

	public static void main(String[] args) {	
	 toolsqa_locators.launchURL(); // This method will launch the URL
	 toolsqa_locators.acceptBtn(); //This method clicks on Accept button
	 toolsqa_locators.radioBtnSelect(); // This method will select the Female radio button
	 toolsqa_locators.yearsofExperience(); //This method will select the radio button for Years of Experience
	 toolsqa_locators.profession(); //This method selects the profession as Automation Tester
	 toolsqa_locators.automationTool(); //This method selects the Automation tool as Selenium IDE
	 toolsqa_locators.dropdownContinents(); //This method selects the continent from the dropdown
	}

}
