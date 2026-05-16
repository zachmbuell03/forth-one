package week5;
import java.util.Scanner; //Import scanner 

public class week5 {
   public static void main (String [] args) { 

	   Scanner scnr = new Scanner(System.in);
	   final int Elements = 7;
	   int i;
	   int sum = 0;
	   int[] temperature = new int[Elements];
	   String[] days = {"Monday", "Tuesday", "Wednesday",
               "Thursday", "Friday", "Saturday", "Sunday"};
	   
	   for (i = 0; i < Elements; ++i) {
		   System.out.print("Enter temperature for " + days[i] + ": ");
		    temperature[i] = scnr.nextInt();
		    sum += temperature[i];
	   }
	   System.out.println("\nTemperatures for the week:");
	   for (i = 0; i < Elements; i++) {
		    System.out.println(days[i] + ": " + temperature[i]);
		}
	   double average = (double) sum / Elements;
	   System.out.println("\nAverage temperature: " + average);


	  
	   scnr.close();
}
}
