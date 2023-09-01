package Test_Thinker_Assignment.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Signin_page {

	public void signin() {
		WebElement signin_email = Signup_Page.driver.findElement(By.xpath("//input[@id='email']"));
		signin_email.click();

		signin_email.sendKeys(Signup_Page.prop.getProperty("email"));

		WebElement signin_password = Signup_Page.driver.findElement(By.xpath("//input[@id='password']"));
		signin_password.click();
		signin_password.sendKeys(Signup_Page.prop.getProperty("password"));

		WebElement button_signin = Signup_Page.driver.findElement(By.xpath("//button[@id='submit']"));
		button_signin.click();

	}
}
