import java.util.Scanner;
public class Pera{
public void rectangle(){
int len;
int brea;
System.out.println("rectangle");
System.out.println("Enter Length");
Scanner m=new Scanner(System.in);
len=m.nextInt();
System.out.println("Enter Breath");
brea=m.nextInt();
float perameter=2*(len+brea);
System.out.println("perameter is :"+perameter);
}
public void square(){
int side;
System.out.println("square");
System.out.println("Enter side");
Scanner m=new Scanner(System.in);
side=m.nextInt();
float perameter=4*side;
System.out.println("perameter is :"+perameter);
}
public void triangle(){
int s1,s2,s3;
System.out.println("triangle");
System.out.println("Enter first side");
Scanner m=new Scanner(System.in);
s1=m.nextInt();
System.out.println("Enter second side");
s2=m.nextInt();
System.out.println("Enter thitd side");
s3=m.nextInt();
float perameter=s1+s2+s3;
System.out.println("perameter is :"+perameter);
}
public void trapezoid(){
int s1,s2,s3,s4;
System.out.println("trapezoid");
System.out.println("Enter first side");
Scanner m=new Scanner(System.in);
s1=m.nextInt();
System.out.println("Enter second side");
s2=m.nextInt();
System.out.println("Enter third side");
s3=m.nextInt();
System.out.println("Enter fourth side");
s4=m.nextInt();
float perameter=s1+s2+s3+s4;
System.out.println("perameter is :"+perameter);
}
public void circle(){
int r;
double p=3.14;
System.out.println("circle");
System.out.println("Enter radius");
Scanner m=new Scanner(System.in);
r=m.nextInt();
double perameter=2*p*r;
System.out.println("perameter is :"+perameter);
}
public static void main(String[] args){
	Pera d=new Pera();
	d.rectangle();
	d.square();
	d.triangle();
	d.trapezoid();
	d.circle();
}
}