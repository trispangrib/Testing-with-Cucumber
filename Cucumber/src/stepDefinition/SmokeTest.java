package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	WebDriver driver;
	
		//Test Change Password
		@Given("^I login to StockUnlimited$")
		public void I_login_to_StockUnlimited() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.stockunlimited.com/");
			driver.findElement(By.id("su-login")).click();
			driver.findElement(By.name("email")).sendKeys("trispangrib@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Triska4499");
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/input[4]")).click();
			
		}
		
		@When("^I can enter to security$")
		public void I_can_enter_to_security() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"sui-user-menu\"]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"sui-user-menu\"]/div/a[4]")).click();
		}
		
		@Then ("^I can change the password$")
		public void I_can_change_the_password() throws Throwable {
			driver.findElement(By.name("oldpassword")).sendKeys("");
			driver.findElement(By.name("newpassword")).sendKeys("");
			driver.findElement(By.name("confirmpassword")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"form\"]/input[3]")).click();
		}
	
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.stockunlimited.com/");
	}
	
	@When("^I can enter valid emailaddress and valid password$")
	public void I_can_enter_valid_emailaddress_and_valid_password() throws Throwable {
		driver.findElement(By.id("su-login")).click();
		driver.findElement(By.name("email")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("");
	}
	
	@Then ("^I can login succesfully to StockUnlimited$")
	public void I_can_login_succesfully_to_StockUnlimted() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/input[4]")).click();
	}
	
	
	
}