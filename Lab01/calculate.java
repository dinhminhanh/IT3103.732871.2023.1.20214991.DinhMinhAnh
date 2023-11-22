//DinhMinhAnh-20214991
//Example 5: Calculate.java

package LAB01;
import java.util.Scanner;
public class calculate{
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		
		 System.out.println("Dinh Minh Anh-20214991");
		 //Input the first number
		System.out.println("Enter the first number: ");
		 String strNum1 = scanner.nextLine();
	        double num1 = Double.parseDouble(strNum1);
	     
	      //Input the second number
	     System.out.println("Enter the second number: ");
	     String strNum2 = scanner.nextLine();
	        double num2 = Double.parseDouble(strNum2);
	        
	       double sum = num1 + num2;
	       double difference = num1 - num2;
	       double product = num1 * num2;
	       
	      //Denominator other than 0 
	       if (num2 != 0) {
	            double quotient = num1 / num2;
	            System.out.println("Sum: " + sum);
	            System.out.println("Difference: " + difference);
	            System.out.println("Product: " + product);
	            System.out.println("Quotient: " + quotient);
	        } else {
	            System.out.println("Sum: " + sum);
	            System.out.println("Difference: " + difference);
	            System.out.println("Product: " + product);
	          //Do not perform division when the denominator is 0
	            System.out.println("Cannot divide by zero.");
	    }
	}	
}