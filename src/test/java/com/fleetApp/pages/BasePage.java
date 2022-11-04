package com.fleetApp.pages;

import com.fleetApp.utilities.BrowserUtils;
import com.fleetApp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

	BasePage() {
		PageFactory.initElements(Driver.get(), this);
	}

	@FindBy(css = "div[class='loader-mask shown']")
	@CacheLookup
	protected WebElement loaderMask;

	/**
	 * Waits until loader screen present. If loader screen will not pop up at all,
	 * NoSuchElementException will be handled  bu try/catch block
	 * Thus, we can continue in any case.
	 */
	public void waitUntilLoaderScreenDisappear() {
		try {
			WebDriverWait wait = new WebDriverWait(Driver.get(), 20);
			wait.until(ExpectedConditions.invisibilityOf(loaderMask));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//returns the title of the page
	public String getPageTitle(){
		BrowserUtils.wait(3);
		return Driver.get().getTitle();
	}
	//navigate to any given module and subModule
	public void navigateToModule(String moduleName, String subModuleName) { //Fleet - Vehicles
		BrowserUtils.wait(1);
		WebElement module = Driver.get().findElement(By.xpath("//span[text()[normalize-space() = '" + moduleName + "']]"));
		module.click();

		BrowserUtils.wait(1);
		WebElement subModule = Driver.get().findElement(By.xpath("//span[text()[normalize-space() = '" + subModuleName + "']]"));
		subModule.click();
	}
	//navigate to any given module and subModule and subModule of subModule
	public void navigateToModule(String moduleName, String subModuleName, String subSubModuleName) {
		BrowserUtils.wait(1);
		WebElement module = Driver.get().findElement(By.xpath("//span[text()[normalize-space() = '" + moduleName + "']]"));
		module.click();

		BrowserUtils.wait(1);
		WebElement subModule = Driver.get().findElement(By.xpath("//span[text()[normalize-space() = '" + subModuleName + "']]"));
		subModule.click();

		BrowserUtils.wait(1);
		WebElement subSubModule = Driver.get().findElement(By.xpath("//span[text()[normalize-space() = '" + subSubModuleName + "']]"));
		subSubModule.click();
	}
}
