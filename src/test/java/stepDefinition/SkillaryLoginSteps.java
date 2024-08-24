package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SkillaryLoginSteps {
	WebDriver driver;
	@Before
	public void beforeScenario()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Given("I enter login page")
	public void i_enter_login_page() {
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
	    driver.get("https://demoapp.skillrary.com/login.php?type=login");
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@When("I provide valid credetiales")
	public void i_provide_valid_credetiales() {
	    driver.findElement(By.name("email")).sendKeys("admin");
	    driver.findElement(By.id("password")).sendKeys("admin");
	
	}

	@And("I click on login")
	public void i_click_on_login() {
         driver.findElement(By.id("last")).click();
	}

	@Then("Home page opens")
	public void home_page_opens() {
		
	   WebElement admin= driver.findElement(By.xpath("//span[text()='SkillRary Admin']"));
        if(admin.isDisplayed())
        	System.out.println("Pass");
        else
        	System.out.println("Fail");
//        driver.quit();
        
	}
	@After
	public void AfterScenario(){
		driver.quit();
	}
	@When("^I provide (.*) and (.*)$")
	public void i_provide_admin_and_admin(String user,String pwd) {
		driver.findElement(By.name("email")).sendKeys(user);
	    driver.findElement(By.id("password")).sendKeys(pwd);
	}


}
