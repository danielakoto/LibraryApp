public class CD extends MediaItem {
  private String artist;
  private String genre;
  
  public CD(){
    artist = " ";
    genre = " ";
  }
  public CD(int id, String title,int numCopies){
    super(id, title, numCopies);
  }
  public CD(int runtime, String a, String g){
    super.getRuntime();
    artist = a;
    genre = g;
  }
  public CD(CD o){
    if(o == null){
      System.out.println("There is no item, null");
      System.exit(0);
    }
    artist = o.artist;
    genre = o.genre;
  }
  public String getArtist(){
    return artist;
  }
  public String getGenre(){
    return genre;
  }
  public int getRuntime(){
    return super.getRuntime();
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
  public void setCD(int runtime, String a, String g){
    super.getRuntime();
    artist = a;
    genre = g;
  }
  public boolean equals(CD o){
    if(o instanceof CD){
      System.out.println("There is item, null");
      return true;
    }
    else
      return artist == o.artist && genre == o.genre;
  }
  public void print(){
    super.print(getId(), getTitle(), getNumCopies());
    System.out.println("ARTIST: " + artist);
    System.out.println("GENRE: " + genre);
  }
  public String toString(){
    return "ARTIST: " + artist + "\nGENRE: " + genre;
  }
}