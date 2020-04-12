package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccount {
	WebDriver driver;
	NewAccount(WebDriver d){
		driver=d;
		PageFactory.initElements(d, this);
	}
	@FindBy(name="cusid ")WebElement customerid;
	@FindBy(name="selaccount ")WebElement dropAccount;
	@FindBy(name="inideposit ")WebElement Ini_deposit;
	@FindBy(name="button2")WebElement submit;
	@FindBy(name="reset ")WebElement reset;
	
	public void setcustomerid(String cusid) {
		customerid.sendKeys(cusid);
	}
	public void setdropAccount(String dropAcc) {
		Select dropAcc1= new Select(dropAccount);
		dropAcc1.selectByVisibleText(dropAcc);
	}
	public void setinitialdeposit(CharSequence[] ideposit) {
		Ini_deposit.sendKeys(ideposit);
	}
	public void setsubmit() {
		submit.click();
	}
	public void setreset() {
		reset.click();
	}

}
