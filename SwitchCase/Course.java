import java.util.Scanner;
public class Course{
public static void main(String []args){
	char yn;
	do {
		Scanner v=new Scanner(System.in);
		System.out.println("Enter any number for course (1) Mathemetic (2) Biology (3) Commerse (4) Arts ");
		int course =v.nextInt();
		switch(course){
			case 1:
			System.out.println("Done \nyour course is Mathemetic");
			System.out.println("Last class which subject had you better");
			String sub=v.next();
			switch(sub){
			
			case "Mathemetic":
			System.out.println(sub +" is good Subject");
			break;
			case "Hindi":
			System.out.println(sub +" is good Subject");
				break;
			case "English":
			System.out.println(sub +" is good Subject");
				break;
			case "Science":
			System.out.println(sub +" is good Subject");
				break;
			case "Social Science":
			System.out.println(sub +" is good Subject");
				break;
			}
			break;
			case 2:
			System.out.println("Done \nyour course is Biology");
			System.out.println("Last class which subject had you better");
			String ssub=v.next();
			switch(ssub){
			
			case "Mathemetic":
			System.out.println(ssub +" is good Subject");
				break;
			case "Hindi":
			System.out.println(ssub +" is good Subject");
				break;
			case "English":
			System.out.println(ssub +" is good Subject");
				break;
			case "Science":
			System.out.println(ssub +" is good Subject");
				break;
			case "Social Science":
			System.out.println(ssub +" is good Subject");
				break;
			}
			break;
			case 3:
			System.out.println("Done \nyour course is Commerse");
			System.out.println("Last class which subject had you better");
			String sssub=v.next();
			switch(sssub){
			
			case "Mathemetic":
			System.out.println(sssub +" is good Subject");
				break;
			case "Hindi":
			System.out.println(sssub +" is good Subject");
				break;
			case "English":
			System.out.println(sssub +" is good Subject");
				break;
			case "Science":
			System.out.println(sssub +" is good Subject");
				break;
			case "Social Science":
			System.out.println(sssub +" is good Subject");
				break;
			}
			break;
			case 4:
			System.out.println("Done \nyour course is Arts");
			System.out.println("Last class which subject had you better");
			String ssssub=v.next();
			switch(ssssub){
			
			case "Mathemetic":
			System.out.println(ssssub +" is good Subject");
				break;
			case "Hindi":
			System.out.println(ssssub +" is good Subject");
				break;
			case "English":
			System.out.println(ssssub +" is good Subject");
				break;
			case "Science":
			System.out.println(ssssub +" is good Subject");
				break;
			case "Social Science":
			System.out.println(ssssub +" is good Subject");
				break;
			}
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