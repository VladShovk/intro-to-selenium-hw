package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

    // TODO define username, password, and login WebElements using @FindBy

    @FindBy (how = How.ID, using = "username")
    private WebElement username;

    @FindBy (how = How.ID, using = "password")
    private WebElement password;

    @FindBy (how = How.CSS, using = ".fa")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage setUsername(String text) {
        // TODO set username
        username.sendKeys(text);
        return this;
    }

    public LoginPage setPassword(String text) {
        // TODO set password
        password.sendKeys(text);
        return this;
    }

    public MainPage clickLogin() {
        // TODO click logout return instance of MainPage
        loginButton.click();
        return new MainPage(driver);
    }
}
