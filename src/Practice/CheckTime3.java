package Practice;

public class CheckTime3 {

	public static void main(String[] args) {
		
		int num=0;
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				num+= i;
			}
		}
		System.out.println("1~100까지 3의 배수의 합 : "+num);
	}

}
