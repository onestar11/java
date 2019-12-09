import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int m;
		System.out.print("Enter list1:");
		m=input.nextInt();
		int[] list1=new int[m];
		for(int i=0;i<m;i++) {
			list1[i]=input.nextInt();
		}
		int i,j;
		int n;
		System.out.print("Enter list2:");
		n=input.nextInt();
		int[] list2=new int[n];
		for(i=0;i<n;i++) {
			list2[i]=input.nextInt();
		}
		
		int[] list3=new int[m+n];
		for(i=0;i<m;i++) {
			list3[i]=list1[i];
		}
		for(i=0;i<n;i++) {
			list3[i+m]=list2[i];
		}
		int temp;
		for(i=0;i<n+m-1;i++) {
			for(j=0;j<m+n-1-i;j++) {
				if(list3[j]>list3[j+1]) {
					temp=list3[j];
					list3[j]=list3[j+1];
					list3[j+1]=temp;
				}
			}
		}
		
		for(i=0;i<m+n;i++) {
			System.out.print(" "+list3[i]);
		}
	}

}
