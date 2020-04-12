package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomizedStatement {
	WebDriver driver;
	CustomizedStatement(WebDriver d) {
		driver=d;
		PageFactory.initElements(d, this);
	}
	@FindBy(name="accountno ")WebElement acc;
	@FindBy(name="fdate")WebElement fromdate;
	@FindBy(name="tdate")WebElement todate;
	@FindBy(name="amountlowerlimit")WebElement amlolimit;
	@FindBy(name="numtransaction")WebElement numtrans;
	@FindBy(name="AccSubmit")WebElement submit;
	@FindBy(name="res")WebElement reset;
	
	public void setaccountnumber(String account) {
		acc.sendKeys(account);
	}
	public void setfromdate(String fdate) {
		fromdate.sendKeys(fdate);
	}
	public void settodate(String tdate) {
		todate.sendKeys(tdate);
	}
	public void setamountlowerlimit(String all) {
		amlolimit.sendKeys(all);
	}
	public void setnumbertransaction(String nt) {
		numtrans.sendKeys(nt);
	}
	public void setsubmit() {
		submit.click();
	}
	public void setreset() {
		reset.click();
}
}