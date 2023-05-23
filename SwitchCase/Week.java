import java.util.Scanner;
public class Week{
public static void main(String []args){
	char yn;
	do {
		Scanner v=new Scanner(System.in);
		System.out.println("Enter any number ");
		int day=v.nextInt();
		switch(day){
			case 1:
			System.out.println("first day is monday");
			break;
			case 2:
			System.out.println("second day is tuesday");
			break;
			case 3:
			System.out.println("third day is wednesday");
			break;
			case 4:
			System.out.println("fourth day is thursday");
			break;
			case 5:
			System.out.println("fiveth day is friday");
			break;
			case 6:
			System.out.println("sixth day is saturday");
			break;
			case 7:
			System.out.println("seventh day is sunday");
			break;
			default :	System.out.println("Wrong input");
			break;
		}
			System.out.println("if you want to continue ");
			System.out.println("select y for yes and n for no");
			yn=v.next().charAt(0);
			
	}
	while((yn=='y'||yn=='Y'));
	
	
}
}