package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class filterStep {
	WebDriver driver;
	@Given("Open webb urll {string}")
	public void open_webb_urll(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}

	@When("input usernamee {string} andd password {string}")
	public void input_usernamee_andd_password(String username, String password) {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys(password);
	}

	@When("clickk login button")
	public void clickk_login_button() {
		driver.findElement(By.name("login-button")).click();
	}

	@Then("Should success loginn and redirect to homepage")
	public void should_success_loginn_and_redirect_to_homepage() {
		org.junit.Assert.assertTrue(driver.findElement(By.id("inventory_container")).isDisplayed());
	}

	@When("user select kategori Name \\(A to Z)")
	public void user_select_kategori_name_a_to_z() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user homepage select by Name A to Z")
	public void user_homepage_select_by_name_a_to_z() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user select kategori Name \\(Z to A)")
	public void user_select_kategori_name_z_to_a() {
//		select kategori
		driver.findElement(By.xpath("//select[@data-test='product_sort_container']")).click();
		driver.findElement(By.xpath("//option[@value='lohi']")).click();
	}

	@Then("user homepage select by Name Z to A")
	public void user_homepage_select_by_name_z_to_a() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user select kategori Price \\(low to high)")
	public void user_select_kategori_price_low_to_high() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user homepage select by Price low to high")
	public void user_homepage_select_by_price_low_to_high() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user select kategori Price \\(high to low)")
	public void user_select_kategori_price_high_to_low() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user homepage select by Price high to low")
	public void user_homepage_select_by_price_high_to_low() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
