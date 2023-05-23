
//Write a program to check if the word 'orange' is present in the "This is orange juice".
public class Present{
public static void main(String []args){
String str="This is orange juice and my orange juice so amazing,Therefore try once";
String strr=str.toUpperCase();
System.out.println(strr);
int str1 =str.indexOf('t',50);
int str2 =str.indexOf('e',62);
String str3 =str.substring(52,62);
String str4=str3.toLowerCase();

	//System.out.println(fls);
System.out.println(str1 + "\t"+ str2 +"\t"+str3+"\n"+str4);
}
}