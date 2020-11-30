package StepDefintion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Lets_code_it_loginpage {
	
	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() throws Exception {
		System.out.println("browser is open");
		System.setProperty("WebDriver.gecko.driver", System.getProperty("user.dir")+"\\Cucumber_java\\Driver\\geckodriver.exe");
	   	   driver = new FirefoxDriver();
	   	   
	   	   driver.get("https://letskodeit.teachable.com/");
	   	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   	   driver.manage().window().maximize();
	   	   Thread.sleep(5000);
		
	}

	@And("user is on Lets code it page")
	public void user_is_on_Lets_code_it_page() {
	  driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		
	}

	@Then("user is navigated to the login page")
	public void user_is_navigated_to_the_login_page() {
		System.out.println("user navigated to the loginpage");
		
		String text =driver.findElement(By.xpath("//h1[contains(text(),\"Log In to Let's Kode It\")]")).getText();
		System.out.println(text);
		
		
	}





}
