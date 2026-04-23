public class Leapyear {
   public void checkleapornot() {
	   int year=1900;
	   if(year%400==0 && year%4==0) {
		   System.out.println("leap year");
	   }
	   else {
		   System.out.println("not leap year");
	   }
   }
   public static void main(String[] args) {
	   Leapyear ly=new Leapyear();
	   ly.checkleapornot();
   }
}
