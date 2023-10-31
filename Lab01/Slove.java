//DinhMinhAnh-20214991
//Example 5: Slove.java

package LAB01;
import java.util.Scanner;
public class Slove {
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  
	  System.out.println(" Dinh Minh Anh-20214991 - Choose the equation type:");
	  System.out.println("1. The first-degree equation  with one variable");
      System.out.println("2. The system of first-degree equations with two variables");
      System.out.println("3. The second-degree equation with one variable");
	  int choice = scanner.nextInt();
	  
	  switch (choice) {
		  case 1:
			  Firstdegreeequation();
			  break;
		  case 2:
		       LinearSystem();
		  break;
		  case 3:
			  Seconddegreeequation();
			  break;
		  default:
              System.out.println("Invalid choice.");
	  }
       
  } 
  
//Slove the first-degree equation  with one variable (ax + b = 0)
  public static void Firstdegreeequation(){
	  Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter the coefficient of x: ");//input a
      double a = scanner.nextDouble();
      System.out.print("Enter the constant term: ");//input b
      double b = scanner.nextDouble();
	//check a  
      if (a==0) {
	  System.out.println("No solution. Please choose again");	  
  }
      else {
    	  double x = -b / a;
          System.out.println("Solution: x = " + x);
      }
      
      scanner.close(); //Close Scanner	  
      }
//Slove the system of first-degree equations with two variables
//a11x1+a12x2=b1, a21x1+a22x2=b2
  public static void LinearSystem() {
	  Scanner scanner = new Scanner(System.in);
	//input values
	  System.out.println("Enter the coefficients and constants: ");
	  System.out.print("Enter a11: ");
      double a11 = scanner.nextDouble();
      System.out.print("Enter a12: ");
      double a12 = scanner.nextDouble();
      System.out.print("Enter b1: ");
      double b1 = scanner.nextDouble();
      System.out.print("Enter a21: ");
      double a21 = scanner.nextDouble();
      System.out.print("Enter a22: ");
      double a22 = scanner.nextDouble();
      System.out.print("Enter b2: ");
      double b2 = scanner.nextDouble();
      
      double D = a11 * a22 - a21 * a12; //D:determinant
      double D1 = b1 * a22 - b2 * a12;
      double D2 = a11 * b2 - a21 * b1;
      //check D, D1,D2
      if (D == 0) {
          if (D1 == 0 && D2 == 0) {
              System.out.println("Infinite solutions.");
          } else {
              System.out.println("No solution.");
          }
      } else {
          double x1 = D1 / D;
          double x2 = D2 / D;
          System.out.println("The solution is x1 = " + x1 + ", x2 = " + x2);
      }
      scanner.close();
  }
  
//Slove the second-degree equation with one variable
 // 𝑎𝑥2+𝑏𝑥+𝑐=0, where x is the variable, and a, b, and c are coefficients (𝑎≠0).
  public static void Seconddegreeequation(){
	Scanner scanner = new Scanner(System.in);

	//input a,b,c
	System.out.print("Enter the coefficient a: ");
    double a = scanner.nextDouble();
    System.out.print("Enter the coefficient b: ");
    double b = scanner.nextDouble();
    System.out.print("Enter the coefficient c: ");
    double c = scanner.nextDouble();
    
//check discriminant
    double discriminant = b * b - 4 * a * c;
    if (a ==0) {
    	System.out.println("This is not a second-degree equation.Please choose again.");   	
    }
    else if(discriminant == 0) {
    	double x = -b / (2*a);
    	System.out.println("The equation has a double solution: x = " +x);
    }
    else if(discriminant > 0) {
    	double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.println("The equation has two distinct solutions: x1 = " + x1 + ", x2 = " + x2);
    }
    else {
    			System.out.println("The equation has no solution.");
    }
    scanner.close();
  }
}
