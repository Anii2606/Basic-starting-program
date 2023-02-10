/*Write a program that prompts the user to input
 an integer and then outputs the number with the digits 
 reversed. For example, if the input is 12345, 
 the output should be 54321.

*/
import java.util.Scanner;
public class Revers{
public static void main(String[] args){
int num;
int rever=0;
Scanner r=new Scanner(System.in);
System.out.println("Enter any positive number");
num =r.nextInt();
int temp=num;
int remaider=0;
while(temp>0){
	remaider=temp%10;
	rever=rever*10+remaider;
	temp=temp/10;	
	
	System.out.print("\nRevers value is :"+rever);
}

}
} 