import java.util.Scanner;

;

public class Interger {
   public static void main(String[] args) {
	//     System.out.println("this number is int");
	//     Scanner sc = new Scanner(System.in);
	//     System.out.println(sc.hasNextInt()); 
	     
	     
	   System.out.println("Kilometers to miles");
       Double miles = 0.621371;
       Double km = 1.00;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter kilometers");
       double input = sc.nextDouble();
       Double tMiles = (input)*0.621371;
       System.out.println(input+" kilometer = "+ tMiles+ " Miles");
   }
}