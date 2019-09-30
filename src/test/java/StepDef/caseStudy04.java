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

public class caseStudy04 
{
	WebDriver driver=null;
	
	@Given("^User has registered into TestMeApp$")
	public void user_has_registered_into_TestMeApp() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.16\\Desktop\\browsers driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("devilseye");
		driver.findElement(By.id("password")).sendKeys("Password420");
		 driver.findElement(By.name("Login")).click();
	    
	}

	@When("^User search a particular product like Headphone$")
	public void user_search_a_particular_product_like_Headphone() throws Throwable 
	{
		WebElement search=driver.findElement(By.name("products"));
		 Actions act1=new Actions(driver);
		 act1.sendKeys(search,"head").perform();
		 Thread.sleep(3000);
		 act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	@When("^try to procced to payment without adding any item in the cart$")
	public void try_to_procced_to_payment_without_adding_any_item_in_the_cart() throws Throwable 
	{
	    try
	    {
	    	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a"));
	    }
	    catch(Exception e)
	    {
	    	System.out.println("no item found in cart");
	    }
	}

	@Then("^TestMeapp doesn't display the cart item$")
	public void testmeapp_doesn_t_display_the_cart_item() throws Throwable 
	{
	    driver.close();
	}

}
