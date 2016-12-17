package com.epam.ta.pages;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage
{
	private final Logger logger = LogManager.getRootLogger();
	private final String BASE_URL = "https://www.pinterest.com/";

	@FindBy(name = "id")
	private WebElement nameInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

	@FindBy(className = "SignupButton")
	private WebElement loginButton;

	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage()
	{
		driver.navigate().to(BASE_URL);
		logger.info("Login page opened");
	}

	public void setName(String name)
	{
		nameInput.sendKeys(name);
	}

	public void setPassword(String password)
	{
		passwordInput.sendKeys(password);
	}

	public void clickSignUp()
	{
		loginButton.click();
	}

	/*(public void logout()
	{
		MainPage mainPage = new MainPage(driver);
		mainPage.getProfilePage();
		optionsButton.click();
		logoutButton.click();
	}

	public String getLoggedInUserName()
	{
		MainPage mainPage = new MainPage(driver);
		mainPage.getProfilePage();
		return linkLoggedInUser.getText();
	}*/

}
