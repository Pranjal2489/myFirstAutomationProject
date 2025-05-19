import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(2000);
//		driver.findElement(By.linkText("A/B Testing")).click();
		driver.findElement(By.partialLinkText("Testing")).click();

	}

}
