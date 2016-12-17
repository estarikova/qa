package com.epam.ta.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage
{
	private final String BASE_URL = "https://www.pinterest.com/";

	@FindBy(className = "userProfile")
	private WebElement profileButton;

	@FindBy(className = "userMenuButton")
	private WebElement userMenuButton;

	@FindBy(xpath="//a[@href = '/logout/']")
	private WebElement logoutButton;

	@FindBy(xpath="//a[@href = '/find_friends/']")
	private WebElement findFriendsLink;

	@FindBy(className = "displayHeadingName")
	private WebElement personInUserName;

	@FindBy(className = "editSettingsButton")
	private WebElement settingsButton;

	@FindBy(xpath = "//div[@class = 'header']/h1[@class='centeredWithinWrapper']")
	private WebElement findUserPageHeader;


	public MainPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	public void showProfile()
	{
		profileButton.click();
	}

	public void showUserMenu()
	{
		userMenuButton.click();
	}

	public void logout()
	{
		logoutButton.click();
	}

	public String getLogedInUserName()
	{
		return personInUserName.getText().toString();
	}

	public void goToSettingsPage()
	{
		settingsButton.click();
	}

	public void goToFindFriendsPage()
	{
		findFriendsLink.click();
	}

	public String getFindUPHeader()
	{
		return findUserPageHeader.getText().toString();
	}



	@Override
	public void openPage()
	{
		driver.navigate().to(BASE_URL);
	}
}
