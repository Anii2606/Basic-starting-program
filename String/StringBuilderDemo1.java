// reverse string ;
 import  java.util.Scanner;
 public class StringBuilderDemo1{ 
public static void main(String []args){ 
System.out.println("Write any name ");
System.out.println("who you want to it in reverse order ");
Scanner sc=new Scanner(System.in);
String rev=sc.next();
String str=" ";
for(int i=0;i<rev.length();i++){// half loops run for String reverse order
	int front=i;//0 1 2 3 4 5 6//Anikesh
	//int back=rev.length()-1-i;// 7-1-0= 6,5,4,3,2,1,0// hsekinA
	
	char frontchar=rev.charAt(front);//Anikesh
	//char backchar=rev.charAt(back);//hsekinA
	str=frontchar+ str;
//
 //rev.setCharAt(front,backchar);
// rev.setCharAt(back,frontchar);
System.out.println(str);
}
System.out.println(str);
}
}