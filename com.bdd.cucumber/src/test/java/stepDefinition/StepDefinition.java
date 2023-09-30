package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	
	@Given("User navigates to Home Page")
	public void user_navigates_to_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		 System.out.println("hello");
		
	}
	@When("User enters UserName and Password")
	public void user_enters_user_name_and_password() {
		
		driver.findElement(By.xpath(".//input[@name='userName']")).sendKeys("admin");
		driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("admin");
	    
	}
	@When("User clicks on Submit button")
	public void user_clicks_on_submit_button() {
		driver.findElement(By.xpath(".//input[@name='submit']")).click();
		
	}
	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
	
		driver.findElement(By.xpath(".//h3[text()='Login Successfully']")).isDisplayed();
		
		driver.quit();
		
	}


	

	
	
	
	
	
	
	
	

}
