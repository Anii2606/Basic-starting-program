public class MethodSample
{
public static void main(String []args){
String name ="Anikesh";
MethodSample s=new MethodSample();
s.PrintMyName(name);

}
public String PrintMyName(String name){
	System.out.println(name);
	return name ;
}

}