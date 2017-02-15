@FunctionalInterface
interface MyInterface<T extends Number>{
  T add(T x, T y);
}

@FunctionalInterface
interface CheckPositiveInterface<T extends Number>{
  Boolean check(T x);
}

@FunctionalInterface
interface CheckEvenInterface<T extends Number>{
  Boolean check(T x);
}

@FunctionalInterface
interface CheckPrimeInterface<T extends Number>{
  Boolean check(T x);
}

@FunctionalInterface
interface CheckPalindromeInterface<T extends Number>{
  Boolean check(T x);
}

@FunctionalInterface
interface FactorialInterface<T extends Number>{
  Integer cal(T x);
}

@FunctionalInterface
interface MathsFuctionsInterface<T extends Number>{
  String cal(T x, T y);
}

@FunctionalInterface
interface ReverseStringInterface{
  String reverse(String x);
}


class TestLambda{
  public static void main(String[] args) {
    MyInterface<Integer> ref1;
    // ref1 = (Integer x, Integer y) -> x + y;
    // ref1 = (x, y) -> {return x+y;};
    ref1 = (x, y) -> x+y;

    MyInterface<Double> ref2;
    // ref2 = (Double x, Double y) -> x + y;
    // ref2 = (x, y) -> {return x+y;};
    ref2 = (x, y) -> x+y;

    CheckPositiveInterface<Integer> ref3;
    ref3 = x -> {return (x<0)? false : true;};

    CheckEvenInterface<Integer> ref4;
    ref4 = x -> {return (x%2 == 0)? true : false;};

    CheckPrimeInterface<Integer> ref5;
    ref5 = x -> {
      for (int i = 2; i< x; i++) {
        if(x%i == 0)  return false;
      }
      return true;
    };

    CheckPalindromeInterface<Integer> ref6;
    ref6 = x -> {
      int y = x, num = 0, d = 0;
      while(x > 0){
        d = x%10;
        x = x/10;
        num = num*10 + d;
      }
      if(num == y)
        return true;
      return false;
    };

    FactorialInterface<Integer> ref7;
    ref7 = x -> {
      int i = 1, out = 1;
      while(i <= x)
        out *= i++;
      return out;
    };

    MathsFuctionsInterface<Integer> ref8;
    ref8 = (x, y) -> {
      return "Sum: " + (x + y) + "\nSubtraction: " + (x - y) + "\nMultiplication: " + (x * y) + "\nDivision: " + (x / y) + "\nModulus: " + (x % y);
    };

    // ReverseStringInterface ref9;
    // ref9 = x -> {
    //   String s;
    //   int i = x.length(), j = 0;
    //   while(i != 0){
    //     s[j++] = x[i--];
    //   }
    // };

    System.out.println("Add Integers: " + ref1.add(1,2));
    System.out.println("Add Double: " + ref2.add(1.2,2.1));
    System.out.println("Check Positive: " + ref3.check(-2));
    System.out.println("Check Even: " + ref4.check(31));
    System.out.println("Check Prime: " + ref5.check(31));
    System.out.println("Check Palindrome: " + ref6.check(313));
    System.out.println("Factorial: " + ref7.cal(10));
    System.out.println("Maths Operations:\n" + ref8.cal(10, 8));
  }
}
