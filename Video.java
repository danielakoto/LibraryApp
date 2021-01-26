public class Video extends MediaItem {
  private String director;
  private String genre;
  private int year;
  
  public Video(){
    director = " ";
    genre = " ";
    year = 0;
  }
  public Video(int runtime, String d, String g, int y){
    super.getRuntime();
    director = d;
    genre = g;
    year = y;
  } 
  public Video(Video o){
    if(o == null){
      System.out.println("There is no item, null");
    }
    director = o.director;
    genre = o.genre;
    year = o.year;
  }
  public int getRuntime(){
    return super.getRuntime();
  }
  public String getDirector(){
    return director;
  }
  public String getGenre(){
    return genre;
  }
  public int getYear(){
    return year;
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
  public void setVideo(int runtime, String d, String g, int y){
    super.getRuntime();
    director = d;
    genre = g;
    year = y;
  }
  public boolean equals(Video o){
    if(o instanceof Video){
      System.out.println("There is item, null");
      return true;
    }
    else
      return director == o.director && genre == o.genre && year == o.year;
  }
  public void print(){
    super.print(getId(), getTitle(), getNumCopies());
    System.out.println("DIRECTOR: " + director);
    System.out.println("GENRE: " + genre);
    System.out.println("YEAR RELEASED: " + year);
  }
  public String toString(){
    return "DIRECTOR: " + director + "\nGENRE: " + genre + "\nYEAR RELEASED: " + year;
  }
}