package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundsTransfer {
	WebDriver driver;
	FundsTransfer(WebDriver d){
		driver=d;
		PageFactory.initElements(d, this);
	}
		@FindBy(name="payersaccount")WebElement payersacc;
		@FindBy(name="payeeaccount")WebElement payeeacc;
		@FindBy(name="ammount ")WebElement amount;
		@FindBy(name="desc")WebElement description;
		@FindBy(name="AccSubmit")WebElement submit;
		@FindBy(name="res")WebElement reset;

		public void setpayersaccount(String pracc) {
			payersacc.sendKeys(pracc);
		}
		public void setpayeeaccount(String pyacc) {
			payeeacc.sendKeys(pyacc);
		}
		public void setamount(String a) {
			amount.sendKeys(a);
		}
		public void setdesc(String desc) {
			description.sendKeys(desc);
		}
		public void setsubmit() {
			submit.click();
		}
		public void setreset() {
			reset.click();
		}
}

