public class Leap2{
public static void main(String[] args){
int year =2400;
if((year%400==0)&&(year%100==0)){
System.out.println("THIS YEAR IS LEAP YEAR :"+year);
}else if ((year%4==0)&&(year%100!=0)){
System.out.println("THIS YEAR IS LEAP YEAR :"+year);
}
else{
System.out.println("THIS YEAR IS NOT LEAP YEAR :"+year);
}	
}
}
