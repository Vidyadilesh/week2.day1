package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("FEFundinfo");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		WebElement dd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown = new Select(dd);
		dropdown.selectByIndex(4);
		WebElement dd1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdown1 = new Select(dd1);
		dropdown1.selectByIndex(5);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vidya");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("M");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Senior Quality Analayst");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100000");
		
		WebElement dd2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown2 = new Select(dd2);
		dropdown2.selectByIndex(3);
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("500");

		
		WebElement owner=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownership=new Select(owner);
		ownership.selectByIndex(2);
		
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1234");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("16");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("created a lead");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("this lead is created");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600070");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9003251116");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("123");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Vidya");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Vidya.swathi11@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.testleaf.com");
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Muthukumar");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Manimala");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("no28, Gowri avenue, Sathya nagar, Anna 2nd Street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Anakaputhur");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateprovince=new Select(state);
		stateprovince.selectByIndex(3);
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600070");
		
		WebElement country=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select countryval=new Select(country);
		countryval.selectByVisibleText("India");
		
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("70");
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();


	}

}
