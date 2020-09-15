package selenium_learning.selenium_learning;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeSnapShot {

	public static void main(String[] args) throws IOException {
	
    	 WebDriverManager.edgedriver().setup();
	     WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("https://filebin.net/");

         TakesScreenshot ts =(TakesScreenshot)driver;
		 
         File source = ts.getScreenshotAs(OutputType.FILE);
		 
		 FileUtils.copyFile(source,new File(("src/test/java/screenshots/filebin.png")));


	}

}
