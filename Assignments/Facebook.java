package WeekTwo.day1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
 public class Facebook {
public static void main(String[] args)
{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Create New Account")).click();
	driver.findElement(By.name("firstname")).sendKeys("Vaishnavi");
	driver.findElement(By.name("lastname")).sendKeys("B");
	driver.findElement(By.name("reg_email__")).sendKeys("abcsdgsd@gmail.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("Happyapril1");
	WebElement drop1 = driver.findElement(By.id("day"));
	Select drpDwn = new Select(drop1);	
	drpDwn.selectByIndex(11); 
	WebElement drop2 = driver.findElement(By.id("month"));
	Select drpDwn2 = new Select(drop2);	
	drpDwn2.selectByVisibleText("Mar"); 
	WebElement drop3 = driver.findElement(By.id("year"));
	Select drpDwn3 = new Select(drop3);	
	drpDwn3.selectByValue("2020"); 
	driver.findElement(By.id("u_0_2_Z6")).click();
	
}
}
