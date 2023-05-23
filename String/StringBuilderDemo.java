// reverse string ;
import java.util.*;
public class StringBuilderDemo{ 
public static void main(String []args){
StringBuilder sb = new StringBuilder("hsekinA");
for(int i=0;i<sb.length()/2;i++){// half loops run for String reverse order
	int front=i;//0 1 2 3 4 5 6//Anikesh
	int back=sb.length()-1-i;// 7-1-0= 6,5,4,3,2,1,0// hsekinA
	
	char frontchar=sb.charAt(front);//Anikesh
	char backchar=sb.charAt(back);//hsekinA

//
sb.setCharAt(front,backchar);
sb.setCharAt(back,frontchar);
}
System.out.println(sb);
}
}