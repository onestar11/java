package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		
		System.out.print("Enter the integers between 1 and 100:");
		
		Scanner input=new Scanner(System.in);
		
		int[] Array=new int[101];
		
		for(int i=0;i<=100;i++){
			Array[i]=0;
		}
		
		
		int x;
		
		while((x=input.nextInt())!=0){
			for(int i=1;i<=100;i++){
				if(x==i){
					Array[i]++;
				}
			}
		}
		
		
		for(int i=1;i<=100;i++){
			if(Array[i]!=0){
				System.out.println(i+" occurs "+Array[i]+" times");
			}
		}
	}

}
