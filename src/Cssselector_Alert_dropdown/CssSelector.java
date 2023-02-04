package Cssselector_Alert_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Selenium11d");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Selenium1d");
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Selenium2");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Selenium123xfsdshg@gamil.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("12312312344");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("Selenium@123");
		
		driver.findElement(By.xpath("//input[@value='0']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		Thread.sleep(3000);
		//Validation for account creation
		
		WebElement proofOfAccountCreation =driver.findElement(By.xpath("//h1[contains(text(),'Your Account Has Been Created!'"));
		if(proofOfAccountCreation.isDisplayed());{
			driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
		}
		driver.findElement(By.linkText("logout")).click();
		
		//Validation for account creation
		WebElement proofOfLogout =driver.findElement(By.xpath("//h1[contains(text(),'Account logout'"));
		if(proofOfLogout.isDisplayed());{
			driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
		}
		driver.findElement(By.linkText("logout")).click();

	}

}
