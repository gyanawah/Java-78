
public class AbsTest {

	public static void main(String[] args) {
		Shape shape = null;
		//shape = new Shape(); //cannot instantiate the type Shape
		
		shape = new Rectangle("Blue",12,8);
		System.out.println("Color = " + shape.getColor());
		shape.setColor("Red");
		System.out.println("Color = " + shape.getColor());
		shape.area();
		
		shape = new Circle("Green", 12.5f);
		shape.area();
	}
}
