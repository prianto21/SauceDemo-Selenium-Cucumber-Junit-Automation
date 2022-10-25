package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class logoutStep {
	WebDriver driver;

	@Given("Open Web url {string}")
	public void open_web_url(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@And("input Username {string} and password {string}")
	public void input_username_and_password(String username, String password) {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys(password);
	}

	@When("click login btn")
	public void click_login_btn() {
		driver.findElement(By.name("login-button")).click();
	}

	@And("click burger menu")
	public void click_burger_menu() {
		driver.findElement(By.id("react-burger-menu-btn")).click();
	}

	@And("click logout")
	public void click_logout() {
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	}

	@Then("user redirect to form login")
	public void user_redirect_to_form_login() {
		org.junit.Assert.assertTrue(driver.findElement(By.id("login_button_container")).isDisplayed());
		driver.close();
		driver.quit();
	}
}
