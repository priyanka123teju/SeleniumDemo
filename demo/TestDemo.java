import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDemo {
@Test
public void demo(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\workspace\\DemoLaunch\\software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(2000);
}

}
