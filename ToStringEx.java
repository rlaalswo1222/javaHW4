class Point22 {
	int x, y;

	public Point22(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "Point22(" + x + "," + y + ")";
	}
}

public class ToStringEx {
	public static void main(String[] args) {
		Point22 p = new Point22(2, 3);
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println(p + "입니다.");
	}
}