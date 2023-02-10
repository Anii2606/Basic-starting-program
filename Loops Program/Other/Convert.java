import java.util.Scanner;
public class Convert{
public static void main(String[] args){
Scanner s =new Scanner(System.in);
System.out.println("Enter any Celsius value");
double cals;
cals=s.nextInt();
double fah = (((cals*9)/5)+32);
 System.out.println( + cals + "  Celsius is equal to  " + 
  fah + " degree Fahrenheit");


}
}