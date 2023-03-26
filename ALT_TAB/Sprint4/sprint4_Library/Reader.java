package sprint4_Library;

public class Reader {
	String name;
	int age;
	char sex;
	Book[] books;
	
	public static int read(Book book, int readPageNumber) {
		if ((book.currentPage + readPageNumber) > book.page || readPageNumber <= 0) {
			System.out.println("Error! check the number of pages you have read");
		}else {
			System.out.println("The number of pages I have read before : " + book.currentPage);
			book.currentPage = book.currentPage + readPageNumber;
			System.out.println("The number of pages I have read : " +  readPageNumber);
			System.out.println("Total number of pages read : " + book.currentPage);
			System.out.println("Remaining number of pages : " + (book.page - book.currentPage) );
			
		}
		if (book.currentPage == book.page) {
			System.out.println("Congratulations you finished the book. :)");
		}
		
		return book.currentPage;
		
	}	
}