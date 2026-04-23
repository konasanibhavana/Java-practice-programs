import java.util.Scanner;
class Swap{
	   public static void main(String args[]){
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter first number:");
	       int num1=sc.nextInt();
	       System.out.println("Enter second number:");
	       int num2=sc.nextInt();
	       int temp;
	       temp=num1;
	       num1=num2;
	       num2=temp;
	       System.out.println("After swapping:");
	       System.out.println("num1="+num1);
	       System.out.println("num2="+num2);
	    }
	 }
