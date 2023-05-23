// Some problem in this program 
import java.util.Scanner;
public class AddInteger1{
public static void main(String []args){
Scanner sc =new Scanner (System.in);
boolean present=true;
int [] num=new int [10];// this is array 
for (int i=0;i<num.length;i++){
num[i]=sc.nextInt();

// for one time input 
//System.out.println(num[i]);
}
System.out.println(" ");
// take multiple time input and then print 
System.out.println("check number in array");
int add =sc.nextInt();
for(int j:num)
	if (add!=j)
		 present = false;
	 else 
		 present = true;
		System.out.println(present); 
}
}