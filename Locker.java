import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int[] a=new int[101];
		
		for(int i=0;i<=100;i++){
			a[i]=1;
		}
		
		for(int i=2;i<=100;i++){	
			for(int j=i;j<=100;){
				a[j]=-a[j];
				j=j+i;
			}
		}
		
		for(int i=1;i<=100;i++){
			if(a[i]==1){
				System.out.println(i);
			}
		}
	}

}


