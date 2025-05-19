import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Invoke_Edge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\Downloads\\edgedriver_win64");
	}

}
