import java.util.Scanner;
public class Greater{
public static void main(String[] args){
	int first;
	int second;
	System.out.println("Enter Two number");
	Scanner c =new Scanner(System.in);
	first =c.nextInt();
	second =c.nextInt();
	if(first>second){
		System.out.println (first +" : is Greater");
	}
	else if (first==second) {
		System.out.println("equal");
	}
	else{
		System.out.println( second +" : is Greater");
		
	}
}
}