package testBase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class BaseClass {
	
	public WebDriver driver;
	public Logger logger;
	public Properties p;
	
	@BeforeClass
	 @Parameters({"browser"})
	public void setup(@Optional("chrome")String br) throws IOException {
		//Log every class
		
		try {
			logger = LogManager.getLogger(this.getClass());
			
			FileReader file = new FileReader("/Users/mariamsikandari/eclipse-workspace/Selenium/src/test/resources/config.properties");
			p = new Properties();
			p.load(file);
			
			
			switch(br.toLowerCase())
			{
			case "chrome" : driver = new ChromeDriver(); break;
			case "edge" : driver = new EdgeDriver(); break;
			default : logger.error("Test failed");return;
			}
			
			
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(p.getProperty("appUR"));
		
		
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@AfterClass
	public void tearDown() {
	driver.quit();	
	}

	

}
