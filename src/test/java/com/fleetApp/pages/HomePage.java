package com.fleetApp.pages;

import com.fleetApp.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	@FindBy(xpath = "//a[@href='javascript: void(0);']")
	public WebElement johnDoeClick;

	@FindBy(className = "oro-subtitle")
	private WebElement pageSubtitle;
	@FindBy(xpath = "//a[.='Logout']")
	public WebElement logoutBtn;

	public String getSubtitle() {
		return pageSubtitle.getText();
	}

	public void verifyTitleHomePage() {

		WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
		wait.until(ExpectedConditions.titleIs("Dashboard"));

		String expectedTitle = "Dashboard";
		Assert.assertEquals(expectedTitle, Driver.get().getTitle());
	}
}




