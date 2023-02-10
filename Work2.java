/*Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in 
urban areas.if employee is a male and age is in 
between 20 to 40 then he may work in anywhere if employee 
is male and age is in between 40 t0 60 then he will work
in urban areas only.And any other input of age should
print "ERROR".
*/

public class Work2{
public static void main(String[] args){
String name ="Rajaram";
int a=45;
String gender="male";
boolean mari=true;

String nam ="Anikesh";
int age=25;
String gend="male";
boolean mar=true;

String na ="Saloni";
int ag=45;
String gende="female";
boolean ma=true;



if (gende=="female"){
System.out.println(" Name is :"+na);
System.out.println(" Gender is :"+gende );
System.out.println(" Age is :"+ag);
System.out.println(" married :"+ma);
System.out.println("she will work only in urban areas :");
System.out.println("      ");

}
if ((gend=="male")&&((age>=20)&&(age<=40))){

System.out.println(" Name is :"+nam);
System.out.println(" Gender is :"+gend);
System.out.println(" Age is :"+age);
System.out.println(" married :"+mar);
System.out.println(" He may work in anywhere :");
System.out.println("      ");
} if ((gender=="male")&&((a>=40)&&(a<=60))){
System.out.println(" Name is :"+name);
System.out.println(" Gender is :"+gender);
System.out.println(" Age is :"+a);
System.out.println(" married :"+mari);
System.out.println("He will work only in urban areas :");
System.out.println("      ");
}else{
	System.out.println("ERROR");
	
}
}
}