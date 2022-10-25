package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class loginStep {

	WebDriver driver;

	@Given("Open web url {string}")
	public void open_web_url(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}

	@And("input username {string} and password {string}")
	public void input_username_and_password(String username, String password) {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys(password);
	}

	@When("click login button")
	public void click_login_button() {
		driver.findElement(By.name("login-button")).click();
	}

	@Then("Should success login and redirect to homepage")
	public void should_success_login_and_redirect_to_homepage() {
		org.junit.Assert.assertTrue(driver.findElement(By.id("inventory_container")).isDisplayed());
		driver.close();
		driver.quit();
	}

	@Then("failed login and showing message")
	public void failed_login_and_showing_message() {
		org.testng.Assert.assertTrue(
				driver.findElement(By.xpath("//div[@class='error-message-container error']")).isDisplayed());
		driver.close();
		driver.quit();
	}
}
