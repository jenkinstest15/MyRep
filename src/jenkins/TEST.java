package jenkins;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TEST {
	String text="Facebook - Log In or Sign Up";
	//Facebook - Log In or Sign Up
	@Test
	public void setup(){
		System.out.println("Error on intializing properties files");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		String exp=driver.getTitle();
		System.out.println(exp);
		//driver.manage().window().maximize();
		//driver.quit();
		Assert.assertEquals(exp, text);
		driver.quit();
		//Assert.assertTrue(false, "driver.getTitle().contains("se")");
		
		
	}

}
