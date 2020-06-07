package Practice;

public class Value {
	public static int increase(int n) {
		n += 1;
		return n;
	}
	public static void main(String[] args) {
		int n = 10;
		increase(n);
		System.out.println(n);
	}
	public double getSum(double a[]) {
		double b=0;
		for(int i=0; i<a.length; i++) {
			b = a[i];
		}
		return b;
	}
}
