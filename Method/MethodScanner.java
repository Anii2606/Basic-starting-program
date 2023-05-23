// for scanner class
import java.util.Scanner; // Scanner class for object class
public class MethodScanner{
	
	//non static method // String TYP
public String  PrintName(String name){
	return name;
	
}
// non static method  //Integer Typ
public int  Age(int a){
	return a;	
}
//non static method //float value
public float  Marks(float a,float b,float c){
	//float d=a+b+c;//1
	//return d;
	return a+b+c;
	
}
public static void main(String []args){
	// main class object for calling non static method 
	Method s=new Method();
	// scanner class for input by user
	Scanner sc =new Scanner(System.in);
	// variables
	String name;
	int age ;
	float  Math;
	float science;
	float social_science;
	System.out.println("Enter your name");
	//given the input by user
	name =sc.nextLine();
	// called the method 
	s.PrintName(name);
	System.out.println("My name is :"+name);
	System.out.println("Enter your age");
	//given the input by user
	age =sc.nextInt();
	// called the method 
	s.Age(age);
	System.out.println("My age is :"+age);
	System.out.println("Enter your Mathmetics marks");
	//given the input by user
	 Math=sc.nextFloat();
	 System.out.println("Enter your science marks");
	 //given the input by user
	 science=sc.nextFloat();
	 System.out.println("Enter your social_science marks");
	 //given the input by user
	 social_science=sc.nextFloat();
	 
	//print value the use of // Print() method
	System.out.println("Math :"+Math);
	System.out.println("science :"+science);
	System.out.println("social_science :"+social_science);
	/*//float per =(s.Marks(Math,science,social_science)/3);//1
	//float per=e/3;
	//float total =  Math+science+social_science;
//	System.out.println("My Percentage is ="+per+"%");
*/
	System.out.print("my percantage is :");
	System.out.println(s.Marks(Math,science,social_science)/3+"%");
}

}