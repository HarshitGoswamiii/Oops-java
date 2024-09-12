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

    public void showAvailableBooks() {
        for (String element : this.Books) {
            if (element == null) {
                continue;
            }
            System.out.println(element);
        }
    }
}

public class Library {
    public static void main(String[] args) {
        Shelf lib = new Shelf();
        lib.AddBook("Operating System");
        lib.showAvailableBooks();
    }
}