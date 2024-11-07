package org.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.base.Baseclass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends Baseclass{

	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@placeholder='Email address or phone number']")
	public WebElement userNameInput;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement passWordInput;

	@FindBy(xpath="//button[@type='submit']")
	public WebElement loginButton ;

	public static WebDriverWait wait;

 public void setusername(String username){
	waitAndSetText(userNameInput,username);
 }
 public void setPassword(String Password){
	 waitAndSetText(passWordInput,Password);
 }
 public void clickLogin(){
	 loginButton.click();
 }


}
