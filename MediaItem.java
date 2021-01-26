public abstract class MediaItem extends Item {
  private int runtime;
  
  public MediaItem(){
    runtime = 0;
  }
  public MediaItem(int id, String title, int numCopies, int r){
    super(id,title,numCopies);
    runtime = r;
  }
  public MediaItem(int id, String title, int numCopies){
    super(id, title, numCopies);
  }
  public MediaItem(MediaItem o){
    if(o == null){
      System.out.println("There is no item, null");
      System.exit(0);
    }
    runtime = o.runtime;
  }
  public int getId(){
    return super.getId();
  }
  public int getRuntime(){
    return runtime;
  }
  public String getTitle(){
    return super.getTitle();
  }
  public int getNumCopies(){
    return super.getNumCopies();
  }
  public void setRuntime(int r){
    runtime = r;
  }
  public boolean equals(MediaItem o){
    if(o instanceof MediaItem){
      System.out.println("There is item, null");
      return true;
    }
    else
      return runtime == o.runtime;
  }
  public void print(int id, String title, int numCopies){
    super.print(id, title, numCopies);
    System.out.println("RUNTIME: " + runtime + " minutes");
  }
  public String toString(){
    return "RUNTIME: " + runtime + "minutes";
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