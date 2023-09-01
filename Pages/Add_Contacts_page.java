package Test_Thinker_Assignment.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Add_Contacts_page {

	public static WebElement addContacts;
	public static WebElement firstname;
	public static WebElement lastname;
	public static WebElement email;
	public static WebElement phone;
	public static WebElement submit;

	public void add_contacts() {

//		click on addcontacts page
		addContacts = Signup_Page.driver.findElement(By.xpath("//button[@id='add-contact']"));
		addContacts.click();

//			**************************		adding 1st contact		*******************************

//		adding firstname
		firstname = Signup_Page.driver.findElement(By.xpath("//input[@id='firstName']"));
		firstname.click();
		firstname.sendKeys(Signup_Page.prop.getProperty("firstname1"));

//		adding lastname

		lastname = Signup_Page.driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.click();
		lastname.sendKeys(Signup_Page.prop.getProperty("lastname1"));

//		adding email_1
		email = Signup_Page.driver.findElement(By.xpath("//input[@id='email']"));
		email.click();
		email.sendKeys(Signup_Page.prop.getProperty("email1"));

//		adding phone_1
		phone = Signup_Page.driver.findElement(By.xpath("//input[@id='phone']"));
		phone.click();
		phone.sendKeys(Signup_Page.prop.getProperty("phone1"));

//		saving first conact
		submit = Signup_Page.driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();

//		**************************		adding 2nd contact		*******************************

//		click on addcontacts page
		addContacts = Signup_Page.driver.findElement(By.xpath("//button[@id='add-contact']"));
		addContacts.click();

//	adding firstname
		firstname = Signup_Page.driver.findElement(By.xpath("//input[@id='firstName']"));
		firstname.click();
		firstname.sendKeys(Signup_Page.prop.getProperty("firstname2"));

//	adding lastname

		lastname = Signup_Page.driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.click();
		lastname.sendKeys(Signup_Page.prop.getProperty("lastname2"));

//	adding email_2
		email = Signup_Page.driver.findElement(By.xpath("//input[@id='email']"));
		email.click();
		email.sendKeys(Signup_Page.prop.getProperty("email2"));

//	adding phone_2
		phone = Signup_Page.driver.findElement(By.xpath("//input[@id='phone']"));
		phone.click();
		phone.sendKeys(Signup_Page.prop.getProperty("phone2"));

//	saving 2nd conact
		submit = Signup_Page.driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();

//	**************************		adding 3rd contact		*******************************

//	click on addcontacts page
		addContacts = Signup_Page.driver.findElement(By.xpath("//button[@id='add-contact']"));
		addContacts.click();

//adding firstname
		firstname = Signup_Page.driver.findElement(By.xpath("//input[@id='firstName']"));
		firstname.click();
		firstname.sendKeys(Signup_Page.prop.getProperty("firstname3"));

//adding lastname

		lastname = Signup_Page.driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.click();
		lastname.sendKeys(Signup_Page.prop.getProperty("lastname3"));

//adding email_3
		email = Signup_Page.driver.findElement(By.xpath("//input[@id='email']"));
		email.click();
		email.sendKeys(Signup_Page.prop.getProperty("email3"));

//adding phone_3
		phone = Signup_Page.driver.findElement(By.xpath("//input[@id='phone']"));
		phone.click();
		phone.sendKeys(Signup_Page.prop.getProperty("phone3"));

//saving 3rd conact
		submit = Signup_Page.driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();

	}
}
