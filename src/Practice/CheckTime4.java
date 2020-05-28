package Practice;

public class CheckTime4 {
	public static class Construct{
		int x;
		public void setX(int x) {
			this.x = x;
		}
		public int getX() {
			return x;
		}
		public Construct(int x) {
			this.x = x;
		}
		public Construct() {
			
		}
		public static void main(String[] args) {
			Construct a = new Construct();
			int n = a.getX();
		}
	}
}
