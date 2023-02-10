/*Write a program to find the factorial value of any number entered through the keyboard. */
import java .util.Scanner;
public class Factorial{
public static void main(String[] args){
int fact=1;
int num;
System.out.println("Enter any number");
Scanner f=new Scanner(System.in);
num=f.nextInt();// n=5
System.out.println("Factorial of :"+num);
for (int i=1;i<=num;i++){
	fact*=i;
	//fact=fact*i;
}
System.out.println("Factorial value is :"+fact);
}
}