package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage extends BasePage {

    // TODO define title and logout WebElements using @FindBy

    @FindBy(how = How.CSS, using = "h2")
    private WebElement title;

    @FindBy (how = How.CSS, using = ".icon-2x")
    private WebElement logoutButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        // TODO return title text
        return title.getText();
    }

    public MainPage clickLogout() {
        // TODO click logout and return MainPage
        logoutButton.click();
        return this;
    }
}
