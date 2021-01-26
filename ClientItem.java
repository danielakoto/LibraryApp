//import java.util.*;
public class ClientItem {
  public static void main (String[]args){
    //Scanner kb = new Scanner (System.in);
    Book book1 = new Book(12345, "Hello Martha", 5);
    book1.print();
    book1.checkOut();
    book1.setAuthor("Me");
    System.out .println("After the book was checked-out, the number of copies changed. The new info is:");
    book1.print();
    
    CD cd1 = new CD();
    cd1.setCD(2, "Larry", "More Money");
    cd1.setTitle("STFU");
    cd1.setId(98765);
    cd1.setNumCopies(10);
    cd1.setRuntime(3);
    cd1.setAll(54321, "Again?", 2);
    cd1.print();
    
    Video vd1 = new Video();
    vd1.setVideo(192, "My Brother", "COMEDY ", 1998);
    vd1.setAll(54541, "Beta", 234);
    vd1.setRuntime(5);
    vd1.print();
    System.out .println("After a new copy of this book was added, the number of copies changed. The new info is:");
    vd1.addItem();
    vd1.print();
    
    JournalPaper jp1 = new JournalPaper("The Walking Dog", 1960);
    jp1.setAll(9876, "Beta 2", 300);
    jp1.print();
  }
}