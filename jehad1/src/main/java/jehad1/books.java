package jehad1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class books {
	
	String str ="Head First Java"; String str2 ="Ali Ahmad"; String str3 ="Ali99"; 
	boolean str_search=false;
	boolean str_searched=false;
	 ArrayList<ArrayList> strr = new ArrayList<ArrayList>();
	 ArrayList<String> book_def = new ArrayList<String>();
	
   
	public void search( String str_searching) {
		
		ArrayList<String>strr3;
		
		int searchListLength = strr.size();
		
		for (int i = 0; i < searchListLength; i++) {
			strr3=strr.get(i);
			for (int j = 0; j < 3; j++) {
				
		if (strr3.get(j).contains(str_searching)) {
			str_searched=true;
			return ;
		}
			}
	}
		}

	public boolean is_Found() {
		
		return str_search ;
		
	}

	public void adding_book(String st, String st2, String st3) {
		book_def.add(st);
		book_def.add(st2);
		book_def.add(st3);
		
		ArrayList<String>strr2;
		
		int searchListLength = strr.size();
		
		for (int i = 0; i < searchListLength; i++) {
			strr2=strr.get(i);
			for (int j = 0; j < 3; j++) {
				
		if (strr2.get(j).equals(book_def.get(j))) {
			str_search=true;
		return ;
		}
		
		}
			
		}
		
		strr.add(book_def);
		str_search=false;

		
		
	}

}
