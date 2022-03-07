import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_launch1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./SOFTWARE/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
