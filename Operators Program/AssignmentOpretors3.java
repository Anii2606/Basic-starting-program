//Write a program to add 8 to the number 2345 and then divide it by 3. 
//Now, the modulus of the quotient is taken with 5 and then multiply the 
//resultant value by 5.Display the final result.
 //Now, solve the above question using assignment operators (eg. +=, -=, *=).
public class AssignmentOpretors3{
public static void main(String []args){
int number=2345;
int add=8;
add+=number;
int div=3;
add/=div;
int modolu=5;
add%=modolu;
int multiply=5;
add*=multiply;
System.out.println("Final value is :"+add);
//class ArthmeticOpretors3{
 // public static void main(String[] args){
  //  System.out.println((((8+2345)/3)%5)*5);//ans 20
  }
}
