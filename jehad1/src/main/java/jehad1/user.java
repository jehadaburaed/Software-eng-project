package jehad1;

import java.util.*;

public class user {
	String ID;
	String name;
	String email;
	String address;
	String postal_code;
	String city;
	String password ="";
	ArrayList<books> borrowed_books = new ArrayList<books>();
	boolean max_borrowed = false;
	int borrowed_old;
	ArrayList<ArrayList> users = new ArrayList<ArrayList>();
	ArrayList<String> user_def = new ArrayList<String>();
	boolean str_search = false;
	boolean str_searched = false;
	String str_Searched = " ";

//	public user() {
//		this.ID = null;
//		this.name = null;
//		this.email = null;
//		this.address = null;
//		this.postal_code = null;
//		this.city = null;
//	}
//
//	public user(String ID, String name, String email, String address, String postal_code, String city) {
//		this.ID = ID;
//		this.name = name;
//		this.email = email;
//		this.address = address;
//		this.postal_code = postal_code;
//		this.city = city;
//	}

	public boolean Logged_in() {

		// error checking pass & id
		int searchListLength = users.size();

		for (int i = 0; i < searchListLength; i++) {
			ArrayList<String> tmp = new ArrayList<String>();
			tmp = users.get(i);
			for (int j = 0; j < 2; j++) {
				if (tmp.get(0).equals( )) {
					//str_searched = true;
					//str_Searched = tmp.get(2);
					for(int k=0 ; k < 7 ; k++) {
						if(tmp.get(1).equals( ))
						{
							
						}
					}
				}
				
			}

			if (str_searched) {
				is_Found();

			}

		}
	}

	// the login taking id & pass not just pass

	public void the_Login(String email, String id) {
		ID = id;
		this.email = email;
	}

	public void logout() {
		ID = "";
		email = "";
	}

	public void search(String str_searching) {
		int searchListLength = users.size();

		for (int i = 0; i < searchListLength; i++) {
			ArrayList<String> tmp = new ArrayList<String>();
			tmp = users.get(i);
			for (int j = 0; j < 6; j++) {

				if (tmp.get(j).contains(str_searching)) {
					str_searched = true;
					str_Searched = tmp.get(0);
				}
			}

			if (str_searched) {
				is_Found();
			}
		}
	}

	public boolean is_Found() {

		if (str_searched) {
			System.out.println("the user with ID " + str_Searched + " is found");

		}

		return str_searched;

	}

	public void addUser(String ID, String name, String email, String address, String postal_code,
			String city) {
		ArrayList<String> user_def = new ArrayList<String>();
		user_def.add(ID);
		user_def.add(name);
		user_def.add(email);
		user_def.add(address);
		user_def.add(postal_code);
		user_def.add(city);

		// miss_useing to strr & strr2 >> they are for books not users

		ArrayList<String> tmp;

		int searchListLength = users.size();

		for (int i = 0; i < searchListLength; i++) {
			tmp = users.get(i);
			for (int j = 0; j < 6; j++) {

				if (tmp.get(j).equals(user_def.get(j))) {
					str_search = true;
					return;
				}

			}

		}

		users.add(user_def);
		str_search = false;

	}

	public void set_max_borrowed(boolean m) {
		max_borrowed = m;
	}

	public boolean get_max_borrowed() {
		return max_borrowed;
	}

	public void add_borrow(books book) {
		borrowed_old = borrowed_books.size();
		
		if ( borrowed_old == 5 ){
			max_borrowed = true;
			
		}		
		else if(borrowed_old < 5)		
			borrowed_books.add(book);
	}

	public int get_borrowed_old() {
		return borrowed_old;
	}

	public int get_borrowed_size() {
		return borrowed_books.size();
	}

	public boolean is_Exist() {

		return str_search;

	}
}
