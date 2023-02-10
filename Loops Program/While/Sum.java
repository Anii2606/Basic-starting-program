/*Write a program that reads a set of integers, 
and then prints the sum of the even and odd integers.
*/
import java.util.Scanner;
public class Sum{
public static void main(String[] args){
	
int num;
char choice;
int even_num=0;
int odd_num=0;

Scanner s=new Scanner(System.in);



do{
System.out.println("Enter number");
num=s.nextInt();
if (num%2==0)
{
even_num+=num;
}
else
{
odd_num+=num;
}

System.out.println("IF you want to continue Press Y/N");
choice=s.next().charAt(0);

}while(choice =='y'|| choice=='Y');
{	
System.out.println("sum of Even number :"+even_num);
System.out.println("sum of odd number :"+odd_num);
}

}
}