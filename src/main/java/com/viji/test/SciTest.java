package com.viji.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SciTest {

	public static void main(String[] args) throws Exception {
		FirefoxDriver wd;
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wd.get("https://www.google.com/");
		wd.findElement(By.id("lst-ib")).click();
		wd.findElement(By.id("lst-ib")).clear();
		wd.findElement(By.id("lst-ib")).sendKeys("science");
		wd.findElement(By.name("btnG")).click();
		
		wd.findElement(By.linkText("Science - Wikipedia, the free encyclopedia")).click();
		if (!wd.findElement(By.id("firstHeading")).getText().equals("Science")) {
			System.out.println("verifyText failed");
		} else {
			System.out.println("verifyText passed");
			
		}
		if (!wd.findElement(By.id("History")).getText().equals("History")) {
			System.out.println("verifyText for History failed");
		} else {
			System.out.println("verifyText for History passed");
			
		}
		wd.quit();
	}

}
