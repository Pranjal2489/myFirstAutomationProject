import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Netflix_CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://www.netflix.com/in/login");
//		implicit wait to prevent exception of NoSuchElementException
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@id=':r0:']")).sendKeys("pranjal@gmail.com");
		driver.findElement(By.xpath("//input[@id=':r3:']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		System.out.println(driver.findElement(By.cssSelector("div.layout-container_styles__12wd1go1g")).getText()); 
	
		//class="layout-container_styles__12wd1go1g"
	}

}
