class SingleObject{
  private static SingleObject obj;
  private SingleObject(){ }

  public static SingleObject get(){
    if(obj == null)
      obj = new SingleObject();
    return obj;
  }
}

class SingletonTest{
  public static void main(String[] args) {
    SingleObject obj = SingleObject.get();
    SingleObject obj1 = SingleObject.get();
    System.out.println(obj == obj1);
  }
}
