import java.util.Scanner;
public class TestLinearEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("please input x1,y1,x2,y2,x3,y3,x4,y4:");
		Scanner input=new Scanner(System.in);
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double x3=input.nextDouble();
		double y3=input.nextDouble();
		double x4=input.nextDouble();
		double y4=input.nextDouble();

		LinearEquation a=new LinearEquation(x1,y1,x2,y2,x3,y3,x4,y4);
		if((y2-y1)/(x2-x1)==(y4-y3)/(x4-x3)) {
			System.out.println("The two lines are parallel.");
		}else {
		System.out.println("The intersecting point is at ("+a.getX()+","+a.getY()+")");
		}
	}

}
