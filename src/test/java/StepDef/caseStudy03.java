package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class caseStudy03 
{
	WebDriver driver=null;
	
	@Given("^the login page is opened$")
	public void the_login_page_is_opened() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.16\\Desktop\\browsers driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("^user enter devilseye as username$")
	public void user_enter_devilseye_as_username() throws Throwable 
	{
		driver.findElement(By.name("userName")).sendKeys("devilseye");
	}

	@When("^user enters Password(\\d+) as password$")
	public void user_enters_Password_as_password(int arg1) throws Throwable 
	{
	    driver.findElement(By.id("password")).sendKeys("Password420");
	}

	@Then("^user will finds a testapp homepage to search$")
	public void user_will_finds_a_testapp_homepage_to_search() throws Throwable 
	{
		 driver.findElement(By.name("Login")).click(); 
	     WebElement search=driver.findElement(By.name("products"));
		 Actions act1=new Actions(driver);
		 act1.sendKeys(search,"bag").perform();
		 Thread.sleep(3000);
		 act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();	 
	}
}
