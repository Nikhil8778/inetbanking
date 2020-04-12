package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class NewCustomer {
	WebDriver driver;
	public void LoginPage(WebDriver d){
		driver=d;
		PageFactory.initElements(d, this);
	}
		@FindBy(linkText="New Customer")WebElement NCustomer;
		//Customer name
		@FindBy(name="name")WebElement C_name;
		//Radio Button for male
		@FindBy(xpath="//input[@name='rad1'][@value='m']")WebElement mbutton; 
		//Radio Button for female
		@FindBy(xpath="//input[@name='rad1'][@value='f']")WebElement fbutton ;
		@FindBy(id="dob")WebElement D_O_B ;
		@FindBy(name="addr")WebElement Addrress;
		@FindBy(name="city")WebElement City;
		@FindBy(name="state")WebElement State;
		@FindBy(name="pinno")WebElement Pin;
		@FindBy(name="telephoneno")WebElement Mobile;
		@FindBy(name="emailid")WebElement Email;
		@FindBy(name="password")WebElement Password;
		@FindBy(name="sub")WebElement Submit;
		@FindBy(name="res")WebElement reset;
		
	public void addnewcustomer() {
		NCustomer.click();
	}
	public void setC_name(String name) {
		C_name.sendKeys(name);
	}
	public void setmbutton() {
		mbutton.click();
	}
	public void setfbutton() {
		fbutton.click();
	}
	/*public void setD_O_B() {
		D_O_B.click();
		Select drop=new Select(D_O_B);
		drop.selectByValue("16-03-2020");
	}*/
	public void setD_O_B(String mm,String dd,String yyyy) {
		D_O_B.sendKeys(mm);
		D_O_B.sendKeys(dd);
		D_O_B.sendKeys(yyyy);
	}
	public void setAddrress(String add) {
		Addrress.sendKeys(add);
	}
	public void setcity(String c) {
		City.sendKeys(c);
	}
	public void setstate(String s) {
		State.sendKeys(s);
	}
	public void setpin(String pincode) {
		Pin.sendKeys(pincode);
	}
	public void setmobile(String mob) {
		Mobile.sendKeys(mob);
	}
	public void setemail(String email) {
		Email.sendKeys(email);
	}
	public void setpassword(String pass) {
		Password.sendKeys(pass);
	}
	public void setsubmit() {
		Submit.click();
	}
	public void setreset() {
		reset.click();
}
	
}