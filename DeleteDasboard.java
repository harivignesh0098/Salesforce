package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DeleteDasboard 
{

	public static void main(String[]args) throws InterruptedException
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
	    driver.findElement(By.xpath("//input[contains(@class,'search-text-field slds-input')]")).sendKeys("Hari Vignesh",Keys.ENTER);
		
	    Thread.sleep(3000);
        WebElement delete = driver.findElement(By.xpath("(//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small'])[1]//following::lightning-primitive-icon"));
		Actions dd1=new Actions(driver);
		dd1.moveToElement(delete).perform();
		delete.click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		
		driver.findElement(By.xpath("(//span[text()='Delete'])[2]")).click();
	}

}
