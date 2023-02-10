/*Take input of age of 4 people by user and determine
 oldest and youngest among them.
*/
import java.util.Scanner;
public class Fuser{
public static void main(String[] args){
int p1;
int p2;
int p3;
int p4;
System.out.println("Give Four age input");
Scanner a =new Scanner(System.in);
System.out.println("Person 1 age" );
p1=a.nextInt();
System.out.println("Person 2 age" );
p2=a.nextInt();
System.out.println("Person 3 ags");
p3=a.nextInt();
System.out.println("Person 4 age");
p4=a.nextInt();
if ((p1>p2)&&(p1>p3)&&(p1>p4))
{
System.out.println("oldest "+"  is p1" +" :"+p1);
}
else
{System.out.println("youngest is p1 :" +p1);
}if ((p2>p1)&&(p2>p3)&&(p2>p4))
{
System.out.println("oldest "+"  is p2" +" :"+p2);
}
else
{System.out.println("youngest is p2 :" +p2);
}if ((p3>p1)&&(p3>p2)&&(p3>p4))
{
System.out.println("oldest "+"  is p3" +" :"+p3);
}
else
{System.out.println("youngest is p3 :" +p3);
}if ((p4>p1)&&(p4>p2)&&(p4>p3))
{
System.out.println("oldest "+"  is p4" +" :"+p4);
}
else
{
	System.out.println("youngest is p4 :" +p4);
}
}

}