package com.fengkong.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginRisk {
	public void loginRisk(String name,String passw) {
		
		WebDriver dr=null;
		dr.findElement(By.id("username")).clear();
		dr.findElement(By.id("username")).sendKeys(name);
		dr.findElement(By.id("password")).clear();
		dr.findElement(By.id("password")).sendKeys(passw);
		dr.findElement(By.id("login")).click();
}
}