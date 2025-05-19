import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		WebElement staticDropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		//		only whose tag name is select
		Select dropdown=new Select(staticDropdown);
//		1st method
//		dropdown.selectByIndex(0);
//		second method
//		dropdown.selectByVisibleText("USD");
//		Third method- check by inspect
		dropdown.selectByValue("AED");
		
	}

}
