package assignment;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortDashboard 
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
        
		WebElement findElement = driver.findElement(By.xpath("(//button[@type='button'])[7]"));
        findElement.click();
        WebElement findElement1 = driver.findElement(By.xpath("//button[text()='View All']"));
        findElement1.click();
        WebElement findElement2 = driver.findElement(By.xpath("//input[@class='slds-input']"));
        findElement2.sendKeys("dashboard");
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		WebElement findElement3 = driver.findElement(By.xpath("//span[text()='Dashboard Name']"));
		Actions dd2=new Actions(driver);
		dd2.moveToElement(findElement3).perform();
		findElement3.click();
		
		WebElement findElement4 = driver.findElement(By.xpath("//span[text()='Sorted Ascending']"));
		String text = findElement4.getText();
		System.out.println(text);
	}

}
