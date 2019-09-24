package project1;


public class Project1 {

	public static void main(String[] args) {
		int[] list= {1,2,3,4,5};
		int c=-1; 
		c=linearSearch(list,4);
		System.out.println(c);
	} 
	
	/** The method for finding a key in the list*/
	public static int linearSearch(int[] list,int key) {
		for(int i=0;i<list.length;i++) {
			if(key==list[i]) {
				return i;
			}
		}
		return -1;
	}
}	
