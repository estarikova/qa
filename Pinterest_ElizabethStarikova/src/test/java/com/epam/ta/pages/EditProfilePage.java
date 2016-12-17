package com.epam.ta.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfilePage extends AbstractPage
{
	private final String BASE_URL = "https://www.pinterest.com/";
	private final Logger logger = LogManager.getRootLogger();

	@FindBy(id = "userUserName")
    private WebElement urlSetInput;

    @FindBy(className = "confirmButton")
    private WebElement updateButton;

	public EditProfilePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	public void setProfileUrl(String sample)
    {
        urlSetInput.sendKeys(Keys.CONTROL + "a");
        urlSetInput.sendKeys(Keys.DELETE);
        urlSetInput.sendKeys(sample);
    }

    public String getProfileUrl()
	{
		return urlSetInput.getAttribute("value");
	}

    public void update()
    {
        updateButton.click();
    }



	@Override
	public void openPage()
	{
		driver.navigate().to(BASE_URL);
	}
}
