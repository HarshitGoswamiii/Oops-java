class library {
    String[] Books;
    int No_of_Books;

    library() {
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
        library lib = new library();
        lib.AddBook("Operating System");
    }
}