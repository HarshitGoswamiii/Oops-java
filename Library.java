class Shelf {
    String[] Books;
    int No_of_Books;

    Shelf() {
        this.Books = new String[10];
        int No_of_Books = 0;
    }

    // To Add the Book or Books in Available Library
    public void AddBook(String Book) {
        Books[No_of_Books] = Book;
        No_of_Books++;
        System.out.println("The Book has Been Added !");
    }
}

public class Library {
    public static void main(String[] args) {
        Shelf lib = new Shelf();
        lib.AddBook("Operating System");
    }
}