import java.util.Scanner; //Needed for Scanner class

/**
 * This program demonstrates a
 * counter controlled for loop.
 */
public class Guess
{
   public static void main(String[] args)
   {// hold variable for number;
     int number;
	int guess;
	 Scanner n=new Scanner (System.in);
// this is number ,who will user guess	 
	 number=(int) ((Math.random()*1000)+1);
	 do{
		 // for input
		  System.out.println("Guess the right number");
		  guess=n.nextInt();
		 //conditional statement 
		if (guess==number)
		{
		System.out.println("your Guessed number is right");
		}
		else if (guess>number)
		{
		System.out.println("Your Guessed number is higher than right number");
		System.out.println("Guess Again");
		}
		else
		{
		System.out.println("Your Guessed number is lower than right number");
		System.out.println("Guess Again");		
		}	 
	 }
	// loop condition
	while(guess!=number);
	
   }
}
