class Sum<T extends Number>
{
  T a, b;
  Sum(T a, T b) {
    this.a = a;
    this.b = b;
  }
  int getSum() {
    return this.a + this.b;
  }
}
