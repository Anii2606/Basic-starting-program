/*Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1

*/
import java.util.Scanner;
public class Poss{
public static void main(String[] args){
int a;
System.out.println("Enter value");
Scanner s =new Scanner(System.in);
a = s.nextInt();
if(a>0)
{
System.out.println("Output is :"+ a);
}
else 
{
System.out.println("Output is :"+ (-a));
}
}
}