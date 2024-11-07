package org.test;

import org.base.TestData;
import org.locators.FaceBookRegisterPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FacebookRegisterTest extends FaceBookRegisterPage {
   @BeforeClass
    public void beforeclass(){
        startChrome();
        openTheUrl("https://www.facebook.com/");
        maxmimizeBrowser();
    }
    @Test
    public void registerTest() throws InterruptedException {
       FaceBookRegisterPage registerPage = new FaceBookRegisterPage();
       registerPage.clickRegisterButton();
       registerPage.setfirstname(TestData.get("firstname"));
       registerPage.setlastname(TestData.get("lastname"));
       registerPage.setDate(TestData.get("date"));
       registerPage.setmonth(TestData.get("month"));
       registerPage.setYear(TestData.get("year"));
       registerPage.selectGender(TestData.get("gender"));
       registerPage.enterEmailOrMobileNumber(TestData.get("fbemail"));
       registerPage.enterNewPassword(TestData.get("fbpassword"));
    }
    @AfterClass
    public void afterclass(){
        closeThebrowser();
    }
}
