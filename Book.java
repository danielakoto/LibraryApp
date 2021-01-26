public class Book extends WrittenItem {

  public Book(){
    super();
  }
  public Book(int id, String title,int numCopies){
    super(id, title, numCopies);
  }
  public void setBook(){
    super.getId();
    super.getTitle();
    super.getNumCopies();
  }
  public int getId(){
    return super.getId();
  }
  public String getTitle(){
    return super.getTitle();
  }
  public int getNumCopies(){
    return super.getNumCopies();
  }
  public String getAuthor(){
    return super.getAuthor();
  }
  public boolean equals(Object o){
    if(o == null)
      return false;
    Book a = (Book) o;
    return super.equals(a);
  }
  public void print(){
    System.out.println("Display info about this Book: ");
    super.print(getId(), getTitle(), getNumCopies());
  }
  public String toString(){
    return super.toString();
  }
}