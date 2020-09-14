package selenium_learning.selenium_learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		 WebDriverManager.edgedriver().setup();
	     WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']")).click();
		 
		 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[1]/input")).sendKeys("Josh");
		 
		 Select select = new Select(driver.findElement(By.xpath("//*[@id=\'searchSystemUser_userType\']")));
		 select.selectByVisibleText("Admin");
		 
		 driver.findElement(By.xpath("//*[@id=\'searchSystemUser_employeeName_empName\']")).sendKeys("john");
		 
		 Select select1 = new Select(driver.findElement(By.xpath("//*[@id=\'searchSystemUser_status\']")));
		 select1.selectByValue("1");
		 
		 
	}

}
