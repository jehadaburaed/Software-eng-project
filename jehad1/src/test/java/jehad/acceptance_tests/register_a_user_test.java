  package jehad.acceptance_tests;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class register_a_user_test {
	jehad1.admin_user admin_user ;
	jehad1.user user1;
	
	public register_a_user_test(){
		admin_user = new jehad1.admin_user();		
	}
	
	@Given("that the administrator is not logged in")
public void thatTheAdministratorrIsNotLoggedIn() {
     
     
}
	
	@Given("there is a user with  ID {string}, name {string}, email {string},address {string},postal code {string}, and city {string}")
	public void thereIsAUserWithIDNameEmailAddressPostalCodeAndCity(String string, String string2, String string3, String string4, String string5, String string6) {
		user1 = new jehad1.user();
		user1.addUser(string, string2, string3, string4, string5, string6);	
	}
	
	@Given(" the administrator is loggeed in")
	public void thatTheeAdministratorrIsLoggedIn() {
	   
	}
	@When("the user is registered to the library")
	public void TheUserIsRegisteredToTheLibrary() {
		user1.is_Exist();
	}
	
	@Then("the user with ID {string}, name {string}, email {string},address {string},postal code {string}, and city {string} is registered to the library")
	public void theUserWithIDNameEmailAddressPostalCodeCityIsRegisteredToTheLibrary(String string, String string2, String string3, String string4, String string5, String string6) {
		user1  = new jehad1.user() ;
		 user1.addUser(string, string2, string3, string4, string5, string6);
		assertEquals(user1.is_Exist() , false );
		 user1.search(string2);
		assertEquals( user1.is_Found() , true );
	}
	
	
	@Then(" errror message {string} is given")
public void theErrorMassageIsGivenn(String string) {
    
}



	

} 
