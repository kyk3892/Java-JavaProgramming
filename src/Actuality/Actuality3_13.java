package Actuality;

public class Actuality3_13 {

	public static void main(String[] args) {
		
		for(int i=1; i<100; i++) {
			int share = i/10;
			int rest = i%10;
			if(share==3 || share==6 || share==9) {
				if(rest==3 || rest==6 || rest==9) {
					System.out.println(i+" ¹Ú¼ö Â¦Â¦");
				}
				else {
					System.out.println(i+" ¹Ú¼ö Â¦");
				}
			}
			if(rest==3||rest==6||rest==9) {
				System.out.println(i+" ¹Ú¼ö Â¦");
			}
		}

	}

}
