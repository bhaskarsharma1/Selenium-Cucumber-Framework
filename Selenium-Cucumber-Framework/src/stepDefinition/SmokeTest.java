package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
	WebDriver driver;
	
	@Given("^Open chrome and start application$")
	public void open_chrome_and_start_application(){
		System.setProperty("webdriver.chrome.driver", "/Users/mukka/Desktop/Selenium Projects/chromedriver");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
	}

	@When("^I enter valid username and password$")
	public void i_enter_valid_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("bhaskar_21m@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("Panduiloveu@7");
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully(){
		driver.findElement(By.id("u_0_2")).click();
	}

}
