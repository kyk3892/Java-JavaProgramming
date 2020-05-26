package Actuality;

import java.util.Scanner;

public class Actuality3_8 {

	public static void main(String[] args) {
		System.out.print("정수 몇 개?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int array[] = new int[num];
		
		for(int i=0; i<num;i++) {
			int ran = (int)(Math.random()*100+1);
			
			if(exists(array,i,ran)) {
				i--;
				continue;
			}
			array[i]=ran;
		}
		
		for(int i=0; i<num; i++) {
			if(i==0){
				System.out.print(array[i]+" ");
			}
			else {
				if(i%10==0) {
					System.out.println();
				}
				System.out.print(array[i]+" ");
					
			}
				
		}

	}

	public static boolean exists(int[] array, int i, int ran) {
		for(int j=0; j<i; j++) {
			if(array[j]==ran) {
				return true;
			}
		}
		return false;
	}

}
