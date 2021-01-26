public abstract class WrittenItem extends Item {
  private String author;
  
  public WrittenItem(){
    super();
  }
  public WrittenItem(int id, String title, int numCopies){
    super(id, title, numCopies);
  }
  public WrittenItem(int id, String title, int numCopies, String a){
    super(id,title,numCopies);
    author = a;
  }
  public void setAuthor(String a){
    author = a;
  }
  public void copy(WrittenItem o){
    if(o == null){
      System.out.println("There is no item, null");
      System.exit(0);
    }
    author = o.author;
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
    return author;
  }
  public boolean equals(WrittenItem o){
    if(o instanceof WrittenItem){
      System.out.println("There is item, null");
      return true;
    }
    else
      return author == o.author;
  }
  public void print(int id, String title, int numCopies){
    super.print(id, title, numCopies);
    System.out.println("AUTHOR: " + author);
  }
  public String toString(){
    return "AUTHOR: " + author;
  }
  public void checkIn(){
    super.checkIn();
  }
  public void checkOut(){
    super.checkOut();
  }
  public void addItem(){
    super.addItem(getId(), getTitle(), getNumCopies());
  }
}