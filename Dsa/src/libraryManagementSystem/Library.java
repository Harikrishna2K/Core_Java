package libraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {

	List<Book> books = new ArrayList<Book>();
	List<Member> members = new ArrayList<Member>();
	
	
	public void addBook(Book books) {
		books.add(books);
	}
	
	public void addMember(Member members) {
		members.add(members);
	}

	public List<Book> getBooks(){
		return books;
	}
	
}
