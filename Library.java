class Shelf {
    String[] Books;
    int NumberOfBook;

    Shelf() {
        this.Books = new String[10];
        int NumberOfBook = 0;
    }

    // To Add the Book or Books in Available Library
    public void AddBook(String Book) {
        if (NumberOfBook >= Books.length) {
            System.out.println("The Library is Full ! There is no space to Add a Book");
        }
        Books[NumberOfBook] = Book;
        NumberOfBook++;
        System.out.println("The Book has Been Added !");
    }

    // For Showing the Avaiable Books
    public void showAvailableBooks() {
        System.out.println("Available Books : ");
        for (String element : this.Books) {
            if (element == null) {
                continue;
            }
            System.out.println(element);
        }
    }

    // For Issuing books
    public void IssueBook(String Book) {
        System.out.println("Books to be issued : " + Book);
        for (int i = 0; i <= Books.length; i++) {
            if (this.Books[i].equals(Book)) {
                System.out.println("This Book Has Been Issued ! ");
                this.Books[i] = null;
                return;
            }
        }
    }

    // For Returning Books
    public void ReturnBook(String Book) {
        System.out.println("Returning Book : " + Book);
        Books[NumberOfBook] = Book;
        NumberOfBook++;
        System.out.println("The Book has Been Added !");

    }
}

public class Library {
    public static void main(String[] args) {
        Shelf lib = new Shelf();

        // For adding A new Book
        lib.AddBook("Science");
        lib.AddBook("English");
        lib.AddBook("Hindi");
        lib.AddBook("Maths");
        System.out.println("");

        // for Showing the Available Bookds
        lib.showAvailableBooks();
        System.out.println("");

        // For displaying issue books
        lib.IssueBook("Hindi");
        System.out.println("");
        lib.showAvailableBooks();
        System.out.println("");

        // for returnng issued book
        lib.ReturnBook("Social");
        lib.ReturnBook("Hindi");
        System.out.println("");
        lib.showAvailableBooks();

    }
}