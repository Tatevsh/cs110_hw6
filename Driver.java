import shapes.Square;
import utils.Math;
import shapes.Rectangle;

public class Driver {

	public static void main(String[] args) {
		Square square1 = new Square(100);
		System.out.println(square1.getArea());
		
		Rectangle rect1 = new Rectangle(50, 80);
		System.out.println(rect1.getArea());
		
		System.out.println(Math.factorial((int)(15.6)));
		System.out.println(Math.factorialLoop((int)(15.6)));
	}

}
