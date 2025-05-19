import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
//		To get URL
		driver.get("https://ultimateqa.com/");
//		to give time allocation
		Thread.sleep(2000);
//		to navigate URL
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
//		to navigate back to first URL
		driver.navigate().back();
		Thread.sleep(2000);
//		To navigate to 2nd URL we use forward() method
		driver.navigate().forward();
		Thread.sleep(2000);
	}

}
