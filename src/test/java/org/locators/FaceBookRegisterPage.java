package org.locators;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookRegisterPage extends Baseclass {
    public FaceBookRegisterPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath ="//a[@data-testid='open-registration-form-button']")
    public WebElement registerButton;
    @FindBy(xpath ="//input[@name='firstname']")
    public WebElement firstnameBox;
    @FindBy(xpath ="//input[@name='lastname']")
    public WebElement lastnameBox;
    @FindBy(xpath ="//*[@name='birthday_day']")
    public WebElement dayDropDown;
    @FindBy(xpath ="//*[@name='birthday_month']")
    public WebElement monthDropDown;
    @FindBy(xpath ="//*[@name='birthday_year']")
    public WebElement YearDropDown;
    @FindBy(xpath ="//input[@aria-label='Mobile number or email address']")
    public WebElement mobilenumberoremail;
    @FindBy(xpath ="//input[@aria-label='New password']")
    public WebElement newPassword;

    public void setfirstname(String firstname) throws InterruptedException {
        Thread.sleep(3000);
        waitAndSetText(firstnameBox,firstname);
    }
    public void setlastname(String lastname){
        waitAndSetText(lastnameBox,lastname);
    }
    public void setmonth(String value){
        selectValueIndropdown(monthDropDown,value);
    }
    public void setDate(String value){
        selectValueIndropdown(dayDropDown,value);
    }
    public void setYear(String value){
        selectValueIndropdown(YearDropDown,value);
    }
    public void clickRegisterButton(){
        registerButton.click();
    }
    public static WebElement getGenderRadioButton(String gender) {
        String dynamicXpath = String.format("//label[text()='%s']/input", gender);
        return driver.findElement(By.xpath(dynamicXpath));
    }
    public void selectGender(String gender){
        getGenderRadioButton(gender).click();
    }
    public void enterEmailOrMobileNumber(String email){
        waitAndSetText(mobilenumberoremail,email);
    }
    public void enterNewPassword(String password){
        waitAndSetText(newPassword,password);
    }


}
