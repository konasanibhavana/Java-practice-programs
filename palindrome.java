public class palindrome{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    if (num >=100 && num<=999){
      int reverse;
      int original=num;
      while(num!=0){
       int digit=num%10;
       reverse=reverse*10+digit;
       num=num/10;
      }
      if(original==reverse){
        System.out.println("Palindrome");
      }
       else{
         System.out.println("Not a palindrome");
       }
    }
    else {
        System.out.println("Please enter only a 3-digit number");
    }
  }  }
