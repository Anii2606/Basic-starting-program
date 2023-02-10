// For Scanner class
import java.util.Scanner;

// main class 
public class Sum1{
	
// main Methed
public static void main(String[] args){	

// datatyp and variable//hold value
int num;
//initilization value
int sum=0;

// for output
System.out.println("Enter Number for Adding");

// Scanner class for input to user
Scanner s=new Scanner(System.in);

// get the value of the user
num=s.nextInt();
System.out.println("First number is :"+num);

// number is tested
while(num>0){
	sum+=num;// add the number to sum
	//sum=sum+num;
	num=s.nextInt();
	System.out.println("Next number is :"+num);
//	indructions
	System.out.println("if you want to stop then()print 0");
}
// total sum
	System.out.println("Sum is :"+sum);

}
}
 