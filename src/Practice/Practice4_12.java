package Practice;

import java.util.Scanner;

class CurrencyConverter{
	private static double rate; //1$에 대한 원화
	public static double toDollar(double won) {
		return won/rate; //원화를 달러로 변환
	}
	public static double toKWR(double dollar) {
		return dollar * rate;
	}
	public static void setRate(double r) {
		rate = r; //환율 설정
	}
}
public class Practice4_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("환율(1달러)>> ");
		double rate = sc.nextDouble();
		CurrencyConverter.setRate(rate); //미국 달러 환율 설정
		System.out.println("백만원은 $"+CurrencyConverter.toDollar(1000000)+"입니다.");
		System.out.println("$100는 "+CurrencyConverter.toKWR(100)+"원입니다.");
	}

}
