
public class PolymorphismDemo {

	public static void main(String[] args) {
		//Display circle and rectangle properties
		displayObject(new CircleFromSimpleGeometricObjecta(1,"red",false));
		displayObject(new RectangleFromSimpleGeometricObjecta(1,1,"black",true));
	}
	
//父类所定义的对象，可以直接表示子类 比如下面的SimpleGeometricObjecta object  用父类定义一个变量 但是后面也可表示一个子类。
	/**Display geometric object properties*/
	public static void displayObject(SimpleGeometricObjecta object) {
		System.out.println("Created on "+object.getDateCreated()+".Colour is "+object.getColor());
	}
}
