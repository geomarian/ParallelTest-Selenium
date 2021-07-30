package parallel.ParallelTest;

import org.testng.annotations.Test;

public class testLink2 extends BaseClass{
	
	@Test
	public void url1(){
		getDriver().get("https://demo.nopcommerce.com/");
		System.out.println("Thread number is = " + Thread.currentThread().getId());
	}
	
	@Test
	public void url2(){
		getDriver().get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Thread number is = " + Thread.currentThread().getId());
	}
	
	@Test
	public void url3(){
		getDriver().get("https://www.google.com/");
		System.out.println("Thread number is = " + Thread.currentThread().getId());
	}

}
