import java.util.Scanner;
public class Reverse{
public static void main(String[] args){
int n;
System.out.println("Enter number");
Scanner d=new Scanner(System.in);
n=d.nextInt();
int first_number=(n/1)%10;
int second_number=(n/10)%10;
int third_number=(n/100)%10;
int fourth_number=(n/1000)%10;
System.out.println(first_number*1000 +second_number*100+
third_number*10+fourth_number*1);

}
}