package Test_Thinker_Assignment.Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Signup_Page {

	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
	public static JavascriptExecutor js;

	public void signup() throws IOException, FileNotFoundException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KumarA\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		driver = new ChromeDriver();
		js = (JavascriptExecutor)driver;
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		// signup code
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\KumarA\\OneDrive - Vodafone Group\\Documents\\Eclipse workspace\\Test_Thinker_assignment\\src\\Test_Thinker_Assignment\\Pages\\config.properties");

		prop = new Properties();
		prop.load(fis);

		driver.get(prop.getProperty("URL"));

//		to click on signup button
		WebElement signup = driver.findElement(By.xpath("//button[@id='signup']"));
		signup.click();

//		adding firstname
		WebElement fName = driver.findElement(By.xpath("//input[@id='firstName']"));
		fName.click();
		fName.sendKeys(prop.getProperty("fname"));

//		adding lasttname
		WebElement lName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lName.click();
		lName.sendKeys(prop.getProperty("lname"));

//		adding email	
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.click();
		email.sendKeys(prop.getProperty("email"));

//		adding password
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.click();
		pass.sendKeys(prop.getProperty("password"));

//		clicking submit
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();

	}

}
