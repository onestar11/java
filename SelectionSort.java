package project1;

import java.util.Arrays;
public class Project1 {

	public static void main(String[] args) {
		double[] list= {1,2,3,5,4,};
		selectionSort(list);
		System.out.println(Arrays.toString(list));
	} 
	
	/**The mathod for sorting the numbers*/
	public static void selectionSort(double[] list) {
		for(int i=0;i<list.length-1;i++) {
			//Find the minimum in the list[i..list.length-1]
			double currentMin=list[i];
			int currentMinIndex=i;
			
			for(int j=i+1;j<list.length;j++) {
				if(currentMin>list[j]) {
					currentMin=list[j];
					currentMinIndex=j;
				}
			}
			
			//Swap list[i] with list[currentMinIndex] if necessary
			if(currentMinIndex !=i) {
				list[currentMinIndex]=list[i];
				list[i]=currentMin;
			}
		}
	}
}	
