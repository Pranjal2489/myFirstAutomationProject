import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
//		TO MAXMIZE window
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
//		to open new tab
		driver.switchTo().newWindow(WindowType.TAB);// or WindowType.WINDOW
		driver.get("https://www.saucedemo.com/v1/");
		
	}

}
