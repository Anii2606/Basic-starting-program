/*Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in 
urban areas.if employee is a male and age is in 
between 20 to 40 then he may work in anywhere if employee 
is male and age is in between 40 t0 60 then he will work
in urban areas only.And any other input of age should
print "ERROR".
*/
import java.util.Scanner;
public class Work{
public static void main(String[] args){
String name;
int age;
char gender;
boolean mari;
Scanner s=new Scanner(System.in);
System.out.println("Enter your Name :");
name=s.next();
System.out.println("Enter your right Age :");
age =s.nextInt();
System.out.println("Enter your Gender (m/f):");
gender = s.next().charAt(0);
System.out.println("marital stutas:true/false :");
mari =s.nextBoolean();
if (gender=='f'){
System.out.println(" Name is :"+name);
System.out.println(" Gender is :Female");
System.out.println(" Age is :"+age);
System.out.println(" married :"+mari);
System.out.println(" she will work only in urban areas :");


}
else if ((gender=='m')&&((age>=20)&&(age<=40))){
System.out.println(" Name is :"+name);
System.out.println(" Gender is :Male");
System.out.println(" Age is :"+age);
System.out.println(" married :"+mari);
System.out.println(" He may work in anywhere :");


}else if ((gender=='m')&&((age>=40)&&(age<=60))){
System.out.println(" Name is :"+name);
System.out.println(" Gender is :Male");
System.out.println(" Age is :"+age);
System.out.println(" married :"+mari);
System.out.println(" He will work only in urban areas :");

}else{
	System.out.println("ERROR");
	
}
}
}