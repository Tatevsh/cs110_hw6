package shapes;

public class Rectangle {

	private int width, height;
	public Rectangle() {
	
	}
	
	public Rectangle(int num1, int num2) {
		width = num1;
		height = num2;
	}
	
	public int getArea(){
		return width * height;
	}
}
