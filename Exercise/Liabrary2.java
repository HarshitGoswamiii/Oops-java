class Library {
    private String availableBooks[];
    private String issueBooks[];
    private int availableBooksCount;
    private int issueBooksCount;

    public Library(int capacity) {
        availableBooks = new String[capacity];
        issueBooks = new String[capacity];
        availableBooksCount = 0;
        issueBooksCount = 0;

    }

    public void addBook(String book) {
        if (availableBooksCount < availableBooks.length) {
            availableBooks[availableBooksCount] = book;
            availableBooksCount++;
        } else {
            System.out.println("Library is full.");
        }
    }

    private int searchBook(String books[], int Count, String book) {
        for (int i = 0; i < Count; i++) {
            if (books[i].equals(book)) {
                return i;
            }
        }
        return -1;
    }

    public void issueBooks(String book) {
        int BookIndex = searchBook(availableBooks, availableBooksCount, book);
        if (BookIndex != -1) {
            issueBooks[issueBooksCount] = book;
            issueBooksCount++;

            for (int i = BookIndex; i < availableBooksCount - 1; i++) {
                availableBooks[i] = availableBooks[i + 1];
            }
            availableBooks[availableBooksCount - 1] = null;
            availableBooksCount--;

            System.out.println(book + " has been issued.");
        } else {
            System.out.println(book + "  is not available in the library.");
        }
    }

    public void returnBooks(String book) {
        int BookIndex = searchBook(issueBooks, issueBooksCount, book);
        if (BookIndex != -1) {
            if (availableBooksCount < availableBooks.length) {
                availableBooks[availableBooksCount] = book;
                availableBooksCount++;

                for (int i = BookIndex; i < issueBooksCount - 1; i++) {
                    issueBooks[i] = issueBooks[i + 1];
                }
                issueBooks[issueBooksCount - 1] = null;
                issueBooksCount--;

                System.out.println(book + " has been returned.");
            } else {
                System.out.println("Library is full");
            }

        } else {
            System.out.println(book + " was not issued.");
        }
    }

    public void showAvailableBooks() {
        if (availableBooksCount == 0) {
            System.out.println("No book are available.");
        } else {
            System.out.println("Available Books are :");
            for (int i = 0; i < availableBooksCount; i++) {
                System.out.println(availableBooks[i]);
            }
        }
    }
}

public class Liabrary2 {
    public static void main(String[] args) {
        Library lib = new Library(10);

        // Adding Books
        lib.addBook("Operating System");
        lib.addBook("Computer Graphics");

        // Show available books
        lib.showAvailableBooks();
        // Issue Book
        lib.issueBooks("Operating System");

        // show avaiable books after issue

        lib.showAvailableBooks();

        // Return Book
        lib.returnBooks("Operating System");

        // Show Available books after returning

        lib.showAvailableBooks();
    }
}
