
//import java.util.*
public class Item {
  private int id;
  private String title;
  private int numCopies;
  
  public Item() {
    id = 0;
    title = " ";
    numCopies = 0;
  }
  public Item(int i, String t,int n){
    id = i;
    title = t;
    numCopies = n;
  }
  public Item(Item o){
    if(o == null){
      System.out.println("There is no item, null");
      System.exit(0);
    }
    id = o.id;
    title = o.title;
    numCopies = o.numCopies;
  }
  public int getId(){
    return id;
  }
  public String getTitle(){
    return title;
  }
  public int getNumCopies(){
    return numCopies;
  }
  public int setId(int i){
    return id = i;
  }
  public String setTitle(String t){
    return title = t;
  }
  public int setNumCopies(int n){
    return numCopies = n;
  }
  public void setAll(int i, String t, int n){
    id = i;
    title = t;
    numCopies = n;
  }
  public boolean equals(Object o){
    if(o == null){
      System.out.println("There is no item, null");
      return false;
    }
    Item other = (Item) o;
    return id == other.id && title == other.title && numCopies == other.numCopies;
  }
  public void print(int id, String title, int numCopies){
    System.out.println("ID: " + id);
    System.out.println("TITLE: " + title);
    System.out.println("NUMBER OF COPIES: " + numCopies);
  }
  public void checkIn(){
    numCopies = numCopies+1;
  }
  public void checkOut(){
    numCopies = numCopies-1;
  }
  public void addItem(int i, String t, int n){
    setId(id);
    setTitle(title);
    setNumCopies(numCopies);
  }
  public String toString(){
    return "ID: " + id + "\nTITLE: " + title + "\nNUMBER OF COPIES: " + numCopies;
  }
}