package bonus;
import java.util.Scanner;
public class Emp{
	public void salry(){
		System.out.println("Enter your salary and year(from howmany year are you working)");
		int salary;
		int year;
		Scanner sc = new Scanner(System.in);
		salary = sc.nextInt();
		year = sc.nextInt();
		if(year>5){
			System.out.println("your salary :"+(salary) + 
			"\ncongratulation you got 5% bonus :"+ (salary*00.5*100) +
			"\ntotal salary :" + salary +(salary*00.5*100));
		//	System.out.println("Enter your year and salary");
		}else {
			System.out.println("your salary :"+ salary + "\nno bonus");
			
		}
		
	}
	
}