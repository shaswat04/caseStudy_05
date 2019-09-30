package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class caseStudy01 {
	
	WebDriver driver=null;

	@Given("^the SignUp page is opened$")
	public void the_SignUp_page_is_opened() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.16\\Desktop\\browsers driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		
	}

	@When("^user click on signup$")
	public void user_click_on_signup() throws Throwable 
	{
		driver.findElement(By.linkText("SignUp")).click();
	}

	@When("^user enters details$")
	public void user_enters_details() throws Throwable 
	{
		driver.findElement(By.name("userName")).sendKeys("devilseye");
		driver.findElement(By.name("firstName")).sendKeys("Devils");
		driver.findElement(By.name("lastName")).sendKeys("eye");
		driver.findElement(By.name("password")).sendKeys("Password420");
		driver.findElement(By.name("confirmPassword")).sendKeys("Password420");
		driver.findElement(By.xpath("//input[@type='radio'][@value='Male']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("shaswat040@gmail.com");
		driver.findElement(By.name("mobileNumber")).sendKeys("9535381724");
		driver.findElement(By.name("dob")).sendKeys("04/11/1857");
		driver.findElement(By.name("address")).sendKeys("Bangalore");
		Select pc=new Select(driver.findElement(By.name("securityQuestion")));
		pc.selectByIndex(2);
		driver.findElement(By.name("answer")).sendKeys("red");
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();  
	}

	@Then("^user will finds login homepage$")
	public void user_will_finds_login_homepage() throws Throwable {
	   
	}

}
