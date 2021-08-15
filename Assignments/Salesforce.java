package WeekTwo.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("UserFirstName")).sendKeys("Vaishnavi");
		driver.findElement(By.name("UserLastName")).sendKeys("B");
		driver.findElement(By.name("UserEmail")).sendKeys("abcsdgsd@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("Happyapril1");
		driver.findElement(By.name("UserPhone")).sendKeys("7876543879");
		WebElement drop1 = driver.findElement(By.name("UserTitle"));
		Select drpDwn = new Select(drop1);	
		drpDwn.selectByIndex(1); 
		WebElement drop2 = driver.findElement(By.name("CompanyEmployees"));
		Select drpDwn2 = new Select(drop2);	
		drpDwn2.selectByVisibleText("15");
		WebElement drop3 = driver.findElement(By.name("CompanyCountry"));
		Select drpDwn3 = new Select(drop3);	
		drpDwn3.selectByValue("Country"); 
		driver.findElement(By.className("checkbox-ui")).click();
		
	}
	
}
