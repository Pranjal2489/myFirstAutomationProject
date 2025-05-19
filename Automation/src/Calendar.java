import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='14']")).click();
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='23']")).click();
		
	}

}
