// for Switchcase Demo;
public class Calculoter{
public static void main(String []args){
int num1=20,num2=15,result;
char sym= '+';
//String sym="+";
switch(sym){
	case '+': result=num1+num2;
	System.out.println(result);
	break;
	case '-':result=num1-num2;
	System.out.println(result);
	break;
	case '*' :result=num1*num2;
	System.out.println(result);
	break;
	case '/' :result=num1/num2;
	System.out.println(result);
	break;
	default:
	System.out.println("invalid input");
	break;

}
}
}