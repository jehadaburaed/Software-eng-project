package jehad.acceptance_tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Borrow_a_book_test {
	jehad1.user user1;
	jehad1.books book;

	public Borrow_a_book_test() {
		
		user1 = new jehad1.user();
		book = new jehad1.books();

	}

	@Given("that the user is logged in")
	public void thatTheUserIsLoggedIn() {
		user1.the_Login("adminadmin");
	}

	@Given("the user has borrowed less than the maximum")
	public void theUserHasBorrowedLessThanTheMaximum() {
		user1.set_max_borrowed(false);
	}
	
	

	@Given("the user has borrowed the maximum number of books")
	public void theUserHasBorrowedTheMaximumNumberOfBooks() {
		user1.set_max_borrowed(true);		
	}
	

	@Given("that the user is logged out")
	public void thatTheUserIsLoggedOut() {
		user1.logout();		
	}


	@When("the user has borrow a book from the library")
	public void theUserIsBorrowABookFromTheLibrary() {
		user1.add_borrow(book);
	}

	@Then("Borrowing completed successfully")
	public void borrowingCompletedSuccessfully() {
		user1.add_borrow(book);
		assertTrue(user1.get_borrowed_old()<user1.get_borrowed_size());
		assertFalse(user1.get_max_borrowed());
	}

}
