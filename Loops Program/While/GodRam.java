import java.util.Scanner;
public class GodRam{
public static void main(String[] args){
Scanner g=new Scanner(System.in);
int x;
System.out.println("Enter any number");
x=g.nextInt();
//while(x>0){
//System.out.print("RAM"+"  ");////infinity loops
while(x>0){
	x=x-1;
System.out.print("RAM"+"  ");// it is like a For loop
}

}
}