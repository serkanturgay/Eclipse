package sprint4_Library;

public class ReaderTest {

	public static void main(String[] args) {
		Author author1 = new Author();
		Book book1 = new Book();
		Reader reader1 = new Reader();
		
		author1.name = "Victor" ;
		author1.surname = "Hugo" ;
		author1.books = new Book[260];
		author1.books[0] = book1;
		
		book1.author = author1;
		book1.title = "Nouvelles Odes";
		book1.type = "poetry";
		book1.page = 150;
		book1.isHardCover = false;
		book1.currentPage = 0;
		
		reader1.name = "ali";
		reader1.age = 23;
		reader1.sex = 'M';
		reader1.books = new Book[3];
		reader1.books[0] = book1;
		
		
		System.out.println("Book Title : " + reader1.books[0].title);
		System.out.println("Book Author : " + reader1.books[0].author.name + " " + reader1.books[0].author.surname);
		System.out.println("Page of the book : " + reader1.books[0].page);
		System.out.println("Book Type : " + reader1.books[0].type);
		System.out.println("Number of pages I have read : " + reader1.books[0].currentPage);
		System.out.println("Remaining number of pages : " + (reader1.books[0].page - reader1.books[0].currentPage));
		System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
		book1.currentPage = reader1.read(book1, 10);
		System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
		book1.currentPage = reader1.read(book1, 15);
		System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
		book1.currentPage = reader1.read(book1, 115);
		
		
	}

}
