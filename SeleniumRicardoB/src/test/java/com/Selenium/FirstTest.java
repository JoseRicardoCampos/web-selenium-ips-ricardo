package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class FirstTest {
	@Test
	public void f() {

		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);

		driver.get("https://computer-database.gatling.io/computers");
		driver.findElement(By.xpath("//input[@id='searchbox']")).sendKeys("ACE");
		driver.findElement(By.xpath("//input[@id='searchsubmit']")).click();
		String textElement = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a")).getText();
		System.out.println(textElement);
		Assert.assertEquals(driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a")).getText(), textElement);
		driver.close();

		// --------------------------------------------------
		String correctOutput2 = "Done ! Computer NewComputer has been created";
		driver.get("https://computer-database.gatling.io/computers");

		driver.findElement(By.xpath("//*[@id=\"add\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("NewComputer");
		driver.findElement(By.xpath("//*[@id=\"introduced\"]")).sendKeys("2015/04/20");
		driver.findElement(By.xpath("//*[@id=\"discontinued\"]")).sendKeys("2020/04/30");
		Select dropDown = new Select(driver.findElement(By.xpath("//*[@id=\"company\"]")));
		dropDown.selectByVisibleText("IBM");
		driver.findElement(By.xpath("//*[@id=\"main\"]/form/div/input")).click();
		String textElement3 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]")).getText();
		if (textElement3 == correctOutput2) {
			System.out.println("CORRECT OUTPUT! VALIDATED!");
		} else {
			System.out.println("Different output detected!");
		}
		driver.close();

		// --------------------------------------------------
		String correctOutput = "Done ! Computer ASCI Thors Hammer has been updated";
		driver.get("https://computer-database.gatling.io/computers");
		driver.findElement(By.xpath("//input[@id='searchbox']")).sendKeys("ASCI Thors Hammer");
		driver.findElement(By.xpath("//input[@id='searchsubmit']")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a")).click();
		Select dropDown2 = new Select(driver.findElement(By.xpath("//*[@id=\"company\"]")));
		dropDown2.selectByVisibleText("Apple Inc.");
		driver.findElement(By.xpath("//*[@id=\"main\"]/form[1]/div/input")).click();
		String textElement2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]")).getText();
		if (textElement2 == correctOutput) {
			System.out.println("CORRECT OUTPUT! VALIDATED!");
		} else {
			System.out.println("Different output detected!");
		}
		driver.close();
	}
}
