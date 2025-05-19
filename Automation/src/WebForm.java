import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.findElement(By.xpath("//input[@id='my-text-id']")).sendKeys("Pranjal");
		driver.findElement(By.xpath("//input[@name='my-password']")).sendKeys("Pranjal1234");
		driver.findElement(By.xpath("//textarea[@name='my-textarea']")).sendKeys("This is a text field that that is to be filled by the user. Thankyou for the input!");
		WebElement sddElement= driver.findElement(By.xpath("//select[@name='my-select']"));
		Select dropdown=new Select(sddElement);
		dropdown.selectByIndex(1);
		
		driver.findElement(By.xpath("//input[@placeholder='Type to search...']")).sendKeys("San Francisco");
		driver.findElement(By.xpath("//input[@id='my-check-1']")).click();
		driver.findElement(By.xpath("//input[@id='my-check-2']")).click();
		driver.findElement(By.xpath("//input[@id='my-radio-2']")).click();
		
		driver.findElement(By.name("my-colors")).sendKeys("#211FAF");
		driver.findElement(By.name("my-file")).sendKeys("C:\\Users\\hp\\Downloads\\CertificateOfCompletion_Programming Foundations Databases.pdf");
		driver.findElement(By.xpath("//input[@name='my-date']")).click();
		driver.findElement(By.xpath("//td[normalize-space()='29']")).click(); 
		WebElement sliderElement= driver.findElement(By.name("my-range"));
		Actions action= new Actions(driver);
		action.clickAndHold(sliderElement).moveByOffset(150, 0).release().perform();
		
//		driver.findElement(By.linkText("Return to index")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		driver.findElement(By.).click();
		
//		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		
	}

}
