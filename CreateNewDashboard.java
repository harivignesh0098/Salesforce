package assignment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewDashboard 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	    driver.findElement(By.xpath("//button[text()='View All']")).click();
	    driver.findElement(By.xpath("//p[text()='Dashboards']/ancestor::li")).click();
	    driver.findElement(By.xpath("//a[@title='New Dashboard']")).click();
	    
	   // driver.switchTo().defaultContent();
		WebElement frame =driver.findElement(By.xpath("//div[@class='dashboardContainer']//iframe"));
	    driver.switchTo().frame(frame);
	    driver.findElement(By.id("dashboardNameInput")).sendKeys("Salesforce Automation by Hari Vignesh");
	    driver.findElement(By.id("submitBtn")).click();
	    driver.switchTo().defaultContent();
	    
	    WebElement findElement = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
	    driver.switchTo().frame(findElement);
	    
	    driver.findElement(By.xpath("//button[text()='Save']")).click();
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	   
	}

}
