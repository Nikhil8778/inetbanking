package com.inetbanking.testCases;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.NewCustomer;


public class TC_NewCustomer_V1 extends BaseClass {
	
	@Test
	public void AddnewCustomer() throws Exception {
		LoginPage lp=new LoginPage(driver);
		lp.setuname(Username);
		lp.setpwd(Password);
		lp.clicklogin();
	
		Thread.sleep(3000);
		NewCustomer nc=new NewCustomer();
		nc.addnewcustomer();
		nc.setC_name("Nikhil");
		nc.setmbutton();
		nc.setD_O_B("03","16","2020");
		nc.setAddrress("33 Elm Drive West");
		nc.setcity("Mississauga");
		nc.setstate("Ontario");
		nc.setpin("L5B4M2");
		nc.setmobile("6478805159");
		nc.setemail(RandomeString() +"@gmail.com");
		nc.setpassword("1231");
		nc.setsubmit();
		
		Thread.sleep(3000);
		boolean res=driver.getPageSource().contains("Customer Registered Successfully");
		if(res==true) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
	}
	public String RandomeString() {
		String generatedString=RandomStringUtils.randomAlphabetic(10);
		return generatedString ;
	}
}