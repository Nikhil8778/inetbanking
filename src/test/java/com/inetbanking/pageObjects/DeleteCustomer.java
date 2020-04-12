package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomer {

	WebDriver driver;
	
	DeleteCustomer(WebDriver d) {
		driver=d;
		PageFactory.initElements(d, this);
	}
	@FindBy(name="cusid")WebElement Customerid;
	@FindBy(name="AccSubmit")WebElement submit;
	@FindBy(name="res")WebElement reset;
	
	public void setcustomerid(String cusid) {
		Customerid.sendKeys(cusid);
	}
	public void setsubmit() {
		submit.click();
	}
	public void setreset() {
		reset.click();
	}
}
