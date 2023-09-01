package Test_Thinker_Assignment.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Edit_Contact_page {

	public void edit_test1_Email() throws InterruptedException {

		WebElement email1 = Signup_Page.driver.findElement(By.xpath("//table[@id='myTable']/tr[1]/td[4]"));
		email1.click();

		WebElement button_edit = Signup_Page.driver.findElement(By.xpath("//button[@id='edit-contact']"));
		button_edit.click();

		WebElement before_edit = Signup_Page.driver.findElement(By.xpath("//input[@id='email']"));
		Thread.sleep(2000);

		before_edit.clear();

		Thread.sleep(1000);

		before_edit.sendKeys("editedemail123@gmail.com");

		WebElement button_submit = Signup_Page.driver.findElement(By.xpath("//button[@id='submit']"));
		button_submit.click();
		Thread.sleep(1000);

		WebElement return_to_contactList = Signup_Page.driver.findElement(By.xpath("//button[@id='return']"));
		return_to_contactList.click();

//		validate edited email

		WebElement act_edited_email = Signup_Page.driver.findElement(By.xpath("//table[@id='myTable']/tr[1]/td[4]"));

		String expected_edited_email = "editedemail123@gmail.com";

		String actual_edited_email = act_edited_email.getText();

		assert expected_edited_email.equalsIgnoreCase(actual_edited_email);

		System.out.println("Edited emil assertion paased");
	}

}
