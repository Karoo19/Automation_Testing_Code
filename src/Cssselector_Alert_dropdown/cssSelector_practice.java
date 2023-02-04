package Cssselector_Alert_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cssSelector_practice {
	public static Select select;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[normalize-space()='Create new account'])[1]")).click();
		
		//Create the object odf select class dropdown and pass location in the constructor
		//there are three methods under select class which are selectedbyVisibleText, selectByIndex, selectByvalue
		
		Thread.sleep(3000);
		select=new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Jul");
		
		select=new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("5");
		
		select=new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("2000");

	}

}
