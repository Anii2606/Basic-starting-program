/*Two numbers are entered through the keyboard. 
Write a program to find the value of one number raised to the power of another. 
Do not use Java built-in method)*/

import java.util.Scanner;
public class Power{
public static void main(String[] args){
int num;
int power;
int ANS=1;
Scanner p=new Scanner(System.in);
System.out.println("Enter Number");
num=p.nextInt();//n=2
System.out.println("Enter Power");
power=p.nextInt();//p=3
for(int i=1;i<=power;i++){
 ANS=ANS*num;
 //result*=num2
}
System.out.println("ANSWER :"+ANS);
}
}