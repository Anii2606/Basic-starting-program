// object for Switchcase Demo;
import java.util.Scanner;
public class Calculoter2
{
public static void main(String []args)
{
String t;
do
{
int num1,num2;
Scanner sc =new Scanner(System.in);
System.out.println("Enter first number");
num1=sc.nextInt();
System.out.println("Enter second number");
num2=sc.nextInt();
char sym;
int result;
System.out.println("Enter for +,-,*,/ and %");
sym=sc.next().charAt(0);
//String sym="+";
switch(sym)
{
	case '+': result=num1+num2;
	System.out.println(result);
	break;
	case '-': result=num1-num2;
	System.out.println(result);
	break;
	case '*' : result=num1*num2;
	System.out.println(result);
	break;
	case '/' : result=num1/num2;
	System.out.println(result);
	break;
	case '%' : result=num1%num2;
	System.out.println(result);
	break;
	default:System.out.println("Wrong input");
	break;
}
System.out.println("if you want to continue ");
System.out.println("select y for yes and n for no");
t=sc.next();
}
while((t.equals("y")||t.equals("Y")));
}
}