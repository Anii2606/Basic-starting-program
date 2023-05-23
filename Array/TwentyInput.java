/*Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.*/
import java.util.Scanner;
public class TwentyInput{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int poss=0,nagi=0,odd=0,even=0,zero=0;
int [] a=new int [20];
for (int i=0;i<a.length;i++){
	a[i]=sc.nextInt();
if (a[i]>0){
	poss++;//poss =poss+1
}else if (a[i]<0){
	nagi++;
}else {
	zero++;
}
if (a[i]%2==0){
	even++;
}else {
	odd++;
}	
}

System.out.println(" poss :"+ poss);
System.out.println(" nagi :"+ nagi);
System.out.println(" even :"+ even);
System.out.println(" odd :"+ odd);
System.out.println(" zero :"+ zero);
}
}