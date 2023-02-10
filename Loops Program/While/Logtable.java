import java.util.Scanner; //Needed for Scanner class

/**
 * This program demonstrates a
 * counter controlled for loop.
 */
 // main class
public class Logtable
{
	// main method
   public static void main(String[] args)
   {
	   // object class
   int maxvalue;
   System.out.println("Enter any value for log");
   Scanner s =new Scanner(System.in);
   maxvalue=s.nextInt();
   for (int i=1; i<=maxvalue; i++){
	System.out.println(i+"\t"+Math.log(i));
   }
}
}