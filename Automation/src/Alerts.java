import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
//		to click on click me button
		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		
//		script to give when it is a alert
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		simpleAlert.accept();
		
//		to click on confirm me button
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		
		Thread.sleep(2000);
		simpleAlert.accept();
		
//		to click on prompt button
		driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		
		Thread.sleep(2000);
		simpleAlert.sendKeys("Hello my name is Pranjal");
		Thread.sleep(2000);
		simpleAlert.accept();
		}

}
