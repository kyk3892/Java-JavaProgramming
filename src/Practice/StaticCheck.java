package Practice;


public class StaticCheck {
	int s;
	static int t;
	public static void main(String[] args) {
		StaticCheck.t = 10;
//		StaticCheck.s = 20;
		System.out.println(StaticCheck.t);
//		System.out.println(StaticCheck.s);
		StaticCheck obj = new StaticCheck();
		obj.s = 30;
		obj.t= 40;
		System.out.println(obj.s);
		System.out.println(obj.t);

	}

}
