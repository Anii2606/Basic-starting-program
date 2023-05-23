class unary {
  public static void main(String[] args) {
    
    // declare variables
    int a = 12, b = 12;
    int result1, result2;

    // original value
    System.out.println("Value of a: " + a);//12

    //pre increment operator
    result1 = ++a;
    System.out.println("After increment: " + result1);//13

    System.out.println("Value of b: " + b);//12

    // pre decrement operator
    result2 = --b;
    System.out.println("After decrement: " + result2);//12  // original value
   System.out.println("   ");
   System.out.println("Value of a: " + a);//13
    
    //post increment operator
    result1 = a++;
    System.out.println("After increment: " + result1);//13

    System.out.println("Value of b: " + b);//11

    // post decrement operator
    result2 = b--;
    System.out.println("After decrement: " + result2);//11
	
	
  }
}