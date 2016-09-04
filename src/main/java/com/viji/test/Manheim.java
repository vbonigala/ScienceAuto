package com.viji.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import static junit.framework.Assert.assertEquals;
public class Manheim {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://shoestore-manheim.rhcloud.com/definition");
        wd.findElement(By.cssSelector("body")).click();
        wd.findElement(By.id("remind_email_input")).click();
        wd.findElement(By.id("remind_email_input")).clear();
        wd.findElement(By.id("remind_email_input")).sendKeys("test@test.com");
        wd.findElement(By.xpath("//form[@id='remind_email_form']/div/input[2]")).click();
        assertEquals(wd.findElement(By.cssSelector("#flash > div")).getText(),"Thanks! We will notify you of our new shoes at this email: test@test.com");
        
        wd.quit();
    }
}
