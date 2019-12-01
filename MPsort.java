import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int n;
		System.out.println("Please input the number of students:");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		
		int[] a=new int[n];
		String[] b=new String[n];
		int temp;
		String c;
		
		System.out.println("Please input name and score of students:(just like:xiaoming 100)");
		
		for(int i=0;i<n;i++) {
			b[i]=input.next();
			a[i]=input.nextInt();
		}
				
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					c=b[j];
					b[j]=b[j+1];
					b[j+1]=c;
				}
			}
		}
		
		for(int i=n-1;i>=0;i--) {
			System.out.println(b[i]+" "+a[i]);
		}
	}

}
