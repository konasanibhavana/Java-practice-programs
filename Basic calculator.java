import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args) {
		options();
	}
	public static void options() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("select an operation");
		int choice = sc.nextInt();
		calculator(choice);	
	}
	public static void calculator(int choice) {
		Scanner sc=new Scanner(System.in);
		if (choice==1||choice==2||choice==3||choice==4) {
			System.out.print("Enter number 1 : ");
			int num1 = sc.nextInt();
			System.out.print("Enter number 2 :");
			int num2 = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Addition of " + num1 + " and " + num2 + " is : " + (num1 + num2));
		
				break;
			case 2:
				System.out.println("Subtraction of " + num1 + " and " + num2 + " is : " + (num1 - num2));
			
				break;
			case 3:
				System.out.println("Multiplication of " + num1 + " and " + num2 + " is : " + (num1 * num2));
				
				break;
			case 4:
				if (num1 == 0) {
					System.out.println("Division of " + num1 + " and " + num2 + " is : " + 0);
				}
				try {
					if (num2 == 0) {
						int answer = num1 / num2;
						System.out.println("Division of " + num1 + " and " + num2 + " is : " + answer);
					}
				} catch (ArithmeticException e) {
					System.out.println("Dividing with zero " + e);
				}
		
				if (num1!=0 &&num2!=0) {
					int answer = (int)(num1 / num2);
					System.out.println("Division of " + num1 + " and " + num2 + " is : " + answer);
				}
				break;
			}
		}
		else {
			System.out.println("Enter correct option");
			options();
		}
		sc.close();
	}
	
}
