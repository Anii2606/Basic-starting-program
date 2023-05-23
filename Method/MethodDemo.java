public class MethodDemo{
public static int addition(int a,int b){
	int c=a+b;
	return c ;
}
	public static int subtraction(int a,int b){
	int c1=a-b;
	return c1;
}	
public static int multiply(int a,int b){
	int c2=a*b;
	return c2;
}	
public static int divide(int a,int b){
	int c3=a/b;
	return c3;
}

public static void main(String []perameter){
 int x=5;
 int y=2;
int z=addition(x,y);
int z1 =subtraction(x,y);
int z2 =multiply(x,y);
int z3 =divide(x,y);

System.out.println(z);
System.out.println(z1);
System.out.println(z2);
System.out.println(z3);
System.out.println(":");
int a=6;
int b=2;
int c =addition(a,b);
int c1 =subtraction(a,b);
int c2 =multiply(a,b);
int c3 =divide(a,b);

System.out.println(c);
System.out.println(c1);
System.out.println(c2);
System.out.println(c3);
System.out.println(":");
int d=7;
int e=2;
int f =addition(d,e);
int f1 =subtraction(d,e);
int f2 =multiply(d,e);
int f3 =divide(d,e);

System.out.println(f);
System.out.println(f1);
System.out.println(f2);
System.out.println(f3);

System.out.println(":");
int g=8;
int h=2;
int i =addition(g,h);
int i1 =subtraction(g,h);
int i2 =multiply(g,h);
int i3 =divide(g,h);
System.out.println(i);
System.out.println(i1);
System.out.println(i2);
System.out.println(i3);



}
}