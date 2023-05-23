public class Method{
	
//this is non static method 
//if we can call the method we willbe created 
//a object class in main method 

//void sum(){
	
/*
//This is Static Method 
//static method  can be call with Static method 

static void  sum(){
System.out.println("Sum is :");
System.out.println(5+5);}
*/

public String  PrintName(String name){
	return name;
}

//public static void main(String []args){
	//Method s=new Method();
	// s.sum();
	//sum();
//}

/*
//without static method 

public int  multiply(int a,int b){
	int c=a*b;
	return c;
*/
	
public int  Age(int a){
	return a;	
}

public float  Marks(float a,float b,float c){
	//float d=a+b+c;
	//return d;
	return a+b+c;
	
}
public static void main(String []args){
	// for non static method 
	//Method s=new Method();
	// s.sum();
	
	//sum();
	
	//for non static method 
/*
Method s=new Method();
int a=20;
int b=10;
int c=s.multiply(a,b);
System.out.println(c);
*/
// for static method 
	//int x =50;
	//int y =10;
	//System.out.println(multiply(x,y));
	Method s=new Method();
	
	String name ="Anikesh";
	s.PrintName(name);
	System.out.println("My name is :"+name);
	 
	 
	 int a=22;
	 s.Age(a);
	 System.out.println("My age is :"+a);
	 
	 
	float  Math=89.6f;
	float science=98.4f;
	float social_science=90.5f;
	System.out.println("Math :"+Math);
	System.out.println("science :"+science);
	System.out.println("social_science :"+social_science);
	//float per =(s.Marks(Math,science,social_science)/3);
	//float per=e/3;
	//float total =  Math+science+social_science;
//	System.out.println("My Percentage is ="+per+"%");
System.out.print("my percantage is :");
	System.out.println(s.Marks(Math,science,social_science)/3+"%");
}

}