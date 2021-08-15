package WeekTwo.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadExplore {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement webUser = driver.findElement(By.id("username"));
		webUser.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		WebElement text = driver.findElement(By.id("createLeadForm_firstName"));
		text.sendKeys("Vaishnavi");
		

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vaishnavi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Praveen");
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("867");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("hello");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/08/97");
		WebElement drop1 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drpdwn = new Select(drop1);	
		drpdwn.selectByIndex(1); 
		
		WebElement drop2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drpDwn2 = new Select(drop2);
		drpDwn2.selectByVisibleText("Partnership");
		
		driver.findElement(By.name("submitButton")).click();
		
		String title = "My Home | opentaps CRM";
		String homeTitle = driver.getTitle();
		if(title.equals(homeTitle)) {
			System.out.println(" In the Home Page");
		}
		else
			System.out.println(" Not in the Home page");
		}

}
	

