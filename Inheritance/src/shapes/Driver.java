package shapes;

public class Driver {

	public static void main(String[] args) {
		Shape ohyeah = new Shape();
		System.out.println(ohyeah.toString());
		
		Circle ohyeah2 = new Circle();
		System.out.println(ohyeah2.toString());

		Rectangle ohyeah3 = new Rectangle();
		System.out.println(ohyeah3.toString());
		
		
		Square ohyeah4 = new Square();
		ohyeah4.setSide(5);
		System.out.println(ohyeah4.toString());
		
	}

}
