package Practice;

public class Practice3_11 {

	public static void main(String[] args) {
		char movie[][] = new char [5][]; //문자로 받아야됨
		movie[0] = new char [7];
		movie[1] = new char [5];
		movie[2] = new char [5];
		movie[3] = new char [7];
		movie[4] = new char [10];
		
		System.out.println("영화관 자리");
		System.out.println();
		for(int i=0; i<movie.length; i++) {
			for(int j=0; j<movie[i].length; j++) {
				movie[i][j] = (char)(j+'A');
				System.out.print(movie[i][j]+" ");
			}
			System.out.println();
		}
	}

}
