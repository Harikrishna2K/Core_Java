package libraryManagementSystem;

public class Book implements Borrowable {
	
	String title;
	String author;
	String genre;
	
	
	
	public Book(String title, String author, String genre) {
		super();
		this.title = title;
		this.author = author;
		this.genre = genre;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public void borrowing() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void returing() {
		// TODO Auto-generated method stub
		
	}


	public void add(Book books) {
		// TODO Auto-generated method stub
		
	}
	
	public void displayInfo() {
		
		System.out.println("The title is: " + getTitle());
		System.out.println("The author is: " + getAuthor());
		System.out.println("The genre is: " + getGenre());
		//System.out.println("The title is: " + getTitle());
		
		
		
		
	}
	
	

}

class item extends Book{
	
	String CDs;
	String DVDs;
	
	public item(String title, String author, String genre, String CDs, String DVDs) {
		super(title, author, genre);
		this.CDs = CDs;
		this.DVDs = DVDs;
		
	}
	
	
	
	public void displayInfo() {
		System.out.println("The Author name " + super.author);
		System.out.println("The Title of the books: "+ super.title);
	
	}
}
