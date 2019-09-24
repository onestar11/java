package Hello;
public class Hello {
	public static void main(String args[])
	{
		//Declare the array
		char[] chars=createArray();
		
		//Display the array
		System.out.print("The lowercase letters are:");
		displayArray(chars);
		
		//Count the occurrences of each letter 
		int[] counts=countLetters(chars);
		
		//Display counts
		System.out.println();
		System.out.println("The occurrences of each letter are:");
		displayCounts(counts);
	}
	
	/**Create an array of characters*/
	public static char[] createArray(){
		//Declare an array of characters and create it
		char[] chars=new char[100];
		
		//Create lowwrcase letters randomly and assign them to the array
		for(int i=0;i<chars.length;i++){
			chars[i]=getRandomLowerCaseLetter();
		}
		
		//Return the array
		return chars;
	}
	
	/**Display the array of characters*/
	public static void displayArray(char[] chars){
		//Display the characters in the array 20 on each line
		for(int i=0;i<chars.length;i++){
			if((i+1)%20==0){
				System.out.println(chars[i]);
			}
			else{
				System.out.print(chars[i]+" ");
			}
		}
	}
	
	/**Count the occurrences of each letters*/
	public static int[] countLetters(char[] chars){
		//Declare and creat an array of 26 int
		int[] counts=new int[26];
		
		//For each lowercase letter in the array,count it
		for(int i=0;i<chars.length;i++){
			counts[chars[i]-'a']++;
		}
		return counts;
	}
	
	/**Display counts*/
	public static void displayCounts(int[] counts){
		for(int i=0;i<counts.length;i++){
			if((i+1)%10==0){
				System.out.println(counts[i]+" "+(char)(i+'a'));
			}
			else{
				System.out.print(counts[i]+""+(char)(i+'a')+" ");
			}
		}
	}
	
	/**Generate a random character between ch1 and ch2*/
	public static char getRandomCharacter(char ch1,char ch2){
		return (char)(ch1+Math.random()*(ch2-ch1+1));
	}
	
	public static char getRandomLowerCaseLetter(){
		return getRandomCharacter('a','z');
	}
	
	
	
	
	
	
}
