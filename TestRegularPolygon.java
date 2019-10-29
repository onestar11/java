
public class TestRegularPolygon {

	public static void main(String[] args) {
		
		RegularPolygon a=new RegularPolygon();
		System.out.println("The first: n:"+a.getN()+" side:"+a.getSide()+"  x:"+a.getX()+" y:"+a.getY());
		System.out.println("Perimeter is :"+a.getPrimeter()+" Area is:"+a.getArea());
		
		RegularPolygon b=new RegularPolygon(6,4);
		System.out.println("The second: n:"+b.getN()+" side:"+b.getSide()+"  x:"+b.getX()+" y:"+b.getY());
		System.out.println("Perimeter is :"+b.getPrimeter()+" Area is:"+b.getArea());
		
		RegularPolygon c=new RegularPolygon(10,4,5.6,7.8);
		System.out.println("The third: n:"+c.getN()+" side:"+c.getSide()+"  x:"+c.getX()+" y:"+c.getY());
		System.out.println("Perimeter is :"+c.getPrimeter()+" Area is:"+c.getArea());
		
	}

}
