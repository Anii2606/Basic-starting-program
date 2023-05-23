//Write a program to print the power of 7 raised to 5.

//import java.lang.Math;
//class Ans{
 // public static void main(String[] args){
  //  System.out.println(Math.pow(7,5));
    //System.out.println(7*7*7*7*7);
	
 // }
//}
//Assign values of variables 'a' and 'b' as 55 and 70 respectively 
//and then check if both the conditions
//'a < 50' and 'a < b' are true.
public class LogicalOperators{
 public static void main(String[] args){
int a= 55;
int b =70;	
System.out.println(a<50&&a<b);// output is false
System.out.println(a<50||a<b);// output is True
System.out.println(!(a<50||a<b));// output is false
 }
 }