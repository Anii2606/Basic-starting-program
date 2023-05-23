//Write a program to check if the letter 'e' is present in the word 'Umbrella'.
import java.util.Scanner;
public class Check{
public static void main(String []args){
String sb;
boolean a=false;
Scanner sc=new Scanner(System.in);
System.out.println("Enter any name  if you want check");
sb=sc.nextLine();
char at;
System.out.println("Enter any Charcter if you want check in your word");

at=sc.next().charAt(0);
for (int i =0 ; i <sb.length(); i++){

	if (sb.charAt(i)==at) {
		a=true;
	}
}
System.out.println(a);
}
}

