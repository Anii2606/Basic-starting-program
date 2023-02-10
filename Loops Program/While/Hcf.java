import java.util.Scanner;
public class Hcf{
	public static void main(String[] args){
		// varibale div-dividend any number  
		//fac-factor to divided dividend and 
		//remai- remainder for Hcf 
		// Hcf to add remainder value
		
		int div,fac,remai,hcf=0;
		
		Scanner sd =new Scanner(System.in);
		System.out.println("Enter first number");
		// input first number from user
		div=sd.nextInt();
		
		System.out.println("Enter second number");
		// input second number from user
		fac=sd.nextInt();
		//use do while loop
		do {
		//remainder of two input number	
		remai=div%fac;
		// then if remaider is 0 your factor is hcf 
		if(remai==0){
			
		hcf=fac;
		
		}
		// else your factor is not hcf then
		else
		{
			// div =fac suppose div=40 and fac=10 
			div=fac;
			//and fac=remai means 10=remaider
			fac=remai;
		}
		}while(remai!=0);
	    System.out.println("HCF is :"+ hcf);
		

	}
}