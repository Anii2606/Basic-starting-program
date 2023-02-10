/*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.*/
import java.util.Scanner;
public class Dis{
public void display(){
int a ;
System.out.println("Quantity of purchased");
Scanner x =new Scanner(System.in);
a= x.nextInt();
if((a*200)>2000){
	System.out.println("Total cost :"+ a*200);
	System.out.println("Congratulation you got 20% discount: "+ (.1*a*200)+"\nAfter discount your cost is : " +(a*200-(.1*a*200)));	
}
else{
	System.out.println("No Discount");

}
}
}
