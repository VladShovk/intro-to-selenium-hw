package com.example.selenium.steps;

import com.example.selenium.pages.LoginPage;
import com.example.selenium.pages.MainPage;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class UserSteps {
    LoginPage loginPage;
    MainPage mainPage;
    private WebDriver driver;

    public UserSteps(WebDriver driver) {
        this.driver = driver;
    }

    public UserSteps login(String username, String password) {
        // TODO initialize LoginPage, call setUsername, setPassword, and click login methods
        loginPage = new LoginPage(driver);
        mainPage = loginPage.setUsername(username)
            .setPassword(password)
            .clickLogin();


        //  TODO assert title
        assertTrue(mainPage.getTitle().contains("Secure Area"), "Login failed");
        return this;
    }

    public UserSteps logout() {
        // TODO call logout method
        mainPage.clickLogout();
        return this;
    }
}
