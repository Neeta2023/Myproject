package basePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.Timeutils;

public class BaseclassRoicians {
	
	//browser info
	//url info
	//details to contact roicians
	
	public static Properties prop=new Properties();
	public static WebDriver driver;
	
	public BaseclassRoicians() {
		
		try {
		FileInputStream file=new FileInputStream("C:\\Users\\mohan\\eclipse-workspace\\RoiciansFramework\\src\\test\\java\\environmentvariable\\config.properties");
		prop.load(file);
		
		}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(IOException a) {
			a.printStackTrace();
		}
		
	}
	
	
	public static void initiate() {
		
		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("Firefox"))
		{
		
		System.setProperty("WebDriver.gecko.driver", "geckodriver.exe");
		driver=new FirefoxDriver();
		}
		
		else if(browsername.equals("chrome"))
		{
			System.setProperty("WebDriver.chrome.driver", "Chrome.exe");
			driver=new ChromeDriver();
		}
		
		String urlname=prop.getProperty("url");
		driver.get(urlname);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Timeutils.timepage));
	}
	
	public static void screenshots(String filename) {
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
		
		FileUtils.copyFile(file, new File("C:\\Users\\mohan\\eclipse-workspace\\RoiciansFramework\\src\\test\\java\\screenshot\\Screenshots" +filename+".jpg"));
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
		
	


