import java.util.Scanner;
public class Attend{
public static void main(String[] args){
int held,atten;
boolean medical;
Scanner s =new Scanner(System.in);
System.out.println("Enter number of classes held");
held=s.nextInt();
System.out.println("Enter number of classes attended");
atten=s.nextInt();
System.out.println("Did student have any medical cause \"true or false?\"");
medical=s.nextBoolean();

if((held*.75)<=(atten))
{
System.out.println("You can sit in the exam :"
+"\nyour Attendece is :"+(atten*100/held)+"%");
}else if(medical)
{
System.out.println("You can sit in the exam :"
+"\nand your Attendece is :"+(atten*100/held)+"%");
}
else
{
System.out.println("You cannot sit in exam :" 
+"\nand your Attendece is :"+(atten*100/held)+"%");
}
}
}