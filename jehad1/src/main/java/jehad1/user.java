package jehad1;

import java.util.*;

public class user {
	String ID;
	String name;
	String email;
	String address;
	String postal_code;
	String city;
	String password = "";
	ArrayList<books> borrowed_books = new ArrayList<books>();
	boolean max_borrowed = false;
	int borrowed_old ;
	ArrayList<ArrayList> strr = new ArrayList<ArrayList>();
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
		
		if (password == "adminadmin")
			return true;
		else
			return false;
	}
	
	// the login taking id & pass not just pass 

	public void the_Login(String strr) {

		password = strr;
	}

	public void logout() {
		password = "";

	}

	public void search(String str_searching) {
		int searchListLength = strr.size();

		for (int i = 0; i < searchListLength; i++) {
			ArrayList<String> strr3 = new ArrayList<String>();
			strr3 = strr.get(i);
			for (int j = 0; j < 3; j++) {

				if (strr3.get(j).contains(str_searching)) {
					str_searched = true;
					str_Searched = strr3.get(2);

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

	public void addUser(String ID, String name, String email, String address, String postal_code, String city) {
		ArrayList<String> user_def = new ArrayList<String>();
		user_def.add(ID);
		user_def.add(name);
		user_def.add(email);
		user_def.add(address);
		user_def.add(postal_code);
		user_def.add(city);
		
		// miss_useing to strr & strr2 >> they are for books not users  

		ArrayList<String> strr2;

		int searchListLength = strr.size();

		for (int i = 0; i < searchListLength; i++) {
			strr2 = strr.get(i);
			for (int j = 0; j < 3; j++) {

				if (strr2.get(j).equals(user_def.get(j))) {
					str_search = true;
					return;
				}

			}

		}

		strr.add(user_def);
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
		// if ( borrowed_old<max_borrowed )   >>> else sys.out....
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
