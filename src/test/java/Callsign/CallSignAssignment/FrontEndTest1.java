package Callsign.CallSignAssignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrontEndTest1 {

	@Test
	public void frontEndTask1()
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
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.cssSelector(".jPLKhd .sc-aef7b723-0.sc-dae82938-0"))).click().build().perform();
		
		List<WebElement> rows=driver.findElements(By.cssSelector(".tippy-content button"));
		
		rows.stream().filter(row->row.getText().equals("100")).findFirst().ifPresent(row->row.click());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.cssSelector(".jPLKhd .sc-aef7b723-0.sc-dae82938-0")));
		
		int rowSize=driver.findElements(By.xpath("//table[@class='sc-853bfcae-2 eVOXbZ cmc-table  ']//tbody//tr")).size();
		
		Assert.assertEquals(rowSize,100);
	}

}
