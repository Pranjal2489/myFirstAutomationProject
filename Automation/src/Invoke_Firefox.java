import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Invoke_Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdrievr.firefox.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.36.0-win-aarch64");
	}

}
