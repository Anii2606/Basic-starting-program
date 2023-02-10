/*
Program:- varible and Datatype
Auther :- Anikesh chouhah
date :- 17-01-23

import java.util.Scanner;

class Basic{
	
static double a; // Static variable
int b; // Instance variable//int=datatype,a =variable,22=value(it is working)
//int b=5; // Instance variable//int=datatype,a =variable,22=value(it is working)
public static void main(String args[]){
Scanner h=new Scanner(System.in);
//for take the first input by user
System.out.println("Enter your first week of tha days who you joined the office");
a=h.nextDouble();
//for take the second input by user
System.out.println("Enter your second week of tha days who you joined the office");
int b=h.nextInt();
//for take the third input by user
int c,f; // local variable
System.out.println("Enter your third week of tha days who you joined the office");
c=h.nextInt();
//for take the fourth input by user
System.out.println("Enter your fourth week of tha days who you joined the office");
f=h.nextInt();
//for select  true/false
boolean d;// local variable
System.out.println("Are you saying true print(true/false)");
d=h.nextBoolean();

//Basic f=new Basic();//for instance variable
double e=a+b+c+f;// for addition of all days

//System.out.println(a);
System.out.println("anikesh chouhan");
System.out.println("your first week of tha days who you joined the office is :"+a);
System.out.println("your second week of tha days who you joined the office is :" +b);
System.out.println("your third week of tha days who you joined the office is :" +c);
System.out.println("your fourth week of tha days who you joined the office is :" +f);
System.out.println("Confirm You are saying true :" +d);
System.out.println("ONlY"+" "+e+" "+"days you came the office ");

//if else statement for check the case true and false
if (e>=18){
	
		System.out.println(" NICE ! Keep it up");
}else{
	System.out.println("You are Fired");	
}
// for object class for call the method
Basic r=new Basic();
r.switchcase();
}
//new method for switchcase
public void switchcase(){
Scanner h=new Scanner(System.in);
System.out.println("mostly you didn't come the office please select number");
int c;
c=h.nextInt();

//case 1
switch(c){
case 1 :
System.out.println("monday");
break;
case 2 :
System.out.println("tuesday");
break;
case 3 :
System.out.println("wednesday");
break;
case 4 :
System.out.println("thursday");
break;
case 5 :
System.out.println("friday");
break;
case 6 :
System.out.println("saturday");
break; 
case 7 :
System.out.println("sunday");
break;
  default:
  System.out.println("Looking forward to the Weekend");
}

int f;
f=h.nextInt();
//case 2
switch(f){
case 1 :
System.out.println("monday");
break;
case 2 :
System.out.println("tuesday");
break;
case 3 :
System.out.println("wednesday");
break;
case 4 :
System.out.println("thursday");
break;
case 5 :
System.out.println("friday");
break;
case 6 :
System.out.println("saturday");
break; 
case 7 :
System.out.println("sunday");
break;
  default:
  System.out.println("Looking forward to the Weekend");
}
}
}
*/
class Basic {
 public static void main(String args[]) {
  byte x;
  int a = 270;
  double b = 128.128;
  System.out.println("int converted to byte");
  x = (byte) a;
  System.out.println("a and x " + a + " " + x);
}
}