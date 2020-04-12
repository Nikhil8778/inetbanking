package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePassword {
	WebDriver driver;
	ChangePassword(WebDriver d){
		driver=d;
		PageFactory.initElements(d, this);
	}
		@FindBy(name="oldpassword")WebElement opass ;
		@FindBy(name="newpassword")WebElement npass;
		@FindBy(name="confirmpassword ")WebElement cpass;
		@FindBy(name="sub")WebElement submit;
		@FindBy(name="res")WebElement reset;

		public void setoldpassword(String op) {
			opass.sendKeys(op);
		}
		public void setnewpassword(String np) {
			npass.sendKeys(np);
		}
		public void setconfirmpassword(String cp) {
			cpass.sendKeys(cp);
		}
		public void setsubmit() {
			submit.click();
		}
		public void setreset() {
			reset.click();
		}
}

