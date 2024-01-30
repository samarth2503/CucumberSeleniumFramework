package stepdefinations;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.Factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private String title;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		DriverFactory.getDriver().get("http://www.automationpractice.pl/index.php");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		
		title = loginPage.getLoginPageTitle();
		System.out.println("login page title is : "+title);
	    
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedtitleName) {
		
		Assert.assertTrue(title.contains(expectedtitleName));
	    
	}

	@Then("forgot password link should be displayed")
	public boolean forgot_password_link_should_be_displayed() {
		
		return loginPage.isForgotPasswordLinkExist();
	    
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		
		loginPage.enterPassword(username);
	    
	}

	@When("users enters password {string}")
	public void users_enters_password(String password) {
		
		loginPage.enterPassword(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		
		loginPage.clickOnLogin();	   
	}

	@Then("user gets title of the home page")
	public void user_gets_title_of_the_home_page() {
		
		//Assert
	  
	}
	
	

}
