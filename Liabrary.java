import java.util.Scanner;
class Library{
    public String[] TotalBook = new String[10];
    String[] TotalBooks = {"Maths","Science","Geography","English","Hindi"};
    public String[] issuedBook = {};
    public String[] NewAddedArray = {};
    public void AddBooks(){
        System.out.print("Enter The Name of Book : ");
        Scanner B = new Scanner(System.in);
        String Book = B.nextLine();
        issuedBook[TotalBooks.length+1] =  Book; 
        System.out.println(issuedBook);
    }
    public void IssueBook(){
        
    }
    public void ReturnBooks(){
        
    }
    public void ShowAvailableBooks(){
        
    }
}

public class Liabrary {
    public static void main(String[] args) {
        Library l = new Library();
        l.AddBooks();
    }
}
