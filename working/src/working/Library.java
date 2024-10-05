package working;

import java.util.ArrayList;
import java.util.List;

public class Library {
    // List to store book names
    private List<String> books = new ArrayList<>();

    // Method to add a book to the library
    public void addBook(String bookName) {
        if (!bookName.trim().isEmpty()) {
            books.add(bookName);  // Add the book to the list
            System.out.println(bookName + " added to the library.");
        } else {
            System.out.println("Book name cannot be empty.");
        }
    }

    // Method to list all the books in the library
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (String book : books) {
                System.out.println("- " + book);  // Print each book name
            }
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create an instance of the Library class
        Library library = new Library();

        // Add books to the library
        library.addBook("The Great Gatsby");
        library.addBook("1984");
        library.addBook("To Kill a Mockingbird");

        // List all books in the library
        library.listBooks();
    }
}
