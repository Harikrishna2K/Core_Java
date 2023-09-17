package libraryManagementSystem;

public class LibraryManagementSystem {
	
	public static void main(String[] args) {
		Library library = new Library();
		
		
		Book book = new Book("SampleBook1", "Hk", "Crime");
		Member m1 = new Member("Sample member", 55, 3);
		
		
		library.addBook(book);
		library.addMember(m1);
		
		
		System.out.println("Welcome to the Library Management System");
		System.out.println("Available Books");
		
		for(Book books : library.getBooks()) {
			books.displayInfo();
		}
	}
	

}
