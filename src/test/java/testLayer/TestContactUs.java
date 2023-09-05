package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePackage.BaseclassRoicians;
import pomPackage.PomcontactUs;
import testDataPackage.Excelsheet;

public class TestContactUs extends BaseclassRoicians {
	
	PomcontactUs log;
	
	public TestContactUs() {
		
		super();
	}
	
	@BeforeMethod
	public void initsetup() {
		
		initiate();
		log=new PomcontactUs();
		
		screenshots("contactus");
		
	}
	
	/*
	 * @DataProvider public Object[][] Details(){
	 * 
	 * Object result[][]=Excelsheet.readdata("Sheet1"); return result; }
	 */
	
	@Test
	public void contactdetails() {
		log.enterfname(prop.getProperty("firstname"));
		log.enterlname(prop.getProperty("lastname"));
		log.enteremail(prop.getProperty("mailid"));
		log.enterphone(prop.getProperty("phonenumber"));
		log.entermsg(prop.getProperty("message"));
		log.clicksend();
	}
	
	@AfterMethod
	public void closedriver() {
		screenshots("msg");
		driver.close();
	}

}
