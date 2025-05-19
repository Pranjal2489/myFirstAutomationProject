import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerrts2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://demo.guru99.com/Agile_Project/Agi_V1/customer/Customerhomepage.php");
		driver.findElement(By.xpath("//a[normalize-space()='SEO']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Page-1")).click();
	}

}
