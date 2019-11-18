
public class PolymorphismDemo {

	public static void main(String[] args) {
		//Display circle and rectangle properties
		displayObject(new CircleFromSimpleGeometricObjecta(1,"red",false));
		displayObject(new RectangleFromSimpleGeometricObjecta(1,1,"black",true));
	}
	
	
	/**Display geometric object properties*/
	public static void displayObject(SimpleGeometricObjecta object) {
		System.out.println("Created on "+object.getDateCreated()+".Colour is "+object.getColor());
	}
}
