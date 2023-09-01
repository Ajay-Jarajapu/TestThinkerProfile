package Test_Thinker_Assignment.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Validate_contacts_page {

	public void validate() {
		
//		Validating first contact's email & phone
		WebElement actual_email1 = Signup_Page.driver.findElement(By.xpath("//table[@id='myTable']/tr[1]/td[4]"));

		String exp_email = "expected_email1";
		String actl_email = actual_email1.getText();

		assert exp_email.equalsIgnoreCase(actl_email);
		
		String expc_phone = "expected_phone_number";
		WebElement actual_phone = Signup_Page.driver.findElement(By.xpath("//table[@id='myTable']/tr[1]/td[5]"));
		
		String actl_phone = actual_phone.getText();
		
		assert expc_phone.equalsIgnoreCase(actl_phone);
	
		System.out.println("Assertion passed, email is added");

	}

}
