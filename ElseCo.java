/* PROGRAM:-(QUE 01)Take values of length and breadth of a rectangle from user and check if 
			 it is square or not. 
			 BY if else()
	Auther:-Anikesh chouhan
	Date:-19-01-23
*/
import java.util.Scanner;
public class ElseCo{
public static void main(String[] args){
	int length;
	int breadth;
	System.out.println("Enter Any Two Number");
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter length");	
	length = sc.nextInt();
	System.out.println("Enter Breadth");	
	breadth = sc.nextInt();
	if(length == breadth){
		System.out.println("This is Square");	
	}
	else{
		System.out.println("This is Rectangle");
	}


}
}