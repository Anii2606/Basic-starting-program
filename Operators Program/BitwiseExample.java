// bitwise operator - % , ^ , | , ~ , << , >> .
public class BitwiseExample   
{   
public static void main(String[] args)   
{   
int x = 9, y = 8;   
// bitwise and   
// 1001 & 1000 = 1000 = 8  
System.out.println("x & y = " + (x & y));//8
 System.out.println("x ^ y = " + (x ^ y)); //1
 System.out.println("x | y = " + (x | y)); //9
  System.out.println("~x = " + (~x)); //-10
 System.out.println("~y = " + (~y)); //-9
 System.out.println("x << y = " + (y<<2));//32 
 System.out.println("x >> y = " + (x>>2)); //2
}  
} 