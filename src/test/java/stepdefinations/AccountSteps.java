package stepdefinations;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.AccountPage;
import com.pages.LoginPage;
import com.qa.Factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AccountSteps {
	
	private LoginPage lp = new LoginPage(DriverFactory.getDriver());
	private AccountPage accPage;
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable dataTable) {
		
		List<Map<String,String>> credList = dataTable.asMaps();
		String username = credList.get(0).get("username");
		String password = credList.get(0).get("password");
	    
	}

	@Given("user is on Accounts page")
	public void user_is_on_accounts_page1() {
		
	}

	@Given("user is on accounts page")
	public void user_is_on_accounts_page() {
	   
	}

	@Then("user gets account section")
	public void user_gets_account_section(DataTable dataTable) {
	    
		List<String> expAccountSectionList = dataTable.asList();
		System.out.println("Expected Account section list : "+expAccountSectionList);
		
		List<String> actualAccountSectionList = accPage.getAccountsSectionList();
		System.out.println("Expected Account section list : "+actualAccountSectionList);
		
		Assert.assertTrue(expAccountSectionList.containsAll(actualAccountSectionList));
	}

	@Then("accounts section count should be {int}")
	public void accounts_section_count_should_be(Integer int1) {
	   
	}


}
