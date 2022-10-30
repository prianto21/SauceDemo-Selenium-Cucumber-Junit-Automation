package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ShoppingCartStep {
	WebDriver driver=null;
	
	@Given("Open webb url {string}")
	public void open_webb_url(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("input usernamee {string} and password {string}")
	public void input_usernamee_and_password(String username, String password) {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys(password);
	}

	@When("click loginn button")
	public void click_loginn_button() {
		driver.findElement(By.name("login-button")).click();
	}

	@Then("Should sucess login and redirect to homepage")
	public void should_sucess_login_and_redirect_to_homepage() {
		org.junit.Assert.assertTrue(driver.findElement(By.id("inventory_container")).isDisplayed());
	}

	@When("user select and click product")
	public void user_select_and_click_product() {
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	}

	@And("click shopping cart logo")
	public void click_shopping_cart_logo() {
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	}

	@And("click checkout")
	public void click_checkout() {
		driver.findElement(By.id("checkout")).click();
	}

	@And("input FirstName,LastName,and Zip\\/Postal Code")
	public void input_first_name_last_name_and_zip_postal_code() {
		driver.findElement(By.id("first-name")).sendKeys("melsi");
		driver.findElement(By.id("last-name")).sendKeys("gogo");
		driver.findElement(By.id("postal-code")).sendKeys("123123");
	}

	@And("click continue")
	public void click_continue() {
		driver.findElement(By.id("continue")).click();
	}

	@And("click finish")
	public void click_finish() {
		driver.findElement(By.id("finish")).click();
	}

	@Then("show checkout: complete")
	public void show_checkout_complete() {
		org.junit.Assert.assertTrue(driver.findElement(By.id("checkout_complete_container")).isDisplayed());
		driver.close();
		driver.quit();
	}
	
	
	@When("remove product")
	public void remove_product() {
	driver.findElement(By.id("remove-sauce-labs-backpack")).click();
	}

	@Then("product remove")
	public void product_remove() {
		driver.findElement(By.xpath("//div[@class='cart_list']")).isDisplayed();
		driver.close();
		
	}

	@When("input LastName,Zip\\/Postal code")
	public void input_last_name_zip_postal_code() {
		driver.findElement(By.id("last-name")).sendKeys("gogo");
		driver.findElement(By.id("postal-code")).sendKeys("123123");
		
	}

	@Then("show message Error: First Name is required")
	public void show_message_error_first_name_is_required() {
		org.junit.Assert.assertTrue(driver.findElement(By.xpath("//h3[@data-test='error']")).isDisplayed());
		driver.close();
	}

	@When("input FirstName,Zip\\/Postal code")
	public void input_first_name_zip_postal_code() {
		driver.findElement(By.id("first-name")).sendKeys("melsi");
		driver.findElement(By.id("postal-code")).sendKeys("123123");
	}

	@Then("Show there is message Error: Last Name is required")
	public void show_there_is_message_error_last_name_is_required() {
		org.junit.Assert.assertTrue(driver.findElement(By.xpath("//h3[@data-test='error']")).isDisplayed());
		driver.close();
	}

	@When("input FirstName,LastName")
	public void input_first_name_last_name() {
		driver.findElement(By.id("first-name")).sendKeys("melsi");
		driver.findElement(By.id("last-name")).sendKeys("gogo");
	}

	@Then("there is message Error: Postal Code is required")
	public void there_is_message_error_postal_code_is_required() {
		org.junit.Assert.assertTrue(driver.findElement(By.xpath("//h3[@data-test='error']")).isDisplayed());
		driver.close();
	}

}
