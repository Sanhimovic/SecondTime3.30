package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionForFeature 
{
	public static WebDriver driver;
	
	
	@Given("open browser and enter test url")
	public void open_browser_and_enter_test_url() 
	{
	    System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	    driver=new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com");
	}

	@Then("login page is displayed")
	public void login_page_is_displayed() 
	{
	    String title = driver.getTitle();
	    Assert.assertEquals(title, "Facebook – log in or sign up");
	}

	@When("enter valid username and password")
	public void enter_valid_username_and_password() throws InterruptedException 
	{
	    driver.findElement(By.id("email")).sendKeys("admin");
	    Thread.sleep(2000);
	    driver.findElement(By.id("pass")).sendKeys("admin@123");
	}

	@And("click on login button")
	public void click_on_login_button() throws InterruptedException 
	{
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   Thread.sleep(2000);
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() 
	{
	   String hometitle = driver.getTitle();
	   Assert.assertEquals(hometitle, "Facebook Home Page");
	}
	
	
	
	
	
	
	
	
	
	
}
