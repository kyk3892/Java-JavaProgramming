package Practice;

public class Practice4_5 {
	public static class Book{
		String title;
		String author;
		
		public Book() {
			this("빈 제목","빈 작가"); //this() 메소드는 항상 첫번째줄에 위치
			System.out.println("생성자 호출됨");
		}
		public Book(String title) {
			this(title, "작자미상");
		}
		public Book(String title, String author) {
			this.title = title;
			this.author = author;
		}
		public void show() {
			System.out.println(title+" "+author);
		}
		public static void main(String[] args) {
			Book littlePrince = new Book("어린왕자", "생텍쥐페리");
			Book lovestory = new Book("춘향전");
			Book emptyBook = new Book();
			littlePrince.show();
			lovestory.show();
			emptyBook.show();
		}
	}
}
