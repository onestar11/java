
public class RegularPolygon {
	private int n=3;
	private double side=1;
	private double x=0;
	private double y=0;
	
	public RegularPolygon(){
		n=3;
		side=1;
		x=0;
		y=0;
	}
	
	public RegularPolygon(int n,double side){
		this.n=n;
		this.side=side;
		x=0;
		y=0;
	}
	
	public RegularPolygon(int n,double side,double x,double y){
		this.n=n;
		this.side=side;
		this.x=x;
		this.y=y;
		
	}
	
	public double getPrimeter(){
		return n*side;
	}
	
	
	public int getN(){
		return n;
	}
	
	public double getSide(){
		return side;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public double getArea(){
		return (n*side*side)/(4*Math.tan(Math.PI/n));
	}
	
	
}


