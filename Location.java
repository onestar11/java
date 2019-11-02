
public class Location {
	int row,column;
	double maxValue;
	
	Location(){
		row=0;
		column=0;
		maxValue=0;
	}
	
	public static Location locateLargest(double[][] a) {
		int i,j;
		Location b=new Location();
		b.maxValue=a[0][0];
		b.row=0;
		b.column=0;
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				if(a[i][j]>b.maxValue) {
					b.maxValue=a[i][j];
					b.row=i;
					b.column=j;
				}
			}
		}
		return b;
	}
	
	
}


