
public class CastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create and initialize two objects
		Object object1=new CircleFromSimpleGeometricObjecta(1);
		Object object2=new RectangleFromSimpleGeometricObjecta(1,1);
		
		//Display circle and rectangle
		displayObject(object1);
		displayObject(object2);
	}
//先确定是CircleFromSimpleGeometricObjecta 然后在对其进行转换 进行相应的方法操作
	/**A method for displaying an object*/
	public static void displayObject(Object object) {
		if(object instanceof CircleFromSimpleGeometricObjecta) {
			System.out.println("The circle area is "+((CircleFromSimpleGeometricObjecta)object).getArea());
			System.out.println("The circle diameter is "+((CircleFromSimpleGeometricObjecta)object).getDiameter());
		}
		else if(object instanceof RectangleFromSimpleGeometricObjecta) {
			System.out.println("The rectangle area is "+((RectangleFromSimpleGeometricObjecta)object).getArea());
		}
	}

}
