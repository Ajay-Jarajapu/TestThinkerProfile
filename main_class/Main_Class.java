package main_class;

import java.io.FileNotFoundException;
import java.io.IOException;

import Test_Thinker_Assignment.Pages.Add_Contacts_page;
import Test_Thinker_Assignment.Pages.Delete_contatct_page;
import Test_Thinker_Assignment.Pages.Edit_Contact_page;
import Test_Thinker_Assignment.Pages.Signin_page;
import Test_Thinker_Assignment.Pages.Signup_Page;
import Test_Thinker_Assignment.Pages.Validate_contacts_page;

public class Main_Class {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {

		Signup_Page SP = new Signup_Page();
		SP.signup();

		Add_Contacts_page AC = new Add_Contacts_page();
		AC.add_contacts();

		Validate_contacts_page VC = new Validate_contacts_page();
		VC.validate();

		Edit_Contact_page EC = new Edit_Contact_page();
		EC.edit_test1_Email();
		
		Delete_contatct_page DC = new Delete_contatct_page();
		DC.delete_third_contatc();
		
		Signin_page sign = new Signin_page();
		sign.signin();

	}

}
