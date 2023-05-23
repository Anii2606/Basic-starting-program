public class Arith{
public static void main(String []args){
float a =23;
float b=27;
System.out.println("  ");
System.out.println("BEFORE RESULT :\nadd is :"+(a+b)+"\nsubsraction is :"+(a-b)+"\nmultipication is :"+(a*b)+"\ndividecation is :"+(a/b)+"\nremainder is :"+(a%b));
System.out.println("  ");
// with using variable third
float c=a;//c=23
a=b;//a=27
b=c;//b=23
System.out.println("  ");
System.out.println("For using Variable third :\nadd is :"+(a+b)+"\nsubsraction is :"+(a-b)+"\nmultipication is :"+(a*b)+"\ndividecation is :"+(a/b)+"\nremainder is :"+(a%b));
System.out.println("  ");
// without of using variable third
b=(b-a);//4
a=b+a;//27
b=-(b-a);//23
System.out.println("Without third variable :\nadd is :"+(a+b)+"\nsubsraction is :"+(a-b)+"\nmultipication is :"+(a*b)+"\ndividecation is :"+(a/b)+"\nremainder is :"+(a%b));
}
}