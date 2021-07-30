package parallel.ParallelTest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
public class BaseClass {
	
	protected static ThreadLocal<ChromeDriver> driver = new ThreadLocal<>();
	
	@BeforeMethod
	public void beforeMethod1() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\GEO\\Selenium Sample\\ParallelTest\\chromedriver.exe");
		driver.set(new ChromeDriver());
	
	}
	
	public WebDriver getDriver(){
		return driver.get();
	}
	
	@AfterMethod
	
	public void tearDown(){
		getDriver().quit();
		System.out.println("Ending Chrome |"+ Thread.currentThread().getId());
	}
/*	public void beforeMethod1() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\GEO\\Selenium Sample\\ParallelTest\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(3000);
	//	driver.manage().deleteAllCookies();
		System.out.println("Starting Chrome |"+ Thread.currentThread().getId());
		String url1 = "https://demo.nopcommerce.com/";
		driver.get(url1);
	Thread.sleep(1000);
	}

	@Test
	public void bMethod1() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\GEO\\Selenium Sample\\ParallelTest\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		System.out.println("Starting Chrome |"+ Thread.currentThread().getId());
		String url1 = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url1);
	Thread.sleep(1000);
	}

	
		
	

	*/
}
