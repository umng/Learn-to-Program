public class BuildDemo{
  public static void main(String[] args) {
    MyName n1 = new MyName.NestMyName("Umang").build();
    System.out.println(n1);

    MyName n2 = new MyName.NestMyName("Umang").lName("Patel").build();
    System.out.println(n2);
  }
}
