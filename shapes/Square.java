package shapes;

public class Square {
	private int length;
	
	public Square() {
	
	}
	
	public Square(int num) {
		length = num;
	}
	
	public int getArea() {
		return length * length;
	}
	
}
