package Callsign.CallSignAssignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrontEndTest2 {

@Test
public void frontEndTask2()
{

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://coinmarketcap.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		if(driver.findElement(By.cssSelector(".gv-close")).isDisplayed())
		{
			driver.findElement(By.cssSelector(".gv-close")).click();
		}
		
		if(driver.findElement(By.cssSelector(".cmc-cookie-policy-banner__close")).isDisplayed())
		{
			driver.findElement(By.cssSelector(".cmc-cookie-policy-banner__close")).click();
		}
		
         JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.cssSelector(".evcgfK .eTWSGQ")));
		
		driver.findElement(By.cssSelector(".evcgfK .eTWSGQ")).click();
		
		driver.findElement(By.cssSelector("ul li:nth-child(5) .gNHIvn")).click();
		
		driver.findElement(By.xpath("//button[normalize-space(text())='Market Cap']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space(text())='$1B - $10B']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space(text())='Price']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space(text())='$101 - $1,000']")).click();
		
		if(driver.findElement(By.cssSelector(".sc-b1f0826a-0 span:last-of-type")).isDisplayed())
		{
			driver.findElement(By.cssSelector(".sc-b1f0826a-0 span:last-of-type")).click();
		}
		
		
		driver.findElement(By.xpath("//button[normalize-space(text())='Apply Filter']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space(text())='Show results']")).click();
		
		List<WebElement>prices=driver.findElements(By.xpath("//table[@class='sc-853bfcae-2 eVOXbZ cmc-table  ']//tbody//tr"));
		
		Assert.assertTrue(prices.size()==68);
			
		
	}

}
