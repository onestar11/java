package Hello;

public class Hello {
	public static void main(String args[])
	{
		//Obtain the total milliseconds since midniget,jan,1,1970
		long totalMilliseconds=System.currentTimeMillis();
		
		//Obtain the total seconds since midniget,jan,1,1970
		long totalSeconds=totalMilliseconds/1000;
		
		//Compute the current second in the minute in the hour
		long currentSecond=totalSeconds%60;
		
		//Obtain the total minutes
		long totalMinutes=totalSeconds/60;
		
		//Compute the current Minute in the hour
		long currentMinute=totalMinutes%60;
		
		//Obtain the total hours
		long totalHours=totalMinutes/60;
		
		//Compute the current hour
		long currentHour=totalHours%24;
		
		//Display result
		System.out.println("Current time is "+currentHour+":"+currentMinute+":"+currentSecond+" GMT");
	}
}
