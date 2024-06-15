package lab9.Prob3;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> map = new HashMap<>();

    /*
    addBook(String ISBN, String title, String author): This method should add a new book to the library book
    Hash collection.Display a message if ISBN exists in the library otherwise added into the library and
    display the confirmation.
     */
    public void addBook(String ISBN, String title, String author) {
        if (ISBN == null || title == null || author == null) {
            System.out.println("Invalid Input");
            return;
        }
        if (map.containsKey(ISBN)) {
            System.out.println(STR."ISBN :\{ISBN} is already listed");
            return;
        }
        map.put(ISBN, new Book(ISBN, title, author));
        System.out.println(STR."New book added. ISBN :\{ISBN}");
    }

    /*
    borrowBook(String ISBN):This method should only allow borrowing if the book is not already borrowed from
    the book collection. Check if the ISBN exists, and the book is not borrowed set the borrowed status true,
    otherwise handle display message to the user appropriately. Display the confirmation for the book issued.
     */
    public void borrowBook(String ISBN) {
        if (ISBN == null) {
            System.out.println("Invalid Input");
            return;
        }
        Book book = map.get(ISBN);
        if (book == null) {
            System.out.println("The book is not in the Library");
            return;
        }
        if (book.isBorrowed()) {
            System.out.println("This book was borrowed");
        } else {
            book.setBorrowed(true);
            System.out.println("The book has been borrowed");
        }
    }

    /*
    returnBook(String ISBN):This method should only allow returning if the book is currently borrowed books HashMap.
    Check if the ISBN exists, and the book is borrowed set the borrowed status false, otherwise handle display message
    to the user appropriately. Display the confirmation for the book returned.
     */
    public void returnBook(String ISBN) {
        if (ISBN == null) {
            System.out.println("Invalid Input");
            return;
        }
        Book book = map.get(ISBN);
        if (book == null) {
            System.out.println("The book is not in the Library");
            return;
        }
        book.setBorrowed(false);
        System.out.println("The book has been returned");
    }

    /*
    isBookBorrowed(String ISBN): This method should check if a book is currently borrowed.
     */
    public boolean isBookBorrowed(String ISBN) {
        if (ISBN == null) {
            System.out.println("Invalid Input");
            return false;
        }
        Book book = map.get(ISBN);
        if (book == null) {
            System.out.println("The book is not in the Library");
            return false;
        }
        System.out.print("The book is Borrowed: ");
        return book.isBorrowed();
    }

    /*
    getBookDetails(String ISBN): This method should return the details of a book by ISBN.
     */
    public void getBookDetails(String ISBN) {
        if (ISBN == null) {
            System.out.println("Invalid Input");
            return;
        }
        Book book = map.get(ISBN);
        if (book == null) {
            System.out.println("The book is not in the Library");
            return;
        }
        System.out.println(book);
    }

    /*
    listAllBooks():Iterates through the books HashMap and prints the details of each book
     */
    public void listAllBooks() {
        map.forEach((isbn, book) -> {
            System.out.println(book);
        });
    }

    /*
    listBorrowedBooks():Iterates through the books HashMap and prints the details of each borrowed book.
     */
    public void listBorrowedBooks() {
        map.forEach((isbn, book) -> {
            if (book.isBorrowed())
                System.out.println(book);
        });
    }
}
