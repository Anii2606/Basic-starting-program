//1.Write a program to print a string entered by user.
import java.util.Scanner;
public class A{
public static void main(String []args){
// for Object class to take anny string value
String b;
Scanner sc =new Scanner(System.in);
System.out.println("And your name ");
b=sc.nextLine();
System.out.println(b);

//2.Write a program to input and display the sentence I love candies.
	
// 01
StringBuilder sb=new StringBuilder("I LOVE CANDIES");
System.out.println(sb);

// 02
String a="I LOVE CANDIES";
System.out.println(a);

// 3. Write a program to find the length of the string "refrigerator"

StringBuilder bu=new StringBuilder("Refrigerator");
//int q=bu.length();
System.out.println("Refrigerator length is :"+ bu.length());

}
}