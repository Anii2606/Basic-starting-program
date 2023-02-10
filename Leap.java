/*Write a program to check if a year is leap year or not.
If a year is divisible by 4 then it is leap year but 
if the year is century year like 2000, 1900, 2100 then
it must be divisible by 400.
*/
import java.util.Scanner;
public class Leap{
public static void main(String[] args){
int year;
System.out.println("Enter Any Year");
Scanner l=new Scanner(System.in);
year=l.nextInt();
if(((year%400==0)&&(year%100==0))||((year%4==0)&&(year%100!=0))){
System.out.println("THIS YEAR IS LEAP YEAR :"+year);
}else
{
System.out.println("THIS YEAR IS NOT LEAP YEAR :"+year);}
}
public static boolean Leap (int year){
if(((year%400==0)&&(year%100==0))||((year%4==0)&&(year%100!=0)))
	return true;
else
	return false;
}
}

