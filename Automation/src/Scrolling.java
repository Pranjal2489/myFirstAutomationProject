import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
/*		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=1098233933490883637&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299208&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
//		Scrolling
		Actions action = new Actions(driver);
		// y axis scroll
		action.scrollByAmount(0, 2000).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -1000).perform();
*/		
		driver.get("https://www.thehorizontalway.com/");
//		Scrolling
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.scrollByAmount(1000, 0).perform();
		Thread.sleep(2000);
		action.scrollByAmount(-500,0).perform();
		
	}

}
