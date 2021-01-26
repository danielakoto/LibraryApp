public class JournalPaper extends WrittenItem {
  private int yearPublished;
  
  public JournalPaper(){
    yearPublished = 0;
  }
  public JournalPaper(String author, int y){
    super.getAuthor();
    yearPublished = y;
  }
  public JournalPaper(JournalPaper o){
    if(o == null){
      System.out.println("There is no item, null");
      System.exit(0);
    }
    yearPublished = o.yearPublished;
  }
  public int getYearPublished(){
    return yearPublished;
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
  public boolean equals(Book o){
    return super.equals(o);
  }
  public int setYearPublished(){
    return yearPublished;
  }
  public void setJournalPaper(){
    super.getId();
    super.getTitle();
    super.getNumCopies();
  }
  public void print(){
    super.print(getId(), getTitle(), getNumCopies());
    System.out.println("YEAR PUBLISHED " + yearPublished);
  }
  public String toString(){
    return "YEAR PUBLISHED " + yearPublished;
  }
}