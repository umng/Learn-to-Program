class ThreadUsingLambda{
  public static void main(String[] args) {

    Thread odd = new Thread( () -> {
      for (int i = 1; i<=20 ; i+=2)
        System.out.print(i + "\t");
      System.out.println("");
    });

    Thread even = new Thread( () -> {
      for (int i = 2; i<=20 ; i+=2)
        System.out.print(i + "\t");
      System.out.println("");
    });

    odd.start();
    even.start();
  }
}
