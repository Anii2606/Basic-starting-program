/*Take input of age of 3 people by user and determine
 oldest and youngest among them.
*/
import java.util.Scanner;
public class Old{
public static void main(String[] args){
int person1;
int person2;
int person3;
System.out.println("Enter Ages");
Scanner a=new Scanner(System.in);
person1=a.nextInt();
person2=a.nextInt();
person3=a.nextInt();

if((person1>person2)&&(person1>person3))
{
System.out.println("\nThe biggest age is person :"+ person1);
}
else
{
System.out.println("\nThe lesser age is person :"+ person1 );
}
if((person2>person3)&&(person2>person1))
{
System.out.println("\nThe biggest age is person:"+ person2);
}
else
{
System.out.println("\nThe lesser  age is person2 :"+ person2);

}if((person3>person1)&&(person3>person2))
{
System.out.println("\nThe biggest age is person :"+ person3);
}
else
{
System.out.println("\nThe lesser  age is person :"+ person3);
}
}
}