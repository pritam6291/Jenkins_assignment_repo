package jenkinsMavenIntegration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTestCase {
	
	
	
	@Parameters({"browser"})
	@Test
	public void lauchBrowser(@Optional("Chrome")String browser)
	{
		WebDriver driver=null;
		System.out.println("Launch browser is : " + browser);
		
		if(browser.contains("Chrome"))
		{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pritamghosh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		}
		
		else if(browser.contains("Firefox"))
		{System.setProperty("webdriver.chrome.driver","C:\\Users\\pritamghosh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
			
		}
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		Assert.assertTrue(driver.getTitle().contains("Google"),"Title match");
		
		driver.quit();
	}

}
