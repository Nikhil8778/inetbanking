package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAccount {
	WebDriver driver;
	EditAccount(WebDriver d){
		driver=d;
		PageFactory.initElements(d, this);
	}
	@FindBy(name="accountno ")WebElement account;
	@FindBy(name="AccSubmit")WebElement submit;
	@FindBy(name="res")WebElement reset;
	
	public void setaccountno(String accno) {
		account.sendKeys(accno);
	}
	public void setsubmit() {
		submit.click();
	}
	public void setreset() {
		reset.click();
	}

}
