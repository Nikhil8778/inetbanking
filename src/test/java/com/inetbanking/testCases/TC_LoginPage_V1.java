package com.inetbanking.testCases;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.inetbanking.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_LoginPage_V1 extends BaseClass{
	
	@Test
	public void Logintest() {
	LoginPage lp=new LoginPage(driver);
	lp.setuname(Username);
	lp.setpwd(Password);
	lp.clicklogin();
	//Validation
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
		Assert.assertTrue(true);
	}else {
		Assert.assertTrue(false);
	}
	}
	
}
