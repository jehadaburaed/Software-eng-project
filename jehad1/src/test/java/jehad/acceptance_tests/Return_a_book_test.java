package jehad.acceptance_tests;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Return_a_book_test {
	
	@Given("that the user is logged in")
	public void thatTheUsserIsLoggedIn() {
	   
	}
	
	@Given("the user is borrowed the book with title {string}, author {string}, and signature {string}")
	public void theUserIsBorrowedTheBookWithTitleAuthorAndSignature(String string, String string2, String string3) {
	    
	}
	@When("the user is return the book to the library")
	public void theUserIsReturnTheBookToTheLibrary() {
	   
	}
	@Then("returning completed successfully")
	public void returningCompletedSuccessfully() {
	    
	}

	@Given("the user is not borrowed the book with title {string}, author {string}, and signature {string}")
	public void theUserIsNotBorrowedTheBookWithTitleAuthorAndSignature(String string, String string2, String string3) {
	   
	}
	@Given("that the user is logged out")
	public void thatTheeUserIsLoggedOut() {
	  
	}
	@Then("the error message {string} is given")
	public void theErrorMessageIsGiiven(String string) {
	  
	}








}  
