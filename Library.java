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

    public void IssueBook(String Book) {
        for (int i = 0; i <= Books.length; i++) {
            if (this.Books.equals(Book)) {
                System.out.println("This Book Has Been Issued ! ");
                this.Books[i] = null;
            }
        }
    }
}

public class Library {
    public static void main(String[] args) {
        Shelf lib = new Shelf();

        // For adding A new Book
        lib.AddBook("Operating System");
        System.out.println("");

        // for Showing the Available Bookds

        lib.showAvailableBooks();
        System.out.println("");

        // For displaying issue books
        lib.IssueBook("Operating System");

        lib.showAvailableBooks();
    }
}