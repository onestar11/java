
public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before creating objects");
		System.out.println("The number of circle objects is "+CircleWithStaticMembers.numberOfObjects);
		
		//Create c1
		CircleWithStaticMembers c1=new CircleWithStaticMembers();
		
		//Display c1 BEFORE c2 is created
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius ("+c1.radius+") and number of Circle objects ("+c1.numberOfObjects+")");
		
		//Creat c2
		CircleWithStaticMembers c2=new CircleWithStaticMembers(5);
		
		//Modify c1
		c1.radius=9;
		
		//Displayc1 and c2 AFTER c2 was created
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius ("+c2.radius+"O) and number of Circle objects ("+c2.numberOfObjects+")");
		
	}

}
