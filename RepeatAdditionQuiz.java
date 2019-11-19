import java.util.Scanner;
import java.util.ArrayList;

public class RepeatAdditionQuiz {

	public static void main(String[] args) {
		int number1=(int)(Math.random()*10);
		int number2=(int)(Math.random()*10);
		
		ArrayList<Integer> List=new ArrayList<>(); 
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("What is "+number1+" + "+number2+"? ");
		int answer=input.nextInt();
		List.add(answer);
		
		while(number1+number2!=answer){
	
			for(int i=0;i<List.size()-1;i++){
				if(List.get(i)==answer){
					System.out.println("You already entered "+List.get(i));
				}
			}
				
			System.out.print("Wrong answer. Try again.What is "+number1+" + "+number2+"? ");
			answer=input.nextInt();
			List.add(answer);
		}
		
		System.out.println("You got it!");

	}

}
