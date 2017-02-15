public class QSecond{
  private final String fName;
  private final String mName;
  private final String lName;
  private final String city;
  private final String state;
  private final String phone;

  private QSecond(NestedQSecond qs){
    this.fName = qs.fName;
    this.mName = qs.mName;
    this.lName = qs.lName;
    this.city = qs.city;
    this.state = qs.state;
    this.phone = qs.phone;
  }

  public static class NestedQSecond{
      private final String fName;
      private String mName;
      private String lName;
      private final String city;
      private String state;
      private final String phone;

      public NestedQSecond(String fName, String phone){
        this.fName = fName;
        this.phone = phone;
      }

      public NestedQSecond setMName(String mName){
        this.mName = mName;
        return this;
      }
      public NestedQSecond setLName(String lName){
        this.lName = lName;
        return this;
      }
      public NestedQSecond setAddress(String address){
        this.address = address;
        return this;
      }

      public QSecond build(){
        QSecond qs = new QSecond(this);
        return qs;
      }
  }
}
