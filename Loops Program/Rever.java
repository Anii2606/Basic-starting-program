/*
Write a program that prompts the user to input 
an integer and then outputs the number with the digits 
reversed.For example, if the input is 12345, the output
should be 54321.
*/
import java.util.Scanner;
public class Rever{
	public static void main(String[] args){
		int num;
		System.out.println("Enter any 5 digit number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		int f_num=(num/1)%10;
		int s_num=(num/10)%10;
		int t_num=(num/100)%10;
		int fo_num=(num/1000)%10;
		int fi_num=(num/10000)%10;
		for (i=1;i<=num;i++){
		revers=revers	
		}
		
		System.out.println(f_num*10000+s_num*1000+t_num*100+fo_num*10+fi_num*1);
	}
	
}