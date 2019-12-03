import java.util.Scanner;

public class Test {
	
	public static boolean isSorted(int[] list){
		int Z=0;
		
		for(int i=0;i<list.length-1;i++){
			for(int j=0;j<list.length-1-i;j++){
				if(list[j]>list[j+1]){
					Z=1;
				}
			}
		}
		
		if(Z==1){
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args) {
		int n;
		
		System.out.println("Enter list: ");
		
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		int[] a=new int[n];
		
		
		for(int i=0;i<n;i++){
			a[i]=input.nextInt();
		}
		
		if(isSorted(a)){
			System.out.println("The list is not sorted");
		}
		else{
			System.out.println("The list is sorted");
		}
		
	}

}


