package stepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest2 {
	WebDriver driver;
	
	//Test Button
	@Given("^I can enter email and password$")
	public void I_can_enter_email_and_password() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.stockunlimited.com/");
		driver.findElement(By.id("su-login")).click();
		driver.findElement(By.name("email")).sendKeys("trispangrib@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pangaribuan99");
		
	}
	
	@When("^I can login to stockUnlimited$")
	public void I_can_login_to_stockUnlimited() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/input[4]")).click();
	}
	
	@Then ("^I can press the button$")
	public void I_can_press_the_button() throws Throwable {
		driver.findElement(By.id("sueditor-more")).click();
	}
	
	
	//Test Button 2
	/*@Given("^I can enter email and password$")
	public void I_can_enter_email_and_password() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.stockunlimited.com/");
		driver.findElement(By.id("su-login")).click();
		driver.findElement(By.name("email")).sendKeys("trispangrib@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Triska4499");
		
	}
	
	@When("^I can login to stockUnlimited$")
	public void I_can_login_to_stockUnlimited() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/input[4]")).click();
	}
	/html/body/div[4]/div/span
	@Then ("^I can press the button$")
	public void I_can_press_the_button() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/a[1]")).click();
	}
	*/
	
	//Test Button 3
	/*@Given("^I can enter email and password$")
	public void I_can_enter_email_and_password() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.stockunlimited.com/");
		driver.findElement(By.id("su-login")).click();
		driver.findElement(By.name("email")).sendKeys("trispangrib@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Triska4499");
		
	}
	
	@When("^I can login to stockUnlimited$")
	public void I_can_login_to_stockUnlimited() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/input[4]")).click();
	}
	
	@Then ("^I can press the button$")
	public void I_can_press_the_button() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[4]/div/span")).click();
	}
	*/
	
	//Test Button 4
	/*@Given("^I can enter email and password$")
	public void I_can_enter_email_and_password() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.stockunlimited.com/");
		driver.findElement(By.id("su-login")).click();
		driver.findElement(By.name("email")).sendKeys("trispangrib@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Triska4499");
		
	}
	
	@When("^I can login to stockUnlimited$")
	public void I_can_login_to_stockUnlimited() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/input[4]")).click();
	}
	
	@Then ("^I can press the button$")
	public void I_can_press_the_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"sui-user-menu\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"sui-user-menu\"]/div/a[1]")).click();
	}
	*/
	
	//Test button 5
	/*@Given("^I can enter email and password$")
	public void I_can_enter_email_and_password() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.stockunlimited.com/");
		driver.findElement(By.id("su-login")).click();
		driver.findElement(By.name("email")).sendKeys("trispangrib@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Triska4499");
		
	}
	
	@When("^I can login to stockUnlimited$")
	public void I_can_login_to_stockUnlimited() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/input[4]")).click();
	}
	
	@Then ("^I can press the button$")
	public void I_can_press_the_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"sui-user-menu\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"sui-user-menu\"]/div/a[6]")).click();
	}
	*/

}
