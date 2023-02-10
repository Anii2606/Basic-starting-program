/*Write a program that prompts the user to input
 a positive integer.It should then output a message indicating
 whether the number is a prime number*/
import java.util.Scanner;

public class Prime{
	
public static void main(String[] args){
	
int num,total=0;

Scanner s = new Scanner(System.in);

System.out.println("Enter number");
num=s.nextInt();	

for (int i=1;i<=num;i++){
	if (num%i==0){
		//total++;
		total+=1;// Variable for counter 
	}
}
if (total==2){// if counter number is 2 then prime 
System.out.println("This is prime number :"+num);
}
else{
System.out.println("This is not prime number :"+num);
}

}
}