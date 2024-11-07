package org.test;

import com.google.common.annotations.VisibleForTesting;
import org.base.TestData;
import org.locators.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends LoginPage {
@BeforeClass
public void beforeclass(){
    startChrome();
    openTheUrl("https://www.facebook.com/");
    maxmimizeBrowser();
}
    @Test
    public void facebooklogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.setusername(TestData.get("username"));
        loginPage.setPassword(TestData.get("password"));
        loginPage.clickLogin();
        Thread.sleep(6000);



    }
@AfterClass
    public void afterclass(){
    closeThebrowser();
}
}
