package Actuality;

class TV{
	String manu;
	int year;
	int inch;
	public TV(String manu, int year, int inch) {
		this.manu = manu;
		this.year = year;
		this.inch = inch;
	}
	public void show() {
		System.out.println(manu+"에서 만든 "+year+"년형 "+inch+"인치 TV");
	}
}
public class Actuality4_1 {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}
