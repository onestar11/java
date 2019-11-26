package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		
		System.out.print("Enter ten numbers:");
		
		Scanner input=new Scanner(System.in);
		
		int[] Array=new int[11];
		
		for(int i=0;i<10;i++){
			Array[i]=0;
		}
		
		int x;
		int iCount=0;
		int iZ=0;
		
		x=input.nextInt();
		Array[0]=x;
		iCount=1;
		
		for(int i=0;i<9;i++){
			iZ=0;
			x=input.nextInt();
			for(int j=0;j<iCount;j++){
				if(x==Array[j]){
					iZ=1;
				}
			}
			if(iZ==0){
				Array[iCount++]=x;
			}
			
		}
		
		System.out.println("The number of distinct number is "+iCount);
		System.out.print("The distinct numbers are:");
		for(int i=0;i<iCount;i++){
			System.out.print(Array[i]+" ");
		}
		System.out.println();
	}

}
