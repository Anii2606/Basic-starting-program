import java.util.Scanner;
public class Course2{
public static void main(String []args){
	char yn;
	do {
		Scanner v=new Scanner(System.in);
		System.out.println("Enter your course (1) Java (2) Pythan (3) Node.js (4) Javascript ");
		String course =v.next();
		switch(course){
			case "Java":
			System.out.println("Done \nyour course is JAVA");
			break;
			case "Pythan":
			System.out.println("Done \nyour course is PYTHAN");
			break;
			case "Node.js":
			System.out.println("Done \nyour course is NODE.JS");
			break;
			case "Javascript":
			System.out.println("Done \nyour course is JAVASCRIPT");
			break;
			default :	System.out.println("Wrong input");
			break;
			
		}
			System.out.println(" ");
			System.out.println("if you want to continue ");
			System.out.println("select y for yes and n for no");
			yn=v.next().charAt(0);
			
	}
	while((yn=='y'||yn=='Y'));
	
	
}
}