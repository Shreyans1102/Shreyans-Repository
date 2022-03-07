import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./SOFTWARE/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/");

	}

}
