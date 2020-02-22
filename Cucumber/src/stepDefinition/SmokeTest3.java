package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest3 {
	WebDriver driver;
	
	//workbook
	// Test Case 1
	/*@Given("^I can login to StockUnlimited$")
	public void I_can_login_to_StockUnlimited() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.stockunlimited.com/");
		driver.findElement(By.id("su-login")).click();
		driver.findElement(By.name("email")).sendKeys("trispangrib@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pangaribuan99");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/input[4]")).click();
		
	}
	
	@When("^I can enter the search box$")
	public void I_can_enter_the_search_box() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"search_word\"]")).sendKeys("workbook");
		driver.findElement(By.xpath("//*[@id=\"search_box\"]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"search_box\"]/div/div[2]/span[1]/input")).click();
	}
	
	@Then ("^I can find the workbook$")
	public void I_can_find_the_workbook() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"search_box\"]/input[3]")).click();
	}
	*/
	
	//Test Case 2
	/*@Given("^I can login to StockUnlimited$")
	public void I_can_login_to_StockUnlimited() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.stockunlimited.com/");
		driver.findElement(By.id("su-login")).click();
		driver.findElement(By.name("email")).sendKeys("trispangrib@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pangaribuan99");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/input[4]")).click();
		
	}
	
	@When("^I can enter the search box$")
	public void I_can_enter_the_search_box() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"search_word\"]")).sendKeys("forte");
		driver.findElement(By.xpath("//*[@id=\"search_box\"]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"search_box\"]/div/div[2]/span[1]/input")).click();
	}
	
	@Then ("^I can find the workbook$")
	public void I_can_find_the_workbook() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"search_box\"]/input[3]")).click();
	}
	*/
	
	//ariana grande
	//Test Case 1
	/*@Given("^I can login to StockUnlimited$")
	public void I_can_login_to_StockUnlimited() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.stockunlimited.com/");
		driver.findElement(By.id("su-login")).click();
		driver.findElement(By.name("email")).sendKeys("trispangrib@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pangaribuan99");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/input[4]")).click();
		
	}
	
	@When("^I can enter the search box$")
	public void I_can_enter_the_search_box() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"search_word\"]")).sendKeys("ariana music");
		driver.findElement(By.xpath("//*[@id=\"search_box\"]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"search_box\"]/div/div[2]/span[4]/input")).click();
	}
	
	@Then ("^I can find ariana music$")
	public void I_can_find_ariana_music() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"search_box\"]/input[3]")).click();
	}
	*/
	
	//Test Case 2
	/*@Given("^I can login to StockUnlimited$")
	public void I_can_login_to_StockUnlimited() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.stockunlimited.com/");
		driver.findElement(By.id("su-login")).click();
		driver.findElement(By.name("email")).sendKeys("trispangrib@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pangaribuan99");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/input[4]")).click();
		
	}
	
	@When("^I can enter the search box$")
	public void I_can_enter_the_search_box() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"search_word\"]")).sendKeys("ariana grande");
		driver.findElement(By.xpath("//*[@id=\"search_box\"]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"search_box\"]/div/div[2]/span[4]/input")).click();
	}
	
	@Then ("^I can find ariana music$")
	public void I_can_find_ariana_music() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"search_box\"]/input[3]")).click();
	}
	*/
	
	
	//Sans-Serif
	//Test Case 1
	/*@Given("^I can login to StockUnlimited$")
	public void I_can_login_to_StockUnlimited() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.stockunlimited.com/");
		driver.findElement(By.id("su-login")).click();
		driver.findElement(By.name("email")).sendKeys("trispangrib@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pangaribuan99");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/input[4]")).click();
		
	}
	
	@When("^I can enter the search box$")
	public void I_can_enter_the_search_box() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"search_word\"]")).sendKeys("sans serif");
		driver.findElement(By.xpath("//*[@id=\"search_box\"]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"search_box\"]/div/div[2]/span[6]/input")).click();
	}
	
	@Then ("^I can find sans serif$")
	public void I_can_find_sans_serif() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"search_box\"]/input[3]")).click();
	}
	*/
	
	//Test Case 2
	@Given("^I can login to StockUnlimited$")
	public void I_can_login_to_StockUnlimited() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.stockunlimited.com/");
		driver.findElement(By.id("su-login")).click();
		driver.findElement(By.name("email")).sendKeys("trispangrib@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pangaribuan99");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/input[4]")).click();
		
	}
	
	@When("^I can enter the search box$")
	public void I_can_enter_the_search_box() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"search_word\"]")).sendKeys("Times New");
		driver.findElement(By.xpath("//*[@id=\"search_box\"]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"search_box\"]/div/div[2]/span[6]/input")).click();
	}
	
	@Then ("^I can find sans serif$")
	public void I_can_find_sans_serif() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"search_box\"]/input[3]")).click();
	}
	

}
