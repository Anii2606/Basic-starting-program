import java.io.*;
import java.util.Scanner;

class ScannerClass {
    public static void main (String[] args) {
        Scanner sc =new Scanner (System.in);
        String str, nstr="";
		System.out.println("Enter any word: "); //Example word
		System.out.print("Original word: ");
		str=sc.next();
        char ch; 
        
      //System.out.print("Original word: ");
     // System.out.println("Geeks"); //Example word
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
    }
}
  
//Contributed by Tiyasa