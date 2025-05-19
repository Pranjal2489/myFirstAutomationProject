import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RahulShettyMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Coimbatore (CJB)']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("//body[1]/form[1]/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[3]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
		
//		calendar
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='14']")).click();
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='23']")).click();
		
//		static dropdown
		WebElement staticDropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByValue("AED");
		
	}

}
