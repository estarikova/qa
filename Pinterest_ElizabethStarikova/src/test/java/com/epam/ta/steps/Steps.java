package com.epam.ta.steps;


import com.epam.ta.driver.DriverSingleton;
import com.epam.ta.pages.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.epam.ta.pages.EditProfilePage;

public class Steps
{
	private WebDriver driver;

	private final Logger logger = LogManager.getRootLogger();

	public void initBrowser()
	{
		driver = DriverSingleton.getDriver();
	}

	public void closeDriver()
	{
		driver.quit();
	}

	public void loginPin(String username, String password)
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openPage();
		loginPage.setName(username);
		loginPage.setPassword(password);
		loginPage.clickSignUp();
	}

	public void logoutPin()
	{
		MainPage mainPage = new MainPage(driver);
		mainPage.showProfile();
		mainPage.showUserMenu();
		mainPage.logout();
	}

	public boolean isLoggedIn(String username)
	{
		MainPage mainPage = new MainPage(driver);
		mainPage.showProfile();
		return mainPage.getLogedInUserName().equals(username);
	}

	public void goToSettingsPage()
	{
		MainPage mainPage = new MainPage(driver);
		mainPage.showProfile();
		mainPage.goToSettingsPage();
	}

	public void changeUrl(String url)
	{
		EditProfilePage editProfilePage = new EditProfilePage(driver);
		editProfilePage.setProfileUrl(url);
		editProfilePage.update();
	}

	public void changeLastName(String lastName)
	{
		EditProfilePage editProfilePage = new EditProfilePage(driver);
		editProfilePage.setUserLastName(lastName);
		editProfilePage.update();
	}


	public boolean isLastNameChanged(String expected)
	{
		MainPage mainPage = new MainPage(driver);
		mainPage.showProfile();
		String realFullName = mainPage.getLogedInUserName();
		return realFullName.equals(expected);
	}

	public boolean isUrlChanged(String sample)
	{
		MainPage mainPage = new MainPage(driver);
		mainPage.showProfile();
		mainPage.goToSettingsPage();
		EditProfilePage editProfilePage = new EditProfilePage(driver);
		String s = editProfilePage.getProfileUrl();
		return s.toLowerCase().equals(sample.toLowerCase());
	}

	public String goToFindFriendPage()
	{
		MainPage mainPage = new MainPage(driver);
		mainPage.showProfile();
		mainPage.showUserMenu();
		mainPage.goToFindFriendsPage();
		String s = mainPage.getFindUPHeader();
		return s;
	}

	public String goToDesignPage()
	{
		MainPage mainPage = new MainPage(driver);
		mainPage.showCategoriesMenu();
		mainPage.goToDesignPage();
		String s = mainPage.getDesignPageHeader();
		return s;
	}

	public boolean isInFFPage(String s,String expected)
	{
		MainPage mainPage = new MainPage(driver);
		return s.equals(expected);
	}

	public boolean isInDesignPage(String s,String expected)
	{
		MainPage mainPage = new MainPage(driver);
		return s.equals(expected);
	}



}
