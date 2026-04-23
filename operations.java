import java.util.Scanner;
class Operations{
	 public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter fist number:");
		 double num1=sc.nextDouble();
		 System.out.println("Enter second number:");
		 double num2=sc.nextDouble();
		 System.out.println("\nChoose an operation:");
	     System.out.println("1. Addition");
	     System.out.println("2. Subtraction");
	     System.out.println("3. Multiplication");
	     System.out.println("4. Division");
         System.out.print("Enter your choice (1-4): ");
	     int choice = sc.nextInt();
	     double result;
	     switch(choice) {
	     case 1:
	    	 result=num1+num2;
	    	 System.out.println("Addition:"+result);
	    	 break;
	     case 2:
	    	 result=num1-num2;
	    	 System.out.println("Subtraction:"+result);
	    	 break;
	     case 3:
	    	 result=num1*num2;
	    	 System.out.println("Multiplication:"+result);
	    	 break;
	     case 4:
	    	 if(num2!=0) {
	    		 result=num1/num2;
	    		 System.out.println("Division:"+result);
	    	 }
	    	 else {
	    		 System.out.println("Division by Zero is not possible");
	    	 }
	    	 break;
	     default:
	    		System.out.println("Invalid Operation"); 
	     }
	       
	 }
}
