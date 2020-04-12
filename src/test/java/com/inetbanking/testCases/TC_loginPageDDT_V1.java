package com.inetbanking.testCases;


import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.utilities.Xlutils;

import junit.framework.Assert;

public class TC_loginPageDDT_V1 extends BaseClass{
	
	@Test(dataProvider="LoginPageDDT")
	public void loginpageDDT(String user,String pwd) {
		LoginPage lp=new LoginPage(driver);
		lp.setuname(user);
		lp.setpwd(pwd);
		lp.clicklogin();
		if(isAlertPresent()==true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			
		}else {
			Assert.assertTrue(true);
			lp.clicklogout();
			driver.switchTo().defaultContent();
		}
	}
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		}catch(NoAlertPresentException e) {
			return false;
		}
		
	}
	@DataProvider (name="LoginPageDDT")
	String [][] getdata() throws Exception
	{
	String path=System.getProperty("User.dir") +"src/test/java/com/inetbanking/testdata/LoginTest.xlsx";
	int row= Xlutils.getRowcount(path, "Sheet1");
	int column=Xlutils.getCellcount(path, "Sheet1", 1);
	
	String login[][]=new String[row][column];
	for(int i=1;i<=row;i++) {
		for(int j=0; j<column;j++) {
			login[i-1][j]=Xlutils.getCelldata(path, "Sheet1", i, j);
			
		}
	}
	return login;
	}
}
