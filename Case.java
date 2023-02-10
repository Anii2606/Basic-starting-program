import java.util.Scanner;
public class Case {
public static void main(String[] args){
char n;
System.out.println("Enter any Alphabet Upper Or Lower");
Scanner s=new Scanner(System.in);
n=s.next().charAt(0);
if((n>='A')&&(n<='Z')){
System.out.println("This Alphabet is Uppercase :"+n);
}else if ((n>='a')&&(n<='z')){
System.out.println("This Alphabet is Lowercase :"+n);
}else
{
System.out.println("This is not Alphabet :"+n);
}
}
}
