
public class Calc {
	@Deprecated
	int squre(int a) {
		return a*a;
	}
	
	int exponential(int base, int power) {
		int out = 1;
		for(int i=0; i < power; i++)
			out *= base;
		return out;
	}
}
