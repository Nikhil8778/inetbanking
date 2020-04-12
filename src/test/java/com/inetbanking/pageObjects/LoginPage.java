package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver d){
		driver=d;
		PageFactory.initElements(d, this);
	}
	@FindBy(name="uid")WebElement Uname;
	@FindBy(name="password")WebElement pwd;
	@FindBy(name="btnLogin")WebElement login;
	@FindBy(linkText="Log out")WebElement logout;
	
	public void setuname(String uname) {
		Uname.sendKeys(uname);
	}
	public void setpwd(String password) {
		pwd.sendKeys(password);
	}
	public void clicklogin() {
		login.click();
	}
	public void clicklogout() {
		logout.click();
	}
}
