/*program :- How to call static variable in scanner object class
 Auther :- Anikesh chouhan
Date :- 18-01-2023
*/
import java.util.Scanner;

public class Scan{
static int a;      //Static variable
static double b;  //Static variable
static boolean c; //Static variable
public static void main(String[] args){
System.out.println("Enter mrks");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
System.out.println("Mathametic marks :"+ a);
Double b=sc.nextDouble();
System.out.println("Physics marks :" + b);
Boolean c =sc.nextBoolean();
System.out.println( "mark is right :" + c);
}

}