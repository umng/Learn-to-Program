class Add<T extends Number>
{
	T x;
	T y;
	Add(T x, T y){
		this.x = x;
		this.y = y;
	}
	int add()
	{
		return x.intValue() + y.intValue();
	}
}
class GenericsDemo
{
	public static void main(String[] args) {
		Add<Integer> a = new Add<Integer>(10,20);
		System.out.println(a.add());
	}
}
