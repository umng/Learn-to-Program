public class MyName{
  private final String fName;
  private final String lName;

  private MyName(NestMyName ref){
    this.fName = ref.fName;
    this.lName = ref.lName;
  }

  public String toString(){
    return this.fName + " " + this.lName;
  }

  public static class NestMyName{
    private final String fName;
    private String lName;

    public NestMyName(String fName){
      this.fName = fName;
    }

    public NestMyName lName(String lName){
      this.lName = lName;
      return this;
    }

    public MyName build(){
      MyName mn = new MyName(this);
      return mn;
    }
  }
}
