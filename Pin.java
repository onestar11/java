import java.util.Scanner;
import java.util.ArrayList;

public class Pin {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter an integer m: ");
		int m=input.nextInt();
		
		ArrayList<Integer> List=new ArrayList<>();
		
		int t=m;
		
		for(int i=2;i<=t;)//注意是小于等于
		{
			if(t%i == 0)
			{
				List.add(i);
				t /=i;//记得每次进行除i
			}
			else{
				i++;//因为求的是最小因子，所以只有在i小的时候不能除尽，才进行i加一的操作，
			}	
		}
		
		int iCount=0;
		int n=1;
		
		for(int i=0;i<List.size();i++){
			iCount=0;
			for(int j=0;j<List.size();j++){
				if(List.get(i)==List.get(j)){
					iCount++;
				}
			}
			if(iCount%2!=0){
				n*=List.get(i);
				for(int k=0;k<List.size();k++){
					if(List.get(k)==List.get(i)){
						List.set(k, 1);
					}
				}
				
			}
		}
		
		System.out.println("The smallest number n for m * n to be a perfect qquare is "+n);
		System.out.println("m * n is "+m*n);
	}
}
