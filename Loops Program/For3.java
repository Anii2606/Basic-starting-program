/*Write a program that prompts the user to input a positive integer.
 It should then print the multiplication table of that number. */
import java.util.Scanner;
public class For3{
public static void main(String[] args){
int x;
Scanner s=new Scanner(System.in);
System.out.println("Enter any positive number");
x=s.nextInt();
System.out.println("table of :"+x);
for(int i=1; i<=10; i++)
{
	System.out.println(x +"*"+i+"="+x*i);
	//System.out.println(x*i);
}

}
}