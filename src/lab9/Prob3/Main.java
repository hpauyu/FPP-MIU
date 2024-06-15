package lab9.Prob3;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("1", "Good", "Hpauyu");
        library.listAllBooks();
        library.borrowBook("1");
        library.getBookDetails("1");
        library.listAllBooks();
        library.listBorrowedBooks();
        System.out.println(library.isBookBorrowed("1"));
        library.returnBook("1");
        System.out.println(library.isBookBorrowed("1"));
        library.listAllBooks();
        library.listBorrowedBooks();
        library.borrowBook(null);
    }
}
