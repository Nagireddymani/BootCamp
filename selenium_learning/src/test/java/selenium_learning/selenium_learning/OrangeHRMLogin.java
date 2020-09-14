package selenium_learning.selenium_learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLogin {
		 public static void main(String[] args) throws InterruptedException {
		//	 WebDriverManager.chromedriver().setup();
			 WebDriverManager.edgedriver().setup();
		//	 WebDriver driver = new ChromeDriver();
		     WebDriver driver = new EdgeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			 driver.get("https://www.facebook.com/");
			 driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
			 Thread.sleep(3000);
			 driver.navigate().back();
			 System.out.println("the title of page is:" + driver.getTitle());
		 }
}
