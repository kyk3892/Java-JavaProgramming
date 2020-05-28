package Practice;

public class Human {
	static String name;
	static int age;
	static double height,weight;
	
	public Human(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		Human aHuman = new Human(name);
		Human []array = new Human[5];
		name = "홍길동";
		age = 21;
		height = 180.5;
		weight = 73.2;
		aHuman.print();
	}
	public void print() {
		System.out.println("이름 : "+name+"\n나이 : "+age+"\n키 : "+height+"\n몸무게 : "+weight);
	}
}
