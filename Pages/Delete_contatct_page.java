package Test_Thinker_Assignment.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Delete_contatct_page {

	public void delete_third_contatc() throws InterruptedException {

		WebElement email3 = Signup_Page.driver.findElement(By.xpath("//table[@id='myTable']/tr[3]/td[4]"));
		email3.click();

		WebElement delete_contact = Signup_Page.driver.findElement(By.xpath("//button[@id='delete']"));
		delete_contact.click();

		Thread.sleep(2000);
		Signup_Page.driver.switchTo().alert().accept();

		Thread.sleep(1000);
		
		System.out.println("Alert handled, Contatc deleted");
		
		WebElement button_logout = Signup_Page.driver.findElement(By.xpath("//button[@id='logout']"));
		Signup_Page.js.executeScript("arguments[0].click()", button_logout);

	}

}
