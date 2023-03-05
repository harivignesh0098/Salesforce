package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EditDashBoard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
	    
	    Thread.sleep(4000);
		WebElement edit = driver.findElement(By.xpath("(//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small'])[1]//following::lightning-primitive-icon"));
		Actions dd1=new Actions(driver);
		dd1.moveToElement(edit).perform();
		edit.click();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
        
		Thread.sleep(4000);
        driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//button[@title='Edit Dashboard Properties']")).click();
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Salesforce");
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
        driver.findElement(By.xpath("//button[text()='Save']")).click();
	   
	}

}
