package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//td[contains(text(),'User: Tanumoy Dey')]")
	WebElement usernameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactslink;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newContactslink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealslink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement taskslink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() throws InterruptedException {
		Thread.sleep(3000);
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName() {
		return usernameLabel.isDisplayed();
	}
	
	
	public ContactsPage clickOnContactsLink() {		
		contactslink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink() {
		contactslink.click();
		return new DealsPage();
	}
	
	public TaskPage clickOnTasksLink() {
		contactslink.click();
		return new TaskPage();
	}
	
	public void clickOnNewContactLink() {
		Actions action = new Actions(driver);
		action.moveToElement(contactslink).build().perform();
		newContactslink.click();
	}
	
	
	
}
