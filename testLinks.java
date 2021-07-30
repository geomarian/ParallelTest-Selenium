package parallel.ParallelTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class testLinks extends BaseClass{
	
	
	@Test(priority=2)
	public void UserCredentials(){

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

	 WebElement loginButton = driver.findElement(By.id("btnLogin"));
	 loginButton.click();
	}
	@Test(priority=3)
	public void failed() {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("E:/GEO/Selenium Sample/screeshots"+"failshot_"+this.getClass().getName()+"_"+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
// add details
	@Test(priority=4)
	public void addDetails() throws InterruptedException{
		driver.findElement(By.xpath("//b[contains(text(),'My Info')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnEditCustom")).click();
		WebElement fname =  driver.findElement(By.id("personal_txtEmpFirstName"));
		if(fname.isEnabled()){
			fname.clear();
			fname.sendKeys("Geo");
		} else {
			System.out.println("No name added");
			}
		
		WebElement mname = driver.findElement(By.id("personal_txtEmpMiddleName"));
		if(mname.isEnabled()){
			mname.clear();
			mname.sendKeys("S");
		}
		else{
			System.out.println("No middle name");
		}
	}
}
